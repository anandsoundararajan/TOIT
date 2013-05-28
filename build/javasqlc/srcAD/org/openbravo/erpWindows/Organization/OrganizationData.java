//Sqlc generated V1.O00-1
package org.openbravo.erpWindows.Organization;

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
class OrganizationData implements FieldProvider {
static Logger log4j = Logger.getLogger(OrganizationData.class);
  private String InitRecordNumber="0";
  public String created;
  public String createdbyr;
  public String updated;
  public String updatedTimeStamp;
  public String updatedby;
  public String updatedbyr;
  public String value;
  public String name;
  public String description;
  public String isactive;
  public String issummary;
  public String socialName;
  public String adOrgtypeId;
  public String adOrgtypeIdr;
  public String cCurrencyId;
  public String cCurrencyIdr;
  public String isperiodcontrolallowed;
  public String cCalendarId;
  public String cCalendarIdr;
  public String isready;
  public String cAcctschemaId;
  public String cAcctschemaIdr;
  public String emObretcoProductlistId;
  public String emObretcoProductlistIdr;
  public String emObretcoCBpartnerId;
  public String emObretcoCBpartnerIdr;
  public String emObretcoCBpLocationId;
  public String emObretcoCBpLocationIdr;
  public String emObretcoMWarehouseId;
  public String emObretcoDbpIrulesid;
  public String emObretcoDbpIrulesidr;
  public String emObretcoDbpPtermid;
  public String emObretcoDbpPtermidr;
  public String emObretcoDbpPmethodid;
  public String emObretcoDbpPmethodidr;
  public String emObretcoDbpBpcatid;
  public String emObretcoDbpBpcatidr;
  public String emObretcoDbpCountryid;
  public String emObretcoDbpCountryidr;
  public String emObretcoDbpOrgid;
  public String emObretcoDbpOrgidr;
  public String emObretcoShowtaxid;
  public String emObretcoShowbpcategory;
  public String adOrgId;
  public String adClientId;
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
    else if (fieldName.equalsIgnoreCase("value"))
      return value;
    else if (fieldName.equalsIgnoreCase("name"))
      return name;
    else if (fieldName.equalsIgnoreCase("description"))
      return description;
    else if (fieldName.equalsIgnoreCase("isactive"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("issummary"))
      return issummary;
    else if (fieldName.equalsIgnoreCase("social_name") || fieldName.equals("socialName"))
      return socialName;
    else if (fieldName.equalsIgnoreCase("ad_orgtype_id") || fieldName.equals("adOrgtypeId"))
      return adOrgtypeId;
    else if (fieldName.equalsIgnoreCase("ad_orgtype_idr") || fieldName.equals("adOrgtypeIdr"))
      return adOrgtypeIdr;
    else if (fieldName.equalsIgnoreCase("c_currency_id") || fieldName.equals("cCurrencyId"))
      return cCurrencyId;
    else if (fieldName.equalsIgnoreCase("c_currency_idr") || fieldName.equals("cCurrencyIdr"))
      return cCurrencyIdr;
    else if (fieldName.equalsIgnoreCase("isperiodcontrolallowed"))
      return isperiodcontrolallowed;
    else if (fieldName.equalsIgnoreCase("c_calendar_id") || fieldName.equals("cCalendarId"))
      return cCalendarId;
    else if (fieldName.equalsIgnoreCase("c_calendar_idr") || fieldName.equals("cCalendarIdr"))
      return cCalendarIdr;
    else if (fieldName.equalsIgnoreCase("isready"))
      return isready;
    else if (fieldName.equalsIgnoreCase("c_acctschema_id") || fieldName.equals("cAcctschemaId"))
      return cAcctschemaId;
    else if (fieldName.equalsIgnoreCase("c_acctschema_idr") || fieldName.equals("cAcctschemaIdr"))
      return cAcctschemaIdr;
    else if (fieldName.equalsIgnoreCase("em_obretco_productlist_id") || fieldName.equals("emObretcoProductlistId"))
      return emObretcoProductlistId;
    else if (fieldName.equalsIgnoreCase("em_obretco_productlist_idr") || fieldName.equals("emObretcoProductlistIdr"))
      return emObretcoProductlistIdr;
    else if (fieldName.equalsIgnoreCase("em_obretco_c_bpartner_id") || fieldName.equals("emObretcoCBpartnerId"))
      return emObretcoCBpartnerId;
    else if (fieldName.equalsIgnoreCase("em_obretco_c_bpartner_idr") || fieldName.equals("emObretcoCBpartnerIdr"))
      return emObretcoCBpartnerIdr;
    else if (fieldName.equalsIgnoreCase("em_obretco_c_bp_location_id") || fieldName.equals("emObretcoCBpLocationId"))
      return emObretcoCBpLocationId;
    else if (fieldName.equalsIgnoreCase("em_obretco_c_bp_location_idr") || fieldName.equals("emObretcoCBpLocationIdr"))
      return emObretcoCBpLocationIdr;
    else if (fieldName.equalsIgnoreCase("em_obretco_m_warehouse_id") || fieldName.equals("emObretcoMWarehouseId"))
      return emObretcoMWarehouseId;
    else if (fieldName.equalsIgnoreCase("em_obretco_dbp_irulesid") || fieldName.equals("emObretcoDbpIrulesid"))
      return emObretcoDbpIrulesid;
    else if (fieldName.equalsIgnoreCase("em_obretco_dbp_irulesidr") || fieldName.equals("emObretcoDbpIrulesidr"))
      return emObretcoDbpIrulesidr;
    else if (fieldName.equalsIgnoreCase("em_obretco_dbp_ptermid") || fieldName.equals("emObretcoDbpPtermid"))
      return emObretcoDbpPtermid;
    else if (fieldName.equalsIgnoreCase("em_obretco_dbp_ptermidr") || fieldName.equals("emObretcoDbpPtermidr"))
      return emObretcoDbpPtermidr;
    else if (fieldName.equalsIgnoreCase("em_obretco_dbp_pmethodid") || fieldName.equals("emObretcoDbpPmethodid"))
      return emObretcoDbpPmethodid;
    else if (fieldName.equalsIgnoreCase("em_obretco_dbp_pmethodidr") || fieldName.equals("emObretcoDbpPmethodidr"))
      return emObretcoDbpPmethodidr;
    else if (fieldName.equalsIgnoreCase("em_obretco_dbp_bpcatid") || fieldName.equals("emObretcoDbpBpcatid"))
      return emObretcoDbpBpcatid;
    else if (fieldName.equalsIgnoreCase("em_obretco_dbp_bpcatidr") || fieldName.equals("emObretcoDbpBpcatidr"))
      return emObretcoDbpBpcatidr;
    else if (fieldName.equalsIgnoreCase("em_obretco_dbp_countryid") || fieldName.equals("emObretcoDbpCountryid"))
      return emObretcoDbpCountryid;
    else if (fieldName.equalsIgnoreCase("em_obretco_dbp_countryidr") || fieldName.equals("emObretcoDbpCountryidr"))
      return emObretcoDbpCountryidr;
    else if (fieldName.equalsIgnoreCase("em_obretco_dbp_orgid") || fieldName.equals("emObretcoDbpOrgid"))
      return emObretcoDbpOrgid;
    else if (fieldName.equalsIgnoreCase("em_obretco_dbp_orgidr") || fieldName.equals("emObretcoDbpOrgidr"))
      return emObretcoDbpOrgidr;
    else if (fieldName.equalsIgnoreCase("em_obretco_showtaxid") || fieldName.equals("emObretcoShowtaxid"))
      return emObretcoShowtaxid;
    else if (fieldName.equalsIgnoreCase("em_obretco_showbpcategory") || fieldName.equals("emObretcoShowbpcategory"))
      return emObretcoShowbpcategory;
    else if (fieldName.equalsIgnoreCase("ad_org_id") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("ad_client_id") || fieldName.equals("adClientId"))
      return adClientId;
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
  public static OrganizationData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static OrganizationData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(AD_Org.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = AD_Org.CreatedBy) as CreatedByR, " +
      "        to_char(AD_Org.Updated, ?) as updated, " +
      "        to_char(AD_Org.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        AD_Org.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = AD_Org.UpdatedBy) as UpdatedByR," +
      "        AD_Org.Value, " +
      "AD_Org.Name, " +
      "AD_Org.Description, " +
      "COALESCE(AD_Org.IsActive, 'N') AS IsActive, " +
      "COALESCE(AD_Org.IsSummary, 'N') AS IsSummary, " +
      "AD_Org.Social_Name, " +
      "AD_Org.AD_Orgtype_ID, " +
      "(CASE WHEN AD_Org.AD_Orgtype_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.Name), ''))),'') ) END) AS AD_Orgtype_IDR, " +
      "AD_Org.C_Currency_ID, " +
      "(CASE WHEN AD_Org.C_Currency_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.ISO_Code), ''))),'') ) END) AS C_Currency_IDR, " +
      "COALESCE(AD_Org.IsPeriodControlAllowed, 'N') AS IsPeriodControlAllowed, " +
      "AD_Org.C_Calendar_ID, " +
      "(CASE WHEN AD_Org.C_Calendar_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table3.Name), ''))),'') ) END) AS C_Calendar_IDR, " +
      "AD_Org.IsReady, " +
      "AD_Org.C_Acctschema_ID, " +
      "(CASE WHEN AD_Org.C_Acctschema_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table4.Name), ''))),'') ) END) AS C_Acctschema_IDR, " +
      "AD_Org.EM_OBRETCO_Productlist_ID, " +
      "(CASE WHEN AD_Org.EM_OBRETCO_Productlist_ID IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table5.Name), ''))),'') ) END) AS EM_OBRETCO_Productlist_IDR, " +
      "AD_Org.EM_Obretco_C_Bpartner_ID, " +
      "(CASE WHEN AD_Org.EM_Obretco_C_Bpartner_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table6.Name), ''))),'') ) END) AS EM_Obretco_C_Bpartner_IDR, " +
      "AD_Org.EM_Obretco_C_bp_Location_ID, " +
      "(CASE WHEN AD_Org.EM_Obretco_C_bp_Location_ID IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table7.Name), ''))),'') ) END) AS EM_Obretco_C_bp_Location_IDR, " +
      "AD_Org.EM_Obretco_M_Warehouse_ID, " +
      "AD_Org.EM_Obretco_dbp_irulesid, " +
      "(CASE WHEN AD_Org.EM_Obretco_dbp_irulesid IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list1.name),'') ) END) AS EM_Obretco_dbp_irulesidR, " +
      "AD_Org.EM_Obretco_dbp_ptermid, " +
      "(CASE WHEN AD_Org.EM_Obretco_dbp_ptermid IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL8.Name IS NULL THEN TO_CHAR(table8.Name) ELSE TO_CHAR(tableTRL8.Name) END)), ''))),'') ) END) AS EM_Obretco_dbp_ptermidR, " +
      "AD_Org.EM_Obretco_dbp_pmethodid, " +
      "(CASE WHEN AD_Org.EM_Obretco_dbp_pmethodid IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table9.Name), ''))),'') ) END) AS EM_Obretco_dbp_pmethodidR, " +
      "AD_Org.EM_Obretco_dbp_bpcatid, " +
      "(CASE WHEN AD_Org.EM_Obretco_dbp_bpcatid IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table10.Name), ''))),'') ) END) AS EM_Obretco_dbp_bpcatidR, " +
      "AD_Org.EM_Obretco_dbp_countryid, " +
      "(CASE WHEN AD_Org.EM_Obretco_dbp_countryid IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL11.Name IS NULL THEN TO_CHAR(table11.Name) ELSE TO_CHAR(tableTRL11.Name) END)), ''))),'') ) END) AS EM_Obretco_dbp_countryidR, " +
      "AD_Org.EM_Obretco_dbp_orgid, " +
      "(CASE WHEN AD_Org.EM_Obretco_dbp_orgid IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table12.Name), ''))),'') ) END) AS EM_Obretco_dbp_orgidR, " +
      "COALESCE(AD_Org.EM_Obretco_Showtaxid, 'N') AS EM_Obretco_Showtaxid, " +
      "COALESCE(AD_Org.EM_Obretco_Showbpcategory, 'N') AS EM_Obretco_Showbpcategory, " +
      "AD_Org.AD_Org_ID, " +
      "AD_Org.AD_Client_ID, " +
      "        ? AS LANGUAGE " +
      "        FROM AD_Org left join (select AD_Orgtype_ID, Name from AD_Orgtype) table1 on (AD_Org.AD_Orgtype_ID = table1.AD_Orgtype_ID) left join (select C_Currency_ID, ISO_Code from C_Currency) table2 on (AD_Org.C_Currency_ID = table2.C_Currency_ID) left join (select C_Calendar_ID, Name from C_Calendar) table3 on (AD_Org.C_Calendar_ID = table3.C_Calendar_ID) left join (select C_Acctschema_ID, Name from C_Acctschema) table4 on (AD_Org.C_Acctschema_ID = table4.C_Acctschema_ID) left join (select Obretco_Productlist_ID, Name from OBRETCO_ProductList) table5 on (AD_Org.EM_OBRETCO_Productlist_ID =  table5.Obretco_Productlist_ID) left join (select C_BPartner_ID, Name from C_BPartner) table6 on (AD_Org.EM_Obretco_C_Bpartner_ID = table6.C_BPartner_ID) left join (select C_BPartner_Location_ID, Name from C_BPartner_Location) table7 on (AD_Org.EM_Obretco_C_bp_Location_ID =  table7.C_BPartner_Location_ID) left join ad_ref_list_v list1 on (AD_Org.EM_Obretco_dbp_irulesid = list1.value and list1.ad_reference_id = '150' and list1.ad_language = ?)  left join (select C_PaymentTerm_ID, Name from C_PaymentTerm) table8 on (AD_Org.EM_Obretco_dbp_ptermid =  table8.C_PaymentTerm_ID) left join (select C_PaymentTerm_ID,AD_Language, Name from C_PaymentTerm_TRL) tableTRL8 on (table8.C_PaymentTerm_ID = tableTRL8.C_PaymentTerm_ID and tableTRL8.AD_Language = ?)  left join (select Fin_Paymentmethod_ID, Name from FIN_PaymentMethod) table9 on (AD_Org.EM_Obretco_dbp_pmethodid =  table9.Fin_Paymentmethod_ID) left join (select C_BP_Group_ID, Name from C_BP_Group) table10 on (AD_Org.EM_Obretco_dbp_bpcatid =  table10.C_BP_Group_ID) left join (select C_Country_ID, Name from C_Country) table11 on (AD_Org.EM_Obretco_dbp_countryid =  table11.C_Country_ID) left join (select C_Country_ID,AD_Language, Name from C_Country_TRL) tableTRL11 on (table11.C_Country_ID = tableTRL11.C_Country_ID and tableTRL11.AD_Language = ?)  left join (select AD_Org_ID, Name from AD_Org) table12 on (AD_Org.EM_Obretco_dbp_orgid =  table12.AD_Org_ID)" +
      "        WHERE 2=2 " +
      "        AND 1=1 " +
      "        AND AD_Org.AD_Org_ID = ? " +
      "        AND AD_Org.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND AD_Org.AD_Org_ID IN (";
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
        OrganizationData objectOrganizationData = new OrganizationData();
        objectOrganizationData.created = UtilSql.getValue(result, "created");
        objectOrganizationData.createdbyr = UtilSql.getValue(result, "createdbyr");
        objectOrganizationData.updated = UtilSql.getValue(result, "updated");
        objectOrganizationData.updatedTimeStamp = UtilSql.getValue(result, "updated_time_stamp");
        objectOrganizationData.updatedby = UtilSql.getValue(result, "updatedby");
        objectOrganizationData.updatedbyr = UtilSql.getValue(result, "updatedbyr");
        objectOrganizationData.value = UtilSql.getValue(result, "value");
        objectOrganizationData.name = UtilSql.getValue(result, "name");
        objectOrganizationData.description = UtilSql.getValue(result, "description");
        objectOrganizationData.isactive = UtilSql.getValue(result, "isactive");
        objectOrganizationData.issummary = UtilSql.getValue(result, "issummary");
        objectOrganizationData.socialName = UtilSql.getValue(result, "social_name");
        objectOrganizationData.adOrgtypeId = UtilSql.getValue(result, "ad_orgtype_id");
        objectOrganizationData.adOrgtypeIdr = UtilSql.getValue(result, "ad_orgtype_idr");
        objectOrganizationData.cCurrencyId = UtilSql.getValue(result, "c_currency_id");
        objectOrganizationData.cCurrencyIdr = UtilSql.getValue(result, "c_currency_idr");
        objectOrganizationData.isperiodcontrolallowed = UtilSql.getValue(result, "isperiodcontrolallowed");
        objectOrganizationData.cCalendarId = UtilSql.getValue(result, "c_calendar_id");
        objectOrganizationData.cCalendarIdr = UtilSql.getValue(result, "c_calendar_idr");
        objectOrganizationData.isready = UtilSql.getValue(result, "isready");
        objectOrganizationData.cAcctschemaId = UtilSql.getValue(result, "c_acctschema_id");
        objectOrganizationData.cAcctschemaIdr = UtilSql.getValue(result, "c_acctschema_idr");
        objectOrganizationData.emObretcoProductlistId = UtilSql.getValue(result, "em_obretco_productlist_id");
        objectOrganizationData.emObretcoProductlistIdr = UtilSql.getValue(result, "em_obretco_productlist_idr");
        objectOrganizationData.emObretcoCBpartnerId = UtilSql.getValue(result, "em_obretco_c_bpartner_id");
        objectOrganizationData.emObretcoCBpartnerIdr = UtilSql.getValue(result, "em_obretco_c_bpartner_idr");
        objectOrganizationData.emObretcoCBpLocationId = UtilSql.getValue(result, "em_obretco_c_bp_location_id");
        objectOrganizationData.emObretcoCBpLocationIdr = UtilSql.getValue(result, "em_obretco_c_bp_location_idr");
        objectOrganizationData.emObretcoMWarehouseId = UtilSql.getValue(result, "em_obretco_m_warehouse_id");
        objectOrganizationData.emObretcoDbpIrulesid = UtilSql.getValue(result, "em_obretco_dbp_irulesid");
        objectOrganizationData.emObretcoDbpIrulesidr = UtilSql.getValue(result, "em_obretco_dbp_irulesidr");
        objectOrganizationData.emObretcoDbpPtermid = UtilSql.getValue(result, "em_obretco_dbp_ptermid");
        objectOrganizationData.emObretcoDbpPtermidr = UtilSql.getValue(result, "em_obretco_dbp_ptermidr");
        objectOrganizationData.emObretcoDbpPmethodid = UtilSql.getValue(result, "em_obretco_dbp_pmethodid");
        objectOrganizationData.emObretcoDbpPmethodidr = UtilSql.getValue(result, "em_obretco_dbp_pmethodidr");
        objectOrganizationData.emObretcoDbpBpcatid = UtilSql.getValue(result, "em_obretco_dbp_bpcatid");
        objectOrganizationData.emObretcoDbpBpcatidr = UtilSql.getValue(result, "em_obretco_dbp_bpcatidr");
        objectOrganizationData.emObretcoDbpCountryid = UtilSql.getValue(result, "em_obretco_dbp_countryid");
        objectOrganizationData.emObretcoDbpCountryidr = UtilSql.getValue(result, "em_obretco_dbp_countryidr");
        objectOrganizationData.emObretcoDbpOrgid = UtilSql.getValue(result, "em_obretco_dbp_orgid");
        objectOrganizationData.emObretcoDbpOrgidr = UtilSql.getValue(result, "em_obretco_dbp_orgidr");
        objectOrganizationData.emObretcoShowtaxid = UtilSql.getValue(result, "em_obretco_showtaxid");
        objectOrganizationData.emObretcoShowbpcategory = UtilSql.getValue(result, "em_obretco_showbpcategory");
        objectOrganizationData.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectOrganizationData.adClientId = UtilSql.getValue(result, "ad_client_id");
        objectOrganizationData.language = UtilSql.getValue(result, "language");
        objectOrganizationData.adUserClient = "";
        objectOrganizationData.adOrgClient = "";
        objectOrganizationData.createdby = "";
        objectOrganizationData.trBgcolor = "";
        objectOrganizationData.totalCount = "";
        objectOrganizationData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectOrganizationData);
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
    OrganizationData objectOrganizationData[] = new OrganizationData[vector.size()];
    vector.copyInto(objectOrganizationData);
    return(objectOrganizationData);
  }

/**
Create a registry
 */
  public static OrganizationData[] set(String emObretcoDbpIrulesid, String value, String emObretcoMWarehouseId, String issummary, String emObretcoProductlistId, String emObretcoDbpPmethodid, String emObretcoDbpOrgid, String cAcctschemaId, String emObretcoDbpCountryid, String emObretcoShowtaxid, String name, String description, String adClientId, String adOrgId, String adOrgtypeId, String isperiodcontrolallowed, String cCalendarId, String isready, String socialName, String isactive, String createdby, String createdbyr, String updatedby, String updatedbyr, String emObretcoCBpartnerId, String emObretcoCBpartnerIdr, String cCurrencyId, String emObretcoCBpLocationId, String emObretcoDbpBpcatid, String emObretcoShowbpcategory, String emObretcoDbpPtermid)    throws ServletException {
    OrganizationData objectOrganizationData[] = new OrganizationData[1];
    objectOrganizationData[0] = new OrganizationData();
    objectOrganizationData[0].created = "";
    objectOrganizationData[0].createdbyr = createdbyr;
    objectOrganizationData[0].updated = "";
    objectOrganizationData[0].updatedTimeStamp = "";
    objectOrganizationData[0].updatedby = updatedby;
    objectOrganizationData[0].updatedbyr = updatedbyr;
    objectOrganizationData[0].value = value;
    objectOrganizationData[0].name = name;
    objectOrganizationData[0].description = description;
    objectOrganizationData[0].isactive = isactive;
    objectOrganizationData[0].issummary = issummary;
    objectOrganizationData[0].socialName = socialName;
    objectOrganizationData[0].adOrgtypeId = adOrgtypeId;
    objectOrganizationData[0].adOrgtypeIdr = "";
    objectOrganizationData[0].cCurrencyId = cCurrencyId;
    objectOrganizationData[0].cCurrencyIdr = "";
    objectOrganizationData[0].isperiodcontrolallowed = isperiodcontrolallowed;
    objectOrganizationData[0].cCalendarId = cCalendarId;
    objectOrganizationData[0].cCalendarIdr = "";
    objectOrganizationData[0].isready = isready;
    objectOrganizationData[0].cAcctschemaId = cAcctschemaId;
    objectOrganizationData[0].cAcctschemaIdr = "";
    objectOrganizationData[0].emObretcoProductlistId = emObretcoProductlistId;
    objectOrganizationData[0].emObretcoProductlistIdr = "";
    objectOrganizationData[0].emObretcoCBpartnerId = emObretcoCBpartnerId;
    objectOrganizationData[0].emObretcoCBpartnerIdr = emObretcoCBpartnerIdr;
    objectOrganizationData[0].emObretcoCBpLocationId = emObretcoCBpLocationId;
    objectOrganizationData[0].emObretcoCBpLocationIdr = "";
    objectOrganizationData[0].emObretcoMWarehouseId = emObretcoMWarehouseId;
    objectOrganizationData[0].emObretcoDbpIrulesid = emObretcoDbpIrulesid;
    objectOrganizationData[0].emObretcoDbpIrulesidr = "";
    objectOrganizationData[0].emObretcoDbpPtermid = emObretcoDbpPtermid;
    objectOrganizationData[0].emObretcoDbpPtermidr = "";
    objectOrganizationData[0].emObretcoDbpPmethodid = emObretcoDbpPmethodid;
    objectOrganizationData[0].emObretcoDbpPmethodidr = "";
    objectOrganizationData[0].emObretcoDbpBpcatid = emObretcoDbpBpcatid;
    objectOrganizationData[0].emObretcoDbpBpcatidr = "";
    objectOrganizationData[0].emObretcoDbpCountryid = emObretcoDbpCountryid;
    objectOrganizationData[0].emObretcoDbpCountryidr = "";
    objectOrganizationData[0].emObretcoDbpOrgid = emObretcoDbpOrgid;
    objectOrganizationData[0].emObretcoDbpOrgidr = "";
    objectOrganizationData[0].emObretcoShowtaxid = emObretcoShowtaxid;
    objectOrganizationData[0].emObretcoShowbpcategory = emObretcoShowbpcategory;
    objectOrganizationData[0].adOrgId = adOrgId;
    objectOrganizationData[0].adClientId = adClientId;
    objectOrganizationData[0].language = "";
    return objectOrganizationData;
  }

/**
Select for auxiliar field
 */
  public static String selectAux022E77136C554D3A9A23E95A724E7BC1(ConnectionProvider connectionProvider, String AD_ORG_ID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT 'Y' FROM AD_ORGTYPE OT join ad_org o on (ot.ad_orgtype_id = o.ad_orgtype_id)" +
      "WHERE ((IsAcctLegalEntity<>'N' or IsLegalEntity<>'Y') or (o.C_ACCTSCHEMA_ID is not null)) and o.ad_org_id=? ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, AD_ORG_ID);

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
  public static String selectAuxCA8005C0F23945E89C4AD3C7899E5E89(ConnectionProvider connectionProvider, String AD_ORG_ID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT 'Y' FROM ad_org, ad_orgtype WHERE ad_org.ad_orgtype_id= ad_orgtype.ad_orgtype_id AND ad_org.ad_org_id=? AND (ISBUSINESSUNIT='Y' OR (ISLEGALENTITY='Y' AND ISACCTLEGALENTITY='Y')) ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, AD_ORG_ID);

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
  public static String selectDef713_0(ConnectionProvider connectionProvider, String CreatedByR)    throws ServletException {
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
  public static String selectDef715_1(ConnectionProvider connectionProvider, String UpdatedByR)    throws ServletException {
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

/**
Select for auxiliar field
 */
  public static String selectDef7E0E52EEBCC348ED9D726C46B639673F_2(ConnectionProvider connectionProvider, String EM_Obretco_C_Bpartner_IDR)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Name), ''))), '') ) as EM_Obretco_C_Bpartner_ID FROM C_BPartner left join (select C_BPartner_ID, Name from C_BPartner) table2 on (C_BPartner.C_BPartner_ID = table2.C_BPartner_ID) WHERE C_BPartner.isActive='Y' AND C_BPartner.C_BPartner_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, EM_Obretco_C_Bpartner_IDR);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "em_obretco_c_bpartner_id");
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
      "        UPDATE AD_Org" +
      "        SET Value = (?) , Name = (?) , Description = (?) , IsActive = (?) , IsSummary = (?) , Social_Name = (?) , AD_Orgtype_ID = (?) , C_Currency_ID = (?) , IsPeriodControlAllowed = (?) , C_Calendar_ID = (?) , IsReady = (?) , C_Acctschema_ID = (?) , EM_OBRETCO_Productlist_ID = (?) , EM_Obretco_C_Bpartner_ID = (?) , EM_Obretco_C_bp_Location_ID = (?) , EM_Obretco_M_Warehouse_ID = (?) , EM_Obretco_dbp_irulesid = (?) , EM_Obretco_dbp_ptermid = (?) , EM_Obretco_dbp_pmethodid = (?) , EM_Obretco_dbp_bpcatid = (?) , EM_Obretco_dbp_countryid = (?) , EM_Obretco_dbp_orgid = (?) , EM_Obretco_Showtaxid = (?) , EM_Obretco_Showbpcategory = (?) , AD_Org_ID = (?) , AD_Client_ID = (?) , updated = now(), updatedby = ? " +
      "        WHERE AD_Org.AD_Org_ID = ? " +
      "        AND AD_Org.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND AD_Org.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, value);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, name);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, issummary);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, socialName);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgtypeId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCurrencyId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isperiodcontrolallowed);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCalendarId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isready);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cAcctschemaId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emObretcoProductlistId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emObretcoCBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emObretcoCBpLocationId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emObretcoMWarehouseId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emObretcoDbpIrulesid);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emObretcoDbpPtermid);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emObretcoDbpPmethodid);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emObretcoDbpBpcatid);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emObretcoDbpCountryid);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emObretcoDbpOrgid);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emObretcoShowtaxid);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emObretcoShowbpcategory);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
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
      "        INSERT INTO AD_Org " +
      "        (Value, Name, Description, IsActive, IsSummary, Social_Name, AD_Orgtype_ID, C_Currency_ID, IsPeriodControlAllowed, C_Calendar_ID, IsReady, C_Acctschema_ID, EM_OBRETCO_Productlist_ID, EM_Obretco_C_Bpartner_ID, EM_Obretco_C_bp_Location_ID, EM_Obretco_M_Warehouse_ID, EM_Obretco_dbp_irulesid, EM_Obretco_dbp_ptermid, EM_Obretco_dbp_pmethodid, EM_Obretco_dbp_bpcatid, EM_Obretco_dbp_countryid, EM_Obretco_dbp_orgid, EM_Obretco_Showtaxid, EM_Obretco_Showbpcategory, AD_Org_ID, AD_Client_ID, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, value);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, name);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, issummary);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, socialName);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgtypeId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCurrencyId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isperiodcontrolallowed);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCalendarId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isready);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cAcctschemaId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emObretcoProductlistId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emObretcoCBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emObretcoCBpLocationId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emObretcoMWarehouseId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emObretcoDbpIrulesid);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emObretcoDbpPtermid);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emObretcoDbpPmethodid);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emObretcoDbpBpcatid);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emObretcoDbpCountryid);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emObretcoDbpOrgid);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emObretcoShowtaxid);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emObretcoShowbpcategory);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
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
      "        DELETE FROM AD_Org" +
      "        WHERE AD_Org.AD_Org_ID = ? " +
      "        AND AD_Org.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND AD_Org.AD_Org_ID IN (";
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
      "          FROM AD_Org" +
      "         WHERE AD_Org.AD_Org_ID = ? ";

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
      "          FROM AD_Org" +
      "         WHERE AD_Org.AD_Org_ID = ? ";

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
