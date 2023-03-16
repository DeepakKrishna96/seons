package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import testBase.Base;
import testUtility.ExceptionHandling;

public class RegisterAccount extends Base {
		
	@FindBy(xpath= "//legend[text()='Your Details']/parent::fieldset//input[@name='firstname']")
	WebElement FirstName;
	
	@FindBy(xpath= "//legend[text()='Your Details']/parent::fieldset//input[@name='lastname']")
	WebElement lastName;
	
	@FindBy(xpath = "//legend[text()='Your Details']/parent::fieldset//input[@name='email']")
	WebElement email;
	
	@FindBy(xpath = "//legend[text()='Your Details']/parent::fieldset//input[@name='telephone']")
	WebElement Phoneno;
	
	//@FindBys(@FindBy(xpath = "//legend[text()='Set your Password']/parent::fieldset//input[@name='password']"))
	@FindBys(@FindBy(xpath = "//input[@placeholder='Password']"))
	List<WebElement> allElementpassword;
	WebElement Password;
	
	@FindBys(@FindBy(xpath = "//legend[text()='Set your Password']/parent::fieldset//input[@name='confirm']")) 
	List<WebElement> allElements;
	WebElement ConfirmPassword;
	
	@FindBys(@FindBy(xpath = "//input[@name='agree']"))
	WebElement CheckBox;
	
	@FindBy(xpath = "//input[@value='Continue']")
	WebElement ContinueButton;
	
	//create constructor - pagefactory
	public RegisterAccount(){
		PageFactory.initElements(driver, this);
	}
	
	public void editFirstName(String firstname) {
		FirstName.sendKeys(firstname);
	}
	
	public void editlastName(String lastnametext) {
		lastName.sendKeys(lastnametext);
	}
	
	public void editemail(String emailtext) {
		email.sendKeys(emailtext);
	}
	
	public void editPhoneno(String Phonenotext) {
		Phoneno.sendKeys(Phonenotext);
	}
	
	public void editPassword(String Passwordtext) {
		 //driver.findElements( By.xpath("//legend[text()='Set your Password']/parent::fieldset//input[@name='password']")).get(1).sendKeys(Passwordtext);;
		WebElement e = ExceptionHandling.HandleElementNotInteractable(allElementpassword);
		e.sendKeys(Passwordtext);
	}
	
	public void editConfirmPassword(String ConfirmPasswordtext) {
		WebElement e = ExceptionHandling.HandleElementNotInteractable(allElements);
		e.sendKeys(ConfirmPasswordtext);
		//allElements.get(1).sendKeys(ConfirmPasswordtext);
	}
	
	public void editCheckBox() {
		ExceptionHandling.ScrollwindowVertical();
		act.moveToElement(CheckBox).sendKeys(Keys.SPACE).build().perform();
		//CheckBox.click();
	}
	

	public void editContinueButton() {
		ContinueButton.click();
	}
	
	public void CreateNewUser(String firstname,String lastname,String email,String Phoneno, String Password)
	{
		this.editFirstName(firstname);	
		this.editlastName(lastname);
		this.editemail(email);
		this.editPhoneno(Phoneno);
		this.editPassword(Password);
		this.editConfirmPassword(Password);
		this.editCheckBox();
		this.editContinueButton();
		
	}
	
	
}







