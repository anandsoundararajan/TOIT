//Sqlc generated V1.O00-1
package org.openbravo.erpCommon.ad_process;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import java.util.*;

class ApplyModulesData implements FieldProvider {
static Logger log4j = Logger.getLogger(ApplyModulesData.class);
  private String InitRecordNumber="0";
  public String name;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("name"))
      return name;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static ApplyModulesData[] selectUnappliedModules(ConnectionProvider connectionProvider)    throws ServletException {
    return selectUnappliedModules(connectionProvider, 0, 0);
  }

  public static ApplyModulesData[] selectUnappliedModules(ConnectionProvider connectionProvider, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "         SELECT JAVAPACKAGE AS NAME" +
      "           FROM AD_MODULE M" +
      "          WHERE ISACTIVE='Y'" +
      "            AND (STATUS='I' OR STATUS='U' OR STATUS='P')  " +
      "            AND NOT EXISTS (SELECT 1 " +
      "                              FROM AD_MODULE_INSTALL" +
      "                             WHERE AD_MODULE_ID = M.AD_MODULE_ID)" +
      "          UNION" +
      "          SELECT JAVAPACKAGE AS NAME" +
      "           FROM AD_MODULE_INSTALL         ";

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
        ApplyModulesData objectApplyModulesData = new ApplyModulesData();
        objectApplyModulesData.name = UtilSql.getValue(result, "name");
        objectApplyModulesData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectApplyModulesData);
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
    ApplyModulesData objectApplyModulesData[] = new ApplyModulesData[vector.size()];
    vector.copyInto(objectApplyModulesData);
    return(objectApplyModulesData);
  }

  public static boolean isUpdatingCoreOrTemplate(ConnectionProvider connectionProvider)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "         SELECT count(*) as NAME FROM" +
      "            ((SELECT 1  " +
      "                FROM AD_MODULE" +
      "                WHERE (STATUS='I' OR STATUS='P')      " +
      "               AND (AD_MODULE_ID = '0' OR TYPE='T'))" +
      "            UNION" +
      "            (SELECT 1" +
      "                FROM AD_MODULE_INSTALL" +
      "                WHERE (STATUS='I' OR STATUS='P')      " +
      "               AND (AD_MODULE_ID = '0' OR TYPE='T'))) q";

    ResultSet result;
    boolean boolReturn = false;
    PreparedStatement st = null;

    try {
    st = connectionProvider.getPreparedStatement(strSql);

      result = st.executeQuery();
      if(result.next()) {
        boolReturn = !UtilSql.getValue(result, "name").equals("0");
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
    return(boolReturn);
  }

  public static boolean compileCompleteNeeded(ConnectionProvider connectionProvider)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "         SELECT count(*) as NAME" +
      "           FROM AD_MODULE" +
      "          WHERE ((STATUS='I' OR STATUS='P')      " +
      "                 AND TYPE = 'T')" +
      "             OR (STATUS='U')";

    ResultSet result;
    boolean boolReturn = false;
    PreparedStatement st = null;

    try {
    st = connectionProvider.getPreparedStatement(strSql);

      result = st.executeQuery();
      if(result.next()) {
        boolReturn = !UtilSql.getValue(result, "name").equals("0");
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
    return(boolReturn);
  }

  public static boolean selectUninstalledModules(ConnectionProvider connectionProvider)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "         SELECT count(*) as NAME" +
      "           FROM AD_MODULE" +
      "          WHERE STATUS='U'           ";

    ResultSet result;
    boolean boolReturn = false;
    PreparedStatement st = null;

    try {
    st = connectionProvider.getPreparedStatement(strSql);

      result = st.executeQuery();
      if(result.next()) {
        boolReturn = !UtilSql.getValue(result, "name").equals("0");
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
    return(boolReturn);
  }

  public static String getHelp(ConnectionProvider connectionProvider, String adLanguage)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "         SELECT COALESCE(T.HELP, P.HELP) AS NAME" +
      "           FROM AD_PROCESS P LEFT JOIN AD_PROCESS_TRL T " +
      "                                       ON T.AD_PROCESS_ID = P.AD_PROCESS_ID" +
      "                                      AND AD_LANGUAGE = ?" +
      "          WHERE P.AD_PROCESS_ID = 'BDB3B6FCA0AB453DB4E83503BAB82470'";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "name");
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
