package net.idea.i6.test;

import java.io.IOException;
import java.io.InputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.junit.Assert;
import org.junit.Test;

import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_acutetoxicitydermal._6.ENDPOINTSTUDYRECORDAcuteToxicityDermal;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_granulometry._6.ENDPOINTSTUDYRECORDGranulometry;
import eu.europa.echa.iuclid6.namespaces.reference_substance._6.REFERENCESUBSTANCE;

public class TestI6 {


	@Test
	public void testUnmarshal() throws JAXBException, IOException {
		InputStream in = null;
		try {
			in = getClass().getClassLoader().getResourceAsStream("0a40853b-refsub.i6d");
			Assert.assertNotNull(in);

			JAXBContext jaxbContext = JAXBContext.newInstance(REFERENCESUBSTANCE.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			REFERENCESUBSTANCE refsub = (REFERENCESUBSTANCE) jaxbUnmarshaller.unmarshal(in);
			System.out.println(refsub.getClass().getName());
			System.out.println(refsub.getReferenceSubstanceName());
			System.out.println(refsub.getInventory().getInventoryEntry().getEntry());
			System.out.println(refsub.getMolecularStructuralInfo().getInChl());
			System.out.println(refsub.getMolecularStructuralInfo().getSmilesNotation());
			System.out.println(refsub.getMolecularStructuralInfo().getStructuralFormula());
			System.out.println(refsub.getInventory().getInventoryEntryJustification());
			System.out.println(refsub.getInventory().getCASNumber());
			System.out.println(refsub.getInventory().getCASName());
			System.out.println(refsub.getIupacName());
			System.out.println(refsub.getRelatedSubstances().getGroupCategoryInfo());
			for (eu.europa.echa.iuclid6.namespaces.reference_substance._6.REFERENCESUBSTANCE.SynonymSet.Synonyms.Entry s : refsub.getSynonyms().getSynonyms().getEntry())
				System.out.println(s.getName());

		} finally {
			if (in != null)
				in.close();
		}
	}

	@Test
	public void test() throws Exception {
		ENDPOINTSTUDYRECORDAcuteToxicityDermal e = new ENDPOINTSTUDYRECORDAcuteToxicityDermal();
		e.getAdministrativeData();
		e.getApplicantSummaryAndConclusion();
		e.getDataSource();
		e.getMaterialsAndMethods();
		e.getOverallRemarksAttachments();
		e.getResultsAndDiscussion();

		ENDPOINTSTUDYRECORDGranulometry g = new ENDPOINTSTUDYRECORDGranulometry();
		Assert.assertNotNull(g);
		
		Assert.assertNotNull(g.getMaterialsAndMethods());
		for (eu.europa.echa.iuclid6.namespaces.endpoint_study_record_granulometry._6.ENDPOINTSTUDYRECORDGranulometry.MaterialsAndMethods.Guidelines.Entry entry : g.getMaterialsAndMethods().getGuideline().getEntry()) {
			entry.getGuideline().getValue();
		}
		g.getResultsAndDiscussion().getAerodynamicDiameter();
		g.getResultsAndDiscussion().getGeometricStandardDeviation();
		g.getResultsAndDiscussion().getParticleSize().getEntry();
		for (eu.europa.echa.iuclid6.namespaces.endpoint_study_record_granulometry._6.ENDPOINTSTUDYRECORDGranulometry.ResultsAndDiscussion.ParticleSizeDistribution.Entry entry : g.getResultsAndDiscussion().getParticleSizeDistribution().getEntry()) {
			entry.getDistribution();
			entry.getSize();
			entry.getRemarksOnResults();
		}
		g.getResultsAndDiscussion().getAnyOtherInformationOnResultsInclTables();
	}


	@Test
	public void testUnmarshal_IronOre() throws JAXBException, IOException {
		InputStream in = null;
		try {
			in = getClass().getClassLoader().getResourceAsStream("net/idea/i6/_6/substance/i6z/REFERENCE_SUBSTANCE/92d2b64b-38b2-4070-ae4c-676fcdbdc747_56e49ed8-0bec-49a2-8050-f8e87844b2e8.i6d");
			Assert.assertNotNull(in);

			JAXBContext jaxbContext = JAXBContext.newInstance(REFERENCESUBSTANCE.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			REFERENCESUBSTANCE refsub = (REFERENCESUBSTANCE) jaxbUnmarshaller.unmarshal(in);
			System.out.println(refsub.getClass().getName());
			System.out.println(refsub.getClass().getName());
			System.out.println(refsub.getReferenceSubstanceName());
			System.out.println(refsub.getInventory().getInventoryEntry().getEntry());
			System.out.println(refsub.getMolecularStructuralInfo().getInChl());
			System.out.println(refsub.getMolecularStructuralInfo().getSmilesNotation());
			System.out.println(refsub.getMolecularStructuralInfo().getStructuralFormula());
			System.out.println(refsub.getInventory().getInventoryEntryJustification());
			System.out.println(refsub.getInventory().getCASNumber());
			System.out.println(refsub.getInventory().getCASName());
			System.out.println(refsub.getIupacName());
			System.out.println(refsub.getRelatedSubstances().getGroupCategoryInfo());
			for (eu.europa.echa.iuclid6.namespaces.reference_substance._6.REFERENCESUBSTANCE.SynonymSet.Synonyms.Entry s : refsub.getSynonyms().getSynonyms().getEntry())
				System.out.println(s.getName());

		} finally {
			if (in != null)
				in.close();
		}
	}

}
