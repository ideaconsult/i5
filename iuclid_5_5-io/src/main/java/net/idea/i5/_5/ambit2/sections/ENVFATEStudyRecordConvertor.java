package net.idea.i5._5.ambit2.sections;

import net.idea.i5.io.I5_ROOT_OBJECTS;
import ambit2.base.data.study.Params;

public abstract class ENVFATEStudyRecordConvertor<T> extends AbstractStudyRecordConverter<T,Params,Params> {

	public ENVFATEStudyRecordConvertor(I5_ROOT_OBJECTS endpointCategory) {
		super(endpointCategory);
	}

	@Override
	protected String getTopCategory() {
		return _top_category.ENVFATE.toString();
	}
}
