package org.testng;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Sample {
	static WebDriver driver;

	@BeforeClass
	private void beforeClass() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ManoKutty\\eclipse-workspace\\TestNG\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("Before class");

	}

	@AfterClass
	private void afterClass() {
		driver.quit();
		System.out.println("After class");
		
	}

	@BeforeMethod
	private void beforeMethd() {
		Date d = new Date();
		System.out.println("Start time: " + d);
		System.out.println("Before method");

	}

	@AfterMethod
	private void afterMethod() {
		Date d = new Date();
		System.out.println("end time: " + d);
		System.out.println("After method");

	}

	@Test(dataProvider="data", dataProviderClass=Employee.class)
	private void test1(String s1, String s2, String s3, String s4) {
		driver.get("https:\\www.facebook.com/");
		WebElement txtUserName = driver.findElement(By.id("email"));
		txtUserName.sendKeys(s1);

		WebElement txtPassword = driver.findElement(By.id("pass"));
		txtPassword.sendKeys(s2);
		
		WebElement fname = driver.findElement(By.name("firstname"));
		fname.sendKeys(s3);

		WebElement lname = driver.findElement(By.name("lastname"));
		lname.sendKeys(s4);
		
//		WebElement btnLogin = driver.findElement(By.id("loginbutton"));
//		btnLogin.click();

	}
	
	

	@Test(enabled = false)
	private void test2() {
		driver.get("https:\\www.facebook.com/");

		WebElement txtUserName = driver.findElement(By.id("email"));
		txtUserName.sendKeys("kumar");
		String at = txtUserName.getAttribute("value");

		// Soft Assert
		SoftAssert s = new SoftAssert();
		s.assertTrue(at.equals("kum"), "Verify username");

		WebElement txtPassword = driver.findElement(By.id("pass"));
		txtPassword.sendKeys("23456");
		String pass = txtPassword.getAttribute("value");
		s.assertEquals("23456", pass, "verify password");

		WebElement btnLogin = driver.findElement(By.id("loginbutton"));
		btnLogin.click();
		System.out.println("test2");
		// highlight the failed testcase
		s.assertAll();

	}

}
