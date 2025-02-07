package com.erpproduct.testCases;

import com.erpproduct.pageObjects.LoginPage;
import com.erpproduct.pageObjects.ForgotPassword;

public class TC_ForgotPassword_01 extends BaseClass {
	
	
	public void ForgotPassword() throws InterruptedException {
		
		driver.get(baseURL);
		
		logger.info("URL is Opened");
		driver.manage().window().maximize();
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Entered Username");
		Thread.sleep(2000);
		lp.setPassword(password);
		logger.info("Entered Password");
		Thread.sleep(2000);
		lp.loginbutton.click();
		
		ForgotPassword fop = new ForgotPassword(driver);
		
		fop.setEmailAddress();
		Thread.sleep(2000);
		fop.clickSubmitbtn();
		Thread.sleep(3000);
		//fop.clickBacktoLoginbtn();
		//Thread.sleep(2000);
		
	}

}
