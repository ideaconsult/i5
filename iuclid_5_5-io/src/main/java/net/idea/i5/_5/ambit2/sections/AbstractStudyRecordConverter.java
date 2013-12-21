package net.idea.i5._5.ambit2.sections;

import net.idea.i5._5.ambit2.Phrases;
import ambit2.base.data.SubstanceRecord;
import ambit2.base.data.study.Params;
import ambit2.base.data.study.Protocol;
import ambit2.base.data.study.ProtocolApplication;

public abstract class AbstractStudyRecordConverter<T>  implements IStudyRecordConverter<T>{

	protected void setCompanyUUID(SubstanceRecord record,String value) {
		int slashpos = value.indexOf("/");
		if (slashpos>0)
			record.setCompanyUUID(value.substring(0,slashpos));
		else
			record.setCompanyUUID(value);
	}	
	protected Params parseReliability(ProtocolApplication papp,String valueID, boolean isRobustStudy, boolean isUsedforClassification, boolean isUsedforMSDS) {
		try {
			Params reliability = new Params();
			reliability.put("id", valueID);
			reliability.put("value", Phrases.phrasegroup_A36.get(valueID));
			reliability.put("isRobustStudy", isRobustStudy);
			reliability.put("isUsedforClassification", isUsedforClassification);
			reliability.put("isUsedforMSDS", isUsedforMSDS);
			papp.setReliability(reliability);
			return reliability;
		} catch (Exception x) { return null; }
	};
	
	protected ProtocolApplication createProtocolApplication(String documentID,String name, String topCategory,String category) {
		ProtocolApplication<Protocol,Params,String,Params,String> papp = new ProtocolApplication<Protocol,Params,String,Params,String>(
					new Protocol(name));
		papp.setDocumentUUID(documentID);		
		papp.getProtocol().setTopCategory(topCategory);
		papp.getProtocol().setCategory(category);
		papp.setParameters(new Params());
		return papp;
	}
}
