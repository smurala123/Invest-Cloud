package com.svb.ic.pages;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.svb.ic.base.TestBase;
import com.svb.ic.util.CommonUtilities;


public class DocumentsPage extends TestBase{
	@FindBy(xpath="//label[@class='fileinput-button']")
	public WebElement uploadDoc;
	
	
	@FindBy(xpath="(//div[@class='dx-texteditor-buttons-container'])[5]")
	public WebElement clickCat;
	
	@FindBy(xpath="(//*[@title='Statements'])[2]")
	public WebElement selectStatements;
	
	@FindBy(xpath="//div[@data-dx_placeholder='Select date from']")
	public WebElement selectFromDate;
	
	@FindBy(xpath="//div[@data-dx_placeholder='Select date to']")
	public WebElement selectToDate;
	
	@FindBy(xpath="(//div/div[@class='dx-dropdowneditor-icon'])[5]")
	public WebElement selectFromoCalendar;
	
	@FindBy(css=".dx-calendar-cell.dx-calendar-today.dx-calendar-contoured-date")
	public WebElement selectCurrentFromoDate;
	
	
	@FindBy(xpath="(//div/div[@class='dx-dropdowneditor-icon'])[6]")
	public WebElement selectToCalendar;
	
	@FindBy(xpath="(//td[contains(@class,'dx-calendar-cell dx-calendar-today dx-calendar-contoured-date')])[2]")
	public WebElement selectCurrentToDate;

	@FindBy(xpath="//span[@class='dx-button-text' and text()='Apply Filters']")
	public WebElement applyFilter;

	@FindBy(xpath="//span[@class='dx-button-text' and text()='Clear Filters']")
	public WebElement clearFilters;
	
	@FindBy(xpath="(//div[@class='dx-dropdowneditor-icon'])[1]")
	public WebElement accNumber;
	
	@FindBy(xpath="(//div[contains(@class,'dx-item dx-list-item dx-item-content dx-list-item-content')])[10]")
	public WebElement selectAccNumber;
	
	@FindBy(xpath="(//div[@class='dx-dropdowneditor-icon'])[2]")
	public WebElement clickAsOfDate;
	
	@FindBy(css=".dx-calendar-cell.dx-calendar-today.dx-calendar-contoured-date")
	public WebElement selectAsOfDateToday;
	
	@FindBy(xpath="(//div[@class='dx-texteditor-buttons-container'])[4]")
	public WebElement clickUploadCat;
	
	@FindBy(xpath="(//span[@class='dx-button-text'])[3]")
	public WebElement clickUpload;
	
	@FindBy(xpath="//img[@src='/app_themes/default/images/buttons/svb_export.png']")
	public WebElement export;
	
	
	
	public DocumentsPage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	public  void clickUploadDocument() throws AWTException {
		
		uploadDoc.click();
		
	}
	
	public void selectAccountNo() {
		CommonUtilities.implicitWait(driver,10);
		accNumber.click();
		selectAccNumber.click();
		//CommonUtilities.dropDownSelectByIndex(accNumber,1);
	}
	
	public void selectAsOfDate() {
		clickAsOfDate.click();
		selectAsOfDateToday.click();
	}
	
	public void selectUploadCategory(){
		clickUploadCat.click();
		selectStatements.click();
	}
	
	public void clickUpload() {
		clickUpload.click();
	}
	
	
	public void uploadDocument() throws InterruptedException {

		CommonUtilities.implicitWait(driver,10);
		accNumber.click();
		selectAccNumber.click();
		clickAsOfDate.click();
		selectAsOfDateToday.click();
		clickUploadCat.click();
		selectStatements.click();
		Thread.sleep(3000);
		clickUpload.click();
		
		
	}
	public void applyFilters() throws InterruptedException {
		clickCat.click();
		selectStatements.click();
		selectFromoCalendar.click();
		selectCurrentFromoDate.click();
		selectToCalendar.click();
		selectCurrentToDate.click();
		applyFilter.click();
		
	}
	
	public void clearFilters() {
		clearFilters.click();
	}
	
	public void clickExport() {
		export.click();
		
	}
}
