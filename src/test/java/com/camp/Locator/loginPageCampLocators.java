package com.camp.Locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.camp.Utility.baseCamp_class;

public class loginPageCampLocators extends baseCamp_class{

	public loginPageCampLocators() {
		PageFactory.initElements(driver, this);
	}
	
	//username
	@FindBy(how=How.ID, using= "loginusername")
	public WebElement username ;
	
	//password
	@FindBy(how=How.ID, using= "loginpassword")
	public WebElement password ;
	
	//login button in login form
	@FindBy(how=How.XPATH, using= "//button[text()='Log in']")
	public WebElement loginbutton ;
	
	
	
}
