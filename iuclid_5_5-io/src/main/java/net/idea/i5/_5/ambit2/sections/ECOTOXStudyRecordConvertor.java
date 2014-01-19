package net.idea.i5._5.ambit2.sections;

import net.idea.i5.io.I5_ROOT_OBJECTS;



public abstract class ECOTOXStudyRecordConvertor<T> extends AbstractStudyRecordConverter<T> {

	public ECOTOXStudyRecordConvertor(I5_ROOT_OBJECTS endpointCategory) {
		super(endpointCategory);
	}

	@Override
	protected String getTopCategory() {
		return _top_category.ECOTOX.toString();
	}
}
