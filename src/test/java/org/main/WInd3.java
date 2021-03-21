package org.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WInd3 extends BaseClass{
	public static void main(String[] args) {
		getChromeBowser();
		loadUrl("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		
		WebElement closeLogin = driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		closeLogin.click();
		
		WebElement serachBar = driver.findElement(By.name("q"));
		serachBar.sendKeys("iphone");
		
		WebElement btnSearch = driver.findElement(By.xpath("//button[@type='submit']"));
		btnSearch.click();
		
		
		
		WebElement iphone = driver.findElement(By.xpath("//a[text()='Apple iPhone 7 (Black, 32 GB)']"));
		iphone.click();
		
		String parId = driver.getWindowHandle();
		System.out.println(parId);
		
		Set<String> allId = driver.getWindowHandles();
		int count =1;
		for (String x : allId) {
			if(count==2) {
				driver.switchTo().window(x);
				
			}
			count++;
		}
		
		
		
		WebElement add = driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']"));
		add.click();
		
		
	}
	

}
