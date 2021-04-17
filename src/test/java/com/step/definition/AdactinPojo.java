package com.step.definition;

import com.test.baseclass.LibGlobal;
import com.test.pom.AdactinBookHotel;
import com.test.pom.AdactinLogin;
import com.test.pom.AdactinSearchHotel;
import com.test.pom.AdactionPrintInvoice;
import com.test.pom.AdactinSelectHotel;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class AdactinPojo extends LibGlobal {
	

@Given("Lanch ur for Adactin with ChromeBrowser")
public void lanch_ur_for_Adactin_with_ChromeBrowser() {
	getdriver();
	launchUrl("http://adactinhotelapp.com/");

}

@When("give Login details are {string} and {string}")
public void give_Login_details_are_and(String username, String password) {
AdactinLogin login =new AdactinLogin();
login.login(username, password);
}

@When("user has given hotel booking details then book {string}, {string},{string},{string},{string},{string},{string} and {string}")
public void user_has_given_hotel_booking_details_then_book_and(String location, String hotelname, String roomtype, String roomno, String checkindate, String checkoutdate, String adultroom, String childroom) {
    AdactinSearchHotel  hotelsearch=new AdactinSearchHotel();
    hotelsearch.SearchHotel(location, hotelname, roomtype, roomno, checkindate, checkoutdate, adultroom, childroom);
}

@When("select radio & continue button")
public void select_radio_continue_button() {
 AdactinSelectHotel se=new AdactinSelectHotel();
se.selectHotel();
}

@When("to enter credit card details and address of customers enter {string},{string},{string},{string},{string},{string}{string} and {string}")
public void to_enter_credit_card_details_and_address_of_customers_enter_and(String firstname, String lastname, String address, String cardnumber, String cardtype, String expmonth, String expYear, String cvv) {
	AdactinBookHotel abook=new AdactinBookHotel();
	abook.bookHotel(firstname, lastname, address, cardnumber, cardtype, expmonth, expYear, cvv);
}

@When("I get PO of Adactin")
public void i_get_PO_of_Adactin() {
AdactionPrintInvoice po=new AdactionPrintInvoice();
po.printInvoice();
}


}
