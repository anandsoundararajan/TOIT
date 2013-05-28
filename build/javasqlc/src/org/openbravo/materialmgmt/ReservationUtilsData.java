//Sqlc generated V1.O00-1
package org.openbravo.materialmgmt;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import java.util.*;
import org.openbravo.database.RDBMSIndependent;
import org.openbravo.exception.*;

class ReservationUtilsData implements FieldProvider {
static Logger log4j = Logger.getLogger(ReservationUtilsData.class);
  private String InitRecordNumber="0";
  public String a;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("a"))
      return a;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static ReservationUtilsData[] select(ConnectionProvider connectionProvider)    throws ServletException {
    return select(connectionProvider, 0, 0);
  }

  public static ReservationUtilsData[] select(ConnectionProvider connectionProvider, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "       select 1 as a from dual";

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
        ReservationUtilsData objectReservationUtilsData = new ReservationUtilsData();
        objectReservationUtilsData.a = UtilSql.getValue(result, "a");
        objectReservationUtilsData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectReservationUtilsData);
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
    ReservationUtilsData objectReservationUtilsData[] = new ReservationUtilsData[vector.size()];
    vector.copyInto(objectReservationUtilsData);
    return(objectReservationUtilsData);
  }

  public static CSResponse createReserveFromSalesOrderLine(Connection conn, ConnectionProvider connectionProvider, String cOrderLineId, String doProcess, String adUserId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        CALL M_CREATE_RESERVE_FROM_SOL(?,?,?,?)";

    CSResponse objectCSResponse = new CSResponse();
    CallableStatement st = null;
    if (connectionProvider.getRDBMS().equalsIgnoreCase("ORACLE")) {

    int iParameter = 0;
    try {
      st = connectionProvider.getCallableStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cOrderLineId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, doProcess);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);
      int iParameterreturnValue = iParameter + 1;
      iParameter++; st.registerOutParameter(iParameter, 12);

      st.execute();
      objectCSResponse.returnValue= UtilSql.getStringCallableStatement(st, iParameterreturnValue);
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
      parametersData.addElement(cOrderLineId);
      parametersTypes.addElement("in");
      parametersData.addElement(doProcess);
      parametersTypes.addElement("in");
      parametersData.addElement(adUserId);
      parametersTypes.addElement("in");
      parametersData.addElement("returnValue");
      parametersTypes.addElement("out");
      Vector<String> vecTotal = new Vector<String>();
      try {
        vecTotal =       RDBMSIndependent.getCallableResult(conn, connectionProvider, strSql, parametersData, parametersTypes, 1);
      objectCSResponse.returnValue = (String) vecTotal.elementAt(0);
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
    return(objectCSResponse);
  }

  public static CSResponse reserveStockAuto(Connection conn, ConnectionProvider connectionProvider, String mReservationId, String adUserId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        CALL M_RESERVE_STOCK_AUTO(?,?,?)";

    CSResponse objectCSResponse = new CSResponse();
    CallableStatement st = null;
    if (connectionProvider.getRDBMS().equalsIgnoreCase("ORACLE")) {

    int iParameter = 0;
    try {
      st = connectionProvider.getCallableStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mReservationId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);
      int iParameterreturnValue = iParameter + 1;
      iParameter++; st.registerOutParameter(iParameter, 12);

      st.execute();
      objectCSResponse.returnValue= UtilSql.getStringCallableStatement(st, iParameterreturnValue);
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
      parametersData.addElement(mReservationId);
      parametersTypes.addElement("in");
      parametersData.addElement(adUserId);
      parametersTypes.addElement("in");
      parametersData.addElement("returnValue");
      parametersTypes.addElement("out");
      Vector<String> vecTotal = new Vector<String>();
      try {
        vecTotal =       RDBMSIndependent.getCallableResult(conn, connectionProvider, strSql, parametersData, parametersTypes, 1);
      objectCSResponse.returnValue = (String) vecTotal.elementAt(0);
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
    return(objectCSResponse);
  }

  public static CSResponse reserveStockManual(Connection conn, ConnectionProvider connectionProvider, String mReservationId, String type, String stockId, String quantity, String adUserId, String allocated)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        CALL M_RESERVE_STOCK_MANUAL(?,?,?,to_number(?),?,?,?)";

    CSResponse objectCSResponse = new CSResponse();
    CallableStatement st = null;
    if (connectionProvider.getRDBMS().equalsIgnoreCase("ORACLE")) {

    int iParameter = 0;
    try {
      st = connectionProvider.getCallableStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mReservationId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, type);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, stockId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, quantity);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, allocated);
      int iParameterreturnValue = iParameter + 1;
      iParameter++; st.registerOutParameter(iParameter, 12);

      st.execute();
      objectCSResponse.returnValue= UtilSql.getStringCallableStatement(st, iParameterreturnValue);
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
      parametersData.addElement(mReservationId);
      parametersTypes.addElement("in");
      parametersData.addElement(type);
      parametersTypes.addElement("in");
      parametersData.addElement(stockId);
      parametersTypes.addElement("in");
      parametersData.addElement(quantity);
      parametersTypes.addElement("in");
      parametersData.addElement(adUserId);
      parametersTypes.addElement("in");
      parametersData.addElement(allocated);
      parametersTypes.addElement("in");
      parametersData.addElement("returnValue");
      parametersTypes.addElement("out");
      Vector<String> vecTotal = new Vector<String>();
      try {
        vecTotal =       RDBMSIndependent.getCallableResult(conn, connectionProvider, strSql, parametersData, parametersTypes, 1);
      objectCSResponse.returnValue = (String) vecTotal.elementAt(0);
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
    return(objectCSResponse);
  }
}
