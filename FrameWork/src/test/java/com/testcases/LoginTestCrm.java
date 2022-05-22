package com.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.pages.BaseClass;
import com.pages.LoginPage;
import com.utility.BrowserFactory;
import com.utility.ExcelData;

public class LoginTestCrm extends BaseClass{

	

	@Test
	public void loginApp() {

		// driver=BrowserFactory.start_application(driver, "Chrome",
		// "https://ui.freecrm.com/");
		
		ExcelData excel = new ExcelData();
		
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

	//	loginPage.loginToCrm("abc", "123456");
		
		loginPage.loginToCrm(excel.getStringData("Login", 0, 0), excel.getStringData("Login", 0, 1));

		// BrowserFactory.close_session(driver);
		
		System.out.println("Merge conflict related changes");

	}

}
