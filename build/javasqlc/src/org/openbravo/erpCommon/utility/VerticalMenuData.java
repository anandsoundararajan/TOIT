//Sqlc generated V1.O00-1
package org.openbravo.erpCommon.utility;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import java.util.*;

class VerticalMenuData implements FieldProvider {
static Logger log4j = Logger.getLogger(VerticalMenuData.class);
  private String InitRecordNumber="0";
  public String n;
  public String adAlertruleId;
  public String filterclause;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("n"))
      return n;
    else if (fieldName.equalsIgnoreCase("ad_alertrule_id") || fieldName.equals("adAlertruleId"))
      return adAlertruleId;
    else if (fieldName.equalsIgnoreCase("filterclause"))
      return filterclause;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static VerticalMenuData[] selectAlertRules(ConnectionProvider connectionProvider, String user, String role)    throws ServletException {
    return selectAlertRules(connectionProvider, user, role, 0, 0);
  }

  public static VerticalMenuData[] selectAlertRules(ConnectionProvider connectionProvider, String user, String role, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "       SELECT DISTINCT '' AS N," +
      "              a.AD_ALERTRULE_ID," +
      "              a.FILTERCLAUSE" +
      "         FROM AD_ALERTRULE A," +
      "              AD_ALERTRECIPIENT R " +
      "        WHERE A.ISACTIVE='Y'" +
      "          AND R.AD_ALERTRULE_ID = A.AD_ALERTRULE_ID" +
      "          AND ((R.AD_USER_ID IS NOT NULL AND R.AD_USER_ID = ?) " +
      "               OR " +
      "              (R.AD_USER_ID IS NULL AND R.AD_ROLE_ID = ?))          ";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, user);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, role);

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
        VerticalMenuData objectVerticalMenuData = new VerticalMenuData();
        objectVerticalMenuData.n = UtilSql.getValue(result, "n");
        objectVerticalMenuData.adAlertruleId = UtilSql.getValue(result, "ad_alertrule_id");
        objectVerticalMenuData.filterclause = UtilSql.getValue(result, "filterclause");
        objectVerticalMenuData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectVerticalMenuData);
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
    VerticalMenuData objectVerticalMenuData[] = new VerticalMenuData[vector.size()];
    vector.copyInto(objectVerticalMenuData);
    return(objectVerticalMenuData);
  }

  public static String selectCountActiveAlerts(ConnectionProvider connectionProvider, String userclient, String userorg, String rule, String whereClause)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "       SELECT COUNT(*) AS N" +
      "         FROM AD_ALERT" +
      "        WHERE ISACTIVE='Y'" +
      "          AND ISFIXED ='N'" +
      "          AND AD_CLIENT_ID IN (";
    strSql = strSql + ((userclient==null || userclient.equals(""))?"":userclient);
    strSql = strSql + 
      ") " +
      "          AND AD_ORG_ID IN (";
    strSql = strSql + ((userorg==null || userorg.equals(""))?"":userorg);
    strSql = strSql + 
      ")" +
      "          AND AD_ALERTRULE_ID = ?" +
      "          AND 1=1 ";
    strSql = strSql + ((whereClause==null || whereClause.equals(""))?"":whereClause);

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      if (userclient != null && !(userclient.equals(""))) {
        }
      if (userorg != null && !(userorg.equals(""))) {
        }
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, rule);
      if (whereClause != null && !(whereClause.equals(""))) {
        }

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "n");
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
