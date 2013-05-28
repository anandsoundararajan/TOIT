//Sqlc generated V1.O00-1
package org.openbravo.erpWindows.BusinessPartnerCategory;

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
  public String cReceivableAcct;
  public String cPrepaymentAcct;
  public String writeoffAcct;
  public String writeoffRevAcct;
  public String isactive;
  public String vLiabilityAcct;
  public String vPrepaymentAcct;
  public String notinvoicedreceiptsAcct;
  public String processing;
  public String status;
  public String notinvoicedreceivablesAcct;
  public String notinvoicedrevenueAcct;
  public String paydiscountExpAcct;
  public String paydiscountRevAcct;
  public String realizedgainAcct;
  public String realizedlossAcct;
  public String unearnedrevenueAcct;
  public String unrealizedgainAcct;
  public String unrealizedlossAcct;
  public String vLiabilityServicesAcct;
  public String doubtfuldebtAcct;
  public String baddebtexpenseAcct;
  public String baddebtrevenueAcct;
  public String allowancefordoubtfulAcct;
  public String cBpGroupAcctId;
  public String cBpGroupId;
  public String adClientId;
  public String adOrgId;
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
    else if (fieldName.equalsIgnoreCase("c_receivable_acct") || fieldName.equals("cReceivableAcct"))
      return cReceivableAcct;
    else if (fieldName.equalsIgnoreCase("c_prepayment_acct") || fieldName.equals("cPrepaymentAcct"))
      return cPrepaymentAcct;
    else if (fieldName.equalsIgnoreCase("writeoff_acct") || fieldName.equals("writeoffAcct"))
      return writeoffAcct;
    else if (fieldName.equalsIgnoreCase("writeoff_rev_acct") || fieldName.equals("writeoffRevAcct"))
      return writeoffRevAcct;
    else if (fieldName.equalsIgnoreCase("isactive"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("v_liability_acct") || fieldName.equals("vLiabilityAcct"))
      return vLiabilityAcct;
    else if (fieldName.equalsIgnoreCase("v_prepayment_acct") || fieldName.equals("vPrepaymentAcct"))
      return vPrepaymentAcct;
    else if (fieldName.equalsIgnoreCase("notinvoicedreceipts_acct") || fieldName.equals("notinvoicedreceiptsAcct"))
      return notinvoicedreceiptsAcct;
    else if (fieldName.equalsIgnoreCase("processing"))
      return processing;
    else if (fieldName.equalsIgnoreCase("status"))
      return status;
    else if (fieldName.equalsIgnoreCase("notinvoicedreceivables_acct") || fieldName.equals("notinvoicedreceivablesAcct"))
      return notinvoicedreceivablesAcct;
    else if (fieldName.equalsIgnoreCase("notinvoicedrevenue_acct") || fieldName.equals("notinvoicedrevenueAcct"))
      return notinvoicedrevenueAcct;
    else if (fieldName.equalsIgnoreCase("paydiscount_exp_acct") || fieldName.equals("paydiscountExpAcct"))
      return paydiscountExpAcct;
    else if (fieldName.equalsIgnoreCase("paydiscount_rev_acct") || fieldName.equals("paydiscountRevAcct"))
      return paydiscountRevAcct;
    else if (fieldName.equalsIgnoreCase("realizedgain_acct") || fieldName.equals("realizedgainAcct"))
      return realizedgainAcct;
    else if (fieldName.equalsIgnoreCase("realizedloss_acct") || fieldName.equals("realizedlossAcct"))
      return realizedlossAcct;
    else if (fieldName.equalsIgnoreCase("unearnedrevenue_acct") || fieldName.equals("unearnedrevenueAcct"))
      return unearnedrevenueAcct;
    else if (fieldName.equalsIgnoreCase("unrealizedgain_acct") || fieldName.equals("unrealizedgainAcct"))
      return unrealizedgainAcct;
    else if (fieldName.equalsIgnoreCase("unrealizedloss_acct") || fieldName.equals("unrealizedlossAcct"))
      return unrealizedlossAcct;
    else if (fieldName.equalsIgnoreCase("v_liability_services_acct") || fieldName.equals("vLiabilityServicesAcct"))
      return vLiabilityServicesAcct;
    else if (fieldName.equalsIgnoreCase("doubtfuldebt_acct") || fieldName.equals("doubtfuldebtAcct"))
      return doubtfuldebtAcct;
    else if (fieldName.equalsIgnoreCase("baddebtexpense_acct") || fieldName.equals("baddebtexpenseAcct"))
      return baddebtexpenseAcct;
    else if (fieldName.equalsIgnoreCase("baddebtrevenue_acct") || fieldName.equals("baddebtrevenueAcct"))
      return baddebtrevenueAcct;
    else if (fieldName.equalsIgnoreCase("allowancefordoubtful_acct") || fieldName.equals("allowancefordoubtfulAcct"))
      return allowancefordoubtfulAcct;
    else if (fieldName.equalsIgnoreCase("c_bp_group_acct_id") || fieldName.equals("cBpGroupAcctId"))
      return cBpGroupAcctId;
    else if (fieldName.equalsIgnoreCase("c_bp_group_id") || fieldName.equals("cBpGroupId"))
      return cBpGroupId;
    else if (fieldName.equalsIgnoreCase("ad_client_id") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("ad_org_id") || fieldName.equals("adOrgId"))
      return adOrgId;
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
  public static AccountingData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String cBpGroupId, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, cBpGroupId, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static AccountingData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String cBpGroupId, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(C_BP_Group_Acct.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = C_BP_Group_Acct.CreatedBy) as CreatedByR, " +
      "        to_char(C_BP_Group_Acct.Updated, ?) as updated, " +
      "        to_char(C_BP_Group_Acct.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        C_BP_Group_Acct.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = C_BP_Group_Acct.UpdatedBy) as UpdatedByR," +
      "        C_BP_Group_Acct.C_AcctSchema_ID, " +
      "(CASE WHEN C_BP_Group_Acct.C_AcctSchema_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.Name), ''))),'') ) END) AS C_AcctSchema_IDR, " +
      "C_BP_Group_Acct.C_Receivable_Acct, " +
      "C_BP_Group_Acct.C_Prepayment_Acct, " +
      "C_BP_Group_Acct.WriteOff_Acct, " +
      "C_BP_Group_Acct.Writeoff_Rev_Acct, " +
      "COALESCE(C_BP_Group_Acct.IsActive, 'N') AS IsActive, " +
      "C_BP_Group_Acct.V_Liability_Acct, " +
      "C_BP_Group_Acct.V_Prepayment_Acct, " +
      "C_BP_Group_Acct.NotInvoicedReceipts_Acct, " +
      "C_BP_Group_Acct.Processing, " +
      "C_BP_Group_Acct.Status, " +
      "C_BP_Group_Acct.NotInvoicedReceivables_Acct, " +
      "C_BP_Group_Acct.NotInvoicedRevenue_Acct, " +
      "C_BP_Group_Acct.PayDiscount_Exp_Acct, " +
      "C_BP_Group_Acct.PayDiscount_Rev_Acct, " +
      "C_BP_Group_Acct.RealizedGain_Acct, " +
      "C_BP_Group_Acct.RealizedLoss_Acct, " +
      "C_BP_Group_Acct.UnEarnedRevenue_Acct, " +
      "C_BP_Group_Acct.UnrealizedGain_Acct, " +
      "C_BP_Group_Acct.UnrealizedLoss_Acct, " +
      "C_BP_Group_Acct.V_Liability_Services_Acct, " +
      "C_BP_Group_Acct.Doubtfuldebt_Acct, " +
      "C_BP_Group_Acct.BadDebtExpense_Acct, " +
      "C_BP_Group_Acct.Baddebtrevenue_Acct, " +
      "C_BP_Group_Acct.AllowanceForDoubtful_Acct, " +
      "C_BP_Group_Acct.C_Bp_Group_Acct_ID, " +
      "C_BP_Group_Acct.C_BP_Group_ID, " +
      "C_BP_Group_Acct.AD_Client_ID, " +
      "C_BP_Group_Acct.AD_Org_ID, " +
      "        ? AS LANGUAGE " +
      "        FROM C_BP_Group_Acct left join (select C_AcctSchema_ID, Name from C_AcctSchema) table1 on (C_BP_Group_Acct.C_AcctSchema_ID = table1.C_AcctSchema_ID)" +
      "        WHERE 2=2 " +
      "        AND 1=1 ";
    strSql = strSql + ((cBpGroupId==null || cBpGroupId.equals(""))?"":"  AND C_BP_Group_Acct.C_BP_Group_ID = ?  ");
    strSql = strSql + 
      "        AND C_BP_Group_Acct.C_Bp_Group_Acct_ID = ? " +
      "        AND C_BP_Group_Acct.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND C_BP_Group_Acct.AD_Org_ID IN (";
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
      if (cBpGroupId != null && !(cBpGroupId.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpGroupId);
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
        objectAccountingData.cReceivableAcct = UtilSql.getValue(result, "c_receivable_acct");
        objectAccountingData.cPrepaymentAcct = UtilSql.getValue(result, "c_prepayment_acct");
        objectAccountingData.writeoffAcct = UtilSql.getValue(result, "writeoff_acct");
        objectAccountingData.writeoffRevAcct = UtilSql.getValue(result, "writeoff_rev_acct");
        objectAccountingData.isactive = UtilSql.getValue(result, "isactive");
        objectAccountingData.vLiabilityAcct = UtilSql.getValue(result, "v_liability_acct");
        objectAccountingData.vPrepaymentAcct = UtilSql.getValue(result, "v_prepayment_acct");
        objectAccountingData.notinvoicedreceiptsAcct = UtilSql.getValue(result, "notinvoicedreceipts_acct");
        objectAccountingData.processing = UtilSql.getValue(result, "processing");
        objectAccountingData.status = UtilSql.getValue(result, "status");
        objectAccountingData.notinvoicedreceivablesAcct = UtilSql.getValue(result, "notinvoicedreceivables_acct");
        objectAccountingData.notinvoicedrevenueAcct = UtilSql.getValue(result, "notinvoicedrevenue_acct");
        objectAccountingData.paydiscountExpAcct = UtilSql.getValue(result, "paydiscount_exp_acct");
        objectAccountingData.paydiscountRevAcct = UtilSql.getValue(result, "paydiscount_rev_acct");
        objectAccountingData.realizedgainAcct = UtilSql.getValue(result, "realizedgain_acct");
        objectAccountingData.realizedlossAcct = UtilSql.getValue(result, "realizedloss_acct");
        objectAccountingData.unearnedrevenueAcct = UtilSql.getValue(result, "unearnedrevenue_acct");
        objectAccountingData.unrealizedgainAcct = UtilSql.getValue(result, "unrealizedgain_acct");
        objectAccountingData.unrealizedlossAcct = UtilSql.getValue(result, "unrealizedloss_acct");
        objectAccountingData.vLiabilityServicesAcct = UtilSql.getValue(result, "v_liability_services_acct");
        objectAccountingData.doubtfuldebtAcct = UtilSql.getValue(result, "doubtfuldebt_acct");
        objectAccountingData.baddebtexpenseAcct = UtilSql.getValue(result, "baddebtexpense_acct");
        objectAccountingData.baddebtrevenueAcct = UtilSql.getValue(result, "baddebtrevenue_acct");
        objectAccountingData.allowancefordoubtfulAcct = UtilSql.getValue(result, "allowancefordoubtful_acct");
        objectAccountingData.cBpGroupAcctId = UtilSql.getValue(result, "c_bp_group_acct_id");
        objectAccountingData.cBpGroupId = UtilSql.getValue(result, "c_bp_group_id");
        objectAccountingData.adClientId = UtilSql.getValue(result, "ad_client_id");
        objectAccountingData.adOrgId = UtilSql.getValue(result, "ad_org_id");
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
  public static AccountingData[] set(String cBpGroupId, String baddebtexpenseAcct, String baddebtrevenueAcct, String cAcctschemaId, String adClientId, String adOrgId, String isactive, String createdby, String createdbyr, String updatedby, String updatedbyr, String cReceivableAcct, String cPrepaymentAcct, String vLiabilityAcct, String vLiabilityServicesAcct, String vPrepaymentAcct, String paydiscountExpAcct, String paydiscountRevAcct, String writeoffAcct, String unrealizedgainAcct, String unrealizedlossAcct, String realizedgainAcct, String realizedlossAcct, String notinvoicedreceiptsAcct, String unearnedrevenueAcct, String notinvoicedrevenueAcct, String notinvoicedreceivablesAcct, String doubtfuldebtAcct, String processing, String allowancefordoubtfulAcct, String status, String cBpGroupAcctId, String writeoffRevAcct)    throws ServletException {
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
    objectAccountingData[0].cReceivableAcct = cReceivableAcct;
    objectAccountingData[0].cPrepaymentAcct = cPrepaymentAcct;
    objectAccountingData[0].writeoffAcct = writeoffAcct;
    objectAccountingData[0].writeoffRevAcct = writeoffRevAcct;
    objectAccountingData[0].isactive = isactive;
    objectAccountingData[0].vLiabilityAcct = vLiabilityAcct;
    objectAccountingData[0].vPrepaymentAcct = vPrepaymentAcct;
    objectAccountingData[0].notinvoicedreceiptsAcct = notinvoicedreceiptsAcct;
    objectAccountingData[0].processing = processing;
    objectAccountingData[0].status = status;
    objectAccountingData[0].notinvoicedreceivablesAcct = notinvoicedreceivablesAcct;
    objectAccountingData[0].notinvoicedrevenueAcct = notinvoicedrevenueAcct;
    objectAccountingData[0].paydiscountExpAcct = paydiscountExpAcct;
    objectAccountingData[0].paydiscountRevAcct = paydiscountRevAcct;
    objectAccountingData[0].realizedgainAcct = realizedgainAcct;
    objectAccountingData[0].realizedlossAcct = realizedlossAcct;
    objectAccountingData[0].unearnedrevenueAcct = unearnedrevenueAcct;
    objectAccountingData[0].unrealizedgainAcct = unrealizedgainAcct;
    objectAccountingData[0].unrealizedlossAcct = unrealizedlossAcct;
    objectAccountingData[0].vLiabilityServicesAcct = vLiabilityServicesAcct;
    objectAccountingData[0].doubtfuldebtAcct = doubtfuldebtAcct;
    objectAccountingData[0].baddebtexpenseAcct = baddebtexpenseAcct;
    objectAccountingData[0].baddebtrevenueAcct = baddebtrevenueAcct;
    objectAccountingData[0].allowancefordoubtfulAcct = allowancefordoubtfulAcct;
    objectAccountingData[0].cBpGroupAcctId = cBpGroupAcctId;
    objectAccountingData[0].cBpGroupId = cBpGroupId;
    objectAccountingData[0].adClientId = adClientId;
    objectAccountingData[0].adOrgId = adOrgId;
    objectAccountingData[0].language = "";
    return objectAccountingData;
  }

/**
Select for auxiliar field
 */
  public static String selectDef4979_0(ConnectionProvider connectionProvider, String CreatedByR)    throws ServletException {
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
  public static String selectDef4981_1(ConnectionProvider connectionProvider, String UpdatedByR)    throws ServletException {
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
      "        SELECT C_BP_Group_Acct.C_BP_Group_ID AS NAME" +
      "        FROM C_BP_Group_Acct" +
      "        WHERE C_BP_Group_Acct.C_Bp_Group_Acct_ID = ?";

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
  public static String selectParent(ConnectionProvider connectionProvider, String cBpGroupId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT (TO_CHAR(COALESCE(TO_CHAR(table1.Name), ''))) AS NAME FROM C_BP_Group left join (select C_BP_Group_ID, Name from C_BP_Group) table1 on (C_BP_Group.C_BP_Group_ID = table1.C_BP_Group_ID) WHERE C_BP_Group.C_BP_Group_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpGroupId);

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
  public static String selectParentTrl(ConnectionProvider connectionProvider, String cBpGroupId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT (TO_CHAR(COALESCE(TO_CHAR(table1.Name), ''))) AS NAME FROM C_BP_Group left join (select C_BP_Group_ID, Name from C_BP_Group) table1 on (C_BP_Group.C_BP_Group_ID = table1.C_BP_Group_ID) WHERE C_BP_Group.C_BP_Group_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpGroupId);

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
      "        UPDATE C_BP_Group_Acct" +
      "        SET C_AcctSchema_ID = (?) , C_Receivable_Acct = (?) , C_Prepayment_Acct = (?) , WriteOff_Acct = (?) , Writeoff_Rev_Acct = (?) , IsActive = (?) , V_Liability_Acct = (?) , V_Prepayment_Acct = (?) , NotInvoicedReceipts_Acct = (?) , Processing = (?) , Status = (?) , NotInvoicedReceivables_Acct = (?) , NotInvoicedRevenue_Acct = (?) , PayDiscount_Exp_Acct = (?) , PayDiscount_Rev_Acct = (?) , RealizedGain_Acct = (?) , RealizedLoss_Acct = (?) , UnEarnedRevenue_Acct = (?) , UnrealizedGain_Acct = (?) , UnrealizedLoss_Acct = (?) , V_Liability_Services_Acct = (?) , Doubtfuldebt_Acct = (?) , BadDebtExpense_Acct = (?) , Baddebtrevenue_Acct = (?) , AllowanceForDoubtful_Acct = (?) , C_Bp_Group_Acct_ID = (?) , C_BP_Group_ID = (?) , AD_Client_ID = (?) , AD_Org_ID = (?) , updated = now(), updatedby = ? " +
      "        WHERE C_BP_Group_Acct.C_Bp_Group_Acct_ID = ? " +
      "                 AND C_BP_Group_Acct.C_BP_Group_ID = ? " +
      "        AND C_BP_Group_Acct.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND C_BP_Group_Acct.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cAcctschemaId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cReceivableAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cPrepaymentAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, writeoffAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, writeoffRevAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, vLiabilityAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, vPrepaymentAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, notinvoicedreceiptsAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processing);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, status);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, notinvoicedreceivablesAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, notinvoicedrevenueAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paydiscountExpAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paydiscountRevAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, realizedgainAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, realizedlossAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, unearnedrevenueAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, unrealizedgainAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, unrealizedlossAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, vLiabilityServicesAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, doubtfuldebtAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, baddebtexpenseAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, baddebtrevenueAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, allowancefordoubtfulAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpGroupAcctId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpGroupId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpGroupAcctId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpGroupId);
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
      "        INSERT INTO C_BP_Group_Acct " +
      "        (C_AcctSchema_ID, C_Receivable_Acct, C_Prepayment_Acct, WriteOff_Acct, Writeoff_Rev_Acct, IsActive, V_Liability_Acct, V_Prepayment_Acct, NotInvoicedReceipts_Acct, Processing, Status, NotInvoicedReceivables_Acct, NotInvoicedRevenue_Acct, PayDiscount_Exp_Acct, PayDiscount_Rev_Acct, RealizedGain_Acct, RealizedLoss_Acct, UnEarnedRevenue_Acct, UnrealizedGain_Acct, UnrealizedLoss_Acct, V_Liability_Services_Acct, Doubtfuldebt_Acct, BadDebtExpense_Acct, Baddebtrevenue_Acct, AllowanceForDoubtful_Acct, C_Bp_Group_Acct_ID, C_BP_Group_ID, AD_Client_ID, AD_Org_ID, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cAcctschemaId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cReceivableAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cPrepaymentAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, writeoffAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, writeoffRevAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, vLiabilityAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, vPrepaymentAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, notinvoicedreceiptsAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processing);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, status);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, notinvoicedreceivablesAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, notinvoicedrevenueAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paydiscountExpAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paydiscountRevAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, realizedgainAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, realizedlossAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, unearnedrevenueAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, unrealizedgainAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, unrealizedlossAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, vLiabilityServicesAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, doubtfuldebtAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, baddebtexpenseAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, baddebtrevenueAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, allowancefordoubtfulAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpGroupAcctId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpGroupId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
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

  public static int delete(ConnectionProvider connectionProvider, String param1, String cBpGroupId, String adUserClient, String adOrgClient)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        DELETE FROM C_BP_Group_Acct" +
      "        WHERE C_BP_Group_Acct.C_Bp_Group_Acct_ID = ? " +
      "                 AND C_BP_Group_Acct.C_BP_Group_ID = ? " +
      "        AND C_BP_Group_Acct.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND C_BP_Group_Acct.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, param1);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpGroupId);
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
      "          FROM C_BP_Group_Acct" +
      "         WHERE C_BP_Group_Acct.C_Bp_Group_Acct_ID = ? ";

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
      "          FROM C_BP_Group_Acct" +
      "         WHERE C_BP_Group_Acct.C_Bp_Group_Acct_ID = ? ";

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
