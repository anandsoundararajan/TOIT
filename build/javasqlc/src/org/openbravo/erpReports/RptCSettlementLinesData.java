//Sqlc generated V1.O00-1
package org.openbravo.erpReports;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import java.util.*;

class RptCSettlementLinesData implements FieldProvider {
static Logger log4j = Logger.getLogger(RptCSettlementLinesData.class);
  private String InitRecordNumber="0";
  public String dateplanned;
  public String name;
  public String amount;
  public String account;
  public String description;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("dateplanned"))
      return dateplanned;
    else if (fieldName.equalsIgnoreCase("name"))
      return name;
    else if (fieldName.equalsIgnoreCase("amount"))
      return amount;
    else if (fieldName.equalsIgnoreCase("account"))
      return account;
    else if (fieldName.equalsIgnoreCase("description"))
      return description;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static RptCSettlementLinesData[] select(ConnectionProvider connectionProvider, String cSettlementId)    throws ServletException {
    return select(connectionProvider, cSettlementId, 0, 0);
  }

  public static RptCSettlementLinesData[] select(ConnectionProvider connectionProvider, String cSettlementId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT C.DATEPLANNED, C_BPARTNER.NAME, SUM(C.AMOUNT) AS AMOUNT, " +
      "        C_BP_BANKACCOUNT.ACCOUNTNO AS ACCOUNT, (CASE WHEN C.C_INVOICE_ID IS NULL THEN C.DESCRIPTION ELSE C_INVOICE.DOCUMENTNO END) AS DESCRIPTION" +
      "        FROM C_BPARTNER left join C_BP_BANKACCOUNT on C_BPARTNER.C_BPARTNER_ID  = C_BP_BANKACCOUNT.C_BPARTNER_ID,                        " +
      "             C_DEBT_PAYMENT_CANCEL C left join  C_INVOICE on C.C_INVOICE_ID = C_INVOICE.C_INVOICE_ID" +
      "        WHERE C.C_BPARTNER_ID = C_BPARTNER.C_BPARTNER_ID" +
      "        AND C.C_SETTLEMENT_ID = ?" +
      "        GROUP BY C.DATEPLANNED, C_BPARTNER.NAME, C_BP_BANKACCOUNT.ACCOUNTNO, (CASE WHEN C.C_INVOICE_ID IS NULL THEN C.DESCRIPTION ELSE C_INVOICE.DOCUMENTNO END)" +
      "        ORDER BY DATEPLANNED ASC";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cSettlementId);

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
        RptCSettlementLinesData objectRptCSettlementLinesData = new RptCSettlementLinesData();
        objectRptCSettlementLinesData.dateplanned = UtilSql.getDateValue(result, "dateplanned", "dd-MM-yyyy");
        objectRptCSettlementLinesData.name = UtilSql.getValue(result, "name");
        objectRptCSettlementLinesData.amount = UtilSql.getValue(result, "amount");
        objectRptCSettlementLinesData.account = UtilSql.getValue(result, "account");
        objectRptCSettlementLinesData.description = UtilSql.getValue(result, "description");
        objectRptCSettlementLinesData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectRptCSettlementLinesData);
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
    RptCSettlementLinesData objectRptCSettlementLinesData[] = new RptCSettlementLinesData[vector.size()];
    vector.copyInto(objectRptCSettlementLinesData);
    return(objectRptCSettlementLinesData);
  }

  public static RptCSettlementLinesData[] set()    throws ServletException {
    RptCSettlementLinesData objectRptCSettlementLinesData[] = new RptCSettlementLinesData[1];
    objectRptCSettlementLinesData[0] = new RptCSettlementLinesData();
    objectRptCSettlementLinesData[0].dateplanned = "";
    objectRptCSettlementLinesData[0].name = "";
    objectRptCSettlementLinesData[0].amount = "";
    objectRptCSettlementLinesData[0].account = "";
    objectRptCSettlementLinesData[0].description = "";
    return objectRptCSettlementLinesData;
  }
}
