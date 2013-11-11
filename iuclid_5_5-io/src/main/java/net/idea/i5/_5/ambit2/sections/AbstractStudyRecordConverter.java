package net.idea.i5._5.ambit2.sections;

import ambit2.base.data.SubstanceRecord;

public abstract class AbstractStudyRecordConverter<T>  implements IStudyRecordConverter<T>{

	protected void setCompanyUUID(SubstanceRecord record,String value) {
		int slashpos = value.indexOf("/");
		if (slashpos>0)
			record.setCompanyUUID(value.substring(0,slashpos));
		else
			record.setCompanyUUID(value);
	}	
}
