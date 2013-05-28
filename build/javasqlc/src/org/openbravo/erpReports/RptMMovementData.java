//Sqlc generated V1.O00-1
package org.openbravo.erpReports;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import java.util.*;

class RptMMovementData implements FieldProvider {
static Logger log4j = Logger.getLogger(RptMMovementData.class);
  private String InitRecordNumber="0";
  public String mMovementId;
  public String ejemplar;
  public String partnername;
  public String address1;
  public String address2;
  public String place;
  public String documentno;
  public String movementdate;
  public String productname;
  public String movementqty;
  public String quantityorder;
  public String uomname;
  public String refatt;
  public String description;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("m_movement_id") || fieldName.equals("mMovementId"))
      return mMovementId;
    else if (fieldName.equalsIgnoreCase("ejemplar"))
      return ejemplar;
    else if (fieldName.equalsIgnoreCase("partnername"))
      return partnername;
    else if (fieldName.equalsIgnoreCase("address1"))
      return address1;
    else if (fieldName.equalsIgnoreCase("address2"))
      return address2;
    else if (fieldName.equalsIgnoreCase("place"))
      return place;
    else if (fieldName.equalsIgnoreCase("documentno"))
      return documentno;
    else if (fieldName.equalsIgnoreCase("movementdate"))
      return movementdate;
    else if (fieldName.equalsIgnoreCase("productname"))
      return productname;
    else if (fieldName.equalsIgnoreCase("movementqty"))
      return movementqty;
    else if (fieldName.equalsIgnoreCase("quantityorder"))
      return quantityorder;
    else if (fieldName.equalsIgnoreCase("uomname"))
      return uomname;
    else if (fieldName.equalsIgnoreCase("refatt"))
      return refatt;
    else if (fieldName.equalsIgnoreCase("description"))
      return description;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static RptMMovementData[] select(ConnectionProvider connectionProvider, String mMovementId)    throws ServletException {
    return select(connectionProvider, mMovementId, 0, 0);
  }

  public static RptMMovementData[] select(ConnectionProvider connectionProvider, String mMovementId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT M_MOVEMENT.M_MOVEMENT_ID, '' AS EJEMPLAR, '' AS PARTNERNAME, '' AS ADDRESS1, '' AS ADDRESS2,  " +
      "        '' AS PLACE, '' AS DOCUMENTNO, " +
      "        '' AS MOVEMENTDATE, '' AS PRODUCTNAME, '' AS MOVEMENTQTY, " +
      "        '' AS QUANTITYORDER, '' AS UOMNAME, " +
      "        '' AS REFATT, '' AS DESCRIPTION" +
      "        FROM M_MOVEMENT" +
      "        WHERE 1=1";
    strSql = strSql + ((mMovementId==null || mMovementId.equals(""))?"":"           AND M_MOVEMENT.M_MOVEMENT_ID IN          " + mMovementId);

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    try {
    st = connectionProvider.getPreparedStatement(strSql);
      if (mMovementId != null && !(mMovementId.equals(""))) {
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
        RptMMovementData objectRptMMovementData = new RptMMovementData();
        objectRptMMovementData.mMovementId = UtilSql.getValue(result, "m_movement_id");
        objectRptMMovementData.ejemplar = UtilSql.getValue(result, "ejemplar");
        objectRptMMovementData.partnername = UtilSql.getValue(result, "partnername");
        objectRptMMovementData.address1 = UtilSql.getValue(result, "address1");
        objectRptMMovementData.address2 = UtilSql.getValue(result, "address2");
        objectRptMMovementData.place = UtilSql.getValue(result, "place");
        objectRptMMovementData.documentno = UtilSql.getValue(result, "documentno");
        objectRptMMovementData.movementdate = UtilSql.getValue(result, "movementdate");
        objectRptMMovementData.productname = UtilSql.getValue(result, "productname");
        objectRptMMovementData.movementqty = UtilSql.getValue(result, "movementqty");
        objectRptMMovementData.quantityorder = UtilSql.getValue(result, "quantityorder");
        objectRptMMovementData.uomname = UtilSql.getValue(result, "uomname");
        objectRptMMovementData.refatt = UtilSql.getValue(result, "refatt");
        objectRptMMovementData.description = UtilSql.getValue(result, "description");
        objectRptMMovementData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectRptMMovementData);
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
    RptMMovementData objectRptMMovementData[] = new RptMMovementData[vector.size()];
    vector.copyInto(objectRptMMovementData);
    return(objectRptMMovementData);
  }

  public static RptMMovementData[] set()    throws ServletException {
    RptMMovementData objectRptMMovementData[] = new RptMMovementData[1];
    objectRptMMovementData[0] = new RptMMovementData();
    objectRptMMovementData[0].mMovementId = "";
    objectRptMMovementData[0].ejemplar = "";
    objectRptMMovementData[0].partnername = "";
    objectRptMMovementData[0].address1 = "";
    objectRptMMovementData[0].address2 = "";
    objectRptMMovementData[0].place = "";
    objectRptMMovementData[0].documentno = "";
    objectRptMMovementData[0].movementdate = "";
    objectRptMMovementData[0].productname = "";
    objectRptMMovementData[0].movementqty = "";
    objectRptMMovementData[0].quantityorder = "";
    objectRptMMovementData[0].uomname = "";
    objectRptMMovementData[0].refatt = "";
    objectRptMMovementData[0].description = "";
    return objectRptMMovementData;
  }

  public static RptMMovementData[] selectMovement(ConnectionProvider connectionProvider, String mMovementId)    throws ServletException {
    return selectMovement(connectionProvider, mMovementId, 0, 0);
  }

  public static RptMMovementData[] selectMovement(ConnectionProvider connectionProvider, String mMovementId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT C_BPARTNER.NAME AS PARTNERNAME, C_LOCATION.ADDRESS1, C_LOCATION.ADDRESS2,  " +
      "        C_LOCATION.POSTAL||' '||C_LOCATION.CITY||' '||'('||C_REGION.NAME||')' AS PLACE, M_MOVEMENT.DOCUMENTNO, " +
      "        M_MOVEMENT.MOVEMENTDATE, M_PRODUCT.NAME AS PRODUCTNAME, SUM(M_MOVEMENTLINE.MOVEMENTQTY) AS MOVEMENTQTY, " +
      "        SUM(M_MOVEMENTLINE.QUANTITYORDER) AS QUANTITYORDER, C_UOM.NAME AS UOMNAME, " +
      "        (CASE TO_CHAR(SUBSTR(M_ATTRIBUTESETINSTANCE.DESCRIPTION,1,1)) WHEN '#' THEN TO_CHAR(SUBSTR(M_ATTRIBUTESETINSTANCE.DESCRIPTION,2," +
      "        LENGTH(M_ATTRIBUTESETINSTANCE.DESCRIPTION))) ELSE TO_CHAR(M_ATTRIBUTESETINSTANCE.DESCRIPTION) END) AS REFATT, M_MOVEMENT.DESCRIPTION" +
      "        FROM M_MOVEMENTLINE left join M_PRODUCT_UOM on M_MOVEMENTLINE.M_PRODUCT_UOM_ID = M_PRODUCT_UOM.M_PRODUCT_UOM_ID" +
      "                            left join M_ATTRIBUTESETINSTANCE on M_MOVEMENTLINE.M_ATTRIBUTESETINSTANCE_ID = M_ATTRIBUTESETINSTANCE.M_ATTRIBUTESETINSTANCE_ID" +
      "                            left join C_UOM on M_PRODUCT_UOM.C_UOM_ID = C_UOM.C_UOM_ID," +
      "        M_MOVEMENT, M_PRODUCT,  C_PROJECT, C_BPARTNER, C_BPARTNER_LOCATION, C_LOCATION, C_REGION" +
      "        WHERE M_MOVEMENT.M_MOVEMENT_ID = M_MOVEMENTLINE.M_MOVEMENT_ID" +
      "        AND M_MOVEMENTLINE.M_PRODUCT_ID = M_PRODUCT.M_PRODUCT_ID" +
      "        AND M_MOVEMENT.C_PROJECT_ID = C_PROJECT.C_PROJECT_ID" +
      "        AND C_PROJECT.C_BPARTNER_ID = C_BPARTNER.C_BPARTNER_ID" +
      "        AND C_PROJECT.C_BPARTNER_LOCATION_ID = C_BPARTNER_LOCATION.C_BPARTNER_LOCATION_ID" +
      "        AND C_BPARTNER_LOCATION.C_LOCATION_ID = C_LOCATION.C_LOCATION_ID" +
      "        AND C_LOCATION.C_REGION_ID = C_REGION.C_REGION_ID" +
      "        AND M_MOVEMENT.M_MOVEMENT_ID = ?" +
      "        GROUP BY M_MOVEMENT.DOCUMENTNO, M_MOVEMENT.MOVEMENTDATE, C_BPARTNER.NAME, C_UOM.NAME, " +
      "        C_LOCATION.ADDRESS1, C_LOCATION.ADDRESS2,  C_LOCATION.POSTAL||' '||C_LOCATION.CITY||' '||'('||C_REGION.NAME||')', M_PRODUCT.NAME, " +
      "        (CASE TO_CHAR(SUBSTR(M_ATTRIBUTESETINSTANCE.DESCRIPTION,1,1)) WHEN '#' THEN TO_CHAR(SUBSTR(M_ATTRIBUTESETINSTANCE.DESCRIPTION,2," +
      "        LENGTH(M_ATTRIBUTESETINSTANCE.DESCRIPTION))) ELSE TO_CHAR(M_ATTRIBUTESETINSTANCE.DESCRIPTION) END), M_MOVEMENT.DESCRIPTION " +
      "        ORDER BY PRODUCTNAME";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mMovementId);

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
        RptMMovementData objectRptMMovementData = new RptMMovementData();
        objectRptMMovementData.partnername = UtilSql.getValue(result, "partnername");
        objectRptMMovementData.address1 = UtilSql.getValue(result, "address1");
        objectRptMMovementData.address2 = UtilSql.getValue(result, "address2");
        objectRptMMovementData.place = UtilSql.getValue(result, "place");
        objectRptMMovementData.documentno = UtilSql.getValue(result, "documentno");
        objectRptMMovementData.movementdate = UtilSql.getDateValue(result, "movementdate", "dd-MM-yyyy");
        objectRptMMovementData.productname = UtilSql.getValue(result, "productname");
        objectRptMMovementData.movementqty = UtilSql.getValue(result, "movementqty");
        objectRptMMovementData.quantityorder = UtilSql.getValue(result, "quantityorder");
        objectRptMMovementData.uomname = UtilSql.getValue(result, "uomname");
        objectRptMMovementData.refatt = UtilSql.getValue(result, "refatt");
        objectRptMMovementData.description = UtilSql.getValue(result, "description");
        objectRptMMovementData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectRptMMovementData);
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
    RptMMovementData objectRptMMovementData[] = new RptMMovementData[vector.size()];
    vector.copyInto(objectRptMMovementData);
    return(objectRptMMovementData);
  }
}
