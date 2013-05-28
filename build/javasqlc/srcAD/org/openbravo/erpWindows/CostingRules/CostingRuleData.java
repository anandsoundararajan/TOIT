//Sqlc generated V1.O00-1
package org.openbravo.erpWindows.CostingRules;

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
class CostingRuleData implements FieldProvider {
static Logger log4j = Logger.getLogger(CostingRuleData.class);
  private String InitRecordNumber="0";
  public String created;
  public String createdbyr;
  public String updated;
  public String updatedTimeStamp;
  public String updatedby;
  public String updatedbyr;
  public String adOrgId;
  public String adOrgIdr;
  public String mCostingAlgorithmId;
  public String mCostingAlgorithmIdr;
  public String datefrom;
  public String warehouseDimension;
  public String mCostingRuleId;
  public String processRule;
  public String adClientId;
  public String isactive;
  public String isvalidated;
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
    else if (fieldName.equalsIgnoreCase("ad_org_id") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("ad_org_idr") || fieldName.equals("adOrgIdr"))
      return adOrgIdr;
    else if (fieldName.equalsIgnoreCase("m_costing_algorithm_id") || fieldName.equals("mCostingAlgorithmId"))
      return mCostingAlgorithmId;
    else if (fieldName.equalsIgnoreCase("m_costing_algorithm_idr") || fieldName.equals("mCostingAlgorithmIdr"))
      return mCostingAlgorithmIdr;
    else if (fieldName.equalsIgnoreCase("datefrom"))
      return datefrom;
    else if (fieldName.equalsIgnoreCase("warehouse_dimension") || fieldName.equals("warehouseDimension"))
      return warehouseDimension;
    else if (fieldName.equalsIgnoreCase("m_costing_rule_id") || fieldName.equals("mCostingRuleId"))
      return mCostingRuleId;
    else if (fieldName.equalsIgnoreCase("process_rule") || fieldName.equals("processRule"))
      return processRule;
    else if (fieldName.equalsIgnoreCase("ad_client_id") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("isactive"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("isvalidated"))
      return isvalidated;
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
  public static CostingRuleData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static CostingRuleData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(M_Costing_Rule.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = M_Costing_Rule.CreatedBy) as CreatedByR, " +
      "        to_char(M_Costing_Rule.Updated, ?) as updated, " +
      "        to_char(M_Costing_Rule.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        M_Costing_Rule.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = M_Costing_Rule.UpdatedBy) as UpdatedByR," +
      "        M_Costing_Rule.AD_Org_ID, " +
      "(CASE WHEN M_Costing_Rule.AD_Org_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.Name), ''))),'') ) END) AS AD_Org_IDR, " +
      "M_Costing_Rule.M_Costing_Algorithm_ID, " +
      "(CASE WHEN M_Costing_Rule.M_Costing_Algorithm_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Name), ''))),'') ) END) AS M_Costing_Algorithm_IDR, " +
      "TO_CHAR(M_Costing_Rule.Datefrom, ?) AS Datefrom, " +
      "COALESCE(M_Costing_Rule.Warehouse_Dimension, 'N') AS Warehouse_Dimension, " +
      "M_Costing_Rule.M_Costing_Rule_ID, " +
      "M_Costing_Rule.Process_Rule, " +
      "M_Costing_Rule.AD_Client_ID, " +
      "COALESCE(M_Costing_Rule.Isactive, 'N') AS Isactive, " +
      "COALESCE(M_Costing_Rule.IsValidated, 'N') AS IsValidated, " +
      "        ? AS LANGUAGE " +
      "        FROM M_Costing_Rule left join (select AD_Org_ID, Name from AD_Org) table1 on (M_Costing_Rule.AD_Org_ID = table1.AD_Org_ID) left join (select M_Costing_Algorithm_ID, Name from M_Costing_Algorithm) table2 on (M_Costing_Rule.M_Costing_Algorithm_ID = table2.M_Costing_Algorithm_ID)" +
      "        WHERE 2=2 " +
      "        AND 1=1 " +
      "        AND M_Costing_Rule.M_Costing_Rule_ID = ? " +
      "        AND M_Costing_Rule.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND M_Costing_Rule.AD_Org_ID IN (";
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
        CostingRuleData objectCostingRuleData = new CostingRuleData();
        objectCostingRuleData.created = UtilSql.getValue(result, "created");
        objectCostingRuleData.createdbyr = UtilSql.getValue(result, "createdbyr");
        objectCostingRuleData.updated = UtilSql.getValue(result, "updated");
        objectCostingRuleData.updatedTimeStamp = UtilSql.getValue(result, "updated_time_stamp");
        objectCostingRuleData.updatedby = UtilSql.getValue(result, "updatedby");
        objectCostingRuleData.updatedbyr = UtilSql.getValue(result, "updatedbyr");
        objectCostingRuleData.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectCostingRuleData.adOrgIdr = UtilSql.getValue(result, "ad_org_idr");
        objectCostingRuleData.mCostingAlgorithmId = UtilSql.getValue(result, "m_costing_algorithm_id");
        objectCostingRuleData.mCostingAlgorithmIdr = UtilSql.getValue(result, "m_costing_algorithm_idr");
        objectCostingRuleData.datefrom = UtilSql.getValue(result, "datefrom");
        objectCostingRuleData.warehouseDimension = UtilSql.getValue(result, "warehouse_dimension");
        objectCostingRuleData.mCostingRuleId = UtilSql.getValue(result, "m_costing_rule_id");
        objectCostingRuleData.processRule = UtilSql.getValue(result, "process_rule");
        objectCostingRuleData.adClientId = UtilSql.getValue(result, "ad_client_id");
        objectCostingRuleData.isactive = UtilSql.getValue(result, "isactive");
        objectCostingRuleData.isvalidated = UtilSql.getValue(result, "isvalidated");
        objectCostingRuleData.language = UtilSql.getValue(result, "language");
        objectCostingRuleData.adUserClient = "";
        objectCostingRuleData.adOrgClient = "";
        objectCostingRuleData.createdby = "";
        objectCostingRuleData.trBgcolor = "";
        objectCostingRuleData.totalCount = "";
        objectCostingRuleData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectCostingRuleData);
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
    CostingRuleData objectCostingRuleData[] = new CostingRuleData[vector.size()];
    vector.copyInto(objectCostingRuleData);
    return(objectCostingRuleData);
  }

/**
Create a registry
 */
  public static CostingRuleData[] set(String mCostingRuleId, String adClientId, String adOrgId, String createdby, String createdbyr, String updatedby, String updatedbyr, String isactive, String mCostingAlgorithmId, String datefrom, String warehouseDimension, String isvalidated, String processRule)    throws ServletException {
    CostingRuleData objectCostingRuleData[] = new CostingRuleData[1];
    objectCostingRuleData[0] = new CostingRuleData();
    objectCostingRuleData[0].created = "";
    objectCostingRuleData[0].createdbyr = createdbyr;
    objectCostingRuleData[0].updated = "";
    objectCostingRuleData[0].updatedTimeStamp = "";
    objectCostingRuleData[0].updatedby = updatedby;
    objectCostingRuleData[0].updatedbyr = updatedbyr;
    objectCostingRuleData[0].adOrgId = adOrgId;
    objectCostingRuleData[0].adOrgIdr = "";
    objectCostingRuleData[0].mCostingAlgorithmId = mCostingAlgorithmId;
    objectCostingRuleData[0].mCostingAlgorithmIdr = "";
    objectCostingRuleData[0].datefrom = datefrom;
    objectCostingRuleData[0].warehouseDimension = warehouseDimension;
    objectCostingRuleData[0].mCostingRuleId = mCostingRuleId;
    objectCostingRuleData[0].processRule = processRule;
    objectCostingRuleData[0].adClientId = adClientId;
    objectCostingRuleData[0].isactive = isactive;
    objectCostingRuleData[0].isvalidated = isvalidated;
    objectCostingRuleData[0].language = "";
    return objectCostingRuleData;
  }

/**
Select for auxiliar field
 */
  public static String selectAuxBD5BE8557B94430A93CF1C6D56C2C8AB(ConnectionProvider connectionProvider, String ad_org_id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT MAX(1) FROM m_costing_rule WHERE ad_org_id = ? ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ad_org_id);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "max");
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
  public static String selectDefB928EB7E7BE41DBCE040007F01004E08_0(ConnectionProvider connectionProvider, String CreatedbyR)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Name), ''))), '') ) as Createdby FROM AD_User left join (select AD_User_ID, Name from AD_User) table2 on (AD_User.AD_User_ID = table2.AD_User_ID) WHERE AD_User.isActive='Y' AND AD_User.AD_User_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, CreatedbyR);

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
  public static String selectDefB928EB7E7BE61DBCE040007F01004E08_1(ConnectionProvider connectionProvider, String UpdatedbyR)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Name), ''))), '') ) as Updatedby FROM AD_User left join (select AD_User_ID, Name from AD_User) table2 on (AD_User.AD_User_ID = table2.AD_User_ID) WHERE AD_User.isActive='Y' AND AD_User.AD_User_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, UpdatedbyR);

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
      "        UPDATE M_Costing_Rule" +
      "        SET AD_Org_ID = (?) , M_Costing_Algorithm_ID = (?) , Datefrom = TO_TIMESTAMP(?, ?) , Warehouse_Dimension = (?) , M_Costing_Rule_ID = (?) , Process_Rule = (?) , AD_Client_ID = (?) , Isactive = (?) , IsValidated = (?) , updated = now(), updatedby = ? " +
      "        WHERE M_Costing_Rule.M_Costing_Rule_ID = ? " +
      "        AND M_Costing_Rule.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND M_Costing_Rule.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mCostingAlgorithmId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, datefrom);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateTimeFormat);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, warehouseDimension);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mCostingRuleId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processRule);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isvalidated);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mCostingRuleId);
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
      "        INSERT INTO M_Costing_Rule " +
      "        (AD_Org_ID, M_Costing_Algorithm_ID, Datefrom, Warehouse_Dimension, M_Costing_Rule_ID, Process_Rule, AD_Client_ID, Isactive, IsValidated, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), TO_TIMESTAMP(?, ?), (?), (?), (?), (?), (?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mCostingAlgorithmId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, datefrom);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateTimeFormat);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, warehouseDimension);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mCostingRuleId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processRule);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isvalidated);
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
      "        DELETE FROM M_Costing_Rule" +
      "        WHERE M_Costing_Rule.M_Costing_Rule_ID = ? " +
      "        AND M_Costing_Rule.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND M_Costing_Rule.AD_Org_ID IN (";
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
      "          FROM M_Costing_Rule" +
      "         WHERE M_Costing_Rule.M_Costing_Rule_ID = ? ";

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
      "          FROM M_Costing_Rule" +
      "         WHERE M_Costing_Rule.M_Costing_Rule_ID = ? ";

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
