package com.svb.ic.util;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportNG {
	
	/**
	 * Method for Generate extent report.
	 * It will display total number of PASS & FAILED Test Case.
	 * For FAILED test case, will display failed logs.
	 * 
	 * @return
	 */
	
	public static ExtentReports extent;
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports getExtentReport() {
	
	String path = System.getProperty("user.dir")+"\\reports\\index.html";
	ExtentSparkReporter reporter = new ExtentSparkReporter(path);
	reporter.config().setReportName("Invest Cloud Automation Results");
	reporter.config().setDocumentTitle("Test Results");
	
	
	htmlReporter = new ExtentHtmlReporter( System.getProperty("user.dir")+"\\reports\\extentReport.html");
	extent = new ExtentReports();
	extent.attachReporter(htmlReporter);
	extent.setSystemInfo("TestId", "Client");
	htmlReporter.config().setReportName("Invest Cloud Test Results");
	htmlReporter.config().setDocumentTitle("Test Resulsts");
	
	return extent;
	
	
}

}
