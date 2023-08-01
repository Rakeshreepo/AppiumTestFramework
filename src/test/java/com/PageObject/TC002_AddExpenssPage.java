package com.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class TC002_AddExpenssPage {
	
	AppiumDriver driver;
	public TC002_AddExpenssPage(AppiumDriver driver)
	{
		this.driver=driver;	
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
    public @FindBy(id="com.dayspringtech.envelopes:id/fab_add") WebElement clickAdd;
	
	public @FindBy(id="com.dayspringtech.envelopes:id/receiver") WebElement enterReceiver;
	
	public @FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[2]") WebElement selectRecevier;
	
	public @FindBy(id="com.dayspringtech.envelopes:id/amount") WebElement clearAmount;
	
	public @FindBy(id="com.dayspringtech.envelopes:id/amount") WebElement enterAmount;
	
	public @FindBy(id="com.dayspringtech.envelopes:id/envelope") WebElement clickDropDown;
	
	public @FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[3]") WebElement clickFromDropDownList;
	
	public @FindBy(id="com.dayspringtech.envelopes:id/menu_item_save") WebElement clickSave;
	
	public @FindBy(id="android:id/button1") WebElement clickNext;
	
	public @FindBy(id="com.android.permissioncontroller:id/permission_allow_foreground_only_button") WebElement allowLocation;


}
