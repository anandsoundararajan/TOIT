//Sqlc generated V1.O00-1
package org.openbravo.erpReports;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import java.util.*;

class RptPromissoryNoteAfterData implements FieldProvider {
static Logger log4j = Logger.getLogger(RptPromissoryNoteAfterData.class);
  private String InitRecordNumber="0";
  public String cDebtPaymentId;
  public String dayplanned;
  public String monthplanned;
  public String yearplanned;
  public String amount;
  public String partnerName;
  public String banklocation;
  public String monthtoday;
  public String yeartoday;
  public String line1top;
  public String line1left;
  public String line2top;
  public String line2left;
  public String line3top;
  public String line3left;
  public String line4top;
  public String line4left;
  public String fontdayplanned;
  public String fontmonthplanned;
  public String fontyearplanned;
  public String fontamount;
  public String fontpartnername;
  public String fontamounttext;
  public String fontdaytoday;
  public String fontmonthtoday;
  public String fontyeartoday;
  public String fontbanklocation;
  public String printbankloc;
  public String param11;
  public String param12;
  public String param13;
  public String param31;
  public String param32;
  public String param41;
  public String param42;
  public String param43;
  public String bank;
  public String promissoryformat;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("c_debt_payment_id") || fieldName.equals("cDebtPaymentId"))
      return cDebtPaymentId;
    else if (fieldName.equalsIgnoreCase("dayplanned"))
      return dayplanned;
    else if (fieldName.equalsIgnoreCase("monthplanned"))
      return monthplanned;
    else if (fieldName.equalsIgnoreCase("yearplanned"))
      return yearplanned;
    else if (fieldName.equalsIgnoreCase("amount"))
      return amount;
    else if (fieldName.equalsIgnoreCase("partner_name") || fieldName.equals("partnerName"))
      return partnerName;
    else if (fieldName.equalsIgnoreCase("banklocation"))
      return banklocation;
    else if (fieldName.equalsIgnoreCase("monthtoday"))
      return monthtoday;
    else if (fieldName.equalsIgnoreCase("yeartoday"))
      return yeartoday;
    else if (fieldName.equalsIgnoreCase("line1top"))
      return line1top;
    else if (fieldName.equalsIgnoreCase("line1left"))
      return line1left;
    else if (fieldName.equalsIgnoreCase("line2top"))
      return line2top;
    else if (fieldName.equalsIgnoreCase("line2left"))
      return line2left;
    else if (fieldName.equalsIgnoreCase("line3top"))
      return line3top;
    else if (fieldName.equalsIgnoreCase("line3left"))
      return line3left;
    else if (fieldName.equalsIgnoreCase("line4top"))
      return line4top;
    else if (fieldName.equalsIgnoreCase("line4left"))
      return line4left;
    else if (fieldName.equalsIgnoreCase("fontdayplanned"))
      return fontdayplanned;
    else if (fieldName.equalsIgnoreCase("fontmonthplanned"))
      return fontmonthplanned;
    else if (fieldName.equalsIgnoreCase("fontyearplanned"))
      return fontyearplanned;
    else if (fieldName.equalsIgnoreCase("fontamount"))
      return fontamount;
    else if (fieldName.equalsIgnoreCase("fontpartnername"))
      return fontpartnername;
    else if (fieldName.equalsIgnoreCase("fontamounttext"))
      return fontamounttext;
    else if (fieldName.equalsIgnoreCase("fontdaytoday"))
      return fontdaytoday;
    else if (fieldName.equalsIgnoreCase("fontmonthtoday"))
      return fontmonthtoday;
    else if (fieldName.equalsIgnoreCase("fontyeartoday"))
      return fontyeartoday;
    else if (fieldName.equalsIgnoreCase("fontbanklocation"))
      return fontbanklocation;
    else if (fieldName.equalsIgnoreCase("printbankloc"))
      return printbankloc;
    else if (fieldName.equalsIgnoreCase("param11"))
      return param11;
    else if (fieldName.equalsIgnoreCase("param12"))
      return param12;
    else if (fieldName.equalsIgnoreCase("param13"))
      return param13;
    else if (fieldName.equalsIgnoreCase("param31"))
      return param31;
    else if (fieldName.equalsIgnoreCase("param32"))
      return param32;
    else if (fieldName.equalsIgnoreCase("param41"))
      return param41;
    else if (fieldName.equalsIgnoreCase("param42"))
      return param42;
    else if (fieldName.equalsIgnoreCase("param43"))
      return param43;
    else if (fieldName.equalsIgnoreCase("bank"))
      return bank;
    else if (fieldName.equalsIgnoreCase("promissoryformat"))
      return promissoryformat;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static RptPromissoryNoteAfterData[] select(ConnectionProvider connectionProvider, String cDebtPaymenntId)    throws ServletException {
    return select(connectionProvider, cDebtPaymenntId, 0, 0);
  }

  public static RptPromissoryNoteAfterData[] select(ConnectionProvider connectionProvider, String cDebtPaymenntId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT C_DEBT_PAYMENT_GENERATE.C_DEBT_PAYMENT_ID, TO_CHAR(C_DEBT_PAYMENT_GENERATE.DATEPLANNED, 'DD') AS DAYPLANNED, TO_CHAR(C_DEBT_PAYMENT_GENERATE.DATEPLANNED, 'Month') AS MONTHPLANNED, TO_CHAR(C_DEBT_PAYMENT_GENERATE.DATEPLANNED, 'YYYY') AS YEARPLANNED, " +
      "        ROUND(C_DEBT_PAYMENT_GENERATE.AMOUNT,2) AS AMOUNT, C_BPARTNER.NAME AS PARTNER_NAME, COALESCE(to_char(C_LOCATION.CITY),'***') AS BANKLOCATION , TO_CHAR(now(), 'Month') AS MONTHTODAY, " +
      "        TO_CHAR(now(), 'YYYY') AS YEARTODAY, LINE1TOP, LINE1LEFT, LINE2TOP, LINE2LEFT, LINE3TOP, LINE3LEFT, LINE4TOP, LINE4LEFT, " +
      "        FONTDAYPLANNED, FONTMONTHPLANNED, FONTYEARPLANNED, FONTAMOUNT, FONTPARTNERNAME, FONTAMOUNTTEXT, FONTDAYTODAY, FONTMONTHTODAY, FONTYEARTODAY, FONTBANKLOCATION, '' AS PRINTBANKLOC," +
      "        RPAD(' ', PARAM11 , ' ') as PARAM11, " +
      "        RPAD(' ', PARAM12 , ' ') as PARAM12, " +
      "        RPAD(' ', PARAM13 , ' ') as PARAM13, " +
      "        RPAD(' ', PARAM31 , ' ') as PARAM31, " +
      "        RPAD(' ', PARAM32 , ' ') as PARAM32, " +
      "        RPAD(' ', PARAM41 , ' ') as PARAM41, " +
      "        RPAD(' ', PARAM42 , ' ') as PARAM42, " +
      "        RPAD(' ', PARAM43 , ' ') as PARAM43," +
      "        '' AS BANK, '' AS PROMISSORYFORMAT " +
      "        FROM C_DEBT_PAYMENT_GENERATE, C_BPARTNER, C_PROMISSORYFORMAT, AD_ORGINFO left join C_LOCATION on AD_ORGINFO.C_LOCATION_ID= C_LOCATION.C_LOCATION_ID" +
      "        WHERE C_DEBT_PAYMENT_GENERATE.C_BPARTNER_ID = C_BPARTNER.C_BPARTNER_ID" +
      "        AND C_DEBT_PAYMENT_GENERATE.C_BANKACCOUNT_ID = C_PROMISSORYFORMAT.C_BANKACCOUNT_ID" +
      "        AND C_DEBT_PAYMENT_GENERATE.AD_ORG_ID = AD_ORGINFO.AD_ORG_ID" +
      "        AND C_DEBT_PAYMENT_GENERATE.C_DEBT_PAYMENT_ID = ?";

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
        RptPromissoryNoteAfterData objectRptPromissoryNoteAfterData = new RptPromissoryNoteAfterData();
        objectRptPromissoryNoteAfterData.cDebtPaymentId = UtilSql.getValue(result, "c_debt_payment_id");
        objectRptPromissoryNoteAfterData.dayplanned = UtilSql.getValue(result, "dayplanned");
        objectRptPromissoryNoteAfterData.monthplanned = UtilSql.getValue(result, "monthplanned");
        objectRptPromissoryNoteAfterData.yearplanned = UtilSql.getValue(result, "yearplanned");
        objectRptPromissoryNoteAfterData.amount = UtilSql.getValue(result, "amount");
        objectRptPromissoryNoteAfterData.partnerName = UtilSql.getValue(result, "partner_name");
        objectRptPromissoryNoteAfterData.banklocation = UtilSql.getValue(result, "banklocation");
        objectRptPromissoryNoteAfterData.monthtoday = UtilSql.getValue(result, "monthtoday");
        objectRptPromissoryNoteAfterData.yeartoday = UtilSql.getValue(result, "yeartoday");
        objectRptPromissoryNoteAfterData.line1top = UtilSql.getValue(result, "line1top");
        objectRptPromissoryNoteAfterData.line1left = UtilSql.getValue(result, "line1left");
        objectRptPromissoryNoteAfterData.line2top = UtilSql.getValue(result, "line2top");
        objectRptPromissoryNoteAfterData.line2left = UtilSql.getValue(result, "line2left");
        objectRptPromissoryNoteAfterData.line3top = UtilSql.getValue(result, "line3top");
        objectRptPromissoryNoteAfterData.line3left = UtilSql.getValue(result, "line3left");
        objectRptPromissoryNoteAfterData.line4top = UtilSql.getValue(result, "line4top");
        objectRptPromissoryNoteAfterData.line4left = UtilSql.getValue(result, "line4left");
        objectRptPromissoryNoteAfterData.fontdayplanned = UtilSql.getValue(result, "fontdayplanned");
        objectRptPromissoryNoteAfterData.fontmonthplanned = UtilSql.getValue(result, "fontmonthplanned");
        objectRptPromissoryNoteAfterData.fontyearplanned = UtilSql.getValue(result, "fontyearplanned");
        objectRptPromissoryNoteAfterData.fontamount = UtilSql.getValue(result, "fontamount");
        objectRptPromissoryNoteAfterData.fontpartnername = UtilSql.getValue(result, "fontpartnername");
        objectRptPromissoryNoteAfterData.fontamounttext = UtilSql.getValue(result, "fontamounttext");
        objectRptPromissoryNoteAfterData.fontdaytoday = UtilSql.getValue(result, "fontdaytoday");
        objectRptPromissoryNoteAfterData.fontmonthtoday = UtilSql.getValue(result, "fontmonthtoday");
        objectRptPromissoryNoteAfterData.fontyeartoday = UtilSql.getValue(result, "fontyeartoday");
        objectRptPromissoryNoteAfterData.fontbanklocation = UtilSql.getValue(result, "fontbanklocation");
        objectRptPromissoryNoteAfterData.printbankloc = UtilSql.getValue(result, "printbankloc");
        objectRptPromissoryNoteAfterData.param11 = UtilSql.getValue(result, "param11");
        objectRptPromissoryNoteAfterData.param12 = UtilSql.getValue(result, "param12");
        objectRptPromissoryNoteAfterData.param13 = UtilSql.getValue(result, "param13");
        objectRptPromissoryNoteAfterData.param31 = UtilSql.getValue(result, "param31");
        objectRptPromissoryNoteAfterData.param32 = UtilSql.getValue(result, "param32");
        objectRptPromissoryNoteAfterData.param41 = UtilSql.getValue(result, "param41");
        objectRptPromissoryNoteAfterData.param42 = UtilSql.getValue(result, "param42");
        objectRptPromissoryNoteAfterData.param43 = UtilSql.getValue(result, "param43");
        objectRptPromissoryNoteAfterData.bank = UtilSql.getValue(result, "bank");
        objectRptPromissoryNoteAfterData.promissoryformat = UtilSql.getValue(result, "promissoryformat");
        objectRptPromissoryNoteAfterData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectRptPromissoryNoteAfterData);
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
    RptPromissoryNoteAfterData objectRptPromissoryNoteAfterData[] = new RptPromissoryNoteAfterData[vector.size()];
    vector.copyInto(objectRptPromissoryNoteAfterData);
    return(objectRptPromissoryNoteAfterData);
  }

  public static RptPromissoryNoteAfterData[] set()    throws ServletException {
    RptPromissoryNoteAfterData objectRptPromissoryNoteAfterData[] = new RptPromissoryNoteAfterData[1];
    objectRptPromissoryNoteAfterData[0] = new RptPromissoryNoteAfterData();
    objectRptPromissoryNoteAfterData[0].cDebtPaymentId = "";
    objectRptPromissoryNoteAfterData[0].dayplanned = "";
    objectRptPromissoryNoteAfterData[0].monthplanned = "";
    objectRptPromissoryNoteAfterData[0].yearplanned = "";
    objectRptPromissoryNoteAfterData[0].amount = "";
    objectRptPromissoryNoteAfterData[0].partnerName = "";
    objectRptPromissoryNoteAfterData[0].banklocation = "";
    objectRptPromissoryNoteAfterData[0].monthtoday = "";
    objectRptPromissoryNoteAfterData[0].yeartoday = "";
    objectRptPromissoryNoteAfterData[0].line1top = "";
    objectRptPromissoryNoteAfterData[0].line1left = "";
    objectRptPromissoryNoteAfterData[0].line2top = "";
    objectRptPromissoryNoteAfterData[0].line2left = "";
    objectRptPromissoryNoteAfterData[0].line3top = "";
    objectRptPromissoryNoteAfterData[0].line3left = "";
    objectRptPromissoryNoteAfterData[0].line4top = "";
    objectRptPromissoryNoteAfterData[0].line4left = "";
    objectRptPromissoryNoteAfterData[0].fontdayplanned = "";
    objectRptPromissoryNoteAfterData[0].fontmonthplanned = "";
    objectRptPromissoryNoteAfterData[0].fontyearplanned = "";
    objectRptPromissoryNoteAfterData[0].fontamount = "";
    objectRptPromissoryNoteAfterData[0].fontpartnername = "";
    objectRptPromissoryNoteAfterData[0].fontamounttext = "";
    objectRptPromissoryNoteAfterData[0].fontdaytoday = "";
    objectRptPromissoryNoteAfterData[0].fontmonthtoday = "";
    objectRptPromissoryNoteAfterData[0].fontyeartoday = "";
    objectRptPromissoryNoteAfterData[0].fontbanklocation = "";
    objectRptPromissoryNoteAfterData[0].printbankloc = "";
    objectRptPromissoryNoteAfterData[0].param11 = "";
    objectRptPromissoryNoteAfterData[0].param12 = "";
    objectRptPromissoryNoteAfterData[0].param13 = "";
    objectRptPromissoryNoteAfterData[0].param31 = "";
    objectRptPromissoryNoteAfterData[0].param32 = "";
    objectRptPromissoryNoteAfterData[0].param41 = "";
    objectRptPromissoryNoteAfterData[0].param42 = "";
    objectRptPromissoryNoteAfterData[0].param43 = "";
    objectRptPromissoryNoteAfterData[0].bank = "";
    objectRptPromissoryNoteAfterData[0].promissoryformat = "";
    return objectRptPromissoryNoteAfterData;
  }

  public static String selectDebtPaymentBank(ConnectionProvider connectionProvider, String cDebtPaymenntId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT C_BANKACCOUNT_ID AS BANK FROM C_DEBT_PAYMENT WHERE C_DEBT_PAYMENT.C_DEBT_PAYMENT_ID IN ('";
    strSql = strSql + ((cDebtPaymenntId==null || cDebtPaymenntId.equals(""))?"":cDebtPaymenntId);
    strSql = strSql + 
      "')";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    try {
    st = connectionProvider.getPreparedStatement(strSql);
      if (cDebtPaymenntId != null && !(cDebtPaymenntId.equals(""))) {
        }

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "bank");
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

  public static String selectPromissoryformat(ConnectionProvider connectionProvider, String cBankId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT C_PROMISSORYFORMAT_ID AS PROMISSORYFORMAT FROM C_PROMISSORYFORMAT WHERE C_PROMISSORYFORMAT.C_BANKACCOUNT_ID = ?";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBankId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "promissoryformat");
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

  public static RptPromissoryNoteAfterData[] selectDebtPayment(ConnectionProvider connectionProvider, String cDebtPaymenntId)    throws ServletException {
    return selectDebtPayment(connectionProvider, cDebtPaymenntId, 0, 0);
  }

  public static RptPromissoryNoteAfterData[] selectDebtPayment(ConnectionProvider connectionProvider, String cDebtPaymenntId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT C_DEBT_PAYMENT.C_DEBT_PAYMENT_ID, TO_CHAR(C_DEBT_PAYMENT.DATEPLANNED, 'DD') AS DAYPLANNED, TO_CHAR(C_DEBT_PAYMENT.DATEPLANNED, 'Month') AS MONTHPLANNED, TO_CHAR(C_DEBT_PAYMENT.DATEPLANNED, 'YYYY') AS YEARPLANNED, " +
      "        ROUND(C_DEBT_PAYMENT.AMOUNT,2) AS AMOUNT, C_BPARTNER.NAME AS PARTNER_NAME, COALESCE(to_char(C_LOCATION.CITY),'***') AS BANKLOCATION , TO_CHAR(now(), 'Month') AS MONTHTODAY, " +
      "        TO_CHAR(now(), 'YYYY') AS YEARTODAY, LINE1TOP, LINE1LEFT, LINE2TOP, LINE2LEFT, LINE3TOP, LINE3LEFT, LINE4TOP, LINE4LEFT, " +
      "        FONTDAYPLANNED, FONTMONTHPLANNED, FONTYEARPLANNED, FONTAMOUNT, FONTPARTNERNAME, FONTAMOUNTTEXT, FONTDAYTODAY, FONTMONTHTODAY, FONTYEARTODAY, FONTBANKLOCATION, '' AS PRINTBANKLOC," +
      "        RPAD(' ', PARAM11 , ' ') as PARAM11, " +
      "        RPAD(' ', PARAM12 , ' ') as PARAM12, " +
      "        RPAD(' ', PARAM13 , ' ') as PARAM13, " +
      "        RPAD(' ', PARAM31 , ' ') as PARAM31, " +
      "        RPAD(' ', PARAM32 , ' ') as PARAM32, " +
      "        RPAD(' ', PARAM41 , ' ') as PARAM41, " +
      "        RPAD(' ', PARAM42 , ' ') as PARAM42, " +
      "        RPAD(' ', PARAM43 , ' ') as PARAM43 " +
      "        FROM C_DEBT_PAYMENT, C_INVOICE, C_BPARTNER, C_PROMISSORYFORMAT, AD_ORGINFO left join C_LOCATION on AD_ORGINFO.C_LOCATION_ID= C_LOCATION.C_LOCATION_ID" +
      "        WHERE C_DEBT_PAYMENT.C_INVOICE_ID = C_INVOICE.C_INVOICE_ID" +
      "        AND C_INVOICE.C_BPARTNER_ID = C_BPARTNER.C_BPARTNER_ID" +
      "        AND C_DEBT_PAYMENT.C_BANKACCOUNT_ID = C_PROMISSORYFORMAT.C_BANKACCOUNT_ID" +
      "        AND C_DEBT_PAYMENT.AD_ORG_ID = AD_ORGINFO.AD_ORG_ID" +
      "        AND C_DEBT_PAYMENT.C_DEBT_PAYMENT_ID = ?";

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
        RptPromissoryNoteAfterData objectRptPromissoryNoteAfterData = new RptPromissoryNoteAfterData();
        objectRptPromissoryNoteAfterData.cDebtPaymentId = UtilSql.getValue(result, "c_debt_payment_id");
        objectRptPromissoryNoteAfterData.dayplanned = UtilSql.getValue(result, "dayplanned");
        objectRptPromissoryNoteAfterData.monthplanned = UtilSql.getValue(result, "monthplanned");
        objectRptPromissoryNoteAfterData.yearplanned = UtilSql.getValue(result, "yearplanned");
        objectRptPromissoryNoteAfterData.amount = UtilSql.getValue(result, "amount");
        objectRptPromissoryNoteAfterData.partnerName = UtilSql.getValue(result, "partner_name");
        objectRptPromissoryNoteAfterData.banklocation = UtilSql.getValue(result, "banklocation");
        objectRptPromissoryNoteAfterData.monthtoday = UtilSql.getValue(result, "monthtoday");
        objectRptPromissoryNoteAfterData.yeartoday = UtilSql.getValue(result, "yeartoday");
        objectRptPromissoryNoteAfterData.line1top = UtilSql.getValue(result, "line1top");
        objectRptPromissoryNoteAfterData.line1left = UtilSql.getValue(result, "line1left");
        objectRptPromissoryNoteAfterData.line2top = UtilSql.getValue(result, "line2top");
        objectRptPromissoryNoteAfterData.line2left = UtilSql.getValue(result, "line2left");
        objectRptPromissoryNoteAfterData.line3top = UtilSql.getValue(result, "line3top");
        objectRptPromissoryNoteAfterData.line3left = UtilSql.getValue(result, "line3left");
        objectRptPromissoryNoteAfterData.line4top = UtilSql.getValue(result, "line4top");
        objectRptPromissoryNoteAfterData.line4left = UtilSql.getValue(result, "line4left");
        objectRptPromissoryNoteAfterData.fontdayplanned = UtilSql.getValue(result, "fontdayplanned");
        objectRptPromissoryNoteAfterData.fontmonthplanned = UtilSql.getValue(result, "fontmonthplanned");
        objectRptPromissoryNoteAfterData.fontyearplanned = UtilSql.getValue(result, "fontyearplanned");
        objectRptPromissoryNoteAfterData.fontamount = UtilSql.getValue(result, "fontamount");
        objectRptPromissoryNoteAfterData.fontpartnername = UtilSql.getValue(result, "fontpartnername");
        objectRptPromissoryNoteAfterData.fontamounttext = UtilSql.getValue(result, "fontamounttext");
        objectRptPromissoryNoteAfterData.fontdaytoday = UtilSql.getValue(result, "fontdaytoday");
        objectRptPromissoryNoteAfterData.fontmonthtoday = UtilSql.getValue(result, "fontmonthtoday");
        objectRptPromissoryNoteAfterData.fontyeartoday = UtilSql.getValue(result, "fontyeartoday");
        objectRptPromissoryNoteAfterData.fontbanklocation = UtilSql.getValue(result, "fontbanklocation");
        objectRptPromissoryNoteAfterData.printbankloc = UtilSql.getValue(result, "printbankloc");
        objectRptPromissoryNoteAfterData.param11 = UtilSql.getValue(result, "param11");
        objectRptPromissoryNoteAfterData.param12 = UtilSql.getValue(result, "param12");
        objectRptPromissoryNoteAfterData.param13 = UtilSql.getValue(result, "param13");
        objectRptPromissoryNoteAfterData.param31 = UtilSql.getValue(result, "param31");
        objectRptPromissoryNoteAfterData.param32 = UtilSql.getValue(result, "param32");
        objectRptPromissoryNoteAfterData.param41 = UtilSql.getValue(result, "param41");
        objectRptPromissoryNoteAfterData.param42 = UtilSql.getValue(result, "param42");
        objectRptPromissoryNoteAfterData.param43 = UtilSql.getValue(result, "param43");
        objectRptPromissoryNoteAfterData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectRptPromissoryNoteAfterData);
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
    RptPromissoryNoteAfterData objectRptPromissoryNoteAfterData[] = new RptPromissoryNoteAfterData[vector.size()];
    vector.copyInto(objectRptPromissoryNoteAfterData);
    return(objectRptPromissoryNoteAfterData);
  }

  public static String selectBanklocation(ConnectionProvider connectionProvider, String cBankAccountId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT PRINTBANKLOC FROM C_PROMISSORYFORMAT WHERE C_PROMISSORYFORMAT.C_BANKACCOUNT_ID = ?";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBankAccountId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "printbankloc");
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
