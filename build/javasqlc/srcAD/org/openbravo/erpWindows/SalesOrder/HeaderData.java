//Sqlc generated V1.O00-1
package org.openbravo.erpWindows.SalesOrder;

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
  public String cReturnReasonId;
  public String dateordered;
  public String cBpartnerId;
  public String cBpartnerIdr;
  public String rmPickfromshipment;
  public String cBpartnerLocationId;
  public String cBpartnerLocationIdr;
  public String mPricelistId;
  public String mPricelistIdr;
  public String rmReceivematerials;
  public String datepromised;
  public String rmCreateinvoice;
  public String finPaymentmethodId;
  public String finPaymentmethodIdr;
  public String cPaymenttermId;
  public String cPaymenttermIdr;
  public String mWarehouseId;
  public String mWarehouseIdr;
  public String invoicerule;
  public String invoiceruler;
  public String docstatus;
  public String grandtotal;
  public String totallines;
  public String cCurrencyId;
  public String adUserId;
  public String cDoctypeId;
  public String soResStatus;
  public String poreference;
  public String salesrepId;
  public String salesrepIdr;
  public String description;
  public String billtoId;
  public String billtoIdr;
  public String deliveryLocationId;
  public String deliveryLocationIdr;
  public String docaction;
  public String docactionBtn;
  public String copyfrom;
  public String copyfrompo;
  public String deliveryviarule;
  public String mShipperId;
  public String deliveryrule;
  public String freightcostrule;
  public String freightamt;
  public String isdiscountprinted;
  public String priorityrule;
  public String cCampaignId;
  public String chargeamt;
  public String cChargeId;
  public String cActivityId;
  public String adOrgtrxId;
  public String quotationId;
  public String quotationIdr;
  public String emObposApplicationsId;
  public String emObposApplicationsIdr;
  public String emObposSendemail;
  public String emObposEmailStatus;
  public String calculatePromotions;
  public String rmAddorphanline;
  public String convertquotation;
  public String cRejectReasonId;
  public String validuntil;
  public String emObdiscAddpack;
  public String cProjectId;
  public String cProjectIdr;
  public String cCostcenterId;
  public String aAssetId;
  public String user1Id;
  public String user2Id;
  public String isinvoiced;
  public String isdelivered;
  public String isactive;
  public String adClientId;
  public String cOrderId;
  public String processing;
  public String paymentrule;
  public String dateprinted;
  public String posted;
  public String istaxincluded;
  public String isselected;
  public String dropshipUserId;
  public String dropshipBpartnerId;
  public String incotermsdescription;
  public String dropshipLocationId;
  public String isselfservice;
  public String generatetemplate;
  public String processed;
  public String deliverynotes;
  public String cIncotermsId;
  public String issotrx;
  public String dateacct;
  public String isprinted;
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
    else if (fieldName.equalsIgnoreCase("c_return_reason_id") || fieldName.equals("cReturnReasonId"))
      return cReturnReasonId;
    else if (fieldName.equalsIgnoreCase("dateordered"))
      return dateordered;
    else if (fieldName.equalsIgnoreCase("c_bpartner_id") || fieldName.equals("cBpartnerId"))
      return cBpartnerId;
    else if (fieldName.equalsIgnoreCase("c_bpartner_idr") || fieldName.equals("cBpartnerIdr"))
      return cBpartnerIdr;
    else if (fieldName.equalsIgnoreCase("rm_pickfromshipment") || fieldName.equals("rmPickfromshipment"))
      return rmPickfromshipment;
    else if (fieldName.equalsIgnoreCase("c_bpartner_location_id") || fieldName.equals("cBpartnerLocationId"))
      return cBpartnerLocationId;
    else if (fieldName.equalsIgnoreCase("c_bpartner_location_idr") || fieldName.equals("cBpartnerLocationIdr"))
      return cBpartnerLocationIdr;
    else if (fieldName.equalsIgnoreCase("m_pricelist_id") || fieldName.equals("mPricelistId"))
      return mPricelistId;
    else if (fieldName.equalsIgnoreCase("m_pricelist_idr") || fieldName.equals("mPricelistIdr"))
      return mPricelistIdr;
    else if (fieldName.equalsIgnoreCase("rm_receivematerials") || fieldName.equals("rmReceivematerials"))
      return rmReceivematerials;
    else if (fieldName.equalsIgnoreCase("datepromised"))
      return datepromised;
    else if (fieldName.equalsIgnoreCase("rm_createinvoice") || fieldName.equals("rmCreateinvoice"))
      return rmCreateinvoice;
    else if (fieldName.equalsIgnoreCase("fin_paymentmethod_id") || fieldName.equals("finPaymentmethodId"))
      return finPaymentmethodId;
    else if (fieldName.equalsIgnoreCase("fin_paymentmethod_idr") || fieldName.equals("finPaymentmethodIdr"))
      return finPaymentmethodIdr;
    else if (fieldName.equalsIgnoreCase("c_paymentterm_id") || fieldName.equals("cPaymenttermId"))
      return cPaymenttermId;
    else if (fieldName.equalsIgnoreCase("c_paymentterm_idr") || fieldName.equals("cPaymenttermIdr"))
      return cPaymenttermIdr;
    else if (fieldName.equalsIgnoreCase("m_warehouse_id") || fieldName.equals("mWarehouseId"))
      return mWarehouseId;
    else if (fieldName.equalsIgnoreCase("m_warehouse_idr") || fieldName.equals("mWarehouseIdr"))
      return mWarehouseIdr;
    else if (fieldName.equalsIgnoreCase("invoicerule"))
      return invoicerule;
    else if (fieldName.equalsIgnoreCase("invoiceruler"))
      return invoiceruler;
    else if (fieldName.equalsIgnoreCase("docstatus"))
      return docstatus;
    else if (fieldName.equalsIgnoreCase("grandtotal"))
      return grandtotal;
    else if (fieldName.equalsIgnoreCase("totallines"))
      return totallines;
    else if (fieldName.equalsIgnoreCase("c_currency_id") || fieldName.equals("cCurrencyId"))
      return cCurrencyId;
    else if (fieldName.equalsIgnoreCase("ad_user_id") || fieldName.equals("adUserId"))
      return adUserId;
    else if (fieldName.equalsIgnoreCase("c_doctype_id") || fieldName.equals("cDoctypeId"))
      return cDoctypeId;
    else if (fieldName.equalsIgnoreCase("so_res_status") || fieldName.equals("soResStatus"))
      return soResStatus;
    else if (fieldName.equalsIgnoreCase("poreference"))
      return poreference;
    else if (fieldName.equalsIgnoreCase("salesrep_id") || fieldName.equals("salesrepId"))
      return salesrepId;
    else if (fieldName.equalsIgnoreCase("salesrep_idr") || fieldName.equals("salesrepIdr"))
      return salesrepIdr;
    else if (fieldName.equalsIgnoreCase("description"))
      return description;
    else if (fieldName.equalsIgnoreCase("billto_id") || fieldName.equals("billtoId"))
      return billtoId;
    else if (fieldName.equalsIgnoreCase("billto_idr") || fieldName.equals("billtoIdr"))
      return billtoIdr;
    else if (fieldName.equalsIgnoreCase("delivery_location_id") || fieldName.equals("deliveryLocationId"))
      return deliveryLocationId;
    else if (fieldName.equalsIgnoreCase("delivery_location_idr") || fieldName.equals("deliveryLocationIdr"))
      return deliveryLocationIdr;
    else if (fieldName.equalsIgnoreCase("docaction"))
      return docaction;
    else if (fieldName.equalsIgnoreCase("docaction_btn") || fieldName.equals("docactionBtn"))
      return docactionBtn;
    else if (fieldName.equalsIgnoreCase("copyfrom"))
      return copyfrom;
    else if (fieldName.equalsIgnoreCase("copyfrompo"))
      return copyfrompo;
    else if (fieldName.equalsIgnoreCase("deliveryviarule"))
      return deliveryviarule;
    else if (fieldName.equalsIgnoreCase("m_shipper_id") || fieldName.equals("mShipperId"))
      return mShipperId;
    else if (fieldName.equalsIgnoreCase("deliveryrule"))
      return deliveryrule;
    else if (fieldName.equalsIgnoreCase("freightcostrule"))
      return freightcostrule;
    else if (fieldName.equalsIgnoreCase("freightamt"))
      return freightamt;
    else if (fieldName.equalsIgnoreCase("isdiscountprinted"))
      return isdiscountprinted;
    else if (fieldName.equalsIgnoreCase("priorityrule"))
      return priorityrule;
    else if (fieldName.equalsIgnoreCase("c_campaign_id") || fieldName.equals("cCampaignId"))
      return cCampaignId;
    else if (fieldName.equalsIgnoreCase("chargeamt"))
      return chargeamt;
    else if (fieldName.equalsIgnoreCase("c_charge_id") || fieldName.equals("cChargeId"))
      return cChargeId;
    else if (fieldName.equalsIgnoreCase("c_activity_id") || fieldName.equals("cActivityId"))
      return cActivityId;
    else if (fieldName.equalsIgnoreCase("ad_orgtrx_id") || fieldName.equals("adOrgtrxId"))
      return adOrgtrxId;
    else if (fieldName.equalsIgnoreCase("quotation_id") || fieldName.equals("quotationId"))
      return quotationId;
    else if (fieldName.equalsIgnoreCase("quotation_idr") || fieldName.equals("quotationIdr"))
      return quotationIdr;
    else if (fieldName.equalsIgnoreCase("em_obpos_applications_id") || fieldName.equals("emObposApplicationsId"))
      return emObposApplicationsId;
    else if (fieldName.equalsIgnoreCase("em_obpos_applications_idr") || fieldName.equals("emObposApplicationsIdr"))
      return emObposApplicationsIdr;
    else if (fieldName.equalsIgnoreCase("em_obpos_sendemail") || fieldName.equals("emObposSendemail"))
      return emObposSendemail;
    else if (fieldName.equalsIgnoreCase("em_obpos_email_status") || fieldName.equals("emObposEmailStatus"))
      return emObposEmailStatus;
    else if (fieldName.equalsIgnoreCase("calculate_promotions") || fieldName.equals("calculatePromotions"))
      return calculatePromotions;
    else if (fieldName.equalsIgnoreCase("rm_addorphanline") || fieldName.equals("rmAddorphanline"))
      return rmAddorphanline;
    else if (fieldName.equalsIgnoreCase("convertquotation"))
      return convertquotation;
    else if (fieldName.equalsIgnoreCase("c_reject_reason_id") || fieldName.equals("cRejectReasonId"))
      return cRejectReasonId;
    else if (fieldName.equalsIgnoreCase("validuntil"))
      return validuntil;
    else if (fieldName.equalsIgnoreCase("em_obdisc_addpack") || fieldName.equals("emObdiscAddpack"))
      return emObdiscAddpack;
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
    else if (fieldName.equalsIgnoreCase("isinvoiced"))
      return isinvoiced;
    else if (fieldName.equalsIgnoreCase("isdelivered"))
      return isdelivered;
    else if (fieldName.equalsIgnoreCase("isactive"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("ad_client_id") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("c_order_id") || fieldName.equals("cOrderId"))
      return cOrderId;
    else if (fieldName.equalsIgnoreCase("processing"))
      return processing;
    else if (fieldName.equalsIgnoreCase("paymentrule"))
      return paymentrule;
    else if (fieldName.equalsIgnoreCase("dateprinted"))
      return dateprinted;
    else if (fieldName.equalsIgnoreCase("posted"))
      return posted;
    else if (fieldName.equalsIgnoreCase("istaxincluded"))
      return istaxincluded;
    else if (fieldName.equalsIgnoreCase("isselected"))
      return isselected;
    else if (fieldName.equalsIgnoreCase("dropship_user_id") || fieldName.equals("dropshipUserId"))
      return dropshipUserId;
    else if (fieldName.equalsIgnoreCase("dropship_bpartner_id") || fieldName.equals("dropshipBpartnerId"))
      return dropshipBpartnerId;
    else if (fieldName.equalsIgnoreCase("incotermsdescription"))
      return incotermsdescription;
    else if (fieldName.equalsIgnoreCase("dropship_location_id") || fieldName.equals("dropshipLocationId"))
      return dropshipLocationId;
    else if (fieldName.equalsIgnoreCase("isselfservice"))
      return isselfservice;
    else if (fieldName.equalsIgnoreCase("generatetemplate"))
      return generatetemplate;
    else if (fieldName.equalsIgnoreCase("processed"))
      return processed;
    else if (fieldName.equalsIgnoreCase("deliverynotes"))
      return deliverynotes;
    else if (fieldName.equalsIgnoreCase("c_incoterms_id") || fieldName.equals("cIncotermsId"))
      return cIncotermsId;
    else if (fieldName.equalsIgnoreCase("issotrx"))
      return issotrx;
    else if (fieldName.equalsIgnoreCase("dateacct"))
      return dateacct;
    else if (fieldName.equalsIgnoreCase("isprinted"))
      return isprinted;
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
      "        SELECT to_char(C_Order.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = C_Order.CreatedBy) as CreatedByR, " +
      "        to_char(C_Order.Updated, ?) as updated, " +
      "        to_char(C_Order.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        C_Order.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = C_Order.UpdatedBy) as UpdatedByR," +
      "        C_Order.AD_Org_ID, " +
      "(CASE WHEN C_Order.AD_Org_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.Name), ''))),'') ) END) AS AD_Org_IDR, " +
      "C_Order.C_DocTypeTarget_ID, " +
      "(CASE WHEN C_Order.C_DocTypeTarget_ID IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL2.Name IS NULL THEN TO_CHAR(table2.Name) ELSE TO_CHAR(tableTRL2.Name) END)), ''))),'') ) END) AS C_DocTypeTarget_IDR, " +
      "C_Order.DocumentNo, " +
      "C_Order.C_Return_Reason_ID, " +
      "C_Order.DateOrdered, " +
      "C_Order.C_BPartner_ID, " +
      "(CASE WHEN C_Order.C_BPartner_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table3.Name), ''))),'') ) END) AS C_BPartner_IDR, " +
      "C_Order.RM_PickFromShipment, " +
      "C_Order.C_BPartner_Location_ID, " +
      "(CASE WHEN C_Order.C_BPartner_Location_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table4.Name), ''))),'') ) END) AS C_BPartner_Location_IDR, " +
      "C_Order.M_PriceList_ID, " +
      "(CASE WHEN C_Order.M_PriceList_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table5.Name), ''))),'') ) END) AS M_PriceList_IDR, " +
      "C_Order.RM_ReceiveMaterials, " +
      "C_Order.DatePromised, " +
      "C_Order.RM_CreateInvoice, " +
      "C_Order.FIN_Paymentmethod_ID, " +
      "(CASE WHEN C_Order.FIN_Paymentmethod_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table6.Name), ''))),'') ) END) AS FIN_Paymentmethod_IDR, " +
      "C_Order.C_PaymentTerm_ID, " +
      "(CASE WHEN C_Order.C_PaymentTerm_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL7.Name IS NULL THEN TO_CHAR(table7.Name) ELSE TO_CHAR(tableTRL7.Name) END)), ''))),'') ) END) AS C_PaymentTerm_IDR, " +
      "C_Order.M_Warehouse_ID, " +
      "(CASE WHEN C_Order.M_Warehouse_ID IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table8.Name), ''))),'') ) END) AS M_Warehouse_IDR, " +
      "C_Order.InvoiceRule, " +
      "(CASE WHEN C_Order.InvoiceRule IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list1.name),'') ) END) AS InvoiceRuleR, " +
      "C_Order.DocStatus, " +
      "C_Order.GrandTotal, " +
      "C_Order.TotalLines, " +
      "C_Order.C_Currency_ID, " +
      "C_Order.AD_User_ID, " +
      "C_Order.C_DocType_ID, " +
      "C_Order.SO_Res_Status, " +
      "C_Order.POReference, " +
      "C_Order.SalesRep_ID, " +
      "(CASE WHEN C_Order.SalesRep_ID IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table9.Name), ''))),'') ) END) AS SalesRep_IDR, " +
      "C_Order.Description, " +
      "C_Order.BillTo_ID, " +
      "(CASE WHEN C_Order.BillTo_ID IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table10.Name), ''))),'') ) END) AS BillTo_IDR, " +
      "C_Order.Delivery_Location_ID, " +
      "(CASE WHEN C_Order.Delivery_Location_ID IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table11.Name), ''))),'') ) END) AS Delivery_Location_IDR, " +
      "C_Order.DocAction, " +
      "list2.name as DocAction_BTN, " +
      "C_Order.CopyFrom, " +
      "C_Order.CopyFromPO, " +
      "C_Order.DeliveryViaRule, " +
      "C_Order.M_Shipper_ID, " +
      "C_Order.DeliveryRule, " +
      "C_Order.FreightCostRule, " +
      "C_Order.FreightAmt, " +
      "COALESCE(C_Order.IsDiscountPrinted, 'N') AS IsDiscountPrinted, " +
      "C_Order.PriorityRule, " +
      "C_Order.C_Campaign_ID, " +
      "C_Order.ChargeAmt, " +
      "C_Order.C_Charge_ID, " +
      "C_Order.C_Activity_ID, " +
      "C_Order.AD_OrgTrx_ID, " +
      "C_Order.Quotation_ID, " +
      "(CASE WHEN C_Order.Quotation_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table12.DocumentNo), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(table12.DateOrdered, 'DD-MM-YYYY')),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table12.GrandTotal), ''))),'') ) END) AS Quotation_IDR, " +
      "C_Order.EM_Obpos_Applications_ID, " +
      "(CASE WHEN C_Order.EM_Obpos_Applications_ID IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table13.Name), ''))),'') ) END) AS EM_Obpos_Applications_IDR, " +
      "COALESCE(C_Order.EM_Obpos_Sendemail, 'N') AS EM_Obpos_Sendemail, " +
      "C_Order.EM_Obpos_Email_Status, " +
      "C_Order.Calculate_Promotions, " +
      "C_Order.RM_AddOrphanLine, " +
      "C_Order.Convertquotation, " +
      "C_Order.C_Reject_Reason_ID, " +
      "C_Order.validuntil, " +
      "C_Order.EM_Obdisc_Addpack, " +
      "C_Order.C_Project_ID, " +
      "(CASE WHEN C_Order.C_Project_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table14.Value), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table14.Name), ''))),'') ) END) AS C_Project_IDR, " +
      "C_Order.C_Costcenter_ID, " +
      "C_Order.A_Asset_ID, " +
      "C_Order.User1_ID, " +
      "C_Order.User2_ID, " +
      "COALESCE(C_Order.IsInvoiced, 'N') AS IsInvoiced, " +
      "COALESCE(C_Order.IsDelivered, 'N') AS IsDelivered, " +
      "COALESCE(C_Order.IsActive, 'N') AS IsActive, " +
      "C_Order.AD_Client_ID, " +
      "C_Order.C_Order_ID, " +
      "C_Order.Processing, " +
      "C_Order.PaymentRule, " +
      "C_Order.DatePrinted, " +
      "C_Order.Posted, " +
      "COALESCE(C_Order.IsTaxIncluded, 'N') AS IsTaxIncluded, " +
      "COALESCE(C_Order.IsSelected, 'N') AS IsSelected, " +
      "C_Order.DropShip_User_ID, " +
      "C_Order.DropShip_BPartner_ID, " +
      "C_Order.Incotermsdescription, " +
      "C_Order.DropShip_Location_ID, " +
      "COALESCE(C_Order.IsSelfService, 'N') AS IsSelfService, " +
      "C_Order.Generatetemplate, " +
      "COALESCE(C_Order.Processed, 'N') AS Processed, " +
      "C_Order.Deliverynotes, " +
      "C_Order.C_Incoterms_ID, " +
      "COALESCE(C_Order.IsSOTrx, 'N') AS IsSOTrx, " +
      "C_Order.DateAcct, " +
      "COALESCE(C_Order.IsPrinted, 'N') AS IsPrinted, " +
      "        ? AS LANGUAGE " +
      "        FROM C_Order left join (select AD_Org_ID, Name from AD_Org) table1 on (C_Order.AD_Org_ID = table1.AD_Org_ID) left join (select C_DocType_ID, Name from C_DocType) table2 on (C_Order.C_DocTypeTarget_ID =  table2.C_DocType_ID) left join (select C_DocType_ID,AD_Language, Name from C_DocType_TRL) tableTRL2 on (table2.C_DocType_ID = tableTRL2.C_DocType_ID and tableTRL2.AD_Language = ?)  left join (select C_BPartner_ID, Name from C_BPartner) table3 on (C_Order.C_BPartner_ID = table3.C_BPartner_ID) left join (select C_BPartner_Location_ID, Name from C_BPartner_Location) table4 on (C_Order.C_BPartner_Location_ID = table4.C_BPartner_Location_ID) left join (select M_PriceList_ID, Name from M_PriceList) table5 on (C_Order.M_PriceList_ID = table5.M_PriceList_ID) left join (select FIN_Paymentmethod_ID, Name from FIN_Paymentmethod) table6 on (C_Order.FIN_Paymentmethod_ID = table6.FIN_Paymentmethod_ID) left join (select C_PaymentTerm_ID, Name from C_PaymentTerm) table7 on (C_Order.C_PaymentTerm_ID = table7.C_PaymentTerm_ID) left join (select C_PaymentTerm_ID,AD_Language, Name from C_PaymentTerm_TRL) tableTRL7 on (table7.C_PaymentTerm_ID = tableTRL7.C_PaymentTerm_ID and tableTRL7.AD_Language = ?)  left join (select M_Warehouse_ID, Name from M_Warehouse) table8 on (C_Order.M_Warehouse_ID =  table8.M_Warehouse_ID) left join ad_ref_list_v list1 on (C_Order.InvoiceRule = list1.value and list1.ad_reference_id = '150' and list1.ad_language = ?)  left join (select AD_User_ID, Name from AD_User) table9 on (C_Order.SalesRep_ID =  table9.AD_User_ID) left join (select C_BPartner_Location_ID, Name from C_BPartner_Location) table10 on (C_Order.BillTo_ID =  table10.C_BPartner_Location_ID) left join (select C_BPartner_Location_ID, Name from C_BPartner_Location) table11 on (C_Order.Delivery_Location_ID =  table11.C_BPartner_Location_ID) left join ad_ref_list_v list2 on (list2.ad_reference_id = 'FF80818130217A35013021A672400035' and list2.ad_language = ?  AND (CASE C_Order.DocAction WHEN '--' THEN 'CL' ELSE TO_CHAR(C_Order.DocAction) END) = list2.value) left join (select C_Order_ID, DocumentNo, DateOrdered, GrandTotal from C_Order) table12 on (C_Order.Quotation_ID = table12.C_Order_ID) left join (select Obpos_Applications_ID, Name from OBPOS_APPLICATIONS) table13 on (C_Order.EM_Obpos_Applications_ID =  table13.Obpos_Applications_ID) left join (select C_Project_ID, Value, Name from C_Project) table14 on (C_Order.C_Project_ID = table14.C_Project_ID)" +
      "        WHERE 2=2 " +
      " AND C_Order.IsSOTrx='Y'" +
      "        AND 1=1 " +
      "        AND C_Order.C_Order_ID = ? " +
      "        AND C_Order.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND C_Order.AD_Org_ID IN (";
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
        objectHeaderData.cReturnReasonId = UtilSql.getValue(result, "c_return_reason_id");
        objectHeaderData.dateordered = UtilSql.getDateValue(result, "dateordered", "dd-MM-yyyy");
        objectHeaderData.cBpartnerId = UtilSql.getValue(result, "c_bpartner_id");
        objectHeaderData.cBpartnerIdr = UtilSql.getValue(result, "c_bpartner_idr");
        objectHeaderData.rmPickfromshipment = UtilSql.getValue(result, "rm_pickfromshipment");
        objectHeaderData.cBpartnerLocationId = UtilSql.getValue(result, "c_bpartner_location_id");
        objectHeaderData.cBpartnerLocationIdr = UtilSql.getValue(result, "c_bpartner_location_idr");
        objectHeaderData.mPricelistId = UtilSql.getValue(result, "m_pricelist_id");
        objectHeaderData.mPricelistIdr = UtilSql.getValue(result, "m_pricelist_idr");
        objectHeaderData.rmReceivematerials = UtilSql.getValue(result, "rm_receivematerials");
        objectHeaderData.datepromised = UtilSql.getDateValue(result, "datepromised", "dd-MM-yyyy");
        objectHeaderData.rmCreateinvoice = UtilSql.getValue(result, "rm_createinvoice");
        objectHeaderData.finPaymentmethodId = UtilSql.getValue(result, "fin_paymentmethod_id");
        objectHeaderData.finPaymentmethodIdr = UtilSql.getValue(result, "fin_paymentmethod_idr");
        objectHeaderData.cPaymenttermId = UtilSql.getValue(result, "c_paymentterm_id");
        objectHeaderData.cPaymenttermIdr = UtilSql.getValue(result, "c_paymentterm_idr");
        objectHeaderData.mWarehouseId = UtilSql.getValue(result, "m_warehouse_id");
        objectHeaderData.mWarehouseIdr = UtilSql.getValue(result, "m_warehouse_idr");
        objectHeaderData.invoicerule = UtilSql.getValue(result, "invoicerule");
        objectHeaderData.invoiceruler = UtilSql.getValue(result, "invoiceruler");
        objectHeaderData.docstatus = UtilSql.getValue(result, "docstatus");
        objectHeaderData.grandtotal = UtilSql.getValue(result, "grandtotal");
        objectHeaderData.totallines = UtilSql.getValue(result, "totallines");
        objectHeaderData.cCurrencyId = UtilSql.getValue(result, "c_currency_id");
        objectHeaderData.adUserId = UtilSql.getValue(result, "ad_user_id");
        objectHeaderData.cDoctypeId = UtilSql.getValue(result, "c_doctype_id");
        objectHeaderData.soResStatus = UtilSql.getValue(result, "so_res_status");
        objectHeaderData.poreference = UtilSql.getValue(result, "poreference");
        objectHeaderData.salesrepId = UtilSql.getValue(result, "salesrep_id");
        objectHeaderData.salesrepIdr = UtilSql.getValue(result, "salesrep_idr");
        objectHeaderData.description = UtilSql.getValue(result, "description");
        objectHeaderData.billtoId = UtilSql.getValue(result, "billto_id");
        objectHeaderData.billtoIdr = UtilSql.getValue(result, "billto_idr");
        objectHeaderData.deliveryLocationId = UtilSql.getValue(result, "delivery_location_id");
        objectHeaderData.deliveryLocationIdr = UtilSql.getValue(result, "delivery_location_idr");
        objectHeaderData.docaction = UtilSql.getValue(result, "docaction");
        objectHeaderData.docactionBtn = UtilSql.getValue(result, "docaction_btn");
        objectHeaderData.copyfrom = UtilSql.getValue(result, "copyfrom");
        objectHeaderData.copyfrompo = UtilSql.getValue(result, "copyfrompo");
        objectHeaderData.deliveryviarule = UtilSql.getValue(result, "deliveryviarule");
        objectHeaderData.mShipperId = UtilSql.getValue(result, "m_shipper_id");
        objectHeaderData.deliveryrule = UtilSql.getValue(result, "deliveryrule");
        objectHeaderData.freightcostrule = UtilSql.getValue(result, "freightcostrule");
        objectHeaderData.freightamt = UtilSql.getValue(result, "freightamt");
        objectHeaderData.isdiscountprinted = UtilSql.getValue(result, "isdiscountprinted");
        objectHeaderData.priorityrule = UtilSql.getValue(result, "priorityrule");
        objectHeaderData.cCampaignId = UtilSql.getValue(result, "c_campaign_id");
        objectHeaderData.chargeamt = UtilSql.getValue(result, "chargeamt");
        objectHeaderData.cChargeId = UtilSql.getValue(result, "c_charge_id");
        objectHeaderData.cActivityId = UtilSql.getValue(result, "c_activity_id");
        objectHeaderData.adOrgtrxId = UtilSql.getValue(result, "ad_orgtrx_id");
        objectHeaderData.quotationId = UtilSql.getValue(result, "quotation_id");
        objectHeaderData.quotationIdr = UtilSql.getValue(result, "quotation_idr");
        objectHeaderData.emObposApplicationsId = UtilSql.getValue(result, "em_obpos_applications_id");
        objectHeaderData.emObposApplicationsIdr = UtilSql.getValue(result, "em_obpos_applications_idr");
        objectHeaderData.emObposSendemail = UtilSql.getValue(result, "em_obpos_sendemail");
        objectHeaderData.emObposEmailStatus = UtilSql.getValue(result, "em_obpos_email_status");
        objectHeaderData.calculatePromotions = UtilSql.getValue(result, "calculate_promotions");
        objectHeaderData.rmAddorphanline = UtilSql.getValue(result, "rm_addorphanline");
        objectHeaderData.convertquotation = UtilSql.getValue(result, "convertquotation");
        objectHeaderData.cRejectReasonId = UtilSql.getValue(result, "c_reject_reason_id");
        objectHeaderData.validuntil = UtilSql.getDateValue(result, "validuntil", "dd-MM-yyyy");
        objectHeaderData.emObdiscAddpack = UtilSql.getValue(result, "em_obdisc_addpack");
        objectHeaderData.cProjectId = UtilSql.getValue(result, "c_project_id");
        objectHeaderData.cProjectIdr = UtilSql.getValue(result, "c_project_idr");
        objectHeaderData.cCostcenterId = UtilSql.getValue(result, "c_costcenter_id");
        objectHeaderData.aAssetId = UtilSql.getValue(result, "a_asset_id");
        objectHeaderData.user1Id = UtilSql.getValue(result, "user1_id");
        objectHeaderData.user2Id = UtilSql.getValue(result, "user2_id");
        objectHeaderData.isinvoiced = UtilSql.getValue(result, "isinvoiced");
        objectHeaderData.isdelivered = UtilSql.getValue(result, "isdelivered");
        objectHeaderData.isactive = UtilSql.getValue(result, "isactive");
        objectHeaderData.adClientId = UtilSql.getValue(result, "ad_client_id");
        objectHeaderData.cOrderId = UtilSql.getValue(result, "c_order_id");
        objectHeaderData.processing = UtilSql.getValue(result, "processing");
        objectHeaderData.paymentrule = UtilSql.getValue(result, "paymentrule");
        objectHeaderData.dateprinted = UtilSql.getDateValue(result, "dateprinted", "dd-MM-yyyy");
        objectHeaderData.posted = UtilSql.getValue(result, "posted");
        objectHeaderData.istaxincluded = UtilSql.getValue(result, "istaxincluded");
        objectHeaderData.isselected = UtilSql.getValue(result, "isselected");
        objectHeaderData.dropshipUserId = UtilSql.getValue(result, "dropship_user_id");
        objectHeaderData.dropshipBpartnerId = UtilSql.getValue(result, "dropship_bpartner_id");
        objectHeaderData.incotermsdescription = UtilSql.getValue(result, "incotermsdescription");
        objectHeaderData.dropshipLocationId = UtilSql.getValue(result, "dropship_location_id");
        objectHeaderData.isselfservice = UtilSql.getValue(result, "isselfservice");
        objectHeaderData.generatetemplate = UtilSql.getValue(result, "generatetemplate");
        objectHeaderData.processed = UtilSql.getValue(result, "processed");
        objectHeaderData.deliverynotes = UtilSql.getValue(result, "deliverynotes");
        objectHeaderData.cIncotermsId = UtilSql.getValue(result, "c_incoterms_id");
        objectHeaderData.issotrx = UtilSql.getValue(result, "issotrx");
        objectHeaderData.dateacct = UtilSql.getDateValue(result, "dateacct", "dd-MM-yyyy");
        objectHeaderData.isprinted = UtilSql.getValue(result, "isprinted");
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
  public static HeaderData[] set(String emObposSendemail, String convertquotation, String validuntil, String aAssetId, String cOrderId, String adClientId, String adOrgId, String isactive, String createdby, String createdbyr, String updatedby, String updatedbyr, String documentno, String docstatus, String docaction, String docactionBtn, String cDoctypeId, String cDoctypetargetId, String description, String isdelivered, String isinvoiced, String isprinted, String dateordered, String datepromised, String dateacct, String salesrepId, String cPaymenttermId, String billtoId, String cCurrencyId, String invoicerule, String freightamt, String deliveryviarule, String mShipperId, String priorityrule, String totallines, String grandtotal, String mWarehouseId, String mPricelistId, String processing, String cCampaignId, String cBpartnerId, String cBpartnerIdr, String adUserId, String poreference, String cChargeId, String chargeamt, String processed, String cBpartnerLocationId, String cProjectId, String cProjectIdr, String cActivityId, String quotationId, String quotationIdr, String issotrx, String dateprinted, String deliveryrule, String freightcostrule, String paymentrule, String isdiscountprinted, String posted, String istaxincluded, String isselected, String emObposEmailStatus, String cCostcenterId, String deliverynotes, String cIncotermsId, String incotermsdescription, String generatetemplate, String deliveryLocationId, String copyfrompo, String finPaymentmethodId, String dropshipUserId, String dropshipBpartnerId, String copyfrom, String dropshipLocationId, String isselfservice, String adOrgtrxId, String emObposApplicationsId, String user2Id, String user1Id, String calculatePromotions, String emObdiscAddpack, String rmPickfromshipment, String rmReceivematerials, String rmCreateinvoice, String cReturnReasonId, String rmAddorphanline, String soResStatus, String cRejectReasonId)    throws ServletException {
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
    objectHeaderData[0].cDoctypetargetId = cDoctypetargetId;
    objectHeaderData[0].cDoctypetargetIdr = "";
    objectHeaderData[0].documentno = documentno;
    objectHeaderData[0].cReturnReasonId = cReturnReasonId;
    objectHeaderData[0].dateordered = dateordered;
    objectHeaderData[0].cBpartnerId = cBpartnerId;
    objectHeaderData[0].cBpartnerIdr = cBpartnerIdr;
    objectHeaderData[0].rmPickfromshipment = rmPickfromshipment;
    objectHeaderData[0].cBpartnerLocationId = cBpartnerLocationId;
    objectHeaderData[0].cBpartnerLocationIdr = "";
    objectHeaderData[0].mPricelistId = mPricelistId;
    objectHeaderData[0].mPricelistIdr = "";
    objectHeaderData[0].rmReceivematerials = rmReceivematerials;
    objectHeaderData[0].datepromised = datepromised;
    objectHeaderData[0].rmCreateinvoice = rmCreateinvoice;
    objectHeaderData[0].finPaymentmethodId = finPaymentmethodId;
    objectHeaderData[0].finPaymentmethodIdr = "";
    objectHeaderData[0].cPaymenttermId = cPaymenttermId;
    objectHeaderData[0].cPaymenttermIdr = "";
    objectHeaderData[0].mWarehouseId = mWarehouseId;
    objectHeaderData[0].mWarehouseIdr = "";
    objectHeaderData[0].invoicerule = invoicerule;
    objectHeaderData[0].invoiceruler = "";
    objectHeaderData[0].docstatus = docstatus;
    objectHeaderData[0].grandtotal = grandtotal;
    objectHeaderData[0].totallines = totallines;
    objectHeaderData[0].cCurrencyId = cCurrencyId;
    objectHeaderData[0].adUserId = adUserId;
    objectHeaderData[0].cDoctypeId = cDoctypeId;
    objectHeaderData[0].soResStatus = soResStatus;
    objectHeaderData[0].poreference = poreference;
    objectHeaderData[0].salesrepId = salesrepId;
    objectHeaderData[0].salesrepIdr = "";
    objectHeaderData[0].description = description;
    objectHeaderData[0].billtoId = billtoId;
    objectHeaderData[0].billtoIdr = "";
    objectHeaderData[0].deliveryLocationId = deliveryLocationId;
    objectHeaderData[0].deliveryLocationIdr = "";
    objectHeaderData[0].docaction = docaction;
    objectHeaderData[0].docactionBtn = docactionBtn;
    objectHeaderData[0].copyfrom = copyfrom;
    objectHeaderData[0].copyfrompo = copyfrompo;
    objectHeaderData[0].deliveryviarule = deliveryviarule;
    objectHeaderData[0].mShipperId = mShipperId;
    objectHeaderData[0].deliveryrule = deliveryrule;
    objectHeaderData[0].freightcostrule = freightcostrule;
    objectHeaderData[0].freightamt = freightamt;
    objectHeaderData[0].isdiscountprinted = isdiscountprinted;
    objectHeaderData[0].priorityrule = priorityrule;
    objectHeaderData[0].cCampaignId = cCampaignId;
    objectHeaderData[0].chargeamt = chargeamt;
    objectHeaderData[0].cChargeId = cChargeId;
    objectHeaderData[0].cActivityId = cActivityId;
    objectHeaderData[0].adOrgtrxId = adOrgtrxId;
    objectHeaderData[0].quotationId = quotationId;
    objectHeaderData[0].quotationIdr = quotationIdr;
    objectHeaderData[0].emObposApplicationsId = emObposApplicationsId;
    objectHeaderData[0].emObposApplicationsIdr = "";
    objectHeaderData[0].emObposSendemail = emObposSendemail;
    objectHeaderData[0].emObposEmailStatus = emObposEmailStatus;
    objectHeaderData[0].calculatePromotions = calculatePromotions;
    objectHeaderData[0].rmAddorphanline = rmAddorphanline;
    objectHeaderData[0].convertquotation = convertquotation;
    objectHeaderData[0].cRejectReasonId = cRejectReasonId;
    objectHeaderData[0].validuntil = validuntil;
    objectHeaderData[0].emObdiscAddpack = emObdiscAddpack;
    objectHeaderData[0].cProjectId = cProjectId;
    objectHeaderData[0].cProjectIdr = cProjectIdr;
    objectHeaderData[0].cCostcenterId = cCostcenterId;
    objectHeaderData[0].aAssetId = aAssetId;
    objectHeaderData[0].user1Id = user1Id;
    objectHeaderData[0].user2Id = user2Id;
    objectHeaderData[0].isinvoiced = isinvoiced;
    objectHeaderData[0].isdelivered = isdelivered;
    objectHeaderData[0].isactive = isactive;
    objectHeaderData[0].adClientId = adClientId;
    objectHeaderData[0].cOrderId = cOrderId;
    objectHeaderData[0].processing = processing;
    objectHeaderData[0].paymentrule = paymentrule;
    objectHeaderData[0].dateprinted = dateprinted;
    objectHeaderData[0].posted = posted;
    objectHeaderData[0].istaxincluded = istaxincluded;
    objectHeaderData[0].isselected = isselected;
    objectHeaderData[0].dropshipUserId = dropshipUserId;
    objectHeaderData[0].dropshipBpartnerId = dropshipBpartnerId;
    objectHeaderData[0].incotermsdescription = incotermsdescription;
    objectHeaderData[0].dropshipLocationId = dropshipLocationId;
    objectHeaderData[0].isselfservice = isselfservice;
    objectHeaderData[0].generatetemplate = generatetemplate;
    objectHeaderData[0].processed = processed;
    objectHeaderData[0].deliverynotes = deliverynotes;
    objectHeaderData[0].cIncotermsId = cIncotermsId;
    objectHeaderData[0].issotrx = issotrx;
    objectHeaderData[0].dateacct = dateacct;
    objectHeaderData[0].isprinted = isprinted;
    objectHeaderData[0].language = "";
    return objectHeaderData;
  }

/**
Select for auxiliar field
 */
  public static String selectAux6(ConnectionProvider connectionProvider, String C_ORDER_ID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT DOCSUBTYPESO FROM C_ORDER, C_DOCTYPE WHERE C_DOCTYPE.C_DOCTYPE_ID = C_ORDER.C_DOCTYPETARGET_ID AND C_ORDER.C_ORDER_ID=? ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_ORDER_ID);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "docsubtypeso");
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
  public static String selectAux09BF7886BE7846C3B870F354B8301159(ConnectionProvider connectionProvider, String c_doctypetarget_id)    throws ServletException {
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
  public static String selectAuxD0DC4F3EC11B4F6D9457EF08B5AF54C5(ConnectionProvider connectionProvider, String AD_Client_ID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        select case when count(*) = 0 then 'N' else 'Y' end from m_offer where isactive='Y' and ad_client_id = ? ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, AD_Client_ID);

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
  public static String selectDef2166_0(ConnectionProvider connectionProvider, String CreatedByR)    throws ServletException {
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
  public static String selectDef2168_1(ConnectionProvider connectionProvider, String UpdatedByR)    throws ServletException {
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
  public static String selectDef2762_2(ConnectionProvider connectionProvider, String C_BPartner_IDR)    throws ServletException {
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
  public static String selectDef3402_3(ConnectionProvider connectionProvider, String C_Project_IDR)    throws ServletException {
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
  public static String selectDef367DCAA9CF4442ADB9A76F6539102217_4(ConnectionProvider connectionProvider, String Quotation_IDR)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.DocumentNo), ''))), '')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(table2.DateOrdered, 'DD-MM-YYYY')), '')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.GrandTotal), ''))), '') ) as Quotation_ID FROM C_Order left join (select C_Order_ID, DocumentNo, DateOrdered, GrandTotal from C_Order) table2 on (C_Order.C_Order_ID = table2.C_Order_ID) WHERE C_Order.isActive='Y' AND C_Order.C_Order_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, Quotation_IDR);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "quotation_id");
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

  public static int updateDocAction(ConnectionProvider connectionProvider, String docaction, String cOrderId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        UPDATE C_Order" +
      "        SET docaction = ? " +
      "        WHERE C_Order.C_Order_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, docaction);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cOrderId);

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

  public int update(Connection conn, ConnectionProvider connectionProvider)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        UPDATE C_Order" +
      "        SET AD_Org_ID = (?) , C_DocTypeTarget_ID = (?) , DocumentNo = (?) , C_Return_Reason_ID = (?) , DateOrdered = TO_DATE(?) , C_BPartner_ID = (?) , RM_PickFromShipment = (?) , C_BPartner_Location_ID = (?) , M_PriceList_ID = (?) , RM_ReceiveMaterials = (?) , DatePromised = TO_DATE(?) , RM_CreateInvoice = (?) , FIN_Paymentmethod_ID = (?) , C_PaymentTerm_ID = (?) , M_Warehouse_ID = (?) , InvoiceRule = (?) , DocStatus = (?) , GrandTotal = TO_NUMBER(?) , TotalLines = TO_NUMBER(?) , C_Currency_ID = (?) , AD_User_ID = (?) , C_DocType_ID = (?) , SO_Res_Status = (?) , POReference = (?) , SalesRep_ID = (?) , Description = (?) , BillTo_ID = (?) , Delivery_Location_ID = (?) , DocAction = (?) , CopyFrom = (?) , CopyFromPO = (?) , DeliveryViaRule = (?) , M_Shipper_ID = (?) , DeliveryRule = (?) , FreightCostRule = (?) , FreightAmt = TO_NUMBER(?) , IsDiscountPrinted = (?) , PriorityRule = (?) , C_Campaign_ID = (?) , ChargeAmt = TO_NUMBER(?) , C_Charge_ID = (?) , C_Activity_ID = (?) , AD_OrgTrx_ID = (?) , Quotation_ID = (?) , EM_Obpos_Applications_ID = (?) , EM_Obpos_Sendemail = (?) , EM_Obpos_Email_Status = (?) , Calculate_Promotions = (?) , RM_AddOrphanLine = (?) , Convertquotation = (?) , C_Reject_Reason_ID = (?) , validuntil = TO_DATE(?) , EM_Obdisc_Addpack = (?) , C_Project_ID = (?) , C_Costcenter_ID = (?) , A_Asset_ID = (?) , User1_ID = (?) , User2_ID = (?) , IsInvoiced = (?) , IsDelivered = (?) , IsActive = (?) , AD_Client_ID = (?) , C_Order_ID = (?) , Processing = (?) , PaymentRule = (?) , DatePrinted = TO_DATE(?) , Posted = (?) , IsTaxIncluded = (?) , IsSelected = (?) , DropShip_User_ID = (?) , DropShip_BPartner_ID = (?) , Incotermsdescription = (?) , DropShip_Location_ID = (?) , IsSelfService = (?) , Generatetemplate = (?) , Processed = (?) , Deliverynotes = (?) , C_Incoterms_ID = (?) , IsSOTrx = (?) , DateAcct = TO_DATE(?) , IsPrinted = (?) , updated = now(), updatedby = ? " +
      "        WHERE C_Order.C_Order_ID = ? " +
      "        AND C_Order.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND C_Order.AD_Org_ID IN (";
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
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cReturnReasonId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateordered);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, rmPickfromshipment);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerLocationId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mPricelistId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, rmReceivematerials);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, datepromised);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, rmCreateinvoice);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, finPaymentmethodId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cPaymenttermId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mWarehouseId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, invoicerule);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, docstatus);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, grandtotal);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, totallines);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCurrencyId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cDoctypeId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, soResStatus);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, poreference);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, salesrepId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, billtoId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, deliveryLocationId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, docaction);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, copyfrom);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, copyfrompo);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, deliveryviarule);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mShipperId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, deliveryrule);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, freightcostrule);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, freightamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isdiscountprinted);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, priorityrule);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCampaignId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, chargeamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cChargeId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cActivityId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgtrxId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, quotationId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emObposApplicationsId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emObposSendemail);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emObposEmailStatus);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, calculatePromotions);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, rmAddorphanline);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, convertquotation);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cRejectReasonId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, validuntil);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emObdiscAddpack);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cProjectId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCostcenterId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, aAssetId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, user1Id);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, user2Id);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isinvoiced);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isdelivered);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cOrderId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processing);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paymentrule);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateprinted);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, posted);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, istaxincluded);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isselected);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dropshipUserId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dropshipBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, incotermsdescription);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dropshipLocationId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isselfservice);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, generatetemplate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processed);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, deliverynotes);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cIncotermsId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, issotrx);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateacct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isprinted);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cOrderId);
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
      "        INSERT INTO C_Order " +
      "        (AD_Org_ID, C_DocTypeTarget_ID, DocumentNo, C_Return_Reason_ID, DateOrdered, C_BPartner_ID, RM_PickFromShipment, C_BPartner_Location_ID, M_PriceList_ID, RM_ReceiveMaterials, DatePromised, RM_CreateInvoice, FIN_Paymentmethod_ID, C_PaymentTerm_ID, M_Warehouse_ID, InvoiceRule, DocStatus, GrandTotal, TotalLines, C_Currency_ID, AD_User_ID, C_DocType_ID, SO_Res_Status, POReference, SalesRep_ID, Description, BillTo_ID, Delivery_Location_ID, DocAction, CopyFrom, CopyFromPO, DeliveryViaRule, M_Shipper_ID, DeliveryRule, FreightCostRule, FreightAmt, IsDiscountPrinted, PriorityRule, C_Campaign_ID, ChargeAmt, C_Charge_ID, C_Activity_ID, AD_OrgTrx_ID, Quotation_ID, EM_Obpos_Applications_ID, EM_Obpos_Sendemail, EM_Obpos_Email_Status, Calculate_Promotions, RM_AddOrphanLine, Convertquotation, C_Reject_Reason_ID, validuntil, EM_Obdisc_Addpack, C_Project_ID, C_Costcenter_ID, A_Asset_ID, User1_ID, User2_ID, IsInvoiced, IsDelivered, IsActive, AD_Client_ID, C_Order_ID, Processing, PaymentRule, DatePrinted, Posted, IsTaxIncluded, IsSelected, DropShip_User_ID, DropShip_BPartner_ID, Incotermsdescription, DropShip_Location_ID, IsSelfService, Generatetemplate, Processed, Deliverynotes, C_Incoterms_ID, IsSOTrx, DateAcct, IsPrinted, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), (?), (?), TO_DATE(?), (?), (?), (?), (?), (?), TO_DATE(?), (?), (?), (?), (?), (?), (?), TO_NUMBER(?), TO_NUMBER(?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), TO_NUMBER(?), (?), (?), (?), TO_NUMBER(?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), TO_DATE(?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), TO_DATE(?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), TO_DATE(?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cDoctypetargetId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, documentno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cReturnReasonId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateordered);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, rmPickfromshipment);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerLocationId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mPricelistId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, rmReceivematerials);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, datepromised);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, rmCreateinvoice);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, finPaymentmethodId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cPaymenttermId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mWarehouseId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, invoicerule);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, docstatus);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, grandtotal);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, totallines);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCurrencyId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cDoctypeId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, soResStatus);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, poreference);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, salesrepId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, billtoId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, deliveryLocationId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, docaction);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, copyfrom);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, copyfrompo);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, deliveryviarule);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mShipperId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, deliveryrule);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, freightcostrule);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, freightamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isdiscountprinted);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, priorityrule);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCampaignId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, chargeamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cChargeId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cActivityId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgtrxId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, quotationId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emObposApplicationsId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emObposSendemail);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emObposEmailStatus);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, calculatePromotions);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, rmAddorphanline);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, convertquotation);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cRejectReasonId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, validuntil);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emObdiscAddpack);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cProjectId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCostcenterId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, aAssetId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, user1Id);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, user2Id);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isinvoiced);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isdelivered);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cOrderId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processing);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paymentrule);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateprinted);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, posted);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, istaxincluded);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isselected);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dropshipUserId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dropshipBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, incotermsdescription);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dropshipLocationId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isselfservice);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, generatetemplate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processed);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, deliverynotes);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cIncotermsId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, issotrx);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateacct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isprinted);
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
      "        DELETE FROM C_Order" +
      "        WHERE C_Order.C_Order_ID = ? " +
      "        AND C_Order.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND C_Order.AD_Org_ID IN (";
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
      "          FROM C_Order" +
      "         WHERE C_Order.C_Order_ID = ? ";

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
      "          FROM C_Order" +
      "         WHERE C_Order.C_Order_ID = ? ";

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
