package org.test.pom.update;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.baseclass.LibGlobal;
public class AdacitionPrintInvoice extends LibGlobal {
	String attribute;

public AdacitionPrintInvoice() {
PageFactory.initElements(driver, this);
}
@FindBy(id="order_no")
WebElement order_no;
public WebElement getOrder_no() {
	return order_no;
}
public String printInvoice() {
attribute = getAttribute(getOrder_no());
return attribute;
}
}
