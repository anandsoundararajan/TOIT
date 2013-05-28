//Sqlc generated V1.O00-1
package org.openbravo.erpCommon.businessUtility;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import java.util.*;

class TabFilterData implements FieldProvider {
static Logger log4j = Logger.getLogger(TabFilterData.class);
  private String InitRecordNumber="0";
  public String name;
  public String adReferenceId;
  public String showinrelation;
  public String isdisplayed;
  public String completeName;
  public String columnname;
  public String position;
  public String completePosition;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("name"))
      return name;
    else if (fieldName.equalsIgnoreCase("ad_reference_id") || fieldName.equals("adReferenceId"))
      return adReferenceId;
    else if (fieldName.equalsIgnoreCase("showinrelation"))
      return showinrelation;
    else if (fieldName.equalsIgnoreCase("isdisplayed"))
      return isdisplayed;
    else if (fieldName.equalsIgnoreCase("complete_name") || fieldName.equals("completeName"))
      return completeName;
    else if (fieldName.equalsIgnoreCase("columnname"))
      return columnname;
    else if (fieldName.equals("position"))
      return position;
    else if (fieldName.equals("completePosition"))
      return completePosition;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static TabFilterData[] select(ConnectionProvider connectionProvider, String adTabId)    throws ServletException {
    return select(connectionProvider, adTabId, 0, 0);
  }

  public static TabFilterData[] select(ConnectionProvider connectionProvider, String adTabId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT F.NAME, C.AD_REFERENCE_ID, F.SHOWINRELATION, F.ISDISPLAYED, F.NAME AS COMPLETE_NAME, C.ColumnName " +
      "        FROM AD_FIELD F, AD_COLUMN C" +
      "        WHERE F.AD_COLUMN_ID = C.AD_COLUMN_ID " +
      "        AND F.AD_TAB_ID = ?" +
      "        ORDER BY F.SEQNO";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adTabId);

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
        TabFilterData objectTabFilterData = new TabFilterData();
        objectTabFilterData.name = UtilSql.getValue(result, "name");
        objectTabFilterData.adReferenceId = UtilSql.getValue(result, "ad_reference_id");
        objectTabFilterData.showinrelation = UtilSql.getValue(result, "showinrelation");
        objectTabFilterData.isdisplayed = UtilSql.getValue(result, "isdisplayed");
        objectTabFilterData.completeName = UtilSql.getValue(result, "complete_name");
        objectTabFilterData.columnname = UtilSql.getValue(result, "columnname");
        objectTabFilterData.position = Long.toString(countRecord);
        objectTabFilterData.completePosition = Long.toString(countRecord);
        objectTabFilterData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectTabFilterData);
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
    TabFilterData objectTabFilterData[] = new TabFilterData[vector.size()];
    vector.copyInto(objectTabFilterData);
    return(objectTabFilterData);
  }

  public static TabFilterData[] set()    throws ServletException {
    TabFilterData objectTabFilterData[] = new TabFilterData[1];
    objectTabFilterData[0] = new TabFilterData();
    objectTabFilterData[0].name = "";
    objectTabFilterData[0].adReferenceId = "";
    objectTabFilterData[0].showinrelation = "";
    objectTabFilterData[0].isdisplayed = "";
    objectTabFilterData[0].completeName = "";
    objectTabFilterData[0].columnname = "";
    return objectTabFilterData;
  }

  public static TabFilterData[] selectTrl(ConnectionProvider connectionProvider, String adLanguage, String adTabId)    throws ServletException {
    return selectTrl(connectionProvider, adLanguage, adTabId, 0, 0);
  }

  public static TabFilterData[] selectTrl(ConnectionProvider connectionProvider, String adLanguage, String adTabId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT (CASE WHEN FT.NAME IS NULL THEN F.NAME ELSE FT.NAME END) AS NAME, C.AD_REFERENCE_ID, F.SHOWINRELATION, F.ISDISPLAYED, " +
      "        (CASE WHEN FT.NAME IS NULL THEN F.NAME ELSE FT.NAME END) AS COMPLETE_NAME, C.ColumnName " +
      "        FROM AD_FIELD F left join  AD_FIELD_TRL FT on F.AD_FIELD_ID = FT.AD_FIELD_ID " +
      "                                                  AND FT.AD_LANGUAGE = ?, " +
      "          AD_COLUMN C" +
      "        WHERE F.AD_COLUMN_ID = C.AD_COLUMN_ID " +
      "        AND F.AD_TAB_ID = ?" +
      "        ORDER BY F.SEQNO";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adTabId);

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
        TabFilterData objectTabFilterData = new TabFilterData();
        objectTabFilterData.name = UtilSql.getValue(result, "name");
        objectTabFilterData.adReferenceId = UtilSql.getValue(result, "ad_reference_id");
        objectTabFilterData.showinrelation = UtilSql.getValue(result, "showinrelation");
        objectTabFilterData.isdisplayed = UtilSql.getValue(result, "isdisplayed");
        objectTabFilterData.completeName = UtilSql.getValue(result, "complete_name");
        objectTabFilterData.columnname = UtilSql.getValue(result, "columnname");
        objectTabFilterData.position = Long.toString(countRecord);
        objectTabFilterData.completePosition = Long.toString(countRecord);
        objectTabFilterData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectTabFilterData);
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
    TabFilterData objectTabFilterData[] = new TabFilterData[vector.size()];
    vector.copyInto(objectTabFilterData);
    return(objectTabFilterData);
  }
}
