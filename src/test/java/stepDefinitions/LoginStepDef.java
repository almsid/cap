package stepDefinitions;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPageObject;

public class LoginStepDef extends Base {
	
	LoginPageObject loginPageObject = new LoginPageObject();
	
	@Given ("^User is on Retail website$")
	public void user_is_on_Retail_website() {
		String actualPageTitle = driver.getTitle();
		String expectedPageTitle = "TEK SCHOOL";
		//Assertion checks the expected vs the actual and will fail if it is not and stop test case
		Assert.assertEquals(expectedPageTitle, actualPageTitle);
		logger.info("Actual Title is matching with expected Title");
	}
	@When("^User click on MyAccount$")
	public void user_click_on_Myaccount() {
		loginPageObject.clickOnMyAccount();
		logger.info("User clicked on MyAccount");
	}
	
	@And("^User click on Login")
	public void user_click_on_Login_option() {
		loginPageObject.clickOnLogin();
		logger.info("User clicked on Login option");
	}
	
	@When("User enter username {string} and password {string}")
	public void user_enter_username_and_password (String uname, String password) {
		loginPageObject.enterEmailAndPassword(uname, password);
		logger.info("User "+uname + " and password "+password);
	}
	@And("^User click on Login button$")
	public void user_click_loginButton() {
		loginPageObject.clickOnLoginButton();
		logger.info("User clicked on Login Button");
	}
	@Then("^User should be logged in to MyAccount dashboard$")
	public void user_should_be_logged_in_to_Myaccount_dashboard() {
		Assert.assertTrue(loginPageObject.myAccountTextisPresent());
		logger.info("User logged in to My Account Dashboard");
	}
}
