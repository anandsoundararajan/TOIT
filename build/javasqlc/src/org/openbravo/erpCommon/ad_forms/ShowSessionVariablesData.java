//Sqlc generated V1.O00-1
package org.openbravo.erpCommon.ad_forms;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import java.util.*;

class ShowSessionVariablesData implements FieldProvider {
static Logger log4j = Logger.getLogger(ShowSessionVariablesData.class);
  private String InitRecordNumber="0";
  public String id;
  public String name;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("id"))
      return id;
    else if (fieldName.equalsIgnoreCase("name"))
      return name;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static ShowSessionVariablesData[] select(ConnectionProvider connectionProvider, String windows)    throws ServletException {
    return select(connectionProvider, windows, 0, 0);
  }

  public static ShowSessionVariablesData[] select(ConnectionProvider connectionProvider, String windows, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT AD_WINDOW_ID AS ID, NAME FROM AD_WINDOW WHERE ISACTIVE='Y' ";
    strSql = strSql + ((windows==null || windows.equals(""))?"":" AND AD_WINDOW.AD_WINDOW_ID IN " + windows);
    strSql = strSql + 
      "      ORDER BY NAME";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    try {
    st = connectionProvider.getPreparedStatement(strSql);
      if (windows != null && !(windows.equals(""))) {
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
        ShowSessionVariablesData objectShowSessionVariablesData = new ShowSessionVariablesData();
        objectShowSessionVariablesData.id = UtilSql.getValue(result, "id");
        objectShowSessionVariablesData.name = UtilSql.getValue(result, "name");
        objectShowSessionVariablesData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectShowSessionVariablesData);
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
    ShowSessionVariablesData objectShowSessionVariablesData[] = new ShowSessionVariablesData[vector.size()];
    vector.copyInto(objectShowSessionVariablesData);
    return(objectShowSessionVariablesData);
  }

  public static ShowSessionVariablesData[] selectTrl(ConnectionProvider connectionProvider, String windows, String adLanguage)    throws ServletException {
    return selectTrl(connectionProvider, windows, adLanguage, 0, 0);
  }

  public static ShowSessionVariablesData[] selectTrl(ConnectionProvider connectionProvider, String windows, String adLanguage, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT AD_WINDOW.AD_WINDOW_ID AS ID, (CASE WHEN AD_WINDOW_TRL.NAME IS NULL THEN AD_WINDOW.NAME ELSE AD_WINDOW_TRL.NAME END) AS NAME " +
      "      FROM AD_WINDOW, AD_WINDOW_TRL " +
      "      WHERE AD_WINDOW.ISACTIVE='Y' ";
    strSql = strSql + ((windows==null || windows.equals(""))?"":" AND AD_WINDOW.AD_WINDOW_ID IN " + windows);
    strSql = strSql + 
      "      AND AD_WINDOW.AD_WINDOW_ID = AD_WINDOW_TRL.AD_WINDOW_ID" +
      "      AND AD_WINDOW_TRL.AD_LANGUAGE = ? " +
      "      ORDER BY 2";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      if (windows != null && !(windows.equals(""))) {
        }
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);

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
        ShowSessionVariablesData objectShowSessionVariablesData = new ShowSessionVariablesData();
        objectShowSessionVariablesData.id = UtilSql.getValue(result, "id");
        objectShowSessionVariablesData.name = UtilSql.getValue(result, "name");
        objectShowSessionVariablesData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectShowSessionVariablesData);
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
    ShowSessionVariablesData objectShowSessionVariablesData[] = new ShowSessionVariablesData[vector.size()];
    vector.copyInto(objectShowSessionVariablesData);
    return(objectShowSessionVariablesData);
  }

  public static String usuario(ConnectionProvider connectionProvider, String adUserId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT USERNAME FROM AD_USER WHERE AD_USER_ID = ?";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "username");
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

  public static String rol(ConnectionProvider connectionProvider, String adRoleId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT NAME FROM AD_ROLE WHERE AD_ROLE_ID = ?";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adRoleId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "name");
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

  public static String cliente(ConnectionProvider connectionProvider, String adClientId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT NAME FROM AD_CLIENT WHERE AD_CLIENT_ID = ?";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "name");
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

  public static String organizacion(ConnectionProvider connectionProvider, String adOrgId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT NAME FROM AD_ORG WHERE AD_ORG_ID = ?";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "name");
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

  public static String selectPreference(ConnectionProvider connectionProvider, String adClientId, String adOrgId, String adUserId, String columnname)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT AD_Preference_ID " +
      "      FROM AD_Preference " +
      "      WHERE AD_Client_ID IN (";
    strSql = strSql + ((adClientId==null || adClientId.equals(""))?"":adClientId);
    strSql = strSql + 
      ") " +
      "      AND AD_Org_ID IN (";
    strSql = strSql + ((adOrgId==null || adOrgId.equals(""))?"":adOrgId);
    strSql = strSql + 
      ") " +
      "      AND (AD_User_ID IS NULL OR AD_User_ID='0' OR AD_User_ID = ?) " +
      "      AND IsActive='Y' " +
      "      AND UPPER(Attribute) = UPPER(?)" +
      "      ORDER BY AD_Client_ID, AD_Org_ID, AD_User_ID";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      if (adClientId != null && !(adClientId.equals(""))) {
        }
      if (adOrgId != null && !(adOrgId.equals(""))) {
        }
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, columnname);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "ad_preference_id");
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

  public static int update(ConnectionProvider connectionProvider, String adUserId, String value, String adPreferenceId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      UPDATE AD_PREFERENCE SET UPDATED=now(), UPDATEDBY = ?, VALUE=?" +
      "      WHERE AD_Preference_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, value);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adPreferenceId);

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

  public static int updateRange(ConnectionProvider connectionProvider, String adUserId, String tadRecordrange, String tadRecordrangeInfo, String tadTransactionalrange, String tadTheme)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      UPDATE AD_SYSTEM SET UPDATED=now(), UPDATEDBY = ?, TAD_RECORDRANGE=TO_NUMBER(?), TAD_RECORDRANGE_INFO=TO_NUMBER(?), TAD_TRANSACTIONALRANGE=TO_NUMBER(?), TAD_THEME=?" +
      "      WHERE AD_System_ID = '0'";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, tadRecordrange);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, tadRecordrangeInfo);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, tadTransactionalrange);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, tadTheme);

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
