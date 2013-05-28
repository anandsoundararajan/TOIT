//Sqlc generated V1.O00-1
package org.openbravo.costing;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import java.util.*;
import org.openbravo.database.RDBMSIndependent;
import org.openbravo.exception.*;

class CostingData implements FieldProvider {
static Logger log4j = Logger.getLogger(CostingData.class);
  private String InitRecordNumber="0";
  public String output;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("output"))
      return output;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static CostingData[] select(ConnectionProvider connectionProvider)    throws ServletException {
    return select(connectionProvider, 0, 0);
  }

  public static CostingData[] select(ConnectionProvider connectionProvider, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "       select 1 as output from dual";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    try {
    st = connectionProvider.getPreparedStatement(strSql);

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
        CostingData objectCostingData = new CostingData();
        objectCostingData.output = UtilSql.getValue(result, "output");
        objectCostingData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectCostingData);
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
    CostingData objectCostingData[] = new CostingData[vector.size()];
    vector.copyInto(objectCostingData);
    return(objectCostingData);
  }

  public static CostingData calculateWorkEffortCost(Connection conn, ConnectionProvider connectionProvider, String productionId, String userId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        CALL MA_PRODUCTION_COST(?, ?, ?)";

    CostingData objectCostingData = new CostingData();
    CallableStatement st = null;
    if (connectionProvider.getRDBMS().equalsIgnoreCase("ORACLE")) {

    int iParameter = 0;
    try {
      st = connectionProvider.getCallableStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, productionId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, userId);
      int iParameteroutput = iParameter + 1;
      iParameter++; st.registerOutParameter(iParameter, 12);

      st.execute();
      objectCostingData.output= UtilSql.getStringCallableStatement(st, iParameteroutput);
    } catch(SQLException e){
      log4j.error("SQL error in query: " + strSql + "Exception:"+ e);
      throw new ServletException("@CODE=" + Integer.toString(e.getErrorCode()) + "@" + e.getMessage());
    } catch(Exception ex){
      log4j.error("Exception in query: " + strSql + "Exception:"+ ex);
      throw new ServletException("@CODE=@" + ex.getMessage());
    } finally {
      try {
      } catch(Exception ignore){
        ignore.printStackTrace();
      }
    }
    }
    else {
      Vector<String> parametersData = new Vector<String>();
      Vector<String> parametersTypes = new Vector<String>();
      parametersData.addElement(productionId);
      parametersTypes.addElement("in");
      parametersData.addElement(userId);
      parametersTypes.addElement("in");
      parametersData.addElement("output");
      parametersTypes.addElement("out");
      Vector<String> vecTotal = new Vector<String>();
      try {
        vecTotal =       RDBMSIndependent.getCallableResult(conn, connectionProvider, strSql, parametersData, parametersTypes, 1);
      objectCostingData.output = (String) vecTotal.elementAt(0);
      } catch(SQLException e){
        log4j.error("SQL error in query: " + strSql + "Exception:"+ e);
        throw new ServletException("@CODE=" + Integer.toString(e.getErrorCode()) + "@" + e.getMessage());
      } catch(NoConnectionAvailableException ec){
        log4j.error("Connection error in query: " + strSql + "Exception:"+ ec);
        throw new ServletException("@CODE=NoConnectionAvailable");
      } catch(PoolNotFoundException ep){
        log4j.error("Pool error in query: " + strSql + "Exception:"+ ep);
        throw new ServletException("@CODE=NoConnectionAvailable");
      } catch(Exception ex){
        log4j.error("Exception in query: " + strSql + "Exception:"+ ex);
        throw new ServletException("@CODE=@" + ex.getMessage());
      }
    }
    return(objectCostingData);
  }
}
