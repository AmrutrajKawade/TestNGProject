package FinalDemo;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjectModel.LoginPage;
import Resources.BaseClass;

public class LoginTestCase extends BaseClass
{
	@Test(dataProvider="getdata")
	public void demo1(String username,String password) throws IOException
	{
		driver=DriverInitalize();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().window().maximize();
		
		LoginPage obj = new LoginPage(driver);//adding scope
		obj.enterusername().sendKeys(username);
		obj.enterpassword().sendKeys(password);
		obj.login().click();
		
	}
	
	@DataProvider
	public Object[][] getdata()
	{
		Object[][] obj=new Object[2][2];
		obj[0][0]="Test";
		obj[0][1]="Password1";
		obj[1][0]="Test1";
		obj[1][1]="Password123";
		return obj;
		
	}
	
}
