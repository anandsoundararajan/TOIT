//Sqlc generated V1.O00-1
package org.openbravo.erpCommon.ad_help;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import java.util.*;

class DisplayHelpEditElementData implements FieldProvider {
static Logger log4j = Logger.getLogger(DisplayHelpEditElementData.class);
  private String InitRecordNumber="0";
  public String id;
  public String originalname;
  public String name;
  public String help;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("id"))
      return id;
    else if (fieldName.equalsIgnoreCase("originalname"))
      return originalname;
    else if (fieldName.equalsIgnoreCase("name"))
      return name;
    else if (fieldName.equalsIgnoreCase("help"))
      return help;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static DisplayHelpEditElementData[] select(ConnectionProvider connectionProvider, String id)    throws ServletException {
    return select(connectionProvider, id, 0, 0);
  }

  public static DisplayHelpEditElementData[] select(ConnectionProvider connectionProvider, String id, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT AD_WINDOW_ID AS ID, NAME AS ORIGINALNAME, NAME, HELP" +
      "        FROM AD_WINDOW" +
      "        WHERE AD_WINDOW_ID = ?" +
      "        AND ISACTIVE='Y'";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, id);

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
        DisplayHelpEditElementData objectDisplayHelpEditElementData = new DisplayHelpEditElementData();
        objectDisplayHelpEditElementData.id = UtilSql.getValue(result, "id");
        objectDisplayHelpEditElementData.originalname = UtilSql.getValue(result, "originalname");
        objectDisplayHelpEditElementData.name = UtilSql.getValue(result, "name");
        objectDisplayHelpEditElementData.help = UtilSql.getValue(result, "help");
        objectDisplayHelpEditElementData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectDisplayHelpEditElementData);
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
    DisplayHelpEditElementData objectDisplayHelpEditElementData[] = new DisplayHelpEditElementData[vector.size()];
    vector.copyInto(objectDisplayHelpEditElementData);
    return(objectDisplayHelpEditElementData);
  }

  public static DisplayHelpEditElementData[] selectTrl(ConnectionProvider connectionProvider, String adLanguage, String id)    throws ServletException {
    return selectTrl(connectionProvider, adLanguage, id, 0, 0);
  }

  public static DisplayHelpEditElementData[] selectTrl(ConnectionProvider connectionProvider, String adLanguage, String id, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT AD_WINDOW.AD_WINDOW_ID AS ID, AD_WINDOW.NAME AS ORIGINALNAME, " +
      "        (CASE WHEN AD_WINDOW_TRL.NAME IS NULL THEN '*' || AD_WINDOW.NAME ELSE AD_WINDOW_TRL.NAME END) AS NAME, AD_WINDOW_TRL.HELP" +
      "        FROM AD_WINDOW left join AD_WINDOW_TRL on AD_WINDOW.AD_WINDOW_ID = AD_WINDOW_TRL.AD_WINDOW_ID" +
      "                                              AND AD_WINDOW_TRL.AD_LANGUAGE = ?" +
      "        WHERE AD_WINDOW.AD_WINDOW_ID = ?" +
      "        AND AD_WINDOW.ISACTIVE= 'Y'        ";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, id);

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
        DisplayHelpEditElementData objectDisplayHelpEditElementData = new DisplayHelpEditElementData();
        objectDisplayHelpEditElementData.id = UtilSql.getValue(result, "id");
        objectDisplayHelpEditElementData.originalname = UtilSql.getValue(result, "originalname");
        objectDisplayHelpEditElementData.name = UtilSql.getValue(result, "name");
        objectDisplayHelpEditElementData.help = UtilSql.getValue(result, "help");
        objectDisplayHelpEditElementData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectDisplayHelpEditElementData);
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
    DisplayHelpEditElementData objectDisplayHelpEditElementData[] = new DisplayHelpEditElementData[vector.size()];
    vector.copyInto(objectDisplayHelpEditElementData);
    return(objectDisplayHelpEditElementData);
  }

  public static DisplayHelpEditElementData[] selectTab(ConnectionProvider connectionProvider, String id)    throws ServletException {
    return selectTab(connectionProvider, id, 0, 0);
  }

  public static DisplayHelpEditElementData[] selectTab(ConnectionProvider connectionProvider, String id, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT AD_TAB_ID AS ID, NAME AS ORIGINALNAME, NAME, HELP" +
      "        FROM AD_TAB" +
      "        WHERE AD_TAB_ID = ?" +
      "        AND ISACTIVE='Y'";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, id);

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
        DisplayHelpEditElementData objectDisplayHelpEditElementData = new DisplayHelpEditElementData();
        objectDisplayHelpEditElementData.id = UtilSql.getValue(result, "id");
        objectDisplayHelpEditElementData.originalname = UtilSql.getValue(result, "originalname");
        objectDisplayHelpEditElementData.name = UtilSql.getValue(result, "name");
        objectDisplayHelpEditElementData.help = UtilSql.getValue(result, "help");
        objectDisplayHelpEditElementData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectDisplayHelpEditElementData);
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
    DisplayHelpEditElementData objectDisplayHelpEditElementData[] = new DisplayHelpEditElementData[vector.size()];
    vector.copyInto(objectDisplayHelpEditElementData);
    return(objectDisplayHelpEditElementData);
  }

  public static DisplayHelpEditElementData[] selectTabTrl(ConnectionProvider connectionProvider, String adLanguage, String id)    throws ServletException {
    return selectTabTrl(connectionProvider, adLanguage, id, 0, 0);
  }

  public static DisplayHelpEditElementData[] selectTabTrl(ConnectionProvider connectionProvider, String adLanguage, String id, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT AD_TAB.AD_TAB_ID AS ID, AD_TAB.NAME AS ORIGINALNAME, " +
      "        (CASE WHEN AD_TAB_TRL.NAME IS NULL THEN '*' || AD_TAB.NAME ELSE AD_TAB_TRL.NAME END) AS NAME, AD_TAB_TRL.HELP" +
      "        FROM AD_TAB left join AD_TAB_TRL on AD_TAB.AD_TAB_ID = AD_TAB_TRL.AD_TAB_ID " +
      "                                        AND AD_TAB_TRL.AD_LANGUAGE =?" +
      "        WHERE AD_TAB.AD_TAB_ID = ?" +
      "        AND AD_TAB.ISACTIVE = 'Y'";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, id);

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
        DisplayHelpEditElementData objectDisplayHelpEditElementData = new DisplayHelpEditElementData();
        objectDisplayHelpEditElementData.id = UtilSql.getValue(result, "id");
        objectDisplayHelpEditElementData.originalname = UtilSql.getValue(result, "originalname");
        objectDisplayHelpEditElementData.name = UtilSql.getValue(result, "name");
        objectDisplayHelpEditElementData.help = UtilSql.getValue(result, "help");
        objectDisplayHelpEditElementData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectDisplayHelpEditElementData);
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
    DisplayHelpEditElementData objectDisplayHelpEditElementData[] = new DisplayHelpEditElementData[vector.size()];
    vector.copyInto(objectDisplayHelpEditElementData);
    return(objectDisplayHelpEditElementData);
  }

  public static DisplayHelpEditElementData[] selectField(ConnectionProvider connectionProvider, String id)    throws ServletException {
    return selectField(connectionProvider, id, 0, 0);
  }

  public static DisplayHelpEditElementData[] selectField(ConnectionProvider connectionProvider, String id, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT AD_FIELD_ID AS ID, NAME AS ORIGINALNAME, NAME, HELP" +
      "        FROM AD_FIELD" +
      "        WHERE AD_FIELD_ID = ? " +
      "        AND ISACTIVE='Y'";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, id);

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
        DisplayHelpEditElementData objectDisplayHelpEditElementData = new DisplayHelpEditElementData();
        objectDisplayHelpEditElementData.id = UtilSql.getValue(result, "id");
        objectDisplayHelpEditElementData.originalname = UtilSql.getValue(result, "originalname");
        objectDisplayHelpEditElementData.name = UtilSql.getValue(result, "name");
        objectDisplayHelpEditElementData.help = UtilSql.getValue(result, "help");
        objectDisplayHelpEditElementData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectDisplayHelpEditElementData);
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
    DisplayHelpEditElementData objectDisplayHelpEditElementData[] = new DisplayHelpEditElementData[vector.size()];
    vector.copyInto(objectDisplayHelpEditElementData);
    return(objectDisplayHelpEditElementData);
  }

  public static DisplayHelpEditElementData[] selectFieldTrl(ConnectionProvider connectionProvider, String adLanguage, String id)    throws ServletException {
    return selectFieldTrl(connectionProvider, adLanguage, id, 0, 0);
  }

  public static DisplayHelpEditElementData[] selectFieldTrl(ConnectionProvider connectionProvider, String adLanguage, String id, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT AD_FIELD.AD_FIELD_ID AS ID, AD_FIELD.NAME AS ORIGINALNAME, " +
      "        (CASE WHEN AD_FIELD_TRL.NAME IS NULL THEN '*' || AD_FIELD.NAME ELSE AD_FIELD_TRL.NAME END) AS NAME, AD_FIELD_TRL.HELP" +
      "        FROM AD_FIELD left join AD_FIELD_TRL on AD_FIELD.AD_FIELD_ID = AD_FIELD_TRL.AD_FIELD_ID " +
      "                                            AND AD_FIELD_TRL.AD_LANGUAGE = ?" +
      "        WHERE AD_FIELD.AD_FIELD_ID = ?" +
      "        AND AD_FIELD.ISACTIVE='Y'";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, id);

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
        DisplayHelpEditElementData objectDisplayHelpEditElementData = new DisplayHelpEditElementData();
        objectDisplayHelpEditElementData.id = UtilSql.getValue(result, "id");
        objectDisplayHelpEditElementData.originalname = UtilSql.getValue(result, "originalname");
        objectDisplayHelpEditElementData.name = UtilSql.getValue(result, "name");
        objectDisplayHelpEditElementData.help = UtilSql.getValue(result, "help");
        objectDisplayHelpEditElementData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectDisplayHelpEditElementData);
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
    DisplayHelpEditElementData objectDisplayHelpEditElementData[] = new DisplayHelpEditElementData[vector.size()];
    vector.copyInto(objectDisplayHelpEditElementData);
    return(objectDisplayHelpEditElementData);
  }

  public static DisplayHelpEditElementData[] selectElement(ConnectionProvider connectionProvider, String id)    throws ServletException {
    return selectElement(connectionProvider, id, 0, 0);
  }

  public static DisplayHelpEditElementData[] selectElement(ConnectionProvider connectionProvider, String id, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT AD_ELEMENT_ID AS ID, NAME AS ORIGINALNAME, NAME, HELP" +
      "        FROM AD_ELEMENT" +
      "        WHERE AD_ELEMENT_ID = ? " +
      "        AND ISACTIVE='Y'";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, id);

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
        DisplayHelpEditElementData objectDisplayHelpEditElementData = new DisplayHelpEditElementData();
        objectDisplayHelpEditElementData.id = UtilSql.getValue(result, "id");
        objectDisplayHelpEditElementData.originalname = UtilSql.getValue(result, "originalname");
        objectDisplayHelpEditElementData.name = UtilSql.getValue(result, "name");
        objectDisplayHelpEditElementData.help = UtilSql.getValue(result, "help");
        objectDisplayHelpEditElementData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectDisplayHelpEditElementData);
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
    DisplayHelpEditElementData objectDisplayHelpEditElementData[] = new DisplayHelpEditElementData[vector.size()];
    vector.copyInto(objectDisplayHelpEditElementData);
    return(objectDisplayHelpEditElementData);
  }

  public static DisplayHelpEditElementData[] selectElementTrl(ConnectionProvider connectionProvider, String adLanguage, String id)    throws ServletException {
    return selectElementTrl(connectionProvider, adLanguage, id, 0, 0);
  }

  public static DisplayHelpEditElementData[] selectElementTrl(ConnectionProvider connectionProvider, String adLanguage, String id, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT AD_ELEMENT.AD_ELEMENT_ID AS ID, AD_ELEMENT.NAME AS ORIGINALNAME, " +
      "        (CASE WHEN AD_ELEMENT_TRL.NAME IS NULL THEN '*' || AD_ELEMENT.NAME ELSE AD_ELEMENT_TRL.NAME END) AS NAME, AD_ELEMENT_TRL.HELP" +
      "        FROM AD_ELEMENT left join AD_ELEMENT_TRL on AD_ELEMENT.AD_ELEMENT_ID = AD_ELEMENT_TRL.AD_ELEMENT_ID " +
      "                                                AND AD_ELEMENT_TRL.AD_LANGUAGE = ?" +
      "        WHERE AD_ELEMENT.AD_ELEMENT_ID = ?" +
      "        AND AD_ELEMENT.ISACTIVE='Y'";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, id);

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
        DisplayHelpEditElementData objectDisplayHelpEditElementData = new DisplayHelpEditElementData();
        objectDisplayHelpEditElementData.id = UtilSql.getValue(result, "id");
        objectDisplayHelpEditElementData.originalname = UtilSql.getValue(result, "originalname");
        objectDisplayHelpEditElementData.name = UtilSql.getValue(result, "name");
        objectDisplayHelpEditElementData.help = UtilSql.getValue(result, "help");
        objectDisplayHelpEditElementData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectDisplayHelpEditElementData);
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
    DisplayHelpEditElementData objectDisplayHelpEditElementData[] = new DisplayHelpEditElementData[vector.size()];
    vector.copyInto(objectDisplayHelpEditElementData);
    return(objectDisplayHelpEditElementData);
  }

  public static int update(ConnectionProvider connectionProvider, String name, String help, String id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        UPDATE AD_WINDOW SET NAME=?, HELP=? WHERE AD_WINDOW_ID=?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, name);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, help);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, id);

      updateCount = st.executeUpdate();
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
    return(updateCount);
  }

  public static int updateTrl(ConnectionProvider connectionProvider, String name, String help, String adUser, String id, String adLanguage)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        UPDATE AD_WINDOW_TRL SET NAME=?, HELP=?, updated=now(), updatEDBY = ? WHERE AD_WINDOW_ID=? AND AD_LANGUAGE=?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, name);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, help);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUser);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, id);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);

      updateCount = st.executeUpdate();
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
    return(updateCount);
  }

  public static int updateTab(ConnectionProvider connectionProvider, String name, String help, String id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        UPDATE AD_TAB SET NAME=?, HELP=? WHERE AD_TAB_ID=?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, name);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, help);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, id);

      updateCount = st.executeUpdate();
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
    return(updateCount);
  }

  public static int updateTabTrl(ConnectionProvider connectionProvider, String name, String help, String adUser, String id, String adLanguage)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        UPDATE AD_TAB_TRL SET NAME=?, HELP=?, updated=now(), updatEDBY = ? WHERE AD_TAB_ID=? AND AD_LANGUAGE=?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, name);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, help);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUser);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, id);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);

      updateCount = st.executeUpdate();
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
    return(updateCount);
  }

  public static int updateField(ConnectionProvider connectionProvider, String name, String help, String id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        UPDATE AD_FIELD SET NAME=?, HELP=? WHERE AD_FIELD_ID=?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, name);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, help);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, id);

      updateCount = st.executeUpdate();
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
    return(updateCount);
  }

  public static int updateFieldTrl(ConnectionProvider connectionProvider, String name, String help, String adUser, String id, String adLanguage)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        UPDATE AD_FIELD_TRL SET NAME=?, HELP=?, updated=now(), updatEDBY = ? WHERE AD_FIELD_ID=? AND AD_LANGUAGE=?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, name);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, help);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUser);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, id);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);

      updateCount = st.executeUpdate();
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
    return(updateCount);
  }

  public static int updateElement(ConnectionProvider connectionProvider, String name, String help, String id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        UPDATE AD_ELEMENT SET NAME=?, HELP=? WHERE AD_ELEMENT_ID=?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, name);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, help);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, id);

      updateCount = st.executeUpdate();
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
    return(updateCount);
  }

  public static int updateElementTrl(ConnectionProvider connectionProvider, String name, String help, String adUser, String id, String adLanguage)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        UPDATE AD_ELEMENT_TRL SET NAME=?, HELP=?, updated=now(), updatEDBY = ? WHERE AD_ELEMENT_ID=? AND AD_LANGUAGE=?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, name);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, help);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUser);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, id);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);

      updateCount = st.executeUpdate();
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
    return(updateCount);
  }

  public static int insertTrl(ConnectionProvider connectionProvider, String adWindowId, String adLanguage, String adClientId, String adOrgId, String adUser, String name, String help)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        INSERT INTO AD_WINDOW_TRL (AD_WINDOW_TRL_ID, AD_WINDOW_ID, AD_LANGUAGE, AD_CLIENT_ID, AD_ORG_ID, ISACTIVE, CREATED, CREATEDBY, UPDATED, UPDATEDBY, NAME, DESCRIPTION, HELP, ISTRANSLATED)" +
      "        VALUES (get_uuid(), ?, ?, ?, ?, 'Y', now(), ?, now(), ?, ?, NULL, ?, 'Y')";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adWindowId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUser);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUser);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, name);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, help);

      updateCount = st.executeUpdate();
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
    return(updateCount);
  }

  public static int insertTabTrl(ConnectionProvider connectionProvider, String adTabId, String adLanguage, String adClientId, String adOrgId, String adUser, String name, String help)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        INSERT INTO AD_TAB_TRL (AD_TAB_TRL_ID, AD_TAB_ID, AD_LANGUAGE, AD_CLIENT_ID, AD_ORG_ID, ISACTIVE, CREATED, CREATEDBY, UPDATED, UPDATEDBY, NAME, DESCRIPTION, HELP, ISTRANSLATED) " +
      "        VALUES (get_uuid(), ?, ?, ?, ?, 'Y', now(), ?, now(), ?, ?, NULL, ?, 'Y')";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adTabId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUser);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUser);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, name);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, help);

      updateCount = st.executeUpdate();
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
    return(updateCount);
  }

  public static int insertFieldTrl(ConnectionProvider connectionProvider, String adFieldId, String adLanguage, String adClientId, String adOrgId, String adUser, String name, String help)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        INSERT INTO AD_FIELD_TRL (AD_FIELD_TRL_ID, AD_FIELD_ID, AD_LANGUAGE, AD_CLIENT_ID, AD_ORG_ID, ISACTIVE, CREATED, CREATEDBY, UPDATED, UPDATEDBY, NAME, DESCRIPTION, HELP, ISTRANSLATED) " +
      "        VALUES (get_uuid(), ?, ?, ?, ?, 'Y', now(), ?, now(), ?, ?, NULL, ?, 'Y')";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adFieldId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUser);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUser);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, name);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, help);

      updateCount = st.executeUpdate();
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
    return(updateCount);
  }

  public static int insertElementTrl(ConnectionProvider connectionProvider, String adFieldId, String adLanguage, String adClientId, String adOrgId, String adUser, String name, String help)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        INSERT INTO AD_ELEMENT_TRL (AD_ELEMENT_TRL_ID, AD_ELEMENT_ID, AD_LANGUAGE, AD_CLIENT_ID, AD_ORG_ID, ISACTIVE, CREATED, CREATEDBY, UPDATED, UPDATEDBY, NAME, DESCRIPTION, HELP, ISTRANSLATED) " +
      "        VALUES (get_uuid(), ?, ?, ?, ?, 'Y', now(), ?, now(), ?, ?, NULL, ?, 'Y')";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adFieldId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUser);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUser);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, name);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, help);

      updateCount = st.executeUpdate();
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
    return(updateCount);
  }
}
