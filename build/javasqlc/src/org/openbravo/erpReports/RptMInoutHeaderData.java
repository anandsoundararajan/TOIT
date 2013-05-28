//Sqlc generated V1.O00-1
package org.openbravo.erpReports;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import java.util.*;

class RptMInoutHeaderData implements FieldProvider {
static Logger log4j = Logger.getLogger(RptMInoutHeaderData.class);
  private String InitRecordNumber="0";
  public String mInoutId;
  public String name;
  public String address;
  public String postal;
  public String region;
  public String documentno;
  public String movementdate;
  public String partnerValue;
  public String taxid;
  public String poreference;
  public String entity;
  public String entityLocation;
  public String datepromised;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("m_inout_id") || fieldName.equals("mInoutId"))
      return mInoutId;
    else if (fieldName.equalsIgnoreCase("name"))
      return name;
    else if (fieldName.equalsIgnoreCase("address"))
      return address;
    else if (fieldName.equalsIgnoreCase("postal"))
      return postal;
    else if (fieldName.equalsIgnoreCase("region"))
      return region;
    else if (fieldName.equalsIgnoreCase("documentno"))
      return documentno;
    else if (fieldName.equalsIgnoreCase("movementdate"))
      return movementdate;
    else if (fieldName.equalsIgnoreCase("partner_value") || fieldName.equals("partnerValue"))
      return partnerValue;
    else if (fieldName.equalsIgnoreCase("taxid"))
      return taxid;
    else if (fieldName.equalsIgnoreCase("poreference"))
      return poreference;
    else if (fieldName.equalsIgnoreCase("entity"))
      return entity;
    else if (fieldName.equalsIgnoreCase("entity_location") || fieldName.equals("entityLocation"))
      return entityLocation;
    else if (fieldName.equalsIgnoreCase("datepromised"))
      return datepromised;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static RptMInoutHeaderData[] select(ConnectionProvider connectionProvider, String mInoutId)    throws ServletException {
    return select(connectionProvider, mInoutId, 0, 0);
  }

  public static RptMInoutHeaderData[] select(ConnectionProvider connectionProvider, String mInoutId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT M_INOUT.M_INOUT_ID, C_BPARTNER_LOCATION.NAME, COALESCE(TO_CHAR(C_LOCATION.ADDRESS1),'')||COALESCE(TO_CHAR(C_LOCATION.ADDRESS2),'') AS ADDRESS, COALESCE(TO_CHAR(C_LOCATION.POSTAL),'')||' - '||COALESCE(TO_CHAR(C_LOCATION.CITY),'') AS POSTAL," +
      "        C_REGION.NAME AS REGION, M_INOUT.DOCUMENTNO, M_INOUT.MOVEMENTDATE, C_BPARTNER.VALUE AS PARTNER_VALUE, C_BPARTNER.TAXID, " +
      "        MAX(C_ORDER.POREFERENCE) AS POREFERENCE, AD_CLIENT.DESCRIPTION AS ENTITY, C_LOCATION_DESCRIPTION(AD_ORGINFO.C_LOCATION_ID) AS ENTITY_LOCATION, C_ORDER.DATEPROMISED" +
      "        FROM C_BPARTNER_LOCATION right join M_INOUT on M_INOUT.C_BPARTNER_LOCATION_ID = C_BPARTNER_LOCATION.C_BPARTNER_LOCATION_ID" +
      "                                 left join C_LOCATION on C_BPARTNER_LOCATION.C_LOCATION_ID = C_LOCATION.C_LOCATION_ID" +
      "                                 left join C_REGION on C_LOCATION.C_REGION_ID = C_REGION.C_REGION_ID" +
      "                                 left join C_ORDER on M_INOUT.C_ORDER_ID = C_ORDER.C_ORDER_ID," +
      "             C_BPARTNER, AD_CLIENT, AD_ORGINFO" +
      "        WHERE M_INOUT.C_BPARTNER_ID = C_BPARTNER.C_BPARTNER_ID" +
      "        AND M_INOUT.AD_CLIENT_ID = AD_CLIENT.AD_CLIENT_ID" +
      "        AND M_INOUT.AD_ORG_ID = AD_ORGINFO.AD_ORG_ID" +
      "        AND COALESCE(C_BPARTNER_LOCATION.ISSHIPTO, 'Y') = 'Y'" +
      "        AND M_INOUT.M_INOUT_ID = ?" +
      "        GROUP BY M_INOUT.M_INOUT_ID, C_BPARTNER.NAME, C_BPARTNER_LOCATION.NAME, C_LOCATION.ADDRESS1, C_LOCATION.ADDRESS2, C_LOCATION.POSTAL, C_LOCATION.CITY, C_REGION.NAME, " +
      "        M_INOUT.DOCUMENTNO, M_INOUT.MOVEMENTDATE, C_BPARTNER.VALUE, C_BPARTNER.TAXID, AD_CLIENT.DESCRIPTION, AD_ORGINFO.C_LOCATION_ID, C_ORDER.DATEPROMISED";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mInoutId);

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
        RptMInoutHeaderData objectRptMInoutHeaderData = new RptMInoutHeaderData();
        objectRptMInoutHeaderData.mInoutId = UtilSql.getValue(result, "m_inout_id");
        objectRptMInoutHeaderData.name = UtilSql.getValue(result, "name");
        objectRptMInoutHeaderData.address = UtilSql.getValue(result, "address");
        objectRptMInoutHeaderData.postal = UtilSql.getValue(result, "postal");
        objectRptMInoutHeaderData.region = UtilSql.getValue(result, "region");
        objectRptMInoutHeaderData.documentno = UtilSql.getValue(result, "documentno");
        objectRptMInoutHeaderData.movementdate = UtilSql.getDateValue(result, "movementdate", "dd-MM-yyyy");
        objectRptMInoutHeaderData.partnerValue = UtilSql.getValue(result, "partner_value");
        objectRptMInoutHeaderData.taxid = UtilSql.getValue(result, "taxid");
        objectRptMInoutHeaderData.poreference = UtilSql.getValue(result, "poreference");
        objectRptMInoutHeaderData.entity = UtilSql.getValue(result, "entity");
        objectRptMInoutHeaderData.entityLocation = UtilSql.getValue(result, "entity_location");
        objectRptMInoutHeaderData.datepromised = UtilSql.getDateValue(result, "datepromised", "dd-MM-yyyy");
        objectRptMInoutHeaderData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectRptMInoutHeaderData);
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
    RptMInoutHeaderData objectRptMInoutHeaderData[] = new RptMInoutHeaderData[vector.size()];
    vector.copyInto(objectRptMInoutHeaderData);
    return(objectRptMInoutHeaderData);
  }

  public static RptMInoutHeaderData[] set()    throws ServletException {
    RptMInoutHeaderData objectRptMInoutHeaderData[] = new RptMInoutHeaderData[1];
    objectRptMInoutHeaderData[0] = new RptMInoutHeaderData();
    objectRptMInoutHeaderData[0].mInoutId = "";
    objectRptMInoutHeaderData[0].name = "";
    objectRptMInoutHeaderData[0].address = "";
    objectRptMInoutHeaderData[0].postal = "";
    objectRptMInoutHeaderData[0].region = "";
    objectRptMInoutHeaderData[0].documentno = "";
    objectRptMInoutHeaderData[0].movementdate = "";
    objectRptMInoutHeaderData[0].partnerValue = "";
    objectRptMInoutHeaderData[0].taxid = "";
    objectRptMInoutHeaderData[0].poreference = "";
    objectRptMInoutHeaderData[0].entity = "";
    objectRptMInoutHeaderData[0].entityLocation = "";
    objectRptMInoutHeaderData[0].datepromised = "";
    return objectRptMInoutHeaderData;
  }
}
