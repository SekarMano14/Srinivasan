package org.testng;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelExecution {
	static WebDriver driver;
	
	@Parameters({"Browser"})
	@BeforeClass
	private void browserlaunch(String s) {
		if(s.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\ManoKutty\\eclipse-workspace\\TestNG\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		else if(s.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\ManoKutty\\eclipse-workspace\\TestNG\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(s.equals("IE")) {
			System.setProperty("webdriver.ie.driver",
					"C:\\Users\\ManoKutty\\eclipse-workspace\\TestNG\\Drivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		else {
			System.out.println("Invalid browser name");
		}

	}
	
	
	@AfterClass
	private void browserClose() {
		driver.quit();

	}
	@BeforeMethod
	private void beforeMethd() {
		Date d = new Date();
		System.out.println("Start time: " + d);

	}

	@AfterMethod
	private void afterMethod() {
		Date d = new Date();
		System.out.println("end time: " + d);
	}
	
	
	@Test
	private void test11() {
		driver.get("https://www.facebook.com/");
		WebElement txtUserName = driver.findElement(By.id("email"));
		txtUserName.sendKeys("mk");

		WebElement txtPassword = driver.findElement(By.id("pass"));
		txtPassword.sendKeys("sk");
		
		WebElement fname = driver.findElement(By.name("firstname"));
		fname.sendKeys("mano");

		WebElement lname = driver.findElement(By.name("lastname"));
		lname.sendKeys("kumar");

	}
	
	

}
