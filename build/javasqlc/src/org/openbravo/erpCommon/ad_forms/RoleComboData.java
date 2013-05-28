//Sqlc generated V1.O00-1
package org.openbravo.erpCommon.ad_forms;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import java.util.*;

class RoleComboData implements FieldProvider {
static Logger log4j = Logger.getLogger(RoleComboData.class);
  private String InitRecordNumber="0";
  public String adRoleId;
  public String name;
  public String adClientId;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("ad_role_id") || fieldName.equals("adRoleId"))
      return adRoleId;
    else if (fieldName.equalsIgnoreCase("name"))
      return name;
    else if (fieldName.equalsIgnoreCase("ad_client_id") || fieldName.equals("adClientId"))
      return adClientId;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static RoleComboData[] select(ConnectionProvider connectionProvider, String user)    throws ServletException {
    return select(connectionProvider, user, 0, 0);
  }

  public static RoleComboData[] select(ConnectionProvider connectionProvider, String user, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT A_R.AD_ROLE_ID, A_R.NAME, A_R.AD_CLIENT_ID " +
      "        FROM AD_ROLE A_R, AD_USER_ROLES A_U_R " +
      "        WHERE A_R.AD_ROLE_ID = A_U_R.AD_ROLE_ID " +
      "        AND A_U_R.ISACTIVE = 'Y' " +
      "        AND A_R.ISACTIVE = 'Y' " +
      "        AND A_U_R.AD_USER_ID = ?" +
      "        ORDER BY A_R.NAME";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, user);

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
        RoleComboData objectRoleComboData = new RoleComboData();
        objectRoleComboData.adRoleId = UtilSql.getValue(result, "ad_role_id");
        objectRoleComboData.name = UtilSql.getValue(result, "name");
        objectRoleComboData.adClientId = UtilSql.getValue(result, "ad_client_id");
        objectRoleComboData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectRoleComboData);
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
    RoleComboData objectRoleComboData[] = new RoleComboData[vector.size()];
    vector.copyInto(objectRoleComboData);
    return(objectRoleComboData);
  }

  public static RoleComboData[] selectSystem(ConnectionProvider connectionProvider, String user)    throws ServletException {
    return selectSystem(connectionProvider, user, 0, 0);
  }

  public static RoleComboData[] selectSystem(ConnectionProvider connectionProvider, String user, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT A_R.AD_ROLE_ID, A_R.NAME, A_R.AD_CLIENT_ID " +
      "        FROM AD_ROLE A_R, AD_USER_ROLES A_U_R " +
      "        WHERE A_R.AD_ROLE_ID = A_U_R.AD_ROLE_ID " +
      "        AND A_U_R.ISACTIVE = 'Y' " +
      "        AND A_R.ISACTIVE = 'Y' " +
      "        AND A_U_R.AD_USER_ID = ?" +
      "        AND A_R.USERLEVEL='S'" +
      "        ORDER BY A_R.NAME";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, user);

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
        RoleComboData objectRoleComboData = new RoleComboData();
        objectRoleComboData.adRoleId = UtilSql.getValue(result, "ad_role_id");
        objectRoleComboData.name = UtilSql.getValue(result, "name");
        objectRoleComboData.adClientId = UtilSql.getValue(result, "ad_client_id");
        objectRoleComboData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectRoleComboData);
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
    RoleComboData objectRoleComboData[] = new RoleComboData[vector.size()];
    vector.copyInto(objectRoleComboData);
    return(objectRoleComboData);
  }
}
