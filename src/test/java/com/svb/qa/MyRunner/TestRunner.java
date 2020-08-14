package com.svb.qa.MyRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/com/svb/qa/features", 
				glue= {"stepDefinitions"},
				monochrome=true,
				//plugin={"pretty","junit:target/JUNITReports/junitReport.xml"},
				//tags="@SmokeTest")
				plugin={"pretty","junit:target/JUNITReports/junitReport.xml",
								"json:target/JSONReports/jsonreport.json" ,
								"html:target/HTMLReports"}
				//tags="@invalidCredential"
		)


public class TestRunner {

}
