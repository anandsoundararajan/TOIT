/*
 ************************************************************************************
 * Copyright (C) 2012 Openbravo S.L.U.
 * Licensed under the Openbravo Commercial License version 1.0
 * You may obtain a copy of the License at http://www.openbravo.com/legal/obcl.html
 * or in the legal folder of this module distribution.
 ************************************************************************************
 */

/*global enyo, _ */

enyo.kind({
  name: 'OB.UI.PopularProductBrowser',
  classes: 'row-fluid',
  components: [
	{
		classes : 'span6',
		components : [ {
			kind : 'OB.UI.BrowsePopularProducts',
			name : 'browseProducts'
		} ]
	}],
  init: function () {
	  this.$.browseProducts.$.listProducts.loadCategory('0CB4CA9437E04E60B8781FD26CDB77B1');
  }
});

enyo.kind({
	name : 'OB.UI.BrowsePopularProducts',
	style : 'margin: 5px;',
	components : [ {
		style : 'background-color: #ffffff; color: black; padding: 5px',
		components : [ {
			kind : 'OB.UI.ListPopularProducts',
			name : 'listProducts'
		} ]
	} ]
});

enyo.kind({
	kind : 'OB.UI.ScrollableTableHeader',
	name : 'OB.UI.PopularProductListHeader',
	style : 'padding: 10px; border-bottom: 1px solid #cccccc;',
	components : [ {
		style : 'line-height: 27px; font-size: 18px; font-weight: bold;',
		name : 'title'
	} ],
	setHeader : function(valueToSet) {
		this.$.title.setContent(valueToSet);
	}
});

enyo.kind({
	name : 'OB.UI.ListPopularProducts',
	events : {
		onAddProduct : '',
		onShowLeftSubWindow : ''
	},
	components : [ {
		kind : 'OB.UI.ScrollableTable',
		name : 'productTable',
		scrollAreaMaxHeight : '100px',
		renderHeader : 'OB.UI.PopularProductListHeader',
		renderEmpty : 'OB.UI.RenderEmpty',
		renderLine : 'OB.UI.CustomRenderProduct'
	} ],
	init : function() {
		this.inherited(arguments);
		this.products = new OB.Collection.ProductList();
		this.$.productTable.setCollection(this.products);
		this.products.on('click', function(model) {
			this.doAddProduct({
				product : model
			});
		}, this);
	},

	loadCategory : function(category) {
		var criteria, me = this;

		function errorCallback(tx, error) {
			OB.UTIL.showError("OBDAL error: " + error);
		}

		function successCallbackProducts(dataProducts) {
			if (dataProducts && dataProducts.length > 0) {
				me.products.reset(dataProducts.models);
			} else {
				me.products.reset();
			}
			//      TODO
			me.$.productTable.getHeader()
					.setHeader('Popular items');
		}

		if (category) {
			if (category === 'OBPOS_bestsellercategory') {
				criteria = {
					'bestseller' : 'true'
				};
			} else {
				criteria = {
					'productCategory' : category
				};
			}
			OB.Dal.find(OB.Model.Product, criteria, successCallbackProducts,
					errorCallback);
		} else {
			this.products.reset();
			this.title.text(OB.I18N.getLabel('OBPOS_LblNoCategory'));
		}
	}
});