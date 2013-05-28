//Sqlc generated V1.O00-1
package org.openbravo.erpWindows.GeneralLedgerConfiguration;

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
class DefaultsData implements FieldProvider {
static Logger log4j = Logger.getLogger(DefaultsData.class);
  private String InitRecordNumber="0";
  public String created;
  public String createdbyr;
  public String updated;
  public String updatedTimeStamp;
  public String updatedby;
  public String updatedbyr;
  public String cReceivableAcct;
  public String cPrepaymentAcct;
  public String writeoffAcct;
  public String writeoffRevAcct;
  public String vLiabilityAcct;
  public String vPrepaymentAcct;
  public String notinvoicedreceiptsAcct;
  public String doubtfuldebtAcct;
  public String baddebtexpenseAcct;
  public String baddebtrevenueAcct;
  public String allowancefordoubtfulAcct;
  public String pAssetAcct;
  public String pExpenseAcct;
  public String pDefExpenseAcct;
  public String pRevenueAcct;
  public String pDefRevenueAcct;
  public String withholdingAcct;
  public String pCogsAcct;
  public String pInvoicepricevarianceAcct;
  public String pRevenueReturnAcct;
  public String pCogsReturnAcct;
  public String wInventoryAcct;
  public String wDifferencesAcct;
  public String wRevaluationAcct;
  public String pjWipAcct;
  public String bAssetAcct;
  public String bIntransitAcct;
  public String bExpenseAcct;
  public String bRevaluationgainAcct;
  public String bRevaluationlossAcct;
  public String tDueAcct;
  public String tCreditAcct;
  public String chExpenseAcct;
  public String cbAssetAcct;
  public String cbDifferencesAcct;
  public String cbCashtransferAcct;
  public String cbExpenseAcct;
  public String cbReceiptAcct;
  public String aDepreciationAcct;
  public String bPaymentselectAcct;
  public String aAccumdepreciationAcct;
  public String processing;
  public String eExpenseAcct;
  public String ePrepaymentAcct;
  public String pjAssetAcct;
  public String vLiabilityServicesAcct;
  public String notinvoicedrevenueAcct;
  public String pPurchasepricevarianceAcct;
  public String paydiscountExpAcct;
  public String paydiscountRevAcct;
  public String unrealizedgainAcct;
  public String unrealizedlossAcct;
  public String realizedgainAcct;
  public String realizedlossAcct;
  public String tExpenseAcct;
  public String tLiabilityAcct;
  public String tReceivablesAcct;
  public String bInterestrevAcct;
  public String bInterestexpAcct;
  public String bUnidentifiedAcct;
  public String bSettlementgainAcct;
  public String chRevenueAcct;
  public String unearnedrevenueAcct;
  public String notinvoicedreceivablesAcct;
  public String pTradediscountrecAcct;
  public String pTradediscountgrantAcct;
  public String wInvactualadjustAcct;
  public String bUnallocatedcashAcct;
  public String bSettlementlossAcct;
  public String aDisposalGain;
  public String cAcctschemaDefaultId;
  public String adClientId;
  public String aDisposalLoss;
  public String isactive;
  public String cAcctschemaId;
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
    else if (fieldName.equalsIgnoreCase("c_receivable_acct") || fieldName.equals("cReceivableAcct"))
      return cReceivableAcct;
    else if (fieldName.equalsIgnoreCase("c_prepayment_acct") || fieldName.equals("cPrepaymentAcct"))
      return cPrepaymentAcct;
    else if (fieldName.equalsIgnoreCase("writeoff_acct") || fieldName.equals("writeoffAcct"))
      return writeoffAcct;
    else if (fieldName.equalsIgnoreCase("writeoff_rev_acct") || fieldName.equals("writeoffRevAcct"))
      return writeoffRevAcct;
    else if (fieldName.equalsIgnoreCase("v_liability_acct") || fieldName.equals("vLiabilityAcct"))
      return vLiabilityAcct;
    else if (fieldName.equalsIgnoreCase("v_prepayment_acct") || fieldName.equals("vPrepaymentAcct"))
      return vPrepaymentAcct;
    else if (fieldName.equalsIgnoreCase("notinvoicedreceipts_acct") || fieldName.equals("notinvoicedreceiptsAcct"))
      return notinvoicedreceiptsAcct;
    else if (fieldName.equalsIgnoreCase("doubtfuldebt_acct") || fieldName.equals("doubtfuldebtAcct"))
      return doubtfuldebtAcct;
    else if (fieldName.equalsIgnoreCase("baddebtexpense_acct") || fieldName.equals("baddebtexpenseAcct"))
      return baddebtexpenseAcct;
    else if (fieldName.equalsIgnoreCase("baddebtrevenue_acct") || fieldName.equals("baddebtrevenueAcct"))
      return baddebtrevenueAcct;
    else if (fieldName.equalsIgnoreCase("allowancefordoubtful_acct") || fieldName.equals("allowancefordoubtfulAcct"))
      return allowancefordoubtfulAcct;
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
    else if (fieldName.equalsIgnoreCase("withholding_acct") || fieldName.equals("withholdingAcct"))
      return withholdingAcct;
    else if (fieldName.equalsIgnoreCase("p_cogs_acct") || fieldName.equals("pCogsAcct"))
      return pCogsAcct;
    else if (fieldName.equalsIgnoreCase("p_invoicepricevariance_acct") || fieldName.equals("pInvoicepricevarianceAcct"))
      return pInvoicepricevarianceAcct;
    else if (fieldName.equalsIgnoreCase("p_revenue_return_acct") || fieldName.equals("pRevenueReturnAcct"))
      return pRevenueReturnAcct;
    else if (fieldName.equalsIgnoreCase("p_cogs_return_acct") || fieldName.equals("pCogsReturnAcct"))
      return pCogsReturnAcct;
    else if (fieldName.equalsIgnoreCase("w_inventory_acct") || fieldName.equals("wInventoryAcct"))
      return wInventoryAcct;
    else if (fieldName.equalsIgnoreCase("w_differences_acct") || fieldName.equals("wDifferencesAcct"))
      return wDifferencesAcct;
    else if (fieldName.equalsIgnoreCase("w_revaluation_acct") || fieldName.equals("wRevaluationAcct"))
      return wRevaluationAcct;
    else if (fieldName.equalsIgnoreCase("pj_wip_acct") || fieldName.equals("pjWipAcct"))
      return pjWipAcct;
    else if (fieldName.equalsIgnoreCase("b_asset_acct") || fieldName.equals("bAssetAcct"))
      return bAssetAcct;
    else if (fieldName.equalsIgnoreCase("b_intransit_acct") || fieldName.equals("bIntransitAcct"))
      return bIntransitAcct;
    else if (fieldName.equalsIgnoreCase("b_expense_acct") || fieldName.equals("bExpenseAcct"))
      return bExpenseAcct;
    else if (fieldName.equalsIgnoreCase("b_revaluationgain_acct") || fieldName.equals("bRevaluationgainAcct"))
      return bRevaluationgainAcct;
    else if (fieldName.equalsIgnoreCase("b_revaluationloss_acct") || fieldName.equals("bRevaluationlossAcct"))
      return bRevaluationlossAcct;
    else if (fieldName.equalsIgnoreCase("t_due_acct") || fieldName.equals("tDueAcct"))
      return tDueAcct;
    else if (fieldName.equalsIgnoreCase("t_credit_acct") || fieldName.equals("tCreditAcct"))
      return tCreditAcct;
    else if (fieldName.equalsIgnoreCase("ch_expense_acct") || fieldName.equals("chExpenseAcct"))
      return chExpenseAcct;
    else if (fieldName.equalsIgnoreCase("cb_asset_acct") || fieldName.equals("cbAssetAcct"))
      return cbAssetAcct;
    else if (fieldName.equalsIgnoreCase("cb_differences_acct") || fieldName.equals("cbDifferencesAcct"))
      return cbDifferencesAcct;
    else if (fieldName.equalsIgnoreCase("cb_cashtransfer_acct") || fieldName.equals("cbCashtransferAcct"))
      return cbCashtransferAcct;
    else if (fieldName.equalsIgnoreCase("cb_expense_acct") || fieldName.equals("cbExpenseAcct"))
      return cbExpenseAcct;
    else if (fieldName.equalsIgnoreCase("cb_receipt_acct") || fieldName.equals("cbReceiptAcct"))
      return cbReceiptAcct;
    else if (fieldName.equalsIgnoreCase("a_depreciation_acct") || fieldName.equals("aDepreciationAcct"))
      return aDepreciationAcct;
    else if (fieldName.equalsIgnoreCase("b_paymentselect_acct") || fieldName.equals("bPaymentselectAcct"))
      return bPaymentselectAcct;
    else if (fieldName.equalsIgnoreCase("a_accumdepreciation_acct") || fieldName.equals("aAccumdepreciationAcct"))
      return aAccumdepreciationAcct;
    else if (fieldName.equalsIgnoreCase("processing"))
      return processing;
    else if (fieldName.equalsIgnoreCase("e_expense_acct") || fieldName.equals("eExpenseAcct"))
      return eExpenseAcct;
    else if (fieldName.equalsIgnoreCase("e_prepayment_acct") || fieldName.equals("ePrepaymentAcct"))
      return ePrepaymentAcct;
    else if (fieldName.equalsIgnoreCase("pj_asset_acct") || fieldName.equals("pjAssetAcct"))
      return pjAssetAcct;
    else if (fieldName.equalsIgnoreCase("v_liability_services_acct") || fieldName.equals("vLiabilityServicesAcct"))
      return vLiabilityServicesAcct;
    else if (fieldName.equalsIgnoreCase("notinvoicedrevenue_acct") || fieldName.equals("notinvoicedrevenueAcct"))
      return notinvoicedrevenueAcct;
    else if (fieldName.equalsIgnoreCase("p_purchasepricevariance_acct") || fieldName.equals("pPurchasepricevarianceAcct"))
      return pPurchasepricevarianceAcct;
    else if (fieldName.equalsIgnoreCase("paydiscount_exp_acct") || fieldName.equals("paydiscountExpAcct"))
      return paydiscountExpAcct;
    else if (fieldName.equalsIgnoreCase("paydiscount_rev_acct") || fieldName.equals("paydiscountRevAcct"))
      return paydiscountRevAcct;
    else if (fieldName.equalsIgnoreCase("unrealizedgain_acct") || fieldName.equals("unrealizedgainAcct"))
      return unrealizedgainAcct;
    else if (fieldName.equalsIgnoreCase("unrealizedloss_acct") || fieldName.equals("unrealizedlossAcct"))
      return unrealizedlossAcct;
    else if (fieldName.equalsIgnoreCase("realizedgain_acct") || fieldName.equals("realizedgainAcct"))
      return realizedgainAcct;
    else if (fieldName.equalsIgnoreCase("realizedloss_acct") || fieldName.equals("realizedlossAcct"))
      return realizedlossAcct;
    else if (fieldName.equalsIgnoreCase("t_expense_acct") || fieldName.equals("tExpenseAcct"))
      return tExpenseAcct;
    else if (fieldName.equalsIgnoreCase("t_liability_acct") || fieldName.equals("tLiabilityAcct"))
      return tLiabilityAcct;
    else if (fieldName.equalsIgnoreCase("t_receivables_acct") || fieldName.equals("tReceivablesAcct"))
      return tReceivablesAcct;
    else if (fieldName.equalsIgnoreCase("b_interestrev_acct") || fieldName.equals("bInterestrevAcct"))
      return bInterestrevAcct;
    else if (fieldName.equalsIgnoreCase("b_interestexp_acct") || fieldName.equals("bInterestexpAcct"))
      return bInterestexpAcct;
    else if (fieldName.equalsIgnoreCase("b_unidentified_acct") || fieldName.equals("bUnidentifiedAcct"))
      return bUnidentifiedAcct;
    else if (fieldName.equalsIgnoreCase("b_settlementgain_acct") || fieldName.equals("bSettlementgainAcct"))
      return bSettlementgainAcct;
    else if (fieldName.equalsIgnoreCase("ch_revenue_acct") || fieldName.equals("chRevenueAcct"))
      return chRevenueAcct;
    else if (fieldName.equalsIgnoreCase("unearnedrevenue_acct") || fieldName.equals("unearnedrevenueAcct"))
      return unearnedrevenueAcct;
    else if (fieldName.equalsIgnoreCase("notinvoicedreceivables_acct") || fieldName.equals("notinvoicedreceivablesAcct"))
      return notinvoicedreceivablesAcct;
    else if (fieldName.equalsIgnoreCase("p_tradediscountrec_acct") || fieldName.equals("pTradediscountrecAcct"))
      return pTradediscountrecAcct;
    else if (fieldName.equalsIgnoreCase("p_tradediscountgrant_acct") || fieldName.equals("pTradediscountgrantAcct"))
      return pTradediscountgrantAcct;
    else if (fieldName.equalsIgnoreCase("w_invactualadjust_acct") || fieldName.equals("wInvactualadjustAcct"))
      return wInvactualadjustAcct;
    else if (fieldName.equalsIgnoreCase("b_unallocatedcash_acct") || fieldName.equals("bUnallocatedcashAcct"))
      return bUnallocatedcashAcct;
    else if (fieldName.equalsIgnoreCase("b_settlementloss_acct") || fieldName.equals("bSettlementlossAcct"))
      return bSettlementlossAcct;
    else if (fieldName.equalsIgnoreCase("a_disposal_gain") || fieldName.equals("aDisposalGain"))
      return aDisposalGain;
    else if (fieldName.equalsIgnoreCase("c_acctschema_default_id") || fieldName.equals("cAcctschemaDefaultId"))
      return cAcctschemaDefaultId;
    else if (fieldName.equalsIgnoreCase("ad_client_id") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("a_disposal_loss") || fieldName.equals("aDisposalLoss"))
      return aDisposalLoss;
    else if (fieldName.equalsIgnoreCase("isactive"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("c_acctschema_id") || fieldName.equals("cAcctschemaId"))
      return cAcctschemaId;
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
  public static DefaultsData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String cAcctschemaId, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, cAcctschemaId, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static DefaultsData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String cAcctschemaId, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(C_AcctSchema_Default.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = C_AcctSchema_Default.CreatedBy) as CreatedByR, " +
      "        to_char(C_AcctSchema_Default.Updated, ?) as updated, " +
      "        to_char(C_AcctSchema_Default.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        C_AcctSchema_Default.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = C_AcctSchema_Default.UpdatedBy) as UpdatedByR," +
      "        C_AcctSchema_Default.C_Receivable_Acct, " +
      "C_AcctSchema_Default.C_Prepayment_Acct, " +
      "C_AcctSchema_Default.WriteOff_Acct, " +
      "C_AcctSchema_Default.Writeoff_Rev_Acct, " +
      "C_AcctSchema_Default.V_Liability_Acct, " +
      "C_AcctSchema_Default.V_Prepayment_Acct, " +
      "C_AcctSchema_Default.NotInvoicedReceipts_Acct, " +
      "C_AcctSchema_Default.DoubtfulDebt_Acct, " +
      "C_AcctSchema_Default.Baddebtexpense_Acct, " +
      "C_AcctSchema_Default.BadDebtRevenue_Acct, " +
      "C_AcctSchema_Default.Allowancefordoubtful_Acct, " +
      "C_AcctSchema_Default.P_Asset_Acct, " +
      "C_AcctSchema_Default.P_Expense_Acct, " +
      "C_AcctSchema_Default.P_Def_Expense_Acct, " +
      "C_AcctSchema_Default.P_Revenue_Acct, " +
      "C_AcctSchema_Default.P_Def_Revenue_Acct, " +
      "C_AcctSchema_Default.Withholding_Acct, " +
      "C_AcctSchema_Default.P_Cogs_Acct, " +
      "C_AcctSchema_Default.P_InvoicePriceVariance_Acct, " +
      "C_AcctSchema_Default.P_Revenue_Return_Acct, " +
      "C_AcctSchema_Default.P_Cogs_Return_Acct, " +
      "C_AcctSchema_Default.W_Inventory_Acct, " +
      "C_AcctSchema_Default.W_Differences_Acct, " +
      "C_AcctSchema_Default.W_Revaluation_Acct, " +
      "C_AcctSchema_Default.PJ_WIP_Acct, " +
      "C_AcctSchema_Default.B_Asset_Acct, " +
      "C_AcctSchema_Default.B_InTransit_Acct, " +
      "C_AcctSchema_Default.B_Expense_Acct, " +
      "C_AcctSchema_Default.B_RevaluationGain_Acct, " +
      "C_AcctSchema_Default.B_RevaluationLoss_Acct, " +
      "C_AcctSchema_Default.T_Due_Acct, " +
      "C_AcctSchema_Default.T_Credit_Acct, " +
      "C_AcctSchema_Default.Ch_Expense_Acct, " +
      "C_AcctSchema_Default.CB_Asset_Acct, " +
      "C_AcctSchema_Default.CB_Differences_Acct, " +
      "C_AcctSchema_Default.CB_CashTransfer_Acct, " +
      "C_AcctSchema_Default.CB_Expense_Acct, " +
      "C_AcctSchema_Default.CB_Receipt_Acct, " +
      "C_AcctSchema_Default.A_Depreciation_Acct, " +
      "C_AcctSchema_Default.B_PaymentSelect_Acct, " +
      "C_AcctSchema_Default.A_Accumdepreciation_Acct, " +
      "C_AcctSchema_Default.Processing, " +
      "C_AcctSchema_Default.E_Expense_Acct, " +
      "C_AcctSchema_Default.E_Prepayment_Acct, " +
      "C_AcctSchema_Default.PJ_Asset_Acct, " +
      "C_AcctSchema_Default.V_Liability_Services_Acct, " +
      "C_AcctSchema_Default.NotInvoicedRevenue_Acct, " +
      "C_AcctSchema_Default.P_PurchasePriceVariance_Acct, " +
      "C_AcctSchema_Default.PayDiscount_Exp_Acct, " +
      "C_AcctSchema_Default.PayDiscount_Rev_Acct, " +
      "C_AcctSchema_Default.UnrealizedGain_Acct, " +
      "C_AcctSchema_Default.UnrealizedLoss_Acct, " +
      "C_AcctSchema_Default.RealizedGain_Acct, " +
      "C_AcctSchema_Default.RealizedLoss_Acct, " +
      "C_AcctSchema_Default.T_Expense_Acct, " +
      "C_AcctSchema_Default.T_Liability_Acct, " +
      "C_AcctSchema_Default.T_Receivables_Acct, " +
      "C_AcctSchema_Default.B_InterestRev_Acct, " +
      "C_AcctSchema_Default.B_InterestExp_Acct, " +
      "C_AcctSchema_Default.B_Unidentified_Acct, " +
      "C_AcctSchema_Default.B_SettlementGain_Acct, " +
      "C_AcctSchema_Default.Ch_Revenue_Acct, " +
      "C_AcctSchema_Default.UnEarnedRevenue_Acct, " +
      "C_AcctSchema_Default.NotInvoicedReceivables_Acct, " +
      "C_AcctSchema_Default.P_TradeDiscountRec_Acct, " +
      "C_AcctSchema_Default.P_TradeDiscountGrant_Acct, " +
      "C_AcctSchema_Default.W_InvActualAdjust_Acct, " +
      "C_AcctSchema_Default.B_UnallocatedCash_Acct, " +
      "C_AcctSchema_Default.B_SettlementLoss_Acct, " +
      "C_AcctSchema_Default.A_Disposal_Gain, " +
      "C_AcctSchema_Default.C_Acctschema_Default_ID, " +
      "C_AcctSchema_Default.AD_Client_ID, " +
      "C_AcctSchema_Default.A_Disposal_Loss, " +
      "COALESCE(C_AcctSchema_Default.IsActive, 'N') AS IsActive, " +
      "C_AcctSchema_Default.C_AcctSchema_ID, " +
      "C_AcctSchema_Default.AD_Org_ID, " +
      "        ? AS LANGUAGE " +
      "        FROM C_AcctSchema_Default" +
      "        WHERE 2=2 " +
      "        AND 1=1 ";
    strSql = strSql + ((cAcctschemaId==null || cAcctschemaId.equals(""))?"":"  AND C_AcctSchema_Default.C_AcctSchema_ID = ?  ");
    strSql = strSql + 
      "        AND C_AcctSchema_Default.C_Acctschema_Default_ID = ? " +
      "        AND C_AcctSchema_Default.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND C_AcctSchema_Default.AD_Org_ID IN (";
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
      if (cAcctschemaId != null && !(cAcctschemaId.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, cAcctschemaId);
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
        DefaultsData objectDefaultsData = new DefaultsData();
        objectDefaultsData.created = UtilSql.getValue(result, "created");
        objectDefaultsData.createdbyr = UtilSql.getValue(result, "createdbyr");
        objectDefaultsData.updated = UtilSql.getValue(result, "updated");
        objectDefaultsData.updatedTimeStamp = UtilSql.getValue(result, "updated_time_stamp");
        objectDefaultsData.updatedby = UtilSql.getValue(result, "updatedby");
        objectDefaultsData.updatedbyr = UtilSql.getValue(result, "updatedbyr");
        objectDefaultsData.cReceivableAcct = UtilSql.getValue(result, "c_receivable_acct");
        objectDefaultsData.cPrepaymentAcct = UtilSql.getValue(result, "c_prepayment_acct");
        objectDefaultsData.writeoffAcct = UtilSql.getValue(result, "writeoff_acct");
        objectDefaultsData.writeoffRevAcct = UtilSql.getValue(result, "writeoff_rev_acct");
        objectDefaultsData.vLiabilityAcct = UtilSql.getValue(result, "v_liability_acct");
        objectDefaultsData.vPrepaymentAcct = UtilSql.getValue(result, "v_prepayment_acct");
        objectDefaultsData.notinvoicedreceiptsAcct = UtilSql.getValue(result, "notinvoicedreceipts_acct");
        objectDefaultsData.doubtfuldebtAcct = UtilSql.getValue(result, "doubtfuldebt_acct");
        objectDefaultsData.baddebtexpenseAcct = UtilSql.getValue(result, "baddebtexpense_acct");
        objectDefaultsData.baddebtrevenueAcct = UtilSql.getValue(result, "baddebtrevenue_acct");
        objectDefaultsData.allowancefordoubtfulAcct = UtilSql.getValue(result, "allowancefordoubtful_acct");
        objectDefaultsData.pAssetAcct = UtilSql.getValue(result, "p_asset_acct");
        objectDefaultsData.pExpenseAcct = UtilSql.getValue(result, "p_expense_acct");
        objectDefaultsData.pDefExpenseAcct = UtilSql.getValue(result, "p_def_expense_acct");
        objectDefaultsData.pRevenueAcct = UtilSql.getValue(result, "p_revenue_acct");
        objectDefaultsData.pDefRevenueAcct = UtilSql.getValue(result, "p_def_revenue_acct");
        objectDefaultsData.withholdingAcct = UtilSql.getValue(result, "withholding_acct");
        objectDefaultsData.pCogsAcct = UtilSql.getValue(result, "p_cogs_acct");
        objectDefaultsData.pInvoicepricevarianceAcct = UtilSql.getValue(result, "p_invoicepricevariance_acct");
        objectDefaultsData.pRevenueReturnAcct = UtilSql.getValue(result, "p_revenue_return_acct");
        objectDefaultsData.pCogsReturnAcct = UtilSql.getValue(result, "p_cogs_return_acct");
        objectDefaultsData.wInventoryAcct = UtilSql.getValue(result, "w_inventory_acct");
        objectDefaultsData.wDifferencesAcct = UtilSql.getValue(result, "w_differences_acct");
        objectDefaultsData.wRevaluationAcct = UtilSql.getValue(result, "w_revaluation_acct");
        objectDefaultsData.pjWipAcct = UtilSql.getValue(result, "pj_wip_acct");
        objectDefaultsData.bAssetAcct = UtilSql.getValue(result, "b_asset_acct");
        objectDefaultsData.bIntransitAcct = UtilSql.getValue(result, "b_intransit_acct");
        objectDefaultsData.bExpenseAcct = UtilSql.getValue(result, "b_expense_acct");
        objectDefaultsData.bRevaluationgainAcct = UtilSql.getValue(result, "b_revaluationgain_acct");
        objectDefaultsData.bRevaluationlossAcct = UtilSql.getValue(result, "b_revaluationloss_acct");
        objectDefaultsData.tDueAcct = UtilSql.getValue(result, "t_due_acct");
        objectDefaultsData.tCreditAcct = UtilSql.getValue(result, "t_credit_acct");
        objectDefaultsData.chExpenseAcct = UtilSql.getValue(result, "ch_expense_acct");
        objectDefaultsData.cbAssetAcct = UtilSql.getValue(result, "cb_asset_acct");
        objectDefaultsData.cbDifferencesAcct = UtilSql.getValue(result, "cb_differences_acct");
        objectDefaultsData.cbCashtransferAcct = UtilSql.getValue(result, "cb_cashtransfer_acct");
        objectDefaultsData.cbExpenseAcct = UtilSql.getValue(result, "cb_expense_acct");
        objectDefaultsData.cbReceiptAcct = UtilSql.getValue(result, "cb_receipt_acct");
        objectDefaultsData.aDepreciationAcct = UtilSql.getValue(result, "a_depreciation_acct");
        objectDefaultsData.bPaymentselectAcct = UtilSql.getValue(result, "b_paymentselect_acct");
        objectDefaultsData.aAccumdepreciationAcct = UtilSql.getValue(result, "a_accumdepreciation_acct");
        objectDefaultsData.processing = UtilSql.getValue(result, "processing");
        objectDefaultsData.eExpenseAcct = UtilSql.getValue(result, "e_expense_acct");
        objectDefaultsData.ePrepaymentAcct = UtilSql.getValue(result, "e_prepayment_acct");
        objectDefaultsData.pjAssetAcct = UtilSql.getValue(result, "pj_asset_acct");
        objectDefaultsData.vLiabilityServicesAcct = UtilSql.getValue(result, "v_liability_services_acct");
        objectDefaultsData.notinvoicedrevenueAcct = UtilSql.getValue(result, "notinvoicedrevenue_acct");
        objectDefaultsData.pPurchasepricevarianceAcct = UtilSql.getValue(result, "p_purchasepricevariance_acct");
        objectDefaultsData.paydiscountExpAcct = UtilSql.getValue(result, "paydiscount_exp_acct");
        objectDefaultsData.paydiscountRevAcct = UtilSql.getValue(result, "paydiscount_rev_acct");
        objectDefaultsData.unrealizedgainAcct = UtilSql.getValue(result, "unrealizedgain_acct");
        objectDefaultsData.unrealizedlossAcct = UtilSql.getValue(result, "unrealizedloss_acct");
        objectDefaultsData.realizedgainAcct = UtilSql.getValue(result, "realizedgain_acct");
        objectDefaultsData.realizedlossAcct = UtilSql.getValue(result, "realizedloss_acct");
        objectDefaultsData.tExpenseAcct = UtilSql.getValue(result, "t_expense_acct");
        objectDefaultsData.tLiabilityAcct = UtilSql.getValue(result, "t_liability_acct");
        objectDefaultsData.tReceivablesAcct = UtilSql.getValue(result, "t_receivables_acct");
        objectDefaultsData.bInterestrevAcct = UtilSql.getValue(result, "b_interestrev_acct");
        objectDefaultsData.bInterestexpAcct = UtilSql.getValue(result, "b_interestexp_acct");
        objectDefaultsData.bUnidentifiedAcct = UtilSql.getValue(result, "b_unidentified_acct");
        objectDefaultsData.bSettlementgainAcct = UtilSql.getValue(result, "b_settlementgain_acct");
        objectDefaultsData.chRevenueAcct = UtilSql.getValue(result, "ch_revenue_acct");
        objectDefaultsData.unearnedrevenueAcct = UtilSql.getValue(result, "unearnedrevenue_acct");
        objectDefaultsData.notinvoicedreceivablesAcct = UtilSql.getValue(result, "notinvoicedreceivables_acct");
        objectDefaultsData.pTradediscountrecAcct = UtilSql.getValue(result, "p_tradediscountrec_acct");
        objectDefaultsData.pTradediscountgrantAcct = UtilSql.getValue(result, "p_tradediscountgrant_acct");
        objectDefaultsData.wInvactualadjustAcct = UtilSql.getValue(result, "w_invactualadjust_acct");
        objectDefaultsData.bUnallocatedcashAcct = UtilSql.getValue(result, "b_unallocatedcash_acct");
        objectDefaultsData.bSettlementlossAcct = UtilSql.getValue(result, "b_settlementloss_acct");
        objectDefaultsData.aDisposalGain = UtilSql.getValue(result, "a_disposal_gain");
        objectDefaultsData.cAcctschemaDefaultId = UtilSql.getValue(result, "c_acctschema_default_id");
        objectDefaultsData.adClientId = UtilSql.getValue(result, "ad_client_id");
        objectDefaultsData.aDisposalLoss = UtilSql.getValue(result, "a_disposal_loss");
        objectDefaultsData.isactive = UtilSql.getValue(result, "isactive");
        objectDefaultsData.cAcctschemaId = UtilSql.getValue(result, "c_acctschema_id");
        objectDefaultsData.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectDefaultsData.language = UtilSql.getValue(result, "language");
        objectDefaultsData.adUserClient = "";
        objectDefaultsData.adOrgClient = "";
        objectDefaultsData.createdby = "";
        objectDefaultsData.trBgcolor = "";
        objectDefaultsData.totalCount = "";
        objectDefaultsData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectDefaultsData);
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
    DefaultsData objectDefaultsData[] = new DefaultsData[vector.size()];
    vector.copyInto(objectDefaultsData);
    return(objectDefaultsData);
  }

/**
Create a registry
 */
  public static DefaultsData[] set(String cAcctschemaId, String pRevenueReturnAcct, String adClientId, String adOrgId, String isactive, String created, String createdby, String createdbyr, String updatedby, String updatedbyr, String wInventoryAcct, String wDifferencesAcct, String pRevenueAcct, String pExpenseAcct, String pAssetAcct, String pCogsAcct, String eExpenseAcct, String ePrepaymentAcct, String cReceivableAcct, String cPrepaymentAcct, String vLiabilityAcct, String vPrepaymentAcct, String vLiabilityServicesAcct, String pjAssetAcct, String doubtfuldebtAcct, String notinvoicedrevenueAcct, String notinvoicedreceiptsAcct, String processing, String wRevaluationAcct, String pPurchasepricevarianceAcct, String paydiscountExpAcct, String writeoffAcct, String paydiscountRevAcct, String unrealizedgainAcct, String unrealizedlossAcct, String realizedgainAcct, String realizedlossAcct, String withholdingAcct, String pjWipAcct, String tExpenseAcct, String tLiabilityAcct, String tReceivablesAcct, String tDueAcct, String tCreditAcct, String bIntransitAcct, String bAssetAcct, String bExpenseAcct, String bInterestrevAcct, String bInterestexpAcct, String bUnidentifiedAcct, String bSettlementgainAcct, String bSettlementlossAcct, String bRevaluationgainAcct, String bRevaluationlossAcct, String chExpenseAcct, String chRevenueAcct, String unearnedrevenueAcct, String notinvoicedreceivablesAcct, String cbAssetAcct, String cbDifferencesAcct, String cbExpenseAcct, String cbReceiptAcct, String pDefRevenueAcct, String pInvoicepricevarianceAcct, String pTradediscountrecAcct, String pTradediscountgrantAcct, String wInvactualadjustAcct, String bPaymentselectAcct, String bUnallocatedcashAcct, String cbCashtransferAcct, String cAcctschemaDefaultId, String aAccumdepreciationAcct, String aDepreciationAcct, String aDisposalGain, String aDisposalLoss, String pCogsReturnAcct, String allowancefordoubtfulAcct, String writeoffRevAcct, String pDefExpenseAcct, String baddebtrevenueAcct, String baddebtexpenseAcct)    throws ServletException {
    DefaultsData objectDefaultsData[] = new DefaultsData[1];
    objectDefaultsData[0] = new DefaultsData();
    objectDefaultsData[0].created = created;
    objectDefaultsData[0].createdbyr = createdbyr;
    objectDefaultsData[0].updated = "";
    objectDefaultsData[0].updatedTimeStamp = "";
    objectDefaultsData[0].updatedby = updatedby;
    objectDefaultsData[0].updatedbyr = updatedbyr;
    objectDefaultsData[0].cReceivableAcct = cReceivableAcct;
    objectDefaultsData[0].cPrepaymentAcct = cPrepaymentAcct;
    objectDefaultsData[0].writeoffAcct = writeoffAcct;
    objectDefaultsData[0].writeoffRevAcct = writeoffRevAcct;
    objectDefaultsData[0].vLiabilityAcct = vLiabilityAcct;
    objectDefaultsData[0].vPrepaymentAcct = vPrepaymentAcct;
    objectDefaultsData[0].notinvoicedreceiptsAcct = notinvoicedreceiptsAcct;
    objectDefaultsData[0].doubtfuldebtAcct = doubtfuldebtAcct;
    objectDefaultsData[0].baddebtexpenseAcct = baddebtexpenseAcct;
    objectDefaultsData[0].baddebtrevenueAcct = baddebtrevenueAcct;
    objectDefaultsData[0].allowancefordoubtfulAcct = allowancefordoubtfulAcct;
    objectDefaultsData[0].pAssetAcct = pAssetAcct;
    objectDefaultsData[0].pExpenseAcct = pExpenseAcct;
    objectDefaultsData[0].pDefExpenseAcct = pDefExpenseAcct;
    objectDefaultsData[0].pRevenueAcct = pRevenueAcct;
    objectDefaultsData[0].pDefRevenueAcct = pDefRevenueAcct;
    objectDefaultsData[0].withholdingAcct = withholdingAcct;
    objectDefaultsData[0].pCogsAcct = pCogsAcct;
    objectDefaultsData[0].pInvoicepricevarianceAcct = pInvoicepricevarianceAcct;
    objectDefaultsData[0].pRevenueReturnAcct = pRevenueReturnAcct;
    objectDefaultsData[0].pCogsReturnAcct = pCogsReturnAcct;
    objectDefaultsData[0].wInventoryAcct = wInventoryAcct;
    objectDefaultsData[0].wDifferencesAcct = wDifferencesAcct;
    objectDefaultsData[0].wRevaluationAcct = wRevaluationAcct;
    objectDefaultsData[0].pjWipAcct = pjWipAcct;
    objectDefaultsData[0].bAssetAcct = bAssetAcct;
    objectDefaultsData[0].bIntransitAcct = bIntransitAcct;
    objectDefaultsData[0].bExpenseAcct = bExpenseAcct;
    objectDefaultsData[0].bRevaluationgainAcct = bRevaluationgainAcct;
    objectDefaultsData[0].bRevaluationlossAcct = bRevaluationlossAcct;
    objectDefaultsData[0].tDueAcct = tDueAcct;
    objectDefaultsData[0].tCreditAcct = tCreditAcct;
    objectDefaultsData[0].chExpenseAcct = chExpenseAcct;
    objectDefaultsData[0].cbAssetAcct = cbAssetAcct;
    objectDefaultsData[0].cbDifferencesAcct = cbDifferencesAcct;
    objectDefaultsData[0].cbCashtransferAcct = cbCashtransferAcct;
    objectDefaultsData[0].cbExpenseAcct = cbExpenseAcct;
    objectDefaultsData[0].cbReceiptAcct = cbReceiptAcct;
    objectDefaultsData[0].aDepreciationAcct = aDepreciationAcct;
    objectDefaultsData[0].bPaymentselectAcct = bPaymentselectAcct;
    objectDefaultsData[0].aAccumdepreciationAcct = aAccumdepreciationAcct;
    objectDefaultsData[0].processing = processing;
    objectDefaultsData[0].eExpenseAcct = eExpenseAcct;
    objectDefaultsData[0].ePrepaymentAcct = ePrepaymentAcct;
    objectDefaultsData[0].pjAssetAcct = pjAssetAcct;
    objectDefaultsData[0].vLiabilityServicesAcct = vLiabilityServicesAcct;
    objectDefaultsData[0].notinvoicedrevenueAcct = notinvoicedrevenueAcct;
    objectDefaultsData[0].pPurchasepricevarianceAcct = pPurchasepricevarianceAcct;
    objectDefaultsData[0].paydiscountExpAcct = paydiscountExpAcct;
    objectDefaultsData[0].paydiscountRevAcct = paydiscountRevAcct;
    objectDefaultsData[0].unrealizedgainAcct = unrealizedgainAcct;
    objectDefaultsData[0].unrealizedlossAcct = unrealizedlossAcct;
    objectDefaultsData[0].realizedgainAcct = realizedgainAcct;
    objectDefaultsData[0].realizedlossAcct = realizedlossAcct;
    objectDefaultsData[0].tExpenseAcct = tExpenseAcct;
    objectDefaultsData[0].tLiabilityAcct = tLiabilityAcct;
    objectDefaultsData[0].tReceivablesAcct = tReceivablesAcct;
    objectDefaultsData[0].bInterestrevAcct = bInterestrevAcct;
    objectDefaultsData[0].bInterestexpAcct = bInterestexpAcct;
    objectDefaultsData[0].bUnidentifiedAcct = bUnidentifiedAcct;
    objectDefaultsData[0].bSettlementgainAcct = bSettlementgainAcct;
    objectDefaultsData[0].chRevenueAcct = chRevenueAcct;
    objectDefaultsData[0].unearnedrevenueAcct = unearnedrevenueAcct;
    objectDefaultsData[0].notinvoicedreceivablesAcct = notinvoicedreceivablesAcct;
    objectDefaultsData[0].pTradediscountrecAcct = pTradediscountrecAcct;
    objectDefaultsData[0].pTradediscountgrantAcct = pTradediscountgrantAcct;
    objectDefaultsData[0].wInvactualadjustAcct = wInvactualadjustAcct;
    objectDefaultsData[0].bUnallocatedcashAcct = bUnallocatedcashAcct;
    objectDefaultsData[0].bSettlementlossAcct = bSettlementlossAcct;
    objectDefaultsData[0].aDisposalGain = aDisposalGain;
    objectDefaultsData[0].cAcctschemaDefaultId = cAcctschemaDefaultId;
    objectDefaultsData[0].adClientId = adClientId;
    objectDefaultsData[0].aDisposalLoss = aDisposalLoss;
    objectDefaultsData[0].isactive = isactive;
    objectDefaultsData[0].cAcctschemaId = cAcctschemaId;
    objectDefaultsData[0].adOrgId = adOrgId;
    objectDefaultsData[0].language = "";
    return objectDefaultsData;
  }

/**
Select for auxiliar field
 */
  public static String selectDef3440_0(ConnectionProvider connectionProvider, String CreatedByR)    throws ServletException {
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
  public static String selectDef3442_1(ConnectionProvider connectionProvider, String UpdatedByR)    throws ServletException {
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
      "        SELECT C_AcctSchema_Default.C_AcctSchema_ID AS NAME" +
      "        FROM C_AcctSchema_Default" +
      "        WHERE C_AcctSchema_Default.C_Acctschema_Default_ID = ?";

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
  public static String selectParent(ConnectionProvider connectionProvider, String cAcctschemaId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT (TO_CHAR(COALESCE(TO_CHAR(table1.Name), ''))) AS NAME FROM C_AcctSchema left join (select C_AcctSchema_ID, Name from C_AcctSchema) table1 on (C_AcctSchema.C_AcctSchema_ID = table1.C_AcctSchema_ID) WHERE C_AcctSchema.C_AcctSchema_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cAcctschemaId);

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
  public static String selectParentTrl(ConnectionProvider connectionProvider, String cAcctschemaId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT (TO_CHAR(COALESCE(TO_CHAR(table1.Name), ''))) AS NAME FROM C_AcctSchema left join (select C_AcctSchema_ID, Name from C_AcctSchema) table1 on (C_AcctSchema.C_AcctSchema_ID = table1.C_AcctSchema_ID) WHERE C_AcctSchema.C_AcctSchema_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cAcctschemaId);

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
      "        UPDATE C_AcctSchema_Default" +
      "        SET C_Receivable_Acct = (?) , C_Prepayment_Acct = (?) , WriteOff_Acct = (?) , Writeoff_Rev_Acct = (?) , V_Liability_Acct = (?) , V_Prepayment_Acct = (?) , NotInvoicedReceipts_Acct = (?) , DoubtfulDebt_Acct = (?) , Baddebtexpense_Acct = (?) , BadDebtRevenue_Acct = (?) , Allowancefordoubtful_Acct = (?) , P_Asset_Acct = (?) , P_Expense_Acct = (?) , P_Def_Expense_Acct = (?) , P_Revenue_Acct = (?) , P_Def_Revenue_Acct = (?) , Withholding_Acct = (?) , P_Cogs_Acct = (?) , P_InvoicePriceVariance_Acct = (?) , P_Revenue_Return_Acct = (?) , P_Cogs_Return_Acct = (?) , W_Inventory_Acct = (?) , W_Differences_Acct = (?) , W_Revaluation_Acct = (?) , PJ_WIP_Acct = (?) , B_Asset_Acct = (?) , B_InTransit_Acct = (?) , B_Expense_Acct = (?) , B_RevaluationGain_Acct = (?) , B_RevaluationLoss_Acct = (?) , T_Due_Acct = (?) , T_Credit_Acct = (?) , Ch_Expense_Acct = (?) , CB_Asset_Acct = (?) , CB_Differences_Acct = (?) , CB_CashTransfer_Acct = (?) , CB_Expense_Acct = (?) , CB_Receipt_Acct = (?) , B_PaymentSelect_Acct = (?) , A_Depreciation_Acct = (?) , A_Accumdepreciation_Acct = (?) , Processing = (?) , E_Expense_Acct = (?) , E_Prepayment_Acct = (?) , PJ_Asset_Acct = (?) , V_Liability_Services_Acct = (?) , NotInvoicedRevenue_Acct = (?) , P_PurchasePriceVariance_Acct = (?) , PayDiscount_Exp_Acct = (?) , PayDiscount_Rev_Acct = (?) , UnrealizedGain_Acct = (?) , UnrealizedLoss_Acct = (?) , RealizedGain_Acct = (?) , RealizedLoss_Acct = (?) , T_Expense_Acct = (?) , T_Liability_Acct = (?) , T_Receivables_Acct = (?) , B_InterestRev_Acct = (?) , B_InterestExp_Acct = (?) , B_Unidentified_Acct = (?) , B_SettlementGain_Acct = (?) , Ch_Revenue_Acct = (?) , UnEarnedRevenue_Acct = (?) , NotInvoicedReceivables_Acct = (?) , P_TradeDiscountRec_Acct = (?) , P_TradeDiscountGrant_Acct = (?) , W_InvActualAdjust_Acct = (?) , B_UnallocatedCash_Acct = (?) , B_SettlementLoss_Acct = (?) , A_Disposal_Gain = (?) , IsActive = (?) , A_Disposal_Loss = (?) , C_Acctschema_Default_ID = (?) , C_AcctSchema_ID = (?) , AD_Org_ID = (?) , AD_Client_ID = (?) , updated = now(), updatedby = ? " +
      "        WHERE C_AcctSchema_Default.C_Acctschema_Default_ID = ? " +
      "                 AND C_AcctSchema_Default.C_AcctSchema_ID = ? " +
      "        AND C_AcctSchema_Default.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND C_AcctSchema_Default.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cReceivableAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cPrepaymentAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, writeoffAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, writeoffRevAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, vLiabilityAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, vPrepaymentAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, notinvoicedreceiptsAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, doubtfuldebtAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, baddebtexpenseAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, baddebtrevenueAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, allowancefordoubtfulAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pAssetAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pExpenseAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pDefExpenseAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pRevenueAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pDefRevenueAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, withholdingAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pCogsAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pInvoicepricevarianceAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pRevenueReturnAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pCogsReturnAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, wInventoryAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, wDifferencesAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, wRevaluationAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pjWipAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, bAssetAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, bIntransitAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, bExpenseAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, bRevaluationgainAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, bRevaluationlossAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, tDueAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, tCreditAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, chExpenseAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cbAssetAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cbDifferencesAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cbCashtransferAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cbExpenseAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cbReceiptAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, bPaymentselectAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, aDepreciationAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, aAccumdepreciationAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processing);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, eExpenseAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ePrepaymentAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pjAssetAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, vLiabilityServicesAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, notinvoicedrevenueAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pPurchasepricevarianceAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paydiscountExpAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paydiscountRevAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, unrealizedgainAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, unrealizedlossAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, realizedgainAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, realizedlossAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, tExpenseAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, tLiabilityAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, tReceivablesAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, bInterestrevAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, bInterestexpAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, bUnidentifiedAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, bSettlementgainAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, chRevenueAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, unearnedrevenueAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, notinvoicedreceivablesAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pTradediscountrecAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pTradediscountgrantAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, wInvactualadjustAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, bUnallocatedcashAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, bSettlementlossAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, aDisposalGain);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, aDisposalLoss);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cAcctschemaDefaultId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cAcctschemaId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cAcctschemaDefaultId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cAcctschemaId);
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
      "        INSERT INTO C_AcctSchema_Default " +
      "        (C_Receivable_Acct, C_Prepayment_Acct, WriteOff_Acct, Writeoff_Rev_Acct, V_Liability_Acct, V_Prepayment_Acct, NotInvoicedReceipts_Acct, DoubtfulDebt_Acct, Baddebtexpense_Acct, BadDebtRevenue_Acct, Allowancefordoubtful_Acct, P_Asset_Acct, P_Expense_Acct, P_Def_Expense_Acct, P_Revenue_Acct, P_Def_Revenue_Acct, Withholding_Acct, P_Cogs_Acct, P_InvoicePriceVariance_Acct, P_Revenue_Return_Acct, P_Cogs_Return_Acct, W_Inventory_Acct, W_Differences_Acct, W_Revaluation_Acct, PJ_WIP_Acct, B_Asset_Acct, B_InTransit_Acct, B_Expense_Acct, B_RevaluationGain_Acct, B_RevaluationLoss_Acct, T_Due_Acct, T_Credit_Acct, Ch_Expense_Acct, CB_Asset_Acct, CB_Differences_Acct, CB_CashTransfer_Acct, CB_Expense_Acct, CB_Receipt_Acct, A_Depreciation_Acct, B_PaymentSelect_Acct, A_Accumdepreciation_Acct, Processing, E_Expense_Acct, E_Prepayment_Acct, PJ_Asset_Acct, V_Liability_Services_Acct, NotInvoicedRevenue_Acct, P_PurchasePriceVariance_Acct, PayDiscount_Exp_Acct, PayDiscount_Rev_Acct, UnrealizedGain_Acct, UnrealizedLoss_Acct, RealizedGain_Acct, RealizedLoss_Acct, T_Expense_Acct, T_Liability_Acct, T_Receivables_Acct, B_InterestRev_Acct, B_InterestExp_Acct, B_Unidentified_Acct, B_SettlementGain_Acct, Ch_Revenue_Acct, UnEarnedRevenue_Acct, NotInvoicedReceivables_Acct, P_TradeDiscountRec_Acct, P_TradeDiscountGrant_Acct, W_InvActualAdjust_Acct, B_UnallocatedCash_Acct, B_SettlementLoss_Acct, A_Disposal_Gain, C_Acctschema_Default_ID, AD_Client_ID, A_Disposal_Loss, IsActive, C_AcctSchema_ID, AD_Org_ID, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cReceivableAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cPrepaymentAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, writeoffAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, writeoffRevAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, vLiabilityAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, vPrepaymentAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, notinvoicedreceiptsAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, doubtfuldebtAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, baddebtexpenseAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, baddebtrevenueAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, allowancefordoubtfulAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pAssetAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pExpenseAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pDefExpenseAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pRevenueAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pDefRevenueAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, withholdingAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pCogsAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pInvoicepricevarianceAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pRevenueReturnAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pCogsReturnAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, wInventoryAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, wDifferencesAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, wRevaluationAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pjWipAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, bAssetAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, bIntransitAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, bExpenseAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, bRevaluationgainAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, bRevaluationlossAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, tDueAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, tCreditAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, chExpenseAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cbAssetAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cbDifferencesAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cbCashtransferAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cbExpenseAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cbReceiptAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, aDepreciationAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, bPaymentselectAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, aAccumdepreciationAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processing);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, eExpenseAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ePrepaymentAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pjAssetAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, vLiabilityServicesAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, notinvoicedrevenueAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pPurchasepricevarianceAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paydiscountExpAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paydiscountRevAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, unrealizedgainAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, unrealizedlossAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, realizedgainAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, realizedlossAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, tExpenseAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, tLiabilityAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, tReceivablesAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, bInterestrevAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, bInterestexpAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, bUnidentifiedAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, bSettlementgainAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, chRevenueAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, unearnedrevenueAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, notinvoicedreceivablesAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pTradediscountrecAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pTradediscountgrantAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, wInvactualadjustAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, bUnallocatedcashAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, bSettlementlossAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, aDisposalGain);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cAcctschemaDefaultId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, aDisposalLoss);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cAcctschemaId);
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

  public static int delete(ConnectionProvider connectionProvider, String param1, String cAcctschemaId, String adUserClient, String adOrgClient)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        DELETE FROM C_AcctSchema_Default" +
      "        WHERE C_AcctSchema_Default.C_Acctschema_Default_ID = ? " +
      "                 AND C_AcctSchema_Default.C_AcctSchema_ID = ? " +
      "        AND C_AcctSchema_Default.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND C_AcctSchema_Default.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, param1);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cAcctschemaId);
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
      "          FROM C_AcctSchema_Default" +
      "         WHERE C_AcctSchema_Default.C_Acctschema_Default_ID = ? ";

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
      "          FROM C_AcctSchema_Default" +
      "         WHERE C_AcctSchema_Default.C_Acctschema_Default_ID = ? ";

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
