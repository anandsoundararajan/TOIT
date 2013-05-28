//Sqlc generated V1.O00-1
package org.openbravo.erpCommon.ad_callouts;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import java.util.*;

class SLRequisitionOrderOrderData implements FieldProvider {
static Logger log4j = Logger.getLogger(SLRequisitionOrderOrderData.class);
  private String InitRecordNumber="0";
  public String dummy;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("dummy"))
      return dummy;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static SLRequisitionOrderOrderData[] select(ConnectionProvider connectionProvider)    throws ServletException {
    return select(connectionProvider, 0, 0);
  }

  public static SLRequisitionOrderOrderData[] select(ConnectionProvider connectionProvider, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT * FROM DUAL";

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
        SLRequisitionOrderOrderData objectSLRequisitionOrderOrderData = new SLRequisitionOrderOrderData();
        objectSLRequisitionOrderOrderData.dummy = UtilSql.getValue(result, "dummy");
        objectSLRequisitionOrderOrderData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectSLRequisitionOrderOrderData);
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
    SLRequisitionOrderOrderData objectSLRequisitionOrderOrderData[] = new SLRequisitionOrderOrderData[vector.size()];
    vector.copyInto(objectSLRequisitionOrderOrderData);
    return(objectSLRequisitionOrderOrderData);
  }

  public static String getRequired(ConnectionProvider connectionProvider, String mRequisitionLineId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT M_REQUISITIONLINE.QTY - COALESCE(SUM(M_REQUISITIONORDER.QTY),0) AS REQUIRED" +
      "      FROM M_REQUISITIONLINE LEFT JOIN M_REQUISITIONORDER " +
      "                             ON M_REQUISITIONLINE.M_REQUISITIONLINE_ID = M_REQUISITIONORDER.M_REQUISITIONLINE_ID" +
      "      WHERE M_REQUISITIONLINE.M_REQUISITIONLINE_ID = ?" +
      "      GROUP BY M_REQUISITIONLINE.QTY";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mRequisitionLineId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "required");
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

  public static String getOrderLine(ConnectionProvider connectionProvider, String mOrderLineId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT QTYORDERED" +
      "      FROM C_ORDERLINE" +
      "      WHERE C_ORDERLINE_ID = ?";

    ResultSet result;
    String strReturn = "0";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mOrderLineId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "qtyordered");
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
