package com.makemytrip.pageobjects;

import java.util.List;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.makemytrip.base.WebUtility;

public class HomeModulesPage extends WebUtility {

 private By Hearderlocator=By.xpath("//div[@class='chHeaderContainer']//ul//li[starts-with(@data-cy,'menu')]");
 public HomeModulesPage(WebDriver driver,Logger log){
 
        super(driver,log); }
 
 public List<WebElement> headerModuleCount(){
	 
	     List<WebElement> headerlist = driver.findElements(Hearderlocator); 
	   return  headerlist;
	   }
	    /*for(int i=1;i<n;i++)
	    {
	    	 driver.findElement(By.xpath("//div[@class='chHeaderContainer']//ul//li[starts-with(@data-cy,'menu')][+i+]"));
	    }*/
	   
 }
	
	//Two Method
	//1. get the Size.
	//2. Check the Text for all the Modules present in the list.
	
	


