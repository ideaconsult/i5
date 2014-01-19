package net.idea.i5._5.ambit2.sections;

import net.idea.i5.io.I5_ROOT_OBJECTS;

public abstract class PChemStudyRecordConvertor<T> extends AbstractStudyRecordConverter<T> {

	public PChemStudyRecordConvertor(I5_ROOT_OBJECTS endpointCategory) {
		super(endpointCategory);
	}

	@Override
	protected String getTopCategory() {
		return _top_category.PCHEM.toString();
	}
}
