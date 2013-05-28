//Sqlc generated V1.O00-1
package org.openbravo.erpWindows.PurchaseOrder;

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
  public String qtyordered;
  public String mInoutlineId;
  public String mAttributesetinstanceId;
  public String mAttributesetinstanceIdr;
  public String cReturnReasonId;
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
  public String discount;
  public String description;
  public String taxbaseamt;
  public String iseditlinenetamt;
  public String cancelpricead;
  public String grosspricestd;
  public String pricestd;
  public String mWarehouseId;
  public String qtyreserved;
  public String qtydelivered;
  public String qtyinvoiced;
  public String mShipperId;
  public String dateordered;
  public String datepromised;
  public String cBpartnerId;
  public String freightamt;
  public String cChargeId;
  public String cBpartnerLocationId;
  public String quantityorder;
  public String mProductUomId;
  public String quotationlineId;
  public String managePrereservation;
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
  public String sResourceassignmentId;
  public String mWarehouseRuleId;
  public String createReservation;
  public String soResStatus;
  public String manageReservation;
  public String pricelimit;
  public String directship;
  public String chargeamt;
  public String dateinvoiced;
  public String datedelivered;
  public String cOrderId;
  public String isactive;
  public String adClientId;
  public String cOrderlineId;
  public String cCurrencyId;
  public String cOrderDiscountId;
  public String mOfferId;
  public String isdescription;
  public String refOrderlineId;
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
    else if (fieldName.equalsIgnoreCase("qtyordered"))
      return qtyordered;
    else if (fieldName.equalsIgnoreCase("m_inoutline_id") || fieldName.equals("mInoutlineId"))
      return mInoutlineId;
    else if (fieldName.equalsIgnoreCase("m_attributesetinstance_id") || fieldName.equals("mAttributesetinstanceId"))
      return mAttributesetinstanceId;
    else if (fieldName.equalsIgnoreCase("m_attributesetinstance_idr") || fieldName.equals("mAttributesetinstanceIdr"))
      return mAttributesetinstanceIdr;
    else if (fieldName.equalsIgnoreCase("c_return_reason_id") || fieldName.equals("cReturnReasonId"))
      return cReturnReasonId;
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
    else if (fieldName.equalsIgnoreCase("discount"))
      return discount;
    else if (fieldName.equalsIgnoreCase("description"))
      return description;
    else if (fieldName.equalsIgnoreCase("taxbaseamt"))
      return taxbaseamt;
    else if (fieldName.equalsIgnoreCase("iseditlinenetamt"))
      return iseditlinenetamt;
    else if (fieldName.equalsIgnoreCase("cancelpricead"))
      return cancelpricead;
    else if (fieldName.equalsIgnoreCase("grosspricestd"))
      return grosspricestd;
    else if (fieldName.equalsIgnoreCase("pricestd"))
      return pricestd;
    else if (fieldName.equalsIgnoreCase("m_warehouse_id") || fieldName.equals("mWarehouseId"))
      return mWarehouseId;
    else if (fieldName.equalsIgnoreCase("qtyreserved"))
      return qtyreserved;
    else if (fieldName.equalsIgnoreCase("qtydelivered"))
      return qtydelivered;
    else if (fieldName.equalsIgnoreCase("qtyinvoiced"))
      return qtyinvoiced;
    else if (fieldName.equalsIgnoreCase("m_shipper_id") || fieldName.equals("mShipperId"))
      return mShipperId;
    else if (fieldName.equalsIgnoreCase("dateordered"))
      return dateordered;
    else if (fieldName.equalsIgnoreCase("datepromised"))
      return datepromised;
    else if (fieldName.equalsIgnoreCase("c_bpartner_id") || fieldName.equals("cBpartnerId"))
      return cBpartnerId;
    else if (fieldName.equalsIgnoreCase("freightamt"))
      return freightamt;
    else if (fieldName.equalsIgnoreCase("c_charge_id") || fieldName.equals("cChargeId"))
      return cChargeId;
    else if (fieldName.equalsIgnoreCase("c_bpartner_location_id") || fieldName.equals("cBpartnerLocationId"))
      return cBpartnerLocationId;
    else if (fieldName.equalsIgnoreCase("quantityorder"))
      return quantityorder;
    else if (fieldName.equalsIgnoreCase("m_product_uom_id") || fieldName.equals("mProductUomId"))
      return mProductUomId;
    else if (fieldName.equalsIgnoreCase("quotationline_id") || fieldName.equals("quotationlineId"))
      return quotationlineId;
    else if (fieldName.equalsIgnoreCase("manage_prereservation") || fieldName.equals("managePrereservation"))
      return managePrereservation;
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
    else if (fieldName.equalsIgnoreCase("s_resourceassignment_id") || fieldName.equals("sResourceassignmentId"))
      return sResourceassignmentId;
    else if (fieldName.equalsIgnoreCase("m_warehouse_rule_id") || fieldName.equals("mWarehouseRuleId"))
      return mWarehouseRuleId;
    else if (fieldName.equalsIgnoreCase("create_reservation") || fieldName.equals("createReservation"))
      return createReservation;
    else if (fieldName.equalsIgnoreCase("so_res_status") || fieldName.equals("soResStatus"))
      return soResStatus;
    else if (fieldName.equalsIgnoreCase("manage_reservation") || fieldName.equals("manageReservation"))
      return manageReservation;
    else if (fieldName.equalsIgnoreCase("pricelimit"))
      return pricelimit;
    else if (fieldName.equalsIgnoreCase("directship"))
      return directship;
    else if (fieldName.equalsIgnoreCase("chargeamt"))
      return chargeamt;
    else if (fieldName.equalsIgnoreCase("dateinvoiced"))
      return dateinvoiced;
    else if (fieldName.equalsIgnoreCase("datedelivered"))
      return datedelivered;
    else if (fieldName.equalsIgnoreCase("c_order_id") || fieldName.equals("cOrderId"))
      return cOrderId;
    else if (fieldName.equalsIgnoreCase("isactive"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("ad_client_id") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("c_orderline_id") || fieldName.equals("cOrderlineId"))
      return cOrderlineId;
    else if (fieldName.equalsIgnoreCase("c_currency_id") || fieldName.equals("cCurrencyId"))
      return cCurrencyId;
    else if (fieldName.equalsIgnoreCase("c_order_discount_id") || fieldName.equals("cOrderDiscountId"))
      return cOrderDiscountId;
    else if (fieldName.equalsIgnoreCase("m_offer_id") || fieldName.equals("mOfferId"))
      return mOfferId;
    else if (fieldName.equalsIgnoreCase("isdescription"))
      return isdescription;
    else if (fieldName.equalsIgnoreCase("ref_orderline_id") || fieldName.equals("refOrderlineId"))
      return refOrderlineId;
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
  public static LinesData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String cOrderId, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, cOrderId, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static LinesData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String cOrderId, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(C_OrderLine.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = C_OrderLine.CreatedBy) as CreatedByR, " +
      "        to_char(C_OrderLine.Updated, ?) as updated, " +
      "        to_char(C_OrderLine.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        C_OrderLine.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = C_OrderLine.UpdatedBy) as UpdatedByR," +
      "        C_OrderLine.Line, " +
      "C_OrderLine.M_Product_ID, " +
      "(CASE WHEN C_OrderLine.M_Product_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL1.Name IS NULL THEN TO_CHAR(table1.Name) ELSE TO_CHAR(tableTRL1.Name) END)), ''))),'') ) END) AS M_Product_IDR, " +
      "C_OrderLine.QtyOrdered, " +
      "C_OrderLine.M_Inoutline_ID, " +
      "C_OrderLine.M_AttributeSetInstance_ID, " +
      "(CASE WHEN C_OrderLine.M_AttributeSetInstance_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Description), ''))),'') ) END) AS M_AttributeSetInstance_IDR, " +
      "C_OrderLine.C_Return_Reason_ID, " +
      "C_OrderLine.C_UOM_ID, " +
      "(CASE WHEN C_OrderLine.C_UOM_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL3.Name IS NULL THEN TO_CHAR(table3.Name) ELSE TO_CHAR(tableTRL3.Name) END)), ''))),'') ) END) AS C_UOM_IDR, " +
      "C_OrderLine.PriceActual, " +
      "C_OrderLine.Gross_Unit_Price, " +
      "C_OrderLine.LineNetAmt, " +
      "C_OrderLine.Line_Gross_Amount, " +
      "C_OrderLine.C_Tax_ID, " +
      "(CASE WHEN C_OrderLine.C_Tax_ID IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL4.Name IS NULL THEN TO_CHAR(table4.Name) ELSE TO_CHAR(tableTRL4.Name) END)), ''))),'') ) END) AS C_Tax_IDR, " +
      "C_OrderLine.PriceList, " +
      "C_OrderLine.GrossPriceList, " +
      "C_OrderLine.Discount, " +
      "C_OrderLine.Description, " +
      "C_OrderLine.Taxbaseamt, " +
      "COALESCE(C_OrderLine.Iseditlinenetamt, 'N') AS Iseditlinenetamt, " +
      "COALESCE(C_OrderLine.CANCELPRICEAD, 'N') AS CANCELPRICEAD, " +
      "C_OrderLine.grosspricestd, " +
      "C_OrderLine.PriceStd, " +
      "C_OrderLine.M_Warehouse_ID, " +
      "C_OrderLine.QtyReserved, " +
      "C_OrderLine.QtyDelivered, " +
      "C_OrderLine.QtyInvoiced, " +
      "C_OrderLine.M_Shipper_ID, " +
      "C_OrderLine.DateOrdered, " +
      "C_OrderLine.DatePromised, " +
      "C_OrderLine.C_BPartner_ID, " +
      "C_OrderLine.FreightAmt, " +
      "C_OrderLine.C_Charge_ID, " +
      "C_OrderLine.C_BPartner_Location_ID, " +
      "C_OrderLine.QuantityOrder, " +
      "C_OrderLine.M_Product_Uom_Id, " +
      "C_OrderLine.Quotationline_ID, " +
      "C_OrderLine.Manage_Prereservation, " +
      "C_OrderLine.AD_Org_ID, " +
      "(CASE WHEN C_OrderLine.AD_Org_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table5.Name), ''))),'') ) END) AS AD_Org_IDR, " +
      "C_OrderLine.C_Project_ID, " +
      "(CASE WHEN C_OrderLine.C_Project_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table6.Value), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table6.Name), ''))),'') ) END) AS C_Project_IDR, " +
      "C_OrderLine.C_Costcenter_ID, " +
      "C_OrderLine.A_Asset_ID, " +
      "C_OrderLine.User1_ID, " +
      "C_OrderLine.User2_ID, " +
      "C_OrderLine.Explode, " +
      "C_OrderLine.BOM_Parent_ID, " +
      "C_OrderLine.S_ResourceAssignment_ID, " +
      "C_OrderLine.M_Warehouse_Rule_ID, " +
      "C_OrderLine.Create_Reservation, " +
      "C_OrderLine.SO_Res_Status, " +
      "C_OrderLine.Manage_Reservation, " +
      "C_OrderLine.PriceLimit, " +
      "COALESCE(C_OrderLine.DirectShip, 'N') AS DirectShip, " +
      "C_OrderLine.ChargeAmt, " +
      "C_OrderLine.DateInvoiced, " +
      "C_OrderLine.DateDelivered, " +
      "C_OrderLine.C_Order_ID, " +
      "COALESCE(C_OrderLine.IsActive, 'N') AS IsActive, " +
      "C_OrderLine.AD_Client_ID, " +
      "C_OrderLine.C_OrderLine_ID, " +
      "C_OrderLine.C_Currency_ID, " +
      "C_OrderLine.C_Order_Discount_ID, " +
      "C_OrderLine.M_Offer_ID, " +
      "COALESCE(C_OrderLine.IsDescription, 'N') AS IsDescription, " +
      "C_OrderLine.Ref_OrderLine_ID, " +
      "        ? AS LANGUAGE " +
      "        FROM C_OrderLine left join (select M_Product_ID, Name from M_Product) table1 on (C_OrderLine.M_Product_ID = table1.M_Product_ID) left join (select M_Product_ID,AD_Language, Name from M_Product_TRL) tableTRL1 on (table1.M_Product_ID = tableTRL1.M_Product_ID and tableTRL1.AD_Language = ?)  left join (select M_AttributeSetInstance_ID, Description from M_AttributeSetInstance) table2 on (C_OrderLine.M_AttributeSetInstance_ID = table2.M_AttributeSetInstance_ID) left join (select C_UOM_ID, Name from C_UOM) table3 on (C_OrderLine.C_UOM_ID = table3.C_UOM_ID) left join (select C_UOM_ID,AD_Language, Name from C_UOM_TRL) tableTRL3 on (table3.C_UOM_ID = tableTRL3.C_UOM_ID and tableTRL3.AD_Language = ?)  left join (select C_Tax_ID, Name from C_Tax) table4 on (C_OrderLine.C_Tax_ID =  table4.C_Tax_ID) left join (select C_Tax_ID,AD_Language, Name from C_Tax_TRL) tableTRL4 on (table4.C_Tax_ID = tableTRL4.C_Tax_ID and tableTRL4.AD_Language = ?)  left join (select AD_Org_ID, Name from AD_Org) table5 on (C_OrderLine.AD_Org_ID = table5.AD_Org_ID) left join (select C_Project_ID, Value, Name from C_Project) table6 on (C_OrderLine.C_Project_ID = table6.C_Project_ID)" +
      "        WHERE 2=2 " +
      "        AND 1=1 ";
    strSql = strSql + ((cOrderId==null || cOrderId.equals(""))?"":"  AND C_OrderLine.C_Order_ID = ?  ");
    strSql = strSql + 
      "        AND C_OrderLine.C_OrderLine_ID = ? " +
      "        AND C_OrderLine.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND C_OrderLine.AD_Org_ID IN (";
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
      if (cOrderId != null && !(cOrderId.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, cOrderId);
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
        objectLinesData.qtyordered = UtilSql.getValue(result, "qtyordered");
        objectLinesData.mInoutlineId = UtilSql.getValue(result, "m_inoutline_id");
        objectLinesData.mAttributesetinstanceId = UtilSql.getValue(result, "m_attributesetinstance_id");
        objectLinesData.mAttributesetinstanceIdr = UtilSql.getValue(result, "m_attributesetinstance_idr");
        objectLinesData.cReturnReasonId = UtilSql.getValue(result, "c_return_reason_id");
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
        objectLinesData.discount = UtilSql.getValue(result, "discount");
        objectLinesData.description = UtilSql.getValue(result, "description");
        objectLinesData.taxbaseamt = UtilSql.getValue(result, "taxbaseamt");
        objectLinesData.iseditlinenetamt = UtilSql.getValue(result, "iseditlinenetamt");
        objectLinesData.cancelpricead = UtilSql.getValue(result, "cancelpricead");
        objectLinesData.grosspricestd = UtilSql.getValue(result, "grosspricestd");
        objectLinesData.pricestd = UtilSql.getValue(result, "pricestd");
        objectLinesData.mWarehouseId = UtilSql.getValue(result, "m_warehouse_id");
        objectLinesData.qtyreserved = UtilSql.getValue(result, "qtyreserved");
        objectLinesData.qtydelivered = UtilSql.getValue(result, "qtydelivered");
        objectLinesData.qtyinvoiced = UtilSql.getValue(result, "qtyinvoiced");
        objectLinesData.mShipperId = UtilSql.getValue(result, "m_shipper_id");
        objectLinesData.dateordered = UtilSql.getDateValue(result, "dateordered", "dd-MM-yyyy");
        objectLinesData.datepromised = UtilSql.getDateValue(result, "datepromised", "dd-MM-yyyy");
        objectLinesData.cBpartnerId = UtilSql.getValue(result, "c_bpartner_id");
        objectLinesData.freightamt = UtilSql.getValue(result, "freightamt");
        objectLinesData.cChargeId = UtilSql.getValue(result, "c_charge_id");
        objectLinesData.cBpartnerLocationId = UtilSql.getValue(result, "c_bpartner_location_id");
        objectLinesData.quantityorder = UtilSql.getValue(result, "quantityorder");
        objectLinesData.mProductUomId = UtilSql.getValue(result, "m_product_uom_id");
        objectLinesData.quotationlineId = UtilSql.getValue(result, "quotationline_id");
        objectLinesData.managePrereservation = UtilSql.getValue(result, "manage_prereservation");
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
        objectLinesData.sResourceassignmentId = UtilSql.getValue(result, "s_resourceassignment_id");
        objectLinesData.mWarehouseRuleId = UtilSql.getValue(result, "m_warehouse_rule_id");
        objectLinesData.createReservation = UtilSql.getValue(result, "create_reservation");
        objectLinesData.soResStatus = UtilSql.getValue(result, "so_res_status");
        objectLinesData.manageReservation = UtilSql.getValue(result, "manage_reservation");
        objectLinesData.pricelimit = UtilSql.getValue(result, "pricelimit");
        objectLinesData.directship = UtilSql.getValue(result, "directship");
        objectLinesData.chargeamt = UtilSql.getValue(result, "chargeamt");
        objectLinesData.dateinvoiced = UtilSql.getDateValue(result, "dateinvoiced", "dd-MM-yyyy");
        objectLinesData.datedelivered = UtilSql.getDateValue(result, "datedelivered", "dd-MM-yyyy");
        objectLinesData.cOrderId = UtilSql.getValue(result, "c_order_id");
        objectLinesData.isactive = UtilSql.getValue(result, "isactive");
        objectLinesData.adClientId = UtilSql.getValue(result, "ad_client_id");
        objectLinesData.cOrderlineId = UtilSql.getValue(result, "c_orderline_id");
        objectLinesData.cCurrencyId = UtilSql.getValue(result, "c_currency_id");
        objectLinesData.cOrderDiscountId = UtilSql.getValue(result, "c_order_discount_id");
        objectLinesData.mOfferId = UtilSql.getValue(result, "m_offer_id");
        objectLinesData.isdescription = UtilSql.getValue(result, "isdescription");
        objectLinesData.refOrderlineId = UtilSql.getValue(result, "ref_orderline_id");
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
  public static LinesData[] set(String cOrderId, String lineGrossAmount, String cancelpricead, String cOrderlineId, String adClientId, String adOrgId, String isactive, String createdby, String createdbyr, String updatedby, String updatedbyr, String line, String dateordered, String datepromised, String datedelivered, String dateinvoiced, String description, String mProductId, String mProductIdr, String cUomId, String mWarehouseId, String qtyordered, String qtyreserved, String qtydelivered, String qtyinvoiced, String mShipperId, String cCurrencyId, String pricelist, String priceactual, String cTaxId, String cBpartnerId, String directship, String freightamt, String cChargeId, String chargeamt, String cBpartnerLocationId, String linenetamt, String pricelimit, String discount, String cCostcenterId, String cReturnReasonId, String sResourceassignmentId, String cOrderDiscountId, String user2Id, String aAssetId, String refOrderlineId, String iseditlinenetamt, String taxbaseamt, String mProductUomId, String quantityorder, String mOfferId, String pricestd, String mAttributesetinstanceId, String mAttributesetinstanceIdr, String user1Id, String isdescription, String bomParentId, String grosspricestd, String explode, String mInoutlineId, String cProjectId, String cProjectIdr, String grosspricelist, String mWarehouseRuleId, String createReservation, String soResStatus, String manageReservation, String managePrereservation, String quotationlineId, String quotationlineIdr, String grossUnitPrice)    throws ServletException {
    LinesData objectLinesData[] = new LinesData[1];
    objectLinesData[0] = new LinesData();
    objectLinesData[0].created = "";
    objectLinesData[0].createdbyr = createdbyr;
    objectLinesData[0].updated = "";
    objectLinesData[0].updatedTimeStamp = "";
    objectLinesData[0].updatedby = updatedby;
    objectLinesData[0].updatedbyr = updatedbyr;
    objectLinesData[0].line = line;
    objectLinesData[0].mProductId = mProductId;
    objectLinesData[0].mProductIdr = mProductIdr;
    objectLinesData[0].qtyordered = qtyordered;
    objectLinesData[0].mInoutlineId = mInoutlineId;
    objectLinesData[0].mAttributesetinstanceId = mAttributesetinstanceId;
    objectLinesData[0].mAttributesetinstanceIdr = mAttributesetinstanceIdr;
    objectLinesData[0].cReturnReasonId = cReturnReasonId;
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
    objectLinesData[0].discount = discount;
    objectLinesData[0].description = description;
    objectLinesData[0].taxbaseamt = taxbaseamt;
    objectLinesData[0].iseditlinenetamt = iseditlinenetamt;
    objectLinesData[0].cancelpricead = cancelpricead;
    objectLinesData[0].grosspricestd = grosspricestd;
    objectLinesData[0].pricestd = pricestd;
    objectLinesData[0].mWarehouseId = mWarehouseId;
    objectLinesData[0].qtyreserved = qtyreserved;
    objectLinesData[0].qtydelivered = qtydelivered;
    objectLinesData[0].qtyinvoiced = qtyinvoiced;
    objectLinesData[0].mShipperId = mShipperId;
    objectLinesData[0].dateordered = dateordered;
    objectLinesData[0].datepromised = datepromised;
    objectLinesData[0].cBpartnerId = cBpartnerId;
    objectLinesData[0].freightamt = freightamt;
    objectLinesData[0].cChargeId = cChargeId;
    objectLinesData[0].cBpartnerLocationId = cBpartnerLocationId;
    objectLinesData[0].quantityorder = quantityorder;
    objectLinesData[0].mProductUomId = mProductUomId;
    objectLinesData[0].quotationlineId = quotationlineId;
    objectLinesData[0].managePrereservation = managePrereservation;
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
    objectLinesData[0].sResourceassignmentId = sResourceassignmentId;
    objectLinesData[0].mWarehouseRuleId = mWarehouseRuleId;
    objectLinesData[0].createReservation = createReservation;
    objectLinesData[0].soResStatus = soResStatus;
    objectLinesData[0].manageReservation = manageReservation;
    objectLinesData[0].pricelimit = pricelimit;
    objectLinesData[0].directship = directship;
    objectLinesData[0].chargeamt = chargeamt;
    objectLinesData[0].dateinvoiced = dateinvoiced;
    objectLinesData[0].datedelivered = datedelivered;
    objectLinesData[0].cOrderId = cOrderId;
    objectLinesData[0].isactive = isactive;
    objectLinesData[0].adClientId = adClientId;
    objectLinesData[0].cOrderlineId = cOrderlineId;
    objectLinesData[0].cCurrencyId = cCurrencyId;
    objectLinesData[0].cOrderDiscountId = cOrderDiscountId;
    objectLinesData[0].mOfferId = mOfferId;
    objectLinesData[0].isdescription = isdescription;
    objectLinesData[0].refOrderlineId = refOrderlineId;
    objectLinesData[0].language = "";
    return objectLinesData;
  }

/**
Select for auxiliar field
 */
  public static String selectAux800000(ConnectionProvider connectionProvider, String M_Product_ID)    throws ServletException {
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
  public static String selectAux10444AA4DB1D49D7A621F1EF47787122(ConnectionProvider connectionProvider, String M_Product_ID)    throws ServletException {
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
  public static String selectAux1F6072F3CE0F43F6AF71874398914072(ConnectionProvider connectionProvider, String C_ORDER_ID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT PROCESSED FROM C_ORDER WHERE C_ORDER_ID = ? ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_ORDER_ID);

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
  public static String selectAux2B0D9093C42A41E3AB05FEF0A64DBEA5(ConnectionProvider connectionProvider, String M_Product_ID)    throws ServletException {
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
  public static String selectAux3648B8ACFDE44EF4A649B7933D9DBD97(ConnectionProvider connectionProvider, String C_TAX_ID)    throws ServletException {
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
  public static String selectAux54B597A45774438696EC38DB00010B67(ConnectionProvider connectionProvider, String M_PRODUCT_ID)    throws ServletException {
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
  public static String selectAux9039E3F1B99F4D76855A89FA73B4F05F(ConnectionProvider connectionProvider, String M_PRODUCT_ID)    throws ServletException {
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
  public static String selectAux9E0F5BB107EE463B8E4F18395952D8F2(ConnectionProvider connectionProvider, String c_order_id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        select max(dt.docbasetype) from c_order ord join c_doctype dt on (ord.c_doctypetarget_id = dt.c_doctype_id)" +
      "where ord.c_order_id = ? ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, c_order_id);

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
  public static String selectAuxE0DB11E8D0384B29A64B251E2262A541(ConnectionProvider connectionProvider, String M_PRICELIST_ID)    throws ServletException {
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
  public static String selectAuxE3CF65D49DB84E488645E425A7C7C0B2(ConnectionProvider connectionProvider, String C_ORDER_ID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "         SELECT AD_ORG_ID" +
      "FROM C_ORDER" +
      "WHERE C_ORDER_ID = ?";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_ORDER_ID);

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
  public static String selectAuxEACCFCC1A36E4D379187291CF600E8FF(ConnectionProvider connectionProvider, String C_ORDER_ID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT POSTED FROM C_ORDER WHERE C_ORDER_ID = ? ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_ORDER_ID);

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
  public static String selectDef2210_0(ConnectionProvider connectionProvider, String CreatedByR)    throws ServletException {
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
  public static String selectDef2212_1(ConnectionProvider connectionProvider, String UpdatedByR)    throws ServletException {
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
  public static String selectDef2214(ConnectionProvider connectionProvider, String C_Order_ID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT COALESCE(MAX(Line),0)+10 AS DefaultValue FROM C_OrderLine WHERE C_Order_ID=? ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_Order_ID);

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
  public static String selectDef2221_2(ConnectionProvider connectionProvider, String paramLanguage, String M_Product_IDR)    throws ServletException {
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
  public static String selectDef2764(ConnectionProvider connectionProvider, String C_Order_ID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT C_BPartner_ID AS DefaultValue FROM C_Order WHERE C_Order_ID=? ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_Order_ID);

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
  public static String selectDef8767_3(ConnectionProvider connectionProvider, String M_AttributeSetInstance_IDR)    throws ServletException {
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
  public static String selectDefB2023461A08649D58E5D144D4FC2C507_4(ConnectionProvider connectionProvider, String C_Project_IDR)    throws ServletException {
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
  public static String selectDefE9612846B6F5472A8F64CF729E0B25AE_5(ConnectionProvider connectionProvider, String Quotationline_IDR)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table3.DocumentNo), ''))), '')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(table3.DateOrdered, 'DD-MM-YYYY')), '')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table3.GrandTotal), ''))), '')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Line), ''))), '')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.LineNetAmt), ''))), '') ) as Quotationline_ID FROM C_OrderLine left join (select C_OrderLine_ID, C_Order_ID, Line, LineNetAmt from C_OrderLine) table2 on (C_OrderLine.C_OrderLine_ID = table2.C_OrderLine_ID)left join (select C_Order_ID, DocumentNo, DateOrdered, GrandTotal from C_Order) table3 on (table2.C_Order_ID = table3.C_Order_ID) WHERE C_OrderLine.isActive='Y' AND C_OrderLine.C_OrderLine_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, Quotationline_IDR);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "quotationline_id");
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
      "        SELECT C_OrderLine.C_Order_ID AS NAME" +
      "        FROM C_OrderLine" +
      "        WHERE C_OrderLine.C_OrderLine_ID = ?";

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
  public static String selectParent(ConnectionProvider connectionProvider, String cOrderId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT (TO_CHAR(COALESCE(TO_CHAR(table1.DocumentNo), '')) || ' - ' || TO_CHAR(table1.DateOrdered, 'DD-MM-YYYY') || ' - ' || TO_CHAR(COALESCE(TO_CHAR(table1.GrandTotal), ''))) AS NAME FROM C_Order left join (select C_Order_ID, DocumentNo, DateOrdered, GrandTotal from C_Order) table1 on (C_Order.C_Order_ID = table1.C_Order_ID) WHERE C_Order.C_Order_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cOrderId);

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
  public static String selectParentTrl(ConnectionProvider connectionProvider, String cOrderId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT (TO_CHAR(COALESCE(TO_CHAR(table1.DocumentNo), '')) || ' - ' || TO_CHAR(table1.DateOrdered, 'DD-MM-YYYY') || ' - ' || TO_CHAR(COALESCE(TO_CHAR(table1.GrandTotal), ''))) AS NAME FROM C_Order left join (select C_Order_ID, DocumentNo, DateOrdered, GrandTotal from C_Order) table1 on (C_Order.C_Order_ID = table1.C_Order_ID) WHERE C_Order.C_Order_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cOrderId);

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
      "        UPDATE C_OrderLine" +
      "        SET Line = TO_NUMBER(?) , M_Product_ID = (?) , QtyOrdered = TO_NUMBER(?) , M_Inoutline_ID = (?) , M_AttributeSetInstance_ID = (?) , C_Return_Reason_ID = (?) , C_UOM_ID = (?) , PriceActual = TO_NUMBER(?) , Gross_Unit_Price = TO_NUMBER(?) , LineNetAmt = TO_NUMBER(?) , Line_Gross_Amount = TO_NUMBER(?) , C_Tax_ID = (?) , PriceList = TO_NUMBER(?) , GrossPriceList = TO_NUMBER(?) , Discount = TO_NUMBER(?) , Description = (?) , Taxbaseamt = TO_NUMBER(?) , Iseditlinenetamt = (?) , CANCELPRICEAD = (?) , grosspricestd = TO_NUMBER(?) , PriceStd = TO_NUMBER(?) , M_Warehouse_ID = (?) , QtyReserved = TO_NUMBER(?) , QtyDelivered = TO_NUMBER(?) , QtyInvoiced = TO_NUMBER(?) , M_Shipper_ID = (?) , DateOrdered = TO_DATE(?) , DatePromised = TO_DATE(?) , C_BPartner_ID = (?) , FreightAmt = TO_NUMBER(?) , C_Charge_ID = (?) , C_BPartner_Location_ID = (?) , QuantityOrder = TO_NUMBER(?) , M_Product_Uom_Id = (?) , Quotationline_ID = (?) , Manage_Prereservation = (?) , AD_Org_ID = (?) , C_Project_ID = (?) , C_Costcenter_ID = (?) , A_Asset_ID = (?) , User1_ID = (?) , User2_ID = (?) , Explode = (?) , BOM_Parent_ID = (?) , S_ResourceAssignment_ID = (?) , M_Warehouse_Rule_ID = (?) , Create_Reservation = (?) , SO_Res_Status = (?) , Manage_Reservation = (?) , PriceLimit = TO_NUMBER(?) , DirectShip = (?) , ChargeAmt = TO_NUMBER(?) , DateInvoiced = TO_DATE(?) , DateDelivered = TO_DATE(?) , C_Order_ID = (?) , IsActive = (?) , AD_Client_ID = (?) , C_OrderLine_ID = (?) , C_Currency_ID = (?) , C_Order_Discount_ID = (?) , M_Offer_ID = (?) , IsDescription = (?) , Ref_OrderLine_ID = (?) , updated = now(), updatedby = ? " +
      "        WHERE C_OrderLine.C_OrderLine_ID = ? " +
      "                 AND C_OrderLine.C_Order_ID = ? " +
      "        AND C_OrderLine.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND C_OrderLine.AD_Org_ID IN (";
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
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qtyordered);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mInoutlineId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mAttributesetinstanceId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cReturnReasonId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cUomId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, priceactual);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, grossUnitPrice);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, linenetamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lineGrossAmount);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cTaxId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pricelist);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, grosspricelist);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, discount);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, taxbaseamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, iseditlinenetamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cancelpricead);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, grosspricestd);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pricestd);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mWarehouseId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qtyreserved);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qtydelivered);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qtyinvoiced);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mShipperId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateordered);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, datepromised);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, freightamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cChargeId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerLocationId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, quantityorder);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductUomId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, quotationlineId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, managePrereservation);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cProjectId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCostcenterId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, aAssetId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, user1Id);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, user2Id);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, explode);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, bomParentId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, sResourceassignmentId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mWarehouseRuleId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, createReservation);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, soResStatus);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, manageReservation);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pricelimit);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, directship);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, chargeamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateinvoiced);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, datedelivered);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cOrderId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cOrderlineId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCurrencyId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cOrderDiscountId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mOfferId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isdescription);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, refOrderlineId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cOrderlineId);
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
      "        INSERT INTO C_OrderLine " +
      "        (Line, M_Product_ID, QtyOrdered, M_Inoutline_ID, M_AttributeSetInstance_ID, C_Return_Reason_ID, C_UOM_ID, PriceActual, Gross_Unit_Price, LineNetAmt, Line_Gross_Amount, C_Tax_ID, PriceList, GrossPriceList, Discount, Description, Taxbaseamt, Iseditlinenetamt, CANCELPRICEAD, grosspricestd, PriceStd, M_Warehouse_ID, QtyReserved, QtyDelivered, QtyInvoiced, M_Shipper_ID, DateOrdered, DatePromised, C_BPartner_ID, FreightAmt, C_Charge_ID, C_BPartner_Location_ID, QuantityOrder, M_Product_Uom_Id, Quotationline_ID, Manage_Prereservation, AD_Org_ID, C_Project_ID, C_Costcenter_ID, A_Asset_ID, User1_ID, User2_ID, Explode, BOM_Parent_ID, S_ResourceAssignment_ID, M_Warehouse_Rule_ID, Create_Reservation, SO_Res_Status, Manage_Reservation, PriceLimit, DirectShip, ChargeAmt, DateInvoiced, DateDelivered, C_Order_ID, IsActive, AD_Client_ID, C_OrderLine_ID, C_Currency_ID, C_Order_Discount_ID, M_Offer_ID, IsDescription, Ref_OrderLine_ID, created, createdby, updated, updatedBy)" +
      "        VALUES (TO_NUMBER(?), (?), TO_NUMBER(?), (?), (?), (?), (?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), (?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), (?), TO_NUMBER(?), (?), (?), TO_NUMBER(?), TO_NUMBER(?), (?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), (?), TO_DATE(?), TO_DATE(?), (?), TO_NUMBER(?), (?), (?), TO_NUMBER(?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), TO_NUMBER(?), (?), TO_NUMBER(?), TO_DATE(?), TO_DATE(?), (?), (?), (?), (?), (?), (?), (?), (?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, line);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qtyordered);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mInoutlineId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mAttributesetinstanceId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cReturnReasonId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cUomId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, priceactual);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, grossUnitPrice);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, linenetamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lineGrossAmount);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cTaxId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pricelist);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, grosspricelist);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, discount);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, taxbaseamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, iseditlinenetamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cancelpricead);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, grosspricestd);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pricestd);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mWarehouseId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qtyreserved);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qtydelivered);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qtyinvoiced);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mShipperId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateordered);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, datepromised);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, freightamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cChargeId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerLocationId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, quantityorder);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductUomId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, quotationlineId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, managePrereservation);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cProjectId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCostcenterId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, aAssetId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, user1Id);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, user2Id);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, explode);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, bomParentId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, sResourceassignmentId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mWarehouseRuleId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, createReservation);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, soResStatus);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, manageReservation);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pricelimit);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, directship);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, chargeamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateinvoiced);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, datedelivered);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cOrderId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cOrderlineId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCurrencyId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cOrderDiscountId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mOfferId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isdescription);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, refOrderlineId);
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

  public static int delete(ConnectionProvider connectionProvider, String param1, String cOrderId, String adUserClient, String adOrgClient)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        DELETE FROM C_OrderLine" +
      "        WHERE C_OrderLine.C_OrderLine_ID = ? " +
      "                 AND C_OrderLine.C_Order_ID = ? " +
      "        AND C_OrderLine.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND C_OrderLine.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, param1);
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
      "          FROM C_OrderLine" +
      "         WHERE C_OrderLine.C_OrderLine_ID = ? ";

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
      "          FROM C_OrderLine" +
      "         WHERE C_OrderLine.C_OrderLine_ID = ? ";

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
