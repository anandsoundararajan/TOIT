//Sqlc generated V1.O00-1
package org.openbravo.erpCommon.ad_callouts;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import java.util.*;

class SLInvoiceTaxAmtData implements FieldProvider {
static Logger log4j = Logger.getLogger(SLInvoiceTaxAmtData.class);
  private String InitRecordNumber="0";
  public String rate;
  public String priceprecision;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("rate"))
      return rate;
    else if (fieldName.equalsIgnoreCase("priceprecision"))
      return priceprecision;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static SLInvoiceTaxAmtData[] select(ConnectionProvider connectionProvider, String cTaxId, String cInvoiceId)    throws ServletException {
    return select(connectionProvider, cTaxId, cInvoiceId, 0, 0);
  }

  public static SLInvoiceTaxAmtData[] select(ConnectionProvider connectionProvider, String cTaxId, String cInvoiceId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      select rate, c.priceprecision" +
      "        from c_tax        t," +
      "             c_currency   c," +
      "             c_invoice    i" +
      "        where t.c_tax_id = ?" +
      "        and c.c_currency_id = i.c_currency_id" +
      "        and i.c_invoice_id = ?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cTaxId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cInvoiceId);

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
        SLInvoiceTaxAmtData objectSLInvoiceTaxAmtData = new SLInvoiceTaxAmtData();
        objectSLInvoiceTaxAmtData.rate = UtilSql.getValue(result, "rate");
        objectSLInvoiceTaxAmtData.priceprecision = UtilSql.getValue(result, "priceprecision");
        objectSLInvoiceTaxAmtData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectSLInvoiceTaxAmtData);
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
    SLInvoiceTaxAmtData objectSLInvoiceTaxAmtData[] = new SLInvoiceTaxAmtData[vector.size()];
    vector.copyInto(objectSLInvoiceTaxAmtData);
    return(objectSLInvoiceTaxAmtData);
  }
}
