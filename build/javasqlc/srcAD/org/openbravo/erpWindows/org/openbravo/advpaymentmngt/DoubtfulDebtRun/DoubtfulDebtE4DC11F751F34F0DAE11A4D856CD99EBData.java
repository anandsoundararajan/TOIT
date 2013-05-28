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
class DoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData implements FieldProvider {
static Logger log4j = Logger.getLogger(DoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData.class);
  private String InitRecordNumber="0";
  public String created;
  public String createdbyr;
  public String updated;
  public String updatedTimeStamp;
  public String updatedby;
  public String updatedbyr;
  public String adOrgId;
  public String cDoctypeId;
  public String cDoctypeIdr;
  public String documentno;
  public String dateacct;
  public String finPaymentScheduleId;
  public String finPaymentScheduleIdr;
  public String description;
  public String amount;
  public String posted;
  public String postedBtn;
  public String cBpartnerId;
  public String cBpartnerIdr;
  public String mProductId;
  public String mProductIdr;
  public String cProjectId;
  public String cCostcenterId;
  public String cActivityId;
  public String cActivityIdr;
  public String cCampaignId;
  public String cCampaignIdr;
  public String user1Id;
  public String user2Id;
  public String processing;
  public String adClientId;
  public String finDoubtfulDebtId;
  public String isactive;
  public String processed;
  public String cCurrencyId;
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
    else if (fieldName.equalsIgnoreCase("c_doctype_id") || fieldName.equals("cDoctypeId"))
      return cDoctypeId;
    else if (fieldName.equalsIgnoreCase("c_doctype_idr") || fieldName.equals("cDoctypeIdr"))
      return cDoctypeIdr;
    else if (fieldName.equalsIgnoreCase("documentno"))
      return documentno;
    else if (fieldName.equalsIgnoreCase("dateacct"))
      return dateacct;
    else if (fieldName.equalsIgnoreCase("fin_payment_schedule_id") || fieldName.equals("finPaymentScheduleId"))
      return finPaymentScheduleId;
    else if (fieldName.equalsIgnoreCase("fin_payment_schedule_idr") || fieldName.equals("finPaymentScheduleIdr"))
      return finPaymentScheduleIdr;
    else if (fieldName.equalsIgnoreCase("description"))
      return description;
    else if (fieldName.equalsIgnoreCase("amount"))
      return amount;
    else if (fieldName.equalsIgnoreCase("posted"))
      return posted;
    else if (fieldName.equalsIgnoreCase("posted_btn") || fieldName.equals("postedBtn"))
      return postedBtn;
    else if (fieldName.equalsIgnoreCase("c_bpartner_id") || fieldName.equals("cBpartnerId"))
      return cBpartnerId;
    else if (fieldName.equalsIgnoreCase("c_bpartner_idr") || fieldName.equals("cBpartnerIdr"))
      return cBpartnerIdr;
    else if (fieldName.equalsIgnoreCase("m_product_id") || fieldName.equals("mProductId"))
      return mProductId;
    else if (fieldName.equalsIgnoreCase("m_product_idr") || fieldName.equals("mProductIdr"))
      return mProductIdr;
    else if (fieldName.equalsIgnoreCase("c_project_id") || fieldName.equals("cProjectId"))
      return cProjectId;
    else if (fieldName.equalsIgnoreCase("c_costcenter_id") || fieldName.equals("cCostcenterId"))
      return cCostcenterId;
    else if (fieldName.equalsIgnoreCase("c_activity_id") || fieldName.equals("cActivityId"))
      return cActivityId;
    else if (fieldName.equalsIgnoreCase("c_activity_idr") || fieldName.equals("cActivityIdr"))
      return cActivityIdr;
    else if (fieldName.equalsIgnoreCase("c_campaign_id") || fieldName.equals("cCampaignId"))
      return cCampaignId;
    else if (fieldName.equalsIgnoreCase("c_campaign_idr") || fieldName.equals("cCampaignIdr"))
      return cCampaignIdr;
    else if (fieldName.equalsIgnoreCase("user1_id") || fieldName.equals("user1Id"))
      return user1Id;
    else if (fieldName.equalsIgnoreCase("user2_id") || fieldName.equals("user2Id"))
      return user2Id;
    else if (fieldName.equalsIgnoreCase("processing"))
      return processing;
    else if (fieldName.equalsIgnoreCase("ad_client_id") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("fin_doubtful_debt_id") || fieldName.equals("finDoubtfulDebtId"))
      return finDoubtfulDebtId;
    else if (fieldName.equalsIgnoreCase("isactive"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("processed"))
      return processed;
    else if (fieldName.equalsIgnoreCase("c_currency_id") || fieldName.equals("cCurrencyId"))
      return cCurrencyId;
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
  public static DoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String finDoubtfulDebtRunId, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, finDoubtfulDebtRunId, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static DoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String finDoubtfulDebtRunId, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(FIN_Doubtful_Debt.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = FIN_Doubtful_Debt.CreatedBy) as CreatedByR, " +
      "        to_char(FIN_Doubtful_Debt.Updated, ?) as updated, " +
      "        to_char(FIN_Doubtful_Debt.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        FIN_Doubtful_Debt.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = FIN_Doubtful_Debt.UpdatedBy) as UpdatedByR," +
      "        FIN_Doubtful_Debt.AD_Org_ID, " +
      "FIN_Doubtful_Debt.C_Doctype_ID, " +
      "(CASE WHEN FIN_Doubtful_Debt.C_Doctype_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL1.Name IS NULL THEN TO_CHAR(table1.Name) ELSE TO_CHAR(tableTRL1.Name) END)), ''))),'') ) END) AS C_Doctype_IDR, " +
      "FIN_Doubtful_Debt.DocumentNo, " +
      "FIN_Doubtful_Debt.DateAcct, " +
      "FIN_Doubtful_Debt.FIN_Payment_Schedule_ID, " +
      "(CASE WHEN FIN_Doubtful_Debt.FIN_Payment_Schedule_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(table2.Duedate, 'DD-MM-YYYY')),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Amount), ''))),'') ) END) AS FIN_Payment_Schedule_IDR, " +
      "FIN_Doubtful_Debt.Description, " +
      "FIN_Doubtful_Debt.Amount, " +
      "FIN_Doubtful_Debt.Posted, " +
      "list1.name as Posted_BTN, " +
      "FIN_Doubtful_Debt.C_Bpartner_ID, " +
      "(CASE WHEN FIN_Doubtful_Debt.C_Bpartner_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table3.Name), ''))),'') ) END) AS C_Bpartner_IDR, " +
      "FIN_Doubtful_Debt.M_Product_ID, " +
      "(CASE WHEN FIN_Doubtful_Debt.M_Product_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL4.Name IS NULL THEN TO_CHAR(table4.Name) ELSE TO_CHAR(tableTRL4.Name) END)), ''))),'') ) END) AS M_Product_IDR, " +
      "FIN_Doubtful_Debt.C_Project_ID, " +
      "FIN_Doubtful_Debt.C_Costcenter_ID, " +
      "FIN_Doubtful_Debt.C_Activity_ID, " +
      "(CASE WHEN FIN_Doubtful_Debt.C_Activity_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table5.Name), ''))),'') ) END) AS C_Activity_IDR, " +
      "FIN_Doubtful_Debt.C_Campaign_ID, " +
      "(CASE WHEN FIN_Doubtful_Debt.C_Campaign_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table6.Name), ''))),'') ) END) AS C_Campaign_IDR, " +
      "FIN_Doubtful_Debt.User1_ID, " +
      "FIN_Doubtful_Debt.User2_ID, " +
      "COALESCE(FIN_Doubtful_Debt.Processing, 'N') AS Processing, " +
      "FIN_Doubtful_Debt.AD_Client_ID, " +
      "FIN_Doubtful_Debt.FIN_Doubtful_Debt_ID, " +
      "COALESCE(FIN_Doubtful_Debt.Isactive, 'N') AS Isactive, " +
      "COALESCE(FIN_Doubtful_Debt.Processed, 'N') AS Processed, " +
      "FIN_Doubtful_Debt.C_Currency_ID, " +
      "FIN_Doubtful_Debt.FIN_Doubtful_Debt_Run_ID, " +
      "        ? AS LANGUAGE " +
      "        FROM FIN_Doubtful_Debt left join (select C_Doctype_ID, Name from C_Doctype) table1 on (FIN_Doubtful_Debt.C_Doctype_ID = table1.C_Doctype_ID) left join (select C_DocType_ID,AD_Language, Name from C_DocType_TRL) tableTRL1 on (table1.C_DocType_ID = tableTRL1.C_DocType_ID and tableTRL1.AD_Language = ?)  left join (select FIN_Payment_Schedule_ID, Duedate, Amount from FIN_Payment_Schedule) table2 on (FIN_Doubtful_Debt.FIN_Payment_Schedule_ID = table2.FIN_Payment_Schedule_ID) left join ad_ref_list_v list1 on (list1.ad_reference_id = '234' and list1.ad_language = ?  AND FIN_Doubtful_Debt.Posted = TO_CHAR(list1.value)) left join (select C_BPartner_ID, Name from C_BPartner) table3 on (FIN_Doubtful_Debt.C_Bpartner_ID = table3.C_BPartner_ID) left join (select M_Product_ID, Name from M_Product) table4 on (FIN_Doubtful_Debt.M_Product_ID = table4.M_Product_ID) left join (select M_Product_ID,AD_Language, Name from M_Product_TRL) tableTRL4 on (table4.M_Product_ID = tableTRL4.M_Product_ID and tableTRL4.AD_Language = ?)  left join (select C_Activity_ID, Name from C_Activity) table5 on (FIN_Doubtful_Debt.C_Activity_ID = table5.C_Activity_ID) left join (select C_Campaign_ID, Name from C_Campaign) table6 on (FIN_Doubtful_Debt.C_Campaign_ID = table6.C_Campaign_ID)" +
      "        WHERE 2=2 " +
      "        AND 1=1 ";
    strSql = strSql + ((finDoubtfulDebtRunId==null || finDoubtfulDebtRunId.equals(""))?"":"  AND FIN_Doubtful_Debt.FIN_Doubtful_Debt_Run_ID = ?  ");
    strSql = strSql + 
      "        AND FIN_Doubtful_Debt.FIN_Doubtful_Debt_ID = ? " +
      "        AND FIN_Doubtful_Debt.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND FIN_Doubtful_Debt.AD_Org_ID IN (";
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
      if (finDoubtfulDebtRunId != null && !(finDoubtfulDebtRunId.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, finDoubtfulDebtRunId);
      }
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
        DoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData objectDoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData = new DoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData();
        objectDoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData.created = UtilSql.getValue(result, "created");
        objectDoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData.createdbyr = UtilSql.getValue(result, "createdbyr");
        objectDoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData.updated = UtilSql.getValue(result, "updated");
        objectDoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData.updatedTimeStamp = UtilSql.getValue(result, "updated_time_stamp");
        objectDoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData.updatedby = UtilSql.getValue(result, "updatedby");
        objectDoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData.updatedbyr = UtilSql.getValue(result, "updatedbyr");
        objectDoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectDoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData.cDoctypeId = UtilSql.getValue(result, "c_doctype_id");
        objectDoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData.cDoctypeIdr = UtilSql.getValue(result, "c_doctype_idr");
        objectDoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData.documentno = UtilSql.getValue(result, "documentno");
        objectDoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData.dateacct = UtilSql.getDateValue(result, "dateacct", "dd-MM-yyyy");
        objectDoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData.finPaymentScheduleId = UtilSql.getValue(result, "fin_payment_schedule_id");
        objectDoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData.finPaymentScheduleIdr = UtilSql.getValue(result, "fin_payment_schedule_idr");
        objectDoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData.description = UtilSql.getValue(result, "description");
        objectDoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData.amount = UtilSql.getValue(result, "amount");
        objectDoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData.posted = UtilSql.getValue(result, "posted");
        objectDoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData.postedBtn = UtilSql.getValue(result, "posted_btn");
        objectDoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData.cBpartnerId = UtilSql.getValue(result, "c_bpartner_id");
        objectDoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData.cBpartnerIdr = UtilSql.getValue(result, "c_bpartner_idr");
        objectDoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData.mProductId = UtilSql.getValue(result, "m_product_id");
        objectDoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData.mProductIdr = UtilSql.getValue(result, "m_product_idr");
        objectDoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData.cProjectId = UtilSql.getValue(result, "c_project_id");
        objectDoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData.cCostcenterId = UtilSql.getValue(result, "c_costcenter_id");
        objectDoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData.cActivityId = UtilSql.getValue(result, "c_activity_id");
        objectDoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData.cActivityIdr = UtilSql.getValue(result, "c_activity_idr");
        objectDoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData.cCampaignId = UtilSql.getValue(result, "c_campaign_id");
        objectDoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData.cCampaignIdr = UtilSql.getValue(result, "c_campaign_idr");
        objectDoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData.user1Id = UtilSql.getValue(result, "user1_id");
        objectDoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData.user2Id = UtilSql.getValue(result, "user2_id");
        objectDoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData.processing = UtilSql.getValue(result, "processing");
        objectDoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData.adClientId = UtilSql.getValue(result, "ad_client_id");
        objectDoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData.finDoubtfulDebtId = UtilSql.getValue(result, "fin_doubtful_debt_id");
        objectDoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData.isactive = UtilSql.getValue(result, "isactive");
        objectDoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData.processed = UtilSql.getValue(result, "processed");
        objectDoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData.cCurrencyId = UtilSql.getValue(result, "c_currency_id");
        objectDoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData.finDoubtfulDebtRunId = UtilSql.getValue(result, "fin_doubtful_debt_run_id");
        objectDoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData.language = UtilSql.getValue(result, "language");
        objectDoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData.adUserClient = "";
        objectDoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData.adOrgClient = "";
        objectDoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData.createdby = "";
        objectDoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData.trBgcolor = "";
        objectDoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData.totalCount = "";
        objectDoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectDoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData);
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
    DoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData objectDoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData[] = new DoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData[vector.size()];
    vector.copyInto(objectDoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData);
    return(objectDoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData);
  }

/**
Create a registry
 */
  public static DoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData[] set(String finDoubtfulDebtRunId, String updatedby, String updatedbyr, String posted, String postedBtn, String description, String cActivityId, String amount, String user2Id, String cBpartnerId, String cBpartnerIdr, String cDoctypeId, String finDoubtfulDebtId, String mProductId, String mProductIdr, String processing, String processed, String createdby, String createdbyr, String cCampaignId, String adOrgId, String documentno, String cProjectId, String dateacct, String cCurrencyId, String cCostcenterId, String user1Id, String adClientId, String finPaymentScheduleId, String isactive)    throws ServletException {
    DoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData objectDoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData[] = new DoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData[1];
    objectDoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData[0] = new DoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData();
    objectDoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData[0].created = "";
    objectDoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData[0].createdbyr = createdbyr;
    objectDoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData[0].updated = "";
    objectDoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData[0].updatedTimeStamp = "";
    objectDoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData[0].updatedby = updatedby;
    objectDoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData[0].updatedbyr = updatedbyr;
    objectDoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData[0].adOrgId = adOrgId;
    objectDoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData[0].cDoctypeId = cDoctypeId;
    objectDoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData[0].cDoctypeIdr = "";
    objectDoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData[0].documentno = documentno;
    objectDoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData[0].dateacct = dateacct;
    objectDoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData[0].finPaymentScheduleId = finPaymentScheduleId;
    objectDoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData[0].finPaymentScheduleIdr = "";
    objectDoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData[0].description = description;
    objectDoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData[0].amount = amount;
    objectDoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData[0].posted = posted;
    objectDoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData[0].postedBtn = postedBtn;
    objectDoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData[0].cBpartnerId = cBpartnerId;
    objectDoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData[0].cBpartnerIdr = cBpartnerIdr;
    objectDoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData[0].mProductId = mProductId;
    objectDoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData[0].mProductIdr = mProductIdr;
    objectDoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData[0].cProjectId = cProjectId;
    objectDoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData[0].cCostcenterId = cCostcenterId;
    objectDoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData[0].cActivityId = cActivityId;
    objectDoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData[0].cActivityIdr = "";
    objectDoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData[0].cCampaignId = cCampaignId;
    objectDoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData[0].cCampaignIdr = "";
    objectDoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData[0].user1Id = user1Id;
    objectDoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData[0].user2Id = user2Id;
    objectDoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData[0].processing = processing;
    objectDoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData[0].adClientId = adClientId;
    objectDoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData[0].finDoubtfulDebtId = finDoubtfulDebtId;
    objectDoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData[0].isactive = isactive;
    objectDoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData[0].processed = processed;
    objectDoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData[0].cCurrencyId = cCurrencyId;
    objectDoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData[0].finDoubtfulDebtRunId = finDoubtfulDebtRunId;
    objectDoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData[0].language = "";
    return objectDoubtfulDebtE4DC11F751F34F0DAE11A4D856CD99EBData;
  }

/**
Select for auxiliar field
 */
  public static String selectDef10EFA7E9E948482C8458CAAD651C3B55_0(ConnectionProvider connectionProvider, String UpdatedbyR)    throws ServletException {
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
  public static String selectDef4E710A3312D448C2B4716EBC30057C58_1(ConnectionProvider connectionProvider, String C_Bpartner_IDR)    throws ServletException {
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

/**
Select for auxiliar field
 */
  public static String selectDef9AAE43C1F49E4D449C60368E5AFE010D_2(ConnectionProvider connectionProvider, String paramLanguage, String M_Product_IDR)    throws ServletException {
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
  public static String selectDefA2E399DBCF4D4540A42F27E55AAD549C_3(ConnectionProvider connectionProvider, String CreatedbyR)    throws ServletException {
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
return the parent ID
 */
  public static String selectParentID(ConnectionProvider connectionProvider, String key)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT FIN_Doubtful_Debt.FIN_Doubtful_Debt_Run_ID AS NAME" +
      "        FROM FIN_Doubtful_Debt" +
      "        WHERE FIN_Doubtful_Debt.FIN_Doubtful_Debt_ID = ?";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, key);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "name");
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
Select for parent field
 */
  public static String selectParent(ConnectionProvider connectionProvider, String finDoubtfulDebtRunId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT (TO_CHAR(table1.Rundate, 'DD-MM-YYYY') || ' - ' || TO_CHAR(COALESCE(TO_CHAR(table1.Percentage), '')) || ' - ' || TO_CHAR(COALESCE(TO_CHAR(table1.Daysoverdue), ''))) AS NAME FROM FIN_Doubtful_Debt_Run left join (select FIN_Doubtful_Debt_Run_ID, Rundate, Percentage, Daysoverdue from FIN_Doubtful_Debt_Run) table1 on (FIN_Doubtful_Debt_Run.FIN_Doubtful_Debt_Run_ID = table1.FIN_Doubtful_Debt_Run_ID) WHERE FIN_Doubtful_Debt_Run.FIN_Doubtful_Debt_Run_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, finDoubtfulDebtRunId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "name");
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
Select for parent field
 */
  public static String selectParentTrl(ConnectionProvider connectionProvider, String finDoubtfulDebtRunId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT (TO_CHAR(table1.Rundate, 'DD-MM-YYYY') || ' - ' || TO_CHAR(COALESCE(TO_CHAR(table1.Percentage), '')) || ' - ' || TO_CHAR(COALESCE(TO_CHAR(table1.Daysoverdue), ''))) AS NAME FROM FIN_Doubtful_Debt_Run left join (select FIN_Doubtful_Debt_Run_ID, Rundate, Percentage, Daysoverdue from FIN_Doubtful_Debt_Run) table1 on (FIN_Doubtful_Debt_Run.FIN_Doubtful_Debt_Run_ID = table1.FIN_Doubtful_Debt_Run_ID) WHERE FIN_Doubtful_Debt_Run.FIN_Doubtful_Debt_Run_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, finDoubtfulDebtRunId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "name");
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
      "        UPDATE FIN_Doubtful_Debt" +
      "        SET AD_Org_ID = (?) , C_Doctype_ID = (?) , DocumentNo = (?) , DateAcct = TO_DATE(?) , FIN_Payment_Schedule_ID = (?) , Description = (?) , Amount = TO_NUMBER(?) , Posted = (?) , C_Bpartner_ID = (?) , M_Product_ID = (?) , C_Project_ID = (?) , C_Costcenter_ID = (?) , C_Activity_ID = (?) , C_Campaign_ID = (?) , User1_ID = (?) , User2_ID = (?) , Processing = (?) , AD_Client_ID = (?) , FIN_Doubtful_Debt_ID = (?) , Isactive = (?) , Processed = (?) , C_Currency_ID = (?) , FIN_Doubtful_Debt_Run_ID = (?) , updated = now(), updatedby = ? " +
      "        WHERE FIN_Doubtful_Debt.FIN_Doubtful_Debt_ID = ? " +
      "                 AND FIN_Doubtful_Debt.FIN_Doubtful_Debt_Run_ID = ? " +
      "        AND FIN_Doubtful_Debt.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND FIN_Doubtful_Debt.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cDoctypeId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, documentno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateacct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, finPaymentScheduleId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, amount);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, posted);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cProjectId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCostcenterId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cActivityId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCampaignId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, user1Id);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, user2Id);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processing);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, finDoubtfulDebtId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processed);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCurrencyId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, finDoubtfulDebtRunId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, finDoubtfulDebtId);
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
      "        INSERT INTO FIN_Doubtful_Debt " +
      "        (AD_Org_ID, C_Doctype_ID, DocumentNo, DateAcct, FIN_Payment_Schedule_ID, Description, Amount, Posted, C_Bpartner_ID, M_Product_ID, C_Project_ID, C_Costcenter_ID, C_Activity_ID, C_Campaign_ID, User1_ID, User2_ID, Processing, AD_Client_ID, FIN_Doubtful_Debt_ID, Isactive, Processed, C_Currency_ID, FIN_Doubtful_Debt_Run_ID, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), (?), TO_DATE(?), (?), (?), TO_NUMBER(?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cDoctypeId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, documentno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateacct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, finPaymentScheduleId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, amount);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, posted);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cProjectId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCostcenterId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cActivityId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCampaignId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, user1Id);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, user2Id);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processing);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, finDoubtfulDebtId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processed);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCurrencyId);
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

  public static int delete(ConnectionProvider connectionProvider, String param1, String finDoubtfulDebtRunId, String adUserClient, String adOrgClient)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        DELETE FROM FIN_Doubtful_Debt" +
      "        WHERE FIN_Doubtful_Debt.FIN_Doubtful_Debt_ID = ? " +
      "                 AND FIN_Doubtful_Debt.FIN_Doubtful_Debt_Run_ID = ? " +
      "        AND FIN_Doubtful_Debt.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND FIN_Doubtful_Debt.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, param1);
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
      "          FROM FIN_Doubtful_Debt" +
      "         WHERE FIN_Doubtful_Debt.FIN_Doubtful_Debt_ID = ? ";

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
      "          FROM FIN_Doubtful_Debt" +
      "         WHERE FIN_Doubtful_Debt.FIN_Doubtful_Debt_ID = ? ";

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
