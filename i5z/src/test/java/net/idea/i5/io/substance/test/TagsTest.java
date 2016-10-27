package net.idea.i5.io.substance.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;

import org.junit.Test;

import ambit2.base.data.study.Params;
import junit.framework.Assert;
import net.idea.i5._5.ambit2.json.Experiment;
import net.idea.i5.io.I5_ROOT_OBJECTS;

public class TagsTest {
	@Test
	public void xmlObjectsTest() throws Exception {
		for (I5_ROOT_OBJECTS tag : I5_ROOT_OBJECTS.values())
			if (tag.isScientificPart() && tag.isIUCLID5()) {
				String xmlobj = tag.getContextPath() + ".EndpointStudyRecord";
				create(xmlobj);
			}
	}

	@Test
	public void tags() throws Exception {
		System.out.print("#");
		System.out.print("\t");
		System.out.print("Title");
		System.out.print("\t");
		System.out.print("I5 Template");
		System.out.print("\t");
		System.out.print("Ontology URI");
		System.out.print("\t");
		System.out.print("Endpoints");
		System.out.print("\t");
		System.out.print("Conditions");
		System.out.print("\t");
		System.out.print("Parameters");
		System.out.print("\n");
		String comma = "";
		for (I5_ROOT_OBJECTS tag : I5_ROOT_OBJECTS.values())
			if (tag.isScientificPart()) {
				System.out.print(tag.getNumber());
				System.out.print(".\t");
				System.out.print(tag.getTitle());
				System.out.print("\t");
				System.out.print(tag);
				System.out.print("\t");
				System.out.print(tag.getOntologyURI() == null ? "" : tag.getOntologyURI());
				System.out.print("\t");
				comma = "";
				if (tag.getEndpoints() != null)
					for (String endpoint : tag.getEndpoints()) {
						System.out.print(comma);
						System.out.print(endpoint);
						comma = ",";
					}
				System.out.print("\t");
				if (tag.getConditions() != null) {
					Arrays.sort(tag.getConditions());
					comma = "";
					for (int i = 0; i < tag.getConditions().length; i++) {
						System.out.print(comma);
						System.out.print(tag.getConditions()[i]);
						comma = ",";
					}
				}
				System.out.print("\t");
				if (tag.getProtocolParameters() != null) {
					Arrays.sort(tag.getProtocolParameters());
					comma = "";
					for (int i = 0; i < tag.getProtocolParameters().length; i++) {
						System.out.print(comma);
						System.out.print(tag.getProtocolParameters()[i]);
						comma = ",";

					}
				}
				System.out.print("\t");
				System.out.print("\n");
			}
	}

	@Test
	public void catalog() throws Exception {
		BufferedWriter w = new BufferedWriter(new FileWriter(new File("c.xml")));
		for (I5_ROOT_OBJECTS tag : I5_ROOT_OBJECTS.values())
			if (tag.name().startsWith("PUBCHEM"))
				continue;
			else if (tag.isScientificPart()) {
				String prefix = "";
				if (tag.getOntologyURI() != null) {
					if (tag.getOntologyURI().startsWith("CHEMINF"))
						prefix = "http://semanticscience.org/resource/";
					else if (tag.getOntologyURI().startsWith("BAO"))
						prefix = "http://www.bioassayontology.org/bao#";
					else if (tag.getOntologyURI().startsWith("NPO"))
						prefix = "http://purl.bioontology.org/ontology/npo#";
					else if (tag.getOntologyURI().startsWith("UO_"))
						prefix = "http://purl.obolibrary.org/obo/";
					else if (tag.getOntologyURI().startsWith("CHMO"))
						prefix = "http://purl.obolibrary.org/obo/";
					else if (tag.getOntologyURI().startsWith("ENM"))
						prefix = "http://purl.enanomapper.org/onto/";
					else if (tag.getOntologyURI().startsWith("OAE")) 
						prefix = "http://purl.obolibrary.org/obo/";

				}
				w.write(String.format(
						"<endpoint id=\"%s\" group=\"%s\" protocol=\"\" name=\"%s. %s\" ontology_term=\"%s%s\" protocol_uri=\"\"/>\n",
						tag.name(), tag.getTopCategory(), tag.getNumber(), tag.getTitle(), prefix,
						tag.getOntologyURI() == null ? "" : tag.getOntologyURI()));

				if (tag.getGuidelines() != null)
					for (String g : tag.getGuidelines()) {
						w.write(String.format(
								"<endpoint id=\"%s\" group=\"%s\" protocol=\"%s\" name=\"%s. %s\" ontology_term=\"%s%s\" protocol_uri=\"\"/>\n",
								tag.name(), tag.getTopCategory(), g.replace("TG","OECD TG "), tag.getNumber(), tag.getTitle(), prefix,
								tag.getOntologyURI() == null ? "" : tag.getOntologyURI()));
					}

			}
		w.close();
	}

	@Test
	public void ont() throws Exception {
		for (I5_ROOT_OBJECTS tag : I5_ROOT_OBJECTS.values())
			if (tag.isScientificPart()) {
				System.out.print(String.format("\"%s_SECTION\":\"%s\",\n", tag.name(), tag.getTitle()));
			}
	}

	@Test
	public void converterObjectsTest() throws Exception {
		int err = 0;
		for (I5_ROOT_OBJECTS tag : I5_ROOT_OBJECTS.values())
			if (tag.isScientificPart() && tag.isIUCLID5()) {
				String cname = "net.idea.i5._5.ambit2.sections." + tag.name() + "_SECTION.StudyRecordConverter";
				try {
					Object object = create(cname);
					if (!cname.equals(object.getClass().getName())) {
						System.err.println("Expected " + cname + " but found " + object.getClass().getName());
						err++;
					}
				} catch (Exception x) {
					System.err.println(x.getMessage());
					err++;
				}
			}
		Assert.assertEquals(0, err);
	}

	@Test
	public void testJSONSchema() throws Exception {
		Experiment<Params, Params> experiment = new Experiment<Params, Params>(null);

		System.out.println(experiment.generateJSONSchema());
	}

	protected Object create(String classname) throws Exception {
		return Class.forName(classname).newInstance();
	}
}
