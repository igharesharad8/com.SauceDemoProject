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

public class TC04VerifyMultipleProductAddToCarFunctionality extends TestBaseClass 
{

	@Test
	public void verifyMultipleProductAddToCart()
	{
		//homePage
		HomePOMClass hp = new HomePOMClass(driver);
		hp.clickAllProducts();
		System.out.println("all products are clicked");
		
		String expectedCount = "6";
		String actualCount =hp.getTextFromAddToCart();
		
		Assert.assertEquals(actualCount, expectedCount);
	}
	
	
	

}
