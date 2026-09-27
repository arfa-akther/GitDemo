package StepDefinitionCamp;

import com.camp.Action.aboutusPageCampActions;
import com.camp.Utility.baseCamp_class;

import cucumber.api.java.en.Then;

public class aboutusCamp extends baseCamp_class{
 
	aboutusPageCampActions AboutusPageCampActions = new aboutusPageCampActions();
	
	@Then("^Verify video is displayed in About us page$")
	public void verify_video_is_displayed_in_About_us_page() throws Throwable {
		AboutusPageCampActions.VerifyvideoisdisplayedinAboutuspage();
	}
	
	@Then("^Click on Play video button to play the video$")
	public void click_on_Play_video_button_to_play_the_video() throws Throwable {
		AboutusPageCampActions.ClickonPlayvideobuttontoplaythevideo();
	}

	@Then("^Click on Pause button to pause the video$")
	public void click_on_Pause_button_to_pause_the_video() throws Throwable {
		AboutusPageCampActions.ClickonPausebuttontopausethevideo();
	}

	@Then("^Click on the close button to close the video$")
	public void click_on_the_close_button_to_close_the_video() throws Throwable {
		AboutusPageCampActions.Clickontheclosebuttontoclosethevideo();
	}

	@Then("^Verify the video closes successfully$")
	public void verify_the_video_closes_successfully() throws Throwable {
		AboutusPageCampActions.Verifythevideoclosessuccessfully();
	}
}
