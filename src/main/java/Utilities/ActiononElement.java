package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class ActiononElement {
	
	public static void clickButton(WebDriver driver, By locater) {
		
		try	{
			driver.findElement(locater).click();
		}
		catch (NoSuchElementException e) {
            e.printStackTrace();
		}
	}
	
	public static void enterText(WebDriver driver, By locater, String value) {
		try	{
			driver.findElement(locater).sendKeys(value);
		}
		catch (NoSuchElementException e) {
            e.printStackTrace();
		}
		
	}

}
