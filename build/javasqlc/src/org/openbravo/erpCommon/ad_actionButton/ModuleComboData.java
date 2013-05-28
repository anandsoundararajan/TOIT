//Sqlc generated V1.O00-1
package org.openbravo.erpCommon.ad_actionButton;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import java.util.*;

class ModuleComboData implements FieldProvider {
static Logger log4j = Logger.getLogger(ModuleComboData.class);
  private String InitRecordNumber="0";
  public String clave;
  public String name;
  public String id;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("clave"))
      return clave;
    else if (fieldName.equalsIgnoreCase("name"))
      return name;
    else if (fieldName.equalsIgnoreCase("id"))
      return id;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static ModuleComboData[] select(ConnectionProvider connectionProvider)    throws ServletException {
    return select(connectionProvider, 0, 0);
  }

  public static ModuleComboData[] select(ConnectionProvider connectionProvider, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "       SELECT DISTINCT tn.Node_ID AS CLAVE, menuData.NAME AS NAME, tn.Node_ID AS id" +
      "        FROM AD_TREENODE tn, AD_MENU menuData " +
      "        WHERE tn.node_id = menuData.ad_menu_id " +
      "        AND tn.ad_tree_id = '10' " +
      "        AND tn.IsActive='Y' " +
      "        AND PARENT_ID='0' ";

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
        ModuleComboData objectModuleComboData = new ModuleComboData();
        objectModuleComboData.clave = UtilSql.getValue(result, "clave");
        objectModuleComboData.name = UtilSql.getValue(result, "name");
        objectModuleComboData.id = UtilSql.getValue(result, "id");
        objectModuleComboData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectModuleComboData);
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
    ModuleComboData objectModuleComboData[] = new ModuleComboData[vector.size()];
    vector.copyInto(objectModuleComboData);
    return(objectModuleComboData);
  }

  public static ModuleComboData[] selectTrl(ConnectionProvider connectionProvider, String adLanguage)    throws ServletException {
    return selectTrl(connectionProvider, adLanguage, 0, 0);
  }

  public static ModuleComboData[] selectTrl(ConnectionProvider connectionProvider, String adLanguage, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "       SELECT DISTINCT tn.Node_ID AS CLAVE, menuDataTRL.NAME AS NAME, tn.Node_ID AS id" +
      "        FROM AD_TREENODE tn, AD_MENU menuData, AD_MENU_TRL menuDataTRL " +
      "        WHERE tn.node_id = menuData.ad_menu_id " +
      "        AND menuDataTRL.ad_menu_id=menuData.ad_menu_id" +
      "        AND tn.ad_tree_id = '10' " +
      "        AND tn.IsActive='Y' " +
      "        AND PARENT_ID='0'" +
      "        AND AD_LANGUAGE=?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
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
        ModuleComboData objectModuleComboData = new ModuleComboData();
        objectModuleComboData.clave = UtilSql.getValue(result, "clave");
        objectModuleComboData.name = UtilSql.getValue(result, "name");
        objectModuleComboData.id = UtilSql.getValue(result, "id");
        objectModuleComboData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectModuleComboData);
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
    ModuleComboData objectModuleComboData[] = new ModuleComboData[vector.size()];
    vector.copyInto(objectModuleComboData);
    return(objectModuleComboData);
  }
}
