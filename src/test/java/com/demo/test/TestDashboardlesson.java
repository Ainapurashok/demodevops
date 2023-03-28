package com.demo.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.demo.basedriver.Webbase;
import com.demo.loginpage.Dashboardlesson;
import com.demo.loginpage.LoginPageclass;
import com.makemytrip.base.WebUtility;

public class TestDashboardlesson extends Webbase{
	
private static final String dashboardlessonName = "TA_Dashboard_Lesson_With _Child LabLesson( No Sim Plugin)";
private WebUtility utility;
private Dashboardlesson dlesson;


	@Test
	public void loginTest(){
     LoginPageclass login = new LoginPageclass(driver,log);
     try{
	 login.login();
     }catch(Exception e){
      Assert.fail("Failed to Login to Learnspace");
     }
	 log.info("Logged in to learn space with username : ");
	 utility =new WebUtility(driver, log);
	 utility.waitforFrametoAvailableAndSwitch(dashboardlessonName);
	 dlesson=new Dashboardlesson(driver, log);
	 dlesson.clickonRestartButton();
	 dlesson.clickonConfirmRestartbutton();
	 
	 try {
		Thread.sleep(3000);
	 }catch (InterruptedException e) {
		e.printStackTrace();
	 }
	  
	 
	 }

}
