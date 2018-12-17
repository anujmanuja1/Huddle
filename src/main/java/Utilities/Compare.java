package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Compare {
	
	public static boolean validateElementExistByXpath(WebDriver driver, By value) {
		boolean output=false;
		try	{
			driver.findElement(value);
			output=true;
		}
		catch(Exception e){}
			return output;
	}
	
	public static boolean getPageTitle(WebDriver driver, String value) {
		boolean output = false;
		if (value.equalsIgnoreCase(driver.getTitle().trim())) {
			output  = true;
		}
		return output;
	}
	
	 
}
