package StepDefinitionCamp;

import com.camp.Action.homePageCampActions;
import com.camp.Action.signupPageCampActions;
import com.camp.Utility.baseCamp_class;

import cucumber.api.java.en.Then;

public class signupCamp extends baseCamp_class{
	
	homePageCampActions HomePageCampActions = new homePageCampActions ();
	signupPageCampActions SignupPageCampActions = new signupPageCampActions();
	
	@Then("^Click on Signup tab in Homepage$")
	public void click_on_Signup_tab_in_Homepage() throws Throwable {
		HomePageCampActions.ClickonSignuptabinHomepage();
	}

	@Then("^Verify Signup form contains user name and password field and Signup button available$")
	public void verify_Signup_form_contains_user_name_and_password_field_and_Signup_button_available() throws Throwable {
		SignupPageCampActions.VerifySignupformcontainsusernameandpasswordfieldandSignupbuttonavailable();
	}
	
	@Then("^Enter a new username$")
	public void enter_a_new_username() throws Throwable {
		SignupPageCampActions.Enteranewusername();
	}

	@Then("^Enter any password$")
	public void enter_any_password() throws Throwable {
		SignupPageCampActions.Enteranypassword();
	}

	@Then("^Click Signup button$")
	public void click_Signup_button() throws Throwable {
		SignupPageCampActions.ClickSignupbutton();
	}

	@Then("^Verify user signed up successfully with Sign up successful comment$")
	public void verify_user_signed_up_successfully_with_Sign_up_successful_comment() throws Throwable {
		SignupPageCampActions.VerifyusersignedupsuccessfullywithSignupsuccessfulcomment();
	    
	}
	
	@Then("^Keep the user name field empty$")
	public void keep_the_user_name_field_empty() throws Throwable {
		SignupPageCampActions.Keeptheusernamefieldempty();
	}

	@Then("^Keep the password field empty$")
	public void keep_the_password_field_empty() throws Throwable {
		SignupPageCampActions.Keepthepasswordfieldempty();
	}

	@Then("^Verify user cannot signup successfully with Fill out comment$")
	public void verify_user_cannot_signup_successfully_with_Fill_out_comment() throws Throwable {
		SignupPageCampActions.VerifyusercannotsignupsuccessfullywithFilloutcomment();
	}
	
	@Then("^Enter an existing username$")
	public void enter_an_existing_username() throws Throwable {
		SignupPageCampActions.Enteranexistingusername(); 
	}

	@Then("^Enter any new password$")
	public void enter_any_new_password() throws Throwable {
		SignupPageCampActions.Enteranynewpassword();
	}

	@Then("^Verify user cannot signup successfully with comment user exists$")
	public void verify_user_cannot_signup_successfully_with_comment_user_exists() throws Throwable {
		SignupPageCampActions.Verifyusercannotsignupsuccessfullywithcommentuserexists();
	}
	
	
}
