package com.svb.ic.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.svb.ic.base.TestBase;


public class LoginPage extends TestBase {

	//	public WebDriver driver;

	/**
	 * Different WebElements for Login page
	 */
	@FindBy(xpath="//input[@type='text']")
	public WebElement username;

	@FindBy(xpath="//input[@type='password']")
	public WebElement password;

	@FindBy(xpath="//button[@dx-button='dxOptions']")
	public WebElement loginButton;

	//	
	//	public LoginPage(WebDriver driver)throws IOException  {
	//		this.driver=driver;
	//		PageFactory.initElements(driver, this);
	//	}

	/*
	 * Initialize page factory method
	 */
	public LoginPage() throws IOException {
		PageFactory.initElements(driver, this);
	}

	/**
	 * Different action methods for respective WebElement
	 * @param
	 */
	public void enterUserName(String userName) {
		username.sendKeys(userName);
		
	}

	public void enterPassword(String pass) {
		password.sendKeys(pass);
	}

	public void clickLogin() {
		loginButton.click();
	}
	public void enterInvalidUserName(String invalidUserName) {
		username.sendKeys(invalidUserName);
	}

	public void enterInvalidPassword(String invalidPassword) {
		password.sendKeys(invalidPassword);
	}

	public DashboardPage login(String userName, String pass) throws IOException {	 
		username.sendKeys(userName);
		password.sendKeys(pass);
		loginButton.click();
		return new DashboardPage(driver);

	}
}
