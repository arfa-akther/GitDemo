package com.camp.Locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.camp.Utility.baseCamp_class;

public class homePageCampLocators extends baseCamp_class {

	public homePageCampLocators() {
		PageFactory.initElements(driver, this);
	}
	
	//home link tab
	@FindBy(how=How.XPATH, using= "//a[text()='Home ']")
	public WebElement hometab ;
	
	
	//home link tab verification
		@FindBy(how=How.XPATH, using= "//a[text()='CATEGORIES']")
		public WebElement verifyhomepage ;
	
		//contact link tab
		@FindBy(how=How.XPATH, using= "//a[text()='Contact']")
		public WebElement contacttab ;
		
		//verify contact form
		@FindBy(how=How.ID, using= "recipient-email")
		public WebElement verifycontactform ;
		
		//about us about us tab
		@FindBy(how=How.XPATH, using= "//a[text()='About us']")
		public WebElement aboutustab ;
		
		//Verify about us 
		@FindBy(how=How.ID, using= "videoModalLabel")
		public WebElement verifyaboutus ;
		
		//Cart tab
		@FindBy(how=How.ID, using= "cartur")
		public WebElement carttab;
		
		//verify cart page
		@FindBy(how=How.XPATH, using= "//h2[text()='Products']")
		public WebElement verifycartpage;
		
		//login tab
		@FindBy(how=How.ID, using= "login2")
		public WebElement logintab;
		
		
		//verify login form
		@FindBy(how=How.ID, using= "logInModalLabel")
		public WebElement verifyloginform;   
		
		//Sign Up tab
		@FindBy(how=How.ID, using= "signin2")
		public WebElement signuptab;
		
		//verify Sign Up form
		@FindBy(how=How.ID, using= "signInModalLabel")
		public WebElement verifysignupform;
		
		//Galaxy S6 in Homepage
				@FindBy(how=How.XPATH, using= "//a[text()=\"Samsung galaxy s6\"]")
				public WebElement clicksmasung;
}
