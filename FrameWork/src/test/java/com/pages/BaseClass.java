package com.pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.utility.BrowserFactory;
import com.utility.ConfigDataProvider;

public class BaseClass {

	public WebDriver driver;
	public ConfigDataProvider config;

	@BeforeSuite
	public void setupSuite() {

		config = new ConfigDataProvider();
	}

	@BeforeClass
	public void setup() {

		//driver = BrowserFactory.start_application(driver, "Chrome", "https://ui.freecrm.com/");
		driver = BrowserFactory.start_application(driver, config.getBrowser(),config.getStagingUrl());
	}

	@AfterClass
	public void cleanup() {

		BrowserFactory.close_session(driver);
	}

}
