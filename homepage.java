
import java.io.IOException;

import org.openqa.selenium.*;
import org.testng.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import seleniumproject.authentication.base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class homepage extends loginpage {

	private WebDriver driver;
	
	@Test
	public void homepageinitilise() throws IOException
	{
		// Setup web driver instance path.
	driver=	intilizedriver();
		System.out.println("this is homepag intilization test");
		driver.get("www.entrata.com");
		
		landingpage lp =new landingpage();
		//clicking on homepage signin button
		lp.login().click();
		loginpage log= new loginpage();
		log.getusername().sendKeys("abcdef");
		log.password().sendKeys("qwerty");
		log.login().click();
	}
	
	@Test
	public void validatetitle()
	{
		//driver.manage().window().maximize();
		System.out.println("this is validating page");
		driver.findElement(By.linkText("signin")).click();
		String expectedurl ="www.entrata.com/signin";
		String actualurl= driver.getCurrentUrl();
		Assert.assertEquals(actualurl, expectedurl);
		return;
		
		
	}
	@Test
	void invalidlogin()
	{
		driver.manage().window().maximize();
		driver.get("https://www.entrata.com");
		System.out.println("this is launching login page");
		driver.findElement(By.linkText("signin")).click();
		String expectedurl ="www.entrata.com/signin";
		String actualurl= driver.getCurrentUrl();
		Assert.assertEquals(actualurl, expectedurl);
		driver.findElement(By.id("wrongusername")).sendKeys("abc");
		driver.findElement(By.className("wrongpassword")).sendKeys("password");
	
}
	@AfterTest 
	public void teardown()
	{
		driver.quit();
	}
}