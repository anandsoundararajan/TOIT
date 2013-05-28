//Sqlc generated V1.O00-1
package org.openbravo.erpReports;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import java.util.*;

class RptMInoutData implements FieldProvider {
static Logger log4j = Logger.getLogger(RptMInoutData.class);
  private String InitRecordNumber="0";
  public String mInoutId;
  public String documentcopies;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("m_inout_id") || fieldName.equals("mInoutId"))
      return mInoutId;
    else if (fieldName.equalsIgnoreCase("documentcopies"))
      return documentcopies;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static RptMInoutData[] select(ConnectionProvider connectionProvider, String mInoutId)    throws ServletException {
    return select(connectionProvider, mInoutId, 0, 0);
  }

  public static RptMInoutData[] select(ConnectionProvider connectionProvider, String mInoutId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT M_INOUT.M_INOUT_ID, C_DOCTYPE.DOCUMENTCOPIES" +
      "        FROM M_INOUT left join  C_DOCTYPE on M_INOUT.C_DOCTYPE_ID = C_DOCTYPE.C_DOCTYPE_ID" +
      "        WHERE 1=1 ";
    strSql = strSql + ((mInoutId==null || mInoutId.equals(""))?"":"           AND M_INOUT.M_INOUT_ID IN          " + mInoutId);
    strSql = strSql + 
      "        ORDER BY M_INOUT.DOCUMENTNO ASC";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    try {
    st = connectionProvider.getPreparedStatement(strSql);
      if (mInoutId != null && !(mInoutId.equals(""))) {
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
        RptMInoutData objectRptMInoutData = new RptMInoutData();
        objectRptMInoutData.mInoutId = UtilSql.getValue(result, "m_inout_id");
        objectRptMInoutData.documentcopies = UtilSql.getValue(result, "documentcopies");
        objectRptMInoutData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectRptMInoutData);
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
    RptMInoutData objectRptMInoutData[] = new RptMInoutData[vector.size()];
    vector.copyInto(objectRptMInoutData);
    return(objectRptMInoutData);
  }

  public static RptMInoutData[] set()    throws ServletException {
    RptMInoutData objectRptMInoutData[] = new RptMInoutData[1];
    objectRptMInoutData[0] = new RptMInoutData();
    objectRptMInoutData[0].mInoutId = "";
    objectRptMInoutData[0].documentcopies = "";
    return objectRptMInoutData;
  }

  public static String selectCopies(ConnectionProvider connectionProvider, String mInoutId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT SUM(COALESCE(C_DOCTYPE.DOCUMENTCOPIES, 1)) AS DOCUMENTCOPIES" +
      "        FROM M_INOUT left join C_DOCTYPE on  M_INOUT.C_DOCTYPE_ID = C_DOCTYPE.C_DOCTYPE_ID " +
      "        WHERE 1=1 ";
    strSql = strSql + ((mInoutId==null || mInoutId.equals(""))?"":"           AND M_INOUT.M_INOUT_ID  IN          " + mInoutId);

    ResultSet result;
    String strReturn = "0";
    PreparedStatement st = null;

    try {
    st = connectionProvider.getPreparedStatement(strSql);
      if (mInoutId != null && !(mInoutId.equals(""))) {
        }

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "documentcopies");
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

  public static String selectDocumentcopies(ConnectionProvider connectionProvider, String mInoutId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT COALESCE(C_DOCTYPE.DOCUMENTCOPIES, 1) AS DOCUMENTCOPIES" +
      "        FROM M_INOUT left join C_DOCTYPE on  M_INOUT.C_DOCTYPE_ID = C_DOCTYPE.C_DOCTYPE_ID" +
      "        WHERE M_INOUT.M_INOUT_ID = ?";

    ResultSet result;
    String strReturn = "0";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mInoutId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "documentcopies");
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

  public static RptMInoutData[] selectNumCopies(ConnectionProvider connectionProvider, String rownum)    throws ServletException {
    return selectNumCopies(connectionProvider, rownum, 0, 0);
  }

  public static RptMInoutData[] selectNumCopies(ConnectionProvider connectionProvider, String rownum, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "          SELECT VALUE AS M_INOUT_ID" +
      "          FROM AD_INTEGER" +
      "          WHERE VALUE <= ?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, rownum);

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
        RptMInoutData objectRptMInoutData = new RptMInoutData();
        objectRptMInoutData.mInoutId = UtilSql.getValue(result, "m_inout_id");
        objectRptMInoutData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectRptMInoutData);
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
    RptMInoutData objectRptMInoutData[] = new RptMInoutData[vector.size()];
    vector.copyInto(objectRptMInoutData);
    return(objectRptMInoutData);
  }
}
