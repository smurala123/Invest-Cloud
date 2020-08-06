package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.svb.qa.pages.LoginPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginPF {
	
	WebDriver driver = null;
	WebDriverWait wait; 
	LoginPage login  = new LoginPage(driver);

	@Given("^invest cloud logn page url$")
	public void invest_cloud_logn_page_url() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Enter Url");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("useAutomationExtension", false);		
		driver = new ChromeDriver(options);
		driver.get("https://svbprodwip20.investcloud.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}

	@When("^user enter username and password$")
	public void user_enter_username_and_password() throws Throwable {
		login = new LoginPage(driver);
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Enter username and password");
		driver.manage().window().maximize();
		login.enterUserName();
		login.enterPassword();
		
	}

	@And("^Clicks on login button$")
	public void clicks_on_login_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Click on Login Button");
		login.clickLogin();
	}

	@Then("^user is navigated to home page$")
	public void user_is_navigated_to_home_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Navigate to Dashboard page");
		wait = new WebDriverWait(driver, 30);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(@class,'dx-menu-item-text  dx-menu-item-selected')]")));
		element.click();
		String title = driver.getTitle();
		System.out.println("The Title is: "+ driver.getTitle());
		Assert.assertEquals("Dashboard", title);
	}
	@Then("^Close the browser$")
	public void close_the_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Close the browser");
	    driver.close();
	}

//	@When("^enter invalid \"([^\"]*)\" and \"([^\"]*)\"$")
//	public void enter_invalid_and(String invalidUserName, String invalidPassword) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(invalidUserName);
//		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(invalidPassword);
//		Thread.sleep(5000);
//	}
	
	@When("^enter invalid username and password$")
	public void enter_invalid_username_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.manage().window().maximize();
		login = new LoginPage(driver);
		login.enterInvalidUserName();
		login.enterInvalidPassword();
	}

	@Then("^user  get error message$")
	public void user_get_error_message() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		String errMessage = driver.findElement(By.xpath("//div[@model='model.ErrorField']")).getText();
		System.out.println("The Error message is: "+ errMessage);
		Assert.assertEquals("Invalid UserID or Password", errMessage);
	}




}
