//Sqlc generated V1.O00-1
package org.openbravo.erpCommon.utility.reporting;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import java.util.*;

class OrderData implements FieldProvider {
static Logger log4j = Logger.getLogger(OrderData.class);
  private String InitRecordNumber="0";
  public String adOrgId;
  public String documentId;
  public String docstatus;
  public String doctypetargetid;
  public String ourreference;
  public String cusreference;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("ad_org_id") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("document_id") || fieldName.equals("documentId"))
      return documentId;
    else if (fieldName.equalsIgnoreCase("docstatus"))
      return docstatus;
    else if (fieldName.equalsIgnoreCase("doctypetargetid"))
      return doctypetargetid;
    else if (fieldName.equalsIgnoreCase("ourreference"))
      return ourreference;
    else if (fieldName.equalsIgnoreCase("cusreference"))
      return cusreference;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static OrderData[] dummy(ConnectionProvider connectionProvider, String cOrderId)    throws ServletException {
    return dummy(connectionProvider, cOrderId, 0, 0);
  }

  public static OrderData[] dummy(ConnectionProvider connectionProvider, String cOrderId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "			select" +
      "				'' as ad_Org_Id," +
      "				'' as document_id," +
      "				'' as docstatus," +
      "				'' as docTypeTargetId," +
      "				'' as ourreference," +
      "				'' as cusreference" +
      "			from" +
      "				c_order" +
      "			where" +
      "				1=1";
    strSql = strSql + ((cOrderId==null || cOrderId.equals(""))?"":"  			 and c_order.c_order_id in  		" + cOrderId);

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    try {
    st = connectionProvider.getPreparedStatement(strSql);
      if (cOrderId != null && !(cOrderId.equals(""))) {
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
        OrderData objectOrderData = new OrderData();
        objectOrderData.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectOrderData.documentId = UtilSql.getValue(result, "document_id");
        objectOrderData.docstatus = UtilSql.getValue(result, "docstatus");
        objectOrderData.doctypetargetid = UtilSql.getValue(result, "doctypetargetid");
        objectOrderData.ourreference = UtilSql.getValue(result, "ourreference");
        objectOrderData.cusreference = UtilSql.getValue(result, "cusreference");
        objectOrderData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectOrderData);
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
    OrderData objectOrderData[] = new OrderData[vector.size()];
    vector.copyInto(objectOrderData);
    return(objectOrderData);
  }

  public static OrderData[] getOrderInfo(ConnectionProvider connectionProvider, String cOrderId)    throws ServletException {
    return getOrderInfo(connectionProvider, cOrderId, 0, 0);
  }

  public static OrderData[] getOrderInfo(ConnectionProvider connectionProvider, String cOrderId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "			select" +
      "				c_order.ad_org_id," +
      "				c_order.c_order_id as document_id," +
      "				c_order.docstatus," +
      "				c_order.c_doctypetarget_id as docTypeTargetId," +
      "				c_order.documentno as ourreference," +
      "				c_order.poreference as cusreference" +
      "			from" +
      "				c_order left join c_doctype on c_order.c_doctypetarget_id = c_doctype.c_doctype_id" +
      "			where" +
      "				c_order.c_order_id = ?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cOrderId);

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
        OrderData objectOrderData = new OrderData();
        objectOrderData.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectOrderData.documentId = UtilSql.getValue(result, "document_id");
        objectOrderData.docstatus = UtilSql.getValue(result, "docstatus");
        objectOrderData.doctypetargetid = UtilSql.getValue(result, "doctypetargetid");
        objectOrderData.ourreference = UtilSql.getValue(result, "ourreference");
        objectOrderData.cusreference = UtilSql.getValue(result, "cusreference");
        objectOrderData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectOrderData);
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
    OrderData objectOrderData[] = new OrderData[vector.size()];
    vector.copyInto(objectOrderData);
    return(objectOrderData);
  }
}
