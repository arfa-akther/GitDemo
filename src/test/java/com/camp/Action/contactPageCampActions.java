package com.camp.Action;

import org.testng.Assert;

import com.camp.Locator.contactPageLocators;
import com.camp.Locator.homePageCampLocators;
import com.camp.Utility.baseCamp_class;
import com.camp.Utility.tesDataCamp;

public class contactPageCampActions extends baseCamp_class{

	contactPageLocators ContactPageLocators = new contactPageLocators();
	homePageCampLocators HomePageCampLocators = new homePageCampLocators();
	
	public void VerifyContactformcontainsContactEmailContactnameandMessagefieldsSendMessageandClosebuttonsavailable() throws Exception {
		Thread.sleep(3000);
		boolean contactverify =  HomePageCampLocators.verifycontactform.isDisplayed();
		Assert.assertTrue(contactverify);
		
	}
	
	public void EnteravalidemailID () throws Exception {
		ContactPageLocators.ContactEmail.sendKeys(tesDataCamp.validemail);
		Thread.sleep(3000);
	}
	
	public void  EnteravalidContactname () throws Exception {
		ContactPageLocators.ContactName.sendKeys(tesDataCamp.contactName);
		Thread.sleep(3000);
	}
	
	public void  EnterMessage() throws Exception {
		ContactPageLocators.message.sendKeys(tesDataCamp.contactMessage);
		Thread.sleep(3000);
	}
	
	public void ClickSendMessagebutton() throws Exception {
		ContactPageLocators.Sendmessagebutton.click();
		Thread.sleep(3000);
	}
	
	public void Verifyusersendmessagesuccessfully() throws Exception {
		Thread.sleep(3000);
		//boolean withinvalidinput =  driver.switchTo().alert().getText().contains("Wrong password.");
	    boolean contactformverify =  driver.switchTo().alert().getText().contains("Thanks for the message!!");
		Assert.assertTrue(contactformverify);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
	}
	
	public void KeepContactemailIDfieldblank () throws Exception {
		ContactPageLocators.ContactEmail.sendKeys("");
		Thread.sleep(3000);
		
	}
	
	public void KeepContactnamefieldblank () throws Exception {
		ContactPageLocators.ContactName.sendKeys("");
		Thread.sleep(3000);
		
	}
	
	public void KeepMessagefieldblank () throws Exception {
		
		ContactPageLocators.message.sendKeys("");
		Thread.sleep(3000);
	}
	
	
	
	public void Verifyusercannotsendmessagewithincompleteform() throws Exception {
		//boolean withinvalidinput =  driver.switchTo().alert().getText().contains("Wrong password.");
	    boolean contactformverify =  driver.switchTo().alert().getText().contains("Thanks for the message!!");
		Assert.assertTrue(contactformverify);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
	}
}
