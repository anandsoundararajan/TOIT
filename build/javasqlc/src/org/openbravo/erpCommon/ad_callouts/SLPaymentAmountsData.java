//Sqlc generated V1.O00-1
package org.openbravo.erpCommon.ad_callouts;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import java.util.*;

class SLPaymentAmountsData implements FieldProvider {
static Logger log4j = Logger.getLogger(SLPaymentAmountsData.class);
  private String InitRecordNumber="0";
  public String grand;
  public String currencyid;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("grand"))
      return grand;
    else if (fieldName.equalsIgnoreCase("currencyid"))
      return currencyid;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static SLPaymentAmountsData[] select(ConnectionProvider connectionProvider, String cInvoiceId)    throws ServletException {
    return select(connectionProvider, cInvoiceId, 0, 0);
  }

  public static SLPaymentAmountsData[] select(ConnectionProvider connectionProvider, String cInvoiceId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT C_INVOICE.GRANDTOTAL AS GRAND, C_CURRENCY.C_CURRENCY_ID as CURRENCYID" +
      "        FROM C_INVOICE, C_CURRENCY" +
      "        WHERE C_INVOICE.C_CURRENCY_ID = C_CURRENCY.C_CURRENCY_ID" +
      "        AND C_INVOICE.C_INVOICE_ID = ?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cInvoiceId);

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
        SLPaymentAmountsData objectSLPaymentAmountsData = new SLPaymentAmountsData();
        objectSLPaymentAmountsData.grand = UtilSql.getValue(result, "grand");
        objectSLPaymentAmountsData.currencyid = UtilSql.getValue(result, "currencyid");
        objectSLPaymentAmountsData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectSLPaymentAmountsData);
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
    SLPaymentAmountsData objectSLPaymentAmountsData[] = new SLPaymentAmountsData[vector.size()];
    vector.copyInto(objectSLPaymentAmountsData);
    return(objectSLPaymentAmountsData);
  }

  public static String selectCurrency(ConnectionProvider connectionProvider, String cCurrencyId, String cCurrencyIdTo)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT C_CONVERSION_RATE.MULTIPLYRATE " +
      "        FROM C_CONVERSION_RATE" +
      "        WHERE C_CONVERSION_RATE.C_CURRENCY_ID = ?" +
      "        AND C_CONVERSION_RATE.C_CURRENCY_ID_TO = ?";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCurrencyId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCurrencyIdTo);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "multiplyrate");
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

  public static String selectConversion(ConnectionProvider connectionProvider, String cCurrencyId, String cCurrencyIdTo, String cConvDate, String cRateType, String adClientId, String adOrgId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT C_CURRENCY_RATE(?,?,TO_DATE(?),TO_CHAR(?),?,?) AS TOTAL FROM DUAL";

    ResultSet result;
    String strReturn = "0";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCurrencyId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCurrencyIdTo);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cConvDate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cRateType);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);

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
}
