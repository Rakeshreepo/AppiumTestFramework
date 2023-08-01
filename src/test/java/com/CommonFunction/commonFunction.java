package com.CommonFunction;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;

public class commonFunction {
		
		public static WebDriverWait wait;
		public static AppiumDriver driver;
		
		
		public static void enterText(WebElement locaElement, String value)
		{
			locaElement.sendKeys(value);

		}
		
		public static void click(WebElement locaElement) {
			locaElement.click();

		}
		
		public static void clear(WebElement locaElement) {
			locaElement.clear();

		}
		
		public static String getText(WebElement locaElement) {
			return locaElement.getText();

		}
		
		@SuppressWarnings("deprecation")
		public static void implictyWait() {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}

}
