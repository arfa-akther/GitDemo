package com.camp.Action;

import org.testng.Assert;

import com.camp.Locator.cartPageCampLocators;
import com.camp.Locator.homePageCampLocators;
import com.camp.Utility.baseCamp_class;

public class cartPageCampActions extends baseCamp_class {
	cartPageCampLocators CartPageCampLocators = new cartPageCampLocators();
	homePageCampLocators HomePageCampLocators = new homePageCampLocators();
	
	
	public void ClickitemaddtoCartbutton() throws Exception {
		CartPageCampLocators.addcarttobutton.click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
	}

	public void ClickCartlinktab() {
		HomePageCampLocators.carttab.click();
	}
	public void VerifyproductdescriptionandproductpricearedisplayedinCartpage () throws Exception {
		Thread.sleep(3000);
		boolean cartverify1 =CartPageCampLocators.verifyDescription.isDisplayed();
		Assert.assertTrue(cartverify1);
		
		Thread.sleep(3000);
		boolean cartverify2 =CartPageCampLocators.verifyprice.isDisplayed();
		Assert.assertTrue(cartverify2);
	}
	
	public void ClickonPlaceOrderbutton () {
		CartPageCampLocators.clickPlaceOrder.click();
	}
	
	public void  VerifyPlaceOrderwindowisdisplayedinCartpage() throws Exception {
		Thread.sleep(3000);
		boolean placeOrderverify =CartPageCampLocators.verifyPlaceOrder.isDisplayed();
		Assert.assertTrue(placeOrderverify);
	}
}
