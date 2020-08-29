package com.svb.ic.stepDefinitions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.svb.ic.base.TestBase;
import com.svb.ic.pages.DashboardPage;
import com.svb.ic.pages.LoginPage;
import com.svb.ic.util.CommonUtilities;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginTest extends TestBase{

	//Remove system.out.println and implement log4j
	//WebDriver driver = null;
	WebDriverWait wait; 
	LoginPage login ; 
	public static Logger log = LogManager.getLogger(TestBase.class.getName());
	CommonUtilities util = new CommonUtilities();
	

	public LoginTest() throws IOException {
		super();
	}

	@Given("^invest cloud login page url$")
	public void invest_cloud_login_page_url() throws Throwable {

		login = new LoginPage();
		log.info("Invest Cloud Url Launch Successfully");
	}

	@When("^user enter username and password$")
	public void user_enter_username_and_password() throws Throwable {
		//login = new LoginPage(driver);	
		//System.out.println("Enter username and password");
		log.info("Enter username and password");
		login.enterUserName(prop.getProperty("clientUserName"));
		login.enterPassword(prop.getProperty("clientPassword"));

	}

	@And("^Clicks on login button$")
	public void clicks_on_login_button() throws Throwable {
		//System.out.println("Click on Login Button");
		log.info("Click on Login Button");
		login.clickLogin();
	}

	@Then("^user is navigated to home page$")
	public void user_is_navigated_to_home_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		//System.out.println("Login Successfully..");
		//System.out.println("Navigate to Dashboard page");
		log.info("Login Successfully..");
		log.info("Navigate to Dashboard page");
		
		wait = new WebDriverWait(driver, 30);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(@class,'dx-menu-item-text  dx-menu-item-selected')]")));
		//WebElement element=util.waitForElementToBeClickable(driver,DashboardPage.dashBoardTitle,10);
		//System.out.println("The Element is :"+ element);             
		element.click();
		String dashBoardTitle = driver.getTitle();
		//System.out.println("The Title is: "+ driver.getTitle());
		log.info("The Title is: "+ driver.getTitle());
		Assert.assertEquals("Dashboard", dashBoardTitle);
	}

	@When("^enter invalid username and password$")
	public void enter_invalid_username_and_password() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.manage().window().maximize();
		login = new LoginPage();
		login.enterUserName(prop.getProperty("invalidUserName"));
		login.enterPassword(prop.getProperty("invalidPassword"));
		log.info("Enter invalid user name and password");
	}

	@Then("^user  get error message$")
	public void user_get_error_message() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		String errMessage = driver.findElement(By.xpath("//div[@model='model.ErrorField']")).getText();
		System.out.println("The Error message is: "+ errMessage);
		Assert.assertEquals("Invalid UserID or Password", errMessage);
		log.info("User get error message");
	}


}
