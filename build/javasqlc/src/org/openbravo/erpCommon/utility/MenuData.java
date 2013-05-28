//Sqlc generated V1.O00-1
package org.openbravo.erpCommon.utility;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import java.util.*;

public class MenuData implements FieldProvider {
static Logger log4j = Logger.getLogger(MenuData.class);
  private String InitRecordNumber="0";
  public String nodeId;
  public String parentId;
  public String seqno;
  public String name;
  public String description;
  public String issummary;
  public String action;
  public String classname;
  public String mappingname;
  public String adWindowId;
  public String adProcessId;
  public String adFormId;
  public String url;
  public String isexternalservice;
  public String serviceType;
  public String windowmodule;
  public String tabmodule;
  public String windowpackage;
  public String tabpackage;
  public String windowname;
  public String tabname;
  public String adTabId;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("node_id") || fieldName.equals("nodeId"))
      return nodeId;
    else if (fieldName.equalsIgnoreCase("parent_id") || fieldName.equals("parentId"))
      return parentId;
    else if (fieldName.equalsIgnoreCase("seqno"))
      return seqno;
    else if (fieldName.equalsIgnoreCase("name"))
      return name;
    else if (fieldName.equalsIgnoreCase("description"))
      return description;
    else if (fieldName.equalsIgnoreCase("issummary"))
      return issummary;
    else if (fieldName.equalsIgnoreCase("action"))
      return action;
    else if (fieldName.equalsIgnoreCase("classname"))
      return classname;
    else if (fieldName.equalsIgnoreCase("mappingname"))
      return mappingname;
    else if (fieldName.equalsIgnoreCase("ad_window_id") || fieldName.equals("adWindowId"))
      return adWindowId;
    else if (fieldName.equalsIgnoreCase("ad_process_id") || fieldName.equals("adProcessId"))
      return adProcessId;
    else if (fieldName.equalsIgnoreCase("ad_form_id") || fieldName.equals("adFormId"))
      return adFormId;
    else if (fieldName.equalsIgnoreCase("url"))
      return url;
    else if (fieldName.equalsIgnoreCase("isexternalservice"))
      return isexternalservice;
    else if (fieldName.equalsIgnoreCase("service_type") || fieldName.equals("serviceType"))
      return serviceType;
    else if (fieldName.equalsIgnoreCase("windowmodule"))
      return windowmodule;
    else if (fieldName.equalsIgnoreCase("tabmodule"))
      return tabmodule;
    else if (fieldName.equalsIgnoreCase("windowpackage"))
      return windowpackage;
    else if (fieldName.equalsIgnoreCase("tabpackage"))
      return tabpackage;
    else if (fieldName.equalsIgnoreCase("windowname"))
      return windowname;
    else if (fieldName.equalsIgnoreCase("tabname"))
      return tabname;
    else if (fieldName.equalsIgnoreCase("ad_tab_id") || fieldName.equals("adTabId"))
      return adTabId;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static MenuData[] select(ConnectionProvider connectionProvider, String language, String roleId, String treeId)    throws ServletException {
    return select(connectionProvider, language, roleId, treeId, 0, 0);
  }

  public static MenuData[] select(ConnectionProvider connectionProvider, String language, String roleId, String treeId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT DISTINCT tn.Node_ID,tn.Parent_ID,tn.SeqNo,menuData.NAME,menuData.Description,menuData.IsSummary," +
      "        menuData.Action, (case menuData.Action when  'X' then MOX.CLASSNAME" +
      "                                              else MOP.CLASSNAME" +
      "                                              end) AS CLASSNAME, " +
      "        (case menuData.Action when 'X' then MOMX.MAPPINGNAME" +
      "                              else MOMP.MAPPINGNAME" +
      "                              end) AS MAPPINGNAME, " +
      "        menuData.AD_Window_ID," +
      "        menuData.AD_Process_ID," +
      "        menuData.AD_Form_ID," +
      "        menuData.url," +
      "        P.IsExternalService," +
      "        P.Service_Type," +
      "        MW.AD_Module_ID as windowModule, MT.AD_Module_ID as tabModule," +
      "        MW.JAVAPACKAGE as windowPackage, MT.JAVAPACKAGE as tabPackage," +
      "        AD_MAPPING_FORMAT(to_char(w.name)) as windowName, " +
      "        AD_MAPPING_FORMAT(to_char(t.name)) as tabName," +
      "        t.ad_tab_id" +
      "        FROM AD_TREENODE tn," +
      "        (SELECT m.AD_Menu_ID, COALESCE(m_t.NAME, m.NAME) AS NAME, COALESCE(m_t.DESCRIPTION, m.Description) AS DESCRIPTION, " +
      "        m.IsSummary,m.Action, m.AD_Window_ID, m.AD_Process_ID, " +
      "        m.AD_FORM_ID, m.url" +
      "        FROM AD_MENU m left join AD_MENU_TRL m_t on m.AD_MENU_ID = m_t.AD_MENU_ID " +
      "                                                AND m_t.AD_LANGUAGE = ?," +
      "             AD_MODULE mod" +
      "        WHERE m.IsActive='Y'" +
      "        AND m.AD_Module_ID = mod.AD_Module_ID" +
      "        AND mod.Enabled='Y' " +
      "        AND (m.IsSummary='Y' OR m.Action='B' OR m.Action='L' OR m.Action='I'" +
      "        OR EXISTS (SELECT 1 FROM AD_WINDOW_ACCESS wa, AD_WINDOW w" +
      "                    WHERE wa.AD_Window_ID=m.AD_Window_ID" +
      "                      AND wa.AD_Window_ID=w.AD_Window_ID" +
      "                      AND w.isActive='Y' " +
      "                      AND wa.AD_Role_ID=?)" +
      "        OR EXISTS (SELECT 1 FROM AD_PROCESS_ACCESS wa, AD_Process p " +
      "                    WHERE wa.AD_Process_ID=m.AD_Process_ID" +
      "                      AND p.AD_Process_ID = wa.AD_Process_ID" +
      "                      AND p.isActive='Y' " +
      "                      AND wa.AD_Role_ID=?)" +
      "        OR EXISTS (SELECT 1 FROM AD_FORM_ACCESS wa, AD_Form f " +
      "                    WHERE wa.AD_Form_ID=m.AD_Form_ID" +
      "                      AND f.AD_Form_ID = wa.AD_Form_ID" +
      "                      AND f.isActive='Y' " +
      "                      AND wa.AD_Role_ID=?)" +
      "        )) menuData left join AD_TAB T on menuData.AD_Window_ID = T.AD_WINDOW_ID" +
      "                    left join AD_WINDOW W on menuData.AD_Window_ID = W.AD_WINDOW_ID" +
      "                    left join AD_MODULE MW on W.AD_MODULE_ID = MW.AD_MODULE_ID" +
      "                    left join AD_MODULE MT on T.AD_Module_ID = MT.AD_Module_ID" +
      "                    left join AD_PROCESS P on P.AD_Process_ID = menuData.AD_Process_ID " +
      "                    left join AD_MODEL_OBJECT MOX on menuData.AD_FORM_ID = MOX.AD_FORM_ID " +
      "                                                  AND MOX.ACTION   = 'X' " +
      "                                                  AND MOX.ISACTIVE = 'Y'" +
      "                                                  AND MOX.ISDEFAULT= 'Y'" +
      "                    left join AD_MODEL_OBJECT_MAPPING MOMX on MOX.AD_MODEL_OBJECT_ID = MOMX.AD_MODEL_OBJECT_ID " +
      "                                                  AND MOMX.ISACTIVE  = 'Y'" +
      "                                                  AND MOMX.ISDEFAULT = 'Y'" +
      "                    left join AD_MODEL_OBJECT MOP on menuData.AD_PROCESS_ID = MOP.AD_PROCESS_ID " +
      "                                                  AND MOP.ACTION IN ('P', 'R') " +
      "                                                  AND MOP.ISACTIVE = 'Y'" +
      "                                                  AND MOP.ISDEFAULT= 'Y'" +
      "                    left join AD_MODEL_OBJECT_MAPPING MOMP on MOP.AD_MODEL_OBJECT_ID = MOMP.AD_MODEL_OBJECT_ID" +
      "                                                  AND MOMP.ISACTIVE  = 'Y'" +
      "                                                  AND MOMP.ISDEFAULT = 'Y'" +
      "        WHERE tn.node_id = menuData.ad_menu_id" +
      "        AND (EXISTS(SELECT 1 FROM AD_TAB " +
      "        WHERE AD_TAB.isactive ='Y'AND AD_TAB.ad_window_id=T.ad_window_id " +
      "        GROUP BY AD_TAB.ad_window_id" +
      "        HAVING MIN(AD_TAB.seqno)=T.seqno)" +
      "        OR T.ad_tab_id is null)" +
      "        AND tn.ad_tree_id = ?" +
      "        AND tn.IsActive='Y'" +
      "        ORDER BY PARENT_ID, SEQNO";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, language);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, roleId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, roleId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, roleId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, treeId);

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
        MenuData objectMenuData = new MenuData();
        objectMenuData.nodeId = UtilSql.getValue(result, "node_id");
        objectMenuData.parentId = UtilSql.getValue(result, "parent_id");
        objectMenuData.seqno = UtilSql.getValue(result, "seqno");
        objectMenuData.name = UtilSql.getValue(result, "name");
        objectMenuData.description = UtilSql.getValue(result, "description");
        objectMenuData.issummary = UtilSql.getValue(result, "issummary");
        objectMenuData.action = UtilSql.getValue(result, "action");
        objectMenuData.classname = UtilSql.getValue(result, "classname");
        objectMenuData.mappingname = UtilSql.getValue(result, "mappingname");
        objectMenuData.adWindowId = UtilSql.getValue(result, "ad_window_id");
        objectMenuData.adProcessId = UtilSql.getValue(result, "ad_process_id");
        objectMenuData.adFormId = UtilSql.getValue(result, "ad_form_id");
        objectMenuData.url = UtilSql.getValue(result, "url");
        objectMenuData.isexternalservice = UtilSql.getValue(result, "isexternalservice");
        objectMenuData.serviceType = UtilSql.getValue(result, "service_type");
        objectMenuData.windowmodule = UtilSql.getValue(result, "windowmodule");
        objectMenuData.tabmodule = UtilSql.getValue(result, "tabmodule");
        objectMenuData.windowpackage = UtilSql.getValue(result, "windowpackage");
        objectMenuData.tabpackage = UtilSql.getValue(result, "tabpackage");
        objectMenuData.windowname = UtilSql.getValue(result, "windowname");
        objectMenuData.tabname = UtilSql.getValue(result, "tabname");
        objectMenuData.adTabId = UtilSql.getValue(result, "ad_tab_id");
        objectMenuData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectMenuData);
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
    MenuData objectMenuData[] = new MenuData[vector.size()];
    vector.copyInto(objectMenuData);
    return(objectMenuData);
  }

  public static MenuData[] selectData(ConnectionProvider connectionProvider, String language, String adWindowId, String adProcessId, String adFormId)    throws ServletException {
    return selectData(connectionProvider, language, adWindowId, adProcessId, adFormId, 0, 0);
  }

  public static MenuData[] selectData(ConnectionProvider connectionProvider, String language, String adWindowId, String adProcessId, String adFormId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT DISTINCT tn.Node_ID,tn.Parent_ID,tn.SeqNo,menuData.NAME,menuData.Description,menuData.IsSummary," +
      "        menuData.Action, (case menuData.Action when 'X' then MOX.CLASSNAME" +
      "                                        else MOP.CLASSNAME" +
      "                                        end) AS CLASSNAME, " +
      "        (case menuData.Action when 'X' then MOMX.MAPPINGNAME" +
      "                            else MOMP.MAPPINGNAME" +
      "                            end) AS MAPPINGNAME, " +
      "        menuData.AD_Process_ID, " +
      "        menuData.url " +
      "        FROM AD_TREENODE tn," +
      "        (SELECT m.AD_Menu_ID, COALESCE(m_t.NAME, m.NAME) AS NAME, COALESCE(m_t.DESCRIPTION, m.Description) AS DESCRIPTION, " +
      "                m.IsSummary,m.Action, m.AD_Window_ID, m.AD_Process_ID, " +
      "                m.AD_FORM_ID, m.url " +
      "           FROM AD_MENU m left join AD_MENU_TRL m_t on m.AD_MENU_ID = m_t.AD_MENU_ID  " +
      "                                                   AND m_t.AD_LANGUAGE = ?" +
      "          WHERE m.IsActive='Y'";
    strSql = strSql + ((adWindowId==null || adWindowId.equals(""))?"":"  AND m.AD_Window_ID = ?  ");
    strSql = strSql + ((adProcessId==null || adProcessId.equals(""))?"":"  AND m.AD_Process_ID = ?  ");
    strSql = strSql + ((adFormId==null || adFormId.equals(""))?"":"  AND m.AD_FORM_ID = ?  ");
    strSql = strSql + 
      "        ) menuData left join AD_WINDOW W on menuData.AD_Window_ID = W.AD_Window_ID" +
      "                   left join AD_TAB T on W.AD_Window_ID = T.AD_WINDOW_ID" +
      "                   left join AD_MODEL_OBJECT MOX on menuData.AD_FORM_ID = MOX.AD_FORM_ID" +
      "                                                AND MOX.ACTION   = 'X' " +
      "                                                AND MOX.ISACTIVE = 'Y'" +
      "                                                AND MOX.ISDEFAULT= 'Y'" +
      "                   left join AD_MODEL_OBJECT_MAPPING MOMX on MOX.AD_MODEL_OBJECT_ID = MOMX.AD_MODEL_OBJECT_ID " +
      "                                                AND MOMX.ISACTIVE = 'Y'" +
      "                                                AND MOMX.ISDEFAULT= 'Y'" +
      "                   left join AD_MODEL_OBJECT MOP on menuData.AD_PROCESS_ID = MOP.AD_PROCESS_ID " +
      "                                                AND MOP.ACTION IN ('P', 'R') " +
      "                                                AND MOP.ISACTIVE = 'Y'" +
      "                                                AND MOP.ISDEFAULT= 'Y'" +
      "                   left join AD_MODEL_OBJECT_MAPPING MOMP on MOP.AD_MODEL_OBJECT_ID = MOMP.AD_MODEL_OBJECT_ID " +
      "                                                AND MOMP.ISACTIVE  = 'Y'" +
      "                                                AND MOMP.ISDEFAULT = 'Y'" +
      "        WHERE tn.node_id = menuData.ad_menu_id " +
      "        AND (EXISTS(SELECT 1 FROM AD_TAB " +
      "        WHERE AD_TAB.isactive ='Y'" +
      "        GROUP BY AD_TAB.ad_window_id" +
      "        HAVING AD_TAB.ad_window_id=T.ad_window_id " +
      "        AND MIN(AD_TAB.seqno)=T.seqno)" +
      "        OR T.ad_tab_id is null)" +
      "        AND tn.IsActive='Y'";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, language);
      if (adWindowId != null && !(adWindowId.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, adWindowId);
      }
      if (adProcessId != null && !(adProcessId.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, adProcessId);
      }
      if (adFormId != null && !(adFormId.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, adFormId);
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
        MenuData objectMenuData = new MenuData();
        objectMenuData.nodeId = UtilSql.getValue(result, "node_id");
        objectMenuData.parentId = UtilSql.getValue(result, "parent_id");
        objectMenuData.seqno = UtilSql.getValue(result, "seqno");
        objectMenuData.name = UtilSql.getValue(result, "name");
        objectMenuData.description = UtilSql.getValue(result, "description");
        objectMenuData.issummary = UtilSql.getValue(result, "issummary");
        objectMenuData.action = UtilSql.getValue(result, "action");
        objectMenuData.classname = UtilSql.getValue(result, "classname");
        objectMenuData.mappingname = UtilSql.getValue(result, "mappingname");
        objectMenuData.adProcessId = UtilSql.getValue(result, "ad_process_id");
        objectMenuData.url = UtilSql.getValue(result, "url");
        objectMenuData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectMenuData);
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
    MenuData objectMenuData[] = new MenuData[vector.size()];
    vector.copyInto(objectMenuData);
    return(objectMenuData);
  }

  public static MenuData[] selectIdentificacion(ConnectionProvider connectionProvider, String strCliente)    throws ServletException {
    return selectIdentificacion(connectionProvider, strCliente, 0, 0);
  }

  public static MenuData[] selectIdentificacion(ConnectionProvider connectionProvider, String strCliente, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT t.AD_Tree_ID AS PARENT_ID, tn.Node_ID" +
      "        FROM AD_Tree t, AD_ClientInfo c, AD_TreeNode tn " +
      "        WHERE t.AD_Tree_ID=tn.AD_Tree_ID" +
      "        AND tn.Parent_ID IS NULL" +
      "        AND t.AD_Tree_ID=c.AD_Tree_Menu_ID" +
      "        AND c.AD_Client_ID=?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, strCliente);

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
        MenuData objectMenuData = new MenuData();
        objectMenuData.parentId = UtilSql.getValue(result, "parent_id");
        objectMenuData.nodeId = UtilSql.getValue(result, "node_id");
        objectMenuData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectMenuData);
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
    MenuData objectMenuData[] = new MenuData[vector.size()];
    vector.copyInto(objectMenuData);
    return(objectMenuData);
  }

  public static MenuData[] selectSearchs(ConnectionProvider connectionProvider, String adLanguage)    throws ServletException {
    return selectSearchs(connectionProvider, adLanguage, 0, 0);
  }

  public static MenuData[] selectSearchs(ConnectionProvider connectionProvider, String adLanguage, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT NODE_ID, NAME, DESCRIPTION, ClassName" +
      "        FROM (" +
      "        SELECT R.AD_REFERENCE_ID AS NODE_ID, COALESCE(RT.NAME, R.NAME) AS NAME, " +
      "        COALESCE(RT.DESCRIPTION, R.DESCRIPTION) AS DESCRIPTION, MOM.MAPPINGNAME AS CLASSNAME" +
      "        FROM AD_REFERENCE R left join AD_REFERENCE_TRL RT on R.AD_REFERENCE_ID = RT.AD_REFERENCE_ID " +
      "                                                          AND RT.AD_LANGUAGE = ? , " +
      "             AD_MODEL_OBJECT MO, AD_MODEL_OBJECT_MAPPING MOM" +
      "        WHERE R.AD_REFERENCE_ID = MO.AD_REFERENCE_ID" +
      "        AND MO.AD_MODEL_OBJECT_ID = MOM.AD_MODEL_OBJECT_ID " +
      "        AND MO.ACTION = 'S'" +
      "        AND MO.ISACTIVE = 'Y'" +
      "        AND MO.ISDEFAULT = 'Y'" +
      "        AND MOM.ISACTIVE = 'Y'" +
      "        AND MOM.ISDEFAULT = 'Y' " +
      "        ) AA" +
      "        ORDER BY NAME";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);

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
        MenuData objectMenuData = new MenuData();
        objectMenuData.nodeId = UtilSql.getValue(result, "node_id");
        objectMenuData.name = UtilSql.getValue(result, "name");
        objectMenuData.description = UtilSql.getValue(result, "description");
        objectMenuData.classname = UtilSql.getValue(result, "classname");
        objectMenuData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectMenuData);
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
    MenuData objectMenuData[] = new MenuData[vector.size()];
    vector.copyInto(objectMenuData);
    return(objectMenuData);
  }

  public static String getUserName(ConnectionProvider connectionProvider, String adUserId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT USERNAME" +
      "        FROM AD_USER " +
      "        WHERE AD_User_ID = ?";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "username");
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

  public static boolean isGenericJavaProcess(ConnectionProvider connectionProvider, String processId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT COUNT(*)" +
      "          FROM AD_PROCESS" +
      "          WHERE Ad_PROCESS_ID = ?" +
      "          AND UIPATTERN = 'S'" +
      "          AND ISJASPER = 'N' " +
      "          AND PROCEDURENAME IS NULL";

    ResultSet result;
    boolean boolReturn = false;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processId);

      result = st.executeQuery();
      if(result.next()) {
        boolReturn = !UtilSql.getValue(result, "count").equals("0");
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
}
