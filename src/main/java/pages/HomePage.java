package pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath = "//a[@href='/']")
	WebElement HeaderLogo;
	
	@FindBy(xpath = "//a[@class='_21ljIi']")
	WebElement FooterLogo;
	
	@FindBy(xpath = "//a[@class='_1_3w1N']")
	WebElement LoginButton;
	
	@FindBy(xpath = "//a[@class='_3-PJz-']//span[contains(text(),'Become a Seller')]")
	WebElement BecomeSeller;
	
	@FindBy(xpath = "//span[normalize-space()='Cart']")
	WebElement Cart;
	
	@FindBy(xpath = "//button[@class='_2KpZ6l _2doB4z']")
	WebElement CloseLogin;
	
	@FindBy(xpath = "//input[@class='_3704LK']")
	WebElement SearchBar;
	
	@FindBy(xpath = "//button[@class='L0Z3Pu']")
	WebElement Searchbtn;
	
	@FindBy(xpath = "//div[@class='exehdJ']")
	WebElement MoretxtBtn;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean HeaderLogo() {
		HighLight.highLighterMethod(driver, HeaderLogo);
		return HeaderLogo.isDisplayed();
	}
	public boolean FooterLogo() {
		HighLight.highLighterMethod(driver, FooterLogo);
		return FooterLogo.isDisplayed();
	}
	public String GetTitle() {
		return driver.getTitle();
	}	
	public boolean LoginBtn() {
		HighLight.highLighterMethod(driver, LoginButton);
		return LoginButton.isDisplayed();
	}
	public boolean BecomeSlr() {
		HighLight.highLighterMethod(driver, BecomeSeller);
		return BecomeSeller.isDisplayed();
	}
	public boolean Cart() {
		HighLight.highLighterMethod(driver, Cart);
		return Cart.isDisplayed();
	}
	public boolean SearchBar() {
		HighLight.highLighterMethod(driver, SearchBar);
		return SearchBar.isDisplayed();
	}
	public boolean Searchbtn() {
		HighLight.highLighterMethod(driver, Searchbtn);
		return Searchbtn.isDisplayed();
	}
	public boolean MoretxtBtn() {
		HighLight.highLighterMethod(driver, MoretxtBtn);
		return MoretxtBtn.isDisplayed();
	}
	public void CloseClick() {
		CloseLogin.click();
	}
	
	
}

