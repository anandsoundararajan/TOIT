//Sqlc generated V1.O00-1
package org.openbravo.erpWindows.SalesInvoice;

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
class LinesData implements FieldProvider {
static Logger log4j = Logger.getLogger(LinesData.class);
  private String InitRecordNumber="0";
  public String created;
  public String createdbyr;
  public String updated;
  public String updatedTimeStamp;
  public String updatedby;
  public String updatedbyr;
  public String line;
  public String mProductId;
  public String mProductIdr;
  public String qtyinvoiced;
  public String cUomId;
  public String cUomIdr;
  public String priceactual;
  public String grossUnitPrice;
  public String linenetamt;
  public String lineGrossAmount;
  public String cTaxId;
  public String cTaxIdr;
  public String pricelist;
  public String grosspricelist;
  public String financialInvoiceLine;
  public String accountId;
  public String accountIdr;
  public String mAttributesetinstanceId;
  public String mAttributesetinstanceIdr;
  public String description;
  public String cOrderlineId;
  public String cOrderlineIdr;
  public String mInoutlineId;
  public String mInoutlineIdr;
  public String iseditlinenetamt;
  public String taxbaseamt;
  public String excludeforwithholding;
  public String mProductUomId;
  public String isdeferred;
  public String quantityorder;
  public String grosspricestd;
  public String pricestd;
  public String defplantype;
  public String defplantyper;
  public String periodnumber;
  public String cPeriodId;
  public String cPeriodIdr;
  public String adOrgId;
  public String adOrgIdr;
  public String cProjectId;
  public String cProjectIdr;
  public String cCostcenterId;
  public String aAssetId;
  public String user1Id;
  public String user2Id;
  public String explode;
  public String bomParentId;
  public String cProjectlineId;
  public String cInvoiceDiscountId;
  public String adClientId;
  public String isdescription;
  public String cBpartnerId;
  public String cBpartnerIdr;
  public String taxamt;
  public String pricelimit;
  public String sResourceassignmentId;
  public String isactive;
  public String chargeamt;
  public String cInvoiceId;
  public String cInvoicelineId;
  public String cChargeId;
  public String mOfferId;
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
    else if (fieldName.equalsIgnoreCase("m_product_id") || fieldName.equals("mProductId"))
      return mProductId;
    else if (fieldName.equalsIgnoreCase("m_product_idr") || fieldName.equals("mProductIdr"))
      return mProductIdr;
    else if (fieldName.equalsIgnoreCase("qtyinvoiced"))
      return qtyinvoiced;
    else if (fieldName.equalsIgnoreCase("c_uom_id") || fieldName.equals("cUomId"))
      return cUomId;
    else if (fieldName.equalsIgnoreCase("c_uom_idr") || fieldName.equals("cUomIdr"))
      return cUomIdr;
    else if (fieldName.equalsIgnoreCase("priceactual"))
      return priceactual;
    else if (fieldName.equalsIgnoreCase("gross_unit_price") || fieldName.equals("grossUnitPrice"))
      return grossUnitPrice;
    else if (fieldName.equalsIgnoreCase("linenetamt"))
      return linenetamt;
    else if (fieldName.equalsIgnoreCase("line_gross_amount") || fieldName.equals("lineGrossAmount"))
      return lineGrossAmount;
    else if (fieldName.equalsIgnoreCase("c_tax_id") || fieldName.equals("cTaxId"))
      return cTaxId;
    else if (fieldName.equalsIgnoreCase("c_tax_idr") || fieldName.equals("cTaxIdr"))
      return cTaxIdr;
    else if (fieldName.equalsIgnoreCase("pricelist"))
      return pricelist;
    else if (fieldName.equalsIgnoreCase("grosspricelist"))
      return grosspricelist;
    else if (fieldName.equalsIgnoreCase("financial_invoice_line") || fieldName.equals("financialInvoiceLine"))
      return financialInvoiceLine;
    else if (fieldName.equalsIgnoreCase("account_id") || fieldName.equals("accountId"))
      return accountId;
    else if (fieldName.equalsIgnoreCase("account_idr") || fieldName.equals("accountIdr"))
      return accountIdr;
    else if (fieldName.equalsIgnoreCase("m_attributesetinstance_id") || fieldName.equals("mAttributesetinstanceId"))
      return mAttributesetinstanceId;
    else if (fieldName.equalsIgnoreCase("m_attributesetinstance_idr") || fieldName.equals("mAttributesetinstanceIdr"))
      return mAttributesetinstanceIdr;
    else if (fieldName.equalsIgnoreCase("description"))
      return description;
    else if (fieldName.equalsIgnoreCase("c_orderline_id") || fieldName.equals("cOrderlineId"))
      return cOrderlineId;
    else if (fieldName.equalsIgnoreCase("c_orderline_idr") || fieldName.equals("cOrderlineIdr"))
      return cOrderlineIdr;
    else if (fieldName.equalsIgnoreCase("m_inoutline_id") || fieldName.equals("mInoutlineId"))
      return mInoutlineId;
    else if (fieldName.equalsIgnoreCase("m_inoutline_idr") || fieldName.equals("mInoutlineIdr"))
      return mInoutlineIdr;
    else if (fieldName.equalsIgnoreCase("iseditlinenetamt"))
      return iseditlinenetamt;
    else if (fieldName.equalsIgnoreCase("taxbaseamt"))
      return taxbaseamt;
    else if (fieldName.equalsIgnoreCase("excludeforwithholding"))
      return excludeforwithholding;
    else if (fieldName.equalsIgnoreCase("m_product_uom_id") || fieldName.equals("mProductUomId"))
      return mProductUomId;
    else if (fieldName.equalsIgnoreCase("isdeferred"))
      return isdeferred;
    else if (fieldName.equalsIgnoreCase("quantityorder"))
      return quantityorder;
    else if (fieldName.equalsIgnoreCase("grosspricestd"))
      return grosspricestd;
    else if (fieldName.equalsIgnoreCase("pricestd"))
      return pricestd;
    else if (fieldName.equalsIgnoreCase("defplantype"))
      return defplantype;
    else if (fieldName.equalsIgnoreCase("defplantyper"))
      return defplantyper;
    else if (fieldName.equalsIgnoreCase("periodnumber"))
      return periodnumber;
    else if (fieldName.equalsIgnoreCase("c_period_id") || fieldName.equals("cPeriodId"))
      return cPeriodId;
    else if (fieldName.equalsIgnoreCase("c_period_idr") || fieldName.equals("cPeriodIdr"))
      return cPeriodIdr;
    else if (fieldName.equalsIgnoreCase("ad_org_id") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("ad_org_idr") || fieldName.equals("adOrgIdr"))
      return adOrgIdr;
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
    else if (fieldName.equalsIgnoreCase("explode"))
      return explode;
    else if (fieldName.equalsIgnoreCase("bom_parent_id") || fieldName.equals("bomParentId"))
      return bomParentId;
    else if (fieldName.equalsIgnoreCase("c_projectline_id") || fieldName.equals("cProjectlineId"))
      return cProjectlineId;
    else if (fieldName.equalsIgnoreCase("c_invoice_discount_id") || fieldName.equals("cInvoiceDiscountId"))
      return cInvoiceDiscountId;
    else if (fieldName.equalsIgnoreCase("ad_client_id") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("isdescription"))
      return isdescription;
    else if (fieldName.equalsIgnoreCase("c_bpartner_id") || fieldName.equals("cBpartnerId"))
      return cBpartnerId;
    else if (fieldName.equalsIgnoreCase("c_bpartner_idr") || fieldName.equals("cBpartnerIdr"))
      return cBpartnerIdr;
    else if (fieldName.equalsIgnoreCase("taxamt"))
      return taxamt;
    else if (fieldName.equalsIgnoreCase("pricelimit"))
      return pricelimit;
    else if (fieldName.equalsIgnoreCase("s_resourceassignment_id") || fieldName.equals("sResourceassignmentId"))
      return sResourceassignmentId;
    else if (fieldName.equalsIgnoreCase("isactive"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("chargeamt"))
      return chargeamt;
    else if (fieldName.equalsIgnoreCase("c_invoice_id") || fieldName.equals("cInvoiceId"))
      return cInvoiceId;
    else if (fieldName.equalsIgnoreCase("c_invoiceline_id") || fieldName.equals("cInvoicelineId"))
      return cInvoicelineId;
    else if (fieldName.equalsIgnoreCase("c_charge_id") || fieldName.equals("cChargeId"))
      return cChargeId;
    else if (fieldName.equalsIgnoreCase("m_offer_id") || fieldName.equals("mOfferId"))
      return mOfferId;
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
  public static LinesData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String cInvoiceId, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, cInvoiceId, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static LinesData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String cInvoiceId, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(C_InvoiceLine.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = C_InvoiceLine.CreatedBy) as CreatedByR, " +
      "        to_char(C_InvoiceLine.Updated, ?) as updated, " +
      "        to_char(C_InvoiceLine.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        C_InvoiceLine.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = C_InvoiceLine.UpdatedBy) as UpdatedByR," +
      "        C_InvoiceLine.Line, " +
      "C_InvoiceLine.M_Product_ID, " +
      "(CASE WHEN C_InvoiceLine.M_Product_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL1.Name IS NULL THEN TO_CHAR(table1.Name) ELSE TO_CHAR(tableTRL1.Name) END)), ''))),'') ) END) AS M_Product_IDR, " +
      "C_InvoiceLine.QtyInvoiced, " +
      "C_InvoiceLine.C_UOM_ID, " +
      "(CASE WHEN C_InvoiceLine.C_UOM_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL2.Name IS NULL THEN TO_CHAR(table2.Name) ELSE TO_CHAR(tableTRL2.Name) END)), ''))),'') ) END) AS C_UOM_IDR, " +
      "C_InvoiceLine.PriceActual, " +
      "C_InvoiceLine.Gross_Unit_Price, " +
      "C_InvoiceLine.LineNetAmt, " +
      "C_InvoiceLine.Line_Gross_Amount, " +
      "C_InvoiceLine.C_Tax_ID, " +
      "(CASE WHEN C_InvoiceLine.C_Tax_ID IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL3.Name IS NULL THEN TO_CHAR(table3.Name) ELSE TO_CHAR(tableTRL3.Name) END)), ''))),'') ) END) AS C_Tax_IDR, " +
      "C_InvoiceLine.PriceList, " +
      "C_InvoiceLine.Grosspricelist, " +
      "COALESCE(C_InvoiceLine.Financial_Invoice_Line, 'N') AS Financial_Invoice_Line, " +
      "C_InvoiceLine.Account_ID, " +
      "(CASE WHEN C_InvoiceLine.Account_ID IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table4.Name), ''))),'') ) END) AS Account_IDR, " +
      "C_InvoiceLine.M_AttributeSetInstance_ID, " +
      "(CASE WHEN C_InvoiceLine.M_AttributeSetInstance_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table5.Description), ''))),'') ) END) AS M_AttributeSetInstance_IDR, " +
      "C_InvoiceLine.Description, " +
      "C_InvoiceLine.C_OrderLine_ID, " +
      "(CASE WHEN C_InvoiceLine.C_OrderLine_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table7.DocumentNo), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(table7.DateOrdered, 'DD-MM-YYYY')),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table7.GrandTotal), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table6.Line), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table6.LineNetAmt), ''))),'') ) END) AS C_OrderLine_IDR, " +
      "C_InvoiceLine.M_InOutLine_ID, " +
      "(CASE WHEN C_InvoiceLine.M_InOutLine_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table8.Line), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table8.MovementQty), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table9.DocumentNo), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(table9.MovementDate, 'DD-MM-YYYY')),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL10.Name IS NULL THEN TO_CHAR(table10.Name) ELSE TO_CHAR(tableTRL10.Name) END)), ''))),'') ) END) AS M_InOutLine_IDR, " +
      "COALESCE(C_InvoiceLine.Iseditlinenetamt, 'N') AS Iseditlinenetamt, " +
      "C_InvoiceLine.Taxbaseamt, " +
      "COALESCE(C_InvoiceLine.Excludeforwithholding, 'N') AS Excludeforwithholding, " +
      "C_InvoiceLine.M_Product_Uom_Id, " +
      "COALESCE(C_InvoiceLine.IsDeferred, 'N') AS IsDeferred, " +
      "C_InvoiceLine.QuantityOrder, " +
      "C_InvoiceLine.grosspricestd, " +
      "C_InvoiceLine.PriceStd, " +
      "C_InvoiceLine.DefPlanType, " +
      "(CASE WHEN C_InvoiceLine.DefPlanType IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list1.name),'') ) END) AS DefPlanTypeR, " +
      "C_InvoiceLine.Periodnumber, " +
      "C_InvoiceLine.C_Period_ID, " +
      "(CASE WHEN C_InvoiceLine.C_Period_ID IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table11.Name), ''))),'') ) END) AS C_Period_IDR, " +
      "C_InvoiceLine.AD_Org_ID, " +
      "(CASE WHEN C_InvoiceLine.AD_Org_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table12.Name), ''))),'') ) END) AS AD_Org_IDR, " +
      "C_InvoiceLine.C_Project_ID, " +
      "(CASE WHEN C_InvoiceLine.C_Project_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table13.Value), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table13.Name), ''))),'') ) END) AS C_Project_IDR, " +
      "C_InvoiceLine.C_Costcenter_ID, " +
      "C_InvoiceLine.A_Asset_ID, " +
      "C_InvoiceLine.User1_ID, " +
      "C_InvoiceLine.User2_ID, " +
      "C_InvoiceLine.Explode, " +
      "C_InvoiceLine.BOM_Parent_ID, " +
      "C_InvoiceLine.C_Projectline_ID, " +
      "C_InvoiceLine.C_Invoice_Discount_ID, " +
      "C_InvoiceLine.AD_Client_ID, " +
      "COALESCE(C_InvoiceLine.IsDescription, 'N') AS IsDescription, " +
      "C_InvoiceLine.C_Bpartner_ID, " +
      "(CASE WHEN C_InvoiceLine.C_Bpartner_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table14.Name), ''))),'') ) END) AS C_Bpartner_IDR, " +
      "C_InvoiceLine.TaxAmt, " +
      "C_InvoiceLine.PriceLimit, " +
      "C_InvoiceLine.S_ResourceAssignment_ID, " +
      "COALESCE(C_InvoiceLine.IsActive, 'N') AS IsActive, " +
      "C_InvoiceLine.ChargeAmt, " +
      "C_InvoiceLine.C_Invoice_ID, " +
      "C_InvoiceLine.C_InvoiceLine_ID, " +
      "C_InvoiceLine.C_Charge_ID, " +
      "C_InvoiceLine.M_Offer_ID, " +
      "        ? AS LANGUAGE " +
      "        FROM C_InvoiceLine left join (select M_Product_ID, Name from M_Product) table1 on (C_InvoiceLine.M_Product_ID = table1.M_Product_ID) left join (select M_Product_ID,AD_Language, Name from M_Product_TRL) tableTRL1 on (table1.M_Product_ID = tableTRL1.M_Product_ID and tableTRL1.AD_Language = ?)  left join (select C_UOM_ID, Name from C_UOM) table2 on (C_InvoiceLine.C_UOM_ID = table2.C_UOM_ID) left join (select C_UOM_ID,AD_Language, Name from C_UOM_TRL) tableTRL2 on (table2.C_UOM_ID = tableTRL2.C_UOM_ID and tableTRL2.AD_Language = ?)  left join (select C_Tax_ID, Name from C_Tax) table3 on (C_InvoiceLine.C_Tax_ID =  table3.C_Tax_ID) left join (select C_Tax_ID,AD_Language, Name from C_Tax_TRL) tableTRL3 on (table3.C_Tax_ID = tableTRL3.C_Tax_ID and tableTRL3.AD_Language = ?)  left join (select C_Glitem_ID, Name from C_Glitem) table4 on (C_InvoiceLine.Account_ID =  table4.C_Glitem_ID) left join (select M_AttributeSetInstance_ID, Description from M_AttributeSetInstance) table5 on (C_InvoiceLine.M_AttributeSetInstance_ID = table5.M_AttributeSetInstance_ID) left join (select C_OrderLine_ID, C_Order_ID, Line, LineNetAmt from C_OrderLine) table6 on (C_InvoiceLine.C_OrderLine_ID = table6.C_OrderLine_ID) left join (select C_Order_ID, DocumentNo, DateOrdered, GrandTotal from C_Order) table7 on (table6.C_Order_ID = table7.C_Order_ID) left join (select M_InOutLine_ID, Line, MovementQty, M_InOut_ID, M_Product_ID from M_InOutLine) table8 on (C_InvoiceLine.M_InOutLine_ID = table8.M_InOutLine_ID) left join (select M_InOut_ID, DocumentNo, MovementDate from M_InOut) table9 on (table8.M_InOut_ID = table9.M_InOut_ID) left join (select M_Product_ID, Name from M_Product) table10 on (table8.M_Product_ID = table10.M_Product_ID) left join (select M_Product_ID,AD_Language, Name from M_Product_TRL) tableTRL10 on (table10.M_Product_ID = tableTRL10.M_Product_ID and tableTRL10.AD_Language = ?)  left join ad_ref_list_v list1 on (C_InvoiceLine.DefPlanType = list1.value and list1.ad_reference_id = '73625A8F22EF4CD7808603156BA606D7' and list1.ad_language = ?)  left join (select C_Period_ID, Name from C_Period) table11 on (C_InvoiceLine.C_Period_ID =  table11.C_Period_ID) left join (select AD_Org_ID, Name from AD_Org) table12 on (C_InvoiceLine.AD_Org_ID = table12.AD_Org_ID) left join (select C_Project_ID, Value, Name from C_Project) table13 on (C_InvoiceLine.C_Project_ID = table13.C_Project_ID) left join (select C_BPartner_ID, Name from C_BPartner) table14 on (C_InvoiceLine.C_Bpartner_ID = table14.C_BPartner_ID)" +
      "        WHERE 2=2 " +
      "        AND 1=1 ";
    strSql = strSql + ((cInvoiceId==null || cInvoiceId.equals(""))?"":"  AND C_InvoiceLine.C_Invoice_ID = ?  ");
    strSql = strSql + 
      "        AND C_InvoiceLine.C_InvoiceLine_ID = ? " +
      "        AND C_InvoiceLine.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND C_InvoiceLine.AD_Org_ID IN (";
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
      if (cInvoiceId != null && !(cInvoiceId.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, cInvoiceId);
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
        LinesData objectLinesData = new LinesData();
        objectLinesData.created = UtilSql.getValue(result, "created");
        objectLinesData.createdbyr = UtilSql.getValue(result, "createdbyr");
        objectLinesData.updated = UtilSql.getValue(result, "updated");
        objectLinesData.updatedTimeStamp = UtilSql.getValue(result, "updated_time_stamp");
        objectLinesData.updatedby = UtilSql.getValue(result, "updatedby");
        objectLinesData.updatedbyr = UtilSql.getValue(result, "updatedbyr");
        objectLinesData.line = UtilSql.getValue(result, "line");
        objectLinesData.mProductId = UtilSql.getValue(result, "m_product_id");
        objectLinesData.mProductIdr = UtilSql.getValue(result, "m_product_idr");
        objectLinesData.qtyinvoiced = UtilSql.getValue(result, "qtyinvoiced");
        objectLinesData.cUomId = UtilSql.getValue(result, "c_uom_id");
        objectLinesData.cUomIdr = UtilSql.getValue(result, "c_uom_idr");
        objectLinesData.priceactual = UtilSql.getValue(result, "priceactual");
        objectLinesData.grossUnitPrice = UtilSql.getValue(result, "gross_unit_price");
        objectLinesData.linenetamt = UtilSql.getValue(result, "linenetamt");
        objectLinesData.lineGrossAmount = UtilSql.getValue(result, "line_gross_amount");
        objectLinesData.cTaxId = UtilSql.getValue(result, "c_tax_id");
        objectLinesData.cTaxIdr = UtilSql.getValue(result, "c_tax_idr");
        objectLinesData.pricelist = UtilSql.getValue(result, "pricelist");
        objectLinesData.grosspricelist = UtilSql.getValue(result, "grosspricelist");
        objectLinesData.financialInvoiceLine = UtilSql.getValue(result, "financial_invoice_line");
        objectLinesData.accountId = UtilSql.getValue(result, "account_id");
        objectLinesData.accountIdr = UtilSql.getValue(result, "account_idr");
        objectLinesData.mAttributesetinstanceId = UtilSql.getValue(result, "m_attributesetinstance_id");
        objectLinesData.mAttributesetinstanceIdr = UtilSql.getValue(result, "m_attributesetinstance_idr");
        objectLinesData.description = UtilSql.getValue(result, "description");
        objectLinesData.cOrderlineId = UtilSql.getValue(result, "c_orderline_id");
        objectLinesData.cOrderlineIdr = UtilSql.getValue(result, "c_orderline_idr");
        objectLinesData.mInoutlineId = UtilSql.getValue(result, "m_inoutline_id");
        objectLinesData.mInoutlineIdr = UtilSql.getValue(result, "m_inoutline_idr");
        objectLinesData.iseditlinenetamt = UtilSql.getValue(result, "iseditlinenetamt");
        objectLinesData.taxbaseamt = UtilSql.getValue(result, "taxbaseamt");
        objectLinesData.excludeforwithholding = UtilSql.getValue(result, "excludeforwithholding");
        objectLinesData.mProductUomId = UtilSql.getValue(result, "m_product_uom_id");
        objectLinesData.isdeferred = UtilSql.getValue(result, "isdeferred");
        objectLinesData.quantityorder = UtilSql.getValue(result, "quantityorder");
        objectLinesData.grosspricestd = UtilSql.getValue(result, "grosspricestd");
        objectLinesData.pricestd = UtilSql.getValue(result, "pricestd");
        objectLinesData.defplantype = UtilSql.getValue(result, "defplantype");
        objectLinesData.defplantyper = UtilSql.getValue(result, "defplantyper");
        objectLinesData.periodnumber = UtilSql.getValue(result, "periodnumber");
        objectLinesData.cPeriodId = UtilSql.getValue(result, "c_period_id");
        objectLinesData.cPeriodIdr = UtilSql.getValue(result, "c_period_idr");
        objectLinesData.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectLinesData.adOrgIdr = UtilSql.getValue(result, "ad_org_idr");
        objectLinesData.cProjectId = UtilSql.getValue(result, "c_project_id");
        objectLinesData.cProjectIdr = UtilSql.getValue(result, "c_project_idr");
        objectLinesData.cCostcenterId = UtilSql.getValue(result, "c_costcenter_id");
        objectLinesData.aAssetId = UtilSql.getValue(result, "a_asset_id");
        objectLinesData.user1Id = UtilSql.getValue(result, "user1_id");
        objectLinesData.user2Id = UtilSql.getValue(result, "user2_id");
        objectLinesData.explode = UtilSql.getValue(result, "explode");
        objectLinesData.bomParentId = UtilSql.getValue(result, "bom_parent_id");
        objectLinesData.cProjectlineId = UtilSql.getValue(result, "c_projectline_id");
        objectLinesData.cInvoiceDiscountId = UtilSql.getValue(result, "c_invoice_discount_id");
        objectLinesData.adClientId = UtilSql.getValue(result, "ad_client_id");
        objectLinesData.isdescription = UtilSql.getValue(result, "isdescription");
        objectLinesData.cBpartnerId = UtilSql.getValue(result, "c_bpartner_id");
        objectLinesData.cBpartnerIdr = UtilSql.getValue(result, "c_bpartner_idr");
        objectLinesData.taxamt = UtilSql.getValue(result, "taxamt");
        objectLinesData.pricelimit = UtilSql.getValue(result, "pricelimit");
        objectLinesData.sResourceassignmentId = UtilSql.getValue(result, "s_resourceassignment_id");
        objectLinesData.isactive = UtilSql.getValue(result, "isactive");
        objectLinesData.chargeamt = UtilSql.getValue(result, "chargeamt");
        objectLinesData.cInvoiceId = UtilSql.getValue(result, "c_invoice_id");
        objectLinesData.cInvoicelineId = UtilSql.getValue(result, "c_invoiceline_id");
        objectLinesData.cChargeId = UtilSql.getValue(result, "c_charge_id");
        objectLinesData.mOfferId = UtilSql.getValue(result, "m_offer_id");
        objectLinesData.language = UtilSql.getValue(result, "language");
        objectLinesData.adUserClient = "";
        objectLinesData.adOrgClient = "";
        objectLinesData.createdby = "";
        objectLinesData.trBgcolor = "";
        objectLinesData.totalCount = "";
        objectLinesData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectLinesData);
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
    LinesData objectLinesData[] = new LinesData[vector.size()];
    vector.copyInto(objectLinesData);
    return(objectLinesData);
  }

/**
Create a registry
 */
  public static LinesData[] set(String cInvoiceId, String excludeforwithholding, String cBpartnerId, String cBpartnerIdr, String cPeriodId, String financialInvoiceLine, String defplantype, String cInvoicelineId, String adClientId, String adOrgId, String isactive, String created, String createdby, String createdbyr, String updatedby, String updatedbyr, String cOrderlineId, String cOrderlineIdr, String line, String description, String mProductId, String mProductIdr, String qtyinvoiced, String pricelist, String priceactual, String linenetamt, String cChargeId, String chargeamt, String cUomId, String cTaxId, String user1Id, String mInoutlineId, String mInoutlineIdr, String pricelimit, String grosspricelist, String periodnumber, String user2Id, String sResourceassignmentId, String grossUnitPrice, String iseditlinenetamt, String taxbaseamt, String quantityorder, String mProductUomId, String cInvoiceDiscountId, String cProjectlineId, String mOfferId, String pricestd, String taxamt, String mAttributesetinstanceId, String mAttributesetinstanceIdr, String aAssetId, String grosspricestd, String isdescription, String isdeferred, String lineGrossAmount, String explode, String bomParentId, String cProjectId, String cProjectIdr, String cCostcenterId, String accountId)    throws ServletException {
    LinesData objectLinesData[] = new LinesData[1];
    objectLinesData[0] = new LinesData();
    objectLinesData[0].created = created;
    objectLinesData[0].createdbyr = createdbyr;
    objectLinesData[0].updated = "";
    objectLinesData[0].updatedTimeStamp = "";
    objectLinesData[0].updatedby = updatedby;
    objectLinesData[0].updatedbyr = updatedbyr;
    objectLinesData[0].line = line;
    objectLinesData[0].mProductId = mProductId;
    objectLinesData[0].mProductIdr = mProductIdr;
    objectLinesData[0].qtyinvoiced = qtyinvoiced;
    objectLinesData[0].cUomId = cUomId;
    objectLinesData[0].cUomIdr = "";
    objectLinesData[0].priceactual = priceactual;
    objectLinesData[0].grossUnitPrice = grossUnitPrice;
    objectLinesData[0].linenetamt = linenetamt;
    objectLinesData[0].lineGrossAmount = lineGrossAmount;
    objectLinesData[0].cTaxId = cTaxId;
    objectLinesData[0].cTaxIdr = "";
    objectLinesData[0].pricelist = pricelist;
    objectLinesData[0].grosspricelist = grosspricelist;
    objectLinesData[0].financialInvoiceLine = financialInvoiceLine;
    objectLinesData[0].accountId = accountId;
    objectLinesData[0].accountIdr = "";
    objectLinesData[0].mAttributesetinstanceId = mAttributesetinstanceId;
    objectLinesData[0].mAttributesetinstanceIdr = mAttributesetinstanceIdr;
    objectLinesData[0].description = description;
    objectLinesData[0].cOrderlineId = cOrderlineId;
    objectLinesData[0].cOrderlineIdr = cOrderlineIdr;
    objectLinesData[0].mInoutlineId = mInoutlineId;
    objectLinesData[0].mInoutlineIdr = mInoutlineIdr;
    objectLinesData[0].iseditlinenetamt = iseditlinenetamt;
    objectLinesData[0].taxbaseamt = taxbaseamt;
    objectLinesData[0].excludeforwithholding = excludeforwithholding;
    objectLinesData[0].mProductUomId = mProductUomId;
    objectLinesData[0].isdeferred = isdeferred;
    objectLinesData[0].quantityorder = quantityorder;
    objectLinesData[0].grosspricestd = grosspricestd;
    objectLinesData[0].pricestd = pricestd;
    objectLinesData[0].defplantype = defplantype;
    objectLinesData[0].defplantyper = "";
    objectLinesData[0].periodnumber = periodnumber;
    objectLinesData[0].cPeriodId = cPeriodId;
    objectLinesData[0].cPeriodIdr = "";
    objectLinesData[0].adOrgId = adOrgId;
    objectLinesData[0].adOrgIdr = "";
    objectLinesData[0].cProjectId = cProjectId;
    objectLinesData[0].cProjectIdr = cProjectIdr;
    objectLinesData[0].cCostcenterId = cCostcenterId;
    objectLinesData[0].aAssetId = aAssetId;
    objectLinesData[0].user1Id = user1Id;
    objectLinesData[0].user2Id = user2Id;
    objectLinesData[0].explode = explode;
    objectLinesData[0].bomParentId = bomParentId;
    objectLinesData[0].cProjectlineId = cProjectlineId;
    objectLinesData[0].cInvoiceDiscountId = cInvoiceDiscountId;
    objectLinesData[0].adClientId = adClientId;
    objectLinesData[0].isdescription = isdescription;
    objectLinesData[0].cBpartnerId = cBpartnerId;
    objectLinesData[0].cBpartnerIdr = cBpartnerIdr;
    objectLinesData[0].taxamt = taxamt;
    objectLinesData[0].pricelimit = pricelimit;
    objectLinesData[0].sResourceassignmentId = sResourceassignmentId;
    objectLinesData[0].isactive = isactive;
    objectLinesData[0].chargeamt = chargeamt;
    objectLinesData[0].cInvoiceId = cInvoiceId;
    objectLinesData[0].cInvoicelineId = cInvoicelineId;
    objectLinesData[0].cChargeId = cChargeId;
    objectLinesData[0].mOfferId = mOfferId;
    objectLinesData[0].language = "";
    return objectLinesData;
  }

/**
Select for auxiliar field
 */
  public static String selectAux800004(ConnectionProvider connectionProvider, String M_Product_ID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT (CASE COUNT(*) WHEN 0 THEN 0 ELSE 1 END) AS TOTAL FROM M_PRODUCT_UOM WHERE M_PRODUCT_ID=? ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, M_Product_ID);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "total");
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
  public static String selectAux1F06154C94734F81A968E51738CC7B62(ConnectionProvider connectionProvider, String C_TAX_ID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT CASE WHEN COUNT(C_TAX_ID)>0 THEN 'Y' ELSE 'N' END AS ISUSED FROM C_TAX WHERE C_TAX_ISMEMBER(?, C_TAX_ID)=1 AND BASEAMOUNT IN ('TBA', 'TBATAX') ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_TAX_ID);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "isused");
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
  public static String selectAux231D1034C3D2450C969AEFCA7B680A8E(ConnectionProvider connectionProvider, String C_INVOICE_ID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "         SELECT AD_ORG_ID" +
      "FROM C_INVOICE" +
      "WHERE C_INVOICE_ID = ? ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_INVOICE_ID);

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

/**
Select for auxiliar field
 */
  public static String selectAux3EE2062DF62F4E948FD9786D21AF2D0C(ConnectionProvider connectionProvider, String M_PRODUCT_ID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT isBOM FROM M_PRODUCT WHERE M_PRODUCT_ID = ? ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, M_PRODUCT_ID);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "isbom");
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
  public static String selectAux467629226B744AD5A9D5CEBD284C29E4(ConnectionProvider connectionProvider, String M_PRODUCT_ID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT IsStocked FROM M_PRODUCT WHERE M_PRODUCT_ID = ? ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, M_PRODUCT_ID);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "isstocked");
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
  public static String selectAux4D9613116EAA46A585AEDB75237D5140(ConnectionProvider connectionProvider, String C_INVOICE_ID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT PROCESSED FROM C_INVOICE WHERE C_INVOICE_ID = ? ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_INVOICE_ID);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "processed");
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
  public static String selectAux51568B79156646C8966F49F82EE51CB7(ConnectionProvider connectionProvider, String M_Product_ID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT ATTRSETVALUETYPE FROM M_PRODUCT WHERE M_PRODUCT_ID=? ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, M_Product_ID);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "attrsetvaluetype");
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
  public static String selectAux571778C5E2AD4A13BDD7DD15A4DA470E(ConnectionProvider connectionProvider, String C_INVOICE_ID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT POSTED FROM C_INVOICE WHERE C_INVOICE_ID = ? ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_INVOICE_ID);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "posted");
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
  public static String selectAux637CCFE37ADD45B5810D3490DF33CF2E(ConnectionProvider connectionProvider, String M_Product_ID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT M_ATTRIBUTESET_ID FROM M_PRODUCT WHERE M_PRODUCT_ID=? ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, M_Product_ID);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "m_attributeset_id");
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
  public static String selectAuxB727417F9385474AB816BA585B1DAD74(ConnectionProvider connectionProvider, String c_invoice_id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        select max(dt.docbasetype) from c_invoice inv join c_doctype dt on (inv.c_doctypetarget_id = dt.c_doctype_id)" +
      "where inv.c_invoice_id = ? ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, c_invoice_id);

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
  public static String selectAuxE852BFC21B4C468C9E3F22901A6ED75C(ConnectionProvider connectionProvider, String M_PRICELIST_ID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT istaxincluded from m_pricelist where m_pricelist_id = ? ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, M_PRICELIST_ID);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "istaxincluded");
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
  public static String selectDef1655799099FD4E7A9EB982F98A5C8066_0(ConnectionProvider connectionProvider, String C_Bpartner_IDR)    throws ServletException {
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
  public static String selectDef3833_1(ConnectionProvider connectionProvider, String CreatedByR)    throws ServletException {
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
  public static String selectDef3835_2(ConnectionProvider connectionProvider, String UpdatedByR)    throws ServletException {
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
  public static String selectDef3837_3(ConnectionProvider connectionProvider, String C_OrderLine_IDR)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table3.DocumentNo), ''))), '')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(table3.DateOrdered, 'DD-MM-YYYY')), '')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table3.GrandTotal), ''))), '')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Line), ''))), '')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.LineNetAmt), ''))), '') ) as C_OrderLine_ID FROM C_OrderLine left join (select C_OrderLine_ID, C_Order_ID, Line, LineNetAmt from C_OrderLine) table2 on (C_OrderLine.C_OrderLine_ID = table2.C_OrderLine_ID)left join (select C_Order_ID, DocumentNo, DateOrdered, GrandTotal from C_Order) table3 on (table2.C_Order_ID = table3.C_Order_ID) WHERE C_OrderLine.isActive='Y' AND C_OrderLine.C_OrderLine_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_OrderLine_IDR);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "c_orderline_id");
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
  public static String selectDef3838(ConnectionProvider connectionProvider, String C_Invoice_ID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT COALESCE(MAX(Line),0)+10 AS DefaultValue FROM C_InvoiceLine WHERE C_Invoice_ID=? ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_Invoice_ID);

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
  public static String selectDef3840_4(ConnectionProvider connectionProvider, String paramLanguage, String M_Product_IDR)    throws ServletException {
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
  public static String selectDef4251_5(ConnectionProvider connectionProvider, String paramLanguage, String M_InOutLine_IDR)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Line), ''))), '')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.MovementQty), ''))), '')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table3.DocumentNo), ''))), '')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(table3.MovementDate, 'DD-MM-YYYY')), '')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL4.Name IS NULL THEN TO_CHAR(table4.Name) ELSE TO_CHAR(tableTRL4.Name) END)), ''))), '') ) as M_InOutLine_ID FROM M_InOutLine left join (select M_InOutLine_ID, Line, MovementQty, M_InOut_ID, M_Product_ID from M_InOutLine) table2 on (M_InOutLine.M_InOutLine_ID = table2.M_InOutLine_ID)left join (select M_InOut_ID, DocumentNo, MovementDate from M_InOut) table3 on (table2.M_InOut_ID = table3.M_InOut_ID)left join (select M_Product_ID, Name from M_Product) table4 on (table2.M_Product_ID = table4.M_Product_ID)left join (select M_Product_ID,AD_Language, Name from M_Product_TRL) tableTRL4 on (table4.M_Product_ID = tableTRL4.M_Product_ID and tableTRL4.AD_Language = ?)  WHERE M_InOutLine.isActive='Y' AND M_InOutLine.M_InOutLine_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, M_InOutLine_IDR);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "m_inoutline_id");
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
  public static String selectDef8553_6(ConnectionProvider connectionProvider, String M_AttributeSetInstance_IDR)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Description), ''))), '') ) as M_AttributeSetInstance_ID FROM M_AttributeSetInstance left join (select M_AttributeSetInstance_ID, Description from M_AttributeSetInstance) table2 on (M_AttributeSetInstance.M_AttributeSetInstance_ID = table2.M_AttributeSetInstance_ID) WHERE M_AttributeSetInstance.isActive='Y' AND M_AttributeSetInstance.M_AttributeSetInstance_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, M_AttributeSetInstance_IDR);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "m_attributesetinstance_id");
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
  public static String selectDefE9065F7B304E419787AD6EB080A54143_7(ConnectionProvider connectionProvider, String C_Project_IDR)    throws ServletException {
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
return the parent ID
 */
  public static String selectParentID(ConnectionProvider connectionProvider, String key)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT C_InvoiceLine.C_Invoice_ID AS NAME" +
      "        FROM C_InvoiceLine" +
      "        WHERE C_InvoiceLine.C_InvoiceLine_ID = ?";

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
  public static String selectParent(ConnectionProvider connectionProvider, String cInvoiceId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT (TO_CHAR(COALESCE(TO_CHAR(table1.DocumentNo), '')) || ' - ' || TO_CHAR(table1.DateInvoiced, 'DD-MM-YYYY') || ' - ' || TO_CHAR(COALESCE(TO_CHAR(table1.GrandTotal), ''))) AS NAME FROM C_Invoice left join (select C_Invoice_ID, DocumentNo, DateInvoiced, GrandTotal from C_Invoice) table1 on (C_Invoice.C_Invoice_ID = table1.C_Invoice_ID) WHERE C_Invoice.C_Invoice_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cInvoiceId);

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
  public static String selectParentTrl(ConnectionProvider connectionProvider, String cInvoiceId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT (TO_CHAR(COALESCE(TO_CHAR(table1.DocumentNo), '')) || ' - ' || TO_CHAR(table1.DateInvoiced, 'DD-MM-YYYY') || ' - ' || TO_CHAR(COALESCE(TO_CHAR(table1.GrandTotal), ''))) AS NAME FROM C_Invoice left join (select C_Invoice_ID, DocumentNo, DateInvoiced, GrandTotal from C_Invoice) table1 on (C_Invoice.C_Invoice_ID = table1.C_Invoice_ID) WHERE C_Invoice.C_Invoice_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cInvoiceId);

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
      "        UPDATE C_InvoiceLine" +
      "        SET Line = TO_NUMBER(?) , M_Product_ID = (?) , QtyInvoiced = TO_NUMBER(?) , C_UOM_ID = (?) , PriceActual = TO_NUMBER(?) , Gross_Unit_Price = TO_NUMBER(?) , LineNetAmt = TO_NUMBER(?) , Line_Gross_Amount = TO_NUMBER(?) , C_Tax_ID = (?) , PriceList = TO_NUMBER(?) , Grosspricelist = TO_NUMBER(?) , Financial_Invoice_Line = (?) , Account_ID = (?) , M_AttributeSetInstance_ID = (?) , Description = (?) , C_OrderLine_ID = (?) , M_InOutLine_ID = (?) , Iseditlinenetamt = (?) , Taxbaseamt = TO_NUMBER(?) , Excludeforwithholding = (?) , M_Product_Uom_Id = (?) , QuantityOrder = TO_NUMBER(?) , IsDeferred = (?) , grosspricestd = TO_NUMBER(?) , PriceStd = TO_NUMBER(?) , DefPlanType = (?) , Periodnumber = TO_NUMBER(?) , C_Period_ID = (?) , AD_Org_ID = (?) , C_Project_ID = (?) , C_Costcenter_ID = (?) , A_Asset_ID = (?) , User1_ID = (?) , User2_ID = (?) , Explode = (?) , BOM_Parent_ID = (?) , C_Invoice_Discount_ID = (?) , AD_Client_ID = (?) , IsDescription = (?) , C_Bpartner_ID = (?) , TaxAmt = TO_NUMBER(?) , PriceLimit = TO_NUMBER(?) , S_ResourceAssignment_ID = (?) , IsActive = (?) , ChargeAmt = TO_NUMBER(?) , C_Invoice_ID = (?) , C_InvoiceLine_ID = (?) , M_Offer_ID = (?) , C_Charge_ID = (?) , C_Projectline_ID = (?) , updated = now(), updatedby = ? " +
      "        WHERE C_InvoiceLine.C_InvoiceLine_ID = ? " +
      "                 AND C_InvoiceLine.C_Invoice_ID = ? " +
      "        AND C_InvoiceLine.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND C_InvoiceLine.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, line);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qtyinvoiced);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cUomId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, priceactual);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, grossUnitPrice);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, linenetamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lineGrossAmount);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cTaxId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pricelist);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, grosspricelist);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, financialInvoiceLine);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, accountId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mAttributesetinstanceId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cOrderlineId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mInoutlineId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, iseditlinenetamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, taxbaseamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, excludeforwithholding);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductUomId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, quantityorder);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isdeferred);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, grosspricestd);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pricestd);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, defplantype);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, periodnumber);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cPeriodId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cProjectId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCostcenterId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, aAssetId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, user1Id);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, user2Id);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, explode);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, bomParentId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cInvoiceDiscountId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isdescription);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, taxamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pricelimit);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, sResourceassignmentId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, chargeamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cInvoiceId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cInvoicelineId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mOfferId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cChargeId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cProjectlineId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cInvoicelineId);
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
      "        INSERT INTO C_InvoiceLine " +
      "        (Line, M_Product_ID, QtyInvoiced, C_UOM_ID, PriceActual, Gross_Unit_Price, LineNetAmt, Line_Gross_Amount, C_Tax_ID, PriceList, Grosspricelist, Financial_Invoice_Line, Account_ID, M_AttributeSetInstance_ID, Description, C_OrderLine_ID, M_InOutLine_ID, Iseditlinenetamt, Taxbaseamt, Excludeforwithholding, M_Product_Uom_Id, IsDeferred, QuantityOrder, grosspricestd, PriceStd, DefPlanType, Periodnumber, C_Period_ID, AD_Org_ID, C_Project_ID, C_Costcenter_ID, A_Asset_ID, User1_ID, User2_ID, Explode, BOM_Parent_ID, C_Projectline_ID, C_Invoice_Discount_ID, AD_Client_ID, IsDescription, C_Bpartner_ID, TaxAmt, PriceLimit, S_ResourceAssignment_ID, IsActive, ChargeAmt, C_Invoice_ID, C_InvoiceLine_ID, C_Charge_ID, M_Offer_ID, created, createdby, updated, updatedBy)" +
      "        VALUES (TO_NUMBER(?), (?), TO_NUMBER(?), (?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), (?), TO_NUMBER(?), TO_NUMBER(?), (?), (?), (?), (?), (?), (?), (?), TO_NUMBER(?), (?), (?), (?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), (?), TO_NUMBER(?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), TO_NUMBER(?), TO_NUMBER(?), (?), (?), TO_NUMBER(?), (?), (?), (?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, line);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qtyinvoiced);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cUomId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, priceactual);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, grossUnitPrice);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, linenetamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lineGrossAmount);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cTaxId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pricelist);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, grosspricelist);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, financialInvoiceLine);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, accountId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mAttributesetinstanceId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cOrderlineId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mInoutlineId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, iseditlinenetamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, taxbaseamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, excludeforwithholding);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductUomId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isdeferred);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, quantityorder);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, grosspricestd);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pricestd);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, defplantype);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, periodnumber);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cPeriodId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cProjectId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCostcenterId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, aAssetId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, user1Id);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, user2Id);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, explode);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, bomParentId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cProjectlineId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cInvoiceDiscountId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isdescription);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, taxamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pricelimit);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, sResourceassignmentId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, chargeamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cInvoiceId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cInvoicelineId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cChargeId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mOfferId);
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

  public static int delete(ConnectionProvider connectionProvider, String param1, String cInvoiceId, String adUserClient, String adOrgClient)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        DELETE FROM C_InvoiceLine" +
      "        WHERE C_InvoiceLine.C_InvoiceLine_ID = ? " +
      "                 AND C_InvoiceLine.C_Invoice_ID = ? " +
      "        AND C_InvoiceLine.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND C_InvoiceLine.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, param1);
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
      "          FROM C_InvoiceLine" +
      "         WHERE C_InvoiceLine.C_InvoiceLine_ID = ? ";

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
      "          FROM C_InvoiceLine" +
      "         WHERE C_InvoiceLine.C_InvoiceLine_ID = ? ";

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
