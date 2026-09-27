package com.camp.Action;

import org.openqa.selenium.Alert;
import org.testng.Assert;

import com.camp.Locator.homePageCampLocators;
import com.camp.Locator.signupPageCampLocators;
import com.camp.Utility.baseCamp_class;
import com.camp.Utility.tesDataCamp;


public class signupPageCampActions extends baseCamp_class{
	
	homePageCampLocators HomePageCampLocators = new homePageCampLocators();
	signupPageCampLocators SignupPageCampLocators = new signupPageCampLocators();
	
	public void VerifySignupformcontainsusernameandpasswordfieldandSignupbuttonavailable() throws Exception {
		Thread.sleep(3000);
		boolean signupverify =  HomePageCampLocators.verifysignupform.isDisplayed();
		Assert.assertTrue(signupverify);
	}
	
	public void Enteranewusername() throws Exception {
		SignupPageCampLocators.sigupusername.sendKeys("baiyaa");
		Thread.sleep(3000);
	}
	
	
	public void Enteranypassword() throws Exception {
		SignupPageCampLocators.signuppassword.sendKeys("gfdgr");
		Thread.sleep(3000);
	}
	
	
	public void  ClickSignupbutton() {
		SignupPageCampLocators.signupbutton.click();
	}
	
		
	public void VerifyusersignedupsuccessfullywithSignupsuccessfulcomment() throws Exception {
		Thread.sleep(3000);
	    boolean withinvalidinput =  driver.switchTo().alert().getText().contains("Sign up successful.");
		Assert.assertTrue(withinvalidinput);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
	}
	
	//without any credentials
	public void Keeptheusernamefieldempty() throws Exception {
		SignupPageCampLocators.sigupusername.sendKeys("");
		Thread.sleep(3000);
		
	}
	
	public void Keepthepasswordfieldempty() {
		SignupPageCampLocators.signuppassword.sendKeys("");
		
		
	}

	public void VerifyusercannotsignupsuccessfullywithFilloutcomment() throws Exception {
		Thread.sleep(3000);
	    boolean withinvalidinput =  driver.switchTo().alert().getText().contains("Please fill out Username and Password.");
		Assert.assertTrue(withinvalidinput);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		}
	
	//existing user name and a new password
    public void Enteranexistingusername() throws Exception {
    	SignupPageCampLocators.sigupusername.sendKeys(tesDataCamp.signupexistingusername);
    	Thread.sleep(3000);
	}
	
	public void Enteranynewpassword() throws Exception {
		SignupPageCampLocators.signuppassword.sendKeys(tesDataCamp.signupanypassword);
		Thread.sleep(3000);
	} 	
	
	public void Verifyusercannotsignupsuccessfullywithcommentuserexists () throws Exception {
		Thread.sleep(3000);
	    boolean withinvalidinput =  driver.switchTo().alert().getText().contains("This user already exist.");
		Assert.assertTrue(withinvalidinput);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		
		//Write message in alertbox
		/*Alert alertmsg= driver.switchTo().alert();
		
		alertmsg.sendKeys("hello"); */
	}
	
	
	
}
