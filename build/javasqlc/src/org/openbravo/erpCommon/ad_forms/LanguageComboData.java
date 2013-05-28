//Sqlc generated V1.O00-1
package org.openbravo.erpCommon.ad_forms;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import java.util.*;

class LanguageComboData implements FieldProvider {
static Logger log4j = Logger.getLogger(LanguageComboData.class);
  private String InitRecordNumber="0";
  public String adLanguage;
  public String name;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("ad_language") || fieldName.equals("adLanguage"))
      return adLanguage;
    else if (fieldName.equalsIgnoreCase("name"))
      return name;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static LanguageComboData[] select(ConnectionProvider connectionProvider)    throws ServletException {
    return select(connectionProvider, 0, 0);
  }

  public static LanguageComboData[] select(ConnectionProvider connectionProvider, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT AD_LANGUAGE, NAME " +
      "        FROM AD_LANGUAGE " +
      "        WHERE ISACTIVE='Y'" +
      "        AND (ISSYSTEMLANGUAGE = 'Y' " +
      "        OR ISBASELANGUAGE = 'Y')" +
      "        ORDER BY NAME";

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
        LanguageComboData objectLanguageComboData = new LanguageComboData();
        objectLanguageComboData.adLanguage = UtilSql.getValue(result, "ad_language");
        objectLanguageComboData.name = UtilSql.getValue(result, "name");
        objectLanguageComboData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectLanguageComboData);
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
    LanguageComboData objectLanguageComboData[] = new LanguageComboData[vector.size()];
    vector.copyInto(objectLanguageComboData);
    return(objectLanguageComboData);
  }

  public static String defaultLanguage(ConnectionProvider connectionProvider)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT AD_LANGUAGE FROM AD_LANGUAGE WHERE ISACTIVE='Y' AND ISBASELANGUAGE='Y'";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    try {
    st = connectionProvider.getPreparedStatement(strSql);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "ad_language");
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

  public static LanguageComboData[] selectOthers(ConnectionProvider connectionProvider, String language)    throws ServletException {
    return selectOthers(connectionProvider, language, 0, 0);
  }

  public static LanguageComboData[] selectOthers(ConnectionProvider connectionProvider, String language, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT AD_LANGUAGE " +
      "        FROM AD_LANGUAGE " +
      "        WHERE ";
    strSql = strSql + ((language==null || language.equals(""))?"":"  AD_LANGUAGE = ? AND  ");
    strSql = strSql + 
      "ISACTIVE='Y'" +
      "        AND ISSYSTEMLANGUAGE = 'Y' " +
      "        AND ISBASELANGUAGE = 'N' " +
      "        ORDER BY NAME";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      if (language != null && !(language.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, language);
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
        LanguageComboData objectLanguageComboData = new LanguageComboData();
        objectLanguageComboData.adLanguage = UtilSql.getValue(result, "ad_language");
        objectLanguageComboData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectLanguageComboData);
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
    LanguageComboData objectLanguageComboData[] = new LanguageComboData[vector.size()];
    vector.copyInto(objectLanguageComboData);
    return(objectLanguageComboData);
  }
}
