//Sqlc generated V1.O00-1
package org.openbravo.erpCommon.ad_reports;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import java.util.*;

class AttributeSetInstanceComboData implements FieldProvider {
static Logger log4j = Logger.getLogger(AttributeSetInstanceComboData.class);
  private String InitRecordNumber="0";
  public String padre;
  public String id;
  public String name;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("padre"))
      return padre;
    else if (fieldName.equalsIgnoreCase("id"))
      return id;
    else if (fieldName.equalsIgnoreCase("name"))
      return name;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static AttributeSetInstanceComboData[] select(ConnectionProvider connectionProvider, String adLanguage, String mProductId, String adUserClient, String adUserOrg)    throws ServletException {
    return select(connectionProvider, adLanguage, mProductId, adUserClient, adUserOrg, 0, 0);
  }

  public static AttributeSetInstanceComboData[] select(ConnectionProvider connectionProvider, String adLanguage, String mProductId, String adUserClient, String adUserOrg, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "       SELECT DISTINCT M_PRODUCT_ID AS PADRE, M_ATTRIBUTESETINSTANCE_ID AS ID, AD_COLUMN_IDENTIFIER(TO_CHAR('M_ATTRIBUTESETINSTANCE'), TO_CHAR(M_ATTRIBUTESETINSTANCE_ID), TO_CHAR(?)) AS NAME" +
      "       FROM M_TRANSACTION" +
      "       WHERE 1=1" +
      "        AND M_PRODUCT_ID = ?" +
      "        AND AD_CLIENT_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ")" +
      "        AND AD_ORG_ID IN (";
    strSql = strSql + ((adUserOrg==null || adUserOrg.equals(""))?"":adUserOrg);
    strSql = strSql + 
      ")" +
      "        AND M_ATTRIBUTESETINSTANCE_ID <> '0'" +
      "       ORDER BY NAME";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
      if (adUserClient != null && !(adUserClient.equals(""))) {
        }
      if (adUserOrg != null && !(adUserOrg.equals(""))) {
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
        AttributeSetInstanceComboData objectAttributeSetInstanceComboData = new AttributeSetInstanceComboData();
        objectAttributeSetInstanceComboData.padre = UtilSql.getValue(result, "padre");
        objectAttributeSetInstanceComboData.id = UtilSql.getValue(result, "id");
        objectAttributeSetInstanceComboData.name = UtilSql.getValue(result, "name");
        objectAttributeSetInstanceComboData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectAttributeSetInstanceComboData);
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
    AttributeSetInstanceComboData objectAttributeSetInstanceComboData[] = new AttributeSetInstanceComboData[vector.size()];
    vector.copyInto(objectAttributeSetInstanceComboData);
    return(objectAttributeSetInstanceComboData);
  }
}
