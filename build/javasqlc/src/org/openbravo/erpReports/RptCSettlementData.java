//Sqlc generated V1.O00-1
package org.openbravo.erpReports;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import java.util.*;

class RptCSettlementData implements FieldProvider {
static Logger log4j = Logger.getLogger(RptCSettlementData.class);
  private String InitRecordNumber="0";
  public String cSettlementId;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("c_settlement_id") || fieldName.equals("cSettlementId"))
      return cSettlementId;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static RptCSettlementData[] select(ConnectionProvider connectionProvider, String adUserClient, String adUserOrg, String cSettlementId)    throws ServletException {
    return select(connectionProvider, adUserClient, adUserOrg, cSettlementId, 0, 0);
  }

  public static RptCSettlementData[] select(ConnectionProvider connectionProvider, String adUserClient, String adUserOrg, String cSettlementId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT C_SETTLEMENT_ID " +
      "        FROM C_SETTLEMENT" +
      "        WHERE C_SETTLEMENT.AD_CLIENT_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ")" +
      "        AND C_SETTLEMENT.AD_ORG_ID IN (";
    strSql = strSql + ((adUserOrg==null || adUserOrg.equals(""))?"":adUserOrg);
    strSql = strSql + 
      ")" +
      "        AND 1=1";
    strSql = strSql + ((cSettlementId==null || cSettlementId.equals(""))?"":"           AND C_SETTLEMENT.C_SETTLEMENT_ID IN          " + cSettlementId);
    strSql = strSql + 
      "        ORDER BY C_SETTLEMENT.DOCUMENTNO";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    try {
    st = connectionProvider.getPreparedStatement(strSql);
      if (adUserClient != null && !(adUserClient.equals(""))) {
        }
      if (adUserOrg != null && !(adUserOrg.equals(""))) {
        }
      if (cSettlementId != null && !(cSettlementId.equals(""))) {
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
        RptCSettlementData objectRptCSettlementData = new RptCSettlementData();
        objectRptCSettlementData.cSettlementId = UtilSql.getValue(result, "c_settlement_id");
        objectRptCSettlementData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectRptCSettlementData);
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
    RptCSettlementData objectRptCSettlementData[] = new RptCSettlementData[vector.size()];
    vector.copyInto(objectRptCSettlementData);
    return(objectRptCSettlementData);
  }

  public static RptCSettlementData[] set()    throws ServletException {
    RptCSettlementData objectRptCSettlementData[] = new RptCSettlementData[1];
    objectRptCSettlementData[0] = new RptCSettlementData();
    objectRptCSettlementData[0].cSettlementId = "";
    return objectRptCSettlementData;
  }
}
