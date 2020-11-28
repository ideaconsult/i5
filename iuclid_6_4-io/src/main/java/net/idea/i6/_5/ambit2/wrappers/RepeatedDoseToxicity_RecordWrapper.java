package net.idea.i6._5.ambit2.wrappers;

import ambit2.base.data.study.IParams;
import ambit2.base.data.study.Protocol;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.ro.I5CONSTANTS;
import eu.europa.echa.iuclid6.namespaces.platform_container.v1.Document;
import net.idea.i6._5.ambit2.EndpointStudyRecordWrapper;

public abstract class RepeatedDoseToxicity_RecordWrapper<T> extends EndpointStudyRecordWrapper<T> {
	boolean importResultsOfExaminations = false;

	public boolean isImportResultsOfExaminations() {
		return importResultsOfExaminations;
	}

	public void setImportResultsOfExaminations(boolean importResultsOfExaminations) {
		this.importResultsOfExaminations = importResultsOfExaminations;
	}

	public RepeatedDoseToxicity_RecordWrapper(Document doc) throws Exception {
		super(doc);
	}

	@Override
	public void assignProtocolParameters(ProtocolApplication<Protocol, IParams, String, IParams, String> papp) {
		super.assignProtocolParameters(papp);
		Object remarks = papp.getParameters().get("Remarks");
		Object doses = papp.getParameters().get(I5CONSTANTS.cDoses);
		// i6 migrations moves the doses into remarks ...
		if (doses == null || "".equals(doses.toString()))
			papp.getParameters().put(I5CONSTANTS.cDoses, remarks);
	}

}
