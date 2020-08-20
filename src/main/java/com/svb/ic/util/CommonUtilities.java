package com.svb.ic.util;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonUtilities {

	public static WebDriver driver;
	private long DEFAULT_TIMEOUT = 30;
    private long POLLING_TIME = 5;

	/**
	 * Click the element using Actions class
	 * @param driver
	 * @param element
	 */

	public void clickAction(WebDriver driver, WebElement element) {

		Actions action = new Actions(driver);
		action.moveToElement(element).click().build().perform();
	}

	/**
	 * Click the element from javascript runtime commands
	 *
	 * @param driver
	 * @param Element
	 */
	public void clickJS(WebDriver driver, WebElement Element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", Element);
	}

	/**
	 * Select the check box if its not selected
	 * @param webElementService
	 */
	public static void selectCheckBox(WebElement webElementService) {
		if (!webElementService.isSelected()) {
			webElementService.click();
		}
	}

	/**
	 * UnSelect the Check box
	 * @param webElementService
	 */
	public static void unSelectCheckBox(WebElement webElementService) {
		if (webElementService.isSelected()) {
			webElementService.click();
		}
	}

	/**
	 * Wait for Element to present
	 * @param driver
	 * @param webElement
	 * @param timeout
	 * @return
	 */
	public WebElement waitForElementPresent(WebDriver driver, WebElement webElement, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		WebElement element = wait.until(ExpectedConditions.visibilityOf(webElement));
		return element;
	}

	/**
	 * Wait for the element to clickable
	 * @param driver
	 * @param webElement
	 * @param timeout
	 * @return
	 */
	public WebElement waitForElementToBeClickable(WebDriver driver, WebElement webElement, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(webElement));
		return element;
	}

	/**
	 * Select drop down by value
	 * @param driver
	 * @param byElement
	 * @return
	 */
	public Select selectByDropDownValueWebElement(WebDriver driver, WebElement element) {
		Select dropdownElement = new Select(element);
		return dropdownElement;
	}

	/**
	 * Select value from drop down using visbleText
	 * @param webElement
	 * @param visibleText
	 */	
	public static Select dropDownSelectByText(WebElement element, String visibleText) {
		Select dropdownElement = new Select(element);
		dropdownElement.selectByVisibleText(visibleText);
		return dropdownElement;
	}

	/**
	 * selecting value from drop down using SelectByIndex.
	 *
	 * @param webElement
	 * @param indexValue
	 * @return
	 */

	public static Select dropDownSelectByIndex(WebElement element, int indexValue) {
		Select dropdownElement = new Select(element);
		dropdownElement.selectByIndex(indexValue);
		return dropdownElement;
	} 

	/**
	 * selecting value from drop down using SelectByValue.
	 *
	 * @param webElement
	 * @param indexValue
	 * @return
	 */
	public static Select dropDownSelectByValue(WebElement element, String value) {
		Select dropdownElement = new Select(element);
		dropdownElement.selectByValue(value);
		return dropdownElement;
	} 


	/**
	 * List of  value from drop down.
	 *
	 * @param webElement
	 * @return
	 */

	public static List listAllValues(WebElement element) {
		List<WebElement> values = driver.findElements(By.xpath("element"));
		return values;
	}

	/**
	 * Validate if element is present or not and perform action
	 * @param driver
	 * @param webElement
	 * @return
	 */

	public boolean isElementPresent(WebDriver driver, WebElement webElement) {
		try {
			if (webElement.isDisplayed()) {
				return true;
			}
		} catch (java.util.NoSuchElementException e) {
			return false;
		} catch (TimeoutException e) {
			return false;
		}
		return true;
	}

	/**
	 * Handling the wait until element present using presenceOfElementLocated 
	 *
	 * @param driver
	 * @param by
	 * @param timeout
	 * @return
	 */

	public WebElement waitForPresenceOfElement(WebDriver driver, By by, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(by));
		return element;
	}
	/**
	 * Method for implicit wait
	 * @param driver
	 * @param time
	 */

	public static void implicitWait(WebDriver driver, int time ) {

		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);

	}
	 /**
     * Waits for the element to be clickable
     *
     * @param driver
     * @param element
     * @return
     */
    public boolean waitForElementToBeClickable(WebDriver driver, WebElement element) {
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
        		.withTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS)
        		.pollingEvery(POLLING_TIME, TimeUnit.SECONDS)
        		.ignoring(NoSuchElementException.class);
        WebElement webElement = wait.until(ExpectedConditions.elementToBeClickable(element));
        webElement.click();
        return true;
    }



}
