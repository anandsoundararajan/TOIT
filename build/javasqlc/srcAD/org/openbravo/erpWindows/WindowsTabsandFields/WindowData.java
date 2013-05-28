//Sqlc generated V1.O00-1
package org.openbravo.erpWindows.WindowsTabsandFields;

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
class WindowData implements FieldProvider {
static Logger log4j = Logger.getLogger(WindowData.class);
  private String InitRecordNumber="0";
  public String created;
  public String createdbyr;
  public String updated;
  public String updatedTimeStamp;
  public String updatedby;
  public String updatedbyr;
  public String adModuleId;
  public String adModuleIdr;
  public String name;
  public String windowtype;
  public String windowtyper;
  public String description;
  public String help;
  public String issotrx;
  public String isthreadsafe;
  public String processing;
  public String isadvancedfeature;
  public String isactive;
  public String adOrgId;
  public String adClientId;
  public String adWindowId;
  public String adImageId;
  public String isdefault;
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
    else if (fieldName.equalsIgnoreCase("ad_module_id") || fieldName.equals("adModuleId"))
      return adModuleId;
    else if (fieldName.equalsIgnoreCase("ad_module_idr") || fieldName.equals("adModuleIdr"))
      return adModuleIdr;
    else if (fieldName.equalsIgnoreCase("name"))
      return name;
    else if (fieldName.equalsIgnoreCase("windowtype"))
      return windowtype;
    else if (fieldName.equalsIgnoreCase("windowtyper"))
      return windowtyper;
    else if (fieldName.equalsIgnoreCase("description"))
      return description;
    else if (fieldName.equalsIgnoreCase("help"))
      return help;
    else if (fieldName.equalsIgnoreCase("issotrx"))
      return issotrx;
    else if (fieldName.equalsIgnoreCase("isthreadsafe"))
      return isthreadsafe;
    else if (fieldName.equalsIgnoreCase("processing"))
      return processing;
    else if (fieldName.equalsIgnoreCase("isadvancedfeature"))
      return isadvancedfeature;
    else if (fieldName.equalsIgnoreCase("isactive"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("ad_org_id") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("ad_client_id") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("ad_window_id") || fieldName.equals("adWindowId"))
      return adWindowId;
    else if (fieldName.equalsIgnoreCase("ad_image_id") || fieldName.equals("adImageId"))
      return adImageId;
    else if (fieldName.equalsIgnoreCase("isdefault"))
      return isdefault;
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
  public static WindowData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static WindowData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(AD_Window.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = AD_Window.CreatedBy) as CreatedByR, " +
      "        to_char(AD_Window.Updated, ?) as updated, " +
      "        to_char(AD_Window.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        AD_Window.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = AD_Window.UpdatedBy) as UpdatedByR," +
      "        AD_Window.AD_Module_ID, " +
      "(CASE WHEN AD_Window.AD_Module_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.Name), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.Version), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Name), ''))),'') ) END) AS AD_Module_IDR, " +
      "AD_Window.Name, " +
      "AD_Window.WindowType, " +
      "(CASE WHEN AD_Window.WindowType IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list1.name),'') ) END) AS WindowTypeR, " +
      "AD_Window.Description, " +
      "AD_Window.Help, " +
      "COALESCE(AD_Window.IsSOTrx, 'N') AS IsSOTrx, " +
      "COALESCE(AD_Window.Isthreadsafe, 'N') AS Isthreadsafe, " +
      "AD_Window.Processing, " +
      "COALESCE(AD_Window.IsAdvancedFeature, 'N') AS IsAdvancedFeature, " +
      "COALESCE(AD_Window.IsActive, 'N') AS IsActive, " +
      "AD_Window.AD_Org_ID, " +
      "AD_Window.AD_Client_ID, " +
      "AD_Window.AD_Window_ID, " +
      "AD_Window.AD_Image_ID, " +
      "COALESCE(AD_Window.IsDefault, 'N') AS IsDefault, " +
      "        ? AS LANGUAGE " +
      "        FROM AD_Window left join (select AD_Module_ID, Name, Version, AD_Language from AD_Module) table1 on (AD_Window.AD_Module_ID = table1.AD_Module_ID) left join (select AD_Language, Name from AD_Language) table2 on (table1.AD_Language =  table2.AD_Language) left join ad_ref_list_v list1 on (AD_Window.WindowType = list1.value and list1.ad_reference_id = '108' and list1.ad_language = ?) " +
      "        WHERE 2=2 " +
      "        AND 1=1 " +
      "        AND AD_Window.AD_Window_ID = ? " +
      "        AND AD_Window.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND AD_Window.AD_Org_ID IN (";
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
        WindowData objectWindowData = new WindowData();
        objectWindowData.created = UtilSql.getValue(result, "created");
        objectWindowData.createdbyr = UtilSql.getValue(result, "createdbyr");
        objectWindowData.updated = UtilSql.getValue(result, "updated");
        objectWindowData.updatedTimeStamp = UtilSql.getValue(result, "updated_time_stamp");
        objectWindowData.updatedby = UtilSql.getValue(result, "updatedby");
        objectWindowData.updatedbyr = UtilSql.getValue(result, "updatedbyr");
        objectWindowData.adModuleId = UtilSql.getValue(result, "ad_module_id");
        objectWindowData.adModuleIdr = UtilSql.getValue(result, "ad_module_idr");
        objectWindowData.name = UtilSql.getValue(result, "name");
        objectWindowData.windowtype = UtilSql.getValue(result, "windowtype");
        objectWindowData.windowtyper = UtilSql.getValue(result, "windowtyper");
        objectWindowData.description = UtilSql.getValue(result, "description");
        objectWindowData.help = UtilSql.getValue(result, "help");
        objectWindowData.issotrx = UtilSql.getValue(result, "issotrx");
        objectWindowData.isthreadsafe = UtilSql.getValue(result, "isthreadsafe");
        objectWindowData.processing = UtilSql.getValue(result, "processing");
        objectWindowData.isadvancedfeature = UtilSql.getValue(result, "isadvancedfeature");
        objectWindowData.isactive = UtilSql.getValue(result, "isactive");
        objectWindowData.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectWindowData.adClientId = UtilSql.getValue(result, "ad_client_id");
        objectWindowData.adWindowId = UtilSql.getValue(result, "ad_window_id");
        objectWindowData.adImageId = UtilSql.getValue(result, "ad_image_id");
        objectWindowData.isdefault = UtilSql.getValue(result, "isdefault");
        objectWindowData.language = UtilSql.getValue(result, "language");
        objectWindowData.adUserClient = "";
        objectWindowData.adOrgClient = "";
        objectWindowData.createdby = "";
        objectWindowData.trBgcolor = "";
        objectWindowData.totalCount = "";
        objectWindowData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectWindowData);
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
    WindowData objectWindowData[] = new WindowData[vector.size()];
    vector.copyInto(objectWindowData);
    return(objectWindowData);
  }

/**
Select for relation
 */
  public static WindowData[] select(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String parName, String parAD_Module_ID, String parSessionDate, String parSessionUser, String adUserClient, String adOrgClient, String orderbyclause)    throws ServletException {
    return select(connectionProvider, dateTimeFormat, paramLanguage, parName, parAD_Module_ID, parSessionDate, parSessionUser, adUserClient, adOrgClient, orderbyclause, 0, 0);
  }

/**
Select for relation
 */
  public static WindowData[] select(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String parName, String parAD_Module_ID, String parSessionDate, String parSessionUser, String adUserClient, String adOrgClient, String orderbyclause, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(AD_Window.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = AD_Window.CreatedBy) as CreatedByR, " +
      "        to_char(AD_Window.Updated, ?) as updated, " +
      "        to_char(AD_Window.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        AD_Window.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = AD_Window.UpdatedBy) as UpdatedByR, " +
      "        AD_Window.AD_Module_ID, " +
      "(CASE WHEN AD_Window.AD_Module_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.Name), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.Version), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Name), ''))),'') ) END) AS AD_Module_IDR, " +
      "AD_Window.Name, " +
      "AD_Window.WindowType, " +
      "(CASE WHEN AD_Window.WindowType IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list1.name),'') ) END) AS WindowTypeR, " +
      "AD_Window.Description, " +
      "AD_Window.Help, " +
      "COALESCE(AD_Window.IsSOTrx, 'N') AS IsSOTrx, " +
      "COALESCE(AD_Window.Isthreadsafe, 'N') AS Isthreadsafe, " +
      "AD_Window.Processing, " +
      "COALESCE(AD_Window.IsAdvancedFeature, 'N') AS IsAdvancedFeature, " +
      "COALESCE(AD_Window.IsActive, 'N') AS IsActive, " +
      "AD_Window.AD_Org_ID, " +
      "AD_Window.AD_Client_ID, " +
      "AD_Window.AD_Window_ID, " +
      "AD_Window.AD_Image_ID, " +
      "COALESCE(AD_Window.IsDefault, 'N') AS IsDefault, " +
      "        '' AS TR_BGCOLOR, '' as total_count," +
      "        ? AS LANGUAGE, '' AS AD_USER_CLIENT, '' AS AD_ORG_CLIENT" +
      "        FROM AD_Window left join (select AD_Module_ID, Name, Version, AD_Language from AD_Module) table1 on (AD_Window.AD_Module_ID = table1.AD_Module_ID) left join (select AD_Language, Name from AD_Language) table2 on (table1.AD_Language =  table2.AD_Language) left join ad_ref_list_v list1 on (AD_Window.WindowType = list1.value and list1.ad_reference_id = '108' and list1.ad_language = ?) " +
      "        WHERE 2=2 " +
      "        AND 1=1 ";
    strSql = strSql + ((parName==null || parName.equals(""))?"":"  AND C_IGNORE_ACCENT(AD_Window.Name) LIKE C_IGNORE_ACCENT(?) ");
    strSql = strSql + ((parAD_Module_ID==null || parAD_Module_ID.equals(""))?"":"  AND (AD_Window.AD_Module_ID) = (?) ");
    strSql = strSql + ((parSessionDate.equals("parSessionDate"))?"  AND 1 = 1 ":"");
    strSql = strSql + ((parSessionUser.equals("parSessionUser"))?"  AND 1 = 1 ":"");
    strSql = strSql + 
      "        AND AD_Window.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND AD_Window.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") " +
      "        ORDER BY ";
    strSql = strSql + ((orderbyclause==null || orderbyclause.equals(""))?"":orderbyclause);
    strSql = strSql + 
      ", 1";

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
      if (parName != null && !(parName.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, parName);
      }
      if (parAD_Module_ID != null && !(parAD_Module_ID.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, parAD_Module_ID);
      }
      if (parSessionDate != null && !(parSessionDate.equals(""))) {
        }
      if (parSessionUser != null && !(parSessionUser.equals(""))) {
        }
      if (adUserClient != null && !(adUserClient.equals(""))) {
        }
      if (adOrgClient != null && !(adOrgClient.equals(""))) {
        }
      if (orderbyclause != null && !(orderbyclause.equals(""))) {
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
        WindowData objectWindowData = new WindowData();
        objectWindowData.created = UtilSql.getValue(result, "created");
        objectWindowData.createdbyr = UtilSql.getValue(result, "createdbyr");
        objectWindowData.updated = UtilSql.getValue(result, "updated");
        objectWindowData.updatedTimeStamp = UtilSql.getValue(result, "updated_time_stamp");
        objectWindowData.updatedby = UtilSql.getValue(result, "updatedby");
        objectWindowData.updatedbyr = UtilSql.getValue(result, "updatedbyr");
        objectWindowData.adModuleId = UtilSql.getValue(result, "ad_module_id");
        objectWindowData.adModuleIdr = UtilSql.getValue(result, "ad_module_idr");
        objectWindowData.name = UtilSql.getValue(result, "name");
        objectWindowData.windowtype = UtilSql.getValue(result, "windowtype");
        objectWindowData.windowtyper = UtilSql.getValue(result, "windowtyper");
        objectWindowData.description = UtilSql.getValue(result, "description");
        objectWindowData.help = UtilSql.getValue(result, "help");
        objectWindowData.issotrx = UtilSql.getValue(result, "issotrx");
        objectWindowData.isthreadsafe = UtilSql.getValue(result, "isthreadsafe");
        objectWindowData.processing = UtilSql.getValue(result, "processing");
        objectWindowData.isadvancedfeature = UtilSql.getValue(result, "isadvancedfeature");
        objectWindowData.isactive = UtilSql.getValue(result, "isactive");
        objectWindowData.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectWindowData.adClientId = UtilSql.getValue(result, "ad_client_id");
        objectWindowData.adWindowId = UtilSql.getValue(result, "ad_window_id");
        objectWindowData.adImageId = UtilSql.getValue(result, "ad_image_id");
        objectWindowData.isdefault = UtilSql.getValue(result, "isdefault");
        objectWindowData.trBgcolor = UtilSql.getValue(result, "tr_bgcolor");
        objectWindowData.totalCount = UtilSql.getValue(result, "total_count");
        objectWindowData.language = UtilSql.getValue(result, "language");
        objectWindowData.adUserClient = UtilSql.getValue(result, "ad_user_client");
        objectWindowData.adOrgClient = UtilSql.getValue(result, "ad_org_client");
        objectWindowData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectWindowData);
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
    WindowData objectWindowData[] = new WindowData[vector.size()];
    vector.copyInto(objectWindowData);
    return(objectWindowData);
  }

/**
Create a registry
 */
  public static WindowData[] set(String adWindowId, String name, String description, String help, String adClientId, String adOrgId, String processing, String adModuleId, String isactive, String createdby, String createdbyr, String updatedby, String updatedbyr, String adImageId, String issotrx, String isadvancedfeature, String windowtype, String isdefault, String isthreadsafe)    throws ServletException {
    WindowData objectWindowData[] = new WindowData[1];
    objectWindowData[0] = new WindowData();
    objectWindowData[0].created = "";
    objectWindowData[0].createdbyr = createdbyr;
    objectWindowData[0].updated = "";
    objectWindowData[0].updatedTimeStamp = "";
    objectWindowData[0].updatedby = updatedby;
    objectWindowData[0].updatedbyr = updatedbyr;
    objectWindowData[0].adModuleId = adModuleId;
    objectWindowData[0].adModuleIdr = "";
    objectWindowData[0].name = name;
    objectWindowData[0].windowtype = windowtype;
    objectWindowData[0].windowtyper = "";
    objectWindowData[0].description = description;
    objectWindowData[0].help = help;
    objectWindowData[0].issotrx = issotrx;
    objectWindowData[0].isthreadsafe = isthreadsafe;
    objectWindowData[0].processing = processing;
    objectWindowData[0].isadvancedfeature = isadvancedfeature;
    objectWindowData[0].isactive = isactive;
    objectWindowData[0].adOrgId = adOrgId;
    objectWindowData[0].adClientId = adClientId;
    objectWindowData[0].adWindowId = adWindowId;
    objectWindowData[0].adImageId = adImageId;
    objectWindowData[0].isdefault = isdefault;
    objectWindowData[0].trBgcolor = "";
    objectWindowData[0].totalCount = "";
    objectWindowData[0].language = "";
    objectWindowData[0].adUserClient = "";
    objectWindowData[0].adOrgClient = "";
    return objectWindowData;
  }

/**
Select for auxiliar field
 */
  public static String selectDef5661DEEC430CFC21E040007F01004C04(ConnectionProvider connectionProvider)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT MAX(AD_MODULE_ID) FROM AD_MODULE WHERE ISDEFAULT='Y' ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    try {
    st = connectionProvider.getPreparedStatement(strSql);

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
  public static String selectDef570_0(ConnectionProvider connectionProvider, String CreatedByR)    throws ServletException {
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
  public static String selectDef572_1(ConnectionProvider connectionProvider, String UpdatedByR)    throws ServletException {
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
      "        UPDATE AD_Window" +
      "        SET AD_Module_ID = (?) , Name = (?) , WindowType = (?) , Description = (?) , Help = (?) , IsSOTrx = (?) , Isthreadsafe = (?) , Processing = (?) , IsAdvancedFeature = (?) , IsActive = (?) , AD_Org_ID = (?) , AD_Client_ID = (?) , AD_Window_ID = (?) , AD_Image_ID = (?) , IsDefault = (?) , updated = now(), updatedby = ? " +
      "        WHERE AD_Window.AD_Window_ID = ? " +
      "        AND AD_Window.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND AD_Window.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adModuleId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, name);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, windowtype);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, help);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, issotrx);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isthreadsafe);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processing);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isadvancedfeature);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adWindowId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adImageId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isdefault);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adWindowId);
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
      "        INSERT INTO AD_Window " +
      "        (AD_Module_ID, Name, WindowType, Description, Help, IsSOTrx, Isthreadsafe, Processing, IsAdvancedFeature, IsActive, AD_Org_ID, AD_Client_ID, AD_Window_ID, AD_Image_ID, IsDefault, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adModuleId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, name);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, windowtype);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, help);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, issotrx);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isthreadsafe);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processing);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isadvancedfeature);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adWindowId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adImageId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isdefault);
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
      "        DELETE FROM AD_Window" +
      "        WHERE AD_Window.AD_Window_ID = ? " +
      "        AND AD_Window.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND AD_Window.AD_Org_ID IN (";
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
      "          FROM AD_Window" +
      "         WHERE AD_Window.AD_Window_ID = ? ";

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
      "          FROM AD_Window" +
      "         WHERE AD_Window.AD_Window_ID = ? ";

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
