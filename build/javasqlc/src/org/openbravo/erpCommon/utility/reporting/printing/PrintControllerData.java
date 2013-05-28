//Sqlc generated V1.O00-1
package org.openbravo.erpCommon.utility.reporting.printing;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import java.util.*;

class PrintControllerData implements FieldProvider {
static Logger log4j = Logger.getLogger(PrintControllerData.class);
  private String InitRecordNumber="0";
  public String id;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("id"))
      return id;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static PrintControllerData[] selectInvoices(ConnectionProvider connectionProvider, String Id)    throws ServletException {
    return selectInvoices(connectionProvider, Id, 0, 0);
  }

  public static PrintControllerData[] selectInvoices(ConnectionProvider connectionProvider, String Id, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "            SELECT C_Invoice_ID as ID" +
      "            FROM C_Invoice" +
      "            WHERE C_Invoice_ID IN (";
    strSql = strSql + ((Id==null || Id.equals(""))?"":Id);
    strSql = strSql + 
      ")" +
      "            ORDER BY DocumentNo ASC";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    try {
    st = connectionProvider.getPreparedStatement(strSql);
      if (Id != null && !(Id.equals(""))) {
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
        PrintControllerData objectPrintControllerData = new PrintControllerData();
        objectPrintControllerData.id = UtilSql.getValue(result, "id");
        objectPrintControllerData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectPrintControllerData);
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
    PrintControllerData objectPrintControllerData[] = new PrintControllerData[vector.size()];
    vector.copyInto(objectPrintControllerData);
    return(objectPrintControllerData);
  }

  public static PrintControllerData[] selectOrders(ConnectionProvider connectionProvider, String Id)    throws ServletException {
    return selectOrders(connectionProvider, Id, 0, 0);
  }

  public static PrintControllerData[] selectOrders(ConnectionProvider connectionProvider, String Id, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "            SELECT C_Order_ID as ID" +
      "            FROM C_Order" +
      "            WHERE C_Order_ID IN (";
    strSql = strSql + ((Id==null || Id.equals(""))?"":Id);
    strSql = strSql + 
      ")" +
      "            ORDER BY DocumentNo ASC";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    try {
    st = connectionProvider.getPreparedStatement(strSql);
      if (Id != null && !(Id.equals(""))) {
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
        PrintControllerData objectPrintControllerData = new PrintControllerData();
        objectPrintControllerData.id = UtilSql.getValue(result, "id");
        objectPrintControllerData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectPrintControllerData);
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
    PrintControllerData objectPrintControllerData[] = new PrintControllerData[vector.size()];
    vector.copyInto(objectPrintControllerData);
    return(objectPrintControllerData);
  }

  public static PrintControllerData[] selectPayments(ConnectionProvider connectionProvider, String Id)    throws ServletException {
    return selectPayments(connectionProvider, Id, 0, 0);
  }

  public static PrintControllerData[] selectPayments(ConnectionProvider connectionProvider, String Id, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "            SELECT fin_payment_id as ID" +
      "            FROM fin_payment" +
      "            WHERE fin_payment_id IN (";
    strSql = strSql + ((Id==null || Id.equals(""))?"":Id);
    strSql = strSql + 
      ")" +
      "            ORDER BY documentno ASC";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    try {
    st = connectionProvider.getPreparedStatement(strSql);
      if (Id != null && !(Id.equals(""))) {
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
        PrintControllerData objectPrintControllerData = new PrintControllerData();
        objectPrintControllerData.id = UtilSql.getValue(result, "id");
        objectPrintControllerData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectPrintControllerData);
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
    PrintControllerData objectPrintControllerData[] = new PrintControllerData[vector.size()];
    vector.copyInto(objectPrintControllerData);
    return(objectPrintControllerData);
  }
}
