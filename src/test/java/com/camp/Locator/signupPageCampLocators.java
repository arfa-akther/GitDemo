package com.camp.Locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.camp.Utility.baseCamp_class;

public class signupPageCampLocators extends baseCamp_class {
	
	public signupPageCampLocators() {
		PageFactory.initElements(driver, this);
			
	}
	
	//signup username
			@FindBy(how=How.XPATH, using= "//input[@id=\"sign-username\"]")
			public WebElement sigupusername ;
			
			//signup password
			   @FindBy(how=How.XPATH, using= "//input[@id=\"sign-password\"]")
			    public WebElement signuppassword ;
			   
			 //signup button
			   @FindBy(how=How.XPATH, using= "//button[@onclick=\"register()\"]")
			    public WebElement signupbutton ;			   
}


