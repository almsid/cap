package stepDefinitions;

import org.junit.Assert;
import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.RetailPageObject;
import utilities.UtilityClass;

public class RetailStepDefinitions extends Base {
	RetailPageObject retail = new RetailPageObject();

	@When("User click on Register for an Affiliate Account link")
	public void user_click_on_register_for_an_affiliate_account_link() {
		retail.clickAffiliateLink();
	}

	@When("User fill affiliate form with below information {string} {string} {string} {string} {string}")
	public void user_fill_affiliate_form_with_below_information(String company, String website, String tax,
			String paymentMethod, String chequeName) {
		retail.fillCompany(company);
		retail.fillWebsite(website);
		retail.fillTax(tax);
		retail.chequePay();
		retail.enterchequePayeeName(chequeName);
	}

	@When("User check on About us check box")
	public void user_check_on_about_us_check_box() {
		retail.clickAboutUsCheckBox();
		UtilityClass.takeScreenShot();
	}

	@When("User click on Continue button")
	public void user_click_on_continue_button() {
		retail.clickContinueButton();
	}

	@Then("User should see a success message")
	public void user_should_see_a_success_message() {
		Assert.assertTrue(retail.successValidation());
		UtilityClass.takeScreenShot();
	}

	@When("User click on Edit your affiliate information link")
	public void user_click_on_edit_your_affiliate_information_link() {
		retail.clickEditAffiliate();
	}

	@When("user click on Bank Transfer radio button")
	public void user_click_on_bank_transfer_radio_button() {
		retail.bankPay();
		UtilityClass.takeScreenShot();
	}

	@When("User fill Bank information with information {string} {string} {string} {string} {string}")
	public void user_fill_bank_information_with_information(String bankName, String bankABA, String bankSwift,
			String accountName, String accountNumber) {
		retail.enterBankName(bankName);
		retail.enterBankABA(bankABA);
		retail.enterBankSwift(bankSwift);
		retail.enterBankAccountName(accountName);
		retail.enterBankAccountNumber(accountNumber);
		UtilityClass.takeScreenShot();
	}

	@When("User click on ‘Edit your account information’ link")
	public void user_click_on_edit_your_account_information_link() {
		retail.clickEditAccountLink();
	}

	@When("User modify information {string} {string} {string} {string}")
	public void user_modify_information(String fname, String lname, String email, String telephone) {
		retail.editFirstName(fname);
		retail.editLastName(lname);
		retail.editEmail(email);
		retail.editTelephone(telephone);
		UtilityClass.takeScreenShot();
	}

}
