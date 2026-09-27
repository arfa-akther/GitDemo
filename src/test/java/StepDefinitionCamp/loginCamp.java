package StepDefinitionCamp;


import com.camp.Action.homePageCampActions;
import com.camp.Action.loginPageCampActions;
import com.camp.Action.profilePageCampActions;
import com.camp.Utility.baseCamp_class;

import cucumber.api.java.en.Then;

public class loginCamp extends baseCamp_class{
	
	loginPageCampActions LoginPageCampActions = new loginPageCampActions();
	homePageCampActions HomePageCampActions = new homePageCampActions();
	profilePageCampActions ProfilePageCampActions = new profilePageCampActions();
	
	//login form verify	
	
		@Then("^Click on login tab in homepage$")
		public void click_on_login_tab_in_homepage() throws Throwable {
			HomePageCampActions.Clickonlogintabinhomepage();
		}

		@Then("^Verify login form contain username, password field & login button available$")
		public void verify_login_form_contain_username_password_field_login_button_available() throws Throwable {
			LoginPageCampActions.VerifyLoginformcontainsusernameandpasswordfieldandloginbuttonavailable();
		}

	//valid credentials successfully	
		@Then("^Enter valid username$")
		public void enter_valid_username() throws Throwable {
			LoginPageCampActions.Entervalidusername();
		}

		@Then("^Enter valid password$")
		public void enter_valid_password() throws Throwable {
			LoginPageCampActions.Entervalidpassword();
		}

		@Then("^Click login button$")
		public void click_login_button() throws Throwable {
			LoginPageCampActions.Clickloginbutton();
		}

		@Then("^Verify user has logged in successfully$")
		public void verify_user_has_logged_in_successfully() throws Throwable {
			ProfilePageCampActions.Verifyuserhasloggedinsuccessfully();
		}

		@Then("^Click log out button$")
		public void click_log_out_button() throws Throwable {
			ProfilePageCampActions.Clicklogoutbutton();
		}

	// invalid credentials 

		@Then("^Enter invalid username$")
		public void enter_invalid_username() throws Throwable {
			LoginPageCampActions.Enterinvalidusername(); 
		}

		@Then("^Enter invalid password$")
		public void enter_invalid_password() throws Throwable {
			LoginPageCampActions.Enterinvalidpassword();
		    	}

		
	//valid user name, invalid passwordd	
		@Then("^Verify user can not login successfully with wrong pass comment$")
		public void verify_user_can_not_login_successfully_with_wrong_pass_comment() throws Throwable {
			LoginPageCampActions.Verifyusercannottloginsuccessfullywithwrongpasscomment(); 
		}

	//invalid username and valid password  
	@Then("^Verify user can not login successfully with no user exist comment$")
		public void verify_user_can_not_login_successfully_with_no_user_exist_comment() throws Throwable {
		
		LoginPageCampActions.Verifyusercannotloginsuccessfullywithnouserexistcomment();
		    
		}

	//blank fields	
	@Then("^Keep user name field empty$")
	public void keep_user_name_field_empty() throws Throwable {
		LoginPageCampActions.Keepusernamefieldempty();
	}

	@Then("^Keep password field empty$")
	public void keep_password_field_empty() throws Throwable {
		LoginPageCampActions.Keeppasswordfieldempty();
	}

	@Then("^Verify user Can not login successfully with no fill out comment$")
	public void verify_user_Can_not_login_successfully_with_no_fill_out_comment() throws Throwable {
		LoginPageCampActions.VerifyuserCannotloginsuccessfullywithnofilloutcomment(); 
 }
}
