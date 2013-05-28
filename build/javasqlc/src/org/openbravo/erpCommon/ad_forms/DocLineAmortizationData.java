//Sqlc generated V1.O00-1
package org.openbravo.erpCommon.ad_forms;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import java.util.*;

class DocLineAmortizationData implements FieldProvider {
static Logger log4j = Logger.getLogger(DocLineAmortizationData.class);
  private String InitRecordNumber="0";
  public String adOrgId;
  public String line;
  public String amortizationamt;
  public String cCurrencyId;
  public String mProductId;
  public String aAssetId;
  public String aAmortizationId;
  public String aAmortizationlineId;
  public String cProjectId;
  public String cCostcenterId;
  public String user1Id;
  public String user2Id;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("ad_org_id") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("line"))
      return line;
    else if (fieldName.equalsIgnoreCase("amortizationamt"))
      return amortizationamt;
    else if (fieldName.equalsIgnoreCase("c_currency_id") || fieldName.equals("cCurrencyId"))
      return cCurrencyId;
    else if (fieldName.equalsIgnoreCase("m_product_id") || fieldName.equals("mProductId"))
      return mProductId;
    else if (fieldName.equalsIgnoreCase("a_asset_id") || fieldName.equals("aAssetId"))
      return aAssetId;
    else if (fieldName.equalsIgnoreCase("a_amortization_id") || fieldName.equals("aAmortizationId"))
      return aAmortizationId;
    else if (fieldName.equalsIgnoreCase("a_amortizationline_id") || fieldName.equals("aAmortizationlineId"))
      return aAmortizationlineId;
    else if (fieldName.equalsIgnoreCase("c_project_id") || fieldName.equals("cProjectId"))
      return cProjectId;
    else if (fieldName.equalsIgnoreCase("c_costcenter_id") || fieldName.equals("cCostcenterId"))
      return cCostcenterId;
    else if (fieldName.equalsIgnoreCase("user1_id") || fieldName.equals("user1Id"))
      return user1Id;
    else if (fieldName.equalsIgnoreCase("user2_id") || fieldName.equals("user2Id"))
      return user2Id;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static DocLineAmortizationData[] select(ConnectionProvider connectionProvider, String A_AMORTIZATION_ID)    throws ServletException {
    return select(connectionProvider, A_AMORTIZATION_ID, 0, 0);
  }

  public static DocLineAmortizationData[] select(ConnectionProvider connectionProvider, String A_AMORTIZATION_ID, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT A_AMORTIZATIONLINE.AD_ORG_ID, A_AMORTIZATIONLINE.LINE, A_AMORTIZATIONLINE.AMORTIZATIONAMT, A_AMORTIZATIONLINE.C_CURRENCY_ID," +
      "        A_ASSET.M_PRODUCT_ID, A_AMORTIZATIONLINE.A_ASSET_ID, A_AMORTIZATIONLINE.A_AMORTIZATION_ID, A_AMORTIZATIONLINE.A_AMORTIZATIONLINE_ID," +
      "        A_AMORTIZATIONLINE.C_PROJECT_ID, A_AMORTIZATIONLINE.C_COSTCENTER_ID, A_AMORTIZATIONLINE.USER1_ID, A_AMORTIZATIONLINE.USER2_ID" +
      "        FROM A_AMORTIZATIONLINE, A_ASSET" +
      "        WHERE A_AMORTIZATIONLINE.A_ASSET_ID = A_ASSET.A_ASSET_ID" +
      "        AND A_AMORTIZATIONLINE.A_AMORTIZATION_ID =?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, A_AMORTIZATION_ID);

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
        DocLineAmortizationData objectDocLineAmortizationData = new DocLineAmortizationData();
        objectDocLineAmortizationData.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectDocLineAmortizationData.line = UtilSql.getValue(result, "line");
        objectDocLineAmortizationData.amortizationamt = UtilSql.getValue(result, "amortizationamt");
        objectDocLineAmortizationData.cCurrencyId = UtilSql.getValue(result, "c_currency_id");
        objectDocLineAmortizationData.mProductId = UtilSql.getValue(result, "m_product_id");
        objectDocLineAmortizationData.aAssetId = UtilSql.getValue(result, "a_asset_id");
        objectDocLineAmortizationData.aAmortizationId = UtilSql.getValue(result, "a_amortization_id");
        objectDocLineAmortizationData.aAmortizationlineId = UtilSql.getValue(result, "a_amortizationline_id");
        objectDocLineAmortizationData.cProjectId = UtilSql.getValue(result, "c_project_id");
        objectDocLineAmortizationData.cCostcenterId = UtilSql.getValue(result, "c_costcenter_id");
        objectDocLineAmortizationData.user1Id = UtilSql.getValue(result, "user1_id");
        objectDocLineAmortizationData.user2Id = UtilSql.getValue(result, "user2_id");
        objectDocLineAmortizationData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectDocLineAmortizationData);
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
    DocLineAmortizationData objectDocLineAmortizationData[] = new DocLineAmortizationData[vector.size()];
    vector.copyInto(objectDocLineAmortizationData);
    return(objectDocLineAmortizationData);
  }
}
