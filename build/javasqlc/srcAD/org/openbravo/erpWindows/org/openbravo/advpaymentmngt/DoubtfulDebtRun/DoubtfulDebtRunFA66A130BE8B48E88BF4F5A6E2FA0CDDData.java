//Sqlc generated V1.O00-1
package org.openbravo.erpWindows.org.openbravo.advpaymentmngt.DoubtfulDebtRun;

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
class DoubtfulDebtRunFA66A130BE8B48E88BF4F5A6E2FA0CDDData implements FieldProvider {
static Logger log4j = Logger.getLogger(DoubtfulDebtRunFA66A130BE8B48E88BF4F5A6E2FA0CDDData.class);
  private String InitRecordNumber="0";
  public String created;
  public String createdbyr;
  public String updated;
  public String updatedTimeStamp;
  public String updatedby;
  public String updatedbyr;
  public String adOrgId;
  public String adOrgIdr;
  public String finDoubtfulDebtMethodId;
  public String finDoubtfulDebtMethodIdr;
  public String description;
  public String rundate;
  public String dateacct;
  public String daysoverdue;
  public String percentage;
  public String cBpartnerId;
  public String cBpartnerIdr;
  public String isactive;
  public String cBpGroupId;
  public String cBpGroupIdr;
  public String processDebt;
  public String processed;
  public String emAprmProcess;
  public String emAprmProcessBtn;
  public String adClientId;
  public String finDoubtfulDebtRunId;
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
    else if (fieldName.equalsIgnoreCase("fin_doubtful_debt_method_id") || fieldName.equals("finDoubtfulDebtMethodId"))
      return finDoubtfulDebtMethodId;
    else if (fieldName.equalsIgnoreCase("fin_doubtful_debt_method_idr") || fieldName.equals("finDoubtfulDebtMethodIdr"))
      return finDoubtfulDebtMethodIdr;
    else if (fieldName.equalsIgnoreCase("description"))
      return description;
    else if (fieldName.equalsIgnoreCase("rundate"))
      return rundate;
    else if (fieldName.equalsIgnoreCase("dateacct"))
      return dateacct;
    else if (fieldName.equalsIgnoreCase("daysoverdue"))
      return daysoverdue;
    else if (fieldName.equalsIgnoreCase("percentage"))
      return percentage;
    else if (fieldName.equalsIgnoreCase("c_bpartner_id") || fieldName.equals("cBpartnerId"))
      return cBpartnerId;
    else if (fieldName.equalsIgnoreCase("c_bpartner_idr") || fieldName.equals("cBpartnerIdr"))
      return cBpartnerIdr;
    else if (fieldName.equalsIgnoreCase("isactive"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("c_bp_group_id") || fieldName.equals("cBpGroupId"))
      return cBpGroupId;
    else if (fieldName.equalsIgnoreCase("c_bp_group_idr") || fieldName.equals("cBpGroupIdr"))
      return cBpGroupIdr;
    else if (fieldName.equalsIgnoreCase("process_debt") || fieldName.equals("processDebt"))
      return processDebt;
    else if (fieldName.equalsIgnoreCase("processed"))
      return processed;
    else if (fieldName.equalsIgnoreCase("em_aprm_process") || fieldName.equals("emAprmProcess"))
      return emAprmProcess;
    else if (fieldName.equalsIgnoreCase("em_aprm_process_btn") || fieldName.equals("emAprmProcessBtn"))
      return emAprmProcessBtn;
    else if (fieldName.equalsIgnoreCase("ad_client_id") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("fin_doubtful_debt_run_id") || fieldName.equals("finDoubtfulDebtRunId"))
      return finDoubtfulDebtRunId;
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
  public static DoubtfulDebtRunFA66A130BE8B48E88BF4F5A6E2FA0CDDData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static DoubtfulDebtRunFA66A130BE8B48E88BF4F5A6E2FA0CDDData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(FIN_Doubtful_Debt_Run.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = FIN_Doubtful_Debt_Run.CreatedBy) as CreatedByR, " +
      "        to_char(FIN_Doubtful_Debt_Run.Updated, ?) as updated, " +
      "        to_char(FIN_Doubtful_Debt_Run.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        FIN_Doubtful_Debt_Run.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = FIN_Doubtful_Debt_Run.UpdatedBy) as UpdatedByR," +
      "        FIN_Doubtful_Debt_Run.AD_Org_ID, " +
      "(CASE WHEN FIN_Doubtful_Debt_Run.AD_Org_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.Name), ''))),'') ) END) AS AD_Org_IDR, " +
      "FIN_Doubtful_Debt_Run.FIN_Doubtful_Debt_Method_ID, " +
      "(CASE WHEN FIN_Doubtful_Debt_Run.FIN_Doubtful_Debt_Method_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Name), ''))),'') ) END) AS FIN_Doubtful_Debt_Method_IDR, " +
      "FIN_Doubtful_Debt_Run.Description, " +
      "FIN_Doubtful_Debt_Run.Rundate, " +
      "FIN_Doubtful_Debt_Run.Dateacct, " +
      "FIN_Doubtful_Debt_Run.Daysoverdue, " +
      "FIN_Doubtful_Debt_Run.Percentage, " +
      "FIN_Doubtful_Debt_Run.C_Bpartner_ID, " +
      "(CASE WHEN FIN_Doubtful_Debt_Run.C_Bpartner_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table3.Name), ''))),'') ) END) AS C_Bpartner_IDR, " +
      "COALESCE(FIN_Doubtful_Debt_Run.Isactive, 'N') AS Isactive, " +
      "FIN_Doubtful_Debt_Run.C_Bp_Group_ID, " +
      "(CASE WHEN FIN_Doubtful_Debt_Run.C_Bp_Group_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table4.Name), ''))),'') ) END) AS C_Bp_Group_IDR, " +
      "FIN_Doubtful_Debt_Run.Process_Debt, " +
      "COALESCE(FIN_Doubtful_Debt_Run.Processed, 'N') AS Processed, " +
      "FIN_Doubtful_Debt_Run.EM_APRM_Process, " +
      "list1.name as EM_APRM_Process_BTN, " +
      "FIN_Doubtful_Debt_Run.AD_Client_ID, " +
      "FIN_Doubtful_Debt_Run.FIN_Doubtful_Debt_Run_ID, " +
      "        ? AS LANGUAGE " +
      "        FROM FIN_Doubtful_Debt_Run left join (select AD_Org_ID, Name from AD_Org) table1 on (FIN_Doubtful_Debt_Run.AD_Org_ID = table1.AD_Org_ID) left join (select FIN_Doubtful_Debt_Method_ID, Name from FIN_Doubtful_Debt_Method) table2 on (FIN_Doubtful_Debt_Run.FIN_Doubtful_Debt_Method_ID = table2.FIN_Doubtful_Debt_Method_ID) left join (select C_BPartner_ID, Name from C_BPartner) table3 on (FIN_Doubtful_Debt_Run.C_Bpartner_ID = table3.C_BPartner_ID) left join (select C_Bp_Group_ID, Name from C_Bp_Group) table4 on (FIN_Doubtful_Debt_Run.C_Bp_Group_ID = table4.C_Bp_Group_ID) left join ad_ref_list_v list1 on (list1.ad_reference_id = '798239EB069F41A9BA8EE040C63DDBBC' and list1.ad_language = ?  AND FIN_Doubtful_Debt_Run.EM_APRM_Process = TO_CHAR(list1.value))" +
      "        WHERE 2=2 " +
      "        AND 1=1 " +
      "        AND FIN_Doubtful_Debt_Run.FIN_Doubtful_Debt_Run_ID = ? " +
      "        AND FIN_Doubtful_Debt_Run.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND FIN_Doubtful_Debt_Run.AD_Org_ID IN (";
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
        DoubtfulDebtRunFA66A130BE8B48E88BF4F5A6E2FA0CDDData objectDoubtfulDebtRunFA66A130BE8B48E88BF4F5A6E2FA0CDDData = new DoubtfulDebtRunFA66A130BE8B48E88BF4F5A6E2FA0CDDData();
        objectDoubtfulDebtRunFA66A130BE8B48E88BF4F5A6E2FA0CDDData.created = UtilSql.getValue(result, "created");
        objectDoubtfulDebtRunFA66A130BE8B48E88BF4F5A6E2FA0CDDData.createdbyr = UtilSql.getValue(result, "createdbyr");
        objectDoubtfulDebtRunFA66A130BE8B48E88BF4F5A6E2FA0CDDData.updated = UtilSql.getValue(result, "updated");
        objectDoubtfulDebtRunFA66A130BE8B48E88BF4F5A6E2FA0CDDData.updatedTimeStamp = UtilSql.getValue(result, "updated_time_stamp");
        objectDoubtfulDebtRunFA66A130BE8B48E88BF4F5A6E2FA0CDDData.updatedby = UtilSql.getValue(result, "updatedby");
        objectDoubtfulDebtRunFA66A130BE8B48E88BF4F5A6E2FA0CDDData.updatedbyr = UtilSql.getValue(result, "updatedbyr");
        objectDoubtfulDebtRunFA66A130BE8B48E88BF4F5A6E2FA0CDDData.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectDoubtfulDebtRunFA66A130BE8B48E88BF4F5A6E2FA0CDDData.adOrgIdr = UtilSql.getValue(result, "ad_org_idr");
        objectDoubtfulDebtRunFA66A130BE8B48E88BF4F5A6E2FA0CDDData.finDoubtfulDebtMethodId = UtilSql.getValue(result, "fin_doubtful_debt_method_id");
        objectDoubtfulDebtRunFA66A130BE8B48E88BF4F5A6E2FA0CDDData.finDoubtfulDebtMethodIdr = UtilSql.getValue(result, "fin_doubtful_debt_method_idr");
        objectDoubtfulDebtRunFA66A130BE8B48E88BF4F5A6E2FA0CDDData.description = UtilSql.getValue(result, "description");
        objectDoubtfulDebtRunFA66A130BE8B48E88BF4F5A6E2FA0CDDData.rundate = UtilSql.getDateValue(result, "rundate", "dd-MM-yyyy");
        objectDoubtfulDebtRunFA66A130BE8B48E88BF4F5A6E2FA0CDDData.dateacct = UtilSql.getDateValue(result, "dateacct", "dd-MM-yyyy");
        objectDoubtfulDebtRunFA66A130BE8B48E88BF4F5A6E2FA0CDDData.daysoverdue = UtilSql.getValue(result, "daysoverdue");
        objectDoubtfulDebtRunFA66A130BE8B48E88BF4F5A6E2FA0CDDData.percentage = UtilSql.getValue(result, "percentage");
        objectDoubtfulDebtRunFA66A130BE8B48E88BF4F5A6E2FA0CDDData.cBpartnerId = UtilSql.getValue(result, "c_bpartner_id");
        objectDoubtfulDebtRunFA66A130BE8B48E88BF4F5A6E2FA0CDDData.cBpartnerIdr = UtilSql.getValue(result, "c_bpartner_idr");
        objectDoubtfulDebtRunFA66A130BE8B48E88BF4F5A6E2FA0CDDData.isactive = UtilSql.getValue(result, "isactive");
        objectDoubtfulDebtRunFA66A130BE8B48E88BF4F5A6E2FA0CDDData.cBpGroupId = UtilSql.getValue(result, "c_bp_group_id");
        objectDoubtfulDebtRunFA66A130BE8B48E88BF4F5A6E2FA0CDDData.cBpGroupIdr = UtilSql.getValue(result, "c_bp_group_idr");
        objectDoubtfulDebtRunFA66A130BE8B48E88BF4F5A6E2FA0CDDData.processDebt = UtilSql.getValue(result, "process_debt");
        objectDoubtfulDebtRunFA66A130BE8B48E88BF4F5A6E2FA0CDDData.processed = UtilSql.getValue(result, "processed");
        objectDoubtfulDebtRunFA66A130BE8B48E88BF4F5A6E2FA0CDDData.emAprmProcess = UtilSql.getValue(result, "em_aprm_process");
        objectDoubtfulDebtRunFA66A130BE8B48E88BF4F5A6E2FA0CDDData.emAprmProcessBtn = UtilSql.getValue(result, "em_aprm_process_btn");
        objectDoubtfulDebtRunFA66A130BE8B48E88BF4F5A6E2FA0CDDData.adClientId = UtilSql.getValue(result, "ad_client_id");
        objectDoubtfulDebtRunFA66A130BE8B48E88BF4F5A6E2FA0CDDData.finDoubtfulDebtRunId = UtilSql.getValue(result, "fin_doubtful_debt_run_id");
        objectDoubtfulDebtRunFA66A130BE8B48E88BF4F5A6E2FA0CDDData.language = UtilSql.getValue(result, "language");
        objectDoubtfulDebtRunFA66A130BE8B48E88BF4F5A6E2FA0CDDData.adUserClient = "";
        objectDoubtfulDebtRunFA66A130BE8B48E88BF4F5A6E2FA0CDDData.adOrgClient = "";
        objectDoubtfulDebtRunFA66A130BE8B48E88BF4F5A6E2FA0CDDData.createdby = "";
        objectDoubtfulDebtRunFA66A130BE8B48E88BF4F5A6E2FA0CDDData.trBgcolor = "";
        objectDoubtfulDebtRunFA66A130BE8B48E88BF4F5A6E2FA0CDDData.totalCount = "";
        objectDoubtfulDebtRunFA66A130BE8B48E88BF4F5A6E2FA0CDDData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectDoubtfulDebtRunFA66A130BE8B48E88BF4F5A6E2FA0CDDData);
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
    DoubtfulDebtRunFA66A130BE8B48E88BF4F5A6E2FA0CDDData objectDoubtfulDebtRunFA66A130BE8B48E88BF4F5A6E2FA0CDDData[] = new DoubtfulDebtRunFA66A130BE8B48E88BF4F5A6E2FA0CDDData[vector.size()];
    vector.copyInto(objectDoubtfulDebtRunFA66A130BE8B48E88BF4F5A6E2FA0CDDData);
    return(objectDoubtfulDebtRunFA66A130BE8B48E88BF4F5A6E2FA0CDDData);
  }

/**
Create a registry
 */
  public static DoubtfulDebtRunFA66A130BE8B48E88BF4F5A6E2FA0CDDData[] set(String processed, String emAprmProcess, String emAprmProcessBtn, String daysoverdue, String description, String percentage, String updatedby, String updatedbyr, String dateacct, String finDoubtfulDebtRunId, String isactive, String rundate, String adOrgId, String cBpGroupId, String createdby, String createdbyr, String cBpartnerId, String cBpartnerIdr, String adClientId, String finDoubtfulDebtMethodId, String processDebt)    throws ServletException {
    DoubtfulDebtRunFA66A130BE8B48E88BF4F5A6E2FA0CDDData objectDoubtfulDebtRunFA66A130BE8B48E88BF4F5A6E2FA0CDDData[] = new DoubtfulDebtRunFA66A130BE8B48E88BF4F5A6E2FA0CDDData[1];
    objectDoubtfulDebtRunFA66A130BE8B48E88BF4F5A6E2FA0CDDData[0] = new DoubtfulDebtRunFA66A130BE8B48E88BF4F5A6E2FA0CDDData();
    objectDoubtfulDebtRunFA66A130BE8B48E88BF4F5A6E2FA0CDDData[0].created = "";
    objectDoubtfulDebtRunFA66A130BE8B48E88BF4F5A6E2FA0CDDData[0].createdbyr = createdbyr;
    objectDoubtfulDebtRunFA66A130BE8B48E88BF4F5A6E2FA0CDDData[0].updated = "";
    objectDoubtfulDebtRunFA66A130BE8B48E88BF4F5A6E2FA0CDDData[0].updatedTimeStamp = "";
    objectDoubtfulDebtRunFA66A130BE8B48E88BF4F5A6E2FA0CDDData[0].updatedby = updatedby;
    objectDoubtfulDebtRunFA66A130BE8B48E88BF4F5A6E2FA0CDDData[0].updatedbyr = updatedbyr;
    objectDoubtfulDebtRunFA66A130BE8B48E88BF4F5A6E2FA0CDDData[0].adOrgId = adOrgId;
    objectDoubtfulDebtRunFA66A130BE8B48E88BF4F5A6E2FA0CDDData[0].adOrgIdr = "";
    objectDoubtfulDebtRunFA66A130BE8B48E88BF4F5A6E2FA0CDDData[0].finDoubtfulDebtMethodId = finDoubtfulDebtMethodId;
    objectDoubtfulDebtRunFA66A130BE8B48E88BF4F5A6E2FA0CDDData[0].finDoubtfulDebtMethodIdr = "";
    objectDoubtfulDebtRunFA66A130BE8B48E88BF4F5A6E2FA0CDDData[0].description = description;
    objectDoubtfulDebtRunFA66A130BE8B48E88BF4F5A6E2FA0CDDData[0].rundate = rundate;
    objectDoubtfulDebtRunFA66A130BE8B48E88BF4F5A6E2FA0CDDData[0].dateacct = dateacct;
    objectDoubtfulDebtRunFA66A130BE8B48E88BF4F5A6E2FA0CDDData[0].daysoverdue = daysoverdue;
    objectDoubtfulDebtRunFA66A130BE8B48E88BF4F5A6E2FA0CDDData[0].percentage = percentage;
    objectDoubtfulDebtRunFA66A130BE8B48E88BF4F5A6E2FA0CDDData[0].cBpartnerId = cBpartnerId;
    objectDoubtfulDebtRunFA66A130BE8B48E88BF4F5A6E2FA0CDDData[0].cBpartnerIdr = cBpartnerIdr;
    objectDoubtfulDebtRunFA66A130BE8B48E88BF4F5A6E2FA0CDDData[0].isactive = isactive;
    objectDoubtfulDebtRunFA66A130BE8B48E88BF4F5A6E2FA0CDDData[0].cBpGroupId = cBpGroupId;
    objectDoubtfulDebtRunFA66A130BE8B48E88BF4F5A6E2FA0CDDData[0].cBpGroupIdr = "";
    objectDoubtfulDebtRunFA66A130BE8B48E88BF4F5A6E2FA0CDDData[0].processDebt = processDebt;
    objectDoubtfulDebtRunFA66A130BE8B48E88BF4F5A6E2FA0CDDData[0].processed = processed;
    objectDoubtfulDebtRunFA66A130BE8B48E88BF4F5A6E2FA0CDDData[0].emAprmProcess = emAprmProcess;
    objectDoubtfulDebtRunFA66A130BE8B48E88BF4F5A6E2FA0CDDData[0].emAprmProcessBtn = emAprmProcessBtn;
    objectDoubtfulDebtRunFA66A130BE8B48E88BF4F5A6E2FA0CDDData[0].adClientId = adClientId;
    objectDoubtfulDebtRunFA66A130BE8B48E88BF4F5A6E2FA0CDDData[0].finDoubtfulDebtRunId = finDoubtfulDebtRunId;
    objectDoubtfulDebtRunFA66A130BE8B48E88BF4F5A6E2FA0CDDData[0].language = "";
    return objectDoubtfulDebtRunFA66A130BE8B48E88BF4F5A6E2FA0CDDData;
  }

/**
Select for auxiliar field
 */
  public static String selectDef7EF22ECE491B4285BAA3AAFA12CE165D_0(ConnectionProvider connectionProvider, String UpdatedbyR)    throws ServletException {
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

/**
Select for auxiliar field
 */
  public static String selectDefD68088FB742A4925AD7EF196FE51E0BA_1(ConnectionProvider connectionProvider, String CreatedbyR)    throws ServletException {
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
  public static String selectDefE0C3D55C3A354C8096D0FB27F8147970_2(ConnectionProvider connectionProvider, String C_Bpartner_IDR)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Name), ''))), '') ) as C_Bpartner_ID FROM C_BPartner left join (select C_BPartner_ID, Name from C_BPartner) table2 on (C_BPartner.C_BPartner_ID = table2.C_BPartner_ID) WHERE C_BPartner.isActive='Y' AND C_BPartner.C_BPartner_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_Bpartner_IDR);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "c_bpartner_id");
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
      "        UPDATE FIN_Doubtful_Debt_Run" +
      "        SET AD_Org_ID = (?) , FIN_Doubtful_Debt_Method_ID = (?) , Description = (?) , Rundate = TO_DATE(?) , Dateacct = TO_DATE(?) , Daysoverdue = TO_NUMBER(?) , Percentage = TO_NUMBER(?) , C_Bpartner_ID = (?) , Isactive = (?) , C_Bp_Group_ID = (?) , Process_Debt = (?) , Processed = (?) , EM_APRM_Process = (?) , AD_Client_ID = (?) , FIN_Doubtful_Debt_Run_ID = (?) , updated = now(), updatedby = ? " +
      "        WHERE FIN_Doubtful_Debt_Run.FIN_Doubtful_Debt_Run_ID = ? " +
      "        AND FIN_Doubtful_Debt_Run.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND FIN_Doubtful_Debt_Run.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, finDoubtfulDebtMethodId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, rundate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateacct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, daysoverdue);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, percentage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpGroupId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processDebt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processed);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emAprmProcess);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, finDoubtfulDebtRunId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, finDoubtfulDebtRunId);
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
      "        INSERT INTO FIN_Doubtful_Debt_Run " +
      "        (AD_Org_ID, FIN_Doubtful_Debt_Method_ID, Description, Rundate, Dateacct, Daysoverdue, Percentage, C_Bpartner_ID, Isactive, C_Bp_Group_ID, Process_Debt, Processed, EM_APRM_Process, AD_Client_ID, FIN_Doubtful_Debt_Run_ID, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), (?), TO_DATE(?), TO_DATE(?), TO_NUMBER(?), TO_NUMBER(?), (?), (?), (?), (?), (?), (?), (?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, finDoubtfulDebtMethodId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, rundate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateacct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, daysoverdue);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, percentage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpGroupId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processDebt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processed);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emAprmProcess);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, finDoubtfulDebtRunId);
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
      "        DELETE FROM FIN_Doubtful_Debt_Run" +
      "        WHERE FIN_Doubtful_Debt_Run.FIN_Doubtful_Debt_Run_ID = ? " +
      "        AND FIN_Doubtful_Debt_Run.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND FIN_Doubtful_Debt_Run.AD_Org_ID IN (";
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
      "          FROM FIN_Doubtful_Debt_Run" +
      "         WHERE FIN_Doubtful_Debt_Run.FIN_Doubtful_Debt_Run_ID = ? ";

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
      "          FROM FIN_Doubtful_Debt_Run" +
      "         WHERE FIN_Doubtful_Debt_Run.FIN_Doubtful_Debt_Run_ID = ? ";

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
