package com.test.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.test.baseclass.LibGlobal;

public class AdactinSelectHotel extends LibGlobal{
	public AdactinSelectHotel() {
PageFactory.initElements(driver, this);	
}

@FindBy(name="radiobutton_0")
WebElement radioButton;
@FindBy(name="continue")
WebElement continue1;
public WebElement getRadioButton() {
	return radioButton;
}
public WebElement getContinue1() {
	return continue1;
}
public void selectHotel() {
click(getRadioButton());
click(getContinue1());
}
}
