//Sqlc generated V1.O00-1
package org.openbravo.erpWindows.PaymentOut;

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
class HeaderData implements FieldProvider {
static Logger log4j = Logger.getLogger(HeaderData.class);
  private String InitRecordNumber="0";
  public String created;
  public String createdbyr;
  public String updated;
  public String updatedTimeStamp;
  public String updatedby;
  public String updatedbyr;
  public String adOrgId;
  public String adOrgIdr;
  public String cDoctypeId;
  public String cDoctypeIdr;
  public String documentno;
  public String referenceno;
  public String paymentdate;
  public String cBpartnerId;
  public String cBpartnerIdr;
  public String description;
  public String finPaymentmethodId;
  public String finPaymentmethodIdr;
  public String finFinancialAccountId;
  public String finFinancialAccountIdr;
  public String cCurrencyId;
  public String cCurrencyIdr;
  public String finaccTxnAmount;
  public String finaccTxnConvertRate;
  public String generatedCredit;
  public String emAprmAddScheduledpayments;
  public String posted;
  public String postedBtn;
  public String emAprmProcessPayment;
  public String emAprmProcessPaymentBtn;
  public String emAprmExecutepayment;
  public String amount;
  public String status;
  public String usedCredit;
  public String writeoffamt;
  public String emAprmReversepayment;
  public String finRevPaymentId;
  public String createdbyalgorithm;
  public String cProjectId;
  public String cProjectIdr;
  public String cCostcenterId;
  public String cActivityId;
  public String cCampaignId;
  public String user1Id;
  public String user2Id;
  public String adClientId;
  public String isreceipt;
  public String emAprmReconcilePayment;
  public String processing;
  public String processed;
  public String finPaymentId;
  public String isactive;
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
    else if (fieldName.equalsIgnoreCase("c_doctype_id") || fieldName.equals("cDoctypeId"))
      return cDoctypeId;
    else if (fieldName.equalsIgnoreCase("c_doctype_idr") || fieldName.equals("cDoctypeIdr"))
      return cDoctypeIdr;
    else if (fieldName.equalsIgnoreCase("documentno"))
      return documentno;
    else if (fieldName.equalsIgnoreCase("referenceno"))
      return referenceno;
    else if (fieldName.equalsIgnoreCase("paymentdate"))
      return paymentdate;
    else if (fieldName.equalsIgnoreCase("c_bpartner_id") || fieldName.equals("cBpartnerId"))
      return cBpartnerId;
    else if (fieldName.equalsIgnoreCase("c_bpartner_idr") || fieldName.equals("cBpartnerIdr"))
      return cBpartnerIdr;
    else if (fieldName.equalsIgnoreCase("description"))
      return description;
    else if (fieldName.equalsIgnoreCase("fin_paymentmethod_id") || fieldName.equals("finPaymentmethodId"))
      return finPaymentmethodId;
    else if (fieldName.equalsIgnoreCase("fin_paymentmethod_idr") || fieldName.equals("finPaymentmethodIdr"))
      return finPaymentmethodIdr;
    else if (fieldName.equalsIgnoreCase("fin_financial_account_id") || fieldName.equals("finFinancialAccountId"))
      return finFinancialAccountId;
    else if (fieldName.equalsIgnoreCase("fin_financial_account_idr") || fieldName.equals("finFinancialAccountIdr"))
      return finFinancialAccountIdr;
    else if (fieldName.equalsIgnoreCase("c_currency_id") || fieldName.equals("cCurrencyId"))
      return cCurrencyId;
    else if (fieldName.equalsIgnoreCase("c_currency_idr") || fieldName.equals("cCurrencyIdr"))
      return cCurrencyIdr;
    else if (fieldName.equalsIgnoreCase("finacc_txn_amount") || fieldName.equals("finaccTxnAmount"))
      return finaccTxnAmount;
    else if (fieldName.equalsIgnoreCase("finacc_txn_convert_rate") || fieldName.equals("finaccTxnConvertRate"))
      return finaccTxnConvertRate;
    else if (fieldName.equalsIgnoreCase("generated_credit") || fieldName.equals("generatedCredit"))
      return generatedCredit;
    else if (fieldName.equalsIgnoreCase("em_aprm_add_scheduledpayments") || fieldName.equals("emAprmAddScheduledpayments"))
      return emAprmAddScheduledpayments;
    else if (fieldName.equalsIgnoreCase("posted"))
      return posted;
    else if (fieldName.equalsIgnoreCase("posted_btn") || fieldName.equals("postedBtn"))
      return postedBtn;
    else if (fieldName.equalsIgnoreCase("em_aprm_process_payment") || fieldName.equals("emAprmProcessPayment"))
      return emAprmProcessPayment;
    else if (fieldName.equalsIgnoreCase("em_aprm_process_payment_btn") || fieldName.equals("emAprmProcessPaymentBtn"))
      return emAprmProcessPaymentBtn;
    else if (fieldName.equalsIgnoreCase("em_aprm_executepayment") || fieldName.equals("emAprmExecutepayment"))
      return emAprmExecutepayment;
    else if (fieldName.equalsIgnoreCase("amount"))
      return amount;
    else if (fieldName.equalsIgnoreCase("status"))
      return status;
    else if (fieldName.equalsIgnoreCase("used_credit") || fieldName.equals("usedCredit"))
      return usedCredit;
    else if (fieldName.equalsIgnoreCase("writeoffamt"))
      return writeoffamt;
    else if (fieldName.equalsIgnoreCase("em_aprm_reversepayment") || fieldName.equals("emAprmReversepayment"))
      return emAprmReversepayment;
    else if (fieldName.equalsIgnoreCase("fin_rev_payment_id") || fieldName.equals("finRevPaymentId"))
      return finRevPaymentId;
    else if (fieldName.equalsIgnoreCase("createdbyalgorithm"))
      return createdbyalgorithm;
    else if (fieldName.equalsIgnoreCase("c_project_id") || fieldName.equals("cProjectId"))
      return cProjectId;
    else if (fieldName.equalsIgnoreCase("c_project_idr") || fieldName.equals("cProjectIdr"))
      return cProjectIdr;
    else if (fieldName.equalsIgnoreCase("c_costcenter_id") || fieldName.equals("cCostcenterId"))
      return cCostcenterId;
    else if (fieldName.equalsIgnoreCase("c_activity_id") || fieldName.equals("cActivityId"))
      return cActivityId;
    else if (fieldName.equalsIgnoreCase("c_campaign_id") || fieldName.equals("cCampaignId"))
      return cCampaignId;
    else if (fieldName.equalsIgnoreCase("user1_id") || fieldName.equals("user1Id"))
      return user1Id;
    else if (fieldName.equalsIgnoreCase("user2_id") || fieldName.equals("user2Id"))
      return user2Id;
    else if (fieldName.equalsIgnoreCase("ad_client_id") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("isreceipt"))
      return isreceipt;
    else if (fieldName.equalsIgnoreCase("em_aprm_reconcile_payment") || fieldName.equals("emAprmReconcilePayment"))
      return emAprmReconcilePayment;
    else if (fieldName.equalsIgnoreCase("processing"))
      return processing;
    else if (fieldName.equalsIgnoreCase("processed"))
      return processed;
    else if (fieldName.equalsIgnoreCase("fin_payment_id") || fieldName.equals("finPaymentId"))
      return finPaymentId;
    else if (fieldName.equalsIgnoreCase("isactive"))
      return isactive;
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
  public static HeaderData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static HeaderData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(FIN_Payment.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = FIN_Payment.CreatedBy) as CreatedByR, " +
      "        to_char(FIN_Payment.Updated, ?) as updated, " +
      "        to_char(FIN_Payment.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        FIN_Payment.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = FIN_Payment.UpdatedBy) as UpdatedByR," +
      "        FIN_Payment.AD_Org_ID, " +
      "(CASE WHEN FIN_Payment.AD_Org_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.Name), ''))),'') ) END) AS AD_Org_IDR, " +
      "FIN_Payment.C_DocType_ID, " +
      "(CASE WHEN FIN_Payment.C_DocType_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL2.Name IS NULL THEN TO_CHAR(table2.Name) ELSE TO_CHAR(tableTRL2.Name) END)), ''))),'') ) END) AS C_DocType_IDR, " +
      "FIN_Payment.DocumentNo, " +
      "FIN_Payment.Referenceno, " +
      "FIN_Payment.Paymentdate, " +
      "FIN_Payment.C_Bpartner_ID, " +
      "(CASE WHEN FIN_Payment.C_Bpartner_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table3.Name), ''))),'') ) END) AS C_Bpartner_IDR, " +
      "FIN_Payment.Description, " +
      "FIN_Payment.Fin_Paymentmethod_ID, " +
      "(CASE WHEN FIN_Payment.Fin_Paymentmethod_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table4.Name), ''))),'') ) END) AS Fin_Paymentmethod_IDR, " +
      "FIN_Payment.Fin_Financial_Account_ID, " +
      "(CASE WHEN FIN_Payment.Fin_Financial_Account_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table6.ISO_Code), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table5.Name), ''))),'') ) END) AS Fin_Financial_Account_IDR, " +
      "FIN_Payment.C_Currency_ID, " +
      "(CASE WHEN FIN_Payment.C_Currency_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table7.ISO_Code), ''))),'') ) END) AS C_Currency_IDR, " +
      "FIN_Payment.Finacc_Txn_Amount, " +
      "FIN_Payment.Finacc_Txn_Convert_Rate, " +
      "FIN_Payment.Generated_Credit, " +
      "FIN_Payment.EM_Aprm_Add_Scheduledpayments, " +
      "FIN_Payment.Posted, " +
      "list1.name as Posted_BTN, " +
      "FIN_Payment.EM_APRM_Process_Payment, " +
      "list2.name as EM_APRM_Process_Payment_BTN, " +
      "FIN_Payment.EM_Aprm_Executepayment, " +
      "FIN_Payment.Amount, " +
      "FIN_Payment.Status, " +
      "FIN_Payment.Used_Credit, " +
      "FIN_Payment.Writeoffamt, " +
      "FIN_Payment.EM_APRM_ReversePayment, " +
      "FIN_Payment.FIN_Rev_Payment_ID, " +
      "COALESCE(FIN_Payment.CreatedByAlgorithm, 'N') AS CreatedByAlgorithm, " +
      "FIN_Payment.C_Project_ID, " +
      "(CASE WHEN FIN_Payment.C_Project_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table8.Value), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table8.Name), ''))),'') ) END) AS C_Project_IDR, " +
      "FIN_Payment.C_Costcenter_ID, " +
      "FIN_Payment.C_Activity_ID, " +
      "FIN_Payment.C_Campaign_ID, " +
      "FIN_Payment.User1_ID, " +
      "FIN_Payment.User2_ID, " +
      "FIN_Payment.AD_Client_ID, " +
      "COALESCE(FIN_Payment.Isreceipt, 'N') AS Isreceipt, " +
      "FIN_Payment.EM_APRM_Reconcile_Payment, " +
      "COALESCE(FIN_Payment.Processing, 'N') AS Processing, " +
      "COALESCE(FIN_Payment.Processed, 'N') AS Processed, " +
      "FIN_Payment.Fin_Payment_ID, " +
      "COALESCE(FIN_Payment.Isactive, 'N') AS Isactive, " +
      "        ? AS LANGUAGE " +
      "        FROM FIN_Payment left join (select AD_Org_ID, Name from AD_Org) table1 on (FIN_Payment.AD_Org_ID = table1.AD_Org_ID) left join (select C_DocType_ID, Name from C_DocType) table2 on (FIN_Payment.C_DocType_ID = table2.C_DocType_ID) left join (select C_DocType_ID,AD_Language, Name from C_DocType_TRL) tableTRL2 on (table2.C_DocType_ID = tableTRL2.C_DocType_ID and tableTRL2.AD_Language = ?)  left join (select C_BPartner_ID, Name from C_BPartner) table3 on (FIN_Payment.C_Bpartner_ID = table3.C_BPartner_ID) left join (select Fin_Paymentmethod_ID, Name from Fin_Paymentmethod) table4 on (FIN_Payment.Fin_Paymentmethod_ID = table4.Fin_Paymentmethod_ID) left join (select Fin_Financial_Account_ID, C_Currency_ID, Name from Fin_Financial_Account) table5 on (FIN_Payment.Fin_Financial_Account_ID = table5.Fin_Financial_Account_ID) left join (select C_Currency_ID, ISO_Code from C_Currency) table6 on (table5.C_Currency_ID = table6.C_Currency_ID) left join (select C_Currency_ID, ISO_Code from C_Currency) table7 on (FIN_Payment.C_Currency_ID = table7.C_Currency_ID) left join ad_ref_list_v list1 on (list1.ad_reference_id = '234' and list1.ad_language = ?  AND FIN_Payment.Posted = TO_CHAR(list1.value)) left join ad_ref_list_v list2 on (list2.ad_reference_id = '36972531DA994BB38ECB91993058282F' and list2.ad_language = ?  AND FIN_Payment.EM_APRM_Process_Payment = TO_CHAR(list2.value)) left join (select C_Project_ID, Value, Name from C_Project) table8 on (FIN_Payment.C_Project_ID = table8.C_Project_ID)" +
      "        WHERE 2=2 " +
      " AND FIN_Payment.isReceipt='N'" +
      "        AND 1=1 " +
      "        AND FIN_Payment.Fin_Payment_ID = ? " +
      "        AND FIN_Payment.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND FIN_Payment.AD_Org_ID IN (";
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
        HeaderData objectHeaderData = new HeaderData();
        objectHeaderData.created = UtilSql.getValue(result, "created");
        objectHeaderData.createdbyr = UtilSql.getValue(result, "createdbyr");
        objectHeaderData.updated = UtilSql.getValue(result, "updated");
        objectHeaderData.updatedTimeStamp = UtilSql.getValue(result, "updated_time_stamp");
        objectHeaderData.updatedby = UtilSql.getValue(result, "updatedby");
        objectHeaderData.updatedbyr = UtilSql.getValue(result, "updatedbyr");
        objectHeaderData.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectHeaderData.adOrgIdr = UtilSql.getValue(result, "ad_org_idr");
        objectHeaderData.cDoctypeId = UtilSql.getValue(result, "c_doctype_id");
        objectHeaderData.cDoctypeIdr = UtilSql.getValue(result, "c_doctype_idr");
        objectHeaderData.documentno = UtilSql.getValue(result, "documentno");
        objectHeaderData.referenceno = UtilSql.getValue(result, "referenceno");
        objectHeaderData.paymentdate = UtilSql.getDateValue(result, "paymentdate", "dd-MM-yyyy");
        objectHeaderData.cBpartnerId = UtilSql.getValue(result, "c_bpartner_id");
        objectHeaderData.cBpartnerIdr = UtilSql.getValue(result, "c_bpartner_idr");
        objectHeaderData.description = UtilSql.getValue(result, "description");
        objectHeaderData.finPaymentmethodId = UtilSql.getValue(result, "fin_paymentmethod_id");
        objectHeaderData.finPaymentmethodIdr = UtilSql.getValue(result, "fin_paymentmethod_idr");
        objectHeaderData.finFinancialAccountId = UtilSql.getValue(result, "fin_financial_account_id");
        objectHeaderData.finFinancialAccountIdr = UtilSql.getValue(result, "fin_financial_account_idr");
        objectHeaderData.cCurrencyId = UtilSql.getValue(result, "c_currency_id");
        objectHeaderData.cCurrencyIdr = UtilSql.getValue(result, "c_currency_idr");
        objectHeaderData.finaccTxnAmount = UtilSql.getValue(result, "finacc_txn_amount");
        objectHeaderData.finaccTxnConvertRate = UtilSql.getValue(result, "finacc_txn_convert_rate");
        objectHeaderData.generatedCredit = UtilSql.getValue(result, "generated_credit");
        objectHeaderData.emAprmAddScheduledpayments = UtilSql.getValue(result, "em_aprm_add_scheduledpayments");
        objectHeaderData.posted = UtilSql.getValue(result, "posted");
        objectHeaderData.postedBtn = UtilSql.getValue(result, "posted_btn");
        objectHeaderData.emAprmProcessPayment = UtilSql.getValue(result, "em_aprm_process_payment");
        objectHeaderData.emAprmProcessPaymentBtn = UtilSql.getValue(result, "em_aprm_process_payment_btn");
        objectHeaderData.emAprmExecutepayment = UtilSql.getValue(result, "em_aprm_executepayment");
        objectHeaderData.amount = UtilSql.getValue(result, "amount");
        objectHeaderData.status = UtilSql.getValue(result, "status");
        objectHeaderData.usedCredit = UtilSql.getValue(result, "used_credit");
        objectHeaderData.writeoffamt = UtilSql.getValue(result, "writeoffamt");
        objectHeaderData.emAprmReversepayment = UtilSql.getValue(result, "em_aprm_reversepayment");
        objectHeaderData.finRevPaymentId = UtilSql.getValue(result, "fin_rev_payment_id");
        objectHeaderData.createdbyalgorithm = UtilSql.getValue(result, "createdbyalgorithm");
        objectHeaderData.cProjectId = UtilSql.getValue(result, "c_project_id");
        objectHeaderData.cProjectIdr = UtilSql.getValue(result, "c_project_idr");
        objectHeaderData.cCostcenterId = UtilSql.getValue(result, "c_costcenter_id");
        objectHeaderData.cActivityId = UtilSql.getValue(result, "c_activity_id");
        objectHeaderData.cCampaignId = UtilSql.getValue(result, "c_campaign_id");
        objectHeaderData.user1Id = UtilSql.getValue(result, "user1_id");
        objectHeaderData.user2Id = UtilSql.getValue(result, "user2_id");
        objectHeaderData.adClientId = UtilSql.getValue(result, "ad_client_id");
        objectHeaderData.isreceipt = UtilSql.getValue(result, "isreceipt");
        objectHeaderData.emAprmReconcilePayment = UtilSql.getValue(result, "em_aprm_reconcile_payment");
        objectHeaderData.processing = UtilSql.getValue(result, "processing");
        objectHeaderData.processed = UtilSql.getValue(result, "processed");
        objectHeaderData.finPaymentId = UtilSql.getValue(result, "fin_payment_id");
        objectHeaderData.isactive = UtilSql.getValue(result, "isactive");
        objectHeaderData.language = UtilSql.getValue(result, "language");
        objectHeaderData.adUserClient = "";
        objectHeaderData.adOrgClient = "";
        objectHeaderData.createdby = "";
        objectHeaderData.trBgcolor = "";
        objectHeaderData.totalCount = "";
        objectHeaderData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectHeaderData);
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
    HeaderData objectHeaderData[] = new HeaderData[vector.size()];
    vector.copyInto(objectHeaderData);
    return(objectHeaderData);
  }

/**
Create a registry
 */
  public static HeaderData[] set(String finFinancialAccountId, String cCostcenterId, String createdbyalgorithm, String finaccTxnConvertRate, String finaccTxnAmount, String finPaymentId, String adClientId, String adOrgId, String createdby, String createdbyr, String updatedby, String updatedbyr, String isactive, String isreceipt, String cBpartnerId, String cBpartnerIdr, String paymentdate, String cCurrencyId, String amount, String writeoffamt, String documentno, String referenceno, String status, String processed, String processing, String posted, String postedBtn, String finPaymentmethodId, String emAprmProcessPayment, String emAprmProcessPaymentBtn, String emAprmReconcilePayment, String emAprmAddScheduledpayments, String cDoctypeId, String cProjectId, String cProjectIdr, String cCampaignId, String cActivityId, String user1Id, String user2Id, String emAprmExecutepayment, String description, String generatedCredit, String usedCredit, String emAprmReversepayment, String finRevPaymentId)    throws ServletException {
    HeaderData objectHeaderData[] = new HeaderData[1];
    objectHeaderData[0] = new HeaderData();
    objectHeaderData[0].created = "";
    objectHeaderData[0].createdbyr = createdbyr;
    objectHeaderData[0].updated = "";
    objectHeaderData[0].updatedTimeStamp = "";
    objectHeaderData[0].updatedby = updatedby;
    objectHeaderData[0].updatedbyr = updatedbyr;
    objectHeaderData[0].adOrgId = adOrgId;
    objectHeaderData[0].adOrgIdr = "";
    objectHeaderData[0].cDoctypeId = cDoctypeId;
    objectHeaderData[0].cDoctypeIdr = "";
    objectHeaderData[0].documentno = documentno;
    objectHeaderData[0].referenceno = referenceno;
    objectHeaderData[0].paymentdate = paymentdate;
    objectHeaderData[0].cBpartnerId = cBpartnerId;
    objectHeaderData[0].cBpartnerIdr = cBpartnerIdr;
    objectHeaderData[0].description = description;
    objectHeaderData[0].finPaymentmethodId = finPaymentmethodId;
    objectHeaderData[0].finPaymentmethodIdr = "";
    objectHeaderData[0].finFinancialAccountId = finFinancialAccountId;
    objectHeaderData[0].finFinancialAccountIdr = "";
    objectHeaderData[0].cCurrencyId = cCurrencyId;
    objectHeaderData[0].cCurrencyIdr = "";
    objectHeaderData[0].finaccTxnAmount = finaccTxnAmount;
    objectHeaderData[0].finaccTxnConvertRate = finaccTxnConvertRate;
    objectHeaderData[0].generatedCredit = generatedCredit;
    objectHeaderData[0].emAprmAddScheduledpayments = emAprmAddScheduledpayments;
    objectHeaderData[0].posted = posted;
    objectHeaderData[0].postedBtn = postedBtn;
    objectHeaderData[0].emAprmProcessPayment = emAprmProcessPayment;
    objectHeaderData[0].emAprmProcessPaymentBtn = emAprmProcessPaymentBtn;
    objectHeaderData[0].emAprmExecutepayment = emAprmExecutepayment;
    objectHeaderData[0].amount = amount;
    objectHeaderData[0].status = status;
    objectHeaderData[0].usedCredit = usedCredit;
    objectHeaderData[0].writeoffamt = writeoffamt;
    objectHeaderData[0].emAprmReversepayment = emAprmReversepayment;
    objectHeaderData[0].finRevPaymentId = finRevPaymentId;
    objectHeaderData[0].createdbyalgorithm = createdbyalgorithm;
    objectHeaderData[0].cProjectId = cProjectId;
    objectHeaderData[0].cProjectIdr = cProjectIdr;
    objectHeaderData[0].cCostcenterId = cCostcenterId;
    objectHeaderData[0].cActivityId = cActivityId;
    objectHeaderData[0].cCampaignId = cCampaignId;
    objectHeaderData[0].user1Id = user1Id;
    objectHeaderData[0].user2Id = user2Id;
    objectHeaderData[0].adClientId = adClientId;
    objectHeaderData[0].isreceipt = isreceipt;
    objectHeaderData[0].emAprmReconcilePayment = emAprmReconcilePayment;
    objectHeaderData[0].processing = processing;
    objectHeaderData[0].processed = processed;
    objectHeaderData[0].finPaymentId = finPaymentId;
    objectHeaderData[0].isactive = isactive;
    objectHeaderData[0].language = "";
    return objectHeaderData;
  }

/**
Select for auxiliar field
 */
  public static String selectAux40289DEF2E1E98E4012E1EE6C6CD002E(ConnectionProvider connectionProvider, String FIN_FINANCIAL_ACCOUNT_ID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT C_CURRENCY_ID FROM FIN_FINANCIAL_ACCOUNT WHERE FIN_FINANCIAL_ACCOUNT_ID=? ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, FIN_FINANCIAL_ACCOUNT_ID);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "c_currency_id");
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
  public static String selectAuxFF8080812E26BF58012E27DC86DE016C(ConnectionProvider connectionProvider, String FIN_Financial_Account_ID, String FIN_PaymentMethod_ID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT (CASE count(*) WHEN 0 THEN 'N' ELSE 'Y' END) from fin_finacc_paymentmethod " +
      "where fin_financial_account_id = ?" +
      "and fin_paymentmethod_id = ? and isactive='Y'" +
      "and payout_allow ='Y' and payout_ismulticurrency='Y'";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, FIN_Financial_Account_ID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, FIN_PaymentMethod_ID);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "case");
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
  public static String selectDef7891269C83D4655DE040007F010155CE_0(ConnectionProvider connectionProvider, String CreatedbyR)    throws ServletException {
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
  public static String selectDef7891269C83D6655DE040007F010155CE_1(ConnectionProvider connectionProvider, String UpdatedbyR)    throws ServletException {
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
  public static String selectDef7891269C83D9655DE040007F010155CE_2(ConnectionProvider connectionProvider, String C_Bpartner_IDR)    throws ServletException {
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
  public static String selectDef8032E178607750D5E040007F01004282(ConnectionProvider connectionProvider, String AD_Org_ID, String AD_Client_ID, String Isreceipt)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT C_DocType_ID from C_DocType WHERE AD_ISORGINCLUDED(?,C_DocType.AD_Org_ID, ?) <> -1 AND C_DocType.DocBaseType IN ('APP', 'ARR') AND C_DocType.IsSOTrx=?  ORDER BY C_DocType.isdefault DESC, AD_ISORGINCLUDED(?,C_DocType.AD_Org_ID, ?) ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, AD_Org_ID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, AD_Client_ID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, Isreceipt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, AD_Org_ID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, AD_Client_ID);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "c_doctype_id");
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
  public static String selectDef828EE0AE800D5FA1E040007F010067C7_3(ConnectionProvider connectionProvider, String C_Project_IDR)    throws ServletException {
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

  public int update(Connection conn, ConnectionProvider connectionProvider)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        UPDATE FIN_Payment" +
      "        SET AD_Org_ID = (?) , C_DocType_ID = (?) , DocumentNo = (?) , Referenceno = (?) , Paymentdate = TO_DATE(?) , C_Bpartner_ID = (?) , Description = (?) , Fin_Paymentmethod_ID = (?) , Fin_Financial_Account_ID = (?) , C_Currency_ID = (?) , Finacc_Txn_Amount = TO_NUMBER(?) , Finacc_Txn_Convert_Rate = TO_NUMBER(?) , Generated_Credit = TO_NUMBER(?) , EM_Aprm_Add_Scheduledpayments = (?) , Posted = (?) , EM_APRM_Process_Payment = (?) , EM_Aprm_Executepayment = (?) , Amount = TO_NUMBER(?) , Status = (?) , Used_Credit = TO_NUMBER(?) , Writeoffamt = TO_NUMBER(?) , EM_APRM_ReversePayment = (?) , FIN_Rev_Payment_ID = (?) , CreatedByAlgorithm = (?) , C_Project_ID = (?) , C_Costcenter_ID = (?) , C_Activity_ID = (?) , C_Campaign_ID = (?) , User1_ID = (?) , User2_ID = (?) , AD_Client_ID = (?) , Isreceipt = (?) , EM_APRM_Reconcile_Payment = (?) , Processing = (?) , Processed = (?) , Fin_Payment_ID = (?) , Isactive = (?) , updated = now(), updatedby = ? " +
      "        WHERE FIN_Payment.Fin_Payment_ID = ? " +
      "        AND FIN_Payment.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND FIN_Payment.AD_Org_ID IN (";
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
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, referenceno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paymentdate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, finPaymentmethodId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, finFinancialAccountId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCurrencyId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, finaccTxnAmount);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, finaccTxnConvertRate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, generatedCredit);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emAprmAddScheduledpayments);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, posted);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emAprmProcessPayment);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emAprmExecutepayment);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, amount);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, status);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, usedCredit);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, writeoffamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emAprmReversepayment);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, finRevPaymentId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, createdbyalgorithm);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cProjectId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCostcenterId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cActivityId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCampaignId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, user1Id);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, user2Id);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isreceipt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emAprmReconcilePayment);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processing);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processed);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, finPaymentId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, finPaymentId);
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
      "        INSERT INTO FIN_Payment " +
      "        (AD_Org_ID, C_DocType_ID, DocumentNo, Referenceno, Paymentdate, C_Bpartner_ID, Description, Fin_Paymentmethod_ID, Fin_Financial_Account_ID, C_Currency_ID, Finacc_Txn_Amount, Finacc_Txn_Convert_Rate, Generated_Credit, EM_Aprm_Add_Scheduledpayments, Posted, EM_APRM_Process_Payment, EM_Aprm_Executepayment, Amount, Status, Used_Credit, Writeoffamt, EM_APRM_ReversePayment, FIN_Rev_Payment_ID, CreatedByAlgorithm, C_Project_ID, C_Costcenter_ID, C_Activity_ID, C_Campaign_ID, User1_ID, User2_ID, AD_Client_ID, Isreceipt, EM_APRM_Reconcile_Payment, Processing, Processed, Fin_Payment_ID, Isactive, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), (?), (?), TO_DATE(?), (?), (?), (?), (?), (?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), (?), (?), (?), (?), TO_NUMBER(?), (?), TO_NUMBER(?), TO_NUMBER(?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cDoctypeId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, documentno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, referenceno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paymentdate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, finPaymentmethodId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, finFinancialAccountId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCurrencyId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, finaccTxnAmount);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, finaccTxnConvertRate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, generatedCredit);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emAprmAddScheduledpayments);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, posted);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emAprmProcessPayment);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emAprmExecutepayment);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, amount);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, status);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, usedCredit);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, writeoffamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emAprmReversepayment);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, finRevPaymentId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, createdbyalgorithm);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cProjectId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCostcenterId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cActivityId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCampaignId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, user1Id);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, user2Id);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isreceipt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emAprmReconcilePayment);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processing);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processed);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, finPaymentId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
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
      "        DELETE FROM FIN_Payment" +
      "        WHERE FIN_Payment.Fin_Payment_ID = ? " +
      "        AND FIN_Payment.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND FIN_Payment.AD_Org_ID IN (";
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
      "          FROM FIN_Payment" +
      "         WHERE FIN_Payment.Fin_Payment_ID = ? ";

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
      "          FROM FIN_Payment" +
      "         WHERE FIN_Payment.Fin_Payment_ID = ? ";

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
