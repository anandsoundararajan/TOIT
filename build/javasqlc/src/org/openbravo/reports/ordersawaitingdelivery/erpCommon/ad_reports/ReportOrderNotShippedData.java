//Sqlc generated V1.O00-1
package org.openbravo.reports.ordersawaitingdelivery.erpCommon.ad_reports;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import java.util.*;

class ReportOrderNotShippedData implements FieldProvider {
static Logger log4j = Logger.getLogger(ReportOrderNotShippedData.class);
  private String InitRecordNumber="0";
  public String orgname;
  public String bpname;
  public String documentno;
  public String poreference;
  public String dateordered;
  public String datepromised;
  public String deliveryrule;
  public String deliverylocation;
  public String prodname;
  public String mAttributesetinstanceId;
  public String orderedqty;
  public String pendingqty;
  public String qtyinstock;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("orgname"))
      return orgname;
    else if (fieldName.equalsIgnoreCase("bpname"))
      return bpname;
    else if (fieldName.equalsIgnoreCase("documentno"))
      return documentno;
    else if (fieldName.equalsIgnoreCase("poreference"))
      return poreference;
    else if (fieldName.equalsIgnoreCase("dateordered"))
      return dateordered;
    else if (fieldName.equalsIgnoreCase("datepromised"))
      return datepromised;
    else if (fieldName.equalsIgnoreCase("deliveryrule"))
      return deliveryrule;
    else if (fieldName.equalsIgnoreCase("deliverylocation"))
      return deliverylocation;
    else if (fieldName.equalsIgnoreCase("prodname"))
      return prodname;
    else if (fieldName.equalsIgnoreCase("m_attributesetinstance_id") || fieldName.equals("mAttributesetinstanceId"))
      return mAttributesetinstanceId;
    else if (fieldName.equalsIgnoreCase("orderedqty"))
      return orderedqty;
    else if (fieldName.equalsIgnoreCase("pendingqty"))
      return pendingqty;
    else if (fieldName.equalsIgnoreCase("qtyinstock"))
      return qtyinstock;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static ReportOrderNotShippedData[] select(ConnectionProvider connectionProvider, String adLanguage, String adUserClient, String adUserOrg, String dateFrom, String dateTo, String cBpartnerId, String deliveryTerms, String orderDocNo, String orderRef, String cOrgId)    throws ServletException {
    return select(connectionProvider, adLanguage, adUserClient, adUserOrg, dateFrom, dateTo, cBpartnerId, deliveryTerms, orderDocNo, orderRef, cOrgId, 0, 0);
  }

  public static ReportOrderNotShippedData[] select(ConnectionProvider connectionProvider, String adLanguage, String adUserClient, String adUserOrg, String dateFrom, String dateTo, String cBpartnerId, String deliveryTerms, String orderDocNo, String orderRef, String cOrgId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "    SELECT ORG.NAME AS ORGNAME, BP.NAME AS BPNAME, " +
      "    O.DOCUMENTNO, O.POREFERENCE, TO_DATE(O.DATEORDERED) AS DATEORDERED, TO_DATE(O.DATEPROMISED) AS DATEPROMISED, " +
      "    REFLISTV.NAME AS DELIVERYRULE, COALESCE(DLOC.NAME, BPADD.NAME) AS DELIVERYLOCATION," +
      "    PR.NAME || ' ' || COALESCE(TO_CHAR(ASI.DESCRIPTION), '') AS PRODNAME, OL.M_ATTRIBUTESETINSTANCE_ID," +
      "    OL.QTYORDERED || ' ' || COALESCE(TO_CHAR(UO.UOMSYMBOL), '') AS ORDEREDQTY, " +
      "    (OL.QTYORDERED-OL.QTYDELIVERED) || ' ' || COALESCE(TO_CHAR(UO.UOMSYMBOL), '') AS PENDINGQTY, " +
      "    SUM(SD.QTYONHAND) || ' ' || COALESCE(TO_CHAR(UO.UOMSYMBOL), '') AS QTYINSTOCK" +
      "    FROM AD_ORG ORG, C_BPARTNER BP, C_BPARTNER_LOCATION BPADD, " +
      "    M_PRODUCT PR, C_UOM UO, " +
      "    C_ORDER O" +
      "    LEFT JOIN AD_REF_LIST_V REFLISTV" +
      "    ON REFLISTV.VALUE = O.DELIVERYRULE" +
      "    LEFT JOIN C_BPARTNER_LOCATION DLOC" +
      "    ON DLOC.C_BPARTNER_LOCATION_ID = O.DELIVERY_LOCATION_ID," +
      "    C_ORDERLINE OL" +
      "    LEFT JOIN M_ATTRIBUTESETINSTANCE ASI" +
      "    ON OL.M_ATTRIBUTESETINSTANCE_ID = ASI.M_ATTRIBUTESETINSTANCE_ID" +
      "    LEFT JOIN M_STORAGE_DETAIL SD" +
      "    ON OL.M_PRODUCT_ID = SD.M_PRODUCT_ID" +
      "    AND OL.C_UOM_ID = SD.C_UOM_ID" +
      "    AND COALESCE(OL.M_ATTRIBUTESETINSTANCE_ID,'0') = COALESCE(SD.M_ATTRIBUTESETINSTANCE_ID,'0')" +
      "    AND COALESCE(OL.M_PRODUCT_UOM_ID, '-1') = COALESCE(SD.M_PRODUCT_UOM_ID,'-1')" +
      "    AND SD.M_LOCATOR_ID IN (SELECT LOC.M_LOCATOR_ID" +
      "    FROM M_LOCATOR LOC" +
      "    WHERE LOC.M_WAREHOUSE_ID = OL.M_WAREHOUSE_ID)" +
      "    WHERE O.AD_ORG_ID = ORG.AD_ORG_ID" +
      "    AND O.C_BPARTNER_ID = BP.C_BPARTNER_ID" +
      "    AND O.C_BPARTNER_LOCATION_ID = BPADD.C_BPARTNER_LOCATION_ID" +
      "    AND O.C_ORDER_ID = OL.C_ORDER_ID" +
      "    AND O.DOCSTATUS = 'CO'" +
      "    AND O.ISSOTRX = 'Y'" +
      "    AND OL.M_PRODUCT_ID = PR.M_PRODUCT_ID" +
      "    AND OL.C_UOM_ID = UO.C_UOM_ID" +
      "    AND EXISTS (SELECT 1" +
      "    FROM C_ORDER ORD, C_ORDERLINE ORDL" +
      "    WHERE ORD.C_ORDER_ID = O.C_ORDER_ID" +
      "    AND ORD.C_ORDER_ID = ORDL.C_ORDER_ID" +
      "    AND ORDL.QTYORDERED <> ORDL.QTYDELIVERED)" +
      "    AND REFLISTV.AD_REFERENCE_ID = '151'" +
      "    AND REFLISTV.AD_LANGUAGE = ?" +
      "    AND O.AD_CLIENT_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ")" +
      "    AND O.AD_ORG_ID IN (";
    strSql = strSql + ((adUserOrg==null || adUserOrg.equals(""))?"":adUserOrg);
    strSql = strSql + 
      ")" +
      "    AND 1=1";
    strSql = strSql + ((dateFrom==null || dateFrom.equals(""))?"":"  AND O.DATEORDERED >= TO_DATE(?)  ");
    strSql = strSql + ((dateTo==null || dateTo.equals(""))?"":"  AND O.DATEORDERED < TO_DATE(?)  ");
    strSql = strSql + ((cBpartnerId==null || cBpartnerId.equals(""))?"":" AND O.C_BPARTNER_ID = ? ");
    strSql = strSql + ((deliveryTerms==null || deliveryTerms.equals(""))?"":" AND O.DELIVERYRULE = ? ");
    strSql = strSql + ((orderDocNo==null || orderDocNo.equals(""))?"":" AND UPPER(O.DOCUMENTNO) LIKE '%'||UPPER(?)||'%' ");
    strSql = strSql + ((orderRef==null || orderRef.equals(""))?"":" AND UPPER(O.POREFERENCE) LIKE '%'||UPPER(?)||'%' ");
    strSql = strSql + ((cOrgId==null || cOrgId.equals(""))?"":" AND O.AD_ORG_ID = ? ");
    strSql = strSql + 
      "    GROUP BY ORG.NAME, BP.NAME, O.DOCUMENTNO, O.POREFERENCE, O.DATEORDERED, O.DATEPROMISED," +
      "    REFLISTV.NAME, DLOC.NAME, BPADD.NAME, PR.NAME, ASI.DESCRIPTION, OL.M_ATTRIBUTESETINSTANCE_ID," +
      "    OL.QTYORDERED, UO.UOMSYMBOL, OL.QTYDELIVERED" +
      "    ORDER BY ORGNAME, BPNAME, DOCUMENTNO";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      if (adUserClient != null && !(adUserClient.equals(""))) {
        }
      if (adUserOrg != null && !(adUserOrg.equals(""))) {
        }
      if (dateFrom != null && !(dateFrom.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateFrom);
      }
      if (dateTo != null && !(dateTo.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateTo);
      }
      if (cBpartnerId != null && !(cBpartnerId.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      }
      if (deliveryTerms != null && !(deliveryTerms.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, deliveryTerms);
      }
      if (orderDocNo != null && !(orderDocNo.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, orderDocNo);
      }
      if (orderRef != null && !(orderRef.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, orderRef);
      }
      if (cOrgId != null && !(cOrgId.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, cOrgId);
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
        ReportOrderNotShippedData objectReportOrderNotShippedData = new ReportOrderNotShippedData();
        objectReportOrderNotShippedData.orgname = UtilSql.getValue(result, "orgname");
        objectReportOrderNotShippedData.bpname = UtilSql.getValue(result, "bpname");
        objectReportOrderNotShippedData.documentno = UtilSql.getValue(result, "documentno");
        objectReportOrderNotShippedData.poreference = UtilSql.getValue(result, "poreference");
        objectReportOrderNotShippedData.dateordered = UtilSql.getDateValue(result, "dateordered", "dd-MM-yyyy");
        objectReportOrderNotShippedData.datepromised = UtilSql.getDateValue(result, "datepromised", "dd-MM-yyyy");
        objectReportOrderNotShippedData.deliveryrule = UtilSql.getValue(result, "deliveryrule");
        objectReportOrderNotShippedData.deliverylocation = UtilSql.getValue(result, "deliverylocation");
        objectReportOrderNotShippedData.prodname = UtilSql.getValue(result, "prodname");
        objectReportOrderNotShippedData.mAttributesetinstanceId = UtilSql.getValue(result, "m_attributesetinstance_id");
        objectReportOrderNotShippedData.orderedqty = UtilSql.getValue(result, "orderedqty");
        objectReportOrderNotShippedData.pendingqty = UtilSql.getValue(result, "pendingqty");
        objectReportOrderNotShippedData.qtyinstock = UtilSql.getValue(result, "qtyinstock");
        objectReportOrderNotShippedData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectReportOrderNotShippedData);
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
    ReportOrderNotShippedData objectReportOrderNotShippedData[] = new ReportOrderNotShippedData[vector.size()];
    vector.copyInto(objectReportOrderNotShippedData);
    return(objectReportOrderNotShippedData);
  }

  public static String bPartnerDescription(ConnectionProvider connectionProvider, String cBpartnerId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "    SELECT MAX(NAME) AS NAME FROM C_BPARTNER " +
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
