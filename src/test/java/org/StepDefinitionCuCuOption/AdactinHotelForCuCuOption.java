package org.StepDefinitionCuCuOption;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinHotelForCuCuOption {
	private static int n = 0;
	public static WebDriver driver;

	@Given("we have enter username and password for login")
	public void we_have_enter_username_and_password_for_login() {
     	WebDriverManager.chromedriver().setup();
    	driver=new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("http://adactinhotelapp.com/index.php");
	}

	@When("click login {string} and {string}")
	public void click_login_and(String string, String string2) {
		WebDriverWait w=new WebDriverWait(driver, 5);
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("username")));
//		driver.manage().timeouts().implicitlyWait(6000, TimeUnit.SECONDS);
		WebElement txtUserName = driver.findElement(By.id("username"));
		WebElement txtPass = driver.findElement(By.name("password"));
		WebElement txtLogin = driver.findElement(By.name("login"));
		txtUserName.sendKeys(string);
		txtPass.sendKeys(string2);
		txtLogin.click();
	}

	@When("Enter room deatails and book")
	public void enter_room_deatails_and_book(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> asMaps2 = dataTable.asMaps();
		Map<String, String> map = asMaps2.get(n);
		String location = map.get("Location");
		String hotels = map.get("Hotel");
		String room_type = map.get("Room Type");
		String room_nos = map.get("Number of Rooms");
		String datepick_in = map.get("Check In Date");
		String datepick_out = map.get("Check Out Date");
		String adult_room = map.get("Adults per Room");
		String child_room = map.get("Children per Room");

		WebElement txtLoc = driver.findElement(By.name("location"));
		WebElement txtHot = driver.findElement(By.name("hotels"));
		WebElement txtRoom = driver.findElement(By.name("room_type"));
		WebElement txtRoomNo = driver.findElement(By.name("room_nos"));
		Select seLoc = new Select(txtLoc);
		Select seHot = new Select(txtHot);
		Select seRoom = new Select(txtRoom);
		Select seRoomNo = new Select(txtRoomNo);
		seLoc.selectByVisibleText(location);
		seHot.selectByVisibleText(hotels);
		seRoom.selectByVisibleText(room_type);
		seRoomNo.selectByVisibleText(room_nos);
		WebElement checkIn = driver.findElement(By.id("datepick_in"));
		WebElement checkout = driver.findElement(By.id("datepick_out"));
		WebElement adultPerRoom = driver.findElement(By.id("adult_room"));
		WebElement childrenPerRoom = driver.findElement(By.id("child_room"));

		checkIn.sendKeys(datepick_in);
		checkout.sendKeys(datepick_out);
		Select seAdultRoom = new Select(adultPerRoom);
		Select sechilRoom = new Select(childrenPerRoom);
		seAdultRoom.selectByVisibleText(adult_room);
		sechilRoom.selectByVisibleText(child_room);
		WebElement clkSearch = driver.findElement(By.id("Submit"));
		clkSearch.click();
	}

	@When("select hotel verifivation form and click continue")
	public void select_hotel_verifivation_form_and_click_continue() {
		WebElement clkRadioBut = driver.findElement(By.id("radiobutton_0"));
		clkRadioBut.click();
		WebElement clkContinue = driver.findElement(By.id("continue"));
		clkContinue.click();
	}

	@When("fill the transaction details and card details")
	public void fill_the_transaction_details_and_card_details(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> asMaps3 = dataTable.asMaps();
		Map<String, String> map = asMaps3.get(n);
		String first_name = map.get("First_Name");
		String last_name = map.get("Last_Name");
		String address = map.get("BillingAddress");
		String cc_num = map.get("CreditCard_No");
		String cc_type = map.get("Credit_Card_Type");
		String cc_exp_month = map.get("ExpiryMonth");
		String cc_exp_year = map.get("ExpiryYear");
		String cc_cvv = map.get("CVV_Number");
		WebElement txtFname = driver.findElement(By.id("first_name"));
		WebElement txtLname = driver.findElement(By.id("last_name"));
		WebElement txtBillAdd = driver.findElement(By.id("address"));
		WebElement txtCredNo = driver.findElement(By.id("cc_num"));
		WebElement selCredtype = driver.findElement(By.id("cc_type"));
		WebElement selExpmon = driver.findElement(By.id("cc_exp_month"));
		WebElement selYear = driver.findElement(By.id("cc_exp_year"));
		WebElement selCvv = driver.findElement(By.id("cc_cvv"));
		txtFname.sendKeys(first_name);
		txtLname.sendKeys(last_name);
		txtBillAdd.sendKeys(address);
		txtCredNo.sendKeys(cc_num);
		Select selCred = new Select(selCredtype);
		Select selExpmon1 = new Select(selExpmon);
		Select selExpyear = new Select(selYear);
		selCred.selectByVisibleText(cc_type);
		selExpmon1.selectByVisibleText(cc_exp_month);
		selExpyear.selectByVisibleText(cc_exp_year);
		selCvv.sendKeys(cc_cvv);
	}

	@When("click continue")
	public void click_continue() {
		WebElement clkBook = driver.findElement(By.id("book_now"));
		clkBook.click();
	}

	@When("get PO number")
	public void get_PO_number() {
		driver.manage().timeouts().implicitlyWait(7000, TimeUnit.SECONDS);
		WebElement getOrderNo = driver.findElement(By.id("order_no"));
		String prntAtt = getOrderNo.getAttribute("value");
		System.out.println(prntAtt);
		n++;
	}
	
}
