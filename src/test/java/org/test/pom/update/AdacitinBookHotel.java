package org.test.pom.update;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.test.baseclass.LibGlobal;

public class AdacitinBookHotel extends LibGlobal {
	public static  String printInvoice;
	public AdacitinBookHotel() {
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirst_name() {
		return first_name;
	}

	public WebElement getLast_name() {
		return last_name;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCc_num() {
		return cc_num;
	}

	public WebElement getCc_type() {
		return cc_type;
	}

	public WebElement getCc_exp_month() {
		return cc_exp_month;
	}

	public WebElement getCc_exp_year() {
		return cc_exp_year;
	}

	public WebElement getCc_cvv() {
		return cc_cvv;
	}

	@FindBy(name = "first_name")
	private WebElement first_name;
	@FindBy(name = "last_name")
	private WebElement last_name;
	@FindBy(name = "address")
	private WebElement address;
	@FindBy(name = "cc_num")
	private WebElement cc_num;
	@FindBy(name = "cc_type")
	private WebElement cc_type;
	@FindBy(name = "cc_exp_month")
	WebElement cc_exp_month;
	@FindBy(name = "cc_exp_year")
	WebElement cc_exp_year;
	@FindBy(name = "cc_cvv")
	WebElement cc_cvv;
	@FindBy(xpath = "//label[text()='Please Enter your 16 Digit Credit Card Number']")
	WebElement txtCreditCardFails;
	@FindBy(name = "book_now")
	WebElement book_now;

	public WebElement getBook_now() {
		return book_now;
	}

	public WebElement getTxtCreditCardFails() {
		return txtCreditCardFails;
	}

	public void bookHotel_withFiling_allFields(String firstname, String lastname, String address,
			io.cucumber.datatable.DataTable datatable) {
		enterText(getFirst_name(), firstname);
		enterText(getLast_name(), lastname);
		enterText(getAddress(), address);
		List<Map<String, String>> asMaps3 = datatable.asMaps();
		Map<String, String> map = asMaps3.get(0);
		String cc_num = map.get("CreditCard_No");
		String cc_type = map.get("Credit_Card_Type");
		String cc_exp_month = map.get("ExpiryMonth");
		String cc_exp_year = map.get("ExpiryYear");
		String cc_cvv = map.get("CVV_Number");
		WebElement txtCredNo = driver.findElement(By.id("cc_num"));
		WebElement selCredtype = driver.findElement(By.id("cc_type"));
		WebElement selExpmon = driver.findElement(By.id("cc_exp_month"));
		WebElement selYear = driver.findElement(By.id("cc_exp_year"));
		WebElement selCvv = driver.findElement(By.id("cc_cvv"));
		txtCredNo.sendKeys(cc_num);
		Select selCred = new Select(selCredtype);
		Select selExpmon1 = new Select(selExpmon);
		Select selExpyear = new Select(selYear);
		selCred.selectByVisibleText(cc_type);
		selExpmon1.selectByVisibleText(cc_exp_month);
		selExpyear.selectByVisibleText(cc_exp_year);
		selCvv.sendKeys(cc_cvv);
		getBook_now().click();

	}

	public void bookHotel_without_enteringCardNo(String firstname, String lastname, String address,
			io.cucumber.datatable.DataTable datatable) {
		enterText(getFirst_name(), firstname);
		enterText(getLast_name(), lastname);
		enterText(getAddress(), address);
		List<Map<String, String>> asMaps3 = datatable.asMaps();
		Map<String, String> map = asMaps3.get(0);
		String cc_type = map.get("Credit_Card_Type");
		String cc_exp_month = map.get("ExpiryMonth");
		String cc_exp_year = map.get("ExpiryYear");
		String cc_cvv = map.get("CVV_Number");
		WebElement selCredtype = driver.findElement(By.id("cc_type"));
		WebElement selExpmon = driver.findElement(By.id("cc_exp_month"));
		WebElement selYear = driver.findElement(By.id("cc_exp_year"));
		WebElement selCvv = driver.findElement(By.id("cc_cvv"));
		Select selCred = new Select(selCredtype);
		Select selExpmon1 = new Select(selExpmon);
		Select selExpyear = new Select(selYear);
		selCred.selectByVisibleText(cc_type);
		selExpmon1.selectByVisibleText(cc_exp_month);
		selExpyear.selectByVisibleText(cc_exp_year);
		selCvv.sendKeys(cc_cvv);
		getBook_now().click();
	}
	public void assert_Verification_for_Booking_Confirmation(String assertCheck) {
		driver.manage().timeouts().implicitlyWait(8000, TimeUnit.SECONDS);
		AdacitionPrintInvoice print=new AdacitionPrintInvoice();
		printInvoice = print.printInvoice();
		String select_Verification_for_Booking_Confirmation = driver.getCurrentUrl();
		boolean contains = select_Verification_for_Booking_Confirmation.contains(assertCheck);
		Assert.assertEquals(true, contains);
	}

	public void assert_Verification_Credit_CardNo_notEnter(String assertCheck) {
		driver.manage().timeouts().implicitlyWait(7000, TimeUnit.SECONDS);
		String CreditCardFails = getTxtCreditCardFails().getText();
		boolean contains = CreditCardFails.contains(assertCheck);
		Assert.assertEquals(true, contains);
	}
}
