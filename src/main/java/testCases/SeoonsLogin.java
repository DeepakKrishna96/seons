package testCases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.RegisterAccount;
import testBase.Base;

public class SeoonsLogin extends Base {
	
	RegisterAccount rc;
	HomePage hp;
	LoginPage lp;
	
	@BeforeClass
	public void initiateDriver() {
		InitateBrowser();
	}
	
	@BeforeMethod
	public void OpenUrl() {
		driver.get("https://qa.seoons.com/");
	}
	
	@Test
	public void LoginUser1() {
		hp.myaccount();
		hp.login();
		//LoginPage.Login();
		lp.UserLogin("abc@gmail.com", "abcd123");
	}
	
	@Test
	public void LoginUser2() {
		hp.myaccount();
		hp.login();
		lp.UserLogin("abcdef@gmail.com", "abcdef123");
	}

	@AfterTest
	public void quit() {
		//driver.quit();
	}
	
}
