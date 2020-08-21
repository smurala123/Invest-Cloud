/**
 * 
 */
package com.svb.ic.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class DashboardPage {

	public WebDriver driver;

	@FindBy(xpath="//span[contains(@class,'dx-menu-item-text  dx-menu-item-selected')]")
	public static WebElement dashBoardTitle;

	public DashboardPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
