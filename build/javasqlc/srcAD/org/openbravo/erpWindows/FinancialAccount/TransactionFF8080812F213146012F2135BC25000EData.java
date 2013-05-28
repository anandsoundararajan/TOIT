//Sqlc generated V1.O00-1
package org.openbravo.erpWindows.FinancialAccount;

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
class TransactionFF8080812F213146012F2135BC25000EData implements FieldProvider {
static Logger log4j = Logger.getLogger(TransactionFF8080812F213146012F2135BC25000EData.class);
  private String InitRecordNumber="0";
  public String created;
  public String createdbyr;
  public String updated;
  public String updatedTimeStamp;
  public String updatedby;
  public String updatedbyr;
  public String line;
  public String statementdate;
  public String emAprmModify;
  public String finPaymentId;
  public String finPaymentIdr;
  public String paymentdocno;
  public String status;
  public String statusr;
  public String depositamt;
  public String paymentamt;
  public String cleared;
  public String reconciled;
  public String cCurrencyId;
  public String cCurrencyIdr;
  public String trxtype;
  public String trxtyper;
  public String description;
  public String cGlitemId;
  public String cGlitemIdr;
  public String dateacct;
  public String posted;
  public String postedBtn;
  public String finReconciliationId;
  public String finReconciliationIdr;
  public String foreignAmount;
  public String createdbyalgorithm;
  public String deleteBtn;
  public String foreignCurrencyId;
  public String cBpartnerId;
  public String cBpartnerIdr;
  public String mProductId;
  public String mProductIdr;
  public String cProjectId;
  public String cProjectIdr;
  public String cCostcenterId;
  public String cCostcenterIdr;
  public String cCampaignId;
  public String cCampaignIdr;
  public String cActivityId;
  public String cActivityIdr;
  public String cSalesregionId;
  public String cSalesregionIdr;
  public String user1Id;
  public String user2Id;
  public String processed;
  public String finFinancialAccountId;
  public String isactive;
  public String adOrgId;
  public String adClientId;
  public String finFinaccTransactionId;
  public String forcedTableId;
  public String aprmFinaccTransactionVId;
  public String foreignConvertRate;
  public String processing;
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
    else if (fieldName.equalsIgnoreCase("line"))
      return line;
    else if (fieldName.equalsIgnoreCase("statementdate"))
      return statementdate;
    else if (fieldName.equalsIgnoreCase("em_aprm_modify") || fieldName.equals("emAprmModify"))
      return emAprmModify;
    else if (fieldName.equalsIgnoreCase("fin_payment_id") || fieldName.equals("finPaymentId"))
      return finPaymentId;
    else if (fieldName.equalsIgnoreCase("fin_payment_idr") || fieldName.equals("finPaymentIdr"))
      return finPaymentIdr;
    else if (fieldName.equalsIgnoreCase("paymentdocno"))
      return paymentdocno;
    else if (fieldName.equalsIgnoreCase("status"))
      return status;
    else if (fieldName.equalsIgnoreCase("statusr"))
      return statusr;
    else if (fieldName.equalsIgnoreCase("depositamt"))
      return depositamt;
    else if (fieldName.equalsIgnoreCase("paymentamt"))
      return paymentamt;
    else if (fieldName.equalsIgnoreCase("cleared"))
      return cleared;
    else if (fieldName.equalsIgnoreCase("reconciled"))
      return reconciled;
    else if (fieldName.equalsIgnoreCase("c_currency_id") || fieldName.equals("cCurrencyId"))
      return cCurrencyId;
    else if (fieldName.equalsIgnoreCase("c_currency_idr") || fieldName.equals("cCurrencyIdr"))
      return cCurrencyIdr;
    else if (fieldName.equalsIgnoreCase("trxtype"))
      return trxtype;
    else if (fieldName.equalsIgnoreCase("trxtyper"))
      return trxtyper;
    else if (fieldName.equalsIgnoreCase("description"))
      return description;
    else if (fieldName.equalsIgnoreCase("c_glitem_id") || fieldName.equals("cGlitemId"))
      return cGlitemId;
    else if (fieldName.equalsIgnoreCase("c_glitem_idr") || fieldName.equals("cGlitemIdr"))
      return cGlitemIdr;
    else if (fieldName.equalsIgnoreCase("dateacct"))
      return dateacct;
    else if (fieldName.equalsIgnoreCase("posted"))
      return posted;
    else if (fieldName.equalsIgnoreCase("posted_btn") || fieldName.equals("postedBtn"))
      return postedBtn;
    else if (fieldName.equalsIgnoreCase("fin_reconciliation_id") || fieldName.equals("finReconciliationId"))
      return finReconciliationId;
    else if (fieldName.equalsIgnoreCase("fin_reconciliation_idr") || fieldName.equals("finReconciliationIdr"))
      return finReconciliationIdr;
    else if (fieldName.equalsIgnoreCase("foreign_amount") || fieldName.equals("foreignAmount"))
      return foreignAmount;
    else if (fieldName.equalsIgnoreCase("createdbyalgorithm"))
      return createdbyalgorithm;
    else if (fieldName.equalsIgnoreCase("delete_btn") || fieldName.equals("deleteBtn"))
      return deleteBtn;
    else if (fieldName.equalsIgnoreCase("foreign_currency_id") || fieldName.equals("foreignCurrencyId"))
      return foreignCurrencyId;
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
    else if (fieldName.equalsIgnoreCase("c_project_idr") || fieldName.equals("cProjectIdr"))
      return cProjectIdr;
    else if (fieldName.equalsIgnoreCase("c_costcenter_id") || fieldName.equals("cCostcenterId"))
      return cCostcenterId;
    else if (fieldName.equalsIgnoreCase("c_costcenter_idr") || fieldName.equals("cCostcenterIdr"))
      return cCostcenterIdr;
    else if (fieldName.equalsIgnoreCase("c_campaign_id") || fieldName.equals("cCampaignId"))
      return cCampaignId;
    else if (fieldName.equalsIgnoreCase("c_campaign_idr") || fieldName.equals("cCampaignIdr"))
      return cCampaignIdr;
    else if (fieldName.equalsIgnoreCase("c_activity_id") || fieldName.equals("cActivityId"))
      return cActivityId;
    else if (fieldName.equalsIgnoreCase("c_activity_idr") || fieldName.equals("cActivityIdr"))
      return cActivityIdr;
    else if (fieldName.equalsIgnoreCase("c_salesregion_id") || fieldName.equals("cSalesregionId"))
      return cSalesregionId;
    else if (fieldName.equalsIgnoreCase("c_salesregion_idr") || fieldName.equals("cSalesregionIdr"))
      return cSalesregionIdr;
    else if (fieldName.equalsIgnoreCase("user1_id") || fieldName.equals("user1Id"))
      return user1Id;
    else if (fieldName.equalsIgnoreCase("user2_id") || fieldName.equals("user2Id"))
      return user2Id;
    else if (fieldName.equalsIgnoreCase("processed"))
      return processed;
    else if (fieldName.equalsIgnoreCase("fin_financial_account_id") || fieldName.equals("finFinancialAccountId"))
      return finFinancialAccountId;
    else if (fieldName.equalsIgnoreCase("isactive"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("ad_org_id") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("ad_client_id") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("fin_finacc_transaction_id") || fieldName.equals("finFinaccTransactionId"))
      return finFinaccTransactionId;
    else if (fieldName.equalsIgnoreCase("forced_table_id") || fieldName.equals("forcedTableId"))
      return forcedTableId;
    else if (fieldName.equalsIgnoreCase("aprm_finacc_transaction_v_id") || fieldName.equals("aprmFinaccTransactionVId"))
      return aprmFinaccTransactionVId;
    else if (fieldName.equalsIgnoreCase("foreign_convert_rate") || fieldName.equals("foreignConvertRate"))
      return foreignConvertRate;
    else if (fieldName.equalsIgnoreCase("processing"))
      return processing;
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
  public static TransactionFF8080812F213146012F2135BC25000EData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String finFinancialAccountId, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, finFinancialAccountId, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static TransactionFF8080812F213146012F2135BC25000EData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String finFinancialAccountId, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(APRM_Finacc_Transaction_v.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = APRM_Finacc_Transaction_v.CreatedBy) as CreatedByR, " +
      "        to_char(APRM_Finacc_Transaction_v.Updated, ?) as updated, " +
      "        to_char(APRM_Finacc_Transaction_v.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        APRM_Finacc_Transaction_v.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = APRM_Finacc_Transaction_v.UpdatedBy) as UpdatedByR," +
      "        APRM_Finacc_Transaction_v.Line, " +
      "APRM_Finacc_Transaction_v.Statementdate, " +
      "APRM_Finacc_Transaction_v.EM_APRM_Modify, " +
      "APRM_Finacc_Transaction_v.FIN_Payment_ID, " +
      "(CASE WHEN APRM_Finacc_Transaction_v.FIN_Payment_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.DocumentNo), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(table1.Paymentdate, 'DD-MM-YYYY')),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Name), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.Amount), ''))),'') ) END) AS FIN_Payment_IDR, " +
      "APRM_Finacc_Transaction_v.PaymentDocNo, " +
      "APRM_Finacc_Transaction_v.Status, " +
      "(CASE WHEN APRM_Finacc_Transaction_v.Status IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list1.name),'') ) END) AS StatusR, " +
      "APRM_Finacc_Transaction_v.Depositamt, " +
      "APRM_Finacc_Transaction_v.Paymentamt, " +
      "COALESCE(APRM_Finacc_Transaction_v.Cleared, 'N') AS Cleared, " +
      "COALESCE(APRM_Finacc_Transaction_v.Reconciled, 'N') AS Reconciled, " +
      "APRM_Finacc_Transaction_v.C_Currency_ID, " +
      "(CASE WHEN APRM_Finacc_Transaction_v.C_Currency_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table3.ISO_Code), ''))),'') ) END) AS C_Currency_IDR, " +
      "APRM_Finacc_Transaction_v.Trxtype, " +
      "(CASE WHEN APRM_Finacc_Transaction_v.Trxtype IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list2.name),'') ) END) AS TrxtypeR, " +
      "APRM_Finacc_Transaction_v.Description, " +
      "APRM_Finacc_Transaction_v.C_Glitem_ID, " +
      "(CASE WHEN APRM_Finacc_Transaction_v.C_Glitem_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table4.Name), ''))),'') ) END) AS C_Glitem_IDR, " +
      "APRM_Finacc_Transaction_v.DateAcct, " +
      "APRM_Finacc_Transaction_v.Posted, " +
      "list3.name as Posted_BTN, " +
      "APRM_Finacc_Transaction_v.FIN_Reconciliation_ID, " +
      "(CASE WHEN APRM_Finacc_Transaction_v.FIN_Reconciliation_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table5.DocumentNo), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(table5.Statementdate, 'DD-MM-YYYY')),'') ) END) AS FIN_Reconciliation_IDR, " +
      "APRM_Finacc_Transaction_v.Foreign_Amount, " +
      "COALESCE(APRM_Finacc_Transaction_v.Createdbyalgorithm, 'N') AS Createdbyalgorithm, " +
      "APRM_Finacc_Transaction_v.Delete_Btn, " +
      "APRM_Finacc_Transaction_v.Foreign_Currency_ID, " +
      "APRM_Finacc_Transaction_v.C_Bpartner_ID, " +
      "(CASE WHEN APRM_Finacc_Transaction_v.C_Bpartner_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table6.Name), ''))),'') ) END) AS C_Bpartner_IDR, " +
      "APRM_Finacc_Transaction_v.M_Product_ID, " +
      "(CASE WHEN APRM_Finacc_Transaction_v.M_Product_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL7.Name IS NULL THEN TO_CHAR(table7.Name) ELSE TO_CHAR(tableTRL7.Name) END)), ''))),'') ) END) AS M_Product_IDR, " +
      "APRM_Finacc_Transaction_v.C_Project_ID, " +
      "(CASE WHEN APRM_Finacc_Transaction_v.C_Project_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table8.Value), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table8.Name), ''))),'') ) END) AS C_Project_IDR, " +
      "APRM_Finacc_Transaction_v.C_Costcenter_ID, " +
      "(CASE WHEN APRM_Finacc_Transaction_v.C_Costcenter_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table9.Name), ''))),'') ) END) AS C_Costcenter_IDR, " +
      "APRM_Finacc_Transaction_v.C_Campaign_ID, " +
      "(CASE WHEN APRM_Finacc_Transaction_v.C_Campaign_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table10.Name), ''))),'') ) END) AS C_Campaign_IDR, " +
      "APRM_Finacc_Transaction_v.C_Activity_ID, " +
      "(CASE WHEN APRM_Finacc_Transaction_v.C_Activity_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table11.Name), ''))),'') ) END) AS C_Activity_IDR, " +
      "APRM_Finacc_Transaction_v.C_Salesregion_ID, " +
      "(CASE WHEN APRM_Finacc_Transaction_v.C_Salesregion_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table12.Name), ''))),'') ) END) AS C_Salesregion_IDR, " +
      "APRM_Finacc_Transaction_v.User1_ID, " +
      "APRM_Finacc_Transaction_v.User2_ID, " +
      "COALESCE(APRM_Finacc_Transaction_v.Processed, 'N') AS Processed, " +
      "APRM_Finacc_Transaction_v.FIN_Financial_Account_ID, " +
      "COALESCE(APRM_Finacc_Transaction_v.Isactive, 'N') AS Isactive, " +
      "APRM_Finacc_Transaction_v.AD_Org_ID, " +
      "APRM_Finacc_Transaction_v.AD_Client_ID, " +
      "APRM_Finacc_Transaction_v.FIN_Finacc_Transaction_ID, " +
      "APRM_Finacc_Transaction_v.Forced_Table_ID, " +
      "APRM_Finacc_Transaction_v.Aprm_Finacc_Transaction_V_ID, " +
      "APRM_Finacc_Transaction_v.Foreign_Convert_Rate, " +
      "COALESCE(APRM_Finacc_Transaction_v.Processing, 'N') AS Processing, " +
      "        ? AS LANGUAGE " +
      "        FROM APRM_Finacc_Transaction_v left join (select FIN_Payment_ID, DocumentNo, Paymentdate, C_Bpartner_ID, Amount from FIN_Payment) table1 on (APRM_Finacc_Transaction_v.FIN_Payment_ID = table1.FIN_Payment_ID) left join (select C_BPartner_ID, Name from C_BPartner) table2 on (table1.C_Bpartner_ID = table2.C_BPartner_ID) left join ad_ref_list_v list1 on (APRM_Finacc_Transaction_v.Status = list1.value and list1.ad_reference_id = '575BCB88A4694C27BC013DE9C73E6FE7' and list1.ad_language = ?)  left join (select C_Currency_ID, ISO_Code from C_Currency) table3 on (APRM_Finacc_Transaction_v.C_Currency_ID = table3.C_Currency_ID) left join ad_ref_list_v list2 on (APRM_Finacc_Transaction_v.Trxtype = list2.value and list2.ad_reference_id = '4EFC9773F30B4ACE97D225BD13CFF8CB' and list2.ad_language = ?)  left join (select C_Glitem_ID, Name from C_Glitem) table4 on (APRM_Finacc_Transaction_v.C_Glitem_ID = table4.C_Glitem_ID) left join ad_ref_list_v list3 on (list3.ad_reference_id = '234' and list3.ad_language = ?  AND APRM_Finacc_Transaction_v.Posted = TO_CHAR(list3.value)) left join (select FIN_Reconciliation_ID, DocumentNo, Statementdate from FIN_Reconciliation) table5 on (APRM_Finacc_Transaction_v.FIN_Reconciliation_ID = table5.FIN_Reconciliation_ID) left join (select C_BPartner_ID, Name from C_BPartner) table6 on (APRM_Finacc_Transaction_v.C_Bpartner_ID = table6.C_BPartner_ID) left join (select M_Product_ID, Name from M_Product) table7 on (APRM_Finacc_Transaction_v.M_Product_ID = table7.M_Product_ID) left join (select M_Product_ID,AD_Language, Name from M_Product_TRL) tableTRL7 on (table7.M_Product_ID = tableTRL7.M_Product_ID and tableTRL7.AD_Language = ?)  left join (select C_Project_ID, Value, Name from C_Project) table8 on (APRM_Finacc_Transaction_v.C_Project_ID = table8.C_Project_ID) left join (select C_Costcenter_ID, Name from C_Costcenter) table9 on (APRM_Finacc_Transaction_v.C_Costcenter_ID = table9.C_Costcenter_ID) left join (select C_Campaign_ID, Name from C_Campaign) table10 on (APRM_Finacc_Transaction_v.C_Campaign_ID = table10.C_Campaign_ID) left join (select C_Activity_ID, Name from C_Activity) table11 on (APRM_Finacc_Transaction_v.C_Activity_ID = table11.C_Activity_ID) left join (select C_Salesregion_ID, Name from C_Salesregion) table12 on (APRM_Finacc_Transaction_v.C_Salesregion_ID = table12.C_Salesregion_ID)" +
      "        WHERE 2=2 " +
      "        AND 1=1 ";
    strSql = strSql + ((finFinancialAccountId==null || finFinancialAccountId.equals(""))?"":"  AND APRM_Finacc_Transaction_v.FIN_Financial_Account_ID = ?  ");
    strSql = strSql + 
      "        AND APRM_Finacc_Transaction_v.Aprm_Finacc_Transaction_V_ID = ? " +
      "        AND APRM_Finacc_Transaction_v.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND APRM_Finacc_Transaction_v.AD_Org_ID IN (";
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
      if (finFinancialAccountId != null && !(finFinancialAccountId.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, finFinancialAccountId);
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
        TransactionFF8080812F213146012F2135BC25000EData objectTransactionFF8080812F213146012F2135BC25000EData = new TransactionFF8080812F213146012F2135BC25000EData();
        objectTransactionFF8080812F213146012F2135BC25000EData.created = UtilSql.getValue(result, "created");
        objectTransactionFF8080812F213146012F2135BC25000EData.createdbyr = UtilSql.getValue(result, "createdbyr");
        objectTransactionFF8080812F213146012F2135BC25000EData.updated = UtilSql.getValue(result, "updated");
        objectTransactionFF8080812F213146012F2135BC25000EData.updatedTimeStamp = UtilSql.getValue(result, "updated_time_stamp");
        objectTransactionFF8080812F213146012F2135BC25000EData.updatedby = UtilSql.getValue(result, "updatedby");
        objectTransactionFF8080812F213146012F2135BC25000EData.updatedbyr = UtilSql.getValue(result, "updatedbyr");
        objectTransactionFF8080812F213146012F2135BC25000EData.line = UtilSql.getValue(result, "line");
        objectTransactionFF8080812F213146012F2135BC25000EData.statementdate = UtilSql.getDateValue(result, "statementdate", "dd-MM-yyyy");
        objectTransactionFF8080812F213146012F2135BC25000EData.emAprmModify = UtilSql.getValue(result, "em_aprm_modify");
        objectTransactionFF8080812F213146012F2135BC25000EData.finPaymentId = UtilSql.getValue(result, "fin_payment_id");
        objectTransactionFF8080812F213146012F2135BC25000EData.finPaymentIdr = UtilSql.getValue(result, "fin_payment_idr");
        objectTransactionFF8080812F213146012F2135BC25000EData.paymentdocno = UtilSql.getValue(result, "paymentdocno");
        objectTransactionFF8080812F213146012F2135BC25000EData.status = UtilSql.getValue(result, "status");
        objectTransactionFF8080812F213146012F2135BC25000EData.statusr = UtilSql.getValue(result, "statusr");
        objectTransactionFF8080812F213146012F2135BC25000EData.depositamt = UtilSql.getValue(result, "depositamt");
        objectTransactionFF8080812F213146012F2135BC25000EData.paymentamt = UtilSql.getValue(result, "paymentamt");
        objectTransactionFF8080812F213146012F2135BC25000EData.cleared = UtilSql.getValue(result, "cleared");
        objectTransactionFF8080812F213146012F2135BC25000EData.reconciled = UtilSql.getValue(result, "reconciled");
        objectTransactionFF8080812F213146012F2135BC25000EData.cCurrencyId = UtilSql.getValue(result, "c_currency_id");
        objectTransactionFF8080812F213146012F2135BC25000EData.cCurrencyIdr = UtilSql.getValue(result, "c_currency_idr");
        objectTransactionFF8080812F213146012F2135BC25000EData.trxtype = UtilSql.getValue(result, "trxtype");
        objectTransactionFF8080812F213146012F2135BC25000EData.trxtyper = UtilSql.getValue(result, "trxtyper");
        objectTransactionFF8080812F213146012F2135BC25000EData.description = UtilSql.getValue(result, "description");
        objectTransactionFF8080812F213146012F2135BC25000EData.cGlitemId = UtilSql.getValue(result, "c_glitem_id");
        objectTransactionFF8080812F213146012F2135BC25000EData.cGlitemIdr = UtilSql.getValue(result, "c_glitem_idr");
        objectTransactionFF8080812F213146012F2135BC25000EData.dateacct = UtilSql.getDateValue(result, "dateacct", "dd-MM-yyyy");
        objectTransactionFF8080812F213146012F2135BC25000EData.posted = UtilSql.getValue(result, "posted");
        objectTransactionFF8080812F213146012F2135BC25000EData.postedBtn = UtilSql.getValue(result, "posted_btn");
        objectTransactionFF8080812F213146012F2135BC25000EData.finReconciliationId = UtilSql.getValue(result, "fin_reconciliation_id");
        objectTransactionFF8080812F213146012F2135BC25000EData.finReconciliationIdr = UtilSql.getValue(result, "fin_reconciliation_idr");
        objectTransactionFF8080812F213146012F2135BC25000EData.foreignAmount = UtilSql.getValue(result, "foreign_amount");
        objectTransactionFF8080812F213146012F2135BC25000EData.createdbyalgorithm = UtilSql.getValue(result, "createdbyalgorithm");
        objectTransactionFF8080812F213146012F2135BC25000EData.deleteBtn = UtilSql.getValue(result, "delete_btn");
        objectTransactionFF8080812F213146012F2135BC25000EData.foreignCurrencyId = UtilSql.getValue(result, "foreign_currency_id");
        objectTransactionFF8080812F213146012F2135BC25000EData.cBpartnerId = UtilSql.getValue(result, "c_bpartner_id");
        objectTransactionFF8080812F213146012F2135BC25000EData.cBpartnerIdr = UtilSql.getValue(result, "c_bpartner_idr");
        objectTransactionFF8080812F213146012F2135BC25000EData.mProductId = UtilSql.getValue(result, "m_product_id");
        objectTransactionFF8080812F213146012F2135BC25000EData.mProductIdr = UtilSql.getValue(result, "m_product_idr");
        objectTransactionFF8080812F213146012F2135BC25000EData.cProjectId = UtilSql.getValue(result, "c_project_id");
        objectTransactionFF8080812F213146012F2135BC25000EData.cProjectIdr = UtilSql.getValue(result, "c_project_idr");
        objectTransactionFF8080812F213146012F2135BC25000EData.cCostcenterId = UtilSql.getValue(result, "c_costcenter_id");
        objectTransactionFF8080812F213146012F2135BC25000EData.cCostcenterIdr = UtilSql.getValue(result, "c_costcenter_idr");
        objectTransactionFF8080812F213146012F2135BC25000EData.cCampaignId = UtilSql.getValue(result, "c_campaign_id");
        objectTransactionFF8080812F213146012F2135BC25000EData.cCampaignIdr = UtilSql.getValue(result, "c_campaign_idr");
        objectTransactionFF8080812F213146012F2135BC25000EData.cActivityId = UtilSql.getValue(result, "c_activity_id");
        objectTransactionFF8080812F213146012F2135BC25000EData.cActivityIdr = UtilSql.getValue(result, "c_activity_idr");
        objectTransactionFF8080812F213146012F2135BC25000EData.cSalesregionId = UtilSql.getValue(result, "c_salesregion_id");
        objectTransactionFF8080812F213146012F2135BC25000EData.cSalesregionIdr = UtilSql.getValue(result, "c_salesregion_idr");
        objectTransactionFF8080812F213146012F2135BC25000EData.user1Id = UtilSql.getValue(result, "user1_id");
        objectTransactionFF8080812F213146012F2135BC25000EData.user2Id = UtilSql.getValue(result, "user2_id");
        objectTransactionFF8080812F213146012F2135BC25000EData.processed = UtilSql.getValue(result, "processed");
        objectTransactionFF8080812F213146012F2135BC25000EData.finFinancialAccountId = UtilSql.getValue(result, "fin_financial_account_id");
        objectTransactionFF8080812F213146012F2135BC25000EData.isactive = UtilSql.getValue(result, "isactive");
        objectTransactionFF8080812F213146012F2135BC25000EData.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectTransactionFF8080812F213146012F2135BC25000EData.adClientId = UtilSql.getValue(result, "ad_client_id");
        objectTransactionFF8080812F213146012F2135BC25000EData.finFinaccTransactionId = UtilSql.getValue(result, "fin_finacc_transaction_id");
        objectTransactionFF8080812F213146012F2135BC25000EData.forcedTableId = UtilSql.getValue(result, "forced_table_id");
        objectTransactionFF8080812F213146012F2135BC25000EData.aprmFinaccTransactionVId = UtilSql.getValue(result, "aprm_finacc_transaction_v_id");
        objectTransactionFF8080812F213146012F2135BC25000EData.foreignConvertRate = UtilSql.getValue(result, "foreign_convert_rate");
        objectTransactionFF8080812F213146012F2135BC25000EData.processing = UtilSql.getValue(result, "processing");
        objectTransactionFF8080812F213146012F2135BC25000EData.language = UtilSql.getValue(result, "language");
        objectTransactionFF8080812F213146012F2135BC25000EData.adUserClient = "";
        objectTransactionFF8080812F213146012F2135BC25000EData.adOrgClient = "";
        objectTransactionFF8080812F213146012F2135BC25000EData.createdby = "";
        objectTransactionFF8080812F213146012F2135BC25000EData.trBgcolor = "";
        objectTransactionFF8080812F213146012F2135BC25000EData.totalCount = "";
        objectTransactionFF8080812F213146012F2135BC25000EData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectTransactionFF8080812F213146012F2135BC25000EData);
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
    TransactionFF8080812F213146012F2135BC25000EData objectTransactionFF8080812F213146012F2135BC25000EData[] = new TransactionFF8080812F213146012F2135BC25000EData[vector.size()];
    vector.copyInto(objectTransactionFF8080812F213146012F2135BC25000EData);
    return(objectTransactionFF8080812F213146012F2135BC25000EData);
  }

/**
Create a registry
 */
  public static TransactionFF8080812F213146012F2135BC25000EData[] set(String finFinancialAccountId, String foreignAmount, String cCostcenterId, String foreignCurrencyId, String cSalesregionId, String aprmFinaccTransactionVId, String finFinaccTransactionId, String adClientId, String adOrgId, String isactive, String createdby, String createdbyr, String updatedby, String updatedbyr, String line, String description, String statementdate, String trxtype, String finPaymentId, String cGlitemId, String depositamt, String paymentamt, String cCurrencyId, String finReconciliationId, String status, String createdbyalgorithm, String posted, String postedBtn, String dateacct, String processed, String processing, String user1Id, String user2Id, String cActivityId, String cCampaignId, String cProjectId, String cleared, String cBpartnerId, String cBpartnerIdr, String paymentdocno, String reconciled, String deleteBtn, String forcedTableId, String emAprmModify, String mProductId, String mProductIdr, String foreignConvertRate)    throws ServletException {
    TransactionFF8080812F213146012F2135BC25000EData objectTransactionFF8080812F213146012F2135BC25000EData[] = new TransactionFF8080812F213146012F2135BC25000EData[1];
    objectTransactionFF8080812F213146012F2135BC25000EData[0] = new TransactionFF8080812F213146012F2135BC25000EData();
    objectTransactionFF8080812F213146012F2135BC25000EData[0].created = "";
    objectTransactionFF8080812F213146012F2135BC25000EData[0].createdbyr = createdbyr;
    objectTransactionFF8080812F213146012F2135BC25000EData[0].updated = "";
    objectTransactionFF8080812F213146012F2135BC25000EData[0].updatedTimeStamp = "";
    objectTransactionFF8080812F213146012F2135BC25000EData[0].updatedby = updatedby;
    objectTransactionFF8080812F213146012F2135BC25000EData[0].updatedbyr = updatedbyr;
    objectTransactionFF8080812F213146012F2135BC25000EData[0].line = line;
    objectTransactionFF8080812F213146012F2135BC25000EData[0].statementdate = statementdate;
    objectTransactionFF8080812F213146012F2135BC25000EData[0].emAprmModify = emAprmModify;
    objectTransactionFF8080812F213146012F2135BC25000EData[0].finPaymentId = finPaymentId;
    objectTransactionFF8080812F213146012F2135BC25000EData[0].finPaymentIdr = "";
    objectTransactionFF8080812F213146012F2135BC25000EData[0].paymentdocno = paymentdocno;
    objectTransactionFF8080812F213146012F2135BC25000EData[0].status = status;
    objectTransactionFF8080812F213146012F2135BC25000EData[0].statusr = "";
    objectTransactionFF8080812F213146012F2135BC25000EData[0].depositamt = depositamt;
    objectTransactionFF8080812F213146012F2135BC25000EData[0].paymentamt = paymentamt;
    objectTransactionFF8080812F213146012F2135BC25000EData[0].cleared = cleared;
    objectTransactionFF8080812F213146012F2135BC25000EData[0].reconciled = reconciled;
    objectTransactionFF8080812F213146012F2135BC25000EData[0].cCurrencyId = cCurrencyId;
    objectTransactionFF8080812F213146012F2135BC25000EData[0].cCurrencyIdr = "";
    objectTransactionFF8080812F213146012F2135BC25000EData[0].trxtype = trxtype;
    objectTransactionFF8080812F213146012F2135BC25000EData[0].trxtyper = "";
    objectTransactionFF8080812F213146012F2135BC25000EData[0].description = description;
    objectTransactionFF8080812F213146012F2135BC25000EData[0].cGlitemId = cGlitemId;
    objectTransactionFF8080812F213146012F2135BC25000EData[0].cGlitemIdr = "";
    objectTransactionFF8080812F213146012F2135BC25000EData[0].dateacct = dateacct;
    objectTransactionFF8080812F213146012F2135BC25000EData[0].posted = posted;
    objectTransactionFF8080812F213146012F2135BC25000EData[0].postedBtn = postedBtn;
    objectTransactionFF8080812F213146012F2135BC25000EData[0].finReconciliationId = finReconciliationId;
    objectTransactionFF8080812F213146012F2135BC25000EData[0].finReconciliationIdr = "";
    objectTransactionFF8080812F213146012F2135BC25000EData[0].foreignAmount = foreignAmount;
    objectTransactionFF8080812F213146012F2135BC25000EData[0].createdbyalgorithm = createdbyalgorithm;
    objectTransactionFF8080812F213146012F2135BC25000EData[0].deleteBtn = deleteBtn;
    objectTransactionFF8080812F213146012F2135BC25000EData[0].foreignCurrencyId = foreignCurrencyId;
    objectTransactionFF8080812F213146012F2135BC25000EData[0].cBpartnerId = cBpartnerId;
    objectTransactionFF8080812F213146012F2135BC25000EData[0].cBpartnerIdr = cBpartnerIdr;
    objectTransactionFF8080812F213146012F2135BC25000EData[0].mProductId = mProductId;
    objectTransactionFF8080812F213146012F2135BC25000EData[0].mProductIdr = mProductIdr;
    objectTransactionFF8080812F213146012F2135BC25000EData[0].cProjectId = cProjectId;
    objectTransactionFF8080812F213146012F2135BC25000EData[0].cProjectIdr = "";
    objectTransactionFF8080812F213146012F2135BC25000EData[0].cCostcenterId = cCostcenterId;
    objectTransactionFF8080812F213146012F2135BC25000EData[0].cCostcenterIdr = "";
    objectTransactionFF8080812F213146012F2135BC25000EData[0].cCampaignId = cCampaignId;
    objectTransactionFF8080812F213146012F2135BC25000EData[0].cCampaignIdr = "";
    objectTransactionFF8080812F213146012F2135BC25000EData[0].cActivityId = cActivityId;
    objectTransactionFF8080812F213146012F2135BC25000EData[0].cActivityIdr = "";
    objectTransactionFF8080812F213146012F2135BC25000EData[0].cSalesregionId = cSalesregionId;
    objectTransactionFF8080812F213146012F2135BC25000EData[0].cSalesregionIdr = "";
    objectTransactionFF8080812F213146012F2135BC25000EData[0].user1Id = user1Id;
    objectTransactionFF8080812F213146012F2135BC25000EData[0].user2Id = user2Id;
    objectTransactionFF8080812F213146012F2135BC25000EData[0].processed = processed;
    objectTransactionFF8080812F213146012F2135BC25000EData[0].finFinancialAccountId = finFinancialAccountId;
    objectTransactionFF8080812F213146012F2135BC25000EData[0].isactive = isactive;
    objectTransactionFF8080812F213146012F2135BC25000EData[0].adOrgId = adOrgId;
    objectTransactionFF8080812F213146012F2135BC25000EData[0].adClientId = adClientId;
    objectTransactionFF8080812F213146012F2135BC25000EData[0].finFinaccTransactionId = finFinaccTransactionId;
    objectTransactionFF8080812F213146012F2135BC25000EData[0].forcedTableId = forcedTableId;
    objectTransactionFF8080812F213146012F2135BC25000EData[0].aprmFinaccTransactionVId = aprmFinaccTransactionVId;
    objectTransactionFF8080812F213146012F2135BC25000EData[0].foreignConvertRate = foreignConvertRate;
    objectTransactionFF8080812F213146012F2135BC25000EData[0].processing = processing;
    objectTransactionFF8080812F213146012F2135BC25000EData[0].language = "";
    return objectTransactionFF8080812F213146012F2135BC25000EData;
  }

/**
Select for auxiliar field
 */
  public static String selectAuxFF808081308851A40130887E45400063(ConnectionProvider connectionProvider, String FIN_PAYMENT_ID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT COALESCE(ISRECEIPT,'Y') AS ISRECEIPT FROM FIN_PAYMENT WHERE FIN_PAYMENT_ID = ? ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, FIN_PAYMENT_ID);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "isreceipt");
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
  public static String selectActP15C8708DFC464C2D91286E59624FDD18_C_GLItem_ID(ConnectionProvider connectionProvider, String C_GLItem_ID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT name FROM C_GLItem WHERE C_GLItem_ID=? ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_GLItem_ID);

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
Select for auxiliar field
 */
  public static String selectDefA37C6F84AA243F50E040007F01006E35_0(ConnectionProvider connectionProvider, String CreatedbyR)    throws ServletException {
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
  public static String selectDefA37C6F84AA263F50E040007F01006E35_1(ConnectionProvider connectionProvider, String UpdatedbyR)    throws ServletException {
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
  public static String selectDefA37C6F84AA283F50E040007F01006E35(ConnectionProvider connectionProvider, String FIN_Financial_Account_ID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT COALESCE(MAX(LINE),0)+10 AS DefaultValue FROM FIN_FINACC_TRANSACTION WHERE FIN_Financial_Account_ID=? ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, FIN_Financial_Account_ID);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "defaultvalue");
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
  public static String selectDefA37C6F84AA3E3F50E040007F01006E35_2(ConnectionProvider connectionProvider, String C_Bpartner_IDR)    throws ServletException {
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
  public static String selectDefBBA3DB68DBD844B29F1EEC9A04F112E8_3(ConnectionProvider connectionProvider, String paramLanguage, String M_Product_IDR)    throws ServletException {
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
return the parent ID
 */
  public static String selectParentID(ConnectionProvider connectionProvider, String key)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT APRM_Finacc_Transaction_v.FIN_Financial_Account_ID AS NAME" +
      "        FROM APRM_Finacc_Transaction_v" +
      "        WHERE APRM_Finacc_Transaction_v.Aprm_Finacc_Transaction_V_ID = ?";

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
  public static String selectParent(ConnectionProvider connectionProvider, String finFinancialAccountId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT (TO_CHAR(COALESCE(TO_CHAR(table2.ISO_Code), '')) || ' - ' || TO_CHAR(COALESCE(TO_CHAR(table1.Name), ''))) AS NAME FROM FIN_Financial_Account left join (select FIN_Financial_Account_ID, C_Currency_ID, Name from FIN_Financial_Account) table1 on (FIN_Financial_Account.FIN_Financial_Account_ID = table1.FIN_Financial_Account_ID) left join (select C_Currency_ID, ISO_Code from C_Currency) table2 on (table1.C_Currency_ID = table2.C_Currency_ID) WHERE FIN_Financial_Account.FIN_Financial_Account_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, finFinancialAccountId);

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
  public static String selectParentTrl(ConnectionProvider connectionProvider, String finFinancialAccountId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT (TO_CHAR(COALESCE(TO_CHAR(table2.ISO_Code), '')) || ' - ' || TO_CHAR(COALESCE(TO_CHAR(table1.Name), ''))) AS NAME FROM FIN_Financial_Account left join (select FIN_Financial_Account_ID, C_Currency_ID, Name from FIN_Financial_Account) table1 on (FIN_Financial_Account.FIN_Financial_Account_ID = table1.FIN_Financial_Account_ID) left join (select C_Currency_ID, ISO_Code from C_Currency) table2 on (table1.C_Currency_ID = table2.C_Currency_ID) WHERE FIN_Financial_Account.FIN_Financial_Account_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, finFinancialAccountId);

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
      "        UPDATE APRM_Finacc_Transaction_v" +
      "        SET Line = TO_NUMBER(?) , Statementdate = TO_DATE(?) , EM_APRM_Modify = (?) , FIN_Payment_ID = (?) , PaymentDocNo = (?) , Status = (?) , Depositamt = TO_NUMBER(?) , Paymentamt = TO_NUMBER(?) , Cleared = (?) , Reconciled = (?) , C_Currency_ID = (?) , Trxtype = (?) , Description = (?) , C_Glitem_ID = (?) , DateAcct = TO_DATE(?) , Posted = (?) , FIN_Reconciliation_ID = (?) , Foreign_Amount = TO_NUMBER(?) , Createdbyalgorithm = (?) , Delete_Btn = (?) , Foreign_Currency_ID = (?) , C_Bpartner_ID = (?) , M_Product_ID = (?) , C_Project_ID = (?) , C_Costcenter_ID = (?) , C_Campaign_ID = (?) , C_Activity_ID = (?) , C_Salesregion_ID = (?) , User1_ID = (?) , User2_ID = (?) , Processed = (?) , FIN_Financial_Account_ID = (?) , Isactive = (?) , AD_Org_ID = (?) , AD_Client_ID = (?) , FIN_Finacc_Transaction_ID = (?) , Forced_Table_ID = (?) , Aprm_Finacc_Transaction_V_ID = (?) , Foreign_Convert_Rate = TO_NUMBER(?) , Processing = (?) , updated = now(), updatedby = ? " +
      "        WHERE APRM_Finacc_Transaction_v.Aprm_Finacc_Transaction_V_ID = ? " +
      "                 AND APRM_Finacc_Transaction_v.FIN_Financial_Account_ID = ? " +
      "        AND APRM_Finacc_Transaction_v.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND APRM_Finacc_Transaction_v.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, line);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, statementdate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emAprmModify);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, finPaymentId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paymentdocno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, status);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, depositamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paymentamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cleared);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, reconciled);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCurrencyId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, trxtype);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cGlitemId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateacct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, posted);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, finReconciliationId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, foreignAmount);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, createdbyalgorithm);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, deleteBtn);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, foreignCurrencyId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cProjectId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCostcenterId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCampaignId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cActivityId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cSalesregionId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, user1Id);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, user2Id);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processed);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, finFinancialAccountId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, finFinaccTransactionId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, forcedTableId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, aprmFinaccTransactionVId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, foreignConvertRate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processing);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, aprmFinaccTransactionVId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, finFinancialAccountId);
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
      "        INSERT INTO APRM_Finacc_Transaction_v " +
      "        (Line, Statementdate, EM_APRM_Modify, FIN_Payment_ID, PaymentDocNo, Status, Depositamt, Paymentamt, Cleared, Reconciled, C_Currency_ID, Trxtype, Description, C_Glitem_ID, DateAcct, Posted, FIN_Reconciliation_ID, Foreign_Amount, Createdbyalgorithm, Delete_Btn, Foreign_Currency_ID, C_Bpartner_ID, M_Product_ID, C_Project_ID, C_Costcenter_ID, C_Campaign_ID, C_Activity_ID, C_Salesregion_ID, User1_ID, User2_ID, Processed, FIN_Financial_Account_ID, Isactive, AD_Org_ID, AD_Client_ID, FIN_Finacc_Transaction_ID, Forced_Table_ID, Aprm_Finacc_Transaction_V_ID, Foreign_Convert_Rate, Processing, created, createdby, updated, updatedBy)" +
      "        VALUES (TO_NUMBER(?), TO_DATE(?), (?), (?), (?), (?), TO_NUMBER(?), TO_NUMBER(?), (?), (?), (?), (?), (?), (?), TO_DATE(?), (?), (?), TO_NUMBER(?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), TO_NUMBER(?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, line);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, statementdate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emAprmModify);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, finPaymentId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paymentdocno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, status);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, depositamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paymentamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cleared);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, reconciled);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCurrencyId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, trxtype);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cGlitemId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateacct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, posted);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, finReconciliationId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, foreignAmount);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, createdbyalgorithm);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, deleteBtn);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, foreignCurrencyId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cProjectId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCostcenterId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCampaignId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cActivityId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cSalesregionId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, user1Id);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, user2Id);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processed);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, finFinancialAccountId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, finFinaccTransactionId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, forcedTableId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, aprmFinaccTransactionVId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, foreignConvertRate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processing);
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

  public static int delete(ConnectionProvider connectionProvider, String param1, String finFinancialAccountId, String adUserClient, String adOrgClient)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        DELETE FROM APRM_Finacc_Transaction_v" +
      "        WHERE APRM_Finacc_Transaction_v.Aprm_Finacc_Transaction_V_ID = ? " +
      "                 AND APRM_Finacc_Transaction_v.FIN_Financial_Account_ID = ? " +
      "        AND APRM_Finacc_Transaction_v.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND APRM_Finacc_Transaction_v.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, param1);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, finFinancialAccountId);
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
      "          FROM APRM_Finacc_Transaction_v" +
      "         WHERE APRM_Finacc_Transaction_v.Aprm_Finacc_Transaction_V_ID = ? ";

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
      "          FROM APRM_Finacc_Transaction_v" +
      "         WHERE APRM_Finacc_Transaction_v.Aprm_Finacc_Transaction_V_ID = ? ";

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
