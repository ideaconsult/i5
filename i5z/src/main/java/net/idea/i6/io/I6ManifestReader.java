package net.idea.i6.io;

import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import ambit2.base.data.SubstanceRecord;

public class I6ManifestReader {

	/**
	 * Reads manifest.xml in .i6z files
	 * 
	 * @param manifest
	 * @return
	 * @throws Exception
	 */
	public Document read(InputStream manifest) throws Exception {
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		return dBuilder.parse(manifest);
	}

	protected String getDocType(String type, String subtype) {
		if (subtype != null) {
			if (I6_ROOT_OBJECTS.ENDPOINT_STUDY_RECORD.name().equals(type))
				return String.format("%s_%s", type, subtype);
			else if (I6_ROOT_OBJECTS.FLEXIBLE_RECORD.name().equals(type))
				return String.format("%s_%s", type, subtype);
			else if (I6_ROOT_OBJECTS.FIXED_RECORD.name().equals(type))
				return String.format("%s_%s", type, subtype);			
		} 
		return type;
	}
	public Map<String, String> parseFiles(Document manifest, File directory) throws Exception {
		Map<String, String> file2cjaxbcp = new Hashtable<String, String>();
		NodeList docs = manifest.getElementsByTagName("document");
		for (int i = 0; i < docs.getLength(); i++) {
			Element doc = (Element) docs.item(i);

			File file = new File(directory, getFile(doc));

			NodeList c = doc.getChildNodes();
			for (int j = 0; j < c.getLength(); j++)
				if ("type".equals(c.item(j).getNodeName())) {
					String type = getDocType(c.item(j).getTextContent(), getSubtype(doc));
					try {
						I6_ROOT_OBJECTS rootObject = I6_ROOT_OBJECTS.valueOf(type);
						if (rootObject == null)
							continue;
						switch (rootObject) {
						case SUBSTANCE:
							break;
						case REFERENCE_SUBSTANCE:
							break;
						case LITERATURE:
							break;
						case FLEXIBLE_RECORD_SubstanceComposition:
							break;
						case FIXED_RECORD_Identifiers: 
							break;
						default:
							if (!rootObject.isSupported() || rootObject.mapIUCLID5() == null)
								continue;
						}

						String cp = ((rootObject != null) && (rootObject.getContextPath() != null))
								? rootObject.getContextPath() : "";
						file2cjaxbcp.put(file.getAbsolutePath(), cp);
					} catch (Exception x) {
						//System.err.println(x.getMessage());
						
					}
				}
		}
		return file2cjaxbcp;
	}

	public List<File> listFiles(Document manifest, File directory, Set<String> doctype) throws Exception {
		List<File> files = new ArrayList<File>();
		NodeList docs = manifest.getElementsByTagName("document");
		for (int i = 0; i < docs.getLength(); i++) {
			Element doc = (Element) docs.item(i);

			File file = new File(directory, getFile(doc));

			NodeList c = doc.getChildNodes();
			for (int j = 0; j < c.getLength(); j++)
				if ("type".equals(c.item(j).getNodeName())) {
					
					String type = getDocType(c.item(j).getTextContent(), getSubtype(doc));
					if (doctype.contains(type)) {
						files.add(file);
					}
				}
		}
		return files;
	}

	public void parseDocuments(Document manifest, SubstanceRecord substance) throws Exception {
		NodeList docs = manifest.getElementsByTagName("document");
		for (int i = 0; i < docs.getLength(); i++) {
			Element doc = (Element) docs.item(i);
			String file = getFile(doc);
			NodeList c = doc.getChildNodes();
			for (int j = 0; j < c.getLength(); j++)

				if ("type" == c.item(j).getNodeName())
					try {
						I6_ROOT_OBJECTS r = I6_ROOT_OBJECTS.valueOf(c.item(j).getTextContent());

						switch (r) {
						case SUBSTANCE: {
							parseSubstance(doc, substance);
							break;
						}
						case LEGAL_ENTITY: {
							parseLegalEntity(doc, substance);
							break;
						}
						case FLEXIBLE_RECORD_SubstanceComposition: {
							parseStudyRecord(doc, substance);
							break;
						}
						case ENDPOINT_STUDY_RECORD: {
							parseStudyRecord(doc, substance);
							break;
						}
						case REFERENCE_SUBSTANCE: {
							parseReferenceSubstance(doc, substance);
							System.out.println(String.format("%s\t%s", file, c.item(j).getTextContent()));
							break;
						}
						case LITERATURE: {
							parseLiterature(doc, substance);
							break;
						}
						case TEST_MATERIAL_INFORMATION: {
							parseTestMaterial(doc, substance);
						}
						default:
							System.out.println(String.format("%s\t%s", file, c.item(j).getTextContent()));
						}

					} catch (Exception x) {
						System.out.println(String.format("%s\t%s", file, c.item(j).getTextContent()));
					}
		}
	}

	public String getSubtype(Element doc) throws Exception {
		try {
			return doc.getElementsByTagName("subtype").item(0).getTextContent();
		} catch (Exception x) {
			return null;
		}
	}

	public String getUUID(Element doc) throws Exception {
		try {
			return doc.getElementsByTagName("uuid").item(0).getTextContent();
		} catch (Exception x) {
			throw x;
		}
	}

	public String getFile(Element doc) throws Exception {
		try {
			NodeList c = doc.getElementsByTagName("name");
			for (int j = 0; j < c.getLength(); j++) {
				Element e = ((Element) c.item(j));
				// String filetype = e.getAttribute("xlink:type");
				return e.getAttribute("xlink:href");
			}
			return null;
		} catch (Exception x) {
			throw x;
		}
	}

	public void parseLiterature(Element doc, SubstanceRecord substance) throws Exception {
		try {
			//
		} catch (Exception x) {
			throw x;
		}
	}

	public void parseTestMaterial(Element doc, SubstanceRecord substance) throws Exception {
		try {
			//
		} catch (Exception x) {
			throw x;
		}
	}

	public void parseStudyRecord(Element doc, SubstanceRecord substance) throws Exception {
		try {
			//
		} catch (Exception x) {
			throw x;
		}
	}

	public void parseReferenceSubstance(Element doc, SubstanceRecord substance) throws Exception {
		try {
			substance.setReferenceSubstanceUUID(cleanUUID(getUUID(doc)));
		} catch (Exception x) {
			throw x;
		}
	}

	public void parseSubstance(Element doc, SubstanceRecord substance) throws Exception {
		try {

			substance.setSubstanceUUID(cleanUUID(getUUID(doc)));
			substance.setContent(getFile(doc));
		} catch (Exception x) {
			throw x;
		}
	}

	public void parseLegalEntity(Element doc, SubstanceRecord substance) throws Exception {
		try {

			substance.setOwnerUUID(cleanUUID(getUUID(doc)));
		} catch (Exception x) {
			throw x;
		}
	}

	protected String cleanUUID(String value) {
		int slashpos = value.indexOf("/");
		if (slashpos > 0) {
			return value.substring(0, slashpos);
		} else {
			return value;
		}
	}

	public static Map<String, eu.europa.echa.iuclid6.namespaces.platform_container.v1.Document> parseLinkedEntry(
			List<File> files) throws JAXBException {
		String jaxbcontextpath = "eu.europa.echa.iuclid6.namespaces.platform_container.v1:"
				+ "eu.europa.echa.iuclid6.namespaces.platform_fields.v1:"
				+ "eu.europa.echa.iuclid6.namespaces.platform_metadata.v1:"
				+ "eu.europa.echa.iuclid6.namespaces.literature._1:"
				+ "eu.europa.echa.iuclid6.namespaces.flexible_record_substancecomposition._2:"
				+ "eu.europa.echa.iuclid6.namespaces.fixed_record_identifiers._2:"
				+ "eu.europa.echa.iuclid6.namespaces.test_material_information._2";

		JAXBContext jaxbContext = JAXBContext.newInstance(jaxbcontextpath);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

		Map<String, eu.europa.echa.iuclid6.namespaces.platform_container.v1.Document> library = new HashMap<String, eu.europa.echa.iuclid6.namespaces.platform_container.v1.Document>();
		for (File file : files)
			try {
				Object o = jaxbUnmarshaller.unmarshal(file);
				if (o instanceof eu.europa.echa.iuclid6.namespaces.platform_container.v1.Document)
					library.put(file.getName().replace(".i6d", ""),
							(eu.europa.echa.iuclid6.namespaces.platform_container.v1.Document) o);
			} catch (Exception x) {
				// logger.log(Level.WARNING, x.getMessage(), x);
				x.printStackTrace();
			}

		return library;

	}

}
