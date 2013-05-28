//Sqlc generated V1.O00-1
package org.openbravo.erpCommon.businessUtility;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import java.util.*;

public class HeartbeatData implements FieldProvider {
static Logger log4j = Logger.getLogger(HeartbeatData.class);
  private String InitRecordNumber="0";
  public String systemIdentifier;
  public String isheartbeatactive;
  public String isproxyrequired;
  public String proxyServer;
  public String proxyPort;
  public String servletContainer;
  public String servletContainerVersion;
  public String webserver;
  public String webserverVersion;
  public String antVersion;
  public String obVersion;
  public String obInstallmode;
  public String codeRevision;
  public String postponeDate;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("system_identifier") || fieldName.equals("systemIdentifier"))
      return systemIdentifier;
    else if (fieldName.equalsIgnoreCase("isheartbeatactive"))
      return isheartbeatactive;
    else if (fieldName.equalsIgnoreCase("isproxyrequired"))
      return isproxyrequired;
    else if (fieldName.equalsIgnoreCase("proxy_server") || fieldName.equals("proxyServer"))
      return proxyServer;
    else if (fieldName.equalsIgnoreCase("proxy_port") || fieldName.equals("proxyPort"))
      return proxyPort;
    else if (fieldName.equalsIgnoreCase("servlet_container") || fieldName.equals("servletContainer"))
      return servletContainer;
    else if (fieldName.equalsIgnoreCase("servlet_container_version") || fieldName.equals("servletContainerVersion"))
      return servletContainerVersion;
    else if (fieldName.equalsIgnoreCase("webserver"))
      return webserver;
    else if (fieldName.equalsIgnoreCase("webserver_version") || fieldName.equals("webserverVersion"))
      return webserverVersion;
    else if (fieldName.equalsIgnoreCase("ant_version") || fieldName.equals("antVersion"))
      return antVersion;
    else if (fieldName.equalsIgnoreCase("ob_version") || fieldName.equals("obVersion"))
      return obVersion;
    else if (fieldName.equalsIgnoreCase("ob_installmode") || fieldName.equals("obInstallmode"))
      return obInstallmode;
    else if (fieldName.equalsIgnoreCase("code_revision") || fieldName.equals("codeRevision"))
      return codeRevision;
    else if (fieldName.equalsIgnoreCase("postpone_date") || fieldName.equals("postponeDate"))
      return postponeDate;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static HeartbeatData[] selectSystemProperties(ConnectionProvider connectionProvider)    throws ServletException {
    return selectSystemProperties(connectionProvider, 0, 0);
  }

  public static HeartbeatData[] selectSystemProperties(ConnectionProvider connectionProvider, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      	SELECT System_Identifier, Isheartbeatactive, Isproxyrequired, Proxy_Server, Proxy_Port, " +
      "      	Servlet_Container, Servlet_Container_Version, Webserver, Webserver_Version, " +
      "      	Ant_Version, OB_Version, OB_InstallMode, Code_Revision, Postpone_Date" +
      "      	FROM AD_System_Info";

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
        HeartbeatData objectHeartbeatData = new HeartbeatData();
        objectHeartbeatData.systemIdentifier = UtilSql.getValue(result, "system_identifier");
        objectHeartbeatData.isheartbeatactive = UtilSql.getValue(result, "isheartbeatactive");
        objectHeartbeatData.isproxyrequired = UtilSql.getValue(result, "isproxyrequired");
        objectHeartbeatData.proxyServer = UtilSql.getValue(result, "proxy_server");
        objectHeartbeatData.proxyPort = UtilSql.getValue(result, "proxy_port");
        objectHeartbeatData.servletContainer = UtilSql.getValue(result, "servlet_container");
        objectHeartbeatData.servletContainerVersion = UtilSql.getValue(result, "servlet_container_version");
        objectHeartbeatData.webserver = UtilSql.getValue(result, "webserver");
        objectHeartbeatData.webserverVersion = UtilSql.getValue(result, "webserver_version");
        objectHeartbeatData.antVersion = UtilSql.getValue(result, "ant_version");
        objectHeartbeatData.obVersion = UtilSql.getValue(result, "ob_version");
        objectHeartbeatData.obInstallmode = UtilSql.getValue(result, "ob_installmode");
        objectHeartbeatData.codeRevision = UtilSql.getValue(result, "code_revision");
        objectHeartbeatData.postponeDate = UtilSql.getDateValue(result, "postpone_date", "dd-MM-yyyy");
        objectHeartbeatData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectHeartbeatData);
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
    HeartbeatData objectHeartbeatData[] = new HeartbeatData[vector.size()];
    vector.copyInto(objectHeartbeatData);
    return(objectHeartbeatData);
  }
}
