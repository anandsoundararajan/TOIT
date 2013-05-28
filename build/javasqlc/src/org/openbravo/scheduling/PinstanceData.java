//Sqlc generated V1.O00-1
package org.openbravo.scheduling;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;

class PinstanceData implements FieldProvider {
static Logger log4j = Logger.getLogger(PinstanceData.class);
  private String InitRecordNumber="0";
  public String adProcessId;
  public String recordId;
  public String isprocessing;
  public String result;
  public String errormsg;
  public String isactive;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("ad_process_id") || fieldName.equals("adProcessId"))
      return adProcessId;
    else if (fieldName.equalsIgnoreCase("record_id") || fieldName.equals("recordId"))
      return recordId;
    else if (fieldName.equalsIgnoreCase("isprocessing"))
      return isprocessing;
    else if (fieldName.equalsIgnoreCase("result"))
      return result;
    else if (fieldName.equalsIgnoreCase("errormsg"))
      return errormsg;
    else if (fieldName.equalsIgnoreCase("isactive"))
      return isactive;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static PinstanceData select(ConnectionProvider connectionProvider, String pinstanceId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      	SELECT AD_Process_ID, Record_ID, Isprocessing, Result, Errormsg, Isactive " +
      "      	FROM AD_Pinstance" +
      "      	WHERE AD_Pinstance_ID = ?";

    ResultSet result;
    PinstanceData objectPinstanceData = new PinstanceData();
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pinstanceId);

      result = st.executeQuery();
      if(result.next()) {
        objectPinstanceData.adProcessId = UtilSql.getValue(result, "ad_process_id");
        objectPinstanceData.recordId = UtilSql.getValue(result, "record_id");
        objectPinstanceData.isprocessing = UtilSql.getValue(result, "isprocessing");
        objectPinstanceData.result = UtilSql.getValue(result, "result");
        objectPinstanceData.errormsg = UtilSql.getValue(result, "errormsg");
        objectPinstanceData.isactive = UtilSql.getValue(result, "isactive");
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
    return(objectPinstanceData);
  }
}
