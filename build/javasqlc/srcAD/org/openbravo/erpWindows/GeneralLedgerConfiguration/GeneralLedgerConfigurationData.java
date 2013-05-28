//Sqlc generated V1.O00-1
package org.openbravo.erpWindows.GeneralLedgerConfiguration;

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
class GeneralLedgerConfigurationData implements FieldProvider {
static Logger log4j = Logger.getLogger(GeneralLedgerConfigurationData.class);
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
  public String gaap;
  public String gaapr;
  public String cCurrencyId;
  public String cCurrencyIdr;
  public String cPeriodId;
  public String separator;
  public String allownegative;
  public String isaccrual;
  public String costingmethod;
  public String autoperiodcontrol;
  public String periodOpenhistory;
  public String periodOpenfuture;
  public String hasalias;
  public String istradediscountposted;
  public String isdiscountcorrectstax;
  public String iscentrallymaintained;
  public String isassetpositive;
  public String isliabilitypositive;
  public String isequitypositive;
  public String isrevenuepositive;
  public String isexpensepositive;
  public String hascombination;
  public String adClientId;
  public String cAcctschemaId;
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
    else if (fieldName.equalsIgnoreCase("gaap"))
      return gaap;
    else if (fieldName.equalsIgnoreCase("gaapr"))
      return gaapr;
    else if (fieldName.equalsIgnoreCase("c_currency_id") || fieldName.equals("cCurrencyId"))
      return cCurrencyId;
    else if (fieldName.equalsIgnoreCase("c_currency_idr") || fieldName.equals("cCurrencyIdr"))
      return cCurrencyIdr;
    else if (fieldName.equalsIgnoreCase("c_period_id") || fieldName.equals("cPeriodId"))
      return cPeriodId;
    else if (fieldName.equalsIgnoreCase("separator"))
      return separator;
    else if (fieldName.equalsIgnoreCase("allownegative"))
      return allownegative;
    else if (fieldName.equalsIgnoreCase("isaccrual"))
      return isaccrual;
    else if (fieldName.equalsIgnoreCase("costingmethod"))
      return costingmethod;
    else if (fieldName.equalsIgnoreCase("autoperiodcontrol"))
      return autoperiodcontrol;
    else if (fieldName.equalsIgnoreCase("period_openhistory") || fieldName.equals("periodOpenhistory"))
      return periodOpenhistory;
    else if (fieldName.equalsIgnoreCase("period_openfuture") || fieldName.equals("periodOpenfuture"))
      return periodOpenfuture;
    else if (fieldName.equalsIgnoreCase("hasalias"))
      return hasalias;
    else if (fieldName.equalsIgnoreCase("istradediscountposted"))
      return istradediscountposted;
    else if (fieldName.equalsIgnoreCase("isdiscountcorrectstax"))
      return isdiscountcorrectstax;
    else if (fieldName.equalsIgnoreCase("iscentrallymaintained"))
      return iscentrallymaintained;
    else if (fieldName.equalsIgnoreCase("isassetpositive"))
      return isassetpositive;
    else if (fieldName.equalsIgnoreCase("isliabilitypositive"))
      return isliabilitypositive;
    else if (fieldName.equalsIgnoreCase("isequitypositive"))
      return isequitypositive;
    else if (fieldName.equalsIgnoreCase("isrevenuepositive"))
      return isrevenuepositive;
    else if (fieldName.equalsIgnoreCase("isexpensepositive"))
      return isexpensepositive;
    else if (fieldName.equalsIgnoreCase("hascombination"))
      return hascombination;
    else if (fieldName.equalsIgnoreCase("ad_client_id") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("c_acctschema_id") || fieldName.equals("cAcctschemaId"))
      return cAcctschemaId;
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
  public static GeneralLedgerConfigurationData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static GeneralLedgerConfigurationData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(C_AcctSchema.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = C_AcctSchema.CreatedBy) as CreatedByR, " +
      "        to_char(C_AcctSchema.Updated, ?) as updated, " +
      "        to_char(C_AcctSchema.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        C_AcctSchema.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = C_AcctSchema.UpdatedBy) as UpdatedByR," +
      "        C_AcctSchema.AD_Org_ID, " +
      "(CASE WHEN C_AcctSchema.AD_Org_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.Name), ''))),'') ) END) AS AD_Org_IDR, " +
      "C_AcctSchema.Name, " +
      "C_AcctSchema.Description, " +
      "COALESCE(C_AcctSchema.IsActive, 'N') AS IsActive, " +
      "C_AcctSchema.GAAP, " +
      "(CASE WHEN C_AcctSchema.GAAP IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list1.name),'') ) END) AS GAAPR, " +
      "C_AcctSchema.C_Currency_ID, " +
      "(CASE WHEN C_AcctSchema.C_Currency_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.ISO_Code), ''))),'') ) END) AS C_Currency_IDR, " +
      "C_AcctSchema.C_Period_ID, " +
      "C_AcctSchema.Separator, " +
      "COALESCE(C_AcctSchema.Allownegative, 'N') AS Allownegative, " +
      "COALESCE(C_AcctSchema.IsAccrual, 'N') AS IsAccrual, " +
      "C_AcctSchema.CostingMethod, " +
      "COALESCE(C_AcctSchema.AutoPeriodControl, 'N') AS AutoPeriodControl, " +
      "C_AcctSchema.Period_OpenHistory, " +
      "C_AcctSchema.Period_OpenFuture, " +
      "COALESCE(C_AcctSchema.HasAlias, 'N') AS HasAlias, " +
      "COALESCE(C_AcctSchema.IsTradeDiscountPosted, 'N') AS IsTradeDiscountPosted, " +
      "COALESCE(C_AcctSchema.IsDiscountCorrectsTax, 'N') AS IsDiscountCorrectsTax, " +
      "COALESCE(C_AcctSchema.Iscentrallymaintained, 'N') AS Iscentrallymaintained, " +
      "COALESCE(C_AcctSchema.IsAssetPositive, 'N') AS IsAssetPositive, " +
      "COALESCE(C_AcctSchema.IsLiabilityPositive, 'N') AS IsLiabilityPositive, " +
      "COALESCE(C_AcctSchema.IsEquityPositive, 'N') AS IsEquityPositive, " +
      "COALESCE(C_AcctSchema.IsRevenuePositive, 'N') AS IsRevenuePositive, " +
      "COALESCE(C_AcctSchema.IsExpensePositive, 'N') AS IsExpensePositive, " +
      "COALESCE(C_AcctSchema.HasCombination, 'N') AS HasCombination, " +
      "C_AcctSchema.AD_Client_ID, " +
      "C_AcctSchema.C_AcctSchema_ID, " +
      "        ? AS LANGUAGE " +
      "        FROM C_AcctSchema left join (select AD_Org_ID, Name from AD_Org) table1 on (C_AcctSchema.AD_Org_ID = table1.AD_Org_ID) left join ad_ref_list_v list1 on (C_AcctSchema.GAAP = list1.value and list1.ad_reference_id = '123' and list1.ad_language = ?)  left join (select C_Currency_ID, ISO_Code from C_Currency) table2 on (C_AcctSchema.C_Currency_ID = table2.C_Currency_ID)" +
      "        WHERE 2=2 " +
      "        AND 1=1 " +
      "        AND C_AcctSchema.C_AcctSchema_ID = ? " +
      "        AND C_AcctSchema.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND C_AcctSchema.AD_Org_ID IN (";
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
        GeneralLedgerConfigurationData objectGeneralLedgerConfigurationData = new GeneralLedgerConfigurationData();
        objectGeneralLedgerConfigurationData.created = UtilSql.getValue(result, "created");
        objectGeneralLedgerConfigurationData.createdbyr = UtilSql.getValue(result, "createdbyr");
        objectGeneralLedgerConfigurationData.updated = UtilSql.getValue(result, "updated");
        objectGeneralLedgerConfigurationData.updatedTimeStamp = UtilSql.getValue(result, "updated_time_stamp");
        objectGeneralLedgerConfigurationData.updatedby = UtilSql.getValue(result, "updatedby");
        objectGeneralLedgerConfigurationData.updatedbyr = UtilSql.getValue(result, "updatedbyr");
        objectGeneralLedgerConfigurationData.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectGeneralLedgerConfigurationData.adOrgIdr = UtilSql.getValue(result, "ad_org_idr");
        objectGeneralLedgerConfigurationData.name = UtilSql.getValue(result, "name");
        objectGeneralLedgerConfigurationData.description = UtilSql.getValue(result, "description");
        objectGeneralLedgerConfigurationData.isactive = UtilSql.getValue(result, "isactive");
        objectGeneralLedgerConfigurationData.gaap = UtilSql.getValue(result, "gaap");
        objectGeneralLedgerConfigurationData.gaapr = UtilSql.getValue(result, "gaapr");
        objectGeneralLedgerConfigurationData.cCurrencyId = UtilSql.getValue(result, "c_currency_id");
        objectGeneralLedgerConfigurationData.cCurrencyIdr = UtilSql.getValue(result, "c_currency_idr");
        objectGeneralLedgerConfigurationData.cPeriodId = UtilSql.getValue(result, "c_period_id");
        objectGeneralLedgerConfigurationData.separator = UtilSql.getValue(result, "separator");
        objectGeneralLedgerConfigurationData.allownegative = UtilSql.getValue(result, "allownegative");
        objectGeneralLedgerConfigurationData.isaccrual = UtilSql.getValue(result, "isaccrual");
        objectGeneralLedgerConfigurationData.costingmethod = UtilSql.getValue(result, "costingmethod");
        objectGeneralLedgerConfigurationData.autoperiodcontrol = UtilSql.getValue(result, "autoperiodcontrol");
        objectGeneralLedgerConfigurationData.periodOpenhistory = UtilSql.getValue(result, "period_openhistory");
        objectGeneralLedgerConfigurationData.periodOpenfuture = UtilSql.getValue(result, "period_openfuture");
        objectGeneralLedgerConfigurationData.hasalias = UtilSql.getValue(result, "hasalias");
        objectGeneralLedgerConfigurationData.istradediscountposted = UtilSql.getValue(result, "istradediscountposted");
        objectGeneralLedgerConfigurationData.isdiscountcorrectstax = UtilSql.getValue(result, "isdiscountcorrectstax");
        objectGeneralLedgerConfigurationData.iscentrallymaintained = UtilSql.getValue(result, "iscentrallymaintained");
        objectGeneralLedgerConfigurationData.isassetpositive = UtilSql.getValue(result, "isassetpositive");
        objectGeneralLedgerConfigurationData.isliabilitypositive = UtilSql.getValue(result, "isliabilitypositive");
        objectGeneralLedgerConfigurationData.isequitypositive = UtilSql.getValue(result, "isequitypositive");
        objectGeneralLedgerConfigurationData.isrevenuepositive = UtilSql.getValue(result, "isrevenuepositive");
        objectGeneralLedgerConfigurationData.isexpensepositive = UtilSql.getValue(result, "isexpensepositive");
        objectGeneralLedgerConfigurationData.hascombination = UtilSql.getValue(result, "hascombination");
        objectGeneralLedgerConfigurationData.adClientId = UtilSql.getValue(result, "ad_client_id");
        objectGeneralLedgerConfigurationData.cAcctschemaId = UtilSql.getValue(result, "c_acctschema_id");
        objectGeneralLedgerConfigurationData.language = UtilSql.getValue(result, "language");
        objectGeneralLedgerConfigurationData.adUserClient = "";
        objectGeneralLedgerConfigurationData.adOrgClient = "";
        objectGeneralLedgerConfigurationData.createdby = "";
        objectGeneralLedgerConfigurationData.trBgcolor = "";
        objectGeneralLedgerConfigurationData.totalCount = "";
        objectGeneralLedgerConfigurationData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectGeneralLedgerConfigurationData);
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
    GeneralLedgerConfigurationData objectGeneralLedgerConfigurationData[] = new GeneralLedgerConfigurationData[vector.size()];
    vector.copyInto(objectGeneralLedgerConfigurationData);
    return(objectGeneralLedgerConfigurationData);
  }

/**
Create a registry
 */
  public static GeneralLedgerConfigurationData[] set(String allownegative, String isliabilitypositive, String cAcctschemaId, String adClientId, String adOrgId, String isactive, String createdby, String createdbyr, String updatedby, String updatedbyr, String name, String description, String gaap, String isaccrual, String costingmethod, String cCurrencyId, String autoperiodcontrol, String cPeriodId, String periodOpenhistory, String periodOpenfuture, String separator, String hasalias, String hascombination, String isexpensepositive, String iscentrallymaintained, String istradediscountposted, String isdiscountcorrectstax, String isequitypositive, String isrevenuepositive, String isassetpositive)    throws ServletException {
    GeneralLedgerConfigurationData objectGeneralLedgerConfigurationData[] = new GeneralLedgerConfigurationData[1];
    objectGeneralLedgerConfigurationData[0] = new GeneralLedgerConfigurationData();
    objectGeneralLedgerConfigurationData[0].created = "";
    objectGeneralLedgerConfigurationData[0].createdbyr = createdbyr;
    objectGeneralLedgerConfigurationData[0].updated = "";
    objectGeneralLedgerConfigurationData[0].updatedTimeStamp = "";
    objectGeneralLedgerConfigurationData[0].updatedby = updatedby;
    objectGeneralLedgerConfigurationData[0].updatedbyr = updatedbyr;
    objectGeneralLedgerConfigurationData[0].adOrgId = adOrgId;
    objectGeneralLedgerConfigurationData[0].adOrgIdr = "";
    objectGeneralLedgerConfigurationData[0].name = name;
    objectGeneralLedgerConfigurationData[0].description = description;
    objectGeneralLedgerConfigurationData[0].isactive = isactive;
    objectGeneralLedgerConfigurationData[0].gaap = gaap;
    objectGeneralLedgerConfigurationData[0].gaapr = "";
    objectGeneralLedgerConfigurationData[0].cCurrencyId = cCurrencyId;
    objectGeneralLedgerConfigurationData[0].cCurrencyIdr = "";
    objectGeneralLedgerConfigurationData[0].cPeriodId = cPeriodId;
    objectGeneralLedgerConfigurationData[0].separator = separator;
    objectGeneralLedgerConfigurationData[0].allownegative = allownegative;
    objectGeneralLedgerConfigurationData[0].isaccrual = isaccrual;
    objectGeneralLedgerConfigurationData[0].costingmethod = costingmethod;
    objectGeneralLedgerConfigurationData[0].autoperiodcontrol = autoperiodcontrol;
    objectGeneralLedgerConfigurationData[0].periodOpenhistory = periodOpenhistory;
    objectGeneralLedgerConfigurationData[0].periodOpenfuture = periodOpenfuture;
    objectGeneralLedgerConfigurationData[0].hasalias = hasalias;
    objectGeneralLedgerConfigurationData[0].istradediscountposted = istradediscountposted;
    objectGeneralLedgerConfigurationData[0].isdiscountcorrectstax = isdiscountcorrectstax;
    objectGeneralLedgerConfigurationData[0].iscentrallymaintained = iscentrallymaintained;
    objectGeneralLedgerConfigurationData[0].isassetpositive = isassetpositive;
    objectGeneralLedgerConfigurationData[0].isliabilitypositive = isliabilitypositive;
    objectGeneralLedgerConfigurationData[0].isequitypositive = isequitypositive;
    objectGeneralLedgerConfigurationData[0].isrevenuepositive = isrevenuepositive;
    objectGeneralLedgerConfigurationData[0].isexpensepositive = isexpensepositive;
    objectGeneralLedgerConfigurationData[0].hascombination = hascombination;
    objectGeneralLedgerConfigurationData[0].adClientId = adClientId;
    objectGeneralLedgerConfigurationData[0].cAcctschemaId = cAcctschemaId;
    objectGeneralLedgerConfigurationData[0].language = "";
    return objectGeneralLedgerConfigurationData;
  }

/**
Select for auxiliar field
 */
  public static String selectDef2468_0(ConnectionProvider connectionProvider, String CreatedByR)    throws ServletException {
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
  public static String selectDef2470_1(ConnectionProvider connectionProvider, String UpdatedByR)    throws ServletException {
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
      "        UPDATE C_AcctSchema" +
      "        SET AD_Org_ID = (?) , Name = (?) , Description = (?) , IsActive = (?) , GAAP = (?) , C_Currency_ID = (?) , C_Period_ID = (?) , Separator = (?) , Allownegative = (?) , IsAccrual = (?) , CostingMethod = (?) , AutoPeriodControl = (?) , Period_OpenHistory = TO_NUMBER(?) , Period_OpenFuture = TO_NUMBER(?) , HasAlias = (?) , IsTradeDiscountPosted = (?) , IsDiscountCorrectsTax = (?) , Iscentrallymaintained = (?) , IsAssetPositive = (?) , IsLiabilityPositive = (?) , IsEquityPositive = (?) , IsRevenuePositive = (?) , IsExpensePositive = (?) , HasCombination = (?) , AD_Client_ID = (?) , C_AcctSchema_ID = (?) , updated = now(), updatedby = ? " +
      "        WHERE C_AcctSchema.C_AcctSchema_ID = ? " +
      "        AND C_AcctSchema.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND C_AcctSchema.AD_Org_ID IN (";
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
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, gaap);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCurrencyId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cPeriodId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, separator);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, allownegative);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isaccrual);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, costingmethod);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, autoperiodcontrol);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, periodOpenhistory);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, periodOpenfuture);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, hasalias);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, istradediscountposted);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isdiscountcorrectstax);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, iscentrallymaintained);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isassetpositive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isliabilitypositive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isequitypositive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isrevenuepositive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isexpensepositive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, hascombination);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cAcctschemaId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cAcctschemaId);
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
      "        INSERT INTO C_AcctSchema " +
      "        (AD_Org_ID, Name, Description, IsActive, GAAP, C_Currency_ID, C_Period_ID, Separator, Allownegative, IsAccrual, CostingMethod, AutoPeriodControl, Period_OpenHistory, Period_OpenFuture, HasAlias, IsTradeDiscountPosted, IsDiscountCorrectsTax, Iscentrallymaintained, IsAssetPositive, IsLiabilityPositive, IsEquityPositive, IsRevenuePositive, IsExpensePositive, HasCombination, AD_Client_ID, C_AcctSchema_ID, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), TO_NUMBER(?), TO_NUMBER(?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, name);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, gaap);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCurrencyId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cPeriodId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, separator);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, allownegative);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isaccrual);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, costingmethod);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, autoperiodcontrol);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, periodOpenhistory);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, periodOpenfuture);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, hasalias);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, istradediscountposted);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isdiscountcorrectstax);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, iscentrallymaintained);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isassetpositive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isliabilitypositive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isequitypositive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isrevenuepositive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isexpensepositive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, hascombination);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cAcctschemaId);
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
      "        DELETE FROM C_AcctSchema" +
      "        WHERE C_AcctSchema.C_AcctSchema_ID = ? " +
      "        AND C_AcctSchema.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND C_AcctSchema.AD_Org_ID IN (";
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
      "          FROM C_AcctSchema" +
      "         WHERE C_AcctSchema.C_AcctSchema_ID = ? ";

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
      "          FROM C_AcctSchema" +
      "         WHERE C_AcctSchema.C_AcctSchema_ID = ? ";

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
