//Sqlc generated V1.O00-1
package org.openbravo.erpWindows.Assets;

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
class AssetsData implements FieldProvider {
static Logger log4j = Logger.getLogger(AssetsData.class);
  private String InitRecordNumber="0";
  public String created;
  public String createdbyr;
  public String updated;
  public String updatedTimeStamp;
  public String updatedby;
  public String updatedbyr;
  public String adOrgId;
  public String adOrgIdr;
  public String value;
  public String name;
  public String aAssetGroupId;
  public String aAssetGroupIdr;
  public String documentno;
  public String description;
  public String cCurrencyId;
  public String cCurrencyIdr;
  public String mProductId;
  public String mProductIdr;
  public String issummary;
  public String isstatic;
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
  public String datepurchased;
  public String datecancelled;
  public String amortizationstartdate;
  public String amortizationenddate;
  public String assetvalueamt;
  public String residualassetvalueamt;
  public String amortizationvalueamt;
  public String depreciatedpreviousamt;
  public String processed;
  public String depreciatedvalue;
  public String depreciatedplan;
  public String isfullydepreciated;
  public String mAttributesetinstanceId;
  public String isactive;
  public String qty;
  public String cProjectId;
  public String cProjectIdr;
  public String processAsset;
  public String processAssetBtn;
  public String locationcomment;
  public String isinposession;
  public String aAssetId;
  public String cBpartnerLocationId;
  public String cLocationId;
  public String isdisposed;
  public String assetservicedate;
  public String adUserId;
  public String mLocatorId;
  public String assetdepreciationdate;
  public String cBpartnerId;
  public String lifeuseunits;
  public String adClientId;
  public String useunits;
  public String assetdisposaldate;
  public String guaranteedate;
  public String isowned;
  public String help;
  public String acctvalueamt;
  public String versionno;
  public String serno;
  public String profit;
  public String lot;
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
    else if (fieldName.equalsIgnoreCase("value"))
      return value;
    else if (fieldName.equalsIgnoreCase("name"))
      return name;
    else if (fieldName.equalsIgnoreCase("a_asset_group_id") || fieldName.equals("aAssetGroupId"))
      return aAssetGroupId;
    else if (fieldName.equalsIgnoreCase("a_asset_group_idr") || fieldName.equals("aAssetGroupIdr"))
      return aAssetGroupIdr;
    else if (fieldName.equalsIgnoreCase("documentno"))
      return documentno;
    else if (fieldName.equalsIgnoreCase("description"))
      return description;
    else if (fieldName.equalsIgnoreCase("c_currency_id") || fieldName.equals("cCurrencyId"))
      return cCurrencyId;
    else if (fieldName.equalsIgnoreCase("c_currency_idr") || fieldName.equals("cCurrencyIdr"))
      return cCurrencyIdr;
    else if (fieldName.equalsIgnoreCase("m_product_id") || fieldName.equals("mProductId"))
      return mProductId;
    else if (fieldName.equalsIgnoreCase("m_product_idr") || fieldName.equals("mProductIdr"))
      return mProductIdr;
    else if (fieldName.equalsIgnoreCase("issummary"))
      return issummary;
    else if (fieldName.equalsIgnoreCase("isstatic"))
      return isstatic;
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
    else if (fieldName.equalsIgnoreCase("datepurchased"))
      return datepurchased;
    else if (fieldName.equalsIgnoreCase("datecancelled"))
      return datecancelled;
    else if (fieldName.equalsIgnoreCase("amortizationstartdate"))
      return amortizationstartdate;
    else if (fieldName.equalsIgnoreCase("amortizationenddate"))
      return amortizationenddate;
    else if (fieldName.equalsIgnoreCase("assetvalueamt"))
      return assetvalueamt;
    else if (fieldName.equalsIgnoreCase("residualassetvalueamt"))
      return residualassetvalueamt;
    else if (fieldName.equalsIgnoreCase("amortizationvalueamt"))
      return amortizationvalueamt;
    else if (fieldName.equalsIgnoreCase("depreciatedpreviousamt"))
      return depreciatedpreviousamt;
    else if (fieldName.equalsIgnoreCase("processed"))
      return processed;
    else if (fieldName.equalsIgnoreCase("depreciatedvalue"))
      return depreciatedvalue;
    else if (fieldName.equalsIgnoreCase("depreciatedplan"))
      return depreciatedplan;
    else if (fieldName.equalsIgnoreCase("isfullydepreciated"))
      return isfullydepreciated;
    else if (fieldName.equalsIgnoreCase("m_attributesetinstance_id") || fieldName.equals("mAttributesetinstanceId"))
      return mAttributesetinstanceId;
    else if (fieldName.equalsIgnoreCase("isactive"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("qty"))
      return qty;
    else if (fieldName.equalsIgnoreCase("c_project_id") || fieldName.equals("cProjectId"))
      return cProjectId;
    else if (fieldName.equalsIgnoreCase("c_project_idr") || fieldName.equals("cProjectIdr"))
      return cProjectIdr;
    else if (fieldName.equalsIgnoreCase("process_asset") || fieldName.equals("processAsset"))
      return processAsset;
    else if (fieldName.equalsIgnoreCase("process_asset_btn") || fieldName.equals("processAssetBtn"))
      return processAssetBtn;
    else if (fieldName.equalsIgnoreCase("locationcomment"))
      return locationcomment;
    else if (fieldName.equalsIgnoreCase("isinposession"))
      return isinposession;
    else if (fieldName.equalsIgnoreCase("a_asset_id") || fieldName.equals("aAssetId"))
      return aAssetId;
    else if (fieldName.equalsIgnoreCase("c_bpartner_location_id") || fieldName.equals("cBpartnerLocationId"))
      return cBpartnerLocationId;
    else if (fieldName.equalsIgnoreCase("c_location_id") || fieldName.equals("cLocationId"))
      return cLocationId;
    else if (fieldName.equalsIgnoreCase("isdisposed"))
      return isdisposed;
    else if (fieldName.equalsIgnoreCase("assetservicedate"))
      return assetservicedate;
    else if (fieldName.equalsIgnoreCase("ad_user_id") || fieldName.equals("adUserId"))
      return adUserId;
    else if (fieldName.equalsIgnoreCase("m_locator_id") || fieldName.equals("mLocatorId"))
      return mLocatorId;
    else if (fieldName.equalsIgnoreCase("assetdepreciationdate"))
      return assetdepreciationdate;
    else if (fieldName.equalsIgnoreCase("c_bpartner_id") || fieldName.equals("cBpartnerId"))
      return cBpartnerId;
    else if (fieldName.equalsIgnoreCase("lifeuseunits"))
      return lifeuseunits;
    else if (fieldName.equalsIgnoreCase("ad_client_id") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("useunits"))
      return useunits;
    else if (fieldName.equalsIgnoreCase("assetdisposaldate"))
      return assetdisposaldate;
    else if (fieldName.equalsIgnoreCase("guaranteedate"))
      return guaranteedate;
    else if (fieldName.equalsIgnoreCase("isowned"))
      return isowned;
    else if (fieldName.equalsIgnoreCase("help"))
      return help;
    else if (fieldName.equalsIgnoreCase("acctvalueamt"))
      return acctvalueamt;
    else if (fieldName.equalsIgnoreCase("versionno"))
      return versionno;
    else if (fieldName.equalsIgnoreCase("serno"))
      return serno;
    else if (fieldName.equalsIgnoreCase("profit"))
      return profit;
    else if (fieldName.equalsIgnoreCase("lot"))
      return lot;
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
  public static AssetsData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static AssetsData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(A_Asset.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = A_Asset.CreatedBy) as CreatedByR, " +
      "        to_char(A_Asset.Updated, ?) as updated, " +
      "        to_char(A_Asset.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        A_Asset.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = A_Asset.UpdatedBy) as UpdatedByR," +
      "        A_Asset.AD_Org_ID, " +
      "(CASE WHEN A_Asset.AD_Org_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.Name), ''))),'') ) END) AS AD_Org_IDR, " +
      "A_Asset.Value, " +
      "A_Asset.Name, " +
      "A_Asset.A_Asset_Group_ID, " +
      "(CASE WHEN A_Asset.A_Asset_Group_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Name), ''))),'') ) END) AS A_Asset_Group_IDR, " +
      "A_Asset.DocumentNo, " +
      "A_Asset.Description, " +
      "A_Asset.C_Currency_ID, " +
      "(CASE WHEN A_Asset.C_Currency_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table3.ISO_Code), ''))),'') ) END) AS C_Currency_IDR, " +
      "A_Asset.M_Product_ID, " +
      "(CASE WHEN A_Asset.M_Product_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL4.Name IS NULL THEN TO_CHAR(table4.Name) ELSE TO_CHAR(tableTRL4.Name) END)), ''))),'') ) END) AS M_Product_IDR, " +
      "COALESCE(A_Asset.Issummary, 'N') AS Issummary, " +
      "COALESCE(A_Asset.IsStatic, 'N') AS IsStatic, " +
      "COALESCE(A_Asset.IsDepreciated, 'N') AS IsDepreciated, " +
      "A_Asset.Amortizationtype, " +
      "(CASE WHEN A_Asset.Amortizationtype IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list1.name),'') ) END) AS AmortizationtypeR, " +
      "A_Asset.Amortizationcalctype, " +
      "(CASE WHEN A_Asset.Amortizationcalctype IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list2.name),'') ) END) AS AmortizationcalctypeR, " +
      "A_Asset.Annualamortizationpercentage, " +
      "A_Asset.Assetschedule, " +
      "(CASE WHEN A_Asset.Assetschedule IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list3.name),'') ) END) AS AssetscheduleR, " +
      "A_Asset.UseLifeYears, " +
      "A_Asset.UseLifeMonths, " +
      "COALESCE(A_Asset.Is30DayMonth, 'N') AS Is30DayMonth, " +
      "A_Asset.Datepurchased, " +
      "A_Asset.Datecancelled, " +
      "A_Asset.Amortizationstartdate, " +
      "A_Asset.Amortizationenddate, " +
      "A_Asset.AssetValueAmt, " +
      "A_Asset.Residualassetvalueamt, " +
      "A_Asset.Amortizationvalueamt, " +
      "A_Asset.Depreciatedpreviousamt, " +
      "A_Asset.Processed, " +
      "A_Asset.Depreciatedvalue, " +
      "A_Asset.Depreciatedplan, " +
      "COALESCE(A_Asset.IsFullyDepreciated, 'N') AS IsFullyDepreciated, " +
      "A_Asset.M_AttributeSetInstance_ID, " +
      "COALESCE(A_Asset.IsActive, 'N') AS IsActive, " +
      "A_Asset.Qty, " +
      "A_Asset.C_Project_ID, " +
      "(CASE WHEN A_Asset.C_Project_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table5.Value), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table5.Name), ''))),'') ) END) AS C_Project_IDR, " +
      "A_Asset.Process_Asset, " +
      "list4.name as Process_Asset_BTN, " +
      "A_Asset.LocationComment, " +
      "COALESCE(A_Asset.IsInPosession, 'N') AS IsInPosession, " +
      "A_Asset.A_Asset_ID, " +
      "A_Asset.C_BPartner_Location_ID, " +
      "A_Asset.C_Location_ID, " +
      "COALESCE(A_Asset.IsDisposed, 'N') AS IsDisposed, " +
      "A_Asset.AssetServiceDate, " +
      "A_Asset.AD_User_ID, " +
      "A_Asset.M_Locator_ID, " +
      "A_Asset.AssetDepreciationDate, " +
      "A_Asset.C_BPartner_ID, " +
      "A_Asset.LifeUseUnits, " +
      "A_Asset.AD_Client_ID, " +
      "A_Asset.UseUnits, " +
      "A_Asset.AssetDisposalDate, " +
      "A_Asset.GuaranteeDate, " +
      "COALESCE(A_Asset.IsOwned, 'N') AS IsOwned, " +
      "A_Asset.Help, " +
      "A_Asset.Acctvalueamt, " +
      "A_Asset.VersionNo, " +
      "A_Asset.SerNo, " +
      "A_Asset.Profit, " +
      "A_Asset.Lot, " +
      "        ? AS LANGUAGE " +
      "        FROM A_Asset left join (select AD_Org_ID, Name from AD_Org) table1 on (A_Asset.AD_Org_ID = table1.AD_Org_ID) left join (select A_Asset_Group_ID, Name from A_Asset_Group) table2 on (A_Asset.A_Asset_Group_ID = table2.A_Asset_Group_ID) left join (select C_Currency_ID, ISO_Code from C_Currency) table3 on (A_Asset.C_Currency_ID = table3.C_Currency_ID) left join (select M_Product_ID, Name from M_Product) table4 on (A_Asset.M_Product_ID = table4.M_Product_ID) left join (select M_Product_ID,AD_Language, Name from M_Product_TRL) tableTRL4 on (table4.M_Product_ID = tableTRL4.M_Product_ID and tableTRL4.AD_Language = ?)  left join ad_ref_list_v list1 on (A_Asset.Amortizationtype = list1.value and list1.ad_reference_id = '800040' and list1.ad_language = ?)  left join ad_ref_list_v list2 on (A_Asset.Amortizationcalctype = list2.value and list2.ad_reference_id = '800068' and list2.ad_language = ?)  left join ad_ref_list_v list3 on (A_Asset.Assetschedule = list3.value and list3.ad_reference_id = '800041' and list3.ad_language = ?)  left join (select C_Project_ID, Value, Name from C_Project) table5 on (A_Asset.C_Project_ID = table5.C_Project_ID) left join ad_ref_list_v list4 on (list4.ad_reference_id = '800042' and list4.ad_language = ?  AND A_Asset.Process_Asset = TO_CHAR(list4.value))" +
      "        WHERE 2=2 " +
      "        AND 1=1 " +
      "        AND A_Asset.A_Asset_ID = ? " +
      "        AND A_Asset.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND A_Asset.AD_Org_ID IN (";
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
        AssetsData objectAssetsData = new AssetsData();
        objectAssetsData.created = UtilSql.getValue(result, "created");
        objectAssetsData.createdbyr = UtilSql.getValue(result, "createdbyr");
        objectAssetsData.updated = UtilSql.getValue(result, "updated");
        objectAssetsData.updatedTimeStamp = UtilSql.getValue(result, "updated_time_stamp");
        objectAssetsData.updatedby = UtilSql.getValue(result, "updatedby");
        objectAssetsData.updatedbyr = UtilSql.getValue(result, "updatedbyr");
        objectAssetsData.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectAssetsData.adOrgIdr = UtilSql.getValue(result, "ad_org_idr");
        objectAssetsData.value = UtilSql.getValue(result, "value");
        objectAssetsData.name = UtilSql.getValue(result, "name");
        objectAssetsData.aAssetGroupId = UtilSql.getValue(result, "a_asset_group_id");
        objectAssetsData.aAssetGroupIdr = UtilSql.getValue(result, "a_asset_group_idr");
        objectAssetsData.documentno = UtilSql.getValue(result, "documentno");
        objectAssetsData.description = UtilSql.getValue(result, "description");
        objectAssetsData.cCurrencyId = UtilSql.getValue(result, "c_currency_id");
        objectAssetsData.cCurrencyIdr = UtilSql.getValue(result, "c_currency_idr");
        objectAssetsData.mProductId = UtilSql.getValue(result, "m_product_id");
        objectAssetsData.mProductIdr = UtilSql.getValue(result, "m_product_idr");
        objectAssetsData.issummary = UtilSql.getValue(result, "issummary");
        objectAssetsData.isstatic = UtilSql.getValue(result, "isstatic");
        objectAssetsData.isdepreciated = UtilSql.getValue(result, "isdepreciated");
        objectAssetsData.amortizationtype = UtilSql.getValue(result, "amortizationtype");
        objectAssetsData.amortizationtyper = UtilSql.getValue(result, "amortizationtyper");
        objectAssetsData.amortizationcalctype = UtilSql.getValue(result, "amortizationcalctype");
        objectAssetsData.amortizationcalctyper = UtilSql.getValue(result, "amortizationcalctyper");
        objectAssetsData.annualamortizationpercentage = UtilSql.getValue(result, "annualamortizationpercentage");
        objectAssetsData.assetschedule = UtilSql.getValue(result, "assetschedule");
        objectAssetsData.assetscheduler = UtilSql.getValue(result, "assetscheduler");
        objectAssetsData.uselifeyears = UtilSql.getValue(result, "uselifeyears");
        objectAssetsData.uselifemonths = UtilSql.getValue(result, "uselifemonths");
        objectAssetsData.is30daymonth = UtilSql.getValue(result, "is30daymonth");
        objectAssetsData.datepurchased = UtilSql.getDateValue(result, "datepurchased", "dd-MM-yyyy");
        objectAssetsData.datecancelled = UtilSql.getDateValue(result, "datecancelled", "dd-MM-yyyy");
        objectAssetsData.amortizationstartdate = UtilSql.getDateValue(result, "amortizationstartdate", "dd-MM-yyyy");
        objectAssetsData.amortizationenddate = UtilSql.getDateValue(result, "amortizationenddate", "dd-MM-yyyy");
        objectAssetsData.assetvalueamt = UtilSql.getValue(result, "assetvalueamt");
        objectAssetsData.residualassetvalueamt = UtilSql.getValue(result, "residualassetvalueamt");
        objectAssetsData.amortizationvalueamt = UtilSql.getValue(result, "amortizationvalueamt");
        objectAssetsData.depreciatedpreviousamt = UtilSql.getValue(result, "depreciatedpreviousamt");
        objectAssetsData.processed = UtilSql.getValue(result, "processed");
        objectAssetsData.depreciatedvalue = UtilSql.getValue(result, "depreciatedvalue");
        objectAssetsData.depreciatedplan = UtilSql.getValue(result, "depreciatedplan");
        objectAssetsData.isfullydepreciated = UtilSql.getValue(result, "isfullydepreciated");
        objectAssetsData.mAttributesetinstanceId = UtilSql.getValue(result, "m_attributesetinstance_id");
        objectAssetsData.isactive = UtilSql.getValue(result, "isactive");
        objectAssetsData.qty = UtilSql.getValue(result, "qty");
        objectAssetsData.cProjectId = UtilSql.getValue(result, "c_project_id");
        objectAssetsData.cProjectIdr = UtilSql.getValue(result, "c_project_idr");
        objectAssetsData.processAsset = UtilSql.getValue(result, "process_asset");
        objectAssetsData.processAssetBtn = UtilSql.getValue(result, "process_asset_btn");
        objectAssetsData.locationcomment = UtilSql.getValue(result, "locationcomment");
        objectAssetsData.isinposession = UtilSql.getValue(result, "isinposession");
        objectAssetsData.aAssetId = UtilSql.getValue(result, "a_asset_id");
        objectAssetsData.cBpartnerLocationId = UtilSql.getValue(result, "c_bpartner_location_id");
        objectAssetsData.cLocationId = UtilSql.getValue(result, "c_location_id");
        objectAssetsData.isdisposed = UtilSql.getValue(result, "isdisposed");
        objectAssetsData.assetservicedate = UtilSql.getDateValue(result, "assetservicedate", "dd-MM-yyyy");
        objectAssetsData.adUserId = UtilSql.getValue(result, "ad_user_id");
        objectAssetsData.mLocatorId = UtilSql.getValue(result, "m_locator_id");
        objectAssetsData.assetdepreciationdate = UtilSql.getDateValue(result, "assetdepreciationdate", "dd-MM-yyyy");
        objectAssetsData.cBpartnerId = UtilSql.getValue(result, "c_bpartner_id");
        objectAssetsData.lifeuseunits = UtilSql.getValue(result, "lifeuseunits");
        objectAssetsData.adClientId = UtilSql.getValue(result, "ad_client_id");
        objectAssetsData.useunits = UtilSql.getValue(result, "useunits");
        objectAssetsData.assetdisposaldate = UtilSql.getDateValue(result, "assetdisposaldate", "dd-MM-yyyy");
        objectAssetsData.guaranteedate = UtilSql.getDateValue(result, "guaranteedate", "dd-MM-yyyy");
        objectAssetsData.isowned = UtilSql.getValue(result, "isowned");
        objectAssetsData.help = UtilSql.getValue(result, "help");
        objectAssetsData.acctvalueamt = UtilSql.getValue(result, "acctvalueamt");
        objectAssetsData.versionno = UtilSql.getValue(result, "versionno");
        objectAssetsData.serno = UtilSql.getValue(result, "serno");
        objectAssetsData.profit = UtilSql.getValue(result, "profit");
        objectAssetsData.lot = UtilSql.getValue(result, "lot");
        objectAssetsData.language = UtilSql.getValue(result, "language");
        objectAssetsData.adUserClient = "";
        objectAssetsData.adOrgClient = "";
        objectAssetsData.createdby = "";
        objectAssetsData.trBgcolor = "";
        objectAssetsData.totalCount = "";
        objectAssetsData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectAssetsData);
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
    AssetsData objectAssetsData[] = new AssetsData[vector.size()];
    vector.copyInto(objectAssetsData);
    return(objectAssetsData);
  }

/**
Create a registry
 */
  public static AssetsData[] set(String processAsset, String processAssetBtn, String cProjectId, String cProjectIdr, String datepurchased, String datecancelled, String amortizationstartdate, String amortizationenddate, String annualamortizationpercentage, String cCurrencyId, String assetvalueamt, String residualassetvalueamt, String mAttributesetinstanceId, String acctvalueamt, String amortizationtype, String amortizationvalueamt, String assetschedule, String documentno, String processed, String processedBtn, String profit, String qty, String depreciatedvalue, String depreciatedplan, String amortizationcalctype, String depreciatedpreviousamt, String lot, String adUserId, String isdisposed, String mLocatorId, String isinposession, String isactive, String assetdepreciationdate, String createdby, String createdbyr, String uselifeyears, String mProductId, String mProductIdr, String assetdisposaldate, String cLocationId, String aAssetGroupId, String adOrgId, String versionno, String value, String isowned, String name, String description, String locationcomment, String isdepreciated, String lifeuseunits, String help, String updatedby, String updatedbyr, String adClientId, String cBpartnerId, String guaranteedate, String uselifemonths, String assetservicedate, String useunits, String aAssetId, String serno, String cBpartnerLocationId, String isfullydepreciated, String isstatic, String issummary, String is30daymonth)    throws ServletException {
    AssetsData objectAssetsData[] = new AssetsData[1];
    objectAssetsData[0] = new AssetsData();
    objectAssetsData[0].created = "";
    objectAssetsData[0].createdbyr = createdbyr;
    objectAssetsData[0].updated = "";
    objectAssetsData[0].updatedTimeStamp = "";
    objectAssetsData[0].updatedby = updatedby;
    objectAssetsData[0].updatedbyr = updatedbyr;
    objectAssetsData[0].adOrgId = adOrgId;
    objectAssetsData[0].adOrgIdr = "";
    objectAssetsData[0].value = value;
    objectAssetsData[0].name = name;
    objectAssetsData[0].aAssetGroupId = aAssetGroupId;
    objectAssetsData[0].aAssetGroupIdr = "";
    objectAssetsData[0].documentno = documentno;
    objectAssetsData[0].description = description;
    objectAssetsData[0].cCurrencyId = cCurrencyId;
    objectAssetsData[0].cCurrencyIdr = "";
    objectAssetsData[0].mProductId = mProductId;
    objectAssetsData[0].mProductIdr = mProductIdr;
    objectAssetsData[0].issummary = issummary;
    objectAssetsData[0].isstatic = isstatic;
    objectAssetsData[0].isdepreciated = isdepreciated;
    objectAssetsData[0].amortizationtype = amortizationtype;
    objectAssetsData[0].amortizationtyper = "";
    objectAssetsData[0].amortizationcalctype = amortizationcalctype;
    objectAssetsData[0].amortizationcalctyper = "";
    objectAssetsData[0].annualamortizationpercentage = annualamortizationpercentage;
    objectAssetsData[0].assetschedule = assetschedule;
    objectAssetsData[0].assetscheduler = "";
    objectAssetsData[0].uselifeyears = uselifeyears;
    objectAssetsData[0].uselifemonths = uselifemonths;
    objectAssetsData[0].is30daymonth = is30daymonth;
    objectAssetsData[0].datepurchased = datepurchased;
    objectAssetsData[0].datecancelled = datecancelled;
    objectAssetsData[0].amortizationstartdate = amortizationstartdate;
    objectAssetsData[0].amortizationenddate = amortizationenddate;
    objectAssetsData[0].assetvalueamt = assetvalueamt;
    objectAssetsData[0].residualassetvalueamt = residualassetvalueamt;
    objectAssetsData[0].amortizationvalueamt = amortizationvalueamt;
    objectAssetsData[0].depreciatedpreviousamt = depreciatedpreviousamt;
    objectAssetsData[0].processed = processed;
    objectAssetsData[0].depreciatedvalue = depreciatedvalue;
    objectAssetsData[0].depreciatedplan = depreciatedplan;
    objectAssetsData[0].isfullydepreciated = isfullydepreciated;
    objectAssetsData[0].mAttributesetinstanceId = mAttributesetinstanceId;
    objectAssetsData[0].isactive = isactive;
    objectAssetsData[0].qty = qty;
    objectAssetsData[0].cProjectId = cProjectId;
    objectAssetsData[0].cProjectIdr = cProjectIdr;
    objectAssetsData[0].processAsset = processAsset;
    objectAssetsData[0].processAssetBtn = processAssetBtn;
    objectAssetsData[0].locationcomment = locationcomment;
    objectAssetsData[0].isinposession = isinposession;
    objectAssetsData[0].aAssetId = aAssetId;
    objectAssetsData[0].cBpartnerLocationId = cBpartnerLocationId;
    objectAssetsData[0].cLocationId = cLocationId;
    objectAssetsData[0].isdisposed = isdisposed;
    objectAssetsData[0].assetservicedate = assetservicedate;
    objectAssetsData[0].adUserId = adUserId;
    objectAssetsData[0].mLocatorId = mLocatorId;
    objectAssetsData[0].assetdepreciationdate = assetdepreciationdate;
    objectAssetsData[0].cBpartnerId = cBpartnerId;
    objectAssetsData[0].lifeuseunits = lifeuseunits;
    objectAssetsData[0].adClientId = adClientId;
    objectAssetsData[0].useunits = useunits;
    objectAssetsData[0].assetdisposaldate = assetdisposaldate;
    objectAssetsData[0].guaranteedate = guaranteedate;
    objectAssetsData[0].isowned = isowned;
    objectAssetsData[0].help = help;
    objectAssetsData[0].acctvalueamt = acctvalueamt;
    objectAssetsData[0].versionno = versionno;
    objectAssetsData[0].serno = serno;
    objectAssetsData[0].profit = profit;
    objectAssetsData[0].lot = lot;
    objectAssetsData[0].language = "";
    return objectAssetsData;
  }

/**
Select for auxiliar field
 */
  public static String selectAux0C9EAE5805B14C159CE74DAF015A12C9(ConnectionProvider connectionProvider, String M_Product_ID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT M_ATTRIBUTESET_ID FROM M_PRODUCT WHERE M_PRODUCT_ID=? ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, M_Product_ID);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "m_attributeset_id");
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
  public static String selectAux42236E76CCB2491B8B2E5BCDA4E83624(ConnectionProvider connectionProvider, String M_Product_ID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT ATTRSETVALUETYPE FROM M_PRODUCT WHERE M_PRODUCT_ID=? ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, M_Product_ID);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "attrsetvaluetype");
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
  public static String selectAuxAD306651FEC841DF9D01E831482C6A09(ConnectionProvider connectionProvider, String A_Asset_ID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        select 'Y' from dual where exists (select 1 from a_amortizationline where a_amortizationline.a_asset_id  = ?) ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, A_Asset_ID);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "?column?");
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
  public static String selectDef3808ABE5D08E4650A2DE65596DB61F49_0(ConnectionProvider connectionProvider, String C_Project_IDR)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Value), ''))), '')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Name), ''))), '') ) as C_Project_ID FROM C_Project left join (select C_Project_ID, Value, Name from C_Project) table2 on (C_Project.C_Project_ID = table2.C_Project_ID) WHERE C_Project.isActive='Y' AND C_Project.C_Project_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_Project_IDR);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "c_project_id");
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
  public static String selectDef8045_1(ConnectionProvider connectionProvider, String CreatedByR)    throws ServletException {
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
  public static String selectDef8047_2(ConnectionProvider connectionProvider, String paramLanguage, String M_Product_IDR)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL2.Name IS NULL THEN TO_CHAR(table2.Name) ELSE TO_CHAR(tableTRL2.Name) END)), ''))), '') ) as M_Product_ID FROM M_Product left join (select M_Product_ID, Name from M_Product) table2 on (M_Product.M_Product_ID = table2.M_Product_ID)left join (select M_Product_ID,AD_Language, Name from M_Product_TRL) tableTRL2 on (table2.M_Product_ID = tableTRL2.M_Product_ID and tableTRL2.AD_Language = ?)  WHERE M_Product.isActive='Y' AND M_Product.M_Product_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, M_Product_IDR);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "m_product_id");
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
  public static String selectDef8063_3(ConnectionProvider connectionProvider, String UpdatedByR)    throws ServletException {
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
      "        UPDATE A_Asset" +
      "        SET AD_Org_ID = (?) , Value = (?) , Name = (?) , A_Asset_Group_ID = (?) , DocumentNo = (?) , Description = (?) , C_Currency_ID = (?) , M_Product_ID = (?) , Issummary = (?) , IsStatic = (?) , IsDepreciated = (?) , Amortizationtype = (?) , Amortizationcalctype = (?) , Annualamortizationpercentage = TO_NUMBER(?) , Assetschedule = (?) , UseLifeYears = TO_NUMBER(?) , UseLifeMonths = TO_NUMBER(?) , Is30DayMonth = (?) , Datepurchased = TO_DATE(?) , Datecancelled = TO_DATE(?) , Amortizationstartdate = TO_DATE(?) , Amortizationenddate = TO_DATE(?) , AssetValueAmt = TO_NUMBER(?) , Residualassetvalueamt = TO_NUMBER(?) , Amortizationvalueamt = TO_NUMBER(?) , Depreciatedpreviousamt = TO_NUMBER(?) , Processed = (?) , Depreciatedvalue = TO_NUMBER(?) , Depreciatedplan = TO_NUMBER(?) , IsFullyDepreciated = (?) , M_AttributeSetInstance_ID = (?) , IsActive = (?) , Qty = TO_NUMBER(?) , C_Project_ID = (?) , Process_Asset = (?) , LocationComment = (?) , IsInPosession = (?) , A_Asset_ID = (?) , C_BPartner_Location_ID = (?) , C_Location_ID = (?) , IsDisposed = (?) , AssetServiceDate = TO_DATE(?) , AD_User_ID = (?) , M_Locator_ID = (?) , AssetDepreciationDate = TO_DATE(?) , C_BPartner_ID = (?) , LifeUseUnits = TO_NUMBER(?) , AD_Client_ID = (?) , UseUnits = TO_NUMBER(?) , AssetDisposalDate = TO_DATE(?) , GuaranteeDate = TO_DATE(?) , IsOwned = (?) , Help = (?) , Acctvalueamt = TO_NUMBER(?) , VersionNo = (?) , SerNo = (?) , Profit = TO_NUMBER(?) , Lot = (?) , updated = now(), updatedby = ? " +
      "        WHERE A_Asset.A_Asset_ID = ? " +
      "        AND A_Asset.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND A_Asset.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, value);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, name);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, aAssetGroupId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, documentno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCurrencyId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, issummary);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isstatic);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isdepreciated);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, amortizationtype);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, amortizationcalctype);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, annualamortizationpercentage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, assetschedule);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, uselifeyears);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, uselifemonths);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, is30daymonth);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, datepurchased);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, datecancelled);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, amortizationstartdate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, amortizationenddate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, assetvalueamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, residualassetvalueamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, amortizationvalueamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, depreciatedpreviousamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processed);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, depreciatedvalue);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, depreciatedplan);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isfullydepreciated);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mAttributesetinstanceId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qty);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cProjectId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processAsset);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, locationcomment);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isinposession);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, aAssetId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerLocationId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cLocationId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isdisposed);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, assetservicedate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mLocatorId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, assetdepreciationdate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lifeuseunits);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, useunits);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, assetdisposaldate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, guaranteedate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isowned);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, help);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, acctvalueamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, versionno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, serno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, profit);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lot);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, aAssetId);
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
      "        INSERT INTO A_Asset " +
      "        (AD_Org_ID, Value, Name, A_Asset_Group_ID, DocumentNo, Description, C_Currency_ID, M_Product_ID, Issummary, IsStatic, IsDepreciated, Amortizationtype, Amortizationcalctype, Annualamortizationpercentage, Assetschedule, UseLifeYears, UseLifeMonths, Is30DayMonth, Datepurchased, Datecancelled, Amortizationstartdate, Amortizationenddate, AssetValueAmt, Residualassetvalueamt, Amortizationvalueamt, Depreciatedpreviousamt, Processed, Depreciatedvalue, Depreciatedplan, IsFullyDepreciated, M_AttributeSetInstance_ID, IsActive, Qty, C_Project_ID, Process_Asset, LocationComment, IsInPosession, A_Asset_ID, C_BPartner_Location_ID, C_Location_ID, IsDisposed, AssetServiceDate, AD_User_ID, M_Locator_ID, AssetDepreciationDate, C_BPartner_ID, LifeUseUnits, AD_Client_ID, UseUnits, AssetDisposalDate, GuaranteeDate, IsOwned, Help, Acctvalueamt, VersionNo, SerNo, Profit, Lot, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), TO_NUMBER(?), (?), TO_NUMBER(?), TO_NUMBER(?), (?), TO_DATE(?), TO_DATE(?), TO_DATE(?), TO_DATE(?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), (?), TO_NUMBER(?), TO_NUMBER(?), (?), (?), (?), TO_NUMBER(?), (?), (?), (?), (?), (?), (?), (?), (?), TO_DATE(?), (?), (?), TO_DATE(?), (?), TO_NUMBER(?), (?), TO_NUMBER(?), TO_DATE(?), TO_DATE(?), (?), (?), TO_NUMBER(?), (?), (?), TO_NUMBER(?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, value);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, name);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, aAssetGroupId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, documentno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCurrencyId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, issummary);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isstatic);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isdepreciated);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, amortizationtype);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, amortizationcalctype);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, annualamortizationpercentage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, assetschedule);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, uselifeyears);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, uselifemonths);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, is30daymonth);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, datepurchased);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, datecancelled);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, amortizationstartdate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, amortizationenddate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, assetvalueamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, residualassetvalueamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, amortizationvalueamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, depreciatedpreviousamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processed);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, depreciatedvalue);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, depreciatedplan);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isfullydepreciated);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mAttributesetinstanceId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qty);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cProjectId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processAsset);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, locationcomment);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isinposession);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, aAssetId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerLocationId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cLocationId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isdisposed);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, assetservicedate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mLocatorId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, assetdepreciationdate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lifeuseunits);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, useunits);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, assetdisposaldate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, guaranteedate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isowned);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, help);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, acctvalueamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, versionno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, serno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, profit);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lot);
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
      "        DELETE FROM A_Asset" +
      "        WHERE A_Asset.A_Asset_ID = ? " +
      "        AND A_Asset.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND A_Asset.AD_Org_ID IN (";
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
      "          FROM A_Asset" +
      "         WHERE A_Asset.A_Asset_ID = ? ";

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
      "          FROM A_Asset" +
      "         WHERE A_Asset.A_Asset_ID = ? ";

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
