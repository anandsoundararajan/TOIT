//Sqlc generated V1.O00-1
package org.openbravo.erpCommon.ad_forms;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import java.util.*;

class SQLExecutorData implements FieldProvider {
static Logger log4j = Logger.getLogger(SQLExecutorData.class);
  private String InitRecordNumber="0";
  public String header;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("header"))
      return header;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static SQLExecutorData[] select(ConnectionProvider connectionProvider)    throws ServletException {
    return select(connectionProvider, 0, 0);
  }

  public static SQLExecutorData[] select(ConnectionProvider connectionProvider, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      select 1 as header from dual";

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
        SQLExecutorData objectSQLExecutorData = new SQLExecutorData();
        objectSQLExecutorData.header = UtilSql.getValue(result, "header");
        objectSQLExecutorData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectSQLExecutorData);
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
    SQLExecutorData objectSQLExecutorData[] = new SQLExecutorData[vector.size()];
    vector.copyInto(objectSQLExecutorData);
    return(objectSQLExecutorData);
  }

  public static SQLExecutorData[] set()    throws ServletException {
    SQLExecutorData objectSQLExecutorData[] = new SQLExecutorData[1];
    objectSQLExecutorData[0] = new SQLExecutorData();
    objectSQLExecutorData[0].header = "";
    return objectSQLExecutorData;
  }
}
