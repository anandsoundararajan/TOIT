//Sqlc generated V1.O00-1
package org.openbravo.utility.multiplebpselector;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import java.util.*;

class BusinessPartnerSelectorMULTIBPData implements FieldProvider {
static Logger log4j = Logger.getLogger(BusinessPartnerSelectorMULTIBPData.class);
  private String InitRecordNumber="0";
  public String rn1;
  public String cBpartnerId;
  public String value;
  public String name;
  public String nameHidden;
  public String soCreditavailable;
  public String soCreditused;
  public String actuallifetimevalue;
  public String url;
  public String email;
  public String salesrep;
  public String rowkey;
  public String position;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("rn1"))
      return rn1;
    else if (fieldName.equalsIgnoreCase("c_bpartner_id") || fieldName.equals("cBpartnerId"))
      return cBpartnerId;
    else if (fieldName.equalsIgnoreCase("value"))
      return value;
    else if (fieldName.equalsIgnoreCase("name"))
      return name;
    else if (fieldName.equalsIgnoreCase("name_hidden") || fieldName.equals("nameHidden"))
      return nameHidden;
    else if (fieldName.equalsIgnoreCase("so_creditavailable") || fieldName.equals("soCreditavailable"))
      return soCreditavailable;
    else if (fieldName.equalsIgnoreCase("so_creditused") || fieldName.equals("soCreditused"))
      return soCreditused;
    else if (fieldName.equalsIgnoreCase("actuallifetimevalue"))
      return actuallifetimevalue;
    else if (fieldName.equalsIgnoreCase("url"))
      return url;
    else if (fieldName.equalsIgnoreCase("email"))
      return email;
    else if (fieldName.equalsIgnoreCase("salesrep"))
      return salesrep;
    else if (fieldName.equalsIgnoreCase("rowkey"))
      return rowkey;
    else if (fieldName.equals("position"))
      return position;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static BusinessPartnerSelectorMULTIBPData[] select(ConnectionProvider connectionProvider, String rownum, String adUserClient, String adUserOrg, String key, String name, String contact, String codigoPostal, String provincia, String clients, String vendors, String bpGroup, String ciudad, String orderBy, String pgLimit, String oraLimit1, String oraLimit2)    throws ServletException {
    return select(connectionProvider, rownum, adUserClient, adUserOrg, key, name, contact, codigoPostal, provincia, clients, vendors, bpGroup, ciudad, orderBy, pgLimit, oraLimit1, oraLimit2, 0, 0);
  }

  public static BusinessPartnerSelectorMULTIBPData[] select(ConnectionProvider connectionProvider, String rownum, String adUserClient, String adUserOrg, String key, String name, String contact, String codigoPostal, String provincia, String clients, String vendors, String bpGroup, String ciudad, String orderBy, String pgLimit, String oraLimit1, String oraLimit2, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      	SELECT * FROM ( SELECT ";
    strSql = strSql + ((rownum==null || rownum.equals(""))?"":rownum);
    strSql = strSql + 
      " AS RN1, A.* FROM (" +
      "	        SELECT bp.C_BPartner_ID, bp.VALUE, bp.NAME as name, replace(bp.NAME, '''', CHR(92) || '''') as name_hidden, " +
      "	        (bp.SO_CreditLimit-bp.SO_CreditUsed) AS SO_CreditAvailable, bp.SO_CreditUsed, " +
      "	        bp.ActualLifetimeValue, bp.URL, MAX(s.EMAIL) AS EMAIL, MAX(sales.NAME) as SALESREP, bp.C_BPartner_ID || '#' || bp.NAME AS RowKey" +
      "	        FROM C_BPARTNER_LOCATION l left join AD_USER c on l.C_BPartner_Location_ID = c.C_BPartner_Location_ID and c.isactive='Y'" +
      "	                                   left join C_LOCATION a on l.C_Location_ID=a.C_Location_ID" +
      "	                                   left join C_REGION on a.C_REGION_ID = C_REGION.C_REGION_ID," +
      "	             C_BPARTNER bp left join  AD_USER s on bp.SALESREP_ID = s.c_bpartner_id " +
      "                               left join C_BPARTNER sales on bp.SALESREP_ID = sales.C_BPARTNER_ID" +
      "	        WHERE bp.C_BPARTNER_ID = l.C_BPartner_ID" +
      "	        AND bp.IsSummary='N' " +
      "	        AND bp.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "	        AND bp.AD_Org_ID IN (";
    strSql = strSql + ((adUserOrg==null || adUserOrg.equals(""))?"":adUserOrg);
    strSql = strSql + 
      ") " +
      "	        AND l.IsActive='Y'" +
      "	        AND 1=1";
    strSql = strSql + ((key==null || key.equals("") || key.equals("%") )?"":" AND UPPER(bp.Value) LIKE UPPER(?)  ");
    strSql = strSql + ((name==null || name.equals("") || name.equals("%") )?"":" AND UPPER(bp.Name) LIKE UPPER(?)  ");
    strSql = strSql + ((contact==null || contact.equals("") || contact.equals("%") )?"":" AND UPPER(c.Name) LIKE UPPER(?)  ");
    strSql = strSql + ((codigoPostal==null || codigoPostal.equals("") || codigoPostal.equals("%") )?"":" AND UPPER(a.Postal) LIKE UPPER(?)  ");
    strSql = strSql + ((provincia==null || provincia.equals("") || provincia.equals("%") )?"":" AND UPPER(C_REGION.NAME) LIKE UPPER(?) ");
    strSql = strSql + ((clients.equals("clients"))?" AND bp.ISCUSTOMER = 'Y'  ":"");
    strSql = strSql + ((vendors.equals("vendors"))?" AND bp.ISVENDOR ='Y' ":"");
    strSql = strSql + ((bpGroup==null || bpGroup.equals(""))?"":" AND bp.C_BP_GROUP_ID = ? ");
    strSql = strSql + ((ciudad==null || ciudad.equals("") || ciudad.equals("%") )?"":" AND UPPER(a.City) LIKE UPPER(?)  ");
    strSql = strSql + 
      "	        GROUP BY bp.C_BPartner_ID, bp.VALUE, bp.NAME, bp.SO_CreditLimit, bp.SO_CreditUsed, bp.ActualLifetimeValue, bp.URL" +
      "	        ORDER BY ";
    strSql = strSql + ((orderBy==null || orderBy.equals(""))?"":orderBy);
    strSql = strSql + ((pgLimit==null || pgLimit.equals(""))?"":" LIMIT " + pgLimit);
    strSql = strSql + 
      "	    	) A ";
    strSql = strSql + ((oraLimit1==null || oraLimit1.equals(""))?"":"  WHERE ROWNUM <= " + oraLimit1);
    strSql = strSql + 
      ") B" +
      "		WHERE 1=1";
    strSql = strSql + ((oraLimit2==null || oraLimit2.equals(""))?"":" AND RN1 BETWEEN " + oraLimit2);

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      if (rownum != null && !(rownum.equals(""))) {
        }
      if (adUserClient != null && !(adUserClient.equals(""))) {
        }
      if (adUserOrg != null && !(adUserOrg.equals(""))) {
        }
      if (key != null && !(key.equals("")) && !(key.equals("%"))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, key);
      }
      if (name != null && !(name.equals("")) && !(name.equals("%"))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, name);
      }
      if (contact != null && !(contact.equals("")) && !(contact.equals("%"))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, contact);
      }
      if (codigoPostal != null && !(codigoPostal.equals("")) && !(codigoPostal.equals("%"))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, codigoPostal);
      }
      if (provincia != null && !(provincia.equals("")) && !(provincia.equals("%"))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, provincia);
      }
      if (clients != null && !(clients.equals(""))) {
        }
      if (vendors != null && !(vendors.equals(""))) {
        }
      if (bpGroup != null && !(bpGroup.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, bpGroup);
      }
      if (ciudad != null && !(ciudad.equals("")) && !(ciudad.equals("%"))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, ciudad);
      }
      if (orderBy != null && !(orderBy.equals(""))) {
        }
      if (pgLimit != null && !(pgLimit.equals(""))) {
        }
      if (oraLimit1 != null && !(oraLimit1.equals(""))) {
        }
      if (oraLimit2 != null && !(oraLimit2.equals(""))) {
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
        BusinessPartnerSelectorMULTIBPData objectBusinessPartnerSelectorMULTIBPData = new BusinessPartnerSelectorMULTIBPData();
        objectBusinessPartnerSelectorMULTIBPData.rn1 = UtilSql.getValue(result, "rn1");
        objectBusinessPartnerSelectorMULTIBPData.cBpartnerId = UtilSql.getValue(result, "c_bpartner_id");
        objectBusinessPartnerSelectorMULTIBPData.value = UtilSql.getValue(result, "value");
        objectBusinessPartnerSelectorMULTIBPData.name = UtilSql.getValue(result, "name");
        objectBusinessPartnerSelectorMULTIBPData.nameHidden = UtilSql.getValue(result, "name_hidden");
        objectBusinessPartnerSelectorMULTIBPData.soCreditavailable = UtilSql.getValue(result, "so_creditavailable");
        objectBusinessPartnerSelectorMULTIBPData.soCreditused = UtilSql.getValue(result, "so_creditused");
        objectBusinessPartnerSelectorMULTIBPData.actuallifetimevalue = UtilSql.getValue(result, "actuallifetimevalue");
        objectBusinessPartnerSelectorMULTIBPData.url = UtilSql.getValue(result, "url");
        objectBusinessPartnerSelectorMULTIBPData.email = UtilSql.getValue(result, "email");
        objectBusinessPartnerSelectorMULTIBPData.salesrep = UtilSql.getValue(result, "salesrep");
        objectBusinessPartnerSelectorMULTIBPData.rowkey = UtilSql.getValue(result, "rowkey");
        objectBusinessPartnerSelectorMULTIBPData.position = Long.toString(countRecord);
        objectBusinessPartnerSelectorMULTIBPData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectBusinessPartnerSelectorMULTIBPData);
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
    BusinessPartnerSelectorMULTIBPData objectBusinessPartnerSelectorMULTIBPData[] = new BusinessPartnerSelectorMULTIBPData[vector.size()];
    vector.copyInto(objectBusinessPartnerSelectorMULTIBPData);
    return(objectBusinessPartnerSelectorMULTIBPData);
  }

  public static BusinessPartnerSelectorMULTIBPData[] set()    throws ServletException {
    BusinessPartnerSelectorMULTIBPData objectBusinessPartnerSelectorMULTIBPData[] = new BusinessPartnerSelectorMULTIBPData[1];
    objectBusinessPartnerSelectorMULTIBPData[0] = new BusinessPartnerSelectorMULTIBPData();
    objectBusinessPartnerSelectorMULTIBPData[0].rn1 = "";
    objectBusinessPartnerSelectorMULTIBPData[0].cBpartnerId = "";
    objectBusinessPartnerSelectorMULTIBPData[0].value = "";
    objectBusinessPartnerSelectorMULTIBPData[0].name = "";
    objectBusinessPartnerSelectorMULTIBPData[0].nameHidden = "";
    objectBusinessPartnerSelectorMULTIBPData[0].soCreditavailable = "";
    objectBusinessPartnerSelectorMULTIBPData[0].soCreditused = "";
    objectBusinessPartnerSelectorMULTIBPData[0].actuallifetimevalue = "";
    objectBusinessPartnerSelectorMULTIBPData[0].url = "";
    objectBusinessPartnerSelectorMULTIBPData[0].email = "";
    objectBusinessPartnerSelectorMULTIBPData[0].salesrep = "";
    objectBusinessPartnerSelectorMULTIBPData[0].rowkey = "";
    return objectBusinessPartnerSelectorMULTIBPData;
  }

  public static String countRows(ConnectionProvider connectionProvider, String adUserClient, String adUserOrg, String key, String name, String contact, String codigoPostal, String provincia, String clients, String vendors, String ciudad, String bpGroup)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "            SELECT count(*) FROM ( select bp.c_bpartner_id" +
      "            FROM C_BPARTNER_LOCATION l left join AD_USER c on l.C_BPartner_Location_ID = c.C_BPartner_Location_ID and c.isactive='Y'" +
      "                                       left join C_LOCATION a on l.C_Location_ID=a.C_Location_ID" +
      "                                       left join C_REGION on a.C_REGION_ID = C_REGION.C_REGION_ID," +
      "                 C_BPARTNER bp" +
      "            WHERE bp.C_BPARTNER_ID = l.C_BPartner_ID" +
      "            AND bp.IsSummary='N'" +
      "            AND bp.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ")" +
      "            AND bp.AD_Org_ID IN (";
    strSql = strSql + ((adUserOrg==null || adUserOrg.equals(""))?"":adUserOrg);
    strSql = strSql + 
      ")" +
      "            AND l.IsActive='Y'" +
      "            AND 1=1";
    strSql = strSql + ((key==null || key.equals("") || key.equals("%") )?"":" AND UPPER(bp.Value) LIKE UPPER(?)  ");
    strSql = strSql + ((name==null || name.equals("") || name.equals("%") )?"":" AND UPPER(bp.Name) LIKE UPPER(?)  ");
    strSql = strSql + ((contact==null || contact.equals("") || contact.equals("%") )?"":" AND UPPER(c.Name) LIKE UPPER(?)  ");
    strSql = strSql + ((codigoPostal==null || codigoPostal.equals("") || codigoPostal.equals("%") )?"":" AND UPPER(a.Postal) LIKE UPPER(?)  ");
    strSql = strSql + ((provincia==null || provincia.equals("") || provincia.equals("%") )?"":" AND UPPER(C_REGION.NAME) LIKE UPPER(?) ");
    strSql = strSql + ((clients.equals("clients"))?" AND bp.ISCUSTOMER = 'Y'  ":"");
    strSql = strSql + ((vendors.equals("vendors"))?" AND bp.ISVENDOR ='Y' ":"");
    strSql = strSql + ((ciudad==null || ciudad.equals("") || ciudad.equals("%") )?"":" AND UPPER(a.City) LIKE UPPER(?)  ");
    strSql = strSql + ((bpGroup==null || bpGroup.equals(""))?"":" AND bp.C_BP_GROUP_ID = ? ");
    strSql = strSql + 
      "            GROUP BY bp.C_BPartner_ID, bp.VALUE, bp.NAME, bp.SO_CreditLimit, bp.SO_CreditUsed, bp.ActualLifetimeValue, bp.URL) a";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      if (adUserClient != null && !(adUserClient.equals(""))) {
        }
      if (adUserOrg != null && !(adUserOrg.equals(""))) {
        }
      if (key != null && !(key.equals("")) && !(key.equals("%"))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, key);
      }
      if (name != null && !(name.equals("")) && !(name.equals("%"))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, name);
      }
      if (contact != null && !(contact.equals("")) && !(contact.equals("%"))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, contact);
      }
      if (codigoPostal != null && !(codigoPostal.equals("")) && !(codigoPostal.equals("%"))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, codigoPostal);
      }
      if (provincia != null && !(provincia.equals("")) && !(provincia.equals("%"))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, provincia);
      }
      if (clients != null && !(clients.equals(""))) {
        }
      if (vendors != null && !(vendors.equals(""))) {
        }
      if (ciudad != null && !(ciudad.equals("")) && !(ciudad.equals("%"))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, ciudad);
      }
      if (bpGroup != null && !(bpGroup.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, bpGroup);
      }

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "count");
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
