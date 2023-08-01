package com.TestCases;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeSuite;

import com.CommonFunction.commonFunction;
import com.PageObject.TC001_LoginPage;
import com.TestData.TC001_TestData;

import io.appium.java_client.AppiumDriver;

public class baseClass {
	
	public static AppiumDriver driver;
	
	@BeforeSuite
	public void setup() throws MalformedURLException
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("deviceName", "Redmi 9");
		cap.setCapability("udid", "VWUKSK5TUOAYKRYT");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "11.0");
		cap.setCapability("appPackage", "com.dayspringtech.envelopes");
		cap.setCapability("appActivity", "com.dayspringtech.envelopes.MainScreenActivity");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver(url,cap);
		
		TC001_LoginPage objPageLogin = new TC001_LoginPage(driver);
		
		commonFunction.click(objPageLogin.clickLogin);
		
		commonFunction.enterText(objPageLogin.enterUserName, TC001_TestData.getUserName());
		
		commonFunction.enterText(objPageLogin.enterPassword, TC001_TestData.getPassword());
		
		commonFunction.click(objPageLogin.clickLoginbtn);
		
	}
	
//	@AfterSuite
//   public void tearDown() {
//	   driver.close();
//   }

}
