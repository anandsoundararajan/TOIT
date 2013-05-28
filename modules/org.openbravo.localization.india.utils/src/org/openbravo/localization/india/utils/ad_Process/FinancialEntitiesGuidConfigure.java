package org.openbravo.localization.india.utils.ad_Process;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.criterion.Restrictions;
import org.openbravo.base.secureApp.HttpSecureAppServlet;
import org.openbravo.base.secureApp.VariablesSecureApp;
import org.openbravo.dal.core.OBContext;
import org.openbravo.dal.service.OBCriteria;
import org.openbravo.dal.service.OBDal;
import org.openbravo.erpCommon.ad_actionButton.ActionButtonDefaultData;
import org.openbravo.erpCommon.businessUtility.WindowTabs;
import org.openbravo.erpCommon.utility.ComboTableData;
import org.openbravo.erpCommon.utility.OBError;
import org.openbravo.erpCommon.utility.OBErrorBuilder;
import org.openbravo.erpCommon.utility.ToolBar;
import org.openbravo.erpCommon.utility.Utility;
import org.openbravo.localization.india.utils.bo.FinancialEntitiesGuidConverter;
import org.openbravo.model.ad.domain.ModelImplementation;
import org.openbravo.xmlEngine.XmlDocument;

public class FinancialEntitiesGuidConfigure extends HttpSecureAppServlet {

  /**
	 * 
	 */
  private static final long serialVersionUID = 1L;

  public void init(ServletConfig config) {
    super.init(config);

    boolHist = false;

  }

  public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException,
      ServletException {
    VariablesSecureApp vars = new VariablesSecureApp(request);
    String strTabId = "Financial Entity Conveter";
    if (vars.commandIn("DEFAULT")) {

      buildRequest(response, vars, strTabId);

    } else if (vars.commandIn("SAVE")) {
      OBError myError = OBErrorBuilder.buildMessage(null, strTabId, "");
      String strWindowId = vars.getStringParameter("inpwindowId");
      String accountingSchema = vars.getStringParameter("inpAccountingSchemaId");
      String moduleId = vars.getStringParameter("inpModuleId");
      String organizationId=vars.getStringParameter("inpOrganizationId");
      try {
        myError = FinancialEntitiesGuidConverter.ConvertFile(accountingSchema, moduleId,organizationId);
      } catch (Exception exc) {
        myError.setMessage(exc.getMessage());
        myError.setType("Error");
      }
      vars.setMessage(strTabId, myError);
      buildRequest(response, vars, strTabId);

    } else
      pageErrorPopUp(response);

  }

  private void buildRequest(HttpServletResponse response, VariablesSecureApp vars, String strTabId)
      throws IOException, ServletException {

    if (log4j.isDebugEnabled())
      log4j.debug("Output: process Financial Entity Converter");
    String strProcessId = getProcessIdFromClassName();

    ActionButtonDefaultData[] data = null;
    if (vars.getLanguage().equals("en_US"))
      data = ActionButtonDefaultData.select(this, strProcessId);
    else
      data = ActionButtonDefaultData.selectLanguage(this, vars.getLanguage(), strProcessId);

    String strHelp = "", strDescription = "";

    if (data != null && data.length != 0) {
      strDescription = data[0].description;
      strHelp = data[0].help;
    }
    String[] discard = { "" };
    if (strHelp.equals(""))
      discard[0] = new String("helpDiscard");
    XmlDocument xmlDocument = xmlEngine.readXmlTemplate(
        "org/openbravo/localization/india/utils/ad_Process/FinancialEntitiesGuidConfigure")
        .createXmlDocument();
    final ToolBar toolbar = new ToolBar(this, vars.getLanguage(), "FinancialEntitiesGuidConfigure",
        false, "", "", "", false, "ad_Process", strReplaceWith, false, true);
    toolbar.prepareSimpleToolBarTemplate();
    xmlDocument.setParameter("toolbar", toolbar.toString());
    try {
      final WindowTabs tabs = new WindowTabs(this, vars,
          "org.openbravo.localization.india.utils.ad_Process.FinancialEntitiesGuidConfigure");
      xmlDocument.setParameter("parentTabContainer", tabs.parentTabs());
      xmlDocument.setParameter("mainTabContainer", tabs.mainTabs());
      xmlDocument.setParameter("childTabContainer", tabs.childTabs());
      xmlDocument.setParameter("theme", vars.getTheme());
      xmlDocument.setParameter("language", "defaultLang=\"" + vars.getLanguage() + "\";");
      xmlDocument.setParameter("directory", "var baseDirectory = \"" + strReplaceWith + "/\";\n");
      xmlDocument.setParameter("theme", vars.getTheme());
      xmlDocument.setParameter("question",
          Utility.messageBD(this, "StartProcess?", vars.getLanguage()));
      xmlDocument.setParameter("description", strDescription);
      xmlDocument.setParameter("help", strHelp);

      OBError myMessage = vars.getMessage(strTabId);
      vars.removeMessage(strTabId);
      if (myMessage != null) {
        xmlDocument.setParameter("messageType", myMessage.getType());
        xmlDocument.setParameter("messageTitle", myMessage.getTitle());
        xmlDocument.setParameter("messageMessage", myMessage.getMessage());
      }
      ComboTableData comboTableData1 = new ComboTableData(vars, this, "TABLE", "Module Reference",
          "54909CF0103D48CF8C027547F290101F", "", Utility.getContext(this, vars,
              "#AccessibleOrgTree", "FinancialEntitiesGuidConfigure"), Utility.getContext(this,
              vars, "#User_Client", "FinancialEntitiesGuidConfigure"), 0);
      Utility.fillSQLParameters(this, vars, null, comboTableData1,
          "FinancialEntitiesGuidConfigure", "");
      xmlDocument.setData("ModuleReference", "liststructure", comboTableData1.select(false));
      comboTableData1 = null;
      ComboTableData comboTableData = new ComboTableData(vars, this, "TABLE", "Accounting Schema",
          "C_AcctSchema", "", Utility.getContext(this, vars, "#AccessibleOrgTree",
              "FinancialEntitiesGuidConfigure"), Utility.getContext(this, vars, "#User_Client",
              "FinancialEntitiesGuidConfigure"), 0);
      Utility.fillSQLParameters(this, vars, null, comboTableData, "FinancialEntitiesGuidConfigure",
          "");
      xmlDocument.setData("AccountingSchema", "liststructure", comboTableData.select(false));
      comboTableData = null;
      
      ComboTableData comboTableData2 = new ComboTableData(vars, this, "TABLE", "Organization Based On The Element",
              "3E6900D8F0734071A7AB156E16324438", "", Utility.getContext(this, vars, "#AccessibleOrgTree",
                  "FinancialEntitiesGuidConfigure"), Utility.getContext(this, vars, "#User_Client",
                  "FinancialEntitiesGuidConfigure"), 0);
          Utility.fillSQLParameters(this, vars, null, comboTableData2, "FinancialEntitiesGuidConfigure",
              "");
          xmlDocument.setData("OrganizationReference", "liststructure", comboTableData2.select(false));
          comboTableData2 = null;
      //Organization Based On The Element
    } catch (Exception ex) {
      log4j.error("Competitor combo box exception " + ex.getMessage());
    }
    response.setContentType("text/html; charset=UTF-8");
    PrintWriter out = response.getWriter();
    out.println(xmlDocument.print());
    out.close();

  }

  private String getProcessIdFromClassName() {
    String processId = "";
    OBContext.setAdminMode();
    OBCriteria<ModelImplementation> modelImplementationCriteria = OBDal.getInstance()
        .createCriteria(ModelImplementation.class);
    modelImplementationCriteria.add(Restrictions.eq(ModelImplementation.PROPERTY_JAVACLASSNAME,
        this.getClass().getCanonicalName()));
    modelImplementationCriteria.add(Restrictions.isNotNull(ModelImplementation.PROPERTY_PROCESS));
    if (modelImplementationCriteria.list().size() > 0)
      processId = modelImplementationCriteria.list().get(0).getProcess().getId();
    OBContext.restorePreviousMode();
    return processId;

  }

  public String getServletInfo() {
    return "Servlet FinancialEntitiesGuidConfigure";
  } // end of getServletInfo() method
}
