//Sqlc generated V1.O00-1
package org.openbravo.base.secureApp;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import java.util.*;

class AttributeData implements FieldProvider {
static Logger log4j = Logger.getLogger(AttributeData.class);
  private String InitRecordNumber="0";
  public String value;
  public String attribute;
  public String hasalias;
  public String elementtype;
  public String adWindowId;
  public String cCurrencyId;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("value"))
      return value;
    else if (fieldName.equalsIgnoreCase("attribute"))
      return attribute;
    else if (fieldName.equalsIgnoreCase("hasalias"))
      return hasalias;
    else if (fieldName.equalsIgnoreCase("elementtype"))
      return elementtype;
    else if (fieldName.equalsIgnoreCase("ad_window_id") || fieldName.equals("adWindowId"))
      return adWindowId;
    else if (fieldName.equalsIgnoreCase("c_currency_id") || fieldName.equals("cCurrencyId"))
      return cCurrencyId;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static AttributeData[] select(ConnectionProvider connectionProvider, String clientlist, String orglist)    throws ServletException {
    return select(connectionProvider, clientlist, orglist, 0, 0);
  }

  public static AttributeData[] select(ConnectionProvider connectionProvider, String clientlist, String orglist, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT distinct a.C_ACCTSCHEMA_ID as VALUE, a.C_CURRENCY_ID as Attribute, a.HASALIAS, " +
      "        ae.ELEMENTTYPE, '' as AD_Window_ID, '' as C_CURRENCY_ID" +
      "        FROM C_AcctSchema a, C_AcctSchema_Element ae " +
      "        WHERE a.C_AcctSchema_ID=ae.C_ACCTSCHEMA_ID " +
      "        AND ae.ISACTIVE = 'Y'" +
      "        AND a.AD_CLIENT_ID IN (";
    strSql = strSql + ((clientlist==null || clientlist.equals(""))?"":clientlist);
    strSql = strSql + 
      ") " +
      "        AND a.AD_ORG_ID IN (";
    strSql = strSql + ((orglist==null || orglist.equals(""))?"":orglist);
    strSql = strSql + 
      ")";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    try {
    st = connectionProvider.getPreparedStatement(strSql);
      if (clientlist != null && !(clientlist.equals(""))) {
        }
      if (orglist != null && !(orglist.equals(""))) {
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
        AttributeData objectAttributeData = new AttributeData();
        objectAttributeData.value = UtilSql.getValue(result, "value");
        objectAttributeData.attribute = UtilSql.getValue(result, "attribute");
        objectAttributeData.hasalias = UtilSql.getValue(result, "hasalias");
        objectAttributeData.elementtype = UtilSql.getValue(result, "elementtype");
        objectAttributeData.adWindowId = UtilSql.getValue(result, "ad_window_id");
        objectAttributeData.cCurrencyId = UtilSql.getValue(result, "c_currency_id");
        objectAttributeData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectAttributeData);
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
    AttributeData objectAttributeData[] = new AttributeData[vector.size()];
    vector.copyInto(objectAttributeData);
    return(objectAttributeData);
  }

  public static AttributeData[] selectIsSOTrx(ConnectionProvider connectionProvider)    throws ServletException {
    return selectIsSOTrx(connectionProvider, 0, 0);
  }

  public static AttributeData[] selectIsSOTrx(ConnectionProvider connectionProvider, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT ad_window_id, isSOTrx as value FROM AD_WINDOW ";

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
        AttributeData objectAttributeData = new AttributeData();
        objectAttributeData.adWindowId = UtilSql.getValue(result, "ad_window_id");
        objectAttributeData.value = UtilSql.getValue(result, "value");
        objectAttributeData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectAttributeData);
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
    AttributeData objectAttributeData[] = new AttributeData[vector.size()];
    vector.copyInto(objectAttributeData);
    return(objectAttributeData);
  }

  public static String selectStdPrecision(ConnectionProvider connectionProvider, String cCurrencyId, String clientlist, String orglist)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "          SELECT STDPRECISION " +
      "          FROM C_CURRENCY " +
      "          WHERE C_CURRENCY_ID = ? " +
      "          AND AD_CLIENT_ID IN (";
    strSql = strSql + ((clientlist==null || clientlist.equals(""))?"":clientlist);
    strSql = strSql + 
      ")" +
      "          AND AD_ORG_ID IN (";
    strSql = strSql + ((orglist==null || orglist.equals(""))?"":orglist);
    strSql = strSql + 
      ") ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCurrencyId);
      if (clientlist != null && !(clientlist.equals(""))) {
        }
      if (orglist != null && !(orglist.equals(""))) {
        }

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "stdprecision");
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

  public static AttributeData[] selectOrgCurrency(ConnectionProvider connectionProvider, String organization, String client)    throws ServletException {
    return selectOrgCurrency(connectionProvider, organization, client, 0, 0);
  }

  public static AttributeData[] selectOrgCurrency(ConnectionProvider connectionProvider, String organization, String client, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "          SELECT C_CURRENCY_ID " +
      "          FROM AD_ORG " +
      "          WHERE AD_ISORGINCLUDED(?,AD_ORG_ID,?) <> -1 AND C_CURRENCY_ID IS NOT NULL" +
      "          ORDER BY AD_ISORGINCLUDED(?,AD_ORG_ID,?)";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, organization);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, client);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, organization);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, client);

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
        AttributeData objectAttributeData = new AttributeData();
        objectAttributeData.cCurrencyId = UtilSql.getValue(result, "c_currency_id");
        objectAttributeData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectAttributeData);
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
    AttributeData objectAttributeData[] = new AttributeData[vector.size()];
    vector.copyInto(objectAttributeData);
    return(objectAttributeData);
  }
}
