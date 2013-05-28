//Sqlc generated V1.O00-1
package org.openbravo.erpWindows.ProductCategory;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import java.util.*;

/**
WAD Generated class
 */
class AccountingData implements FieldProvider {
static Logger log4j = Logger.getLogger(AccountingData.class);
  private String InitRecordNumber="0";
  public String created;
  public String createdbyr;
  public String updated;
  public String updatedTimeStamp;
  public String updatedby;
  public String updatedbyr;
  public String cAcctschemaId;
  public String cAcctschemaIdr;
  public String pAssetAcct;
  public String pExpenseAcct;
  public String pDefExpenseAcct;
  public String pRevenueAcct;
  public String pDefRevenueAcct;
  public String pCogsAcct;
  public String pInvoicepricevarianceAcct;
  public String pRevenueReturnAcct;
  public String pCogsReturnAcct;
  public String processing;
  public String pPurchasepricevarianceAcct;
  public String pTradediscountrecAcct;
  public String pTradediscountgrantAcct;
  public String mProductCategoryAcctId;
  public String mProductCategoryId;
  public String adOrgId;
  public String adClientId;
  public String isactive;
  public String language;
  public String adUserClient;
  public String adOrgClient;
  public String createdby;
  public String trBgcolor;
  public String totalCount;
  public String dateTimeFormat;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("created"))
      return created;
    else if (fieldName.equalsIgnoreCase("createdbyr"))
      return createdbyr;
    else if (fieldName.equalsIgnoreCase("updated"))
      return updated;
    else if (fieldName.equalsIgnoreCase("updated_time_stamp") || fieldName.equals("updatedTimeStamp"))
      return updatedTimeStamp;
    else if (fieldName.equalsIgnoreCase("updatedby"))
      return updatedby;
    else if (fieldName.equalsIgnoreCase("updatedbyr"))
      return updatedbyr;
    else if (fieldName.equalsIgnoreCase("c_acctschema_id") || fieldName.equals("cAcctschemaId"))
      return cAcctschemaId;
    else if (fieldName.equalsIgnoreCase("c_acctschema_idr") || fieldName.equals("cAcctschemaIdr"))
      return cAcctschemaIdr;
    else if (fieldName.equalsIgnoreCase("p_asset_acct") || fieldName.equals("pAssetAcct"))
      return pAssetAcct;
    else if (fieldName.equalsIgnoreCase("p_expense_acct") || fieldName.equals("pExpenseAcct"))
      return pExpenseAcct;
    else if (fieldName.equalsIgnoreCase("p_def_expense_acct") || fieldName.equals("pDefExpenseAcct"))
      return pDefExpenseAcct;
    else if (fieldName.equalsIgnoreCase("p_revenue_acct") || fieldName.equals("pRevenueAcct"))
      return pRevenueAcct;
    else if (fieldName.equalsIgnoreCase("p_def_revenue_acct") || fieldName.equals("pDefRevenueAcct"))
      return pDefRevenueAcct;
    else if (fieldName.equalsIgnoreCase("p_cogs_acct") || fieldName.equals("pCogsAcct"))
      return pCogsAcct;
    else if (fieldName.equalsIgnoreCase("p_invoicepricevariance_acct") || fieldName.equals("pInvoicepricevarianceAcct"))
      return pInvoicepricevarianceAcct;
    else if (fieldName.equalsIgnoreCase("p_revenue_return_acct") || fieldName.equals("pRevenueReturnAcct"))
      return pRevenueReturnAcct;
    else if (fieldName.equalsIgnoreCase("p_cogs_return_acct") || fieldName.equals("pCogsReturnAcct"))
      return pCogsReturnAcct;
    else if (fieldName.equalsIgnoreCase("processing"))
      return processing;
    else if (fieldName.equalsIgnoreCase("p_purchasepricevariance_acct") || fieldName.equals("pPurchasepricevarianceAcct"))
      return pPurchasepricevarianceAcct;
    else if (fieldName.equalsIgnoreCase("p_tradediscountrec_acct") || fieldName.equals("pTradediscountrecAcct"))
      return pTradediscountrecAcct;
    else if (fieldName.equalsIgnoreCase("p_tradediscountgrant_acct") || fieldName.equals("pTradediscountgrantAcct"))
      return pTradediscountgrantAcct;
    else if (fieldName.equalsIgnoreCase("m_product_category_acct_id") || fieldName.equals("mProductCategoryAcctId"))
      return mProductCategoryAcctId;
    else if (fieldName.equalsIgnoreCase("m_product_category_id") || fieldName.equals("mProductCategoryId"))
      return mProductCategoryId;
    else if (fieldName.equalsIgnoreCase("ad_org_id") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("ad_client_id") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("isactive"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("language"))
      return language;
    else if (fieldName.equals("adUserClient"))
      return adUserClient;
    else if (fieldName.equals("adOrgClient"))
      return adOrgClient;
    else if (fieldName.equals("createdby"))
      return createdby;
    else if (fieldName.equals("trBgcolor"))
      return trBgcolor;
    else if (fieldName.equals("totalCount"))
      return totalCount;
    else if (fieldName.equals("dateTimeFormat"))
      return dateTimeFormat;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

/**
Select for edit
 */
  public static AccountingData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String mProductCategoryId, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, mProductCategoryId, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static AccountingData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String mProductCategoryId, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(M_Product_Category_Acct.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = M_Product_Category_Acct.CreatedBy) as CreatedByR, " +
      "        to_char(M_Product_Category_Acct.Updated, ?) as updated, " +
      "        to_char(M_Product_Category_Acct.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        M_Product_Category_Acct.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = M_Product_Category_Acct.UpdatedBy) as UpdatedByR," +
      "        M_Product_Category_Acct.C_AcctSchema_ID, " +
      "(CASE WHEN M_Product_Category_Acct.C_AcctSchema_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.Name), ''))),'') ) END) AS C_AcctSchema_IDR, " +
      "M_Product_Category_Acct.P_Asset_Acct, " +
      "M_Product_Category_Acct.P_Expense_Acct, " +
      "M_Product_Category_Acct.P_Def_Expense_Acct, " +
      "M_Product_Category_Acct.P_Revenue_Acct, " +
      "M_Product_Category_Acct.P_Def_Revenue_Acct, " +
      "M_Product_Category_Acct.P_Cogs_Acct, " +
      "M_Product_Category_Acct.P_InvoicePriceVariance_Acct, " +
      "M_Product_Category_Acct.P_Revenue_Return_Acct, " +
      "M_Product_Category_Acct.P_Cogs_Return_Acct, " +
      "M_Product_Category_Acct.Processing, " +
      "M_Product_Category_Acct.P_PurchasePriceVariance_Acct, " +
      "M_Product_Category_Acct.P_TradeDiscountRec_Acct, " +
      "M_Product_Category_Acct.P_TradeDiscountGrant_Acct, " +
      "M_Product_Category_Acct.M_Product_Category_Acct_ID, " +
      "M_Product_Category_Acct.M_Product_Category_ID, " +
      "M_Product_Category_Acct.AD_Org_ID, " +
      "M_Product_Category_Acct.AD_Client_ID, " +
      "COALESCE(M_Product_Category_Acct.IsActive, 'N') AS IsActive, " +
      "        ? AS LANGUAGE " +
      "        FROM M_Product_Category_Acct left join (select C_AcctSchema_ID, Name from C_AcctSchema) table1 on (M_Product_Category_Acct.C_AcctSchema_ID = table1.C_AcctSchema_ID)" +
      "        WHERE 2=2 " +
      "        AND 1=1 ";
    strSql = strSql + ((mProductCategoryId==null || mProductCategoryId.equals(""))?"":"  AND M_Product_Category_Acct.M_Product_Category_ID = ?  ");
    strSql = strSql + 
      "        AND M_Product_Category_Acct.M_Product_Category_Acct_ID = ? " +
      "        AND M_Product_Category_Acct.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND M_Product_Category_Acct.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateTimeFormat);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateTimeFormat);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      if (mProductCategoryId != null && !(mProductCategoryId.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductCategoryId);
      }
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, key);
      if (adUserClient != null && !(adUserClient.equals(""))) {
        }
      if (adOrgClient != null && !(adOrgClient.equals(""))) {
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
        AccountingData objectAccountingData = new AccountingData();
        objectAccountingData.created = UtilSql.getValue(result, "created");
        objectAccountingData.createdbyr = UtilSql.getValue(result, "createdbyr");
        objectAccountingData.updated = UtilSql.getValue(result, "updated");
        objectAccountingData.updatedTimeStamp = UtilSql.getValue(result, "updated_time_stamp");
        objectAccountingData.updatedby = UtilSql.getValue(result, "updatedby");
        objectAccountingData.updatedbyr = UtilSql.getValue(result, "updatedbyr");
        objectAccountingData.cAcctschemaId = UtilSql.getValue(result, "c_acctschema_id");
        objectAccountingData.cAcctschemaIdr = UtilSql.getValue(result, "c_acctschema_idr");
        objectAccountingData.pAssetAcct = UtilSql.getValue(result, "p_asset_acct");
        objectAccountingData.pExpenseAcct = UtilSql.getValue(result, "p_expense_acct");
        objectAccountingData.pDefExpenseAcct = UtilSql.getValue(result, "p_def_expense_acct");
        objectAccountingData.pRevenueAcct = UtilSql.getValue(result, "p_revenue_acct");
        objectAccountingData.pDefRevenueAcct = UtilSql.getValue(result, "p_def_revenue_acct");
        objectAccountingData.pCogsAcct = UtilSql.getValue(result, "p_cogs_acct");
        objectAccountingData.pInvoicepricevarianceAcct = UtilSql.getValue(result, "p_invoicepricevariance_acct");
        objectAccountingData.pRevenueReturnAcct = UtilSql.getValue(result, "p_revenue_return_acct");
        objectAccountingData.pCogsReturnAcct = UtilSql.getValue(result, "p_cogs_return_acct");
        objectAccountingData.processing = UtilSql.getValue(result, "processing");
        objectAccountingData.pPurchasepricevarianceAcct = UtilSql.getValue(result, "p_purchasepricevariance_acct");
        objectAccountingData.pTradediscountrecAcct = UtilSql.getValue(result, "p_tradediscountrec_acct");
        objectAccountingData.pTradediscountgrantAcct = UtilSql.getValue(result, "p_tradediscountgrant_acct");
        objectAccountingData.mProductCategoryAcctId = UtilSql.getValue(result, "m_product_category_acct_id");
        objectAccountingData.mProductCategoryId = UtilSql.getValue(result, "m_product_category_id");
        objectAccountingData.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectAccountingData.adClientId = UtilSql.getValue(result, "ad_client_id");
        objectAccountingData.isactive = UtilSql.getValue(result, "isactive");
        objectAccountingData.language = UtilSql.getValue(result, "language");
        objectAccountingData.adUserClient = "";
        objectAccountingData.adOrgClient = "";
        objectAccountingData.createdby = "";
        objectAccountingData.trBgcolor = "";
        objectAccountingData.totalCount = "";
        objectAccountingData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectAccountingData);
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
    AccountingData objectAccountingData[] = new AccountingData[vector.size()];
    vector.copyInto(objectAccountingData);
    return(objectAccountingData);
  }

/**
Create a registry
 */
  public static AccountingData[] set(String mProductCategoryId, String pDefExpenseAcct, String cAcctschemaId, String adClientId, String adOrgId, String isactive, String createdby, String createdbyr, String updatedby, String updatedbyr, String pRevenueAcct, String pExpenseAcct, String pAssetAcct, String pCogsAcct, String pPurchasepricevarianceAcct, String processing, String mProductCategoryAcctId, String pInvoicepricevarianceAcct, String pTradediscountrecAcct, String pTradediscountgrantAcct, String pCogsReturnAcct, String pDefRevenueAcct, String pRevenueReturnAcct)    throws ServletException {
    AccountingData objectAccountingData[] = new AccountingData[1];
    objectAccountingData[0] = new AccountingData();
    objectAccountingData[0].created = "";
    objectAccountingData[0].createdbyr = createdbyr;
    objectAccountingData[0].updated = "";
    objectAccountingData[0].updatedTimeStamp = "";
    objectAccountingData[0].updatedby = updatedby;
    objectAccountingData[0].updatedbyr = updatedbyr;
    objectAccountingData[0].cAcctschemaId = cAcctschemaId;
    objectAccountingData[0].cAcctschemaIdr = "";
    objectAccountingData[0].pAssetAcct = pAssetAcct;
    objectAccountingData[0].pExpenseAcct = pExpenseAcct;
    objectAccountingData[0].pDefExpenseAcct = pDefExpenseAcct;
    objectAccountingData[0].pRevenueAcct = pRevenueAcct;
    objectAccountingData[0].pDefRevenueAcct = pDefRevenueAcct;
    objectAccountingData[0].pCogsAcct = pCogsAcct;
    objectAccountingData[0].pInvoicepricevarianceAcct = pInvoicepricevarianceAcct;
    objectAccountingData[0].pRevenueReturnAcct = pRevenueReturnAcct;
    objectAccountingData[0].pCogsReturnAcct = pCogsReturnAcct;
    objectAccountingData[0].processing = processing;
    objectAccountingData[0].pPurchasepricevarianceAcct = pPurchasepricevarianceAcct;
    objectAccountingData[0].pTradediscountrecAcct = pTradediscountrecAcct;
    objectAccountingData[0].pTradediscountgrantAcct = pTradediscountgrantAcct;
    objectAccountingData[0].mProductCategoryAcctId = mProductCategoryAcctId;
    objectAccountingData[0].mProductCategoryId = mProductCategoryId;
    objectAccountingData[0].adOrgId = adOrgId;
    objectAccountingData[0].adClientId = adClientId;
    objectAccountingData[0].isactive = isactive;
    objectAccountingData[0].language = "";
    return objectAccountingData;
  }

/**
Select for auxiliar field
 */
  public static String selectDef5116_0(ConnectionProvider connectionProvider, String CreatedByR)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Name), ''))), '') ) as CreatedBy FROM AD_User left join (select AD_User_ID, Name from AD_User) table2 on (AD_User.AD_User_ID = table2.AD_User_ID) WHERE AD_User.isActive='Y' AND AD_User.AD_User_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, CreatedByR);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "createdby");
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

/**
Select for auxiliar field
 */
  public static String selectDef5118_1(ConnectionProvider connectionProvider, String UpdatedByR)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Name), ''))), '') ) as UpdatedBy FROM AD_User left join (select AD_User_ID, Name from AD_User) table2 on (AD_User.AD_User_ID = table2.AD_User_ID) WHERE AD_User.isActive='Y' AND AD_User.AD_User_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, UpdatedByR);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "updatedby");
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

/**
return the parent ID
 */
  public static String selectParentID(ConnectionProvider connectionProvider, String key)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT M_Product_Category_Acct.M_Product_Category_ID AS NAME" +
      "        FROM M_Product_Category_Acct" +
      "        WHERE M_Product_Category_Acct.M_Product_Category_Acct_ID = ?";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, key);

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

/**
Select for parent field
 */
  public static String selectParent(ConnectionProvider connectionProvider, String mProductCategoryId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT (TO_CHAR(COALESCE(TO_CHAR(table1.Name), ''))) AS NAME FROM M_Product_Category left join (select M_Product_Category_ID, Name from M_Product_Category) table1 on (M_Product_Category.M_Product_Category_ID = table1.M_Product_Category_ID) WHERE M_Product_Category.M_Product_Category_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductCategoryId);

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

/**
Select for parent field
 */
  public static String selectParentTrl(ConnectionProvider connectionProvider, String mProductCategoryId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT (TO_CHAR(COALESCE(TO_CHAR(table1.Name), ''))) AS NAME FROM M_Product_Category left join (select M_Product_Category_ID, Name from M_Product_Category) table1 on (M_Product_Category.M_Product_Category_ID = table1.M_Product_Category_ID) WHERE M_Product_Category.M_Product_Category_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductCategoryId);

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

  public int update(Connection conn, ConnectionProvider connectionProvider)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        UPDATE M_Product_Category_Acct" +
      "        SET C_AcctSchema_ID = (?) , P_Asset_Acct = (?) , P_Expense_Acct = (?) , P_Def_Expense_Acct = (?) , P_Revenue_Acct = (?) , P_Def_Revenue_Acct = (?) , P_Cogs_Acct = (?) , P_InvoicePriceVariance_Acct = (?) , P_Revenue_Return_Acct = (?) , P_Cogs_Return_Acct = (?) , Processing = (?) , P_PurchasePriceVariance_Acct = (?) , P_TradeDiscountRec_Acct = (?) , P_TradeDiscountGrant_Acct = (?) , M_Product_Category_Acct_ID = (?) , M_Product_Category_ID = (?) , AD_Org_ID = (?) , AD_Client_ID = (?) , IsActive = (?) , updated = now(), updatedby = ? " +
      "        WHERE M_Product_Category_Acct.M_Product_Category_Acct_ID = ? " +
      "                 AND M_Product_Category_Acct.M_Product_Category_ID = ? " +
      "        AND M_Product_Category_Acct.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND M_Product_Category_Acct.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cAcctschemaId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pAssetAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pExpenseAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pDefExpenseAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pRevenueAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pDefRevenueAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pCogsAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pInvoicepricevarianceAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pRevenueReturnAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pCogsReturnAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processing);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pPurchasepricevarianceAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pTradediscountrecAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pTradediscountgrantAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductCategoryAcctId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductCategoryId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductCategoryAcctId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductCategoryId);
      if (adUserClient != null && !(adUserClient.equals(""))) {
        }
      if (adOrgClient != null && !(adOrgClient.equals(""))) {
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
        connectionProvider.releaseTransactionalPreparedStatement(st);
      } catch(Exception ignore){
        ignore.printStackTrace();
      }
    }
    return(updateCount);
  }

  public int insert(Connection conn, ConnectionProvider connectionProvider)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        INSERT INTO M_Product_Category_Acct " +
      "        (C_AcctSchema_ID, P_Asset_Acct, P_Expense_Acct, P_Def_Expense_Acct, P_Revenue_Acct, P_Def_Revenue_Acct, P_Cogs_Acct, P_InvoicePriceVariance_Acct, P_Revenue_Return_Acct, P_Cogs_Return_Acct, Processing, P_PurchasePriceVariance_Acct, P_TradeDiscountRec_Acct, P_TradeDiscountGrant_Acct, M_Product_Category_Acct_ID, M_Product_Category_ID, AD_Org_ID, AD_Client_ID, IsActive, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cAcctschemaId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pAssetAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pExpenseAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pDefExpenseAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pRevenueAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pDefRevenueAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pCogsAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pInvoicepricevarianceAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pRevenueReturnAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pCogsReturnAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processing);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pPurchasepricevarianceAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pTradediscountrecAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pTradediscountgrantAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductCategoryAcctId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductCategoryId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, createdby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);

      updateCount = st.executeUpdate();
    } catch(SQLException e){
      log4j.error("SQL error in query: " + strSql + "Exception:"+ e);
      throw new ServletException("@CODE=" + Integer.toString(e.getErrorCode()) + "@" + e.getMessage());
    } catch(Exception ex){
      log4j.error("Exception in query: " + strSql + "Exception:"+ ex);
      throw new ServletException("@CODE=@" + ex.getMessage());
    } finally {
      try {
        connectionProvider.releaseTransactionalPreparedStatement(st);
      } catch(Exception ignore){
        ignore.printStackTrace();
      }
    }
    return(updateCount);
  }

  public static int delete(ConnectionProvider connectionProvider, String param1, String mProductCategoryId, String adUserClient, String adOrgClient)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        DELETE FROM M_Product_Category_Acct" +
      "        WHERE M_Product_Category_Acct.M_Product_Category_Acct_ID = ? " +
      "                 AND M_Product_Category_Acct.M_Product_Category_ID = ? " +
      "        AND M_Product_Category_Acct.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND M_Product_Category_Acct.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, param1);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductCategoryId);
      if (adUserClient != null && !(adUserClient.equals(""))) {
        }
      if (adOrgClient != null && !(adOrgClient.equals(""))) {
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

/**
Select for relation
 */
  public static String selectOrg(ConnectionProvider connectionProvider, String id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT AD_ORG_ID" +
      "          FROM M_Product_Category_Acct" +
      "         WHERE M_Product_Category_Acct.M_Product_Category_Acct_ID = ? ";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, id);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "ad_org_id");
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

  public static String getCurrentDBTimestamp(ConnectionProvider connectionProvider, String id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp" +
      "          FROM M_Product_Category_Acct" +
      "         WHERE M_Product_Category_Acct.M_Product_Category_Acct_ID = ? ";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, id);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "updated_time_stamp");
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
