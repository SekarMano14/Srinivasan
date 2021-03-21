package org.main;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.base.BaseClass;
import org.locators.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

public class Fcaebook extends BaseClass {
	public static void main(String[] args) throws AWTException {
		getChromeBowser();
		loadUrl("https://www.facebook.com/");
		LoginPage lpage = new LoginPage();
		fill(lpage.getTxtUsername(), "java");

		Actions a = new Actions(driver);

		a.doubleClick(lpage.getTxtUsername()).perform();

		

		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);
		
		
		a.click(lpage.getTxtPassword()).perform();

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		// fill(lpage.getTxtPassword(), "34567");
		// btnClick(lpage.getBtnLogin());

	}

}
