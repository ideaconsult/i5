package net.idea.i5._5.ambit2.sections;

import net.idea.i5.io.I5_ROOT_OBJECTS;
import ambit2.base.data.study.IParams;

public abstract class PChemStudyRecordConvertor<T,PROTOCOLPARAMS extends IParams,CONDITIONS extends IParams> extends AbstractStudyRecordConverter<T,PROTOCOLPARAMS,CONDITIONS> {

	public PChemStudyRecordConvertor(I5_ROOT_OBJECTS endpointCategory) {
		super(endpointCategory);
	}

	@Override
	protected String getTopCategory() {
		return _top_category.PCHEM.toString();
	}
	
}