//Sqlc generated V1.O00-1
package org.openbravo.erpCommon.ad_process;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import java.util.*;

class PrintInvoicesData implements FieldProvider {
static Logger log4j = Logger.getLogger(PrintInvoicesData.class);
  private String InitRecordNumber="0";
  public String help;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("help"))
      return help;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static PrintInvoicesData[] select(ConnectionProvider connectionProvider)    throws ServletException {
    return select(connectionProvider, 0, 0);
  }

  public static PrintInvoicesData[] select(ConnectionProvider connectionProvider, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT 1 AS HELP FROM DUAL";

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
        PrintInvoicesData objectPrintInvoicesData = new PrintInvoicesData();
        objectPrintInvoicesData.help = UtilSql.getValue(result, "help");
        objectPrintInvoicesData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectPrintInvoicesData);
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
    PrintInvoicesData objectPrintInvoicesData[] = new PrintInvoicesData[vector.size()];
    vector.copyInto(objectPrintInvoicesData);
    return(objectPrintInvoicesData);
  }

  public static String selectHelp(ConnectionProvider connectionProvider, String adProcessId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT HELP" +
      "      FROM AD_PROCESS" +
      "      WHERE AD_PROCESS_ID = ?";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adProcessId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "help");
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

  public static PrintInvoicesData[] set()    throws ServletException {
    PrintInvoicesData objectPrintInvoicesData[] = new PrintInvoicesData[1];
    objectPrintInvoicesData[0] = new PrintInvoicesData();
    objectPrintInvoicesData[0].help = "";
    return objectPrintInvoicesData;
  }
}
