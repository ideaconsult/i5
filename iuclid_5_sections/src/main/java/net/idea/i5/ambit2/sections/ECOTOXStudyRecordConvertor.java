package net.idea.i5.ambit2.sections;

import net.idea.i5.io.I5_ROOT_OBJECTS;
import ambit2.base.data.study.IParams;



public abstract class ECOTOXStudyRecordConvertor<T> extends AbstractStudyRecordConverter<T,IParams,IParams> {

	public ECOTOXStudyRecordConvertor(I5_ROOT_OBJECTS endpointCategory) {
		super(endpointCategory);
	}

	@Override
	protected String getTopCategory() {
		return _top_category.ECOTOX.toString();
	}
}
