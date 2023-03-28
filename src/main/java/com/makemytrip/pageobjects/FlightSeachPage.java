package com.makemytrip.pageobjects;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.makemytrip.base.WebUtility;

public class FlightSeachPage extends WebUtility {
	private By onewaytirplocator = By.xpath("//*[@data-cy='oneWayTrip']");
	private By selectfirstindexlocator = By.xpath("//*[@data-suggestion-index='0']");
	private By FieldFromlocator = By.xpath("//*[@placeholder='From']");
	private By fromlocator = By.id("fromCity");
	private By FielTolocator = By.xpath("//*[@placeholder='To']");
	private By Tolocator = By.id("toCity");
	private By departurelocator = By.id("departure");  
	private By defaultDatelocator = By.xpath("//*[@data-cy='departureDate' and @class='blackText font20 code']//span[@class='font30 latoBlack']");

	public FlightSeachPage(WebDriver driver, Logger log)

	{
		super(driver, log);
	}

	public void navigateToHomepage() {

		Homepage hm = new Homepage(driver, log);
		hm.openPage();
		String title = hm.getTitle();
		System.out.println("page Title : " + title);
	}

	public void selectOneWayTrip() {

		if (!find(onewaytirplocator).isSelected()) {

			find(onewaytirplocator).click();
			log.info("One Way Trip - Selected");
		} else {
			log.info("One Way Trip Already selected");
		}
	}

	public void seachFrom(String fromcity) throws InterruptedException {
		clickOnElement(fromlocator);
		find(FieldFromlocator).sendKeys(fromcity);
		Thread.sleep(5000);
		clickOnElement(selectfirstindexlocator);
		Thread.sleep(5000);
	}
	
	public void seachTo(String toCity) throws InterruptedException {
		clickOnElement(Tolocator);
		find(FielTolocator).sendKeys(toCity);
		Thread.sleep(5000);
		clickOnElement(selectfirstindexlocator);
		Thread.sleep(5000);
	    }
	
	public void departure() throws InterruptedException {
			try {
				clickOnElement(departurelocator);
				
			} catch (Exception e) {
				 log.info("Departure window default disaplyed after selecting To City");
			}
			 
			Thread.sleep(5000);
			clickOnElement(defaultDatelocator);
			Thread.sleep(5000);

}}
