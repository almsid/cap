package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import core.Base;

public class DesktopsPageObject extends Base {

	public DesktopsPageObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[text() = 'Showing 1 to 12 of 12 (1 Pages)']")
	private WebElement validationOfDesktopItems;

	@FindBy(xpath = "//button[@onclick = \"cart.add('47', '1');\"]")
	private WebElement hpLP3065Cart;

	@FindBy(xpath = "//input[@name = 'quantity']")
	private WebElement quantity;

	@FindBy(xpath = "//button[@id = 'button-cart']")
	private WebElement addToCartButton;

	@FindBy(xpath = "//div[@class = 'alert alert-success alert-dismissible' and contains(text(), 'Success: You have added')]")
	private WebElement successMessage;

	@FindBy(xpath = "//button[@onclick = \"cart.add('30', '1');\"]")
	private WebElement canonEOS5DCart;

	@FindBy(name = "option[226]")
	private WebElement canonColor;
	
	@FindBy(xpath = "//a[text()='Canon EOS 5D']")
	private WebElement canonEOSItem;
	
	@FindBy(xpath = "//a[text()='Write a review']")
	private WebElement writeReview;

	@FindBy(xpath = "//input[@name='name']")
	public WebElement reviewName;

	@FindBy(xpath = "//textarea[@id='input-review']")
	public WebElement reviewText;

	@FindBy(xpath = "//input[@type='radio' and @value='1']")
	public WebElement rateBad;
	@FindBy(xpath = "//input[@type='radio' and @value='5']")
	public WebElement rateGood;

	@FindBy(id = "button-review")
	private WebElement submitReviewButton;

	@FindBy(xpath = "//*[text()=' Thank you for your review. It has been submitted to the webmaster for approval.']")
	private WebElement reviewSuccess;

	// ***************** METHODS *************************************
	public boolean validateDesktopItems() {
		if (validationOfDesktopItems.isDisplayed())
			return true;
		else
			return false;
	}

	public void addCartHpLP3065() {
		hpLP3065Cart.click();
	}

	public void quantityItem(Integer intQuantity) {
		quantity.clear();
		quantity.sendKeys(intQuantity.toString());
	}

	public void addToCart() {
		addToCartButton.click();
	}

	/*
	 * public boolean validateCart() { if (successMessage.isDisplayed()) return
	 * true; else return false; }
	 */

	public void addCartCanonEOS5D() {
		canonEOS5DCart.click();
	}

	public void selectCanonColor(String str) {
		Select dropdown = new Select(canonColor);
		dropdown.selectByVisibleText(str);
	}

	public boolean successMessageCart(String item) {
		if (successMessage.findElement(By.linkText(item)).isDisplayed())
			return true;
		else
			return false;
	}
	public void clickOnCanonEOS() {
		canonEOSItem.click();
	}
	public void writeReviewClick() {
		writeReview.click();
	}

	public void reviewNameAdd(String name) {
		reviewName.sendKeys(name);
	}

	public void reviewTextAdd(String text) {
		reviewText.sendKeys(text);
	}

	public void ratingReview(String rating) {
		if (rating.equalsIgnoreCase("Good"))
			rateGood.click();
		else
			rateBad.click();
			
	}

	public void submitReview() {
		submitReviewButton.click();
	}

	public boolean reviewSubmissionValidation() {
		if (reviewSuccess.isDisplayed())
			return true;
		else
			return false;
	}
}
