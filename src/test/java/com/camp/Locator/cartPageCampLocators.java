package com.camp.Locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.camp.Utility.baseCamp_class;

public class cartPageCampLocators extends baseCamp_class{

	public cartPageCampLocators() {
		PageFactory.initElements(driver, this);
			
	}
	
	//add to cart button
			@FindBy(how=How.XPATH, using= "//a[text()=\"Add to cart\"]")
			public WebElement addcarttobutton;
			
			
			@FindBy(how=How.XPATH, using = "//td[text()='Samsung galaxy s6']")
			
			public WebElement verifyDescription;
			
			@FindBy(how=How.XPATH, using = "//td[text()='360']")
			public WebElement verifyprice;
						
		
	//US5.2. click on place order in cart page after adding item in cart
			@FindBy(how=How.XPATH, using = "//button[@class=\"btn btn-success\"]")
			public WebElement clickPlaceOrder;
			
			//verify Place Order window is displayed
			@FindBy(how=How.XPATH, using = "//h5[text()=\"Place order\"]")
			public WebElement verifyPlaceOrder;
			
			
}
