//Sqlc generated V1.O00-1
package org.openbravo.erpCommon.ad_callouts;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import java.util.*;

class SLWorkRequirementSequence implements FieldProvider {
static Logger log4j = Logger.getLogger(SLWorkRequirementSequence.class);
  private String InitRecordNumber="0";
  public String maProcessId;
  public String costcenteruse;
  public String preptime;
  public String noqty;
  public String groupuse;
  public String quantity;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("ma_process_id") || fieldName.equals("maProcessId"))
      return maProcessId;
    else if (fieldName.equalsIgnoreCase("costcenteruse"))
      return costcenteruse;
    else if (fieldName.equalsIgnoreCase("preptime"))
      return preptime;
    else if (fieldName.equalsIgnoreCase("noqty"))
      return noqty;
    else if (fieldName.equalsIgnoreCase("groupuse"))
      return groupuse;
    else if (fieldName.equalsIgnoreCase("quantity"))
      return quantity;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static SLWorkRequirementSequence[] select(ConnectionProvider connectionProvider, String maSequenceId)    throws ServletException {
    return select(connectionProvider, maSequenceId, 0, 0);
  }

  public static SLWorkRequirementSequence[] select(ConnectionProvider connectionProvider, String maSequenceId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  s.MA_Process_ID, s.COSTCENTERUSE, s.PREPTIME, s.NOQTY, s.GROUPUSE, '' AS quantity" +
      "        FROM    MA_Sequence s" +
      "        WHERE   MA_Sequence_ID = ?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, maSequenceId);

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
        SLWorkRequirementSequence objectSLWorkRequirementSequence = new SLWorkRequirementSequence();
        objectSLWorkRequirementSequence.maProcessId = UtilSql.getValue(result, "ma_process_id");
        objectSLWorkRequirementSequence.costcenteruse = UtilSql.getValue(result, "costcenteruse");
        objectSLWorkRequirementSequence.preptime = UtilSql.getValue(result, "preptime");
        objectSLWorkRequirementSequence.noqty = UtilSql.getValue(result, "noqty");
        objectSLWorkRequirementSequence.groupuse = UtilSql.getValue(result, "groupuse");
        objectSLWorkRequirementSequence.quantity = UtilSql.getValue(result, "quantity");
        objectSLWorkRequirementSequence.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectSLWorkRequirementSequence);
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
    SLWorkRequirementSequence objectSLWorkRequirementSequence[] = new SLWorkRequirementSequence[vector.size()];
    vector.copyInto(objectSLWorkRequirementSequence);
    return(objectSLWorkRequirementSequence);
  }

  public static String qty(ConnectionProvider connectionProvider, String maSequenceId, String maWorkRequirementId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  (s.multiplier * w.quantity) AS quantity" +
      "        FROM    MA_Sequence s, MA_WorkRequirement w" +
      "        WHERE   s.MA_Sequence_ID = ?" +
      "        AND     w.MA_WorkRequirement_ID = ?";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, maSequenceId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, maWorkRequirementId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "quantity");
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

  public static String doneqty(ConnectionProvider connectionProvider, String maSequenceId, String maWorkRequirementId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  (s.multiplier * w.quantity) AS quantity" +
      "        FROM    MA_Sequence s, MA_WorkRequirement w" +
      "        WHERE   s.MA_Sequence_ID = ?" +
      "        AND     w.MA_WorkRequirement_ID = ?";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, maSequenceId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, maWorkRequirementId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "quantity");
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
