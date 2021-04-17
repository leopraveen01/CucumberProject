package com.test.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.baseclass.LibGlobal;

public class AdactinCancelBooking extends LibGlobal{
	public AdactinCancelBooking() {
PageFactory.initElements(driver, this);	
}
	
@FindBy(xpath="//a[text()='Booked Itinerary']")
private WebElement btnBookingItenary;
@FindBy(xpath="//table[@cellspacing='1']")
private List<WebElement> txtTableOfOrderID;
//@FindBy(xpath="//input[@value='XR1PN8P22H']//parent::td//preceding-sibling::td")
//private WebElement btnSelectOrderId;
//@FindBy(xpath="//input[@value='Cancel XR1PN8P22H']//parent::td")
//private WebElement btnCancelOrderId;
public WebElement getBtnBookingItenary() {
	return btnBookingItenary;
}
public List<WebElement> getTxtTableOfOrderID() {
	return txtTableOfOrderID;
}
//public WebElement getBtnSelectOrderId() {
//	return btnSelectOrderId;
//}
//public WebElement getBtnCancelOrderId() {
//	return btnCancelOrderId;
//}
public void cancelBooking(String orderId) {
	
click(getBtnBookingItenary());
	WebElement btnSelectOrderID = driver.findElement(By.xpath("//input[@value='"+orderId+"']//parent::td//preceding-sibling::td"));
	btnSelectOrderID.click();
	WebElement btnCancelOrderID = driver.findElement(By.xpath("//input[@value='Cancel "+orderId+"']//parent::td"));
	btnCancelOrderID.click();
}


}


