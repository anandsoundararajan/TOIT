/*
 ************************************************************************************
 * Copyright (C) 2012 Openbravo S.L.U.
 * Licensed under the Openbravo Commercial License version 1.0
 * You may obtain a copy of the License at http://www.openbravo.com/legal/obcl.html
 * or in the legal folder of this module distribution.
 ************************************************************************************
 */

/*global enyo, $ */

// Toolbar container
// ----------------------------------------------------------------------------
enyo.kind({
  name: 'OB.OBPOSPointOfSale.UI.RightToolbar',
  classes: 'span9',
  handlers: {
    onTabButtonTap: 'tabButtonTapHandler'
  },
  components: [{
    tag: 'ul',
    classes: 'unstyled nav-pos row-fluid',
    name: 'toolbar'
  }],
  tabButtonTapHandler: function (inSender, inEvent) {
    if (inEvent.tabPanel) {
      this.setTabButtonActive(inEvent.tabPanel);
    }
  },
  setTabButtonActive: function (tabName) {

  },
  manualTap: function (tabName, options) {

  },
  initComponents: function () {
    this.inherited(arguments);
    enyo.forEach(this.buttons, function (btn) {
      this.$.toolbar.createComponent({
        kind: 'OB.OBPOSPointOfSale.UI.RightToolbarButton',
        button: btn
      });
    }, this);
  }
});

enyo.kind({
  name: 'OB.OBPOSPointOfSale.UI.CashierView',
  published: {
    receipt: null
  },
  kind: 'OB.OBPOSPointOfSale.UI.RightToolbar',
  buttons: [{
    kind: 'OB.OBPOSPointOfSale.UI.ButtonTabSplit',
    name: 'payment',
    containerCssClass: 'span3'
  }, {
    kind: 'OB.OBPOSPointOfSale.UI.ButtonTabPriceModifier',
    name: 'catalog',
    containerCssClass: 'span2'
  }, {
    kind: 'OB.OBPOSPointOfSale.UI.ButtonTabDiscountBill',
    name: 'search',
    containerCssClass: 'span2'
  }, {
    kind: 'OB.OBPOSPointOfSale.UI.ButtonTabDiscountItem',
    name: 'edit',
    containerCssClass: 'span2'
  }],

  receiptChanged: function () {
    var totalPrinterComponent;
  }
});


enyo.kind({
  name: 'OB.OBPOSPointOfSale.UI.RightToolbarButton',
  tag: 'li',
  components: [{
    name: 'theButton',
    attributes: {
      style: 'margin: 0px 5px 0px 5px;'
    }
  }],
  initComponents: function () {
    this.inherited(arguments);
    if (this.button.containerCssClass) {
      this.setClassAttribute(this.button.containerCssClass);
    }
    this.$.theButton.createComponent(this.button);
  }
});


// Toolbar buttons
// ----------------------------------------------------------------------------

enyo.kind({
  name: 'OB.OBPOSPointOfSale.UI.ButtonTabPriceModifier',
  kind: 'OB.UI.ToolbarButtonTab',
  label: 'PRICE MODIFIER',
  events: {
    onTabChange: ''
  },
  handlers: {
    onRightToolbarDisabled: 'disabledButton'
  },
  disabledButton: function (inSender, inEvent) {
    this.isEnabled = !inEvent.status;
    this.setDisabled(inEvent.status);
  },
  tabPanel: 'catalog',
  label: 'PRICE MODIFIER',
  tap: function () {
  },
  attributes : {
		style : 'text-align: center; font-size: 17px;'
	},
  components : [ {
		tag : 'span',
		attributes : {
			style : 'font-weight: bold; margin: 0px 5px 0px 0px;'
		}
  } ]
});

enyo.kind({
  name: 'OB.OBPOSPointOfSale.UI.ButtonTabDiscountBill',
  kind: 'OB.UI.ToolbarButtonTab',
  tabPanel: 'search',
  label: 'DISCOUNT BILL',
  handlers: {
    onRightToolbarDisabled: 'disabledButton'
  },
  disabledButton: function (inSender, inEvent) {
    this.isEnabled = !inEvent.status;
    this.setDisabled(inEvent.status);
  },
  events: {
    onTabChange: ''
  },
  tap: function () {
  },
  attributes : {
		style : 'text-align: center; font-size: 17px;'
  },
  components : [{
		tag : 'span',
		attributes : {
			style : 'font-weight: bold; margin: 0px 5px 0px 0px;'
		}
  }],
  initComponents: function () {
    this.inherited(arguments);
  }
});

enyo.kind({
  name: 'OB.OBPOSPointOfSale.UI.ButtonTabSplit',
  kind: 'OB.UI.ToolbarButtonTab',
  label: 'SPLIT',
  tabPanel: 'payment',
  handlers: {
  },
  disabledButton: function (inSender, inEvent) {
    this.isEnabled = !inEvent.status;
    this.setDisabled(inEvent.status);
  },
  events: {
    onTabChange: ''
  },
  tap: function () {
  },
  attributes: {
    style: 'text-align: center; font-size: 17px;'
  },
  components: [{
    tag: 'span',
    attributes: {
      style: 'font-weight: bold; margin: 0px 5px 0px 0px;'
    }
  }],
  initComponents: function () {
    this.inherited(arguments);
//    this.removeClass('btnlink-gray');
  },
  renderTotal: function (inSender, inEvent) {
    this.$.totalPrinter.renderTotal(inEvent.newTotal);
  },
  init: function (model) {
    this.model = model;
  }
});

enyo.kind({
  name: 'OB.OBPOSPointOfSale.UI.ButtonTabDiscountItem',
  published: {
  },
  kind: 'OB.UI.ToolbarButtonTab',
  tabPanel: 'edit',
  label: 'DISCOUNT ITEM',
  events: {
    onTabChange: ''
  },
  handlers: {
  },
  disabledButton: function (inSender, inEvent) {
  },
  tap: function () {
  },
  attributes : {
		style : 'text-align: center; font-size: 17px;'
	},
  components : [{
		tag : 'span',
		attributes : {
			style : 'font-weight: bold; margin: 0px 5px 0px 0px;'
		}
  }]
});