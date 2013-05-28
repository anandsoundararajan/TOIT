//Sqlc generated V1.O00-1
package org.openbravo.erpWindows.PurchaseInvoice;

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
  public String cDoctypetargetId;
  public String cDoctypetargetIdr;
  public String documentno;
  public String dateinvoiced;
  public String cBpartnerId;
  public String cBpartnerIdr;
  public String cBpartnerLocationId;
  public String cBpartnerLocationIdr;
  public String mPricelistId;
  public String mPricelistIdr;
  public String dateacct;
  public String cPaymenttermId;
  public String cPaymenttermIdr;
  public String finPaymentmethodId;
  public String finPaymentmethodIdr;
  public String description;
  public String cOrderId;
  public String cOrderIdr;
  public String poreference;
  public String docstatus;
  public String grandtotal;
  public String totallines;
  public String cCurrencyId;
  public String ispaid;
  public String adUserId;
  public String totalpaid;
  public String lastcalculatedondate;
  public String outstandingamt;
  public String taxdate;
  public String dueamt;
  public String dateordered;
  public String daystilldue;
  public String salesrepId;
  public String isdiscountprinted;
  public String cDoctypeId;
  public String withholdingamount;
  public String cWithholdingId;
  public String percentageoverdue;
  public String cActivityId;
  public String finalsettlement;
  public String cCampaignId;
  public String daysoutstanding;
  public String isactive;
  public String chargeamt;
  public String cChargeId;
  public String generateto;
  public String adOrgtrxId;
  public String updatepaymentmonitor;
  public String emAprmAddpayment;
  public String posted;
  public String postedBtn;
  public String emAprmProcessinvoice;
  public String emAprmProcessinvoiceBtn;
  public String docaction;
  public String docactionBtn;
  public String createfrom;
  public String copyfrom;
  public String calculatePromotions;
  public String cProjectId;
  public String cProjectIdr;
  public String cCostcenterId;
  public String aAssetId;
  public String user1Id;
  public String user2Id;
  public String isprinted;
  public String paymentrule;
  public String issotrx;
  public String dateprinted;
  public String processing;
  public String processed;
  public String cInvoiceId;
  public String adClientId;
  public String isselfservice;
  public String istaxincluded;
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
    else if (fieldName.equalsIgnoreCase("c_doctypetarget_id") || fieldName.equals("cDoctypetargetId"))
      return cDoctypetargetId;
    else if (fieldName.equalsIgnoreCase("c_doctypetarget_idr") || fieldName.equals("cDoctypetargetIdr"))
      return cDoctypetargetIdr;
    else if (fieldName.equalsIgnoreCase("documentno"))
      return documentno;
    else if (fieldName.equalsIgnoreCase("dateinvoiced"))
      return dateinvoiced;
    else if (fieldName.equalsIgnoreCase("c_bpartner_id") || fieldName.equals("cBpartnerId"))
      return cBpartnerId;
    else if (fieldName.equalsIgnoreCase("c_bpartner_idr") || fieldName.equals("cBpartnerIdr"))
      return cBpartnerIdr;
    else if (fieldName.equalsIgnoreCase("c_bpartner_location_id") || fieldName.equals("cBpartnerLocationId"))
      return cBpartnerLocationId;
    else if (fieldName.equalsIgnoreCase("c_bpartner_location_idr") || fieldName.equals("cBpartnerLocationIdr"))
      return cBpartnerLocationIdr;
    else if (fieldName.equalsIgnoreCase("m_pricelist_id") || fieldName.equals("mPricelistId"))
      return mPricelistId;
    else if (fieldName.equalsIgnoreCase("m_pricelist_idr") || fieldName.equals("mPricelistIdr"))
      return mPricelistIdr;
    else if (fieldName.equalsIgnoreCase("dateacct"))
      return dateacct;
    else if (fieldName.equalsIgnoreCase("c_paymentterm_id") || fieldName.equals("cPaymenttermId"))
      return cPaymenttermId;
    else if (fieldName.equalsIgnoreCase("c_paymentterm_idr") || fieldName.equals("cPaymenttermIdr"))
      return cPaymenttermIdr;
    else if (fieldName.equalsIgnoreCase("fin_paymentmethod_id") || fieldName.equals("finPaymentmethodId"))
      return finPaymentmethodId;
    else if (fieldName.equalsIgnoreCase("fin_paymentmethod_idr") || fieldName.equals("finPaymentmethodIdr"))
      return finPaymentmethodIdr;
    else if (fieldName.equalsIgnoreCase("description"))
      return description;
    else if (fieldName.equalsIgnoreCase("c_order_id") || fieldName.equals("cOrderId"))
      return cOrderId;
    else if (fieldName.equalsIgnoreCase("c_order_idr") || fieldName.equals("cOrderIdr"))
      return cOrderIdr;
    else if (fieldName.equalsIgnoreCase("poreference"))
      return poreference;
    else if (fieldName.equalsIgnoreCase("docstatus"))
      return docstatus;
    else if (fieldName.equalsIgnoreCase("grandtotal"))
      return grandtotal;
    else if (fieldName.equalsIgnoreCase("totallines"))
      return totallines;
    else if (fieldName.equalsIgnoreCase("c_currency_id") || fieldName.equals("cCurrencyId"))
      return cCurrencyId;
    else if (fieldName.equalsIgnoreCase("ispaid"))
      return ispaid;
    else if (fieldName.equalsIgnoreCase("ad_user_id") || fieldName.equals("adUserId"))
      return adUserId;
    else if (fieldName.equalsIgnoreCase("totalpaid"))
      return totalpaid;
    else if (fieldName.equalsIgnoreCase("lastcalculatedondate"))
      return lastcalculatedondate;
    else if (fieldName.equalsIgnoreCase("outstandingamt"))
      return outstandingamt;
    else if (fieldName.equalsIgnoreCase("taxdate"))
      return taxdate;
    else if (fieldName.equalsIgnoreCase("dueamt"))
      return dueamt;
    else if (fieldName.equalsIgnoreCase("dateordered"))
      return dateordered;
    else if (fieldName.equalsIgnoreCase("daystilldue"))
      return daystilldue;
    else if (fieldName.equalsIgnoreCase("salesrep_id") || fieldName.equals("salesrepId"))
      return salesrepId;
    else if (fieldName.equalsIgnoreCase("isdiscountprinted"))
      return isdiscountprinted;
    else if (fieldName.equalsIgnoreCase("c_doctype_id") || fieldName.equals("cDoctypeId"))
      return cDoctypeId;
    else if (fieldName.equalsIgnoreCase("withholdingamount"))
      return withholdingamount;
    else if (fieldName.equalsIgnoreCase("c_withholding_id") || fieldName.equals("cWithholdingId"))
      return cWithholdingId;
    else if (fieldName.equalsIgnoreCase("percentageoverdue"))
      return percentageoverdue;
    else if (fieldName.equalsIgnoreCase("c_activity_id") || fieldName.equals("cActivityId"))
      return cActivityId;
    else if (fieldName.equalsIgnoreCase("finalsettlement"))
      return finalsettlement;
    else if (fieldName.equalsIgnoreCase("c_campaign_id") || fieldName.equals("cCampaignId"))
      return cCampaignId;
    else if (fieldName.equalsIgnoreCase("daysoutstanding"))
      return daysoutstanding;
    else if (fieldName.equalsIgnoreCase("isactive"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("chargeamt"))
      return chargeamt;
    else if (fieldName.equalsIgnoreCase("c_charge_id") || fieldName.equals("cChargeId"))
      return cChargeId;
    else if (fieldName.equalsIgnoreCase("generateto"))
      return generateto;
    else if (fieldName.equalsIgnoreCase("ad_orgtrx_id") || fieldName.equals("adOrgtrxId"))
      return adOrgtrxId;
    else if (fieldName.equalsIgnoreCase("updatepaymentmonitor"))
      return updatepaymentmonitor;
    else if (fieldName.equalsIgnoreCase("em_aprm_addpayment") || fieldName.equals("emAprmAddpayment"))
      return emAprmAddpayment;
    else if (fieldName.equalsIgnoreCase("posted"))
      return posted;
    else if (fieldName.equalsIgnoreCase("posted_btn") || fieldName.equals("postedBtn"))
      return postedBtn;
    else if (fieldName.equalsIgnoreCase("em_aprm_processinvoice") || fieldName.equals("emAprmProcessinvoice"))
      return emAprmProcessinvoice;
    else if (fieldName.equalsIgnoreCase("em_aprm_processinvoice_btn") || fieldName.equals("emAprmProcessinvoiceBtn"))
      return emAprmProcessinvoiceBtn;
    else if (fieldName.equalsIgnoreCase("docaction"))
      return docaction;
    else if (fieldName.equalsIgnoreCase("docaction_btn") || fieldName.equals("docactionBtn"))
      return docactionBtn;
    else if (fieldName.equalsIgnoreCase("createfrom"))
      return createfrom;
    else if (fieldName.equalsIgnoreCase("copyfrom"))
      return copyfrom;
    else if (fieldName.equalsIgnoreCase("calculate_promotions") || fieldName.equals("calculatePromotions"))
      return calculatePromotions;
    else if (fieldName.equalsIgnoreCase("c_project_id") || fieldName.equals("cProjectId"))
      return cProjectId;
    else if (fieldName.equalsIgnoreCase("c_project_idr") || fieldName.equals("cProjectIdr"))
      return cProjectIdr;
    else if (fieldName.equalsIgnoreCase("c_costcenter_id") || fieldName.equals("cCostcenterId"))
      return cCostcenterId;
    else if (fieldName.equalsIgnoreCase("a_asset_id") || fieldName.equals("aAssetId"))
      return aAssetId;
    else if (fieldName.equalsIgnoreCase("user1_id") || fieldName.equals("user1Id"))
      return user1Id;
    else if (fieldName.equalsIgnoreCase("user2_id") || fieldName.equals("user2Id"))
      return user2Id;
    else if (fieldName.equalsIgnoreCase("isprinted"))
      return isprinted;
    else if (fieldName.equalsIgnoreCase("paymentrule"))
      return paymentrule;
    else if (fieldName.equalsIgnoreCase("issotrx"))
      return issotrx;
    else if (fieldName.equalsIgnoreCase("dateprinted"))
      return dateprinted;
    else if (fieldName.equalsIgnoreCase("processing"))
      return processing;
    else if (fieldName.equalsIgnoreCase("processed"))
      return processed;
    else if (fieldName.equalsIgnoreCase("c_invoice_id") || fieldName.equals("cInvoiceId"))
      return cInvoiceId;
    else if (fieldName.equalsIgnoreCase("ad_client_id") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("isselfservice"))
      return isselfservice;
    else if (fieldName.equalsIgnoreCase("istaxincluded"))
      return istaxincluded;
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
      "        SELECT to_char(C_Invoice.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = C_Invoice.CreatedBy) as CreatedByR, " +
      "        to_char(C_Invoice.Updated, ?) as updated, " +
      "        to_char(C_Invoice.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        C_Invoice.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = C_Invoice.UpdatedBy) as UpdatedByR," +
      "        C_Invoice.AD_Org_ID, " +
      "(CASE WHEN C_Invoice.AD_Org_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.Name), ''))),'') ) END) AS AD_Org_IDR, " +
      "C_Invoice.C_DocTypeTarget_ID, " +
      "(CASE WHEN C_Invoice.C_DocTypeTarget_ID IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL2.Name IS NULL THEN TO_CHAR(table2.Name) ELSE TO_CHAR(tableTRL2.Name) END)), ''))),'') ) END) AS C_DocTypeTarget_IDR, " +
      "C_Invoice.DocumentNo, " +
      "C_Invoice.DateInvoiced, " +
      "C_Invoice.C_BPartner_ID, " +
      "(CASE WHEN C_Invoice.C_BPartner_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table3.Name), ''))),'') ) END) AS C_BPartner_IDR, " +
      "C_Invoice.C_BPartner_Location_ID, " +
      "(CASE WHEN C_Invoice.C_BPartner_Location_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table4.Name), ''))),'') ) END) AS C_BPartner_Location_IDR, " +
      "C_Invoice.M_PriceList_ID, " +
      "(CASE WHEN C_Invoice.M_PriceList_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table5.Name), ''))),'') ) END) AS M_PriceList_IDR, " +
      "C_Invoice.DateAcct, " +
      "C_Invoice.C_PaymentTerm_ID, " +
      "(CASE WHEN C_Invoice.C_PaymentTerm_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL6.Name IS NULL THEN TO_CHAR(table6.Name) ELSE TO_CHAR(tableTRL6.Name) END)), ''))),'') ) END) AS C_PaymentTerm_IDR, " +
      "C_Invoice.FIN_Paymentmethod_ID, " +
      "(CASE WHEN C_Invoice.FIN_Paymentmethod_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table7.Name), ''))),'') ) END) AS FIN_Paymentmethod_IDR, " +
      "C_Invoice.Description, " +
      "C_Invoice.C_Order_ID, " +
      "(CASE WHEN C_Invoice.C_Order_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table8.DocumentNo), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(table8.DateOrdered, 'DD-MM-YYYY')),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table8.GrandTotal), ''))),'') ) END) AS C_Order_IDR, " +
      "C_Invoice.POReference, " +
      "C_Invoice.DocStatus, " +
      "C_Invoice.GrandTotal, " +
      "C_Invoice.TotalLines, " +
      "C_Invoice.C_Currency_ID, " +
      "COALESCE(C_Invoice.Ispaid, 'N') AS Ispaid, " +
      "C_Invoice.AD_User_ID, " +
      "C_Invoice.Totalpaid, " +
      "C_Invoice.LastCalculatedOnDate, " +
      "C_Invoice.OutstandingAmt, " +
      "C_Invoice.Taxdate, " +
      "C_Invoice.DueAmt, " +
      "C_Invoice.DateOrdered, " +
      "C_Invoice.DaysTillDue, " +
      "C_Invoice.SalesRep_ID, " +
      "COALESCE(C_Invoice.IsDiscountPrinted, 'N') AS IsDiscountPrinted, " +
      "C_Invoice.C_DocType_ID, " +
      "C_Invoice.Withholdingamount, " +
      "C_Invoice.C_Withholding_ID, " +
      "C_Invoice.Percentageoverdue, " +
      "C_Invoice.C_Activity_ID, " +
      "C_Invoice.Finalsettlement, " +
      "C_Invoice.C_Campaign_ID, " +
      "C_Invoice.Daysoutstanding, " +
      "COALESCE(C_Invoice.IsActive, 'N') AS IsActive, " +
      "C_Invoice.ChargeAmt, " +
      "C_Invoice.C_Charge_ID, " +
      "C_Invoice.GenerateTo, " +
      "C_Invoice.AD_OrgTrx_ID, " +
      "C_Invoice.UpdatePaymentMonitor, " +
      "C_Invoice.EM_APRM_Addpayment, " +
      "C_Invoice.Posted, " +
      "list1.name as Posted_BTN, " +
      "C_Invoice.EM_APRM_Processinvoice, " +
      "list2.name as EM_APRM_Processinvoice_BTN, " +
      "C_Invoice.DocAction, " +
      "list3.name as DocAction_BTN, " +
      "C_Invoice.CreateFrom, " +
      "C_Invoice.CopyFrom, " +
      "C_Invoice.Calculate_Promotions, " +
      "C_Invoice.C_Project_ID, " +
      "(CASE WHEN C_Invoice.C_Project_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table9.Value), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table9.Name), ''))),'') ) END) AS C_Project_IDR, " +
      "C_Invoice.C_Costcenter_ID, " +
      "C_Invoice.A_Asset_ID, " +
      "C_Invoice.User1_ID, " +
      "C_Invoice.User2_ID, " +
      "COALESCE(C_Invoice.IsPrinted, 'N') AS IsPrinted, " +
      "C_Invoice.PaymentRule, " +
      "COALESCE(C_Invoice.IsSOTrx, 'N') AS IsSOTrx, " +
      "C_Invoice.DatePrinted, " +
      "C_Invoice.Processing, " +
      "COALESCE(C_Invoice.Processed, 'N') AS Processed, " +
      "C_Invoice.C_Invoice_ID, " +
      "C_Invoice.AD_Client_ID, " +
      "COALESCE(C_Invoice.IsSelfService, 'N') AS IsSelfService, " +
      "COALESCE(C_Invoice.IsTaxIncluded, 'N') AS IsTaxIncluded, " +
      "        ? AS LANGUAGE " +
      "        FROM C_Invoice left join (select AD_Org_ID, Name from AD_Org) table1 on (C_Invoice.AD_Org_ID = table1.AD_Org_ID) left join (select C_DocType_ID, Name from C_DocType) table2 on (C_Invoice.C_DocTypeTarget_ID =  table2.C_DocType_ID) left join (select C_DocType_ID,AD_Language, Name from C_DocType_TRL) tableTRL2 on (table2.C_DocType_ID = tableTRL2.C_DocType_ID and tableTRL2.AD_Language = ?)  left join (select C_BPartner_ID, Name from C_BPartner) table3 on (C_Invoice.C_BPartner_ID = table3.C_BPartner_ID) left join (select C_BPartner_Location_ID, Name from C_BPartner_Location) table4 on (C_Invoice.C_BPartner_Location_ID = table4.C_BPartner_Location_ID) left join (select M_PriceList_ID, Name from M_PriceList) table5 on (C_Invoice.M_PriceList_ID = table5.M_PriceList_ID) left join (select C_PaymentTerm_ID, Name from C_PaymentTerm) table6 on (C_Invoice.C_PaymentTerm_ID = table6.C_PaymentTerm_ID) left join (select C_PaymentTerm_ID,AD_Language, Name from C_PaymentTerm_TRL) tableTRL6 on (table6.C_PaymentTerm_ID = tableTRL6.C_PaymentTerm_ID and tableTRL6.AD_Language = ?)  left join (select FIN_Paymentmethod_ID, Name from FIN_Paymentmethod) table7 on (C_Invoice.FIN_Paymentmethod_ID = table7.FIN_Paymentmethod_ID) left join (select C_Order_ID, DocumentNo, DateOrdered, GrandTotal from C_Order) table8 on (C_Invoice.C_Order_ID = table8.C_Order_ID) left join ad_ref_list_v list1 on (list1.ad_reference_id = '234' and list1.ad_language = ?  AND C_Invoice.Posted = TO_CHAR(list1.value)) left join ad_ref_list_v list2 on (list2.ad_reference_id = '135' and list2.ad_language = ?  AND C_Invoice.EM_APRM_Processinvoice = TO_CHAR(list2.value)) left join ad_ref_list_v list3 on (list3.ad_reference_id = '135' and list3.ad_language = ?  AND (CASE C_Invoice.DocAction WHEN '--' THEN 'CL' ELSE TO_CHAR(C_Invoice.DocAction) END) = list3.value) left join (select C_Project_ID, Value, Name from C_Project) table9 on (C_Invoice.C_Project_ID = table9.C_Project_ID)" +
      "        WHERE 2=2 " +
      " AND C_Invoice.IsSOTrx='N'" +
      "        AND 1=1 " +
      "        AND C_Invoice.C_Invoice_ID = ? " +
      "        AND C_Invoice.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND C_Invoice.AD_Org_ID IN (";
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
        HeaderData objectHeaderData = new HeaderData();
        objectHeaderData.created = UtilSql.getValue(result, "created");
        objectHeaderData.createdbyr = UtilSql.getValue(result, "createdbyr");
        objectHeaderData.updated = UtilSql.getValue(result, "updated");
        objectHeaderData.updatedTimeStamp = UtilSql.getValue(result, "updated_time_stamp");
        objectHeaderData.updatedby = UtilSql.getValue(result, "updatedby");
        objectHeaderData.updatedbyr = UtilSql.getValue(result, "updatedbyr");
        objectHeaderData.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectHeaderData.adOrgIdr = UtilSql.getValue(result, "ad_org_idr");
        objectHeaderData.cDoctypetargetId = UtilSql.getValue(result, "c_doctypetarget_id");
        objectHeaderData.cDoctypetargetIdr = UtilSql.getValue(result, "c_doctypetarget_idr");
        objectHeaderData.documentno = UtilSql.getValue(result, "documentno");
        objectHeaderData.dateinvoiced = UtilSql.getDateValue(result, "dateinvoiced", "dd-MM-yyyy");
        objectHeaderData.cBpartnerId = UtilSql.getValue(result, "c_bpartner_id");
        objectHeaderData.cBpartnerIdr = UtilSql.getValue(result, "c_bpartner_idr");
        objectHeaderData.cBpartnerLocationId = UtilSql.getValue(result, "c_bpartner_location_id");
        objectHeaderData.cBpartnerLocationIdr = UtilSql.getValue(result, "c_bpartner_location_idr");
        objectHeaderData.mPricelistId = UtilSql.getValue(result, "m_pricelist_id");
        objectHeaderData.mPricelistIdr = UtilSql.getValue(result, "m_pricelist_idr");
        objectHeaderData.dateacct = UtilSql.getDateValue(result, "dateacct", "dd-MM-yyyy");
        objectHeaderData.cPaymenttermId = UtilSql.getValue(result, "c_paymentterm_id");
        objectHeaderData.cPaymenttermIdr = UtilSql.getValue(result, "c_paymentterm_idr");
        objectHeaderData.finPaymentmethodId = UtilSql.getValue(result, "fin_paymentmethod_id");
        objectHeaderData.finPaymentmethodIdr = UtilSql.getValue(result, "fin_paymentmethod_idr");
        objectHeaderData.description = UtilSql.getValue(result, "description");
        objectHeaderData.cOrderId = UtilSql.getValue(result, "c_order_id");
        objectHeaderData.cOrderIdr = UtilSql.getValue(result, "c_order_idr");
        objectHeaderData.poreference = UtilSql.getValue(result, "poreference");
        objectHeaderData.docstatus = UtilSql.getValue(result, "docstatus");
        objectHeaderData.grandtotal = UtilSql.getValue(result, "grandtotal");
        objectHeaderData.totallines = UtilSql.getValue(result, "totallines");
        objectHeaderData.cCurrencyId = UtilSql.getValue(result, "c_currency_id");
        objectHeaderData.ispaid = UtilSql.getValue(result, "ispaid");
        objectHeaderData.adUserId = UtilSql.getValue(result, "ad_user_id");
        objectHeaderData.totalpaid = UtilSql.getValue(result, "totalpaid");
        objectHeaderData.lastcalculatedondate = UtilSql.getDateValue(result, "lastcalculatedondate", "dd-MM-yyyy");
        objectHeaderData.outstandingamt = UtilSql.getValue(result, "outstandingamt");
        objectHeaderData.taxdate = UtilSql.getDateValue(result, "taxdate", "dd-MM-yyyy");
        objectHeaderData.dueamt = UtilSql.getValue(result, "dueamt");
        objectHeaderData.dateordered = UtilSql.getDateValue(result, "dateordered", "dd-MM-yyyy");
        objectHeaderData.daystilldue = UtilSql.getValue(result, "daystilldue");
        objectHeaderData.salesrepId = UtilSql.getValue(result, "salesrep_id");
        objectHeaderData.isdiscountprinted = UtilSql.getValue(result, "isdiscountprinted");
        objectHeaderData.cDoctypeId = UtilSql.getValue(result, "c_doctype_id");
        objectHeaderData.withholdingamount = UtilSql.getValue(result, "withholdingamount");
        objectHeaderData.cWithholdingId = UtilSql.getValue(result, "c_withholding_id");
        objectHeaderData.percentageoverdue = UtilSql.getValue(result, "percentageoverdue");
        objectHeaderData.cActivityId = UtilSql.getValue(result, "c_activity_id");
        objectHeaderData.finalsettlement = UtilSql.getDateValue(result, "finalsettlement", "dd-MM-yyyy");
        objectHeaderData.cCampaignId = UtilSql.getValue(result, "c_campaign_id");
        objectHeaderData.daysoutstanding = UtilSql.getValue(result, "daysoutstanding");
        objectHeaderData.isactive = UtilSql.getValue(result, "isactive");
        objectHeaderData.chargeamt = UtilSql.getValue(result, "chargeamt");
        objectHeaderData.cChargeId = UtilSql.getValue(result, "c_charge_id");
        objectHeaderData.generateto = UtilSql.getValue(result, "generateto");
        objectHeaderData.adOrgtrxId = UtilSql.getValue(result, "ad_orgtrx_id");
        objectHeaderData.updatepaymentmonitor = UtilSql.getValue(result, "updatepaymentmonitor");
        objectHeaderData.emAprmAddpayment = UtilSql.getValue(result, "em_aprm_addpayment");
        objectHeaderData.posted = UtilSql.getValue(result, "posted");
        objectHeaderData.postedBtn = UtilSql.getValue(result, "posted_btn");
        objectHeaderData.emAprmProcessinvoice = UtilSql.getValue(result, "em_aprm_processinvoice");
        objectHeaderData.emAprmProcessinvoiceBtn = UtilSql.getValue(result, "em_aprm_processinvoice_btn");
        objectHeaderData.docaction = UtilSql.getValue(result, "docaction");
        objectHeaderData.docactionBtn = UtilSql.getValue(result, "docaction_btn");
        objectHeaderData.createfrom = UtilSql.getValue(result, "createfrom");
        objectHeaderData.copyfrom = UtilSql.getValue(result, "copyfrom");
        objectHeaderData.calculatePromotions = UtilSql.getValue(result, "calculate_promotions");
        objectHeaderData.cProjectId = UtilSql.getValue(result, "c_project_id");
        objectHeaderData.cProjectIdr = UtilSql.getValue(result, "c_project_idr");
        objectHeaderData.cCostcenterId = UtilSql.getValue(result, "c_costcenter_id");
        objectHeaderData.aAssetId = UtilSql.getValue(result, "a_asset_id");
        objectHeaderData.user1Id = UtilSql.getValue(result, "user1_id");
        objectHeaderData.user2Id = UtilSql.getValue(result, "user2_id");
        objectHeaderData.isprinted = UtilSql.getValue(result, "isprinted");
        objectHeaderData.paymentrule = UtilSql.getValue(result, "paymentrule");
        objectHeaderData.issotrx = UtilSql.getValue(result, "issotrx");
        objectHeaderData.dateprinted = UtilSql.getDateValue(result, "dateprinted", "dd-MM-yyyy");
        objectHeaderData.processing = UtilSql.getValue(result, "processing");
        objectHeaderData.processed = UtilSql.getValue(result, "processed");
        objectHeaderData.cInvoiceId = UtilSql.getValue(result, "c_invoice_id");
        objectHeaderData.adClientId = UtilSql.getValue(result, "ad_client_id");
        objectHeaderData.isselfservice = UtilSql.getValue(result, "isselfservice");
        objectHeaderData.istaxincluded = UtilSql.getValue(result, "istaxincluded");
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
  public static HeaderData[] set(String lastcalculatedondate, String cWithholdingId, String withholdingamount, String taxdate, String daystilldue, String cInvoiceId, String adClientId, String adOrgId, String isactive, String created, String createdby, String createdbyr, String updatedby, String updatedbyr, String documentno, String cDoctypeId, String docstatus, String docaction, String docactionBtn, String processing, String processed, String cBpartnerId, String cBpartnerIdr, String cPaymenttermId, String cBpartnerLocationId, String cCurrencyId, String totallines, String grandtotal, String dateacct, String cCampaignId, String cProjectId, String cProjectIdr, String cActivityId, String salesrepId, String adUserId, String issotrx, String cDoctypetargetId, String description, String dateinvoiced, String dateprinted, String poreference, String cChargeId, String chargeamt, String mPricelistId, String paymentrule, String cOrderId, String cOrderIdr, String dateordered, String isdiscountprinted, String isprinted, String istaxincluded, String posted, String postedBtn, String generateto, String createfrom, String emAprmAddpayment, String finPaymentmethodId, String copyfrom, String isselfservice, String emAprmProcessinvoice, String emAprmProcessinvoiceBtn, String cCostcenterId, String adOrgtrxId, String user1Id, String user2Id, String finalsettlement, String daysoutstanding, String percentageoverdue, String totalpaid, String outstandingamt, String dueamt, String ispaid, String updatepaymentmonitor, String aAssetId, String calculatePromotions)    throws ServletException {
    HeaderData objectHeaderData[] = new HeaderData[1];
    objectHeaderData[0] = new HeaderData();
    objectHeaderData[0].created = created;
    objectHeaderData[0].createdbyr = createdbyr;
    objectHeaderData[0].updated = "";
    objectHeaderData[0].updatedTimeStamp = "";
    objectHeaderData[0].updatedby = updatedby;
    objectHeaderData[0].updatedbyr = updatedbyr;
    objectHeaderData[0].adOrgId = adOrgId;
    objectHeaderData[0].adOrgIdr = "";
    objectHeaderData[0].cDoctypetargetId = cDoctypetargetId;
    objectHeaderData[0].cDoctypetargetIdr = "";
    objectHeaderData[0].documentno = documentno;
    objectHeaderData[0].dateinvoiced = dateinvoiced;
    objectHeaderData[0].cBpartnerId = cBpartnerId;
    objectHeaderData[0].cBpartnerIdr = cBpartnerIdr;
    objectHeaderData[0].cBpartnerLocationId = cBpartnerLocationId;
    objectHeaderData[0].cBpartnerLocationIdr = "";
    objectHeaderData[0].mPricelistId = mPricelistId;
    objectHeaderData[0].mPricelistIdr = "";
    objectHeaderData[0].dateacct = dateacct;
    objectHeaderData[0].cPaymenttermId = cPaymenttermId;
    objectHeaderData[0].cPaymenttermIdr = "";
    objectHeaderData[0].finPaymentmethodId = finPaymentmethodId;
    objectHeaderData[0].finPaymentmethodIdr = "";
    objectHeaderData[0].description = description;
    objectHeaderData[0].cOrderId = cOrderId;
    objectHeaderData[0].cOrderIdr = cOrderIdr;
    objectHeaderData[0].poreference = poreference;
    objectHeaderData[0].docstatus = docstatus;
    objectHeaderData[0].grandtotal = grandtotal;
    objectHeaderData[0].totallines = totallines;
    objectHeaderData[0].cCurrencyId = cCurrencyId;
    objectHeaderData[0].ispaid = ispaid;
    objectHeaderData[0].adUserId = adUserId;
    objectHeaderData[0].totalpaid = totalpaid;
    objectHeaderData[0].lastcalculatedondate = lastcalculatedondate;
    objectHeaderData[0].outstandingamt = outstandingamt;
    objectHeaderData[0].taxdate = taxdate;
    objectHeaderData[0].dueamt = dueamt;
    objectHeaderData[0].dateordered = dateordered;
    objectHeaderData[0].daystilldue = daystilldue;
    objectHeaderData[0].salesrepId = salesrepId;
    objectHeaderData[0].isdiscountprinted = isdiscountprinted;
    objectHeaderData[0].cDoctypeId = cDoctypeId;
    objectHeaderData[0].withholdingamount = withholdingamount;
    objectHeaderData[0].cWithholdingId = cWithholdingId;
    objectHeaderData[0].percentageoverdue = percentageoverdue;
    objectHeaderData[0].cActivityId = cActivityId;
    objectHeaderData[0].finalsettlement = finalsettlement;
    objectHeaderData[0].cCampaignId = cCampaignId;
    objectHeaderData[0].daysoutstanding = daysoutstanding;
    objectHeaderData[0].isactive = isactive;
    objectHeaderData[0].chargeamt = chargeamt;
    objectHeaderData[0].cChargeId = cChargeId;
    objectHeaderData[0].generateto = generateto;
    objectHeaderData[0].adOrgtrxId = adOrgtrxId;
    objectHeaderData[0].updatepaymentmonitor = updatepaymentmonitor;
    objectHeaderData[0].emAprmAddpayment = emAprmAddpayment;
    objectHeaderData[0].posted = posted;
    objectHeaderData[0].postedBtn = postedBtn;
    objectHeaderData[0].emAprmProcessinvoice = emAprmProcessinvoice;
    objectHeaderData[0].emAprmProcessinvoiceBtn = emAprmProcessinvoiceBtn;
    objectHeaderData[0].docaction = docaction;
    objectHeaderData[0].docactionBtn = docactionBtn;
    objectHeaderData[0].createfrom = createfrom;
    objectHeaderData[0].copyfrom = copyfrom;
    objectHeaderData[0].calculatePromotions = calculatePromotions;
    objectHeaderData[0].cProjectId = cProjectId;
    objectHeaderData[0].cProjectIdr = cProjectIdr;
    objectHeaderData[0].cCostcenterId = cCostcenterId;
    objectHeaderData[0].aAssetId = aAssetId;
    objectHeaderData[0].user1Id = user1Id;
    objectHeaderData[0].user2Id = user2Id;
    objectHeaderData[0].isprinted = isprinted;
    objectHeaderData[0].paymentrule = paymentrule;
    objectHeaderData[0].issotrx = issotrx;
    objectHeaderData[0].dateprinted = dateprinted;
    objectHeaderData[0].processing = processing;
    objectHeaderData[0].processed = processed;
    objectHeaderData[0].cInvoiceId = cInvoiceId;
    objectHeaderData[0].adClientId = adClientId;
    objectHeaderData[0].isselfservice = isselfservice;
    objectHeaderData[0].istaxincluded = istaxincluded;
    objectHeaderData[0].language = "";
    return objectHeaderData;
  }

/**
Select for auxiliar field
 */
  public static String selectAux68CD2AFDCEAB45ADB0690B33067B7940(ConnectionProvider connectionProvider, String c_doctypetarget_id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        select max(docbasetype) from c_doctype where c_doctype_id = ? ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, c_doctypetarget_id);

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
  public static String selectAux7E3FB488115E46C5937FDF8A73D36098(ConnectionProvider connectionProvider, String C_INVOICE_ID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT COUNT(*) FROM C_INVOICE_REVERSE WHERE C_INVOICE_ID=? ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_INVOICE_ID);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "count");
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
  public static String selectDef3489_0(ConnectionProvider connectionProvider, String CreatedByR)    throws ServletException {
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
  public static String selectDef3491_1(ConnectionProvider connectionProvider, String UpdatedByR)    throws ServletException {
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
  public static String selectDef3499_2(ConnectionProvider connectionProvider, String C_BPartner_IDR)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Name), ''))), '') ) as C_BPartner_ID FROM C_BPartner left join (select C_BPartner_ID, Name from C_BPartner) table2 on (C_BPartner.C_BPartner_ID = table2.C_BPartner_ID) WHERE C_BPartner.isActive='Y' AND C_BPartner.C_BPartner_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_BPartner_IDR);

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
  public static String selectDef3510_3(ConnectionProvider connectionProvider, String C_Project_IDR)    throws ServletException {
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
  public static String selectDef4247_4(ConnectionProvider connectionProvider, String C_Order_IDR)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.DocumentNo), ''))), '')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(table2.DateOrdered, 'DD-MM-YYYY')), '')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.GrandTotal), ''))), '') ) as C_Order_ID FROM C_Order left join (select C_Order_ID, DocumentNo, DateOrdered, GrandTotal from C_Order) table2 on (C_Order.C_Order_ID = table2.C_Order_ID) WHERE C_Order.isActive='Y' AND C_Order.C_Order_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_Order_IDR);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "c_order_id");
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

  public static int updateDocAction(ConnectionProvider connectionProvider, String docaction, String cInvoiceId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        UPDATE C_Invoice" +
      "        SET docaction = ? " +
      "        WHERE C_Invoice.C_Invoice_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, docaction);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cInvoiceId);

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
Select for action search
 */
  public static String selectActDefM_Locator_ID(ConnectionProvider connectionProvider, String M_Locator_ID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT Value FROM M_Locator WHERE isActive='Y' AND M_Locator_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, M_Locator_ID);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "value");
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
Select for action search
 */
  public static String selectActDefC_Invoice_ID(ConnectionProvider connectionProvider, String C_Invoice_ID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT DocumentNo FROM C_Invoice WHERE isActive='Y' AND C_Invoice_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_Invoice_ID);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "documentno");
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
      "        UPDATE C_Invoice" +
      "        SET AD_Org_ID = (?) , C_DocTypeTarget_ID = (?) , DocumentNo = (?) , DateInvoiced = TO_DATE(?) , C_BPartner_ID = (?) , C_BPartner_Location_ID = (?) , M_PriceList_ID = (?) , DateAcct = TO_DATE(?) , C_PaymentTerm_ID = (?) , FIN_Paymentmethod_ID = (?) , Description = (?) , C_Order_ID = (?) , POReference = (?) , DocStatus = (?) , GrandTotal = TO_NUMBER(?) , TotalLines = TO_NUMBER(?) , C_Currency_ID = (?) , Ispaid = (?) , AD_User_ID = (?) , Totalpaid = TO_NUMBER(?) , LastCalculatedOnDate = TO_DATE(?) , OutstandingAmt = TO_NUMBER(?) , Taxdate = TO_DATE(?) , DateOrdered = TO_DATE(?) , DueAmt = TO_NUMBER(?) , SalesRep_ID = (?) , DaysTillDue = TO_NUMBER(?) , IsDiscountPrinted = (?) , C_DocType_ID = (?) , Withholdingamount = TO_NUMBER(?) , C_Withholding_ID = (?) , C_Activity_ID = (?) , Percentageoverdue = TO_NUMBER(?) , Finalsettlement = TO_DATE(?) , C_Campaign_ID = (?) , Daysoutstanding = TO_NUMBER(?) , IsActive = (?) , ChargeAmt = TO_NUMBER(?) , C_Charge_ID = (?) , GenerateTo = (?) , AD_OrgTrx_ID = (?) , UpdatePaymentMonitor = (?) , EM_APRM_Addpayment = (?) , Posted = (?) , EM_APRM_Processinvoice = (?) , DocAction = (?) , CreateFrom = (?) , CopyFrom = (?) , Calculate_Promotions = (?) , C_Project_ID = (?) , C_Costcenter_ID = (?) , A_Asset_ID = (?) , User1_ID = (?) , User2_ID = (?) , IsPrinted = (?) , PaymentRule = (?) , IsSOTrx = (?) , DatePrinted = TO_DATE(?) , Processing = (?) , Processed = (?) , C_Invoice_ID = (?) , AD_Client_ID = (?) , IsSelfService = (?) , IsTaxIncluded = (?) , updated = now(), updatedby = ? " +
      "        WHERE C_Invoice.C_Invoice_ID = ? " +
      "        AND C_Invoice.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND C_Invoice.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cDoctypetargetId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, documentno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateinvoiced);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerLocationId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mPricelistId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateacct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cPaymenttermId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, finPaymentmethodId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cOrderId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, poreference);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, docstatus);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, grandtotal);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, totallines);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCurrencyId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ispaid);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, totalpaid);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lastcalculatedondate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, outstandingamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, taxdate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateordered);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dueamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, salesrepId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, daystilldue);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isdiscountprinted);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cDoctypeId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, withholdingamount);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cWithholdingId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cActivityId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, percentageoverdue);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, finalsettlement);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCampaignId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, daysoutstanding);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, chargeamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cChargeId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, generateto);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgtrxId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatepaymentmonitor);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emAprmAddpayment);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, posted);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emAprmProcessinvoice);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, docaction);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, createfrom);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, copyfrom);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, calculatePromotions);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cProjectId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCostcenterId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, aAssetId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, user1Id);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, user2Id);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isprinted);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paymentrule);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, issotrx);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateprinted);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processing);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processed);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cInvoiceId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isselfservice);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, istaxincluded);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cInvoiceId);
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
      "        INSERT INTO C_Invoice " +
      "        (AD_Org_ID, C_DocTypeTarget_ID, DocumentNo, DateInvoiced, C_BPartner_ID, C_BPartner_Location_ID, M_PriceList_ID, DateAcct, C_PaymentTerm_ID, FIN_Paymentmethod_ID, Description, C_Order_ID, POReference, DocStatus, GrandTotal, TotalLines, C_Currency_ID, Ispaid, AD_User_ID, Totalpaid, LastCalculatedOnDate, OutstandingAmt, Taxdate, DueAmt, DateOrdered, DaysTillDue, SalesRep_ID, IsDiscountPrinted, C_DocType_ID, Withholdingamount, C_Withholding_ID, Percentageoverdue, C_Activity_ID, Finalsettlement, C_Campaign_ID, Daysoutstanding, IsActive, ChargeAmt, C_Charge_ID, GenerateTo, AD_OrgTrx_ID, UpdatePaymentMonitor, EM_APRM_Addpayment, Posted, EM_APRM_Processinvoice, DocAction, CreateFrom, CopyFrom, Calculate_Promotions, C_Project_ID, C_Costcenter_ID, A_Asset_ID, User1_ID, User2_ID, IsPrinted, PaymentRule, IsSOTrx, DatePrinted, Processing, Processed, C_Invoice_ID, AD_Client_ID, IsSelfService, IsTaxIncluded, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), (?), TO_DATE(?), (?), (?), (?), TO_DATE(?), (?), (?), (?), (?), (?), (?), TO_NUMBER(?), TO_NUMBER(?), (?), (?), (?), TO_NUMBER(?), TO_DATE(?), TO_NUMBER(?), TO_DATE(?), TO_NUMBER(?), TO_DATE(?), TO_NUMBER(?), (?), (?), (?), TO_NUMBER(?), (?), TO_NUMBER(?), (?), TO_DATE(?), (?), TO_NUMBER(?), (?), TO_NUMBER(?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), TO_DATE(?), (?), (?), (?), (?), (?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cDoctypetargetId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, documentno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateinvoiced);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerLocationId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mPricelistId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateacct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cPaymenttermId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, finPaymentmethodId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cOrderId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, poreference);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, docstatus);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, grandtotal);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, totallines);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCurrencyId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ispaid);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, totalpaid);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lastcalculatedondate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, outstandingamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, taxdate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dueamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateordered);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, daystilldue);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, salesrepId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isdiscountprinted);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cDoctypeId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, withholdingamount);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cWithholdingId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, percentageoverdue);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cActivityId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, finalsettlement);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCampaignId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, daysoutstanding);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, chargeamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cChargeId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, generateto);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgtrxId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatepaymentmonitor);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emAprmAddpayment);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, posted);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emAprmProcessinvoice);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, docaction);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, createfrom);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, copyfrom);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, calculatePromotions);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cProjectId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCostcenterId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, aAssetId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, user1Id);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, user2Id);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isprinted);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paymentrule);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, issotrx);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateprinted);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processing);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processed);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cInvoiceId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isselfservice);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, istaxincluded);
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
      "        DELETE FROM C_Invoice" +
      "        WHERE C_Invoice.C_Invoice_ID = ? " +
      "        AND C_Invoice.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND C_Invoice.AD_Org_ID IN (";
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
      "          FROM C_Invoice" +
      "         WHERE C_Invoice.C_Invoice_ID = ? ";

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
      "          FROM C_Invoice" +
      "         WHERE C_Invoice.C_Invoice_ID = ? ";

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
