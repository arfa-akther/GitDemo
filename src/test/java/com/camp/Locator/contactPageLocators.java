package com.camp.Locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.camp.Utility.baseCamp_class;

public class contactPageLocators extends baseCamp_class {

	public contactPageLocators() {
		PageFactory.initElements(driver, this);
			
	}
	
	//contact email
			@FindBy(how=How.ID, using= "recipient-email")
			public WebElement ContactEmail;
			
 //contact name
			@FindBy(how=How.XPATH, using= "//input[@id=\"recipient-name\"]")
			public WebElement ContactName;
			
			
 //message
			@FindBy(how=How.XPATH, using= "//textarea[@id=\"message-text\"]")
			public WebElement message;		
			
//Send message Button
			@FindBy(how=How.XPATH, using= "//button[text()=\"Send message\"]")
			public WebElement Sendmessagebutton;
}
