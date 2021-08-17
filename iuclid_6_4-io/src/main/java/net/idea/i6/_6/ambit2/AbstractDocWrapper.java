package net.idea.i6._6.ambit2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.logging.Logger;

import javax.xml.bind.JAXBElement;

import ambit2.base.interfaces.IStructureRecord;
import eu.europa.echa.iuclid6.namespaces.platform_container.v1.Document;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.MultilingualTextField;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.MultilingualTextFieldLarge;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.MultilingualTextFieldMultiLine;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.MultilingualTextFieldSmall;

public class AbstractDocWrapper {
  protected static Logger logger = Logger.getLogger(EndpointStudyRecordWrapper.class.getName());
  protected Document doc;
  protected static ResourceBundle phr = ResourceBundle.getBundle("PhraseResourceBundle", Locale.ENGLISH);
  protected static ResourceBundle ppr = ResourceBundle.getBundle("ProtocolParametersResourceBundle", Locale.ENGLISH);
  protected static ResourceBundle msg = ResourceBundle.getBundle("ResourceBundle", Locale.ENGLISH);
  protected Map<String, Object> library;
  protected static final String _MIGRATED = "MIGRATED";

  public AbstractDocWrapper(Document doc) throws Exception {
    this.doc = doc;
  }

  public Map<String, Object> getLibrary() {
    return library;
  }

  public void setLibrary(Map<String, Object> library) {
    this.library = library;
  }

  public static String getPhrase(String key) {
    try {
      return phr.getString(key);
    } catch (Exception x) {
      return key;
    }
  }

  public static String getPhrase(String key, String other) {
    return ("1342".equals(key)) ? other : getPhrase(key);
  }

  private final String prefix = "http://iuclid6.echa.europa.eu/namespaces/platform-metadata/v1";

  protected String getPlatformMetadataValue(Document doc, String name) {
    for (Object o : doc.getPlatformMetadata().getIuclidVersionAndDocumentKeyAndDocumentType())
      if (name.equals(((JAXBElement) o).getName().getLocalPart())) {
        return ((JAXBElement) o).getValue().toString();
      }
    return null;
  }

  protected String getPlatformMetadataValue(String name) {
    return getPlatformMetadataValue(doc, name);
  }

  public String getDocumentReferencePK() {
    return getPlatformMetadataValue("documentKey");
  }

  public String getName() {
    return getPlatformMetadataValue("name");
  }

  protected Object call(Object obj, String methodName, Object... params)
      throws SecurityException, InvocationTargetException, IllegalAccessException, NoSuchMethodException {
	if (obj == null) return null;  
    Method method = obj.getClass().getMethod(methodName);
    return method.invoke(obj);
  }

  protected void setFormat(IStructureRecord record) {
    record.setFormat("i6._6.");
  }

  protected String joinMultiTextField(List<MultilingualTextField> value) {
    if (value == null)
      return null;
    if (value.size() == 0)
      return "";
    StringBuilder b = new StringBuilder();
    for (MultilingualTextField t : value) {
      if (t.getLang() == "en" || t.getLang() == null || t.getLang() == "") {
        b.append(t.getValue());
        // b.append(t.getValue());
        b.append(" ");
      }
    }
    return b.toString().trim();
  }

  
  
  protected String joinMultiTextFieldMultiLine(List<MultilingualTextFieldMultiLine> value) {
    if (value == null)
      return null;
    if (value.size() == 0)
      return "";
    StringBuilder b = new StringBuilder();
    for (MultilingualTextFieldMultiLine t : value) {
      if (t.getLang() == "en" || t.getLang() == null || t.getLang() == "") {
        b.append(t.getValue());
        // b.append(t.getValue());
        b.append(" ");
      }
    }
    return b.toString().trim();
  }
  
  protected String joinMultiTextFieldLarge(List<MultilingualTextFieldLarge> value) {
    if (value == null)
      return null;
    if (value.size() == 0)
      return "";
    StringBuilder b = new StringBuilder();
    for (MultilingualTextFieldLarge t : value) {
      if (t.getLang() == "en" || t.getLang() == null || t.getLang() == "") {
        b.append(t.getValue());
        // b.append(t.getValue());
        b.append(" ");
      }
    }
    return b.toString().trim();
  }

  protected String joinMultiTextFieldSmall(List<MultilingualTextFieldSmall> value) {
    if (value == null)
      return null;
    if (value.size() == 0)
      return "";
    StringBuilder b = new StringBuilder();
    for (MultilingualTextFieldSmall t : value) {
      if (t.getLang() == "en" || t.getLang() == null || t.getLang() == "") {
        b.append(t.getValue());
        // b.append(t.getValue());
        b.append(" ");
      }
    }
    return b.toString().trim();
  }

  public static Logger getLogger() {
	  return logger;
  }
}
