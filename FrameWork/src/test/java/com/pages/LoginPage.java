package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	WebDriver driver;
	
	public void LoginPage(WebDriver ldriver)
	
	{
		this.driver=ldriver;
		
	}
	
	@FindBy(name="email") WebElement uname;
	@FindBy(name="password") WebElement password;
	@FindBy(xpath="//div[text()='Login']") WebElement loginButton;


	public void loginToCrm(String usernameApp, String passApp) {
		
		uname.sendKeys(usernameApp);
	//	Thread.sleep(3000);
		password.sendKeys(passApp);
		loginButton.click();
		
	}
}
