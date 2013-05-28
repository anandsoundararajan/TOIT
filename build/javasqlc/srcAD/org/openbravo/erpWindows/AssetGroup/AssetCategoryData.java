//Sqlc generated V1.O00-1
package org.openbravo.erpWindows.AssetGroup;

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
class AssetCategoryData implements FieldProvider {
static Logger log4j = Logger.getLogger(AssetCategoryData.class);
  private String InitRecordNumber="0";
  public String created;
  public String createdbyr;
  public String updated;
  public String updatedTimeStamp;
  public String updatedby;
  public String updatedbyr;
  public String adOrgId;
  public String adOrgIdr;
  public String name;
  public String description;
  public String isactive;
  public String help;
  public String isdepreciated;
  public String amortizationtype;
  public String amortizationtyper;
  public String amortizationcalctype;
  public String amortizationcalctyper;
  public String annualamortizationpercentage;
  public String assetschedule;
  public String assetscheduler;
  public String uselifeyears;
  public String uselifemonths;
  public String is30daymonth;
  public String adClientId;
  public String isowned;
  public String aAssetGroupId;
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
    else if (fieldName.equalsIgnoreCase("name"))
      return name;
    else if (fieldName.equalsIgnoreCase("description"))
      return description;
    else if (fieldName.equalsIgnoreCase("isactive"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("help"))
      return help;
    else if (fieldName.equalsIgnoreCase("isdepreciated"))
      return isdepreciated;
    else if (fieldName.equalsIgnoreCase("amortizationtype"))
      return amortizationtype;
    else if (fieldName.equalsIgnoreCase("amortizationtyper"))
      return amortizationtyper;
    else if (fieldName.equalsIgnoreCase("amortizationcalctype"))
      return amortizationcalctype;
    else if (fieldName.equalsIgnoreCase("amortizationcalctyper"))
      return amortizationcalctyper;
    else if (fieldName.equalsIgnoreCase("annualamortizationpercentage"))
      return annualamortizationpercentage;
    else if (fieldName.equalsIgnoreCase("assetschedule"))
      return assetschedule;
    else if (fieldName.equalsIgnoreCase("assetscheduler"))
      return assetscheduler;
    else if (fieldName.equalsIgnoreCase("uselifeyears"))
      return uselifeyears;
    else if (fieldName.equalsIgnoreCase("uselifemonths"))
      return uselifemonths;
    else if (fieldName.equalsIgnoreCase("is30daymonth"))
      return is30daymonth;
    else if (fieldName.equalsIgnoreCase("ad_client_id") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("isowned"))
      return isowned;
    else if (fieldName.equalsIgnoreCase("a_asset_group_id") || fieldName.equals("aAssetGroupId"))
      return aAssetGroupId;
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
  public static AssetCategoryData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static AssetCategoryData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(A_Asset_Group.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = A_Asset_Group.CreatedBy) as CreatedByR, " +
      "        to_char(A_Asset_Group.Updated, ?) as updated, " +
      "        to_char(A_Asset_Group.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        A_Asset_Group.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = A_Asset_Group.UpdatedBy) as UpdatedByR," +
      "        A_Asset_Group.AD_Org_ID, " +
      "(CASE WHEN A_Asset_Group.AD_Org_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.Name), ''))),'') ) END) AS AD_Org_IDR, " +
      "A_Asset_Group.Name, " +
      "A_Asset_Group.Description, " +
      "COALESCE(A_Asset_Group.IsActive, 'N') AS IsActive, " +
      "A_Asset_Group.Help, " +
      "COALESCE(A_Asset_Group.IsDepreciated, 'N') AS IsDepreciated, " +
      "A_Asset_Group.Amortizationtype, " +
      "(CASE WHEN A_Asset_Group.Amortizationtype IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list1.name),'') ) END) AS AmortizationtypeR, " +
      "A_Asset_Group.Amortizationcalctype, " +
      "(CASE WHEN A_Asset_Group.Amortizationcalctype IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list2.name),'') ) END) AS AmortizationcalctypeR, " +
      "A_Asset_Group.Annualamortizationpercentage, " +
      "A_Asset_Group.Assetschedule, " +
      "(CASE WHEN A_Asset_Group.Assetschedule IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list3.name),'') ) END) AS AssetscheduleR, " +
      "A_Asset_Group.UseLifeYears, " +
      "A_Asset_Group.UseLifeMonths, " +
      "COALESCE(A_Asset_Group.Is30DayMonth, 'N') AS Is30DayMonth, " +
      "A_Asset_Group.AD_Client_ID, " +
      "COALESCE(A_Asset_Group.Isowned, 'N') AS Isowned, " +
      "A_Asset_Group.A_Asset_Group_ID, " +
      "        ? AS LANGUAGE " +
      "        FROM A_Asset_Group left join (select AD_Org_ID, Name from AD_Org) table1 on (A_Asset_Group.AD_Org_ID = table1.AD_Org_ID) left join ad_ref_list_v list1 on (A_Asset_Group.Amortizationtype = list1.value and list1.ad_reference_id = '800040' and list1.ad_language = ?)  left join ad_ref_list_v list2 on (A_Asset_Group.Amortizationcalctype = list2.value and list2.ad_reference_id = '800068' and list2.ad_language = ?)  left join ad_ref_list_v list3 on (A_Asset_Group.Assetschedule = list3.value and list3.ad_reference_id = '800041' and list3.ad_language = ?) " +
      "        WHERE 2=2 " +
      "        AND 1=1 " +
      "        AND A_Asset_Group.A_Asset_Group_ID = ? " +
      "        AND A_Asset_Group.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND A_Asset_Group.AD_Org_ID IN (";
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
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
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
        AssetCategoryData objectAssetCategoryData = new AssetCategoryData();
        objectAssetCategoryData.created = UtilSql.getValue(result, "created");
        objectAssetCategoryData.createdbyr = UtilSql.getValue(result, "createdbyr");
        objectAssetCategoryData.updated = UtilSql.getValue(result, "updated");
        objectAssetCategoryData.updatedTimeStamp = UtilSql.getValue(result, "updated_time_stamp");
        objectAssetCategoryData.updatedby = UtilSql.getValue(result, "updatedby");
        objectAssetCategoryData.updatedbyr = UtilSql.getValue(result, "updatedbyr");
        objectAssetCategoryData.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectAssetCategoryData.adOrgIdr = UtilSql.getValue(result, "ad_org_idr");
        objectAssetCategoryData.name = UtilSql.getValue(result, "name");
        objectAssetCategoryData.description = UtilSql.getValue(result, "description");
        objectAssetCategoryData.isactive = UtilSql.getValue(result, "isactive");
        objectAssetCategoryData.help = UtilSql.getValue(result, "help");
        objectAssetCategoryData.isdepreciated = UtilSql.getValue(result, "isdepreciated");
        objectAssetCategoryData.amortizationtype = UtilSql.getValue(result, "amortizationtype");
        objectAssetCategoryData.amortizationtyper = UtilSql.getValue(result, "amortizationtyper");
        objectAssetCategoryData.amortizationcalctype = UtilSql.getValue(result, "amortizationcalctype");
        objectAssetCategoryData.amortizationcalctyper = UtilSql.getValue(result, "amortizationcalctyper");
        objectAssetCategoryData.annualamortizationpercentage = UtilSql.getValue(result, "annualamortizationpercentage");
        objectAssetCategoryData.assetschedule = UtilSql.getValue(result, "assetschedule");
        objectAssetCategoryData.assetscheduler = UtilSql.getValue(result, "assetscheduler");
        objectAssetCategoryData.uselifeyears = UtilSql.getValue(result, "uselifeyears");
        objectAssetCategoryData.uselifemonths = UtilSql.getValue(result, "uselifemonths");
        objectAssetCategoryData.is30daymonth = UtilSql.getValue(result, "is30daymonth");
        objectAssetCategoryData.adClientId = UtilSql.getValue(result, "ad_client_id");
        objectAssetCategoryData.isowned = UtilSql.getValue(result, "isowned");
        objectAssetCategoryData.aAssetGroupId = UtilSql.getValue(result, "a_asset_group_id");
        objectAssetCategoryData.language = UtilSql.getValue(result, "language");
        objectAssetCategoryData.adUserClient = "";
        objectAssetCategoryData.adOrgClient = "";
        objectAssetCategoryData.createdby = "";
        objectAssetCategoryData.trBgcolor = "";
        objectAssetCategoryData.totalCount = "";
        objectAssetCategoryData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectAssetCategoryData);
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
    AssetCategoryData objectAssetCategoryData[] = new AssetCategoryData[vector.size()];
    vector.copyInto(objectAssetCategoryData);
    return(objectAssetCategoryData);
  }

/**
Create a registry
 */
  public static AssetCategoryData[] set(String amortizationcalctype, String is30daymonth, String annualamortizationpercentage, String uselifeyears, String isowned, String name, String description, String help, String createdby, String createdbyr, String adOrgId, String isactive, String adClientId, String aAssetGroupId, String isdepreciated, String updatedby, String updatedbyr, String amortizationtype, String assetschedule, String uselifemonths)    throws ServletException {
    AssetCategoryData objectAssetCategoryData[] = new AssetCategoryData[1];
    objectAssetCategoryData[0] = new AssetCategoryData();
    objectAssetCategoryData[0].created = "";
    objectAssetCategoryData[0].createdbyr = createdbyr;
    objectAssetCategoryData[0].updated = "";
    objectAssetCategoryData[0].updatedTimeStamp = "";
    objectAssetCategoryData[0].updatedby = updatedby;
    objectAssetCategoryData[0].updatedbyr = updatedbyr;
    objectAssetCategoryData[0].adOrgId = adOrgId;
    objectAssetCategoryData[0].adOrgIdr = "";
    objectAssetCategoryData[0].name = name;
    objectAssetCategoryData[0].description = description;
    objectAssetCategoryData[0].isactive = isactive;
    objectAssetCategoryData[0].help = help;
    objectAssetCategoryData[0].isdepreciated = isdepreciated;
    objectAssetCategoryData[0].amortizationtype = amortizationtype;
    objectAssetCategoryData[0].amortizationtyper = "";
    objectAssetCategoryData[0].amortizationcalctype = amortizationcalctype;
    objectAssetCategoryData[0].amortizationcalctyper = "";
    objectAssetCategoryData[0].annualamortizationpercentage = annualamortizationpercentage;
    objectAssetCategoryData[0].assetschedule = assetschedule;
    objectAssetCategoryData[0].assetscheduler = "";
    objectAssetCategoryData[0].uselifeyears = uselifeyears;
    objectAssetCategoryData[0].uselifemonths = uselifemonths;
    objectAssetCategoryData[0].is30daymonth = is30daymonth;
    objectAssetCategoryData[0].adClientId = adClientId;
    objectAssetCategoryData[0].isowned = isowned;
    objectAssetCategoryData[0].aAssetGroupId = aAssetGroupId;
    objectAssetCategoryData[0].language = "";
    return objectAssetCategoryData;
  }

/**
Select for auxiliar field
 */
  public static String selectDef8109_0(ConnectionProvider connectionProvider, String CreatedByR)    throws ServletException {
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
  public static String selectDef8116_1(ConnectionProvider connectionProvider, String UpdatedByR)    throws ServletException {
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
      "        UPDATE A_Asset_Group" +
      "        SET AD_Org_ID = (?) , Name = (?) , Description = (?) , IsActive = (?) , Help = (?) , IsDepreciated = (?) , Amortizationtype = (?) , Amortizationcalctype = (?) , Annualamortizationpercentage = TO_NUMBER(?) , Assetschedule = (?) , UseLifeYears = TO_NUMBER(?) , UseLifeMonths = TO_NUMBER(?) , Is30DayMonth = (?) , AD_Client_ID = (?) , Isowned = (?) , A_Asset_Group_ID = (?) , updated = now(), updatedby = ? " +
      "        WHERE A_Asset_Group.A_Asset_Group_ID = ? " +
      "        AND A_Asset_Group.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND A_Asset_Group.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, name);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, help);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isdepreciated);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, amortizationtype);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, amortizationcalctype);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, annualamortizationpercentage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, assetschedule);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, uselifeyears);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, uselifemonths);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, is30daymonth);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isowned);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, aAssetGroupId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, aAssetGroupId);
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
      "        INSERT INTO A_Asset_Group " +
      "        (AD_Org_ID, Name, Description, IsActive, Help, IsDepreciated, Amortizationtype, Amortizationcalctype, Annualamortizationpercentage, Assetschedule, UseLifeYears, UseLifeMonths, Is30DayMonth, AD_Client_ID, Isowned, A_Asset_Group_ID, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), (?), (?), (?), (?), (?), (?), TO_NUMBER(?), (?), TO_NUMBER(?), TO_NUMBER(?), (?), (?), (?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, name);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, help);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isdepreciated);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, amortizationtype);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, amortizationcalctype);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, annualamortizationpercentage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, assetschedule);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, uselifeyears);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, uselifemonths);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, is30daymonth);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isowned);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, aAssetGroupId);
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
      "        DELETE FROM A_Asset_Group" +
      "        WHERE A_Asset_Group.A_Asset_Group_ID = ? " +
      "        AND A_Asset_Group.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND A_Asset_Group.AD_Org_ID IN (";
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
      "          FROM A_Asset_Group" +
      "         WHERE A_Asset_Group.A_Asset_Group_ID = ? ";

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
      "          FROM A_Asset_Group" +
      "         WHERE A_Asset_Group.A_Asset_Group_ID = ? ";

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
