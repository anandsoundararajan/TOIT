//Sqlc generated V1.O00-1
package org.openbravo.erpWindows.org.openbravo.retail.config.Assortment;

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
class Assortment09EF738DE00C4500819EC13BB48DEAE2Data implements FieldProvider {
static Logger log4j = Logger.getLogger(Assortment09EF738DE00C4500819EC13BB48DEAE2Data.class);
  private String InitRecordNumber="0";
  public String created;
  public String createdbyr;
  public String updated;
  public String updatedTimeStamp;
  public String updatedby;
  public String updatedbyr;
  public String adOrgId;
  public String adOrgIdr;
  public String name;
  public String description;
  public String isactive;
  public String includeallProduct;
  public String adClientId;
  public String obretcoProductlistId;
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
    else if (fieldName.equalsIgnoreCase("name"))
      return name;
    else if (fieldName.equalsIgnoreCase("description"))
      return description;
    else if (fieldName.equalsIgnoreCase("isactive"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("includeall_product") || fieldName.equals("includeallProduct"))
      return includeallProduct;
    else if (fieldName.equalsIgnoreCase("ad_client_id") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("obretco_productlist_id") || fieldName.equals("obretcoProductlistId"))
      return obretcoProductlistId;
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
  public static Assortment09EF738DE00C4500819EC13BB48DEAE2Data[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static Assortment09EF738DE00C4500819EC13BB48DEAE2Data[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(OBRETCO_ProductList.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = OBRETCO_ProductList.CreatedBy) as CreatedByR, " +
      "        to_char(OBRETCO_ProductList.Updated, ?) as updated, " +
      "        to_char(OBRETCO_ProductList.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        OBRETCO_ProductList.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = OBRETCO_ProductList.UpdatedBy) as UpdatedByR," +
      "        OBRETCO_ProductList.AD_Org_ID, " +
      "(CASE WHEN OBRETCO_ProductList.AD_Org_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.Name), ''))),'') ) END) AS AD_Org_IDR, " +
      "OBRETCO_ProductList.Name, " +
      "OBRETCO_ProductList.Description, " +
      "COALESCE(OBRETCO_ProductList.Isactive, 'N') AS Isactive, " +
      "OBRETCO_ProductList.Includeall_Product, " +
      "OBRETCO_ProductList.AD_Client_ID, " +
      "OBRETCO_ProductList.Obretco_Productlist_ID, " +
      "        ? AS LANGUAGE " +
      "        FROM OBRETCO_ProductList left join (select AD_Org_ID, Name from AD_Org) table1 on (OBRETCO_ProductList.AD_Org_ID = table1.AD_Org_ID)" +
      "        WHERE 2=2 " +
      "        AND 1=1 " +
      "        AND OBRETCO_ProductList.Obretco_Productlist_ID = ? " +
      "        AND OBRETCO_ProductList.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND OBRETCO_ProductList.AD_Org_ID IN (";
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
        Assortment09EF738DE00C4500819EC13BB48DEAE2Data objectAssortment09EF738DE00C4500819EC13BB48DEAE2Data = new Assortment09EF738DE00C4500819EC13BB48DEAE2Data();
        objectAssortment09EF738DE00C4500819EC13BB48DEAE2Data.created = UtilSql.getValue(result, "created");
        objectAssortment09EF738DE00C4500819EC13BB48DEAE2Data.createdbyr = UtilSql.getValue(result, "createdbyr");
        objectAssortment09EF738DE00C4500819EC13BB48DEAE2Data.updated = UtilSql.getValue(result, "updated");
        objectAssortment09EF738DE00C4500819EC13BB48DEAE2Data.updatedTimeStamp = UtilSql.getValue(result, "updated_time_stamp");
        objectAssortment09EF738DE00C4500819EC13BB48DEAE2Data.updatedby = UtilSql.getValue(result, "updatedby");
        objectAssortment09EF738DE00C4500819EC13BB48DEAE2Data.updatedbyr = UtilSql.getValue(result, "updatedbyr");
        objectAssortment09EF738DE00C4500819EC13BB48DEAE2Data.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectAssortment09EF738DE00C4500819EC13BB48DEAE2Data.adOrgIdr = UtilSql.getValue(result, "ad_org_idr");
        objectAssortment09EF738DE00C4500819EC13BB48DEAE2Data.name = UtilSql.getValue(result, "name");
        objectAssortment09EF738DE00C4500819EC13BB48DEAE2Data.description = UtilSql.getValue(result, "description");
        objectAssortment09EF738DE00C4500819EC13BB48DEAE2Data.isactive = UtilSql.getValue(result, "isactive");
        objectAssortment09EF738DE00C4500819EC13BB48DEAE2Data.includeallProduct = UtilSql.getValue(result, "includeall_product");
        objectAssortment09EF738DE00C4500819EC13BB48DEAE2Data.adClientId = UtilSql.getValue(result, "ad_client_id");
        objectAssortment09EF738DE00C4500819EC13BB48DEAE2Data.obretcoProductlistId = UtilSql.getValue(result, "obretco_productlist_id");
        objectAssortment09EF738DE00C4500819EC13BB48DEAE2Data.language = UtilSql.getValue(result, "language");
        objectAssortment09EF738DE00C4500819EC13BB48DEAE2Data.adUserClient = "";
        objectAssortment09EF738DE00C4500819EC13BB48DEAE2Data.adOrgClient = "";
        objectAssortment09EF738DE00C4500819EC13BB48DEAE2Data.createdby = "";
        objectAssortment09EF738DE00C4500819EC13BB48DEAE2Data.trBgcolor = "";
        objectAssortment09EF738DE00C4500819EC13BB48DEAE2Data.totalCount = "";
        objectAssortment09EF738DE00C4500819EC13BB48DEAE2Data.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectAssortment09EF738DE00C4500819EC13BB48DEAE2Data);
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
    Assortment09EF738DE00C4500819EC13BB48DEAE2Data objectAssortment09EF738DE00C4500819EC13BB48DEAE2Data[] = new Assortment09EF738DE00C4500819EC13BB48DEAE2Data[vector.size()];
    vector.copyInto(objectAssortment09EF738DE00C4500819EC13BB48DEAE2Data);
    return(objectAssortment09EF738DE00C4500819EC13BB48DEAE2Data);
  }

/**
Create a registry
 */
  public static Assortment09EF738DE00C4500819EC13BB48DEAE2Data[] set(String adOrgId, String adClientId, String isactive, String description, String createdby, String createdbyr, String obretcoProductlistId, String updatedby, String updatedbyr, String name, String includeallProduct)    throws ServletException {
    Assortment09EF738DE00C4500819EC13BB48DEAE2Data objectAssortment09EF738DE00C4500819EC13BB48DEAE2Data[] = new Assortment09EF738DE00C4500819EC13BB48DEAE2Data[1];
    objectAssortment09EF738DE00C4500819EC13BB48DEAE2Data[0] = new Assortment09EF738DE00C4500819EC13BB48DEAE2Data();
    objectAssortment09EF738DE00C4500819EC13BB48DEAE2Data[0].created = "";
    objectAssortment09EF738DE00C4500819EC13BB48DEAE2Data[0].createdbyr = createdbyr;
    objectAssortment09EF738DE00C4500819EC13BB48DEAE2Data[0].updated = "";
    objectAssortment09EF738DE00C4500819EC13BB48DEAE2Data[0].updatedTimeStamp = "";
    objectAssortment09EF738DE00C4500819EC13BB48DEAE2Data[0].updatedby = updatedby;
    objectAssortment09EF738DE00C4500819EC13BB48DEAE2Data[0].updatedbyr = updatedbyr;
    objectAssortment09EF738DE00C4500819EC13BB48DEAE2Data[0].adOrgId = adOrgId;
    objectAssortment09EF738DE00C4500819EC13BB48DEAE2Data[0].adOrgIdr = "";
    objectAssortment09EF738DE00C4500819EC13BB48DEAE2Data[0].name = name;
    objectAssortment09EF738DE00C4500819EC13BB48DEAE2Data[0].description = description;
    objectAssortment09EF738DE00C4500819EC13BB48DEAE2Data[0].isactive = isactive;
    objectAssortment09EF738DE00C4500819EC13BB48DEAE2Data[0].includeallProduct = includeallProduct;
    objectAssortment09EF738DE00C4500819EC13BB48DEAE2Data[0].adClientId = adClientId;
    objectAssortment09EF738DE00C4500819EC13BB48DEAE2Data[0].obretcoProductlistId = obretcoProductlistId;
    objectAssortment09EF738DE00C4500819EC13BB48DEAE2Data[0].language = "";
    return objectAssortment09EF738DE00C4500819EC13BB48DEAE2Data;
  }

/**
Select for auxiliar field
 */
  public static String selectDef871B24C3769141BEB6503DE534292804_0(ConnectionProvider connectionProvider, String CreatedbyR)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Name), ''))), '') ) as Createdby FROM AD_User left join (select AD_User_ID, Name from AD_User) table2 on (AD_User.AD_User_ID = table2.AD_User_ID) WHERE AD_User.isActive='Y' AND AD_User.AD_User_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, CreatedbyR);

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
  public static String selectDefCD38970666584A898B7BD35BD9C98FB7_1(ConnectionProvider connectionProvider, String UpdatedbyR)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Name), ''))), '') ) as Updatedby FROM AD_User left join (select AD_User_ID, Name from AD_User) table2 on (AD_User.AD_User_ID = table2.AD_User_ID) WHERE AD_User.isActive='Y' AND AD_User.AD_User_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, UpdatedbyR);

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

  public int update(Connection conn, ConnectionProvider connectionProvider)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        UPDATE OBRETCO_ProductList" +
      "        SET AD_Org_ID = (?) , Name = (?) , Description = (?) , Isactive = (?) , Includeall_Product = (?) , AD_Client_ID = (?) , Obretco_Productlist_ID = (?) , updated = now(), updatedby = ? " +
      "        WHERE OBRETCO_ProductList.Obretco_Productlist_ID = ? " +
      "        AND OBRETCO_ProductList.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND OBRETCO_ProductList.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, name);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, includeallProduct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, obretcoProductlistId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, obretcoProductlistId);
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
      "        INSERT INTO OBRETCO_ProductList " +
      "        (AD_Org_ID, Name, Description, Isactive, Includeall_Product, AD_Client_ID, Obretco_Productlist_ID, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), (?), (?), (?), (?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, name);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, includeallProduct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, obretcoProductlistId);
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
      "        DELETE FROM OBRETCO_ProductList" +
      "        WHERE OBRETCO_ProductList.Obretco_Productlist_ID = ? " +
      "        AND OBRETCO_ProductList.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND OBRETCO_ProductList.AD_Org_ID IN (";
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
      "          FROM OBRETCO_ProductList" +
      "         WHERE OBRETCO_ProductList.Obretco_Productlist_ID = ? ";

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
      "          FROM OBRETCO_ProductList" +
      "         WHERE OBRETCO_ProductList.Obretco_Productlist_ID = ? ";

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
