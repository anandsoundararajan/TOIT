//Sqlc generated V1.O00-1
package org.openbravo.erpCommon.ad_reports;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import java.util.*;
import org.openbravo.database.RDBMSIndependent;
import org.openbravo.exception.*;

class ReportParetoProductData implements FieldProvider {
static Logger log4j = Logger.getLogger(ReportParetoProductData.class);
  private String InitRecordNumber="0";
  public String orgid;
  public String searchkey;
  public String name;
  public String unit;
  public String qty;
  public String cost;
  public String value;
  public String percentage;
  public String isabc;
  public String padre;
  public String id;
  public String rownum;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("orgid"))
      return orgid;
    else if (fieldName.equalsIgnoreCase("searchkey"))
      return searchkey;
    else if (fieldName.equalsIgnoreCase("name"))
      return name;
    else if (fieldName.equalsIgnoreCase("unit"))
      return unit;
    else if (fieldName.equalsIgnoreCase("qty"))
      return qty;
    else if (fieldName.equalsIgnoreCase("cost"))
      return cost;
    else if (fieldName.equalsIgnoreCase("value"))
      return value;
    else if (fieldName.equalsIgnoreCase("percentage"))
      return percentage;
    else if (fieldName.equalsIgnoreCase("isabc"))
      return isabc;
    else if (fieldName.equalsIgnoreCase("padre"))
      return padre;
    else if (fieldName.equalsIgnoreCase("id"))
      return id;
    else if (fieldName.equals("rownum"))
      return rownum;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static ReportParetoProductData[] select(ConnectionProvider connectionProvider, String mWarehouseId, String adClientId, String language, String cCurrencyConv, String adOrgId)    throws ServletException {
    return select(connectionProvider, mWarehouseId, adClientId, language, cCurrencyConv, adOrgId, 0, 0);
  }

  public static ReportParetoProductData[] select(ConnectionProvider connectionProvider, String mWarehouseId, String adClientId, String language, String cCurrencyConv, String adOrgId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      select orgid, searchkey, name, unit, qty, cost, value, percentage," +
      "      m_get_pareto_abc(?, ad_org_id, ?, percentage) as isabc, '' as padre, '' as id" +
      "      from (" +
      "        select ad_column_identifier('AD_Org', ad_org_id, ?) as orgid," +
      "          value as searchkey, name as name," +
      "          ad_column_identifier('C_Uom', c_uom_id, ?) as unit," +
      "          ad_org_id, m_product_id, sum(movementqty) as qty," +
      "          sum(value_per_currency)/sum(movementqty) as cost, " +
      "          sum(value_per_currency) as value, " +
      "          100 * sum(value_per_currency) / (select sum(cost_per_currency)" +
      "                             from (" +
      "                                  select c_currency_convert_precision(sum(case when t.movementqty>=0 then tc.cost else -tc.cost end)," +
      "                                         tc.c_currency_id, ?, to_date(now()), null, ?, ad_get_org_le_bu (w.ad_org_id, 'LE')) as cost_per_currency," +
      "                                         sum(t.movementqty) as movementqty, w.m_warehouse_id" +
      "                                  from m_transaction_cost tc, m_transaction t" +
      "                                    left join m_locator l on (t.m_locator_id=l.m_locator_id)" +
      "                                    left join m_warehouse w on (l.m_warehouse_id=w.m_warehouse_id)" +
      "                                  where tc.m_transaction_id = t.m_transaction_id" +
      "                                    and t.iscostcalculated = 'Y'" +
      "                                    and t.transactioncost is not null" +
      "                                    and t.ad_client_id = ?" +
      "                                    and 1=1";
    strSql = strSql + ((mWarehouseId==null || mWarehouseId.equals(""))?"":"  AND l.M_WAREHOUSE_ID = ?  ");
    strSql = strSql + 
      "                                    and 2=2" +
      "                                    AND ad_isorgincluded(w.AD_ORG_ID, ?, w.ad_client_id) <> -1" +
      "                                  group by tc.c_currency_id, w.ad_org_id, w.ad_client_id, w.m_warehouse_id" +
      "                                ) a" +
      "                              where a.m_warehouse_id = warehouse" +
      "                              having sum(a.movementqty)>0" +
      "                            ) as percentage" +
      "        from (" +
      "          select w.ad_org_id, p.value, p.name, p.c_uom_id, sum(t.movementqty) as movementqty, p.m_product_id, w.m_warehouse_id as warehouse," +
      "                 c_currency_convert_precision(sum(case when t.movementqty>=0 then tc.cost else -tc.cost end)," +
      "                 tc.c_currency_id, ?, to_date(now()), null, ?, ad_get_org_le_bu (w.ad_org_id, 'LE')) as value_per_currency" +
      "          from m_transaction_cost tc, m_transaction t, m_locator l, m_warehouse w, m_product p" +
      "          where tc.m_transaction_id = t.m_transaction_id" +
      "            and t.m_locator_id = l.m_locator_id" +
      "            and l.m_warehouse_id = w.m_warehouse_id" +
      "            and t.m_product_id = p.m_product_id" +
      "            and t.iscostcalculated = 'Y'" +
      "            and t.transactioncost is not null" +
      "            and t.ad_client_id=?" +
      "            and w.ad_client_id=t.ad_client_id" +
      "            and 3=3";
    strSql = strSql + ((mWarehouseId==null || mWarehouseId.equals(""))?"":"  AND l.M_WAREHOUSE_ID = ?  ");
    strSql = strSql + 
      "            and 4=4" +
      "            AND ad_isorgincluded(w.AD_ORG_ID, ?, w.ad_client_id) <> -1" +
      "          group by w.ad_org_id, w.ad_client_id, p.m_product_id, tc.c_currency_id, p.name, p.value, p.c_uom_id, w.m_warehouse_id" +
      "          having sum(t.movementqty) > 0" +
      "        ) a" +
      "        group by ad_org_id, m_product_id, name, value, c_uom_id, warehouse" +
      "        order by orgid, percentage desc" +
      "      ) b";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mWarehouseId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, language);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, language);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCurrencyConv);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      if (mWarehouseId != null && !(mWarehouseId.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, mWarehouseId);
      }
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCurrencyConv);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      if (mWarehouseId != null && !(mWarehouseId.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, mWarehouseId);
      }
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);

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
        ReportParetoProductData objectReportParetoProductData = new ReportParetoProductData();
        objectReportParetoProductData.orgid = UtilSql.getValue(result, "orgid");
        objectReportParetoProductData.searchkey = UtilSql.getValue(result, "searchkey");
        objectReportParetoProductData.name = UtilSql.getValue(result, "name");
        objectReportParetoProductData.unit = UtilSql.getValue(result, "unit");
        objectReportParetoProductData.qty = UtilSql.getValue(result, "qty");
        objectReportParetoProductData.cost = UtilSql.getValue(result, "cost");
        objectReportParetoProductData.value = UtilSql.getValue(result, "value");
        objectReportParetoProductData.percentage = UtilSql.getValue(result, "percentage");
        objectReportParetoProductData.isabc = UtilSql.getValue(result, "isabc");
        objectReportParetoProductData.padre = UtilSql.getValue(result, "padre");
        objectReportParetoProductData.id = UtilSql.getValue(result, "id");
        objectReportParetoProductData.rownum = Long.toString(countRecord);
        objectReportParetoProductData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectReportParetoProductData);
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
    ReportParetoProductData objectReportParetoProductData[] = new ReportParetoProductData[vector.size()];
    vector.copyInto(objectReportParetoProductData);
    return(objectReportParetoProductData);
  }

  public static ReportParetoProductData[] set()    throws ServletException {
    ReportParetoProductData objectReportParetoProductData[] = new ReportParetoProductData[1];
    objectReportParetoProductData[0] = new ReportParetoProductData();
    objectReportParetoProductData[0].orgid = "";
    objectReportParetoProductData[0].searchkey = "";
    objectReportParetoProductData[0].name = "";
    objectReportParetoProductData[0].unit = "";
    objectReportParetoProductData[0].qty = "";
    objectReportParetoProductData[0].cost = "";
    objectReportParetoProductData[0].value = "";
    objectReportParetoProductData[0].percentage = "";
    objectReportParetoProductData[0].isabc = "";
    objectReportParetoProductData[0].padre = "";
    objectReportParetoProductData[0].id = "";
    return objectReportParetoProductData;
  }

  public static ReportParetoProductData[] selectWarehouseDouble(ConnectionProvider connectionProvider, String adUserClient)    throws ServletException {
    return selectWarehouseDouble(connectionProvider, adUserClient, 0, 0);
  }

  public static ReportParetoProductData[] selectWarehouseDouble(ConnectionProvider connectionProvider, String adUserClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT M_WAREHOUSE.AD_ORG_ID AS PADRE, M_WAREHOUSE.M_WAREHOUSE_ID AS ID, TO_CHAR(M_WAREHOUSE.NAME) AS NAME" +
      "        FROM M_WAREHOUSE" +
      "        WHERE 1=1" +
      "         AND M_WAREHOUSE.AD_Client_ID IN(";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ")" +
      "         UNION " +
      "        SELECT null AS PADRE, M_WAREHOUSE.M_WAREHOUSE_ID AS ID, TO_CHAR(M_WAREHOUSE.NAME) AS NAME" +
      "        FROM M_WAREHOUSE" +
      "        WHERE 2=2 AND M_WAREHOUSE.AD_Client_ID IN(";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ")    " +
      "        ORDER BY PADRE, NAME";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    try {
    st = connectionProvider.getPreparedStatement(strSql);
      if (adUserClient != null && !(adUserClient.equals(""))) {
        }
      if (adUserClient != null && !(adUserClient.equals(""))) {
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
        ReportParetoProductData objectReportParetoProductData = new ReportParetoProductData();
        objectReportParetoProductData.padre = UtilSql.getValue(result, "padre");
        objectReportParetoProductData.id = UtilSql.getValue(result, "id");
        objectReportParetoProductData.name = UtilSql.getValue(result, "name");
        objectReportParetoProductData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectReportParetoProductData);
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
    ReportParetoProductData objectReportParetoProductData[] = new ReportParetoProductData[vector.size()];
    vector.copyInto(objectReportParetoProductData);
    return(objectReportParetoProductData);
  }

  public static ReportParetoProductData mUpdateParetoProduct0(ConnectionProvider connectionProvider, String adPinstanceId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        CALL M_UPDATE_PARETO_PRODUCT0(?)";

    ReportParetoProductData objectReportParetoProductData = new ReportParetoProductData();
    CallableStatement st = null;
    if (connectionProvider.getRDBMS().equalsIgnoreCase("ORACLE")) {

    int iParameter = 0;
    try {
      st = connectionProvider.getCallableStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adPinstanceId);

      st.execute();
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
    }
    else {
      Vector<String> parametersData = new Vector<String>();
      Vector<String> parametersTypes = new Vector<String>();
      parametersData.addElement(adPinstanceId);
      parametersTypes.addElement("in");
      try {
      RDBMSIndependent.getCallableResult(null, connectionProvider, strSql, parametersData, parametersTypes, 0);
      } catch(SQLException e){
        log4j.error("SQL error in query: " + strSql + "Exception:"+ e);
        throw new ServletException("@CODE=" + Integer.toString(e.getErrorCode()) + "@" + e.getMessage());
      } catch(NoConnectionAvailableException ec){
        log4j.error("Connection error in query: " + strSql + "Exception:"+ ec);
        throw new ServletException("@CODE=NoConnectionAvailable");
      } catch(PoolNotFoundException ep){
        log4j.error("Pool error in query: " + strSql + "Exception:"+ ep);
        throw new ServletException("@CODE=NoConnectionAvailable");
      } catch(Exception ex){
        log4j.error("Exception in query: " + strSql + "Exception:"+ ex);
        throw new ServletException("@CODE=@" + ex.getMessage());
      }
    }
    return(objectReportParetoProductData);
  }
}
