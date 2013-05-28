//Sqlc generated V1.O00-1
package org.openbravo.erpReports;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import java.util.*;

class RptMACCPMeasuresHoursData implements FieldProvider {
static Logger log4j = Logger.getLogger(RptMACCPMeasuresHoursData.class);
  private String InitRecordNumber="0";
  public String hour;
  public String ord;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("hour"))
      return hour;
    else if (fieldName.equalsIgnoreCase("ord"))
      return ord;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static RptMACCPMeasuresHoursData[] select(ConnectionProvider connectionProvider, String maMeasureGroupId)    throws ServletException {
    return select(connectionProvider, maMeasureGroupId, 0, 0);
  }

  public static RptMACCPMeasuresHoursData[] select(ConnectionProvider connectionProvider, String maMeasureGroupId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        select TO_CHAR(MEASUREHOUR, 'HH:MI') as hour, 0 as ord" +
      "                from MA_MEASURE_TIME" +
      "                where MA_Measure_Group_ID = ?" +
      "        union all" +
      "        select ' ' as hour, 1 as ord" +
      "        from ad_INTEGER" +
      "        where VALUE <= 10-(select count(*) " +
      "                           from MA_MEASURE_TIME" +
      "                           where MA_Measure_Group_ID = ?)" +
      "        ORDER BY ord, hour";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, maMeasureGroupId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, maMeasureGroupId);

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
        RptMACCPMeasuresHoursData objectRptMACCPMeasuresHoursData = new RptMACCPMeasuresHoursData();
        objectRptMACCPMeasuresHoursData.hour = UtilSql.getValue(result, "hour");
        objectRptMACCPMeasuresHoursData.ord = UtilSql.getValue(result, "ord");
        objectRptMACCPMeasuresHoursData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectRptMACCPMeasuresHoursData);
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
    RptMACCPMeasuresHoursData objectRptMACCPMeasuresHoursData[] = new RptMACCPMeasuresHoursData[vector.size()];
    vector.copyInto(objectRptMACCPMeasuresHoursData);
    return(objectRptMACCPMeasuresHoursData);
  }

  public static RptMACCPMeasuresHoursData[] set()    throws ServletException {
    RptMACCPMeasuresHoursData objectRptMACCPMeasuresHoursData[] = new RptMACCPMeasuresHoursData[1];
    objectRptMACCPMeasuresHoursData[0] = new RptMACCPMeasuresHoursData();
    objectRptMACCPMeasuresHoursData[0].hour = "";
    objectRptMACCPMeasuresHoursData[0].ord = "";
    return objectRptMACCPMeasuresHoursData;
  }
}
