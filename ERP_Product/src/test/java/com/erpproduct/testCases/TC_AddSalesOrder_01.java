package com.erpproduct.testCases;

import com.erpproduct.pageObjects.LoginPage;
import com.erpproduct.pageObjects.SalesOrder;

public class TC_AddSalesOrder_01 extends BaseClass {

	public void SalesOrder() throws InterruptedException {
		
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		Thread.sleep(3000);
		lp.setPassword(password);
		Thread.sleep(3000);
		lp.clickLoginbtn();
		Thread.sleep(3000);
		
		SalesOrder order = new SalesOrder(driver);
	}
}
