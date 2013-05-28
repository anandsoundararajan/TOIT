//Sqlc generated V1.O00-1
package org.openbravo.erpCommon.modules;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import java.util.*;
import org.openbravo.database.RDBMSIndependent;
import org.openbravo.exception.*;

class ApplyModuleData implements FieldProvider {
static Logger log4j = Logger.getLogger(ApplyModuleData.class);
  private String InitRecordNumber="0";
  public String javapackage;
  public String name;
  public String adLanguage;
  public String issystemlanguage;
  public String dsName;
  public String adModuleId;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("javapackage"))
      return javapackage;
    else if (fieldName.equalsIgnoreCase("name"))
      return name;
    else if (fieldName.equalsIgnoreCase("ad_language") || fieldName.equals("adLanguage"))
      return adLanguage;
    else if (fieldName.equalsIgnoreCase("issystemlanguage"))
      return issystemlanguage;
    else if (fieldName.equalsIgnoreCase("ds_name") || fieldName.equals("dsName"))
      return dsName;
    else if (fieldName.equalsIgnoreCase("ad_module_id") || fieldName.equals("adModuleId"))
      return adModuleId;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static ApplyModuleData[] selectTranslationModules(ConnectionProvider connectionProvider)    throws ServletException {
    return selectTranslationModules(connectionProvider, 0, 0);
  }

  public static ApplyModuleData[] selectTranslationModules(ConnectionProvider connectionProvider, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT M.JAVAPACKAGE, M.NAME, M.AD_LANGUAGE, L.ISSYSTEMLANGUAGE, '' as DS_NAME, '' AS AD_MODULE_ID" +
      "        FROM AD_MODULE M LEFT JOIN AD_LANGUAGE L" +
      "                           ON L.AD_LANGUAGE = M.AD_LANGUAGE" +
      "       WHERE (STATUS = 'I' OR STATUS = 'P')" +
      "         AND ISTRANSLATIONMODULE = 'Y'";

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
        ApplyModuleData objectApplyModuleData = new ApplyModuleData();
        objectApplyModuleData.javapackage = UtilSql.getValue(result, "javapackage");
        objectApplyModuleData.name = UtilSql.getValue(result, "name");
        objectApplyModuleData.adLanguage = UtilSql.getValue(result, "ad_language");
        objectApplyModuleData.issystemlanguage = UtilSql.getValue(result, "issystemlanguage");
        objectApplyModuleData.dsName = UtilSql.getValue(result, "ds_name");
        objectApplyModuleData.adModuleId = UtilSql.getValue(result, "ad_module_id");
        objectApplyModuleData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectApplyModuleData);
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
    ApplyModuleData objectApplyModuleData[] = new ApplyModuleData[vector.size()];
    vector.copyInto(objectApplyModuleData);
    return(objectApplyModuleData);
  }

  public static ApplyModuleData[] selectAllTranslationModules(ConnectionProvider connectionProvider)    throws ServletException {
    return selectAllTranslationModules(connectionProvider, 0, 0);
  }

  public static ApplyModuleData[] selectAllTranslationModules(ConnectionProvider connectionProvider, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT M.JAVAPACKAGE, M.NAME, M.AD_LANGUAGE, L.ISSYSTEMLANGUAGE, '' as DS_NAME, '' AS AD_MODULE_ID" +
      "        FROM AD_MODULE M LEFT JOIN AD_LANGUAGE L" +
      "                           ON L.AD_LANGUAGE = M.AD_LANGUAGE" +
      "       WHERE ISTRANSLATIONMODULE = 'Y'";

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
        ApplyModuleData objectApplyModuleData = new ApplyModuleData();
        objectApplyModuleData.javapackage = UtilSql.getValue(result, "javapackage");
        objectApplyModuleData.name = UtilSql.getValue(result, "name");
        objectApplyModuleData.adLanguage = UtilSql.getValue(result, "ad_language");
        objectApplyModuleData.issystemlanguage = UtilSql.getValue(result, "issystemlanguage");
        objectApplyModuleData.dsName = UtilSql.getValue(result, "ds_name");
        objectApplyModuleData.adModuleId = UtilSql.getValue(result, "ad_module_id");
        objectApplyModuleData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectApplyModuleData);
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
    ApplyModuleData objectApplyModuleData[] = new ApplyModuleData[vector.size()];
    vector.copyInto(objectApplyModuleData);
    return(objectApplyModuleData);
  }

  public static ApplyModuleData[] selectClientReferenceModules(ConnectionProvider connectionProvider)    throws ServletException {
    return selectClientReferenceModules(connectionProvider, 0, 0);
  }

  public static ApplyModuleData[] selectClientReferenceModules(ConnectionProvider connectionProvider, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT M.JAVAPACKAGE, M.NAME, M.AD_MODULE_ID, D.NAME as DS_NAME" +
      "        FROM AD_MODULE M, AD_DATASET D" +
      "       WHERE (M.STATUS = 'I' OR M.STATUS = 'P')" +
      "         AND M.HASREFERENCEDATA = 'Y'" +
      "         AND D.AD_MODULE_ID = M.AD_MODULE_ID" +
      "         AND D.ACCESSLEVEL = '4'";

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
        ApplyModuleData objectApplyModuleData = new ApplyModuleData();
        objectApplyModuleData.javapackage = UtilSql.getValue(result, "javapackage");
        objectApplyModuleData.name = UtilSql.getValue(result, "name");
        objectApplyModuleData.adModuleId = UtilSql.getValue(result, "ad_module_id");
        objectApplyModuleData.dsName = UtilSql.getValue(result, "ds_name");
        objectApplyModuleData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectApplyModuleData);
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
    ApplyModuleData objectApplyModuleData[] = new ApplyModuleData[vector.size()];
    vector.copyInto(objectApplyModuleData);
    return(objectApplyModuleData);
  }

  public static ApplyModuleData[] selectAllClientReferenceModules(ConnectionProvider connectionProvider)    throws ServletException {
    return selectAllClientReferenceModules(connectionProvider, 0, 0);
  }

  public static ApplyModuleData[] selectAllClientReferenceModules(ConnectionProvider connectionProvider, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT M.JAVAPACKAGE, M.NAME, M.AD_MODULE_ID, D.NAME as DS_NAME" +
      "        FROM AD_MODULE M, AD_DATASET D" +
      "       WHERE M.HASREFERENCEDATA = 'Y'" +
      "         AND D.AD_MODULE_ID = M.AD_MODULE_ID" +
      "         AND D.ACCESSLEVEL = '4'";

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
        ApplyModuleData objectApplyModuleData = new ApplyModuleData();
        objectApplyModuleData.javapackage = UtilSql.getValue(result, "javapackage");
        objectApplyModuleData.name = UtilSql.getValue(result, "name");
        objectApplyModuleData.adModuleId = UtilSql.getValue(result, "ad_module_id");
        objectApplyModuleData.dsName = UtilSql.getValue(result, "ds_name");
        objectApplyModuleData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectApplyModuleData);
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
    ApplyModuleData objectApplyModuleData[] = new ApplyModuleData[vector.size()];
    vector.copyInto(objectApplyModuleData);
    return(objectApplyModuleData);
  }

  public static int setSystemLanguage(ConnectionProvider connectionProvider, String lang)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "         UPDATE AD_LANGUAGE" +
      "            SET ISSYSTEMLANGUAGE='Y'" +
      "          WHERE AD_LANGUAGE = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lang);

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
procedure AD_Language_Create
 */
  public static ApplyModuleData process179(ConnectionProvider connectionProvider, String adPinstanceId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        CALL AD_Language_Create(?)";

    ApplyModuleData objectApplyModuleData = new ApplyModuleData();
    CallableStatement st = null;
    if (connectionProvider.getRDBMS().equalsIgnoreCase("ORACLE")) {

    int iParameter = 0;
    try {
      st = connectionProvider.getCallableStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adPinstanceId);

      st.execute();
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
    }
    else {
      Vector<String> parametersData = new Vector<String>();
      Vector<String> parametersTypes = new Vector<String>();
      parametersData.addElement(adPinstanceId);
      parametersTypes.addElement("in");
      try {
      RDBMSIndependent.getCallableResult(null, connectionProvider, strSql, parametersData, parametersTypes, 0);
      } catch(SQLException e){
        log4j.error("SQL error in query: " + strSql + "Exception:"+ e);
        throw new ServletException("@CODE=" + Integer.toString(e.getErrorCode()) + "@" + e.getMessage());
      } catch(NoConnectionAvailableException ec){
        log4j.error("Connection error in query: " + strSql + "Exception:"+ ec);
        throw new ServletException("@CODE=NoConnectionAvailable");
      } catch(PoolNotFoundException ep){
        log4j.error("Pool error in query: " + strSql + "Exception:"+ ep);
        throw new ServletException("@CODE=NoConnectionAvailable");
      } catch(Exception ex){
        log4j.error("Exception in query: " + strSql + "Exception:"+ ex);
        throw new ServletException("@CODE=@" + ex.getMessage());
      }
    }
    return(objectApplyModuleData);
  }
}
