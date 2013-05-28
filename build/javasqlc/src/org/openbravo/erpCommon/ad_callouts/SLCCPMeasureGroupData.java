//Sqlc generated V1.O00-1
package org.openbravo.erpCommon.ad_callouts;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import java.util.*;

class SLCCPMeasureGroupData implements FieldProvider {
static Logger log4j = Logger.getLogger(SLCCPMeasureGroupData.class);
  private String InitRecordNumber="0";
  public String seqno;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("seqno"))
      return seqno;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static SLCCPMeasureGroupData[] select(ConnectionProvider connectionProvider, String maCCPGroupId)    throws ServletException {
    return select(connectionProvider, maCCPGroupId, 0, 0);
  }

  public static SLCCPMeasureGroupData[] select(ConnectionProvider connectionProvider, String maCCPGroupId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT seqno" +
      "      FROM MA_CCP_Group" +
      "      WHERE MA_CCP_Group_ID = ?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, maCCPGroupId);

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
        SLCCPMeasureGroupData objectSLCCPMeasureGroupData = new SLCCPMeasureGroupData();
        objectSLCCPMeasureGroupData.seqno = UtilSql.getValue(result, "seqno");
        objectSLCCPMeasureGroupData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectSLCCPMeasureGroupData);
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
    SLCCPMeasureGroupData objectSLCCPMeasureGroupData[] = new SLCCPMeasureGroupData[vector.size()];
    vector.copyInto(objectSLCCPMeasureGroupData);
    return(objectSLCCPMeasureGroupData);
  }
}
