package com.svb.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
	
	public WebDriver driver;
	
	@FindBy(xpath="//input[@type='text']")
	public WebElement username;
	
	@FindBy(xpath="//input[@type='password']")
	public WebElement password;
	
	@FindBy(xpath="//button[@dx-button='dxOptions']")
	public WebElement loginButton;
	
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterUserName() {
		username.sendKeys("Autotestclient");
	}
	
	public void enterPassword() {
		password.sendKeys("Test@123456");
	}
	
	public void clickLogin() {
		loginButton.click();
	}
	public void enterInvalidUserName() {
		username.sendKeys("Autotestclienttt");
	}
	
	public void enterInvalidPassword() {
		password.sendKeys("Test@1234566");
	}
	
	

}
