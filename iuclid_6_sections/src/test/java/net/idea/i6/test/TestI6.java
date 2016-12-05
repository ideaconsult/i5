package net.idea.i6.test;

import java.io.IOException;
import java.io.InputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.junit.Assert;
import org.junit.Test;

import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_acutetoxicitydermal._2.ENDPOINTSTUDYRECORDAcuteToxicityDermal;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_granulometry._2.ENDPOINTSTUDYRECORDGranulometry;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_granulometry._2.ENDPOINTSTUDYRECORDGranulometry.ResultsAndDiscussion.ParticleSizeDistribution.Entry;
import eu.europa.echa.iuclid6.namespaces.reference_substance._2.I6SynonymEntry;
import eu.europa.echa.iuclid6.namespaces.reference_substance._2.REFERENCESUBSTANCE;

public class TestI6 {
	@Test
	public void testUnmarshal() throws JAXBException, IOException {
		InputStream in = null;
		try {
			in = getClass().getClassLoader().getResourceAsStream(
					"0a40853b-refsub.i6d");
			Assert.assertNotNull(in);

			JAXBContext jaxbContext = JAXBContext
					.newInstance(REFERENCESUBSTANCE.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			REFERENCESUBSTANCE refsub = (REFERENCESUBSTANCE) jaxbUnmarshaller
					.unmarshal(in);
			System.out.println(refsub.getClass().getName());
			System.out.println(refsub.getGeneralInfo()
					.getReferenceSubstanceName());
			System.out.println(refsub.getInventory().getInventoryEntry()
					.getEntry());
			System.out.println(refsub.getMolecularStructuralInfo().getInChl());
			System.out.println(refsub.getMolecularStructuralInfo()
					.getSmilesNotation());
			System.out.println(refsub.getMolecularStructuralInfo()
					.getStructuralFormula());
			System.out.println(refsub.getNoInfoAvailable()
					.getInventoryEntryJustification());
			System.out.println(refsub.getReferenceSubstanceInfo().getCASInfo()
					.getCASNumber());
			System.out.println(refsub.getReferenceSubstanceInfo().getCASInfo()
					.getCASName());
			System.out.println(refsub.getReferenceSubstanceInfo()
					.getIupacName());
			System.out.println(refsub.getReferenceSubstanceInfo()
					.getRelatedSubstances().getGroupCategoryInfo());
			for (I6SynonymEntry s : refsub.getReferenceSubstanceInfo()
					.getSynonyms().getEntry())
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
		for (eu.europa.echa.iuclid6.namespaces.endpoint_study_record_granulometry._2.ENDPOINTSTUDYRECORDGranulometry.MaterialsAndMethods.Guideline.Entry entry :g.getMaterialsAndMethods().getGuideline().getEntry()) {
			entry.getGuideline().getValue();
		}
		g.getResultsAndDiscussion().getAerodynamicDiameter();
		g.getResultsAndDiscussion().getGeometricStandardDeviation();
		g.getResultsAndDiscussion().getParticleSize().getEntry();
		for (Entry entry : g.getResultsAndDiscussion().getParticleSizeDistribution().getEntry()) {
			entry.getDistribution();
			entry.getSize();
			entry.getRemarksOnResults();
		}
		g.getResultsAndDiscussion().getAnyOtherInformationOnResultsInclTables();
	}
}
