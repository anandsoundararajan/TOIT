//Sqlc generated V1.O00-1
package org.openbravo.erpWindows.GLJournal;

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
class HeaderData implements FieldProvider {
static Logger log4j = Logger.getLogger(HeaderData.class);
  private String InitRecordNumber="0";
  public String created;
  public String createdbyr;
  public String updated;
  public String updatedTimeStamp;
  public String updatedby;
  public String updatedbyr;
  public String adOrgId;
  public String adOrgIdr;
  public String cAcctschemaId;
  public String cAcctschemaIdr;
  public String documentno;
  public String description;
  public String cDoctypeId;
  public String cDoctypeIdr;
  public String datedoc;
  public String dateacct;
  public String cPeriodId;
  public String cPeriodIdr;
  public String cCurrencyId;
  public String cCurrencyIdr;
  public String currencyratetype;
  public String currencyrate;
  public String isopening;
  public String controlamt;
  public String totaldr;
  public String docaction;
  public String docactionBtn;
  public String totalcr;
  public String posted;
  public String postedBtn;
  public String docstatus;
  public String isactive;
  public String isprinted;
  public String glCategoryId;
  public String isapproved;
  public String cBpartnerId;
  public String cBpartnerIdr;
  public String mProductId;
  public String mProductIdr;
  public String cProjectId;
  public String cCostcenterId;
  public String aAssetId;
  public String cCampaignId;
  public String user1Id;
  public String user2Id;
  public String processed;
  public String postingtype;
  public String adClientId;
  public String glJournalId;
  public String glJournalbatchId;
  public String processing;
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
    else if (fieldName.equalsIgnoreCase("ad_org_id") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("ad_org_idr") || fieldName.equals("adOrgIdr"))
      return adOrgIdr;
    else if (fieldName.equalsIgnoreCase("c_acctschema_id") || fieldName.equals("cAcctschemaId"))
      return cAcctschemaId;
    else if (fieldName.equalsIgnoreCase("c_acctschema_idr") || fieldName.equals("cAcctschemaIdr"))
      return cAcctschemaIdr;
    else if (fieldName.equalsIgnoreCase("documentno"))
      return documentno;
    else if (fieldName.equalsIgnoreCase("description"))
      return description;
    else if (fieldName.equalsIgnoreCase("c_doctype_id") || fieldName.equals("cDoctypeId"))
      return cDoctypeId;
    else if (fieldName.equalsIgnoreCase("c_doctype_idr") || fieldName.equals("cDoctypeIdr"))
      return cDoctypeIdr;
    else if (fieldName.equalsIgnoreCase("datedoc"))
      return datedoc;
    else if (fieldName.equalsIgnoreCase("dateacct"))
      return dateacct;
    else if (fieldName.equalsIgnoreCase("c_period_id") || fieldName.equals("cPeriodId"))
      return cPeriodId;
    else if (fieldName.equalsIgnoreCase("c_period_idr") || fieldName.equals("cPeriodIdr"))
      return cPeriodIdr;
    else if (fieldName.equalsIgnoreCase("c_currency_id") || fieldName.equals("cCurrencyId"))
      return cCurrencyId;
    else if (fieldName.equalsIgnoreCase("c_currency_idr") || fieldName.equals("cCurrencyIdr"))
      return cCurrencyIdr;
    else if (fieldName.equalsIgnoreCase("currencyratetype"))
      return currencyratetype;
    else if (fieldName.equalsIgnoreCase("currencyrate"))
      return currencyrate;
    else if (fieldName.equalsIgnoreCase("isopening"))
      return isopening;
    else if (fieldName.equalsIgnoreCase("controlamt"))
      return controlamt;
    else if (fieldName.equalsIgnoreCase("totaldr"))
      return totaldr;
    else if (fieldName.equalsIgnoreCase("docaction"))
      return docaction;
    else if (fieldName.equalsIgnoreCase("docaction_btn") || fieldName.equals("docactionBtn"))
      return docactionBtn;
    else if (fieldName.equalsIgnoreCase("totalcr"))
      return totalcr;
    else if (fieldName.equalsIgnoreCase("posted"))
      return posted;
    else if (fieldName.equalsIgnoreCase("posted_btn") || fieldName.equals("postedBtn"))
      return postedBtn;
    else if (fieldName.equalsIgnoreCase("docstatus"))
      return docstatus;
    else if (fieldName.equalsIgnoreCase("isactive"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("isprinted"))
      return isprinted;
    else if (fieldName.equalsIgnoreCase("gl_category_id") || fieldName.equals("glCategoryId"))
      return glCategoryId;
    else if (fieldName.equalsIgnoreCase("isapproved"))
      return isapproved;
    else if (fieldName.equalsIgnoreCase("c_bpartner_id") || fieldName.equals("cBpartnerId"))
      return cBpartnerId;
    else if (fieldName.equalsIgnoreCase("c_bpartner_idr") || fieldName.equals("cBpartnerIdr"))
      return cBpartnerIdr;
    else if (fieldName.equalsIgnoreCase("m_product_id") || fieldName.equals("mProductId"))
      return mProductId;
    else if (fieldName.equalsIgnoreCase("m_product_idr") || fieldName.equals("mProductIdr"))
      return mProductIdr;
    else if (fieldName.equalsIgnoreCase("c_project_id") || fieldName.equals("cProjectId"))
      return cProjectId;
    else if (fieldName.equalsIgnoreCase("c_costcenter_id") || fieldName.equals("cCostcenterId"))
      return cCostcenterId;
    else if (fieldName.equalsIgnoreCase("a_asset_id") || fieldName.equals("aAssetId"))
      return aAssetId;
    else if (fieldName.equalsIgnoreCase("c_campaign_id") || fieldName.equals("cCampaignId"))
      return cCampaignId;
    else if (fieldName.equalsIgnoreCase("user1_id") || fieldName.equals("user1Id"))
      return user1Id;
    else if (fieldName.equalsIgnoreCase("user2_id") || fieldName.equals("user2Id"))
      return user2Id;
    else if (fieldName.equalsIgnoreCase("processed"))
      return processed;
    else if (fieldName.equalsIgnoreCase("postingtype"))
      return postingtype;
    else if (fieldName.equalsIgnoreCase("ad_client_id") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("gl_journal_id") || fieldName.equals("glJournalId"))
      return glJournalId;
    else if (fieldName.equalsIgnoreCase("gl_journalbatch_id") || fieldName.equals("glJournalbatchId"))
      return glJournalbatchId;
    else if (fieldName.equalsIgnoreCase("processing"))
      return processing;
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
  public static HeaderData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String glJournalbatchId, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, glJournalbatchId, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static HeaderData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String glJournalbatchId, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(GL_Journal.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = GL_Journal.CreatedBy) as CreatedByR, " +
      "        to_char(GL_Journal.Updated, ?) as updated, " +
      "        to_char(GL_Journal.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        GL_Journal.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = GL_Journal.UpdatedBy) as UpdatedByR," +
      "        GL_Journal.AD_Org_ID, " +
      "(CASE WHEN GL_Journal.AD_Org_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.Name), ''))),'') ) END) AS AD_Org_IDR, " +
      "GL_Journal.C_AcctSchema_ID, " +
      "(CASE WHEN GL_Journal.C_AcctSchema_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Name), ''))),'') ) END) AS C_AcctSchema_IDR, " +
      "GL_Journal.DocumentNo, " +
      "GL_Journal.Description, " +
      "GL_Journal.C_DocType_ID, " +
      "(CASE WHEN GL_Journal.C_DocType_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL3.Name IS NULL THEN TO_CHAR(table3.Name) ELSE TO_CHAR(tableTRL3.Name) END)), ''))),'') ) END) AS C_DocType_IDR, " +
      "GL_Journal.DateDoc, " +
      "GL_Journal.DateAcct, " +
      "GL_Journal.C_Period_ID, " +
      "(CASE WHEN GL_Journal.C_Period_ID IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table4.Name), ''))),'') ) END) AS C_Period_IDR, " +
      "GL_Journal.C_Currency_ID, " +
      "(CASE WHEN GL_Journal.C_Currency_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table5.ISO_Code), ''))),'') ) END) AS C_Currency_IDR, " +
      "GL_Journal.CurrencyRateType, " +
      "GL_Journal.CurrencyRate, " +
      "COALESCE(GL_Journal.IsOpening, 'N') AS IsOpening, " +
      "GL_Journal.ControlAmt, " +
      "GL_Journal.TotalDr, " +
      "GL_Journal.DocAction, " +
      "list1.name as DocAction_BTN, " +
      "GL_Journal.TotalCr, " +
      "GL_Journal.Posted, " +
      "list2.name as Posted_BTN, " +
      "GL_Journal.DocStatus, " +
      "COALESCE(GL_Journal.IsActive, 'N') AS IsActive, " +
      "COALESCE(GL_Journal.IsPrinted, 'N') AS IsPrinted, " +
      "GL_Journal.GL_Category_ID, " +
      "COALESCE(GL_Journal.IsApproved, 'N') AS IsApproved, " +
      "GL_Journal.C_Bpartner_ID, " +
      "(CASE WHEN GL_Journal.C_Bpartner_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table6.Name), ''))),'') ) END) AS C_Bpartner_IDR, " +
      "GL_Journal.M_Product_ID, " +
      "(CASE WHEN GL_Journal.M_Product_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL7.Name IS NULL THEN TO_CHAR(table7.Name) ELSE TO_CHAR(tableTRL7.Name) END)), ''))),'') ) END) AS M_Product_IDR, " +
      "GL_Journal.C_Project_ID, " +
      "GL_Journal.C_Costcenter_ID, " +
      "GL_Journal.A_Asset_ID, " +
      "GL_Journal.C_Campaign_ID, " +
      "GL_Journal.User1_ID, " +
      "GL_Journal.User2_ID, " +
      "COALESCE(GL_Journal.Processed, 'N') AS Processed, " +
      "GL_Journal.PostingType, " +
      "GL_Journal.AD_Client_ID, " +
      "GL_Journal.GL_Journal_ID, " +
      "GL_Journal.GL_JournalBatch_ID, " +
      "GL_Journal.Processing, " +
      "        ? AS LANGUAGE " +
      "        FROM GL_Journal left join (select AD_Org_ID, Name from AD_Org) table1 on (GL_Journal.AD_Org_ID = table1.AD_Org_ID) left join (select C_AcctSchema_ID, Name from C_AcctSchema) table2 on (GL_Journal.C_AcctSchema_ID = table2.C_AcctSchema_ID) left join (select C_DocType_ID, Name from C_DocType) table3 on (GL_Journal.C_DocType_ID = table3.C_DocType_ID) left join (select C_DocType_ID,AD_Language, Name from C_DocType_TRL) tableTRL3 on (table3.C_DocType_ID = tableTRL3.C_DocType_ID and tableTRL3.AD_Language = ?)  left join (select C_Period_ID, Name from C_Period) table4 on (GL_Journal.C_Period_ID =  table4.C_Period_ID) left join (select C_Currency_ID, ISO_Code from C_Currency) table5 on (GL_Journal.C_Currency_ID = table5.C_Currency_ID) left join ad_ref_list_v list1 on (list1.ad_reference_id = '135' and list1.ad_language = ?  AND (CASE GL_Journal.DocAction WHEN '--' THEN 'CL' ELSE TO_CHAR(GL_Journal.DocAction) END) = list1.value) left join ad_ref_list_v list2 on (list2.ad_reference_id = '234' and list2.ad_language = ?  AND GL_Journal.Posted = TO_CHAR(list2.value)) left join (select C_BPartner_ID, Name from C_BPartner) table6 on (GL_Journal.C_Bpartner_ID = table6.C_BPartner_ID) left join (select M_Product_ID, Name from M_Product) table7 on (GL_Journal.M_Product_ID = table7.M_Product_ID) left join (select M_Product_ID,AD_Language, Name from M_Product_TRL) tableTRL7 on (table7.M_Product_ID = tableTRL7.M_Product_ID and tableTRL7.AD_Language = ?) " +
      "        WHERE 2=2 " +
      "        AND 1=1 ";
    strSql = strSql + ((glJournalbatchId==null || glJournalbatchId.equals(""))?"":"  AND GL_Journal.GL_JournalBatch_ID = ?  ");
    strSql = strSql + 
      "        AND GL_Journal.GL_Journal_ID = ? " +
      "        AND GL_Journal.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND GL_Journal.AD_Org_ID IN (";
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
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      if (glJournalbatchId != null && !(glJournalbatchId.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, glJournalbatchId);
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
        HeaderData objectHeaderData = new HeaderData();
        objectHeaderData.created = UtilSql.getValue(result, "created");
        objectHeaderData.createdbyr = UtilSql.getValue(result, "createdbyr");
        objectHeaderData.updated = UtilSql.getValue(result, "updated");
        objectHeaderData.updatedTimeStamp = UtilSql.getValue(result, "updated_time_stamp");
        objectHeaderData.updatedby = UtilSql.getValue(result, "updatedby");
        objectHeaderData.updatedbyr = UtilSql.getValue(result, "updatedbyr");
        objectHeaderData.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectHeaderData.adOrgIdr = UtilSql.getValue(result, "ad_org_idr");
        objectHeaderData.cAcctschemaId = UtilSql.getValue(result, "c_acctschema_id");
        objectHeaderData.cAcctschemaIdr = UtilSql.getValue(result, "c_acctschema_idr");
        objectHeaderData.documentno = UtilSql.getValue(result, "documentno");
        objectHeaderData.description = UtilSql.getValue(result, "description");
        objectHeaderData.cDoctypeId = UtilSql.getValue(result, "c_doctype_id");
        objectHeaderData.cDoctypeIdr = UtilSql.getValue(result, "c_doctype_idr");
        objectHeaderData.datedoc = UtilSql.getDateValue(result, "datedoc", "dd-MM-yyyy");
        objectHeaderData.dateacct = UtilSql.getDateValue(result, "dateacct", "dd-MM-yyyy");
        objectHeaderData.cPeriodId = UtilSql.getValue(result, "c_period_id");
        objectHeaderData.cPeriodIdr = UtilSql.getValue(result, "c_period_idr");
        objectHeaderData.cCurrencyId = UtilSql.getValue(result, "c_currency_id");
        objectHeaderData.cCurrencyIdr = UtilSql.getValue(result, "c_currency_idr");
        objectHeaderData.currencyratetype = UtilSql.getValue(result, "currencyratetype");
        objectHeaderData.currencyrate = UtilSql.getValue(result, "currencyrate");
        objectHeaderData.isopening = UtilSql.getValue(result, "isopening");
        objectHeaderData.controlamt = UtilSql.getValue(result, "controlamt");
        objectHeaderData.totaldr = UtilSql.getValue(result, "totaldr");
        objectHeaderData.docaction = UtilSql.getValue(result, "docaction");
        objectHeaderData.docactionBtn = UtilSql.getValue(result, "docaction_btn");
        objectHeaderData.totalcr = UtilSql.getValue(result, "totalcr");
        objectHeaderData.posted = UtilSql.getValue(result, "posted");
        objectHeaderData.postedBtn = UtilSql.getValue(result, "posted_btn");
        objectHeaderData.docstatus = UtilSql.getValue(result, "docstatus");
        objectHeaderData.isactive = UtilSql.getValue(result, "isactive");
        objectHeaderData.isprinted = UtilSql.getValue(result, "isprinted");
        objectHeaderData.glCategoryId = UtilSql.getValue(result, "gl_category_id");
        objectHeaderData.isapproved = UtilSql.getValue(result, "isapproved");
        objectHeaderData.cBpartnerId = UtilSql.getValue(result, "c_bpartner_id");
        objectHeaderData.cBpartnerIdr = UtilSql.getValue(result, "c_bpartner_idr");
        objectHeaderData.mProductId = UtilSql.getValue(result, "m_product_id");
        objectHeaderData.mProductIdr = UtilSql.getValue(result, "m_product_idr");
        objectHeaderData.cProjectId = UtilSql.getValue(result, "c_project_id");
        objectHeaderData.cCostcenterId = UtilSql.getValue(result, "c_costcenter_id");
        objectHeaderData.aAssetId = UtilSql.getValue(result, "a_asset_id");
        objectHeaderData.cCampaignId = UtilSql.getValue(result, "c_campaign_id");
        objectHeaderData.user1Id = UtilSql.getValue(result, "user1_id");
        objectHeaderData.user2Id = UtilSql.getValue(result, "user2_id");
        objectHeaderData.processed = UtilSql.getValue(result, "processed");
        objectHeaderData.postingtype = UtilSql.getValue(result, "postingtype");
        objectHeaderData.adClientId = UtilSql.getValue(result, "ad_client_id");
        objectHeaderData.glJournalId = UtilSql.getValue(result, "gl_journal_id");
        objectHeaderData.glJournalbatchId = UtilSql.getValue(result, "gl_journalbatch_id");
        objectHeaderData.processing = UtilSql.getValue(result, "processing");
        objectHeaderData.language = UtilSql.getValue(result, "language");
        objectHeaderData.adUserClient = "";
        objectHeaderData.adOrgClient = "";
        objectHeaderData.createdby = "";
        objectHeaderData.trBgcolor = "";
        objectHeaderData.totalCount = "";
        objectHeaderData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectHeaderData);
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
    HeaderData objectHeaderData[] = new HeaderData[vector.size()];
    vector.copyInto(objectHeaderData);
    return(objectHeaderData);
  }

/**
Create a registry
 */
  public static HeaderData[] set(String glJournalbatchId, String user2Id, String glJournalId, String adClientId, String adOrgId, String isactive, String createdby, String createdbyr, String updatedby, String updatedbyr, String cDoctypeId, String documentno, String docstatus, String isprinted, String posted, String postedBtn, String description, String postingtype, String cAcctschemaId, String glCategoryId, String datedoc, String dateacct, String cPeriodId, String cCurrencyId, String totaldr, String totalcr, String docaction, String docactionBtn, String isapproved, String currencyratetype, String currencyrate, String cProjectId, String cCostcenterId, String isopening, String controlamt, String processed, String processing, String mProductId, String mProductIdr, String aAssetId, String cCampaignId, String cBpartnerId, String cBpartnerIdr, String user1Id)    throws ServletException {
    HeaderData objectHeaderData[] = new HeaderData[1];
    objectHeaderData[0] = new HeaderData();
    objectHeaderData[0].created = "";
    objectHeaderData[0].createdbyr = createdbyr;
    objectHeaderData[0].updated = "";
    objectHeaderData[0].updatedTimeStamp = "";
    objectHeaderData[0].updatedby = updatedby;
    objectHeaderData[0].updatedbyr = updatedbyr;
    objectHeaderData[0].adOrgId = adOrgId;
    objectHeaderData[0].adOrgIdr = "";
    objectHeaderData[0].cAcctschemaId = cAcctschemaId;
    objectHeaderData[0].cAcctschemaIdr = "";
    objectHeaderData[0].documentno = documentno;
    objectHeaderData[0].description = description;
    objectHeaderData[0].cDoctypeId = cDoctypeId;
    objectHeaderData[0].cDoctypeIdr = "";
    objectHeaderData[0].datedoc = datedoc;
    objectHeaderData[0].dateacct = dateacct;
    objectHeaderData[0].cPeriodId = cPeriodId;
    objectHeaderData[0].cPeriodIdr = "";
    objectHeaderData[0].cCurrencyId = cCurrencyId;
    objectHeaderData[0].cCurrencyIdr = "";
    objectHeaderData[0].currencyratetype = currencyratetype;
    objectHeaderData[0].currencyrate = currencyrate;
    objectHeaderData[0].isopening = isopening;
    objectHeaderData[0].controlamt = controlamt;
    objectHeaderData[0].totaldr = totaldr;
    objectHeaderData[0].docaction = docaction;
    objectHeaderData[0].docactionBtn = docactionBtn;
    objectHeaderData[0].totalcr = totalcr;
    objectHeaderData[0].posted = posted;
    objectHeaderData[0].postedBtn = postedBtn;
    objectHeaderData[0].docstatus = docstatus;
    objectHeaderData[0].isactive = isactive;
    objectHeaderData[0].isprinted = isprinted;
    objectHeaderData[0].glCategoryId = glCategoryId;
    objectHeaderData[0].isapproved = isapproved;
    objectHeaderData[0].cBpartnerId = cBpartnerId;
    objectHeaderData[0].cBpartnerIdr = cBpartnerIdr;
    objectHeaderData[0].mProductId = mProductId;
    objectHeaderData[0].mProductIdr = mProductIdr;
    objectHeaderData[0].cProjectId = cProjectId;
    objectHeaderData[0].cCostcenterId = cCostcenterId;
    objectHeaderData[0].aAssetId = aAssetId;
    objectHeaderData[0].cCampaignId = cCampaignId;
    objectHeaderData[0].user1Id = user1Id;
    objectHeaderData[0].user2Id = user2Id;
    objectHeaderData[0].processed = processed;
    objectHeaderData[0].postingtype = postingtype;
    objectHeaderData[0].adClientId = adClientId;
    objectHeaderData[0].glJournalId = glJournalId;
    objectHeaderData[0].glJournalbatchId = glJournalbatchId;
    objectHeaderData[0].processing = processing;
    objectHeaderData[0].language = "";
    return objectHeaderData;
  }

/**
Select for auxiliar field
 */
  public static String selectAux12(ConnectionProvider connectionProvider, String GL_JOURNALBATCH_ID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT DESCRIPTION FROM GL_JOURNALBATCH WHERE GL_JOURNALBATCH_ID=? ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, GL_JOURNALBATCH_ID);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "description");
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
  public static String selectAuxC382CB93EB254FC68DB7D25B34A5A6F0(ConnectionProvider connectionProvider, String gl_journalbatch_id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        select c_currency_id from gl_journalbatch where gl_journalbatch_id=? ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, gl_journalbatch_id);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "c_currency_id");
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
  public static String selectDef1622_0(ConnectionProvider connectionProvider, String CreatedByR)    throws ServletException {
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
  public static String selectDef1624_1(ConnectionProvider connectionProvider, String UpdatedByR)    throws ServletException {
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
Select for auxiliar field
 */
  public static String selectDef1625(ConnectionProvider connectionProvider, String AD_Org_ID, String AD_Client_ID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT C_DocType_ID from C_DocType WHERE C_DocType.DocBaseType='GLJ' AND AD_ISORGINCLUDED( ?, C_DocType.AD_Org_ID, ?) <> '-1' ORDER BY C_DocType.isdefault DESC ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, AD_Org_ID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, AD_Client_ID);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "c_doctype_id");
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
  public static String selectDef1634(ConnectionProvider connectionProvider, String C_PERIOD_ID, String DateDoc)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT COALESCE((SELECT ENDDATE FROM C_PERIOD WHERE C_PERIOD_ID = ? and periodtype = 'A'),to_date(?)) FROM DUAL ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_PERIOD_ID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, DateDoc);

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

/**
Select for auxiliar field
 */
  public static String selectDef1635(ConnectionProvider connectionProvider, String C_PERIOD_ID, String DateAcct)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT COALESCE((SELECT ENDDATE FROM C_PERIOD WHERE C_PERIOD_ID = ? and periodtype = 'A'),to_date(?)) FROM DUAL ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_PERIOD_ID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, DateAcct);

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

/**
Select for auxiliar field
 */
  public static String selectDef6371060DDBD14FE88ABBCE2DC0EACCF8_2(ConnectionProvider connectionProvider, String paramLanguage, String M_Product_IDR)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL2.Name IS NULL THEN TO_CHAR(table2.Name) ELSE TO_CHAR(tableTRL2.Name) END)), ''))), '') ) as M_Product_ID FROM M_Product left join (select M_Product_ID, Name from M_Product) table2 on (M_Product.M_Product_ID = table2.M_Product_ID)left join (select M_Product_ID,AD_Language, Name from M_Product_TRL) tableTRL2 on (table2.M_Product_ID = tableTRL2.M_Product_ID and tableTRL2.AD_Language = ?)  WHERE M_Product.isActive='Y' AND M_Product.M_Product_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, M_Product_IDR);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "m_product_id");
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
  public static String selectDefAA038C785DE7452199DB51FE58FE1DA6_3(ConnectionProvider connectionProvider, String C_Bpartner_IDR)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Name), ''))), '') ) as C_Bpartner_ID FROM C_BPartner left join (select C_BPartner_ID, Name from C_BPartner) table2 on (C_BPartner.C_BPartner_ID = table2.C_BPartner_ID) WHERE C_BPartner.isActive='Y' AND C_BPartner.C_BPartner_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_Bpartner_IDR);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "c_bpartner_id");
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
      "        SELECT GL_Journal.GL_JournalBatch_ID AS NAME" +
      "        FROM GL_Journal" +
      "        WHERE GL_Journal.GL_Journal_ID = ?";

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
  public static String selectParent(ConnectionProvider connectionProvider, String glJournalbatchId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT (TO_CHAR(COALESCE(TO_CHAR(table1.DocumentNo), ''))) AS NAME FROM GL_JournalBatch left join (select GL_JournalBatch_ID, DocumentNo from GL_JournalBatch) table1 on (GL_JournalBatch.GL_JournalBatch_ID = table1.GL_JournalBatch_ID) WHERE GL_JournalBatch.GL_JournalBatch_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, glJournalbatchId);

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
  public static String selectParentTrl(ConnectionProvider connectionProvider, String glJournalbatchId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT (TO_CHAR(COALESCE(TO_CHAR(table1.DocumentNo), ''))) AS NAME FROM GL_JournalBatch left join (select GL_JournalBatch_ID, DocumentNo from GL_JournalBatch) table1 on (GL_JournalBatch.GL_JournalBatch_ID = table1.GL_JournalBatch_ID) WHERE GL_JournalBatch.GL_JournalBatch_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, glJournalbatchId);

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

  public static int updateDocAction(ConnectionProvider connectionProvider, String docaction, String glJournalId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        UPDATE GL_Journal" +
      "        SET docaction = ? " +
      "        WHERE GL_Journal.GL_Journal_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, docaction);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, glJournalId);

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

  public int update(Connection conn, ConnectionProvider connectionProvider)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        UPDATE GL_Journal" +
      "        SET AD_Org_ID = (?) , C_AcctSchema_ID = (?) , DocumentNo = (?) , Description = (?) , C_DocType_ID = (?) , DateDoc = TO_DATE(?) , DateAcct = TO_DATE(?) , C_Period_ID = (?) , C_Currency_ID = (?) , CurrencyRateType = (?) , CurrencyRate = TO_NUMBER(?) , IsOpening = (?) , ControlAmt = TO_NUMBER(?) , TotalDr = TO_NUMBER(?) , DocAction = (?) , TotalCr = TO_NUMBER(?) , Posted = (?) , DocStatus = (?) , IsActive = (?) , IsPrinted = (?) , GL_Category_ID = (?) , IsApproved = (?) , C_Bpartner_ID = (?) , M_Product_ID = (?) , C_Project_ID = (?) , C_Costcenter_ID = (?) , A_Asset_ID = (?) , C_Campaign_ID = (?) , User1_ID = (?) , User2_ID = (?) , Processed = (?) , PostingType = (?) , AD_Client_ID = (?) , GL_Journal_ID = (?) , GL_JournalBatch_ID = (?) , Processing = (?) , updated = now(), updatedby = ? " +
      "        WHERE GL_Journal.GL_Journal_ID = ? " +
      "                 AND GL_Journal.GL_JournalBatch_ID = ? " +
      "        AND GL_Journal.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND GL_Journal.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cAcctschemaId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, documentno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cDoctypeId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, datedoc);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateacct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cPeriodId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCurrencyId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, currencyratetype);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, currencyrate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isopening);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, controlamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, totaldr);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, docaction);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, totalcr);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, posted);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, docstatus);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isprinted);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, glCategoryId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isapproved);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cProjectId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCostcenterId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, aAssetId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCampaignId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, user1Id);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, user2Id);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processed);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, postingtype);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, glJournalId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, glJournalbatchId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processing);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, glJournalId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, glJournalbatchId);
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
      "        INSERT INTO GL_Journal " +
      "        (AD_Org_ID, C_AcctSchema_ID, DocumentNo, Description, C_DocType_ID, DateDoc, DateAcct, C_Period_ID, C_Currency_ID, CurrencyRateType, CurrencyRate, IsOpening, ControlAmt, TotalDr, DocAction, TotalCr, Posted, DocStatus, IsActive, IsPrinted, GL_Category_ID, IsApproved, C_Bpartner_ID, M_Product_ID, C_Project_ID, C_Costcenter_ID, A_Asset_ID, C_Campaign_ID, User1_ID, User2_ID, Processed, PostingType, AD_Client_ID, GL_Journal_ID, GL_JournalBatch_ID, Processing, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), (?), (?), (?), TO_DATE(?), TO_DATE(?), (?), (?), (?), TO_NUMBER(?), (?), TO_NUMBER(?), TO_NUMBER(?), (?), TO_NUMBER(?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cAcctschemaId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, documentno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cDoctypeId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, datedoc);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateacct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cPeriodId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCurrencyId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, currencyratetype);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, currencyrate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isopening);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, controlamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, totaldr);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, docaction);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, totalcr);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, posted);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, docstatus);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isprinted);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, glCategoryId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isapproved);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cProjectId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCostcenterId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, aAssetId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCampaignId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, user1Id);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, user2Id);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processed);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, postingtype);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, glJournalId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, glJournalbatchId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processing);
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

  public static int delete(ConnectionProvider connectionProvider, String param1, String glJournalbatchId, String adUserClient, String adOrgClient)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        DELETE FROM GL_Journal" +
      "        WHERE GL_Journal.GL_Journal_ID = ? " +
      "                 AND GL_Journal.GL_JournalBatch_ID = ? " +
      "        AND GL_Journal.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND GL_Journal.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, param1);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, glJournalbatchId);
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
      "          FROM GL_Journal" +
      "         WHERE GL_Journal.GL_Journal_ID = ? ";

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
      "          FROM GL_Journal" +
      "         WHERE GL_Journal.GL_Journal_ID = ? ";

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
