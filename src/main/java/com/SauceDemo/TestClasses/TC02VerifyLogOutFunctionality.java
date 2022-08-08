package com.SauceDemo.TestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SauceDemo.POMClasses.HomePOMClass;
import com.SauceDemo.POMClasses.LoginPOMClass;

public class TC02VerifyLogOutFunctionality extends TestBaseClass
{
	
	@Test
	public void verifyLogOut() 
	{
		
		//HomePage
		//settingBtn+logOutBtn-->HomePOM
		
		HomePOMClass hp = new HomePOMClass(driver);
		hp.clickSettingButton();
		System.out.println("clicked on setting button");
		
		hp.clickLogOutButton();
		System.out.println("clicked on logOut Button");
		
		//login page
		//validation
		String expectedTitle = "Swag Labs";	   //given	
		String actualTitle = driver.getTitle();  //actual
			
		Assert.assertEquals(actualTitle, expectedTitle);
	}
		

}
