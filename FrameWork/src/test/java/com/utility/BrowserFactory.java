package com.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
	
 //WebDriver driver;
	
	public static WebDriver start_application( WebDriver driver, String browserName, String appUrl){
		
		if (browserName.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		else	if (browserName.equalsIgnoreCase("IE"))
		{
			System.setProperty("", "");
			driver = new ChromeDriver();
			
		}
		else if (browserName.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("", "");
			driver = new ChromeDriver();
			
		}
		else
		{
			System.out.println("Browser is not supported");
			
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get(appUrl);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
	}
 
	
	public static void close_session(WebDriver driver){
		
		driver.quit();	
		}
	
}
