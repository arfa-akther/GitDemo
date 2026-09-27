package StepDefinitionCamp;

import com.camp.Action.contactPageCampActions;
import com.camp.Action.homePageCampActions;
import com.camp.Utility.baseCamp_class;

import cucumber.api.java.en.Then;

public class contactCamp extends baseCamp_class{

	homePageCampActions HomePageCampActions = new homePageCampActions();
	contactPageCampActions ContactPageCampActions = new contactPageCampActions();
	
	@Then("^Click on Contact tab in Homepage$")
	public void click_on_Contact_tab_in_Homepage() throws Throwable {
		HomePageCampActions.ClickonContacttabinHomepage();
	}

	@Then("^Verify Contact form contains Contact Email, Contact name and Message fields, Send Message and Close buttons available$")
	public void verify_Contact_form_contains_Contact_Email_Contact_name_and_Message_fields_Send_Message_and_Close_buttons_available() throws Throwable {
		ContactPageCampActions.VerifyContactformcontainsContactEmailContactnameandMessagefieldsSendMessageandClosebuttonsavailable();
	}
	
	@Then("^Enter a valid email ID$")
	public void enter_a_valid_email_ID() throws Throwable {
		ContactPageCampActions.EnteravalidemailID();
	}

	@Then("^Enter a valid Contact name$")
	public void enter_a_valid_Contact_name() throws Throwable {
		ContactPageCampActions.EnteravalidContactname();
	}

	@Then("^Enter Message$")
	public void enter_Message() throws Throwable {
		ContactPageCampActions.EnterMessage();
	}

	@Then("^Click Send Message button$")
	public void click_Send_Message_button() throws Throwable {
		ContactPageCampActions.ClickSendMessagebutton();
	}

	@Then("^Verify user send message successfully$")
	public void verify_user_send_message_successfully() throws Throwable {
		ContactPageCampActions.Verifyusersendmessagesuccessfully();
	}
	
	@Then("^Keep Contact email ID field blank$")
	public void keep_Contact_email_ID_field_blank() throws Throwable {
		ContactPageCampActions.KeepContactemailIDfieldblank();
	}

	@Then("^Keep Contact name field blank$")
	public void keep_Contact_name_field_blank() throws Throwable {
		ContactPageCampActions.KeepContactnamefieldblank();
	}

	@Then("^Keep Message field blank$")
	public void keep_Message_field_blank() throws Throwable {
		ContactPageCampActions.KeepMessagefieldblank();
	}

	@Then("^Verify user can not send message with incomplete form$")
	public void verify_user_can_not_send_message_with_incomplete_form() throws Throwable {
		ContactPageCampActions.Verifyusercannotsendmessagewithincompleteform();
	}
}
