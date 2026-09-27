package StepDefinitionCamp;

import com.camp.Action.cartPageCampActions;
import com.camp.Action.homePageCampActions;
import com.camp.Utility.baseCamp_class;

import cucumber.api.java.en.Then;

public class cartCamp extends baseCamp_class{
	homePageCampActions HomePageCampActions = new homePageCampActions();
	cartPageCampActions CartPageCampActions = new cartPageCampActions();
	
	@Then("^Click on Galaxy Ssix in Homepage$")
	public void click_on_Galaxy_Ssix_in_Homepage() throws Throwable {
		HomePageCampActions.ClickonGalaxySsixinHomepage();
	}

	@Then("^Click item add to Cart button$")
	public void click_item_add_to_Cart_button() throws Throwable {
		CartPageCampActions.ClickitemaddtoCartbutton();
	}

	@Then("^Click Cart link tab$")
	public void click_Cart_link_tab() throws Throwable {
		CartPageCampActions.ClickCartlinktab();
	}

	@Then("^Verify product description and product price are displayed in Cart page$")
	public void verify_product_description_and_product_price_are_displayed_in_Cart_page() throws Throwable {
		CartPageCampActions.VerifyproductdescriptionandproductpricearedisplayedinCartpage();
	}

	@Then("^Click on Place Order button$")
	public void click_on_Place_Order_button() throws Throwable {
		CartPageCampActions.ClickonPlaceOrderbutton();
	}

	@Then("^Verify Place Order window is displayed in Cart page$")
	public void verify_Place_Order_window_is_displayed_in_Cart_page() throws Throwable {
		CartPageCampActions.VerifyPlaceOrderwindowisdisplayedinCartpage();
	}
}
