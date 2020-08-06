package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Login {

//	WebDriver driver = null;
//	WebDriverWait wait; 
//
//	@Given("^invest cloud logn page url$")
//	public void invest_cloud_logn_page_url() throws Throwable {
//		// Write code here that turns the phrase above into concrete actions
//		System.out.println("Enter Url");
//		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
//		ChromeOptions options = new ChromeOptions();
//		options.setExperimentalOption("useAutomationExtension", false);		
//		driver = new ChromeDriver(options);
//		driver.get("https://svbprodwip20.investcloud.com");
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		
//	}
//
//	@When("^user enter username and password$")
//	public void user_enter_username_and_password() throws Throwable {
//		// Write code here that turns the phrase above into concrete actions
//		System.out.println("Enter username and password");
//		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Autotestclient");
//		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Test@123456");
//		
//	}
//
//	@And("^Clicks on login button$")
//	public void clicks_on_login_button() throws Throwable {
//		// Write code here that turns the phrase above into concrete actions
//		System.out.println("Click on Login Button");
//		driver.findElement(By.xpath("//button[@dx-button='dxOptions']")).click();
//	}
//
//	@Then("^user is navigated to home page$")
//	public void user_is_navigated_to_home_page() throws Throwable {
//		// Write code here that turns the phrase above into concrete actions
//		System.out.println("Navigate to Dashboard page");
//		wait = new WebDriverWait(driver, 30);
//		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(@class,'dx-menu-item-text  dx-menu-item-selected')]")));
//		element.click();
//		String title = driver.getTitle();
//		System.out.println("The Title is: "+ driver.getTitle());
//		Assert.assertEquals("Dashboard", title);
//	}
//
//

}
