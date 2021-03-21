package org.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Debug {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\ManoKutty\\eclipse-workspace\\Selenium 6PM Batch\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("https://mail.google.com/");
		
		WebElement username = driver.findElement(By.id("identifierId"));
		username.sendKeys("manojsekar4613@gmail.com");
		
		WebElement next = driver.findElement(By.xpath("//span[text()='Next']"));
		next.click();
		
		Thread.sleep(5000);
		WebElement password = driver.findElement(By.name("p`assword"));
		password.sendKeys("1234567890");
		
		WebElement next1 = driver.findElement(By.xpath("//span[text()='Next']"));
		next1.click();
		
		
		
	}

}
