/*
 *************************************************************************
 * The contents of this file are subject to the Openbravo  Public  License
 * Version  1.1  (the  "License"),  being   the  Mozilla   Public  License
 * Version 1.1  with a permitted attribution clause; you may not  use this
 * file except in compliance with the License. You  may  obtain  a copy of
 * the License at http://www.openbravo.com/legal/license.html
 * Software distributed under the License  is  distributed  on  an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific  language  governing  rights  and  limitations
 * under the License.
 * The Original Code is Openbravo ERP.
 * The Initial Developer of the Original Code is Openbravo SLU
 * All portions are Copyright (C) 2008-2011 Openbravo SLU
 * All Rights Reserved.
 * Contributor(s):  ______________________________________.
 ************************************************************************
*/
package org.openbravo.retail.posterminal;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.currency.Currency;
import org.openbravo.model.common.enterprise.DocumentType;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.financialmgmt.gl.GLItem;
import org.openbravo.model.financialmgmt.payment.FIN_PaymentMethod;
/**
 * Entity class for entity OBPOS_App_Payment_Type (stored in table OBPOS_App_Payment_Type).
 *
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class TerminalTypePaymentMethod extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "OBPOS_App_Payment_Type";
    public static final String ENTITY_NAME = "OBPOS_App_Payment_Type";
    public static final String PROPERTY_ID = "id";
    public static final String PROPERTY_CLIENT = "client";
    public static final String PROPERTY_ORGANIZATION = "organization";
    public static final String PROPERTY_ACTIVE = "active";
    public static final String PROPERTY_CREATIONDATE = "creationDate";
    public static final String PROPERTY_CREATEDBY = "createdBy";
    public static final String PROPERTY_UPDATED = "updated";
    public static final String PROPERTY_UPDATEDBY = "updatedBy";
    public static final String PROPERTY_SEARCHKEY = "searchKey";
    public static final String PROPERTY_NAME = "name";
    public static final String PROPERTY_PAYMENTMETHOD = "paymentMethod";
    public static final String PROPERTY_CURRENCY = "currency";
    public static final String PROPERTY_DOCUMENTTYPE = "documentType";
    public static final String PROPERTY_OBPOSTERMINALTYPE = "obposTerminaltype";
    public static final String PROPERTY_AUTOMATEMOVEMENTTOOTHER = "automatemovementtoother";
    public static final String PROPERTY_KEEPFIXEDAMOUNT = "keepfixedamount";
    public static final String PROPERTY_AMOUNT = "amount";
    public static final String PROPERTY_ALLOWVARIABLEAMOUNT = "allowvariableamount";
    public static final String PROPERTY_ALLOWDONTMOVE = "allowdontmove";
    public static final String PROPERTY_ALLOWMOVEEVERYTHING = "allowmoveeverything";
    public static final String PROPERTY_CASHDIFFERENCES = "cashDifferences";
    public static final String PROPERTY_ALLOWDROPS = "allowdrops";
    public static final String PROPERTY_GLITEMFORDROPS = "gLItemForDrops";
    public static final String PROPERTY_ALLOWDEPOSITS = "allowdeposits";
    public static final String PROPERTY_GLITEMFORDEPOSITS = "gLItemForDeposits";
    public static final String PROPERTY_GLITEMDROPDEP = "glitemDropdep";
    public static final String PROPERTY_GLITEMWRITEOFF = "glitemWriteoff";
    public static final String PROPERTY_PAYMENTPROVIDER = "paymentProvider";
    public static final String PROPERTY_REFUNDPROVIDER = "refundProvider";
    public static final String PROPERTY_OPENDRAWER = "openDrawer";
    public static final String PROPERTY_ISCASH = "iscash";
    public static final String PROPERTY_OBPOSAPPPAYMENTLIST = "oBPOSAppPaymentList";
    public static final String PROPERTY_OBPOSTERMINALTYPELIST = "oBPOSTerminalTypeList";

    public TerminalTypePaymentMethod() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_AUTOMATEMOVEMENTTOOTHER, false);
        setDefaultValue(PROPERTY_KEEPFIXEDAMOUNT, false);
        setDefaultValue(PROPERTY_ALLOWVARIABLEAMOUNT, false);
        setDefaultValue(PROPERTY_ALLOWDONTMOVE, false);
        setDefaultValue(PROPERTY_ALLOWMOVEEVERYTHING, false);
        setDefaultValue(PROPERTY_ALLOWDROPS, false);
        setDefaultValue(PROPERTY_ALLOWDEPOSITS, false);
        setDefaultValue(PROPERTY_OPENDRAWER, false);
        setDefaultValue(PROPERTY_ISCASH, false);
        setDefaultValue(PROPERTY_OBPOSAPPPAYMENTLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_OBPOSTERMINALTYPELIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    public String getId() {
        return (String) get(PROPERTY_ID);
    }

    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }

    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }

    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }

    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }

    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }

    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }

    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }

    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    public String getSearchKey() {
        return (String) get(PROPERTY_SEARCHKEY);
    }

    public void setSearchKey(String searchKey) {
        set(PROPERTY_SEARCHKEY, searchKey);
    }

    public String getName() {
        return (String) get(PROPERTY_NAME);
    }

    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    public FIN_PaymentMethod getPaymentMethod() {
        return (FIN_PaymentMethod) get(PROPERTY_PAYMENTMETHOD);
    }

    public void setPaymentMethod(FIN_PaymentMethod paymentMethod) {
        set(PROPERTY_PAYMENTMETHOD, paymentMethod);
    }

    public Currency getCurrency() {
        return (Currency) get(PROPERTY_CURRENCY);
    }

    public void setCurrency(Currency currency) {
        set(PROPERTY_CURRENCY, currency);
    }

    public DocumentType getDocumentType() {
        return (DocumentType) get(PROPERTY_DOCUMENTTYPE);
    }

    public void setDocumentType(DocumentType documentType) {
        set(PROPERTY_DOCUMENTTYPE, documentType);
    }

    public TerminalType getObposTerminaltype() {
        return (TerminalType) get(PROPERTY_OBPOSTERMINALTYPE);
    }

    public void setObposTerminaltype(TerminalType obposTerminaltype) {
        set(PROPERTY_OBPOSTERMINALTYPE, obposTerminaltype);
    }

    public Boolean isAutomatemovementtoother() {
        return (Boolean) get(PROPERTY_AUTOMATEMOVEMENTTOOTHER);
    }

    public void setAutomatemovementtoother(Boolean automatemovementtoother) {
        set(PROPERTY_AUTOMATEMOVEMENTTOOTHER, automatemovementtoother);
    }

    public Boolean isKeepfixedamount() {
        return (Boolean) get(PROPERTY_KEEPFIXEDAMOUNT);
    }

    public void setKeepfixedamount(Boolean keepfixedamount) {
        set(PROPERTY_KEEPFIXEDAMOUNT, keepfixedamount);
    }

    public Long getAmount() {
        return (Long) get(PROPERTY_AMOUNT);
    }

    public void setAmount(Long amount) {
        set(PROPERTY_AMOUNT, amount);
    }

    public Boolean isAllowvariableamount() {
        return (Boolean) get(PROPERTY_ALLOWVARIABLEAMOUNT);
    }

    public void setAllowvariableamount(Boolean allowvariableamount) {
        set(PROPERTY_ALLOWVARIABLEAMOUNT, allowvariableamount);
    }

    public Boolean isAllowdontmove() {
        return (Boolean) get(PROPERTY_ALLOWDONTMOVE);
    }

    public void setAllowdontmove(Boolean allowdontmove) {
        set(PROPERTY_ALLOWDONTMOVE, allowdontmove);
    }

    public Boolean isAllowmoveeverything() {
        return (Boolean) get(PROPERTY_ALLOWMOVEEVERYTHING);
    }

    public void setAllowmoveeverything(Boolean allowmoveeverything) {
        set(PROPERTY_ALLOWMOVEEVERYTHING, allowmoveeverything);
    }

    public GLItem getCashDifferences() {
        return (GLItem) get(PROPERTY_CASHDIFFERENCES);
    }

    public void setCashDifferences(GLItem cashDifferences) {
        set(PROPERTY_CASHDIFFERENCES, cashDifferences);
    }

    public Boolean isAllowdrops() {
        return (Boolean) get(PROPERTY_ALLOWDROPS);
    }

    public void setAllowdrops(Boolean allowdrops) {
        set(PROPERTY_ALLOWDROPS, allowdrops);
    }

    public GLItem getGLItemForDrops() {
        return (GLItem) get(PROPERTY_GLITEMFORDROPS);
    }

    public void setGLItemForDrops(GLItem gLItemForDrops) {
        set(PROPERTY_GLITEMFORDROPS, gLItemForDrops);
    }

    public Boolean isAllowdeposits() {
        return (Boolean) get(PROPERTY_ALLOWDEPOSITS);
    }

    public void setAllowdeposits(Boolean allowdeposits) {
        set(PROPERTY_ALLOWDEPOSITS, allowdeposits);
    }

    public GLItem getGLItemForDeposits() {
        return (GLItem) get(PROPERTY_GLITEMFORDEPOSITS);
    }

    public void setGLItemForDeposits(GLItem gLItemForDeposits) {
        set(PROPERTY_GLITEMFORDEPOSITS, gLItemForDeposits);
    }

    public GLItem getGlitemDropdep() {
        return (GLItem) get(PROPERTY_GLITEMDROPDEP);
    }

    public void setGlitemDropdep(GLItem glitemDropdep) {
        set(PROPERTY_GLITEMDROPDEP, glitemDropdep);
    }

    public GLItem getGlitemWriteoff() {
        return (GLItem) get(PROPERTY_GLITEMWRITEOFF);
    }

    public void setGlitemWriteoff(GLItem glitemWriteoff) {
        set(PROPERTY_GLITEMWRITEOFF, glitemWriteoff);
    }

    public String getPaymentProvider() {
        return (String) get(PROPERTY_PAYMENTPROVIDER);
    }

    public void setPaymentProvider(String paymentProvider) {
        set(PROPERTY_PAYMENTPROVIDER, paymentProvider);
    }

    public String getRefundProvider() {
        return (String) get(PROPERTY_REFUNDPROVIDER);
    }

    public void setRefundProvider(String refundProvider) {
        set(PROPERTY_REFUNDPROVIDER, refundProvider);
    }

    public Boolean isOpenDrawer() {
        return (Boolean) get(PROPERTY_OPENDRAWER);
    }

    public void setOpenDrawer(Boolean openDrawer) {
        set(PROPERTY_OPENDRAWER, openDrawer);
    }

    public Boolean isCash() {
        return (Boolean) get(PROPERTY_ISCASH);
    }

    public void setCash(Boolean iscash) {
        set(PROPERTY_ISCASH, iscash);
    }

    @SuppressWarnings("unchecked")
    public List<OBPOSAppPayment> getOBPOSAppPaymentList() {
        return (List<OBPOSAppPayment>) get(PROPERTY_OBPOSAPPPAYMENTLIST);
    }

    public void setOBPOSAppPaymentList(List<OBPOSAppPayment> oBPOSAppPaymentList) {
        set(PROPERTY_OBPOSAPPPAYMENTLIST, oBPOSAppPaymentList);
    }

    @SuppressWarnings("unchecked")
    public List<TerminalType> getOBPOSTerminalTypeList() {
        return (List<TerminalType>) get(PROPERTY_OBPOSTERMINALTYPELIST);
    }

    public void setOBPOSTerminalTypeList(List<TerminalType> oBPOSTerminalTypeList) {
        set(PROPERTY_OBPOSTERMINALTYPELIST, oBPOSTerminalTypeList);
    }

}
