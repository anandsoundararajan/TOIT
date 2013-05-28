package org.openbravo.localization.india.utils.MaskReference;

import org.openbravo.client.kernel.reference.StringUIDefinition;
import org.openbravo.model.ad.ui.Field;

public class MaskEditorReference extends StringUIDefinition {
	public String getFieldProperties(Field field) {
		  //
		  	//System.out.println("The input mask is"+field.getColumn().getOBINUTLMask());
		  	//return "{mask: '(###) ###-####'}";
			return "{mask: '"+field.getColumn().getOBINUTLMask()+"'}"; 

	  }

}
