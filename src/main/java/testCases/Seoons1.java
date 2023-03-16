package testCases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.RegisterAccount;
import testBase.Base;

public class Seoons1 extends Base {
	
	RegisterAccount rc;
	HomePage hp;
	
	@BeforeClass
	public void initiateDriver() {
		InitateBrowser();
	}
	
	@BeforeMethod
	public void OpenUrl() {
		driver.get("https://qa.seoons.com/");
	}
	
	@Test(description="creating new user")
	public void CreateUser() {
		//hp = new HomePage();
		//hp.myaccount();
		//rc = hp.register();
		//rc.CreateNewUser("Varsha", "Akka", "deepakandu96@gmail.com","123456789", "Deepak@100");
		Assert.assertEquals(true, false, "this method failed");
	}
	
	@Test(description="creating another new user",alwaysRun= true, dependsOnMethods="CreateUser" ) 	
	public void CreateUser1() {
		//hp = new HomePage();
		//hp.myaccount();
		//rc = hp.register();
		//rc.CreateNewUser("D", "Krish", "deepakandu96@gmail.com","123456789", "Deepak@100");
		Assert.assertEquals(true, false);
	}

	@AfterClass
	public void quit() {
		driver.quit();	
	}
}
