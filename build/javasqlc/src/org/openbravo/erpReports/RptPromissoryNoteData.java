//Sqlc generated V1.O00-1
package org.openbravo.erpReports;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import java.util.*;

class RptPromissoryNoteData implements FieldProvider {
static Logger log4j = Logger.getLogger(RptPromissoryNoteData.class);
  private String InitRecordNumber="0";
  public String cDebtPaymentId;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("c_debt_payment_id") || fieldName.equals("cDebtPaymentId"))
      return cDebtPaymentId;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static RptPromissoryNoteData[] select(ConnectionProvider connectionProvider, String adOrgId, String adClientId, String cDebtPaymenntId)    throws ServletException {
    return select(connectionProvider, adOrgId, adClientId, cDebtPaymenntId, 0, 0);
  }

  public static RptPromissoryNoteData[] select(ConnectionProvider connectionProvider, String adOrgId, String adClientId, String cDebtPaymenntId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      	  SELECT DISTINCT C_DEBT_PAYMENT_ID" +
      "          FROM C_DEBT_PAYMENT_GENERATE" +
      "          WHERE C_DEBT_PAYMENT_GENERATE.AD_ORG_ID IN (";
    strSql = strSql + ((adOrgId==null || adOrgId.equals(""))?"":adOrgId);
    strSql = strSql + 
      ")" +
      "          AND C_DEBT_PAYMENT_GENERATE.AD_CLIENT_ID IN (";
    strSql = strSql + ((adClientId==null || adClientId.equals(""))?"":adClientId);
    strSql = strSql + 
      ")" +
      "          AND 1=1";
    strSql = strSql + ((cDebtPaymenntId==null || cDebtPaymenntId.equals(""))?"":"  AND C_DEBT_PAYMENT_GENERATE.C_DEBT_PAYMENT_ID IN" + cDebtPaymenntId);

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    try {
    st = connectionProvider.getPreparedStatement(strSql);
      if (adOrgId != null && !(adOrgId.equals(""))) {
        }
      if (adClientId != null && !(adClientId.equals(""))) {
        }
      if (cDebtPaymenntId != null && !(cDebtPaymenntId.equals(""))) {
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
        RptPromissoryNoteData objectRptPromissoryNoteData = new RptPromissoryNoteData();
        objectRptPromissoryNoteData.cDebtPaymentId = UtilSql.getValue(result, "c_debt_payment_id");
        objectRptPromissoryNoteData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectRptPromissoryNoteData);
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
    RptPromissoryNoteData objectRptPromissoryNoteData[] = new RptPromissoryNoteData[vector.size()];
    vector.copyInto(objectRptPromissoryNoteData);
    return(objectRptPromissoryNoteData);
  }

  public static RptPromissoryNoteData[] selectDebtPayment(ConnectionProvider connectionProvider, String adOrgId, String adClientId, String cDebtPaymenntId)    throws ServletException {
    return selectDebtPayment(connectionProvider, adOrgId, adClientId, cDebtPaymenntId, 0, 0);
  }

  public static RptPromissoryNoteData[] selectDebtPayment(ConnectionProvider connectionProvider, String adOrgId, String adClientId, String cDebtPaymenntId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      	  SELECT DISTINCT C_DEBT_PAYMENT_ID" +
      "          FROM C_DEBT_PAYMENT" +
      "          WHERE C_DEBT_PAYMENT.AD_ORG_ID IN (";
    strSql = strSql + ((adOrgId==null || adOrgId.equals(""))?"":adOrgId);
    strSql = strSql + 
      ")" +
      "          AND C_DEBT_PAYMENT.AD_CLIENT_ID IN (";
    strSql = strSql + ((adClientId==null || adClientId.equals(""))?"":adClientId);
    strSql = strSql + 
      ")" +
      "          AND 1=1";
    strSql = strSql + ((cDebtPaymenntId==null || cDebtPaymenntId.equals(""))?"":"  AND C_DEBT_PAYMENT.C_DEBT_PAYMENT_ID IN" + cDebtPaymenntId);

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    try {
    st = connectionProvider.getPreparedStatement(strSql);
      if (adOrgId != null && !(adOrgId.equals(""))) {
        }
      if (adClientId != null && !(adClientId.equals(""))) {
        }
      if (cDebtPaymenntId != null && !(cDebtPaymenntId.equals(""))) {
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
        RptPromissoryNoteData objectRptPromissoryNoteData = new RptPromissoryNoteData();
        objectRptPromissoryNoteData.cDebtPaymentId = UtilSql.getValue(result, "c_debt_payment_id");
        objectRptPromissoryNoteData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectRptPromissoryNoteData);
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
    RptPromissoryNoteData objectRptPromissoryNoteData[] = new RptPromissoryNoteData[vector.size()];
    vector.copyInto(objectRptPromissoryNoteData);
    return(objectRptPromissoryNoteData);
  }
}
