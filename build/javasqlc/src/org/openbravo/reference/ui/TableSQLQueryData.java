//Sqlc generated V1.O00-1
package org.openbravo.reference.ui;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import java.util.*;

class TableSQLQueryData implements FieldProvider {
static Logger log4j = Logger.getLogger(TableSQLQueryData.class);
  private String InitRecordNumber="0";
  public String tablename;
  public String columnname;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("tablename"))
      return tablename;
    else if (fieldName.equalsIgnoreCase("columnname"))
      return columnname;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

/**
Name of the columns parent of the tab
 */
  public static TableSQLQueryData[] searchInfo(ConnectionProvider connectionProvider, String adReferenceValueId)    throws ServletException {
    return searchInfo(connectionProvider, adReferenceValueId, 0, 0);
  }

/**
Name of the columns parent of the tab
 */
  public static TableSQLQueryData[] searchInfo(ConnectionProvider connectionProvider, String adReferenceValueId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        select t.tablename, c.columnname " +
      "        from ad_ref_search rs, ad_table t, ad_column c" +
      "        where rs.ad_table_id = t.ad_table_id " +
      "        and rs.ad_column_id = c.ad_column_id" +
      "        and rs.ad_reference_id = ?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adReferenceValueId);

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
        TableSQLQueryData objectTableSQLQueryData = new TableSQLQueryData();
        objectTableSQLQueryData.tablename = UtilSql.getValue(result, "tablename");
        objectTableSQLQueryData.columnname = UtilSql.getValue(result, "columnname");
        objectTableSQLQueryData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectTableSQLQueryData);
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
    TableSQLQueryData objectTableSQLQueryData[] = new TableSQLQueryData[vector.size()];
    vector.copyInto(objectTableSQLQueryData);
    return(objectTableSQLQueryData);
  }
}
