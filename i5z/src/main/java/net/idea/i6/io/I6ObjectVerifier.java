package net.idea.i6.io;

import java.io.InputStream;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamReader;

import net.idea.modbcum.i.exceptions.AmbitException;
import net.idea.modbcum.p.DefaultAmbitProcessor;

public class I6ObjectVerifier extends DefaultAmbitProcessor<InputStream, I6_ROOT_OBJECTS> {
	protected XMLInputFactory factory;

	/**
	 * 
	 */
	private static final long serialVersionUID = 4202446709497463805L;

	public I6ObjectVerifier() {
		super();
		factory = XMLInputFactory.newInstance();
		factory.setProperty(XMLInputFactory.IS_REPLACING_ENTITY_REFERENCES, Boolean.TRUE);
		factory.setProperty(XMLInputFactory.IS_VALIDATING, Boolean.FALSE);
	}

	public I6_ROOT_OBJECTS process(InputStream in) throws AmbitException {
		XMLStreamReader reader = null;
		try {
			reader = factory.createXMLStreamReader(in);

			while (reader.hasNext()) {
				int type = reader.next();
				if (type == XMLStreamConstants.SPACE)
					continue;
				I6_ROOT_OBJECTS tag = null;
				QName qname = null;
				try {
					qname = reader.getName();
					tag = I6_ROOT_OBJECTS.valueOf(qname.getLocalPart().split(".")[0]);
				} catch (Exception x) {
					throw new UnsupportedI6RootObject(qname == null ? "" : qname.getLocalPart() + x.getMessage());
				}
				switch (type) {
				case XMLStreamConstants.START_ELEMENT: {

					try {
						switch (tag) {

						case ENDPOINT_STUDY_RECORD: {
							return tag;
						}
						case REFERENCESUBSTANCE: {
							return tag;
						}
						case SUBSTANCE: {
							return tag;
						}
						default: {
							return null;
						}
						}
					} catch (Exception x) {
						throw new UnsupportedI6RootObject(reader.getName().getLocalPart());
					}
				}

				default: {
					// skip
				}
				}
			}
			throw new UnsupportedI6RootObject();
		} catch (AmbitException x) {
			throw x;
		} catch (Exception x) {
			throw new AmbitException(x.getMessage(), x);
		} finally {
			try {
				in.close();
			} catch (Exception x) {
			}
			try {
				reader.close();
			} catch (Exception x) {
			}

		}
	}

}
