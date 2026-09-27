package com.camp.Action;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.camp.Locator.homePageCampLocators;
import com.camp.Locator.loginPageCampLocators;
import com.camp.Utility.baseCamp_class;
import com.camp.Utility.tesDataCamp;

public class loginPageCampActions extends baseCamp_class {

	
	homePageCampLocators HomePageCampLocators = new  homePageCampLocators();
	loginPageCampLocators LoginPageCampLocators = new loginPageCampLocators();
	
	
//scenario 1 :	login form contain username, password field & login button available verification 
	public void VerifyLoginformcontainsusernameandpasswordfieldandloginbuttonavailable() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(HomePageCampLocators.verifyloginform));
		//Thread.sleep(3000);
		boolean categorylogin1 =  HomePageCampLocators.verifyloginform.isDisplayed();	
		Assert.assertTrue(categorylogin1);
		System.out.println(" chnages by person B in develp branch");
	}
	
	public void Entervalidusername() throws Exception {
		//Thread.sleep(3000);
		LoginPageCampLocators.username.sendKeys(tesDataCamp.loginValidUsername);
		//Thread.sleep(3000);
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(LoginPageCampLocators.username));
	}
	
	public void Entervalidpassword() throws Exception {
		//Thread.sleep(3000);
		LoginPageCampLocators.password.sendKeys(tesDataCamp.LoginValidPassword);
		//Thread.sleep(3000);
	}
	
	
	public void Clickloginbutton() throws Exception {
		//Thread.sleep(3000);
		LoginPageCampLocators.loginbutton.click();
		//Thread.sleep(3000);
	}
	
	
    public void Enterinvalidusername() throws Exception {
    	Thread.sleep(3000);
		LoginPageCampLocators.username.sendKeys(tesDataCamp.LoginInvalidUsername);
		Thread.sleep(3000);
    }
    
    public void Enterinvalidpassword () throws Exception {
    	Thread.sleep(3000);
		LoginPageCampLocators.password.sendKeys(tesDataCamp.LoginInValidPassword);
		Thread.sleep(3000);
    }
    
    // scenario 3  invalid credentials verification  / scenario 5 : invalid username and valid password verification
    public void Verifyusercannotloginsuccessfullywithnouserexistcomment() throws Exception {
    	
		//Thread.sleep(3000);
    	// WebDriverWait wait = new WebDriverWait(driver,20);
		// wait.until(ExpectedConditions.elementToBeClickable(LOCATOR));
		
	     boolean withinvalidinput =  driver.switchTo().alert().getText().contains("User does not exist");
		 Assert.assertTrue(withinvalidinput);
		 driver.switchTo().alert().accept();
		 Thread.sleep(3000);
		 
	}
    
  //scenario 4: valid username and invalid password verification
  	public void Verifyusercannottloginsuccessfullywithwrongpasscomment() throws Exception {
  			Thread.sleep(2000);
  			boolean withinvalidinput =  driver.switchTo().alert().getText().contains("Wrong password.");
  			Assert.assertTrue(withinvalidinput);
  			driver.switchTo().alert().accept();
  		}
    
	
	public void Keepusernamefieldempty() throws Exception {
		LoginPageCampLocators.username.sendKeys("");
  		Thread.sleep(2000);
	}
	
	public void Keeppasswordfieldempty() throws Exception {
		LoginPageCampLocators.password.sendKeys("");
  		Thread.sleep(2000);
	}

	//scenario 6 : with empty credentials verification
	public void VerifyuserCannotloginsuccessfullywithnofilloutcomment() throws Exception {
		Thread.sleep(2000);
  		boolean withinvalidinput =  driver.switchTo().alert().getText().contains("Please fill out Username and Password.");
  		//boolean withinvalidinput =  driver.switchTo().alert().getText().contains("Wrong password.");
  		Assert.assertTrue(withinvalidinput);
  		driver.switchTo().alert().accept();
	}
	
	
	
}
