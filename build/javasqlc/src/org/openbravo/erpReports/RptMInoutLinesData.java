//Sqlc generated V1.O00-1
package org.openbravo.erpReports;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import java.util.*;

class RptMInoutLinesData implements FieldProvider {
static Logger log4j = Logger.getLogger(RptMInoutLinesData.class);
  private String InitRecordNumber="0";
  public String value;
  public String name;
  public String movementqty;
  public String lot;
  public String llot;
  public String description;
  public String upc;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("value"))
      return value;
    else if (fieldName.equalsIgnoreCase("name"))
      return name;
    else if (fieldName.equalsIgnoreCase("movementqty"))
      return movementqty;
    else if (fieldName.equalsIgnoreCase("lot"))
      return lot;
    else if (fieldName.equalsIgnoreCase("llot"))
      return llot;
    else if (fieldName.equalsIgnoreCase("description"))
      return description;
    else if (fieldName.equalsIgnoreCase("upc"))
      return upc;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static RptMInoutLinesData[] select(ConnectionProvider connectionProvider, String mInoutId)    throws ServletException {
    return select(connectionProvider, mInoutId, 0, 0);
  }

  public static RptMInoutLinesData[] select(ConnectionProvider connectionProvider, String mInoutId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      	SELECT M_PRODUCT.VALUE," +
      "		COALESCE((SELECT M_PRODUCT_CUSTOMER.NAME " +
      "			FROM M_PRODUCT_CUSTOMER " +
      "			WHERE M_PRODUCT_CUSTOMER.M_PRODUCT_ID=M_INOUTLINE.M_PRODUCT_ID" +
      "			AND M_PRODUCT_CUSTOMER.C_BPARTNER_ID=M_INOUT.C_BPARTNER_ID)" +
      "			,M_PRODUCT.NAME) AS NAME,SUM(M_INOUTLINE.MOVEMENTQTY) AS MOVEMENTQTY, M_ATTRIBUTESETINSTANCE.LOT || ' - ' || M_ATTRIBUTESETINSTANCE.GUARANTEEDATE AS LOT, REPLACE(M_INOUTLINE.DESCRIPTION, CHR(10), '') AS LLOT, REPLACE(M_INOUT.DESCRIPTION, CHR(10), '') AS DESCRIPTION, M_PRODUCT.UPC" +
      "        FROM M_INOUTLINE left join C_ORDERLINE on M_INOUTLINE.C_ORDERLINE_ID = C_ORDERLINE.C_ORDERLINE_ID" +
      "                         left join C_ORDER on C_ORDERLINE.C_ORDER_ID = C_ORDER.C_ORDER_ID" +
      "                         left join M_ATTRIBUTESETINSTANCE on M_INOUTLINE.M_ATTRIBUTESETINSTANCE_ID = M_ATTRIBUTESETINSTANCE.M_ATTRIBUTESETINSTANCE_ID," +
      "             M_INOUT, M_PRODUCT" +
      "        WHERE M_INOUT.M_INOUT_ID = M_INOUTLINE.M_INOUT_ID" +
      "        AND M_INOUTLINE.M_PRODUCT_ID = M_PRODUCT.M_PRODUCT_ID" +
      "        AND M_INOUT.M_INOUT_ID = ?" +
      "        GROUP BY C_ORDER.DOCUMENTNO, M_INOUT.C_BPARTNER_ID, C_ORDER.POREFERENCE, M_PRODUCT.VALUE, M_INOUTLINE.M_PRODUCT_ID, M_PRODUCT.NAME, M_ATTRIBUTESETINSTANCE.LOT, M_ATTRIBUTESETINSTANCE.GUARANTEEDATE, M_INOUT.DESCRIPTION, M_INOUTLINE.DESCRIPTION, M_PRODUCT.UPC" +
      "        ORDER BY C_ORDER.DOCUMENTNO, M_PRODUCT.NAME";

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
        RptMInoutLinesData objectRptMInoutLinesData = new RptMInoutLinesData();
        objectRptMInoutLinesData.value = UtilSql.getValue(result, "value");
        objectRptMInoutLinesData.name = UtilSql.getValue(result, "name");
        objectRptMInoutLinesData.movementqty = UtilSql.getValue(result, "movementqty");
        objectRptMInoutLinesData.lot = UtilSql.getValue(result, "lot");
        objectRptMInoutLinesData.llot = UtilSql.getValue(result, "llot");
        objectRptMInoutLinesData.description = UtilSql.getValue(result, "description");
        objectRptMInoutLinesData.upc = UtilSql.getValue(result, "upc");
        objectRptMInoutLinesData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectRptMInoutLinesData);
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
    RptMInoutLinesData objectRptMInoutLinesData[] = new RptMInoutLinesData[vector.size()];
    vector.copyInto(objectRptMInoutLinesData);
    return(objectRptMInoutLinesData);
  }

  public static RptMInoutLinesData[] set()    throws ServletException {
    RptMInoutLinesData objectRptMInoutLinesData[] = new RptMInoutLinesData[1];
    objectRptMInoutLinesData[0] = new RptMInoutLinesData();
    objectRptMInoutLinesData[0].value = "";
    objectRptMInoutLinesData[0].name = "";
    objectRptMInoutLinesData[0].movementqty = "";
    objectRptMInoutLinesData[0].lot = "";
    objectRptMInoutLinesData[0].llot = "";
    objectRptMInoutLinesData[0].description = "";
    objectRptMInoutLinesData[0].upc = "";
    return objectRptMInoutLinesData;
  }
}
