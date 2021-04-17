package org.test.pom.update;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.test.baseclass.LibGlobal;

public class AdacitinSelectHotel extends LibGlobal{
	public AdacitinSelectHotel() {
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
