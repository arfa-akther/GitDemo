package com.camp.Locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.camp.Utility.baseCamp_class;

public class aboutusPageCampLocators extends baseCamp_class{

	public aboutusPageCampLocators() {
		PageFactory.initElements(driver, this);
			
	}
	
	//verify video
			@FindBy(how=How.XPATH, using= "//div[@class=\"vjs-poster\"]")
			public WebElement verifyvideo;
			
	//play video
			@FindBy(how=How.XPATH, using= "//button[@title=\"Play Video\"]")
			public WebElement playvideo;
			
   //pause video
			@FindBy(how=How.XPATH, using= "//button[@title=\"Pause\"]")
			public WebElement pausevideo;
			
 // close video
			@FindBy(how=How.XPATH, using= "/html/body/div[4]/div/div/div[3]/button")
			public WebElement closevideo;
			
}
