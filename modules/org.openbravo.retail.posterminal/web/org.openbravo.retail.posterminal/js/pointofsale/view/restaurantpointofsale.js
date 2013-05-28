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
  name: 'OB.OBPOSPointOfSale.UI.RESTAURANTPointOfSale',
  kind: 'OB.UI.WindowView',
  windowmodel: OB.OBPOSPointOfSale.Model.RESTAURANTPointOfSale,
  tag: 'section',
  content: 'This is a test',
  events: {
	    onShowPopup: ''
	  },
	  components: [
	               {
	            	      classes: 'row',
	            	      style: 'margin-bottom: 5px;',
	            	      components: [{
	            	        kind: 'OB.OBPOSPointOfSale.UI.TableBarImpl'
	            	      }]
	               }
	  ],
	  init: function () {
	    this.inherited(arguments);
	  }
});

enyo.kind({
	name : 'OB.OBPOSPointOfSale.UI.TablesButton',
	tag : 'li',
	classes : 'span3',
	components : [ {
		name : 'theButton',
		attributes : {
			style : 'margin: 0px 5px 0px 5px;'
		}
	} ],
	initComponents : function() {
		this.inherited(arguments);
		this.$.theButton.createComponent(this.button);
	}
});
 
enyo.kind({
	name : 'OB.OBPOSPointOfSale.UI.TableBar',
	classes : 'span12',
	components : [ {
		tag : 'ul',
		classes : 'unstyled nav-pos row-fluid',
		name : 'toolbar'
	} ],
	initComponents : function() {
		this.inherited(arguments);
		enyo.forEach(this.buttons, function(btn) {
			this.$.toolbar.createComponent({
				kind : 'OB.OBPOSPointOfSale.UI.TablesButton',
				button : btn
			});
		}, this);
	}
});

enyo.kind({
	name : 'OB.UI.Table1',
	kind : 'OB.UI.ToolbarButton',
	icon : 'btn-icon',
	content : 'TABLE 1',
	events : {
		onAddNewOrder : ''
	},
	handlers : {
		onLeftToolbarDisabled : 'disabledButton'
	},
	disabledButton : function(inSender, inEvent) {
		this.isEnabled = !inEvent.status;
		this.setDisabled(inEvent.status);
	},
	tap : function() {
		OB.POS.navigate('retail.pointofsale');
	}
});
 

enyo.kind({
	name : 'OB.UI.Table2',
	kind : 'OB.UI.ToolbarButton',
	icon : 'btn-icon',
	content : 'TABLE 2',
	events : {
		onShowPopup : '',
		onDeleteOrder : ''
	},
	handlers : {
		onLeftToolbarDisabled : 'disabledButton'
	},
	disabledButton : function(inSender, inEvent) {
		this.isEnabled = !inEvent.status;
		this.setDisabled(inEvent.status);
	},
	tap : function() {
		OB.POS.navigate('retail.pointofsale');
	},
	init : function(model) {
		this.model = model;
	}
});
 

enyo.kind({
	name : 'OB.UI.Table3',
	kind : 'OB.UI.ToolbarButton',
	icon : 'btn-icon',
	content : 'TABLE 3',
	events : {
		onAddNewOrder : ''
	},
	handlers : {
		onLeftToolbarDisabled : 'disabledButton'
	},
	disabledButton : function(inSender, inEvent) {
		this.isEnabled = !inEvent.status;
		this.setDisabled(inEvent.status);
	},
	tap : function() {
		alert("on tap sec3");
	}
});
enyo.kind({
	name : 'OB.OBPOSPointOfSale.UI.TableBarImpl',
	kind : 'OB.OBPOSPointOfSale.UI.TableBar',
	buttons : [ {
		kind : 'OB.UI.Table1'
	}, {
		kind : 'OB.UI.Table2'
	}, {
		kind : 'OB.UI.Table3'
	} ]
});

OB.OBPOSPointOfSale.UICustomization = OB.OBPOSPointOfSale.UICustomization || {};

OB.POS.registerWindow({
  windowClass: OB.OBPOSPointOfSale.UI.RESTAURANTPointOfSale,
  route: 'Toit.section1',
  menuPosition: 16,
  permission: 'OBPOS_retail.pointofsale',
  menuLabel: 'RTPOS',
  menuI18NLabel: 'RTPOS',
});