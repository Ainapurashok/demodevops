package com.makemytrip.pageobjects;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.makemytrip.base.WebUtility;

public class Homepage extends WebUtility {
	
	//locator
    private String pageUrl ="https://www.makemytrip.com/";
	private By homepagetitlelocator = By.xpath("//*[@alt='Make My Trip']");
      
	//Constructor Initialize the Webdriver/logger
	 public Homepage(WebDriver driver, Logger log) {
		super(driver, log); // Invoking parent class for instance variable intializatin
	                                       }
	 
	 //action 
	public void openPage() {
		log.info("Opening page: " + pageUrl);
		 driver.get(pageUrl);  
		log.info("Page opened!");
	                       }
	
	public String getTitle() {
		//WebElement title = driver.findElement(homepagetitlelocator);
		return driver.getTitle();
	     }

}
