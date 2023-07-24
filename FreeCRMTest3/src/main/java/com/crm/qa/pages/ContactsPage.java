package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.crm.qa.base.TestBase;

public class ContactsPage extends TestBase {

	@FindBy(xpath = "//input[@class=\"_2IX_2- VJZDxU\"]")
	WebElement mobileNumber;
	
	@FindBy(xpath = "//button[@class=\"_2KpZ6l _2HKlqd _3AWRsL\"]")
	WebElement requestOTP;
	
	
	
	// Initializing the Page Objects:
	public ContactsPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void enterMobileandRequest(){
		SoftAssert sf=new SoftAssert();
		mobileNumber.sendKeys("9632551827");
	//	Assert.assertTrue(false,"WebElement is not loading : ");
		Assert.assertEquals("10","20", "Value is not matching");
		
		//requestOTP.click();
	}
	
	
	
	
	

}
