package com.makemytrip.testcases;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.makemytrip.base.BaseClass;
import com.makemytrip.pageobjects.HomeModulesPage;

public class HomeModules extends BaseClass{
	
 @Test
 public void headerCount(){
	 
	 HomeTitle title=new HomeTitle();
	 title.getHomageTilte();
	 
	 HomeModulesPage modules=new HomeModulesPage(driver, log);
	  
	  ArrayList<String> modulelist=new ArrayList<>();
	  modulelist.add("Flights");
	  modulelist.add("Hotels");
	  modulelist.add("Homestays");
	  modulelist.add("Holiday Packages");
	  modulelist.add("Trains");
	  modulelist.add("Buses");
	  modulelist.add("Cabs");
	  modulelist.add("Forex");
	  modulelist.add("Charter Flights");
	  modulelist.add("Activities");
	   
	   List<WebElement> headerlist1 = modules.headerModuleCount();
	  
	  for (WebElement option : headerlist1) {
		   System.out.println("Module : "+option.getText());
		 log.info("Chekicng Module " +option.getText() + "presence in Home page" );
			   assertTrue(modulelist.contains(option.getText()));
		   }
	  
	 
 }

}
