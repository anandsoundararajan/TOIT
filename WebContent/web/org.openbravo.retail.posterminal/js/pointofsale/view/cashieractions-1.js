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
  name: 'OB.OBPOSPointOfSale.UI.RightToolbarOne',
  classes: 'span6',
  attributes: {
      style: 'float:none; margin-top: 15px; '
  },
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
        kind: 'OB.OBPOSPointOfSale.UI.RightToolbarButtonOne',
        button: btn
      });
    }, this);
  }
});

enyo.kind({
  name: 'OB.OBPOSPointOfSale.UI.CashierViewOne',
  published: {
    receipt: null
  },
  kind: 'OB.OBPOSPointOfSale.UI.RightToolbarOne',
  buttons: [{
    kind: 'OB.OBPOSPointOfSale.UI.ButtonTabSplitOne',
    name: 'payment',
    containerCssClass: 'span3'
  }, {
    kind: 'OB.OBPOSPointOfSale.UI.ButtonTabDiscountBillOne',
    name: 'search',
    containerCssClass: 'span3'
  }, {
    kind: 'OB.OBPOSPointOfSale.UI.ButtonTabDiscountItemOne',
    name: 'edit',
    containerCssClass: 'span3'
  }],

  receiptChanged: function () {
    var totalPrinterComponent;
  }
});


enyo.kind({
  name: 'OB.OBPOSPointOfSale.UI.RightToolbarButtonOne',
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
  name: 'OB.OBPOSPointOfSale.UI.ButtonTabDiscountBillOne',
  kind: 'OB.UI.ToolbarButtonTab',
  tabPanel: 'search',
  label: 'Layway Bill',
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
		style : 'text-align: center; font-size: 15px;'
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
  name: 'OB.OBPOSPointOfSale.UI.ButtonTabSplitOne',
  kind: 'OB.UI.ToolbarButtonTab',
  label: 'Price Open Item',
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
    style: 'text-align: center; font-size: 15px;'
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
  name: 'OB.OBPOSPointOfSale.UI.ButtonTabDiscountItemOne',
  published: {
  },
  kind: 'OB.UI.ToolbarButtonTab',
  tabPanel: 'edit',
  label: 'Bill On Hold',
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
		style : 'text-align: center; font-size: 15px;'
	},
  components : [{
		tag : 'span',
		attributes : {
			style : 'font-weight: bold; margin: 0px 5px 0px 0px;'
		}
  }]
});




/*
 * cashier view two
 */

enyo.kind({
  name: 'OB.OBPOSPointOfSale.UI.RightToolbarTwo',
  classes: 'span6',
  attributes: {
	  style: 'float: none; '
  },
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
        kind: 'OB.OBPOSPointOfSale.UI.RightToolbarButtonTwo',
        button: btn
      });
    }, this);
  }
});

enyo.kind({
  name: 'OB.OBPOSPointOfSale.UI.CashierViewTwo',
  published: {
    receipt: null
  },
  kind: 'OB.OBPOSPointOfSale.UI.RightToolbarTwo',
  buttons: [{
    kind: 'OB.OBPOSPointOfSale.UI.ButtonTabPrintBill(s)',
    name: 'payment',
    containerCssClass: 'span3'
  }],
  receiptChanged: function () {
    var totalPrinterComponent;
  }
});


enyo.kind({
  name: 'OB.OBPOSPointOfSale.UI.RightToolbarButtonTwo',
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
  name: 'OB.OBPOSPointOfSale.UI.ButtonTabPrintBill(s)',
  kind: 'OB.UI.ToolbarButtonTab',
  label: 'PRINT BILL(S)',
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
  tap: function () {
  },
  attributes : {
		style : 'text-align: center; font-size: 15px; background-color: #6cb33f'
	},
  components : [ {
		tag : 'span',
		attributes : {
			style : 'font-weight: bold; margin: 0px 5px 0px 0px;'
		}
  } ]
});


/*
 * cashier split options
 */

enyo.kind({
	name : 'OB.OBPOSPointOfSale.UI.SplitTypesView',
	classes : 'span6',
	attributes: {
    	style: 'float:none; '
    },
	published : {
	},
	components : [ {
	    kind: 'OB.UI.SearchSplitTypes',
	    name: 'search'
	}]
});

enyo.kind({
	  name: 'OB.UI.SearchSplitTypes',
	  style: 'margin: 5px; background-color: #ffffff; color: black; padding: 5px',
	  published: {
	    receipt: null
	  },
	  handlers: {
	  },
	  events: {
	    onAddProduct: ''
	  },
	  executeOnShow: function () {
	    var me = this;
	    setTimeout(function () {
	      me.$.products.$.theader.$.searchProductHeader.$.productname.focus();
	    }, 200);
	  },
	  components: [{
		    tag: 'p',
		    attributes: {
		    	style: 'margin: 30px 5px 0px 7px;color: #F8941D; font-weight: bold; padding-bottom:10px;'
		    },
		    content: "Choose Splitting Method:",
		  },
		{
	    classes: 'row-fluid',
	    components: [{
	      classes: 'span12',
	      components: [{
	        classes: 'row-fluid',
	        style: '',
	        components: [{
	          classes: 'row-fluid',
	          components: [{
	            classes: 'span12',
	            components: [{
	              kind: 'OB.UI.ScrollableTable',
	              name: 'products',
	              scrollAreaMaxHeight: '482px',
	              renderHeader: 'OB.UI.SearchSplitTypesHeader',
	              renderEmpty: 'OB.UI.RenderEmpty',
	              renderLine: 'OB.UI.RenderProduct'
	            }]
	          }]
	        }]
	      }]
	    },
		{
	        kind: 'OB.UI.SplitButtonCancel',
	        name: 'splitcancel'
	      },{
		        kind: 'OB.UI.SplitButtonDone',
		        name: 'splitdone'
		      }]
	  }],
	  init: function () {
	    var me = this;
	    this.inherited(arguments);
	    this.categories = new OB.Collection.ProductCategoryList();
	    this.products = new OB.Collection.ProductList();

	    //first the main collection of the component
	    this.$.products.setCollection(this.products);
//	    this.$.products.getHeader().setHeaderCollection(this.categories);

	    function errorCallback(tx, error) {
	      OB.UTIL.showError("OBDAL error: " + error);
	    }

	    function successCallbackCategories(dataCategories, me) {
	      if (dataCategories && dataCategories.length > 0) {
	        me.categories.reset(dataCategories.models);
	      } else {
	        me.categories.reset();
	      }
	    }

	    this.products.on('click', function (model) {
	      this.doAddProduct({
	        product: model
	      });
	    }, this);

	    OB.Dal.find(OB.Model.ProductCategory, null, successCallbackCategories, errorCallback, this);
	  },
});

enyo.kind({
	kind : 'OB.UI.Button',
	name : 'OB.UI.SplitButtonCancel',
	content: 'CANCEL',
	classes : 'btnlink btnlink-small btnlink-gray',
	style : 'background-color: #f8e859;',
	published : {
		order : null
	},
	events : {
		onShowPopup: '',
	},
	handlers : {
	},
	buttonDisabled : function(inSender, inEvent) {
	},
	tap : function() {
		this.doShowPopup({
		      popup: 'orderActionsDialog'
		    });
		    return true;
	},
	initComponents : function() {
	},
	renderCustomer : function(newCustomer) {
	},
	orderChanged : function(oldValue) {
	}
});

enyo.kind({
	kind : 'OB.UI.SmallButton',
	name : 'OB.UI.SplitButtonDone',
	content: 'DONE',
	classes : 'btnlink btnlink-small btnlink-gray',
	style : 'background-color: #f8e859;',
	published : {
		order : null
	},
	events : {
		onShowPopup: '',
	},
	handlers : {
	},
	buttonDisabled : function(inSender, inEvent) {
	},
	tap : function() {
		this.doShowPopup({
		      popup: 'orderActionsDialog'
		    });
		    return true;
	},
	initComponents : function() {
	},
	renderCustomer : function(newCustomer) {
	},
	orderChanged : function(oldValue) {
	}
});

enyo.kind({
    name:"OB.UI.SearchSplitTypesHeader",
    attributes : {
    	style: 'margin: 10px 0px 10px 10px; '
    },
    components:[
        {name:"select", kind:"Select", components:[
            {name:"one", content:"By Food & Alcohol"},
            {content:"By Item"}
        ]}
    ],
    create:function() {
        this.inherited(arguments);

        // adds 2 options after 2 second (arbitrary) delay        
        enyo.job("addOptions", enyo.bind(this, function() {
//            this.$.select.createComponent({content:"Zero", addBefore:this.$.one});
//            this.$.select.createComponent({content:"Four"});
            this.$.select.render();
        }), 2000);
    }
});

enyo.kind({
	  name: 'OB.OBPOSPointOfSale.UI.ExistingOrdersView',
	  classes: 'span6',
	  attributes: {
		  style: 'float:right; '
	  },
	  published: {
	    order: null,
	    orderList: null
	  },
	  components: [{
	    style: 'margin: 5px',
	    components: [{
	      style: 'position: relative;background-color: #ffffff; color: black;',
	      components: [{
	        kind: 'OB.UI.ReceiptsCounter',
	        name: 'receiptcounter'
	      }, {
	        style: 'padding: 5px;',
	        components: [{
	          classes: 'row-fluid',
	          components: [{
	            classes: 'span12',
	            components: [{
//	              style: 'padding: 5px 0px 10px 0px; border-bottom: 1px solid #cccccc;',
	              components: [
	                           {
	                        	   tag: 'p',
	                        	   attributes: {
	                        		   style: 'margin: 15px 0px 0px 0px;color: #F8941D; font-weight: bold;'
	                        	   },
	                        	   content: "Bills List:",
	                           }
	                           ]
	            }]
	          }]
	        }, {
	          classes: 'row-fluid',
	          style: 'max-height: 536px;',
	          components: [{
	            classes: 'span12',
	            components: [{
	              kind: 'OB.OBPOSPointOfSale.UI.ExistingBillsView',
	              name: 'existingbillsview'
	            }]
	          }]
	        }]
	      }]
	    }]
	  }],
	  orderChanged: function (oldValue) {
	    this.$.bpbutton.setOrder(this.order);
	    this.$.orderdetails.setOrder(this.order);
	    this.$.orderview.setOrder(this.order);
	  },
	  orderListChanged: function (oldValue) {
	    this.$.receiptcounter.setOrderList(this.orderList);
	  }
});

enyo.kind({
    name:"OB.OBPOSPointOfSale.UI.ExistingBillsView",
    kind:"Scroller",
    components:[
        {name:"dt", kind:"DataTable", map:[
            {header:"Bill#", field:"bill#"},
            {header:"Table#", field:"table#"},
            {header:"Time Closed", field:"timeclosed"},
            {header:"Amount", field:"amount"},
        ]}
    ],
    create:function() {
        this.inherited(arguments);
        // this would be set post ajax normally
        this.$.dt.setData(__data.billsList);
    }
});

enyo.kind({
	name : "DataTable",
	tag : "table",
//	attributes: {
//		style: 'padding: 0.4em; border: 1px solid #e0e0e0; '
//	},
	published : {
		map : 0,
		data : 0
	},
	components : [ {
		name : "header",
		tag : "tr"
	}, {
		name : "list",
		kind : "Repeater",
		onSetupItem : "setupItem",
		components : [ {
			name : "row",
			kind : "DataRow"
		} ]
	} ],
	create : function() {
		this.inherited(arguments);
		this.mapChanged = this.dataChanged = enyo.bind(this, "refresh");

		this.refresh();
	},
	refresh : function() {
		if (this.map && this.data) {
			this.buildHeader();
			this.$.list.setCount(this.data.length);
		}
	},
	buildHeader : function() {
		this.$.header.destroyClientControls();
		for ( var i = 0; i < this.map.length; i++) {
			this.$.header.createComponent({
				content : this.map[i].header,
				tag : "th"
			});
		}
		this.$.header.render();
	},
	setupItem : function(source, event) {
		for ( var i = 0; i < this.map.length; i++) {
			event.item.$.row.createComponent({
				content : this.data[event.index][this.map[i].field]
			});
		}

		event.item.render();
	}
});

enyo.kind({
    name:"DataRow",
    tag:"tr",
    defaultKind:"DataCell",     
});

enyo.kind({
    name:"DataCell",
    tag:"td"
});

var __data = {
	"billsList" : [ {
		"bill#" : "123",
		"table#" : "Table1",
		"timeclosed" : "12:54pm",
		"amount" : "800.00",
	}, {
		"bill#" : "127",
		"table#" : "Table4",
		"timeclosed" : "01:02pm",
		"amount" : "1700.00",
	}, {
		"bill#" : "126",
		"table#" : "Table6",
		"timeclosed" : "01:14pm",
		"amount" : "1200.00",
	}, {
		"bill#" : "124",
		"table#" : "Table3",
		"timeclosed" : "01:22pm",
		"amount" : "3500.00",
	} ],
	"usersCount" : [ {
		"instance" : "dtz581_ECS_81",
		"count" : "  4",
		"count_gui" : "  1",
		"count_rfc" : "  1",
		"count_plugin" : "  2"
	} ]
};