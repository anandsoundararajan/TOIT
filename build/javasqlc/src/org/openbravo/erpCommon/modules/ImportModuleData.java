//Sqlc generated V1.O00-1
package org.openbravo.erpCommon.modules;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import java.util.*;

class ImportModuleData implements FieldProvider {
static Logger log4j = Logger.getLogger(ImportModuleData.class);
  private String InitRecordNumber="0";
  public String adModuleId;
  public String version;
  public String name;
  public String total;
  public String javapackage;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("ad_module_id") || fieldName.equals("adModuleId"))
      return adModuleId;
    else if (fieldName.equalsIgnoreCase("version"))
      return version;
    else if (fieldName.equalsIgnoreCase("name"))
      return name;
    else if (fieldName.equalsIgnoreCase("total"))
      return total;
    else if (fieldName.equalsIgnoreCase("javapackage"))
      return javapackage;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static ImportModuleData[] selectInstalled(ConnectionProvider connectionProvider)    throws ServletException {
    return selectInstalled(connectionProvider, 0, 0);
  }

  public static ImportModuleData[] selectInstalled(ConnectionProvider connectionProvider, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT M.AD_MODULE_ID, " +
      "               COALESCE(MI.VERSION, M.VERSION) AS VERSION, " +
      "               COALESCE(MI.NAME, M.NAME) AS NAME, " +
      "               '' AS TOTAL, '' AS JAVAPACKAGE" +
      "         FROM AD_MODULE M LEFT JOIN AD_MODULE_INSTALL MI" +
      "                                 ON MI.AD_MODULE_ID = M.AD_MODULE_ID" +
      "        UNION" +
      "        SELECT M.AD_MODULE_ID, " +
      "               M.VERSION, " +
      "               M.NAME, " +
      "               '' AS TOTAL, '' AS JAVAPACKAGE" +
      "         FROM AD_MODULE_INSTALL M";

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
        ImportModuleData objectImportModuleData = new ImportModuleData();
        objectImportModuleData.adModuleId = UtilSql.getValue(result, "ad_module_id");
        objectImportModuleData.version = UtilSql.getValue(result, "version");
        objectImportModuleData.name = UtilSql.getValue(result, "name");
        objectImportModuleData.total = UtilSql.getValue(result, "total");
        objectImportModuleData.javapackage = UtilSql.getValue(result, "javapackage");
        objectImportModuleData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectImportModuleData);
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
    ImportModuleData objectImportModuleData[] = new ImportModuleData[vector.size()];
    vector.copyInto(objectImportModuleData);
    return(objectImportModuleData);
  }

  public static String selectVersion(ConnectionProvider connectionProvider, String adModuleId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT VERSION FROM AD_MODULE WHERE AD_MODULE_ID = ?";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adModuleId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "version");
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

  public static boolean existsVersion(ConnectionProvider connectionProvider, String moduleVersionNo, String updateVerID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT COUNT(*) AS TOTAL" +
      "          FROM AD_MODULE" +
      "         WHERE COALESCE(UPDATE_AVAILABLE,'.') = ?" +
      "           AND UPDATE_VER_ID = ?";

    ResultSet result;
    boolean boolReturn = false;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, moduleVersionNo);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updateVerID);

      result = st.executeQuery();
      if(result.next()) {
        boolReturn = !UtilSql.getValue(result, "total").equals("0");
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

  public static boolean moduleInstalled(ConnectionProvider connectionProvider, String moduleId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT COUNT(*) AS TOTAL" +
      "          FROM AD_MODULE" +
      "         WHERE AD_MODULE_ID = ?";

    ResultSet result;
    boolean boolReturn = false;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, moduleId);

      result = st.executeQuery();
      if(result.next()) {
        boolReturn = !UtilSql.getValue(result, "total").equals("0");
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

  public static int updateNewVersionAvailable(ConnectionProvider connectionProvider, String moduleVersionNo, String moduleVersionId, String updateInfo, String moduleId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        UPDATE AD_MODULE" +
      "           SET UPDATE_AVAILABLE = ?," +
      "               UPDATE_VER_ID = ?," +
      "               UPDATEINFO = ?" +
      "         WHERE AD_MODULE_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, moduleVersionNo);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, moduleVersionId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updateInfo);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, moduleId);

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

  public static int setModuleUpdated(ConnectionProvider connectionProvider, String moduleId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        UPDATE AD_MODULE" +
      "           SET UPDATE_AVAILABLE = null," +
      "               UPGRADE_AVAILABLE = null," +
      "               STATUS = 'I'           " +
      "         WHERE AD_MODULE_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, moduleId);

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

  public static String selectSeqNo(ConnectionProvider connectionProvider)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT MAX(COALESCE(SEQNO,0))" +
      "          FROM AD_MODULE";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    try {
    st = connectionProvider.getPreparedStatement(strSql);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "max");
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

  public static int insertLog(ConnectionProvider connectionProvider, String user, String moduleId, String moduleVersionId, String name, String log, String action)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        INSERT INTO AD_MODULE_LOG" +
      "              (AD_MODULE_LOG_ID, AD_CLIENT_ID, AD_ORG_ID," +
      "              ISACTIVE, CREATED, CREATEDBY," +
      "              UPDATED, UPDATEDBY, AD_MODULE_ID, " +
      "              AD_MODULE_VERSION_ID, MODULENAME, LOG, " +
      "              ACTION)" +
      "            VALUES" +
      "              (get_uuid(), '0', '0'," +
      "              'Y', now(), ?," +
      "              now(), ?, ?," +
      "              ?, ?, ?," +
      "              ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, user);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, user);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, moduleId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, moduleVersionId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, name);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, log);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, action);

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

  public static String getParentNode(ConnectionProvider connectionProvider, String moduleId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "       SELECT AD_MODULE_ID" +
      "         FROM AD_MODULE_DEPENDENCY" +
      "        WHERE AD_DEPENDENT_MODULE_ID = ?" +
      "          AND ISINCLUDED = 'Y'";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, moduleId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "ad_module_id");
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

  public static int insertModuleInstall(ConnectionProvider connectionProvider, String AD_MODULE_ID, String NAME, String VERSION, String DESCRIPTION, String HELP, String URL, String TYPE, String LICENSE, String ISINDEVELOPMENT, String ISDEFAULT, String SEQNO, String JAVAPACKAGE, String LICENSETYPE, String AUTHOR, String STATUS, String UPDATE_AVAILABLE, String ISTRANSLATIONREQUIRED, String AD_LANGUAGE, String HASCHARTOFACCOUNTS, String ISTRANSLATIONMODULE, String HASREFERENCEDATA, String ISREGISTERED, String UPDATEINFO, String UPDATE_VER_ID, String REFERENCEDATAINFO, String ISCONFIGSCRIPTAPPLIED)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "     INSERT INTO AD_Module_Install (" +
      "                AD_MODULE_INSTALL_ID , AD_CLIENT_ID         , AD_ORG_ID            ,                                                                                                                                                                          " +
      "                ISACTIVE             , CREATED              , CREATEDBY            ,                                                                                                                                                                          " +
      "                UPDATED              , UPDATEDBY            , AD_MODULE_ID         ,                                                                                                                                                                          " +
      "                NAME                 , VERSION              , DESCRIPTION          ,                                                                                                                                                                          " +
      "                HELP                 , URL                  , TYPE                 ,                                                                                                                                                                          " +
      "                LICENSE              , ISINDEVELOPMENT      , ISDEFAULT            ,                                                                                                                                                                          " +
      "                SEQNO                , JAVAPACKAGE          , LICENSETYPE          ,                                                                                                                                                                          " +
      "                AUTHOR               , STATUS               , UPDATE_AVAILABLE     ,                                                                                                                                                                          " +
      "                ISTRANSLATIONREQUIRED, AD_LANGUAGE          , HASCHARTOFACCOUNTS   ,                                                                                                                                                                          " +
      "                ISTRANSLATIONMODULE  , HASREFERENCEDATA     , ISREGISTERED         ,                                                                                                                                                                          " +
      "                UPDATEINFO           , UPDATE_VER_ID        , REFERENCEDATAINFO    ," +
      "                ENABLED, ISCONFIGSCRIPTAPPLIED) " +
      "       VALUES ( get_uuid(), '0', '0',                                                                                                                                                                          " +
      "                'Y', NOW(), '0',                                                                                                                                                                          " +
      "                NOW(), '0', ?,                                                                                                                                                                          " +
      "                ?, ?, ?,                                                                                                                                                                          " +
      "                ?, ?, ?,                                                                                                                                                                          " +
      "                ?, ?, ?,                                                                                                                                                                          " +
      "                to_number(?), ?, ?,                                                                                                                                                                          " +
      "                ?, ?, ?,                                                                                                                                                                          " +
      "                ?, ?, ?,                                                                                                                                                                          " +
      "                ?, ?, ?,                                                                                                                                                                          " +
      "                ?, ?, ?," +
      "                (COALESCE((SELECT ENABLED" +
      "                   FROM AD_MODULE " +
      "                  WHERE AD_MODULE_ID = ?),'Y')), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, AD_MODULE_ID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, NAME);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, VERSION);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, DESCRIPTION);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, HELP);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, URL);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, TYPE);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, LICENSE);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ISINDEVELOPMENT);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ISDEFAULT);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, SEQNO);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, JAVAPACKAGE);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, LICENSETYPE);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, AUTHOR);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, STATUS);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, UPDATE_AVAILABLE);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ISTRANSLATIONREQUIRED);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, AD_LANGUAGE);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, HASCHARTOFACCOUNTS);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ISTRANSLATIONMODULE);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, HASREFERENCEDATA);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ISREGISTERED);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, UPDATEINFO);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, UPDATE_VER_ID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, REFERENCEDATAINFO);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, AD_MODULE_ID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ISCONFIGSCRIPTAPPLIED);

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

  public static int insertModuleDBPrefixInstall(ConnectionProvider connectionProvider, String AD_MODULE_DBPREFIX_ID, String AD_MODULE_ID, String NAME)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "       INSERT INTO AD_MODULE_DBPREFIX_INSTALL" +
      "              (AD_MODULE_DBPREFIX_INSTALL_ID, AD_CLIENT_ID                 , AD_ORG_ID                    ,                                                                                                                                                                                " +
      "               ISACTIVE                     , CREATED                      , CREATEDBY                    ,                                                                                                                                                                                " +
      "               UPDATED                      , UPDATEDBY                    , AD_MODULE_DBPREFIX_ID        ,                                                                                                                                                                                " +
      "               AD_MODULE_ID                 , NAME)" +
      "      VALUES  (get_uuid(), '0', '0',                                                                                                                                                                                " +
      "               'Y', NOW(), '0',                                                                                                                                                                                " +
      "               NOW(), '0', ?,                                                                                                                                                                                " +
      "               ?, ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, AD_MODULE_DBPREFIX_ID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, AD_MODULE_ID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, NAME);

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

  public static int insertModuleDependencyInstall(ConnectionProvider connectionProvider, String AD_MODULE_DEPENDENCY_ID, String AD_MODULE_ID, String AD_DEPENDENT_MODULE_ID, String STARTVERSION, String ENDVERSION, String ISINCLUDED, String DEPENDANT_MODULE_NAME)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        INSERT INTO AD_MODULE_DEPENDENCY_INST" +
      "                (AD_MODULE_DEPENDENCY_INST_ID, AD_CLIENT_ID                , AD_ORG_ID                   ," +
      "                ISACTIVE                    , CREATED                     , CREATEDBY                   , " +
      "                UPDATED                     , UPDATEDBY                   , AD_MODULE_DEPENDENCY_ID     , " +
      "                AD_MODULE_ID                , AD_DEPENDENT_MODULE_ID      , STARTVERSION                , " +
      "                ENDVERSION                  , ISINCLUDED                  , DEPENDANT_MODULE_NAME) " +
      "        VALUES (GET_UUID(), '0', '0'," +
      "                'Y', NOW(), '0', " +
      "                NOW(), '0', ?, " +
      "                ?, ?, ?, " +
      "                ?, ?, ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, AD_MODULE_DEPENDENCY_ID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, AD_MODULE_ID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, AD_DEPENDENT_MODULE_ID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, STARTVERSION);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ENDVERSION);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ISINCLUDED);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, DEPENDANT_MODULE_NAME);

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

  public static int cleanModuleInstall(ConnectionProvider connectionProvider, String mouleId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "            DELETE FROM AD_MODULE_INSTALL" +
      "              WHERE AD_MODULE_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mouleId);

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

  public static int cleanModuleDBPrefixInstall(ConnectionProvider connectionProvider, String mouleId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "            DELETE FROM AD_MODULE_DBPREFIX_INSTALL" +
      "              WHERE AD_MODULE_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mouleId);

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

  public static int cleanModuleDependencyInstall(ConnectionProvider connectionProvider, String mouleId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "            DELETE FROM AD_MODULE_DEPENDENCY_INST" +
      "              WHERE AD_MODULE_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mouleId);

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

  public static ImportModuleData getModule(ConnectionProvider connectionProvider, String mouleId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "            SELECT JAVAPACKAGE, VERSION" +
      "              FROM AD_MODULE" +
      "             WHERE AD_MODULE_ID = ?";

    ResultSet result;
    ImportModuleData objectImportModuleData = new ImportModuleData();
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mouleId);

      result = st.executeQuery();
      if(result.next()) {
        objectImportModuleData.javapackage = UtilSql.getValue(result, "javapackage");
        objectImportModuleData.version = UtilSql.getValue(result, "version");
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
    return(objectImportModuleData);
  }
}
