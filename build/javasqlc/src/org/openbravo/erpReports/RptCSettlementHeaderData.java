//Sqlc generated V1.O00-1
package org.openbravo.erpReports;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import java.util.*;

class RptCSettlementHeaderData implements FieldProvider {
static Logger log4j = Logger.getLogger(RptCSettlementHeaderData.class);
  private String InitRecordNumber="0";
  public String documentno;
  public String datetrx;
  public String dateacct;
  public String entity;
  public String cif;
  public String nameBank;
  public String account;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("documentno"))
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
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static RptCSettlementHeaderData[] select(ConnectionProvider connectionProvider, String cSettlementId)    throws ServletException {
    return select(connectionProvider, cSettlementId, 0, 0);
  }

  public static RptCSettlementHeaderData[] select(ConnectionProvider connectionProvider, String cSettlementId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT CS.DOCUMENTNO, CS.DATETRX, CS.DATEACCT, AD_CLIENT.NAME AS ENTITY, AD_ORGINFO.TAXID AS CIF, C_BANK.NAME AS NAME_BANK, C_BANK.CODEBANK||' '||C_BANK.CODEBRANCH||' '||C_BANK.DIGITCONTROL||' '||C_BANKACCOUNT.CODEACCOUNT||' '||C_BANKACCOUNT.DIGITCONTROL AS ACCOUNT" +
      "        FROM C_SETTLEMENT CS, C_DEBT_PAYMENT_GENERATE CDG, C_BANKACCOUNT, C_BANK, C_BPARTNER, AD_CLIENT, AD_ORGINFO" +
      "        WHERE CS.C_SETTLEMENT_ID = CDG.C_SETTLEMENT_ID" +
      "        AND CDG.C_BPARTNER_ID = C_BPARTNER.C_BPARTNER_ID" +
      "        AND CDG.C_BANKACCOUNT_ID = C_BANKACCOUNT.C_BANKACCOUNT_ID" +
      "        AND C_BANKACCOUNT.C_BANK_ID = C_BANK.C_BANK_ID " +
      "        AND CS.AD_CLIENT_ID = AD_CLIENT.AD_CLIENT_ID" +
      "        AND CS.AD_ORG_ID = AD_ORGINFO.AD_ORG_ID" +
      "        AND CS.C_SETTLEMENT_ID = ?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cSettlementId);

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
        RptCSettlementHeaderData objectRptCSettlementHeaderData = new RptCSettlementHeaderData();
        objectRptCSettlementHeaderData.documentno = UtilSql.getValue(result, "documentno");
        objectRptCSettlementHeaderData.datetrx = UtilSql.getDateValue(result, "datetrx", "dd-MM-yyyy");
        objectRptCSettlementHeaderData.dateacct = UtilSql.getDateValue(result, "dateacct", "dd-MM-yyyy");
        objectRptCSettlementHeaderData.entity = UtilSql.getValue(result, "entity");
        objectRptCSettlementHeaderData.cif = UtilSql.getValue(result, "cif");
        objectRptCSettlementHeaderData.nameBank = UtilSql.getValue(result, "name_bank");
        objectRptCSettlementHeaderData.account = UtilSql.getValue(result, "account");
        objectRptCSettlementHeaderData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectRptCSettlementHeaderData);
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
    RptCSettlementHeaderData objectRptCSettlementHeaderData[] = new RptCSettlementHeaderData[vector.size()];
    vector.copyInto(objectRptCSettlementHeaderData);
    return(objectRptCSettlementHeaderData);
  }

  public static RptCSettlementHeaderData[] set()    throws ServletException {
    RptCSettlementHeaderData objectRptCSettlementHeaderData[] = new RptCSettlementHeaderData[1];
    objectRptCSettlementHeaderData[0] = new RptCSettlementHeaderData();
    objectRptCSettlementHeaderData[0].documentno = "";
    objectRptCSettlementHeaderData[0].datetrx = "";
    objectRptCSettlementHeaderData[0].dateacct = "";
    objectRptCSettlementHeaderData[0].entity = "";
    objectRptCSettlementHeaderData[0].cif = "";
    objectRptCSettlementHeaderData[0].nameBank = "";
    objectRptCSettlementHeaderData[0].account = "";
    return objectRptCSettlementHeaderData;
  }
}
