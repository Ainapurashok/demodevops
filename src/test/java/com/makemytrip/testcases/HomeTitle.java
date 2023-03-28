package com.makemytrip.testcases;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.makemytrip.base.BaseClass;
import com.makemytrip.pageobjects.Homepage;

public class HomeTitle extends BaseClass {
    //Verify Home page title 	
	String expectedhomeTitle="MakeMyTrip";
	@Test
	public void getHomageTilte() {
		
		Homepage hm=new Homepage(driver,log);
		hm.openPage();
		String title=hm.getTitle();
		System.out.println("page Tile : "+title);
	    assertTrue(title.contains(expectedhomeTitle),"Expected Title not Displayed");
		
	}
	  
}
