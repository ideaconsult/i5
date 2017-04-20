package net.idea.i6._2.ambit2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.bind.JAXBElement;

import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.Params;
import ambit2.base.data.study.Protocol;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.data.study.ReliabilityParams;
import eu.europa.echa.iuclid6.namespaces.platform_container.v1.Document;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.PicklistField;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.PicklistFieldWithLargeTextRemarks;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.PicklistFieldWithMultiLineTextRemarks;
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
	protected Object materialsAndMethods = null;
	protected Object administrativeData = null;
	protected Object resultsAndDiscussion = null;

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
		materialsAndMethods = getContentValue("getMaterialsAndMethods");
		administrativeData = getContentValue("getAdministrativeData");
		resultsAndDiscussion = getContentValue("getResultsAndDiscussion");
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

	/**
	 * Check
	 * 
	 * @return
	 */
	public boolean isDataWaiving() {
		try {
			if (administrativeData != null) {
				PicklistField dw = (PicklistField) call(administrativeData, "getDataWaiving", null);
				return Boolean.parseBoolean(dw.getValue());
			}
		} catch (Exception x) {
			logger.log(Level.WARNING,x.getMessage(),x);
		}

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

			Object guideline = call(materialsAndMethods, "getGuideline", null);
			if (guideline != null) {
				Object entries = call(guideline, "getEntry", null);
				if (entries != null && entries instanceof List)
					for (Object o : (List) entries) {
						PicklistField g = (PicklistField) call(o, "getGuideline", null);
						Object value = getMethodValue(g);
						if (value != null && !"".equals(value))
							papp.getProtocol().addGuideline(value.toString());
					}
				// getMethodNoGuideline
				Object methodNoGuideline = call(materialsAndMethods, "getMethodNoGuideline", null);
				if (methodNoGuideline != null && !"".equals(methodNoGuideline))
					papp.getProtocol().addGuideline(methodNoGuideline.toString());
			}

		} catch (Exception x) {
			logger.log(Level.WARNING,x.getMessage(),x);
		}

	}

	public void assignProtocolParameters(ProtocolApplication<Protocol, IParams, String, IParams, String> papp) {

		if (materialsAndMethods == null)
			return;
		IParams p = papp.getParameters();

		Method[] allMethods = materialsAndMethods.getClass().getDeclaredMethods();
		for (Method m : allMethods)
			try {
				if ("getGuideline".equals(m.getName()))
					continue;
				if ("getMethodNoGuideline".equals(m.getName()))
					continue;
				if ("getTestMaterials".equals(m.getName()))
					continue;

				if (m.getName().startsWith("get")) {
					Object r = m.invoke(materialsAndMethods);
					if (r == null)
						continue;
					String key = m.getName();
					Object value = _getMethodValue(r, p);
					if (value != null) {
						if (!"".equals(value))
							p.put(methodname2key(key), value);
					}
				}
			} catch (Exception x) {
				logger.log(Level.WARNING,x.getMessage(),x);
			}
	}

	/**
	 * Used to assign protocol parameters
	 * 
	 * @param methodname
	 * @return
	 */
	protected String methodname2key(String methodname) {
		// TODO match with I5Constants
		return methodname.replace("\\(", "").replaceAll("\\)", "").replace("get", "");
	}

	private Object _getMethodValue(Object r, IParams params) {
		Object value = r;
		if (r instanceof String)
			return r;
		else if (r instanceof Number)
			return r;
		else if (r instanceof Boolean)
			return r;		
		else if (r instanceof List) {
			List l = new ArrayList<>();
			for (Object e : (List) r) {
				Object v = _getMethodValue(e, params);
				if ((v != null) && (!"".equals(v.toString())))
					l.add(v);
			}
			value = (((List) l).size()) > 0 ? l : null;
		} else if (r instanceof PicklistField)
			value = getMethodValue((PicklistField) r);
		else if (r instanceof PicklistFieldWithSmallTextRemarks)
			value = getMethodValue((PicklistFieldWithSmallTextRemarks) r);
		else if (r instanceof PicklistFieldWithLargeTextRemarks)
			value = getMethodValue((PicklistFieldWithLargeTextRemarks) r);
		else if (r instanceof PicklistFieldWithMultiLineTextRemarks)
			value = getMethodValue((PicklistFieldWithMultiLineTextRemarks) r);
		else {
			Method[] allMethods = value.getClass().getDeclaredMethods();

			for (Method m : allMethods)
				if (m.getName().startsWith("get"))
					try {
						Object rr = m.invoke(value);
						if (rr == null)
							continue;
						String key = m.getName();
						Object subvalue = _getMethodValue(rr, params);
						if (subvalue != null && !"".equals(subvalue.toString()))
							params.put(methodname2key(key), subvalue);

					} catch (Exception x) {
						logger.log(Level.WARNING,String.format("%s\t%s",value.getClass().getName(),m.getName()),x);
					}
			// value = params.size()==0?null:params;
			value = null;
		}
		return value;

	}

	protected Object getMethodValue(PicklistField f) {
		return ("1342".equals(f.getValue()) ? f.getOther() : f.getValue());
	}

	protected Object getMethodValue(PicklistFieldWithSmallTextRemarks f) {
		return ("1342".equals(f.getValue()) ? f.getOther() : f.getValue());
	}

	protected Object getMethodValue(PicklistFieldWithLargeTextRemarks f) {
		return ("1342".equals(f.getValue()) ? f.getOther() : f.getValue());
	}

	protected Object getMethodValue(PicklistFieldWithMultiLineTextRemarks f) {
		return ("1342".equals(f.getValue()) ? f.getOther() : f.getValue());
	}

	private void _params2effectrecord(EffectRecord<String, IParams, String> effectRecord, IParams values) {
		if (values.get("LowerValue") != null)
			effectRecord.setLoValue(Double.parseDouble(values.get("LowerValue").toString()));
		if (values.get("LowerQualifier") != null)
			effectRecord.setLoQualifier(values.get("LowerQualifier").toString());
		if (values.get("UpperQualifier") != null)
			effectRecord.setUpQualifier(values.get("UpperQualifier").toString());
		if (values.get("UpperValue") != null)
			effectRecord.setUpValue(Double.parseDouble(values.get("UpperValue").toString()));
		if (values.get("UnitCode") != null)
			effectRecord.setUnit(values.get("UnitCode").toString());
	}

	public void assignEffectLevels(ProtocolApplication papp) {

		try {

			Method[] allMethods = resultsAndDiscussion.getClass().getDeclaredMethods();
			for (Method m : allMethods)
				if (m.getName().equals("getEffectLevels")) {
					Object effectLevels = m.invoke(resultsAndDiscussion);
					if (effectLevels != null) {
						Object entries = call(effectLevels, "getEntry");
						if (entries != null && entries instanceof List) {
							for (Object e : (List) entries) {
								EffectRecord<String, IParams, String> effectRecord = new EffectRecord<String, IParams, String>();
								IParams p = new Params();
								effectRecord.setConditions(p);
								papp.addEffect(effectRecord);

								Method[] eMethods = e.getClass().getDeclaredMethods();
								for (Method em : eMethods)
									if (em.getName().startsWith("get")) {
										Object r = em.invoke(e);
										if ("getEndpoint".equals(em.getName()))
											effectRecord.setEndpoint(_getMethodValue(r, p).toString());
										else if ("getCl".equals(em.getName())) {
											EffectRecord<String, IParams, String> cl95 = new EffectRecord<String, IParams, String>();
											cl95.setEndpoint("95% CL");
											papp.addEffect(cl95);
											Params values = new Params();
											_getMethodValue(r, values);
											_params2effectrecord(cl95, values);
										} else if ("getEffectLevel".equals(em.getName())) {
											Params values = new Params();
											_getMethodValue(r, values);
											_params2effectrecord(effectRecord, values);
										} else {
											String key = methodname2key(em.getName());
											Object value = _getMethodValue(r, p);
											if (value != null)
												p.put(key, value);
										}
									}

							}
						}
					}
				} else if (m.getName().startsWith("get")) {
					IParams params = new Params();
					Object r = m.invoke(resultsAndDiscussion);
					if (r == null)
						continue;
					String key = m.getName();
					Object value = _getMethodValue(r, params);
					if (value != null) {
						if (!"".equals(value)) {
							EffectRecord<String, IParams, String> effectRecord = new EffectRecord<String, IParams, String>();
							effectRecord.setEndpoint(methodname2key(key));
							effectRecord.setTextValue(value);
							effectRecord.setConditions(params);
							papp.addEffect(effectRecord);
						}
					}

				}
		} catch (Exception x) {
			logger.log(Level.WARNING, x.getMessage(), x);
		}
	}

	public void assignInterpretationResult(ProtocolApplication papp) {
		try {
			Object mm = getContentValue("getApplicantSummaryAndConclusion");
			if (mm != null) {
				Object conclusions = call(mm, "getConclusions", null);
				Object summary = call(mm, "getExecutiveSummary", null);
				papp.setInterpretationResult(conclusions == null ? null : conclusions.toString());
				papp.setInterpretationCriteria(summary == null ? null : summary.toString());
			}

		} catch (Exception x) {
			logger.log(Level.WARNING,x.getMessage(),x);
		}
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

	public Params parseReliability(ProtocolApplication papp, QASettings qasettings) throws AmbitException {
		ReliabilityParams reliability = new ReliabilityParams();
		try {
			if (administrativeData == null)
				return null;
			PicklistField reliabilityID = (PicklistField) call(administrativeData, "getReliability", null);
			PicklistField purposeFlagCode = (PicklistField) call(administrativeData, "getPurposeFlag", null);
			boolean isRobustStudy = (boolean) call(administrativeData, "getRobustStudy", null);
			boolean isUsedforClassification = (boolean) call(administrativeData, "getUsedForClassification", null);
			boolean isUsedforMSDS = (boolean) call(administrativeData, "getUsedForMSDS", null);
			PicklistFieldWithSmallTextRemarks studyResultTypeID = (PicklistFieldWithSmallTextRemarks) call(
					administrativeData, "getStudyResultType", null);

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
			logger.log(Level.WARNING,x.getMessage(),x);
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
