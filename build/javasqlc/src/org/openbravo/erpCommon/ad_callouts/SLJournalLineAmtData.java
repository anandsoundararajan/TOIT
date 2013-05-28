//Sqlc generated V1.O00-1
package org.openbravo.erpCommon.ad_callouts;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import java.util.*;

class SLJournalLineAmtData implements FieldProvider {
static Logger log4j = Logger.getLogger(SLJournalLineAmtData.class);
  private String InitRecordNumber="0";
  public String cCurrencyId;
  public String stdprecision;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("c_currency_id") || fieldName.equals("cCurrencyId"))
      return cCurrencyId;
    else if (fieldName.equalsIgnoreCase("stdprecision"))
      return stdprecision;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static SLJournalLineAmtData[] select(ConnectionProvider connectionProvider, String cAcctSchemaId)    throws ServletException {
    return select(connectionProvider, cAcctSchemaId, 0, 0);
  }

  public static SLJournalLineAmtData[] select(ConnectionProvider connectionProvider, String cAcctSchemaId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "	SELECT c.C_Currency_ID, c.StdPrecision " +
      "	FROM C_AcctSchema a, C_Currency c " +
      "	WHERE a.C_Currency_ID=c.C_Currency_ID " +
      "	AND a.C_AcctSchema_ID = ?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cAcctSchemaId);

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
        SLJournalLineAmtData objectSLJournalLineAmtData = new SLJournalLineAmtData();
        objectSLJournalLineAmtData.cCurrencyId = UtilSql.getValue(result, "c_currency_id");
        objectSLJournalLineAmtData.stdprecision = UtilSql.getValue(result, "stdprecision");
        objectSLJournalLineAmtData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectSLJournalLineAmtData);
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
    SLJournalLineAmtData objectSLJournalLineAmtData[] = new SLJournalLineAmtData[vector.size()];
    vector.copyInto(objectSLJournalLineAmtData);
    return(objectSLJournalLineAmtData);
  }

  public static String currencyRate(ConnectionProvider connectionProvider, String cCurrencyId, String targetCurrencyId, String DateAcct, String currencyRateType, String adCientId, String adOrgId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      select c_currency_rate(?, ?, TO_DATE(?), ?, ?, ?) from dual";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCurrencyId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, targetCurrencyId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, DateAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, currencyRateType);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adCientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "c_currency_rate");
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

  public static String currencyRate2(ConnectionProvider connectionProvider, String GLJournalId, String cCurrencyId, String currencyRateType)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "	SELECT CurrencyRate " +
      "	FROM GL_Journal " +
      "	WHERE GL_Journal_ID=? " +
      "	AND C_Currency_ID=? " +
      "	AND CurrencyRateType=?";

    ResultSet result;
    String strReturn = "1";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, GLJournalId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCurrencyId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, currencyRateType);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "currencyrate");
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

  public static String selectGeneralLedger(ConnectionProvider connectionProvider, String GLJournalId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "	select c_acctschema_id from gl_journal" +
      "	where gl_journal.gl_journal_id=?";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, GLJournalId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "c_acctschema_id");
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
