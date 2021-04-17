package org.test.pom.update;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.baseclass.LibGlobal;

public class AdacitinSearchHotel extends LibGlobal {
	public AdacitinSearchHotel() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "location")
	WebElement location;
	@FindBy(name = "hotels")
	WebElement hotel;
	@FindBy(name = "room_type")
	WebElement room_type;
	@FindBy(name = "room_nos")
	WebElement room_nos;
	@FindBy(name = "adult_room")
	WebElement adult_room;
	@FindBy(name = "child_room")
	WebElement child_room;
	@FindBy(name = "datepick_in")
	WebElement datepick_in;
	@FindBy(name = "datepick_out")
	WebElement datepick_out;
	@FindBy(name = "Submit")
	WebElement Submit;
	@FindBy(xpath = "//span[text()='Please Select a Location']")
	WebElement txtLocationAssert;
	@FindBy(xpath = "//span[text()='Check-Out Date shall be after than Check-In Date']")
	WebElement txtCheckOutDateAssert;

	public WebElement getLocation() {
		return location;
	}

	public WebElement getTxtLocationAssert() {
		return txtLocationAssert;
	}

	public WebElement getTxtCheckOutDateAssert() {
		return txtCheckOutDateAssert;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoom_type() {
		return room_type;
	}

	public WebElement getSubmit() {
		return Submit;
	}

	public WebElement getRoom_nos() {
		return room_nos;
	}

	public WebElement getAdult_room() {
		return adult_room;
	}

	public WebElement getChild_room() {
		return child_room;
	}

	public WebElement getDatepick_in() {
		return datepick_in;
	}

	public WebElement getDatepick_out() {
		return datepick_out;
	}

	public void searchHotel_WithFilling_mandatoryField(String location, String roomno, String checkindate,
			String checkoutdate, String adultroom) {
		selectOptionbyText(getLocation(), location);
		selectOptionbyText(getRoom_nos(), roomno);
		getDatepick_in().clear();
		getDatepick_out().clear();
		enterText(getDatepick_in(), checkindate);
		enterText(getDatepick_out(), checkoutdate);
		selectOptionbyText(getAdult_room(), adultroom);
		click(getSubmit());
	}

	public void searchHotel_WithFilling_allField(String location, String hotelname, String roomtype, String roomno,
			String checkindate, String checkoutdate, String adultroom, String childroom) {
		selectOptionbyText(getHotel(), hotelname);
		selectOptionbyText(getRoom_type(), roomtype);
		selectOptionbyText(getChild_room(), childroom);
		searchHotel_WithFilling_mandatoryField(location, roomno, checkindate, checkoutdate, adultroom);
	}

	public void searchHotel_withInvalidCheckoutDate(String location, String roomno, String checkindate,
			String checkoutdate, String adultroom) {
		searchHotel_WithFilling_mandatoryField(location, roomno, checkindate, checkoutdate, adultroom);
	}

	public void searchHotel_WithoutFilling_mandatoryField() {

		click(getSubmit());
	}

	public void assert_Verification_WithFilling_allField(String assertCheck) {
		driver.manage().timeouts().implicitlyWait(7000, TimeUnit.SECONDS);
		String select_hotel_From_UrlCheck = driver.getCurrentUrl();
		boolean contains = select_hotel_From_UrlCheck.contains(assertCheck);
		Assert.assertEquals(true, contains);
	}

	public void assert_Verification_mandatoryField(String assertCheck) {
		driver.manage().timeouts().implicitlyWait(7000, TimeUnit.SECONDS);
		String select_hotel_From_UrlCheck = driver.getCurrentUrl();
		boolean contains = select_hotel_From_UrlCheck.contains(assertCheck);
		Assert.assertEquals(true, contains);
	}
	public void assert_Verification_WithOutFillingCheckOutDateBox(String assertCheck) {
		driver.manage().timeouts().implicitlyWait(7000, TimeUnit.SECONDS);
		String WithOutFillingCheckOutDateBox = getTxtCheckOutDateAssert().getText();
		boolean contains = WithOutFillingCheckOutDateBox.contains(assertCheck);
		Assert.assertEquals(true, contains);
	}
	public void assert_Verification_WithOutFillingAllFields(String assertCheck) {
		driver.manage().timeouts().implicitlyWait(7000, TimeUnit.SECONDS);
		String WithOutFillingAllFields = getTxtLocationAssert().getText();
		boolean contains = WithOutFillingAllFields.contains(assertCheck);
		Assert.assertEquals(true, contains);
	}
}
