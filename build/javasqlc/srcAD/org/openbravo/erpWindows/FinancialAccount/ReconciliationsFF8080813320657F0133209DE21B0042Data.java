//Sqlc generated V1.O00-1
package org.openbravo.erpWindows.FinancialAccount;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import java.util.*;

/**
WAD Generated class
 */
class ReconciliationsFF8080813320657F0133209DE21B0042Data implements FieldProvider {
static Logger log4j = Logger.getLogger(ReconciliationsFF8080813320657F0133209DE21B0042Data.class);
  private String InitRecordNumber="0";
  public String created;
  public String createdbyr;
  public String updated;
  public String updatedTimeStamp;
  public String updatedby;
  public String updatedbyr;
  public String adOrgId;
  public String isactive;
  public String finFinancialAccountId;
  public String documentno;
  public String cDoctypeId;
  public String cDoctypeIdr;
  public String widget;
  public String dateto;
  public String statementdate;
  public String startingbalance;
  public String emAprmPrintdetailed;
  public String printdetailed;
  public String emAprmPrintsummary;
  public String printsummary;
  public String endingbalance;
  public String docstatus;
  public String processing;
  public String processed;
  public String posted;
  public String postedBtn;
  public String emAprmProcessReconciliation;
  public String emAprmProcessRec;
  public String emAprmProcessRecBtn;
  public String finReconciliationId;
  public String adClientId;
  public String language;
  public String adUserClient;
  public String adOrgClient;
  public String createdby;
  public String trBgcolor;
  public String totalCount;
  public String dateTimeFormat;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("created"))
      return created;
    else if (fieldName.equalsIgnoreCase("createdbyr"))
      return createdbyr;
    else if (fieldName.equalsIgnoreCase("updated"))
      return updated;
    else if (fieldName.equalsIgnoreCase("updated_time_stamp") || fieldName.equals("updatedTimeStamp"))
      return updatedTimeStamp;
    else if (fieldName.equalsIgnoreCase("updatedby"))
      return updatedby;
    else if (fieldName.equalsIgnoreCase("updatedbyr"))
      return updatedbyr;
    else if (fieldName.equalsIgnoreCase("ad_org_id") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("isactive"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("fin_financial_account_id") || fieldName.equals("finFinancialAccountId"))
      return finFinancialAccountId;
    else if (fieldName.equalsIgnoreCase("documentno"))
      return documentno;
    else if (fieldName.equalsIgnoreCase("c_doctype_id") || fieldName.equals("cDoctypeId"))
      return cDoctypeId;
    else if (fieldName.equalsIgnoreCase("c_doctype_idr") || fieldName.equals("cDoctypeIdr"))
      return cDoctypeIdr;
    else if (fieldName.equalsIgnoreCase("widget"))
      return widget;
    else if (fieldName.equalsIgnoreCase("dateto"))
      return dateto;
    else if (fieldName.equalsIgnoreCase("statementdate"))
      return statementdate;
    else if (fieldName.equalsIgnoreCase("startingbalance"))
      return startingbalance;
    else if (fieldName.equalsIgnoreCase("em_aprm_printdetailed") || fieldName.equals("emAprmPrintdetailed"))
      return emAprmPrintdetailed;
    else if (fieldName.equalsIgnoreCase("printdetailed"))
      return printdetailed;
    else if (fieldName.equalsIgnoreCase("em_aprm_printsummary") || fieldName.equals("emAprmPrintsummary"))
      return emAprmPrintsummary;
    else if (fieldName.equalsIgnoreCase("printsummary"))
      return printsummary;
    else if (fieldName.equalsIgnoreCase("endingbalance"))
      return endingbalance;
    else if (fieldName.equalsIgnoreCase("docstatus"))
      return docstatus;
    else if (fieldName.equalsIgnoreCase("processing"))
      return processing;
    else if (fieldName.equalsIgnoreCase("processed"))
      return processed;
    else if (fieldName.equalsIgnoreCase("posted"))
      return posted;
    else if (fieldName.equalsIgnoreCase("posted_btn") || fieldName.equals("postedBtn"))
      return postedBtn;
    else if (fieldName.equalsIgnoreCase("em_aprm_process_reconciliation") || fieldName.equals("emAprmProcessReconciliation"))
      return emAprmProcessReconciliation;
    else if (fieldName.equalsIgnoreCase("em_aprm_process_rec") || fieldName.equals("emAprmProcessRec"))
      return emAprmProcessRec;
    else if (fieldName.equalsIgnoreCase("em_aprm_process_rec_btn") || fieldName.equals("emAprmProcessRecBtn"))
      return emAprmProcessRecBtn;
    else if (fieldName.equalsIgnoreCase("fin_reconciliation_id") || fieldName.equals("finReconciliationId"))
      return finReconciliationId;
    else if (fieldName.equalsIgnoreCase("ad_client_id") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("language"))
      return language;
    else if (fieldName.equals("adUserClient"))
      return adUserClient;
    else if (fieldName.equals("adOrgClient"))
      return adOrgClient;
    else if (fieldName.equals("createdby"))
      return createdby;
    else if (fieldName.equals("trBgcolor"))
      return trBgcolor;
    else if (fieldName.equals("totalCount"))
      return totalCount;
    else if (fieldName.equals("dateTimeFormat"))
      return dateTimeFormat;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

/**
Select for edit
 */
  public static ReconciliationsFF8080813320657F0133209DE21B0042Data[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String finFinancialAccountId, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, finFinancialAccountId, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static ReconciliationsFF8080813320657F0133209DE21B0042Data[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String finFinancialAccountId, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(FIN_Reconciliation.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = FIN_Reconciliation.CreatedBy) as CreatedByR, " +
      "        to_char(FIN_Reconciliation.Updated, ?) as updated, " +
      "        to_char(FIN_Reconciliation.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        FIN_Reconciliation.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = FIN_Reconciliation.UpdatedBy) as UpdatedByR," +
      "        FIN_Reconciliation.AD_Org_ID, " +
      "COALESCE(FIN_Reconciliation.Isactive, 'N') AS Isactive, " +
      "FIN_Reconciliation.FIN_Financial_Account_ID, " +
      "FIN_Reconciliation.DocumentNo, " +
      "FIN_Reconciliation.C_Doctype_ID, " +
      "(CASE WHEN FIN_Reconciliation.C_Doctype_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL1.Name IS NULL THEN TO_CHAR(table1.Name) ELSE TO_CHAR(tableTRL1.Name) END)), ''))),'') ) END) AS C_Doctype_IDR, " +
      "FIN_Reconciliation.Widget, " +
      "FIN_Reconciliation.Dateto, " +
      "FIN_Reconciliation.Statementdate, " +
      "FIN_Reconciliation.Startingbalance, " +
      "FIN_Reconciliation.EM_APRM_PrintDetailed, " +
      "COALESCE(FIN_Reconciliation.Printdetailed, 'N') AS Printdetailed, " +
      "FIN_Reconciliation.EM_APRM_PrintSummary, " +
      "COALESCE(FIN_Reconciliation.Printsummary, 'N') AS Printsummary, " +
      "FIN_Reconciliation.Endingbalance, " +
      "FIN_Reconciliation.Docstatus, " +
      "COALESCE(FIN_Reconciliation.Processing, 'N') AS Processing, " +
      "COALESCE(FIN_Reconciliation.Processed, 'N') AS Processed, " +
      "FIN_Reconciliation.Posted, " +
      "list1.name as Posted_BTN, " +
      "FIN_Reconciliation.EM_APRM_Process_Reconciliation, " +
      "FIN_Reconciliation.EM_Aprm_Process_Rec, " +
      "list2.name as EM_Aprm_Process_Rec_BTN, " +
      "FIN_Reconciliation.FIN_Reconciliation_ID, " +
      "FIN_Reconciliation.AD_Client_ID, " +
      "        ? AS LANGUAGE " +
      "        FROM FIN_Reconciliation left join (select C_Doctype_ID, Name from C_Doctype) table1 on (FIN_Reconciliation.C_Doctype_ID = table1.C_Doctype_ID) left join (select C_DocType_ID,AD_Language, Name from C_DocType_TRL) tableTRL1 on (table1.C_DocType_ID = tableTRL1.C_DocType_ID and tableTRL1.AD_Language = ?)  left join ad_ref_list_v list1 on (list1.ad_reference_id = '234' and list1.ad_language = ?  AND FIN_Reconciliation.Posted = TO_CHAR(list1.value)) left join ad_ref_list_v list2 on (list2.ad_reference_id = 'FF8080812E443491012E443C053A001A' and list2.ad_language = ?  AND FIN_Reconciliation.EM_Aprm_Process_Rec = TO_CHAR(list2.value))" +
      "        WHERE 2=2 " +
      "        AND 1=1 ";
    strSql = strSql + ((finFinancialAccountId==null || finFinancialAccountId.equals(""))?"":"  AND FIN_Reconciliation.FIN_Financial_Account_ID = ?  ");
    strSql = strSql + 
      "        AND FIN_Reconciliation.FIN_Reconciliation_ID = ? " +
      "        AND FIN_Reconciliation.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND FIN_Reconciliation.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateTimeFormat);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateTimeFormat);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      if (finFinancialAccountId != null && !(finFinancialAccountId.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, finFinancialAccountId);
      }
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, key);
      if (adUserClient != null && !(adUserClient.equals(""))) {
        }
      if (adOrgClient != null && !(adOrgClient.equals(""))) {
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
        ReconciliationsFF8080813320657F0133209DE21B0042Data objectReconciliationsFF8080813320657F0133209DE21B0042Data = new ReconciliationsFF8080813320657F0133209DE21B0042Data();
        objectReconciliationsFF8080813320657F0133209DE21B0042Data.created = UtilSql.getValue(result, "created");
        objectReconciliationsFF8080813320657F0133209DE21B0042Data.createdbyr = UtilSql.getValue(result, "createdbyr");
        objectReconciliationsFF8080813320657F0133209DE21B0042Data.updated = UtilSql.getValue(result, "updated");
        objectReconciliationsFF8080813320657F0133209DE21B0042Data.updatedTimeStamp = UtilSql.getValue(result, "updated_time_stamp");
        objectReconciliationsFF8080813320657F0133209DE21B0042Data.updatedby = UtilSql.getValue(result, "updatedby");
        objectReconciliationsFF8080813320657F0133209DE21B0042Data.updatedbyr = UtilSql.getValue(result, "updatedbyr");
        objectReconciliationsFF8080813320657F0133209DE21B0042Data.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectReconciliationsFF8080813320657F0133209DE21B0042Data.isactive = UtilSql.getValue(result, "isactive");
        objectReconciliationsFF8080813320657F0133209DE21B0042Data.finFinancialAccountId = UtilSql.getValue(result, "fin_financial_account_id");
        objectReconciliationsFF8080813320657F0133209DE21B0042Data.documentno = UtilSql.getValue(result, "documentno");
        objectReconciliationsFF8080813320657F0133209DE21B0042Data.cDoctypeId = UtilSql.getValue(result, "c_doctype_id");
        objectReconciliationsFF8080813320657F0133209DE21B0042Data.cDoctypeIdr = UtilSql.getValue(result, "c_doctype_idr");
        objectReconciliationsFF8080813320657F0133209DE21B0042Data.widget = UtilSql.getValue(result, "widget");
        objectReconciliationsFF8080813320657F0133209DE21B0042Data.dateto = UtilSql.getDateValue(result, "dateto", "dd-MM-yyyy");
        objectReconciliationsFF8080813320657F0133209DE21B0042Data.statementdate = UtilSql.getDateValue(result, "statementdate", "dd-MM-yyyy");
        objectReconciliationsFF8080813320657F0133209DE21B0042Data.startingbalance = UtilSql.getValue(result, "startingbalance");
        objectReconciliationsFF8080813320657F0133209DE21B0042Data.emAprmPrintdetailed = UtilSql.getValue(result, "em_aprm_printdetailed");
        objectReconciliationsFF8080813320657F0133209DE21B0042Data.printdetailed = UtilSql.getValue(result, "printdetailed");
        objectReconciliationsFF8080813320657F0133209DE21B0042Data.emAprmPrintsummary = UtilSql.getValue(result, "em_aprm_printsummary");
        objectReconciliationsFF8080813320657F0133209DE21B0042Data.printsummary = UtilSql.getValue(result, "printsummary");
        objectReconciliationsFF8080813320657F0133209DE21B0042Data.endingbalance = UtilSql.getValue(result, "endingbalance");
        objectReconciliationsFF8080813320657F0133209DE21B0042Data.docstatus = UtilSql.getValue(result, "docstatus");
        objectReconciliationsFF8080813320657F0133209DE21B0042Data.processing = UtilSql.getValue(result, "processing");
        objectReconciliationsFF8080813320657F0133209DE21B0042Data.processed = UtilSql.getValue(result, "processed");
        objectReconciliationsFF8080813320657F0133209DE21B0042Data.posted = UtilSql.getValue(result, "posted");
        objectReconciliationsFF8080813320657F0133209DE21B0042Data.postedBtn = UtilSql.getValue(result, "posted_btn");
        objectReconciliationsFF8080813320657F0133209DE21B0042Data.emAprmProcessReconciliation = UtilSql.getValue(result, "em_aprm_process_reconciliation");
        objectReconciliationsFF8080813320657F0133209DE21B0042Data.emAprmProcessRec = UtilSql.getValue(result, "em_aprm_process_rec");
        objectReconciliationsFF8080813320657F0133209DE21B0042Data.emAprmProcessRecBtn = UtilSql.getValue(result, "em_aprm_process_rec_btn");
        objectReconciliationsFF8080813320657F0133209DE21B0042Data.finReconciliationId = UtilSql.getValue(result, "fin_reconciliation_id");
        objectReconciliationsFF8080813320657F0133209DE21B0042Data.adClientId = UtilSql.getValue(result, "ad_client_id");
        objectReconciliationsFF8080813320657F0133209DE21B0042Data.language = UtilSql.getValue(result, "language");
        objectReconciliationsFF8080813320657F0133209DE21B0042Data.adUserClient = "";
        objectReconciliationsFF8080813320657F0133209DE21B0042Data.adOrgClient = "";
        objectReconciliationsFF8080813320657F0133209DE21B0042Data.createdby = "";
        objectReconciliationsFF8080813320657F0133209DE21B0042Data.trBgcolor = "";
        objectReconciliationsFF8080813320657F0133209DE21B0042Data.totalCount = "";
        objectReconciliationsFF8080813320657F0133209DE21B0042Data.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectReconciliationsFF8080813320657F0133209DE21B0042Data);
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
    ReconciliationsFF8080813320657F0133209DE21B0042Data objectReconciliationsFF8080813320657F0133209DE21B0042Data[] = new ReconciliationsFF8080813320657F0133209DE21B0042Data[vector.size()];
    vector.copyInto(objectReconciliationsFF8080813320657F0133209DE21B0042Data);
    return(objectReconciliationsFF8080813320657F0133209DE21B0042Data);
  }

/**
Create a registry
 */
  public static ReconciliationsFF8080813320657F0133209DE21B0042Data[] set(String finFinancialAccountId, String widget, String emAprmPrintdetailed, String finReconciliationId, String adClientId, String adOrgId, String createdby, String createdbyr, String updatedby, String updatedbyr, String isactive, String documentno, String cDoctypeId, String dateto, String statementdate, String endingbalance, String startingbalance, String docstatus, String processing, String processed, String posted, String postedBtn, String printdetailed, String printsummary, String emAprmPrintsummary, String emAprmProcessRec, String emAprmProcessRecBtn, String emAprmProcessReconciliation)    throws ServletException {
    ReconciliationsFF8080813320657F0133209DE21B0042Data objectReconciliationsFF8080813320657F0133209DE21B0042Data[] = new ReconciliationsFF8080813320657F0133209DE21B0042Data[1];
    objectReconciliationsFF8080813320657F0133209DE21B0042Data[0] = new ReconciliationsFF8080813320657F0133209DE21B0042Data();
    objectReconciliationsFF8080813320657F0133209DE21B0042Data[0].created = "";
    objectReconciliationsFF8080813320657F0133209DE21B0042Data[0].createdbyr = createdbyr;
    objectReconciliationsFF8080813320657F0133209DE21B0042Data[0].updated = "";
    objectReconciliationsFF8080813320657F0133209DE21B0042Data[0].updatedTimeStamp = "";
    objectReconciliationsFF8080813320657F0133209DE21B0042Data[0].updatedby = updatedby;
    objectReconciliationsFF8080813320657F0133209DE21B0042Data[0].updatedbyr = updatedbyr;
    objectReconciliationsFF8080813320657F0133209DE21B0042Data[0].adOrgId = adOrgId;
    objectReconciliationsFF8080813320657F0133209DE21B0042Data[0].isactive = isactive;
    objectReconciliationsFF8080813320657F0133209DE21B0042Data[0].finFinancialAccountId = finFinancialAccountId;
    objectReconciliationsFF8080813320657F0133209DE21B0042Data[0].documentno = documentno;
    objectReconciliationsFF8080813320657F0133209DE21B0042Data[0].cDoctypeId = cDoctypeId;
    objectReconciliationsFF8080813320657F0133209DE21B0042Data[0].cDoctypeIdr = "";
    objectReconciliationsFF8080813320657F0133209DE21B0042Data[0].widget = widget;
    objectReconciliationsFF8080813320657F0133209DE21B0042Data[0].dateto = dateto;
    objectReconciliationsFF8080813320657F0133209DE21B0042Data[0].statementdate = statementdate;
    objectReconciliationsFF8080813320657F0133209DE21B0042Data[0].startingbalance = startingbalance;
    objectReconciliationsFF8080813320657F0133209DE21B0042Data[0].emAprmPrintdetailed = emAprmPrintdetailed;
    objectReconciliationsFF8080813320657F0133209DE21B0042Data[0].printdetailed = printdetailed;
    objectReconciliationsFF8080813320657F0133209DE21B0042Data[0].emAprmPrintsummary = emAprmPrintsummary;
    objectReconciliationsFF8080813320657F0133209DE21B0042Data[0].printsummary = printsummary;
    objectReconciliationsFF8080813320657F0133209DE21B0042Data[0].endingbalance = endingbalance;
    objectReconciliationsFF8080813320657F0133209DE21B0042Data[0].docstatus = docstatus;
    objectReconciliationsFF8080813320657F0133209DE21B0042Data[0].processing = processing;
    objectReconciliationsFF8080813320657F0133209DE21B0042Data[0].processed = processed;
    objectReconciliationsFF8080813320657F0133209DE21B0042Data[0].posted = posted;
    objectReconciliationsFF8080813320657F0133209DE21B0042Data[0].postedBtn = postedBtn;
    objectReconciliationsFF8080813320657F0133209DE21B0042Data[0].emAprmProcessReconciliation = emAprmProcessReconciliation;
    objectReconciliationsFF8080813320657F0133209DE21B0042Data[0].emAprmProcessRec = emAprmProcessRec;
    objectReconciliationsFF8080813320657F0133209DE21B0042Data[0].emAprmProcessRecBtn = emAprmProcessRecBtn;
    objectReconciliationsFF8080813320657F0133209DE21B0042Data[0].finReconciliationId = finReconciliationId;
    objectReconciliationsFF8080813320657F0133209DE21B0042Data[0].adClientId = adClientId;
    objectReconciliationsFF8080813320657F0133209DE21B0042Data[0].language = "";
    return objectReconciliationsFF8080813320657F0133209DE21B0042Data;
  }

/**
Select for auxiliar field
 */
  public static String selectDef8189F49FFED86E56E040007F01003E83_0(ConnectionProvider connectionProvider, String CreatedbyR)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Name), ''))), '') ) as Createdby FROM AD_User left join (select AD_User_ID, Name from AD_User) table2 on (AD_User.AD_User_ID = table2.AD_User_ID) WHERE AD_User.isActive='Y' AND AD_User.AD_User_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, CreatedbyR);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "createdby");
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
    return(strReturn);
  }

/**
Select for auxiliar field
 */
  public static String selectDef8189F49FFEDA6E56E040007F01003E83_1(ConnectionProvider connectionProvider, String UpdatedbyR)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Name), ''))), '') ) as Updatedby FROM AD_User left join (select AD_User_ID, Name from AD_User) table2 on (AD_User.AD_User_ID = table2.AD_User_ID) WHERE AD_User.isActive='Y' AND AD_User.AD_User_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, UpdatedbyR);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "updatedby");
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
    return(strReturn);
  }

/**
return the parent ID
 */
  public static String selectParentID(ConnectionProvider connectionProvider, String key)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT FIN_Reconciliation.FIN_Financial_Account_ID AS NAME" +
      "        FROM FIN_Reconciliation" +
      "        WHERE FIN_Reconciliation.FIN_Reconciliation_ID = ?";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, key);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "name");
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
    return(strReturn);
  }

/**
Select for parent field
 */
  public static String selectParent(ConnectionProvider connectionProvider, String finFinancialAccountId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT (TO_CHAR(COALESCE(TO_CHAR(table2.ISO_Code), '')) || ' - ' || TO_CHAR(COALESCE(TO_CHAR(table1.Name), ''))) AS NAME FROM FIN_Financial_Account left join (select FIN_Financial_Account_ID, C_Currency_ID, Name from FIN_Financial_Account) table1 on (FIN_Financial_Account.FIN_Financial_Account_ID = table1.FIN_Financial_Account_ID) left join (select C_Currency_ID, ISO_Code from C_Currency) table2 on (table1.C_Currency_ID = table2.C_Currency_ID) WHERE FIN_Financial_Account.FIN_Financial_Account_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, finFinancialAccountId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "name");
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
    return(strReturn);
  }

/**
Select for parent field
 */
  public static String selectParentTrl(ConnectionProvider connectionProvider, String finFinancialAccountId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT (TO_CHAR(COALESCE(TO_CHAR(table2.ISO_Code), '')) || ' - ' || TO_CHAR(COALESCE(TO_CHAR(table1.Name), ''))) AS NAME FROM FIN_Financial_Account left join (select FIN_Financial_Account_ID, C_Currency_ID, Name from FIN_Financial_Account) table1 on (FIN_Financial_Account.FIN_Financial_Account_ID = table1.FIN_Financial_Account_ID) left join (select C_Currency_ID, ISO_Code from C_Currency) table2 on (table1.C_Currency_ID = table2.C_Currency_ID) WHERE FIN_Financial_Account.FIN_Financial_Account_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, finFinancialAccountId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "name");
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
    return(strReturn);
  }

  public int update(Connection conn, ConnectionProvider connectionProvider)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        UPDATE FIN_Reconciliation" +
      "        SET AD_Org_ID = (?) , Isactive = (?) , FIN_Financial_Account_ID = (?) , DocumentNo = (?) , C_Doctype_ID = (?) , Widget = (?) , Dateto = TO_DATE(?) , Statementdate = TO_DATE(?) , Startingbalance = TO_NUMBER(?) , EM_APRM_PrintDetailed = (?) , Printdetailed = (?) , EM_APRM_PrintSummary = (?) , Printsummary = (?) , Endingbalance = TO_NUMBER(?) , Docstatus = (?) , Processing = (?) , Processed = (?) , Posted = (?) , EM_APRM_Process_Reconciliation = (?) , EM_Aprm_Process_Rec = (?) , FIN_Reconciliation_ID = (?) , AD_Client_ID = (?) , updated = now(), updatedby = ? " +
      "        WHERE FIN_Reconciliation.FIN_Reconciliation_ID = ? " +
      "                 AND FIN_Reconciliation.FIN_Financial_Account_ID = ? " +
      "        AND FIN_Reconciliation.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND FIN_Reconciliation.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, finFinancialAccountId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, documentno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cDoctypeId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, widget);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateto);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, statementdate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, startingbalance);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emAprmPrintdetailed);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, printdetailed);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emAprmPrintsummary);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, printsummary);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, endingbalance);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, docstatus);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processing);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processed);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, posted);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emAprmProcessReconciliation);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emAprmProcessRec);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, finReconciliationId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, finReconciliationId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, finFinancialAccountId);
      if (adUserClient != null && !(adUserClient.equals(""))) {
        }
      if (adOrgClient != null && !(adOrgClient.equals(""))) {
        }

      updateCount = st.executeUpdate();
    } catch(SQLException e){
      log4j.error("SQL error in query: " + strSql + "Exception:"+ e);
      throw new ServletException("@CODE=" + Integer.toString(e.getErrorCode()) + "@" + e.getMessage());
    } catch(Exception ex){
      log4j.error("Exception in query: " + strSql + "Exception:"+ ex);
      throw new ServletException("@CODE=@" + ex.getMessage());
    } finally {
      try {
        connectionProvider.releaseTransactionalPreparedStatement(st);
      } catch(Exception ignore){
        ignore.printStackTrace();
      }
    }
    return(updateCount);
  }

  public int insert(Connection conn, ConnectionProvider connectionProvider)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        INSERT INTO FIN_Reconciliation " +
      "        (AD_Org_ID, Isactive, FIN_Financial_Account_ID, DocumentNo, C_Doctype_ID, Widget, Dateto, Statementdate, Startingbalance, EM_APRM_PrintDetailed, Printdetailed, EM_APRM_PrintSummary, Printsummary, Endingbalance, Docstatus, Processing, Processed, Posted, EM_APRM_Process_Reconciliation, EM_Aprm_Process_Rec, FIN_Reconciliation_ID, AD_Client_ID, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), (?), (?), (?), (?), TO_DATE(?), TO_DATE(?), TO_NUMBER(?), (?), (?), (?), (?), TO_NUMBER(?), (?), (?), (?), (?), (?), (?), (?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, finFinancialAccountId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, documentno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cDoctypeId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, widget);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateto);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, statementdate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, startingbalance);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emAprmPrintdetailed);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, printdetailed);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emAprmPrintsummary);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, printsummary);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, endingbalance);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, docstatus);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processing);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processed);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, posted);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emAprmProcessReconciliation);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emAprmProcessRec);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, finReconciliationId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, createdby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);

      updateCount = st.executeUpdate();
    } catch(SQLException e){
      log4j.error("SQL error in query: " + strSql + "Exception:"+ e);
      throw new ServletException("@CODE=" + Integer.toString(e.getErrorCode()) + "@" + e.getMessage());
    } catch(Exception ex){
      log4j.error("Exception in query: " + strSql + "Exception:"+ ex);
      throw new ServletException("@CODE=@" + ex.getMessage());
    } finally {
      try {
        connectionProvider.releaseTransactionalPreparedStatement(st);
      } catch(Exception ignore){
        ignore.printStackTrace();
      }
    }
    return(updateCount);
  }

  public static int delete(ConnectionProvider connectionProvider, String param1, String finFinancialAccountId, String adUserClient, String adOrgClient)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        DELETE FROM FIN_Reconciliation" +
      "        WHERE FIN_Reconciliation.FIN_Reconciliation_ID = ? " +
      "                 AND FIN_Reconciliation.FIN_Financial_Account_ID = ? " +
      "        AND FIN_Reconciliation.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND FIN_Reconciliation.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, param1);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, finFinancialAccountId);
      if (adUserClient != null && !(adUserClient.equals(""))) {
        }
      if (adOrgClient != null && !(adOrgClient.equals(""))) {
        }

      updateCount = st.executeUpdate();
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
    return(updateCount);
  }

/**
Select for relation
 */
  public static String selectOrg(ConnectionProvider connectionProvider, String id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT AD_ORG_ID" +
      "          FROM FIN_Reconciliation" +
      "         WHERE FIN_Reconciliation.FIN_Reconciliation_ID = ? ";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, id);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "ad_org_id");
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
    return(strReturn);
  }

  public static String getCurrentDBTimestamp(ConnectionProvider connectionProvider, String id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp" +
      "          FROM FIN_Reconciliation" +
      "         WHERE FIN_Reconciliation.FIN_Reconciliation_ID = ? ";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, id);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "updated_time_stamp");
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
    return(strReturn);
  }
}
