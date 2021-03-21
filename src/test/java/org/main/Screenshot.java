package org.main;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.base.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Screenshot extends BaseClass {
	public static void main(String[] args) throws IOException {
		getChromeBowser();
		loadUrl("https://www.facebook.com/");
		
		screenShot("newfb");
		
	}

}
