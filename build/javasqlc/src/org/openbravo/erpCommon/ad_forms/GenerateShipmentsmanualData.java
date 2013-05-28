//Sqlc generated V1.O00-1
package org.openbravo.erpCommon.ad_forms;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import java.util.*;

class GenerateShipmentsmanualData implements FieldProvider {
static Logger log4j = Logger.getLogger(GenerateShipmentsmanualData.class);
  private String InitRecordNumber="0";
  public String cOrderId;
  public String adorgname;
  public String cdoctypename;
  public String documentno;
  public String cbpartnername;
  public String dateordered;
  public String amountlines;
  public String totallines;
  public String rownum;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("c_order_id") || fieldName.equals("cOrderId"))
      return cOrderId;
    else if (fieldName.equalsIgnoreCase("adorgname"))
      return adorgname;
    else if (fieldName.equalsIgnoreCase("cdoctypename"))
      return cdoctypename;
    else if (fieldName.equalsIgnoreCase("documentno"))
      return documentno;
    else if (fieldName.equalsIgnoreCase("cbpartnername"))
      return cbpartnername;
    else if (fieldName.equalsIgnoreCase("dateordered"))
      return dateordered;
    else if (fieldName.equalsIgnoreCase("amountlines"))
      return amountlines;
    else if (fieldName.equalsIgnoreCase("totallines"))
      return totallines;
    else if (fieldName.equals("rownum"))
      return rownum;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static GenerateShipmentsmanualData[] select(ConnectionProvider connectionProvider, String language, String adUserClient, String adUserOrg, String parBPartner, String parDateFrom, String parDateTo, String adOrgId)    throws ServletException {
    return select(connectionProvider, language, adUserClient, adUserOrg, parBPartner, parDateFrom, parDateTo, adOrgId, 0, 0);
  }

  public static GenerateShipmentsmanualData[] select(ConnectionProvider connectionProvider, String language, String adUserClient, String adUserOrg, String parBPartner, String parDateFrom, String parDateTo, String adOrgId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT C_Order_ID, o.Name as adorgname, COALESCE(dttrl.Name, dt.Name) as cdoctypename, DocumentNo, bp.Name as cbpartnername, DateOrdered, " +
      "      amountlines, TotalLines " +
      "      FROM M_InOut_Candidate_v ic, AD_Org o, C_BPartner bp, C_DocType dt left join C_DocType_trl dttrl on dt.C_DocType_ID=dttrl.C_DocType_ID AND dttrl.ad_language=?" +
      "      WHERE ic.AD_Org_ID=o.AD_Org_ID" +
      "      AND ic.C_BPartner_ID=bp.C_BPartner_ID" +
      "      AND ic.C_DocType_ID=dt.C_DocType_ID" +
      "      AND dt.isreturn='N'" +
      "      AND ic.ad_client_id in (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ")" +
      "      AND ic.ad_org_id in (";
    strSql = strSql + ((adUserOrg==null || adUserOrg.equals(""))?"":adUserOrg);
    strSql = strSql + 
      ")" +
      "      AND 1=1";
    strSql = strSql + ((parBPartner==null || parBPartner.equals(""))?"":" AND ic.C_BPartner_ID= ? ");
    strSql = strSql + ((parDateFrom==null || parDateFrom.equals(""))?"":"  AND ic.DateOrdered >= TO_DATE(?) ");
    strSql = strSql + ((parDateTo==null || parDateTo.equals(""))?"":"  AND ic.DateOrdered < TO_DATE(?) ");
    strSql = strSql + 
      "      AND 2=2 AND ic.ad_org_id in (";
    strSql = strSql + ((adOrgId==null || adOrgId.equals(""))?"":adOrgId);
    strSql = strSql + 
      ")" +
      "      ORDER BY o.Name,bp.Name,DateOrdered";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, language);
      if (adUserClient != null && !(adUserClient.equals(""))) {
        }
      if (adUserOrg != null && !(adUserOrg.equals(""))) {
        }
      if (parBPartner != null && !(parBPartner.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, parBPartner);
      }
      if (parDateFrom != null && !(parDateFrom.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, parDateFrom);
      }
      if (parDateTo != null && !(parDateTo.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, parDateTo);
      }
      if (adOrgId != null && !(adOrgId.equals(""))) {
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
        GenerateShipmentsmanualData objectGenerateShipmentsmanualData = new GenerateShipmentsmanualData();
        objectGenerateShipmentsmanualData.cOrderId = UtilSql.getValue(result, "c_order_id");
        objectGenerateShipmentsmanualData.adorgname = UtilSql.getValue(result, "adorgname");
        objectGenerateShipmentsmanualData.cdoctypename = UtilSql.getValue(result, "cdoctypename");
        objectGenerateShipmentsmanualData.documentno = UtilSql.getValue(result, "documentno");
        objectGenerateShipmentsmanualData.cbpartnername = UtilSql.getValue(result, "cbpartnername");
        objectGenerateShipmentsmanualData.dateordered = UtilSql.getDateValue(result, "dateordered", "dd-MM-yyyy");
        objectGenerateShipmentsmanualData.amountlines = UtilSql.getValue(result, "amountlines");
        objectGenerateShipmentsmanualData.totallines = UtilSql.getValue(result, "totallines");
        objectGenerateShipmentsmanualData.rownum = Long.toString(countRecord);
        objectGenerateShipmentsmanualData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectGenerateShipmentsmanualData);
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
    GenerateShipmentsmanualData objectGenerateShipmentsmanualData[] = new GenerateShipmentsmanualData[vector.size()];
    vector.copyInto(objectGenerateShipmentsmanualData);
    return(objectGenerateShipmentsmanualData);
  }

  public static GenerateShipmentsmanualData[] set()    throws ServletException {
    GenerateShipmentsmanualData objectGenerateShipmentsmanualData[] = new GenerateShipmentsmanualData[1];
    objectGenerateShipmentsmanualData[0] = new GenerateShipmentsmanualData();
    objectGenerateShipmentsmanualData[0].cOrderId = "";
    objectGenerateShipmentsmanualData[0].adorgname = "";
    objectGenerateShipmentsmanualData[0].cdoctypename = "";
    objectGenerateShipmentsmanualData[0].documentno = "";
    objectGenerateShipmentsmanualData[0].cbpartnername = "";
    objectGenerateShipmentsmanualData[0].dateordered = "";
    objectGenerateShipmentsmanualData[0].amountlines = "";
    objectGenerateShipmentsmanualData[0].totallines = "";
    return objectGenerateShipmentsmanualData;
  }

  public static int update(ConnectionProvider connectionProvider)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      UPDATE C_Order SET IsSelected = 'N'" +
      "      WHERE IsSelected='Y'";

    int updateCount = 0;
    PreparedStatement st = null;

    try {
    st = connectionProvider.getPreparedStatement(strSql);

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

  public static int updateSelection(ConnectionProvider connectionProvider, String parSalesOrders)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      UPDATE C_Order SET IsSelected='Y' " +
      "      WHERE 1=1";
    strSql = strSql + ((parSalesOrders==null || parSalesOrders.equals(""))?"":" AND C_Order_ID IN" + parSalesOrders);

    int updateCount = 0;
    PreparedStatement st = null;

    try {
    st = connectionProvider.getPreparedStatement(strSql);
      if (parSalesOrders != null && !(parSalesOrders.equals(""))) {
        }

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

  public static int updateReset(ConnectionProvider connectionProvider, String parSalesOrders)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      UPDATE C_Order SET IsSelected='N' " +
      "      WHERE 1=1";
    strSql = strSql + ((parSalesOrders==null || parSalesOrders.equals(""))?"":" AND C_Order_ID IN" + parSalesOrders);

    int updateCount = 0;
    PreparedStatement st = null;

    try {
    st = connectionProvider.getPreparedStatement(strSql);
      if (parSalesOrders != null && !(parSalesOrders.equals(""))) {
        }

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

  public static String bPartnerDescription(ConnectionProvider connectionProvider, String cBpartnerId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "    SELECT NAME FROM C_BPARTNER " +
      "    WHERE C_BPARTNER_ID = ?";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);

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
}
