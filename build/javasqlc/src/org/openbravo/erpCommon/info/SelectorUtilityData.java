//Sqlc generated V1.O00-1
package org.openbravo.erpCommon.info;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import java.util.*;

/**
Contains utility methods for users of the *MultipleSelector classes
 */
public class SelectorUtilityData implements FieldProvider {
static Logger log4j = Logger.getLogger(SelectorUtilityData.class);
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

  public static SelectorUtilityData[] selectMproduct(ConnectionProvider connectionProvider, String adOrgClient, String adUserClient, String mProductId)    throws ServletException {
    return selectMproduct(connectionProvider, adOrgClient, adUserClient, mProductId, 0, 0);
  }

  public static SelectorUtilityData[] selectMproduct(ConnectionProvider connectionProvider, String adOrgClient, String adUserClient, String mProductId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT M_PRODUCT.M_PRODUCT_ID AS ID,M_PRODUCT.NAME" +
      "      FROM M_PRODUCT" +
      "      WHERE AD_ORG_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ")" +
      "      AND AD_CLIENT_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ")" +
      "      AND (1=2";
    strSql = strSql + ((mProductId==null || mProductId.equals(""))?"":"  OR M_PRODUCT_ID IN" + mProductId);
    strSql = strSql + 
      " )";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    try {
    st = connectionProvider.getPreparedStatement(strSql);
      if (adOrgClient != null && !(adOrgClient.equals(""))) {
        }
      if (adUserClient != null && !(adUserClient.equals(""))) {
        }
      if (mProductId != null && !(mProductId.equals(""))) {
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
        SelectorUtilityData objectSelectorUtilityData = new SelectorUtilityData();
        objectSelectorUtilityData.id = UtilSql.getValue(result, "id");
        objectSelectorUtilityData.name = UtilSql.getValue(result, "name");
        objectSelectorUtilityData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectSelectorUtilityData);
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
    SelectorUtilityData objectSelectorUtilityData[] = new SelectorUtilityData[vector.size()];
    vector.copyInto(objectSelectorUtilityData);
    return(objectSelectorUtilityData);
  }

  public static SelectorUtilityData[] selectBpartner(ConnectionProvider connectionProvider, String adOrgClient, String adUserClient, String cBpartnerId)    throws ServletException {
    return selectBpartner(connectionProvider, adOrgClient, adUserClient, cBpartnerId, 0, 0);
  }

  public static SelectorUtilityData[] selectBpartner(ConnectionProvider connectionProvider, String adOrgClient, String adUserClient, String cBpartnerId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT C_BPARTNER_ID AS ID, C_BPARTNER.NAME" +
      "      FROM C_BPARTNER" +
      "      WHERE AD_ORG_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ")" +
      "      AND AD_CLIENT_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ")" +
      "      AND (1=2";
    strSql = strSql + ((cBpartnerId==null || cBpartnerId.equals(""))?"":"  OR C_BPARTNER_ID IN" + cBpartnerId);
    strSql = strSql + 
      " )";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    try {
    st = connectionProvider.getPreparedStatement(strSql);
      if (adOrgClient != null && !(adOrgClient.equals(""))) {
        }
      if (adUserClient != null && !(adUserClient.equals(""))) {
        }
      if (cBpartnerId != null && !(cBpartnerId.equals(""))) {
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
        SelectorUtilityData objectSelectorUtilityData = new SelectorUtilityData();
        objectSelectorUtilityData.id = UtilSql.getValue(result, "id");
        objectSelectorUtilityData.name = UtilSql.getValue(result, "name");
        objectSelectorUtilityData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectSelectorUtilityData);
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
    SelectorUtilityData objectSelectorUtilityData[] = new SelectorUtilityData[vector.size()];
    vector.copyInto(objectSelectorUtilityData);
    return(objectSelectorUtilityData);
  }

  public static SelectorUtilityData[] selectProject(ConnectionProvider connectionProvider, String adOrgClient, String adUserClient, String cProjectId)    throws ServletException {
    return selectProject(connectionProvider, adOrgClient, adUserClient, cProjectId, 0, 0);
  }

  public static SelectorUtilityData[] selectProject(ConnectionProvider connectionProvider, String adOrgClient, String adUserClient, String cProjectId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT C_PROJECT_ID AS ID, C_PROJECT.NAME" +
      "      FROM C_PROJECT" +
      "      WHERE AD_ORG_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ")" +
      "      AND AD_CLIENT_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ")" +
      "      AND (1=2";
    strSql = strSql + ((cProjectId==null || cProjectId.equals(""))?"":"  OR C_PROJECT_ID IN" + cProjectId);
    strSql = strSql + 
      " )";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    try {
    st = connectionProvider.getPreparedStatement(strSql);
      if (adOrgClient != null && !(adOrgClient.equals(""))) {
        }
      if (adUserClient != null && !(adUserClient.equals(""))) {
        }
      if (cProjectId != null && !(cProjectId.equals(""))) {
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
        SelectorUtilityData objectSelectorUtilityData = new SelectorUtilityData();
        objectSelectorUtilityData.id = UtilSql.getValue(result, "id");
        objectSelectorUtilityData.name = UtilSql.getValue(result, "name");
        objectSelectorUtilityData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectSelectorUtilityData);
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
    SelectorUtilityData objectSelectorUtilityData[] = new SelectorUtilityData[vector.size()];
    vector.copyInto(objectSelectorUtilityData);
    return(objectSelectorUtilityData);
  }
}
