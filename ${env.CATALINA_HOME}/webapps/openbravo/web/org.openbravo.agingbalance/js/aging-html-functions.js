/* 
 *************************************************************************
 * The contents of this file are subject to the Openbravo  Public  License
 * Version  1.1  (the  "License"),  being   the  Mozilla   Public  License
 * Version 1.1  with a permitted attribution clause; you may not  use this
 * file except in compliance with the License. You  may  obtain  a copy of
 * the License at http://www.openbravo.com/legal/license.html
 * Software distributed under the License  is  distributed  on  an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific  language  governing  rights  and  limitations
 * under the License.
 * The Original Code is Openbravo ERP.
 * The Initial Developer of the Original Code is Openbravo SLU
 * All portions are Copyright (C) 2012 Openbravo SLU
 * All Rights Reserved.
 * Contributor(s):  ______________________________________.
 ************************************************************************
 **/

/**
 * This method calls the method to create a PDF file
 */

function printPDF() {
  if (validate()) {

    var details = document.frmMain.inpDetails.checked;

    if (window.location.href.indexOf('/org.openbravo.agingbalance/ad_reports/ReceivablesAgingInquiry.html') > 0) {
      var url = 'ReceivablesAgingInquiry.html';
    } else {
      var url = 'PayablesAgingInquiry.html';
    }

    var BPartner = document.frmMain.inpBPartnerId_IN;
    var BPartnerString = "";
    if (BPartner.length > 0) {
      BPartnerString = "('";
      for (var i = 0; i < BPartner.length - 1; i++) {
        BPartnerString = BPartnerString + BPartner[i].value + "', '";
      }
      BPartnerString = BPartnerString + BPartner[i].value + "')";
    }

    openServletNewWindow('PRINT_PDF', true, url + '?inpBPartnerId_IN=' + BPartnerString + '&inpDetails=' + details, 'AgingInquiry', null, false, '700', '1000', true);
    return false;
  }
  return true;
}

/**
 * This method calls the method to create a PDF file
 */

function printXLS() {
  if (validate()) {

    var details = document.frmMain.inpDetails.checked;

    if (window.location.href.indexOf('/org.openbravo.agingbalance/ad_reports/ReceivablesAgingInquiry.html') > 0) {
      var url = 'ReceivablesAgingInquiry.html';
    } else {
      var url = 'PayablesAgingInquiry.html';
    }

    var BPartner = document.frmMain.inpBPartnerId_IN;
    var BPartnerString = "";
    if (BPartner.length > 0) {
      BPartnerString = "('";
      for (var i = 0; i < BPartner.length - 1; i++) {
        BPartnerString = BPartnerString + BPartner[i].value + "', '";
      }
      BPartnerString = BPartnerString + BPartner[i].value + "')";
    }

    openServletNewWindow('PRINT_XLS', true, url + '?inpBPartnerId_IN=' + BPartnerString + '&inpDetails=' + details, 'AgingInquiry', null, false, '700', '1000', true);
    return false;
  }
  return true;
}

/**
 * This method is called to change the labels of the day ranges when a value in a checkbox is modified
 */

function columnChange() {
  var elemDiv;
  var elemInputGreater;
  var elemInput;
  for (i = 2; i < 5; i++) {
    iMinusOne = i - 1;
    elemDiv = document.getElementById('spanCol' + i);
    elemInput = document.getElementById('paramColumn' + iMinusOne);
    elemInputGreater = document.getElementById('paramColumn' + i + 'greater');
    if (elemInput.value == "") {
      elemDiv.innerHTML = "?";
      elemInputGreater.value = "0";
    } else {
      elemDiv.innerHTML = parseInt(elemInput.value) + parseInt(1);
      elemInputGreater.value = parseInt(elemInput.value) + parseInt(1);
    }
  }
  elemDiv = document.getElementById('paramColumn4');
  elemInput = document.getElementById('spanCol5');
  elemInput.innerHTML = elemDiv.value;
  return true;
}

/**
 * This method validate that the information inserted in the form is correct
 */

function validate() {
  markCheckedAllElements(document.frmMain.inpBPartnerId_IN);
  if (!validateNumber(document.frmMain.paramColumn1.value, false, true) || document.frmMain.paramColumn1.value == "") {
    setWindowElementFocus(document.frmMain.paramColumn1);
    showJSMessage(4);
    return false;
  }
  if (!validateNumber(document.frmMain.paramColumn2.value, false, true) || document.frmMain.paramColumn2.value == "") {
    setWindowElementFocus(document.frmMain.paramColumn2);
    showJSMessage(4);
    return false;
  }
  if (!validateNumber(document.frmMain.paramColumn3.value, false, true) || document.frmMain.paramColumn3.value == "") {
    setWindowElementFocus(document.frmMain.paramColumn3);
    showJSMessage(4);
    return false;
  }
  if (!validateNumber(document.frmMain.paramColumn4.value, false, true) || document.frmMain.paramColumn4.value == "") {
    setWindowElementFocus(document.frmMain.paramColumn4);
    showJSMessage(4);
    return false;
  }
  if (parseInt(document.frmMain.paramColumn1.value) < 0) {
    setWindowElementFocus(document.frmMain.paramColumn1);
    showJSMessage(9);
    return false;
  }
  if (parseInt(document.frmMain.paramColumn2.value) <= parseInt(document.frmMain.paramColumn1.value)) {
    setWindowElementFocus(document.frmMain.paramColumn2);
    showJSMessage(9);
    return false;
  }
  if (parseInt(document.frmMain.paramColumn3.value) <= parseInt(document.frmMain.paramColumn2.value)) {
    setWindowElementFocus(document.frmMain.paramColumn3);
    showJSMessage(9);
    return false;
  }
  if (parseInt(document.frmMain.paramColumn4.value) <= parseInt(document.frmMain.paramColumn3.value)) {
    setWindowElementFocus(document.frmMain.paramColumn4);
    showJSMessage(9);
    return false;
  }
  if (inputValue(document.frmMain.inpOrg) == null || inputValue(document.frmMain.inpOrg) == "") {
    setWindowElementFocus(document.frmMain.inpOrg);
    showJSMessage(7);
    return false;
  }
  return true;
}

/**
 * This method opens a tab with the information of the Aging Schedule Report
 */

function getAgingBalanceData() {

  if (!validate()) {
    return;
  }

  var details = document.frmMain.inpDetails.checked;
  var tabTitle = document.frmMain.inpTabTitle.value;

  if (details) {
    var tabTitle = document.frmMain.inpTabTitleDetails.value;
    if (window.location.href.indexOf('/org.openbravo.agingbalance/ad_reports/ReceivablesAgingInquiry.html') > 0) {
      var url = 'ReceivablesAgingScheduleDetail.html';
    } else {
      var url = 'PayablesAgingScheduleDetail.html';
    }
  } else {
    if (window.location.href.indexOf('/org.openbravo.agingbalance/ad_reports/ReceivablesAgingInquiry.html') > 0) {
      var url = 'ReceivablesAgingSchedule.html';
    } else {
      var url = 'PayablesAgingSchedule.html';
    }
  }

  var organization = document.frmMain.inpOrg.value;
  var acctSchema = document.frmMain.inpAccSchema.value;
  var currentDate = document.frmMain.inpCurrentDate.value;
  var column1 = parseInt(document.frmMain.paramColumn1.value);
  var column2 = parseInt(document.frmMain.paramColumn2.value);
  var column3 = parseInt(document.frmMain.paramColumn3.value);
  var column4 = parseInt(document.frmMain.paramColumn4.value);
  var BPartner = document.frmMain.inpBPartnerId_IN;
  var BPartnerString = "";

  if (BPartner.length > 0) {
    BPartnerString = "('";
    for (var i = 0; i < BPartner.length - 1; i++) {
      BPartnerString = BPartnerString + BPartner[i].value + "', '";
    }
    BPartnerString = BPartnerString + BPartner[i].value + "')";
  }

  top.OB.ViewManager.openView('OBClassicWindow', {
    viewId: 'OBClassicWindow',
    obManualURL: '/org.openbravo.agingbalance/ad_reports/' + url + '?inpOrg=' + organization + '&inpAccSchema=' + acctSchema + '&inpBPartnerId_IN=' + BPartnerString + '&inpCurrentDate=' + currentDate + '&inpColumn1=' + column1 + '&inpColumn2=' + column2 + '&inpColumn3=' + column3 + '&inpColumn4=' + column4 + '&inpDetails=' + details + '&vScroll=auto',
    command: 'DIRECT',
    icon: '[SKINIMG]../../org.openbravo.client.application/images/application-menu/iconReport.png',
    tabTitle: tabTitle,
    isSameTab: function (viewID, params) {
      if (params && params.obManualURL) {
        return (params.obManualURL.indexOf('/org.openbravo.agingbalance/ad_reports/' + url) === 0)
      }
      return false;
    }
  });
}


/**
 * This method is used to fill the accounting schema selector
 * @returns
 */

function selectAccountingSchema() {
  try {
    if (window.location.href.indexOf('/org.openbravo.agingbalance/ad_reports/ReceivablesAgingInquiry.html') > 0) {
      var url = 'ReceivablesAgingInquiry.html';
    } else {
      var url = 'PayablesAgingInquiry.html';
    }
    var paramXMLReq = null;
    return submitXmlHttpRequest(callback, document.frmMain, "ACCTSCHEMA", url, false, null, paramXMLReq);
  } catch (e) {
    alert(e);
  }
}

/**
 * This method is used to fill the accounting schema selector
 * @returns
 */

function callback(paramXMLParticular, XMLHttpRequestObj) {
  var strText = "";
  if (getReadyStateHandler(XMLHttpRequestObj)) {
    try {
      if (XMLHttpRequestObj.responseText) {
        strText = XMLHttpRequestObj.responseText;
        createCombo(document.getElementById('inpAccSchema'), strText);
      }
    } catch (e) {}
  }
  return true;
}

/**
 * This method is used to fill the accounting schema selector
 * @returns
 */

function createCombo(node, jsonstring) {
  try {
    var objson = eval(jsonstring);
    node.options.length = 0;
    if (typeof objson !== undefined) {
      var rowslength = objson.optionlist.length;
      for (i = 0; i < rowslength; i++) {
        var option = document.createElement('OPTION');
        option.setAttribute("value", objson.optionlist[i].value);
        if (objson.optionlist[i].selected === "true") {
          option.setAttribute("selected", "");
        }
        var textin = document.createTextNode(objson.optionlist[i].text);
        option.appendChild(textin);
        node.appendChild(option);
      }
    }
  } catch (e) {
    console.log(e);
  }
}

function depurar() {
  return true;
}

function onLoadDo() {
  this.windowTables = new Array(
  new windowTableId('client', 'buttonHTML'));
  setWindowTableParentElement();
  this.tabsTables = new Array(
  new tabTableId('tdtopTabs'));
  setTabTableParentElement();
  enableShortcuts('edition');
  setBrowserAutoComplete(false);

  resizeArea();
  updateMenuIcon('buttonMenu');
  columnChange();

  setWindowElementFocus('firstElement');

  selectAccountingSchema();

}

function onResizeDo() {
  resizeArea();
}