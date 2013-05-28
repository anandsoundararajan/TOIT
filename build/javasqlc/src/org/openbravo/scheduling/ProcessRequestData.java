//Sqlc generated V1.O00-1
package org.openbravo.scheduling;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import java.util.*;

class ProcessRequestData implements FieldProvider {
static Logger log4j = Logger.getLogger(ProcessRequestData.class);
  private String InitRecordNumber="0";
  public String id;
  public String processId;
  public String client;
  public String organization;
  public String userid;
  public String isrolesecurity;
  public String status;
  public String channel;
  public String obContext;
  public String params;
  public String adProcessSetId;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("id"))
      return id;
    else if (fieldName.equalsIgnoreCase("process_id") || fieldName.equals("processId"))
      return processId;
    else if (fieldName.equalsIgnoreCase("client"))
      return client;
    else if (fieldName.equalsIgnoreCase("organization"))
      return organization;
    else if (fieldName.equalsIgnoreCase("userid"))
      return userid;
    else if (fieldName.equalsIgnoreCase("isrolesecurity"))
      return isrolesecurity;
    else if (fieldName.equalsIgnoreCase("status"))
      return status;
    else if (fieldName.equalsIgnoreCase("channel"))
      return channel;
    else if (fieldName.equalsIgnoreCase("ob_context") || fieldName.equals("obContext"))
      return obContext;
    else if (fieldName.equalsIgnoreCase("params"))
      return params;
    else if (fieldName.equalsIgnoreCase("ad_process_set_id") || fieldName.equals("adProcessSetId"))
      return adProcessSetId;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static ProcessRequestData select(ConnectionProvider connectionProvider, String processRequestId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      	SELECT AD_Process_Request_ID AS Id, AD_Process_ID AS Process_Id," +
      "      	AD_Client_ID AS Client, AD_Org_Id AS Organization, AD_User_ID AS UserId," +
      "      	IsRoleSecurity, Status, Channel, Ob_Context, Params, AD_Process_Set_Id	 " +
      "      	FROM AD_Process_Request" +
      "      	WHERE AD_Process_Request_ID = ?";

    ResultSet result;
    ProcessRequestData objectProcessRequestData = new ProcessRequestData();
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processRequestId);

      result = st.executeQuery();
      if(result.next()) {
        objectProcessRequestData.id = UtilSql.getValue(result, "id");
        objectProcessRequestData.processId = UtilSql.getValue(result, "process_id");
        objectProcessRequestData.client = UtilSql.getValue(result, "client");
        objectProcessRequestData.organization = UtilSql.getValue(result, "organization");
        objectProcessRequestData.userid = UtilSql.getValue(result, "userid");
        objectProcessRequestData.isrolesecurity = UtilSql.getValue(result, "isrolesecurity");
        objectProcessRequestData.status = UtilSql.getValue(result, "status");
        objectProcessRequestData.channel = UtilSql.getValue(result, "channel");
        objectProcessRequestData.obContext = UtilSql.getValue(result, "ob_context");
        objectProcessRequestData.params = UtilSql.getValue(result, "params");
        objectProcessRequestData.adProcessSetId = UtilSql.getValue(result, "ad_process_set_id");
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
    return(objectProcessRequestData);
  }

  public static ProcessRequestData[] selectByStatus(ConnectionProvider connectionProvider, String status)    throws ServletException {
    return selectByStatus(connectionProvider, status, 0, 0);
  }

  public static ProcessRequestData[] selectByStatus(ConnectionProvider connectionProvider, String status, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      	SELECT AD_Process_Request_ID AS Id, AD_Process_ID AS Process_Id," +
      "      	AD_Client_ID AS Client, AD_Org_Id AS Organization, AD_User_ID AS UserId," +
      "      	IsRoleSecurity, Status, Channel, Ob_Context, AD_Process_Set_Id	 " +
      "      	FROM AD_Process_Request" +
      "      	WHERE Status = ?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, status);

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
        ProcessRequestData objectProcessRequestData = new ProcessRequestData();
        objectProcessRequestData.id = UtilSql.getValue(result, "id");
        objectProcessRequestData.processId = UtilSql.getValue(result, "process_id");
        objectProcessRequestData.client = UtilSql.getValue(result, "client");
        objectProcessRequestData.organization = UtilSql.getValue(result, "organization");
        objectProcessRequestData.userid = UtilSql.getValue(result, "userid");
        objectProcessRequestData.isrolesecurity = UtilSql.getValue(result, "isrolesecurity");
        objectProcessRequestData.status = UtilSql.getValue(result, "status");
        objectProcessRequestData.channel = UtilSql.getValue(result, "channel");
        objectProcessRequestData.obContext = UtilSql.getValue(result, "ob_context");
        objectProcessRequestData.adProcessSetId = UtilSql.getValue(result, "ad_process_set_id");
        objectProcessRequestData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectProcessRequestData);
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
    ProcessRequestData objectProcessRequestData[] = new ProcessRequestData[vector.size()];
    vector.copyInto(objectProcessRequestData);
    return(objectProcessRequestData);
  }

  public static int insert(ConnectionProvider connectionProvider, String adOrgId, String adClientId, String createdby, String updatedby, String id, String processId, String user, String status, String channel, String obContext, String params, String previousFireTime, String dateTimeFormat, String nextFireTime, String scheduledFinish)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      	INSERT INTO AD_Process_Request" +
      "        (AD_Org_ID, AD_Client_ID, Isactive, Created, Createdby, Updated, UpdatedBy," +
      "        AD_Process_Request_ID, AD_Process_ID, AD_User_ID, Status, Channel, Ob_Context, " +
      "        Params, Previous_Fire_Time, Next_Fire_Time, Scheduled_Finish)" +
      "        VALUES (?, ?, 'Y', NOW(), ?, NOW(), ?, ?, ?, ?, ?, ?, ?, ?," +
      "        TO_TIMESTAMP(?, ?), TO_TIMESTAMP(?, ?)," +
      "        TO_TIMESTAMP(?, ?))";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, createdby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, id);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, user);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, status);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, channel);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, obContext);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, params);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, previousFireTime);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateTimeFormat);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, nextFireTime);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateTimeFormat);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, scheduledFinish);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateTimeFormat);

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

  public static int update(ConnectionProvider connectionProvider, String status, String id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      	UPDATE AD_Process_Request" +
      "      	SET Status = ?" +
      "      	WHERE AD_Process_Request_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, status);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, id);

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

  public static int update(ConnectionProvider connectionProvider, String status, String nextFireTime, String dateTimeFormat, String scheduledFinish, String id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      	UPDATE AD_Process_Request" +
      "      	SET Status = ?," +
      "      	Next_Fire_Time = TO_TIMESTAMP(?, ?)," +
      "      	Scheduled_Finish = TO_TIMESTAMP(?, ?)" +
      "      	WHERE AD_Process_Request_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, status);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, nextFireTime);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateTimeFormat);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, scheduledFinish);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateTimeFormat);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, id);

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

  public static int update(ConnectionProvider connectionProvider, String updatedBy, String user, String status, String channel, String previousFireTime, String dateTimeFormat, String nextFireTime, String scheduledFinish, String obContext, String id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      	UPDATE AD_Process_Request" +
      "      	SET Updatedby = ?, AD_User_ID = ?, Status = ?, Channel = ?," +
      "      	Previous_Fire_Time = TO_TIMESTAMP(?, ?)," +
      "      	Next_Fire_Time = TO_TIMESTAMP(?, ?)," +
      "      	Scheduled_Finish = TO_TIMESTAMP(?, ?)," +
      "      	Ob_Context = ?" +
      "      	WHERE AD_Process_Request_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedBy);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, user);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, status);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, channel);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, previousFireTime);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateTimeFormat);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, nextFireTime);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateTimeFormat);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, scheduledFinish);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateTimeFormat);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, obContext);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, id);

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
}
