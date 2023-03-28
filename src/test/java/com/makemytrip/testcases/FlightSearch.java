package com.makemytrip.testcases;

import org.testng.annotations.Test;

import com.makemytrip.base.BaseClass;
import com.makemytrip.pageobjects.FlightSeachPage;

public class FlightSearch extends BaseClass   {

	 
	@Test
  public void flightSearchfrom(){
		
	FlightSeachPage flightsearch = new FlightSeachPage(driver, log);
	flightsearch.navigateToHomepage();
	flightsearch.selectOneWayTrip();
	
 
		try {
			flightsearch.seachFrom("Bangalore");
			
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		
		try {
			flightsearch.seachTo("Mysore");
			flightsearch.departure();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	 
	
}
	
	 
	
	     
	//FlightSeachPage
	
}
