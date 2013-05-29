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
package org.openbravo.model.common.enterprise;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.RoleOrganization;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.businesspartner.BusinessPartner;
import org.openbravo.model.common.businesspartner.Category;
import org.openbravo.model.common.businesspartner.Location;
import org.openbravo.model.common.currency.Currency;
import org.openbravo.model.common.geography.Country;
import org.openbravo.model.financialmgmt.accounting.coa.AcctSchema;
import org.openbravo.model.financialmgmt.calendar.Calendar;
import org.openbravo.model.financialmgmt.calendar.PeriodControlV;
import org.openbravo.model.financialmgmt.payment.FIN_PaymentMethod;
import org.openbravo.model.financialmgmt.payment.PaymentTerm;
import org.openbravo.model.pricing.pricelist.PriceList;
import org.openbravo.retail.config.CashManagementEvents;
import org.openbravo.retail.config.OBRETCOProductList;
/**
 * Entity class for entity Organization (stored in table AD_Org).
 *
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class Organization extends BaseOBObject implements Traceable, ClientEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "AD_Org";
    public static final String ENTITY_NAME = "Organization";
    public static final String PROPERTY_ID = "id";
    public static final String PROPERTY_CLIENT = "client";
    public static final String PROPERTY_ACTIVE = "active";
    public static final String PROPERTY_CREATIONDATE = "creationDate";
    public static final String PROPERTY_CREATEDBY = "createdBy";
    public static final String PROPERTY_UPDATED = "updated";
    public static final String PROPERTY_UPDATEDBY = "updatedBy";
    public static final String PROPERTY_SEARCHKEY = "searchKey";
    public static final String PROPERTY_NAME = "name";
    public static final String PROPERTY_DESCRIPTION = "description";
    public static final String PROPERTY_SUMMARYLEVEL = "summaryLevel";
    public static final String PROPERTY_ORGANIZATIONTYPE = "organizationType";
    public static final String PROPERTY_ALLOWPERIODCONTROL = "allowPeriodControl";
    public static final String PROPERTY_CALENDAR = "calendar";
    public static final String PROPERTY_READY = "ready";
    public static final String PROPERTY_SOCIALNAME = "socialName";
    public static final String PROPERTY_CURRENCY = "currency";
    public static final String PROPERTY_OBRETCORETAILORGTYPE = "oBRETCORetailOrgType";
    public static final String PROPERTY_OBRETCOPRICELIST = "obretcoPricelist";
    public static final String PROPERTY_GENERALLEDGER = "generalLedger";
    public static final String PROPERTY_OBRETCOPRODUCTLIST = "obretcoProductlist";
    public static final String PROPERTY_OBRETCOCBPARTNER = "obretcoCBpartner";
    public static final String PROPERTY_OBRETCOCBPLOCATION = "obretcoCBpLocation";
    public static final String PROPERTY_OBRETCOMWAREHOUSE = "obretcoMWarehouse";
    public static final String PROPERTY_OBRETCODBPIRULESID = "obretcoDbpIrulesid";
    public static final String PROPERTY_OBRETCODBPPTERMID = "obretcoDbpPtermid";
    public static final String PROPERTY_OBRETCODBPPMETHODID = "obretcoDbpPmethodid";
    public static final String PROPERTY_OBRETCODBPBPCATID = "obretcoDbpBpcatid";
    public static final String PROPERTY_OBRETCODBPCOUNTRYID = "obretcoDbpCountryid";
    public static final String PROPERTY_OBRETCODBPORGID = "obretcoDbpOrgid";
    public static final String PROPERTY_OBRETCOSHOWTAXID = "obretcoShowtaxid";
    public static final String PROPERTY_OBRETCOSHOWBPCATEGORY = "obretcoShowbpcategory";
    public static final String PROPERTY_ADROLEORGANIZATIONLIST = "aDRoleOrganizationList";
    public static final String PROPERTY_FINANCIALMGMTPERIODCONTROLVLIST = "financialMgmtPeriodControlVList";
    public static final String PROPERTY_OBRETCOCASHMANAGEMENTEVENTSLIST = "oBRETCOCashManagementEventsList";
    public static final String PROPERTY_ORGANIZATIONINFORMATIONLIST = "organizationInformationList";
    public static final String PROPERTY_ORGANIZATIONMODULEVLIST = "organizationModuleVList";
    public static final String PROPERTY_ORGANIZATIONWAREHOUSELIST = "organizationWarehouseList";

    public Organization() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_SUMMARYLEVEL, false);
        setDefaultValue(PROPERTY_ALLOWPERIODCONTROL, false);
        setDefaultValue(PROPERTY_READY, false);
        setDefaultValue(PROPERTY_OBRETCOSHOWTAXID, true);
        setDefaultValue(PROPERTY_OBRETCOSHOWBPCATEGORY, true);
        setDefaultValue(PROPERTY_ADROLEORGANIZATIONLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_FINANCIALMGMTPERIODCONTROLVLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_OBRETCOCASHMANAGEMENTEVENTSLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_ORGANIZATIONINFORMATIONLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_ORGANIZATIONMODULEVLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_ORGANIZATIONWAREHOUSELIST, new ArrayList<Object>());
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

    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }

    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    public Boolean isSummaryLevel() {
        return (Boolean) get(PROPERTY_SUMMARYLEVEL);
    }

    public void setSummaryLevel(Boolean summaryLevel) {
        set(PROPERTY_SUMMARYLEVEL, summaryLevel);
    }

    public OrganizationType getOrganizationType() {
        return (OrganizationType) get(PROPERTY_ORGANIZATIONTYPE);
    }

    public void setOrganizationType(OrganizationType organizationType) {
        set(PROPERTY_ORGANIZATIONTYPE, organizationType);
    }

    public Boolean isAllowPeriodControl() {
        return (Boolean) get(PROPERTY_ALLOWPERIODCONTROL);
    }

    public void setAllowPeriodControl(Boolean allowPeriodControl) {
        set(PROPERTY_ALLOWPERIODCONTROL, allowPeriodControl);
    }

    public Calendar getCalendar() {
        return (Calendar) get(PROPERTY_CALENDAR);
    }

    public void setCalendar(Calendar calendar) {
        set(PROPERTY_CALENDAR, calendar);
    }

    public Boolean isReady() {
        return (Boolean) get(PROPERTY_READY);
    }

    public void setReady(Boolean ready) {
        set(PROPERTY_READY, ready);
    }

    public String getSocialName() {
        return (String) get(PROPERTY_SOCIALNAME);
    }

    public void setSocialName(String socialName) {
        set(PROPERTY_SOCIALNAME, socialName);
    }

    public Currency getCurrency() {
        return (Currency) get(PROPERTY_CURRENCY);
    }

    public void setCurrency(Currency currency) {
        set(PROPERTY_CURRENCY, currency);
    }

    public String getOBRETCORetailOrgType() {
        return (String) get(PROPERTY_OBRETCORETAILORGTYPE);
    }

    public void setOBRETCORetailOrgType(String oBRETCORetailOrgType) {
        set(PROPERTY_OBRETCORETAILORGTYPE, oBRETCORetailOrgType);
    }

    public PriceList getObretcoPricelist() {
        return (PriceList) get(PROPERTY_OBRETCOPRICELIST);
    }

    public void setObretcoPricelist(PriceList obretcoPricelist) {
        set(PROPERTY_OBRETCOPRICELIST, obretcoPricelist);
    }

    public AcctSchema getGeneralLedger() {
        return (AcctSchema) get(PROPERTY_GENERALLEDGER);
    }

    public void setGeneralLedger(AcctSchema generalLedger) {
        set(PROPERTY_GENERALLEDGER, generalLedger);
    }

    public OBRETCOProductList getObretcoProductlist() {
        return (OBRETCOProductList) get(PROPERTY_OBRETCOPRODUCTLIST);
    }

    public void setObretcoProductlist(OBRETCOProductList obretcoProductlist) {
        set(PROPERTY_OBRETCOPRODUCTLIST, obretcoProductlist);
    }

    public BusinessPartner getObretcoCBpartner() {
        return (BusinessPartner) get(PROPERTY_OBRETCOCBPARTNER);
    }

    public void setObretcoCBpartner(BusinessPartner obretcoCBpartner) {
        set(PROPERTY_OBRETCOCBPARTNER, obretcoCBpartner);
    }

    public Location getObretcoCBpLocation() {
        return (Location) get(PROPERTY_OBRETCOCBPLOCATION);
    }

    public void setObretcoCBpLocation(Location obretcoCBpLocation) {
        set(PROPERTY_OBRETCOCBPLOCATION, obretcoCBpLocation);
    }

    public Warehouse getObretcoMWarehouse() {
        return (Warehouse) get(PROPERTY_OBRETCOMWAREHOUSE);
    }

    public void setObretcoMWarehouse(Warehouse obretcoMWarehouse) {
        set(PROPERTY_OBRETCOMWAREHOUSE, obretcoMWarehouse);
    }

    public String getObretcoDbpIrulesid() {
        return (String) get(PROPERTY_OBRETCODBPIRULESID);
    }

    public void setObretcoDbpIrulesid(String obretcoDbpIrulesid) {
        set(PROPERTY_OBRETCODBPIRULESID, obretcoDbpIrulesid);
    }

    public PaymentTerm getObretcoDbpPtermid() {
        return (PaymentTerm) get(PROPERTY_OBRETCODBPPTERMID);
    }

    public void setObretcoDbpPtermid(PaymentTerm obretcoDbpPtermid) {
        set(PROPERTY_OBRETCODBPPTERMID, obretcoDbpPtermid);
    }

    public FIN_PaymentMethod getObretcoDbpPmethodid() {
        return (FIN_PaymentMethod) get(PROPERTY_OBRETCODBPPMETHODID);
    }

    public void setObretcoDbpPmethodid(FIN_PaymentMethod obretcoDbpPmethodid) {
        set(PROPERTY_OBRETCODBPPMETHODID, obretcoDbpPmethodid);
    }

    public Category getObretcoDbpBpcatid() {
        return (Category) get(PROPERTY_OBRETCODBPBPCATID);
    }

    public void setObretcoDbpBpcatid(Category obretcoDbpBpcatid) {
        set(PROPERTY_OBRETCODBPBPCATID, obretcoDbpBpcatid);
    }

    public Country getObretcoDbpCountryid() {
        return (Country) get(PROPERTY_OBRETCODBPCOUNTRYID);
    }

    public void setObretcoDbpCountryid(Country obretcoDbpCountryid) {
        set(PROPERTY_OBRETCODBPCOUNTRYID, obretcoDbpCountryid);
    }

    public Organization getObretcoDbpOrgid() {
        return (Organization) get(PROPERTY_OBRETCODBPORGID);
    }

    public void setObretcoDbpOrgid(Organization obretcoDbpOrgid) {
        set(PROPERTY_OBRETCODBPORGID, obretcoDbpOrgid);
    }

    public Boolean isObretcoShowtaxid() {
        return (Boolean) get(PROPERTY_OBRETCOSHOWTAXID);
    }

    public void setObretcoShowtaxid(Boolean obretcoShowtaxid) {
        set(PROPERTY_OBRETCOSHOWTAXID, obretcoShowtaxid);
    }

    public Boolean isObretcoShowbpcategory() {
        return (Boolean) get(PROPERTY_OBRETCOSHOWBPCATEGORY);
    }

    public void setObretcoShowbpcategory(Boolean obretcoShowbpcategory) {
        set(PROPERTY_OBRETCOSHOWBPCATEGORY, obretcoShowbpcategory);
    }

    @SuppressWarnings("unchecked")
    public List<RoleOrganization> getADRoleOrganizationList() {
        return (List<RoleOrganization>) get(PROPERTY_ADROLEORGANIZATIONLIST);
    }

    public void setADRoleOrganizationList(List<RoleOrganization> aDRoleOrganizationList) {
        set(PROPERTY_ADROLEORGANIZATIONLIST, aDRoleOrganizationList);
    }

    @SuppressWarnings("unchecked")
    public List<PeriodControlV> getFinancialMgmtPeriodControlVList() {
        return (List<PeriodControlV>) get(PROPERTY_FINANCIALMGMTPERIODCONTROLVLIST);
    }

    public void setFinancialMgmtPeriodControlVList(List<PeriodControlV> financialMgmtPeriodControlVList) {
        set(PROPERTY_FINANCIALMGMTPERIODCONTROLVLIST, financialMgmtPeriodControlVList);
    }

    @SuppressWarnings("unchecked")
    public List<CashManagementEvents> getOBRETCOCashManagementEventsList() {
        return (List<CashManagementEvents>) get(PROPERTY_OBRETCOCASHMANAGEMENTEVENTSLIST);
    }

    public void setOBRETCOCashManagementEventsList(List<CashManagementEvents> oBRETCOCashManagementEventsList) {
        set(PROPERTY_OBRETCOCASHMANAGEMENTEVENTSLIST, oBRETCOCashManagementEventsList);
    }

    @SuppressWarnings("unchecked")
    public List<OrganizationInformation> getOrganizationInformationList() {
        return (List<OrganizationInformation>) get(PROPERTY_ORGANIZATIONINFORMATIONLIST);
    }

    public void setOrganizationInformationList(List<OrganizationInformation> organizationInformationList) {
        set(PROPERTY_ORGANIZATIONINFORMATIONLIST, organizationInformationList);
    }

    @SuppressWarnings("unchecked")
    public List<OrganizationModuleV> getOrganizationModuleVList() {
        return (List<OrganizationModuleV>) get(PROPERTY_ORGANIZATIONMODULEVLIST);
    }

    public void setOrganizationModuleVList(List<OrganizationModuleV> organizationModuleVList) {
        set(PROPERTY_ORGANIZATIONMODULEVLIST, organizationModuleVList);
    }

    @SuppressWarnings("unchecked")
    public List<OrgWarehouse> getOrganizationWarehouseList() {
        return (List<OrgWarehouse>) get(PROPERTY_ORGANIZATIONWAREHOUSELIST);
    }

    public void setOrganizationWarehouseList(List<OrgWarehouse> organizationWarehouseList) {
        set(PROPERTY_ORGANIZATIONWAREHOUSELIST, organizationWarehouseList);
    }

}
