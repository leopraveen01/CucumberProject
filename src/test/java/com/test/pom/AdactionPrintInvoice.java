package com.test.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.baseclass.LibGlobal;

public class AdactionPrintInvoice extends LibGlobal {
public AdactionPrintInvoice() {
PageFactory.initElements(driver, this);
}
@FindBy(id="order_no")
WebElement order_no;
public WebElement getOrder_no() {
	return order_no;
}
public void printInvoice() {
String attribute = getAttribute(getOrder_no());
System.out.println(attribute);
}
}
