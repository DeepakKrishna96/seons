package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.Base;

public class LoginPage extends Base {

	@FindBy(xpath = "//input[@name='email']")
	WebElement inputEmail;
	
	@FindBy(xpath = "//input[@name='password'] ")
	WebElement inputPassword;
	
	@FindBy(xpath = "//input[@value='Login']")
	WebElement buttonLogin;
	
	LoginPage() {
	PageFactory.initElements(driver, this);
	}
	
	public void Email(String email) {
		inputEmail.sendKeys(email);
	}
	
	public void Password(String password) {
		inputPassword.sendKeys(password);
	}
	
	public void Login() {
		buttonLogin.click();
	}
	
	
	
	// returns landing page object
	
	public HomePage UserLogin(String email, String Passwod) {
		this.Email("email");
		this.Password("Passwod");
		this.Login();
		
		return new HomePage();
		
	}
	
	
}
