package com.test.baseclass;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class LibGlobal {

	public static WebDriver driver;

	public WebDriver getdriver() {
//		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		return driver = new ChromeDriver();
	}

	public void launchUrl(String url) {
		driver.get(url);
		maxiMize();
		implicitlyWait();
	}
	public void samplegit() {
		// TODO Auto-generated method stub

	}

	public void enterText(WebElement element, String args) {
		if(isDisplayed(element)&& isEnabled(element)) 
		element.sendKeys(args);
	}

	public void click(WebElement element) {
		if(isDisplayed(element)&&isEnabled(element))
		element.click();
	}

	public boolean isDisplayed(WebElement element) {
		element.isDisplayed();
		return element.isDisplayed();
	}

	public boolean isEnabled(WebElement element) {
		element.isEnabled();
		return element.isEnabled();
	}

	public boolean isSelected(WebElement element) {
		return element.isSelected();
	}

	public void implicitlyWait() {
		driver.manage().timeouts().implicitlyWait(400, TimeUnit.SECONDS);
	}

	public void implicitlyWait(int sec) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
	}

	public void maxiMize() {
		driver.manage().window().maximize();
	}

	public void enterTextJs(WebElement element, String data) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','"+ data +"')", element);
	}

	public void clickJs(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
	}

	public String getText(WebElement element) {
		String text = element.getText();
		return text;
	}

	public String getAttribute(WebElement element) {

		return element.getAttribute("value");
	}

	public String getAttribute(WebElement element, String attname) {

		return element.getAttribute(attname);
	}

	public void selectOptionbyText(WebElement element, String text) {
		new Select(element).selectByVisibleText(text);
	}

	public void selectOptionbyIndex(WebElement element, int index) {
		new Select(element).selectByIndex(index);
	}
	public List<String> getAllOption(WebElement element ) {
Select se =new Select(element);
List<WebElement> options = se.getOptions();
List<String> li=new LinkedList<String>();

for (WebElement webElement : options) {
	String text = webElement.getText();
	li.add(text);
}
return li;
	}
}
