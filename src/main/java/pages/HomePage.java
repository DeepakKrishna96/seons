package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.Base;
import testUtility.ExceptionHandling;

public class HomePage extends Base {
	
	@FindBy(xpath = "//a[text()='Refer and Earn']")
	WebElement ReferAndEarn;
	
	@FindBy(xpath = "//a[text()='T-Shirts']")
	WebElement TShirts;
	
	@FindBy(xpath = "//strong[text()='Motivational']")
	WebElement Motivational;

	@FindBy(xpath = "//strong[text()='Gym']")
	WebElement Gym;
	
	@FindBy(xpath = "//strong[text()='Gamers']")
	WebElement Gamer;
	
	@FindBy(xpath = "//strong[text()='Bikers']")
	WebElement Bikers;
	
	@FindBy(xpath = "//strong[text()='Travelling']")
	WebElement Travelling;
	
	@FindBy(xpath = "//strong[text()='Relationship']")
	WebElement Relationship;
	
	@FindBy(xpath = "//strong[text()='Legends']")
	WebElement Legends;
	
	@FindBy(xpath = "//div[@id='my-account']")
	WebElement MyAccount;
	
	@FindBy(xpath= "//a[text()='Register']")
	WebElement ClickRegister;
	
	@FindBy(xpath= "//a[text()='Login']")
	WebElement ClickLogin;
	
	@FindBy(xpath = "//a[text()='Log out']")
	WebElement Logout;
	
	public HomePage() {

		PageFactory.initElements(driver, this);
	}
	
	public void referandearn() {
		ReferAndEarn.click();
	}
	
	public void tshirt() {
		TShirts.click();
	}
	
	public void motivational() {
		Motivational.click();
	}
	
	public void gym() {
		Gym.click();
	}
	
	public void gamer() {
		Gamer.click();
	}
	
	public void biker() {
		Bikers.click();
	}
	
	public void travelling() {
		Travelling.click();
	}
	
	public void relationship() {
		Relationship.click();
	}
	
	public void legends() {
		Legends.click();
	}
	
	public void displayHomePage() {
		
		this.referandearn();
		this.tshirt();
		this.motivational();
		this.gym();
		this.gamer();
		this.biker();
		this.travelling();
		this.relationship();
		this.legends();
		
		
	}
	
	public void myaccount() {
		//using action lass
		act.moveToElement(MyAccount).click().build().perform();
		//ExceptionHandling.ClickElement(MyAccount);
		//MyAccount.click();
	}
	
	public RegisterAccount register() {
		ExceptionHandling.ClickElement(ClickRegister);
		//ClickRegister.click();
		return new RegisterAccount();
	}                                          
	
	public void login() {
		ClickLogin.click();
	}
	
	public void logout() {
		ExceptionHandling.ClickElement(Logout);
		//Logout.click();
	}
	
	
}













//narayanmurthy , elonmusk

