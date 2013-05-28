package org.openbravo.localization.india.utils.bo;

import java.io.File;
import java.io.FileFilter;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMResult;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.apache.commons.io.filefilter.WildcardFileFilter;
import org.hibernate.criterion.Restrictions;
import org.jfree.util.Log;
import org.openbravo.base.exception.OBException;
import org.openbravo.base.session.OBPropertiesProvider;
import org.openbravo.dal.core.OBContext;
import org.openbravo.dal.service.OBCriteria;
import org.openbravo.dal.service.OBDal;
import org.openbravo.erpCommon.utility.OBError;
import org.openbravo.erpCommon.utility.OBErrorBuilder;
import org.openbravo.model.ad.module.Module;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.financialmgmt.accounting.coa.AcctSchema;
import org.openbravo.model.financialmgmt.accounting.coa.ElementValue;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.w3c.dom.ls.DOMImplementationLS;
import org.w3c.dom.ls.LSSerializer;

public class FinancialEntitiesGuidConverter {

  private static final long serialVersionUID = 1L;

  public static OBError ConvertFile(String accountingSchemaGUID, String moduleId, String organizationId)
      throws org.xml.sax.SAXException, java.io.IOException {
    OBError myError;
    Document doc;
    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
    factory.setNamespaceAware(true);
    DocumentBuilder builder = null;
    try {
      builder = factory.newDocumentBuilder();
    } catch (javax.xml.parsers.ParserConfigurationException ex) {
      Log.error("Parser Configuration Error" + ex.getMessage());
    }

    Module moduleObj = getModule(moduleId);
    Organization orgnizationObj=OBDal.getInstance().get(Organization.class, organizationId);
    org.openbravo.model.financialmgmt.accounting.coa.Element elementObj=getElementObj(orgnizationObj);
    String referenceDataPath = getReferenceDataPath(moduleObj);
    File fileDir = new File(referenceDataPath);
    FileFilter fileFilter = new WildcardFileFilter("*.xml");
    File[] fileList = fileDir.listFiles(fileFilter);
    boolean amended = false;
    OBError hasWrittenintoFile;
    for (int k = 0; k < fileList.length; k++) {

      doc = builder.parse(fileList[k]);
      
      try {
        boolean fileAmendedForSchema = false;
        boolean fileAmendedForElementValue = false;
        boolean fielAmendedForAcctCombination=false;

        fileAmendedForSchema = checkAndUpdateSchema(accountingSchemaGUID, doc);
        fileAmendedForElementValue = checkAndUpdateElementValue(doc,elementObj);
        
        //fielAmendedForAcctCombination=checkAndUpdateAccountingCombination(doc);
        if (fileAmendedForElementValue || fileAmendedForSchema) {
          hasWrittenintoFile=writeXmlFile(doc, fileList[k]);
          if(hasWrittenintoFile!=null){
        	  return hasWrittenintoFile;
          }
          if (!amended)
            amended = true;
        }
      } catch (XPathExpressionException ex) {
        Log.error("XPathExpressionException" + ex.getMessage());
      }
    }
    
    if (amended) {
      myError = OBErrorBuilder.buildMessage(null, "Success",
          "Datasets updated for accounting based on the selected schema");
    } else {
      myError = OBErrorBuilder.buildMessage(null, "Info",
          "Datasets reviewed but are not required to be updated for accounting");
    }
    return myError;
  }

  private static org.openbravo.model.financialmgmt.accounting.coa.Element getElementObj(Organization orgnizationObj) {
	// TODO Auto-generated method stub
	  OBCriteria<org.openbravo.model.financialmgmt.accounting.coa.Element> 
	  elementCriteria=OBDal.getInstance().createCriteria(org.openbravo.model.financialmgmt.accounting.coa.Element.class);
	  elementCriteria.add(Restrictions.eq(org.openbravo.model.financialmgmt.accounting.coa.Element.PROPERTY_ORGANIZATION, orgnizationObj));
	  List<org.openbravo.model.financialmgmt.accounting.coa.Element> elelementCriteriaList=elementCriteria.list();
	  if(elelementCriteriaList!=null && elelementCriteriaList.size()>0){
		  return elelementCriteriaList.get(0);
	  }else{
		  throw new OBException("The record for the Element does not exists in the Organization "+orgnizationObj.getName());
	  }
	
}

/*private static boolean checkAndUpdateAccountingCombination(Document doc) throws XPathExpressionException {
	// TODO Auto-generated method stub
	  boolean fileAmended = false;
	  XPath xPath = XPathFactory.newInstance().newXPath();

	    // TODO : don't give the node name just the attribute name
	    NodeList clondeNodeList2 = (NodeList) xPath.evaluate(
	        "//accountElement[@entity-name='FinancialMgmtAccountingCombination']", doc.getDocumentElement(),
	        XPathConstants.NODESET);
	    for (int l = 0; l < clondeNodeList2.getLength(); l++) {
	      fileAmended = true;
	      Element accountingElement = (Element) clondeNodeList2.item(l);
	      String accntAccountingCombIdentifier = accountingElement.getAttribute("identifier");
	      String accountingCombinationId = getAccountingCombinationId(accntAccountingCombIdentifier);
	      accountingElement.setAttribute("id", accountingCombinationId);
	    }
	return fileAmended;
}

private static String getAccountingCombinationId(
		String accntAccountingCombIdentifier) {
	
	// TODO Auto-generated method stub
	return null;
}
*/
private static boolean checkAndUpdateElementValue(Document doc, org.openbravo.model.financialmgmt.accounting.coa.Element elementObj) throws XPathExpressionException {
    boolean fileAmended = false;
    // X Path to replace the Accounting Element
    XPath xPath = XPathFactory.newInstance().newXPath();

    // TODO : don't give the node name just the attribute name
    NodeList clondeNodeList2 = (NodeList) xPath.evaluate(
        "//*[@entity-name='FinancialMgmtElementValue']", doc.getDocumentElement(),
        XPathConstants.NODESET);
    for (int l = 0; l < clondeNodeList2.getLength(); l++) {
      fileAmended = true;
      Element accountingElement = (Element) clondeNodeList2.item(l);
      String accntElementIdentifier = accountingElement.getAttribute("identifier");
      String accountingElementId = getAccountingElementId(accntElementIdentifier,elementObj);
      accountingElement.setAttribute("id", accountingElementId);
    }
    return fileAmended;
  }

  private static boolean checkAndUpdateSchema(String accountingSchema, Document doc)
      throws XPathExpressionException {

    XPath xPath = XPathFactory.newInstance().newXPath();
    boolean fileAmended = false;
    NodeList clonedNodeList = (NodeList) xPath.evaluate(
        // TODO : don't give the node name just the attribute name
        "//*[@entity-name='FinancialMgmtAcctSchema']", doc.getDocumentElement(),
        XPathConstants.NODESET);
    for (int j = 0; j < clonedNodeList.getLength(); j++) {
      fileAmended = true;
      Element clonedAccntSchemaElement = (Element) clonedNodeList.item(j);
      AcctSchema accountingSchemaObj = OBDal.getInstance().get(AcctSchema.class, accountingSchema);
      clonedAccntSchemaElement.setAttribute("id", accountingSchema);
      clonedAccntSchemaElement.setAttribute("identifier", accountingSchemaObj.getName());
    }
    return fileAmended;
  }

  private static String getAccountingElementId(String accntElementIdentifier, org.openbravo.model.financialmgmt.accounting.coa.Element elementObj) {
    // TODO: Explain - don't understand - Hari
    String[] name = accntElementIdentifier.split("-");
    String name1 = name[0].trim();
    OBCriteria<ElementValue> elementValueCriteria = OBDal.getInstance().createCriteria(
        ElementValue.class);
    elementValueCriteria.add(Restrictions.eq(ElementValue.PROPERTY_CLIENT, OBContext.getOBContext()
        .getCurrentClient()));
    elementValueCriteria.add(Restrictions.eq(ElementValue.PROPERTY_SEARCHKEY, name1));
    elementValueCriteria.add(Restrictions.eq(ElementValue.PROPERTY_ACCOUNTINGELEMENT, elementObj));
    List<ElementValue> elementValueCriteriaList = elementValueCriteria.list();
    if (elementValueCriteriaList.size() <= 0) {
      throw new OBException("The record for the Element Value with name " + name1
          + " does not exists in the client "
          + OBContext.getOBContext().getCurrentClient().getName() + "");
    }

    // elementValueCriteria.add(Restrictions.eq(ElementValue.p, elementValueCriteria))
    return elementValueCriteriaList.get(0).getId();
  }

  @SuppressWarnings("finally")
  private static String getReferenceDataPath(Module moduleObj) {
    // TODO Auto-generated method stub
    String fullPath = "";
    try {
      OBContext.setAdminMode();
      String javaPackage = moduleObj.getJavaPackage();
      String sourcePath = OBPropertiesProvider.getInstance().getOpenbravoProperties()
          .getProperty("source.path");
      fullPath = sourcePath + "/modules/" + javaPackage + "/referencedata/standard/";
    } finally {
      OBContext.restorePreviousMode();
      return fullPath;
    }
  }

  public static OBError writeXmlFile(Document doc, File fileList) {
    try {
      // Prepare the DOM document for writing

      // Prepare the output file
      String sourcePath = OBPropertiesProvider.getInstance().getOpenbravoProperties()
          .getProperty("source.path");
      Source source = new DOMSource(doc);
      File file = new File(fileList.getPath());
      if(file.canWrite()==false){
    	  return OBErrorBuilder.buildMessage(null, "Conversion Failed", "Error", "No right access to " + fileList.getPath());
      }
      Result result = new StreamResult(file);
      // Write the DOM document to the filemessage
      Transformer xformer = TransformerFactory.newInstance().newTransformer();
      xformer.transform(source, result);
      return  OBErrorBuilder.buildMessage(null, "Success",
              "Datasets updated for accounting based on the selected schema");
    } catch (TransformerConfigurationException e) {
    	Log.error("TransformerConfigration Exception" + e.getMessage());
    	return OBErrorBuilder.buildMessage(null, "Conversion Failed", "Error", "TransformerConfigration Exception " + fileList.getPath());
    } catch (TransformerException e) {
    	Log.error("Transformer Exception" + e.getMessage());
    	return OBErrorBuilder.buildMessage(null, "Conversion Failed", "Error", "Transformer Exception " + fileList.getPath());
    }
    
  }

  @SuppressWarnings("finally")
  private static Module getModule(String moduleId) {
    List<Module> moduleCriteriaList = null;
    try {
      OBContext.setAdminMode();
      OBCriteria<Module> moduleCriteria = OBDal.getInstance().createCriteria(Module.class);
      moduleCriteria.add(Restrictions.eq(Module.PROPERTY_ID, moduleId));
      moduleCriteriaList = moduleCriteria.list();
      if (moduleCriteriaList.size() <= 0) {
        throw new OBException("The record for the Module does not exists");
      }
    } finally {
      OBContext.restorePreviousMode();
      return moduleCriteriaList.get(0);
    }
  }

  @SuppressWarnings("finally")
  private static String nodeToString(Element node) {
    Document document = node.getOwnerDocument();
    DOMImplementationLS domImplLS = (DOMImplementationLS) document.getImplementation();
    LSSerializer serializer = domImplLS.createLSSerializer();
    return serializer.writeToString(node);
  }

  // Cloning the XMl document
  private static Document cloneXmlDocument(Document doc) {
    TransformerFactory tfactory = TransformerFactory.newInstance();
    Transformer tx = null;
    try {
      tx = tfactory.newTransformer();
    } catch (TransformerConfigurationException e1) {
      // TODO Auto-generated catch block
      e1.printStackTrace();
    }
    DOMSource source = new DOMSource(doc);
    DOMResult result = new DOMResult();
    try {
      tx.transform(source, result);
    } catch (TransformerException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    return (Document) result.getNode();

  }
}
