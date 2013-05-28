/*
 ************************************************************************************
 * Copyright (C) 2012 Openbravo S.L.U.
 * Licensed under the Openbravo Commercial License version 1.0
 * You may obtain a copy of the License at http://www.openbravo.com/legal/obcl.html
 * or in the legal folder of this module distribution.
 ************************************************************************************
 */

/*global Backbone*/

// Manual discounts
(function () {
  function add(receipt, line, promotion) {
    var definition = promotion.definition,
        price, pctg, amt, unitDiscount;
    definition.manual = true;
    definition._idx = -1;
    if (definition.percentage) {
      price = line.get('gross');
      price = OB.DEC.toBigDecimal(price);
      pctg = OB.DEC.toBigDecimal(definition.percentage);

      amt = price.multiply(pctg.divide(new BigDecimal('100'), OB.DEC.scale, BigDecimal.prototype.ROUND_HALF_EVEN));

      definition.amt = OB.DEC.toNumber(amt);
    } else {
      definition.amt = definition.userAmt;
    }

    unitDiscount = OB.DEC.div(definition.amt, line.get('qty'));
    line.set('discountedLinePrice', line.get('price') - unitDiscount);

    receipt.addPromotion(line, promotion.rule, definition);
  }

  function addPercentage(receipt, line, promotion) {
    promotion.definition.percentage = promotion.definition.userAmt;
    add(receipt, line, promotion);
  }

  // User Defined Amount
  OB.Model.Discounts.discountRules['D1D193305A6443B09B299259493B272A'] = {
    addManual: function (receipt, line, promotion) {
      add(receipt, line, promotion);
    }
  };

  // Discretionary Discount Fixed Amount
  OB.Model.Discounts.discountRules['7B49D8CC4E084A75B7CB4D85A6A3A578'] = {
    addManual: function (receipt, line, promotion) {
      add(receipt, line, promotion);
    }
  };

  // User Defined Percentage
  OB.Model.Discounts.discountRules['20E4EC27397344309A2185097392D964'] = {
    addManual: function (receipt, line, promotion) {
      addPercentage(receipt, line, promotion);
    }
  };

  // Discretionary Discount Fixed Percentage
  OB.Model.Discounts.discountRules['8338556C0FBF45249512DB343FEFD280'] = {
    addManual: function (receipt, line, promotion) {
      addPercentage(receipt, line, promotion);
    }
  };
}());