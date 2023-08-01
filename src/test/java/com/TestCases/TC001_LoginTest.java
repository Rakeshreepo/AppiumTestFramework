package com.TestCases;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.CommonFunction.commonFunction;
import com.PageObject.TC001_LoginPage;

public class TC001_LoginTest extends baseClass {
	
	@Test
	public void TC001_TestCase()
	{
		try {			
			TC001_LoginPage objPageLogin = new TC001_LoginPage(driver);
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			Assert.assertEquals(commonFunction.getText(objPageLogin.getUserNameText), "rakeshvishwakarma1185");
			
	}
		catch (Exception e) {
			System.out.println(e.getMessage());
			Assert.fail();
		}
}
}
