//Sqlc generated V1.O00-1
package org.openbravo.erpCommon.ad_reports;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import java.util.*;

class ReportGeneralLedgerJournalData implements FieldProvider {
static Logger log4j = Logger.getLogger(ReportGeneralLedgerJournalData.class);
  private String InitRecordNumber="0";
  public String schemaId;
  public String schemaName;
  public String identifier;
  public String dateacct;
  public String value;
  public String name;
  public String id;
  public String adTableId;
  public String docbasetype;
  public String docname;
  public String seqno;
  public String total;
  public String description;
  public String factaccttype2;
  public String amtacctdr;
  public String amtacctcr;
  public String groupedlines;
  public String taxid;
  public String tabId;
  public String newstyle;
  public String rownum;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("schema_id") || fieldName.equals("schemaId"))
      return schemaId;
    else if (fieldName.equalsIgnoreCase("schema_name") || fieldName.equals("schemaName"))
      return schemaName;
    else if (fieldName.equalsIgnoreCase("identifier"))
      return identifier;
    else if (fieldName.equalsIgnoreCase("dateacct"))
      return dateacct;
    else if (fieldName.equalsIgnoreCase("value"))
      return value;
    else if (fieldName.equalsIgnoreCase("name"))
      return name;
    else if (fieldName.equalsIgnoreCase("id"))
      return id;
    else if (fieldName.equalsIgnoreCase("ad_table_id") || fieldName.equals("adTableId"))
      return adTableId;
    else if (fieldName.equalsIgnoreCase("docbasetype"))
      return docbasetype;
    else if (fieldName.equalsIgnoreCase("docname"))
      return docname;
    else if (fieldName.equalsIgnoreCase("seqno"))
      return seqno;
    else if (fieldName.equalsIgnoreCase("total"))
      return total;
    else if (fieldName.equalsIgnoreCase("description"))
      return description;
    else if (fieldName.equalsIgnoreCase("factaccttype2"))
      return factaccttype2;
    else if (fieldName.equalsIgnoreCase("amtacctdr"))
      return amtacctdr;
    else if (fieldName.equalsIgnoreCase("amtacctcr"))
      return amtacctcr;
    else if (fieldName.equalsIgnoreCase("groupedlines"))
      return groupedlines;
    else if (fieldName.equalsIgnoreCase("taxid"))
      return taxid;
    else if (fieldName.equalsIgnoreCase("tab_id") || fieldName.equals("tabId"))
      return tabId;
    else if (fieldName.equalsIgnoreCase("newstyle"))
      return newstyle;
    else if (fieldName.equals("rownum"))
      return rownum;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static ReportGeneralLedgerJournalData[] select(ConnectionProvider connectionProvider, String descriptionGrouping, String adUserClient, String adUserOrg, String parDateFrom, String parDateTo, String docbasetype, String acctschema, String orgFamily, String checks, String paramLanguage)    throws ServletException {
    return select(connectionProvider, descriptionGrouping, adUserClient, adUserOrg, parDateFrom, parDateTo, docbasetype, acctschema, orgFamily, checks, paramLanguage, 0, 0);
  }

  public static ReportGeneralLedgerJournalData[] select(ConnectionProvider connectionProvider, String descriptionGrouping, String adUserClient, String adUserOrg, String parDateFrom, String parDateTo, String docbasetype, String acctschema, String orgFamily, String checks, String paramLanguage, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT SCHEMA_ID, SCHEMA_NAME, IDENTIFIER, DATEACCT, AA.VALUE, AA.NAME, ID, AD_TABLE_ID, DOCBASETYPE,AR.NAME as DOCNAME, SEQNO, '' AS TOTAL, DESCRIPTION," +
      "      (CASE FACTACCTTYPE WHEN 'O' THEN 1 WHEN 'N' THEN 2 WHEN 'R' THEN 3 ELSE 4 END) AS FACTACCTTYPE2," +
      "      (CASE AMTACCTDR WHEN 0 THEN NULL ELSE AMTACCTDR END) AS AMTACCTDR, (CASE AMTACCTCR WHEN 0 THEN NULL ELSE AMTACCTCR END) AS AMTACCTCR, " +
      "      '' AS GROUPEDLINES, '' AS TAXID, AD_GETTAB_FROM_TABLE(AA.AD_TABLE_ID, AA.DOCBASETYPE, AA.AD_CLIENT_ID) AS TAB_ID  , '' as newStyle" +
      "      FROM " +
      "      (SELECT F.C_ACCTSCHEMA_ID AS SCHEMA_ID, SC.NAME AS SCHEMA_NAME, F.FACT_ACCT_GROUP_ID AS IDENTIFIER, F.DATEACCT," +
      "      F.ACCTVALUE AS VALUE, F.ACCTDESCRIPTION AS NAME, CASE WHEN ";
    strSql = strSql + ((descriptionGrouping==null || descriptionGrouping.equals(""))?"":descriptionGrouping);
    strSql = strSql + 
      " = 'Y' THEN TO_CHAR(F.DESCRIPTION) ELSE TO_CHAR('') END AS DESCRIPTION, F.RECORD_ID AS ID, F.AD_TABLE_ID, F.DOCBASETYPE," +
      "      sum(F.AMTACCTDR) AS AMTACCTDR, sum(F.AMTACCTCR) AS AMTACCTCR, MIN(SEQNO) AS SEQNO, F.FACTACCTTYPE AS FACTACCTTYPE, F.AD_CLIENT_ID" +
      "      FROM FACT_ACCT F, C_ACCTSCHEMA SC  " +
      "      WHERE F.AD_CLIENT_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ")" +
      "      AND F.AD_ORG_ID IN(";
    strSql = strSql + ((adUserOrg==null || adUserOrg.equals(""))?"":adUserOrg);
    strSql = strSql + 
      ")" +
      "      AND 1=1";
    strSql = strSql + ((parDateFrom==null || parDateFrom.equals(""))?"":"  AND f.dateacct >= TO_DATE(?) ");
    strSql = strSql + ((parDateTo==null || parDateTo.equals(""))?"":"  AND f.dateacct < TO_DATE(?) ");
    strSql = strSql + ((docbasetype==null || docbasetype.equals(""))?"":"  AND f.DOCBASETYPE = ? ");
    strSql = strSql + ((acctschema==null || acctschema.equals(""))?"":"  AND f.C_ACCTSCHEMA_ID = ? ");
    strSql = strSql + 
      "      AND f.AD_ORG_ID IN(";
    strSql = strSql + ((orgFamily==null || orgFamily.equals(""))?"":orgFamily);
    strSql = strSql + 
      ")" +
      "      AND F.FactAcctType IN (";
    strSql = strSql + ((checks==null || checks.equals(""))?"":checks);
    strSql = strSql + 
      ")" +
      "      AND f.C_ACCTSCHEMA_ID = SC.C_ACCTSCHEMA_ID" +
      "      GROUP BY f.C_ACCTSCHEMA_ID, SC.NAME, F.AD_TABLE_ID, F.DATEACCT, F.ACCTDESCRIPTION, CASE WHEN ";
    strSql = strSql + ((descriptionGrouping==null || descriptionGrouping.equals(""))?"":descriptionGrouping);
    strSql = strSql + 
      " = 'Y' THEN TO_CHAR(F.DESCRIPTION) ELSE TO_CHAR('') END, F.ACCTVALUE, F.DOCBASETYPE, F.RECORD_ID, " +
      "      F.FACT_ACCT_GROUP_ID, F.ACCOUNT_ID,F.FACTACCTTYPE," +
      "      (CASE F.AMTACCTDR WHEN 0 THEN (CASE SIGN(F.AMTACCTCR) WHEN -1 THEN 1 ELSE 2 END) ELSE (CASE SIGN(F.AMTACCTDR) WHEN -1 THEN 3 ELSE 4 END) END), F.AD_CLIENT_ID" +
      "      HAVING (sum(F.AMTACCTDR) <> 0 OR sum(F.AMTACCTCR) <> 0)) AA" +
      "      LEFT JOIN (select * from AD_REF_LIST_V WHERE AD_REFERENCE_ID = '183'  AND AD_LANGUAGE=?) AR  ON AR.VALUE=AA.DOCBASETYPE " +
      "      ORDER BY SCHEMA_NAME, DATEACCT, FACTACCTTYPE2, IDENTIFIER, AA.AMTACCTDR DESC, AA.AMTACCTCR DESC, SEQNO";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      if (descriptionGrouping != null && !(descriptionGrouping.equals(""))) {
        }
      if (adUserClient != null && !(adUserClient.equals(""))) {
        }
      if (adUserOrg != null && !(adUserOrg.equals(""))) {
        }
      if (parDateFrom != null && !(parDateFrom.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, parDateFrom);
      }
      if (parDateTo != null && !(parDateTo.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, parDateTo);
      }
      if (docbasetype != null && !(docbasetype.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, docbasetype);
      }
      if (acctschema != null && !(acctschema.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, acctschema);
      }
      if (orgFamily != null && !(orgFamily.equals(""))) {
        }
      if (checks != null && !(checks.equals(""))) {
        }
      if (descriptionGrouping != null && !(descriptionGrouping.equals(""))) {
        }
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);

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
        ReportGeneralLedgerJournalData objectReportGeneralLedgerJournalData = new ReportGeneralLedgerJournalData();
        objectReportGeneralLedgerJournalData.schemaId = UtilSql.getValue(result, "schema_id");
        objectReportGeneralLedgerJournalData.schemaName = UtilSql.getValue(result, "schema_name");
        objectReportGeneralLedgerJournalData.identifier = UtilSql.getValue(result, "identifier");
        objectReportGeneralLedgerJournalData.dateacct = UtilSql.getDateValue(result, "dateacct", "dd-MM-yyyy");
        objectReportGeneralLedgerJournalData.value = UtilSql.getValue(result, "value");
        objectReportGeneralLedgerJournalData.name = UtilSql.getValue(result, "name");
        objectReportGeneralLedgerJournalData.id = UtilSql.getValue(result, "id");
        objectReportGeneralLedgerJournalData.adTableId = UtilSql.getValue(result, "ad_table_id");
        objectReportGeneralLedgerJournalData.docbasetype = UtilSql.getValue(result, "docbasetype");
        objectReportGeneralLedgerJournalData.docname = UtilSql.getValue(result, "docname");
        objectReportGeneralLedgerJournalData.seqno = UtilSql.getValue(result, "seqno");
        objectReportGeneralLedgerJournalData.total = UtilSql.getValue(result, "total");
        objectReportGeneralLedgerJournalData.description = UtilSql.getValue(result, "description");
        objectReportGeneralLedgerJournalData.factaccttype2 = UtilSql.getValue(result, "factaccttype2");
        objectReportGeneralLedgerJournalData.amtacctdr = UtilSql.getValue(result, "amtacctdr");
        objectReportGeneralLedgerJournalData.amtacctcr = UtilSql.getValue(result, "amtacctcr");
        objectReportGeneralLedgerJournalData.groupedlines = UtilSql.getValue(result, "groupedlines");
        objectReportGeneralLedgerJournalData.taxid = UtilSql.getValue(result, "taxid");
        objectReportGeneralLedgerJournalData.tabId = UtilSql.getValue(result, "tab_id");
        objectReportGeneralLedgerJournalData.newstyle = UtilSql.getValue(result, "newstyle");
        objectReportGeneralLedgerJournalData.rownum = Long.toString(countRecord);
        objectReportGeneralLedgerJournalData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectReportGeneralLedgerJournalData);
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
    ReportGeneralLedgerJournalData objectReportGeneralLedgerJournalData[] = new ReportGeneralLedgerJournalData[vector.size()];
    vector.copyInto(objectReportGeneralLedgerJournalData);
    return(objectReportGeneralLedgerJournalData);
  }

  public static ReportGeneralLedgerJournalData[] selectCountGroupedLines(ConnectionProvider connectionProvider, String adUserClient, String adUserOrg, String parDateFrom, String parDateTo, String docbasetype, String acctschema, String orgFamily, String checks)    throws ServletException {
    return selectCountGroupedLines(connectionProvider, adUserClient, adUserOrg, parDateFrom, parDateTo, docbasetype, acctschema, orgFamily, checks, 0, 0);
  }

  public static ReportGeneralLedgerJournalData[] selectCountGroupedLines(ConnectionProvider connectionProvider, String adUserClient, String adUserOrg, String parDateFrom, String parDateTo, String docbasetype, String acctschema, String orgFamily, String checks, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT COUNT(*) AS GROUPEDLINES, IDENTIFIER, SCHEMA_NAME, DATEACCT" +
      "      FROM" +
      "      (" +
      "        SELECT SCHEMA_ID, SCHEMA_NAME, IDENTIFIER, DATEACCT, VALUE, NAME, ID, AD_TABLE_ID, DOCBASETYPE, SEQNO, '' AS TOTAL, '' AS DESCRIPTION," +
      "        (CASE AMTACCTDR WHEN 0 THEN NULL ELSE AMTACCTDR END) AS AMTACCTDR, (CASE AMTACCTCR WHEN 0 THEN NULL ELSE AMTACCTCR END) AS AMTACCTCR" +
      "        FROM " +
      "        (SELECT F.C_ACCTSCHEMA_ID AS SCHEMA_ID, SC.NAME AS SCHEMA_NAME, F.FACT_ACCT_GROUP_ID AS IDENTIFIER, F.DATEACCT," +
      "        F.ACCTVALUE AS VALUE, F.ACCTDESCRIPTION AS NAME,F.RECORD_ID AS ID, F.AD_TABLE_ID, F.DOCBASETYPE," +
      "        sum(F.AMTACCTDR) AS AMTACCTDR, sum(F.AMTACCTCR) AS AMTACCTCR, MIN(SEQNO) AS SEQNO" +
      "        FROM FACT_ACCT F, C_ACCTSCHEMA SC  " +
      "        WHERE F.AD_CLIENT_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ")" +
      "        AND F.AD_ORG_ID IN(";
    strSql = strSql + ((adUserOrg==null || adUserOrg.equals(""))?"":adUserOrg);
    strSql = strSql + 
      ")" +
      "        AND 1=1";
    strSql = strSql + ((parDateFrom==null || parDateFrom.equals(""))?"":"  AND f.dateacct >= TO_DATE(?) ");
    strSql = strSql + ((parDateTo==null || parDateTo.equals(""))?"":"  AND f.dateacct < TO_DATE(?) ");
    strSql = strSql + ((docbasetype==null || docbasetype.equals(""))?"":"  AND f.DOCBASETYPE = ? ");
    strSql = strSql + ((acctschema==null || acctschema.equals(""))?"":"  AND f.C_ACCTSCHEMA_ID = ? ");
    strSql = strSql + 
      "        AND f.AD_ORG_ID IN(";
    strSql = strSql + ((orgFamily==null || orgFamily.equals(""))?"":orgFamily);
    strSql = strSql + 
      ")" +
      "        AND F.FactAcctType IN (";
    strSql = strSql + ((checks==null || checks.equals(""))?"":checks);
    strSql = strSql + 
      ")" +
      "        AND f.C_ACCTSCHEMA_ID = SC.C_ACCTSCHEMA_ID" +
      "        GROUP BY f.C_ACCTSCHEMA_ID, SC.NAME, F.AD_TABLE_ID, F.DATEACCT, F.ACCTDESCRIPTION, F.ACCTVALUE, F.DOCBASETYPE, F.RECORD_ID, " +
      "        F.FACT_ACCT_GROUP_ID, F.ACCOUNT_ID," +
      "        (CASE F.AMTACCTDR WHEN 0 THEN (CASE SIGN(F.AMTACCTCR) WHEN -1 THEN 1 ELSE 2 END) ELSE (CASE SIGN(F.AMTACCTDR) WHEN -1 THEN 3 ELSE 4 END) END)) AA" +
      "        ORDER BY SCHEMA_NAME, DATEACCT, IDENTIFIER, SEQNO" +
      "      ) BB" +
      "      GROUP BY IDENTIFIER, SCHEMA_NAME, DATEACCT" +
      "      ORDER BY SCHEMA_NAME, DATEACCT, IDENTIFIER";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      if (adUserClient != null && !(adUserClient.equals(""))) {
        }
      if (adUserOrg != null && !(adUserOrg.equals(""))) {
        }
      if (parDateFrom != null && !(parDateFrom.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, parDateFrom);
      }
      if (parDateTo != null && !(parDateTo.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, parDateTo);
      }
      if (docbasetype != null && !(docbasetype.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, docbasetype);
      }
      if (acctschema != null && !(acctschema.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, acctschema);
      }
      if (orgFamily != null && !(orgFamily.equals(""))) {
        }
      if (checks != null && !(checks.equals(""))) {
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
        ReportGeneralLedgerJournalData objectReportGeneralLedgerJournalData = new ReportGeneralLedgerJournalData();
        objectReportGeneralLedgerJournalData.groupedlines = UtilSql.getValue(result, "groupedlines");
        objectReportGeneralLedgerJournalData.identifier = UtilSql.getValue(result, "identifier");
        objectReportGeneralLedgerJournalData.schemaName = UtilSql.getValue(result, "schema_name");
        objectReportGeneralLedgerJournalData.dateacct = UtilSql.getDateValue(result, "dateacct", "dd-MM-yyyy");
        objectReportGeneralLedgerJournalData.rownum = Long.toString(countRecord);
        objectReportGeneralLedgerJournalData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectReportGeneralLedgerJournalData);
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
    ReportGeneralLedgerJournalData objectReportGeneralLedgerJournalData[] = new ReportGeneralLedgerJournalData[vector.size()];
    vector.copyInto(objectReportGeneralLedgerJournalData);
    return(objectReportGeneralLedgerJournalData);
  }

  public static String selectCount(ConnectionProvider connectionProvider, String adUserClient, String adUserOrg, String parDateFrom, String parDateTo, String docbasetype, String acctschema, String orgFamily, String checks, String dateAcct, String factAcctGroupId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT COUNT(FACT_ACCT_GROUP_ID) AS TOTAL" +
      "        FROM (" +
      "        SELECT F.DATEACCT, F.FACT_ACCT_GROUP_ID  " +
      "        FROM FACT_ACCT F left join AD_TABLE T on F.AD_TABLE_ID = T.AD_TABLE_ID" +
      "                         left join AD_TAB TB  on T.AD_TABLE_ID = TB.AD_TABLE_ID" +
      "                         left join AD_COLUMN C on T.AD_TABLE_ID = C.AD_TABLE_ID " +
      "                                              AND C.ISKEY = 'Y'  " +
      "                         left join AD_WINDOW W on TB.AD_WINDOW_ID = W.AD_WINDOW_ID" +
      "        WHERE F.AD_CLIENT_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ")" +
      "        AND F.AD_ORG_ID IN(";
    strSql = strSql + ((adUserOrg==null || adUserOrg.equals(""))?"":adUserOrg);
    strSql = strSql + 
      ")" +
      "        AND 1=1";
    strSql = strSql + ((parDateFrom==null || parDateFrom.equals(""))?"":"  AND f.dateacct >= TO_DATE(?) ");
    strSql = strSql + ((parDateTo==null || parDateTo.equals(""))?"":"  AND f.dateacct < TO_DATE(?) ");
    strSql = strSql + ((docbasetype==null || docbasetype.equals(""))?"":"  AND f.DOCBASETYPE = ? ");
    strSql = strSql + ((acctschema==null || acctschema.equals(""))?"":"  AND f.C_ACCTSCHEMA_ID = ? ");
    strSql = strSql + 
      "        AND f.AD_ORG_ID IN(";
    strSql = strSql + ((orgFamily==null || orgFamily.equals(""))?"":orgFamily);
    strSql = strSql + 
      ")     " +
      "	      AND F.FactAcctType IN (";
    strSql = strSql + ((checks==null || checks.equals(""))?"":checks);
    strSql = strSql + 
      ")" +
      "        AND (CASE (SELECT MAX(ISSOTRX) FROM C_DOCTYPE D " +
      "                    WHERE D.DOCBASETYPE = F.DOCBASETYPE) WHEN 'N' THEN COALESCE(T.PO_WINDOW_ID, T.AD_WINDOW_ID) ELSE T.AD_WINDOW_ID END) = (CASE TO_CHAR(F.DOCBASETYPE) " +
      "                    WHEN 'FAT' THEN '94EAA455D2644E04AB25D93BE5157B6D' ELSE W.AD_WINDOW_ID END)" +
      "        GROUP BY F.DATEACCT, F.FACT_ACCT_GROUP_ID) AA" +
      "        WHERE (DATEACCT< TO_DATE(?) OR (DATEACCT=TO_DATE(?) AND FACT_ACCT_GROUP_ID < ?))";

    ResultSet result;
    String strReturn = "0";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      if (adUserClient != null && !(adUserClient.equals(""))) {
        }
      if (adUserOrg != null && !(adUserOrg.equals(""))) {
        }
      if (parDateFrom != null && !(parDateFrom.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, parDateFrom);
      }
      if (parDateTo != null && !(parDateTo.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, parDateTo);
      }
      if (docbasetype != null && !(docbasetype.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, docbasetype);
      }
      if (acctschema != null && !(acctschema.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, acctschema);
      }
      if (orgFamily != null && !(orgFamily.equals(""))) {
        }
      if (checks != null && !(checks.equals(""))) {
        }
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, factAcctGroupId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "total");
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

  public static ReportGeneralLedgerJournalData[] set(String rownum)    throws ServletException {
    ReportGeneralLedgerJournalData objectReportGeneralLedgerJournalData[] = new ReportGeneralLedgerJournalData[1];
    objectReportGeneralLedgerJournalData[0] = new ReportGeneralLedgerJournalData();
    objectReportGeneralLedgerJournalData[0].total = "";
    return objectReportGeneralLedgerJournalData;
  }

  public static ReportGeneralLedgerJournalData[] selectDirect(ConnectionProvider connectionProvider, String adUserClient, String adUserOrg, String table, String record, String cAcctshemaId, String paramLanguage)    throws ServletException {
    return selectDirect(connectionProvider, adUserClient, adUserOrg, table, record, cAcctshemaId, paramLanguage, 0, 0);
  }

  public static ReportGeneralLedgerJournalData[] selectDirect(ConnectionProvider connectionProvider, String adUserClient, String adUserOrg, String table, String record, String cAcctshemaId, String paramLanguage, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT SCHEMA_ID, SCHEMA_NAME, IDENTIFIER, DATEACCT, AA.VALUE, AA.NAME, ID, AD_TABLE_ID, DOCBASETYPE,AR.NAME as DOCNAME, SEQNO, '' AS TOTAL, " +
      "      (CASE FACTACCTTYPE WHEN 'O' THEN 1 WHEN 'N' THEN 2 WHEN 'R' THEN 3 ELSE 4 END) AS FACTACCTTYPE2," +
      "      (CASE AMTACCTDR WHEN 0 THEN NULL ELSE AMTACCTDR END) AS AMTACCTDR, (CASE AMTACCTCR WHEN 0 THEN NULL ELSE AMTACCTCR END) AS AMTACCTCR," +
      "      AD_GETTAB_FROM_TABLE(AA.AD_TABLE_ID, AA.DOCBASETYPE, AA.AD_CLIENT_ID) AS TAB_ID  , '' as newStyle" +
      "      FROM " +
      "      (SELECT F.C_ACCTSCHEMA_ID AS SCHEMA_ID, SC.NAME AS SCHEMA_NAME, F.FACT_ACCT_GROUP_ID AS IDENTIFIER, F.DATEACCT," +
      "      F.ACCTVALUE AS VALUE, F.ACCTDESCRIPTION AS NAME, F.RECORD_ID AS ID, F.AD_TABLE_ID, F.DOCBASETYPE," +
      "      sum(F.AMTACCTDR) AS AMTACCTDR, sum(F.AMTACCTCR) AS AMTACCTCR, MIN(SEQNO) AS SEQNO, F.FACTACCTTYPE AS FACTACCTTYPE, F.AD_CLIENT_ID" +
      "      FROM FACT_ACCT F, C_ACCTSCHEMA SC " +
      "      WHERE F.AD_CLIENT_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ")" +
      "      AND F.AD_ORG_ID IN(";
    strSql = strSql + ((adUserOrg==null || adUserOrg.equals(""))?"":adUserOrg);
    strSql = strSql + 
      ")" +
      "      AND 1=1";
    strSql = strSql + ((table==null || table.equals(""))?"":"  AND f.ad_table_Id = ? ");
    strSql = strSql + ((record==null || record.equals(""))?"":"  AND f.record_Id = ? ");
    strSql = strSql + ((table==null || table.equals(""))?"":"  AND f.ad_table_ID = ? ");
    strSql = strSql + ((record==null || record.equals(""))?"":"  AND f.record_ID = ? ");
    strSql = strSql + 
      "      AND f.C_ACCTSCHEMA_ID = SC.C_ACCTSCHEMA_ID" +
      "      AND f.C_ACCTSCHEMA_ID = ?" +
      "      GROUP BY f.C_ACCTSCHEMA_ID, SC.NAME, F.AD_TABLE_ID, F.DATEACCT, F.ACCTDESCRIPTION,  F.ACCTVALUE, F.DOCBASETYPE, F.RECORD_ID, " +
      "      F.FACT_ACCT_GROUP_ID, F.ACCOUNT_ID,F.FACTACCTTYPE," +
      "      (CASE F.AMTACCTDR WHEN 0 THEN (CASE SIGN(F.AMTACCTCR) WHEN -1 THEN 1 ELSE 2 END) ELSE (CASE SIGN(F.AMTACCTDR) WHEN -1 THEN 3 ELSE 4 END) END), F.AD_CLIENT_ID" +
      "      HAVING (sum(F.AMTACCTDR) <> 0 OR sum(F.AMTACCTCR) <> 0)) AA" +
      "      LEFT JOIN (select * from AD_REF_LIST_V WHERE AD_REFERENCE_ID = '183'  AND AD_LANGUAGE=?) AR  ON AR.VALUE=AA.DOCBASETYPE " +
      "      ORDER BY SCHEMA_NAME, DATEACCT, FACTACCTTYPE2, IDENTIFIER, AA.AMTACCTDR DESC, AA.AMTACCTCR DESC, SEQNO";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      if (adUserClient != null && !(adUserClient.equals(""))) {
        }
      if (adUserOrg != null && !(adUserOrg.equals(""))) {
        }
      if (table != null && !(table.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, table);
      }
      if (record != null && !(record.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, record);
      }
      if (table != null && !(table.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, table);
      }
      if (record != null && !(record.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, record);
      }
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cAcctshemaId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);

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
        ReportGeneralLedgerJournalData objectReportGeneralLedgerJournalData = new ReportGeneralLedgerJournalData();
        objectReportGeneralLedgerJournalData.schemaId = UtilSql.getValue(result, "schema_id");
        objectReportGeneralLedgerJournalData.schemaName = UtilSql.getValue(result, "schema_name");
        objectReportGeneralLedgerJournalData.identifier = UtilSql.getValue(result, "identifier");
        objectReportGeneralLedgerJournalData.dateacct = UtilSql.getDateValue(result, "dateacct", "dd-MM-yyyy");
        objectReportGeneralLedgerJournalData.value = UtilSql.getValue(result, "value");
        objectReportGeneralLedgerJournalData.name = UtilSql.getValue(result, "name");
        objectReportGeneralLedgerJournalData.id = UtilSql.getValue(result, "id");
        objectReportGeneralLedgerJournalData.adTableId = UtilSql.getValue(result, "ad_table_id");
        objectReportGeneralLedgerJournalData.docbasetype = UtilSql.getValue(result, "docbasetype");
        objectReportGeneralLedgerJournalData.docname = UtilSql.getValue(result, "docname");
        objectReportGeneralLedgerJournalData.seqno = UtilSql.getValue(result, "seqno");
        objectReportGeneralLedgerJournalData.total = UtilSql.getValue(result, "total");
        objectReportGeneralLedgerJournalData.factaccttype2 = UtilSql.getValue(result, "factaccttype2");
        objectReportGeneralLedgerJournalData.amtacctdr = UtilSql.getValue(result, "amtacctdr");
        objectReportGeneralLedgerJournalData.amtacctcr = UtilSql.getValue(result, "amtacctcr");
        objectReportGeneralLedgerJournalData.tabId = UtilSql.getValue(result, "tab_id");
        objectReportGeneralLedgerJournalData.newstyle = UtilSql.getValue(result, "newstyle");
        objectReportGeneralLedgerJournalData.rownum = Long.toString(countRecord);
        objectReportGeneralLedgerJournalData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectReportGeneralLedgerJournalData);
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
    ReportGeneralLedgerJournalData objectReportGeneralLedgerJournalData[] = new ReportGeneralLedgerJournalData[vector.size()];
    vector.copyInto(objectReportGeneralLedgerJournalData);
    return(objectReportGeneralLedgerJournalData);
  }

  public static String selectCountDirect(ConnectionProvider connectionProvider, String adUserClient, String adUserOrg, String table, String record, String dateAcct, String factAcctGroupId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT COUNT(FACT_ACCT_GROUP_ID) AS TOTAL" +
      "        FROM (" +
      "        SELECT F.DATEACCT, F.FACT_ACCT_GROUP_ID  " +
      "        FROM  AD_TABLE T left join AD_TAB TB on T.AD_TABLE_ID = TB.AD_TABLE_ID" +
      "                         left join AD_COLUMN C  on T.AD_TABLE_ID = C.AD_TABLE_ID " +
      "                                               AND C.ISKEY = 'Y'" +
      "                         left join FACT_ACCT F on F.AD_TABLE_ID = T.AD_TABLE_ID" +
      "                         left join AD_WINDOW W on TB.AD_WINDOW_ID = W.AD_WINDOW_ID " +
      "        WHERE F.AD_CLIENT_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ")" +
      "        AND F.AD_ORG_ID IN(";
    strSql = strSql + ((adUserOrg==null || adUserOrg.equals(""))?"":adUserOrg);
    strSql = strSql + 
      ")" +
      "        AND 1=1";
    strSql = strSql + ((table==null || table.equals(""))?"":"  AND f.ad_table_Id = ? ");
    strSql = strSql + ((record==null || record.equals(""))?"":"  AND f.record_Id = ? ");
    strSql = strSql + 
      "        AND (CASE (SELECT MAX(ISSOTRX) FROM C_DOCTYPE D " +
      "        WHERE D.DOCBASETYPE = F.DOCBASETYPE) WHEN 'N' THEN COALESCE(T.PO_WINDOW_ID, T.AD_WINDOW_ID) ELSE T.AD_WINDOW_ID END) = W.AD_WINDOW_ID " +
      "        GROUP BY F.DATEACCT, F.FACT_ACCT_GROUP_ID) AA" +
      "        WHERE (DATEACCT< TO_DATE(?) OR (DATEACCT=to_date(?) AND FACT_ACCT_GROUP_ID < ?))";

    ResultSet result;
    String strReturn = "0";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      if (adUserClient != null && !(adUserClient.equals(""))) {
        }
      if (adUserOrg != null && !(adUserOrg.equals(""))) {
        }
      if (table != null && !(table.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, table);
      }
      if (record != null && !(record.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, record);
      }
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, factAcctGroupId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "total");
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

  public static ReportGeneralLedgerJournalData[] selectDirect2(ConnectionProvider connectionProvider, String adUserClient, String adUserOrg, String factAcctGroupId, String paramLanguage)    throws ServletException {
    return selectDirect2(connectionProvider, adUserClient, adUserOrg, factAcctGroupId, paramLanguage, 0, 0);
  }

  public static ReportGeneralLedgerJournalData[] selectDirect2(ConnectionProvider connectionProvider, String adUserClient, String adUserOrg, String factAcctGroupId, String paramLanguage, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT SCHEMA_ID, SCHEMA_NAME, IDENTIFIER, DATEACCT, AA.VALUE, AA.NAME, ID, AD_TABLE_ID, DOCBASETYPE,AR.NAME as DOCNAME, SEQNO, '' AS TOTAL,  (CASE FACTACCTTYPE WHEN 'O' THEN 1 WHEN 'N' THEN 2 WHEN 'R' THEN 3 ELSE 4 END) AS FACTACCTTYPE2," +
      "      (CASE AMTACCTDR WHEN 0 THEN NULL ELSE AMTACCTDR END) AS AMTACCTDR, (CASE AMTACCTCR WHEN 0 THEN NULL ELSE AMTACCTCR END) AS AMTACCTCR," +
      "      AD_GETTAB_FROM_TABLE(AA.AD_TABLE_ID, AA.DOCBASETYPE, AA.AD_CLIENT_ID) AS TAB_ID  , '' as newStyle" +
      "      FROM " +
      "      (SELECT F.C_ACCTSCHEMA_ID AS SCHEMA_ID, SC.NAME AS SCHEMA_NAME, F.FACT_ACCT_GROUP_ID AS IDENTIFIER, F.DATEACCT," +
      "      F.ACCTVALUE AS VALUE, F.ACCTDESCRIPTION AS NAME, F.RECORD_ID AS ID, F.AD_TABLE_ID, F.DOCBASETYPE," +
      "      sum(F.AMTACCTDR) AS AMTACCTDR, sum(F.AMTACCTCR) AS AMTACCTCR, MIN(SEQNO) AS SEQNO, F.FACTACCTTYPE AS FACTACCTTYPE, F.AD_CLIENT_ID" +
      "      FROM FACT_ACCT F, C_ACCTSCHEMA SC " +
      "      WHERE F.AD_CLIENT_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ")" +
      "      AND F.AD_ORG_ID IN(";
    strSql = strSql + ((adUserOrg==null || adUserOrg.equals(""))?"":adUserOrg);
    strSql = strSql + 
      ")" +
      "      AND f.C_ACCTSCHEMA_ID = SC.C_ACCTSCHEMA_ID" +
      "      AND F.Fact_Acct_Group_ID = ?" +
      "      GROUP BY f.C_ACCTSCHEMA_ID, SC.NAME, F.AD_TABLE_ID, F.DATEACCT, F.ACCTDESCRIPTION, F.ACCTVALUE, F.DOCBASETYPE, F.RECORD_ID, " +
      "      F.FACT_ACCT_GROUP_ID, F.ACCOUNT_ID,F.FACTACCTTYPE," +
      "      (CASE F.AMTACCTDR WHEN 0 THEN (CASE SIGN(F.AMTACCTCR) WHEN -1 THEN 1 ELSE 2 END) ELSE (CASE SIGN(F.AMTACCTDR) WHEN -1 THEN 3 ELSE 4 END) END), F.AD_CLIENT_ID" +
      "      HAVING (sum(F.AMTACCTDR) <> 0 OR sum(F.AMTACCTCR) <> 0)) AA" +
      "      LEFT JOIN (select * from AD_REF_LIST_V WHERE AD_REFERENCE_ID = '183'  AND AD_LANGUAGE=?) AR  ON AR.VALUE=AA.DOCBASETYPE " +
      "      ORDER BY SCHEMA_NAME, DATEACCT, FACTACCTTYPE2, IDENTIFIER, AA.AMTACCTDR DESC, AA.AMTACCTCR DESC, SEQNO";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      if (adUserClient != null && !(adUserClient.equals(""))) {
        }
      if (adUserOrg != null && !(adUserOrg.equals(""))) {
        }
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, factAcctGroupId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);

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
        ReportGeneralLedgerJournalData objectReportGeneralLedgerJournalData = new ReportGeneralLedgerJournalData();
        objectReportGeneralLedgerJournalData.schemaId = UtilSql.getValue(result, "schema_id");
        objectReportGeneralLedgerJournalData.schemaName = UtilSql.getValue(result, "schema_name");
        objectReportGeneralLedgerJournalData.identifier = UtilSql.getValue(result, "identifier");
        objectReportGeneralLedgerJournalData.dateacct = UtilSql.getDateValue(result, "dateacct", "dd-MM-yyyy");
        objectReportGeneralLedgerJournalData.value = UtilSql.getValue(result, "value");
        objectReportGeneralLedgerJournalData.name = UtilSql.getValue(result, "name");
        objectReportGeneralLedgerJournalData.id = UtilSql.getValue(result, "id");
        objectReportGeneralLedgerJournalData.adTableId = UtilSql.getValue(result, "ad_table_id");
        objectReportGeneralLedgerJournalData.docbasetype = UtilSql.getValue(result, "docbasetype");
        objectReportGeneralLedgerJournalData.docname = UtilSql.getValue(result, "docname");
        objectReportGeneralLedgerJournalData.seqno = UtilSql.getValue(result, "seqno");
        objectReportGeneralLedgerJournalData.total = UtilSql.getValue(result, "total");
        objectReportGeneralLedgerJournalData.factaccttype2 = UtilSql.getValue(result, "factaccttype2");
        objectReportGeneralLedgerJournalData.amtacctdr = UtilSql.getValue(result, "amtacctdr");
        objectReportGeneralLedgerJournalData.amtacctcr = UtilSql.getValue(result, "amtacctcr");
        objectReportGeneralLedgerJournalData.tabId = UtilSql.getValue(result, "tab_id");
        objectReportGeneralLedgerJournalData.newstyle = UtilSql.getValue(result, "newstyle");
        objectReportGeneralLedgerJournalData.rownum = Long.toString(countRecord);
        objectReportGeneralLedgerJournalData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectReportGeneralLedgerJournalData);
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
    ReportGeneralLedgerJournalData objectReportGeneralLedgerJournalData[] = new ReportGeneralLedgerJournalData[vector.size()];
    vector.copyInto(objectReportGeneralLedgerJournalData);
    return(objectReportGeneralLedgerJournalData);
  }

  public static String selectCountDirect2(ConnectionProvider connectionProvider, String adUserClient, String adUserOrg, String factAcctGroupId, String dateAcct, String identifier)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT COUNT(FACT_ACCT_GROUP_ID) AS TOTAL" +
      "        FROM (" +
      "        SELECT F.DATEACCT, F.FACT_ACCT_GROUP_ID  " +
      "        FROM AD_TABLE T left join AD_TAB TB    on T.AD_TABLE_ID = TB.AD_TABLE_ID" +
      "                        left join AD_COLUMN C  on T.AD_TABLE_ID = C.AD_TABLE_ID" +
      "                                              AND C.ISKEY = 'Y'" +
      "                        left join FACT_ACCT F  on F.AD_TABLE_ID = T.AD_TABLE_ID " +
      "                        left join AD_WINDOW W  on TB.AD_WINDOW_ID = W.AD_WINDOW_ID" +
      "        WHERE F.AD_CLIENT_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ")" +
      "        AND F.AD_ORG_ID IN(";
    strSql = strSql + ((adUserOrg==null || adUserOrg.equals(""))?"":adUserOrg);
    strSql = strSql + 
      ")" +
      "        AND 1=1" +
      "        and f.fact_acct_group_id = ?" +
      "        AND (CASE (SELECT MAX(ISSOTRX) FROM C_DOCTYPE D " +
      "        WHERE D.DOCBASETYPE = F.DOCBASETYPE) WHEN 'N' THEN COALESCE(T.PO_WINDOW_ID, T.AD_WINDOW_ID) ELSE T.AD_WINDOW_ID END) = W.AD_WINDOW_ID " +
      "        GROUP BY F.DATEACCT, F.FACT_ACCT_GROUP_ID) AA" +
      "        WHERE (DATEACCT< to_date(?) OR (DATEACCT=to_date(?) AND FACT_ACCT_GROUP_ID < ?))";

    ResultSet result;
    String strReturn = "0";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      if (adUserClient != null && !(adUserClient.equals(""))) {
        }
      if (adUserOrg != null && !(adUserOrg.equals(""))) {
        }
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, factAcctGroupId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, identifier);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "total");
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

  public static String selectCompany(ConnectionProvider connectionProvider, String client)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT NAME" +
      "        FROM AD_CLIENT" +
      "        WHERE AD_CLIENT_ID = ?";

    ResultSet result;
    String strReturn = "0";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, client);

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

  public static String selectOrg(ConnectionProvider connectionProvider, String orgId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT NAME" +
      "        FROM AD_ORG" +
      "        WHERE AD_ORG_ID = ?";

    ResultSet result;
    String strReturn = "0";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, orgId);

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

  public static String selectOrgTaxID(ConnectionProvider connectionProvider, String org)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT MIN(I.TAXID)" +
      "        FROM AD_ORGINFO I" +
      "        WHERE I.AD_ORG_ID = ?";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, org);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "min");
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
