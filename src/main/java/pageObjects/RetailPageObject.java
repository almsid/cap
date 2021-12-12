package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class RetailPageObject extends Base {

	public RetailPageObject() {
		PageFactory.initElements(driver, this);
	}
	
	// ********* ELEMENTS **************
	
	@FindBy(xpath = "//a[text()='Register for an affiliate account']")
	private WebElement affiliateAccountLink;
	@FindBy(id = "input-company")
	private WebElement affilitateCompany;
	@FindBy(id = "input-website")
	private WebElement affiliateWebsite;
	@FindBy(id = "input-tax")
	private WebElement affiliateTax;
	@FindBy(xpath = "//input[@value='cheque']")
	private WebElement chequeRadio;
	@FindBy(id = "input-cheque")
	private WebElement chequePayeeName;
	@FindBy(xpath = "//input[@value='paypal']")
	private WebElement paypalRadio;
	@FindBy(name = "paypal")
	private WebElement paypalAccount;
	@FindBy(xpath = "//input[@value='bank']")
	private WebElement bankRadio;
	@FindBy(name = "bank_name")
	private WebElement bankName;
	@FindBy(name = "bank_branch_number")
	private WebElement bankABANumber;
	@FindBy(name = "bank_swift_code")
	private WebElement bankSwift;
	@FindBy(name = "bank_account_name")
	private WebElement bankAccountName;	
	@FindBy(name = "bank_account_number")
	private WebElement bankAccountNumber;
	@FindBy(xpath = "//input[@name='agree']")
	private WebElement aboutUsCheckbox;
	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement continueButton;
	@FindBy(xpath = "//*[text()= ' Success: Your account has been successfully updated.']")
	private WebElement successMessage;
	@FindBy(xpath = "//a[text()='Edit your affiliate information']")
	private WebElement editAffiliateInformation;
	@FindBy(xpath = "//a[text()='Edit your account information']")
	private WebElement editAccountLink;
	@FindBy(id = "input-firstname")
	private WebElement accountInfoFirstName;
	@FindBy(id = "input-lastname")
	private WebElement accountInfoLastName;
	@FindBy(id = "input-email")
	private WebElement accountInfoEmail;
	@FindBy(id = "input-telephone")
	private WebElement accountInfoTelephone;

	// *********** MEHTODS ************

	public void clickAffiliateLink() {
		affiliateAccountLink.click();
	}

	public void fillCompany(String str) {
		affilitateCompany.sendKeys(str);
	}

	public void fillWebsite(String str) {
		affiliateWebsite.sendKeys(str);
	}

	public void fillTax(String str) {
		affiliateTax.sendKeys(str);
	}

	public void chequePay() {
		chequeRadio.click();
	}

	public void paypalPay() {
		paypalRadio.click();
	}

	public void bankPay() {
		bankRadio.click();
	}

	public void enterchequePayeeName(String str) {
		chequePayeeName.clear();
		chequePayeeName.sendKeys(str);
	}

	public void clickAboutUsCheckBox() {
		aboutUsCheckbox.click();
	}

	public void clickContinueButton() {
		continueButton.click();
	}

	public boolean successValidation() {
		if (successMessage.isDisplayed())
			return true;
		else
			return false;
	}
	public void clickEditAffiliate() {
		editAffiliateInformation.click();
	}
	public void enterPayPalAccount(String str) {
		paypalAccount.clear();
		paypalAccount.sendKeys(str);
	}
	public void enterBankName(String str) {
		bankName.clear();
		bankName.sendKeys(str);
	}
	public void enterBankABA(String str) {
		bankABANumber.clear();
		bankABANumber.sendKeys(str);
	}
	public void enterBankSwift(String str) {
		bankSwift.clear();
		bankSwift.sendKeys(str);
	}
	public void enterBankAccountName(String str) {
		bankAccountName.clear();
		bankAccountName.sendKeys(str);
	}
	public void enterBankAccountNumber(String str) {
		bankAccountNumber.clear();
		bankAccountNumber.sendKeys(str);
	}
	public void clickEditAccountLink() {
		editAccountLink.click();
	}
	public void editFirstName(String str) {
		accountInfoFirstName.clear();
		accountInfoFirstName.sendKeys(str);
	}
	public void editLastName(String str) {
		accountInfoLastName.clear();
		accountInfoLastName.sendKeys(str);
	}
	public void editEmail(String str) {
		accountInfoEmail.clear();
		accountInfoEmail.sendKeys(str);
	}
	public void editTelephone(String str) {
		accountInfoTelephone.clear();
		accountInfoTelephone.sendKeys(str);
	}
}
