package com.demo.basedriver;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import dev.failsafe.internal.util.Durations;

public class Webbase {
	
	public static WebDriver driver;
	 
    public static Logger  log=LogManager.getLogger();
	
 
	@BeforeMethod
	public void setup(){
		
		System.setProperty("webdriver.chrome.driver", "C://Users//Ashok.reddy//Downloads//driver//chromedriver.exe");
		
	  driver=new ChromeDriver();
	  driver.get("https://learn-bronte-qaint.pearson.com/03cf5f60-4f1d-11eb-a925-cbc79106f6f3/4e352cb0-d761-11ec-995f-058a0df90bf2");
	  //driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  driver.manage().window().maximize();
	
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  
	  
	}
	
	@AfterMethod
	public void close(){
		//driver.quit();
	}

}
