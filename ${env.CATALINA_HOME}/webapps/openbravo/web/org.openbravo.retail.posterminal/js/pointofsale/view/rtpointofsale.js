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
  name: 'OB.OBPOSPointOfSale.UI.RTPointOfSale',
  kind: 'OB.UI.WindowView',
  windowmodel: OB.OBPOSPointOfSale.Model.RTPointOfSale,
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
            	        kind: 'OB.OBPOSPointOfSale.UI.SectionBarImpl'
            	      }]
               }
  ],
  init: function () {
    this.inherited(arguments)
  }
});
//TABLE BUTTONS
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
	name : 'OB.OBPOSPointOfSale.UI.SectionBar',
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
	name : 'OB.UI.Section1',
	kind : 'OB.UI.ToolbarButton',
	icon : 'btn-icon',
	content : 'SECTION 1',
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
		OB.POS.navigate('Toit.section1');
	}
});

enyo.kind({
	name : 'OB.UI.Section2',
	kind : 'OB.UI.ToolbarButton',
	icon : 'btn-icon',
	content : 'SECTION 2',
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
		alert("on tap sec2");
	},
	init : function(model) {
		this.model = model;
	}
});

enyo.kind({
	name : 'OB.UI.Section3',
	kind : 'OB.UI.ToolbarButton',
	icon : 'btn-icon',
	content : 'SECTION 3',
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
	name : 'OB.OBPOSPointOfSale.UI.SectionBarImpl',
	kind : 'OB.OBPOSPointOfSale.UI.SectionBar',
	buttons : [ {
		kind : 'OB.UI.Section1'
	}, {
		kind : 'OB.UI.Section2'
	}, {
		kind : 'OB.UI.Section3'
	} ]
});

//CUSTOMIZATION
OB.OBPOSPointOfSale.UICustomization = OB.OBPOSPointOfSale.UICustomization || {};

//REGISTRATION
OB.POS.registerWindow({
  windowClass: OB.OBPOSPointOfSale.UI.RTPointOfSale,
  route: 'Toit.sections',
  menuPosition: 15,
  permission: 'OBPOS_retail.pointofsale',
  menuLabel: 'TESTLABEL',
  menuI18NLabel: 'TESTLABEL',
});
