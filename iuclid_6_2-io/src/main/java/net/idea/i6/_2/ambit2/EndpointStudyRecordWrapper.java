package net.idea.i6._2.ambit2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import ambit2.base.data.study.IParams;
import ambit2.base.data.study.Params;
import ambit2.base.data.study.Protocol;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.data.study.ReliabilityParams;
import eu.europa.echa.iuclid6.namespaces.platform_container.v1.Document;
import net.idea.i5.io.Experiment;
import net.idea.i5.io.I5_ROOT_OBJECTS;
import net.idea.i5.io.QACriteriaException;
import net.idea.i5.io.QASettings;
import net.idea.i6.ambti2.phrases.Phrases;
import net.idea.modbcum.i.exceptions.AmbitException;

public class EndpointStudyRecordWrapper<STUDYRECORD> {
	protected Document doc;

	public Document getDoc() {
		return doc;
	}

	public EndpointStudyRecordWrapper(Document doc) {
		super();
		this.doc = doc;
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

	public String getDocumentReferencePK() {
		return null;
	}

	public String getName() {
		return null;
	}

	public String getTopCategory() {
		return null;
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
		return null;
	}

	public String getReliability() {
		return null;
	}

	public boolean isRobustStudy() {
		return false;
	}

	public boolean isUsedForMSDS() {
		return false;
	}

	public boolean isUsedForClassification() {
		return false;
	}

	public String getStudyResultType() {
		return null;
	}

	public String getPurposeFlag() {
		return null;
	}

	public String getTestMaterialIdentity() {
		return null;
	}

	public String getSubstanceUUID() {
		return null;
	}

	public void assignGuidelines(ProtocolApplication papp) {
		/*
		 * if (sciPart.getTOACUTEORAL().getGUIDELINE() != null) for (Set set :
		 * sciPart.getTOACUTEORAL().getGUIDELINE().getSet()) try {
		 * papp.getProtocol().addGuideline(getGuideline(set.
		 * getPHRASEOTHERGUIDELINE().getGUIDELINEValue(),
		 * set.getPHRASEOTHERGUIDELINE().getGUIDELINETXT())); } catch (Exception
		 * x) { } if (sciPart.getTOACUTEORAL().getMETHODNOGUIDELINE() != null)
		 * try { papp.getProtocol().addGuideline(sciPart.getTOACUTEORAL().
		 * getMETHODNOGUIDELINE().getSet()
		 * .getTEXTAREABELOW().getTEXTAREABELOW().getValue()); } catch
		 * (Exception x) { }
		 * 
		 */
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
		Experiment<IParams, IParams> papp = new Experiment<IParams, IParams>(new Protocol(getName()));
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

	public Params parseReliability(ProtocolApplication papp, QASettings qasettings) throws AmbitException {

		String valueID = getReliability();
		boolean isRobustStudy = isRobustStudy();
		boolean isUsedforClassification = isUsedForClassification();
		boolean isUsedforMSDS = isUsedForMSDS();
		String purposeFlagCode = getPurposeFlag();
		String studyResultTypeID = getStudyResultType();
		String testMaterialIndicator = getTestMaterialIdentity();

		if (qasettings.isEnabled()) {
			isPurposeflagAccepted(purposeFlagCode, qasettings);
			isStudyResultAccepted(studyResultTypeID, qasettings);
			isReliabilityAccepted(valueID, qasettings);
			isTestMaterialIdentityAccepted(testMaterialIndicator, qasettings);
		}
		// else System.out.println("No quality check");

		ReliabilityParams reliability = new ReliabilityParams();
		reliability.setId(valueID);
		reliability.setValue(Phrases.phrasegroup_A36.get(valueID));
		reliability.setIsRobustStudy(isRobustStudy);
		reliability.setIsUsedforClassification(isUsedforClassification);
		reliability.setIsUsedforMSDS(isUsedforMSDS);
		try {
			reliability.setPurposeFlag(Phrases.phrasegroup_Y14_3.get(purposeFlagCode));
		} catch (Exception x) {

		}
		try {
			reliability.setStudyResultType(Phrases.phrasegroup_Z05.get(studyResultTypeID));
		} catch (Exception x) {
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
