package steps;

import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.annotation.After;
import cucumber.annotation.Before;
import cucumber.annotation.en.*;
import junit.framework.Assert;
import pages.action.SearchPageActions;

public class SearchPageSteps {
	
	WebDriver driver;
	SearchPageActions searchPage = new SearchPageActions(driver);
	ResourceBundle element = ResourceBundle.getBundle("Search_TestData");
	ResourceBundle config = ResourceBundle.getBundle("Config");
	

	@Before
	public void startBrowser() {
		if (config.getString("browser").equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else {
			System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
	}
	
	@After
	public void closeBrowser() {
		driver.quit();
	}
	
	
	@Given("^I am a user of Huddle$")
	public void I_am_a_user_of_Huddle() throws Throwable {
		// Code to verify if the user is logged in by valid credentials of huddle
	}

	@When("^I launch into uk.ask.com$")
	public void I_launch_into_uk_ask_com() throws Throwable {
		driver.get(config.getString("appURL"));
		Assert.assertTrue("Error in opening the Url", searchPage.getPageTitle(driver,element.getString("pageTitle")));		
	}

	@When("^Search for the keyword$")
	public void Search_for_the_keyword() throws Throwable {
		searchPage.enterKeyword(driver, element.getString("searchKeyword"));
		searchPage.clickSubmit(driver);
	}

	@Then("^I should be able to see the matching keyword in the search results$")
	public void I_should_be_able_to_see_the_matching_keyword_in_the_search_results() throws Throwable {
		Assert.assertTrue("The search didn't returned the desired keword", searchPage.valKeywordExist(driver));		
	}

}
