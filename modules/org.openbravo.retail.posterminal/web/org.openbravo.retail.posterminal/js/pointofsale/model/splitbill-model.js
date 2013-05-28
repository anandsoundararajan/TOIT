/*
 ************************************************************************************
 * Copyright (C) 2012 Openbravo S.L.U.
 * Licensed under the Openbravo Commercial License version 1.0
 * You may obtain a copy of the License at http://www.openbravo.com/legal/obcl.html
 * or in the legal folder of this module distribution.
 ************************************************************************************
 */

/*global $ Backbone enyo _ */

OB.OBPOSPointOfSale = OB.OBPOSPointOfSale || {};
OB.OBPOSPointOfSale.Model = OB.OBPOSPointOfSale.Model || {};
OB.OBPOSPointOfSale.UI = OB.OBPOSPointOfSale.UI || {};

//Window model
OB.OBPOSPointOfSale.Model.SplitBillModel = OB.Model.WindowModel.extend({
  models: [OB.Model.TaxRate, OB.Model.Product, OB.Model.ProductCategory, OB.Model.BusinessPartner, OB.Model.BPCategory, OB.Model.Order, OB.Model.DocumentSequence, OB.Model.ChangedBusinessPartners, OB.Model.Discount, OB.Model.DiscountFilterBusinessPartner, OB.Model.DiscountFilterBusinessPartnerGroup, OB.Model.DiscountFilterProduct, OB.Model.DiscountFilterProductCategory, OB.Model.CurrencyPanel],
  init: function () {
	  var receipt = new OB.Model.Order(),
      discounts, ordersave, customersave, taxes, orderList, hwManager, ViewManager;
	    ViewManager = Backbone.Model.extend({
	        defaults: {
	          currentWindow: {
	            name: 'mainSubWindow',
	            params: []
	          }
	        },
	        initialize: function () {}
	      });
	    this.set('order', receipt);
	    orderList = new OB.Collection.OrderList(receipt);
	    this.set('orderList', orderList);
	    this.set('customer', new OB.Model.BusinessPartner());
	    customersave = new OB.DATA.CustomerSave(this);
	    this.set('subWindowManager', new ViewManager());
	    discounts = new OB.DATA.OrderDiscount(receipt);
	    ordersave = new OB.DATA.OrderSave(this);
	    taxes = new OB.DATA.OrderTaxes(receipt);
  }
});