package PageObjectModel; //Design Pattern

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage 
{
	public WebDriver driver;
	
	By username=By.xpath("//input[@id='username']");
	By password = By.xpath("//input[@id='password']");
	By login = By.xpath("//input[@type='submit']");
		
	public LoginPage(WebDriver driver2) 
	{
		this.driver=driver2; //refer to current obj
	}

	public WebElement enterusername()
	{
		return driver.findElement(username);
	}
	
	public WebElement enterpassword() 
	{
		return driver.findElement(password);
	}

	public WebElement login() 
	{
		return driver.findElement(login);
	}
			
}
