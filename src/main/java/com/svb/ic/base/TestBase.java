package com.svb.ic.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.http.HttpResponse;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	static int statusCode;
	
	public TestBase() throws IOException {
		prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\svb\\ic\\config\\config.properties");
		prop.load(fis);
		
	}

	public static void browserInitialization() {
		String browserName = prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\drivers\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions(); 
			options.setExperimentalOption("useAutomationExtension", false);
			driver = new ChromeDriver(options);
				 			
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"src\\test\\resources\\drivers\\chromedriver.exe");
			driver = new FirefoxDriver();
			 
			
		}
		else if(browserName.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"src\\test\\resources\\drivers\\chromedriver.exe");
			driver = new InternetExplorerDriver();
			
		}
		else {
			System.out.println("Browser Name Not Found");
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

	public static int getStatusCode() {
		List<WebElement> links = driver.findElements(By.cssSelector("a"));
		String href;
		statusCode = new HttpResponse().getStatus();
		System.out.println("The Status Code is: "+ statusCode);
		return statusCode;
		
	}
	

}
