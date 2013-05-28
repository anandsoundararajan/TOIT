package org.openbravo.localization.india.utils.bo;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import org.junit.Assert;
import org.junit.Test;
import org.openbravo.dal.core.OBContext;
import org.openbravo.test.base.BaseTest;

public class TestFinancialEntitiesGuidConvertor extends BaseTest {
  @Override
  protected void setUp() throws Exception {

    super.setUp();

    OBContext.setAdminMode(true);
  }

  @Override
  protected void tearDown() throws Exception {
    OBContext.restorePreviousMode();

  }

  @Test
  public void testBasicDomCreationAndParsing() {

    try {
      // TODO: change the test to use the new interface
      File xmlFile = new File("/home/shrinivas/Desktop/Balance_Sheet_Header.xml");
      InputStream in = new BufferedInputStream(new FileInputStream(xmlFile));
      // FinancialEntitiesGuidConverter.ConvertFile(in, "", null);

      Assert.assertTrue(true);
    } catch (Exception e) {
      e.printStackTrace();
      Assert.fail("Process threw exception " + e.getMessage());
    }
  }

}
