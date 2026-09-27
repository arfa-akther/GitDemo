package com.camp.Locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.camp.Utility.baseCamp_class;

public class profilePageCampLocators extends baseCamp_class{

	public profilePageCampLocators() {
		PageFactory.initElements(driver, this);
			
	}
	
	//verify login successful
			@FindBy(how=How.ID, using= "nameofuser")
			public WebElement profile ;
			
	//for logout		
			@FindBy(how=How.ID, using= "logout2")
			public WebElement clicklogout ;
}
