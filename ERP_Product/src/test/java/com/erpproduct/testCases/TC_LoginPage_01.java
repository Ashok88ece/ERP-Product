package com.erpproduct.testCases;

import org.testng.annotations.Test;

import com.erpproduct.pageObjects.LoginPage;

public class TC_LoginPage_01 extends BaseClass {

	@Test
	public void loginTest() throws InterruptedException {
	
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
}
}
