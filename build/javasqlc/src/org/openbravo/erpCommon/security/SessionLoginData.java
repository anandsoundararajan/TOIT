//Sqlc generated V1.O00-1
package org.openbravo.erpCommon.security;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import java.util.*;

class SessionLoginData implements FieldProvider {
static Logger log4j = Logger.getLogger(SessionLoginData.class);
  private String InitRecordNumber="0";
  public String adSessionId;
  public String serverUrl;
  public String supportContact;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("ad_session_id") || fieldName.equals("adSessionId"))
      return adSessionId;
    else if (fieldName.equalsIgnoreCase("server_url") || fieldName.equals("serverUrl"))
      return serverUrl;
    else if (fieldName.equals("supportContact"))
      return supportContact;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static SessionLoginData[] activeSessions(ConnectionProvider connectionProvider)    throws ServletException {
    return activeSessions(connectionProvider, 0, 0);
  }

  public static SessionLoginData[] activeSessions(ConnectionProvider connectionProvider, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT AD_SESSION_ID, SERVER_URL" +
      "          FROM AD_SESSION" +
      "         WHERE SESSION_ACTIVE = 'Y'";

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
        SessionLoginData objectSessionLoginData = new SessionLoginData();
        objectSessionLoginData.adSessionId = UtilSql.getValue(result, "ad_session_id");
        objectSessionLoginData.serverUrl = UtilSql.getValue(result, "server_url");
        objectSessionLoginData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectSessionLoginData);
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
    SessionLoginData objectSessionLoginData[] = new SessionLoginData[vector.size()];
    vector.copyInto(objectSessionLoginData);
    return(objectSessionLoginData);
  }

  public static int deactivate(ConnectionProvider connectionProvider, String adSessionId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        UPDATE AD_Session" +
      "        SET SESSION_ACTIVE = 'N'  " +
      "        WHERE AD_Session.AD_Session_ID = ? ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adSessionId);

      updateCount = st.executeUpdate();
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
    return(updateCount);
  }

  public static boolean isSessionActive(ConnectionProvider connectionProvider, String adSessionId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT COUNT(*) " +
      "          FROM AD_SESSION" +
      "         WHERE AD_SESSION_ID = ?" +
      "           AND SESSION_ACTIVE = 'Y'";

    ResultSet result;
    boolean boolReturn = false;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adSessionId);

      result = st.executeQuery();
      if(result.next()) {
        boolReturn = !UtilSql.getValue(result, "count").equals("0");
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
    return(boolReturn);
  }

  public static String selectSupportContact(ConnectionProvider connectionProvider)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT SUPPORT_CONTACT" +
      "          FROM AD_SYSTEM_INFO";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    try {
    st = connectionProvider.getPreparedStatement(strSql);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "support_contact");
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

  public static boolean isAudited(ConnectionProvider connectionProvider)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT COUNT(*)" +
      "          FROM AD_TABLE" +
      "         WHERE ISFULLYAUDITED='Y'";

    ResultSet result;
    boolean boolReturn = false;
    PreparedStatement st = null;

    try {
    st = connectionProvider.getPreparedStatement(strSql);

      result = st.executeQuery();
      if(result.next()) {
        boolReturn = !UtilSql.getValue(result, "count").equals("0");
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
    return(boolReturn);
  }

  public static boolean isUsageAuditEnabled(ConnectionProvider connectionProvider)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT count(*)" +
      "          FROM AD_SYSTEM_INFO" +
      "         WHERE isUsageAuditEnabled = 'Y'";

    ResultSet result;
    boolean boolReturn = false;
    PreparedStatement st = null;

    try {
    st = connectionProvider.getPreparedStatement(strSql);

      result = st.executeQuery();
      if(result.next()) {
        boolReturn = !UtilSql.getValue(result, "count").equals("0");
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
    return(boolReturn);
  }

  public static int insertUsageAudit(Connection conn, ConnectionProvider connectionProvider, String userId, String sessionId, String objectId, String moduleId, String command, String classname, String objecttype, String time)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        INSERT INTO ad_session_usage_audit" +
      "        (ad_session_usage_audit_id, ad_client_id, ad_org_id, createdby, updatedby, ad_session_id, object_id, ad_module_id, command, classname, object_type, process_time)" +
      "        VALUES (get_uuid(),'0','0',?,?,?,?,?,?,?,?,to_number(?))";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, userId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, userId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, sessionId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, objectId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, moduleId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, command);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, classname);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, objecttype);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, time);

      updateCount = st.executeUpdate();
    } catch(SQLException e){
      log4j.error("SQL error in query: " + strSql + "Exception:"+ e);
      throw new ServletException("@CODE=" + Integer.toString(e.getErrorCode()) + "@" + e.getMessage());
    } catch(Exception ex){
      log4j.error("Exception in query: " + strSql + "Exception:"+ ex);
      throw new ServletException("@CODE=@" + ex.getMessage());
    } finally {
      try {
        connectionProvider.releaseTransactionalPreparedStatement(st);
      } catch(Exception ignore){
        ignore.printStackTrace();
      }
    }
    return(updateCount);
  }
}
