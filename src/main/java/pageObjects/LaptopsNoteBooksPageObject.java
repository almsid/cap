package pageObjects;

import java.text.NumberFormat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LaptopsNoteBooksPageObject extends Base {

	public LaptopsNoteBooksPageObject () {
		PageFactory.initElements(driver, this);
	}
		
	@FindBy (xpath = "//a[text()='MacBook']")
	private WebElement macbookItem;
	@FindBy (xpath = "//button[@id='button-cart']")
	private WebElement buttonAddToCart;
	@FindBy (xpath = "//div[@class= 'alert alert-success alert-dismissible' and text()=' Success: You have added ']")
	private WebElement successMessage;
	@FindBy (xpath = "//span[@id='cart-total' and text()=' 1 item(s) - $602.00']")
	private WebElement addedToCartMacbook;
	@FindBy (xpath = ("//button[@title='Remove']"))
	private WebElement buttonCartRemoveItem;
	@FindBy (xpath = ("//span[@id='cart-total' and text()=' 0 item(s) - $0.00']"))
	private WebElement emptyCart;
	@FindBy (xpath = "//button[@onclick= \"compare.add('44');\"]")
	private WebElement compareMacBookAir;
	@FindBy (xpath = "//button[@onclick= \"compare.add('43');\"]")
	private WebElement compareMacBook;
	@FindBy (xpath = "////a[text()='product comparison']")
	private WebElement productComparisonLink;
	@FindBy (xpath = "//div[@id='product-compare']//*[text()='Product Comparison']")
	private WebElement prodcutComparisonPageHeading;
	@FindBy (xpath = "//button[@onclick= \"wishlist.add('46');\"]")
	private WebElement wishListSonyVaio;
	@FindBy (xpath = "//div[@class='alert alert-success alert-dismissible' and a[text()='login'] and a[text()='create an account']]")
	private WebElement alertToLogin;
	@FindBy (xpath = "//a[text()='MacBook Pro']")
	private WebElement macBookPro;
	@FindBy (xpath = "//h2[text()='$2,000.00']")
	private WebElement macBookProPrice;
	//************ METHODS ******************
	public void clickMacbookItem() {
		macbookItem.click();
	}
	public void clickButtonAddToCart() {
		buttonAddToCart.click();
	}
	public boolean validateSuccessMessage(String itemName) {
		if (successMessage.isDisplayed())
			return true;
		else 
			return false;
		//if (successMessage.findElement(By.linkText(itemName)).isDisplayed())
	}
	public boolean validateMacBookAddedToCart(String str) {
		if (addedToCartMacbook.getText().contains(str))
			return true;
		else return false;
	}
	public void clickCartButtonMacBook() {
		addedToCartMacbook.click();
	}
	public void clickRemoveCartItemButton() {
		buttonCartRemoveItem.click();
	}
	public boolean validateEmptyCart(String s) {
		if (emptyCart.getText().contains(s))
			return true;
		else return false;
	}
	public void clickCompareMacBookAir() {
		compareMacBookAir.click();
	}
	public void clickCompareMacBook() {
		compareMacBook.click();
	}
	public void clickProductComparison () {
		productComparisonLink.click();
	}
	public boolean validateProductComparisonChart() {
		if (prodcutComparisonPageHeading.isDisplayed())
			return true;
		else return false;
	}
	public void clickWishListSonyVaio() {
		wishListSonyVaio.click();
	}
	public boolean validateLoginAlert() {
		if (alertToLogin.isDisplayed())
			return true;
		else return false;
	}
	public void clickMacBookPro() {
		macBookPro.click();
	}
	public boolean validateMacBookProPrice(Double price) {
		NumberFormat priceDollar = NumberFormat.getCurrencyInstance();
		if (macBookProPrice.getText().equals(priceDollar.format(price)))
			return true;
		else return false;
	}
}	
