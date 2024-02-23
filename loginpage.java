
import java.io.IOException;

import org.openqa.selenium.*;
import org.testng.*;
import org.testng.annotations.Test;

import seleniumproject.authentication.base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class loginpage extends base {

	private WebDriver driver;
	
	
	By email =By.id("username");
	By password =By.cssSelector(("[id=password]"));
	By login = By.id("Submit");
	
	public WebElement login()
	{
		return driver.findElement(login);
	}

	
	public WebElement getusername()
	{
	return driver.findElement(email);	
	}
	public WebElement password()
	{
	return driver.findElement(password);	
	}
	
}
