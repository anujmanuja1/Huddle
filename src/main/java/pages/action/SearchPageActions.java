package pages.action;

import java.util.ResourceBundle;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Utilities.ActiononElement;
import Utilities.Compare;

public class SearchPageActions {
	WebDriver driver;
	ResourceBundle element = ResourceBundle.getBundle("Search_TestData");
	By textToSearch = By.id("search-box");
	By submit = By.className("sb-button");
	By outputKeyword = By.xpath("//p[contains(text(),'collaboration software')]");
	
	public SearchPageActions(WebDriver driver){
		this.driver=driver;
	}
	
	public void enterKeyword (WebDriver driver, String value) {
		ActiononElement.enterText(driver, textToSearch , value);
	}	
		
	public void clickSubmit (WebDriver driver) {
		ActiononElement.clickButton(driver, submit);
	}
	
	public boolean valKeywordExist (WebDriver driver) {
		return Compare.validateElementExistByXpath(driver, outputKeyword);
	}

	public boolean getPageTitle (WebDriver driver, String value) {
		System.out.println(driver.getTitle());
		return Compare.getPageTitle(driver, value);
	}	
	
}
