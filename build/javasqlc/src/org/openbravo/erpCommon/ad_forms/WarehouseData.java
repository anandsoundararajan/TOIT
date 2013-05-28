//Sqlc generated V1.O00-1
package org.openbravo.erpCommon.ad_forms;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import java.util.*;

class WarehouseData implements FieldProvider {
static Logger log4j = Logger.getLogger(WarehouseData.class);
  private String InitRecordNumber="0";
  public String padre;
  public String id;
  public String name;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("padre"))
      return padre;
    else if (fieldName.equalsIgnoreCase("id"))
      return id;
    else if (fieldName.equalsIgnoreCase("name"))
      return name;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static WarehouseData[] select(ConnectionProvider connectionProvider)    throws ServletException {
    return select(connectionProvider, 0, 0);
  }

  public static WarehouseData[] select(ConnectionProvider connectionProvider, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT AD_ROLE_ORGACCESS.AD_ROLE_ID || '-' || M_Warehouse.AD_Client_ID as PADRE, M_Warehouse.M_WAREHOUSE_ID AS ID, " +
      "        M_Warehouse.Name AS Name " +
      "        FROM M_Warehouse, AD_ORG , AD_ROLE_ORGACCESS" +
      "        WHERE M_Warehouse.AD_ORG_ID = AD_ORG.AD_ORG_ID" +
      "        AND AD_ORG.AD_ORG_ID = AD_ROLE_ORGACCESS.AD_ORG_ID" +
      "        AND M_Warehouse.IsActive='Y' " +
      "        ORDER BY AD_ROLE_ORGACCESS.AD_ROLE_ID, M_Warehouse.Name";

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
        WarehouseData objectWarehouseData = new WarehouseData();
        objectWarehouseData.padre = UtilSql.getValue(result, "padre");
        objectWarehouseData.id = UtilSql.getValue(result, "id");
        objectWarehouseData.name = UtilSql.getValue(result, "name");
        objectWarehouseData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectWarehouseData);
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
    WarehouseData objectWarehouseData[] = new WarehouseData[vector.size()];
    vector.copyInto(objectWarehouseData);
    return(objectWarehouseData);
  }

  public static WarehouseData[] selectByRoleAndClient(ConnectionProvider connectionProvider, String role, String client)    throws ServletException {
    return selectByRoleAndClient(connectionProvider, role, client, 0, 0);
  }

  public static WarehouseData[] selectByRoleAndClient(ConnectionProvider connectionProvider, String role, String client, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT AD_ROLE_ORGACCESS.AD_ROLE_ID || '-' || M_Warehouse.AD_Client_ID as PADRE, M_Warehouse.M_WAREHOUSE_ID AS ID," +
      "        M_Warehouse.Name AS Name" +
      "        FROM M_Warehouse, AD_ORG , AD_ROLE_ORGACCESS" +
      "        WHERE M_Warehouse.AD_ORG_ID = AD_ORG.AD_ORG_ID" +
      "        AND AD_ORG.AD_ORG_ID = AD_ROLE_ORGACCESS.AD_ORG_ID" +
      "        AND M_Warehouse.IsActive='Y'" +
      "        AND AD_ROLE_ORGACCESS.AD_ROLE_ID = ?" +
      "        AND M_Warehouse.AD_Client_ID = ?" +
      "        ORDER BY AD_ROLE_ORGACCESS.AD_ROLE_ID, M_Warehouse.Name";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, role);
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
        WarehouseData objectWarehouseData = new WarehouseData();
        objectWarehouseData.padre = UtilSql.getValue(result, "padre");
        objectWarehouseData.id = UtilSql.getValue(result, "id");
        objectWarehouseData.name = UtilSql.getValue(result, "name");
        objectWarehouseData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectWarehouseData);
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
    WarehouseData objectWarehouseData[] = new WarehouseData[vector.size()];
    vector.copyInto(objectWarehouseData);
    return(objectWarehouseData);
  }
}
