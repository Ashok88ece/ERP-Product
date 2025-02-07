package com.erpproduct.testCases;

import com.erpproduct.pageObjects.LoginPage;
import com.erpproduct.pageObjects.EmployeePage;

public class TC_AddEmployee_01 extends BaseClass {
	
	public void EmployeePage() throws InterruptedException {
		
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		Thread.sleep(3000);
		lp.setPassword(password);
		Thread.sleep(3000);
		lp.clickLoginbtn();
		Thread.sleep(3000);
		
		EmployeePage emp = new EmployeePage(driver);
	}

}
