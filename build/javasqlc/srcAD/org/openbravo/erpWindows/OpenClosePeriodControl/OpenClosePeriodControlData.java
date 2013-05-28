//Sqlc generated V1.O00-1
package org.openbravo.erpWindows.OpenClosePeriodControl;

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
class OpenClosePeriodControlData implements FieldProvider {
static Logger log4j = Logger.getLogger(OpenClosePeriodControlData.class);
  private String InitRecordNumber="0";
  public String created;
  public String createdbyr;
  public String updated;
  public String updatedTimeStamp;
  public String updatedby;
  public String updatedbyr;
  public String adOrgId;
  public String adOrgIdr;
  public String cCalendarId;
  public String cCalendarIdr;
  public String cYearId;
  public String cYearIdr;
  public String periodno;
  public String periodnor;
  public String periodaction;
  public String periodactionr;
  public String docbasetype;
  public String docbasetyper;
  public String isrecursive;
  public String description;
  public String processed;
  public String processing;
  public String cPeriodcontrolLogId;
  public String isactive;
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
    else if (fieldName.equalsIgnoreCase("ad_org_id") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("ad_org_idr") || fieldName.equals("adOrgIdr"))
      return adOrgIdr;
    else if (fieldName.equalsIgnoreCase("c_calendar_id") || fieldName.equals("cCalendarId"))
      return cCalendarId;
    else if (fieldName.equalsIgnoreCase("c_calendar_idr") || fieldName.equals("cCalendarIdr"))
      return cCalendarIdr;
    else if (fieldName.equalsIgnoreCase("c_year_id") || fieldName.equals("cYearId"))
      return cYearId;
    else if (fieldName.equalsIgnoreCase("c_year_idr") || fieldName.equals("cYearIdr"))
      return cYearIdr;
    else if (fieldName.equalsIgnoreCase("periodno"))
      return periodno;
    else if (fieldName.equalsIgnoreCase("periodnor"))
      return periodnor;
    else if (fieldName.equalsIgnoreCase("periodaction"))
      return periodaction;
    else if (fieldName.equalsIgnoreCase("periodactionr"))
      return periodactionr;
    else if (fieldName.equalsIgnoreCase("docbasetype"))
      return docbasetype;
    else if (fieldName.equalsIgnoreCase("docbasetyper"))
      return docbasetyper;
    else if (fieldName.equalsIgnoreCase("isrecursive"))
      return isrecursive;
    else if (fieldName.equalsIgnoreCase("description"))
      return description;
    else if (fieldName.equalsIgnoreCase("processed"))
      return processed;
    else if (fieldName.equalsIgnoreCase("processing"))
      return processing;
    else if (fieldName.equalsIgnoreCase("c_periodcontrol_log_id") || fieldName.equals("cPeriodcontrolLogId"))
      return cPeriodcontrolLogId;
    else if (fieldName.equalsIgnoreCase("isactive"))
      return isactive;
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
  public static OpenClosePeriodControlData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static OpenClosePeriodControlData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(C_PeriodControl_Log.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = C_PeriodControl_Log.CreatedBy) as CreatedByR, " +
      "        to_char(C_PeriodControl_Log.Updated, ?) as updated, " +
      "        to_char(C_PeriodControl_Log.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        C_PeriodControl_Log.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = C_PeriodControl_Log.UpdatedBy) as UpdatedByR," +
      "        C_PeriodControl_Log.AD_Org_ID, " +
      "(CASE WHEN C_PeriodControl_Log.AD_Org_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.Name), ''))),'') ) END) AS AD_Org_IDR, " +
      "C_PeriodControl_Log.C_Calendar_ID, " +
      "(CASE WHEN C_PeriodControl_Log.C_Calendar_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Name), ''))),'') ) END) AS C_Calendar_IDR, " +
      "C_PeriodControl_Log.C_Year_ID, " +
      "(CASE WHEN C_PeriodControl_Log.C_Year_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table3.Year), ''))),'') ) END) AS C_Year_IDR, " +
      "C_PeriodControl_Log.Periodno, " +
      "(CASE WHEN C_PeriodControl_Log.Periodno IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table4.Name), ''))),'') ) END) AS PeriodnoR, " +
      "C_PeriodControl_Log.Periodaction, " +
      "(CASE WHEN C_PeriodControl_Log.Periodaction IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list1.name),'') ) END) AS PeriodactionR, " +
      "C_PeriodControl_Log.Docbasetype, " +
      "(CASE WHEN C_PeriodControl_Log.Docbasetype IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list2.name),'') ) END) AS DocbasetypeR, " +
      "COALESCE(C_PeriodControl_Log.IsRecursive, 'N') AS IsRecursive, " +
      "C_PeriodControl_Log.Description, " +
      "C_PeriodControl_Log.Processed, " +
      "COALESCE(C_PeriodControl_Log.Processing, 'N') AS Processing, " +
      "C_PeriodControl_Log.C_Periodcontrol_Log_ID, " +
      "COALESCE(C_PeriodControl_Log.Isactive, 'N') AS Isactive, " +
      "C_PeriodControl_Log.AD_Client_ID, " +
      "        ? AS LANGUAGE " +
      "        FROM C_PeriodControl_Log left join (select AD_Org_ID, Name from AD_Org) table1 on (C_PeriodControl_Log.AD_Org_ID = table1.AD_Org_ID) left join (select C_Calendar_ID, Name from C_Calendar) table2 on (C_PeriodControl_Log.C_Calendar_ID = table2.C_Calendar_ID) left join (select C_Year_ID, Year from C_Year) table3 on (C_PeriodControl_Log.C_Year_ID = table3.C_Year_ID) left join (select C_Period_ID, Name from C_Period) table4 on (C_PeriodControl_Log.Periodno =  table4.C_Period_ID) left join ad_ref_list_v list1 on (C_PeriodControl_Log.Periodaction = list1.value and list1.ad_reference_id = '176' and list1.ad_language = ?)  left join ad_ref_list_v list2 on (C_PeriodControl_Log.Docbasetype = list2.value and list2.ad_reference_id = '183' and list2.ad_language = ?) " +
      "        WHERE 2=2 " +
      "        AND 1=1 " +
      "        AND C_PeriodControl_Log.C_Periodcontrol_Log_ID = ? " +
      "        AND C_PeriodControl_Log.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND C_PeriodControl_Log.AD_Org_ID IN (";
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
        OpenClosePeriodControlData objectOpenClosePeriodControlData = new OpenClosePeriodControlData();
        objectOpenClosePeriodControlData.created = UtilSql.getValue(result, "created");
        objectOpenClosePeriodControlData.createdbyr = UtilSql.getValue(result, "createdbyr");
        objectOpenClosePeriodControlData.updated = UtilSql.getValue(result, "updated");
        objectOpenClosePeriodControlData.updatedTimeStamp = UtilSql.getValue(result, "updated_time_stamp");
        objectOpenClosePeriodControlData.updatedby = UtilSql.getValue(result, "updatedby");
        objectOpenClosePeriodControlData.updatedbyr = UtilSql.getValue(result, "updatedbyr");
        objectOpenClosePeriodControlData.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectOpenClosePeriodControlData.adOrgIdr = UtilSql.getValue(result, "ad_org_idr");
        objectOpenClosePeriodControlData.cCalendarId = UtilSql.getValue(result, "c_calendar_id");
        objectOpenClosePeriodControlData.cCalendarIdr = UtilSql.getValue(result, "c_calendar_idr");
        objectOpenClosePeriodControlData.cYearId = UtilSql.getValue(result, "c_year_id");
        objectOpenClosePeriodControlData.cYearIdr = UtilSql.getValue(result, "c_year_idr");
        objectOpenClosePeriodControlData.periodno = UtilSql.getValue(result, "periodno");
        objectOpenClosePeriodControlData.periodnor = UtilSql.getValue(result, "periodnor");
        objectOpenClosePeriodControlData.periodaction = UtilSql.getValue(result, "periodaction");
        objectOpenClosePeriodControlData.periodactionr = UtilSql.getValue(result, "periodactionr");
        objectOpenClosePeriodControlData.docbasetype = UtilSql.getValue(result, "docbasetype");
        objectOpenClosePeriodControlData.docbasetyper = UtilSql.getValue(result, "docbasetyper");
        objectOpenClosePeriodControlData.isrecursive = UtilSql.getValue(result, "isrecursive");
        objectOpenClosePeriodControlData.description = UtilSql.getValue(result, "description");
        objectOpenClosePeriodControlData.processed = UtilSql.getValue(result, "processed");
        objectOpenClosePeriodControlData.processing = UtilSql.getValue(result, "processing");
        objectOpenClosePeriodControlData.cPeriodcontrolLogId = UtilSql.getValue(result, "c_periodcontrol_log_id");
        objectOpenClosePeriodControlData.isactive = UtilSql.getValue(result, "isactive");
        objectOpenClosePeriodControlData.adClientId = UtilSql.getValue(result, "ad_client_id");
        objectOpenClosePeriodControlData.language = UtilSql.getValue(result, "language");
        objectOpenClosePeriodControlData.adUserClient = "";
        objectOpenClosePeriodControlData.adOrgClient = "";
        objectOpenClosePeriodControlData.createdby = "";
        objectOpenClosePeriodControlData.trBgcolor = "";
        objectOpenClosePeriodControlData.totalCount = "";
        objectOpenClosePeriodControlData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectOpenClosePeriodControlData);
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
    OpenClosePeriodControlData objectOpenClosePeriodControlData[] = new OpenClosePeriodControlData[vector.size()];
    vector.copyInto(objectOpenClosePeriodControlData);
    return(objectOpenClosePeriodControlData);
  }

/**
Create a registry
 */
  public static OpenClosePeriodControlData[] set(String cPeriodcontrolLogId, String adClientId, String adOrgId, String isactive, String createdby, String updatedby, String description, String processing, String processed, String cCalendarId, String isrecursive, String cYearId, String periodno, String docbasetype, String periodaction)    throws ServletException {
    OpenClosePeriodControlData objectOpenClosePeriodControlData[] = new OpenClosePeriodControlData[1];
    objectOpenClosePeriodControlData[0] = new OpenClosePeriodControlData();
    objectOpenClosePeriodControlData[0].created = "";
    objectOpenClosePeriodControlData[0].createdbyr = "";
    objectOpenClosePeriodControlData[0].updated = "";
    objectOpenClosePeriodControlData[0].updatedTimeStamp = "";
    objectOpenClosePeriodControlData[0].updatedby = updatedby;
    objectOpenClosePeriodControlData[0].updatedbyr = "";
    objectOpenClosePeriodControlData[0].adOrgId = adOrgId;
    objectOpenClosePeriodControlData[0].adOrgIdr = "";
    objectOpenClosePeriodControlData[0].cCalendarId = cCalendarId;
    objectOpenClosePeriodControlData[0].cCalendarIdr = "";
    objectOpenClosePeriodControlData[0].cYearId = cYearId;
    objectOpenClosePeriodControlData[0].cYearIdr = "";
    objectOpenClosePeriodControlData[0].periodno = periodno;
    objectOpenClosePeriodControlData[0].periodnor = "";
    objectOpenClosePeriodControlData[0].periodaction = periodaction;
    objectOpenClosePeriodControlData[0].periodactionr = "";
    objectOpenClosePeriodControlData[0].docbasetype = docbasetype;
    objectOpenClosePeriodControlData[0].docbasetyper = "";
    objectOpenClosePeriodControlData[0].isrecursive = isrecursive;
    objectOpenClosePeriodControlData[0].description = description;
    objectOpenClosePeriodControlData[0].processed = processed;
    objectOpenClosePeriodControlData[0].processing = processing;
    objectOpenClosePeriodControlData[0].cPeriodcontrolLogId = cPeriodcontrolLogId;
    objectOpenClosePeriodControlData[0].isactive = isactive;
    objectOpenClosePeriodControlData[0].adClientId = adClientId;
    objectOpenClosePeriodControlData[0].language = "";
    return objectOpenClosePeriodControlData;
  }

  public int update(Connection conn, ConnectionProvider connectionProvider)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        UPDATE C_PeriodControl_Log" +
      "        SET AD_Org_ID = (?) , C_Calendar_ID = (?) , C_Year_ID = (?) , Periodno = (?) , Periodaction = (?) , Docbasetype = (?) , IsRecursive = (?) , Description = (?) , Processed = (?) , Processing = (?) , C_Periodcontrol_Log_ID = (?) , Isactive = (?) , AD_Client_ID = (?) , updated = now(), updatedby = ? " +
      "        WHERE C_PeriodControl_Log.C_Periodcontrol_Log_ID = ? " +
      "        AND C_PeriodControl_Log.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND C_PeriodControl_Log.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCalendarId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cYearId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, periodno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, periodaction);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, docbasetype);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isrecursive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processed);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processing);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cPeriodcontrolLogId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cPeriodcontrolLogId);
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
      "        INSERT INTO C_PeriodControl_Log " +
      "        (AD_Org_ID, C_Calendar_ID, C_Year_ID, Periodno, Periodaction, Docbasetype, IsRecursive, Description, Processed, Processing, C_Periodcontrol_Log_ID, Isactive, AD_Client_ID, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCalendarId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cYearId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, periodno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, periodaction);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, docbasetype);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isrecursive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processed);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processing);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cPeriodcontrolLogId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
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
      "        DELETE FROM C_PeriodControl_Log" +
      "        WHERE C_PeriodControl_Log.C_Periodcontrol_Log_ID = ? " +
      "        AND C_PeriodControl_Log.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND C_PeriodControl_Log.AD_Org_ID IN (";
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
      "          FROM C_PeriodControl_Log" +
      "         WHERE C_PeriodControl_Log.C_Periodcontrol_Log_ID = ? ";

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
      "          FROM C_PeriodControl_Log" +
      "         WHERE C_PeriodControl_Log.C_Periodcontrol_Log_ID = ? ";

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
