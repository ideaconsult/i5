package net.idea.i6.io;

import java.io.File;
import java.io.InputStream;
import java.util.Hashtable;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import ambit2.base.data.SubstanceRecord;
import net.idea.i6.io.I6_ROOT_OBJECTS;

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

	public Map<String, String> parseFiles(Document manifest, File directory) throws Exception {
		Map<String, String> file2cjaxbcp = new Hashtable<String, String>();
		NodeList docs = manifest.getElementsByTagName("document");
		for (int i = 0; i < docs.getLength(); i++) {
			Element doc = (Element) docs.item(i);

			File file = new File(directory, getFile(doc));

			NodeList c = doc.getChildNodes();
			for (int j = 0; j < c.getLength(); j++)
				if ("type" == c.item(j).getNodeName()) {
					String subtype = getSubtype(doc);
					String type = c.item(j).getTextContent();
					if (subtype!=null && I6_ROOT_OBJECTS.ENDPOINT_STUDY_RECORD.name().equals(type) ) type=String.format("%s_%s", type,subtype);
					//.toUpperCase();
					try {
						I6_ROOT_OBJECTS rootObject = I6_ROOT_OBJECTS.valueOf(type);
						if (rootObject!=null && (!rootObject.isSupported() || rootObject.mapIUCLID5()==null
								//for initial testing
								|| !rootObject.mapIUCLID5().isDataRich()
								)) continue;
						String cp = ((rootObject != null) && (rootObject.getContextPath() != null))
								? rootObject.getContextPath() : "";
						file2cjaxbcp.put(file.getAbsolutePath(), cp);
					} catch (Exception x) {
						System.err.println(x.getMessage());
					}
				}
		}
		return file2cjaxbcp;
	}

	public void parseDocuments(Document manifest, SubstanceRecord substance) throws Exception {
		NodeList docs = manifest.getElementsByTagName("document");
		for (int i = 0; i < docs.getLength(); i++) {
			Element doc = (Element) docs.item(i);

			NodeList c = doc.getChildNodes();
			for (int j = 0; j < c.getLength(); j++)
				if ("type" == c.item(j).getNodeName()) {
					if ("SUBSTANCE".equals(c.item(j).getTextContent()))
						parseSubstance(doc, substance);
					else if ("LEGAL_ENTITY".equals(c.item(j).getTextContent()))
						parseLegalEntity(doc, substance);
					else if ("ENDPOINT_STUDY_RECORD".equals(c.item(j).getTextContent()))
						parseStudyRecord(doc, substance);
					else if ("REFERENCE_SUBSTANCE".equals(c.item(j).getTextContent()))
						parseReferenceSubstance(doc, substance);

					else
						;
					// System.out.println(c.item(j).getTextContent());
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
}
