package com.SauceDemo.TestClasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SauceDemo.POMClasses.LoginPOMClass;
import com.SauceDemo.UtilityClasses.ScreenshotClass;

public class TC01VerifyLoginFunctionality extends TestBaseClass
{
	
	@Test
	public void verifyLogin() throws IOException
	{
	
		//HomePage
		//Validation
        String expectedTitle = "Swag Labs";	   //given	
		String actualTitle = driver.getTitle();  //actual
		
		Assert.assertEquals(actualTitle, expectedTitle);
		
	}
		
	
}
