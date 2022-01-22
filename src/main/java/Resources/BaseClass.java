package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass 
{
	public WebDriver driver;
	
	public WebDriver DriverInitalize() throws IOException //Replaced with void with web driver because void not return any thing
	{
		Properties Prop = new Properties();
		FileInputStream FIS=new FileInputStream("C:\\Users\\Rupes\\eclipse-workspace\\SeleniumDemo\\src\\main\\java\\Resources\\Data.properties");
		
		Prop.load(FIS);
		String BrowserName=Prop.getProperty("Browser");
		
		if (BrowserName.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rupes\\OneDrive\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (BrowserName.equals("Firefox"))
		{
			//Firefox code will be written
		}
		else if  (BrowserName.equals("InternetExplorer"))
		{
			//IE code 
		}
		
		return driver;
			
	
	}
	

}
