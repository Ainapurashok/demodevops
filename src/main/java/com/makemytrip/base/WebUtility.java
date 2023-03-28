package com.makemytrip.base;

import java.time.Duration;
import java.util.List;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebUtility {

	public WebDriver driver;
	public Logger log;

	public WebUtility(WebDriver driver, Logger log) {
		this.driver = driver;
		this.log = log;
	}

	protected void openUrl(String url) {
		driver.get(url);
	}

	protected WebElement find(By locator) {
		return driver.findElement(locator);
	}

	protected void type(By locator, String text) {
		driver.findElement(locator).sendKeys(text);
	}

	protected List<WebElement> findAll(By locator) {
		return driver.findElements(locator);
	}

	protected void clickOnElement(By locator) {

		waitforVisiblityofElementLocate(locator);
		find(locator).click();

	}

	protected boolean waitforVisiblityofElementLocate(By locator) {

		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));

		} catch (NoSuchElementException e) {
			return false;
		} catch (TimeoutException e) {
			return false;
		} catch (Exception e) {
			log.warn(e.getMessage(), e);
			return false;
		}

		return true;
	}

	protected void waitforelemenpresence(By locator) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));

	}

	protected void waitforelementvisible(By locator) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	protected String getText(By locator) {
		return find(locator).getText();

	}

	public void waitforFrametoAvailableAndSwitch(String frametitle) {

		String iframlocator = getIFrameElement(frametitle);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath(iframlocator)));

	}

	public String getIFrameElement(String innerIFrame) {
		return "//iframe[contains(@title, '" + innerIFrame + "')]";
	}

}
