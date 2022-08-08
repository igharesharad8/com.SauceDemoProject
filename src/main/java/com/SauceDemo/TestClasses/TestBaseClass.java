package com.SauceDemo.TestClasses;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.SauceDemo.POMClasses.LoginPOMClass;
import com.SauceDemo.UtilityClasses.ScreenshotClass;

public class TestBaseClass 
{
WebDriver driver;
	
    @Parameters("browserName")
	@BeforeMethod
	public void setUp(String browserName) throws IOException
	{
		if(browserName.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", 
				"./DriverFolder/chromedriver.exe");
		driver = new ChromeDriver();
		}
		else
		{
		System.setProperty("webdriver.gecko.driver", 
				"./DriverFolder/geckodriver.exe");
		driver = new FirefoxDriver();
		}
		
		
		
		
		System.out.println("Browser is opened");
	
		driver.manage().window().maximize();
		System.out.println("Browser is maximized");
				
		driver.get("https://www.saucedemo.com/");
		System.out.println("URL is opened");
		
		ScreenshotClass.takeScreenshot(driver);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
		//loginActivity
		LoginPOMClass lp = new LoginPOMClass(driver);
		lp.sendUsername();
		System.out.println("username is entered");
		
		lp.sendPassword();
		System.out.println("password is entered");
		
		lp.clickLoginButton();
		System.out.println("loginButton is clicked");
		
		ScreenshotClass.takeScreenshot(driver);
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		System.out.println("broswer is closed");
		
	}


}
