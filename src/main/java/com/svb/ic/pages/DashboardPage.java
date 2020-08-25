/**
 * 
 */
package com.svb.ic.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.svb.ic.util.CommonUtilities;



public class DashboardPage {

	public WebDriver driver;

	@FindBy(xpath="//span[contains(@class,'dx-menu-item-text  dx-menu-item-selected')]")
	public static WebElement dashBoardTitle;

	public DashboardPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[contains(@class,'dx-menu-item-text  dx-menu-item-selected')]")
	public WebElement dashboard;
	
	//@FindBy(xpath="//div[@class='dx-context-menu-container-border']")
	//WebElement portfolio;
	
	@FindBy(xpath="//*[contains(text(),'PORTFOLIO')]")
	public WebElement portfolio;
	
	@FindBy(xpath="//div[@class='dx-item-content dx-menu-item-content']/span[contains(text(),'WEALTH')]")
	public WebElement wealth;
	
	@FindBy(xpath="//div[@class='dx-item-content dx-menu-item-content']/span[contains(text(),'DOCUMENTS')]")
	public WebElement documents;
	
	@FindBy(xpath="//div[@class='dx-item-content dx-menu-item-content']/span[contains(text(),'SVB INSIGHTS')]")
	public WebElement svbInsights;
	
	@FindBy(xpath="//div[@class='dx-item-content dx-menu-item-content']/span[contains(text(),'SIGNOUT')]")
	public WebElement signOut;
	
	@FindBy(xpath="//div[@class='dx-item-content dx-menu-item-content']/span[contains(text(),'MORE')]")
	public WebElement more;
	
	@FindBy(xpath="//div[@class='CL_HTML_3 BB2DashWelcome']/span[@class='ng-scope']")
	public WebElement welcomeDashboardMsg;
	
	
	
	
	public DashboardPage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	public String validateDashboardTitle() {
		return driver.getTitle();
	}
	
	public DocumentsPage clickDocuments() throws IOException {
		documents.click();
		List portfolioValue=CommonUtilities.listAllValues(portfolio);
		
		return new DocumentsPage();
		
		
	}
	

}
