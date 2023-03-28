package com.demo.loginpage;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import com.makemytrip.base.WebUtility;

public class LoginPageclass extends WebUtility   {
	
	private By urnamelocator=By.id("username");
	private By passwordlocator=By.id("password");
	private By signInlocator=By.id("mainButton");
	private By signinfialureText=By.xpath("//div[contains(@class,'panel-danger')]");
	
	
	 public WebDriver driver;
	public LoginPageclass(WebDriver driver,Logger log){
		super(driver, log);
	 }
	
	public void login(){
		
		  type(urnamelocator, "itptest01"); 
		  type(passwordlocator, "Password1"); 
		  clickOnElement(signInlocator);
		  
		  if(waitforVisiblityofElementLocate(signinfialureText)){
			  log.info("Failed to login");
		  }
	}
}

