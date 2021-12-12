package stepDefinitions;

import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageObjects.DesktopsPageObject;
import pageObjects.HomePageObject;
import utilities.UtilityClass;

public class DesktopStepDefinitions extends Base {
	/*
	 * @Given("User is on Retail website") public void user_is_on_retail_website() {
	 * String actualPageTitle = driver.getTitle(); String expectedPageTitle =
	 * "TEK SCHOOL"; //Assertion checks the expected vs the actual and will fail if
	 * it is not and stop test case Assert.assertEquals(expectedPageTitle,
	 * actualPageTitle);
	 * logger.info("Actual Title is matching with expected Title");
	 * 
	 * }
	 */
	DesktopsPageObject desktopObject = new DesktopsPageObject();
	HomePageObject homePage = new HomePageObject();

	@When("User click on Desktops tab")
	public void user_click_on_desktops_tab() {

		homePage.clickOnDesktops();
	}

	@When("User click on Show all desktops")
	public void user_click_on_show_all_desktops() {
		homePage.clickonShowAllDesktops();
	}

	@Then("User should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_desktop_page() {
		Assert.assertTrue(desktopObject.validateDesktopItems());
	}

	@When("User click  ADD TO CART option on HP LP3065 item")
	public void user_click_add_to_cart_option_on_item() {
		desktopObject.addCartHpLP3065();
		UtilityClass.takeScreenShot();
	}

	@When("User select quantity {int}")
	public void user_select_quantity(Integer int1) {
		desktopObject.quantityItem(int1);

	}

	@When("User click add to Cart button")
	public void user_click_add_to_cart_button() {
		desktopObject.addToCart();
	}

	@Then("User should see a message Success: You have added {string} to your shopping cart!")
	public void user_should_see_a_message(String string) {
		Assert.assertTrue(desktopObject.successMessageCart(string));
	    UtilityClass.takeScreenShot();
	}

	@When("User click  ADD TO CART option on Canon EOS 5D item")
	public void user_click_add_to_cart_option_on_Canon_EOS_5D() {
		desktopObject.addCartCanonEOS5D();
	}

	@When("User select color from dropdown {string}")
	public void user_select_color_from_dropdown(String color) {
		desktopObject.selectCanonColor(color);
		UtilityClass.takeScreenShot();
	}

	@When("User click on Canon EOS 5D item")
	public void user_click_on_canon_eos_5d_item() {
		desktopObject.clickOnCanonEOS();
		UtilityClass.takeScreenShot();
	}

	@When("User click on write a review link")
	public void user_click_on_write_a_review_link() {
		desktopObject.writeReviewClick();
		UtilityClass.takeScreenShot();
	}

	@When("user fill the review information with below information {string} {string} {string}")
	public void user_fill_the_review_information(String name, String review, String rating) {
		desktopObject.reviewNameAdd(name);
		desktopObject.reviewTextAdd(review);
		desktopObject.ratingReview(rating);
		UtilityClass.takeScreenShot();
	}

	@When("User click on Continue Button")
	public void user_click_on_continue_button() {
		desktopObject.submitReview();
	}

	@Then("User should see a message with Thank you for your review. It has been submitted to the webmaster for approval")
	public void user_should_see_a_message_with_thank_you() {
		Assert.assertTrue(desktopObject.reviewSubmissionValidation());
		UtilityClass.takeScreenShot();
	}

}
