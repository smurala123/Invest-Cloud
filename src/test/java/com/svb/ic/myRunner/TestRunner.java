package com.svb.ic.myRunner;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;


/**
 * Run all the features file from given path 
 * Generate different report based on the plugin
 * Run scenarios from feature file based on @tags
 */
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features", 
				glue= {"com.svb.ic.stepDefinitions"},
				monochrome=true,
				//plugin={"pretty","junit:target/JUNITReports/junitReport.xml"},
				//tags="@SmokeTest")
				plugin={"pretty","junit:target/JUNITReports/junitReport.xml",
								"json:target/JSONReports/jsonreport.json" ,
								"html:target/HTMLReports"}
				//tags="@invalidCredential"
		)


public class TestRunner {
	
	private TestNGCucumberRunner testNGCucumberRunner;
	
	@BeforeClass(alwaysRun = true)
	public void setUpClass() {
		testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
	}
	
	@Test(groups = "cucumber", description = "Runs Cucumber Feature", dataProvider = "features")
	public void feature(CucumberFeatureWrapper cucumberFeature) {
		testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
	}
	
	/**
	 * Get list of features file from given path
	 */
	@DataProvider
	public Object[][] features() {
		return testNGCucumberRunner.provideFeatures();
	}
	
	@AfterClass
	public void teatDownClass() {
		testNGCucumberRunner.finish();

	}

}
