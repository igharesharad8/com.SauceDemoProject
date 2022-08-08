package com.SauceDemo.TestClasses;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Practice11 
{
	@Test()
	public void loginTest()
	{  
		String expectedTitle = "Swag Labs";
		String actualTitle = " Labs";
		
		//soft
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(actualTitle, expectedTitle,"Titles are not matching");
		
		//while using soft assertion always remember
		//to get actual results always use
		//assertAll();
		
		soft.assertAll();
	
	}

}
