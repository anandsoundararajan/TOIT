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
class BatchData implements FieldProvider {
static Logger log4j = Logger.getLogger(BatchData.class);
  private String InitRecordNumber="0";
  public String created;
  public String createdbyr;
  public String updated;
  public String updatedTimeStamp;
  public String updatedby;
  public String updatedbyr;
  public String adOrgId;
  public String adOrgIdr;
  public String documentno;
  public String description;
  public String datedoc;
  public String dateacct;
  public String cPeriodId;
  public String cPeriodIdr;
  public String cCurrencyId;
  public String cCurrencyIdr;
  public String istemplate;
  public String controlamt;
  public String totaldr;
  public String totalcr;
  public String copyfrom;
  public String processing;
  public String isactive;
  public String glCategoryId;
  public String adClientId;
  public String processed;
  public String postingtype;
  public String glJournalbatchId;
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
    else if (fieldName.equalsIgnoreCase("documentno"))
      return documentno;
    else if (fieldName.equalsIgnoreCase("description"))
      return description;
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
    else if (fieldName.equalsIgnoreCase("istemplate"))
      return istemplate;
    else if (fieldName.equalsIgnoreCase("controlamt"))
      return controlamt;
    else if (fieldName.equalsIgnoreCase("totaldr"))
      return totaldr;
    else if (fieldName.equalsIgnoreCase("totalcr"))
      return totalcr;
    else if (fieldName.equalsIgnoreCase("copyfrom"))
      return copyfrom;
    else if (fieldName.equalsIgnoreCase("processing"))
      return processing;
    else if (fieldName.equalsIgnoreCase("isactive"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("gl_category_id") || fieldName.equals("glCategoryId"))
      return glCategoryId;
    else if (fieldName.equalsIgnoreCase("ad_client_id") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("processed"))
      return processed;
    else if (fieldName.equalsIgnoreCase("postingtype"))
      return postingtype;
    else if (fieldName.equalsIgnoreCase("gl_journalbatch_id") || fieldName.equals("glJournalbatchId"))
      return glJournalbatchId;
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
  public static BatchData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static BatchData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(GL_JournalBatch.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = GL_JournalBatch.CreatedBy) as CreatedByR, " +
      "        to_char(GL_JournalBatch.Updated, ?) as updated, " +
      "        to_char(GL_JournalBatch.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        GL_JournalBatch.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = GL_JournalBatch.UpdatedBy) as UpdatedByR," +
      "        GL_JournalBatch.AD_Org_ID, " +
      "(CASE WHEN GL_JournalBatch.AD_Org_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.Name), ''))),'') ) END) AS AD_Org_IDR, " +
      "GL_JournalBatch.DocumentNo, " +
      "GL_JournalBatch.Description, " +
      "GL_JournalBatch.DateDoc, " +
      "GL_JournalBatch.DateAcct, " +
      "GL_JournalBatch.C_Period_ID, " +
      "(CASE WHEN GL_JournalBatch.C_Period_ID IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Name), ''))),'') ) END) AS C_Period_IDR, " +
      "GL_JournalBatch.C_Currency_ID, " +
      "(CASE WHEN GL_JournalBatch.C_Currency_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table3.ISO_Code), ''))),'') ) END) AS C_Currency_IDR, " +
      "COALESCE(GL_JournalBatch.IsTemplate, 'N') AS IsTemplate, " +
      "GL_JournalBatch.ControlAmt, " +
      "GL_JournalBatch.TotalDr, " +
      "GL_JournalBatch.TotalCr, " +
      "GL_JournalBatch.CopyFrom, " +
      "GL_JournalBatch.Processing, " +
      "COALESCE(GL_JournalBatch.IsActive, 'N') AS IsActive, " +
      "GL_JournalBatch.GL_Category_ID, " +
      "GL_JournalBatch.AD_Client_ID, " +
      "COALESCE(GL_JournalBatch.Processed, 'N') AS Processed, " +
      "GL_JournalBatch.PostingType, " +
      "GL_JournalBatch.GL_JournalBatch_ID, " +
      "        ? AS LANGUAGE " +
      "        FROM GL_JournalBatch left join (select AD_Org_ID, Name from AD_Org) table1 on (GL_JournalBatch.AD_Org_ID = table1.AD_Org_ID) left join (select C_Period_ID, Name from C_Period) table2 on (GL_JournalBatch.C_Period_ID =  table2.C_Period_ID) left join (select C_Currency_ID, ISO_Code from C_Currency) table3 on (GL_JournalBatch.C_Currency_ID = table3.C_Currency_ID)" +
      "        WHERE 2=2 " +
      "        AND 1=1 " +
      "        AND GL_JournalBatch.GL_JournalBatch_ID = ? " +
      "        AND GL_JournalBatch.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND GL_JournalBatch.AD_Org_ID IN (";
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
        BatchData objectBatchData = new BatchData();
        objectBatchData.created = UtilSql.getValue(result, "created");
        objectBatchData.createdbyr = UtilSql.getValue(result, "createdbyr");
        objectBatchData.updated = UtilSql.getValue(result, "updated");
        objectBatchData.updatedTimeStamp = UtilSql.getValue(result, "updated_time_stamp");
        objectBatchData.updatedby = UtilSql.getValue(result, "updatedby");
        objectBatchData.updatedbyr = UtilSql.getValue(result, "updatedbyr");
        objectBatchData.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectBatchData.adOrgIdr = UtilSql.getValue(result, "ad_org_idr");
        objectBatchData.documentno = UtilSql.getValue(result, "documentno");
        objectBatchData.description = UtilSql.getValue(result, "description");
        objectBatchData.datedoc = UtilSql.getDateValue(result, "datedoc", "dd-MM-yyyy");
        objectBatchData.dateacct = UtilSql.getDateValue(result, "dateacct", "dd-MM-yyyy");
        objectBatchData.cPeriodId = UtilSql.getValue(result, "c_period_id");
        objectBatchData.cPeriodIdr = UtilSql.getValue(result, "c_period_idr");
        objectBatchData.cCurrencyId = UtilSql.getValue(result, "c_currency_id");
        objectBatchData.cCurrencyIdr = UtilSql.getValue(result, "c_currency_idr");
        objectBatchData.istemplate = UtilSql.getValue(result, "istemplate");
        objectBatchData.controlamt = UtilSql.getValue(result, "controlamt");
        objectBatchData.totaldr = UtilSql.getValue(result, "totaldr");
        objectBatchData.totalcr = UtilSql.getValue(result, "totalcr");
        objectBatchData.copyfrom = UtilSql.getValue(result, "copyfrom");
        objectBatchData.processing = UtilSql.getValue(result, "processing");
        objectBatchData.isactive = UtilSql.getValue(result, "isactive");
        objectBatchData.glCategoryId = UtilSql.getValue(result, "gl_category_id");
        objectBatchData.adClientId = UtilSql.getValue(result, "ad_client_id");
        objectBatchData.processed = UtilSql.getValue(result, "processed");
        objectBatchData.postingtype = UtilSql.getValue(result, "postingtype");
        objectBatchData.glJournalbatchId = UtilSql.getValue(result, "gl_journalbatch_id");
        objectBatchData.language = UtilSql.getValue(result, "language");
        objectBatchData.adUserClient = "";
        objectBatchData.adOrgClient = "";
        objectBatchData.createdby = "";
        objectBatchData.trBgcolor = "";
        objectBatchData.totalCount = "";
        objectBatchData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectBatchData);
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
    BatchData objectBatchData[] = new BatchData[vector.size()];
    vector.copyInto(objectBatchData);
    return(objectBatchData);
  }

/**
Create a registry
 */
  public static BatchData[] set(String glJournalbatchId, String adClientId, String adOrgId, String isactive, String createdby, String createdbyr, String updatedby, String updatedbyr, String documentno, String description, String postingtype, String glCategoryId, String cPeriodId, String cCurrencyId, String totaldr, String totalcr, String controlamt, String datedoc, String dateacct, String processing, String processed, String istemplate, String copyfrom)    throws ServletException {
    BatchData objectBatchData[] = new BatchData[1];
    objectBatchData[0] = new BatchData();
    objectBatchData[0].created = "";
    objectBatchData[0].createdbyr = createdbyr;
    objectBatchData[0].updated = "";
    objectBatchData[0].updatedTimeStamp = "";
    objectBatchData[0].updatedby = updatedby;
    objectBatchData[0].updatedbyr = updatedbyr;
    objectBatchData[0].adOrgId = adOrgId;
    objectBatchData[0].adOrgIdr = "";
    objectBatchData[0].documentno = documentno;
    objectBatchData[0].description = description;
    objectBatchData[0].datedoc = datedoc;
    objectBatchData[0].dateacct = dateacct;
    objectBatchData[0].cPeriodId = cPeriodId;
    objectBatchData[0].cPeriodIdr = "";
    objectBatchData[0].cCurrencyId = cCurrencyId;
    objectBatchData[0].cCurrencyIdr = "";
    objectBatchData[0].istemplate = istemplate;
    objectBatchData[0].controlamt = controlamt;
    objectBatchData[0].totaldr = totaldr;
    objectBatchData[0].totalcr = totalcr;
    objectBatchData[0].copyfrom = copyfrom;
    objectBatchData[0].processing = processing;
    objectBatchData[0].isactive = isactive;
    objectBatchData[0].glCategoryId = glCategoryId;
    objectBatchData[0].adClientId = adClientId;
    objectBatchData[0].processed = processed;
    objectBatchData[0].postingtype = postingtype;
    objectBatchData[0].glJournalbatchId = glJournalbatchId;
    objectBatchData[0].language = "";
    return objectBatchData;
  }

/**
Select for auxiliar field
 */
  public static String selectDef1646_0(ConnectionProvider connectionProvider, String CreatedByR)    throws ServletException {
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
  public static String selectDef1648_1(ConnectionProvider connectionProvider, String UpdatedByR)    throws ServletException {
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
  public static String selectDef1654(ConnectionProvider connectionProvider, String AD_Client_ID, String AD_Org_ID, String DateAcct)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "         SELECT C_Period_ID FROM C_Period WHERE C_Year_ID IN (SELECT C_Year_ID FROM C_Year WHERE C_Calendar_ID =(SELECT C_Calendar_ID FROM AD_ORG WHERE AD_Client_ID= ? AND AD_ORG_ID=(SELECT AD_ORG_GETCALENDAROWNER( ? ) from dual))) AND to_date( ? ) BETWEEN StartDate AND EndDate AND PeriodType='S' AND exists (select 1 from c_periodcontrol where c_periodcontrol.c_period_id = c_period.c_period_id AND periodstatus = 'O') ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, AD_Client_ID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, AD_Org_ID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, DateAcct);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "c_period_id");
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
Select for action search
 */
  public static String selectActDefGL_JournalBatch_ID(ConnectionProvider connectionProvider, String GL_JournalBatch_ID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT DocumentNo FROM GL_JournalBatch WHERE isActive='Y' AND GL_JournalBatch_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, GL_JournalBatch_ID);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "documentno");
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
      "        UPDATE GL_JournalBatch" +
      "        SET AD_Org_ID = (?) , DocumentNo = (?) , Description = (?) , DateDoc = TO_DATE(?) , DateAcct = TO_DATE(?) , C_Period_ID = (?) , C_Currency_ID = (?) , IsTemplate = (?) , ControlAmt = TO_NUMBER(?) , TotalDr = TO_NUMBER(?) , TotalCr = TO_NUMBER(?) , CopyFrom = (?) , Processing = (?) , IsActive = (?) , GL_Category_ID = (?) , AD_Client_ID = (?) , Processed = (?) , PostingType = (?) , GL_JournalBatch_ID = (?) , updated = now(), updatedby = ? " +
      "        WHERE GL_JournalBatch.GL_JournalBatch_ID = ? " +
      "        AND GL_JournalBatch.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND GL_JournalBatch.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, documentno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, datedoc);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateacct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cPeriodId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCurrencyId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, istemplate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, controlamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, totaldr);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, totalcr);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, copyfrom);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processing);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, glCategoryId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processed);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, postingtype);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, glJournalbatchId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
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
      "        INSERT INTO GL_JournalBatch " +
      "        (AD_Org_ID, DocumentNo, Description, DateDoc, DateAcct, C_Period_ID, C_Currency_ID, IsTemplate, ControlAmt, TotalDr, TotalCr, CopyFrom, Processing, IsActive, GL_Category_ID, AD_Client_ID, Processed, PostingType, GL_JournalBatch_ID, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), (?), TO_DATE(?), TO_DATE(?), (?), (?), (?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), (?), (?), (?), (?), (?), (?), (?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, documentno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, datedoc);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateacct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cPeriodId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCurrencyId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, istemplate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, controlamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, totaldr);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, totalcr);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, copyfrom);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processing);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, glCategoryId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processed);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, postingtype);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, glJournalbatchId);
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

  public static int delete(ConnectionProvider connectionProvider, String param1, String adUserClient, String adOrgClient)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        DELETE FROM GL_JournalBatch" +
      "        WHERE GL_JournalBatch.GL_JournalBatch_ID = ? " +
      "        AND GL_JournalBatch.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND GL_JournalBatch.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, param1);
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
      "          FROM GL_JournalBatch" +
      "         WHERE GL_JournalBatch.GL_JournalBatch_ID = ? ";

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
      "          FROM GL_JournalBatch" +
      "         WHERE GL_JournalBatch.GL_JournalBatch_ID = ? ";

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
