import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class landingpage {
public WebDriver driver;
	
	By Signin =By.cssSelector("a[href='sign in']");
	
	public WebElement login()
	{
		return driver.findElement(Signin);
	}
}
