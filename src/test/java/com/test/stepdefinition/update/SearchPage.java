package com.test.stepdefinition.update;

import org.test.pom.update.AdacitinBookHotel;
import org.test.pom.update.AdacitinCancelBooking;
import org.test.pom.update.AdacitinLogin;
import org.test.pom.update.AdacitinSearchHotel;
import org.test.pom.update.AdacitinSelectHotel;

import com.test.baseclass.LibGlobal;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class SearchPage extends LibGlobal {

	@Given("Lanuch Adactin Page")
	public void lanuch_Adactin_Page() {
		getdriver();
		launchUrl("http://adactinhotelapp.com/");

	}

	@When("Give valid login {string} and {string}")
	public void give_valid_login_and(String username, String password) {
		AdacitinLogin login = new AdacitinLogin();
		login.login(username, password);

	}

	@When("To Enter the hotel details then clicks search {string}, {string},{string},{string},{string},{string},{string} and {string}")
	public void to_Enter_the_hotel_details_then_clicks_search_and(String location, String hotelname, String roomtype,
			String roomno, String checkindate, String checkoutdate, String adultroom, String childroom) {
		AdacitinSearchHotel search_Hotel = new AdacitinSearchHotel();
		search_Hotel.searchHotel_WithFilling_allField(location, hotelname, roomtype, roomno, checkindate, checkoutdate,
				adultroom, childroom);
	}

	@When("To fill search hotel mandatory fields then clicks search  {string},{string},{string},{string},{string}")
	public void to_fill_search_hotel_mandatory_fields_then_clicks_search(String location, String roomno,
			String checkindate, String checkoutdate, String adultroom) {
		AdacitinSearchHotel search_Hotel = new AdacitinSearchHotel();
		search_Hotel.searchHotel_WithFilling_mandatoryField(location, roomno, checkindate, checkoutdate, adultroom);

	}

	@When("To fill search hotel mandatory fields and pass invalid checkout dates  then click continue  {string},{string},{string},{string},{string}")
	public void to_fill_search_hotel_mandatory_fields_and_pass_invalid_checkout_dates_then_click_continue(
			String location, String roomno, String checkindate, String checkoutdate, String adultroom) {
		AdacitinSearchHotel search_Hotel = new AdacitinSearchHotel();
		search_Hotel.searchHotel_withInvalidCheckoutDate(location, roomno, checkindate, checkoutdate, adultroom);
	}

	@When("clik continue without filling textboxes")
	public void clik_continue_without_filling_textboxes() {
		AdacitinSearchHotel search_Hotel = new AdacitinSearchHotel();
		search_Hotel.searchHotel_WithoutFilling_mandatoryField();
	}

	@When("verify and validation of Search page function with All field enter {string} text")
	public void verify_and_validation_of_Search_page_function_with_All_field_enter_text(String assertCheck) {
		AdacitinSearchHotel search_Hotel = new AdacitinSearchHotel();
		search_Hotel.assert_Verification_WithFilling_allField(assertCheck);
	}

	@When("verify and validation of Search page function with mandatory field enter  {string} text")
	public void verify_and_validation_of_Search_page_function_with_mandatory_field_enter_text(String assertCheck) {
		AdacitinSearchHotel search_Hotel = new AdacitinSearchHotel();
		search_Hotel.assert_Verification_mandatoryField(assertCheck);

	}

	@When("verify and validation of Search page function for invalid checkoutdate  {string} text")
	public void verify_and_validation_of_Search_page_function_for_invalid_checkoutdate_text(String assertCheck) {
		AdacitinSearchHotel search_Hotel = new AdacitinSearchHotel();
		search_Hotel.assert_Verification_WithOutFillingCheckOutDateBox(assertCheck);
	}

	@When("verify and validation of Search page function without entering FieldTextBox  by  {string} text")
	public void verify_and_validation_of_Search_page_function_without_entering_FieldTextBox_by_text(
			String assertCheck) {
		AdacitinSearchHotel search_Hotel = new AdacitinSearchHotel();
		search_Hotel.assert_Verification_WithOutFillingAllFields(assertCheck);
	}

	@When("Selection Page Click select and continue")
	public void selection_Page_Click_select_and_continue() {
		AdacitinSelectHotel select = new AdacitinSelectHotel();
		select.selectHotel();
	}

	@When("To enter credit card details and address of customers enter {string},{string},{string}")
	public void to_enter_credit_card_details_and_address_of_customers_enter(String firstname, String lastname,
			String address, io.cucumber.datatable.DataTable dataTable) {
		AdacitinBookHotel book = new AdacitinBookHotel();
		book.bookHotel_withFiling_allFields(firstname, lastname, address, dataTable);
	}

	@When("After Booking Confirmed by current url {string} assertion validation")
	public void after_Booking_Confirmed_by_current_url_assertion_validation(String assertCheck) {
		AdacitinBookHotel book = new AdacitinBookHotel();

		book.assert_Verification_for_Booking_Confirmation(assertCheck);
	}

	@When("To fill the booking page without entering card number  {string},{string},{string}")
	public void to_fill_the_booking_page_without_entering_card_number(String firstname, String lastname, String address,
			io.cucumber.datatable.DataTable dataTable) {
		AdacitinBookHotel book = new AdacitinBookHotel();
		book.bookHotel_without_enteringCardNo(firstname, lastname, address, dataTable);

	}

	@When("Verify validation of CardNumber not Enter error message {string} assertion validation")
	public void verify_validation_of_CardNumber_not_Enter_error_message_assertion_validation(String assertCheck) {
		AdacitinBookHotel book = new AdacitinBookHotel();
		book.assert_Verification_Credit_CardNo_notEnter(assertCheck);
	}

	@When("Cancel same  last Booked order id")
	public void cancel_same_last_Booked_order_id() {
		AdacitinCancelBooking cancel = new AdacitinCancelBooking();
		cancel.cancelBooking_SameBookedId();
	}

	@When("Go Booked Itenary tab and Pass {string} then  Select radio button and Click CancelOrderID button")
	public void go_Booked_Itenary_tab_and_Pass_then_Select_radio_button_and_Click_CancelOrderID_button(String orderId) {
		AdacitinCancelBooking cancel = new AdacitinCancelBooking();
		cancel.cancelBooking_byGivenID(orderId);
	}
	@When("Verify status Order if presense or not  {string}")
	public void verify_status_Order_if_presense_or_not(String assertCheck) {
	    AdacitinCancelBooking cancel=new AdacitinCancelBooking();
	    cancel.assert_Verification_For_BookingCancel(assertCheck);
	}

}
