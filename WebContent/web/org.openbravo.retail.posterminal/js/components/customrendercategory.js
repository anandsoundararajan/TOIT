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
  name: 'OB.UI.CustomRenderCategory',
  kind: 'OB.UI.SelectButton',
  events: {
	    onShowPopup: ''
	  },
  components: [{
    style: 'float: left; width: 25%',
    components: [
//                 {
//      kind: 'OB.UI.Thumbnail',
//      name: 'thumbnail'
//    },
    {
    	style: 'float: left; width: 25%;',
        components: [{
          name: 'identifier',
          style: 'margin-top: 10px;'
    }]
  }
//  {
//    style: 'float: left; width: 25%;',
//    components: [{
//      name: 'identifier',
//      style: 'padding-left: 5px;'
//    },
//    {
//      style: 'clear:both;'
//    }
    ]
  }],
//  tap: function (options) {
//	if (!this.disabled) {
//	      this.doShowPopup({
//	        popup: 'modalcategoryproducts',
//	        args: { name: this.model.get('_identifier'), id: this.model.get('id') }
//	      });
//	    }
//  },
  initComponents: function () {
    this.inherited(arguments);
//    this.addClass('btnselect-browse');
    this.$.identifier.setContent(this.model.get('_identifier').substring(0, 10) + '...');
//    this.$.thumbnail.setImg(this.model.get('img'));
  }
});