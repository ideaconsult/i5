package net.idea.i5.io;

import ambit2.base.data.SubstanceRecord;
import ambit2.base.exceptions.AmbitException;
import ambit2.base.interfaces.IStructureRecord;


public interface IStudyRecordConverter<T> extends IQASettings{
	IStructureRecord transform2record(T unmarshalled,SubstanceRecord record) throws AmbitException ;
}
