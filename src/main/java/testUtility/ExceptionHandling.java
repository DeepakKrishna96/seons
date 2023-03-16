package testUtility;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import testBase.Base;

// In POM every class should extend Base class
public class ExceptionHandling extends Base {
	
	public static void ClickElement(WebElement element) {
		new WebDriverWait(driver, Duration.ofSeconds(5))
			.pollingEvery(Duration.ofSeconds(1))
		  .ignoring(ElementNotInteractableException.class)
		  .until(ExpectedConditions.elementToBeClickable(element) );
		
		element.click();
	}
	
	public static WebElement HandleElementNotInteractable(List<WebElement> elements) {
	System.out.println(elements);
		for(WebElement a:elements) {
			try {
				a.click();
				return a;	

			}catch(Exception e) {
				System.out.println("inside catch block");
				System.out.println(e.getClass());
			}
			}
		return null;
		}
	
	
	public static void ScrollwindowVertical() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");	}

}
