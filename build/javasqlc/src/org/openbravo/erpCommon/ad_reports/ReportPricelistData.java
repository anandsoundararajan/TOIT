//Sqlc generated V1.O00-1
package org.openbravo.erpCommon.ad_reports;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import java.util.*;

class ReportPricelistData implements FieldProvider {
static Logger log4j = Logger.getLogger(ReportPricelistData.class);
  private String InitRecordNumber="0";
  public String mPricelistVersionId;
  public String versionName;
  public String mProductCategoryId;
  public String categoryName;
  public String mProductId;
  public String productName;
  public String pricelimit;
  public String pricelist;
  public String pricestd;
  public String name;
  public String id;
  public String valid;
  public String uomname;
  public String rownum;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("m_pricelist_version_id") || fieldName.equals("mPricelistVersionId"))
      return mPricelistVersionId;
    else if (fieldName.equalsIgnoreCase("version_name") || fieldName.equals("versionName"))
      return versionName;
    else if (fieldName.equalsIgnoreCase("m_product_category_id") || fieldName.equals("mProductCategoryId"))
      return mProductCategoryId;
    else if (fieldName.equalsIgnoreCase("category_name") || fieldName.equals("categoryName"))
      return categoryName;
    else if (fieldName.equalsIgnoreCase("m_product_id") || fieldName.equals("mProductId"))
      return mProductId;
    else if (fieldName.equalsIgnoreCase("product_name") || fieldName.equals("productName"))
      return productName;
    else if (fieldName.equalsIgnoreCase("pricelimit"))
      return pricelimit;
    else if (fieldName.equalsIgnoreCase("pricelist"))
      return pricelist;
    else if (fieldName.equalsIgnoreCase("pricestd"))
      return pricestd;
    else if (fieldName.equalsIgnoreCase("name"))
      return name;
    else if (fieldName.equalsIgnoreCase("id"))
      return id;
    else if (fieldName.equalsIgnoreCase("valid"))
      return valid;
    else if (fieldName.equalsIgnoreCase("uomname"))
      return uomname;
    else if (fieldName.equals("rownum"))
      return rownum;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static ReportPricelistData[] select(ConnectionProvider connectionProvider, String adUserClient, String adOrgClient, String mPricelistVersionId, String mProductCategoryId, String mProduct)    throws ServletException {
    return select(connectionProvider, adUserClient, adOrgClient, mPricelistVersionId, mProductCategoryId, mProduct, 0, 0);
  }

  public static ReportPricelistData[] select(ConnectionProvider connectionProvider, String adUserClient, String adOrgClient, String mPricelistVersionId, String mProductCategoryId, String mProduct, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT M_PRICELIST_VERSION.M_PRICELIST_VERSION_ID, M_PRICELIST_VERSION.NAME||'   '||'valid from:  '|| M_PRICELIST_VERSION.VALIDFROM AS VERSION_NAME," +
      "      M_PRODUCT_CATEGORY.M_PRODUCT_CATEGORY_ID, M_PRODUCT_CATEGORY.NAME AS CATEGORY_NAME," +
      "      M_PRODUCT.M_PRODUCT_ID, (CASE WHEN M_PRODUCT.VALUE IS NULL THEN M_PRODUCT.NAME ELSE M_PRODUCT.VALUE||' - '||M_PRODUCT.NAME END) AS PRODUCT_NAME, M_PRODUCTPRICE.PRICELIMIT, M_PRODUCTPRICE.PRICELIST, M_PRODUCTPRICE.PRICESTD, '' as name, '' as id, '' AS VALID, '' AS UOMNAME" +
      "      FROM M_PRICELIST_VERSION, M_PRODUCTPRICE, M_PRODUCT, M_PRODUCT_CATEGORY" +
      "      WHERE M_PRICELIST_VERSION.M_PRICELIST_VERSION_ID = M_PRODUCTPRICE.M_PRICELIST_VERSION_ID" +
      "      AND M_PRODUCTPRICE.M_PRODUCT_ID = M_PRODUCT.M_PRODUCT_ID" +
      "      AND M_PRODUCT.M_PRODUCT_CATEGORY_ID = M_PRODUCT_CATEGORY.M_PRODUCT_CATEGORY_ID" +
      "      AND M_PRICELIST_VERSION.AD_CLIENT_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ")" +
      "      AND M_PRICELIST_VERSION.AD_ORG_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ")" +
      "      AND 1=1";
    strSql = strSql + ((mPricelistVersionId==null || mPricelistVersionId.equals(""))?"":"  AND M_PRICELIST_VERSION.M_PRICELIST_VERSION_ID = ? ");
    strSql = strSql + ((mProductCategoryId==null || mProductCategoryId.equals(""))?"":" AND M_PRODUCT_CATEGORY.M_PRODUCT_CATEGORY_ID = ? ");
    strSql = strSql + ((mProduct==null || mProduct.equals(""))?"":"  AND M_PRODUCT.M_PRODUCT_ID IN" + mProduct);
    strSql = strSql + 
      "      ORDER BY VERSION_NAME, CATEGORY_NAME, M_PRODUCT.NAME";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      if (adUserClient != null && !(adUserClient.equals(""))) {
        }
      if (adOrgClient != null && !(adOrgClient.equals(""))) {
        }
      if (mPricelistVersionId != null && !(mPricelistVersionId.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, mPricelistVersionId);
      }
      if (mProductCategoryId != null && !(mProductCategoryId.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductCategoryId);
      }
      if (mProduct != null && !(mProduct.equals(""))) {
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
        ReportPricelistData objectReportPricelistData = new ReportPricelistData();
        objectReportPricelistData.mPricelistVersionId = UtilSql.getValue(result, "m_pricelist_version_id");
        objectReportPricelistData.versionName = UtilSql.getValue(result, "version_name");
        objectReportPricelistData.mProductCategoryId = UtilSql.getValue(result, "m_product_category_id");
        objectReportPricelistData.categoryName = UtilSql.getValue(result, "category_name");
        objectReportPricelistData.mProductId = UtilSql.getValue(result, "m_product_id");
        objectReportPricelistData.productName = UtilSql.getValue(result, "product_name");
        objectReportPricelistData.pricelimit = UtilSql.getValue(result, "pricelimit");
        objectReportPricelistData.pricelist = UtilSql.getValue(result, "pricelist");
        objectReportPricelistData.pricestd = UtilSql.getValue(result, "pricestd");
        objectReportPricelistData.name = UtilSql.getValue(result, "name");
        objectReportPricelistData.id = UtilSql.getValue(result, "id");
        objectReportPricelistData.valid = UtilSql.getValue(result, "valid");
        objectReportPricelistData.uomname = UtilSql.getValue(result, "uomname");
        objectReportPricelistData.rownum = Long.toString(countRecord);
        objectReportPricelistData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectReportPricelistData);
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
    ReportPricelistData objectReportPricelistData[] = new ReportPricelistData[vector.size()];
    vector.copyInto(objectReportPricelistData);
    return(objectReportPricelistData);
  }

  public static ReportPricelistData[] set()    throws ServletException {
    ReportPricelistData objectReportPricelistData[] = new ReportPricelistData[1];
    objectReportPricelistData[0] = new ReportPricelistData();
    objectReportPricelistData[0].mPricelistVersionId = "";
    objectReportPricelistData[0].versionName = "";
    objectReportPricelistData[0].mProductCategoryId = "";
    objectReportPricelistData[0].categoryName = "";
    objectReportPricelistData[0].mProductId = "";
    objectReportPricelistData[0].productName = "";
    objectReportPricelistData[0].pricelimit = "";
    objectReportPricelistData[0].pricelist = "";
    objectReportPricelistData[0].pricestd = "";
    objectReportPricelistData[0].name = "";
    objectReportPricelistData[0].id = "";
    objectReportPricelistData[0].valid = "";
    objectReportPricelistData[0].uomname = "";
    return objectReportPricelistData;
  }

  public static ReportPricelistData[] selectPDF(ConnectionProvider connectionProvider, String adUserClient, String adOrgClient, String mPricelistVersionId, String mProductCategoryId, String mProduct)    throws ServletException {
    return selectPDF(connectionProvider, adUserClient, adOrgClient, mPricelistVersionId, mProductCategoryId, mProduct, 0, 0);
  }

  public static ReportPricelistData[] selectPDF(ConnectionProvider connectionProvider, String adUserClient, String adOrgClient, String mPricelistVersionId, String mProductCategoryId, String mProduct, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT M_PRICELIST_VERSION.NAME||'   '||'valid from:  '|| M_PRICELIST_VERSION.VALIDFROM AS VERSION_NAME, M_PRODUCT_CATEGORY.NAME AS CATEGORY_NAME," +
      "      (CASE WHEN M_PRODUCT.VALUE IS NULL THEN M_PRODUCT.NAME ELSE M_PRODUCT.VALUE||' - '||M_PRODUCT.NAME END) AS PRODUCT_NAME, M_PRODUCTPRICE.PRICESTD, C_UOM.NAME AS UOMNAME, (CASE WHEN M_PRICELIST_VERSION.VALIDFROM IS NOT NULL THEN '(Valid from : '||M_PRICELIST_VERSION.VALIDFROM||')' END) AS VALID" +
      "      FROM M_PRODUCT left join C_UOM on M_PRODUCT.C_UOM_ID = C_UOM.C_UOM_ID," +
      "	  M_PRICELIST_VERSION inner join M_PRICELIST ON M_PRICELIST_VERSION.M_PRICELIST_ID = M_PRICELIST.M_PRICELIST_ID," +
      "      M_PRODUCTPRICE, M_PRODUCT_CATEGORY" +
      "      WHERE M_PRICELIST_VERSION.M_PRICELIST_VERSION_ID = M_PRODUCTPRICE.M_PRICELIST_VERSION_ID" +
      "      AND M_PRODUCTPRICE.M_PRODUCT_ID = M_PRODUCT.M_PRODUCT_ID" +
      "      AND M_PRODUCT.M_PRODUCT_CATEGORY_ID = M_PRODUCT_CATEGORY.M_PRODUCT_CATEGORY_ID" +
      "      AND M_PRICELIST_VERSION.AD_CLIENT_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ")" +
      "      AND M_PRICELIST_VERSION.AD_ORG_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ")" +
      "      AND 1=1";
    strSql = strSql + ((mPricelistVersionId==null || mPricelistVersionId.equals(""))?"":"  AND M_PRICELIST_VERSION.M_PRICELIST_VERSION_ID = ? ");
    strSql = strSql + ((mProductCategoryId==null || mProductCategoryId.equals(""))?"":" AND M_PRODUCT_CATEGORY.M_PRODUCT_CATEGORY_ID = ? ");
    strSql = strSql + ((mProduct==null || mProduct.equals(""))?"":"  AND M_PRODUCT.M_PRODUCT_ID IN" + mProduct);
    strSql = strSql + 
      "      ORDER BY VERSION_NAME, CATEGORY_NAME, M_PRODUCT.NAME";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      if (adUserClient != null && !(adUserClient.equals(""))) {
        }
      if (adOrgClient != null && !(adOrgClient.equals(""))) {
        }
      if (mPricelistVersionId != null && !(mPricelistVersionId.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, mPricelistVersionId);
      }
      if (mProductCategoryId != null && !(mProductCategoryId.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductCategoryId);
      }
      if (mProduct != null && !(mProduct.equals(""))) {
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
        ReportPricelistData objectReportPricelistData = new ReportPricelistData();
        objectReportPricelistData.versionName = UtilSql.getValue(result, "version_name");
        objectReportPricelistData.categoryName = UtilSql.getValue(result, "category_name");
        objectReportPricelistData.productName = UtilSql.getValue(result, "product_name");
        objectReportPricelistData.pricestd = UtilSql.getValue(result, "pricestd");
        objectReportPricelistData.uomname = UtilSql.getValue(result, "uomname");
        objectReportPricelistData.valid = UtilSql.getValue(result, "valid");
        objectReportPricelistData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectReportPricelistData);
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
    ReportPricelistData objectReportPricelistData[] = new ReportPricelistData[vector.size()];
    vector.copyInto(objectReportPricelistData);
    return(objectReportPricelistData);
  }
}
