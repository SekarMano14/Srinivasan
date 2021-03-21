package org.locators;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {
	
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	
	@CacheLookup
	@FindBys({ @FindBy(id = "email"), 
		      @FindBy(xpath = "//input[@type='email']") })

	private WebElement txtUsername;

	@FindAll({ @FindBy(id = "pass"), 
		       @FindBy(xpath = "//input[@type='pass']") })
	private WebElement txtPassword;

	@FindBy(id = "loginbutton")
	private WebElement btnLogin;

	public WebElement getTxtUsername() {
		return txtUsername;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

}
