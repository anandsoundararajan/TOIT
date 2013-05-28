//Sqlc generated V1.O00-1
package org.openbravo.erpWindows.TablesandColumns;

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
class TableData implements FieldProvider {
static Logger log4j = Logger.getLogger(TableData.class);
  private String InitRecordNumber="0";
  public String created;
  public String createdbyr;
  public String updated;
  public String updatedTimeStamp;
  public String updatedby;
  public String updatedbyr;
  public String adPackageId;
  public String adPackageIdr;
  public String name;
  public String tablename;
  public String classname;
  public String accesslevel;
  public String accesslevelr;
  public String description;
  public String help;
  public String adWindowId;
  public String adWindowIdr;
  public String poWindowId;
  public String poWindowIdr;
  public String isview;
  public String isdeleteable;
  public String ishighvolume;
  public String isfullyaudited;
  public String acctdateColumnId;
  public String acctdateColumnIdr;
  public String importtable;
  public String acctclassname;
  public String treetype;
  public String treetyper;
  public String developmentstatus;
  public String developmentstatusr;
  public String isactive;
  public String ischangelog;
  public String adClientId;
  public String issecurityenabled;
  public String sqlRecordIdentifier;
  public String adTableId;
  public String adOrgId;
  public String isdefaultacct;
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
    else if (fieldName.equalsIgnoreCase("ad_package_id") || fieldName.equals("adPackageId"))
      return adPackageId;
    else if (fieldName.equalsIgnoreCase("ad_package_idr") || fieldName.equals("adPackageIdr"))
      return adPackageIdr;
    else if (fieldName.equalsIgnoreCase("name"))
      return name;
    else if (fieldName.equalsIgnoreCase("tablename"))
      return tablename;
    else if (fieldName.equalsIgnoreCase("classname"))
      return classname;
    else if (fieldName.equalsIgnoreCase("accesslevel"))
      return accesslevel;
    else if (fieldName.equalsIgnoreCase("accesslevelr"))
      return accesslevelr;
    else if (fieldName.equalsIgnoreCase("description"))
      return description;
    else if (fieldName.equalsIgnoreCase("help"))
      return help;
    else if (fieldName.equalsIgnoreCase("ad_window_id") || fieldName.equals("adWindowId"))
      return adWindowId;
    else if (fieldName.equalsIgnoreCase("ad_window_idr") || fieldName.equals("adWindowIdr"))
      return adWindowIdr;
    else if (fieldName.equalsIgnoreCase("po_window_id") || fieldName.equals("poWindowId"))
      return poWindowId;
    else if (fieldName.equalsIgnoreCase("po_window_idr") || fieldName.equals("poWindowIdr"))
      return poWindowIdr;
    else if (fieldName.equalsIgnoreCase("isview"))
      return isview;
    else if (fieldName.equalsIgnoreCase("isdeleteable"))
      return isdeleteable;
    else if (fieldName.equalsIgnoreCase("ishighvolume"))
      return ishighvolume;
    else if (fieldName.equalsIgnoreCase("isfullyaudited"))
      return isfullyaudited;
    else if (fieldName.equalsIgnoreCase("acctdate_column_id") || fieldName.equals("acctdateColumnId"))
      return acctdateColumnId;
    else if (fieldName.equalsIgnoreCase("acctdate_column_idr") || fieldName.equals("acctdateColumnIdr"))
      return acctdateColumnIdr;
    else if (fieldName.equalsIgnoreCase("importtable"))
      return importtable;
    else if (fieldName.equalsIgnoreCase("acctclassname"))
      return acctclassname;
    else if (fieldName.equalsIgnoreCase("treetype"))
      return treetype;
    else if (fieldName.equalsIgnoreCase("treetyper"))
      return treetyper;
    else if (fieldName.equalsIgnoreCase("developmentstatus"))
      return developmentstatus;
    else if (fieldName.equalsIgnoreCase("developmentstatusr"))
      return developmentstatusr;
    else if (fieldName.equalsIgnoreCase("isactive"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("ischangelog"))
      return ischangelog;
    else if (fieldName.equalsIgnoreCase("ad_client_id") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("issecurityenabled"))
      return issecurityenabled;
    else if (fieldName.equalsIgnoreCase("sql_record_identifier") || fieldName.equals("sqlRecordIdentifier"))
      return sqlRecordIdentifier;
    else if (fieldName.equalsIgnoreCase("ad_table_id") || fieldName.equals("adTableId"))
      return adTableId;
    else if (fieldName.equalsIgnoreCase("ad_org_id") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("isdefaultacct"))
      return isdefaultacct;
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
  public static TableData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static TableData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(AD_Table.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = AD_Table.CreatedBy) as CreatedByR, " +
      "        to_char(AD_Table.Updated, ?) as updated, " +
      "        to_char(AD_Table.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        AD_Table.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = AD_Table.UpdatedBy) as UpdatedByR," +
      "        AD_Table.AD_Package_ID, " +
      "(CASE WHEN AD_Table.AD_Package_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.Name), ''))),'') ) END) AS AD_Package_IDR, " +
      "AD_Table.Name, " +
      "AD_Table.TableName, " +
      "AD_Table.Classname, " +
      "AD_Table.AccessLevel, " +
      "(CASE WHEN AD_Table.AccessLevel IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list1.name),'') ) END) AS AccessLevelR, " +
      "AD_Table.Description, " +
      "AD_Table.Help, " +
      "AD_Table.AD_Window_ID, " +
      "(CASE WHEN AD_Table.AD_Window_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL2.Name IS NULL THEN TO_CHAR(table2.Name) ELSE TO_CHAR(tableTRL2.Name) END)), ''))),'') ) END) AS AD_Window_IDR, " +
      "AD_Table.PO_Window_ID, " +
      "(CASE WHEN AD_Table.PO_Window_ID IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL3.Name IS NULL THEN TO_CHAR(table3.Name) ELSE TO_CHAR(tableTRL3.Name) END)), ''))),'') ) END) AS PO_Window_IDR, " +
      "COALESCE(AD_Table.IsView, 'N') AS IsView, " +
      "COALESCE(AD_Table.IsDeleteable, 'N') AS IsDeleteable, " +
      "COALESCE(AD_Table.IsHighVolume, 'N') AS IsHighVolume, " +
      "COALESCE(AD_Table.IsFullyAudited, 'N') AS IsFullyAudited, " +
      "AD_Table.Acctdate_Column_ID, " +
      "(CASE WHEN AD_Table.Acctdate_Column_ID IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table4.ColumnName), ''))),'') ) END) AS Acctdate_Column_IDR, " +
      "AD_Table.ImportTable, " +
      "AD_Table.Acctclassname, " +
      "AD_Table.Treetype, " +
      "(CASE WHEN AD_Table.Treetype IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list2.name),'') ) END) AS TreetypeR, " +
      "AD_Table.Developmentstatus, " +
      "(CASE WHEN AD_Table.Developmentstatus IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list3.name),'') ) END) AS DevelopmentstatusR, " +
      "COALESCE(AD_Table.IsActive, 'N') AS IsActive, " +
      "COALESCE(AD_Table.IsChangeLog, 'N') AS IsChangeLog, " +
      "AD_Table.AD_Client_ID, " +
      "COALESCE(AD_Table.IsSecurityEnabled, 'N') AS IsSecurityEnabled, " +
      "AD_Table.SQL_Record_Identifier, " +
      "AD_Table.AD_Table_ID, " +
      "AD_Table.AD_Org_ID, " +
      "COALESCE(AD_Table.IsDefaultAcct, 'N') AS IsDefaultAcct, " +
      "        ? AS LANGUAGE " +
      "        FROM AD_Table left join (select AD_Package_ID, Name from AD_Package) table1 on (AD_Table.AD_Package_ID = table1.AD_Package_ID) left join ad_ref_list_v list1 on (AD_Table.AccessLevel = list1.value and list1.ad_reference_id = '5' and list1.ad_language = ?)  left join (select AD_Window_ID, Name from AD_Window) table2 on (AD_Table.AD_Window_ID = table2.AD_Window_ID) left join (select AD_Window_ID,AD_Language, Name from AD_Window_TRL) tableTRL2 on (table2.AD_Window_ID = tableTRL2.AD_Window_ID and tableTRL2.AD_Language = ?)  left join (select AD_Window_ID, Name from AD_Window) table3 on (AD_Table.PO_Window_ID =  table3.AD_Window_ID) left join (select AD_Window_ID,AD_Language, Name from AD_Window_TRL) tableTRL3 on (table3.AD_Window_ID = tableTRL3.AD_Window_ID and tableTRL3.AD_Language = ?)  left join (select AD_Column_ID, ColumnName from AD_Column) table4 on (AD_Table.Acctdate_Column_ID =  table4.AD_Column_ID) left join ad_ref_list_v list2 on (AD_Table.Treetype = list2.value and list2.ad_reference_id = '120' and list2.ad_language = ?)  left join ad_ref_list_v list3 on (AD_Table.Developmentstatus = list3.value and list3.ad_reference_id = '800103' and list3.ad_language = ?) " +
      "        WHERE 2=2 " +
      "        AND 1=1 " +
      "        AND AD_Table.AD_Table_ID = ? " +
      "        AND AD_Table.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND AD_Table.AD_Org_ID IN (";
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
        TableData objectTableData = new TableData();
        objectTableData.created = UtilSql.getValue(result, "created");
        objectTableData.createdbyr = UtilSql.getValue(result, "createdbyr");
        objectTableData.updated = UtilSql.getValue(result, "updated");
        objectTableData.updatedTimeStamp = UtilSql.getValue(result, "updated_time_stamp");
        objectTableData.updatedby = UtilSql.getValue(result, "updatedby");
        objectTableData.updatedbyr = UtilSql.getValue(result, "updatedbyr");
        objectTableData.adPackageId = UtilSql.getValue(result, "ad_package_id");
        objectTableData.adPackageIdr = UtilSql.getValue(result, "ad_package_idr");
        objectTableData.name = UtilSql.getValue(result, "name");
        objectTableData.tablename = UtilSql.getValue(result, "tablename");
        objectTableData.classname = UtilSql.getValue(result, "classname");
        objectTableData.accesslevel = UtilSql.getValue(result, "accesslevel");
        objectTableData.accesslevelr = UtilSql.getValue(result, "accesslevelr");
        objectTableData.description = UtilSql.getValue(result, "description");
        objectTableData.help = UtilSql.getValue(result, "help");
        objectTableData.adWindowId = UtilSql.getValue(result, "ad_window_id");
        objectTableData.adWindowIdr = UtilSql.getValue(result, "ad_window_idr");
        objectTableData.poWindowId = UtilSql.getValue(result, "po_window_id");
        objectTableData.poWindowIdr = UtilSql.getValue(result, "po_window_idr");
        objectTableData.isview = UtilSql.getValue(result, "isview");
        objectTableData.isdeleteable = UtilSql.getValue(result, "isdeleteable");
        objectTableData.ishighvolume = UtilSql.getValue(result, "ishighvolume");
        objectTableData.isfullyaudited = UtilSql.getValue(result, "isfullyaudited");
        objectTableData.acctdateColumnId = UtilSql.getValue(result, "acctdate_column_id");
        objectTableData.acctdateColumnIdr = UtilSql.getValue(result, "acctdate_column_idr");
        objectTableData.importtable = UtilSql.getValue(result, "importtable");
        objectTableData.acctclassname = UtilSql.getValue(result, "acctclassname");
        objectTableData.treetype = UtilSql.getValue(result, "treetype");
        objectTableData.treetyper = UtilSql.getValue(result, "treetyper");
        objectTableData.developmentstatus = UtilSql.getValue(result, "developmentstatus");
        objectTableData.developmentstatusr = UtilSql.getValue(result, "developmentstatusr");
        objectTableData.isactive = UtilSql.getValue(result, "isactive");
        objectTableData.ischangelog = UtilSql.getValue(result, "ischangelog");
        objectTableData.adClientId = UtilSql.getValue(result, "ad_client_id");
        objectTableData.issecurityenabled = UtilSql.getValue(result, "issecurityenabled");
        objectTableData.sqlRecordIdentifier = UtilSql.getValue(result, "sql_record_identifier");
        objectTableData.adTableId = UtilSql.getValue(result, "ad_table_id");
        objectTableData.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectTableData.isdefaultacct = UtilSql.getValue(result, "isdefaultacct");
        objectTableData.language = UtilSql.getValue(result, "language");
        objectTableData.adUserClient = "";
        objectTableData.adOrgClient = "";
        objectTableData.createdby = "";
        objectTableData.trBgcolor = "";
        objectTableData.totalCount = "";
        objectTableData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectTableData);
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
    TableData objectTableData[] = new TableData[vector.size()];
    vector.copyInto(objectTableData);
    return(objectTableData);
  }

/**
Select for relation
 */
  public static TableData[] select(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String parTableName, String parSessionDate, String parSessionUser, String adUserClient, String adOrgClient, String orderbyclause)    throws ServletException {
    return select(connectionProvider, dateTimeFormat, paramLanguage, parTableName, parSessionDate, parSessionUser, adUserClient, adOrgClient, orderbyclause, 0, 0);
  }

/**
Select for relation
 */
  public static TableData[] select(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String parTableName, String parSessionDate, String parSessionUser, String adUserClient, String adOrgClient, String orderbyclause, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(AD_Table.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = AD_Table.CreatedBy) as CreatedByR, " +
      "        to_char(AD_Table.Updated, ?) as updated, " +
      "        to_char(AD_Table.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        AD_Table.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = AD_Table.UpdatedBy) as UpdatedByR, " +
      "        AD_Table.AD_Package_ID, " +
      "(CASE WHEN AD_Table.AD_Package_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.Name), ''))),'') ) END) AS AD_Package_IDR, " +
      "AD_Table.Name, " +
      "AD_Table.TableName, " +
      "AD_Table.Classname, " +
      "AD_Table.AccessLevel, " +
      "(CASE WHEN AD_Table.AccessLevel IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list1.name),'') ) END) AS AccessLevelR, " +
      "AD_Table.Description, " +
      "AD_Table.Help, " +
      "AD_Table.AD_Window_ID, " +
      "(CASE WHEN AD_Table.AD_Window_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL2.Name IS NULL THEN TO_CHAR(table2.Name) ELSE TO_CHAR(tableTRL2.Name) END)), ''))),'') ) END) AS AD_Window_IDR, " +
      "AD_Table.PO_Window_ID, " +
      "(CASE WHEN AD_Table.PO_Window_ID IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL3.Name IS NULL THEN TO_CHAR(table3.Name) ELSE TO_CHAR(tableTRL3.Name) END)), ''))),'') ) END) AS PO_Window_IDR, " +
      "COALESCE(AD_Table.IsView, 'N') AS IsView, " +
      "COALESCE(AD_Table.IsDeleteable, 'N') AS IsDeleteable, " +
      "COALESCE(AD_Table.IsHighVolume, 'N') AS IsHighVolume, " +
      "COALESCE(AD_Table.IsFullyAudited, 'N') AS IsFullyAudited, " +
      "AD_Table.Acctdate_Column_ID, " +
      "(CASE WHEN AD_Table.Acctdate_Column_ID IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table4.ColumnName), ''))),'') ) END) AS Acctdate_Column_IDR, " +
      "AD_Table.ImportTable, " +
      "AD_Table.Acctclassname, " +
      "AD_Table.Treetype, " +
      "(CASE WHEN AD_Table.Treetype IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list2.name),'') ) END) AS TreetypeR, " +
      "AD_Table.Developmentstatus, " +
      "(CASE WHEN AD_Table.Developmentstatus IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list3.name),'') ) END) AS DevelopmentstatusR, " +
      "COALESCE(AD_Table.IsActive, 'N') AS IsActive, " +
      "COALESCE(AD_Table.IsChangeLog, 'N') AS IsChangeLog, " +
      "AD_Table.AD_Client_ID, " +
      "COALESCE(AD_Table.IsSecurityEnabled, 'N') AS IsSecurityEnabled, " +
      "AD_Table.SQL_Record_Identifier, " +
      "AD_Table.AD_Table_ID, " +
      "AD_Table.AD_Org_ID, " +
      "COALESCE(AD_Table.IsDefaultAcct, 'N') AS IsDefaultAcct, " +
      "        '' AS TR_BGCOLOR, '' as total_count," +
      "        ? AS LANGUAGE, '' AS AD_USER_CLIENT, '' AS AD_ORG_CLIENT" +
      "        FROM AD_Table left join (select AD_Package_ID, Name from AD_Package) table1 on (AD_Table.AD_Package_ID = table1.AD_Package_ID) left join ad_ref_list_v list1 on (AD_Table.AccessLevel = list1.value and list1.ad_reference_id = '5' and list1.ad_language = ?)  left join (select AD_Window_ID, Name from AD_Window) table2 on (AD_Table.AD_Window_ID = table2.AD_Window_ID) left join (select AD_Window_ID,AD_Language, Name from AD_Window_TRL) tableTRL2 on (table2.AD_Window_ID = tableTRL2.AD_Window_ID and tableTRL2.AD_Language = ?)  left join (select AD_Window_ID, Name from AD_Window) table3 on (AD_Table.PO_Window_ID =  table3.AD_Window_ID) left join (select AD_Window_ID,AD_Language, Name from AD_Window_TRL) tableTRL3 on (table3.AD_Window_ID = tableTRL3.AD_Window_ID and tableTRL3.AD_Language = ?)  left join (select AD_Column_ID, ColumnName from AD_Column) table4 on (AD_Table.Acctdate_Column_ID =  table4.AD_Column_ID) left join ad_ref_list_v list2 on (AD_Table.Treetype = list2.value and list2.ad_reference_id = '120' and list2.ad_language = ?)  left join ad_ref_list_v list3 on (AD_Table.Developmentstatus = list3.value and list3.ad_reference_id = '800103' and list3.ad_language = ?) " +
      "        WHERE 2=2 " +
      "        AND 1=1 ";
    strSql = strSql + ((parTableName==null || parTableName.equals(""))?"":"  AND C_IGNORE_ACCENT(AD_Table.TableName) LIKE C_IGNORE_ACCENT(?) ");
    strSql = strSql + ((parSessionDate.equals("parSessionDate"))?"  AND 1 = 1 ":"");
    strSql = strSql + ((parSessionUser.equals("parSessionUser"))?"  AND 1 = 1 ":"");
    strSql = strSql + 
      "        AND AD_Table.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND AD_Table.AD_Org_ID IN (";
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
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      if (parTableName != null && !(parTableName.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, parTableName);
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
        TableData objectTableData = new TableData();
        objectTableData.created = UtilSql.getValue(result, "created");
        objectTableData.createdbyr = UtilSql.getValue(result, "createdbyr");
        objectTableData.updated = UtilSql.getValue(result, "updated");
        objectTableData.updatedTimeStamp = UtilSql.getValue(result, "updated_time_stamp");
        objectTableData.updatedby = UtilSql.getValue(result, "updatedby");
        objectTableData.updatedbyr = UtilSql.getValue(result, "updatedbyr");
        objectTableData.adPackageId = UtilSql.getValue(result, "ad_package_id");
        objectTableData.adPackageIdr = UtilSql.getValue(result, "ad_package_idr");
        objectTableData.name = UtilSql.getValue(result, "name");
        objectTableData.tablename = UtilSql.getValue(result, "tablename");
        objectTableData.classname = UtilSql.getValue(result, "classname");
        objectTableData.accesslevel = UtilSql.getValue(result, "accesslevel");
        objectTableData.accesslevelr = UtilSql.getValue(result, "accesslevelr");
        objectTableData.description = UtilSql.getValue(result, "description");
        objectTableData.help = UtilSql.getValue(result, "help");
        objectTableData.adWindowId = UtilSql.getValue(result, "ad_window_id");
        objectTableData.adWindowIdr = UtilSql.getValue(result, "ad_window_idr");
        objectTableData.poWindowId = UtilSql.getValue(result, "po_window_id");
        objectTableData.poWindowIdr = UtilSql.getValue(result, "po_window_idr");
        objectTableData.isview = UtilSql.getValue(result, "isview");
        objectTableData.isdeleteable = UtilSql.getValue(result, "isdeleteable");
        objectTableData.ishighvolume = UtilSql.getValue(result, "ishighvolume");
        objectTableData.isfullyaudited = UtilSql.getValue(result, "isfullyaudited");
        objectTableData.acctdateColumnId = UtilSql.getValue(result, "acctdate_column_id");
        objectTableData.acctdateColumnIdr = UtilSql.getValue(result, "acctdate_column_idr");
        objectTableData.importtable = UtilSql.getValue(result, "importtable");
        objectTableData.acctclassname = UtilSql.getValue(result, "acctclassname");
        objectTableData.treetype = UtilSql.getValue(result, "treetype");
        objectTableData.treetyper = UtilSql.getValue(result, "treetyper");
        objectTableData.developmentstatus = UtilSql.getValue(result, "developmentstatus");
        objectTableData.developmentstatusr = UtilSql.getValue(result, "developmentstatusr");
        objectTableData.isactive = UtilSql.getValue(result, "isactive");
        objectTableData.ischangelog = UtilSql.getValue(result, "ischangelog");
        objectTableData.adClientId = UtilSql.getValue(result, "ad_client_id");
        objectTableData.issecurityenabled = UtilSql.getValue(result, "issecurityenabled");
        objectTableData.sqlRecordIdentifier = UtilSql.getValue(result, "sql_record_identifier");
        objectTableData.adTableId = UtilSql.getValue(result, "ad_table_id");
        objectTableData.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectTableData.isdefaultacct = UtilSql.getValue(result, "isdefaultacct");
        objectTableData.trBgcolor = UtilSql.getValue(result, "tr_bgcolor");
        objectTableData.totalCount = UtilSql.getValue(result, "total_count");
        objectTableData.language = UtilSql.getValue(result, "language");
        objectTableData.adUserClient = UtilSql.getValue(result, "ad_user_client");
        objectTableData.adOrgClient = UtilSql.getValue(result, "ad_org_client");
        objectTableData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectTableData);
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
    TableData objectTableData[] = new TableData[vector.size()];
    vector.copyInto(objectTableData);
    return(objectTableData);
  }

/**
Create a registry
 */
  public static TableData[] set(String adTableId, String name, String description, String help, String adWindowId, String tablename, String accesslevel, String adClientId, String adOrgId, String ishighvolume, String isactive, String createdby, String createdbyr, String updatedby, String updatedbyr, String classname, String isview, String importtable, String acctdateColumnId, String acctclassname, String issecurityenabled, String isdeleteable, String isfullyaudited, String isdefaultacct, String sqlRecordIdentifier, String developmentstatus, String ischangelog, String adPackageId, String poWindowId, String treetype)    throws ServletException {
    TableData objectTableData[] = new TableData[1];
    objectTableData[0] = new TableData();
    objectTableData[0].created = "";
    objectTableData[0].createdbyr = createdbyr;
    objectTableData[0].updated = "";
    objectTableData[0].updatedTimeStamp = "";
    objectTableData[0].updatedby = updatedby;
    objectTableData[0].updatedbyr = updatedbyr;
    objectTableData[0].adPackageId = adPackageId;
    objectTableData[0].adPackageIdr = "";
    objectTableData[0].name = name;
    objectTableData[0].tablename = tablename;
    objectTableData[0].classname = classname;
    objectTableData[0].accesslevel = accesslevel;
    objectTableData[0].accesslevelr = "";
    objectTableData[0].description = description;
    objectTableData[0].help = help;
    objectTableData[0].adWindowId = adWindowId;
    objectTableData[0].adWindowIdr = "";
    objectTableData[0].poWindowId = poWindowId;
    objectTableData[0].poWindowIdr = "";
    objectTableData[0].isview = isview;
    objectTableData[0].isdeleteable = isdeleteable;
    objectTableData[0].ishighvolume = ishighvolume;
    objectTableData[0].isfullyaudited = isfullyaudited;
    objectTableData[0].acctdateColumnId = acctdateColumnId;
    objectTableData[0].acctdateColumnIdr = "";
    objectTableData[0].importtable = importtable;
    objectTableData[0].acctclassname = acctclassname;
    objectTableData[0].treetype = treetype;
    objectTableData[0].treetyper = "";
    objectTableData[0].developmentstatus = developmentstatus;
    objectTableData[0].developmentstatusr = "";
    objectTableData[0].isactive = isactive;
    objectTableData[0].ischangelog = ischangelog;
    objectTableData[0].adClientId = adClientId;
    objectTableData[0].issecurityenabled = issecurityenabled;
    objectTableData[0].sqlRecordIdentifier = sqlRecordIdentifier;
    objectTableData[0].adTableId = adTableId;
    objectTableData[0].adOrgId = adOrgId;
    objectTableData[0].isdefaultacct = isdefaultacct;
    objectTableData[0].trBgcolor = "";
    objectTableData[0].totalCount = "";
    objectTableData[0].language = "";
    objectTableData[0].adUserClient = "";
    objectTableData[0].adOrgClient = "";
    return objectTableData;
  }

/**
Select for auxiliar field
 */
  public static String selectDef545_0(ConnectionProvider connectionProvider, String CreatedByR)    throws ServletException {
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
  public static String selectDef547_1(ConnectionProvider connectionProvider, String UpdatedByR)    throws ServletException {
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
      "        UPDATE AD_Table" +
      "        SET AD_Package_ID = (?) , Name = (?) , TableName = (?) , Classname = (?) , AccessLevel = (?) , Description = (?) , Help = (?) , AD_Window_ID = (?) , PO_Window_ID = (?) , IsView = (?) , IsDeleteable = (?) , IsHighVolume = (?) , IsFullyAudited = (?) , Acctdate_Column_ID = (?) , ImportTable = (?) , Acctclassname = (?) , Treetype = (?) , Developmentstatus = (?) , IsActive = (?) , IsChangeLog = (?) , AD_Client_ID = (?) , IsSecurityEnabled = (?) , SQL_Record_Identifier = (?) , AD_Table_ID = (?) , AD_Org_ID = (?) , IsDefaultAcct = (?) , updated = now(), updatedby = ? " +
      "        WHERE AD_Table.AD_Table_ID = ? " +
      "        AND AD_Table.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND AD_Table.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adPackageId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, name);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, tablename);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, classname);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, accesslevel);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, help);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adWindowId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, poWindowId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isview);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isdeleteable);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ishighvolume);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isfullyaudited);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, acctdateColumnId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, importtable);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, acctclassname);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, treetype);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, developmentstatus);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ischangelog);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, issecurityenabled);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, sqlRecordIdentifier);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adTableId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isdefaultacct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adTableId);
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
      "        INSERT INTO AD_Table " +
      "        (AD_Package_ID, Name, TableName, Classname, AccessLevel, Description, Help, AD_Window_ID, PO_Window_ID, IsView, IsDeleteable, IsHighVolume, IsFullyAudited, Acctdate_Column_ID, ImportTable, Acctclassname, Treetype, Developmentstatus, IsActive, IsChangeLog, AD_Client_ID, IsSecurityEnabled, SQL_Record_Identifier, AD_Table_ID, AD_Org_ID, IsDefaultAcct, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adPackageId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, name);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, tablename);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, classname);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, accesslevel);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, help);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adWindowId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, poWindowId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isview);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isdeleteable);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ishighvolume);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isfullyaudited);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, acctdateColumnId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, importtable);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, acctclassname);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, treetype);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, developmentstatus);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ischangelog);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, issecurityenabled);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, sqlRecordIdentifier);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adTableId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isdefaultacct);
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
      "        DELETE FROM AD_Table" +
      "        WHERE AD_Table.AD_Table_ID = ? " +
      "        AND AD_Table.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND AD_Table.AD_Org_ID IN (";
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
      "          FROM AD_Table" +
      "         WHERE AD_Table.AD_Table_ID = ? ";

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
      "          FROM AD_Table" +
      "         WHERE AD_Table.AD_Table_ID = ? ";

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
