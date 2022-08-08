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

public class TC03VerifyBagProductAddToCartFunctionality extends TestBaseClass 
{

	
	@Test
	public void verifyBagProductAddToCart()
	{		
		//homePage
		HomePOMClass hp = new HomePOMClass(driver);
		hp.clickBagButton();
		System.out.println("clicked on Bag Button");
		
		//validation
		//addToCart-text-->getText
		
		String expectedCount = "1";  //given
		String actualCount= hp.getTextFromAddToCart();
		
		Assert.assertEquals(actualCount, expectedCount);
	}
	
	

}
