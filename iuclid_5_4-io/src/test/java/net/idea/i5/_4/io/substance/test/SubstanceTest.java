package net.idea.i5._4.io.substance.test;

import java.io.InputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import net.idea.i5._4.io.substance.Substance;
import net.idea.i5._4.io.substance.Substance.Composition;
import net.idea.i5._4.io.substance.Substance.SubstanceCompositions;
import net.idea.i5._4.io.substance.Substance.SubstanceCompositions.SubstanceComposition;
import net.idea.i5._4.io.substance.Substance.SubstanceCompositions.SubstanceComposition.Additives.Additive;
import net.idea.i5._4.io.substance.Substance.SubstanceCompositions.SubstanceComposition.Constituents.Constituent;
import net.idea.i5._4.io.substance.Substance.SubstanceCompositions.SubstanceComposition.Impurities.Impurity;

import org.junit.Test;

public class SubstanceTest {
	@Test
	public void unmarshall() throws Exception {
			String test = "i5z/formaldehyde.i5d";
			InputStream in = null;
			try {
				in = SubstanceTest.class.getClassLoader().getResourceAsStream(test);
				JAXBContext jaxbContext = JAXBContext.newInstance(Substance.class);
		 
				Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
				Substance substance = (Substance) jaxbUnmarshaller.unmarshal(in);
				System.out.println(substance.getChemicalName());
				System.out.println(substance.getDocumentReferencePK());
				System.out.println(substance.getPublicName());
				System.out.println(substance.getVersion());
				Composition composition = substance.getComposition();
				System.out.println(composition.getValueID());
				System.out.println(composition.getOtherValue().getName());
				System.out.println(substance.getCsfLabelForSubstance());
				System.out.println("Composition");
				SubstanceCompositions sc = substance.getSubstanceCompositions();
				for (SubstanceComposition c : sc.getSubstanceComposition()) {
					System.out.println(c.getLocalUUID());
					System.out.println(c.getName());
					System.out.println(c.getDescription());
					System.out.println(c.getDegreeOfPurity().getUpperValue());
					System.out.println(c.getDegreeOfPurity().getLowerValue());
					System.out.println(c.getDegreeOfPurity().getLowerPrecision().getValue());
					System.out.println("Additives");
					if (c.getAdditives()!=null)
					for (Additive a : c.getAdditives().getAdditive()) {
						System.out.println(a.getReferenceSubstance().getUniqueKey());
						System.out.println(a.getFunction().getValueID());
						System.out.println("Proportion real");
						System.out.println(a.getProportionReal().getLowerPrecision().getValue());
						System.out.println(a.getProportionReal().getUpperPrecision().getValue());
						System.out.println(a.getProportionReal().getLowerValue());
						System.out.println(a.getProportionReal().getUpperValue());
						System.out.println(a.getProportionReal().getUnit().getValue());
						System.out.println("Proportion typical");
						System.out.println(a.getProportionTypical().getValue());
						System.out.println(a.getProportionTypical().getPrecision().getValue());
						System.out.println(a.getProportionTypical().getUnit().getValue());
						System.out.println("Remarks");
						System.out.println(a.getRemarks());
					}
					System.out.println("Impurity");
					if (c.getImpurities()!=null)
					for (Impurity a : c.getImpurities().getImpurity()) {
						System.out.println(a.getReferenceSubstance().getUniqueKey());
						System.out.println("Proportion real");
						System.out.println(a.getProportionReal().getLowerPrecision().getValue());
						System.out.println(a.getProportionReal().getUpperPrecision().getValue());
						System.out.println(a.getProportionReal().getLowerValue());
						System.out.println(a.getProportionReal().getUpperValue());
						System.out.println(a.getProportionReal().getUnit().getValue());
						System.out.println("Proportion typical");
						System.out.println(a.getProportionTypical().getValue());
						System.out.println(a.getProportionTypical().getPrecision().getValue());
						System.out.println(a.getProportionTypical().getUnit().getValue());
						System.out.println("Remarks");
						System.out.println(a.getRemarks());
					}		
					System.out.println("Constituents");
					if (c.getConstituents()!=null)
					for (Constituent a : c.getConstituents().getConstituent()) {
						System.out.println(a.getReferenceSubstance().getUniqueKey());
						System.out.println("Proportion real");
						System.out.println(a.getProportionReal().getLowerPrecision().getValue());
						System.out.println(a.getProportionReal().getUpperPrecision().getValue());
						System.out.println(a.getProportionReal().getLowerValue());
						System.out.println(a.getProportionReal().getUpperValue());
						System.out.println(a.getProportionReal().getUnit().getValue());
						System.out.println("Proportion typical");
						System.out.println(a.getProportionTypical().getValue());
						System.out.println(a.getProportionTypical().getPrecision().getValue());
						System.out.println(a.getProportionTypical().getUnit().getValue());
						System.out.println("Remarks");
						System.out.println(a.getRemarks());
					}
					
				}
			} catch (Exception x) {
				throw x;
			} finally {
				if (in!=null) in.close();
			}	
	}
	
}
