//Sqlc generated V1.O00-1
package org.openbravo.erpCommon.ad_actionButton;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import java.util.*;

class CreateFromInvoiceData implements FieldProvider {
static Logger log4j = Logger.getLogger(CreateFromInvoiceData.class);
  private String InitRecordNumber="0";
  public String id;
  public String name;
  public String nameorder;
  public String nameshipment;
  public String qty;
  public String cUomId;
  public String uomsymbol;
  public String mProductId;
  public String relationName;
  public String cOrderlineId;
  public String line;
  public String adOrgId;
  public String stdprecision;
  public String mInoutlineId;
  public String priceactual;
  public String pricelist;
  public String pricelimit;
  public String description;
  public String pricestd;
  public String quantityorder;
  public String mProductUomId;
  public String mAttributesetinstanceId;
  public String mOfferId;
  public String priceprecision;
  public String taxbaseamt;
  public String cancelpricead;
  public String rate;
  public String grossUnitPrice;
  public String grosspricelist;
  public String grosspricestd;
  public String aAssetId;
  public String cProjectId;
  public String cCostcenterId;
  public String user1Id;
  public String user2Id;
  public String explode;
  public String isorder;
  public String isparent;
  public String bomParentId;
  public String rownum;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("id"))
      return id;
    else if (fieldName.equalsIgnoreCase("name"))
      return name;
    else if (fieldName.equalsIgnoreCase("nameorder"))
      return nameorder;
    else if (fieldName.equalsIgnoreCase("nameshipment"))
      return nameshipment;
    else if (fieldName.equalsIgnoreCase("qty"))
      return qty;
    else if (fieldName.equalsIgnoreCase("c_uom_id") || fieldName.equals("cUomId"))
      return cUomId;
    else if (fieldName.equalsIgnoreCase("uomsymbol"))
      return uomsymbol;
    else if (fieldName.equalsIgnoreCase("m_product_id") || fieldName.equals("mProductId"))
      return mProductId;
    else if (fieldName.equalsIgnoreCase("relation_name") || fieldName.equals("relationName"))
      return relationName;
    else if (fieldName.equalsIgnoreCase("c_orderline_id") || fieldName.equals("cOrderlineId"))
      return cOrderlineId;
    else if (fieldName.equalsIgnoreCase("line"))
      return line;
    else if (fieldName.equalsIgnoreCase("ad_org_id") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("stdprecision"))
      return stdprecision;
    else if (fieldName.equalsIgnoreCase("m_inoutline_id") || fieldName.equals("mInoutlineId"))
      return mInoutlineId;
    else if (fieldName.equalsIgnoreCase("priceactual"))
      return priceactual;
    else if (fieldName.equalsIgnoreCase("pricelist"))
      return pricelist;
    else if (fieldName.equalsIgnoreCase("pricelimit"))
      return pricelimit;
    else if (fieldName.equalsIgnoreCase("description"))
      return description;
    else if (fieldName.equalsIgnoreCase("pricestd"))
      return pricestd;
    else if (fieldName.equalsIgnoreCase("quantityorder"))
      return quantityorder;
    else if (fieldName.equalsIgnoreCase("m_product_uom_id") || fieldName.equals("mProductUomId"))
      return mProductUomId;
    else if (fieldName.equalsIgnoreCase("m_attributesetinstance_id") || fieldName.equals("mAttributesetinstanceId"))
      return mAttributesetinstanceId;
    else if (fieldName.equalsIgnoreCase("m_offer_id") || fieldName.equals("mOfferId"))
      return mOfferId;
    else if (fieldName.equalsIgnoreCase("priceprecision"))
      return priceprecision;
    else if (fieldName.equalsIgnoreCase("taxbaseamt"))
      return taxbaseamt;
    else if (fieldName.equalsIgnoreCase("cancelpricead"))
      return cancelpricead;
    else if (fieldName.equalsIgnoreCase("rate"))
      return rate;
    else if (fieldName.equalsIgnoreCase("gross_unit_price") || fieldName.equals("grossUnitPrice"))
      return grossUnitPrice;
    else if (fieldName.equalsIgnoreCase("grosspricelist"))
      return grosspricelist;
    else if (fieldName.equalsIgnoreCase("grosspricestd"))
      return grosspricestd;
    else if (fieldName.equalsIgnoreCase("a_asset_id") || fieldName.equals("aAssetId"))
      return aAssetId;
    else if (fieldName.equalsIgnoreCase("c_project_id") || fieldName.equals("cProjectId"))
      return cProjectId;
    else if (fieldName.equalsIgnoreCase("c_costcenter_id") || fieldName.equals("cCostcenterId"))
      return cCostcenterId;
    else if (fieldName.equalsIgnoreCase("user1_id") || fieldName.equals("user1Id"))
      return user1Id;
    else if (fieldName.equalsIgnoreCase("user2_id") || fieldName.equals("user2Id"))
      return user2Id;
    else if (fieldName.equalsIgnoreCase("explode"))
      return explode;
    else if (fieldName.equalsIgnoreCase("isorder"))
      return isorder;
    else if (fieldName.equalsIgnoreCase("isparent"))
      return isparent;
    else if (fieldName.equalsIgnoreCase("bom_parent_id") || fieldName.equals("bomParentId"))
      return bomParentId;
    else if (fieldName.equals("rownum"))
      return rownum;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static CreateFromInvoiceData[] selectFromPO(ConnectionProvider connectionProvider, String language, String piId, String adUserClient, String adOrgClient, String poId)    throws ServletException {
    return selectFromPO(connectionProvider, language, piId, adUserClient, adOrgClient, poId, 0, 0);
  }

  public static CreateFromInvoiceData[] selectFromPO(ConnectionProvider connectionProvider, String language, String piId, String adUserClient, String adOrgClient, String poId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT o.C_ORDER_ID as ID, Ad_Column_Identifier(to_char('C_Order'), to_char(o.c_order_id), to_char(?)) AS NAME, o.DocumentNo AS NAMEORDER," +
      "        '' AS NAMESHIPMENT," +
      "        l.QtyOrdered-SUM(COALESCE(m.Qty,0))-COALESCE((SELECT SUM(COALESCE(CI.QtyINVOICED, 0))  " +
      "       FROM C_ORDERLINE CO LEFT JOIN C_INVOICELINE CI ON CI.C_ORDERLINE_ID = CO.C_ORDERLINE_ID" +
      "       WHERE  CI.C_INVOICE_ID=? AND CO.C_ORDERLINE_ID = l.c_orderline_id" +
      "       GROUP BY CI.C_orderline_id , CO.QtyORDERED),0) AS QTY, " +
      "       l.C_UOM_ID,uom.UOMSymbol, l.M_Product_ID,Ad_Column_Identifier(to_char('M_Product'), to_char(l.m_product_id), to_char(?)) AS RELATION_NAME, " +
      "        l.C_OrderLine_ID,l.Line, l.ad_org_id, '' as STDPRECISION, " +
      "        '' as M_InOutLine_ID, '' AS PriceActual, '' AS PriceList, '' AS PriceLimit, '' AS Description, '' as PriceStd," +
      "        '' AS QUANTITYORDER, '' AS M_Product_UOM_ID, '' AS M_ATTRIBUTESETINSTANCE_ID, '' AS M_Offer_ID, '' AS PricePrecision," +
      "        l.taxbaseamt, l.CancelPriceAD, '' AS Rate, '' AS gross_unit_price, '' AS grosspricelist, '' AS grosspricestd," +
      "        COALESCE(l.A_Asset_ID, o.A_Asset_ID) AS A_Asset_ID, COALESCE(l.C_Project_ID, o.C_Project_ID) AS C_Project_ID," +
      "        COALESCE(l.C_Costcenter_ID, o.C_Costcenter_ID) AS C_Costcenter_ID," +
      "        COALESCE(l.User1_ID, o.User1_ID) AS User1_ID, COALESCE(l.User2_ID, o.User2_ID) AS User2_ID, l.explode, '' as isOrder, CASE WHEN l.Bom_parent_id is null then 'Y' else 'N' END as isparent, l.bom_parent_id" +
      "        FROM C_ORDERLINE l left join M_MATCHPO m on  l.C_OrderLine_ID=m.C_OrderLine_ID" +
      "                                                 AND m.C_InvoiceLine_ID IS NOT NULL, " +
      "        C_ORDER o, C_UOM uom,  M_PRODUCT p" +
      "        WHERE o.C_ORDER_ID = l.C_ORDER_ID " +
      "        AND o.IsSOTrx='N' " +
      "        AND o.DocStatus IN ('CL','CO') " +
      "        AND o.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND o.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") " +
      "        AND l.C_UOM_ID=uom.C_UOM_ID" +
      "        AND l.M_Product_ID=p.M_Product_ID" +
      "        AND l.C_Order_ID = ? " +
      "        AND NOT EXISTS (SELECT 1" +
      "                       FROM C_ORDERLINE CO LEFT JOIN C_INVOICELINE CI ON CI.C_ORDERLINE_ID = CO.C_ORDERLINE_ID left join M_MATCHPO m on  CO.C_OrderLine_ID=m.C_OrderLine_ID" +
      "                                                 AND m.C_InvoiceLine_ID IS NOT NULL" +
      "                       WHERE CO.C_ORDERLINE_ID = l.c_orderline_id AND CI.C_INVOICE_ID=? " +
      "                       GROUP BY CI.C_orderline_id , CO.QtyORDERED" +
      "                       HAVING (SUM(COALESCE(CI.QtyINVOICED, 0))-(COALESCE(CO.QtyORDERED,0)-SUM(COALESCE(m.Qty,0)))) >= 0 )   " +
      "        GROUP BY o.C_ORDER_ID, o.DocumentNo, o.DateOrdered, o.GrandTotal, l.QtyOrdered,l.C_UOM_ID," +
      "        uom.UOMSymbol,l.M_Product_ID,p.NAME,l.Line,l.C_OrderLine_ID, l.ad_org_id, l.taxbaseamt,l.CancelPriceAD," +
      "        COALESCE(l.A_Asset_ID, o.A_Asset_ID), COALESCE(l.C_Project_ID, o.C_Project_ID), COALESCE(l.C_Costcenter_ID, o.C_Costcenter_ID)," +
      "        COALESCE(l.User1_ID, o.User1_ID), COALESCE(l.User2_ID, o.User2_ID), l.explode, l.bom_parent_id " +
      "        HAVING ( (l.explode='Y') OR ((l.QtyOrdered-SUM(COALESCE(m.Qty,0))) <> 0)) " +
      "        ORDER BY NAME, l.Line";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, language);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, piId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, language);
      if (adUserClient != null && !(adUserClient.equals(""))) {
        }
      if (adOrgClient != null && !(adOrgClient.equals(""))) {
        }
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, poId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, piId);

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
        CreateFromInvoiceData objectCreateFromInvoiceData = new CreateFromInvoiceData();
        objectCreateFromInvoiceData.id = UtilSql.getValue(result, "id");
        objectCreateFromInvoiceData.name = UtilSql.getValue(result, "name");
        objectCreateFromInvoiceData.nameorder = UtilSql.getValue(result, "nameorder");
        objectCreateFromInvoiceData.nameshipment = UtilSql.getValue(result, "nameshipment");
        objectCreateFromInvoiceData.qty = UtilSql.getValue(result, "qty");
        objectCreateFromInvoiceData.cUomId = UtilSql.getValue(result, "c_uom_id");
        objectCreateFromInvoiceData.uomsymbol = UtilSql.getValue(result, "uomsymbol");
        objectCreateFromInvoiceData.mProductId = UtilSql.getValue(result, "m_product_id");
        objectCreateFromInvoiceData.relationName = UtilSql.getValue(result, "relation_name");
        objectCreateFromInvoiceData.cOrderlineId = UtilSql.getValue(result, "c_orderline_id");
        objectCreateFromInvoiceData.line = UtilSql.getValue(result, "line");
        objectCreateFromInvoiceData.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectCreateFromInvoiceData.stdprecision = UtilSql.getValue(result, "stdprecision");
        objectCreateFromInvoiceData.mInoutlineId = UtilSql.getValue(result, "m_inoutline_id");
        objectCreateFromInvoiceData.priceactual = UtilSql.getValue(result, "priceactual");
        objectCreateFromInvoiceData.pricelist = UtilSql.getValue(result, "pricelist");
        objectCreateFromInvoiceData.pricelimit = UtilSql.getValue(result, "pricelimit");
        objectCreateFromInvoiceData.description = UtilSql.getValue(result, "description");
        objectCreateFromInvoiceData.pricestd = UtilSql.getValue(result, "pricestd");
        objectCreateFromInvoiceData.quantityorder = UtilSql.getValue(result, "quantityorder");
        objectCreateFromInvoiceData.mProductUomId = UtilSql.getValue(result, "m_product_uom_id");
        objectCreateFromInvoiceData.mAttributesetinstanceId = UtilSql.getValue(result, "m_attributesetinstance_id");
        objectCreateFromInvoiceData.mOfferId = UtilSql.getValue(result, "m_offer_id");
        objectCreateFromInvoiceData.priceprecision = UtilSql.getValue(result, "priceprecision");
        objectCreateFromInvoiceData.taxbaseamt = UtilSql.getValue(result, "taxbaseamt");
        objectCreateFromInvoiceData.cancelpricead = UtilSql.getValue(result, "cancelpricead");
        objectCreateFromInvoiceData.rate = UtilSql.getValue(result, "rate");
        objectCreateFromInvoiceData.grossUnitPrice = UtilSql.getValue(result, "gross_unit_price");
        objectCreateFromInvoiceData.grosspricelist = UtilSql.getValue(result, "grosspricelist");
        objectCreateFromInvoiceData.grosspricestd = UtilSql.getValue(result, "grosspricestd");
        objectCreateFromInvoiceData.aAssetId = UtilSql.getValue(result, "a_asset_id");
        objectCreateFromInvoiceData.cProjectId = UtilSql.getValue(result, "c_project_id");
        objectCreateFromInvoiceData.cCostcenterId = UtilSql.getValue(result, "c_costcenter_id");
        objectCreateFromInvoiceData.user1Id = UtilSql.getValue(result, "user1_id");
        objectCreateFromInvoiceData.user2Id = UtilSql.getValue(result, "user2_id");
        objectCreateFromInvoiceData.explode = UtilSql.getValue(result, "explode");
        objectCreateFromInvoiceData.isorder = UtilSql.getValue(result, "isorder");
        objectCreateFromInvoiceData.isparent = UtilSql.getValue(result, "isparent");
        objectCreateFromInvoiceData.bomParentId = UtilSql.getValue(result, "bom_parent_id");
        objectCreateFromInvoiceData.rownum = Long.toString(countRecord);
        objectCreateFromInvoiceData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectCreateFromInvoiceData);
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
    CreateFromInvoiceData objectCreateFromInvoiceData[] = new CreateFromInvoiceData[vector.size()];
    vector.copyInto(objectCreateFromInvoiceData);
    return(objectCreateFromInvoiceData);
  }

  public static CreateFromInvoiceData[] selectFromPOCombo(ConnectionProvider connectionProvider, String language, String adUserClient, String adOrgClient, String cBpartnerId, String isTaxIncluded)    throws ServletException {
    return selectFromPOCombo(connectionProvider, language, adUserClient, adOrgClient, cBpartnerId, isTaxIncluded, 0, 0);
  }

  public static CreateFromInvoiceData[] selectFromPOCombo(ConnectionProvider connectionProvider, String language, String adUserClient, String adOrgClient, String cBpartnerId, String isTaxIncluded, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT o.C_ORDER_ID as ID, Ad_Column_Identifier(to_char('C_Order'), to_char(o.c_order_id), to_char(?)) AS NAME " +
      "        FROM C_ORDER o JOIN m_pricelist pl ON o.m_pricelist_id = pl.m_pricelist_id" +
      "        WHERE o.IsSOTrx='N' " +
      "        AND o.DocStatus IN ('CL','CO') " +
      "        AND o.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND o.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ")" +
      "        AND o.C_BPartner_ID = ?" +
      "        AND pl.istaxincluded = ?" +
      "        AND EXISTS (SELECT 1 " +
      "                     FROM C_ORDERLINE l left join M_MATCHPO m on  l.C_OrderLine_ID=m.C_OrderLine_ID" +
      "                                                              and m.C_InvoiceLine_ID IS NOT NULL  " +
      "                    WHERE l.C_ORDER_ID = o.C_ORDER_ID  " +
      "                    GROUP BY l.QtyOrdered,l.C_OrderLine_ID " +
      "                    HAVING (l.QtyOrdered-SUM(COALESCE(m.Qty,0))) <> 0)" +
      "        ORDER BY NAME";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, language);
      if (adUserClient != null && !(adUserClient.equals(""))) {
        }
      if (adOrgClient != null && !(adOrgClient.equals(""))) {
        }
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isTaxIncluded);

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
        CreateFromInvoiceData objectCreateFromInvoiceData = new CreateFromInvoiceData();
        objectCreateFromInvoiceData.id = UtilSql.getValue(result, "id");
        objectCreateFromInvoiceData.name = UtilSql.getValue(result, "name");
        objectCreateFromInvoiceData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectCreateFromInvoiceData);
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
    CreateFromInvoiceData objectCreateFromInvoiceData[] = new CreateFromInvoiceData[vector.size()];
    vector.copyInto(objectCreateFromInvoiceData);
    return(objectCreateFromInvoiceData);
  }

  public static CreateFromInvoiceData[] selectFromPOSOTrx(ConnectionProvider connectionProvider, String language, String adUserClient, String adOrgClient, String poId)    throws ServletException {
    return selectFromPOSOTrx(connectionProvider, language, adUserClient, adOrgClient, poId, 0, 0);
  }

  public static CreateFromInvoiceData[] selectFromPOSOTrx(ConnectionProvider connectionProvider, String language, String adUserClient, String adOrgClient, String poId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT o.C_ORDER_ID as ID, Ad_Column_Identifier(to_char('C_Order'), to_char(o.c_order_id), to_char(?)) AS NAME,o.DocumentNo AS NAMEORDER," +
      "        l.QtyOrdered-COALESCE(l.QTYINVOICED,0) AS QTY, l.C_UOM_ID,uom.UOMSymbol, l.M_Product_ID," +
      "	Ad_Column_Identifier(to_char('M_Product'), to_char(l.m_product_id), to_char(?)) AS RELATION_NAME, " +
      "        l.C_OrderLine_ID,l.Line, l.ad_Org_id, l.taxbaseamt," +
      "        COALESCE(l.A_Asset_ID, o.A_Asset_ID) AS A_Asset_ID, COALESCE(l.C_Project_ID, o.C_Project_ID) AS C_Project_ID, COALESCE(l.C_Costcenter_ID, o.C_Costcenter_ID) AS C_Costcenter_ID," +
      "        COALESCE(l.User1_ID, o.User1_ID) AS User1_ID, COALESCE(l.User2_ID, o.User2_ID) AS User2_ID, l.explode, l.Bom_parent_id, " +
      "         CASE WHEN l.Bom_parent_id is null then 'Y' else 'N' END as isparent" +
      "        FROM C_INVOICE_CANDIDATE_V ic, C_UOM uom, C_ORDER o, C_ORDERLINE l, M_PRODUCT p " +
      "        WHERE l.C_UOM_ID=uom.C_UOM_ID" +
      "        AND o.C_ORDER_ID = ic.C_ORDER_ID " +
      "        AND o.C_ORDER_ID=l.C_ORDER_ID " +
      "        AND ic.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND ic.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") " +
      "        AND l.M_Product_ID=p.M_Product_ID " +
      "        AND ic.C_Order_ID = ? " +
      "        GROUP BY o.C_ORDER_ID, o.DocumentNo, o.DateOrdered, o.GrandTotal, l.QtyOrdered," +
      "        l.C_UOM_ID,uom.UOMSymbol,l.M_Product_ID,p.NAME,l.Line,l.C_OrderLine_ID, l.QTYINVOICED, l.ad_org_id, l.taxbaseamt," +
      "        COALESCE(l.A_Asset_ID, o.A_Asset_ID), COALESCE(l.C_Project_ID, o.C_Project_ID), COALESCE(l.C_Costcenter_ID, o.C_Costcenter_ID)," +
      "        COALESCE(l.User1_ID, o.User1_ID), COALESCE(l.User2_ID, o.User2_ID), l.explode, l.Bom_parent_id" +
      "        ORDER BY NAME, l.Line";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, language);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, language);
      if (adUserClient != null && !(adUserClient.equals(""))) {
        }
      if (adOrgClient != null && !(adOrgClient.equals(""))) {
        }
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, poId);

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
        CreateFromInvoiceData objectCreateFromInvoiceData = new CreateFromInvoiceData();
        objectCreateFromInvoiceData.id = UtilSql.getValue(result, "id");
        objectCreateFromInvoiceData.name = UtilSql.getValue(result, "name");
        objectCreateFromInvoiceData.nameorder = UtilSql.getValue(result, "nameorder");
        objectCreateFromInvoiceData.qty = UtilSql.getValue(result, "qty");
        objectCreateFromInvoiceData.cUomId = UtilSql.getValue(result, "c_uom_id");
        objectCreateFromInvoiceData.uomsymbol = UtilSql.getValue(result, "uomsymbol");
        objectCreateFromInvoiceData.mProductId = UtilSql.getValue(result, "m_product_id");
        objectCreateFromInvoiceData.relationName = UtilSql.getValue(result, "relation_name");
        objectCreateFromInvoiceData.cOrderlineId = UtilSql.getValue(result, "c_orderline_id");
        objectCreateFromInvoiceData.line = UtilSql.getValue(result, "line");
        objectCreateFromInvoiceData.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectCreateFromInvoiceData.taxbaseamt = UtilSql.getValue(result, "taxbaseamt");
        objectCreateFromInvoiceData.aAssetId = UtilSql.getValue(result, "a_asset_id");
        objectCreateFromInvoiceData.cProjectId = UtilSql.getValue(result, "c_project_id");
        objectCreateFromInvoiceData.cCostcenterId = UtilSql.getValue(result, "c_costcenter_id");
        objectCreateFromInvoiceData.user1Id = UtilSql.getValue(result, "user1_id");
        objectCreateFromInvoiceData.user2Id = UtilSql.getValue(result, "user2_id");
        objectCreateFromInvoiceData.explode = UtilSql.getValue(result, "explode");
        objectCreateFromInvoiceData.bomParentId = UtilSql.getValue(result, "bom_parent_id");
        objectCreateFromInvoiceData.isparent = UtilSql.getValue(result, "isparent");
        objectCreateFromInvoiceData.rownum = Long.toString(countRecord);
        objectCreateFromInvoiceData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectCreateFromInvoiceData);
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
    CreateFromInvoiceData objectCreateFromInvoiceData[] = new CreateFromInvoiceData[vector.size()];
    vector.copyInto(objectCreateFromInvoiceData);
    return(objectCreateFromInvoiceData);
  }

  public static CreateFromInvoiceData[] selectFromPOSOTrxCombo(ConnectionProvider connectionProvider, String language, String adUserClient, String adOrgClient, String cBpartnerId, String isTaxIncluded)    throws ServletException {
    return selectFromPOSOTrxCombo(connectionProvider, language, adUserClient, adOrgClient, cBpartnerId, isTaxIncluded, 0, 0);
  }

  public static CreateFromInvoiceData[] selectFromPOSOTrxCombo(ConnectionProvider connectionProvider, String language, String adUserClient, String adOrgClient, String cBpartnerId, String isTaxIncluded, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT o.C_ORDER_ID as ID, Ad_Column_Identifier(to_char('C_Order'), to_char(o.c_order_id), to_char(?)) AS NAME " +
      "        FROM C_INVOICE_CANDIDATE_V ic," +
      "             C_ORDER o JOIN m_pricelist pl ON o.m_pricelist_id = pl.m_pricelist_id" +
      "        WHERE o.C_ORDER_ID = ic.C_ORDER_ID " +
      "        AND ic.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND ic.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") " +
      "        AND ic.C_BPartner_ID = ?" +
      "        AND pl.istaxincluded = ? " +
      "        AND o.C_Order_Id = ic.C_Order_Id" +
      "        AND ((ic.term = 'D' AND ic.qtydelivered <>0) OR (ic.term = 'I' AND exists (SELECT 1 FROM C_ORDERLINE ol WHERE ol.C_ORDER_ID = o.C_ORDER_ID group by ol.c_orderline_id having SUM(ol.QTYORDERED)-SUM(ol.QTYINVOICED)<>0)) OR (ic.term <> 'N' AND (ic.term IN ('O','S') AND (ic.qtyordered = ic.qtydelivered) )) )" +
      "        GROUP BY o.C_ORDER_ID, o.DocumentNo, o.DateOrdered, o.GrandTotal " +
      "        ORDER BY NAME";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, language);
      if (adUserClient != null && !(adUserClient.equals(""))) {
        }
      if (adOrgClient != null && !(adOrgClient.equals(""))) {
        }
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isTaxIncluded);

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
        CreateFromInvoiceData objectCreateFromInvoiceData = new CreateFromInvoiceData();
        objectCreateFromInvoiceData.id = UtilSql.getValue(result, "id");
        objectCreateFromInvoiceData.name = UtilSql.getValue(result, "name");
        objectCreateFromInvoiceData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectCreateFromInvoiceData);
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
    CreateFromInvoiceData objectCreateFromInvoiceData[] = new CreateFromInvoiceData[vector.size()];
    vector.copyInto(objectCreateFromInvoiceData);
    return(objectCreateFromInvoiceData);
  }

  public static CreateFromInvoiceData[] selectFromPOTrl(ConnectionProvider connectionProvider, String adLanguage, String piId, String adUserClient, String adOrgClient, String poId)    throws ServletException {
    return selectFromPOTrl(connectionProvider, adLanguage, piId, adUserClient, adOrgClient, poId, 0, 0);
  }

  public static CreateFromInvoiceData[] selectFromPOTrl(ConnectionProvider connectionProvider, String adLanguage, String piId, String adUserClient, String adOrgClient, String poId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT o.C_ORDER_ID as ID, Ad_Column_Identifier(to_char('C_Order'), to_char(o.c_order_id), to_char(?)) AS NAME, o.DocumentNo AS NAMEORDER," +
      "        l.QtyOrdered-SUM(COALESCE(m.Qty,0))-" +
      "        COALESCE((SELECT SUM(COALESCE(CI.QtyINVOICED, 0))  " +
      "        FROM C_ORDERLINE CO LEFT JOIN C_INVOICELINE CI ON CI.C_ORDERLINE_ID = CO.C_ORDERLINE_ID" +
      "        WHERE  CI.C_INVOICE_ID=? AND CO.C_ORDERLINE_ID = l.c_orderline_id" +
      "        GROUP BY CI.C_orderline_id , CO.QtyORDERED),0) AS QTY, " +
      "        l.C_UOM_ID, COALESCE(uomt.UOMSYMBOL, uom.UOMSymbol) AS UOMSymbol, " +
      "        l.M_Product_ID,Ad_Column_Identifier(to_char('M_Product'), to_char(l.m_product_id), to_char(?)) AS RELATION_NAME, l.C_OrderLine_ID,l.Line, l.taxbaseamt," +
      "        COALESCE(l.A_Asset_ID, o.A_Asset_ID) AS A_Asset_ID, COALESCE(l.C_Project_ID, o.C_Project_ID) AS C_Project_ID, COALESCE(l.C_Costcenter_ID, o.C_Costcenter_ID) AS C_Costcenter_ID," +
      "        COALESCE(l.User1_ID, o.User1_ID) AS User1_ID, COALESCE(l.User2_ID, o.User2_ID) AS User2_ID " +
      "        FROM C_UOM uom left join  C_UOM_TRL uomt on uom.C_UOM_ID = uomt.C_UOM_ID" +
      "                                                and uomt.AD_Language = ?," +
      "             C_ORDERLINE l left join M_MATCHPO m on l.C_OrderLine_ID=m.C_OrderLine_ID" +
      "                                                and m.C_InvoiceLine_ID IS NOT NULL," +
      "        C_ORDER o, M_PRODUCT p" +
      "        WHERE o.C_ORDER_ID = l.C_ORDER_ID " +
      "        AND o.IsSOTrx='N' " +
      "        AND o.DocStatus IN ('CL','CO') " +
      "        AND o.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND o.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") " +
      "        AND l.C_UOM_ID=uom.C_UOM_ID " +
      "        AND l.M_Product_ID=p.M_Product_ID  " +
      "        AND l.C_Order_ID = ? " +
      "        AND NOT EXISTS (SELECT 1" +
      "                       FROM C_ORDERLINE CO LEFT JOIN C_INVOICELINE CI ON CI.C_ORDERLINE_ID = CO.C_ORDERLINE_ID left join M_MATCHPO m on  CO.C_OrderLine_ID=m.C_OrderLine_ID" +
      "                                                 AND m.C_InvoiceLine_ID IS NOT NULL" +
      "                       WHERE CO.C_ORDERLINE_ID = l.c_orderline_id AND CI.C_INVOICE_ID=? " +
      "                       GROUP BY CI.C_orderline_id , CO.QtyORDERED" +
      "                       HAVING (SUM(COALESCE(CI.QtyINVOICED, 0))-(COALESCE(CO.QtyORDERED,0)-SUM(COALESCE(m.Qty,0)))) >= 0 )  " +
      "        GROUP BY o.C_ORDER_ID, o.DocumentNo, o.DateOrdered, o.GrandTotal, l.QtyOrdered,l.C_UOM_ID," +
      "        uom.UOMSymbol, uomt.UOMSYMBOL,l.M_Product_ID,p.NAME,l.Line,l.C_OrderLine_ID," +
      "        l.taxbaseamt, COALESCE(l.A_Asset_ID, o.A_Asset_ID), COALESCE(l.C_Project_ID, o.C_Project_ID), COALESCE(l.C_Costcenter_ID, o.C_Costcenter_ID)," +
      "        COALESCE(l.User1_ID, o.User1_ID), COALESCE(l.User2_ID, o.User2_ID)" +
      "        HAVING (l.QtyOrdered-SUM(COALESCE(m.Qty,0))) <> 0" +
      "        ORDER BY NAME, l.Line";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, piId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      if (adUserClient != null && !(adUserClient.equals(""))) {
        }
      if (adOrgClient != null && !(adOrgClient.equals(""))) {
        }
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, poId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, piId);

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
        CreateFromInvoiceData objectCreateFromInvoiceData = new CreateFromInvoiceData();
        objectCreateFromInvoiceData.id = UtilSql.getValue(result, "id");
        objectCreateFromInvoiceData.name = UtilSql.getValue(result, "name");
        objectCreateFromInvoiceData.nameorder = UtilSql.getValue(result, "nameorder");
        objectCreateFromInvoiceData.qty = UtilSql.getValue(result, "qty");
        objectCreateFromInvoiceData.cUomId = UtilSql.getValue(result, "c_uom_id");
        objectCreateFromInvoiceData.uomsymbol = UtilSql.getValue(result, "uomsymbol");
        objectCreateFromInvoiceData.mProductId = UtilSql.getValue(result, "m_product_id");
        objectCreateFromInvoiceData.relationName = UtilSql.getValue(result, "relation_name");
        objectCreateFromInvoiceData.cOrderlineId = UtilSql.getValue(result, "c_orderline_id");
        objectCreateFromInvoiceData.line = UtilSql.getValue(result, "line");
        objectCreateFromInvoiceData.taxbaseamt = UtilSql.getValue(result, "taxbaseamt");
        objectCreateFromInvoiceData.aAssetId = UtilSql.getValue(result, "a_asset_id");
        objectCreateFromInvoiceData.cProjectId = UtilSql.getValue(result, "c_project_id");
        objectCreateFromInvoiceData.cCostcenterId = UtilSql.getValue(result, "c_costcenter_id");
        objectCreateFromInvoiceData.user1Id = UtilSql.getValue(result, "user1_id");
        objectCreateFromInvoiceData.user2Id = UtilSql.getValue(result, "user2_id");
        objectCreateFromInvoiceData.rownum = Long.toString(countRecord);
        objectCreateFromInvoiceData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectCreateFromInvoiceData);
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
    CreateFromInvoiceData objectCreateFromInvoiceData[] = new CreateFromInvoiceData[vector.size()];
    vector.copyInto(objectCreateFromInvoiceData);
    return(objectCreateFromInvoiceData);
  }

  public static CreateFromInvoiceData[] selectFromPOTrlSOTrx(ConnectionProvider connectionProvider, String adLanguage, String adUserClient, String adOrgClient, String poId)    throws ServletException {
    return selectFromPOTrlSOTrx(connectionProvider, adLanguage, adUserClient, adOrgClient, poId, 0, 0);
  }

  public static CreateFromInvoiceData[] selectFromPOTrlSOTrx(ConnectionProvider connectionProvider, String adLanguage, String adUserClient, String adOrgClient, String poId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT o.C_ORDER_ID as ID, Ad_Column_Identifier(to_char('C_Order'), to_char(o.c_order_id), to_char(?) ) AS NAME,o.DocumentNo AS NAMEORDER," +
      "        l.QtyOrdered-COALESCE(l.QTYINVOICED,0) AS QTY, l.C_UOM_ID, COALESCE(uomt.UOMSymbol, uom.UOMSymbol) AS UOMSymbol, " +
      "        l.M_Product_ID,Ad_Column_Identifier(to_char('M_Product'), to_char(l.m_product_id), to_char(?)) AS RELATION_NAME, l.C_OrderLine_ID,l.Line, l.taxbaseamt," +
      "        COALESCE(l.A_Asset_ID, o.A_Asset_ID) AS A_Asset_ID, COALESCE(l.C_Project_ID, o.C_Project_ID) AS C_Project_ID, COALESCE(l.C_Costcenter_ID, o.C_Costcenter_ID) AS C_Costcenter_ID," +
      "        COALESCE(l.User1_ID, o.User1_ID) AS User1_ID, COALESCE(l.User2_ID, o.User2_ID) AS User2_ID" +
      "        FROM C_UOM uom left join C_UOM_TRL uomt on uom.C_UOM_ID = uomt.C_UOM_ID" +
      "                                               and  uomt.AD_Language = ?, " +
      "        C_INVOICE_CANDIDATE_V ic,   C_ORDER o, C_ORDERLINE l, M_PRODUCT p " +
      "        WHERE l.C_UOM_ID=uom.C_UOM_ID" +
      "        AND o.C_ORDER_ID = ic.C_ORDER_ID " +
      "        AND o.C_ORDER_ID=l.C_ORDER_ID " +
      "        AND ic.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND ic.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") " +
      "        AND l.M_Product_ID=p.M_Product_ID" +
      "        AND ic.C_Order_ID = ? " +
      "        GROUP BY o.C_ORDER_ID, o.DocumentNo, o.DateOrdered, o.GrandTotal, l.QtyOrdered," +
      "        l.C_UOM_ID,uom.UOMSymbol, uomt.UOMSymbol,l.M_Product_ID,p.NAME,l.Line,l.C_OrderLine_ID, l.QTYINVOICED," +
      "        l.taxbaseamt, COALESCE(l.A_Asset_ID, o.A_Asset_ID), COALESCE(l.C_Project_ID, o.C_Project_ID), COALESCE(l.C_Costcenter_ID, o.C_Costcenter_ID)," +
      "        COALESCE(l.User1_ID, o.User1_ID), COALESCE(l.User2_ID, o.User2_ID)" +
      "        ORDER BY NAME, l.Line";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      if (adUserClient != null && !(adUserClient.equals(""))) {
        }
      if (adOrgClient != null && !(adOrgClient.equals(""))) {
        }
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, poId);

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
        CreateFromInvoiceData objectCreateFromInvoiceData = new CreateFromInvoiceData();
        objectCreateFromInvoiceData.id = UtilSql.getValue(result, "id");
        objectCreateFromInvoiceData.name = UtilSql.getValue(result, "name");
        objectCreateFromInvoiceData.nameorder = UtilSql.getValue(result, "nameorder");
        objectCreateFromInvoiceData.qty = UtilSql.getValue(result, "qty");
        objectCreateFromInvoiceData.cUomId = UtilSql.getValue(result, "c_uom_id");
        objectCreateFromInvoiceData.uomsymbol = UtilSql.getValue(result, "uomsymbol");
        objectCreateFromInvoiceData.mProductId = UtilSql.getValue(result, "m_product_id");
        objectCreateFromInvoiceData.relationName = UtilSql.getValue(result, "relation_name");
        objectCreateFromInvoiceData.cOrderlineId = UtilSql.getValue(result, "c_orderline_id");
        objectCreateFromInvoiceData.line = UtilSql.getValue(result, "line");
        objectCreateFromInvoiceData.taxbaseamt = UtilSql.getValue(result, "taxbaseamt");
        objectCreateFromInvoiceData.aAssetId = UtilSql.getValue(result, "a_asset_id");
        objectCreateFromInvoiceData.cProjectId = UtilSql.getValue(result, "c_project_id");
        objectCreateFromInvoiceData.cCostcenterId = UtilSql.getValue(result, "c_costcenter_id");
        objectCreateFromInvoiceData.user1Id = UtilSql.getValue(result, "user1_id");
        objectCreateFromInvoiceData.user2Id = UtilSql.getValue(result, "user2_id");
        objectCreateFromInvoiceData.rownum = Long.toString(countRecord);
        objectCreateFromInvoiceData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectCreateFromInvoiceData);
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
    CreateFromInvoiceData objectCreateFromInvoiceData[] = new CreateFromInvoiceData[vector.size()];
    vector.copyInto(objectCreateFromInvoiceData);
    return(objectCreateFromInvoiceData);
  }

  public static CreateFromInvoiceData[] selectFromPOUpdate(Connection conn, ConnectionProvider connectionProvider, String adLanguage, String piId, String cOrderlineId)    throws ServletException {
    return selectFromPOUpdate(conn, connectionProvider, adLanguage, piId, cOrderlineId, 0, 0);
  }

  public static CreateFromInvoiceData[] selectFromPOUpdate(Connection conn, ConnectionProvider connectionProvider, String adLanguage, String piId, String cOrderlineId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT (CASE WHEN B.M_InOutLine_ID IS NULL THEN A.QTY ELSE B.QTY END) AS ID, " +
      "      A.C_UOM_ID,uom.UOMSymbol, A.M_Product_ID,Ad_Column_Identifier(to_char('M_Product'), to_char(A.m_product_id), to_char(?)) AS NAME, " +
      "      A.C_OrderLine_ID,A.Line, uom.stdprecision AS stdprecision, cur.priceprecision, " +
      "      B.M_InOutLine_ID, A.Description, (CASE WHEN B.M_InOutLine_ID IS NULL THEN A.quantityOrder ELSE B.quantityOrder END) AS quantityOrder, " +
      "      (CASE WHEN B.M_InOutLine_ID IS NULL THEN A.M_Product_UOM_ID ELSE B.M_Product_UOM_ID END) AS M_Product_UOM_ID, A.M_ATTRIBUTESETINSTANCE_ID, A.ad_org_id," +
      "      A.taxbaseamt, A.a_asset_id, A.c_project_id, A.c_costcenter_id, A.user1_id, A.user2_id, A.explode, 'Y' as isOrder" +
      "      FROM c_currency cur,C_UOM uom, M_PRODUCT p, " +
      "      (SELECT COALESCE(l.A_Asset_ID, o.A_Asset_ID) AS A_Asset_ID, COALESCE(l.C_Project_ID, o.C_Project_ID) AS C_Project_ID, COALESCE(l.C_Costcenter_ID, o.C_Costcenter_ID) AS C_Costcenter_ID," +
      "       COALESCE(l.User1_ID, o.User1_ID) AS User1_ID, COALESCE(l.User2_ID, o.User2_ID) AS User2_ID, l.explode,l.ad_org_id,l.C_CURRENCY_ID,l.C_UOM_ID, l.M_Product_ID, l.Line, l.Description, l.C_OrderLine_ID, (l.QtyOrdered-SUM(COALESCE(mp.Qty,0))-" +
      "       COALESCE((SELECT SUM(COALESCE(CI.QtyINVOICED, 0))  " +
      "       FROM C_ORDERLINE CO LEFT JOIN C_INVOICELINE CI ON CI.C_ORDERLINE_ID = CO.C_ORDERLINE_ID" +
      "       WHERE  CI.C_INVOICE_ID=? AND CO.C_ORDERLINE_ID = l.c_orderline_id" +
      "       GROUP BY CI.C_orderline_id , CO.QtyORDERED),0)) AS QTY," +
      "      l.quantityOrder*C_DIVIDE((l.QtyOrdered-SUM(COALESCE(mp.Qty,0))-COALESCE((SELECT SUM(COALESCE(CI.QtyINVOICED, 0))  " +
      "       FROM C_ORDERLINE CO LEFT JOIN C_INVOICELINE CI ON CI.C_ORDERLINE_ID = CO.C_ORDERLINE_ID" +
      "       WHERE  CI.C_INVOICE_ID=? AND CO.C_ORDERLINE_ID = l.c_orderline_id" +
      "       GROUP BY CI.C_orderline_id , CO.QtyORDERED),0)),l.QtyOrdered) as quantityOrder, " +
      "       l.M_Product_UOM_ID, l.M_ATTRIBUTESETINSTANCE_ID, l.taxbaseamt" +
      "        FROM C_ORDERLINE l left join M_MATCHPO mp on l.C_OrderLine_ID=mp.C_OrderLine_ID" +
      "                                                  and mp.C_InvoiceLine_ID IS NOT NULL" +
      "        LEFT JOIN C_Order o ON l.C_Order_ID = o.C_Order_ID" +
      "        GROUP BY l.ad_org_id,l.C_CURRENCY_ID,l.C_UOM_ID, l.M_Product_ID, l.Line, l.Description, l.C_OrderLine_ID, l.QtyOrdered, l.quantityOrder, l.M_Product_UOM_ID," +
      "        l.M_ATTRIBUTESETINSTANCE_ID, l.taxbaseamt, COALESCE(l.A_Asset_ID, o.A_Asset_ID), COALESCE(l.C_Project_ID, o.C_Project_ID), COALESCE(l.C_Costcenter_ID, o.C_Costcenter_ID)," +
      "        COALESCE(l.User1_ID, o.User1_ID), COALESCE(l.User2_ID, o.User2_ID), l.explode) A left join " +
      "      (SELECT il.M_InOutLine_ID, il.C_OrderLine_ID, (il.MovementQty-SUM(COALESCE(mi.Qty,0))) AS QTY," +
      "      il.quantityOrder*C_DIVIDE((il.MovementQty-SUM(COALESCE(mi.Qty,0))),(il.MovementQty)) as quantityOrder, il.M_Product_UOM_ID" +
      "        FROM M_INOUTLINE il left join M_MATCHINV mi on il.M_InOutLine_ID=mi.M_InOutLine_ID," +
      "             M_INOUT io" +
      "        WHERE il.C_OrderLine_ID IS NOT NULL" +
      "        AND io.M_InOut_ID = il.M_InOut_ID" +
      "        AND io.Processed = 'Y'" +
      "        GROUP BY il.M_InOutLine_ID, il.C_OrderLine_ID, il.MovementQty, il.quantityOrder, il.M_Product_UOM_ID" +
      "        HAVING (il.MovementQty-SUM(COALESCE(mi.Qty,0))) <> 0) B on A.C_OrderLine_ID=B.C_OrderLine_ID" +
      "      WHERE A.C_UOM_ID=uom.C_UOM_ID" +
      "      AND cur.C_CURRENCY_ID=A.C_CURRENCY_ID" +
      "      AND A.M_Product_ID=p.M_Product_ID";
    strSql = strSql + ((cOrderlineId==null || cOrderlineId.equals(""))?"":"  AND A.C_OrderLine_ID IN " + cOrderlineId);
    strSql = strSql + 
      "      ORDER BY A.Line";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, piId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, piId);
      if (cOrderlineId != null && !(cOrderlineId.equals(""))) {
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
        CreateFromInvoiceData objectCreateFromInvoiceData = new CreateFromInvoiceData();
        objectCreateFromInvoiceData.id = UtilSql.getValue(result, "id");
        objectCreateFromInvoiceData.cUomId = UtilSql.getValue(result, "c_uom_id");
        objectCreateFromInvoiceData.uomsymbol = UtilSql.getValue(result, "uomsymbol");
        objectCreateFromInvoiceData.mProductId = UtilSql.getValue(result, "m_product_id");
        objectCreateFromInvoiceData.name = UtilSql.getValue(result, "name");
        objectCreateFromInvoiceData.cOrderlineId = UtilSql.getValue(result, "c_orderline_id");
        objectCreateFromInvoiceData.line = UtilSql.getValue(result, "line");
        objectCreateFromInvoiceData.stdprecision = UtilSql.getValue(result, "stdprecision");
        objectCreateFromInvoiceData.priceprecision = UtilSql.getValue(result, "priceprecision");
        objectCreateFromInvoiceData.mInoutlineId = UtilSql.getValue(result, "m_inoutline_id");
        objectCreateFromInvoiceData.description = UtilSql.getValue(result, "description");
        objectCreateFromInvoiceData.quantityorder = UtilSql.getValue(result, "quantityorder");
        objectCreateFromInvoiceData.mProductUomId = UtilSql.getValue(result, "m_product_uom_id");
        objectCreateFromInvoiceData.mAttributesetinstanceId = UtilSql.getValue(result, "m_attributesetinstance_id");
        objectCreateFromInvoiceData.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectCreateFromInvoiceData.taxbaseamt = UtilSql.getValue(result, "taxbaseamt");
        objectCreateFromInvoiceData.aAssetId = UtilSql.getValue(result, "a_asset_id");
        objectCreateFromInvoiceData.cProjectId = UtilSql.getValue(result, "c_project_id");
        objectCreateFromInvoiceData.cCostcenterId = UtilSql.getValue(result, "c_costcenter_id");
        objectCreateFromInvoiceData.user1Id = UtilSql.getValue(result, "user1_id");
        objectCreateFromInvoiceData.user2Id = UtilSql.getValue(result, "user2_id");
        objectCreateFromInvoiceData.explode = UtilSql.getValue(result, "explode");
        objectCreateFromInvoiceData.isorder = UtilSql.getValue(result, "isorder");
        objectCreateFromInvoiceData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectCreateFromInvoiceData);
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
        connectionProvider.releaseTransactionalPreparedStatement(st);
      } catch(Exception ignore){
        ignore.printStackTrace();
      }
    }
    CreateFromInvoiceData objectCreateFromInvoiceData[] = new CreateFromInvoiceData[vector.size()];
    vector.copyInto(objectCreateFromInvoiceData);
    return(objectCreateFromInvoiceData);
  }

  public static CreateFromInvoiceData[] selectFromPOUpdateSOTrx(Connection conn, ConnectionProvider connectionProvider, String adLanguage, String cOrderlineId)    throws ServletException {
    return selectFromPOUpdateSOTrx(conn, connectionProvider, adLanguage, cOrderlineId, 0, 0);
  }

  public static CreateFromInvoiceData[] selectFromPOUpdateSOTrx(Connection conn, ConnectionProvider connectionProvider, String adLanguage, String cOrderlineId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT (CASE WHEN il.M_INOUTLINE_ID IS NULL THEN (l.QtyOrdered-COALESCE(l.QTYINVOICED ,0)) ELSE il.MOVEMENTQTY END) AS ID, " +
      "        l.C_UOM_ID,uom.UOMSymbol, l.M_Product_ID,Ad_Column_Identifier(to_char('M_Product'), to_char(l.m_product_id), to_char(?)) AS NAME, " +
      "        l.C_OrderLine_ID,l.Line, max(uom.stdprecision) AS stdprecision, cur.priceprecision, il.M_InOutLine_ID as M_InOutLine_ID, l.Description," +
      "        (CASE WHEN il.M_INOUTLINE_ID IS NULL THEN l.quantityOrder*C_DIVIDE((l.QtyOrdered-COALESCE(l.QTYINVOICED ,0)),(l.QtyOrdered)) ELSE il.quantityOrder END) AS quantityOrder, " +
      "        (CASE WHEN il.M_INOUTLINE_ID IS NULL THEN l.M_Product_UOM_ID ELSE il.M_Product_UOM_ID END) AS M_Product_UOM_ID, l.M_ATTRIBUTESETINSTANCE_ID, l.ad_org_id," +
      "        l.taxbaseamt, COALESCE(l.A_Asset_ID, o.A_Asset_ID) as A_Asset_ID, COALESCE(l.C_Project_ID, o.C_Project_ID) as C_Project_ID," +
      "        COALESCE(l.C_Costcenter_ID, o.C_Costcenter_ID) as C_Costcenter_ID, COALESCE(l.User1_ID, o.User1_ID) as User1_ID, COALESCE(l.User2_ID, o.User2_ID) as User2_ID, l.explode, 'Y' as isOrder" +
      "        FROM C_ORDERLINE l left join (SELECT M_InOutLine.* FROM M_InOutLine, M_InOut" +
      "                                      WHERE M_InOut.M_InOut_ID = M_InOutLine.M_InOut_ID" +
      "                                      AND M_InOutLine.IsInvoiced = 'N'" +
      "                                      AND M_InOut.Processed='Y') il  on l.C_OrderLine_ID = il.C_OrderLine_ID," +
      "        C_UOM uom,  M_PRODUCT p  ,c_currency cur, c_order o" +
      "        WHERE cur.C_CURRENCY_ID=l.C_CURRENCY_ID AND l.C_UOM_ID=uom.C_UOM_ID" +
      "        AND l.C_Order_ID=o.C_Order_ID" +
      "        AND l.M_Product_ID=p.M_Product_ID ";
    strSql = strSql + ((cOrderlineId==null || cOrderlineId.equals(""))?"":"  AND l.C_OrderLine_ID IN " + cOrderlineId);
    strSql = strSql + 
      "        GROUP BY l.QtyOrdered,l.qtydelivered,l.C_UOM_ID,uom.UOMSymbol,l.M_Product_ID,p.NAME,l.Line,l.C_OrderLine_ID, " +
      "        l.QTYINVOICED, il.M_InOutLine_ID, il.MovementQty, l.Description, l.quantityOrder, il.quantityOrder, " +
      "        l.M_Product_UOM_ID, il.M_Product_UOM_ID, l.M_ATTRIBUTESETINSTANCE_ID,l.ad_org_id, cur.priceprecision," +
      "        l.taxbaseamt, COALESCE(l.A_Asset_ID, o.A_Asset_ID), COALESCE(l.C_Project_ID, o.C_Project_ID), COALESCE(l.C_Costcenter_ID, o.C_Costcenter_ID)," +
      "        COALESCE(l.User1_ID, o.User1_ID), COALESCE(l.User2_ID, o.User2_ID), l.explode" +
      "        HAVING ( (l.explode='Y') OR ((l.QtyOrdered-COALESCE(l.QTYINVOICED ,0)) <> 0)) " +
      "        ORDER BY l.Line";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      if (cOrderlineId != null && !(cOrderlineId.equals(""))) {
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
        CreateFromInvoiceData objectCreateFromInvoiceData = new CreateFromInvoiceData();
        objectCreateFromInvoiceData.id = UtilSql.getValue(result, "id");
        objectCreateFromInvoiceData.cUomId = UtilSql.getValue(result, "c_uom_id");
        objectCreateFromInvoiceData.uomsymbol = UtilSql.getValue(result, "uomsymbol");
        objectCreateFromInvoiceData.mProductId = UtilSql.getValue(result, "m_product_id");
        objectCreateFromInvoiceData.name = UtilSql.getValue(result, "name");
        objectCreateFromInvoiceData.cOrderlineId = UtilSql.getValue(result, "c_orderline_id");
        objectCreateFromInvoiceData.line = UtilSql.getValue(result, "line");
        objectCreateFromInvoiceData.stdprecision = UtilSql.getValue(result, "stdprecision");
        objectCreateFromInvoiceData.priceprecision = UtilSql.getValue(result, "priceprecision");
        objectCreateFromInvoiceData.mInoutlineId = UtilSql.getValue(result, "m_inoutline_id");
        objectCreateFromInvoiceData.description = UtilSql.getValue(result, "description");
        objectCreateFromInvoiceData.quantityorder = UtilSql.getValue(result, "quantityorder");
        objectCreateFromInvoiceData.mProductUomId = UtilSql.getValue(result, "m_product_uom_id");
        objectCreateFromInvoiceData.mAttributesetinstanceId = UtilSql.getValue(result, "m_attributesetinstance_id");
        objectCreateFromInvoiceData.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectCreateFromInvoiceData.taxbaseamt = UtilSql.getValue(result, "taxbaseamt");
        objectCreateFromInvoiceData.aAssetId = UtilSql.getValue(result, "a_asset_id");
        objectCreateFromInvoiceData.cProjectId = UtilSql.getValue(result, "c_project_id");
        objectCreateFromInvoiceData.cCostcenterId = UtilSql.getValue(result, "c_costcenter_id");
        objectCreateFromInvoiceData.user1Id = UtilSql.getValue(result, "user1_id");
        objectCreateFromInvoiceData.user2Id = UtilSql.getValue(result, "user2_id");
        objectCreateFromInvoiceData.explode = UtilSql.getValue(result, "explode");
        objectCreateFromInvoiceData.isorder = UtilSql.getValue(result, "isorder");
        objectCreateFromInvoiceData.rownum = Long.toString(countRecord);
        objectCreateFromInvoiceData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectCreateFromInvoiceData);
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
        connectionProvider.releaseTransactionalPreparedStatement(st);
      } catch(Exception ignore){
        ignore.printStackTrace();
      }
    }
    CreateFromInvoiceData objectCreateFromInvoiceData[] = new CreateFromInvoiceData[vector.size()];
    vector.copyInto(objectCreateFromInvoiceData);
    return(objectCreateFromInvoiceData);
  }

  public static CreateFromInvoiceData[] selectFromShipment(ConnectionProvider connectionProvider, String adLanguage, String adUserClient, String adOrgClient, String mInoutId, String isTaxIncluded)    throws ServletException {
    return selectFromShipment(connectionProvider, adLanguage, adUserClient, adOrgClient, mInoutId, isTaxIncluded, 0, 0);
  }

  public static CreateFromInvoiceData[] selectFromShipment(ConnectionProvider connectionProvider, String adLanguage, String adUserClient, String adOrgClient, String mInoutId, String isTaxIncluded, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT s.M_InOut_ID AS ID, Ad_Column_Identifier(to_char('M_InOut'), to_char(s.M_InOut_ID), to_char(?)) AS NAME, " +
      "        s.DocumentNo AS NAMESHIPMENT, " +
      "        (l.MovementQty-SUM(COALESCE(mi.Qty,0))) AS QTY, l.C_UOM_ID,uom.UOMSymbol, l.M_Product_ID,Ad_Column_Identifier(to_char('M_Product'), to_char(l.m_product_id), to_char(?))||' '||(CASE WHEN ma.serno IS NOT NULL THEN TO_CHAR('('||' '||ma.serno||' '||')') ELSE TO_CHAR('')  END) AS RELATION_NAME, " +
      "        l.M_InOutLine_ID,l.Line, l.M_InOutLine_ID as C_OrderLine_ID," +
      "        COALESCE(l.A_Asset_ID, s.A_Asset_ID) AS A_Asset_ID, COALESCE(l.C_Project_ID, s.C_Project_ID) AS C_Project_ID, " +
      "        COALESCE(l.C_Costcenter_ID, s.C_Costcenter_ID) AS C_Costcenter_ID," +
      "        COALESCE(l.User1_ID, s.User1_ID) AS User1_ID, COALESCE(l.User2_ID, s.User2_ID) AS User2_ID, l.explode, l.Bom_parent_id, " +
      "        CASE WHEN l.Bom_parent_id is null then 'Y' else 'N' END as isparent" +
      "        FROM M_INOUTLINE l left join M_ATTRIBUTESETINSTANCE ma on l.M_ATTRIBUTESETINSTANCE_ID = ma.M_ATTRIBUTESETINSTANCE_ID" +
      "                           left join M_MATCHINV mi             on l.M_InOutLine_ID=mi.M_InOutLine_ID" +
      "                           left join c_orderline ol on l.c_orderline_id = ol.c_orderline_id" +
      "                           left join c_order o on ol.c_order_id = o.c_order_id" +
      "                           left join m_pricelist pl on pl.m_pricelist_id = o.m_pricelist_id," +
      "        M_INOUT s, C_UOM uom,  M_PRODUCT p" +
      "        WHERE s.M_INOUT_ID = l.M_INOUT_ID " +
      "        AND s.IsSOTrx='N' " +
      "        AND s.DocStatus IN ('CL','CO') " +
      "        AND s.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND s.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") " +
      "        AND l.C_UOM_ID=uom.C_UOM_ID " +
      "        AND l.M_Product_ID=p.M_Product_ID " +
      "        AND l.M_InOut_ID=? " +
      "        AND (l.c_orderline_id is null OR pl.istaxincluded = ?)" +
      "        GROUP BY s.M_InOut_ID, s.DocumentNo, s.MovementDate, l.MovementQty,l.C_UOM_ID,uom.UOMSymbol," +
      "        l.M_Product_ID,ma.serno,p.NAME, l.M_InOutLine_ID,l.Line,l.C_OrderLine_ID," +
      "        COALESCE(l.A_Asset_ID, s.A_Asset_ID), COALESCE(l.C_Project_ID, s.C_Project_ID), COALESCE(l.C_Costcenter_ID, s.C_Costcenter_ID)," +
      "        COALESCE(l.User1_ID, s.User1_ID), COALESCE(l.User2_ID, s.User2_ID), l.explode, l.bom_parent_id" +
      "        HAVING  (((l.MovementQty-SUM(COALESCE(mi.Qty,0))) <> 0) OR (l.explode='Y'))" +
      "        ORDER BY NAME, l.Line";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      if (adUserClient != null && !(adUserClient.equals(""))) {
        }
      if (adOrgClient != null && !(adOrgClient.equals(""))) {
        }
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mInoutId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isTaxIncluded);

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
        CreateFromInvoiceData objectCreateFromInvoiceData = new CreateFromInvoiceData();
        objectCreateFromInvoiceData.id = UtilSql.getValue(result, "id");
        objectCreateFromInvoiceData.name = UtilSql.getValue(result, "name");
        objectCreateFromInvoiceData.nameshipment = UtilSql.getValue(result, "nameshipment");
        objectCreateFromInvoiceData.qty = UtilSql.getValue(result, "qty");
        objectCreateFromInvoiceData.cUomId = UtilSql.getValue(result, "c_uom_id");
        objectCreateFromInvoiceData.uomsymbol = UtilSql.getValue(result, "uomsymbol");
        objectCreateFromInvoiceData.mProductId = UtilSql.getValue(result, "m_product_id");
        objectCreateFromInvoiceData.relationName = UtilSql.getValue(result, "relation_name");
        objectCreateFromInvoiceData.mInoutlineId = UtilSql.getValue(result, "m_inoutline_id");
        objectCreateFromInvoiceData.line = UtilSql.getValue(result, "line");
        objectCreateFromInvoiceData.cOrderlineId = UtilSql.getValue(result, "c_orderline_id");
        objectCreateFromInvoiceData.aAssetId = UtilSql.getValue(result, "a_asset_id");
        objectCreateFromInvoiceData.cProjectId = UtilSql.getValue(result, "c_project_id");
        objectCreateFromInvoiceData.cCostcenterId = UtilSql.getValue(result, "c_costcenter_id");
        objectCreateFromInvoiceData.user1Id = UtilSql.getValue(result, "user1_id");
        objectCreateFromInvoiceData.user2Id = UtilSql.getValue(result, "user2_id");
        objectCreateFromInvoiceData.explode = UtilSql.getValue(result, "explode");
        objectCreateFromInvoiceData.bomParentId = UtilSql.getValue(result, "bom_parent_id");
        objectCreateFromInvoiceData.isparent = UtilSql.getValue(result, "isparent");
        objectCreateFromInvoiceData.rownum = Long.toString(countRecord);
        objectCreateFromInvoiceData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectCreateFromInvoiceData);
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
    CreateFromInvoiceData objectCreateFromInvoiceData[] = new CreateFromInvoiceData[vector.size()];
    vector.copyInto(objectCreateFromInvoiceData);
    return(objectCreateFromInvoiceData);
  }

  public static CreateFromInvoiceData[] selectFromShipmentCombo(ConnectionProvider connectionProvider, String adLanguage, String adUserClient, String adOrgClient, String cBpartnerId, String isTaxIncluded)    throws ServletException {
    return selectFromShipmentCombo(connectionProvider, adLanguage, adUserClient, adOrgClient, cBpartnerId, isTaxIncluded, 0, 0);
  }

  public static CreateFromInvoiceData[] selectFromShipmentCombo(ConnectionProvider connectionProvider, String adLanguage, String adUserClient, String adOrgClient, String cBpartnerId, String isTaxIncluded, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT s.M_InOut_ID AS ID, Ad_Column_Identifier(to_char('M_InOut'), to_char(s.M_InOut_ID), to_char(?)) AS NAME " +
      "        FROM M_INOUT s " +
      "        WHERE s.IsSOTrx='N' " +
      "        AND s.DocStatus IN ('CL','CO') " +
      "        AND s.ISLOGISTIC <> 'Y'" +
      "        AND s.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND s.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") " +
      "        AND s.C_BPartner_ID = ? " +
      "        AND EXISTS (SELECT 1 " +
      "                     FROM M_INOUTLINE l" +
      "                           left join M_MATCHINV mi on l.M_InOutLine_ID=mi.M_InOutLine_ID" +
      "                           left join c_orderline ol on l.c_orderline_id = ol.c_orderline_id" +
      "                           left join c_order o on ol.c_order_id = o.c_order_id" +
      "                           left join m_pricelist pl on pl.m_pricelist_id = o.m_pricelist_id" +
      "                      WHERE l.M_INOUT_ID = s.M_INOUT_ID " +
      "                        AND (l.c_orderline_id is null OR pl.istaxincluded = ?)" +
      "                      GROUP BY l.MovementQty, l.M_InOutLine_ID " +
      "                      HAVING  (l.MovementQty-SUM(COALESCE(mi.Qty,0))) <> 0)" +
      "        ORDER BY NAME";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      if (adUserClient != null && !(adUserClient.equals(""))) {
        }
      if (adOrgClient != null && !(adOrgClient.equals(""))) {
        }
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isTaxIncluded);

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
        CreateFromInvoiceData objectCreateFromInvoiceData = new CreateFromInvoiceData();
        objectCreateFromInvoiceData.id = UtilSql.getValue(result, "id");
        objectCreateFromInvoiceData.name = UtilSql.getValue(result, "name");
        objectCreateFromInvoiceData.rownum = Long.toString(countRecord);
        objectCreateFromInvoiceData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectCreateFromInvoiceData);
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
    CreateFromInvoiceData objectCreateFromInvoiceData[] = new CreateFromInvoiceData[vector.size()];
    vector.copyInto(objectCreateFromInvoiceData);
    return(objectCreateFromInvoiceData);
  }

  public static CreateFromInvoiceData[] selectFromShipmentSOTrx(ConnectionProvider connectionProvider, String adLanguage, String adUserClient, String adOrgClient, String mInoutId, String isTaxIncluded)    throws ServletException {
    return selectFromShipmentSOTrx(connectionProvider, adLanguage, adUserClient, adOrgClient, mInoutId, isTaxIncluded, 0, 0);
  }

  public static CreateFromInvoiceData[] selectFromShipmentSOTrx(ConnectionProvider connectionProvider, String adLanguage, String adUserClient, String adOrgClient, String mInoutId, String isTaxIncluded, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT s.M_InOut_ID AS ID, Ad_Column_Identifier(to_char('M_InOut'), to_char(s.M_InOut_ID), to_char(?)) AS NAME," +
      "        s.DocumentNo AS NAMESHIPMENT," +
      "        (l.MovementQty - sum(COALESCE(CASE WHEN i.docstatus = 'CO' THEN il.qtyinvoiced ELSE 0 END, 0))) AS QTY, l.C_UOM_ID,uom.UOMSymbol," +
      "        l.M_Product_ID,Ad_Column_Identifier(to_char('M_Product'), to_char(l.m_product_id), to_char(?))||' '||(CASE WHEN ma.serno IS NOT NULL THEN TO_CHAR('('||' '||ma.serno||' '||')') ELSE TO_CHAR('') END) AS RELATION_NAME, l.M_InOutLine_ID,l.Line," +
      "        l.M_InOutLine_ID as C_OrderLine_ID," +
      "        COALESCE(l.A_Asset_ID, s.A_Asset_ID) AS A_Asset_ID, COALESCE(l.C_Project_ID, s.C_Project_ID) AS C_Project_ID, " +
      "        COALESCE(l.C_Costcenter_ID, s.C_Costcenter_ID) AS C_Costcenter_ID," +
      "        COALESCE(l.User1_ID, s.User1_ID) AS User1_ID, COALESCE(l.User2_ID, s.User2_ID) AS User2_ID, l.explode, l.Bom_parent_id, " +
      "        CASE WHEN l.Bom_parent_id is null then 'Y' else 'N' END as isparent" +
      "        FROM M_INOUTLINE l" +
      "                left join M_ATTRIBUTESETINSTANCE ma on l.M_ATTRIBUTESETINSTANCE_ID = ma.M_ATTRIBUTESETINSTANCE_ID" +
      "                left join c_orderline ol on l.c_orderline_id = ol.c_orderline_id" +
      "                left join c_order o on ol.c_order_id = o.c_order_id" +
      "                left join m_pricelist pl on pl.m_pricelist_id = o.m_pricelist_id" +
      "                left join c_invoiceline il on l.m_inoutline_id = il.m_inoutline_id" +
      "                left join c_invoice i on il.c_invoice_id = i.c_invoice_id," +
      "        M_INOUT s, C_UOM uom, M_PRODUCT p " +
      "        WHERE s.M_INOUT_ID = l.M_INOUT_ID" +
      "        AND s.IsSOTrx='Y' " +
      "        AND s.DocStatus IN ('CL','CO') " +
      "        AND s.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND s.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") " +
      "        AND l.C_UOM_ID=uom.C_UOM_ID " +
      "        AND l.M_Product_ID=p.M_Product_ID " +
      "        AND l.M_InOut_ID=?" +
      "        AND (l.c_orderline_id is null OR pl.istaxincluded = ?)" +
      "        GROUP BY s.M_InOut_ID, s.DocumentNo, s.MovementDate, l.MovementQty,l.C_UOM_ID,uom.UOMSymbol," +
      "        l.M_Product_ID,p.NAME, ma.serno, l.M_InOutLine_ID,l.Line,l.C_OrderLine_ID," +
      "        COALESCE(l.A_Asset_ID, s.A_Asset_ID), COALESCE(l.C_Project_ID, s.C_Project_ID), COALESCE(l.C_Costcenter_ID, s.C_Costcenter_ID)," +
      "        COALESCE(l.User1_ID, s.User1_ID), COALESCE(l.User2_ID, s.User2_ID), l.explode, l.Bom_parent_id" +
      "        HAVING (l.movementqty >= 0 AND l.movementqty > SUM(COALESCE(CASE WHEN i.docstatus = 'CO' THEN il.qtyinvoiced ELSE 0 END, 0)))" +
      "           OR (l.movementqty < 0 AND l.movementqty < SUM(COALESCE(CASE WHEN i.docstatus = 'CO' THEN il.qtyinvoiced ELSE 0 END, 0)))" +
      "           OR (l.explode='Y')" +
      "        ORDER BY NAME, l.Line";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      if (adUserClient != null && !(adUserClient.equals(""))) {
        }
      if (adOrgClient != null && !(adOrgClient.equals(""))) {
        }
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mInoutId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isTaxIncluded);

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
        CreateFromInvoiceData objectCreateFromInvoiceData = new CreateFromInvoiceData();
        objectCreateFromInvoiceData.id = UtilSql.getValue(result, "id");
        objectCreateFromInvoiceData.name = UtilSql.getValue(result, "name");
        objectCreateFromInvoiceData.nameshipment = UtilSql.getValue(result, "nameshipment");
        objectCreateFromInvoiceData.qty = UtilSql.getValue(result, "qty");
        objectCreateFromInvoiceData.cUomId = UtilSql.getValue(result, "c_uom_id");
        objectCreateFromInvoiceData.uomsymbol = UtilSql.getValue(result, "uomsymbol");
        objectCreateFromInvoiceData.mProductId = UtilSql.getValue(result, "m_product_id");
        objectCreateFromInvoiceData.relationName = UtilSql.getValue(result, "relation_name");
        objectCreateFromInvoiceData.mInoutlineId = UtilSql.getValue(result, "m_inoutline_id");
        objectCreateFromInvoiceData.line = UtilSql.getValue(result, "line");
        objectCreateFromInvoiceData.cOrderlineId = UtilSql.getValue(result, "c_orderline_id");
        objectCreateFromInvoiceData.aAssetId = UtilSql.getValue(result, "a_asset_id");
        objectCreateFromInvoiceData.cProjectId = UtilSql.getValue(result, "c_project_id");
        objectCreateFromInvoiceData.cCostcenterId = UtilSql.getValue(result, "c_costcenter_id");
        objectCreateFromInvoiceData.user1Id = UtilSql.getValue(result, "user1_id");
        objectCreateFromInvoiceData.user2Id = UtilSql.getValue(result, "user2_id");
        objectCreateFromInvoiceData.explode = UtilSql.getValue(result, "explode");
        objectCreateFromInvoiceData.bomParentId = UtilSql.getValue(result, "bom_parent_id");
        objectCreateFromInvoiceData.isparent = UtilSql.getValue(result, "isparent");
        objectCreateFromInvoiceData.rownum = Long.toString(countRecord);
        objectCreateFromInvoiceData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectCreateFromInvoiceData);
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
    CreateFromInvoiceData objectCreateFromInvoiceData[] = new CreateFromInvoiceData[vector.size()];
    vector.copyInto(objectCreateFromInvoiceData);
    return(objectCreateFromInvoiceData);
  }

  public static CreateFromInvoiceData[] selectFromShipmentSOTrxCombo(ConnectionProvider connectionProvider, String adLanguage, String adUserClient, String adOrgClient, String cBpartnerId, String isTaxIncluded)    throws ServletException {
    return selectFromShipmentSOTrxCombo(connectionProvider, adLanguage, adUserClient, adOrgClient, cBpartnerId, isTaxIncluded, 0, 0);
  }

  public static CreateFromInvoiceData[] selectFromShipmentSOTrxCombo(ConnectionProvider connectionProvider, String adLanguage, String adUserClient, String adOrgClient, String cBpartnerId, String isTaxIncluded, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT s.M_InOut_ID AS ID, Ad_Column_Identifier(to_char('M_InOut'), to_char(s.M_InOut_ID), to_char(?)) AS NAME " +
      "        FROM M_INOUT s " +
      "        WHERE s.IsSOTrx='Y' " +
      "        AND s.ISLOGISTIC <> 'Y'" +
      "        AND s.DocStatus IN ('CL','CO') " +
      "        AND s.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND s.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ")" +
      "        AND s.C_BPartner_ID = ?  " +
      "        AND EXISTS (SELECT 1 FROM M_INOUTLINE l " +
      "                           left join c_orderline ol on l.c_orderline_id = ol.c_orderline_id" +
      "                           left join c_order o on ol.c_order_id = o.c_order_id" +
      "                           left join m_pricelist pl on pl.m_pricelist_id = o.m_pricelist_id" +
      "                           left join c_invoiceline il on l.m_inoutline_id = il.m_inoutline_id" +
      "                           left join c_invoice i on il.c_invoice_id = i.c_invoice_id" +
      "                    WHERE l.M_INOUT_ID = s.M_INOUT_ID" +
      "                    AND (l.c_orderline_id is null OR pl.istaxincluded = ?)" +
      "                    GROUP BY l.m_inoutline_id, l.movementqty" +
      "                    HAVING ( l.movementqty >= 0 AND l.movementqty > Sum(COALESCE(CASE WHEN i.docstatus = 'CO' THEN il.qtyinvoiced ELSE 0 END, 0)) )" +
      "                      OR ( l.movementqty < 0 AND l.movementqty < Sum(COALESCE(CASE WHEN i.docstatus = 'CO' THEN il.qtyinvoiced ELSE 0 END, 0)) )" +
      "                    )" +
      "        AND NOT EXISTS (SELECT 1 FROM C_INVOICE_CANDIDATE_V ic, C_ORDER o " +
      "        WHERE o.C_ORDER_ID = s.C_ORDER_ID" +
      "        AND o.C_ORDER_ID = ic.C_ORDER_ID" +
      "        AND ic.term = 'N')" +
      "        AND NOT EXISTS (SELECT 1" +
      "        FROM C_ORDER o , C_ORDERLINE ol" +
      "        WHERE o.C_ORDER_ID = s.C_ORDER_ID" +
      "        AND o.C_ORDER_ID = ol.C_ORDER_ID" +
      "        GROUP BY o.INVOICERULE" +
      "        HAVING (o.INVOICERULE = 'O' AND SUM(ol.qtyordered) <> SUM(ol.qtydelivered)))" +
      "        ORDER BY NAME";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      if (adUserClient != null && !(adUserClient.equals(""))) {
        }
      if (adOrgClient != null && !(adOrgClient.equals(""))) {
        }
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isTaxIncluded);

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
        CreateFromInvoiceData objectCreateFromInvoiceData = new CreateFromInvoiceData();
        objectCreateFromInvoiceData.id = UtilSql.getValue(result, "id");
        objectCreateFromInvoiceData.name = UtilSql.getValue(result, "name");
        objectCreateFromInvoiceData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectCreateFromInvoiceData);
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
    CreateFromInvoiceData objectCreateFromInvoiceData[] = new CreateFromInvoiceData[vector.size()];
    vector.copyInto(objectCreateFromInvoiceData);
    return(objectCreateFromInvoiceData);
  }

  public static CreateFromInvoiceData[] selectFromShipmentTrl(ConnectionProvider connectionProvider, String adLanguage, String adUserClient, String adOrgClient, String mInoutId, String isTaxIncluded)    throws ServletException {
    return selectFromShipmentTrl(connectionProvider, adLanguage, adUserClient, adOrgClient, mInoutId, isTaxIncluded, 0, 0);
  }

  public static CreateFromInvoiceData[] selectFromShipmentTrl(ConnectionProvider connectionProvider, String adLanguage, String adUserClient, String adOrgClient, String mInoutId, String isTaxIncluded, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT s.M_InOut_ID AS ID, Ad_Column_Identifier(to_char('M_InOut'), to_char(s.M_InOut_ID), to_char(?)) AS NAME," +
      "      s.DocumentNo AS NAMESHIPMENT," +
      "        (l.MovementQty-SUM(COALESCE(mi.Qty,0))) AS QTY, l.C_UOM_ID, COALESCE(uomt.UOMSymbol, uom.UOMSymbol) AS UOMSymbol, " +
      "        l.M_Product_ID,Ad_Column_Identifier(to_char('M_Product'), to_char(l.m_product_id), to_char(?))||' '||(CASE WHEN ma.serno IS NOT NULL THEN TO_CHAR('('||' '||ma.serno||' '||')') ELSE TO_CHAR('')  END) AS RELATION_NAME, l.M_InOutLine_ID,l.Line, l.M_InOutLine_ID as C_OrderLine_ID," +
      "        COALESCE(l.A_Asset_ID, s.A_Asset_ID) AS A_Asset_ID, COALESCE(l.C_Project_ID, s.C_Project_ID) AS C_Project_ID, " +
      "        COALESCE(l.C_Costcenter_ID, s.C_Costcenter_ID) AS C_Costcenter_ID," +
      "        COALESCE(l.User1_ID, s.User1_ID) AS User1_ID, COALESCE(l.User2_ID, s.User2_ID) AS User2_ID" +
      "        FROM M_INOUTLINE l" +
      "                left join M_ATTRIBUTESETINSTANCE ma on l.M_ATTRIBUTESETINSTANCE_ID = ma.M_ATTRIBUTESETINSTANCE_ID" +
      "                left join M_MATCHINV mi             on l.M_InOutLine_ID=mi.M_InOutLine_ID" +
      "                left join c_orderline ol on l.c_orderline_id = ol.c_orderline_id" +
      "                left join c_order o on ol.c_order_id = o.c_order_id" +
      "                left join m_pricelist pl on pl.m_pricelist_id = o.m_pricelist_id," +
      "             C_UOM uom" +
      "                left join C_UOM_TRL uomt on uom.C_UOM_ID = uomt.C_UOM_ID and uomt.AD_Language = ?," +
      "        M_INOUT s,   M_PRODUCT p" +
      "        WHERE s.M_INOUT_ID = l.M_INOUT_ID " +
      "        AND s.IsSOTrx='N' " +
      "        AND s.DocStatus IN ('CL','CO') " +
      "        AND s.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND s.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") " +
      "        AND l.C_UOM_ID=uom.C_UOM_ID " +
      "        AND l.M_Product_ID=p.M_Product_ID " +
      "        AND l.M_InOut_ID=? " +
      "        AND (l.c_orderline_id is null OR pl.istaxincluded = ?)" +
      "        GROUP BY s.M_InOut_ID, s.DocumentNo, s.MovementDate, l.MovementQty,l.C_UOM_ID,uom.UOMSymbol, uomt.UOMSymbol," +
      "        l.M_Product_ID,p.NAME, ma.serno, l.M_InOutLine_ID,l.Line,l.C_OrderLine_ID," +
      "        COALESCE(l.A_Asset_ID, s.A_Asset_ID), COALESCE(l.C_Project_ID, s.C_Project_ID), COALESCE(l.C_Costcenter_ID, s.C_Costcenter_ID)," +
      "        COALESCE(l.User1_ID, s.User1_ID), COALESCE(l.User2_ID, s.User2_ID)" +
      "        HAVING  (l.MovementQty-SUM(COALESCE(mi.Qty,0))) <> 0" +
      "        ORDER BY NAME, l.Line";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      if (adUserClient != null && !(adUserClient.equals(""))) {
        }
      if (adOrgClient != null && !(adOrgClient.equals(""))) {
        }
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mInoutId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isTaxIncluded);

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
        CreateFromInvoiceData objectCreateFromInvoiceData = new CreateFromInvoiceData();
        objectCreateFromInvoiceData.id = UtilSql.getValue(result, "id");
        objectCreateFromInvoiceData.name = UtilSql.getValue(result, "name");
        objectCreateFromInvoiceData.nameshipment = UtilSql.getValue(result, "nameshipment");
        objectCreateFromInvoiceData.qty = UtilSql.getValue(result, "qty");
        objectCreateFromInvoiceData.cUomId = UtilSql.getValue(result, "c_uom_id");
        objectCreateFromInvoiceData.uomsymbol = UtilSql.getValue(result, "uomsymbol");
        objectCreateFromInvoiceData.mProductId = UtilSql.getValue(result, "m_product_id");
        objectCreateFromInvoiceData.relationName = UtilSql.getValue(result, "relation_name");
        objectCreateFromInvoiceData.mInoutlineId = UtilSql.getValue(result, "m_inoutline_id");
        objectCreateFromInvoiceData.line = UtilSql.getValue(result, "line");
        objectCreateFromInvoiceData.cOrderlineId = UtilSql.getValue(result, "c_orderline_id");
        objectCreateFromInvoiceData.aAssetId = UtilSql.getValue(result, "a_asset_id");
        objectCreateFromInvoiceData.cProjectId = UtilSql.getValue(result, "c_project_id");
        objectCreateFromInvoiceData.cCostcenterId = UtilSql.getValue(result, "c_costcenter_id");
        objectCreateFromInvoiceData.user1Id = UtilSql.getValue(result, "user1_id");
        objectCreateFromInvoiceData.user2Id = UtilSql.getValue(result, "user2_id");
        objectCreateFromInvoiceData.rownum = Long.toString(countRecord);
        objectCreateFromInvoiceData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectCreateFromInvoiceData);
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
    CreateFromInvoiceData objectCreateFromInvoiceData[] = new CreateFromInvoiceData[vector.size()];
    vector.copyInto(objectCreateFromInvoiceData);
    return(objectCreateFromInvoiceData);
  }

  public static CreateFromInvoiceData[] selectFromShipmentTrlSOTrx(ConnectionProvider connectionProvider, String adLanguage, String adUserClient, String adOrgClient, String mInoutId, String isTaxIncluded)    throws ServletException {
    return selectFromShipmentTrlSOTrx(connectionProvider, adLanguage, adUserClient, adOrgClient, mInoutId, isTaxIncluded, 0, 0);
  }

  public static CreateFromInvoiceData[] selectFromShipmentTrlSOTrx(ConnectionProvider connectionProvider, String adLanguage, String adUserClient, String adOrgClient, String mInoutId, String isTaxIncluded, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT s.M_InOut_ID AS ID, Ad_Column_Identifier(to_char('M_InOut'), to_char(s.M_InOut_ID), to_char(?)) AS NAME," +
      "        s.DocumentNo AS NAMESHIPMENT," +
      "        (l.MovementQty - SUM(COALESCE(CASE WHEN i.docstatus = 'CO' THEN il.qtyinvoiced ELSE 0 END, 0))) AS QTY, l.C_UOM_ID,COALESCE(uomt.UOMSymbol, uom.UOMSymbol) AS UOMSymbol, " +
      "        l.M_Product_ID,Ad_Column_Identifier(to_char('M_Product'), to_char(l.m_product_id), to_char(?))||' '|| (CASE WHEN ma.serno IS NOT NULL THEN TO_CHAR('('||' '||ma.serno||' '||')') ELSE TO_CHAR('')  END) AS RELATION_NAME, l.M_InOutLine_ID,l.Line, l.M_InOutLine_ID as C_OrderLine_ID, " +
      "        COALESCE(l.A_Asset_ID, s.A_Asset_ID) AS A_Asset_ID, COALESCE(l.C_Project_ID, s.C_Project_ID) AS C_Project_ID, " +
      "        COALESCE(l.C_Costcenter_ID, s.C_Costcenter_ID) AS C_Costcenter_ID," +
      "        COALESCE(l.User1_ID, s.User1_ID) AS User1_ID, COALESCE(l.User2_ID, s.User2_ID) AS User2_ID" +
      "        FROM M_INOUTLINE l" +
      "              left join M_ATTRIBUTESETINSTANCE ma on l.M_ATTRIBUTESETINSTANCE_ID = ma.M_ATTRIBUTESETINSTANCE_ID" +
      "              left join c_orderline ol on l.c_orderline_id = ol.c_orderline_id" +
      "              left join c_order o on ol.c_order_id = o.c_order_id" +
      "              left join m_pricelist pl on pl.m_pricelist_id = o.m_pricelist_id" +
      "              left join c_invoiceline il on l.m_inoutline_id = il.m_inoutline_id" +
      "              left join c_invoice i on il.c_invoice_id = i.c_invoice_id," +
      "             C_UOM uom     left join C_UOM_TRL uomt            on uom.C_UOM_ID = uomt.C_UOM_ID" +
      "                                                              and uomt.AD_Language = ? ," +
      "        M_INOUT s,    M_PRODUCT p " +
      "        WHERE s.M_INOUT_ID = l.M_INOUT_ID" +
      "        AND s.IsSOTrx='Y' " +
      "        AND s.DocStatus IN ('CL','CO') " +
      "        AND s.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND s.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") " +
      "        AND l.C_UOM_ID=uom.C_UOM_ID " +
      "        AND l.M_Product_ID=p.M_Product_ID " +
      "        AND l.M_InOut_ID=? " +
      "        AND (l.c_orderline_id is null OR pl.istaxincluded = ?)" +
      "        GROUP BY s.M_InOut_ID, s.DocumentNo, s.MovementDate, l.MovementQty,l.C_UOM_ID,uom.UOMSymbol, uomt.UOMSymbol," +
      "        l.M_Product_ID,p.NAME,ma.serno, l.M_InOutLine_ID,l.Line,l.C_OrderLine_ID," +
      "        COALESCE(l.A_Asset_ID, s.A_Asset_ID), COALESCE(l.C_Project_ID, s.C_Project_ID), COALESCE(l.C_Costcenter_ID, s.C_Costcenter_ID)," +
      "        COALESCE(l.User1_ID, s.User1_ID), COALESCE(l.User2_ID, s.User2_ID)" +
      "        HAVING (l.movementqty >= 0 AND l.movementqty > SUM(COALESCE(CASE WHEN i.docstatus = 'CO' THEN il.qtyinvoiced ELSE 0 END, 0)))" +
      "          OR (l.movementqty < 0 AND l.movementqty < SUM(COALESCE(CASE WHEN i.docstatus = 'CO' THEN il.qtyinvoiced ELSE 0 END, 0)))" +
      "        ORDER BY NAME, l.Line";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      if (adUserClient != null && !(adUserClient.equals(""))) {
        }
      if (adOrgClient != null && !(adOrgClient.equals(""))) {
        }
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mInoutId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isTaxIncluded);

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
        CreateFromInvoiceData objectCreateFromInvoiceData = new CreateFromInvoiceData();
        objectCreateFromInvoiceData.id = UtilSql.getValue(result, "id");
        objectCreateFromInvoiceData.name = UtilSql.getValue(result, "name");
        objectCreateFromInvoiceData.nameshipment = UtilSql.getValue(result, "nameshipment");
        objectCreateFromInvoiceData.qty = UtilSql.getValue(result, "qty");
        objectCreateFromInvoiceData.cUomId = UtilSql.getValue(result, "c_uom_id");
        objectCreateFromInvoiceData.uomsymbol = UtilSql.getValue(result, "uomsymbol");
        objectCreateFromInvoiceData.mProductId = UtilSql.getValue(result, "m_product_id");
        objectCreateFromInvoiceData.relationName = UtilSql.getValue(result, "relation_name");
        objectCreateFromInvoiceData.mInoutlineId = UtilSql.getValue(result, "m_inoutline_id");
        objectCreateFromInvoiceData.line = UtilSql.getValue(result, "line");
        objectCreateFromInvoiceData.cOrderlineId = UtilSql.getValue(result, "c_orderline_id");
        objectCreateFromInvoiceData.aAssetId = UtilSql.getValue(result, "a_asset_id");
        objectCreateFromInvoiceData.cProjectId = UtilSql.getValue(result, "c_project_id");
        objectCreateFromInvoiceData.cCostcenterId = UtilSql.getValue(result, "c_costcenter_id");
        objectCreateFromInvoiceData.user1Id = UtilSql.getValue(result, "user1_id");
        objectCreateFromInvoiceData.user2Id = UtilSql.getValue(result, "user2_id");
        objectCreateFromInvoiceData.rownum = Long.toString(countRecord);
        objectCreateFromInvoiceData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectCreateFromInvoiceData);
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
    CreateFromInvoiceData objectCreateFromInvoiceData[] = new CreateFromInvoiceData[vector.size()];
    vector.copyInto(objectCreateFromInvoiceData);
    return(objectCreateFromInvoiceData);
  }

  public static CreateFromInvoiceData[] selectFromShipmentUpdate(Connection conn, ConnectionProvider connectionProvider, String adLanguage, String cInOutLineId)    throws ServletException {
    return selectFromShipmentUpdate(conn, connectionProvider, adLanguage, cInOutLineId, 0, 0);
  }

  public static CreateFromInvoiceData[] selectFromShipmentUpdate(Connection conn, ConnectionProvider connectionProvider, String adLanguage, String cInOutLineId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT (l.MovementQty-SUM(COALESCE(mi.Qty,0))) AS ID, l.C_UOM_ID,uom.UOMSymbol, l.M_Product_ID,Ad_Column_Identifier(to_char('M_Product'), to_char(l.m_product_id), to_char(?)) AS NAME, " +
      "      l.M_InOutLine_ID,l.Line, l.C_OrderLine_ID, max(uom.STDPRECISION) as stdprecision, l.Description, l.quantityOrder*C_DIVIDE((l.MovementQty-SUM(COALESCE(mi.Qty,0))),l.MovementQty) as quantityOrder, " +
      "      l.M_Product_UOM_ID, l.M_ATTRIBUTESETINSTANCE_ID, l.ad_org_id, COALESCE(co.taxbaseamt,0) * C_DIVIDE((l.MovementQty-SUM(COALESCE(mi.Qty,0))),COALESCE(co.qtyordered,1)) as taxbaseamt," +
      "      COALESCE(l.A_Asset_ID, s.A_Asset_ID) AS A_Asset_ID, COALESCE(l.C_Project_ID, s.C_Project_ID) AS C_Project_ID, " +
      "      COALESCE(l.C_Costcenter_ID, s.C_Costcenter_ID) AS C_Costcenter_ID," +
      "      COALESCE(l.User1_ID, s.User1_ID) AS User1_ID, COALESCE(l.User2_ID, s.User2_ID) AS User2_ID," +
      "      l.explode, 'N' as isOrder" +
      "      FROM M_INOUTLINE l left join M_MATCHINV mi on l.M_InOutLine_ID=mi.M_InOutLine_ID" +
      "            left join C_ORDERLINE co ON co.C_ORDERLINE_ID=l.C_ORDERLINE_ID," +
      "      C_UOM uom,  M_PRODUCT p, M_InOut s" +
      "      WHERE l.M_InOut_ID = s.M_InOut_ID" +
      "      AND l.C_UOM_ID=uom.C_UOM_ID" +
      "      AND l.M_Product_ID=p.M_Product_ID";
    strSql = strSql + ((cInOutLineId==null || cInOutLineId.equals(""))?"":"  AND l.M_InOutLine_ID IN " + cInOutLineId);
    strSql = strSql + 
      "      GROUP BY l.MovementQty,l.C_UOM_ID,uom.UOMSymbol,l.M_Product_ID,p.NAME, l.M_InOutLine_ID,l.Line,l.C_OrderLine_ID, l.Description,l.quantityOrder, l.M_Product_UOM_ID, l.M_ATTRIBUTESETINSTANCE_ID, l.ad_org_id, co.taxbaseamt,co.qtyordered," +
      "      COALESCE(l.A_Asset_ID, s.A_Asset_ID), COALESCE(l.C_Project_ID, s.C_Project_ID), COALESCE(l.C_Costcenter_ID, s.C_Costcenter_ID)," +
      "      COALESCE(l.User1_ID, s.User1_ID), COALESCE(l.User2_ID, s.User2_ID),l.explode" +
      "      ORDER BY l.Line";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      if (cInOutLineId != null && !(cInOutLineId.equals(""))) {
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
        CreateFromInvoiceData objectCreateFromInvoiceData = new CreateFromInvoiceData();
        objectCreateFromInvoiceData.id = UtilSql.getValue(result, "id");
        objectCreateFromInvoiceData.cUomId = UtilSql.getValue(result, "c_uom_id");
        objectCreateFromInvoiceData.uomsymbol = UtilSql.getValue(result, "uomsymbol");
        objectCreateFromInvoiceData.mProductId = UtilSql.getValue(result, "m_product_id");
        objectCreateFromInvoiceData.name = UtilSql.getValue(result, "name");
        objectCreateFromInvoiceData.mInoutlineId = UtilSql.getValue(result, "m_inoutline_id");
        objectCreateFromInvoiceData.line = UtilSql.getValue(result, "line");
        objectCreateFromInvoiceData.cOrderlineId = UtilSql.getValue(result, "c_orderline_id");
        objectCreateFromInvoiceData.stdprecision = UtilSql.getValue(result, "stdprecision");
        objectCreateFromInvoiceData.description = UtilSql.getValue(result, "description");
        objectCreateFromInvoiceData.quantityorder = UtilSql.getValue(result, "quantityorder");
        objectCreateFromInvoiceData.mProductUomId = UtilSql.getValue(result, "m_product_uom_id");
        objectCreateFromInvoiceData.mAttributesetinstanceId = UtilSql.getValue(result, "m_attributesetinstance_id");
        objectCreateFromInvoiceData.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectCreateFromInvoiceData.taxbaseamt = UtilSql.getValue(result, "taxbaseamt");
        objectCreateFromInvoiceData.aAssetId = UtilSql.getValue(result, "a_asset_id");
        objectCreateFromInvoiceData.cProjectId = UtilSql.getValue(result, "c_project_id");
        objectCreateFromInvoiceData.cCostcenterId = UtilSql.getValue(result, "c_costcenter_id");
        objectCreateFromInvoiceData.user1Id = UtilSql.getValue(result, "user1_id");
        objectCreateFromInvoiceData.user2Id = UtilSql.getValue(result, "user2_id");
        objectCreateFromInvoiceData.explode = UtilSql.getValue(result, "explode");
        objectCreateFromInvoiceData.isorder = UtilSql.getValue(result, "isorder");
        objectCreateFromInvoiceData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectCreateFromInvoiceData);
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
        connectionProvider.releaseTransactionalPreparedStatement(st);
      } catch(Exception ignore){
        ignore.printStackTrace();
      }
    }
    CreateFromInvoiceData objectCreateFromInvoiceData[] = new CreateFromInvoiceData[vector.size()];
    vector.copyInto(objectCreateFromInvoiceData);
    return(objectCreateFromInvoiceData);
  }

  public static CreateFromInvoiceData[] selectFromShipmentUpdateSOTrx(Connection conn, ConnectionProvider connectionProvider, String adLanguage, String cOrderlineId)    throws ServletException {
    return selectFromShipmentUpdateSOTrx(conn, connectionProvider, adLanguage, cOrderlineId, 0, 0);
  }

  public static CreateFromInvoiceData[] selectFromShipmentUpdateSOTrx(Connection conn, ConnectionProvider connectionProvider, String adLanguage, String cOrderlineId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT (l.MovementQty - sum(COALESCE(CASE WHEN i.docstatus = 'CO' THEN il.qtyinvoiced ELSE 0 END, 0))) AS ID," +
      "        l.C_UOM_ID,uom.UOMSymbol, l.M_Product_ID,Ad_Column_Identifier(to_char('M_Product'), to_char(l.m_product_id), to_char(?)) AS NAME, l.M_InOutLine_ID,l.Line," +
      "        l.C_OrderLine_ID, max(uom.STDPRECISION) as stdprecision, l.Description,l.quantityOrder, l.M_Product_UOM_ID," +
      "        l.M_ATTRIBUTESETINSTANCE_ID, l.ad_org_id," +
      "        COALESCE(l.A_Asset_ID, s.A_Asset_ID) AS A_Asset_ID, COALESCE(l.C_Project_ID, s.C_Project_ID) AS C_Project_ID, " +
      "        COALESCE(l.C_Costcenter_ID, s.C_Costcenter_ID) AS C_Costcenter_ID," +
      "        COALESCE(l.User1_ID, s.User1_ID) AS User1_ID, COALESCE(l.User2_ID, s.User2_ID) AS User2_ID, " +
      "        l.explode, 'N' as isOrder" +
      "        FROM C_UOM uom, M_INOUTLINE l" +
      "          left join c_invoiceline il on l.m_inoutline_id = il.m_inoutline_id" +
      "          left join c_invoice i on il.c_invoice_id = i.c_invoice_id " +
      "        , M_PRODUCT p , M_InOut s" +
      "        WHERE l.M_InOut_ID = s.M_InOut_ID" +
      "        AND l.C_UOM_ID=uom.C_UOM_ID" +
      "        AND l.M_Product_ID=p.M_Product_ID ";
    strSql = strSql + ((cOrderlineId==null || cOrderlineId.equals(""))?"":"  AND l.M_InOutLine_ID IN " + cOrderlineId);
    strSql = strSql + 
      "        GROUP BY l.MovementQty,l.C_UOM_ID,uom.UOMSymbol,l.M_Product_ID,p.NAME, l.M_InOutLine_ID,l.Line,l.C_OrderLine_ID, l.Description, l.quantityOrder, l.M_Product_UOM_ID, l.M_ATTRIBUTESETINSTANCE_ID, l.ad_org_id, l.m_inout_id," +
      "        COALESCE(l.A_Asset_ID, s.A_Asset_ID), COALESCE(l.C_Project_ID, s.C_Project_ID), COALESCE(l.C_Costcenter_ID, s.C_Costcenter_ID)," +
      "        COALESCE(l.User1_ID, s.User1_ID), COALESCE(l.User2_ID, s.User2_ID), l.explode" +
      "        HAVING (l.movementqty >= 0 AND l.movementqty > SUM(COALESCE(CASE WHEN i.docstatus = 'CO' THEN il.qtyinvoiced ELSE 0 END, 0)))" +
      "          OR (l.movementqty < 0 AND l.movementqty < SUM(COALESCE(CASE WHEN i.docstatus = 'CO' THEN il.qtyinvoiced ELSE 0 END, 0)))" +
      "          OR(l.explode='Y') " +
      "        ORDER BY l.Line";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      if (cOrderlineId != null && !(cOrderlineId.equals(""))) {
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
        CreateFromInvoiceData objectCreateFromInvoiceData = new CreateFromInvoiceData();
        objectCreateFromInvoiceData.id = UtilSql.getValue(result, "id");
        objectCreateFromInvoiceData.cUomId = UtilSql.getValue(result, "c_uom_id");
        objectCreateFromInvoiceData.uomsymbol = UtilSql.getValue(result, "uomsymbol");
        objectCreateFromInvoiceData.mProductId = UtilSql.getValue(result, "m_product_id");
        objectCreateFromInvoiceData.name = UtilSql.getValue(result, "name");
        objectCreateFromInvoiceData.mInoutlineId = UtilSql.getValue(result, "m_inoutline_id");
        objectCreateFromInvoiceData.line = UtilSql.getValue(result, "line");
        objectCreateFromInvoiceData.cOrderlineId = UtilSql.getValue(result, "c_orderline_id");
        objectCreateFromInvoiceData.stdprecision = UtilSql.getValue(result, "stdprecision");
        objectCreateFromInvoiceData.description = UtilSql.getValue(result, "description");
        objectCreateFromInvoiceData.quantityorder = UtilSql.getValue(result, "quantityorder");
        objectCreateFromInvoiceData.mProductUomId = UtilSql.getValue(result, "m_product_uom_id");
        objectCreateFromInvoiceData.mAttributesetinstanceId = UtilSql.getValue(result, "m_attributesetinstance_id");
        objectCreateFromInvoiceData.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectCreateFromInvoiceData.aAssetId = UtilSql.getValue(result, "a_asset_id");
        objectCreateFromInvoiceData.cProjectId = UtilSql.getValue(result, "c_project_id");
        objectCreateFromInvoiceData.cCostcenterId = UtilSql.getValue(result, "c_costcenter_id");
        objectCreateFromInvoiceData.user1Id = UtilSql.getValue(result, "user1_id");
        objectCreateFromInvoiceData.user2Id = UtilSql.getValue(result, "user2_id");
        objectCreateFromInvoiceData.explode = UtilSql.getValue(result, "explode");
        objectCreateFromInvoiceData.isorder = UtilSql.getValue(result, "isorder");
        objectCreateFromInvoiceData.rownum = Long.toString(countRecord);
        objectCreateFromInvoiceData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectCreateFromInvoiceData);
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
        connectionProvider.releaseTransactionalPreparedStatement(st);
      } catch(Exception ignore){
        ignore.printStackTrace();
      }
    }
    CreateFromInvoiceData objectCreateFromInvoiceData[] = new CreateFromInvoiceData[vector.size()];
    vector.copyInto(objectCreateFromInvoiceData);
    return(objectCreateFromInvoiceData);
  }

  public static CreateFromInvoiceData[] set()    throws ServletException {
    CreateFromInvoiceData objectCreateFromInvoiceData[] = new CreateFromInvoiceData[1];
    objectCreateFromInvoiceData[0] = new CreateFromInvoiceData();
    objectCreateFromInvoiceData[0].id = "";
    objectCreateFromInvoiceData[0].cUomId = "";
    objectCreateFromInvoiceData[0].uomsymbol = "";
    objectCreateFromInvoiceData[0].mProductId = "";
    objectCreateFromInvoiceData[0].name = "";
    objectCreateFromInvoiceData[0].mInoutlineId = "";
    objectCreateFromInvoiceData[0].line = "";
    objectCreateFromInvoiceData[0].cOrderlineId = "";
    objectCreateFromInvoiceData[0].stdprecision = "";
    objectCreateFromInvoiceData[0].description = "";
    objectCreateFromInvoiceData[0].quantityorder = "";
    objectCreateFromInvoiceData[0].mProductUomId = "";
    objectCreateFromInvoiceData[0].mAttributesetinstanceId = "";
    objectCreateFromInvoiceData[0].adOrgId = "";
    objectCreateFromInvoiceData[0].aAssetId = "";
    objectCreateFromInvoiceData[0].cProjectId = "";
    objectCreateFromInvoiceData[0].cCostcenterId = "";
    objectCreateFromInvoiceData[0].user1Id = "";
    objectCreateFromInvoiceData[0].user2Id = "";
    objectCreateFromInvoiceData[0].explode = "";
    objectCreateFromInvoiceData[0].isorder = "";
    return objectCreateFromInvoiceData;
  }

  public static CreateFromInvoiceData[] selectPriceList(Connection conn, ConnectionProvider connectionProvider, String validfrom, String mPricelistId)    throws ServletException {
    return selectPriceList(conn, connectionProvider, validfrom, mPricelistId, 0, 0);
  }

  public static CreateFromInvoiceData[] selectPriceList(Connection conn, ConnectionProvider connectionProvider, String validfrom, String mPricelistId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT plv.M_PriceList_Version_ID AS ID, cur.Priceprecision" +
      "      FROM M_PRICELIST pl, M_PRICELIST_VERSION plv, C_CURRENCY cur" +
      "      WHERE pl.M_PriceList_ID = plv.M_PriceList_ID " +
      "      AND pl.C_Currency_ID = cur.C_Currency_ID" +
      "      AND plv.IsActive='Y'" +
      "      AND plv.ValidFrom <= TO_DATE(?) AND pl.M_PriceList_ID=? " +
      "      ORDER BY plv.ValidFrom DESC";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, validfrom);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mPricelistId);

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
        CreateFromInvoiceData objectCreateFromInvoiceData = new CreateFromInvoiceData();
        objectCreateFromInvoiceData.id = UtilSql.getValue(result, "id");
        objectCreateFromInvoiceData.priceprecision = UtilSql.getValue(result, "priceprecision");
        objectCreateFromInvoiceData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectCreateFromInvoiceData);
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
        connectionProvider.releaseTransactionalPreparedStatement(st);
      } catch(Exception ignore){
        ignore.printStackTrace();
      }
    }
    CreateFromInvoiceData objectCreateFromInvoiceData[] = new CreateFromInvoiceData[vector.size()];
    vector.copyInto(objectCreateFromInvoiceData);
    return(objectCreateFromInvoiceData);
  }

  public static CreateFromInvoiceData[] selectPrices(Connection conn, ConnectionProvider connectionProvider, String cOrderlineId)    throws ServletException {
    return selectPrices(conn, connectionProvider, cOrderlineId, 0, 0);
  }

  public static CreateFromInvoiceData[] selectPrices(Connection conn, ConnectionProvider connectionProvider, String cOrderlineId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT PriceActual, PriceList, PriceLimit, Description," +
      "          '' AS C_ORDERLINE_ID, PriceStd, CancelPriceAD," +
      "          gross_unit_price, COALESCE(grosspricelist,0) AS grosspricelist, COALESCE(grosspricestd,0) AS grosspricestd" +
      "      FROM C_OrderLine " +
      "      WHERE C_OrderLine_ID=?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cOrderlineId);

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
        CreateFromInvoiceData objectCreateFromInvoiceData = new CreateFromInvoiceData();
        objectCreateFromInvoiceData.priceactual = UtilSql.getValue(result, "priceactual");
        objectCreateFromInvoiceData.pricelist = UtilSql.getValue(result, "pricelist");
        objectCreateFromInvoiceData.pricelimit = UtilSql.getValue(result, "pricelimit");
        objectCreateFromInvoiceData.description = UtilSql.getValue(result, "description");
        objectCreateFromInvoiceData.cOrderlineId = UtilSql.getValue(result, "c_orderline_id");
        objectCreateFromInvoiceData.pricestd = UtilSql.getValue(result, "pricestd");
        objectCreateFromInvoiceData.cancelpricead = UtilSql.getValue(result, "cancelpricead");
        objectCreateFromInvoiceData.grossUnitPrice = UtilSql.getValue(result, "gross_unit_price");
        objectCreateFromInvoiceData.grosspricelist = UtilSql.getValue(result, "grosspricelist");
        objectCreateFromInvoiceData.grosspricestd = UtilSql.getValue(result, "grosspricestd");
        objectCreateFromInvoiceData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectCreateFromInvoiceData);
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
        connectionProvider.releaseTransactionalPreparedStatement(st);
      } catch(Exception ignore){
        ignore.printStackTrace();
      }
    }
    CreateFromInvoiceData objectCreateFromInvoiceData[] = new CreateFromInvoiceData[vector.size()];
    vector.copyInto(objectCreateFromInvoiceData);
    return(objectCreateFromInvoiceData);
  }

  public static CreateFromInvoiceData[] selectBOM(Connection conn, ConnectionProvider connectionProvider, String dateinvoiced, String cBpartnerId, String mProductId, String mPricelistVersionId)    throws ServletException {
    return selectBOM(conn, connectionProvider, dateinvoiced, cBpartnerId, mProductId, mPricelistVersionId, 0, 0);
  }

  public static CreateFromInvoiceData[] selectBOM(Connection conn, ConnectionProvider connectionProvider, String dateinvoiced, String cBpartnerId, String mProductId, String mPricelistVersionId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT M_BOM_PriceStd(pp.M_Product_ID,pp.M_PriceList_Version_ID) AS PriceStd," +
      "      M_BOM_PriceList(pp.M_Product_ID,pp.M_PriceList_Version_ID) AS PriceList," +
      "      M_BOM_PriceLimit(pp.M_Product_ID,pp.M_PriceList_Version_ID) AS PriceLimit, " +
      "      M_GET_OFFER_PRICE(M_GET_OFFER(to_date(?), ?, pp.M_Product_ID), M_BOM_PriceStd(pp.M_Product_ID,pp.M_PriceList_Version_ID)) AS PriceActual, " +
      "      M_GET_OFFER(to_date(?), ?, pp.M_Product_ID) AS M_Offer_ID" +
      "      FROM M_PRODUCTPRICE pp " +
      "      WHERE pp.M_Product_ID=? " +
      "      AND pp.M_PriceList_Version_ID=? ";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateinvoiced);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateinvoiced);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mPricelistVersionId);

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
        CreateFromInvoiceData objectCreateFromInvoiceData = new CreateFromInvoiceData();
        objectCreateFromInvoiceData.pricestd = UtilSql.getValue(result, "pricestd");
        objectCreateFromInvoiceData.pricelist = UtilSql.getValue(result, "pricelist");
        objectCreateFromInvoiceData.pricelimit = UtilSql.getValue(result, "pricelimit");
        objectCreateFromInvoiceData.priceactual = UtilSql.getValue(result, "priceactual");
        objectCreateFromInvoiceData.mOfferId = UtilSql.getValue(result, "m_offer_id");
        objectCreateFromInvoiceData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectCreateFromInvoiceData);
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
        connectionProvider.releaseTransactionalPreparedStatement(st);
      } catch(Exception ignore){
        ignore.printStackTrace();
      }
    }
    CreateFromInvoiceData objectCreateFromInvoiceData[] = new CreateFromInvoiceData[vector.size()];
    vector.copyInto(objectCreateFromInvoiceData);
    return(objectCreateFromInvoiceData);
  }

  public static int insert(Connection conn, ConnectionProvider connectionProvider, String cInvoicelineId, String cInvoiceId, String adClientId, String adOrgId, String adUserId, String cOrderlineId, String mInoutlineId, String description, String mProductId, String cUomId, String qtyinvoiced, String pricelist, String priceactual, String pricelimit, String linenetamt, String cTaxId, String taxAmt, String quantityOrder, String mProductUomId, String mAttributesetinstanceId, String pricestd, String taxBaseAmt, String grossUnitPrice, String grossAmount, String priceListGross, String priceStdGross, String isDeferredRevenue, String revplantype, String periodnumber, String cPeriodId, String aAssetId, String cProjectId, String cCostcenterId, String user1Id, String user2Id, String explode, String isOrder)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      INSERT INTO C_INVOICELINE " +
      "        (C_InvoiceLine_ID,C_Invoice_ID, AD_Client_ID,AD_Org_ID,IsActive," +
      "        Created,CreatedBy,Updated,UpdatedBy, " +
      "        C_OrderLine_ID,M_InOutLine_ID, Line,Description, M_Product_ID," +
      "        C_UOM_ID,QtyInvoiced, PriceList," +
      "        PriceActual,PriceLimit, LineNetAmt," +
      "        ChargeAmt,C_Tax_ID, taxamt , QuantityOrder, M_Product_UOM_ID," +
      "        M_Attributesetinstance_ID, PriceStd, taxbaseamt, excludeforwithholding," +
      "        gross_unit_price, line_gross_amount, grosspricelist, grosspricestd," +
      "        isdeferred, defplantype, periodnumber, c_period_id," +
      "        a_asset_id, c_project_id, c_costcenter_id, user1_id, user2_id, explode, " +
      "        BOM_Parent_id" +
      "        )" +
      "      VALUES " +
      "        (?, ?, ?, ?, 'Y', " +
      "         now(), ?, now(), ?, " +
      "         ?, ?, (SELECT (COALESCE(Max(Line),0))+10 FROM C_InvoiceLine WHERE C_Invoice_ID=?), ?, ?, " +
      "         ?, TO_NUMBER(?), TO_NUMBER(?), " +
      "         TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?)," +
      "         0, ?, TO_NUMBER(?), TO_NUMBER(?), ?, " +
      "         ?, TO_NUMBER(?), TO_NUMBER(?), 'N'," +
      "         TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?)," +
      "         ?, ?, TO_NUMBER(?), ?," +
      "         ?, ?, ?, ?, ?, ?," +
      "         (CASE to_char(?) WHEN 'Y' THEN (SELECT c_invoiceline_id " +
      "                                FROM c_invoiceline " +
      "                                WHERE c_invoice_id=? " +
      "                                   and c_orderline_id = (SELECT BOM_parent_id " +
      "                                                         FROM c_orderline " +
      "                                                         WHERE c_orderline_id = ?))" +
      "          ELSE (SELECT c_invoiceline_id " +
      "                FROM c_invoiceline " +
      "                WHERE c_invoice_id=? " +
      "                and m_inoutline_id = (SELECT BOM_parent_id " +
      "                                      FROM m_inoutline " +
      "                                      WHERE m_inoutline_id = ?)) END" +
      "         )" +
      "        )";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cInvoicelineId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cInvoiceId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cOrderlineId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mInoutlineId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cInvoiceId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cUomId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qtyinvoiced);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pricelist);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, priceactual);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pricelimit);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, linenetamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cTaxId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, taxAmt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, quantityOrder);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductUomId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mAttributesetinstanceId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pricestd);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, taxBaseAmt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, grossUnitPrice);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, grossAmount);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, priceListGross);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, priceStdGross);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isDeferredRevenue);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, revplantype);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, periodnumber);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cPeriodId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, aAssetId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cProjectId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCostcenterId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, user1Id);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, user2Id);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, explode);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isOrder);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cInvoiceId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cOrderlineId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cInvoiceId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mInoutlineId);

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

/**
Copies the order line accounting dimensions to invoice lines
 */
  public static int insertAcctDimension(Connection conn, ConnectionProvider connectionProvider, String cInvoicelineId, String adClientId, String adOrgId, String adUserId, String cOrderlineId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      INSERT INTO C_INVOICELINE_ACCTDIMENSION" +
      "        (C_InvoiceLine_AcctDimension_ID,C_InvoiceLine_ID, AD_Client_ID,AD_Org_ID,IsActive," +
      "        Created,CreatedBy,Updated,UpdatedBy," +
      "        C_Project_ID, C_Campaign_ID, User1_ID," +
      "        User2_ID, C_Activity_ID, C_Costcenter_ID," +
      "        C_BPartner_ID, M_Product_ID, A_Asset_ID, Amt" +
      "        )" +
      "        (SELECT GET_UUID(), ?, ?, ?, 'Y'," +
      "         now(), ?, now(), ?, C_Project_ID, C_Campaign_ID," +
      "         User1_ID, User2_ID, C_Activity_ID, C_Costcenter_Id," +
      "         C_BPartner_ID, M_Product_ID, A_Asset_ID, Amt" +
      "         FROM C_OrderLine_AcctDimension" +
      "         WHERE C_OrderLine_ID = ?" +
      "         )";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cInvoicelineId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cOrderlineId);

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

/**
Copies the in/out line accounting dimensions to invoice lines
 */
  public static int insertShipmentAcctDimension(Connection conn, ConnectionProvider connectionProvider, String cInvoicelineId, String adClientId, String adOrgId, String adUserId, String mInoutlineId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      INSERT INTO C_INVOICELINE_ACCTDIMENSION" +
      "        (C_InvoiceLine_AcctDimension_ID,C_InvoiceLine_ID, AD_Client_ID,AD_Org_ID,IsActive," +
      "        Created,CreatedBy,Updated,UpdatedBy," +
      "        C_Project_ID, C_Campaign_ID, User1_ID," +
      "        User2_ID, C_Activity_ID, C_Costcenter_ID," +
      "        C_BPartner_ID, M_Product_ID, A_Asset_ID," +
      "        Amt" +
      "        )" +
      "        (SELECT GET_UUID(), ?, ?, ?, 'Y'," +
      "         now(), ?, now(), ?, C_Project_ID, C_Campaign_ID," +
      "         User1_ID, User2_ID, C_Activity_ID, C_Costcenter_Id," +
      "         C_BPartner_ID, M_Product_ID, A_Asset_ID," +
      "         (Quantity*(SELECT PriceActual FROM C_InvoiceLine WHERE C_InvoiceLine_ID = ?))" +
      "         FROM M_InOutLine_AcctDimension" +
      "         WHERE M_InOutLine_ID = ?" +
      "         )";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cInvoicelineId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cInvoicelineId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mInoutlineId);

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

  public static int updateC_Order_ID(Connection conn, ConnectionProvider connectionProvider, String cOrderId, String cInvoiceId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      UPDATE C_Invoice SET C_Order_id = ?" +
      "      WHERE C_Invoice_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cOrderId);
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
        connectionProvider.releaseTransactionalPreparedStatement(st);
      } catch(Exception ignore){
        ignore.printStackTrace();
      }
    }
    return(updateCount);
  }

  public static int deleteC_Order_ID(Connection conn, ConnectionProvider connectionProvider, String cInvoiceId, String cOrderId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      UPDATE C_INVOICE SET C_Order_ID=NULL" +
      "      WHERE C_Invoice_ID=?" +
      "      AND C_Order_ID IS NOT NULL AND C_Order_ID <> ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cInvoiceId);
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
        connectionProvider.releaseTransactionalPreparedStatement(st);
      } catch(Exception ignore){
        ignore.printStackTrace();
      }
    }
    return(updateCount);
  }

  public static String selectProject(ConnectionProvider connectionProvider, String cInvoiceId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT C_Project_ID" +
      "      FROM C_INVOICE" +
      "      WHERE C_INVOICE_ID = ? ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cInvoiceId);

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

  public static String getTax(ConnectionProvider connectionProvider, String cOrderLineId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT C_Tax_ID" +
      "      FROM C_ORDERLINE" +
      "      WHERE C_ORDERLINE_ID = ? ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cOrderLineId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "c_tax_id");
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

  public static String getOffersPriceInvoice(ConnectionProvider connectionProvider, String dateordered, String cBpartnerId, String mProductId, String pricestd, String qty, String pricelist, String invoiceid)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT ROUND(M_GET_OFFERS_PRICE(TO_DATE(?),?,?,TO_NUMBER(?), TO_NUMBER(?), ?)," +
      "                    (SELECT PRICEPRECISION " +
      "                       FROM C_CURRENCY C," +
      "                            C_INVOICE  I " +
      "                      WHERE C.C_CURRENCY_ID = I.C_CURRENCY_ID" +
      "                        AND I.C_INVOICE_ID  = ?)) AS TOTAL FROM DUAL";

    ResultSet result;
    String strReturn = "0";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateordered);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pricestd);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qty);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pricelist);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, invoiceid);

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

  public static String selectTaxRate(ConnectionProvider connectionProvider, String cTaxId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT Rate" +
      "      FROM C_TAX" +
      "      WHERE C_Tax_ID = ?";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cTaxId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "rate");
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
