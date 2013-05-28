//Sqlc generated V1.O00-1
package org.openbravo.erpCommon.ad_callouts;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import java.util.*;

class SLMInOutTraceReportsData implements FieldProvider {
static Logger log4j = Logger.getLogger(SLMInOutTraceReportsData.class);
  private String InitRecordNumber="0";
  public String padre;
  public String id;
  public String name;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("padre"))
      return padre;
    else if (fieldName.equalsIgnoreCase("id"))
      return id;
    else if (fieldName.equalsIgnoreCase("name"))
      return name;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static SLMInOutTraceReportsData[] select(ConnectionProvider connectionProvider, String adLanguage, String mProductId)    throws ServletException {
    return select(connectionProvider, adLanguage, mProductId, 0, 0);
  }

  public static SLMInOutTraceReportsData[] select(ConnectionProvider connectionProvider, String adLanguage, String mProductId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "       SELECT DISTINCT M_PRODUCT_ID AS PADRE, M_ATTRIBUTESETINSTANCE_ID AS ID, AD_COLUMN_IDENTIFIER(TO_CHAR('M_ATTRIBUTESETINSTANCE'), TO_CHAR(M_ATTRIBUTESETINSTANCE_ID), TO_CHAR(?)) AS NAME" +
      "       FROM M_TRANSACTION" +
      "       WHERE 1=1" +
      "        AND M_ATTRIBUTESETINSTANCE_ID <> '0'" +
      "        AND M_PRODUCT_ID = ?" +
      "       ORDER BY NAME";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);

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
        SLMInOutTraceReportsData objectSLMInOutTraceReportsData = new SLMInOutTraceReportsData();
        objectSLMInOutTraceReportsData.padre = UtilSql.getValue(result, "padre");
        objectSLMInOutTraceReportsData.id = UtilSql.getValue(result, "id");
        objectSLMInOutTraceReportsData.name = UtilSql.getValue(result, "name");
        objectSLMInOutTraceReportsData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectSLMInOutTraceReportsData);
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
    SLMInOutTraceReportsData objectSLMInOutTraceReportsData[] = new SLMInOutTraceReportsData[vector.size()];
    vector.copyInto(objectSLMInOutTraceReportsData);
    return(objectSLMInOutTraceReportsData);
  }
}
