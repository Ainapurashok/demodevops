package com.makemytrip.base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

 

public class BaseClass {
	
	public  WebElement hoverElement;
	public static WebDriver driver;
	 
         public static Logger  log=LogManager.getLogger();
	@Parameters({ "browser" })
	@BeforeMethod(alwaysRun=true)
	public void setup(@Optional("browser")String browsertype)
	
	{
		switch (browsertype) {
		case "chrome" : 
			 log.info("Started chrome Browser");
			System.setProperty("webdriver.chrome.driver", "C://Users//Ashok.reddy//Downloads//driver//chromedriver.exe");
		     driver=new ChromeDriver();
			 //driver.get("http://the-internet.herokuapp.com/");
			  break;
		default:
			log.info(" default : tarted chrome Browser");
			System.setProperty("webdriver.chrome.driver", "C://Users//Ashok.reddy//Downloads//driver//chromedriver.exe");
		     driver=new ChromeDriver();
			 //driver.get("http://the-internet.herokuapp.com/");
			break;
		}
		
    driver.manage().window().maximize();
   
	}
	    @AfterMethod(alwaysRun=true)
	    public void close() {
		  log.info("Close the Browser Instances");
		  driver.quit();
	  }

}
