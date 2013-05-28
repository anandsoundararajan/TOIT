//Sqlc generated V1.O00-1
package org.openbravo.erpReports;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import java.util.*;

class RptCRemittanceData implements FieldProvider {
static Logger log4j = Logger.getLogger(RptCRemittanceData.class);
  private String InitRecordNumber="0";
  public String cRemittanceId;
  public String documentno;
  public String datetrx;
  public String dateacct;
  public String entity;
  public String cif;
  public String nameBank;
  public String account;
  public String name;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("c_remittance_id") || fieldName.equals("cRemittanceId"))
      return cRemittanceId;
    else if (fieldName.equalsIgnoreCase("documentno"))
      return documentno;
    else if (fieldName.equalsIgnoreCase("datetrx"))
      return datetrx;
    else if (fieldName.equalsIgnoreCase("dateacct"))
      return dateacct;
    else if (fieldName.equalsIgnoreCase("entity"))
      return entity;
    else if (fieldName.equalsIgnoreCase("cif"))
      return cif;
    else if (fieldName.equalsIgnoreCase("name_bank") || fieldName.equals("nameBank"))
      return nameBank;
    else if (fieldName.equalsIgnoreCase("account"))
      return account;
    else if (fieldName.equalsIgnoreCase("name"))
      return name;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static RptCRemittanceData[] select(ConnectionProvider connectionProvider, String adUserClient, String adUserOrg, String cRemittanceId)    throws ServletException {
    return select(connectionProvider, adUserClient, adUserOrg, cRemittanceId, 0, 0);
  }

  public static RptCRemittanceData[] select(ConnectionProvider connectionProvider, String adUserClient, String adUserOrg, String cRemittanceId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT distinct CS.C_REMITTANCE_ID, CS.DOCUMENTNO, CS.DATETRX, CS.DUEDATE AS dateacct, AD_CLIENT.NAME AS ENTITY, AD_ORGINFO.TAXID AS CIF, C_BANK.NAME AS NAME_BANK, " +
      "        C_BANK.CODEBANK||' '||C_BANK.CODEBRANCH||' '||C_BANK.DIGITCONTROL||' '||C_BANKACCOUNT.DIGITCONTROL||' '||C_BANKACCOUNT.CODEACCOUNT AS ACCOUNT, CS.NAME" +
      "      FROM C_REMITTANCE CS left join C_REMITTANCELINE RL on CS.C_REMITTANCE_ID = RL.C_REMITTANCE_ID" +
      "                           left join C_DEBT_PAYMENT CDG on RL.C_DEBT_PAYMENT_ID = CDG.C_DEBT_PAYMENT_ID" +
      "                           left join C_BPARTNER on CDG.C_BPARTNER_ID = C_BPARTNER.C_BPARTNER_ID" +
      "                           left join C_BANKACCOUNT on CS.C_BANKACCOUNT_ID = C_BANKACCOUNT.C_BANKACCOUNT_ID" +
      "                           left join C_BANK on C_BANKACCOUNT.C_BANK_ID = C_BANK.C_BANK_ID," +
      "           AD_CLIENT, AD_ORGINFO" +
      "      WHERE CS.AD_CLIENT_ID = AD_CLIENT.AD_CLIENT_ID" +
      "        AND CS.AD_ORG_ID = AD_ORGINFO.AD_ORG_ID " +
      "        and cs.AD_CLIENT_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ")" +
      "        AND cs.AD_ORG_ID IN (";
    strSql = strSql + ((adUserOrg==null || adUserOrg.equals(""))?"":adUserOrg);
    strSql = strSql + 
      ")" +
      "        AND 1=1";
    strSql = strSql + ((cRemittanceId==null || cRemittanceId.equals(""))?"":"           AND cs.C_REMITTANCE_ID IN          " + cRemittanceId);
    strSql = strSql + 
      "      ORDER BY cs.DOCUMENTNO";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    try {
    st = connectionProvider.getPreparedStatement(strSql);
      if (adUserClient != null && !(adUserClient.equals(""))) {
        }
      if (adUserOrg != null && !(adUserOrg.equals(""))) {
        }
      if (cRemittanceId != null && !(cRemittanceId.equals(""))) {
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
        RptCRemittanceData objectRptCRemittanceData = new RptCRemittanceData();
        objectRptCRemittanceData.cRemittanceId = UtilSql.getValue(result, "c_remittance_id");
        objectRptCRemittanceData.documentno = UtilSql.getValue(result, "documentno");
        objectRptCRemittanceData.datetrx = UtilSql.getDateValue(result, "datetrx", "dd-MM-yyyy");
        objectRptCRemittanceData.dateacct = UtilSql.getDateValue(result, "dateacct", "dd-MM-yyyy");
        objectRptCRemittanceData.entity = UtilSql.getValue(result, "entity");
        objectRptCRemittanceData.cif = UtilSql.getValue(result, "cif");
        objectRptCRemittanceData.nameBank = UtilSql.getValue(result, "name_bank");
        objectRptCRemittanceData.account = UtilSql.getValue(result, "account");
        objectRptCRemittanceData.name = UtilSql.getValue(result, "name");
        objectRptCRemittanceData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectRptCRemittanceData);
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
    RptCRemittanceData objectRptCRemittanceData[] = new RptCRemittanceData[vector.size()];
    vector.copyInto(objectRptCRemittanceData);
    return(objectRptCRemittanceData);
  }

  public static RptCRemittanceData[] set()    throws ServletException {
    RptCRemittanceData objectRptCRemittanceData[] = new RptCRemittanceData[1];
    objectRptCRemittanceData[0] = new RptCRemittanceData();
    objectRptCRemittanceData[0].cRemittanceId = "";
    objectRptCRemittanceData[0].documentno = "";
    objectRptCRemittanceData[0].datetrx = "";
    objectRptCRemittanceData[0].dateacct = "";
    objectRptCRemittanceData[0].entity = "";
    objectRptCRemittanceData[0].cif = "";
    objectRptCRemittanceData[0].nameBank = "";
    objectRptCRemittanceData[0].account = "";
    objectRptCRemittanceData[0].name = "";
    return objectRptCRemittanceData;
  }
}
