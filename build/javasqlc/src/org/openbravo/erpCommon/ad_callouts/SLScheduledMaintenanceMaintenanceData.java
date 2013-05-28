//Sqlc generated V1.O00-1
package org.openbravo.erpCommon.ad_callouts;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import java.util.*;

class SLScheduledMaintenanceMaintenanceData implements FieldProvider {
static Logger log4j = Logger.getLogger(SLScheduledMaintenanceMaintenanceData.class);
  private String InitRecordNumber="0";
  public String maMachineId;
  public String maMachineTypeId;
  public String maintenanceType;
  public String maMaintOperationId;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("ma_machine_id") || fieldName.equals("maMachineId"))
      return maMachineId;
    else if (fieldName.equalsIgnoreCase("ma_machine_type_id") || fieldName.equals("maMachineTypeId"))
      return maMachineTypeId;
    else if (fieldName.equalsIgnoreCase("maintenance_type") || fieldName.equals("maintenanceType"))
      return maintenanceType;
    else if (fieldName.equalsIgnoreCase("ma_maint_operation_id") || fieldName.equals("maMaintOperationId"))
      return maMaintOperationId;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static SLScheduledMaintenanceMaintenanceData[] select(ConnectionProvider connectionProvider, String strmaMaintenanceId)    throws ServletException {
    return select(connectionProvider, strmaMaintenanceId, 0, 0);
  }

  public static SLScheduledMaintenanceMaintenanceData[] select(ConnectionProvider connectionProvider, String strmaMaintenanceId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT MA_MACHINE_ID, MA_MACHINE_TYPE_ID, MAINTENANCE_TYPE, MA_MAINT_OPERATION_ID" +
      "      FROM MA_MAINTENANCE" +
      "      WHERE MA_MAINTENANCE_ID = ?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, strmaMaintenanceId);

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
        SLScheduledMaintenanceMaintenanceData objectSLScheduledMaintenanceMaintenanceData = new SLScheduledMaintenanceMaintenanceData();
        objectSLScheduledMaintenanceMaintenanceData.maMachineId = UtilSql.getValue(result, "ma_machine_id");
        objectSLScheduledMaintenanceMaintenanceData.maMachineTypeId = UtilSql.getValue(result, "ma_machine_type_id");
        objectSLScheduledMaintenanceMaintenanceData.maintenanceType = UtilSql.getValue(result, "maintenance_type");
        objectSLScheduledMaintenanceMaintenanceData.maMaintOperationId = UtilSql.getValue(result, "ma_maint_operation_id");
        objectSLScheduledMaintenanceMaintenanceData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectSLScheduledMaintenanceMaintenanceData);
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
    SLScheduledMaintenanceMaintenanceData objectSLScheduledMaintenanceMaintenanceData[] = new SLScheduledMaintenanceMaintenanceData[vector.size()];
    vector.copyInto(objectSLScheduledMaintenanceMaintenanceData);
    return(objectSLScheduledMaintenanceMaintenanceData);
  }
}
