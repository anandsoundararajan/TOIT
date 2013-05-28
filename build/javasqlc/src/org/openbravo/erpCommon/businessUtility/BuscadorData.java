//Sqlc generated V1.O00-1
package org.openbravo.erpCommon.businessUtility;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import java.util.*;

public class BuscadorData implements FieldProvider {
static Logger log4j = Logger.getLogger(BuscadorData.class);
  private String InitRecordNumber="0";
  public String adColumnId;
  public String name;
  public String reference;
  public String referencevalue;
  public String adValRuleId;
  public String fieldlength;
  public String displaylength;
  public String columnname;
  public String value;
  public String adWindowId;
  public String code;
  public String searchname;
  public String columnnameinp;
  public String classname;
  public String mappingname;
  public String columnnameEnd;
  public String isselectioncolumn;
  public String seq1;
  public String seq2;
  public String id;
  public String whereclause;
  public String nameref;
  public String defaultvalue;
  public String isdisplayed;
  public String istranslated;
  public String type;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("ad_column_id") || fieldName.equals("adColumnId"))
      return adColumnId;
    else if (fieldName.equalsIgnoreCase("name"))
      return name;
    else if (fieldName.equalsIgnoreCase("reference"))
      return reference;
    else if (fieldName.equalsIgnoreCase("referencevalue"))
      return referencevalue;
    else if (fieldName.equalsIgnoreCase("ad_val_rule_id") || fieldName.equals("adValRuleId"))
      return adValRuleId;
    else if (fieldName.equalsIgnoreCase("fieldlength"))
      return fieldlength;
    else if (fieldName.equalsIgnoreCase("displaylength"))
      return displaylength;
    else if (fieldName.equalsIgnoreCase("columnname"))
      return columnname;
    else if (fieldName.equalsIgnoreCase("value"))
      return value;
    else if (fieldName.equalsIgnoreCase("ad_window_id") || fieldName.equals("adWindowId"))
      return adWindowId;
    else if (fieldName.equalsIgnoreCase("code"))
      return code;
    else if (fieldName.equalsIgnoreCase("searchname"))
      return searchname;
    else if (fieldName.equalsIgnoreCase("columnnameinp"))
      return columnnameinp;
    else if (fieldName.equalsIgnoreCase("classname"))
      return classname;
    else if (fieldName.equalsIgnoreCase("mappingname"))
      return mappingname;
    else if (fieldName.equalsIgnoreCase("columnname_end") || fieldName.equals("columnnameEnd"))
      return columnnameEnd;
    else if (fieldName.equalsIgnoreCase("isselectioncolumn"))
      return isselectioncolumn;
    else if (fieldName.equalsIgnoreCase("seq1"))
      return seq1;
    else if (fieldName.equalsIgnoreCase("seq2"))
      return seq2;
    else if (fieldName.equals("id"))
      return id;
    else if (fieldName.equals("whereclause"))
      return whereclause;
    else if (fieldName.equals("nameref"))
      return nameref;
    else if (fieldName.equals("defaultvalue"))
      return defaultvalue;
    else if (fieldName.equals("isdisplayed"))
      return isdisplayed;
    else if (fieldName.equals("istranslated"))
      return istranslated;
    else if (fieldName.equals("type"))
      return type;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static BuscadorData[] select(ConnectionProvider connectionProvider, String adLanguage, String adTabId, String showAudit)    throws ServletException {
    return select(connectionProvider, adLanguage, adTabId, showAudit, 0, 0);
  }

  public static BuscadorData[] select(ConnectionProvider connectionProvider, String adLanguage, String adTabId, String showAudit, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT AD_COLUMN.ad_column_id, to_char((CASE WHEN AD_FIELD_TRL.NAME IS NULL THEN AD_FIELD.NAME ELSE AD_FIELD_TRL.NAME END)) AS NAME, " +
      "        ad_reference_id as reference, ad_reference_value_id as referencevalue, ad_val_rule_id, fieldlength, displaylength, " +
      "        AD_COLUMN.columnname, '' as value, ad_tab.ad_window_id, '' as code, " +
      "        to_char(REPLACE(REPLACE(REPLACE(ad_element.name, 'Substitute', 'Product'), 'BOM', ''), 'M_LocatorTo_ID', 'M_Locator_ID')) as searchName, '' as COLUMNNAMEINP, '' as classname, " +
      "        '' as mappingname, '' as COLUMNNAME_END, ISSELECTIONCOLUMN, AD_COLUMN.seqno as SEQ1, AD_FIELD.seqno as SEQ2" +
      "        FROM AD_FIELD left join AD_FIELD_TRL on AD_FIELD.ad_field_id = AD_FIELD_TRL.ad_field_id" +
      "                                            AND AD_FIELD_TRL.AD_LANGUAGE =?, " +
      "              AD_COLUMN left join AD_ELEMENT on AD_COLUMN.AD_Element_ID = AD_ELEMENT.AD_Element_ID ,  " +
      "              AD_TAB " +
      "        WHERE AD_COLUMN.ad_column_id = AD_FIELD.ad_column_id" +
      "        AND AD_FIELD.ad_tab_id = AD_TAB.ad_tab_id " +
      "        AND AD_COLUMN.isactive='Y'" +
      "        AND AD_FIELD.isactive='Y' " +
      "        AND ISSELECTIONCOLUMN='Y' " +
      "        AND ad_field.ad_tab_id=?" +
      "        UNION" +
      "        SELECT C.Ad_Column_Id, to_char(COALESCE(to_char(etrl.name), to_char(e.name), to_char(c.columnname))) as Name, " +
      "                c.Ad_Reference_Id as reference, c.ad_reference_value_id  as referencevalue, c.ad_val_rule_id, 44, 44," +
      "                c.columnname, to_char('') as value, tb.ad_window_id, to_char('') as code," +
      "                to_char(e.name) as searchname, '' as COLUMNNAMEINP, '' as classname, " +
      "                '' as mappingname, '' as COLUMNNAME_END, 'Y' as ISSELECTIONCOLUMN," +
      "                null as seq1," +
      "                (case when upper(c.columnname)='CREATED' then 10000 " +
      "                   when upper(c.columnname)='CREATEDBY' then 10001" +
      "                   when upper(c.columnname)='UPDATED' then 10002" +
      "                   else 10003" +
      "              end) as seq2" +
      "           FROM AD_TAB TB," +
      "                AD_COLUMN C left join AD_ELEMENT e on upper(e.ColumnName)=upper(c.ColumnName)" +
      "                            left join AD_ELEMENT_TRL etrl on e.AD_Element_ID = etrl.AD_Element_ID" +
      "                                                         and etrl.AD_Language = ?" +
      "          WHERE TB.AD_Tab_ID = ?" +
      "            AND C.AD_Table_ID = TB.AD_Table_ID" +
      "            AND UPPER(c.columnname) in ('CREATED', 'CREATEDBY', 'UPDATED', 'UPDATEDBY')" +
      "            AND to_char('Y') = to_char(?)  " +
      "          order by seq1, seq2";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adTabId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adTabId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, showAudit);

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
        BuscadorData objectBuscadorData = new BuscadorData();
        objectBuscadorData.adColumnId = UtilSql.getValue(result, "ad_column_id");
        objectBuscadorData.name = UtilSql.getValue(result, "name");
        objectBuscadorData.reference = UtilSql.getValue(result, "reference");
        objectBuscadorData.referencevalue = UtilSql.getValue(result, "referencevalue");
        objectBuscadorData.adValRuleId = UtilSql.getValue(result, "ad_val_rule_id");
        objectBuscadorData.fieldlength = UtilSql.getValue(result, "fieldlength");
        objectBuscadorData.displaylength = UtilSql.getValue(result, "displaylength");
        objectBuscadorData.columnname = UtilSql.getValue(result, "columnname");
        objectBuscadorData.value = UtilSql.getValue(result, "value");
        objectBuscadorData.adWindowId = UtilSql.getValue(result, "ad_window_id");
        objectBuscadorData.code = UtilSql.getValue(result, "code");
        objectBuscadorData.searchname = UtilSql.getValue(result, "searchname");
        objectBuscadorData.columnnameinp = UtilSql.getValue(result, "columnnameinp");
        objectBuscadorData.classname = UtilSql.getValue(result, "classname");
        objectBuscadorData.mappingname = UtilSql.getValue(result, "mappingname");
        objectBuscadorData.columnnameEnd = UtilSql.getValue(result, "columnname_end");
        objectBuscadorData.isselectioncolumn = UtilSql.getValue(result, "isselectioncolumn");
        objectBuscadorData.seq1 = UtilSql.getValue(result, "seq1");
        objectBuscadorData.seq2 = UtilSql.getValue(result, "seq2");
        objectBuscadorData.id = "";
        objectBuscadorData.whereclause = "";
        objectBuscadorData.nameref = "";
        objectBuscadorData.defaultvalue = "";
        objectBuscadorData.isdisplayed = "";
        objectBuscadorData.istranslated = "";
        objectBuscadorData.type = "";
        objectBuscadorData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectBuscadorData);
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
    BuscadorData objectBuscadorData[] = new BuscadorData[vector.size()];
    vector.copyInto(objectBuscadorData);
    return(objectBuscadorData);
  }

  public static String hasSelectionColumns(ConnectionProvider connectionProvider, String adTabId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT count(*) as seq1" +
      "        FROM AD_FIELD, " +
      "              AD_COLUMN,  " +
      "              AD_TAB " +
      "        WHERE AD_COLUMN.ad_column_id = AD_FIELD.ad_column_id" +
      "        AND AD_FIELD.ad_tab_id = AD_TAB.ad_tab_id " +
      "        AND AD_COLUMN.isactive='Y'" +
      "        AND AD_FIELD.isactive='Y' " +
      "        AND ISSELECTIONCOLUMN='Y' " +
      "        AND ad_field.ad_tab_ID = ?";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adTabId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "seq1");
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

  public static BuscadorData[] set()    throws ServletException {
    BuscadorData objectBuscadorData[] = new BuscadorData[1];
    objectBuscadorData[0] = new BuscadorData();
    objectBuscadorData[0].seq1 = "";
    return objectBuscadorData;
  }

  public static BuscadorData[] selectIdentifiers(ConnectionProvider connectionProvider, String adLanguage, String adTabId, String showAudit)    throws ServletException {
    return selectIdentifiers(connectionProvider, adLanguage, adTabId, showAudit, 0, 0);
  }

  public static BuscadorData[] selectIdentifiers(ConnectionProvider connectionProvider, String adLanguage, String adTabId, String showAudit, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT AD_COLUMN.ad_column_id, to_char((CASE WHEN AD_FIELD_TRL.NAME IS NULL THEN AD_FIELD.NAME ELSE AD_FIELD_TRL.NAME END)) AS NAME, " +
      "        ad_reference_id as reference, ad_reference_value_id as referencevalue, ad_val_rule_id, fieldlength, displaylength, " +
      "        AD_COLUMN.columnname, '' as value, ad_tab.ad_window_id, '' as code, " +
      "        to_char(REPLACE(REPLACE(REPLACE(ad_element.name, 'Substitute', 'Product'), 'BOM', ''), 'M_LocatorTo_ID', 'M_Locator_ID')) as searchName, 'N' AS ISSELECTIONCOLUMN, " +
      "        AD_COLUMN.seqno as seq1, AD_FIELD.seqno as seq2" +
      "        FROM  AD_FIELD left join AD_FIELD_TRL on AD_FIELD.ad_field_id = AD_FIELD_TRL.ad_field_id" +
      "                                              AND AD_FIELD_TRL.AD_LANGUAGE =? ," +
      "              AD_COLUMN left join AD_ELEMENT on AD_COLUMN.AD_Element_ID = AD_ELEMENT.AD_Element_ID, " +
      "              AD_TAB" +
      "        WHERE AD_COLUMN.ad_column_id = AD_FIELD.ad_column_id" +
      "        AND AD_FIELD.ad_tab_id = AD_TAB.ad_tab_id " +
      "        AND AD_COLUMN.isactive='Y'" +
      "        AND AD_FIELD.isactive='Y' " +
      "        AND isidentifier='Y'" +
      "        AND ad_field.ad_tab_id=?" +
      "        UNION" +
      "        SELECT C.Ad_Column_Id, to_char(COALESCE(to_char(etrl.name), to_char(e.name), to_char(c.columnname))) as Name, " +
      "                c.Ad_Reference_Id as reference, c.ad_reference_value_id as referencevalue, c.ad_val_rule_id, 44, 44," +
      "                c.columnname, to_char('') as value, tb.ad_window_id, to_char('') as code," +
      "                to_char(e.name) as searchname, to_char('N') as ISSELECTIONCOLUMN," +
      "                (case when upper(c.columnname)='CREATED' then 10000 " +
      "                   when upper(c.columnname)='CREATEDBY' then 10001" +
      "                   when upper(c.columnname)='UPDATED' then 10002" +
      "                   else 10003" +
      "              end) as seq1,2" +
      "           FROM AD_TAB TB," +
      "                AD_COLUMN C left join AD_ELEMENT e on upper(e.ColumnName)=upper(c.ColumnName)" +
      "                            left join AD_ELEMENT_TRL etrl on e.AD_Element_ID = etrl.AD_Element_ID" +
      "                                                         and etrl.AD_Language = ?" +
      "          WHERE TB.AD_Tab_ID = ?" +
      "            AND C.AD_Table_ID = TB.AD_Table_ID" +
      "            AND UPPER(c.columnname) in ('CREATED', 'CREATEDBY', 'UPDATED', 'UPDATEDBY')" +
      "            AND TO_CHAR(?) = 'Y'" +
      "          order by seq1, seq2";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adTabId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adTabId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, showAudit);

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
        BuscadorData objectBuscadorData = new BuscadorData();
        objectBuscadorData.adColumnId = UtilSql.getValue(result, "ad_column_id");
        objectBuscadorData.name = UtilSql.getValue(result, "name");
        objectBuscadorData.reference = UtilSql.getValue(result, "reference");
        objectBuscadorData.referencevalue = UtilSql.getValue(result, "referencevalue");
        objectBuscadorData.adValRuleId = UtilSql.getValue(result, "ad_val_rule_id");
        objectBuscadorData.fieldlength = UtilSql.getValue(result, "fieldlength");
        objectBuscadorData.displaylength = UtilSql.getValue(result, "displaylength");
        objectBuscadorData.columnname = UtilSql.getValue(result, "columnname");
        objectBuscadorData.value = UtilSql.getValue(result, "value");
        objectBuscadorData.adWindowId = UtilSql.getValue(result, "ad_window_id");
        objectBuscadorData.code = UtilSql.getValue(result, "code");
        objectBuscadorData.searchname = UtilSql.getValue(result, "searchname");
        objectBuscadorData.isselectioncolumn = UtilSql.getValue(result, "isselectioncolumn");
        objectBuscadorData.seq1 = UtilSql.getValue(result, "seq1");
        objectBuscadorData.seq2 = UtilSql.getValue(result, "seq2");
        objectBuscadorData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectBuscadorData);
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
    BuscadorData objectBuscadorData[] = new BuscadorData[vector.size()];
    vector.copyInto(objectBuscadorData);
    return(objectBuscadorData);
  }

  public static String isHighVolume(ConnectionProvider connectionProvider, String tab)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT ishighvolume FROM AD_TAB, AD_TABLE " +
      "      WHERE AD_TAB.ad_table_id = AD_TABLE.ad_table_id" +
      "      AND AD_TAB.ad_tab_id=?";

    ResultSet result;
    String strReturn = "N";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, tab);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "ishighvolume");
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

  public static String parentsColumnName(ConnectionProvider connectionProvider, String tab)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT ColumnName" +
      "        FROM AD_FIELD, AD_COLUMN " +
      "        WHERE AD_FIELD.ad_column_id = AD_COLUMN.ad_column_id " +
      "        AND ad_tab_id = ?" +
      "        AND isparent = 'Y'" +
      "        order by ad_column.seqno";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, tab);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "columnname");
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
Names of the columns and name of the fields of a tab
 */
  public static BuscadorData[] selectSearchs(ConnectionProvider connectionProvider, String columntype, String searchId)    throws ServletException {
    return selectSearchs(connectionProvider, columntype, searchId, 0, 0);
  }

/**
Names of the columns and name of the fields of a tab
 */
  public static BuscadorData[] selectSearchs(ConnectionProvider connectionProvider, String columntype, String searchId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT R.NAME, T.TABLENAME AS REFERENCE, C.COLUMNNAME AS COLUMNNAME, RSC.NAME AS COLUMNNAMEINP, " +
      "      RSC.COLUMNNAME AS REFERENCEVALUE, MO.CLASSNAME, MOM.MAPPINGNAME, RSC.COLUMN_SUFFIX AS COLUMNNAME_END " +
      "      FROM AD_REFERENCE R left join AD_REF_SEARCH RS  on R.AD_REFERENCE_ID = RS.AD_REFERENCE_ID " +
      "                          left join AD_REF_SEARCH_COLUMN RSC on RS.AD_REF_SEARCH_ID = RSC.AD_REF_SEARCH_ID" +
      "                                AND RSC.COLUMNTYPE = ?, " +
      "           AD_MODEL_OBJECT MO, AD_MODEL_OBJECT_MAPPING MOM, " +
      "           AD_TABLE T, AD_COLUMN C " +
      "      WHERE R.PARENTREFERENCE_ID = '30' " +
      "      AND R.AD_REFERENCE_ID = ?" +
      "      AND R.AD_REFERENCE_ID = MO.AD_REFERENCE_ID" +
      "      AND MO.ACTION = 'S' " +
      "      AND MO.ISACTIVE = 'Y'" +
      "      AND MO.ISDEFAULT = 'Y'" +
      "      AND MO.AD_MODEL_OBJECT_ID = MOM.AD_MODEL_OBJECT_ID " +
      "      AND MOM.ISACTIVE = 'Y' " +
      "      AND MOM.ISDEFAULT = 'Y'" +
      "      AND RS.AD_TABLE_ID = T.AD_TABLE_ID " +
      "      AND RS.AD_COLUMN_ID = C.AD_COLUMN_ID ";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, columntype);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, searchId);

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
        BuscadorData objectBuscadorData = new BuscadorData();
        objectBuscadorData.name = UtilSql.getValue(result, "name");
        objectBuscadorData.reference = UtilSql.getValue(result, "reference");
        objectBuscadorData.columnname = UtilSql.getValue(result, "columnname");
        objectBuscadorData.columnnameinp = UtilSql.getValue(result, "columnnameinp");
        objectBuscadorData.referencevalue = UtilSql.getValue(result, "referencevalue");
        objectBuscadorData.classname = UtilSql.getValue(result, "classname");
        objectBuscadorData.mappingname = UtilSql.getValue(result, "mappingname");
        objectBuscadorData.columnnameEnd = UtilSql.getValue(result, "columnname_end");
        objectBuscadorData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectBuscadorData);
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
    BuscadorData objectBuscadorData[] = new BuscadorData[vector.size()];
    vector.copyInto(objectBuscadorData);
    return(objectBuscadorData);
  }

  public static String selectSearchName(ConnectionProvider connectionProvider, String table_name, String c_bpartner_id, String adLanguage)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT AD_COLUMN_IDENTIFIER(?, ?, ?) AS NAME from dual";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, table_name);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, c_bpartner_id);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);

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

  public static String selectSearchTableName(ConnectionProvider connectionProvider, String ad_reference_id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "          select tablename AS NAME from ad_ref_search rs, ad_table t" +
      "          where rs.ad_table_id = t.ad_table_id" +
      "          and rs.ad_reference_id=?";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ad_reference_id);

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
Method need to be synchronized with src-wad/src/org/openbravo/wad/Fields_data.xsql::selectValidationTab
 */
  public static BuscadorData[] selectValidationTab(ConnectionProvider connectionProvider, String tab)    throws ServletException {
    return selectValidationTab(connectionProvider, tab, 0, 0);
  }

/**
Method need to be synchronized with src-wad/src/org/openbravo/wad/Fields_data.xsql::selectValidationTab
 */
  public static BuscadorData[] selectValidationTab(ConnectionProvider connectionProvider, String tab, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT c.ad_column_id as id, c.columnname, t.WHERECLAUSE as whereClause, v.code as referencevalue, c.ad_reference_id as reference," +
      "        c.ad_reference_value_id as NameRef, c.ad_val_rule_id as defaultvalue, f.isdisplayed, c.istranslated, c.columnname as name," +
      "        (case when t.whereclause is not null or v.code is not null then 'C' else 'R' end) as type /*Combo reaload or Reference*/ " +
      "        FROM AD_FIELD f, " +
      "             AD_COLUMN c left join  AD_VAL_RULE v on c.AD_VAL_RULE_ID = v.AD_VAL_RULE_ID" +
      "                         left join AD_REF_TABLE t on (CASE c.ad_reference_id WHEN '18' THEN c.AD_REFERENCE_VALUE_ID ELSE '0' END) = t.AD_REFERENCE_ID     " +
      "        WHERE f.AD_COLUMN_ID = c.ad_column_id" +
      "        AND f.ad_tab_id = ? " +
      "        AND (t.whereclause IS NOT NULL" +
      "            OR v.code IS NOT NULL" +
      "            OR c.ad_reference_id in ('19','18','17'))";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, tab);

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
        BuscadorData objectBuscadorData = new BuscadorData();
        objectBuscadorData.id = UtilSql.getValue(result, "id");
        objectBuscadorData.columnname = UtilSql.getValue(result, "columnname");
        objectBuscadorData.whereclause = UtilSql.getValue(result, "whereclause");
        objectBuscadorData.referencevalue = UtilSql.getValue(result, "referencevalue");
        objectBuscadorData.reference = UtilSql.getValue(result, "reference");
        objectBuscadorData.nameref = UtilSql.getValue(result, "nameref");
        objectBuscadorData.defaultvalue = UtilSql.getValue(result, "defaultvalue");
        objectBuscadorData.isdisplayed = UtilSql.getValue(result, "isdisplayed");
        objectBuscadorData.istranslated = UtilSql.getValue(result, "istranslated");
        objectBuscadorData.name = UtilSql.getValue(result, "name");
        objectBuscadorData.type = UtilSql.getValue(result, "type");
        objectBuscadorData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectBuscadorData);
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
    BuscadorData objectBuscadorData[] = new BuscadorData[vector.size()];
    vector.copyInto(objectBuscadorData);
    return(objectBuscadorData);
  }
}
