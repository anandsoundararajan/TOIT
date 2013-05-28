//Sqlc generated V1.O00-1
package org.openbravo.erpWindows.Session;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import java.util.*;

/**
WAD Generated class
 */
class SessionData implements FieldProvider {
static Logger log4j = Logger.getLogger(SessionData.class);
  private String InitRecordNumber="0";
  public String created;
  public String createdbyr;
  public String updated;
  public String updatedTimeStamp;
  public String updatedby;
  public String updatedbyr;
  public String username;
  public String remoteAddr;
  public String remoteHost;
  public String serverUrl;
  public String loginStatus;
  public String loginStatusr;
  public String lastSessionPing;
  public String sessionActive;
  public String processed;
  public String isactive;
  public String adOrgId;
  public String websession;
  public String adSessionId;
  public String adClientId;
  public String language;
  public String adUserClient;
  public String adOrgClient;
  public String createdby;
  public String trBgcolor;
  public String totalCount;
  public String dateTimeFormat;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("created"))
      return created;
    else if (fieldName.equalsIgnoreCase("createdbyr"))
      return createdbyr;
    else if (fieldName.equalsIgnoreCase("updated"))
      return updated;
    else if (fieldName.equalsIgnoreCase("updated_time_stamp") || fieldName.equals("updatedTimeStamp"))
      return updatedTimeStamp;
    else if (fieldName.equalsIgnoreCase("updatedby"))
      return updatedby;
    else if (fieldName.equalsIgnoreCase("updatedbyr"))
      return updatedbyr;
    else if (fieldName.equalsIgnoreCase("username"))
      return username;
    else if (fieldName.equalsIgnoreCase("remote_addr") || fieldName.equals("remoteAddr"))
      return remoteAddr;
    else if (fieldName.equalsIgnoreCase("remote_host") || fieldName.equals("remoteHost"))
      return remoteHost;
    else if (fieldName.equalsIgnoreCase("server_url") || fieldName.equals("serverUrl"))
      return serverUrl;
    else if (fieldName.equalsIgnoreCase("login_status") || fieldName.equals("loginStatus"))
      return loginStatus;
    else if (fieldName.equalsIgnoreCase("login_statusr") || fieldName.equals("loginStatusr"))
      return loginStatusr;
    else if (fieldName.equalsIgnoreCase("last_session_ping") || fieldName.equals("lastSessionPing"))
      return lastSessionPing;
    else if (fieldName.equalsIgnoreCase("session_active") || fieldName.equals("sessionActive"))
      return sessionActive;
    else if (fieldName.equalsIgnoreCase("processed"))
      return processed;
    else if (fieldName.equalsIgnoreCase("isactive"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("ad_org_id") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("websession"))
      return websession;
    else if (fieldName.equalsIgnoreCase("ad_session_id") || fieldName.equals("adSessionId"))
      return adSessionId;
    else if (fieldName.equalsIgnoreCase("ad_client_id") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("language"))
      return language;
    else if (fieldName.equals("adUserClient"))
      return adUserClient;
    else if (fieldName.equals("adOrgClient"))
      return adOrgClient;
    else if (fieldName.equals("createdby"))
      return createdby;
    else if (fieldName.equals("trBgcolor"))
      return trBgcolor;
    else if (fieldName.equals("totalCount"))
      return totalCount;
    else if (fieldName.equals("dateTimeFormat"))
      return dateTimeFormat;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

/**
Select for edit
 */
  public static SessionData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static SessionData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(AD_Session.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = AD_Session.CreatedBy) as CreatedByR, " +
      "        to_char(AD_Session.Updated, ?) as updated, " +
      "        to_char(AD_Session.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        AD_Session.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = AD_Session.UpdatedBy) as UpdatedByR," +
      "        AD_Session.Username, " +
      "AD_Session.Remote_Addr, " +
      "AD_Session.Remote_Host, " +
      "AD_Session.Server_Url, " +
      "AD_Session.Login_Status, " +
      "(CASE WHEN AD_Session.Login_Status IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list1.name),'') ) END) AS Login_StatusR, " +
      "TO_CHAR(AD_Session.Last_Session_Ping, ?) AS Last_Session_Ping, " +
      "AD_Session.Session_Active, " +
      "COALESCE(AD_Session.Processed, 'N') AS Processed, " +
      "COALESCE(AD_Session.IsActive, 'N') AS IsActive, " +
      "AD_Session.AD_Org_ID, " +
      "AD_Session.WebSession, " +
      "AD_Session.AD_Session_ID, " +
      "AD_Session.AD_Client_ID, " +
      "        ? AS LANGUAGE " +
      "        FROM AD_Session left join ad_ref_list_v list1 on (AD_Session.Login_Status = list1.value and list1.ad_reference_id = '86086D70DDBC42B09E2BEB51D25C159F' and list1.ad_language = ?) " +
      "        WHERE 2=2 " +
      "        AND 1=1 " +
      "        AND AD_Session.AD_Session_ID = ? " +
      "        AND AD_Session.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND AD_Session.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateTimeFormat);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateTimeFormat);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateTimeFormat);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, key);
      if (adUserClient != null && !(adUserClient.equals(""))) {
        }
      if (adOrgClient != null && !(adOrgClient.equals(""))) {
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
        SessionData objectSessionData = new SessionData();
        objectSessionData.created = UtilSql.getValue(result, "created");
        objectSessionData.createdbyr = UtilSql.getValue(result, "createdbyr");
        objectSessionData.updated = UtilSql.getValue(result, "updated");
        objectSessionData.updatedTimeStamp = UtilSql.getValue(result, "updated_time_stamp");
        objectSessionData.updatedby = UtilSql.getValue(result, "updatedby");
        objectSessionData.updatedbyr = UtilSql.getValue(result, "updatedbyr");
        objectSessionData.username = UtilSql.getValue(result, "username");
        objectSessionData.remoteAddr = UtilSql.getValue(result, "remote_addr");
        objectSessionData.remoteHost = UtilSql.getValue(result, "remote_host");
        objectSessionData.serverUrl = UtilSql.getValue(result, "server_url");
        objectSessionData.loginStatus = UtilSql.getValue(result, "login_status");
        objectSessionData.loginStatusr = UtilSql.getValue(result, "login_statusr");
        objectSessionData.lastSessionPing = UtilSql.getValue(result, "last_session_ping");
        objectSessionData.sessionActive = UtilSql.getValue(result, "session_active");
        objectSessionData.processed = UtilSql.getValue(result, "processed");
        objectSessionData.isactive = UtilSql.getValue(result, "isactive");
        objectSessionData.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectSessionData.websession = UtilSql.getValue(result, "websession");
        objectSessionData.adSessionId = UtilSql.getValue(result, "ad_session_id");
        objectSessionData.adClientId = UtilSql.getValue(result, "ad_client_id");
        objectSessionData.language = UtilSql.getValue(result, "language");
        objectSessionData.adUserClient = "";
        objectSessionData.adOrgClient = "";
        objectSessionData.createdby = "";
        objectSessionData.trBgcolor = "";
        objectSessionData.totalCount = "";
        objectSessionData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectSessionData);
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
    SessionData objectSessionData[] = new SessionData[vector.size()];
    vector.copyInto(objectSessionData);
    return(objectSessionData);
  }

/**
Create a registry
 */
  public static SessionData[] set(String sessionActive, String serverUrl, String lastSessionPing, String username, String loginStatus, String adClientId, String createdby, String createdbyr, String remoteAddr, String remoteHost, String created, String updatedby, String updatedbyr, String isactive, String adOrgId, String websession, String adSessionId, String processed)    throws ServletException {
    SessionData objectSessionData[] = new SessionData[1];
    objectSessionData[0] = new SessionData();
    objectSessionData[0].created = created;
    objectSessionData[0].createdbyr = createdbyr;
    objectSessionData[0].updated = "";
    objectSessionData[0].updatedTimeStamp = "";
    objectSessionData[0].updatedby = updatedby;
    objectSessionData[0].updatedbyr = updatedbyr;
    objectSessionData[0].username = username;
    objectSessionData[0].remoteAddr = remoteAddr;
    objectSessionData[0].remoteHost = remoteHost;
    objectSessionData[0].serverUrl = serverUrl;
    objectSessionData[0].loginStatus = loginStatus;
    objectSessionData[0].loginStatusr = "";
    objectSessionData[0].lastSessionPing = lastSessionPing;
    objectSessionData[0].sessionActive = sessionActive;
    objectSessionData[0].processed = processed;
    objectSessionData[0].isactive = isactive;
    objectSessionData[0].adOrgId = adOrgId;
    objectSessionData[0].websession = websession;
    objectSessionData[0].adSessionId = adSessionId;
    objectSessionData[0].adClientId = adClientId;
    objectSessionData[0].language = "";
    return objectSessionData;
  }

/**
Select for auxiliar field
 */
  public static String selectDef8577_0(ConnectionProvider connectionProvider, String CreatedByR)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Name), ''))), '') ) as CreatedBy FROM AD_User left join (select AD_User_ID, Name from AD_User) table2 on (AD_User.AD_User_ID = table2.AD_User_ID) WHERE AD_User.isActive='Y' AND AD_User.AD_User_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, CreatedByR);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "createdby");
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

/**
Select for auxiliar field
 */
  public static String selectDef8581_1(ConnectionProvider connectionProvider, String UpdatedByR)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Name), ''))), '') ) as UpdatedBy FROM AD_User left join (select AD_User_ID, Name from AD_User) table2 on (AD_User.AD_User_ID = table2.AD_User_ID) WHERE AD_User.isActive='Y' AND AD_User.AD_User_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, UpdatedByR);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "updatedby");
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

  public int update(Connection conn, ConnectionProvider connectionProvider)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        UPDATE AD_Session" +
      "        SET Username = (?) , Remote_Addr = (?) , Remote_Host = (?) , Server_Url = (?) , Login_Status = (?) , Last_Session_Ping = TO_TIMESTAMP(?, ?) , Session_Active = (?) , AD_Session_ID = (?) , IsActive = (?) , AD_Org_ID = (?) , WebSession = (?) , AD_Client_ID = (?) , Processed = (?) , updated = now(), updatedby = ? " +
      "        WHERE AD_Session.AD_Session_ID = ? " +
      "        AND AD_Session.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND AD_Session.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, username);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, remoteAddr);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, remoteHost);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, serverUrl);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, loginStatus);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lastSessionPing);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateTimeFormat);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, sessionActive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adSessionId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, websession);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processed);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adSessionId);
      if (adUserClient != null && !(adUserClient.equals(""))) {
        }
      if (adOrgClient != null && !(adOrgClient.equals(""))) {
        }

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

  public int insert(Connection conn, ConnectionProvider connectionProvider)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        INSERT INTO AD_Session " +
      "        (Username, Remote_Addr, Remote_Host, Server_Url, Login_Status, Last_Session_Ping, Session_Active, Processed, IsActive, AD_Org_ID, WebSession, AD_Session_ID, AD_Client_ID, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), (?), (?), (?), TO_TIMESTAMP(?, ?), (?), (?), (?), (?), (?), (?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, username);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, remoteAddr);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, remoteHost);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, serverUrl);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, loginStatus);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lastSessionPing);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateTimeFormat);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, sessionActive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processed);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, websession);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adSessionId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, createdby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);

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

  public static int delete(ConnectionProvider connectionProvider, String param1, String adUserClient, String adOrgClient)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        DELETE FROM AD_Session" +
      "        WHERE AD_Session.AD_Session_ID = ? " +
      "        AND AD_Session.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND AD_Session.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, param1);
      if (adUserClient != null && !(adUserClient.equals(""))) {
        }
      if (adOrgClient != null && !(adOrgClient.equals(""))) {
        }

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

/**
Select for relation
 */
  public static String selectOrg(ConnectionProvider connectionProvider, String id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT AD_ORG_ID" +
      "          FROM AD_Session" +
      "         WHERE AD_Session.AD_Session_ID = ? ";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, id);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "ad_org_id");
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

  public static String getCurrentDBTimestamp(ConnectionProvider connectionProvider, String id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp" +
      "          FROM AD_Session" +
      "         WHERE AD_Session.AD_Session_ID = ? ";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, id);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "updated_time_stamp");
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
