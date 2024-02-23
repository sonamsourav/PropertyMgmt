package seleniumproject.authentication;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {

	public WebDriver driver;
	@SuppressWarnings("deprecation")
	public WebDriver intilizedriver() throws IOException
	{
		
		Properties prop = new Properties();
		FileInputStream fis= new FileInputStream("D:\\seleniumproject\\java\\seleniumproject\\authentication\\data.properties");
		prop.load(fis);
	String browsername=	prop.getProperty("browser");
	
	if(browsername.equals("chrome")) {
		
		System.setProperty("webdriver.chrome.driver", "D://seleniumproject//chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
	}
	else if (browsername.equals("firefox")) {
		
		System.setProperty("webdriver.gecko.driver", "D://seleniumproject//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
	}
	else if (browsername.equals("IE")) {
		
	}
	
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
	return driver;
	}
	
}
