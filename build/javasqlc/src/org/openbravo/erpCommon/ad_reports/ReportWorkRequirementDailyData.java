//Sqlc generated V1.O00-1
package org.openbravo.erpCommon.ad_reports;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import java.util.*;

class ReportWorkRequirementDailyData implements FieldProvider {
static Logger log4j = Logger.getLogger(ReportWorkRequirementDailyData.class);
  private String InitRecordNumber="0";
  public String wrid;
  public String startdate;
  public String enddate;
  public String wrpid;
  public String quantity;
  public String wrpname;
  public String processplan;
  public String process;
  public String needqty;
  public String seqno;
  public String negative;
  public String inprocess;
  public String description;
  public String prodproduct;
  public String name;
  public String docno;
  public String wrname;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("wrid"))
      return wrid;
    else if (fieldName.equalsIgnoreCase("startdate"))
      return startdate;
    else if (fieldName.equalsIgnoreCase("enddate"))
      return enddate;
    else if (fieldName.equalsIgnoreCase("wrpid"))
      return wrpid;
    else if (fieldName.equalsIgnoreCase("quantity"))
      return quantity;
    else if (fieldName.equalsIgnoreCase("wrpname"))
      return wrpname;
    else if (fieldName.equalsIgnoreCase("processplan"))
      return processplan;
    else if (fieldName.equalsIgnoreCase("process"))
      return process;
    else if (fieldName.equalsIgnoreCase("needqty"))
      return needqty;
    else if (fieldName.equalsIgnoreCase("seqno"))
      return seqno;
    else if (fieldName.equalsIgnoreCase("negative"))
      return negative;
    else if (fieldName.equalsIgnoreCase("inprocess"))
      return inprocess;
    else if (fieldName.equalsIgnoreCase("description"))
      return description;
    else if (fieldName.equalsIgnoreCase("prodproduct"))
      return prodproduct;
    else if (fieldName.equalsIgnoreCase("name"))
      return name;
    else if (fieldName.equalsIgnoreCase("docno"))
      return docno;
    else if (fieldName.equalsIgnoreCase("wrname"))
      return wrname;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static ReportWorkRequirementDailyData[] select(ConnectionProvider connectionProvider, String language, String adUserClient, String adUserOrg, String parStartDateFrom, String parStartDateTo, String parProcessPlan)    throws ServletException {
    return select(connectionProvider, language, adUserClient, adUserOrg, parStartDateFrom, parStartDateTo, parProcessPlan, 0, 0);
  }

  public static ReportWorkRequirementDailyData[] select(ConnectionProvider connectionProvider, String language, String adUserClient, String adUserOrg, String parStartDateFrom, String parStartDateTo, String parProcessPlan, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT wr.MA_WorkRequirement_ID AS wrid, wr.STARTDATE AS startdate, wr.ENDDATE AS enddate, " +
      "      wrp.MA_WRPhase_ID AS wrpid, COALESCE(wr.CONVERSIONRATE,1)*wrp.DONEQUANTITY AS quantity, " +
      "      AD_COLUMN_IDENTIFIER('MA_WRPHASE', to_char(wrp.MA_WRPhase_ID),?) AS WRPNAME," +
      "      AD_COLUMN_IDENTIFIER('MA_PROCESSPLAN', to_char(ppv.MA_PROCESSPLAN_ID),?) AS PROCESSPLAN," +
      "      AD_COLUMN_IDENTIFIER('MA_PROCESS', to_char(wrp.MA_PROCESS_ID), ?) AS PROCESS," +
      "      COALESCE(wr.CONVERSIONRATE,1)*(wrp.QUANTITY-wrp.DONEQUANTITY) AS needqty, " +
      "      wrp.SeqNO, 'Bordes' AS negative," +
      "        '123' AS inprocess, s.description AS description,'product' AS prodproduct,'' AS name, wr.DocumentNo as docno," +
      "        AD_COLUMN_IDENTIFIER('MA_WORKREQUIREMENT', to_char(wr.MA_WORKREQUIREMENT_ID), ?) AS WRNAME" +
      "      FROM MA_WorkRequirement wr, MA_WRPhase wrp," +
      "        MA_Sequence s, MA_ProcessPlan_Version ppv" +
      "      WHERE wr.MA_WORKREQUIREMENT_ID = wrp.MA_WORKREQUIREMENT_ID" +
      "        AND s.MA_ProcessPlan_Version_ID = ppv.MA_ProcessPlan_Version_ID" +
      "        AND s.MA_Sequence_ID = wrp.MA_Sequence_ID" +
      "        AND ppv.datefrom <= wr.startdate" +
      "        AND ppv.dateto > wr.startdate" +
      "        AND wrp.CLOSED = 'N'" +
      "        AND wr.AD_CLIENT_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ")" +
      "        AND wr.AD_ORG_ID IN (";
    strSql = strSql + ((adUserOrg==null || adUserOrg.equals(""))?"":adUserOrg);
    strSql = strSql + 
      ")" +
      "        AND 1=1";
    strSql = strSql + ((parStartDateFrom==null || parStartDateFrom.equals(""))?"":" AND wr.STARTDATE >= TO_DATE(?) ");
    strSql = strSql + ((parStartDateTo==null || parStartDateTo.equals(""))?"":" AND wr.STARTDATE <= TO_DATE(?) ");
    strSql = strSql + ((parProcessPlan==null || parProcessPlan.equals(""))?"":" AND ppv.MA_ProcessPlan_id = ? ");
    strSql = strSql + 
      "      ORDER BY enddate, wr.DocumentNo, wr.MA_WorkRequirement_ID, wrp.SeqNo, wrp.MA_WRPhase_ID";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, language);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, language);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, language);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, language);
      if (adUserClient != null && !(adUserClient.equals(""))) {
        }
      if (adUserOrg != null && !(adUserOrg.equals(""))) {
        }
      if (parStartDateFrom != null && !(parStartDateFrom.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, parStartDateFrom);
      }
      if (parStartDateTo != null && !(parStartDateTo.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, parStartDateTo);
      }
      if (parProcessPlan != null && !(parProcessPlan.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, parProcessPlan);
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
        ReportWorkRequirementDailyData objectReportWorkRequirementDailyData = new ReportWorkRequirementDailyData();
        objectReportWorkRequirementDailyData.wrid = UtilSql.getValue(result, "wrid");
        objectReportWorkRequirementDailyData.startdate = UtilSql.getDateValue(result, "startdate", "dd-MM-yyyy");
        objectReportWorkRequirementDailyData.enddate = UtilSql.getDateValue(result, "enddate", "dd-MM-yyyy");
        objectReportWorkRequirementDailyData.wrpid = UtilSql.getValue(result, "wrpid");
        objectReportWorkRequirementDailyData.quantity = UtilSql.getValue(result, "quantity");
        objectReportWorkRequirementDailyData.wrpname = UtilSql.getValue(result, "wrpname");
        objectReportWorkRequirementDailyData.processplan = UtilSql.getValue(result, "processplan");
        objectReportWorkRequirementDailyData.process = UtilSql.getValue(result, "process");
        objectReportWorkRequirementDailyData.needqty = UtilSql.getValue(result, "needqty");
        objectReportWorkRequirementDailyData.seqno = UtilSql.getValue(result, "seqno");
        objectReportWorkRequirementDailyData.negative = UtilSql.getValue(result, "negative");
        objectReportWorkRequirementDailyData.inprocess = UtilSql.getValue(result, "inprocess");
        objectReportWorkRequirementDailyData.description = UtilSql.getValue(result, "description");
        objectReportWorkRequirementDailyData.prodproduct = UtilSql.getValue(result, "prodproduct");
        objectReportWorkRequirementDailyData.name = UtilSql.getValue(result, "name");
        objectReportWorkRequirementDailyData.docno = UtilSql.getValue(result, "docno");
        objectReportWorkRequirementDailyData.wrname = UtilSql.getValue(result, "wrname");
        objectReportWorkRequirementDailyData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectReportWorkRequirementDailyData);
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
    ReportWorkRequirementDailyData objectReportWorkRequirementDailyData[] = new ReportWorkRequirementDailyData[vector.size()];
    vector.copyInto(objectReportWorkRequirementDailyData);
    return(objectReportWorkRequirementDailyData);
  }

  public static ReportWorkRequirementDailyData[] set()    throws ServletException {
    ReportWorkRequirementDailyData objectReportWorkRequirementDailyData[] = new ReportWorkRequirementDailyData[1];
    objectReportWorkRequirementDailyData[0] = new ReportWorkRequirementDailyData();
    objectReportWorkRequirementDailyData[0].wrid = "";
    objectReportWorkRequirementDailyData[0].startdate = "";
    objectReportWorkRequirementDailyData[0].enddate = "";
    objectReportWorkRequirementDailyData[0].wrpid = "";
    objectReportWorkRequirementDailyData[0].quantity = "";
    objectReportWorkRequirementDailyData[0].wrpname = "";
    objectReportWorkRequirementDailyData[0].processplan = "";
    objectReportWorkRequirementDailyData[0].process = "";
    objectReportWorkRequirementDailyData[0].needqty = "";
    objectReportWorkRequirementDailyData[0].seqno = "";
    objectReportWorkRequirementDailyData[0].negative = "";
    objectReportWorkRequirementDailyData[0].inprocess = "";
    objectReportWorkRequirementDailyData[0].description = "";
    objectReportWorkRequirementDailyData[0].prodproduct = "";
    objectReportWorkRequirementDailyData[0].name = "";
    objectReportWorkRequirementDailyData[0].docno = "";
    objectReportWorkRequirementDailyData[0].wrname = "";
    return objectReportWorkRequirementDailyData;
  }
}
