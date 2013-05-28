//Sqlc generated V1.O00-1
package org.openbravo.erpCommon.businessUtility;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import java.util.*;

public class EmailData implements FieldProvider {
static Logger log4j = Logger.getLogger(EmailData.class);
  private String InitRecordNumber="0";
  public String email;
  public String emailuser;
  public String emailuserpw;
  public String name;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("email"))
      return email;
    else if (fieldName.equalsIgnoreCase("emailuser"))
      return emailuser;
    else if (fieldName.equalsIgnoreCase("emailuserpw"))
      return emailuserpw;
    else if (fieldName.equalsIgnoreCase("name"))
      return name;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static EmailData[] selectEmail(Connection conn, ConnectionProvider connectionProvider, String adUserId)    throws ServletException {
    return selectEmail(conn, connectionProvider, adUserId, 0, 0);
  }

  public static EmailData[] selectEmail(Connection conn, ConnectionProvider connectionProvider, String adUserId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT EMail, EMailUser, EMailUserPw, Name FROM AD_User WHERE AD_User_ID=?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);

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
        EmailData objectEmailData = new EmailData();
        objectEmailData.email = UtilSql.getValue(result, "email");
        objectEmailData.emailuser = UtilSql.getValue(result, "emailuser");
        objectEmailData.emailuserpw = UtilSql.getValue(result, "emailuserpw");
        objectEmailData.name = UtilSql.getValue(result, "name");
        objectEmailData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectEmailData);
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
        connectionProvider.releaseTransactionalPreparedStatement(st);
      } catch(Exception ignore){
        ignore.printStackTrace();
      }
    }
    EmailData objectEmailData[] = new EmailData[vector.size()];
    vector.copyInto(objectEmailData);
    return(objectEmailData);
  }

  public static EmailData[] selectEmailRequest(Connection conn, ConnectionProvider connectionProvider, String adClientId)    throws ServletException {
    return selectEmailRequest(conn, connectionProvider, adClientId, 0, 0);
  }

  public static EmailData[] selectEmailRequest(Connection conn, ConnectionProvider connectionProvider, String adClientId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT RequestEMail AS EMail, RequestUser AS EMailUser, RequestUserPw AS EMailUserPw FROM AD_Client WHERE AD_Client_ID=?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);

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
        EmailData objectEmailData = new EmailData();
        objectEmailData.email = UtilSql.getValue(result, "email");
        objectEmailData.emailuser = UtilSql.getValue(result, "emailuser");
        objectEmailData.emailuserpw = UtilSql.getValue(result, "emailuserpw");
        objectEmailData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectEmailData);
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
        connectionProvider.releaseTransactionalPreparedStatement(st);
      } catch(Exception ignore){
        ignore.printStackTrace();
      }
    }
    EmailData objectEmailData[] = new EmailData[vector.size()];
    vector.copyInto(objectEmailData);
    return(objectEmailData);
  }

  public static String selectSMTPHost(Connection conn, ConnectionProvider connectionProvider, String adClientId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT SMTPHost AS NAME FROM AD_Client WHERE AD_Client_ID=?";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);

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
        connectionProvider.releaseTransactionalPreparedStatement(st);
      } catch(Exception ignore){
        ignore.printStackTrace();
      }
    }
    return(strReturn);
  }
}
