package net.idea.i5.io.substance.test;

import junit.framework.Assert;
import net.idea.i5.io.I5_ROOT_OBJECTS;

import org.junit.Test;

public class TagsTest {
	@Test
	public void xmlObjectsTest() throws Exception {
		for (I5_ROOT_OBJECTS tag : I5_ROOT_OBJECTS.values()) if (tag.isScientificPart()){
			String xmlobj = tag.getContextPath() + ".EndpointStudyRecord";
			create(xmlobj);
		}
	}
	
	@Test
	public void converterObjectsTest() throws Exception {
		int err = 0;
		for (I5_ROOT_OBJECTS tag : I5_ROOT_OBJECTS.values()) if (tag.isScientificPart()){
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
	
	protected Object create(String classname) throws Exception {
		return Class.forName(classname).newInstance();
	}
}
