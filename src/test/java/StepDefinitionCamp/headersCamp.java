package StepDefinitionCamp;

import com.camp.Action.homePageCampActions;
import com.camp.Action.loginPageCampActions;
import com.camp.Utility.baseCamp_class;
import com.camp.Utility.screenShotCamp;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class headersCamp extends baseCamp_class{ 
	
	homePageCampActions HomePageCampActions = new homePageCampActions();
	
	
	@Given("^Launch camp \"([^\"]*)\" application$")
	public void launch_camp_application(String URL) throws Throwable {
		getURLcamp(URL);
	}
//home link
	@Then("^Click on Home button in Homepage$")
	public void click_on_Home_button_in_Homepage() throws Throwable {
		HomePageCampActions.ClickonHomebuttoninHomepage();
		
	}
	
	@Then("^Verify Home page is accessible to the user$")
	public void verify_Home_page_is_accessible_to_the_user() throws Throwable {
		HomePageCampActions.VerifyHomepageisaccessibletotheuser();
		screenShotCamp.takescreenshot(driver, "Home page");
	}
  //Contact link
	@Then("^Click on Contact button in Homepage$")
	public void click_on_Contact_button_in_Homepage() throws Throwable {
		HomePageCampActions.ClickonContactbuttoninHomepage();
	}

	@Then("^Verify Contact page is accessible to the user$")
	public void verify_Contact_page_is_accessible_to_the_user() throws Throwable {
		HomePageCampActions.VerifyContactpageisaccessibletotheuser();
	}
	
	@Then("^Click on About Us button in Homepage$")
	public void click_on_About_Us_button_in_Homepage() throws Throwable {
		HomePageCampActions.ClickonAboutUsbuttoninHomepage();
	}

	@Then("^Verify About Us page is accessible to the user$")
	public void verify_About_Us_page_is_accessible_to_the_user() throws Throwable {
		HomePageCampActions.VerifyAboutUspageisaccessibletotheuser();
	}
	
	@Then("^Click on Cart button in Homepage$")
	public void click_on_Cart_button_in_Homepage() throws Throwable {
		HomePageCampActions.ClickonCartbuttoninHomepage();
	}

	@Then("^Verify Cart page is accessible to the user$")
	public void verify_Cart_page_is_accessible_to_the_user() throws Throwable {
		HomePageCampActions.VerifyCartpageisaccessibletotheuser();
	}

	@Then("^Click on Log In button in Homepage$")
	public void click_on_Log_In_button_in_Homepage() throws Throwable {
		HomePageCampActions.ClickonLogInbuttoninHomepage();
	}

	@Then("^Verify Log in page is accessible to the user$")
	public void verify_Log_in_page_is_accessible_to_the_user() throws Throwable {
		HomePageCampActions.VerifyLoginpageisaccessibletotheuser();
	}
	
	@Then("^Click on Sign Up button in Homepage$")
	public void click_on_Sign_Up_button_in_Homepage() throws Throwable {
		HomePageCampActions.ClickonSignUpbuttoninHomepage();
	}

	@Then("^Verify Sign Up page is accessible to the user$")
	public void verify_Sign_Up_page_is_accessible_to_the_user() throws Throwable {
		HomePageCampActions.VerifySignUppageisaccessibletotheuser();
	}  
}
