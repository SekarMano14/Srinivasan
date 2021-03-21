package org.base;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	public static WebDriver driver;

	public static void getChromeBowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ManoKutty\\eclipse-workspace\\TestNG\\Drivers\\chromedriver.exe");

		driver = new ChromeDriver();

	}

	public static void loadUrl(String url) {
		driver.get(url);
	}


	public static void fill(WebElement element, String value) {
		element.sendKeys(value);

	}

	public static void btnClick(WebElement element) {
		element.click();

	}

	public static String getUrl() {
		String url = driver.getCurrentUrl();
		return url;

	}

	public static String getAttribute(WebElement element) {
		String at = element.getAttribute("value");
		return at;

	}

	public static String getText(WebElement element) {
		String text = element.getText();
		return text;

	}

	public static void moveToElement(WebElement element) {
		Actions ac = new Actions(driver);
		ac.moveToElement(element).perform();

	}

	public static void dragAndDrop(WebElement e1, WebElement e2) {
		Actions ac = new Actions(driver);
		ac.dragAndDrop(e1, e2).perform();

	}
	
	
	public static void SBI(WebElement element,int index) {
		Select s= new Select(element);
		s.selectByIndex(index);
	}
	
	public static void scrollDown(WebElement e) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView('true')", e);

	}
	
	public static void scrollUp(WebElement e) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView('false')", e);

	}
	
	
	public static void screenShot(String name) {
		TakesScreenshot tk= (TakesScreenshot)driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File des= new File("C:\\Users\\ManoKutty\\eclipse-workspace\\TestNG\\src\\test\\resources\\ScreenShot\\"+name+".png");
		
		try {
			FileUtils.copyFile(src, des);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	
}
