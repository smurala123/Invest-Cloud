package com.svb.ic.base;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;



public class Hooks extends TestBase{

	//	LoginPage login ; 
	

	public Hooks() throws IOException {
		super();
	}

	/**
	 * @Before and @After will initialize the browser and close the browser
	 * It will catch an exception if application is down
	 * @throws IOException
	 */
	@Before
	public void setUp() throws IOException {
		try {
			
			browserInitialization();
		}
		catch(Exception ex) {
			if(getStatusCode()!=200) {
				//System.out.println("Application is Down!!");
				log.info("Application is Down!!");
			}
			//System.out.println("The Execption is: "+ ex);
			log.info("The Execption is: "+ ex);
		}	
	}

	@After
	public void tearDown(Scenario scenario) throws InterruptedException, IOException {
		
		if(scenario.isFailed())	{
			//System.out.println(scenario.getName() + "is failed");
			log.info(scenario.getName() + "is failed");
			scenario.embed(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES),"image/png");
		}
		Thread.sleep(2000);
		driver.quit();
		//System.out.println("Close the browser");
		log.info("Close the browser");
	}


}
