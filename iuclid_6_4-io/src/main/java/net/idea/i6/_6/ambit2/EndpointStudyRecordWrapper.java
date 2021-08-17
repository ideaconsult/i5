package net.idea.i6._6.ambit2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

import javax.xml.bind.JAXBElement;

import ambit2.base.data.I5Utils;
import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.Params;
import ambit2.base.data.study.Protocol;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.data.study.ReliabilityParams;
import ambit2.base.data.study.Value;
import ambit2.base.ro.I5CONSTANTS;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_aspectratioshape._6.ENDPOINTSTUDYRECORDAspectRatioShape.ResultsAndDiscussion.ShapeDescription.Entry.PercentageValue;
import eu.europa.echa.iuclid6.namespaces.literature._6.LITERATURE;
import eu.europa.echa.iuclid6.namespaces.platform_container.v1.Document;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.BasePhysicalQuantityField;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.BasePhysicalQuantityRangeField;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.BasePicklistField;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.DocumentReferenceMultipleField;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.MultilingualTextFieldLarge;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.MultilingualTextFieldSmall;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.PicklistField;
import net.idea.i5.io.Experiment;
import net.idea.i5.io.I5_ROOT_OBJECTS;
import net.idea.i5.io.QACriteriaException;
import net.idea.i5.io.QASettings;
import net.idea.i6.io.I6_ROOT_OBJECTS;

public class EndpointStudyRecordWrapper<STUDYRECORD> extends AbstractDocWrapper {
	protected I6_ROOT_OBJECTS endpointCategory;
	protected String parentDocumentKey;
	protected Object materialsAndMethods = null;
	protected Object administrativeData = null;
	protected Object resultsAndDiscussion = null;

	public I6_ROOT_OBJECTS getRootObject() {
		return endpointCategory;
	}

	public Document getDoc() {
		return doc;
	}

	public EndpointStudyRecordWrapper(Document doc) throws Exception {
		super(doc);
		endpointCategory = I6_ROOT_OBJECTS.valueOf(String.format("%s_%s", getPlatformMetadataValue("documentType"),
				getPlatformMetadataValue("documentSubType")));
		// this should be substanceUUID
		parentDocumentKey = getPlatformMetadataValue("parentDocumentKey");
		materialsAndMethods = getContentValue("getMaterialsAndMethods");
		administrativeData = getContentValue("getAdministrativeData");
		resultsAndDiscussion = getContentValue("getResultsAndDiscussion");

	}

	public STUDYRECORD getStudyRecord() {
		return (STUDYRECORD) doc.getContent().getAny();
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

	public String getTopCategory() {
		return endpointCategory.getTopCategory();
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
				Object datawaiving = call(administrativeData, "getDataWaiving", null);
				PicklistField dw = (PicklistField) datawaiving;
				return datawaiving == null ? false : Boolean.parseBoolean(dw.getValue());
			}
		} catch (Exception x) {
			logger.log(Level.WARNING, x.getMessage(), x);
		}

		return false;
	}

	public void parseReference(ProtocolApplication papp) throws QACriteriaException {
		try {
			Object dataSource = getContentValue("getDataSource");
			DocumentReferenceMultipleField ref = (DocumentReferenceMultipleField) call(dataSource, "getReference",
					null);
			if (ref == null)
				return;
			for (String key : ref.getKey()) {
				Object entry = library.get(key.replace("/", "_"));
				if (entry !=null && entry instanceof Document) {
					Document doc = (Document) entry;
					if (doc.getContent().getAny() instanceof LITERATURE) {
						LITERATURE bib = (LITERATURE) doc.getContent().getAny();
	
						if (bib != null && bib.getGeneralInfo() != null) {
							papp.setReference(
									String.format("%s %s",
											bib.getGeneralInfo().getAuthor() == null ? ""
													: (bib.getGeneralInfo().getAuthor() + ","),
											bib.getGeneralInfo().getName()));
							if (bib.getGeneralInfo().getReferenceYear() != null)
								papp.setReferenceYear(Integer.toString(bib.getGeneralInfo().getReferenceYear().getValue()));
							papp.setReferenceOwner(bib.getGeneralInfo().getCompanyOwner());
						}
					}
				}
			}
		} catch (Exception x) {

			logger.log(Level.WARNING, x.getMessage());
		}
	}

	public I5_ROOT_OBJECTS getEndpointCategory() {
		return endpointCategory.mapIUCLID5();
	}

	public String getTestMaterialIdentity() {
		return null;
	}

	public String getSubstanceUUID() {
		return parentDocumentKey;
	}

	public void assignGuidelines(ProtocolApplication<Protocol, IParams, String, IParams, String> papp) {
		if (materialsAndMethods == null) {
			logger.log(Level.FINE, "No materials and methods record! " + endpointCategory);
			return;
		}
		try {

			Object guideline = call(materialsAndMethods, "getGuideline", null);
			if (guideline != null) {
				Object entries = call(guideline, "getEntry", null);
				if (entries != null && entries instanceof List)
					for (Object o : (List) entries) {
						Object g = call(o, "getGuideline", null);
						if (g != null) {
							String value = (String) call(g, "getValue", null);
							List<MultilingualTextFieldSmall> other = (List<MultilingualTextFieldSmall>) call(g,
									"getOther", null);
							if (value != null && !"".equals(value))
								papp.getProtocol()
										.addGuideline(getPhrase(value.toString(), joinMultiTextFieldSmall(other)));
						} else {
							// System.err.println(">>>>>> no guideline");
						}

						// g = call(o, "getQualifier", null);
					}
				// getMethodNoGuideline
				Object methodNoGuideline = call(materialsAndMethods, "getMethodNoGuideline", null);
				if (methodNoGuideline != null && !"".equals(methodNoGuideline))
					papp.getProtocol().addGuideline(
							joinMultiTextFieldLarge((List<MultilingualTextFieldLarge>) methodNoGuideline));
			}

		} catch (Exception x) {
			logger.log(Level.WARNING, x.getMessage(), x);
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
						if (!"".equals(value)) {
							p.put(dictionaryParams(methodname2key(key)), p2Value(value));
						}
					}
				}
			} catch (Exception x) {
				logger.log(Level.WARNING, x.getMessage(), x);
			}
	}

	protected String dictionaryEndpoint(String key) {
		return key;
	}

	protected String dictionaryParams(String key) {
		try {
			return ppr.getString(key);
		} catch (Exception x) {
			return key;
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

	protected Object _getMethodValue(Object r, IParams params) {

		Object value = r;

		if (r instanceof String)
			return r;
		else if (r instanceof Number)
			return r;
		else if (r instanceof Boolean)
			return r;
		else if (r instanceof JAXBElement)
			return ((JAXBElement) r).getValue();
		else if (r instanceof BasePhysicalQuantityField)
			return q2value((BasePhysicalQuantityField) r);
		else if (r instanceof BasePhysicalQuantityRangeField)
			return q2value((BasePhysicalQuantityRangeField) r);
		else if (r instanceof BasePicklistField)
			return p2Value((BasePicklistField) r);
		else if (r instanceof List) {
			List l = new ArrayList<>();
			for (Object e : (List) r) {
				Object v = _getMethodValue(e, params);
				if ((v != null) && (!"".equals(v.toString())))
					l.add(v);
			}
			value = (((List) l).size()) > 0 ? l : null;
		} else if (r instanceof BasePicklistField)
			value = getMethodValue((BasePicklistField) r);
		else {
			logger.finest(String.format("%s\t%s", r.getClass(), value.getClass()));
			Method[] allMethods = value.getClass().getDeclaredMethods();

			for (Method m : allMethods)
				if (m.getName().startsWith("get"))
					try {
						Object rr = m.invoke(value);
						if (rr == null)
							continue;
						String key = m.getName();
						try {
							Object subvalue = _getMethodValue(rr, params);
							if (subvalue != null && !"".equals(subvalue.toString()))
								params.put(dictionaryParams(methodname2key(key)), subvalue);
						} catch (Exception x) {
							logger.warning(x.getMessage());
						}

					} catch (Exception x) {
						logger.log(Level.WARNING,
								String.format("%s\t%s", value == null ? null : value.getClass().getName(), m.getName()),
								x);
					}
			// value = params.size()==0?null:params;
			value = null;
		}
		return value;

	}

	protected Object getMethodValue(BasePicklistField field) {

		String value = "";
		String other = null;
		try {
			value = (String) call(field, "getValue");
		} catch (Exception x) {

		}
		try {
			other = joinMultiTextFieldSmall(((List<MultilingualTextFieldSmall>) call(field, "getOther")));
		} catch (Exception x) {

		}
		return getPhrase(value, other);
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
			effectRecord.setUnit(getPhrase(values.get("UnitCode").toString()));
	}

	public void assignEffectLevels(ProtocolApplication papp, STUDYRECORD studyrecord) {

		try {

			Method[] allMethods = resultsAndDiscussion.getClass().getDeclaredMethods();
			for (Method m : allMethods)
				if (m.getName().equals("getEffectLevels") || m.getName().equals("getTestRs")) {
					Object effectLevels = m.invoke(resultsAndDiscussion);
					if (effectLevels != null)
						try {
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

												Params values = new Params();
												Object o = _getMethodValue(r, values);
												if (o != null) {
													EffectRecord<String, IParams, String> cl95 = new EffectRecord<String, IParams, String>();
													cl95.setEndpoint("95% CL");
													_params2effectrecord(cl95, values);
													papp.addEffect(cl95);
												}
											} else if ("getEffectLevel".equals(em.getName())) {
												Params values = new Params();
												_getMethodValue(r, values);
												_params2effectrecord(effectRecord, values);
											} else {
												String key = methodname2key(em.getName());
												Object value = _getMethodValue(r, p);
												if (value != null)
													p.put(dictionaryParams(key), value);
											}
										}

								}
							}
						} catch (Exception x) {
							logger.log(Level.WARNING, x.getMessage(), x);
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
							effectRecord.setEndpoint(dictionaryEndpoint(methodname2key(key)));
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

	/**
	 * @TODO getOther, getRemarks
	 * @param papp
	 * @param studyRecord
	 */
	public void assignInterpretationResult(ProtocolApplication papp, STUDYRECORD studyRecord) {
		try {
			Object mm = getContentValue("getApplicantSummaryAndConclusion");
			if (mm == null)
				return;
			try {
				Object interpretation = call(mm, "getInterpretationOfResults", null);
				if (interpretation != null) {
					papp.setInterpretationResult((String) call(interpretation, "getValue"));
				}
			} catch (NoSuchMethodException x) {

			} catch (Exception x) {
				logger.log(Level.FINE, x.getMessage(), x);
			}
		} catch (Exception x) {
			logger.log(Level.WARNING, x.getMessage(), x);
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
		papp.setDocumentUUID(I5Utils.getPrefixedUUID("IUC6", getDocumentReferencePK()));
		papp.getProtocol().setTopCategory(getTopCategory());
		try {
			papp.getProtocol().setCategory(getEndpointCategory().toSection());
		} catch (Exception x) {
		}
		try {
			papp.setParameters(createProtocolParameters());
		} catch (Exception x) {
		}
		return papp;
	}

	public Params parseReliability(ProtocolApplication papp, QASettings qasettings) throws QACriteriaException {
		ReliabilityParams reliability = new ReliabilityParams();

		if (administrativeData == null)
			return null;

		boolean isRobustStudy = false;
		boolean isUsedforClassification = false;
		boolean isUsedforMSDS = false;

		String reliabilityID_value = null;
		List<MultilingualTextFieldSmall> reliabilityID_othervalue = null;
		String purposeFlag_value = null;
		String studyResultType_value = null;
		List<MultilingualTextFieldSmall> studyResultType_other = null;

		String testMaterialIndicator;
		try {
			BasePicklistField reliabilityID = (BasePicklistField) call(administrativeData, "getReliability", null);
			BasePicklistField purposeFlagCode = (BasePicklistField) call(administrativeData, "getPurposeFlag", null);
			JAXBElement<Boolean> isRobustStudy_value = (JAXBElement<Boolean>) call(administrativeData, "getRobustStudy",
					null);
			isRobustStudy = isRobustStudy_value == null ? false : isRobustStudy_value.getValue();

			JAXBElement<Boolean> isUsedforClassification_value = (JAXBElement<Boolean>) call(administrativeData,
					"getUsedForClassification", null);
			isUsedforClassification = isRobustStudy_value == null ? false : isUsedforClassification_value.getValue();

			JAXBElement<Boolean> isUsedforMSDS_value = (JAXBElement<Boolean>) call(administrativeData, "getUsedForMSDS",
					null);
			isUsedforMSDS = isUsedforMSDS_value == null ? false : isUsedforMSDS_value.getValue();

			BasePicklistField studyResultTypeID = (BasePicklistField) call(administrativeData, "getStudyResultType",
					null);

			testMaterialIndicator = getTestMaterialIdentity();

			if (reliabilityID != null) {
				reliabilityID_value = (String) call(reliabilityID, "getValue");
				reliabilityID_othervalue = (List<MultilingualTextFieldSmall>) call(reliabilityID, "getOther");
			}
			if (purposeFlagCode != null)
				purposeFlag_value = (String) call(purposeFlagCode, "getValue");

			if (studyResultTypeID != null) {
				studyResultType_value = (String) call(studyResultTypeID, "getValue");
				studyResultType_other = (List<MultilingualTextFieldSmall>) call(studyResultTypeID, "getOther");
			}

		} catch (NoSuchMethodException x) {
			x.printStackTrace();
		} catch (IllegalAccessException x) {
			x.printStackTrace();
		} catch (InvocationTargetException x) {
			x.printStackTrace();
		}

		try {

			if (qasettings.isEnabled()) {
				isPurposeflagAccepted(purposeFlag_value, qasettings);
				isStudyResultAccepted(studyResultType_value, qasettings);
				isReliabilityAccepted(reliabilityID_value, qasettings);
				// TODO
				// isTestMaterialIdentityAccepted(testMaterialIndicator,
				// qasettings);
			}
			// else System.out.println("No quality check");

			reliability.setId(reliabilityID_value);
			reliability.setValue(getPhrase(reliabilityID_value, joinMultiTextFieldSmall(reliabilityID_othervalue)));
			reliability.setIsRobustStudy(isRobustStudy);
			reliability.setIsUsedforClassification(isUsedforClassification);
			reliability.setIsUsedforMSDS(isUsedforMSDS);
			try {
				reliability.setPurposeFlag(getPhrase(purposeFlag_value));
			} catch (Exception x) {
			}
			try {
				reliability.setStudyResultType(
						getPhrase(studyResultType_value, joinMultiTextFieldSmall(studyResultType_other)));
			} catch (Exception x) {
			}

			papp.setReliability(reliability);
			return reliability;

		} catch (QACriteriaException x) {
			throw x;
		}

	};

	protected boolean isTestMaterialIdentityAccepted(String testMaterialCode, QASettings qaSettings)
			throws QACriteriaException {
		if (qaSettings.isTestMaterialIdentityAccepted(testMaterialCode))
			return true; // yes
		throw new QACriteriaException("Test material identity ", testMaterialCode,
				testMaterialCode == null ? null : getPhrase(testMaterialCode));
	}

	protected boolean isPurposeflagAccepted(String purposeFlagCode, QASettings qaSettings) throws QACriteriaException {
		if (qaSettings.isPurposeflagAccepted(purposeFlagCode))
			return true; // key study, supporting study
		throw new QACriteriaException("Purpose flag ", purposeFlagCode,
				purposeFlagCode == null ? null : getPhrase(purposeFlagCode));
	}

	protected boolean isStudyResultAccepted(String studyResultTypeID, QASettings qaSettings)
			throws QACriteriaException {
		if (qaSettings.isStudyResultAccepted(studyResultTypeID))
			return true; // experimental result
		throw new QACriteriaException("Study result ", studyResultTypeID,
				studyResultTypeID == null ? null : getPhrase(studyResultTypeID));
	}

	protected boolean isReliabilityAccepted(String valueID, QASettings qaSettings) throws QACriteriaException {
		if (qaSettings.isReliabilityAccepted(valueID))
			return true; // "1 (reliable without restriction)", "2 (reliable
							// with restrictions)"
		throw new QACriteriaException("Reliability ", valueID, valueID == null ? null : getPhrase(valueID));
	}

	protected boolean isReferenceTypeAccepted(String referenceTypeCode, QASettings qaSettings)
			throws QACriteriaException {
		if (qaSettings.isReferenceTypeAccepted(referenceTypeCode))
			return true; // "study report", "publication", "review article or
							// handbook"
		if (qaSettings.isEnabled()) {
			throw new QACriteriaException("Reference type ", referenceTypeCode,
					referenceTypeCode == null ? null : getPhrase(referenceTypeCode));
		} else
			return true;
	}

	private static final int max_field_len = 1024;

	protected String p2Value(Object field) {
		if (field == null)
			return null;
		if (field instanceof List) {
			StringBuilder b = new StringBuilder();
			for (Object f : (List) field) {
				String v = p2Value(f);
				if (v != null && !"null".equals(v) && !"".equals(v)) {
					b.append(p2Value(f));
					b.append(" ");
				}
			}
			return b.toString().trim();
		} else if (field instanceof BasePicklistField)
			return p2Value((BasePicklistField) field);
		else {
			String f = field.toString();
			// System.err.println(f.getClass().getName());
			if (max_field_len < f.length())
				return f.substring(0, max_field_len);
			else
				return f;
		}
	}

	protected String p2Value(BasePicklistField field) {
		String value = "";
		String other = null;
		try {
			value = (String) call(field, "getValue");
		} catch (Exception x) {

		}
		try {
			other = joinMultiTextFieldSmall(((List<MultilingualTextFieldSmall>) call(field, "getOther")));
		} catch (Exception x) {

		}
		return getPhrase(value, other);
	}

	protected String remarks2Value(BasePicklistField field) {
		if (field == null)
			return "";
		String value = "";
		String other = null;
		String remarks = "";
		try {
			value = (String) call(field, "getValue");
		} catch (Exception x) {

		}
		try {
			remarks = joinMultiTextFieldSmall(((List<MultilingualTextFieldSmall>) call(field, "getRemarks")));
		} catch (Exception x) {
		}
		try {
			other = joinMultiTextFieldSmall(((List<MultilingualTextFieldSmall>) call(field, "getOther")));
		} catch (Exception x) {

		}
		return getPhrase(value, other) + remarks;
	}

	protected Value q2value(BasePhysicalQuantityField field) {

		if (field == null)
			return null;
		Value v = new Value();

		try {
			Method m = field.getClass().getDeclaredMethod("getValue");
			Object value = m == null ? null : m.invoke(field);
			if (value != null)
				v.setLoValue(Double.parseDouble(value.toString()));
		} catch (Exception x) {
			x.printStackTrace();
		}

		try {
			Method m = (field.getClass().getDeclaredMethod("getUnitCode"));
			Object units = m == null ? null : m.invoke(field);
			if (units != null)
				v.setUnits(getPhrase(units.toString()));
		} catch (Exception x) {
			x.printStackTrace();
		}

		return v;
	}

	protected Value q2value(BasePhysicalQuantityRangeField field) {

		if (field == null)
			return null;
		Value v = new Value();

		try {
			v.setLoQualifier((String) call(field, "getLowerQualifier"));
		} catch (Exception x) {
		}
		try {
			v.setUpQualifier((String) call(field, "getUpperQualifier"));
		} catch (Exception x) {
		}
		try {
			Object value = call(field, "getLowerValue");
			if (value != null)
				v.setLoValue(((BigDecimal) value).doubleValue());
		} catch (Exception x) {
		}
		try {
			Object value = call(field, "getUpperValue");
			if (value != null)
				v.setUpValue(((BigDecimal) value).doubleValue());
		} catch (Exception x) {
		}
		String unitother = null;
		try {
			unitother = joinMultiTextFieldSmall((List<MultilingualTextFieldSmall>) call(field, "getUnitOther"));
		} catch (Exception x) {
		}
		try {

			v.setUnits(getPhrase((String) call(field, "getUnitCode"), unitother));
		} catch (Exception x) {
		}

		return v;
	}

	protected void q2effectrecord(BasePhysicalQuantityRangeField field,
			EffectRecord<String, IParams, String> effectrecord) {
		if (field == null)
			return;

		try {
			effectrecord.setLoQualifier((String) call(field, "getLowerQualifier"));
		} catch (Exception x) {
			x.printStackTrace();
		}
		try {
			effectrecord.setUpQualifier((String) call(field, "getUpperQualifier"));
		} catch (Exception x) {
			x.printStackTrace();
		}
		try {
			Object loValue = call(field, "getLowerValue");
			if (loValue != null)
				effectrecord.setLoValue(((BigDecimal) loValue).doubleValue());
		} catch (Exception x) {
			x.printStackTrace();
		}
		try {
			Object upValue = call(field, "getUpperValue");
			if (upValue != null)
				effectrecord.setUpValue(((BigDecimal) upValue).doubleValue());
		} catch (Exception x) {
			x.printStackTrace();
		}
		String unitother = null;
		try {
			unitother = joinMultiTextFieldSmall((List<MultilingualTextFieldSmall>) call(field, "getUnitOther"));
		} catch (Exception x) {
		}
		try {
			effectrecord.setUnit(getPhrase((String) call(field, "getUnitCode"), unitother));
		} catch (Exception x) {
		}
	}

	protected void q2effectrecord(BasePhysicalQuantityField field, EffectRecord<String, IParams, String> effectrecord) {
		if (field == null)
			return;

		try {
			effectrecord.setLoValue(Double.parseDouble((String) call(field, "getValue")));
		} catch (Exception x) {
			logger.warning(x.getMessage());
		}
		String unitother = null;
		try {

			unitother = joinMultiTextFieldSmall((List<MultilingualTextFieldSmall>) (call(field, "getUnitOther")));
		} catch (Exception x) {
			logger.fine(x.getMessage());
		}
		try {
			effectrecord.setUnit(getPhrase((String) call(field, "getUnitCode"), unitother));
		} catch (Exception x) {
			logger.warning(x.getMessage());
		}
	}

	protected EffectRecord<String, IParams, String> addEffectRecord_meanstdev(ProtocolApplication papp, String endpoint,
			BasePhysicalQuantityRangeField mean, String stdev, String endpointType) {
		Double sd = null;
		try {
			sd = Double.parseDouble(stdev);
		} catch (Exception x) {
			sd = null;
		}
		return addEffectRecord_meanstdev(papp, endpoint, mean, sd, endpointType);
	}

	protected EffectRecord<String, IParams, String> addEffectRecord_meanstdev(ProtocolApplication papp, String endpoint,
			BasePhysicalQuantityRangeField mean, Double stdev, String endpointType) {
		try {
			EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
			effect.setEndpoint(endpoint);
			effect.setEndpointType(endpointType);

			q2effectrecord(mean, effect);
			if (stdev != null)
				try {

					effect.setErrorValue(stdev);
					effect.setErrQualifier(I5CONSTANTS.effect_stdev);
				} catch (Exception x) {
				}
			papp.addEffect(effect);
			return effect;
		} catch (Exception x) {
			logger.log(Level.WARNING, x.getMessage());
			return null;
		}
	}

	protected EffectRecord<String, IParams, String> addEffectRecord_meanstdev(ProtocolApplication papp, String endpoint,
			PercentageValue mean, String stdev, String endpointType) {
		try {
			EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
			effect.setEndpoint(endpoint);
			effect.setEndpointType(endpointType == null ? I5CONSTANTS.endpoint_type_MEAN : endpointType);

			q2effectrecord(mean, effect);
			try {
				effect.setErrorValue(Double.parseDouble(stdev));
				effect.setErrQualifier(I5CONSTANTS.effect_stdev);
			} catch (Exception x) {
			}
			papp.addEffect(effect);
			return effect;
		} catch (Exception x) {
			logger.log(Level.WARNING, x.getMessage());
			return null;
		}
	}
}
