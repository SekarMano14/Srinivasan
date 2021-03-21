package org.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Employee2 {
	
	@Test
	private void test() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\ManoKutty\\eclipse-workspace\\TestNG\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

	}
	

	
	
	
	
	
		
		
		

	
}
