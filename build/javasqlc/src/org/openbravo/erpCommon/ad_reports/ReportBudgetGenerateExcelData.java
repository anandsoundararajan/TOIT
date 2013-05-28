//Sqlc generated V1.O00-1
package org.openbravo.erpCommon.ad_reports;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import java.util.*;

class ReportBudgetGenerateExcelData implements FieldProvider {
static Logger log4j = Logger.getLogger(ReportBudgetGenerateExcelData.class);
  private String InitRecordNumber="0";
  public String partner;
  public String partnergroup;
  public String product;
  public String prodcategory;
  public String salesregion;
  public String campaign;
  public String activity;
  public String project;
  public String trxorg;
  public String month;
  public String validcombination;
  public String accountschema;
  public String currency;
  public String qty;
  public String price;
  public String amount;
  public String name;
  public String id;
  public String description;
  public String actual;
  public String padre;
  public String exportactual;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("partner"))
      return partner;
    else if (fieldName.equalsIgnoreCase("partnergroup"))
      return partnergroup;
    else if (fieldName.equalsIgnoreCase("product"))
      return product;
    else if (fieldName.equalsIgnoreCase("prodcategory"))
      return prodcategory;
    else if (fieldName.equalsIgnoreCase("salesregion"))
      return salesregion;
    else if (fieldName.equalsIgnoreCase("campaign"))
      return campaign;
    else if (fieldName.equalsIgnoreCase("activity"))
      return activity;
    else if (fieldName.equalsIgnoreCase("project"))
      return project;
    else if (fieldName.equalsIgnoreCase("trxorg"))
      return trxorg;
    else if (fieldName.equalsIgnoreCase("month"))
      return month;
    else if (fieldName.equalsIgnoreCase("validcombination"))
      return validcombination;
    else if (fieldName.equalsIgnoreCase("accountschema"))
      return accountschema;
    else if (fieldName.equalsIgnoreCase("currency"))
      return currency;
    else if (fieldName.equalsIgnoreCase("qty"))
      return qty;
    else if (fieldName.equalsIgnoreCase("price"))
      return price;
    else if (fieldName.equalsIgnoreCase("amount"))
      return amount;
    else if (fieldName.equalsIgnoreCase("name"))
      return name;
    else if (fieldName.equalsIgnoreCase("id"))
      return id;
    else if (fieldName.equalsIgnoreCase("description"))
      return description;
    else if (fieldName.equalsIgnoreCase("actual"))
      return actual;
    else if (fieldName.equalsIgnoreCase("padre"))
      return padre;
    else if (fieldName.equalsIgnoreCase("exportactual"))
      return exportactual;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static ReportBudgetGenerateExcelData[] select(ConnectionProvider connectionProvider, String columns, String tables)    throws ServletException {
    return select(connectionProvider, columns, tables, 0, 0);
  }

  public static ReportBudgetGenerateExcelData[] select(ConnectionProvider connectionProvider, String columns, String tables, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT  ";
    strSql = strSql + ((columns==null || columns.equals(""))?"":columns);
    strSql = strSql + 
      ", 0 AS QTY, 0 AS PRICE, ' ' AS AMOUNT, '' AS NAME, '' AS ID, '' AS DESCRIPTION, '' AS ACTUAL, ' ' AS PADRE, '' AS EXPORTACTUAL" +
      "      FROM DUAL";
    strSql = strSql + ((tables==null || tables.equals(""))?"":tables);

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    try {
    st = connectionProvider.getPreparedStatement(strSql);
      if (columns != null && !(columns.equals(""))) {
        }
      if (tables != null && !(tables.equals(""))) {
        }

      result = st.executeQuery();
      long countRecord = 0;
      long countRecordSkip = 1;
      boolean continueResult = true;
      while(countRecordSkip < firstRegister && continueResult) {
        continueResult = result.next();
        countRecordSkip++;
      }
      while(continueResult && result.next()) {
        countRecord++;
        ReportBudgetGenerateExcelData objectReportBudgetGenerateExcelData = new ReportBudgetGenerateExcelData();
        objectReportBudgetGenerateExcelData.partner = UtilSql.getValue(result, "partner");
        objectReportBudgetGenerateExcelData.partnergroup = UtilSql.getValue(result, "partnergroup");
        objectReportBudgetGenerateExcelData.product = UtilSql.getValue(result, "product");
        objectReportBudgetGenerateExcelData.prodcategory = UtilSql.getValue(result, "prodcategory");
        objectReportBudgetGenerateExcelData.salesregion = UtilSql.getValue(result, "salesregion");
        objectReportBudgetGenerateExcelData.campaign = UtilSql.getValue(result, "campaign");
        objectReportBudgetGenerateExcelData.activity = UtilSql.getValue(result, "activity");
        objectReportBudgetGenerateExcelData.project = UtilSql.getValue(result, "project");
        objectReportBudgetGenerateExcelData.trxorg = UtilSql.getValue(result, "trxorg");
        objectReportBudgetGenerateExcelData.month = UtilSql.getValue(result, "month");
        objectReportBudgetGenerateExcelData.validcombination = UtilSql.getValue(result, "validcombination");
        objectReportBudgetGenerateExcelData.accountschema = UtilSql.getValue(result, "accountschema");
        objectReportBudgetGenerateExcelData.currency = UtilSql.getValue(result, "currency");
        objectReportBudgetGenerateExcelData.qty = UtilSql.getValue(result, "qty");
        objectReportBudgetGenerateExcelData.price = UtilSql.getValue(result, "price");
        objectReportBudgetGenerateExcelData.amount = UtilSql.getValue(result, "amount");
        objectReportBudgetGenerateExcelData.name = UtilSql.getValue(result, "name");
        objectReportBudgetGenerateExcelData.id = UtilSql.getValue(result, "id");
        objectReportBudgetGenerateExcelData.description = UtilSql.getValue(result, "description");
        objectReportBudgetGenerateExcelData.actual = UtilSql.getValue(result, "actual");
        objectReportBudgetGenerateExcelData.padre = UtilSql.getValue(result, "padre");
        objectReportBudgetGenerateExcelData.exportactual = UtilSql.getValue(result, "exportactual");
        objectReportBudgetGenerateExcelData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectReportBudgetGenerateExcelData);
        if (countRecord >= numberRegisters && numberRegisters != 0) {
          continueResult = false;
        }
      }
      result.close();
    } catch(SQLException e){
      log4j.error("SQL error in query: " + strSql + "Exception:"+ e);
      throw new ServletException("@CODE=" + Integer.toString(e.getErrorCode()) + "@" + e.getMessage());
    } catch(Exception ex){
      log4j.error("Exception in query: " + strSql + "Exception:"+ ex);
      throw new ServletException("@CODE=@" + ex.getMessage());
    } finally {
      try {
        connectionProvider.releasePreparedStatement(st);
      } catch(Exception ignore){
        ignore.printStackTrace();
      }
    }
    ReportBudgetGenerateExcelData objectReportBudgetGenerateExcelData[] = new ReportBudgetGenerateExcelData[vector.size()];
    vector.copyInto(objectReportBudgetGenerateExcelData);
    return(objectReportBudgetGenerateExcelData);
  }

  public static ReportBudgetGenerateExcelData[] selectAccounts(ConnectionProvider connectionProvider, String adLanguage, String org, String client)    throws ServletException {
    return selectAccounts(connectionProvider, adLanguage, org, client, 0, 0);
  }

  public static ReportBudgetGenerateExcelData[] selectAccounts(ConnectionProvider connectionProvider, String adLanguage, String org, String client, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "		SELECT V.C_ELEMENTVALUE_ID AS ID, S.C_ACCTSCHEMA_ID AS PADRE, AD_COLUMN_IDENTIFIER('C_ELEMENTVALUE', TO_CHAR(V.C_ELEMENTVALUE_ID), ?) AS NAME " +
      "		FROM C_ACCTSCHEMA_ELEMENT S, C_ELEMENTVALUE V" +
      "		WHERE S.C_ELEMENT_ID = V.C_ELEMENT_ID" +
      "		AND V.ELEMENTLEVEL = 'S'" +
      "		AND V.AD_ORG_ID IN (";
    strSql = strSql + ((org==null || org.equals(""))?"":org);
    strSql = strSql + 
      ")" +
      "		AND V.AD_CLIENT_ID IN (";
    strSql = strSql + ((client==null || client.equals(""))?"":client);
    strSql = strSql + 
      ")" +
      "		ORDER BY V.VALUE";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      if (org != null && !(org.equals(""))) {
        }
      if (client != null && !(client.equals(""))) {
        }

      result = st.executeQuery();
      long countRecord = 0;
      long countRecordSkip = 1;
      boolean continueResult = true;
      while(countRecordSkip < firstRegister && continueResult) {
        continueResult = result.next();
        countRecordSkip++;
      }
      while(continueResult && result.next()) {
        countRecord++;
        ReportBudgetGenerateExcelData objectReportBudgetGenerateExcelData = new ReportBudgetGenerateExcelData();
        objectReportBudgetGenerateExcelData.id = UtilSql.getValue(result, "id");
        objectReportBudgetGenerateExcelData.padre = UtilSql.getValue(result, "padre");
        objectReportBudgetGenerateExcelData.name = UtilSql.getValue(result, "name");
        objectReportBudgetGenerateExcelData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectReportBudgetGenerateExcelData);
        if (countRecord >= numberRegisters && numberRegisters != 0) {
          continueResult = false;
        }
      }
      result.close();
    } catch(SQLException e){
      log4j.error("SQL error in query: " + strSql + "Exception:"+ e);
      throw new ServletException("@CODE=" + Integer.toString(e.getErrorCode()) + "@" + e.getMessage());
    } catch(Exception ex){
      log4j.error("Exception in query: " + strSql + "Exception:"+ ex);
      throw new ServletException("@CODE=@" + ex.getMessage());
    } finally {
      try {
        connectionProvider.releasePreparedStatement(st);
      } catch(Exception ignore){
        ignore.printStackTrace();
      }
    }
    ReportBudgetGenerateExcelData objectReportBudgetGenerateExcelData[] = new ReportBudgetGenerateExcelData[vector.size()];
    vector.copyInto(objectReportBudgetGenerateExcelData);
    return(objectReportBudgetGenerateExcelData);
  }

  public static ReportBudgetGenerateExcelData[] selectLines(ConnectionProvider connectionProvider, String adLanguage, String cbudgetid)    throws ServletException {
    return selectLines(connectionProvider, adLanguage, cbudgetid, 0, 0);
  }

  public static ReportBudgetGenerateExcelData[] selectLines(ConnectionProvider connectionProvider, String adLanguage, String cbudgetid, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "		SELECT QTY, PRICE, AMOUNT, B.DESCRIPTION, (" +
      "		  SELECT ISO_CODE " +
      "		  FROM C_CURRENCY " +
      "		  WHERE C_CURRENCY_ID=B.C_CURRENCY_ID" +
      "		  ) AS CURRENCY,    " +
      "		  CASE WHEN B.C_BPartner_ID IS NULL THEN ' '       ELSE AD_COLUMN_IDENTIFIER('C_BPARTNER', TO_CHAR(B.C_BPARTNER_ID), TO_CHAR(?)) END AS PARTNER ,    " +
      "		  CASE WHEN C_BP_GROUP_ID IS NULL THEN ' '       ELSE AD_COLUMN_IDENTIFIER('C_BP_GROUP', TO_CHAR(C_BP_GROUP_ID), TO_CHAR(?)) END AS PARTNERGROUP,    " +
      "		  CASE WHEN B.M_PRODUCT_ID IS NULL THEN ' '       ELSE AD_COLUMN_IDENTIFIER('M_PRODUCT', TO_CHAR(B.M_PRODUCT_ID), TO_CHAR(?)) END AS PRODUCT,    " +
      "		  CASE WHEN M_PRODUCT_CATEGORY_ID IS NULL THEN ' '       ELSE AD_COLUMN_IDENTIFIER('M_PRODUCT_CATEGORY', TO_CHAR(M_PRODUCT_CATEGORY_ID), TO_CHAR(?)) END AS PRODCATEGORY,    " +
      "		  CASE WHEN B.C_SALESREGION_ID IS NULL THEN ' '       ELSE AD_COLUMN_IDENTIFIER('C_SALESREGION', TO_CHAR(B.C_SALESREGION_ID), TO_CHAR(?)) END AS SALESREGION,    " +
      "		  CASE WHEN B.C_CAMPAIGN_ID IS NULL THEN ' '       ELSE AD_COLUMN_IDENTIFIER('C_CAMPAIGN', TO_CHAR(B.C_CAMPAIGN_ID), TO_CHAR(?)) END AS CAMPAIGN,    " +
      "		  CASE WHEN B.C_ACTIVITY_ID IS NULL THEN ' '       ELSE AD_COLUMN_IDENTIFIER('C_ACTIVITY', TO_CHAR(B.C_ACTIVITY_ID), TO_CHAR(?)) END AS ACTIVITY,    " +
      "		  CASE WHEN B.C_PROJECT_ID IS NULL THEN ' '       ELSE AD_COLUMN_IDENTIFIER('C_PROJECT', TO_CHAR(B.C_PROJECT_ID), TO_CHAR(?)) END AS PROJECT,    " +
      "		  CASE WHEN B.AD_ORG_ID IS NULL THEN ' '       ELSE AD_COLUMN_IDENTIFIER('AD_ORG', TO_CHAR(B.AD_ORG_ID), TO_CHAR(?)) END AS TRXORG,    " +
      "		  CASE WHEN C_PERIOD_ID IS NULL THEN ' '       ELSE AD_COLUMN_IDENTIFIER('AD_MONTH', (        " +
      "		    SELECT TO_CHAR(AD_MONTH_ID)         " +
      "		    FROM AD_MONTH WHERE TO_NUMBER(VALUE) = (          " +
      "		      SELECT PERIODNO           " +
      "		      FROM C_PERIOD           " +
      "		      WHERE C_PERIOD.C_PERIOD_ID=B.C_PERIOD_ID)        ), TO_CHAR(?)      " +
      "		    )  || ' ' ||" +
      "            AD_COLUMN_IDENTIFIER('C_YEAR', (        " +
      "            SELECT TO_CHAR(C_YEAR_ID)         " +
      "            FROM C_YEAR WHERE C_YEAR_ID = (          " +
      "              SELECT C_YEAR_ID           " +
      "              FROM C_PERIOD           " +
      "              WHERE C_PERIOD.C_PERIOD_ID=B.C_PERIOD_ID)        ), TO_CHAR(?)      " +
      "            ) END AS MONTH,    " +
      "		  C_BUDGET.EXPORTACTUAL," +
      "		  CASE WHEN C_BUDGET.EXPORTACTUAL = 'Y' THEN        (        " +
      "		    SELECT CASE WHEN E.ACCOUNTSIGN='C' THEN SUM(AMTACCTCR-AMTACCTDR) ELSE SUM(AMTACCTDR-AMTACCTCR) END AS AMOUNT        " +
      "		    FROM FACT_ACCT F, C_ELEMENTVALUE E        " +
      "		    WHERE        " +
      "		    COALESCE(B.C_ELEMENTVALUE_ID,'1')     = CASE WHEN B.C_ELEMENTVALUE_ID     IS NULL THEN '1' ELSE E.C_ELEMENTVALUE_ID     END AND          " +
      "		    COALESCE(B.C_ELEMENTVALUE_ID,'1')     = CASE WHEN B.C_ELEMENTVALUE_ID     IS NULL THEN '1' ELSE F.ACCOUNT_ID            END AND          " +
      "		    COALESCE(B.C_PERIOD_ID,'1')           = CASE WHEN B.C_PERIOD_ID           IS NULL THEN '1' ELSE F.C_PERIOD_ID           END AND          " +
      "		    COALESCE(B.C_BPARTNER_ID,'1')         = CASE WHEN B.C_BPARTNER_ID         IS NULL THEN '1' ELSE F.C_BPARTNER_ID         END AND          " +
      "		    COALESCE(B.M_PRODUCT_ID,'1')          = CASE WHEN B.M_PRODUCT_ID          IS NULL THEN '1' ELSE F.M_PRODUCT_ID          END AND          " +
      "		    COALESCE(B.C_SALESREGION_ID,'1')      = CASE WHEN B.C_SALESREGION_ID      IS NULL THEN '1' ELSE F.C_SALESREGION_ID      END AND          " +
      "		    COALESCE(B.C_CAMPAIGN_ID,'1')         = CASE WHEN B.C_CAMPAIGN_ID         IS NULL THEN '1' ELSE F.C_CAMPAIGN_ID         END AND          " +
      "		    COALESCE(B.C_ACTIVITY_ID,'1')         = CASE WHEN B.C_ACTIVITY_ID         IS NULL THEN '1' ELSE F.C_ACTIVITY_ID         END AND          " +
      "		    COALESCE(B.C_PROJECT_ID,'1')          = CASE WHEN B.C_PROJECT_ID          IS NULL THEN '1' ELSE F.C_PROJECT_ID          END AND          " +
      "		    COALESCE(B.M_PRODUCT_CATEGORY_ID,'1') = CASE WHEN B.M_PRODUCT_CATEGORY_ID IS NULL THEN '1' ELSE (SELECT TO_CHAR(MAX(M_PRODUCT_CATEGORY_ID)) " +
      "		                                                                                                            FROM M_PRODUCT " +
      "		                                                                                                            WHERE M_PRODUCT_ID=F.M_PRODUCT_ID" +
      "		                                                                                                            AND M_PRODUCT_ID IS NOT NULL)          END AND          " +
      "		    COALESCE(B.C_BP_GROUP_ID,'1')         = CASE WHEN B.C_BP_GROUP_ID         IS NULL THEN '1' ELSE (SELECT TO_CHAR(MAX(C_BP_GROUP_ID)) " +
      "		                                                                                                            FROM C_BPARTNER " +
      "		                                                                                                            WHERE C_BPARTNER_ID=F.C_BPARTNER_ID" +
      "		                                                                                                            AND C_BPARTNER_ID IS NOT NULL)          END AND " +
      "		    AD_ISORGINCLUDED(CASE WHEN B.AD_ORG_ID             IS NULL THEN '1' ELSE F.AD_ORG_ID             END,COALESCE(B.AD_ORG_ID,'1'), B.AD_CLIENT_ID) <> '-1'" +
      "		    GROUP BY E.ACCOUNTSIGN        )        ELSE -1 END AS ACTUAL,         " +
      "		  AD_COLUMN_IDENTIFIER('C_ELEMENTVALUE', TO_CHAR(B.C_ELEMENTVALUE_ID), TO_CHAR(?)) AS VALIDCOMBINATION,        " +
      "		  AD_COLUMN_IDENTIFIER('C_ACCTSCHEMA', TO_CHAR(B.C_ACCTSCHEMA_ID), TO_CHAR(?)) AS ACCOUNTSCHEMA      " +
      "		FROM    C_BUDGETLINE B, C_BUDGET      " +
      "		WHERE   B.C_BUDGET_ID = C_BUDGET.C_BUDGET_ID                  " +
      "		  AND B.C_BUDGET_ID = ?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cbudgetid);

      result = st.executeQuery();
      long countRecord = 0;
      long countRecordSkip = 1;
      boolean continueResult = true;
      while(countRecordSkip < firstRegister && continueResult) {
        continueResult = result.next();
        countRecordSkip++;
      }
      while(continueResult && result.next()) {
        countRecord++;
        ReportBudgetGenerateExcelData objectReportBudgetGenerateExcelData = new ReportBudgetGenerateExcelData();
        objectReportBudgetGenerateExcelData.qty = UtilSql.getValue(result, "qty");
        objectReportBudgetGenerateExcelData.price = UtilSql.getValue(result, "price");
        objectReportBudgetGenerateExcelData.amount = UtilSql.getValue(result, "amount");
        objectReportBudgetGenerateExcelData.description = UtilSql.getValue(result, "description");
        objectReportBudgetGenerateExcelData.currency = UtilSql.getValue(result, "currency");
        objectReportBudgetGenerateExcelData.partner = UtilSql.getValue(result, "partner");
        objectReportBudgetGenerateExcelData.partnergroup = UtilSql.getValue(result, "partnergroup");
        objectReportBudgetGenerateExcelData.product = UtilSql.getValue(result, "product");
        objectReportBudgetGenerateExcelData.prodcategory = UtilSql.getValue(result, "prodcategory");
        objectReportBudgetGenerateExcelData.salesregion = UtilSql.getValue(result, "salesregion");
        objectReportBudgetGenerateExcelData.campaign = UtilSql.getValue(result, "campaign");
        objectReportBudgetGenerateExcelData.activity = UtilSql.getValue(result, "activity");
        objectReportBudgetGenerateExcelData.project = UtilSql.getValue(result, "project");
        objectReportBudgetGenerateExcelData.trxorg = UtilSql.getValue(result, "trxorg");
        objectReportBudgetGenerateExcelData.month = UtilSql.getValue(result, "month");
        objectReportBudgetGenerateExcelData.exportactual = UtilSql.getValue(result, "exportactual");
        objectReportBudgetGenerateExcelData.actual = UtilSql.getValue(result, "actual");
        objectReportBudgetGenerateExcelData.validcombination = UtilSql.getValue(result, "validcombination");
        objectReportBudgetGenerateExcelData.accountschema = UtilSql.getValue(result, "accountschema");
        objectReportBudgetGenerateExcelData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectReportBudgetGenerateExcelData);
        if (countRecord >= numberRegisters && numberRegisters != 0) {
          continueResult = false;
        }
      }
      result.close();
    } catch(SQLException e){
      log4j.error("SQL error in query: " + strSql + "Exception:"+ e);
      throw new ServletException("@CODE=" + Integer.toString(e.getErrorCode()) + "@" + e.getMessage());
    } catch(Exception ex){
      log4j.error("Exception in query: " + strSql + "Exception:"+ ex);
      throw new ServletException("@CODE=@" + ex.getMessage());
    } finally {
      try {
        connectionProvider.releasePreparedStatement(st);
      } catch(Exception ignore){
        ignore.printStackTrace();
      }
    }
    ReportBudgetGenerateExcelData objectReportBudgetGenerateExcelData[] = new ReportBudgetGenerateExcelData[vector.size()];
    vector.copyInto(objectReportBudgetGenerateExcelData);
    return(objectReportBudgetGenerateExcelData);
  }

  public static ReportBudgetGenerateExcelData[] set()    throws ServletException {
    ReportBudgetGenerateExcelData objectReportBudgetGenerateExcelData[] = new ReportBudgetGenerateExcelData[1];
    objectReportBudgetGenerateExcelData[0] = new ReportBudgetGenerateExcelData();
    objectReportBudgetGenerateExcelData[0].qty = "";
    objectReportBudgetGenerateExcelData[0].price = "";
    objectReportBudgetGenerateExcelData[0].amount = "";
    objectReportBudgetGenerateExcelData[0].description = "";
    objectReportBudgetGenerateExcelData[0].currency = "";
    objectReportBudgetGenerateExcelData[0].partner = "";
    objectReportBudgetGenerateExcelData[0].partnergroup = "";
    objectReportBudgetGenerateExcelData[0].product = "";
    objectReportBudgetGenerateExcelData[0].prodcategory = "";
    objectReportBudgetGenerateExcelData[0].salesregion = "";
    objectReportBudgetGenerateExcelData[0].campaign = "";
    objectReportBudgetGenerateExcelData[0].activity = "";
    objectReportBudgetGenerateExcelData[0].project = "";
    objectReportBudgetGenerateExcelData[0].trxorg = "";
    objectReportBudgetGenerateExcelData[0].month = "";
    objectReportBudgetGenerateExcelData[0].exportactual = "";
    objectReportBudgetGenerateExcelData[0].actual = "";
    objectReportBudgetGenerateExcelData[0].validcombination = "";
    objectReportBudgetGenerateExcelData[0].accountschema = "";
    return objectReportBudgetGenerateExcelData;
  }

  public static ReportBudgetGenerateExcelData[] selectMonth(ConnectionProvider connectionProvider)    throws ServletException {
    return selectMonth(connectionProvider, 0, 0);
  }

  public static ReportBudgetGenerateExcelData[] selectMonth(ConnectionProvider connectionProvider, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT AD_MONTH_ID AS ID, NAME" +
      "      FROM AD_MONTH";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    try {
    st = connectionProvider.getPreparedStatement(strSql);

      result = st.executeQuery();
      long countRecord = 0;
      long countRecordSkip = 1;
      boolean continueResult = true;
      while(countRecordSkip < firstRegister && continueResult) {
        continueResult = result.next();
        countRecordSkip++;
      }
      while(continueResult && result.next()) {
        countRecord++;
        ReportBudgetGenerateExcelData objectReportBudgetGenerateExcelData = new ReportBudgetGenerateExcelData();
        objectReportBudgetGenerateExcelData.id = UtilSql.getValue(result, "id");
        objectReportBudgetGenerateExcelData.name = UtilSql.getValue(result, "name");
        objectReportBudgetGenerateExcelData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectReportBudgetGenerateExcelData);
        if (countRecord >= numberRegisters && numberRegisters != 0) {
          continueResult = false;
        }
      }
      result.close();
    } catch(SQLException e){
      log4j.error("SQL error in query: " + strSql + "Exception:"+ e);
      throw new ServletException("@CODE=" + Integer.toString(e.getErrorCode()) + "@" + e.getMessage());
    } catch(Exception ex){
      log4j.error("Exception in query: " + strSql + "Exception:"+ ex);
      throw new ServletException("@CODE=@" + ex.getMessage());
    } finally {
      try {
        connectionProvider.releasePreparedStatement(st);
      } catch(Exception ignore){
        ignore.printStackTrace();
      }
    }
    ReportBudgetGenerateExcelData objectReportBudgetGenerateExcelData[] = new ReportBudgetGenerateExcelData[vector.size()];
    vector.copyInto(objectReportBudgetGenerateExcelData);
    return(objectReportBudgetGenerateExcelData);
  }
}
