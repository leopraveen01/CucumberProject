package org.test.pom.update;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.baseclass.LibGlobal;

public class AdacitinCancelBooking extends LibGlobal {
	public AdacitinCancelBooking() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Booked Itinerary']")
	private WebElement btnBookingItenary;
	@FindBy(id = "my_itinerary")
	private WebElement btnMyItinery;

	@FindBy(xpath = "//table[@cellspacing='1']")
	private List<WebElement> txtTableOfOrderID;
	@FindBy(xpath = "//input[@value='XR1PN8P22H']//parent::td//preceding-sibling::td")
	private WebElement btnSelectOrderId;
	@FindBy(xpath = "//input[@value='Cancel XR1PN8P22H']//parent::td")
	private WebElement btnCancelOrderId;
	@FindBy(xpath="//label[contains(text(),'The booking has been cancelled.')]")
	WebElement assertCanBookConfirm;

	public WebElement getBtnSelectOrderId() {
		return btnSelectOrderId;
	}

	public WebElement getAssertCanBookConfirm() {
		return assertCanBookConfirm;
	}

	public WebElement getBtnBookingItenary() {
		return btnBookingItenary;
	}

	public List<WebElement> getTxtTableOfOrderID() {
		return txtTableOfOrderID;
	}

	public WebElement getBtnSelectOrderId(String ordeID) {
		return btnSelectOrderId;
	}

	public WebElement getBtnCancelOrderId() {
		return btnCancelOrderId;
	}

	public WebElement getBtnMyItinery() {
		return btnMyItinery;
	}

	public void cancelBooking_SameBookedId() {

driver.manage().timeouts().implicitlyWait(8000, TimeUnit.SECONDS);
        System.out.println(AdacitinBookHotel.printInvoice);
        getBtnBookingItenary().click();
		WebElement table = driver.findElement(By.xpath("//table[@cellspacing='1']"));
		List<WebElement> rowData = table.findElements(By.xpath("//td//input"));
		for (int i = 0; i < rowData.size(); i++) {
			WebElement webElement = rowData.get(i);
			String attribute = webElement.getAttribute("value");
			if (attribute.equals(AdacitinBookHotel.printInvoice)) {
				WebElement selectOrder = driver.findElement(By.xpath("//input[@value='"+attribute+"']//parent::td//preceding-sibling::td"));
				selectOrder.click();
				WebElement cancelOrder = driver.findElement(By.xpath("//input[@value='Cancel "+attribute+"']//parent::td"));
				cancelOrder.click();
				driver.switchTo().alert().accept();
				break;

			}
		}
	}
	public void cancelBooking_byGivenID(String orderId) {
		getBtnBookingItenary().click();
		WebElement table = driver.findElement(By.xpath("//table[@cellspacing='1']"));
		List<WebElement> rowData = table.findElements(By.xpath("//td//input"));
		for (int i = 0; i < rowData.size(); i++) {
			WebElement webElement = rowData.get(i);
			String attribute = webElement.getAttribute("value");
			if (attribute.equals(orderId)) {
				WebElement selectOrder = driver.findElement(By.xpath("//input[@value='"+attribute+"']//parent::td//preceding-sibling::td"));
				selectOrder.click();
				WebElement cancelOrder = driver.findElement(By.xpath("//input[@value='Cancel "+attribute+"']//parent::td"));
				cancelOrder.click();
				driver.switchTo().alert().accept();
				break;
			}
			}
		}

		public void assert_Verification_For_BookingCancel(String assertCheck) {
			driver.manage().timeouts().implicitlyWait(7000, TimeUnit.SECONDS);
			String assertCancel = getAssertCanBookConfirm().getText();
			boolean contains = assertCancel.contains(assertCheck);
			Assert.assertEquals(true, contains);
		}
		
}
