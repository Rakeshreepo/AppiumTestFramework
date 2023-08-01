package com.TestCases;

import java.util.concurrent.TimeUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.CommonFunction.commonFunction;
import com.PageObject.TC002_AddExpenssPage;
import com.TestData.TC002_TestData;

public class TC002_AddExpenes extends baseClass {
	
	@Test
	public void TC002_HomePage()
	{
		try {
			TC002_AddExpenssPage objHomePage = new TC002_AddExpenssPage(driver);
			
			driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
			
			commonFunction.click(objHomePage.clickAdd);
			
			commonFunction.enterText(objHomePage.enterReceiver, TC002_TestData.getReceiverL());
			
			commonFunction.click(objHomePage.selectRecevier);
			
			commonFunction.clear(objHomePage.clearAmount);
			
			commonFunction.enterText(objHomePage.enterAmount, TC002_TestData.enterAmount());
			
			commonFunction.click(objHomePage.clickDropDown);
			
			commonFunction.click(objHomePage.clickFromDropDownList);
			
			commonFunction.click(objHomePage.clickSave);
			
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			commonFunction.click(objHomePage.clickNext);
			
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
			commonFunction.click(objHomePage.allowLocation);

            }catch (Exception e) {
				
            	System.out.println(e.getMessage());
            	Assert.fail();
			}
	}
	
}
