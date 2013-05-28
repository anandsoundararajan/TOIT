//Sqlc generated V1.O00-1
package org.openbravo.base.secureApp;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import java.util.*;

class OrgTreeData implements FieldProvider {
static Logger log4j = Logger.getLogger(OrgTreeData.class);
  private String InitRecordNumber="0";
  public String adOrgId;
  public String adClientId;
  public String adRoleId;
  public String userlevel;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("ad_org_id") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("ad_client_id") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("ad_role_id") || fieldName.equals("adRoleId"))
      return adRoleId;
    else if (fieldName.equalsIgnoreCase("userlevel"))
      return userlevel;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static OrgTreeData[] select(ConnectionProvider connectionProvider, String adRoleId)    throws ServletException {
    return select(connectionProvider, adRoleId, 0, 0);
  }

  public static OrgTreeData[] select(ConnectionProvider connectionProvider, String adRoleId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT AD_ORG_ID, AD_CLIENT_ID, AD_ROLE_ID, '' as userlevel" +
      "        FROM AD_ROLE_ORGACCESS" +
      "       WHERE AD_ROLE_ID = ?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adRoleId);

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
        OrgTreeData objectOrgTreeData = new OrgTreeData();
        objectOrgTreeData.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectOrgTreeData.adClientId = UtilSql.getValue(result, "ad_client_id");
        objectOrgTreeData.adRoleId = UtilSql.getValue(result, "ad_role_id");
        objectOrgTreeData.userlevel = UtilSql.getValue(result, "userlevel");
        objectOrgTreeData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectOrgTreeData);
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
    OrgTreeData objectOrgTreeData[] = new OrgTreeData[vector.size()];
    vector.copyInto(objectOrgTreeData);
    return(objectOrgTreeData);
  }

  public static OrgTreeData[] selectAllClients(ConnectionProvider connectionProvider)    throws ServletException {
    return selectAllClients(connectionProvider, 0, 0);
  }

  public static OrgTreeData[] selectAllClients(ConnectionProvider connectionProvider, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT AD_CLIENT_ID" +
      "        FROM AD_CLIENT";

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
        OrgTreeData objectOrgTreeData = new OrgTreeData();
        objectOrgTreeData.adClientId = UtilSql.getValue(result, "ad_client_id");
        objectOrgTreeData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectOrgTreeData);
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
    OrgTreeData objectOrgTreeData[] = new OrgTreeData[vector.size()];
    vector.copyInto(objectOrgTreeData);
    return(objectOrgTreeData);
  }

  public static OrgTreeData[] selectAllOrgs(ConnectionProvider connectionProvider)    throws ServletException {
    return selectAllOrgs(connectionProvider, 0, 0);
  }

  public static OrgTreeData[] selectAllOrgs(ConnectionProvider connectionProvider, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT AD_ORG_ID" +
      "        FROM AD_ORG";

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
        OrgTreeData objectOrgTreeData = new OrgTreeData();
        objectOrgTreeData.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectOrgTreeData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectOrgTreeData);
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
    OrgTreeData objectOrgTreeData[] = new OrgTreeData[vector.size()];
    vector.copyInto(objectOrgTreeData);
    return(objectOrgTreeData);
  }

  public static OrgTreeData[] selectRoles(ConnectionProvider connectionProvider, String client)    throws ServletException {
    return selectRoles(connectionProvider, client, 0, 0);
  }

  public static OrgTreeData[] selectRoles(ConnectionProvider connectionProvider, String client, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT AD_ROLE_ID, userlevel" +
      "        FROM AD_ROLE" +
      "       WHERE AD_CLIENT_ID = ?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, client);

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
        OrgTreeData objectOrgTreeData = new OrgTreeData();
        objectOrgTreeData.adRoleId = UtilSql.getValue(result, "ad_role_id");
        objectOrgTreeData.userlevel = UtilSql.getValue(result, "userlevel");
        objectOrgTreeData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectOrgTreeData);
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
    OrgTreeData objectOrgTreeData[] = new OrgTreeData[vector.size()];
    vector.copyInto(objectOrgTreeData);
    return(objectOrgTreeData);
  }
}
