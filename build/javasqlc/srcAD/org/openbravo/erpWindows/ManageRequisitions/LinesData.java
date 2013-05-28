//Sqlc generated V1.O00-1
package org.openbravo.erpWindows.ManageRequisitions;

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
  public String needbydate;
  public String mProductId;
  public String mProductIdr;
  public String mAttributesetinstanceId;
  public String mAttributesetinstanceIdr;
  public String qty;
  public String cUomId;
  public String cUomIdr;
  public String cBpartnerId;
  public String cBpartnerIdr;
  public String mPricelistId;
  public String mPricelistIdr;
  public String priceactual;
  public String linenetamt;
  public String cCurrencyId;
  public String cCurrencyIdr;
  public String description;
  public String pricelist;
  public String discount;
  public String grossUnitPrice;
  public String grossAmt;
  public String internalnotes;
  public String suppliernotes;
  public String lockedby;
  public String lockedbyr;
  public String lockqty;
  public String lockprice;
  public String quantityorder;
  public String mProductUomId;
  public String mProductUomIdr;
  public String changestatus;
  public String lockcause;
  public String orderedqty;
  public String lockdate;
  public String reqstatus;
  public String adClientId;
  public String mRequisitionlineId;
  public String mRequisitionId;
  public String isactive;
  public String adOrgId;
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
    else if (fieldName.equalsIgnoreCase("needbydate"))
      return needbydate;
    else if (fieldName.equalsIgnoreCase("m_product_id") || fieldName.equals("mProductId"))
      return mProductId;
    else if (fieldName.equalsIgnoreCase("m_product_idr") || fieldName.equals("mProductIdr"))
      return mProductIdr;
    else if (fieldName.equalsIgnoreCase("m_attributesetinstance_id") || fieldName.equals("mAttributesetinstanceId"))
      return mAttributesetinstanceId;
    else if (fieldName.equalsIgnoreCase("m_attributesetinstance_idr") || fieldName.equals("mAttributesetinstanceIdr"))
      return mAttributesetinstanceIdr;
    else if (fieldName.equalsIgnoreCase("qty"))
      return qty;
    else if (fieldName.equalsIgnoreCase("c_uom_id") || fieldName.equals("cUomId"))
      return cUomId;
    else if (fieldName.equalsIgnoreCase("c_uom_idr") || fieldName.equals("cUomIdr"))
      return cUomIdr;
    else if (fieldName.equalsIgnoreCase("c_bpartner_id") || fieldName.equals("cBpartnerId"))
      return cBpartnerId;
    else if (fieldName.equalsIgnoreCase("c_bpartner_idr") || fieldName.equals("cBpartnerIdr"))
      return cBpartnerIdr;
    else if (fieldName.equalsIgnoreCase("m_pricelist_id") || fieldName.equals("mPricelistId"))
      return mPricelistId;
    else if (fieldName.equalsIgnoreCase("m_pricelist_idr") || fieldName.equals("mPricelistIdr"))
      return mPricelistIdr;
    else if (fieldName.equalsIgnoreCase("priceactual"))
      return priceactual;
    else if (fieldName.equalsIgnoreCase("linenetamt"))
      return linenetamt;
    else if (fieldName.equalsIgnoreCase("c_currency_id") || fieldName.equals("cCurrencyId"))
      return cCurrencyId;
    else if (fieldName.equalsIgnoreCase("c_currency_idr") || fieldName.equals("cCurrencyIdr"))
      return cCurrencyIdr;
    else if (fieldName.equalsIgnoreCase("description"))
      return description;
    else if (fieldName.equalsIgnoreCase("pricelist"))
      return pricelist;
    else if (fieldName.equalsIgnoreCase("discount"))
      return discount;
    else if (fieldName.equalsIgnoreCase("gross_unit_price") || fieldName.equals("grossUnitPrice"))
      return grossUnitPrice;
    else if (fieldName.equalsIgnoreCase("gross_amt") || fieldName.equals("grossAmt"))
      return grossAmt;
    else if (fieldName.equalsIgnoreCase("internalnotes"))
      return internalnotes;
    else if (fieldName.equalsIgnoreCase("suppliernotes"))
      return suppliernotes;
    else if (fieldName.equalsIgnoreCase("lockedby"))
      return lockedby;
    else if (fieldName.equalsIgnoreCase("lockedbyr"))
      return lockedbyr;
    else if (fieldName.equalsIgnoreCase("lockqty"))
      return lockqty;
    else if (fieldName.equalsIgnoreCase("lockprice"))
      return lockprice;
    else if (fieldName.equalsIgnoreCase("quantityorder"))
      return quantityorder;
    else if (fieldName.equalsIgnoreCase("m_product_uom_id") || fieldName.equals("mProductUomId"))
      return mProductUomId;
    else if (fieldName.equalsIgnoreCase("m_product_uom_idr") || fieldName.equals("mProductUomIdr"))
      return mProductUomIdr;
    else if (fieldName.equalsIgnoreCase("changestatus"))
      return changestatus;
    else if (fieldName.equalsIgnoreCase("lockcause"))
      return lockcause;
    else if (fieldName.equalsIgnoreCase("orderedqty"))
      return orderedqty;
    else if (fieldName.equalsIgnoreCase("lockdate"))
      return lockdate;
    else if (fieldName.equalsIgnoreCase("reqstatus"))
      return reqstatus;
    else if (fieldName.equalsIgnoreCase("ad_client_id") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("m_requisitionline_id") || fieldName.equals("mRequisitionlineId"))
      return mRequisitionlineId;
    else if (fieldName.equalsIgnoreCase("m_requisition_id") || fieldName.equals("mRequisitionId"))
      return mRequisitionId;
    else if (fieldName.equalsIgnoreCase("isactive"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("ad_org_id") || fieldName.equals("adOrgId"))
      return adOrgId;
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
  public static LinesData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String mRequisitionId, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, mRequisitionId, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static LinesData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String mRequisitionId, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(M_RequisitionLine.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = M_RequisitionLine.CreatedBy) as CreatedByR, " +
      "        to_char(M_RequisitionLine.Updated, ?) as updated, " +
      "        to_char(M_RequisitionLine.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        M_RequisitionLine.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = M_RequisitionLine.UpdatedBy) as UpdatedByR," +
      "        M_RequisitionLine.Line, " +
      "M_RequisitionLine.Needbydate, " +
      "M_RequisitionLine.M_Product_ID, " +
      "(CASE WHEN M_RequisitionLine.M_Product_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL1.Name IS NULL THEN TO_CHAR(table1.Name) ELSE TO_CHAR(tableTRL1.Name) END)), ''))),'') ) END) AS M_Product_IDR, " +
      "M_RequisitionLine.M_AttributeSetInstance_ID, " +
      "(CASE WHEN M_RequisitionLine.M_AttributeSetInstance_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Description), ''))),'') ) END) AS M_AttributeSetInstance_IDR, " +
      "M_RequisitionLine.Qty, " +
      "M_RequisitionLine.C_UOM_ID, " +
      "(CASE WHEN M_RequisitionLine.C_UOM_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL3.Name IS NULL THEN TO_CHAR(table3.Name) ELSE TO_CHAR(tableTRL3.Name) END)), ''))),'') ) END) AS C_UOM_IDR, " +
      "M_RequisitionLine.C_BPartner_ID, " +
      "(CASE WHEN M_RequisitionLine.C_BPartner_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table4.Name), ''))),'') ) END) AS C_BPartner_IDR, " +
      "M_RequisitionLine.M_PriceList_ID, " +
      "(CASE WHEN M_RequisitionLine.M_PriceList_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table5.Name), ''))),'') ) END) AS M_PriceList_IDR, " +
      "M_RequisitionLine.PriceActual, " +
      "M_RequisitionLine.LineNetAmt, " +
      "M_RequisitionLine.C_Currency_ID, " +
      "(CASE WHEN M_RequisitionLine.C_Currency_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table6.ISO_Code), ''))),'') ) END) AS C_Currency_IDR, " +
      "M_RequisitionLine.Description, " +
      "M_RequisitionLine.PriceList, " +
      "M_RequisitionLine.Discount, " +
      "M_RequisitionLine.Gross_Unit_Price, " +
      "M_RequisitionLine.Gross_Amt, " +
      "M_RequisitionLine.Internalnotes, " +
      "M_RequisitionLine.Suppliernotes, " +
      "M_RequisitionLine.Lockedby, " +
      "(CASE WHEN M_RequisitionLine.Lockedby IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table7.Name), ''))),'') ) END) AS LockedbyR, " +
      "M_RequisitionLine.Lockqty, " +
      "M_RequisitionLine.Lockprice, " +
      "M_RequisitionLine.QuantityOrder, " +
      "M_RequisitionLine.M_Product_Uom_Id, " +
      "(CASE WHEN M_RequisitionLine.M_Product_Uom_Id IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL9.Name IS NULL THEN TO_CHAR(table9.Name) ELSE TO_CHAR(tableTRL9.Name) END)), ''))),'') ) END) AS M_Product_Uom_IdR, " +
      "M_RequisitionLine.Changestatus, " +
      "M_RequisitionLine.Lockcause, " +
      "M_RequisitionLine.Orderedqty, " +
      "M_RequisitionLine.Lockdate, " +
      "M_RequisitionLine.Reqstatus, " +
      "M_RequisitionLine.AD_Client_ID, " +
      "M_RequisitionLine.M_Requisitionline_ID, " +
      "M_RequisitionLine.M_Requisition_ID, " +
      "COALESCE(M_RequisitionLine.IsActive, 'N') AS IsActive, " +
      "M_RequisitionLine.AD_Org_ID, " +
      "        ? AS LANGUAGE " +
      "        FROM M_RequisitionLine left join (select M_Product_ID, Name from M_Product) table1 on (M_RequisitionLine.M_Product_ID = table1.M_Product_ID) left join (select M_Product_ID,AD_Language, Name from M_Product_TRL) tableTRL1 on (table1.M_Product_ID = tableTRL1.M_Product_ID and tableTRL1.AD_Language = ?)  left join (select M_AttributeSetInstance_ID, Description from M_AttributeSetInstance) table2 on (M_RequisitionLine.M_AttributeSetInstance_ID = table2.M_AttributeSetInstance_ID) left join (select C_UOM_ID, Name from C_UOM) table3 on (M_RequisitionLine.C_UOM_ID = table3.C_UOM_ID) left join (select C_UOM_ID,AD_Language, Name from C_UOM_TRL) tableTRL3 on (table3.C_UOM_ID = tableTRL3.C_UOM_ID and tableTRL3.AD_Language = ?)  left join (select C_BPartner_ID, Name from C_BPartner) table4 on (M_RequisitionLine.C_BPartner_ID = table4.C_BPartner_ID) left join (select M_PriceList_ID, Name from M_PriceList) table5 on (M_RequisitionLine.M_PriceList_ID = table5.M_PriceList_ID) left join (select C_Currency_ID, ISO_Code from C_Currency) table6 on (M_RequisitionLine.C_Currency_ID = table6.C_Currency_ID) left join (select AD_User_ID, Name from AD_User) table7 on (M_RequisitionLine.Lockedby =  table7.AD_User_ID) left join (select M_Product_Uom_Id, C_UOM_ID from M_Product_Uom) table8 on (M_RequisitionLine.M_Product_Uom_Id = table8.M_Product_Uom_Id) left join (select C_UOM_ID, Name from C_UOM) table9 on (table8.C_UOM_ID = table9.C_UOM_ID) left join (select C_UOM_ID,AD_Language, Name from C_UOM_TRL) tableTRL9 on (table9.C_UOM_ID = tableTRL9.C_UOM_ID and tableTRL9.AD_Language = ?) " +
      "        WHERE 2=2 " +
      "        AND 1=1 ";
    strSql = strSql + ((mRequisitionId==null || mRequisitionId.equals(""))?"":"  AND M_RequisitionLine.M_Requisition_ID = ?  ");
    strSql = strSql + 
      "        AND M_RequisitionLine.M_Requisitionline_ID = ? " +
      "        AND M_RequisitionLine.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND M_RequisitionLine.AD_Org_ID IN (";
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
      if (mRequisitionId != null && !(mRequisitionId.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, mRequisitionId);
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
        objectLinesData.needbydate = UtilSql.getDateValue(result, "needbydate", "dd-MM-yyyy");
        objectLinesData.mProductId = UtilSql.getValue(result, "m_product_id");
        objectLinesData.mProductIdr = UtilSql.getValue(result, "m_product_idr");
        objectLinesData.mAttributesetinstanceId = UtilSql.getValue(result, "m_attributesetinstance_id");
        objectLinesData.mAttributesetinstanceIdr = UtilSql.getValue(result, "m_attributesetinstance_idr");
        objectLinesData.qty = UtilSql.getValue(result, "qty");
        objectLinesData.cUomId = UtilSql.getValue(result, "c_uom_id");
        objectLinesData.cUomIdr = UtilSql.getValue(result, "c_uom_idr");
        objectLinesData.cBpartnerId = UtilSql.getValue(result, "c_bpartner_id");
        objectLinesData.cBpartnerIdr = UtilSql.getValue(result, "c_bpartner_idr");
        objectLinesData.mPricelistId = UtilSql.getValue(result, "m_pricelist_id");
        objectLinesData.mPricelistIdr = UtilSql.getValue(result, "m_pricelist_idr");
        objectLinesData.priceactual = UtilSql.getValue(result, "priceactual");
        objectLinesData.linenetamt = UtilSql.getValue(result, "linenetamt");
        objectLinesData.cCurrencyId = UtilSql.getValue(result, "c_currency_id");
        objectLinesData.cCurrencyIdr = UtilSql.getValue(result, "c_currency_idr");
        objectLinesData.description = UtilSql.getValue(result, "description");
        objectLinesData.pricelist = UtilSql.getValue(result, "pricelist");
        objectLinesData.discount = UtilSql.getValue(result, "discount");
        objectLinesData.grossUnitPrice = UtilSql.getValue(result, "gross_unit_price");
        objectLinesData.grossAmt = UtilSql.getValue(result, "gross_amt");
        objectLinesData.internalnotes = UtilSql.getValue(result, "internalnotes");
        objectLinesData.suppliernotes = UtilSql.getValue(result, "suppliernotes");
        objectLinesData.lockedby = UtilSql.getValue(result, "lockedby");
        objectLinesData.lockedbyr = UtilSql.getValue(result, "lockedbyr");
        objectLinesData.lockqty = UtilSql.getValue(result, "lockqty");
        objectLinesData.lockprice = UtilSql.getValue(result, "lockprice");
        objectLinesData.quantityorder = UtilSql.getValue(result, "quantityorder");
        objectLinesData.mProductUomId = UtilSql.getValue(result, "m_product_uom_id");
        objectLinesData.mProductUomIdr = UtilSql.getValue(result, "m_product_uom_idr");
        objectLinesData.changestatus = UtilSql.getValue(result, "changestatus");
        objectLinesData.lockcause = UtilSql.getValue(result, "lockcause");
        objectLinesData.orderedqty = UtilSql.getValue(result, "orderedqty");
        objectLinesData.lockdate = UtilSql.getDateValue(result, "lockdate", "dd-MM-yyyy");
        objectLinesData.reqstatus = UtilSql.getValue(result, "reqstatus");
        objectLinesData.adClientId = UtilSql.getValue(result, "ad_client_id");
        objectLinesData.mRequisitionlineId = UtilSql.getValue(result, "m_requisitionline_id");
        objectLinesData.mRequisitionId = UtilSql.getValue(result, "m_requisition_id");
        objectLinesData.isactive = UtilSql.getValue(result, "isactive");
        objectLinesData.adOrgId = UtilSql.getValue(result, "ad_org_id");
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
  public static LinesData[] set(String mRequisitionId, String cBpartnerId, String cBpartnerIdr, String cUomId, String mProductUomId, String quantityorder, String mAttributesetinstanceId, String mAttributesetinstanceIdr, String reqstatus, String orderedqty, String description, String changestatus, String internalnotes, String suppliernotes, String needbydate, String priceactual, String discount, String cCurrencyId, String lockedby, String lockqty, String lockprice, String mPricelistId, String lockdate, String lockcause, String line, String grossAmt, String mRequisitionlineId, String adClientId, String adOrgId, String isactive, String createdby, String createdbyr, String updatedby, String updatedbyr, String mProductId, String mProductIdr, String qty, String pricelist, String linenetamt, String grossUnitPrice)    throws ServletException {
    LinesData objectLinesData[] = new LinesData[1];
    objectLinesData[0] = new LinesData();
    objectLinesData[0].created = "";
    objectLinesData[0].createdbyr = createdbyr;
    objectLinesData[0].updated = "";
    objectLinesData[0].updatedTimeStamp = "";
    objectLinesData[0].updatedby = updatedby;
    objectLinesData[0].updatedbyr = updatedbyr;
    objectLinesData[0].line = line;
    objectLinesData[0].needbydate = needbydate;
    objectLinesData[0].mProductId = mProductId;
    objectLinesData[0].mProductIdr = mProductIdr;
    objectLinesData[0].mAttributesetinstanceId = mAttributesetinstanceId;
    objectLinesData[0].mAttributesetinstanceIdr = mAttributesetinstanceIdr;
    objectLinesData[0].qty = qty;
    objectLinesData[0].cUomId = cUomId;
    objectLinesData[0].cUomIdr = "";
    objectLinesData[0].cBpartnerId = cBpartnerId;
    objectLinesData[0].cBpartnerIdr = cBpartnerIdr;
    objectLinesData[0].mPricelistId = mPricelistId;
    objectLinesData[0].mPricelistIdr = "";
    objectLinesData[0].priceactual = priceactual;
    objectLinesData[0].linenetamt = linenetamt;
    objectLinesData[0].cCurrencyId = cCurrencyId;
    objectLinesData[0].cCurrencyIdr = "";
    objectLinesData[0].description = description;
    objectLinesData[0].pricelist = pricelist;
    objectLinesData[0].discount = discount;
    objectLinesData[0].grossUnitPrice = grossUnitPrice;
    objectLinesData[0].grossAmt = grossAmt;
    objectLinesData[0].internalnotes = internalnotes;
    objectLinesData[0].suppliernotes = suppliernotes;
    objectLinesData[0].lockedby = lockedby;
    objectLinesData[0].lockedbyr = "";
    objectLinesData[0].lockqty = lockqty;
    objectLinesData[0].lockprice = lockprice;
    objectLinesData[0].quantityorder = quantityorder;
    objectLinesData[0].mProductUomId = mProductUomId;
    objectLinesData[0].mProductUomIdr = "";
    objectLinesData[0].changestatus = changestatus;
    objectLinesData[0].lockcause = lockcause;
    objectLinesData[0].orderedqty = orderedqty;
    objectLinesData[0].lockdate = lockdate;
    objectLinesData[0].reqstatus = reqstatus;
    objectLinesData[0].adClientId = adClientId;
    objectLinesData[0].mRequisitionlineId = mRequisitionlineId;
    objectLinesData[0].mRequisitionId = mRequisitionId;
    objectLinesData[0].isactive = isactive;
    objectLinesData[0].adOrgId = adOrgId;
    objectLinesData[0].language = "";
    return objectLinesData;
  }

/**
Select for auxiliar field
 */
  public static String selectAux2252C06D4EA7419FA38E7B5565EF411C(ConnectionProvider connectionProvider, String M_PRICELIST_ID, String M_Requisition_ID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT istaxincluded from m_pricelist where m_pricelist_id = CASE WHEN COALESCE(?,'') <> ''   THEN ?   ELSE  (SELECT m_pricelist_id from m_requisition where m_requisition_id = ?) END ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, M_PRICELIST_ID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, M_PRICELIST_ID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, M_Requisition_ID);

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
  public static String selectAux485726718FCD47AFB101C59FC1BD365E(ConnectionProvider connectionProvider, String M_Product_ID)    throws ServletException {
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
  public static String selectAuxACA00D8708854C3E80E50FE99724C4E8(ConnectionProvider connectionProvider, String M_Product_ID)    throws ServletException {
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
  public static String selectDef1004400000_0(ConnectionProvider connectionProvider, String C_BPartner_IDR)    throws ServletException {
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
  public static String selectDef1004400004_1(ConnectionProvider connectionProvider, String M_AttributeSetInstance_IDR)    throws ServletException {
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
  public static String selectDef1004400040(ConnectionProvider connectionProvider, String M_Requisition_ID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT COALESCE(MAX(LINE),0)+10 AS DefaultValue FROM M_REQUISITIONLINE WHERE M_Requisition_ID=? ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, M_Requisition_ID);

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
  public static String selectDef803547_2(ConnectionProvider connectionProvider, String CreatedbyR)    throws ServletException {
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
  public static String selectDef803549_3(ConnectionProvider connectionProvider, String UpdatedbyR)    throws ServletException {
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
  public static String selectDef803552_4(ConnectionProvider connectionProvider, String paramLanguage, String M_Product_IDR)    throws ServletException {
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
      "        SELECT M_RequisitionLine.M_Requisition_ID AS NAME" +
      "        FROM M_RequisitionLine" +
      "        WHERE M_RequisitionLine.M_Requisitionline_ID = ?";

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
  public static String selectParent(ConnectionProvider connectionProvider, String mRequisitionId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT (TO_CHAR(COALESCE(TO_CHAR(table1.DocumentNo), ''))) AS NAME FROM M_Requisition left join (select M_Requisition_ID, DocumentNo from M_Requisition) table1 on (M_Requisition.M_Requisition_ID = table1.M_Requisition_ID) WHERE M_Requisition.M_Requisition_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mRequisitionId);

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
  public static String selectParentTrl(ConnectionProvider connectionProvider, String mRequisitionId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT (TO_CHAR(COALESCE(TO_CHAR(table1.DocumentNo), ''))) AS NAME FROM M_Requisition left join (select M_Requisition_ID, DocumentNo from M_Requisition) table1 on (M_Requisition.M_Requisition_ID = table1.M_Requisition_ID) WHERE M_Requisition.M_Requisition_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mRequisitionId);

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
      "        UPDATE M_RequisitionLine" +
      "        SET Line = TO_NUMBER(?) , Needbydate = TO_DATE(?) , M_Product_ID = (?) , M_AttributeSetInstance_ID = (?) , Qty = TO_NUMBER(?) , C_UOM_ID = (?) , C_BPartner_ID = (?) , M_PriceList_ID = (?) , PriceActual = TO_NUMBER(?) , LineNetAmt = TO_NUMBER(?) , C_Currency_ID = (?) , Description = (?) , PriceList = TO_NUMBER(?) , Discount = TO_NUMBER(?) , Gross_Unit_Price = TO_NUMBER(?) , Gross_Amt = TO_NUMBER(?) , Internalnotes = (?) , Suppliernotes = (?) , Lockedby = (?) , Lockqty = TO_NUMBER(?) , Lockprice = TO_NUMBER(?) , QuantityOrder = TO_NUMBER(?) , M_Product_Uom_Id = (?) , Changestatus = (?) , Lockcause = (?) , Orderedqty = TO_NUMBER(?) , Lockdate = TO_DATE(?) , Reqstatus = (?) , AD_Client_ID = (?) , M_Requisitionline_ID = (?) , M_Requisition_ID = (?) , IsActive = (?) , AD_Org_ID = (?) , updated = now(), updatedby = ? " +
      "        WHERE M_RequisitionLine.M_Requisitionline_ID = ? " +
      "                 AND M_RequisitionLine.M_Requisition_ID = ? " +
      "        AND M_RequisitionLine.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND M_RequisitionLine.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, line);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, needbydate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mAttributesetinstanceId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qty);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cUomId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mPricelistId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, priceactual);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, linenetamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCurrencyId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pricelist);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, discount);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, grossUnitPrice);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, grossAmt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, internalnotes);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, suppliernotes);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lockedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lockqty);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lockprice);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, quantityorder);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductUomId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, changestatus);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lockcause);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, orderedqty);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lockdate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, reqstatus);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mRequisitionlineId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mRequisitionId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mRequisitionlineId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mRequisitionId);
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
      "        INSERT INTO M_RequisitionLine " +
      "        (Line, Needbydate, M_Product_ID, M_AttributeSetInstance_ID, Qty, C_UOM_ID, C_BPartner_ID, M_PriceList_ID, PriceActual, LineNetAmt, C_Currency_ID, Description, PriceList, Discount, Gross_Unit_Price, Gross_Amt, Internalnotes, Suppliernotes, Lockedby, Lockqty, Lockprice, QuantityOrder, M_Product_Uom_Id, Changestatus, Lockcause, Orderedqty, Lockdate, Reqstatus, AD_Client_ID, M_Requisitionline_ID, M_Requisition_ID, IsActive, AD_Org_ID, created, createdby, updated, updatedBy)" +
      "        VALUES (TO_NUMBER(?), TO_DATE(?), (?), (?), TO_NUMBER(?), (?), (?), (?), TO_NUMBER(?), TO_NUMBER(?), (?), (?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), (?), (?), (?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), (?), (?), (?), TO_NUMBER(?), TO_DATE(?), (?), (?), (?), (?), (?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, line);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, needbydate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mAttributesetinstanceId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qty);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cUomId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mPricelistId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, priceactual);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, linenetamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCurrencyId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pricelist);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, discount);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, grossUnitPrice);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, grossAmt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, internalnotes);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, suppliernotes);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lockedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lockqty);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lockprice);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, quantityorder);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductUomId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, changestatus);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lockcause);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, orderedqty);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lockdate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, reqstatus);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mRequisitionlineId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mRequisitionId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
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

  public static int delete(ConnectionProvider connectionProvider, String param1, String mRequisitionId, String adUserClient, String adOrgClient)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        DELETE FROM M_RequisitionLine" +
      "        WHERE M_RequisitionLine.M_Requisitionline_ID = ? " +
      "                 AND M_RequisitionLine.M_Requisition_ID = ? " +
      "        AND M_RequisitionLine.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND M_RequisitionLine.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, param1);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mRequisitionId);
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
      "          FROM M_RequisitionLine" +
      "         WHERE M_RequisitionLine.M_Requisitionline_ID = ? ";

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
      "          FROM M_RequisitionLine" +
      "         WHERE M_RequisitionLine.M_Requisitionline_ID = ? ";

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
