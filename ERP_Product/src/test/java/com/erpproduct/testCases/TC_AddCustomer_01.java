package com.erpproduct.testCases;

import com.erpproduct.pageObjects.CustomerPage;
import com.erpproduct.pageObjects.LoginPage;

public class TC_AddCustomer_01 extends BaseClass {
	
	public void CustomerPage() throws InterruptedException {
		
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		Thread.sleep(3000);
		lp.setPassword(password);
		Thread.sleep(3000);
		lp.clickLoginbtn();
		Thread.sleep(3000);
		
		CustomerPage cust = new CustomerPage(driver);
		
	}

}
