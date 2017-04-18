package net.idea.i6.io;

import java.io.File;
import java.io.InputStream;

import ambit2.base.exceptions.AmbitIOException;
import ambit2.core.io.FileState;
import net.idea.i5.io.I5Options;
import net.idea.i5.io.IZReader;

/**
 * Support for .i6z files
 * 
 * @author nina
 *
 * @param <SUBSTANCE>
 */
public class I6ZReader<SUBSTANCE> extends IZReader<SUBSTANCE, I6_ROOT_OBJECTS, I6ObjectVerifier> {

	public I6ZReader(InputStream stream) throws AmbitIOException {
		this(stream, new I5Options());
	}

	public I6ZReader(File zipfile) throws AmbitIOException {
		this(zipfile, new I5Options());
	}

	public I6ZReader(File zipfile, I5Options options) throws AmbitIOException {
		super(zipfile, options);
	}

	public I6ZReader(InputStream stream, I5Options options) throws AmbitIOException {
		super(stream, options);
	}

	@Override
	protected boolean isSupported(String name) {
		return FileState._FILE_TYPE.I6D_INDEX.hasExtension(name);
	}

	@Override
	protected I6ObjectVerifier createObjectVerifier() {
		return new I6ObjectVerifier();
	}

}
