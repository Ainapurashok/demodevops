package com.demo.loginpage;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.makemytrip.base.WebUtility;

/**
 * Methods to interact with Dashboard lesson Plugin
 *
 * @author Ashok
 */
public class Dashboardlesson extends WebUtility {
	private By confrimRestartButton = By.xpath("//div[contains(@class,'modal__actions')]//button[contains(text(),'Restart')]");
	private By restartButton = By.xpath("//button[contains(@class,'restart-button')]");
	private By itemcard = By.xpath("");
	
	public Dashboardlesson(WebDriver driver, Logger log) {
		super(driver, log);
	}
	 /**
     * To click on dashboard restart button
     *
     * @author ashok
     */
	public void clickonRestartButton() {
		clickOnElement(restartButton);
	  }
    public void clickonConfirmRestartbutton(){
    	
    	clickOnElement(confrimRestartButton);
    }
}
