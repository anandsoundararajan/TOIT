//Sqlc generated V1.O00-1
package org.openbravo.erpCommon.ad_reports;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import java.util.*;

class ReportOrderNotInvoiceData implements FieldProvider {
static Logger log4j = Logger.getLogger(ReportOrderNotInvoiceData.class);
  private String InitRecordNumber="0";
  public String orgname;
  public String cBpartnerId;
  public String bpartnername;
  public String cOrderId;
  public String documentno;
  public String dateordered;
  public String grandtotal;
  public String convgrandtotal;
  public String invoicerule;
  public String line;
  public String product;
  public String price;
  public String convprice;
  public String qtyordered;
  public String uomsymbol;
  public String tax;
  public String taxbase;
  public String convtaxbase;
  public String linenetamt;
  public String convlinenetamt;
  public String ordercurrencysym;
  public String transcurrencyidorder;
  public String transdateorder;
  public String transclientidorder;
  public String transorgidorder;
  public String linecurrencysym;
  public String transcurrencyidline;
  public String transdateline;
  public String transclientidline;
  public String transorgidline;
  public String convsym;
  public String convisosym;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("orgname"))
      return orgname;
    else if (fieldName.equalsIgnoreCase("c_bpartner_id") || fieldName.equals("cBpartnerId"))
      return cBpartnerId;
    else if (fieldName.equalsIgnoreCase("bpartnername"))
      return bpartnername;
    else if (fieldName.equalsIgnoreCase("c_order_id") || fieldName.equals("cOrderId"))
      return cOrderId;
    else if (fieldName.equalsIgnoreCase("documentno"))
      return documentno;
    else if (fieldName.equalsIgnoreCase("dateordered"))
      return dateordered;
    else if (fieldName.equalsIgnoreCase("grandtotal"))
      return grandtotal;
    else if (fieldName.equalsIgnoreCase("convgrandtotal"))
      return convgrandtotal;
    else if (fieldName.equalsIgnoreCase("invoicerule"))
      return invoicerule;
    else if (fieldName.equalsIgnoreCase("line"))
      return line;
    else if (fieldName.equalsIgnoreCase("product"))
      return product;
    else if (fieldName.equalsIgnoreCase("price"))
      return price;
    else if (fieldName.equalsIgnoreCase("convprice"))
      return convprice;
    else if (fieldName.equalsIgnoreCase("qtyordered"))
      return qtyordered;
    else if (fieldName.equalsIgnoreCase("uomsymbol"))
      return uomsymbol;
    else if (fieldName.equalsIgnoreCase("tax"))
      return tax;
    else if (fieldName.equalsIgnoreCase("taxbase"))
      return taxbase;
    else if (fieldName.equalsIgnoreCase("convtaxbase"))
      return convtaxbase;
    else if (fieldName.equalsIgnoreCase("linenetamt"))
      return linenetamt;
    else if (fieldName.equalsIgnoreCase("convlinenetamt"))
      return convlinenetamt;
    else if (fieldName.equalsIgnoreCase("ordercurrencysym"))
      return ordercurrencysym;
    else if (fieldName.equalsIgnoreCase("transcurrencyidorder"))
      return transcurrencyidorder;
    else if (fieldName.equalsIgnoreCase("transdateorder"))
      return transdateorder;
    else if (fieldName.equalsIgnoreCase("transclientidorder"))
      return transclientidorder;
    else if (fieldName.equalsIgnoreCase("transorgidorder"))
      return transorgidorder;
    else if (fieldName.equalsIgnoreCase("linecurrencysym"))
      return linecurrencysym;
    else if (fieldName.equalsIgnoreCase("transcurrencyidline"))
      return transcurrencyidline;
    else if (fieldName.equalsIgnoreCase("transdateline"))
      return transdateline;
    else if (fieldName.equalsIgnoreCase("transclientidline"))
      return transclientidline;
    else if (fieldName.equalsIgnoreCase("transorgidline"))
      return transorgidline;
    else if (fieldName.equalsIgnoreCase("convsym"))
      return convsym;
    else if (fieldName.equalsIgnoreCase("convisosym"))
      return convisosym;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static ReportOrderNotInvoiceData[] select(ConnectionProvider connectionProvider, String cCurrencyConv, String adLanguage, String adUserClient, String adUserOrg, String cBpartnerId, String cOrgId, String invoiceRule, String dateFrom, String dateTo)    throws ServletException {
    return select(connectionProvider, cCurrencyConv, adLanguage, adUserClient, adUserOrg, cBpartnerId, cOrgId, invoiceRule, dateFrom, dateTo, 0, 0);
  }

  public static ReportOrderNotInvoiceData[] select(ConnectionProvider connectionProvider, String cCurrencyConv, String adLanguage, String adUserClient, String adUserOrg, String cBpartnerId, String cOrgId, String invoiceRule, String dateFrom, String dateTo, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT ORGNAME, C_BPARTNER_ID, BPARTNERNAME, C_ORDER_ID, DOCUMENTNO, DATEORDERED, GRANDTOTAL, CONVGRANDTOTAL, INVOICERULE,       " +
      "	  LINE, PRODUCT, PRICE, CONVPRICE, QTYORDERED, UOMSYMBOL, TAX, TAXBASE, CONVTAXBASE, LINENETAMT, CONVLINENETAMT," +
      "	  ORDERCURRENCYSYM, TRANSCURRENCYIDORDER, TRANSDATEORDER, TRANSCLIENTIDORDER, TRANSORGIDORDER," +
      "	  LINECURRENCYSYM, TRANSCURRENCYIDLINE, TRANSDATELINE, TRANSCLIENTIDLINE, TRANSORGIDLINE," +
      "	  C_CURRENCY_SYMBOL(?, 0, 'Y') AS CONVSYM, C_CURRENCY_ISOSYM(?) AS CONVISOSYM" +
      "	  FROM (" +
      "	  SELECT AD_ORG.NAME AS ORGNAME, C_BPARTNER.C_BPARTNER_ID, C_BPARTNER.NAME AS BPARTNERNAME, C_ORDER.C_ORDER_ID, C_ORDER.DOCUMENTNO, C_ORDER.DATEORDERED, C_ORDER.GRANDTOTAL," +
      "	  C_CURRENCY_CONVERT(C_ORDER.GRANDTOTAL, C_ORDER.C_CURRENCY_ID, ?, TO_DATE(COALESCE(C_ORDER.DATEORDERED, NOW())), NULL, C_ORDER.AD_CLIENT_ID, C_ORDER.AD_ORG_ID) AS CONVGRANDTOTAL, " +
      "	  (CASE C_ORDER.INVOICERULE WHEN 'S' THEN COALESCE(AD_REF_LIST_TRL.NAME, AD_REF_LIST.NAME)||' ('||C_INVOICESCHEDULE.NAME||')' ELSE COALESCE(AD_REF_LIST_TRL.NAME, AD_REF_LIST.NAME) END) AS INVOICERULE,      " +
      "	  C_ORDERLINE.LINE AS LINE, COALESCE(M_PRODUCT.NAME, M_PRODUCT.DESCRIPTION) AS PRODUCT, C_ORDERLINE.PRICEACTUAL AS PRICE," +
      "	  C_CURRENCY_CONVERT(C_ORDERLINE.PRICEACTUAL, COALESCE(C_ORDERLINE.C_CURRENCY_ID, C_ORDER.C_CURRENCY_ID), ?, TO_DATE(COALESCE(C_ORDER.DATEORDERED, NOW())), NULL, C_ORDERLINE.AD_CLIENT_ID, C_ORDERLINE.AD_ORG_ID) AS CONVPRICE,        " +
      "	  C_ORDERLINE.QTYORDERED - C_ORDERLINE.QTYINVOICED AS QTYORDERED, C_UOM.UOMSYMBOL, NULL AS TAX, NULL AS TAXBASE, NULL AS CONVTAXBASE, C_ORDERLINE.LINENETAMT," +
      "	  C_CURRENCY_CONVERT(C_ORDERLINE.LINENETAMT, COALESCE(C_ORDERLINE.C_CURRENCY_ID, C_ORDER.C_CURRENCY_ID), ?, TO_DATE(COALESCE(C_ORDER.DATEORDERED, NOW())), NULL, C_ORDERLINE.AD_CLIENT_ID, C_ORDERLINE.AD_ORG_ID) AS CONVLINENETAMT,        " +
      "	  C_CURRENCY_SYMBOL(C_ORDER.C_CURRENCY_ID, 0, 'Y') AS ORDERCURRENCYSYM," +
      "	  C_ORDER.C_CURRENCY_ID AS TRANSCURRENCYIDORDER," +
      "	  C_ORDER.DATEORDERED AS TRANSDATEORDER," +
      "	  C_ORDER.AD_CLIENT_ID AS TRANSCLIENTIDORDER," +
      "	  C_ORDER.AD_ORG_ID AS TRANSORGIDORDER," +
      "	  C_CURRENCY_SYMBOL(COALESCE(C_ORDERLINE.C_CURRENCY_ID, C_ORDER.C_CURRENCY_ID), 0, 'Y') AS LINECURRENCYSYM," +
      "	  COALESCE(C_ORDERLINE.C_CURRENCY_ID, C_ORDER.C_CURRENCY_ID) AS TRANSCURRENCYIDLINE," +
      "	  TO_DATE(COALESCE(C_ORDER.DATEORDERED, NOW())) AS TRANSDATELINE," +
      "	  C_ORDERLINE.AD_CLIENT_ID AS TRANSCLIENTIDLINE," +
      "	  C_ORDERLINE.AD_ORG_ID AS TRANSORGIDLINE " +
      "      FROM C_BPARTNER left join C_INVOICESCHEDULE on C_BPARTNER.C_INVOICESCHEDULE_ID = C_INVOICESCHEDULE.C_INVOICESCHEDULE_ID," +
      "           AD_REF_LIST left join AD_REF_LIST_TRL  on AD_REF_LIST.AD_REF_LIST_ID = AD_REF_LIST_TRL.AD_REF_LIST_ID  " +
      "                                                     and AD_REF_LIST_TRL.AD_LANGUAGE = ?," +
      "           C_ORDERLINE left join M_PRODUCT on C_ORDERLINE.M_PRODUCT_ID=M_PRODUCT.M_PRODUCT_ID," +
      "           C_ORDER, AD_ORG, C_UOM, C_CURRENCY" +
      "      WHERE C_ORDER.C_ORDER_ID=C_ORDERLINE.C_ORDER_ID" +
      "      AND C_ORDER.C_BPARTNER_ID = C_BPARTNER.C_BPARTNER_ID" +
      "      AND C_ORDER.INVOICERULE = AD_REF_LIST.VALUE" +
      "      AND C_ORDER.INVOICERULE <> 'N'" +
      "      AND C_ORDERLINE.C_UOM_ID = C_UOM.C_UOM_ID" +
      "      AND C_ORDER.AD_ORG_ID = AD_ORG.AD_ORG_ID" +
      "      AND C_ORDER.C_CURRENCY_ID = C_CURRENCY.C_CURRENCY_ID" +
      "      AND AD_REF_LIST.AD_REFERENCE_ID = '150'" +
      "      AND C_ORDER.PROCESSED = 'Y'" +
      "      AND C_ORDER.DOCSTATUS NOT IN ('CJ', 'UE', 'CA')" +
      "      AND C_ORDER.ISSOTRX = 'Y'" +
      "      AND C_ORDERLINE.QTYORDERED<>C_ORDERLINE.QTYINVOICED " +
      "      AND C_ORDER.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ")" +
      "      AND C_ORDER.AD_ORG_ID IN (";
    strSql = strSql + ((adUserOrg==null || adUserOrg.equals(""))?"":adUserOrg);
    strSql = strSql + 
      ")" +
      "      AND 1=1";
    strSql = strSql + ((cBpartnerId==null || cBpartnerId.equals(""))?"":" AND C_ORDER.C_BPARTNER_ID = ? ");
    strSql = strSql + ((cOrgId==null || cOrgId.equals(""))?"":" AND C_ORDER.AD_ORG_ID = ? ");
    strSql = strSql + ((invoiceRule==null || invoiceRule.equals(""))?"":" AND C_ORDER.INVOICERULE = ? ");
    strSql = strSql + ((dateFrom==null || dateFrom.equals(""))?"":"  AND C_ORDER.DATEORDERED >= to_date(?)  ");
    strSql = strSql + ((dateTo==null || dateTo.equals(""))?"":"  AND C_ORDER.DATEORDERED < to_date(?)  ");
    strSql = strSql + 
      "      UNION ALL" +
      "      SELECT AD_ORG.NAME AS ORGNAME, C_BPARTNER.C_BPARTNER_ID, C_BPARTNER.NAME AS BPARTNERNAME, C.C_ORDER_ID, C.DOCUMENTNO, C.DATEORDERED, C.GRANDTOTAL," +
      "	  C_CURRENCY_CONVERT(C.GRANDTOTAL, C.C_CURRENCY_ID, ?, TO_DATE(COALESCE(C.DATEORDERED, NOW())), NULL, C.AD_CLIENT_ID, C.AD_ORG_ID) AS CONVGRANDTOTAL, " +
      "	  (CASE C.INVOICERULE WHEN 'S' THEN COALESCE(AD_REF_LIST_TRL.NAME, AD_REF_LIST.NAME)||' ('||C_INVOICESCHEDULE.NAME||')' ELSE COALESCE(AD_REF_LIST_TRL.NAME, AD_REF_LIST.NAME) END) AS INVOICERULE,      " +
      "	  NULL AS LINE , C_TAX.NAME AS PRODUCT, NULL AS PRICE, NULL AS CONVPRICE, NULL AS QTYORDERED, NULL AS UOMSYMBOL, " +
      "	  C_TAX.RATE AS TAX,  C_ORDERTAX.TAXBASEAMT AS TAXBASE," +
      "	  C_CURRENCY_CONVERT(C_ORDERTAX.TAXBASEAMT, C.C_CURRENCY_ID, ?, TO_DATE(COALESCE(C.DATEORDERED, NOW())), NULL, C_ORDERTAX.AD_CLIENT_ID, C_ORDERTAX.AD_ORG_ID) AS CONVTAXBASE,         " +
      "	  C_ORDERTAX.TAXAMT AS LINENETAMT," +
      "	  C_CURRENCY_CONVERT(C_ORDERTAX.TAXAMT, C.C_CURRENCY_ID, ?, TO_DATE(COALESCE(C.DATEORDERED, NOW())), NULL, C_ORDERTAX.AD_CLIENT_ID, C_ORDERTAX.AD_ORG_ID) AS CONVLINENETAMT,        " +
      "	  C_CURRENCY_SYMBOL(C.C_CURRENCY_ID, 0, 'Y') AS ORDERCURRENCYSYM," +
      "	  C.C_CURRENCY_ID AS TRANSCURRENCYIDORDER," +
      "	  C.DATEORDERED AS TRANSDATEORDER," +
      "	  C.AD_CLIENT_ID AS TRANSCLIENTIDORDER," +
      "	  C.AD_ORG_ID AS TRANSORGIDORDER," +
      "	  C_CURRENCY_SYMBOL(C.C_CURRENCY_ID, 0, 'Y') AS LINECURRENCYSYM," +
      "	  C.C_CURRENCY_ID AS TRANSCURRENCYIDLINE," +
      "	  TO_DATE(COALESCE(C.DATEORDERED, NOW())) AS TRANSDATELINE," +
      "	  C_ORDERTAX.AD_CLIENT_ID AS TRANSCLIENTIDLINE," +
      "	  C_ORDERTAX.AD_ORG_ID AS TRANSORGIDLINE" +
      "      FROM C_BPARTNER left join C_INVOICESCHEDULE on C_BPARTNER.C_INVOICESCHEDULE_ID = C_INVOICESCHEDULE.C_INVOICESCHEDULE_ID," +
      "           AD_REF_LIST left join AD_REF_LIST_TRL on AD_REF_LIST.AD_REF_LIST_ID = AD_REF_LIST_TRL.AD_REF_LIST_ID " +
      "                                                 AND AD_REF_LIST_TRL.AD_LANGUAGE = ? ," +
      "      C_ORDER C ,C_ORDERTAX, AD_ORG,  C_TAX, C_CURRENCY      " +
      "      WHERE C.C_ORDER_ID=C_ORDERTAX.C_ORDER_ID" +
      "      AND C.C_BPARTNER_ID=C_BPARTNER.C_BPARTNER_ID" +
      "      AND C.C_CURRENCY_ID = C_CURRENCY.C_CURRENCY_ID" +
      "      AND C.INVOICERULE = AD_REF_LIST.VALUE" +
      "      AND C.INVOICERULE <> 'N'" +
      "      AND AD_REF_LIST.AD_REFERENCE_ID = '150'" +
      "      AND C_ORDERTAX.C_TAX_ID = C_TAX.C_TAX_ID" +
      "      AND C.AD_ORG_ID = AD_ORG.AD_ORG_ID" +
      "      AND C.PROCESSED = 'Y'" +
      "      AND C.DOCSTATUS NOT IN ('CJ', 'UE', 'CA')" +
      "      AND C.ISSOTRX = 'Y'" +
      "      AND EXISTS (SELECT 1 FROM C_ORDER C2, C_ORDERLINE CL" +
      "                 WHERE C2.c_order_id = C.c_order_id" +
      "                 and c2.c_order_id=cl.c_order_id" +
      "                 and cl.QTYORDERED<>cl.QTYINVOICED)" +
      "      AND C.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ")" +
      "      AND C.AD_ORG_ID IN (";
    strSql = strSql + ((adUserOrg==null || adUserOrg.equals(""))?"":adUserOrg);
    strSql = strSql + 
      ")" +
      "      AND 2=2";
    strSql = strSql + ((cBpartnerId==null || cBpartnerId.equals(""))?"":" AND C.C_BPARTNER_ID = ? ");
    strSql = strSql + ((cOrgId==null || cOrgId.equals(""))?"":" AND C.AD_ORG_ID = ? ");
    strSql = strSql + ((invoiceRule==null || invoiceRule.equals(""))?"":" AND C.INVOICERULE = ? ");
    strSql = strSql + ((dateFrom==null || dateFrom.equals(""))?"":"  AND C.DATEORDERED >= to_date(?)  ");
    strSql = strSql + ((dateTo==null || dateTo.equals(""))?"":"  AND C.DATEORDERED < to_date(?)  ");
    strSql = strSql + 
      "      ) AAA" +
      "      ORDER BY ORGNAME, BPARTNERNAME, DATEORDERED DESC, DOCUMENTNO, LINE";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCurrencyConv);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCurrencyConv);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCurrencyConv);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCurrencyConv);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCurrencyConv);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      if (adUserClient != null && !(adUserClient.equals(""))) {
        }
      if (adUserOrg != null && !(adUserOrg.equals(""))) {
        }
      if (cBpartnerId != null && !(cBpartnerId.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      }
      if (cOrgId != null && !(cOrgId.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, cOrgId);
      }
      if (invoiceRule != null && !(invoiceRule.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, invoiceRule);
      }
      if (dateFrom != null && !(dateFrom.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateFrom);
      }
      if (dateTo != null && !(dateTo.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateTo);
      }
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCurrencyConv);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCurrencyConv);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCurrencyConv);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      if (adUserClient != null && !(adUserClient.equals(""))) {
        }
      if (adUserOrg != null && !(adUserOrg.equals(""))) {
        }
      if (cBpartnerId != null && !(cBpartnerId.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      }
      if (cOrgId != null && !(cOrgId.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, cOrgId);
      }
      if (invoiceRule != null && !(invoiceRule.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, invoiceRule);
      }
      if (dateFrom != null && !(dateFrom.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateFrom);
      }
      if (dateTo != null && !(dateTo.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateTo);
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
        ReportOrderNotInvoiceData objectReportOrderNotInvoiceData = new ReportOrderNotInvoiceData();
        objectReportOrderNotInvoiceData.orgname = UtilSql.getValue(result, "orgname");
        objectReportOrderNotInvoiceData.cBpartnerId = UtilSql.getValue(result, "c_bpartner_id");
        objectReportOrderNotInvoiceData.bpartnername = UtilSql.getValue(result, "bpartnername");
        objectReportOrderNotInvoiceData.cOrderId = UtilSql.getValue(result, "c_order_id");
        objectReportOrderNotInvoiceData.documentno = UtilSql.getValue(result, "documentno");
        objectReportOrderNotInvoiceData.dateordered = UtilSql.getDateValue(result, "dateordered", "dd-MM-yyyy");
        objectReportOrderNotInvoiceData.grandtotal = UtilSql.getValue(result, "grandtotal");
        objectReportOrderNotInvoiceData.convgrandtotal = UtilSql.getValue(result, "convgrandtotal");
        objectReportOrderNotInvoiceData.invoicerule = UtilSql.getValue(result, "invoicerule");
        objectReportOrderNotInvoiceData.line = UtilSql.getValue(result, "line");
        objectReportOrderNotInvoiceData.product = UtilSql.getValue(result, "product");
        objectReportOrderNotInvoiceData.price = UtilSql.getValue(result, "price");
        objectReportOrderNotInvoiceData.convprice = UtilSql.getValue(result, "convprice");
        objectReportOrderNotInvoiceData.qtyordered = UtilSql.getValue(result, "qtyordered");
        objectReportOrderNotInvoiceData.uomsymbol = UtilSql.getValue(result, "uomsymbol");
        objectReportOrderNotInvoiceData.tax = UtilSql.getValue(result, "tax");
        objectReportOrderNotInvoiceData.taxbase = UtilSql.getValue(result, "taxbase");
        objectReportOrderNotInvoiceData.convtaxbase = UtilSql.getValue(result, "convtaxbase");
        objectReportOrderNotInvoiceData.linenetamt = UtilSql.getValue(result, "linenetamt");
        objectReportOrderNotInvoiceData.convlinenetamt = UtilSql.getValue(result, "convlinenetamt");
        objectReportOrderNotInvoiceData.ordercurrencysym = UtilSql.getValue(result, "ordercurrencysym");
        objectReportOrderNotInvoiceData.transcurrencyidorder = UtilSql.getValue(result, "transcurrencyidorder");
        objectReportOrderNotInvoiceData.transdateorder = UtilSql.getDateValue(result, "transdateorder", "dd-MM-yyyy");
        objectReportOrderNotInvoiceData.transclientidorder = UtilSql.getValue(result, "transclientidorder");
        objectReportOrderNotInvoiceData.transorgidorder = UtilSql.getValue(result, "transorgidorder");
        objectReportOrderNotInvoiceData.linecurrencysym = UtilSql.getValue(result, "linecurrencysym");
        objectReportOrderNotInvoiceData.transcurrencyidline = UtilSql.getValue(result, "transcurrencyidline");
        objectReportOrderNotInvoiceData.transdateline = UtilSql.getDateValue(result, "transdateline", "dd-MM-yyyy");
        objectReportOrderNotInvoiceData.transclientidline = UtilSql.getValue(result, "transclientidline");
        objectReportOrderNotInvoiceData.transorgidline = UtilSql.getValue(result, "transorgidline");
        objectReportOrderNotInvoiceData.convsym = UtilSql.getValue(result, "convsym");
        objectReportOrderNotInvoiceData.convisosym = UtilSql.getValue(result, "convisosym");
        objectReportOrderNotInvoiceData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectReportOrderNotInvoiceData);
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
    ReportOrderNotInvoiceData objectReportOrderNotInvoiceData[] = new ReportOrderNotInvoiceData[vector.size()];
    vector.copyInto(objectReportOrderNotInvoiceData);
    return(objectReportOrderNotInvoiceData);
  }

  public static ReportOrderNotInvoiceData[] set()    throws ServletException {
    ReportOrderNotInvoiceData objectReportOrderNotInvoiceData[] = new ReportOrderNotInvoiceData[1];
    objectReportOrderNotInvoiceData[0] = new ReportOrderNotInvoiceData();
    objectReportOrderNotInvoiceData[0].orgname = "";
    objectReportOrderNotInvoiceData[0].cBpartnerId = "";
    objectReportOrderNotInvoiceData[0].bpartnername = "";
    objectReportOrderNotInvoiceData[0].cOrderId = "";
    objectReportOrderNotInvoiceData[0].documentno = "";
    objectReportOrderNotInvoiceData[0].dateordered = "";
    objectReportOrderNotInvoiceData[0].grandtotal = "";
    objectReportOrderNotInvoiceData[0].convgrandtotal = "";
    objectReportOrderNotInvoiceData[0].invoicerule = "";
    objectReportOrderNotInvoiceData[0].line = "";
    objectReportOrderNotInvoiceData[0].product = "";
    objectReportOrderNotInvoiceData[0].price = "";
    objectReportOrderNotInvoiceData[0].convprice = "";
    objectReportOrderNotInvoiceData[0].qtyordered = "";
    objectReportOrderNotInvoiceData[0].uomsymbol = "";
    objectReportOrderNotInvoiceData[0].tax = "";
    objectReportOrderNotInvoiceData[0].taxbase = "";
    objectReportOrderNotInvoiceData[0].convtaxbase = "";
    objectReportOrderNotInvoiceData[0].linenetamt = "";
    objectReportOrderNotInvoiceData[0].convlinenetamt = "";
    objectReportOrderNotInvoiceData[0].ordercurrencysym = "";
    objectReportOrderNotInvoiceData[0].transcurrencyidorder = "";
    objectReportOrderNotInvoiceData[0].transdateorder = "";
    objectReportOrderNotInvoiceData[0].transclientidorder = "";
    objectReportOrderNotInvoiceData[0].transorgidorder = "";
    objectReportOrderNotInvoiceData[0].linecurrencysym = "";
    objectReportOrderNotInvoiceData[0].transcurrencyidline = "";
    objectReportOrderNotInvoiceData[0].transdateline = "";
    objectReportOrderNotInvoiceData[0].transclientidline = "";
    objectReportOrderNotInvoiceData[0].transorgidline = "";
    objectReportOrderNotInvoiceData[0].convsym = "";
    objectReportOrderNotInvoiceData[0].convisosym = "";
    return objectReportOrderNotInvoiceData;
  }

  public static String bPartnerDescription(ConnectionProvider connectionProvider, String cBpartnerId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "    SELECT max(NAME) as name FROM C_BPARTNER " +
      "    WHERE C_BPARTNER_ID = ?";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);

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
}
