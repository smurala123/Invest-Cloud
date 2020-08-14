/**
 * 
 */
package com.svb.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author dbehera
 *
 */
public class DashboardPage {

	public WebDriver driver;
	
	@FindBy(xpath="//span[contains(@class,'dx-menu-item-text  dx-menu-item-selected')]")
	public static WebElement dashBoardTitle;
	
	public DashboardPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
}
