//Sqlc generated V1.O00-1
package org.openbravo.scheduling;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;

class ProcessData implements FieldProvider {
static Logger log4j = Logger.getLogger(ProcessData.class);
  private String InitRecordNumber="0";
  public String id;
  public String name;
  public String accesslevel;
  public String isuserstartable;
  public String procedurename;
  public String isreport;
  public String isdirectprint;
  public String classname;
  public String isbackground;
  public String isjasper;
  public String jrname;
  public String serviceType;
  public String isexternalservice;
  public String serviceSource;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("id"))
      return id;
    else if (fieldName.equalsIgnoreCase("name"))
      return name;
    else if (fieldName.equalsIgnoreCase("accesslevel"))
      return accesslevel;
    else if (fieldName.equalsIgnoreCase("isuserstartable"))
      return isuserstartable;
    else if (fieldName.equalsIgnoreCase("procedurename"))
      return procedurename;
    else if (fieldName.equalsIgnoreCase("isreport"))
      return isreport;
    else if (fieldName.equalsIgnoreCase("isdirectprint"))
      return isdirectprint;
    else if (fieldName.equalsIgnoreCase("classname"))
      return classname;
    else if (fieldName.equalsIgnoreCase("isbackground"))
      return isbackground;
    else if (fieldName.equalsIgnoreCase("isjasper"))
      return isjasper;
    else if (fieldName.equalsIgnoreCase("jrname"))
      return jrname;
    else if (fieldName.equalsIgnoreCase("service_type") || fieldName.equals("serviceType"))
      return serviceType;
    else if (fieldName.equalsIgnoreCase("isexternalservice"))
      return isexternalservice;
    else if (fieldName.equalsIgnoreCase("service_source") || fieldName.equals("serviceSource"))
      return serviceSource;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static ProcessData select(ConnectionProvider connectionProvider, String processId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      	SELECT p.AD_Process_ID as Id, p.Name, p.AccessLevel, p.IsUserStartable, p.ProcedureName, p.IsReport, p.IsDirectPrint, " +
      "         COALESCE(TO_CHAR(p.ClassName), TO_CHAR(mo.ClassName)) as ClassName, p.IsBackground, p.IsJasper, p.JRName, p.Service_Type, p.IsExternalService, p.Service_Source" +
      "         FROM AD_Process p LEFT JOIN AD_Model_Object mo on p.AD_Process_ID = mo.AD_Process_ID" +
      "        WHERE p.AD_Process_ID = ?";

    ResultSet result;
    ProcessData objectProcessData = new ProcessData();
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processId);

      result = st.executeQuery();
      if(result.next()) {
        objectProcessData.id = UtilSql.getValue(result, "id");
        objectProcessData.name = UtilSql.getValue(result, "name");
        objectProcessData.accesslevel = UtilSql.getValue(result, "accesslevel");
        objectProcessData.isuserstartable = UtilSql.getValue(result, "isuserstartable");
        objectProcessData.procedurename = UtilSql.getValue(result, "procedurename");
        objectProcessData.isreport = UtilSql.getValue(result, "isreport");
        objectProcessData.isdirectprint = UtilSql.getValue(result, "isdirectprint");
        objectProcessData.classname = UtilSql.getValue(result, "classname");
        objectProcessData.isbackground = UtilSql.getValue(result, "isbackground");
        objectProcessData.isjasper = UtilSql.getValue(result, "isjasper");
        objectProcessData.jrname = UtilSql.getValue(result, "jrname");
        objectProcessData.serviceType = UtilSql.getValue(result, "service_type");
        objectProcessData.isexternalservice = UtilSql.getValue(result, "isexternalservice");
        objectProcessData.serviceSource = UtilSql.getValue(result, "service_source");
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
    return(objectProcessData);
  }
}
