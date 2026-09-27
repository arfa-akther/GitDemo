package com.camp.Action;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.camp.Locator.homePageCampLocators;
import com.camp.Utility.baseCamp_class;

public class homePageCampActions extends baseCamp_class {
	homePageCampLocators HomePageCampLocators = new homePageCampLocators();
	
	public void ClickonHomebuttoninHomepage() throws Exception {
		Thread.sleep(3000);
		HomePageCampLocators.hometab.click();
		Thread.sleep(3000);
	}
	
	
public void VerifyHomepageisaccessibletotheuser() {
		boolean categoryhome = HomePageCampLocators.verifyhomepage.isDisplayed();
		Assert.assertTrue(categoryhome);
	}

public void ClickonContactbuttoninHomepage() throws Exception {
	Thread.sleep(3000);
	HomePageCampLocators.contacttab.click();
	
}

     public void VerifyContactpageisaccessibletotheuser() throws Exception {
    	 Thread.sleep(3000);
    	 boolean categorycontact = HomePageCampLocators.verifycontactform.isDisplayed();
 		Assert.assertTrue(categorycontact); 
 		
     }
     
     public void ClickonAboutUsbuttoninHomepage() throws Exception {
    	 Thread.sleep(3000);
    	 HomePageCampLocators.aboutustab.click();
     }
     
     
	public void VerifyAboutUspageisaccessibletotheuser() throws Exception {
		Thread.sleep(3000);
		boolean categoryaboutus = HomePageCampLocators.verifyaboutus.isDisplayed();
				Assert.assertTrue(categoryaboutus); 	
				
	}
	
	public void ClickonCartbuttoninHomepage() throws Exception {
		HomePageCampLocators.carttab.click();
		Thread.sleep(3000);
	}
	
	public void VerifyCartpageisaccessibletotheuser() {
		boolean categorycart = HomePageCampLocators.verifycartpage.isDisplayed();
		Assert.assertTrue(categorycart);
	}
	
	
	
	public void VerifyLoginpageisaccessibletotheuser() throws Exception {
		Thread.sleep(3000);
		
		boolean categorylogin =  HomePageCampLocators.verifyloginform.isDisplayed();	
		Assert.assertTrue(categorylogin);
	}
	
	public void ClickonSignUpbuttoninHomepage() throws Exception {
		Thread.sleep(3000);
		HomePageCampLocators.signuptab.click();
		Thread.sleep(3000);
	}
	
	public void VerifySignUppageisaccessibletotheuser() {
		boolean categorysignup =  HomePageCampLocators.verifysignupform.isDisplayed();	
		Assert.assertTrue(categorysignup);
	}
	
	public void Clickonlogintabinhomepage() throws Exception {
		//Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(HomePageCampLocators.logintab));
		HomePageCampLocators.logintab.click();
	}
	
	public void ClickonLogInbuttoninHomepage() throws Exception {
		Thread.sleep(3000);
		HomePageCampLocators.logintab.click();
	}
	

	//User story sign up
	public void ClickonSignuptabinHomepage() {
		HomePageCampLocators.signuptab.click();
	}
	
	public void ClickonContacttabinHomepage() throws Exception {
		HomePageCampLocators.contacttab.click();
		Thread.sleep(3000);
	}
	
	public void ClickonGalaxySsixinHomepage() {
		HomePageCampLocators.clicksmasung.click();
		
	}
	
		
		
}
