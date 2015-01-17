package net.idea.i5.io;

import net.idea.modbcum.i.exceptions.AmbitException;
import ambit2.base.data.SubstanceRecord;
import ambit2.base.interfaces.IStructureRecord;

public interface IStudyRecordConverter<T> extends IQASettings {
    IStructureRecord transform2record(T unmarshalled, SubstanceRecord record) throws AmbitException;
}
