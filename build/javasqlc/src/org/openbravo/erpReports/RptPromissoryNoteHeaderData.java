//Sqlc generated V1.O00-1
package org.openbravo.erpReports;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import java.util.*;

class RptPromissoryNoteHeaderData implements FieldProvider {
static Logger log4j = Logger.getLogger(RptPromissoryNoteHeaderData.class);
  private String InitRecordNumber="0";
  public String cDebtPaymentId;
  public String partnerName;
  public String address;
  public String postal;
  public String region;
  public String amount;
  public String documentnoVendor;
  public String documentnoCustomer;
  public String documentno;
  public String dateinvoiced;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("c_debt_payment_id") || fieldName.equals("cDebtPaymentId"))
      return cDebtPaymentId;
    else if (fieldName.equalsIgnoreCase("partner_name") || fieldName.equals("partnerName"))
      return partnerName;
    else if (fieldName.equalsIgnoreCase("address"))
      return address;
    else if (fieldName.equalsIgnoreCase("postal"))
      return postal;
    else if (fieldName.equalsIgnoreCase("region"))
      return region;
    else if (fieldName.equalsIgnoreCase("amount"))
      return amount;
    else if (fieldName.equalsIgnoreCase("documentno_vendor") || fieldName.equals("documentnoVendor"))
      return documentnoVendor;
    else if (fieldName.equalsIgnoreCase("documentno_customer") || fieldName.equals("documentnoCustomer"))
      return documentnoCustomer;
    else if (fieldName.equalsIgnoreCase("documentno"))
      return documentno;
    else if (fieldName.equalsIgnoreCase("dateinvoiced"))
      return dateinvoiced;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static RptPromissoryNoteHeaderData[] select(ConnectionProvider connectionProvider, String cDebtPaymenntId)    throws ServletException {
    return select(connectionProvider, cDebtPaymenntId, 0, 0);
  }

  public static RptPromissoryNoteHeaderData[] select(ConnectionProvider connectionProvider, String cDebtPaymenntId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "          SELECT C_DEBT_PAYMENT_ID, PARTNER_NAME, ADDRESS, POSTAL, REGION, AMOUNT, (CASE WHEN MAX(DOCUMENTNO_VENDOR) IS NOT NULL THEN 'Pago su fra. nÂº:' ||MAX(DOCUMENTNO_VENDOR) END) AS DOCUMENTNO_VENDOR , (CASE WHEN MAX(DOCUMENTNO_CUSTOMER) IS NOT NULL THEN 'Nuestra fra. nÂº: '|| MAX(DOCUMENTNO_CUSTOMER) END) AS DOCUMENTNO_CUSTOMER, '' AS DOCUMENTNO, " +
      "          TO_CHAR(now(), 'DD')||' de '||TO_CHAR(now(), 'Month')||' de '||TO_CHAR(now(), 'YYYY') AS DATEINVOICED" +
      "          FROM (" +
      "          SELECT C_DEBT_PAYMENT_GENERATE.C_DEBT_PAYMENT_ID, C_BPARTNER.NAME AS PARTNER_NAME, (CASE WHEN C_INVOICE.C_INVOICE_ID IS NULL THEN MAX(C_LOCATION.ADDRESS1||C_LOCATION.ADDRESS2) ELSE CL.ADDRESS1||CL.ADDRESS2 END) AS ADDRESS, (CASE WHEN C_INVOICE.C_INVOICE_ID IS NULL THEN MAX(C_LOCATION.POSTAL||'-'||C_LOCATION.CITY) ELSE CL.POSTAL||'-'||CL.CITY END) AS POSTAL, " +
      "          (CASE WHEN C_INVOICE.C_INVOICE_ID IS NULL THEN MAX(C_REGION.NAME) ELSE CR.NAME END) AS REGION, C_DEBT_PAYMENT_GENERATE.AMOUNT, C_INVOICE.DOCUMENTNO AS DOCUMENTNO_CUSTOMER, NULL AS DOCUMENTNO_VENDOR" +
      "          FROM C_DEBT_PAYMENT_GENERATE left join C_INVOICE on C_DEBT_PAYMENT_GENERATE.C_INVOICE_ID = C_INVOICE.C_INVOICE_ID" +
      "                                       left join C_BPARTNER on C_DEBT_PAYMENT_GENERATE.C_BPARTNER_ID = C_BPARTNER.C_BPARTNER_ID " +
      "                                       left join C_BPARTNER_LOCATION on C_BPARTNER.C_BPARTNER_ID = C_BPARTNER_LOCATION.C_BPARTNER_ID" +
      "                                       left join C_LOCATION on C_BPARTNER_LOCATION.C_LOCATION_ID = C_LOCATION.C_LOCATION_ID" +
      "                                       left join C_REGION on C_LOCATION.C_REGION_ID = C_REGION.C_REGION_ID" +
      "                                       left join C_BPARTNER_LOCATION CBL on C_INVOICE.C_BPARTNER_LOCATION_ID = CBL.C_BPARTNER_LOCATION_ID" +
      "                                       left join C_LOCATION CL on CBL.C_LOCATION_ID = CL.C_LOCATION_ID " +
      "                                       left join C_REGION CR on CL.C_REGION_ID = CR.C_REGION_ID" +
      "          WHERE COALESCE(C_INVOICE.ISSOTRX, 'Y') = 'Y'" +
      "          AND COALESCE(C_BPARTNER_LOCATION.ISSHIPTO, 'Y') = 'Y'" +
      "          AND C_DEBT_PAYMENT_GENERATE.C_DEBT_PAYMENT_ID = ?" +
      "          GROUP BY C_DEBT_PAYMENT_GENERATE.C_DEBT_PAYMENT_ID, C_BPARTNER.NAME, C_INVOICE.C_INVOICE_ID, CL.ADDRESS1, CL.ADDRESS2, CL.POSTAL, CL.CITY, CR.NAME, C_DEBT_PAYMENT_GENERATE.AMOUNT, C_INVOICE.DOCUMENTNO" +
      "          UNION" +
      "          SELECT C_DEBT_PAYMENT_GENERATE.C_DEBT_PAYMENT_ID, C_BPARTNER.NAME AS PARTNER_NAME, (CASE WHEN C_INVOICE.C_INVOICE_ID IS NULL THEN MAX(C_LOCATION.ADDRESS1||C_LOCATION.ADDRESS2) ELSE CL.ADDRESS1||CL.ADDRESS2 END) AS ADDRESS, (CASE WHEN C_INVOICE.C_INVOICE_ID IS NULL THEN MAX(C_LOCATION.POSTAL||'-'||C_LOCATION.CITY) ELSE CL.POSTAL||'-'||CL.CITY END) AS POSTAL, " +
      "          (CASE WHEN C_INVOICE.C_INVOICE_ID IS NULL THEN MAX(C_REGION.NAME) ELSE CR.NAME END) AS REGION, C_DEBT_PAYMENT_GENERATE.AMOUNT, NULL AS DOCUMENTNO_CUSTOMER, C_INVOICE.DOCUMENTNO AS DOCUMENTNO_VENDOR" +
      "          FROM C_DEBT_PAYMENT_GENERATE left join C_INVOICE on C_DEBT_PAYMENT_GENERATE.C_INVOICE_ID = C_INVOICE.C_INVOICE_ID" +
      "                                       left join C_BPARTNER on C_DEBT_PAYMENT_GENERATE.C_BPARTNER_ID = C_BPARTNER.C_BPARTNER_ID" +
      "                                       left join C_BPARTNER_LOCATION on C_BPARTNER.C_BPARTNER_ID = C_BPARTNER_LOCATION.C_BPARTNER_ID" +
      "                                       left join C_LOCATION on C_BPARTNER_LOCATION.C_LOCATION_ID = C_LOCATION.C_LOCATION_ID " +
      "                                       left join C_REGION on C_LOCATION.C_REGION_ID = C_REGION.C_REGION_ID" +
      "                                       left join C_BPARTNER_LOCATION CBL on C_INVOICE.C_BPARTNER_LOCATION_ID = CBL.C_BPARTNER_LOCATION_ID " +
      "                                       left join C_LOCATION CL on CBL.C_LOCATION_ID = CL.C_LOCATION_ID " +
      "                                       left join C_REGION CR on CL.C_REGION_ID = CR.C_REGION_ID " +
      "          WHERE  COALESCE(C_INVOICE.ISSOTRX, 'N') = 'N'" +
      "          AND COALESCE(C_BPARTNER_LOCATION.ISSHIPTO, 'Y') = 'Y'" +
      "          AND C_DEBT_PAYMENT_GENERATE.C_DEBT_PAYMENT_ID = ?" +
      "          GROUP BY C_DEBT_PAYMENT_GENERATE.C_DEBT_PAYMENT_ID, C_BPARTNER.NAME, C_INVOICE.C_INVOICE_ID, CL.ADDRESS1, CL.ADDRESS2, CL.POSTAL, CL.CITY, CR.NAME, C_DEBT_PAYMENT_GENERATE.AMOUNT, C_INVOICE.DOCUMENTNO) AA" +
      "          GROUP BY C_DEBT_PAYMENT_ID, PARTNER_NAME, ADDRESS, POSTAL, REGION, AMOUNT";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cDebtPaymenntId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cDebtPaymenntId);

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
        RptPromissoryNoteHeaderData objectRptPromissoryNoteHeaderData = new RptPromissoryNoteHeaderData();
        objectRptPromissoryNoteHeaderData.cDebtPaymentId = UtilSql.getValue(result, "c_debt_payment_id");
        objectRptPromissoryNoteHeaderData.partnerName = UtilSql.getValue(result, "partner_name");
        objectRptPromissoryNoteHeaderData.address = UtilSql.getValue(result, "address");
        objectRptPromissoryNoteHeaderData.postal = UtilSql.getValue(result, "postal");
        objectRptPromissoryNoteHeaderData.region = UtilSql.getValue(result, "region");
        objectRptPromissoryNoteHeaderData.amount = UtilSql.getValue(result, "amount");
        objectRptPromissoryNoteHeaderData.documentnoVendor = UtilSql.getValue(result, "documentno_vendor");
        objectRptPromissoryNoteHeaderData.documentnoCustomer = UtilSql.getValue(result, "documentno_customer");
        objectRptPromissoryNoteHeaderData.documentno = UtilSql.getValue(result, "documentno");
        objectRptPromissoryNoteHeaderData.dateinvoiced = UtilSql.getValue(result, "dateinvoiced");
        objectRptPromissoryNoteHeaderData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectRptPromissoryNoteHeaderData);
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
    RptPromissoryNoteHeaderData objectRptPromissoryNoteHeaderData[] = new RptPromissoryNoteHeaderData[vector.size()];
    vector.copyInto(objectRptPromissoryNoteHeaderData);
    return(objectRptPromissoryNoteHeaderData);
  }

  public static RptPromissoryNoteHeaderData[] set()    throws ServletException {
    RptPromissoryNoteHeaderData objectRptPromissoryNoteHeaderData[] = new RptPromissoryNoteHeaderData[1];
    objectRptPromissoryNoteHeaderData[0] = new RptPromissoryNoteHeaderData();
    objectRptPromissoryNoteHeaderData[0].cDebtPaymentId = "";
    objectRptPromissoryNoteHeaderData[0].partnerName = "";
    objectRptPromissoryNoteHeaderData[0].address = "";
    objectRptPromissoryNoteHeaderData[0].postal = "";
    objectRptPromissoryNoteHeaderData[0].region = "";
    objectRptPromissoryNoteHeaderData[0].amount = "";
    objectRptPromissoryNoteHeaderData[0].documentnoVendor = "";
    objectRptPromissoryNoteHeaderData[0].documentnoCustomer = "";
    objectRptPromissoryNoteHeaderData[0].documentno = "";
    objectRptPromissoryNoteHeaderData[0].dateinvoiced = "";
    return objectRptPromissoryNoteHeaderData;
  }

  public static RptPromissoryNoteHeaderData[] selectDebtPayment(ConnectionProvider connectionProvider, String cDebtPaymenntId)    throws ServletException {
    return selectDebtPayment(connectionProvider, cDebtPaymenntId, 0, 0);
  }

  public static RptPromissoryNoteHeaderData[] selectDebtPayment(ConnectionProvider connectionProvider, String cDebtPaymenntId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "          SELECT C_BPARTNER.NAME AS PARTNER_NAME, C_LOCATION.ADDRESS1||C_LOCATION.ADDRESS2 AS ADDRESS, C_LOCATION.POSTAL||'-'||C_LOCATION.CITY AS POSTAL, " +
      "          C_REGION.NAME AS REGION, C_DEBT_PAYMENT.AMOUNT, (CASE C_INVOICE.ISSOTRX WHEN 'N' THEN 'Pago su fra. nÂº: '||C_INVOICE.POREFERENCE ELSE 'Nuestra fra. nÂº: '||C_INVOICE.DOCUMENTNO END) AS DOCUMENTNO, " +
      "          TO_CHAR(now(), 'DD')||' de '||TO_CHAR(now(), 'Month')||' de '||TO_CHAR(now(), 'YYYY') AS DATEINVOICED" +
      "          FROM C_BPARTNER_LOCATION left join C_LOCATION on C_BPARTNER_LOCATION.C_LOCATION_ID = C_LOCATION.C_LOCATION_ID" +
      "                                   left join C_REGION on C_LOCATION.C_REGION_ID = C_REGION.C_REGION_ID," +
      "          C_DEBT_PAYMENT, C_INVOICE, C_BPARTNER" +
      "          WHERE C_DEBT_PAYMENT.C_INVOICE_ID = C_INVOICE.C_INVOICE_ID" +
      "          AND C_INVOICE.C_BPARTNER_ID = C_BPARTNER.C_BPARTNER_ID" +
      "          AND C_INVOICE.C_BPARTNER_LOCATION_ID = C_BPARTNER_LOCATION.C_BPARTNER_LOCATION_ID" +
      "          AND C_DEBT_PAYMENT.C_DEBT_PAYMENT_ID = ?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cDebtPaymenntId);

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
        RptPromissoryNoteHeaderData objectRptPromissoryNoteHeaderData = new RptPromissoryNoteHeaderData();
        objectRptPromissoryNoteHeaderData.partnerName = UtilSql.getValue(result, "partner_name");
        objectRptPromissoryNoteHeaderData.address = UtilSql.getValue(result, "address");
        objectRptPromissoryNoteHeaderData.postal = UtilSql.getValue(result, "postal");
        objectRptPromissoryNoteHeaderData.region = UtilSql.getValue(result, "region");
        objectRptPromissoryNoteHeaderData.amount = UtilSql.getValue(result, "amount");
        objectRptPromissoryNoteHeaderData.documentno = UtilSql.getValue(result, "documentno");
        objectRptPromissoryNoteHeaderData.dateinvoiced = UtilSql.getValue(result, "dateinvoiced");
        objectRptPromissoryNoteHeaderData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectRptPromissoryNoteHeaderData);
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
    RptPromissoryNoteHeaderData objectRptPromissoryNoteHeaderData[] = new RptPromissoryNoteHeaderData[vector.size()];
    vector.copyInto(objectRptPromissoryNoteHeaderData);
    return(objectRptPromissoryNoteHeaderData);
  }
}
