//Sqlc generated V1.O00-1
package org.openbravo.erpCommon.ad_reports;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import java.util.*;

class ReportValuationStockData implements FieldProvider {
static Logger log4j = Logger.getLogger(ReportValuationStockData.class);
  private String InitRecordNumber="0";
  public String categoryName;
  public String mProductId;
  public String productName;
  public String qty;
  public String uomName;
  public String averageCost;
  public String totalCost;
  public String rownum;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("category_name") || fieldName.equals("categoryName"))
      return categoryName;
    else if (fieldName.equalsIgnoreCase("m_product_id") || fieldName.equals("mProductId"))
      return mProductId;
    else if (fieldName.equalsIgnoreCase("product_name") || fieldName.equals("productName"))
      return productName;
    else if (fieldName.equalsIgnoreCase("qty"))
      return qty;
    else if (fieldName.equalsIgnoreCase("uom_name") || fieldName.equals("uomName"))
      return uomName;
    else if (fieldName.equalsIgnoreCase("average_cost") || fieldName.equals("averageCost"))
      return averageCost;
    else if (fieldName.equalsIgnoreCase("total_cost") || fieldName.equals("totalCost"))
      return totalCost;
    else if (fieldName.equals("rownum"))
      return rownum;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static ReportValuationStockData[] select(ConnectionProvider connectionProvider, String adLanguage, String cCurrencyConv, String legalEntity, String datePlus, String warehouse, String categoryProduct)    throws ServletException {
    return select(connectionProvider, adLanguage, cCurrencyConv, legalEntity, datePlus, warehouse, categoryProduct, 0, 0);
  }

  public static ReportValuationStockData[] select(ConnectionProvider connectionProvider, String adLanguage, String cCurrencyConv, String legalEntity, String datePlus, String warehouse, String categoryProduct, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT CATEGORY_NAME, M_PRODUCT_ID, PRODUCT_NAME, SUM(QTY) AS QTY, UOM_NAME, CASE ISCOSTCALCULATED" +
      "                       WHEN 'Y' THEN SUM(TOTAL_COST) / SUM(QTY)" +
      "                       ELSE NULL" +
      "                     END AS AVERAGE_COST," +
      "               SUM(TOTAL_COST) AS TOTAL_COST" +
      "        FROM (SELECT M_PRODUCT_CATEGORY.NAME AS CATEGORY_NAME, A.M_PRODUCT_ID, AD_COLUMN_IDENTIFIER (to_char('M_Product'),to_char(M_PRODUCT.M_PRODUCT_ID),to_char(?)) AS PRODUCT_NAME, " +
      "              A.QTY, C_UOM.NAME AS UOM_NAME," +
      "                     CASE a.iscostcalculated" +
      "                       WHEN 'Y' THEN C_CURRENCY_CONVERT_PRECISION (Suma,A.c_currency_id,?,A.movementdate,NULL,A.AD_CLIENT_ID,?,'C')" +
      "                       ELSE NULL" +
      "                     END AS TOTAL_COST,  A.ISCOSTCALCULATED, A.AD_CLIENT_ID, A.MOVEMENTDATE, A.C_CURRENCY_ID" +
      "              FROM M_PRODUCT_CATEGORY," +
      "                   (SELECT trx.M_PRODUCT_ID, sum(trx.MOVEMENTQTY) AS QTY, sum(CASE WHEN trx.MOVEMENTQTY < 0 THEN- tc.trxcost ELSE tc.trxcost END) AS Suma, " +
      "                   trx.C_UOM_ID, trx.AD_CLIENT_ID, trx.iscostcalculated, tc.c_currency_id, coalesce(io.dateacct,trx.movementdate) as movementdate" +
      "                    FROM M_TRANSACTION trx " +
      "                      JOIN M_LOCATOR l ON trx.M_LOCATOR_ID = l.M_LOCATOR_ID " +
      "                      LEFT JOIN M_INOUTLINE iol ON trx.M_INOUTLINE_ID = iol.M_INOUTLINE_ID " +
      "                      LEFT JOIN M_INOUT io ON iol.M_INOUT_ID = io.M_INOUT_ID " +
      "                      LEFT JOIN (SELECT sum(cost) AS trxcost, m_transaction_id, c_currency_id" +
      "                                 FROM M_TRANSACTION_COST" +
      "                                 WHERE costdate < to_date(?)" +
      "                                 GROUP BY m_transaction_id, c_currency_id) tc ON trx.m_transaction_id = tc.m_transaction_id" +
      "                    WHERE trx.MOVEMENTDATE < to_date(?)" +
      "              AND l.M_WAREHOUSE_ID = ?" +
      "                    GROUP BY trx.M_PRODUCT_ID, trx.C_UOM_ID, trx.AD_CLIENT_ID, trx.iscostcalculated, tc.c_currency_id, coalesce(io.dateacct,trx.movementdate)) A," +
      "                   C_UOM," +
      "                   M_PRODUCT" +
      "              WHERE A.M_PRODUCT_ID = M_PRODUCT.M_PRODUCT_ID" +
      "              AND   A.C_UOM_ID = C_UOM.C_UOM_ID" +
      "              AND   M_PRODUCT.M_PRODUCT_CATEGORY_ID = M_PRODUCT_CATEGORY.M_PRODUCT_CATEGORY_ID" +
      "              AND   1 = 1";
    strSql = strSql + ((categoryProduct==null || categoryProduct.equals(""))?"":"  AND M_PRODUCT.M_PRODUCT_CATEGORY_ID= ?  ");
    strSql = strSql + 
      "              AND   (A.QTY <> 0 OR A.Suma <> 0)) ZZ" +
      "        GROUP BY ZZ.M_PRODUCT_ID, CATEGORY_NAME, PRODUCT_NAME, UOM_NAME, ISCOSTCALCULATED" +
      "        HAVING SUM(QTY) <>0" +
      "        ORDER BY CATEGORY_NAME, PRODUCT_NAME      ";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCurrencyConv);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, legalEntity);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, datePlus);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, datePlus);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, warehouse);
      if (categoryProduct != null && !(categoryProduct.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, categoryProduct);
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
        ReportValuationStockData objectReportValuationStockData = new ReportValuationStockData();
        objectReportValuationStockData.categoryName = UtilSql.getValue(result, "category_name");
        objectReportValuationStockData.mProductId = UtilSql.getValue(result, "m_product_id");
        objectReportValuationStockData.productName = UtilSql.getValue(result, "product_name");
        objectReportValuationStockData.qty = UtilSql.getValue(result, "qty");
        objectReportValuationStockData.uomName = UtilSql.getValue(result, "uom_name");
        objectReportValuationStockData.averageCost = UtilSql.getValue(result, "average_cost");
        objectReportValuationStockData.totalCost = UtilSql.getValue(result, "total_cost");
        objectReportValuationStockData.rownum = Long.toString(countRecord);
        objectReportValuationStockData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectReportValuationStockData);
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
    ReportValuationStockData objectReportValuationStockData[] = new ReportValuationStockData[vector.size()];
    vector.copyInto(objectReportValuationStockData);
    return(objectReportValuationStockData);
  }

  public static ReportValuationStockData[] set()    throws ServletException {
    ReportValuationStockData objectReportValuationStockData[] = new ReportValuationStockData[1];
    objectReportValuationStockData[0] = new ReportValuationStockData();
    objectReportValuationStockData[0].categoryName = "";
    objectReportValuationStockData[0].mProductId = "";
    objectReportValuationStockData[0].productName = "";
    objectReportValuationStockData[0].qty = "";
    objectReportValuationStockData[0].uomName = "";
    objectReportValuationStockData[0].averageCost = "";
    objectReportValuationStockData[0].totalCost = "";
    return objectReportValuationStockData;
  }
}
