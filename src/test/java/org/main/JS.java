package org.main;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.base.BaseClass;
import org.locators.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

public class JS extends BaseClass {
	public static void main(String[] args) throws InterruptedException {
		getChromeBowser();
		loadUrl("https://www.facebook.com/");

		WebElement txtUsername = driver.findElement(By.id("email"));
		JavascriptExecutor js = (JavascriptExecutor) driver; // int a=(int)l;

		js.executeScript("arguments[0].setAttribute('value','mano')", txtUsername);

		WebElement txtPassword = driver.findElement(By.id("pass"));
		js.executeScript("arguments[0].setAttribute('value','345678')", txtPassword);

		// GetAttribute
		Object ob = js.executeScript("return arguments[0].getAttribute('value')", txtUsername);

		String s = (String) ob;
		System.out.println(s);

		// ScrollDown
		WebElement create = driver.findElement(By.xpath("//a[text()='Create a Page']"));
		 js.executeScript("arguments[0].scrollIntoView('true')",create);
//		scrollDown(create);

		Thread.sleep(5000);

		// scrollup
		WebElement password = driver.findElement(By.id("pass"));
		// js.executeScript("arguments[0].scrollIntoView('false')",password);
//		scrollUp(password);

		// click
		WebElement btnLogin = driver.findElement(By.id("loginbutton"));
		js.executeScript("arguments[0].click()", btnLogin);

	}

}
