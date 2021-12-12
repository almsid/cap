package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class HomePageObject extends Base {
	
	public HomePageObject () {
		PageFactory.initElements(driver, this);
	}
	// Currency
	@FindBy (xpath = "//button/span[text()='Currency']")
	private WebElement currencyButton;
	@FindBy(xpath = "//button[@name = 'EUR']")
	private WebElement currencyEuro;
	@FindBy (xpath = "//button[@name = 'GBP']")
	private WebElement currencyPound;
	@FindBy(xpath = "//button[@name = 'USD']")
	private WebElement currencyDollar;
	@FindBy (xpath = "//button/strong[text()='€']")
	private WebElement signEuro;
	
	//Shopping Cart
	@FindBy (xpath = "//a[@title = 'Shopping Cart']")
	private WebElement shoppingCartLink;
	@FindBy (xpath = "//button/*[contains(text(),\"0 item(s)\")]")
	private WebElement shoppingCartButton;
	@FindBy (xpath = "//p[text()= \"Your shopping cart is empty!\"]")
	private WebElement emptyCart;
	
	// Search bar and button
	@FindBy(xpath = "//input[@name = 'search']")
	private WebElement searchBar;
	@FindBy (xpath = "//button[@type= 'button' and @class = 'btn btn-default btn-lg']")
	private WebElement searchButton;
	
	
	//My Account
	@FindBy (xpath = "//a[@title = 'My Account']")
	private WebElement myAccount;
	@FindBy (xpath = "//a[text() = 'Register']")
	private WebElement register;
	@FindBy (xpath = "//a[text() = 'Login']")
	private WebElement login;

	//Main menu
	//Desktops
	@FindBy (xpath = "//a[text() = 'Desktops']")
	private WebElement desktops;
	@FindBy (xpath = "//a[contains(text(), 'PC (')]")
	private WebElement pcDesktop;
	@FindBy (xpath = "//a[contains(text(), 'Mac (')]")
	private WebElement macDesktop;
	@FindBy (xpath = "//a[text()= 'Show All Desktops']")
	private WebElement showAllDesktops;
	
	//Laptops and NoteBooks
	@FindBy (xpath = "//a[text() = 'Laptops & Notebooks']")
	private WebElement laptopsNotebooks;
	@FindBy (xpath = "//a[contains(text(), 'Windows (')]")
	private WebElement windowsNotebook;
	@FindBy (xpath = "//a[contains(text(), 'Macs (')]")
	private WebElement macsNotebook;
	@FindBy (xpath = "//a[text()= 'Show All Laptops & Notebooks']")
	private WebElement showAllNotebooks;
	
	//Components
	@FindBy (xpath = "//a[text()='Components']")
	private WebElement components;
	@FindBy (xpath = "//a[contains(text(), 'Mice and ')]")
	private WebElement miceTrackballs;
	@FindBy (xpath = "//a[contains(text(),'Monitors (')]")
	private WebElement monitors;
	@FindBy (xpath = "//a[contains(text(), 'Printers (')]")
	private WebElement printers;
	@FindBy (xpath = "//a[contains(text(), 'Scanners (')]")
	private WebElement scanners;
	@FindBy (xpath = "//a[contains(text(), 'Web Cameras ')]")
	private WebElement webCameras;
	@FindBy (xpath = "//a[text() = 'Show All Components']")
	private WebElement showAllComponents;
		
	//Tablets
	@FindBy (xpath =  "//a[text() = 'Tablets']")
	private WebElement tablets;
	
	//Software
	@FindBy (xpath = "//a[text()= 'Software']")
	private WebElement software;
	
	// Phones and PDAs
	@FindBy (xpath = "//a[text () = 'Phones & PDAs']")
	private WebElement phonesPDA;
	
	//Cameras
	@FindBy (xpath = "//a[text() = 'Cameras']")
	private WebElement cameras;
	@FindBy (xpath = "//a[contains(text(), 'Canon ')]")
	private WebElement canon;
	@FindBy (xpath = "//a[contains(text(), 'Nikon (')]")
	private WebElement nikon;
	@FindBy (xpath = "//a[text()= 'Show All Cameras']")
	private WebElement showAllCameras;
	
	//MP3 Players
	@FindBy (xpath = "//a[text() = 'MP3 Players']")
	private WebElement mp3Players;
	
	@FindBy (xpath = "//a[text() = 'Show All MP3 Players']")
	private WebElement showAllMP3Players;
	//---------------------------------------------------------------
	
	public void clickOnDesktops () {
		desktops.click();
	}
	public void clickonShowAllDesktops() {
		showAllDesktops.click();
	}
	
	public void clickCurrency() {
		currencyButton.click();
	}
	public void clickEuro() {
		currencyEuro.click();
	}
	public boolean validateCurrencyEuro() {
		if (signEuro.isDisplayed())
			return true;
		else 
			return false;
	}
	public void clickShoppingCart() {
		shoppingCartButton.click();
	}
	public boolean validateEmptyCart() {
		if (emptyCart.isDisplayed())
			return true;
		else
			return false;
	}
	public void clickLaptopsNotebooks() {
		laptopsNotebooks.click();
	}
	public void clickShowAllLaptopsNotebooks() {
		showAllNotebooks.click();
	}
}
