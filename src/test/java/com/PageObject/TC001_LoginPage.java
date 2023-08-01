package com.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class TC001_LoginPage {
	
	AppiumDriver driver;
	public TC001_LoginPage(AppiumDriver driver)
	{
		this.driver=driver;	
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	public @FindBy(id="com.dayspringtech.envelopes:id/login") WebElement clickLogin;
	
	public @FindBy(id="com.dayspringtech.envelopes:id/login_household_name") WebElement enterUserName;
	
	public @FindBy(id="com.dayspringtech.envelopes:id/login_password") WebElement enterPassword;
	
	public @FindBy(id="com.dayspringtech.envelopes:id/login_button") WebElement clickLoginbtn;
	
	public @FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView") WebElement getUserNameText;

}
