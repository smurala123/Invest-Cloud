package com.svb.ic.stepDefinitions;

import java.io.IOException;

import com.svb.ic.base.TestBase;
import com.svb.ic.pages.LoginPage;

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
				System.out.println("Application is Down!!");
			}
			System.out.println("The Execption is: "+ ex);
		}	
	}

	@After
	public void tearDown() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
		System.out.println("Close the browser");
	}


}
