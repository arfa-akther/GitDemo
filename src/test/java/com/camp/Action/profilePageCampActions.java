package com.camp.Action;

import org.testng.Assert;

import com.camp.Locator.profilePageCampLocators;
import com.camp.Utility.baseCamp_class;

public class profilePageCampActions extends baseCamp_class{

	profilePageCampLocators ProfilePageCampLocators = new profilePageCampLocators();
	

// scenario 2 : valid credentials verification
	public void Verifyuserhasloggedinsuccessfully() throws InterruptedException {
		Thread.sleep(3000);
		boolean profileverify =  ProfilePageCampLocators.profile.isDisplayed();
		Assert.assertTrue(profileverify);
		
	}
	
	//scenario 2: logout
	public void Clicklogoutbutton() {
		ProfilePageCampLocators.clicklogout.click();
		
	}
	
	
}
