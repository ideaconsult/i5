package net.idea.i6._2.ambit2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.logging.Logger;

import javax.xml.bind.JAXBElement;

import ambit2.base.data.study.IParams;
import ambit2.base.data.study.Params;
import ambit2.base.data.study.Protocol;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.data.study.ReliabilityParams;
import eu.europa.echa.iuclid6.namespaces.platform_container.v1.Document;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.PicklistField;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.PicklistFieldWithSmallTextRemarks;
import net.idea.i5.io.Experiment;
import net.idea.i5.io.I5_ROOT_OBJECTS;
import net.idea.i5.io.QACriteriaException;
import net.idea.i5.io.QASettings;
import net.idea.i6.ambti2.phrases.Phrases;
import net.idea.i6.io.I6_ROOT_OBJECTS;
import net.idea.modbcum.i.exceptions.AmbitException;

public class EndpointStudyRecordWrapper<STUDYRECORD> {
	protected static Logger logger = Logger.getLogger(EndpointStudyRecordWrapper.class.getName());
	protected Document doc;
	protected I6_ROOT_OBJECTS rootObject;
	protected String parentDocumentKey;

	public I6_ROOT_OBJECTS getRootObject() {
		return rootObject;
	}

	public Document getDoc() {
		return doc;
	}

	public EndpointStudyRecordWrapper(Document doc) throws Exception {
		super();
		this.doc = doc;
		rootObject = I6_ROOT_OBJECTS.valueOf(String.format("%s_%s", getPlatformMetadataValue("documentType"),
				getPlatformMetadataValue("documentSubType")));
		// this should be substanceUUID
		parentDocumentKey = getPlatformMetadataValue("parentDocumentKey");

	}

	public Object getStudyRecord() {
		return doc.getContent().getAny();
	}

	protected Object call(Object obj, String methodName, Object... params)
			throws SecurityException, InvocationTargetException, IllegalAccessException, NoSuchMethodException {

		Method method = obj.getClass().getMethod(methodName);
		return method.invoke(obj);
	}

	protected boolean hasDataTransferCriteriaFulfilled() {
		if (!hasScientificPart())
			return false;
		if (isDataWaiving())
			return false;
		// if (!isReferenceTypeAccepted(unmarshalled)) return false;
		return false;
	}

	private Object getContentValue(String methodName) {
		try {
			return call(doc.getContent().getAny(), methodName, null);
		} catch (Exception x) {
			logger.fine(x.getMessage());
			return null;
		}

	}

	private final String prefix = "http://iuclid6.echa.europa.eu/namespaces/platform-metadata/v1";

	private String getPlatformMetadataValue(String name) {
		for (Object o : doc.getPlatformMetadata().getAny())
			if (name.equals(((JAXBElement) o).getName().getLocalPart())) {
				return ((JAXBElement) o).getValue().toString();
			}
		return null;
	}

	public String getDocumentReferencePK() {
		return getPlatformMetadataValue("documentKey");
	}

	public String getName() {
		return getPlatformMetadataValue("name");
	}

	public String getTopCategory() {
		return rootObject.getTopCategory();
	}

	public boolean hasScientificPart() {
		return true;
	}

	public boolean isDataWaiving() {
		return false;
	}

	public void parseReference(ProtocolApplication papp) throws QACriteriaException {

	}

	public I5_ROOT_OBJECTS getEndpointCategory() {
		return rootObject.mapIUCLID5();
	}

	public String getTestMaterialIdentity() {
		return null;
	}

	public String getSubstanceUUID() {
		return null;
	}

	public void assignGuidelines(ProtocolApplication<Protocol, IParams, String, IParams, String> papp) {
		try {
			Object mm = getContentValue("getMaterialsAndMethods");
			if (mm != null) {
				Object guideline = call(mm, "getGuideline", null);
				if (guideline != null) {
					Object entries = call(guideline, "getEntry", null);
					if (entries != null && entries instanceof List)
						for (Object o : (List) entries) {
							papp.getProtocol().addGuideline(o.toString());
						}
					// getMethodNoGuideline
					Object methodNoGuideline = call(mm, "getMethodNoGuideline", null);
					if (methodNoGuideline != null)
						papp.getProtocol().addGuideline(methodNoGuideline.toString());
				}
			}

		} catch (Exception x) {
			logger.warning(x.getMessage());
		}

	}

	public void assignProtocolParameters(ProtocolApplication papp) {

	}

	public void assignEffectLevels(ProtocolApplication papp) {

	}

	public void assignInterpretationResult(ProtocolApplication papp) {

	}

	protected IParams createProtocolParameters() {
		if (getEndpointCategory() == null)
			return new Params();
		else
			return getEndpointCategory().createProtocolParameters();
	}

	public Experiment<IParams, IParams> createProtocolApplication() {
		Protocol protocol = new Protocol(getName());

		Experiment<IParams, IParams> papp = new Experiment<IParams, IParams>(protocol);
		papp.setDocumentUUID(getDocumentReferencePK());
		papp.getProtocol().setTopCategory(getTopCategory());
		try {
			papp.getProtocol().setCategory(getEndpointCategory().name());
		} catch (Exception x) {
		}
		try {
			papp.setParameters(createProtocolParameters());
		} catch (Exception x) {
		}
		return papp;
	}

	/*
	 * public String getReliability() { return null; }
	 * 
	 * public boolean isRobustStudy() { return false; }
	 * 
	 * public boolean isUsedForMSDS() { return false; }
	 * 
	 * public boolean isUsedForClassification() { return false; }
	 * 
	 * public String getStudyResultType() { return null; }
	 * 
	 * public String getPurposeFlag() { return null; }
	 * 
	 * 
	 */

	public Params parseReliability(ProtocolApplication papp, QASettings qasettings) throws AmbitException {
		ReliabilityParams reliability = new ReliabilityParams();
		try {
			Object mm = getContentValue("getAdministrativeData");
			if (mm == null)
				return null;
			PicklistField reliabilityID = (PicklistField) call(mm, "getReliability", null);
			PicklistField purposeFlagCode = (PicklistField) call(mm, "getPurposeFlag", null);
			boolean isRobustStudy = (boolean) call(mm, "getRobustStudy", null);
			boolean isUsedforClassification = (boolean) call(mm, "getUsedForClassification", null);
			boolean isUsedforMSDS = (boolean) call(mm, "getUsedForMSDS", null);
			PicklistFieldWithSmallTextRemarks studyResultTypeID = (PicklistFieldWithSmallTextRemarks) call(mm,
					"getStudyResultType", null);

			String testMaterialIndicator = getTestMaterialIdentity();

			if (qasettings.isEnabled()) {
				isPurposeflagAccepted(purposeFlagCode.getValue(), qasettings);
				isStudyResultAccepted(studyResultTypeID.getValue(), qasettings);
				isReliabilityAccepted(reliabilityID.getValue(), qasettings);
				isTestMaterialIdentityAccepted(testMaterialIndicator, qasettings);
			}
			// else System.out.println("No quality check");

			reliability.setId(reliabilityID.getValue());
			reliability.setValue(Phrases.phrasegroup_A36.get(reliabilityID.getValue()));
			reliability.setIsRobustStudy(isRobustStudy);
			reliability.setIsUsedforClassification(isUsedforClassification);
			reliability.setIsUsedforMSDS(isUsedforMSDS);
			try {
				reliability.setPurposeFlag(Phrases.phrasegroup_Y14_3.get(purposeFlagCode.getValue()));
			} catch (Exception x) {

			}
			try {
				reliability.setStudyResultType(Phrases.phrasegroup_Z05.get(studyResultTypeID.getValue()));
			} catch (Exception x) {
			}

		} catch (Exception x) {
			logger.warning(x.getMessage());
		}
		papp.setReliability(reliability);
		return reliability;
	};

	protected boolean isTestMaterialIdentityAccepted(String testMaterialCode, QASettings qaSettings)
			throws QACriteriaException {
		if (qaSettings.isTestMaterialIdentityAccepted(testMaterialCode))
			return true; // yes
		throw new QACriteriaException("Test material identity ", testMaterialCode,
				testMaterialCode == null ? null : Phrases.phrasegroup_Z38.get(testMaterialCode));
	}

	protected boolean isPurposeflagAccepted(String purposeFlagCode, QASettings qaSettings) throws QACriteriaException {
		if (qaSettings.isPurposeflagAccepted(purposeFlagCode))
			return true; // key study, supporting study
		throw new QACriteriaException("Purpose flag ", purposeFlagCode,
				purposeFlagCode == null ? null : Phrases.phrasegroup_Y14_3.get(purposeFlagCode));
	}

	protected boolean isStudyResultAccepted(String studyResultTypeID, QASettings qaSettings)
			throws QACriteriaException {
		if (qaSettings.isStudyResultAccepted(studyResultTypeID))
			return true; // experimental result
		throw new QACriteriaException("Study result ", studyResultTypeID,
				studyResultTypeID == null ? null : Phrases.phrasegroup_Z05.get(studyResultTypeID));
	}

	protected boolean isReliabilityAccepted(String valueID, QASettings qaSettings) throws QACriteriaException {
		if (qaSettings.isReliabilityAccepted(valueID))
			return true; // "1 (reliable without restriction)", "2 (reliable
							// with restrictions)"
		throw new QACriteriaException("Reliability ", valueID,
				valueID == null ? null : Phrases.phrasegroup_A36.get(valueID));
	}

	protected boolean isReferenceTypeAccepted(String referenceTypeCode, QASettings qaSettings)
			throws QACriteriaException {
		if (qaSettings.isReferenceTypeAccepted(referenceTypeCode))
			return true; // "study report", "publication", "review article or
							// handbook"
		if (qaSettings.isEnabled()) {
			throw new QACriteriaException("Reference type ", referenceTypeCode,
					referenceTypeCode == null ? null : Phrases.phrasegroup_Z31.get(referenceTypeCode));
		} else
			return true;
	}

}
