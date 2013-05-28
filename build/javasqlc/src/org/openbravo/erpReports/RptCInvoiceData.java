//Sqlc generated V1.O00-1
package org.openbravo.erpReports;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import java.util.*;

class RptCInvoiceData implements FieldProvider {
static Logger log4j = Logger.getLogger(RptCInvoiceData.class);
  private String InitRecordNumber="0";
  public String cInvoiceId;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("c_invoice_id") || fieldName.equals("cInvoiceId"))
      return cInvoiceId;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static RptCInvoiceData[] select(ConnectionProvider connectionProvider, String cDocFrom, String cDocTo, String cbPartner, String cDateFrom, String cDateTo)    throws ServletException {
    return select(connectionProvider, cDocFrom, cDocTo, cbPartner, cDateFrom, cDateTo, 0, 0);
  }

  public static RptCInvoiceData[] select(ConnectionProvider connectionProvider, String cDocFrom, String cDocTo, String cbPartner, String cDateFrom, String cDateTo, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT C_INVOICE_ID FROM C_INVOICE" +
      "        WHERE C_INVOICE.ISSOTRX = 'Y'";
    strSql = strSql + ((cDocFrom==null || cDocFrom.equals(""))?"":"           AND C_INVOICE.DOCUMENTNO >=?           ");
    strSql = strSql + ((cDocTo==null || cDocTo.equals(""))?"":"           AND C_INVOICE.DOCUMENTNO <=?           ");
    strSql = strSql + ((cbPartner==null || cbPartner.equals(""))?"":"           AND C_INVOICE.C_BPARTNER_ID = ?           ");
    strSql = strSql + ((cDateFrom==null || cDateFrom.equals(""))?"":"           AND C_INVOICE.DATEINVOICED >= to_date(?)           ");
    strSql = strSql + ((cDateTo==null || cDateTo.equals(""))?"":"           AND C_INVOICE.DATEINVOICED < to_date(?)           ");

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      if (cDocFrom != null && !(cDocFrom.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, cDocFrom);
      }
      if (cDocTo != null && !(cDocTo.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, cDocTo);
      }
      if (cbPartner != null && !(cbPartner.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, cbPartner);
      }
      if (cDateFrom != null && !(cDateFrom.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, cDateFrom);
      }
      if (cDateTo != null && !(cDateTo.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, cDateTo);
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
        RptCInvoiceData objectRptCInvoiceData = new RptCInvoiceData();
        objectRptCInvoiceData.cInvoiceId = UtilSql.getValue(result, "c_invoice_id");
        objectRptCInvoiceData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectRptCInvoiceData);
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
    RptCInvoiceData objectRptCInvoiceData[] = new RptCInvoiceData[vector.size()];
    vector.copyInto(objectRptCInvoiceData);
    return(objectRptCInvoiceData);
  }
}
