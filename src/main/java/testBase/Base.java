package testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Base {
	
	// Driver initiate
	// this class is parent class , will extended in all other classes
	
	public static WebDriver driver;		//declare variable (driver)
	public static Actions act;
	
	public void InitateBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\Selenium Practise\\chromedriver.exe");
		driver = new ChromeDriver();  //initiate variable
		driver.manage().window().maximize();
		act = new Actions(driver); 
		
		
	}
	

}
