/*
 ************************************************************************************
 * Copyright (C) 2013 Openbravo S.L.U.
 * Licensed under the Openbravo Commercial License version 1.0
 * You may obtain a copy of the License at http://www.openbravo.com/legal/obcl.html
 * or in the legal folder of this module distribution.
 ************************************************************************************
 */

/*global OB, Backbone, enyo, $, confirm, _ */

// Point of sale main window view
enyo.kind({
  name: 'OB.OBPOSPointOfSale.UI.SplitBill',
  kind: 'OB.UI.WindowView',
  windowmodel: OB.OBPOSPointOfSale.Model.SplitBillModel,
  tag: 'section',
  content: 'This is a test',
  events: {
	    onShowPopup: ''
  },
  components: [{
	  name: 'mainSubWindow',
	    isMainSubWindow: true,
	    components: [{
	    	      classes: 'row',
	    	      style: 'margin-bottom: 5px;',
	    	      components: [
	    	                   {
	    	        kind: 'OB.OBPOSPointOfSale.UI.LeftToolbarImpl'
	    	      }, 
	    	      {
	    	        kind: 'OB.OBPOSPointOfSale.UI.RightToolbarImpl',
	    	        name: 'rightToolbar'
	    	      }]
	    },
	    {
	        classes: 'row',
	        components: [{
	            kind: 'OB.OBPOSPointOfSale.UI.ExistingOrdersView',
	            name: 'existingordersview'
	          }]
	    },
	    {
	        classes: 'row',
	        components: [{
	            kind: 'OB.OBPOSPointOfSale.UI.CashierView',
	            name: 'cashierview'
	          }]
	      },
 		{
			classes : 'row',
			components : [ {
				kind : 'OB.OBPOSPointOfSale.UI.CashierViewOne',
				name : 'cashierviewone'
			} ]
		},
		{
			classes : 'row',
			components : [ {
				kind : 'OB.OBPOSPointOfSale.UI.CashierViewTwo',
				name : 'cashierviewtwo'
			} ]
		},
		{
		      classes: 'row',
		      components: [{
		        kind: 'OB.OBPOSPointOfSale.UI.SplitTypesView',
		        name: 'splittypesview'
		      }]
		}]
  }],
  init: function () {
    this.inherited(arguments)
  }
});

//CUSTOMIZATION
OB.OBPOSPointOfSale.UICustomization = OB.OBPOSPointOfSale.UICustomization || {};

//REGISTRATION
OB.POS.registerWindow({
  windowClass: OB.OBPOSPointOfSale.UI.SplitBill,
  route: 'rt.splitbill',
  menuPosition: 16,
  permission: 'OBPOS_retail.pointofsale',
  menuLabel: 'RTSPLBL',
  menuI18NLabel: 'RTSPLBL',
});