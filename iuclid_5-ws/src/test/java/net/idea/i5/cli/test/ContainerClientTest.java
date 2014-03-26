package net.idea.i5.cli.test;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import junit.framework.Assert;
import net.idea.i5.cli.Container;
import net.idea.i5.cli.ContainerClient;
import net.idea.i5.cli.I5LightClient;
import net.idea.i5.io.I5ZReader;
import net.idea.i5.io.QASettings;
import net.idea.opentox.cli.IIdentifiableResource;

import org.junit.Test;
import org.openscience.cdk.io.IChemObjectReaderErrorHandler;

import ambit2.base.data.SubstanceRecord;
import ambit2.base.interfaces.IStructureRecord;



public class ContainerClientTest  extends ClientTest {
	
	@Test
	public void test() throws Exception {
		long now = System.currentTimeMillis();
		try {
			if (i5.login(PropertiesUtil.getUsername(),PropertiesUtil.getPassword())) {
				ContainerClient cli = i5.getContainerClient();
				String identifier = "IUC4-68a1912c-b829-3e7f-a2cf-3a9594836159/0";
				List<IIdentifiableResource<String>> content = cli.get(identifier);
				//("IUC4-7388635d-6cce-3f32-acab-6b081221b103/0"); linalool
				//("IUC5-6d15f057-c651-4399-9fb9-1dd7d39ee6fa/0");
				Assert.assertNotNull(content);
				Assert.assertEquals(1,content.size());
				Assert.assertEquals(identifier,content.get(0).getResourceIdentifier());
				Assert.assertTrue(content.get(0) instanceof Container);
				File file = ((Container)content.get(0)).getIpzarchive();
				Assert.assertTrue(file.exists());
				unmarshall_i5z(file,2);
			}
		} catch (Exception x) {
			throw x;
		} finally {
			try {i5.logout();} catch (Exception x) {}
			System.out.println(System.currentTimeMillis()-now);
		}
	}
	
	protected int unmarshall_i5z(File in,int nfiles) throws Exception {
		Assert.assertNotNull(in);
		FileOutputStream output = null; 
		I5ZReader reader = null;
		try {
			reader = new I5ZReader(in) ;
			reader.setQASettings(new QASettings(false));
			Assert.assertEquals(nfiles,reader.getFiles().length);
			reader.setErrorHandler(new IChemObjectReaderErrorHandler() {
				public void handleError(String message, int row, int colStart, int colEnd,
						Exception exception) {
				}
				public void handleError(String message, int row, int colStart, int colEnd) {
				}
				public void handleError(String message, Exception exception) {
					logger.log(Level.SEVERE,message);
				}
				public void handleError(String message) {
					logger.log(Level.SEVERE,message);
				}
			});
			int count = 0;
			while (reader.hasNext()) {
				Object next = reader.nextRecord();
				if (next instanceof SubstanceRecord) {
					if (((SubstanceRecord)next).getMeasurements()!=null)
						Assert.assertTrue(((SubstanceRecord)next).getMeasurements().size()>0);
				} else if (next instanceof IStructureRecord) {
					Assert.assertNotNull(((IStructureRecord)next).getContent());
				}
				logger.info(next==null?"null entry":next.toString());
				count++;
			}
			return count;
		} catch (Exception x) {
			throw x;
		} finally {
	        if(output != null) output.close();
            if (reader!=null) reader.close();
		}	
	}
}