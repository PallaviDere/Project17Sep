package TestCasesPackage;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.TestBase;
import PagesPackage.LoginPage;
public class LoginPageTest extends TestBase {
		
	LoginPage login;//	=	new	LoginPage();
	@BeforeMethod
	public void setup() throws Exception 
	{
	initalization();
	login =	new	LoginPage();
	}
	@Test(enabled = false)
	public void verifyTitleTest() throws Exception
	{
	String expTitle = "Swag Labs";
	String actTitle = login.verifyTitle();
	Assert.assertEquals(expTitle,actTitle);
	}
	@Test(enabled = false)
	public void verifyUrlTest1() throws Exception
	{
	String expTitle	= "Swag Labs";
	
			String actTitle	= login.verifyTitle();
	Assert.assertEquals(expTitle,actTitle);
	}
	
	@Test
	public void loginToAppTest() throws Exception
	{
		String expRes = "https://www.saucedemo.com/inventory.html";
		String actRes = login.loginToApp();
		Assert.assertEquals(expRes,actRes);
	}
	@AfterMethod
	public void closeBrowser()
	{
	driver.close();
}
	}
