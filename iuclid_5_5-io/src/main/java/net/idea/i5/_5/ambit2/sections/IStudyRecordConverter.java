package net.idea.i5._5.ambit2.sections;

import ambit2.base.data.SubstanceRecord;
import ambit2.base.exceptions.AmbitException;
import ambit2.base.interfaces.IStructureRecord;

public interface IStudyRecordConverter<T> {
	IStructureRecord transform2record(T unmarshalled,SubstanceRecord record) throws AmbitException ;
}
