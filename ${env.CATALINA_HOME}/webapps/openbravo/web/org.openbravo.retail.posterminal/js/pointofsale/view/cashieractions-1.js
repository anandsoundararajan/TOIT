enyo.kind({
	name : 'OB.OBPOSPointOfSale.UI.CashierViewOne',
	published : {
		receipt : null
	},
	kind : 'OB.OBPOSPointOfSale.UI.BottomToolbar',
	buttons : [ {
		kind : 'OB.OBPOSPointOfSale.UI.ButtonTabDiscountItemOne',
		name : 'payment',
		containerCssClass : 'span3'
	}],

	receiptChanged : function() {
		var totalPrinterComponent;
	}
});

enyo.kind({
	name : 'OB.OBPOSPointOfSale.UI.BottomToolbar',
	classes : 'span9',
	handlers : {
		onTabButtonTap : 'tabButtonTapHandler'
	},
	components : [ {
		tag : 'ul',
		classes : 'unstyled nav-pos row-fluid',
		name : 'toolbar'
	} ],
	tabButtonTapHandler : function(inSender, inEvent) {
		if (inEvent.tabPanel) {
			this.setTabButtonActive(inEvent.tabPanel);
		}
	},
	setTabButtonActive : function(tabName) {

	},
	manualTap : function(tabName, options) {

	},
	initComponents : function() {
		this.inherited(arguments);
		enyo.forEach(this.buttons, function(btn) {
			this.$.toolbar.createComponent({
				kind : 'OB.OBPOSPointOfSale.UI.BottomToolbarButton',
				button : btn
			});
		}, this);
	}
});

enyo.kind({
	name : 'OB.OBPOSPointOfSale.UI.BottomToolbarButton',
	tag : 'li',
	components : [ {
		name : 'theButton',
		attributes : {
			style : 'margin: 0px 5px 0px 5px;'
		}
	} ],
	initComponents : function() {
		this.inherited(arguments);
		if (this.button.containerCssClass) {
			this.setClassAttribute(this.button.containerCssClass);
		}
		this.$.theButton.createComponent(this.button);
	}
});

enyo.kind({
	name : 'OB.OBPOSPointOfSale.UI.ButtonTabDiscountItemOne',
	published : {},
	kind : 'OB.UI.ToolbarButtonTab',
	tabPanel : 'edit',
	label : 'DISCOUNT ITEM',
	events : {
		onTabChange : ''
	},
	handlers : {},
	disabledButton : function(inSender, inEvent) {
	},
	tap : function() {
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