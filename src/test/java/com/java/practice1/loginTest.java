package com.java.practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.makemytrip.base.BaseClass;

public class loginTest extends BaseClass {
	
	 
	@Test (priority=1,groups={"smoke"})
	public void login(){

		//System.setProperty("WebDriver.chrome.Driver", "src/main/resources/chromedriver.exe");System.setProperty("webdriver.gecko.driver", "C://Users//Ashok.reddy//Downloads//driver//geckodriver.exe");
		//
    
		try {
			hoverElement = driver.findElement(By.xpath("//div[@id='content']//*[text()='Hovers']"));
			                                             
		} catch (Exception e) {
			   e.printStackTrace();
		}	
		log.info("Log - Running mous hover method ");
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0]. scrollIntoView(true);", hoverElement);
	
	Actions actions=new Actions(driver);
	actions.moveToElement(hoverElement).build().perform();
	
	
	/*driver.findElement(By.xpath(""));
	driver.findElement(By.xpath(""));*/
	 
    //driver.quit();
	}
	
	 
	
	 
	 
 
	 
	

}
