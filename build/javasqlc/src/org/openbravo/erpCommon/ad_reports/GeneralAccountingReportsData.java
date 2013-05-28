//Sqlc generated V1.O00-1
package org.openbravo.erpCommon.ad_reports;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import java.util.*;

class GeneralAccountingReportsData implements FieldProvider {
static Logger log4j = Logger.getLogger(GeneralAccountingReportsData.class);
  private String InitRecordNumber="0";
  public String id;
  public String name;
  public String isbalanced;
  public String pagebreak;
  public String padre;
  public String begining;
  public String end;
  public String previousYear;
  public String previousYearId;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("id"))
      return id;
    else if (fieldName.equalsIgnoreCase("name"))
      return name;
    else if (fieldName.equalsIgnoreCase("isbalanced"))
      return isbalanced;
    else if (fieldName.equals("pagebreak"))
      return pagebreak;
    else if (fieldName.equals("padre"))
      return padre;
    else if (fieldName.equals("begining"))
      return begining;
    else if (fieldName.equals("end"))
      return end;
    else if (fieldName.equals("previousYear"))
      return previousYear;
    else if (fieldName.equals("previousYearId"))
      return previousYearId;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static GeneralAccountingReportsData[] selectRpt(ConnectionProvider connectionProvider, String org, String client, String acctschema)    throws ServletException {
    return selectRpt(connectionProvider, org, client, acctschema, 0, 0);
  }

  public static GeneralAccountingReportsData[] selectRpt(ConnectionProvider connectionProvider, String org, String client, String acctschema, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "		SELECT COALESCE(REPORTTYPE,'N') || C_ACCT_RPT_ID AS ID, NAME, ISORGBALANCED AS ISBALANCED" +
      "		FROM C_ACCT_RPT" +
      "		WHERE AD_ORG_ID IN (";
    strSql = strSql + ((org==null || org.equals(""))?"":org);
    strSql = strSql + 
      ")" +
      "		AND AD_CLIENT_ID IN (";
    strSql = strSql + ((client==null || client.equals(""))?"":client);
    strSql = strSql + 
      ")" +
      "		AND 1=1";
    strSql = strSql + ((acctschema==null || acctschema.equals(""))?"":"  AND C_ACCT_RPT.C_ACCTSCHEMA_ID = ? ");
    strSql = strSql + 
      "		ORDER BY NAME";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      if (org != null && !(org.equals(""))) {
        }
      if (client != null && !(client.equals(""))) {
        }
      if (acctschema != null && !(acctschema.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, acctschema);
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
        GeneralAccountingReportsData objectGeneralAccountingReportsData = new GeneralAccountingReportsData();
        objectGeneralAccountingReportsData.id = UtilSql.getValue(result, "id");
        objectGeneralAccountingReportsData.name = UtilSql.getValue(result, "name");
        objectGeneralAccountingReportsData.isbalanced = UtilSql.getValue(result, "isbalanced");
        objectGeneralAccountingReportsData.pagebreak = "";
        objectGeneralAccountingReportsData.padre = "";
        objectGeneralAccountingReportsData.begining = "";
        objectGeneralAccountingReportsData.end = "";
        objectGeneralAccountingReportsData.previousYear = "";
        objectGeneralAccountingReportsData.previousYearId = "";
        objectGeneralAccountingReportsData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectGeneralAccountingReportsData);
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
    GeneralAccountingReportsData objectGeneralAccountingReportsData[] = new GeneralAccountingReportsData[vector.size()];
    vector.copyInto(objectGeneralAccountingReportsData);
    return(objectGeneralAccountingReportsData);
  }

  public static GeneralAccountingReportsData[] selectRptDouble(ConnectionProvider connectionProvider)    throws ServletException {
    return selectRptDouble(connectionProvider, 0, 0);
  }

  public static GeneralAccountingReportsData[] selectRptDouble(ConnectionProvider connectionProvider, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "		SELECT C_ACCT_RPT.C_ACCTSCHEMA_ID AS PADRE, COALESCE(REPORTTYPE,'N') || C_ACCT_RPT.C_ACCT_RPT_ID AS ID, C_ACCT_RPT.NAME AS NAME " +
      "		FROM C_ACCT_RPT" +
      "		WHERE C_ACCT_RPT.ISACTIVE = 'Y'" +
      "		ORDER BY NAME";

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
        GeneralAccountingReportsData objectGeneralAccountingReportsData = new GeneralAccountingReportsData();
        objectGeneralAccountingReportsData.padre = UtilSql.getValue(result, "padre");
        objectGeneralAccountingReportsData.id = UtilSql.getValue(result, "id");
        objectGeneralAccountingReportsData.name = UtilSql.getValue(result, "name");
        objectGeneralAccountingReportsData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectGeneralAccountingReportsData);
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
    GeneralAccountingReportsData objectGeneralAccountingReportsData[] = new GeneralAccountingReportsData[vector.size()];
    vector.copyInto(objectGeneralAccountingReportsData);
    return(objectGeneralAccountingReportsData);
  }

  public static GeneralAccountingReportsData[] selectGroups(ConnectionProvider connectionProvider, String rpt)    throws ServletException {
    return selectGroups(connectionProvider, rpt, 0, 0);
  }

  public static GeneralAccountingReportsData[] selectGroups(ConnectionProvider connectionProvider, String rpt, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT C_ACCT_RPT_GROUP_ID AS ID, name, 'page' as pagebreak" +
      "        FROM C_ACCT_RPT_GROUP" +
      "        WHERE C_ACCT_RPT_ID = ?" +
      "        ORDER BY LINE";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, rpt);

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
        GeneralAccountingReportsData objectGeneralAccountingReportsData = new GeneralAccountingReportsData();
        objectGeneralAccountingReportsData.id = UtilSql.getValue(result, "id");
        objectGeneralAccountingReportsData.name = UtilSql.getValue(result, "name");
        objectGeneralAccountingReportsData.pagebreak = UtilSql.getValue(result, "pagebreak");
        objectGeneralAccountingReportsData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectGeneralAccountingReportsData);
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
    GeneralAccountingReportsData objectGeneralAccountingReportsData[] = new GeneralAccountingReportsData[vector.size()];
    vector.copyInto(objectGeneralAccountingReportsData);
    return(objectGeneralAccountingReportsData);
  }

  public static GeneralAccountingReportsData[] selectElements(ConnectionProvider connectionProvider, String grp)    throws ServletException {
    return selectElements(connectionProvider, grp, 0, 0);
  }

  public static GeneralAccountingReportsData[] selectElements(ConnectionProvider connectionProvider, String grp, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT c_elementvalue_id AS ID" +
      "        FROM C_ACCT_RPT_NODE" +
      "        WHERE C_ACCT_RPT_GROUP_ID = ?" +
      "        ORDER BY LINE";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, grp);

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
        GeneralAccountingReportsData objectGeneralAccountingReportsData = new GeneralAccountingReportsData();
        objectGeneralAccountingReportsData.id = UtilSql.getValue(result, "id");
        objectGeneralAccountingReportsData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectGeneralAccountingReportsData);
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
    GeneralAccountingReportsData objectGeneralAccountingReportsData[] = new GeneralAccountingReportsData[vector.size()];
    vector.copyInto(objectGeneralAccountingReportsData);
    return(objectGeneralAccountingReportsData);
  }

  public static String groupTitle(ConnectionProvider connectionProvider, String grp)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT name" +
      "        FROM C_ACCT_RPT_GROUP" +
      "        WHERE C_ACCT_RPT_GROUP_ID = ?";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, grp);

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

  public static String rptTitle(ConnectionProvider connectionProvider, String rpt)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT name" +
      "        FROM C_ACCT_RPT" +
      "        WHERE C_ACCT_RPT_ID = ?";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, rpt);

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

  public static String fieldtitle(ConnectionProvider connectionProvider, String cElementvalueId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT m.Name " +
      "        FROM C_ElementValue m" +
      "        WHERE m.C_ElementValue_ID = ?";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cElementvalueId);

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

  public static String fieldtitleTrl(ConnectionProvider connectionProvider, String adLanguage, String cElementvalueId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT COALESCE(mt.Name, m.Name) AS NAME " +
      "        FROM C_ElementValue m left join C_ElementValue_Trl mt on m.C_ElementValue_ID = mt.C_ElementValue_ID " +
      "                                                             AND mt.AD_Language  = ?" +
      "        WHERE m.C_ElementValue_ID = ? ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cElementvalueId);

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

  public static String selectElement(ConnectionProvider connectionProvider, String cElementvalueId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT m.AccountType " +
      "        FROM C_ElementValue m" +
      "        WHERE m.C_ElementValue_ID = ?";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cElementvalueId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "accounttype");
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

  public static String treeOrg(ConnectionProvider connectionProvider, String client)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT AD_TREE_ORG_ID FROM AD_CLIENTINFO" +
      "        WHERE AD_CLIENT_ID = ?";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, client);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "ad_tree_org_id");
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

  public static String companyName(ConnectionProvider connectionProvider, String client)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT NAME FROM AD_CLIENT" +
      "        WHERE AD_CLIENT_ID = ?";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, client);

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

  public static String incomesummary(ConnectionProvider connectionProvider, String cAcctschemaId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT C_VALIDCOMBINATION.ACCOUNT_ID AS ID" +
      "      FROM C_ACCTSCHEMA_GL, C_VALIDCOMBINATION, C_ELEMENTVALUE" +
      "      WHERE C_ACCTSCHEMA_GL.INCOMESUMMARY_ACCT = C_VALIDCOMBINATION.C_VALIDCOMBINATION_ID" +
      "      AND C_VALIDCOMBINATION.ACCOUNT_ID = C_ELEMENTVALUE.C_ELEMENTVALUE_ID" +
      "      AND C_ACCTSCHEMA_GL.C_ACCTSCHEMA_ID = ?";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cAcctschemaId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "id");
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

  public static String selectPyG(ConnectionProvider connectionProvider, String accountType, String dateFrom, String dateTo, String acctschema, String year, String adOrgId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT COALESCE(SUM(AMTACCTCR-AMTACCTDR), 0) AS NAME" +
      "      FROM FACT_ACCT, C_PERIOD, C_YEAR, (SELECT C_ELEMENTVALUE_ID" +
      "                                         FROM C_ELEMENTVALUE" +
      "                                         WHERE C_ELEMENTVALUE.ACCOUNTTYPE = ?) AA" +
      "     WHERE FACT_ACCT.C_PERIOD_ID = C_PERIOD.C_PERIOD_ID" +
      "     AND C_PERIOD.C_YEAR_ID = C_YEAR.C_YEAR_ID" +
      "     AND FACT_ACCT.ACCOUNT_ID = AA.C_ELEMENTVALUE_ID" +
      "     AND FACT_ACCT.FACTACCTTYPE <> 'R'" +
      "     AND 1=1";
    strSql = strSql + ((dateFrom==null || dateFrom.equals(""))?"":"  AND FACT_ACCT.DATEACCT >= TO_DATE(?) ");
    strSql = strSql + ((dateTo==null || dateTo.equals(""))?"":"  AND FACT_ACCT.DATEACCT < TO_DATE(?) ");
    strSql = strSql + ((acctschema==null || acctschema.equals(""))?"":"  AND FACT_ACCT.C_ACCTSCHEMA_ID = ? ");
    strSql = strSql + 
      "     AND C_YEAR.YEAR IN (";
    strSql = strSql + ((year==null || year.equals(""))?"":year);
    strSql = strSql + 
      ")" +
      "     AND FACT_ACCT.AD_ORG_ID IN (";
    strSql = strSql + ((adOrgId==null || adOrgId.equals(""))?"":adOrgId);
    strSql = strSql + 
      ")";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, accountType);
      if (dateFrom != null && !(dateFrom.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateFrom);
      }
      if (dateTo != null && !(dateTo.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateTo);
      }
      if (acctschema != null && !(acctschema.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, acctschema);
      }
      if (year != null && !(year.equals(""))) {
        }
      if (adOrgId != null && !(adOrgId.equals(""))) {
        }

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

  public static GeneralAccountingReportsData[] checkFiscalYears(ConnectionProvider connectionProvider, String adClientId)    throws ServletException {
    return checkFiscalYears(connectionProvider, adClientId, 0, 0);
  }

  public static GeneralAccountingReportsData[] checkFiscalYears(ConnectionProvider connectionProvider, String adClientId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT CASE WHEN C.CLOSE_FACT_ACCT_GROUP_ID IS NULL THEN 'N' ELSE 'Y' END || SELECTED.C_YEAR_ID AS ID," +
      "          C_YEAR.YEAR AS NAME" +
      "        FROM C_PERIOD PREVIOUS LEFT JOIN AD_ORG_CLOSING C ON C.C_YEAR_ID = PREVIOUS.C_YEAR_ID, C_PERIOD SELECTED, C_YEAR" +
      "        WHERE PREVIOUS.AD_CLIENT_ID = ?" +
      "          AND SELECTED.AD_CLIENT_ID = ?" +
      "          AND SELECTED.ISACTIVE = 'Y'" +
      "          AND C_YEAR.ISACTIVE = 'Y'" +
      "          AND PREVIOUS.ENDDATE = SELECTED.STARTDATE-1" +
      "          AND PREVIOUS.ENDDATE IN (" +
      "            SELECT MAX(P.ENDDATE) AS END" +
      "            FROM C_PERIOD P, C_YEAR Y" +
      "            WHERE P.AD_CLIENT_ID = ?" +
      "              AND Y.C_YEAR_ID = P.C_YEAR_ID" +
      "            GROUP BY Y.YEAR, P.C_YEAR_ID" +
      "          )" +
      "          AND C_YEAR.C_YEAR_ID = SELECTED.C_YEAR_ID" +
      "        UNION" +
      "        SELECT 'M'||Y.C_YEAR_ID AS ID, Y.YEAR AS NAME" +
      "        FROM C_PERIOD P, C_YEAR Y" +
      "        WHERE P.AD_CLIENT_ID=?" +
      "          AND P.C_YEAR_ID = Y.C_YEAR_ID" +
      "          AND P.ISACTIVE = 'Y'" +
      "          AND Y.ISACTIVE = 'Y'" +
      "          AND P.STARTDATE-1 NOT IN (" +
      "                SELECT ENDDATE" +
      "                FROM C_PERIOD" +
      "                WHERE C_PERIOD.AD_CLIENT_ID = ?" +
      "          )" +
      "        ORDER BY NAME DESC";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);

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
        GeneralAccountingReportsData objectGeneralAccountingReportsData = new GeneralAccountingReportsData();
        objectGeneralAccountingReportsData.id = UtilSql.getValue(result, "id");
        objectGeneralAccountingReportsData.name = UtilSql.getValue(result, "name");
        objectGeneralAccountingReportsData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectGeneralAccountingReportsData);
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
    GeneralAccountingReportsData objectGeneralAccountingReportsData[] = new GeneralAccountingReportsData[vector.size()];
    vector.copyInto(objectGeneralAccountingReportsData);
    return(objectGeneralAccountingReportsData);
  }

  public static GeneralAccountingReportsData[] previousYear(ConnectionProvider connectionProvider, String adClientId)    throws ServletException {
    return previousYear(connectionProvider, adClientId, 0, 0);
  }

  public static GeneralAccountingReportsData[] previousYear(ConnectionProvider connectionProvider, String adClientId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT A.ID, A.NAME, Y.YEAR AS PREVIOUS_YEAR, Y.C_YEAR_ID AS PREVIOUS_YEAR_ID" +
      "        FROM (" +
      "                SELECT MIN(P.STARTDATE) AS BEGINING, MAX(P.ENDDATE) AS END, Y.YEAR AS NAME, Y.C_YEAR_ID AS ID" +
      "                FROM C_PERIOD P, C_YEAR Y" +
      "                WHERE P.AD_CLIENT_ID = ?" +
      "                  AND Y.C_YEAR_ID = P.C_YEAR_ID" +
      "                GROUP BY Y.C_YEAR_ID, Y.YEAR" +
      "             ) A, C_YEAR Y, C_PERIOD P" +
      "        WHERE P.ENDDATE = A.BEGINING-1" +
      "          AND Y.AD_CLIENT_ID = ?" +
      "          AND P.AD_CLIENT_ID = ?" +
      "          AND P.C_YEAR_ID = Y.C_YEAR_ID";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);

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
        GeneralAccountingReportsData objectGeneralAccountingReportsData = new GeneralAccountingReportsData();
        objectGeneralAccountingReportsData.id = UtilSql.getValue(result, "id");
        objectGeneralAccountingReportsData.name = UtilSql.getValue(result, "name");
        objectGeneralAccountingReportsData.previousYear = UtilSql.getValue(result, "previous_year");
        objectGeneralAccountingReportsData.previousYearId = UtilSql.getValue(result, "previous_year_id");
        objectGeneralAccountingReportsData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectGeneralAccountingReportsData);
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
    GeneralAccountingReportsData objectGeneralAccountingReportsData[] = new GeneralAccountingReportsData[vector.size()];
    vector.copyInto(objectGeneralAccountingReportsData);
    return(objectGeneralAccountingReportsData);
  }

  public static GeneralAccountingReportsData[] startEndYear(ConnectionProvider connectionProvider, String adClientId, String cYearId)    throws ServletException {
    return startEndYear(connectionProvider, adClientId, cYearId, 0, 0);
  }

  public static GeneralAccountingReportsData[] startEndYear(ConnectionProvider connectionProvider, String adClientId, String cYearId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "          SELECT MIN(P.STARTDATE) AS BEGINING, MAX(P.ENDDATE) AS END, Y.YEAR AS NAME, Y.C_YEAR_ID AS ID" +
      "          FROM C_PERIOD P, C_YEAR Y" +
      "          WHERE P.AD_CLIENT_ID=?" +
      "            AND Y.C_YEAR_ID = P.C_YEAR_ID" +
      "            AND Y.C_YEAR_ID IN (";
    strSql = strSql + ((cYearId==null || cYearId.equals(""))?"":cYearId);
    strSql = strSql + 
      ")" +
      "          GROUP BY Y.C_YEAR_ID, Y.YEAR";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      if (cYearId != null && !(cYearId.equals(""))) {
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
        GeneralAccountingReportsData objectGeneralAccountingReportsData = new GeneralAccountingReportsData();
        objectGeneralAccountingReportsData.begining = UtilSql.getDateValue(result, "begining", "dd-MM-yyyy");
        objectGeneralAccountingReportsData.end = UtilSql.getDateValue(result, "end", "dd-MM-yyyy");
        objectGeneralAccountingReportsData.name = UtilSql.getValue(result, "name");
        objectGeneralAccountingReportsData.id = UtilSql.getValue(result, "id");
        objectGeneralAccountingReportsData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectGeneralAccountingReportsData);
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
    GeneralAccountingReportsData objectGeneralAccountingReportsData[] = new GeneralAccountingReportsData[vector.size()];
    vector.copyInto(objectGeneralAccountingReportsData);
    return(objectGeneralAccountingReportsData);
  }

  public static String selectCalculateOpening(ConnectionProvider connectionProvider, String cAcctRptId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "          SELECT COALESCE(REPORTTYPE,'N') FROM C_ACCT_RPT WHERE C_ACCT_RPT_ID=?";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cAcctRptId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "coalesce");
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

  public static GeneralAccountingReportsData[] selectOrgsDouble(ConnectionProvider connectionProvider, String adClient, String adOrg)    throws ServletException {
    return selectOrgsDouble(connectionProvider, adClient, adOrg, 0, 0);
  }

  public static GeneralAccountingReportsData[] selectOrgsDouble(ConnectionProvider connectionProvider, String adClient, String adOrg, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT S.C_ACCTSCHEMA_ID||R.C_ACCT_RPT_ID AS PADRE, ORG.AD_ORG_ID AS ID, ORG.NAME AS NAME" +
      "      FROM C_ACCT_RPT R, AD_ORG_ACCTSCHEMA S, (" +
      "                                              SELECT AD_ORG.AD_ORG_ID, AD_ORG.NAME, AD_ORG.AD_CLIENT_ID," +
      "                                                (CASE WHEN AD_ORGTYPE.ISBUSINESSUNIT='Y' OR AD_ORGTYPE.ISLEGALENTITY='Y' THEN 'Y' ELSE 'N' END) AS BALANCED" +
      "                                              FROM AD_ORG, AD_ORGTYPE" +
      "                                              WHERE AD_ORGTYPE.AD_ORGTYPE_ID = AD_ORG.AD_ORGTYPE_ID" +
      "                                              AND AD_ORG.ISACTIVE = 'Y'" +
      "                                             ) O, AD_ORG ORG" +
      "      WHERE R.C_ACCTSCHEMA_ID = S.C_ACCTSCHEMA_ID" +
      "        AND AD_ISORGINCLUDED(O.AD_ORG_ID, S.AD_ORG_ID, S.AD_CLIENT_ID) <> -1" +
      "        AND AD_ISORGINCLUDED(O.AD_ORG_ID, R.AD_ORG_ID, R.AD_CLIENT_ID) <> -1" +
      "        AND S.AD_CLIENT_ID = ?" +
      "        AND (R.ISORGBALANCED <> 'N' OR COALESCE(R.REPORTTYPE,'N') <> 'N')" +
      "        AND O.BALANCED = 'Y' " +
      "        AND AD_ISORGINCLUDED(O.AD_ORG_ID, ORG.AD_ORG_ID, S.AD_CLIENT_ID) <> -1" +
      "        AND ORG.AD_ORG_ID <> '0'" +
      "        AND ORG.AD_ORG_ID IN (";
    strSql = strSql + ((adOrg==null || adOrg.equals(""))?"":adOrg);
    strSql = strSql + 
      ")" +
      "      UNION" +
      "      SELECT S.C_ACCTSCHEMA_ID||R.C_ACCT_RPT_ID AS PADRE, O.AD_ORG_ID AS ID, O.NAME AS NAME" +
      "      FROM C_ACCT_RPT R, AD_ORG_ACCTSCHEMA S, (" +
      "                                              SELECT AD_ORG.AD_ORG_ID, AD_ORG.NAME, AD_ORG.AD_CLIENT_ID," +
      "                                                (CASE WHEN AD_ORGTYPE.ISBUSINESSUNIT='Y' OR AD_ORGTYPE.ISLEGALENTITY='Y' THEN 'Y' ELSE 'N' END) AS BALANCED" +
      "                                              FROM AD_ORG, AD_ORGTYPE" +
      "                                              WHERE AD_ORGTYPE.AD_ORGTYPE_ID = AD_ORG.AD_ORGTYPE_ID" +
      "                                              AND AD_ORG.ISACTIVE = 'Y'" +
      "                                             ) O" +
      "      WHERE R.C_ACCTSCHEMA_ID = S.C_ACCTSCHEMA_ID" +
      "        AND (AD_ISORGINCLUDED(O.AD_ORG_ID, S.AD_ORG_ID, S.AD_CLIENT_ID) <> -1" +
      "        OR AD_ISORGINCLUDED(S.AD_ORG_ID, O.AD_ORG_ID, S.AD_CLIENT_ID) <> -1)" +
      "        AND (AD_ISORGINCLUDED(O.AD_ORG_ID, R.AD_ORG_ID, R.AD_CLIENT_ID) <> -1" +
      "        OR AD_ISORGINCLUDED(R.AD_ORG_ID, O.AD_ORG_ID, R.AD_CLIENT_ID) <> -1)" +
      "        AND S.AD_CLIENT_ID = ?" +
      "        AND R.ISORGBALANCED = 'N' " +
      "        AND COALESCE(R.REPORTTYPE,'N') = 'N'" +
      "        AND O.AD_ORG_ID IN (";
    strSql = strSql + ((adOrg==null || adOrg.equals(""))?"":adOrg);
    strSql = strSql + 
      ")" +
      "      ORDER BY NAME,PADRE";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClient);
      if (adOrg != null && !(adOrg.equals(""))) {
        }
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClient);
      if (adOrg != null && !(adOrg.equals(""))) {
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
        GeneralAccountingReportsData objectGeneralAccountingReportsData = new GeneralAccountingReportsData();
        objectGeneralAccountingReportsData.padre = UtilSql.getValue(result, "padre");
        objectGeneralAccountingReportsData.id = UtilSql.getValue(result, "id");
        objectGeneralAccountingReportsData.name = UtilSql.getValue(result, "name");
        objectGeneralAccountingReportsData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectGeneralAccountingReportsData);
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
    GeneralAccountingReportsData objectGeneralAccountingReportsData[] = new GeneralAccountingReportsData[vector.size()];
    vector.copyInto(objectGeneralAccountingReportsData);
    return(objectGeneralAccountingReportsData);
  }

  public static GeneralAccountingReportsData[] selectYearsDouble(ConnectionProvider connectionProvider, String Client)    throws ServletException {
    return selectYearsDouble(connectionProvider, Client, 0, 0);
  }

  public static GeneralAccountingReportsData[] selectYearsDouble(ConnectionProvider connectionProvider, String Client, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT O.AD_ORG_ID AS PADRE, Y.C_YEAR_ID AS ID, Y.YEAR || ' (' || C.NAME || ')' AS NAME" +
      "        FROM C_YEAR Y, C_CALENDAR C, AD_ORG O" +
      "        WHERE C.C_CALENDAR_ID = Y.C_CALENDAR_ID" +
      "          AND C.C_CALENDAR_ID IN (" +
      "                                    SELECT ORG.C_CALENDAR_ID FROM AD_ORG ORG" +
      "                                    WHERE AD_ISORGINCLUDED(O.AD_ORG_ID, ORG.AD_ORG_ID, ";
    strSql = strSql + ((Client==null || Client.equals(""))?"":Client);
    strSql = strSql + 
      ") <> -1" +
      "                                      AND ORG.C_CALENDAR_ID IS NOT NULL" +
      "                                  UNION" +
      "                                    SELECT ORG.C_CALENDAR_ID FROM AD_ORG ORG" +
      "                                    WHERE AD_ISORGINCLUDED(ORG.AD_ORG_ID,O.AD_ORG_ID, ";
    strSql = strSql + ((Client==null || Client.equals(""))?"":Client);
    strSql = strSql + 
      ") <> -1" +
      "                                      AND ORG.C_CALENDAR_ID IS NOT NULL" +
      "                                 )" +
      "        ORDER BY O.NAME, Y.YEAR";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    try {
    st = connectionProvider.getPreparedStatement(strSql);
      if (Client != null && !(Client.equals(""))) {
        }
      if (Client != null && !(Client.equals(""))) {
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
        GeneralAccountingReportsData objectGeneralAccountingReportsData = new GeneralAccountingReportsData();
        objectGeneralAccountingReportsData.padre = UtilSql.getValue(result, "padre");
        objectGeneralAccountingReportsData.id = UtilSql.getValue(result, "id");
        objectGeneralAccountingReportsData.name = UtilSql.getValue(result, "name");
        objectGeneralAccountingReportsData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectGeneralAccountingReportsData);
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
    GeneralAccountingReportsData objectGeneralAccountingReportsData[] = new GeneralAccountingReportsData[vector.size()];
    vector.copyInto(objectGeneralAccountingReportsData);
    return(objectGeneralAccountingReportsData);
  }
}
