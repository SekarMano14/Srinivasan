package org.testng;

import org.base.BaseClass;
import org.locators.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example extends BaseClass {
	public static void main(String[] args) {
		getChromeBowser();
		loadUrl("https://www.facebook.com/");
		LoginPage l = new LoginPage();
		fill(l.getTxtUsername(), "manoj");

		fill(l.getTxtPassword(), "34567");

		btnClick(l.getBtnLogin());
	}

}
