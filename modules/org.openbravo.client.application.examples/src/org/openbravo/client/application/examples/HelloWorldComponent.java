package org.openbravo.client.application.examples;

import org.openbravo.client.kernel.BaseTemplateComponent;
import org.openbravo.dal.core.OBContext;

/**
 * Provides a widget which shows a hello world message when clicked.
 * 
 * @author mtaal
 */
public class HelloWorldComponent extends BaseTemplateComponent {

  public String getName() {
    return OBContext.getOBContext().getUser().getName();
  }
}
