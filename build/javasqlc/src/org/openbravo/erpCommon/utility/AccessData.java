//Sqlc generated V1.O00-1
package org.openbravo.erpCommon.utility;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import java.util.*;

class AccessData implements FieldProvider {
static Logger log4j = Logger.getLogger(AccessData.class);
  private String InitRecordNumber="0";
  public String total;
  public String adReferenceValueId;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("total"))
      return total;
    else if (fieldName.equalsIgnoreCase("ad_reference_value_id") || fieldName.equals("adReferenceValueId"))
      return adReferenceValueId;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static AccessData[] selectAccessSearchMultiple(ConnectionProvider connectionProvider, String role)    throws ServletException {
    return selectAccessSearchMultiple(connectionProvider, role, 0, 0);
  }

  public static AccessData[] selectAccessSearchMultiple(ConnectionProvider connectionProvider, String role, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "          select count(*) AS TOTAL, ad_reference_value_id" +
      "            from ad_column c," +
      "                 ad_field f," +
      "                 ad_tab tb," +
      "                 ad_table t," +
      "                 ad_window_access wa," +
      "                 ad_window w," +
      "                 ad_role r" +
      "           where r.ad_role_id = ?" +
      "             and c.ad_reference_id = '30'" +
      "             and c.ad_table_id = t.ad_table_id" +
      "             and c.isactive = 'Y'" +
      "             and c.isupdateable='Y'" +
      "             and f.isactive = 'Y'" +
      "             and f.isdisplayed = 'Y'" +
      "             and f.ad_column_id = c.ad_column_id" +
      "             and tb.ad_tab_id  = f.ad_tab_id" +
      "             and tb.ad_window_id = wa.ad_window_id" +
      "             and tb.ad_window_id = w.ad_window_id" +
      "             and wa.ad_role_id = r.ad_role_id" +
      "             and wa.isactive = 'Y'" +
      "             and wa.isreadwrite='Y'" +
      "             and w.isactive='Y'" +
      "             and t.isActive='Y'" +
      "             and tb.isActive='Y'" +
      "             and tb.ad_table_id = t.ad_table_id" +
      "             and ( (TO_NUMBER(t.accessLevel)=4 and instr(r.userLevel,'S')!=0)" +
      "                or (TO_NUMBER(t.accessLevel)=1 and instr(r.userLevel,'O')!=0)" +
      "                or (TO_NUMBER(t.accessLevel)=3 and not (instr(r.userLevel,'C')=0 or instr(r.userLevel,'O')=0))" +
      "                or (TO_NUMBER(t.accessLevel)=6 and not (instr(r.userLevel,'S')=0 or instr(r.userLevel,'C')=0))" +
      "                )" +
      "             and not exists (select 1" +
      "                              from ad_table_access ta" +
      "                             where t.ad_table_id = ta.ad_table_id" +
      "                               and ta.ad_role_id = r.ad_role_id" +
      "                               and ta.isActive='Y'" +
      "                               and (ta.isExclude = 'Y' or ta.isReadOnly = 'Y'))" +
      "           group by ad_reference_value_id";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
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
        AccessData objectAccessData = new AccessData();
        objectAccessData.total = UtilSql.getValue(result, "total");
        objectAccessData.adReferenceValueId = UtilSql.getValue(result, "ad_reference_value_id");
        objectAccessData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectAccessData);
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
    AccessData objectAccessData[] = new AccessData[vector.size()];
    vector.copyInto(objectAccessData);
    return(objectAccessData);
  }

  public static String isReadOnly(ConnectionProvider connectionProvider, String tabId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT (CASE WHEN UIPattern IN ('SR', 'RO') then 'Y' else 'N' END) AS isReadOnly" +
      "          FROM AD_Tab" +
      "         WHERE AD_Tab_ID = ? ";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, tabId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "isreadonly");
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
