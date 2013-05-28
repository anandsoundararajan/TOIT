/*
 ************************************************************************************
 * Copyright (C) 2012 Openbravo S.L.U.
 * Licensed under the Openbravo Commercial License version 1.0
 * You may obtain a copy of the License at http://www.openbravo.com/legal/obcl.html
 * or in the legal folder of this module distribution.
 ************************************************************************************
 */

/*global enyo */

enyo.kind({
  name: 'OB.UI.CustomRenderProduct',

  kind: 'OB.UI.SelectButton',
  components: [{
    style: 'float: left; width: 25%',
    components: [
//                 {
//      kind: 'OB.UI.Thumbnail',
//      name: 'thumbnail'
//    },
    {
    	style: 'float: left; width: 55%;',
        components: [{
          name: 'identifier',
          style: 'padding-top: 10px'
        }]
    },
    {
    	name: 'price',
        style: 'float: left; width: 20%; padding-top: 0px; font-weight:bold;'
    }]
  }],
  initComponents: function () {
    this.inherited(arguments);
    this.$.identifier.setContent(this.model.get('_identifier').substring(0, 10) + '...');
    this.$.price.setContent('₹ '+OB.I18N.formatCurrency(this.model.get('standardPrice')));
//    this.$.thumbnail.setImg(this.model.get('img'));
  }
});

/*Modal definiton*/
enyo.kind({
  name: 'OB.UI.ModalCategoryProducts',
  topPosition: '125px',
  kind: 'OB.UI.Modal',
  executeOnHide: function () {
//    this.$.body.$.listBps.$.bpslistitemprinter.$.theader.$.modalBpScrollableHeader.clearAction();
  },
  header: 'Products',
  body: {
//	  this.products
  },
  init: function (model) {
    this.model = model;
    this.products = new OB.Collection.ProductList();
  },
  executeOnShow: function () {
	  this.$.header.setContent(this.args.name);
	  this.setProducts(this.args.id);
  },
  initComponents : function() {
		this.inherited(arguments);
	},
	setProducts : function(categoryId) {
		var criteria, me = this;
		function errorCallback(tx, error) {
			OB.UTIL.showError("OBDAL error: " + error);
		}

		function successCallbackProducts(dataProducts) {
			if (dataProducts && dataProducts.length > 0) {
				console.log(dataProducts.models);
					          me.products.reset(dataProducts.models);
			} else {
					          me.products.reset();
			}
		}

		if (categoryId) {
			if (categoryId === 'OBPOS_bestsellercategory') {
				criteria = {
					'bestseller' : 'true'
				};
			} else {
				criteria = {
					'productCategory' : categoryId
				};
			}
			OB.Dal.find(OB.Model.Product, criteria, successCallbackProducts,
					errorCallback);
		}
	},
});