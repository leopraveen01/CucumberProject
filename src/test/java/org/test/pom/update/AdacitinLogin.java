package org.test.pom.update;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.baseclass.LibGlobal;

public class AdacitinLogin extends LibGlobal{
	public  AdacitinLogin() {
PageFactory.initElements(driver, this);
}
	@FindBy(id="username")
	private WebElement txtUSerNAme;
	@FindBy(name="password")
	private WebElement txtPass;
	@FindBy(xpath="//input[@name='login']")
	private WebElement login;
//	@FindBys({@findby(name=""),xpath=""})
	public WebElement getTxtUSerNAme() {
		return txtUSerNAme;
	}
	public WebElement getTxtPass() {
		return txtPass;
	}
	public WebElement getLogin() {
		return login;
	}

	public void login(String username,String password) {
		enterText(getTxtUSerNAme(), username);
		enterText(getTxtPass(), password);
		click(getLogin());
	}
}
