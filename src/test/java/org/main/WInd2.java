package org.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WInd2 extends BaseClass{
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
		System.out.println(allId);
		
		List<String> li= new ArrayList<String>();
		li.addAll(allId);    
		
		
		
		driver.switchTo().window(li.get(1));
		
		
		
		WebElement add = driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']"));
		add.click();
		
		
		WebElement help = driver.findElement(By.xpath("(//a[@class='_2y0pv_'])[1]"));
		help.click();
		
		
		Set<String> all2Id = driver.getWindowHandles();  
		System.out.println(all2Id);  
		List<String> bn= new ArrayList<String>();
		bn.addAll(all2Id);   
		
		driver.switchTo().window(bn.get(2));
		
		
			
		
		
		
		WebElement view = driver.findElement(By.xpath("//span[text()='View More']"));
		view.click();
	}
	

}
