package stepDefinitions;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePageObject;
import pageObjects.LaptopsNoteBooksPageObject;
import utilities.UtilityClass;

public class LaptopNoteBookStepDefinitions extends Base {

	LaptopsNoteBooksPageObject laptops = new LaptopsNoteBooksPageObject();
	HomePageObject home = new HomePageObject();

	@When("User click on Laptop and NoteBook tab")
	public void user_click_on_laptop_note_book_tab() {
		home.clickLaptopsNotebooks();
	}

	@When("User click on Show all Laptop and NoteBook option")
	public void user_click_on_show_all_laptop_and_note_book_option() {
		home.clickShowAllLaptopsNotebooks();
	}

	@When("User click on MacBook  item")
	public void user_click_on_mac_book_item() {
		laptops.clickMacbookItem();
		UtilityClass.takeScreenShot();
	}

	@Then("User should see {string} showed to the cart")
	public void user_should_see_item_s_showed_to_the_cart(String str) {
		Assert.assertTrue(laptops.validateMacBookAddedToCart(str));
		UtilityClass.takeScreenShot();
	}

	@Then("User click on cart option")
	public void user_click_on_cart_option() {
		laptops.clickCartButtonMacBook();
		UtilityClass.takeScreenShot();
	}

	@Then("user click on red X button to remove the item from cart")
	public void user_click_on_red_x_button_to_remove_the_item_from_cart() {
		laptops.clickRemoveCartItemButton();
		UtilityClass.takeScreenShot();
	}

	@Then("item should be removed and cart should show {string}")
	public void item_should_be_removed_and_cart_should_show_item_s(String s) {
		Assert.assertTrue(laptops.validateEmptyCart(s));
		UtilityClass.takeScreenShot();
	}

	@When("User click on product comparison icon on MacBook Air")
	public void user_click_on_product_comparison_icon_on_mac_book_air() {
		laptops.clickCompareMacBookAir();
		UtilityClass.takeScreenShot();
	}
	@When("User click on product comparison icon on MacBook")
	public void user_click_on_product_comparison_icon_on_mac_book() {
		laptops.clickCompareMacBook();
		UtilityClass.takeScreenShot();
	}
	
	@Then("User click on Product comparison link")
	public void user_click_on_product_comparison_link() {
		laptops.clickProductComparison();
	}

	@Then("User should see Product Comparison Chart")
	public void user_should_see_product_comparison_chart() {
		Assert.assertTrue(driver.getTitle().equals("Product Comparison"));
		Assert.assertTrue(laptops.validateProductComparisonChart());
		UtilityClass.takeScreenShot();
	}

	@When("User click on heart icon to add Sony VaIO laptop to wish list")
	public void user_click_on_heart_icon_to_add_sony_va_io_laptop_to_wish_list() {
		laptops.clickWishListSonyVaio();
	}

	@Then("User should get a message You must login or create an account to save Sony VAIO to your wish list!")
	public void user_should_get_a_message_you_must_login_or_create_an_account_to_save_sony_vaio_to_your_wish_list() {
		Assert.assertTrue(laptops.validateLoginAlert());
		UtilityClass.takeScreenShot();
	}

	@When("User click on MacBook Pro item")
	public void user_click_on_mac_book_pro_item() {
		laptops.clickMacBookPro();
	}

	@Then("User should see $ {double} price tag is present on UI.")
	public void user_should_see_$_price_tag_is_present_on_ui(Double price) {
		Assert.assertTrue(laptops.validateMacBookProPrice(price));
	}

	@Then("User should see a message Success: You have added {string} to your product comparison!")
	public void user_should_see_a_message_success_you_have_added_to_your_product_comparison(String string) {
		Assert.assertTrue(laptops.validateSuccessMessage(string));
		UtilityClass.takeScreenShot();
	}
}
