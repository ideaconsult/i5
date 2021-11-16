package net.idea.i6._6.ambit2.sections;

import java.util.logging.Level;

import javax.xml.bind.JAXBElement;

import ambit2.base.data.I5Utils;
import ambit2.base.data.SubstanceRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.Params;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.interfaces.IStructureRecord;
import net.idea.i5.io.Experiment;
import net.idea.i5.io.IStudyRecordConverter;
import net.idea.i5.io.QACriteriaException;
import net.idea.i5.io.QASettings;
import net.idea.i6._6.ambit2.EndpointStudyRecordWrapper;
import net.idea.modbcum.i.exceptions.AmbitException;

public class I6StudyRecordConverter<T extends EndpointStudyRecordWrapper, PROTOCOLPARAMS extends IParams, CONDITIONS extends IParams>
		implements IStudyRecordConverter<T> {

	protected enum _top_category {
		PCHEM {
			@Override
			public String toString() {
				return "P-CHEM";
			}
		},
		ENVFATE {
			@Override
			public String toString() {
				return "ENV FATE";
			}
		},
		ECOTOX, TOX
	};

	protected QASettings qaSettings;

	protected void setCompanyUUID(SubstanceRecord record, String value) {
		int slashpos = value.indexOf("/");
		if (slashpos > 0)
			record.setSubstanceUUID(I5Utils.getPrefixedUUID("IUC6", value.substring(0, slashpos)));
		else
			record.setSubstanceUUID(I5Utils.getPrefixedUUID("IUC6", value));
	}

	public I6StudyRecordConverter() {
		super();
	}

	protected boolean hasDataTransferCriteriaFulfilled(T unmarshalled) {
		if (!unmarshalled.hasScientificPart())
			return false;
		if (unmarshalled.isDataWaiving())
			return false;

		// if (!isReferenceTypeAccepted(unmarshalled)) return false;
		return false;
	}

	protected boolean isTestMaterialIdentityAccepted(String testMaterialCode) throws QACriteriaException {
		if (qaSettings.isTestMaterialIdentityAccepted(testMaterialCode))
			return true; // yes
		throw new QACriteriaException("Test material identity ", testMaterialCode,
				testMaterialCode == null ? null : EndpointStudyRecordWrapper.getPhrase(testMaterialCode));
	}

	protected boolean isPurposeflagAccepted(String purposeFlagCode) throws QACriteriaException {
		if (qaSettings.isPurposeflagAccepted(purposeFlagCode))
			return true; // key study, supporting study
		throw new QACriteriaException("Purpose flag ", purposeFlagCode,
				purposeFlagCode == null ? null : EndpointStudyRecordWrapper.getPhrase(purposeFlagCode));
	}

	protected boolean isStudyResultAccepted(String studyResultTypeID) throws QACriteriaException {
		if (qaSettings.isStudyResultAccepted(studyResultTypeID))
			return true; // experimental result
		throw new QACriteriaException("Study result ", studyResultTypeID,
				studyResultTypeID == null ? null : EndpointStudyRecordWrapper.getPhrase(studyResultTypeID));
	}

	protected boolean isReliabilityAccepted(String valueID) throws QACriteriaException {
		if (qaSettings.isReliabilityAccepted(valueID))
			return true; // "1 (reliable without restriction)", "2 (reliable
							// with restrictions)"
		throw new QACriteriaException("Reliability ", valueID,
				valueID == null ? null : EndpointStudyRecordWrapper.getPhrase(valueID));
	}

	protected boolean isReferenceTypeAccepted(String referenceTypeCode) throws QACriteriaException {
		if (qaSettings.isReferenceTypeAccepted(referenceTypeCode))
			return true; // "study report", "publication", "review article or
							// handbook"
		if (getQASettings().isEnabled()) {
			throw new QACriteriaException("Reference type ", referenceTypeCode,
					referenceTypeCode == null ? null : EndpointStudyRecordWrapper.getPhrase(referenceTypeCode));
		} else
			return true;
	}

	public static Object getNumber(Object value) {
		if (value == null)
			return null;
		if (value instanceof Number)
			return value;
		try {
			return Double.parseDouble(value.toString());
		} catch (Exception x) {
			return value;
		}

	}

	protected void setInterpretationResult(ProtocolApplication papp, String value, String otherValue) {
		if (value == null)
			papp.setInterpretationResult("");
		else if ("other:".equals(value)) { // other
			papp.setInterpretationResult(otherValue);
		} else
			papp.setInterpretationResult(value);
	}

	@Override
	public QASettings getQASettings() {
		if (qaSettings == null)
			qaSettings = new QASettings();
		return qaSettings;

	}

	@Override
	public void setQASettings(QASettings qaSettings) {
		this.qaSettings = qaSettings;
	}

	protected String getQualifier(String qualifier) {
		return "NOT_SPECIFIED".equals(qualifier) ? null : qualifier;
	}

	protected String getUnit(String unit, String otherValue) {
		if ("other:".equals(unit))
			return otherValue;
		else
			return unit;
	}

	protected String getGuideline(String method, JAXBElement<String> otherValue) {
		if (method == null || method.startsWith("other"))
			return otherValue == null ? null : otherValue.getValue();
		else
			return method;
	}

	protected String getGuideline(String method, String otherValue) {
		if (method == null || method.startsWith("other"))
			return otherValue;
		else
			return method;
	}

	protected Params addParams(String key, Object value) {
		Params p = new Params();
		p.put(key, value);
		return p;
	}

	protected String getValue(String value, JAXBElement<String> other) {
		return value == null ? value : (value.startsWith("other:") ? (other == null ? null : other.getValue()) : value);
	}

	public IStructureRecord transform2record(T wrapper, SubstanceRecord record) throws AmbitException {
		if (hasDataTransferCriteriaFulfilled(wrapper))
			return null;
		else
			return _transform2record(wrapper, record);
	};

	protected IStructureRecord _transform2record(EndpointStudyRecordWrapper unmarshalled, SubstanceRecord record)
			throws AmbitException {

		Object sciPart = unmarshalled.getStudyRecord();
		if (sciPart == null)
			return null;

		record.clear();
		Experiment<IParams, IParams> papp = unmarshalled.createProtocolApplication();
		try {
			unmarshalled.parseReliability(papp, getQASettings());
		} catch (Exception x) {
			T.getLogger().log(Level.WARNING, x.getMessage(), x);
		}
		record.addMeasurement(papp);

		// UUID
		try {
			setCompanyUUID(record, unmarshalled.getSubstanceUUID());
		} catch (Exception x) {
			T.getLogger().log(Level.WARNING, x.getMessage(), x);
		}
		// TODO data owner - it's probably not in this file
		try {
			unmarshalled.assignGuidelines(papp);
		} catch (Exception x) {
			T.getLogger().log(Level.WARNING, x.getMessage(), x);
		}
		try {
			unmarshalled.parseReference(papp);
		} catch (Exception x) {
			T.getLogger().log(Level.WARNING, x.getMessage(), x);
		}
		try {
			unmarshalled.assignProtocolParameters(papp);
		} catch (Exception x) {
			T.getLogger().log(Level.WARNING, x.getMessage(), x);
		}
		try {
			unmarshalled.assignEffectLevels(papp, unmarshalled.getStudyRecord());
		} catch (Exception x) {
			T.getLogger().log(Level.WARNING, x.getMessage(), x);
		}
		try {
			unmarshalled.assignInterpretationResult(papp, unmarshalled.getStudyRecord());
		} catch (NullPointerException x) {
			T.getLogger().log(Level.FINEST, x.getMessage(), x);
		} catch (Exception x) {
			T.getLogger().log(Level.WARNING, x.getMessage(), x);
		}

		return record;
	}

}
