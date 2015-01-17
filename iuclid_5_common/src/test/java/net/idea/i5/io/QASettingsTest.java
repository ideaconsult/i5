package net.idea.i5.io;

import junit.framework.Assert;

import org.junit.Test;

public class QASettingsTest {

    @Test
    public void testDefault() throws Exception {
	QASettings qa = new QASettings(true);
	qa.setDefault();
	Assert.assertTrue(qa.isPurposeflagAccepted("921"));
	Assert.assertTrue(qa.isPurposeflagAccepted("1590"));
	Assert.assertFalse(qa.isPurposeflagAccepted("1661"));
	Assert.assertFalse(qa.isPurposeflagAccepted("8108"));
	Assert.assertFalse(qa.isPurposeflagAccepted("NOT_SPECIFIED"));
	Assert.assertFalse(qa.isPurposeflagAccepted(null));

	Assert.assertTrue(qa.isTestMaterialIdentityAccepted("2480"));
	Assert.assertFalse(qa.isTestMaterialIdentityAccepted("2158"));
	Assert.assertFalse(qa.isTestMaterialIdentityAccepted("NOT_SPECIFIED"));

	Assert.assertTrue(qa.isReferenceTypeAccepted("1586"));
	Assert.assertTrue(qa.isReferenceTypeAccepted("1433"));
	Assert.assertTrue(qa.isReferenceTypeAccepted("1486"));

	Assert.assertFalse(qa.isReferenceTypeAccepted("266"));
	Assert.assertFalse(qa.isReferenceTypeAccepted("1542"));
	Assert.assertFalse(qa.isReferenceTypeAccepted("811"));
	Assert.assertFalse(qa.isReferenceTypeAccepted("1342"));
	Assert.assertFalse(qa.isReferenceTypeAccepted("NOT_SPECIFIED"));

	Assert.assertTrue(qa.isReliabilityAccepted("16"));
	Assert.assertTrue(qa.isReliabilityAccepted("18"));
	Assert.assertFalse(qa.isReliabilityAccepted("22"));
	Assert.assertFalse(qa.isReliabilityAccepted("24"));
	Assert.assertFalse(qa.isReliabilityAccepted("1342"));
	Assert.assertFalse(qa.isReliabilityAccepted("NOT_SPECIFIED"));

	Assert.assertTrue(qa.isStudyResultAccepted("1895"));
	Assert.assertFalse(qa.isStudyResultAccepted("1896"));
	Assert.assertFalse(qa.isStudyResultAccepted("1885"));
	Assert.assertFalse(qa.isStudyResultAccepted("2304"));
	Assert.assertFalse(qa.isStudyResultAccepted("14"));
	Assert.assertFalse(qa.isStudyResultAccepted("1342"));
	Assert.assertFalse(qa.isStudyResultAccepted("1173"));
	Assert.assertFalse(qa.isStudyResultAccepted("NOT_SPECIFIED"));
    }

    @Test
    public void testAll() throws Exception {
	QASettings qa = new QASettings(true);
	qa.setAll();
	Assert.assertTrue(qa.isPurposeflagAccepted("921"));
	Assert.assertTrue(qa.isPurposeflagAccepted("1590"));
	Assert.assertTrue(qa.isPurposeflagAccepted("1661"));
	Assert.assertTrue(qa.isPurposeflagAccepted("8108"));
	Assert.assertTrue(qa.isPurposeflagAccepted("NOT_SPECIFIED"));
	Assert.assertFalse(qa.isPurposeflagAccepted(null));

	Assert.assertTrue(qa.isTestMaterialIdentityAccepted("2480"));
	Assert.assertTrue(qa.isTestMaterialIdentityAccepted("2158"));
	Assert.assertTrue(qa.isTestMaterialIdentityAccepted("NOT_SPECIFIED"));
	Assert.assertFalse(qa.isTestMaterialIdentityAccepted(null));

	Assert.assertTrue(qa.isReferenceTypeAccepted("1586"));
	Assert.assertTrue(qa.isReferenceTypeAccepted("1433"));
	Assert.assertTrue(qa.isReferenceTypeAccepted("1486"));
	Assert.assertTrue(qa.isReferenceTypeAccepted("266"));
	Assert.assertTrue(qa.isReferenceTypeAccepted("1542"));
	Assert.assertTrue(qa.isReferenceTypeAccepted("811"));
	Assert.assertTrue(qa.isReferenceTypeAccepted("1342"));
	Assert.assertTrue(qa.isReferenceTypeAccepted("NOT_SPECIFIED"));
	Assert.assertFalse(qa.isReferenceTypeAccepted(null));

	Assert.assertTrue(qa.isReliabilityAccepted("16"));
	Assert.assertTrue(qa.isReliabilityAccepted("18"));
	Assert.assertTrue(qa.isReliabilityAccepted("22"));
	Assert.assertTrue(qa.isReliabilityAccepted("24"));
	Assert.assertTrue(qa.isReliabilityAccepted("1342"));
	Assert.assertTrue(qa.isReliabilityAccepted("NOT_SPECIFIED"));

	Assert.assertTrue(qa.isStudyResultAccepted("1895"));
	Assert.assertTrue(qa.isStudyResultAccepted("1896"));
	Assert.assertTrue(qa.isStudyResultAccepted("1885"));
	Assert.assertTrue(qa.isStudyResultAccepted("2304"));
	Assert.assertTrue(qa.isStudyResultAccepted("14"));
	Assert.assertTrue(qa.isStudyResultAccepted("1342"));
	Assert.assertTrue(qa.isStudyResultAccepted("1173"));
	Assert.assertTrue(qa.isStudyResultAccepted("NOT_SPECIFIED"));

    }

    @Test
    public void testNull() throws Exception {
	QASettings qa = new QASettings(true);
	qa.addPurposeflagOption(null);
	Assert.assertTrue(qa.isPurposeflagAccepted(null));
    }
}
