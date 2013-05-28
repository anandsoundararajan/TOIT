//Sqlc generated V1.O00-1
package org.openbravo.erpCommon.ad_process;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;

class ProcedureProcessData implements FieldProvider {
static Logger log4j = Logger.getLogger(ProcedureProcessData.class);
  private String InitRecordNumber="0";
  public String errormsg;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("errormsg"))
      return errormsg;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static ProcedureProcessData selectErrorMessage(ConnectionProvider connectionProvider, String pinstanceId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      	SELECT Errormsg " +
      "      	FROM AD_Pinstance" +
      "      	WHERE AD_Pinstance_ID = ?";

    ResultSet result;
    ProcedureProcessData objectProcedureProcessData = new ProcedureProcessData();
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pinstanceId);

      result = st.executeQuery();
      if(result.next()) {
        objectProcedureProcessData.errormsg = UtilSql.getValue(result, "errormsg");
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
    return(objectProcedureProcessData);
  }
}
