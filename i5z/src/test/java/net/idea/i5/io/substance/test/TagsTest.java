package net.idea.i5.io.substance.test;

import java.util.Arrays;

import junit.framework.Assert;
import net.idea.i5._5.ambit2.json.Experiment;
import net.idea.i5._5.ambit2.sections.PC_GRANULOMETRY_SECTION.PC_GRANULOMETRY_Params;
import net.idea.i5.io.I5_ROOT_OBJECTS;

import org.junit.Test;

import ambit2.base.data.study.Params;

public class TagsTest {
	@Test
	public void xmlObjectsTest() throws Exception {
		for (I5_ROOT_OBJECTS tag : I5_ROOT_OBJECTS.values()) if (tag.isScientificPart() && tag.isIUCLID5()){
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
		System.out.print("Endpoints");
		System.out.print("\t");
		System.out.print("Conditions");
		System.out.print("\t");
		System.out.print("Parameters");
		System.out.print("\n");
		String comma = "";
		for (I5_ROOT_OBJECTS tag : I5_ROOT_OBJECTS.values()) if (tag.isScientificPart()){
			System.out.print(tag.getNumber());
			System.out.print(".\t");
			System.out.print(tag.getTitle());
			System.out.print("\t");
			System.out.print(tag);
			System.out.print("\t");
			comma = "";
			if (tag.getEndpoints()!=null)
				for (String endpoint : tag.getEndpoints()) {
					System.out.print(comma);
					System.out.print(endpoint);
					comma = ",";
				}
			System.out.print("\t");
			if (tag.getConditions()!=null) {
				Arrays.sort(tag.getConditions());
				comma = "";
				for (int i=0; i < tag.getConditions().length;i++) {
					System.out.print(comma);
					System.out.print(tag.getConditions()[i]);
					comma = ",";
				}	
			}	
			System.out.print("\t");
			if (tag.getProtocolParameters()!=null) {
				Arrays.sort(tag.getProtocolParameters());
				comma = "";
				for (int i=0; i < tag.getProtocolParameters().length;i++) {
					System.out.print(comma);
					System.out.print(tag.getProtocolParameters()[i]);comma = ",";
					
				}			
			}	
			System.out.print("\t");
			System.out.print("\n");
		}
	}

	@Test
	public void converterObjectsTest() throws Exception {
		int err = 0;
		for (I5_ROOT_OBJECTS tag : I5_ROOT_OBJECTS.values()) if (tag.isScientificPart() && tag.isIUCLID5()){
			String cname = "net.idea.i5._5.ambit2.sections." + tag.name() + "_SECTION.StudyRecordConverter";
			try {
				Object object = create(cname);
				if (!cname.equals(object.getClass().getName())) {
						System.err.println("Expected "+cname+" but found "+object.getClass().getName());
						err++;
				}		
			} catch (Exception x) {
				System.err.println(x.getMessage());
				err ++;
			}
		}
		Assert.assertEquals(0,err);
	}
	
	@Test
	public void testJSONSchema() throws Exception {
		Experiment<PC_GRANULOMETRY_Params,Params> experiment = new Experiment<PC_GRANULOMETRY_Params, Params>(null);
		
		System.out.println(experiment.generateJSONSchema());
	}
	
	protected Object create(String classname) throws Exception {
		return Class.forName(classname).newInstance();
	}
}
