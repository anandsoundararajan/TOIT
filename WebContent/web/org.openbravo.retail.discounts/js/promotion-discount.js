/*
 ************************************************************************************
 * Copyright (C) 2012 Openbravo S.L.U.
 * Licensed under the Openbravo Commercial License version 1.0
 * You may obtain a copy of the License at http://www.openbravo.com/legal/obcl.html
 * or in the legal folder of this module distribution.
 ************************************************************************************
 */

// Promotion rules module depends directly on client kernel module so it is not necessary
// to install Web POS to work with it, this makes dependency chain not to be as it should:
// this code depending on WebPOS that provides OB.Model.Discounts. Hacking it here to allow
// this dependency.
OB = OB || {};
OB.Model = OB.Model || {};
OB.Model.Discounts = OB.Model.Discounts || {};
OB.Model.Discounts.discountRules = OB.Model.Discounts.discountRules || {};

//Fixed Percentage Discount
OB.Model.Discounts.discountRules['697A7AB9FD9C4EE0A3E891D3D3CCA0A7'] = {
  async: false,
  implementation: function (discountRule, receipt, line) {
    var linePrice, totalDiscount, qty = OB.DEC.toBigDecimal(line.get('qty')),
        discount = OB.DEC.toBigDecimal(discountRule.get('discount')),
        discountedLinePrice;

    linePrice = OB.DEC.toBigDecimal(line.get('discountedLinePrice') || line.get('price'));
    discountedLinePrice = OB.DEC.mul(OB.DEC.sub(OB.DEC.One, OB.DEC.div(discountRule.get('discount'), 100)), linePrice);
    totalDiscount = qty.multiply(linePrice).multiply(discount).divide(new BigDecimal('100'), OB.DEC.scale, BigDecimal.prototype.ROUND_HALF_EVEN);

    receipt.addPromotion(line, discountRule, {
      amt: OB.DEC.toNumber(totalDiscount)
    });

    line.set('discountedLinePrice', discountedLinePrice);
  }
};