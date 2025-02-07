package com.erpproduct.testCases;

import com.erpproduct.pageObjects.LoginPage;
import com.erpproduct.pageObjects.CompanyDetails;

public class TC_CompanyDetails_01 extends BaseClass {
	
	public void CompanyDetails() throws InterruptedException {
		
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		Thread.sleep(3000);
		lp.setPassword(password);
		Thread.sleep(3000);
		lp.clickLoginbtn();
		Thread.sleep(3000);
		
		CompanyDetails comdet = new CompanyDetails(driver);
		
		comdet.connecttoquickbooks();
		Thread.sleep(3000);
		comdet.products();
		Thread.sleep(3000);
		comdet.customerdetails();
		Thread.sleep(3000);
		comdet.invoice();
		Thread.sleep(3000);
		comdet.ClientId();
		Thread.sleep(3000);
		comdet.ClientSecret();
		Thread.sleep(3000);
		comdet.RealmId();
		Thread.sleep(3000);
		comdet.AccessToken();
		Thread.sleep(3000);
		comdet.RefreshToken();
		Thread.sleep(3000);
		comdet.token();
		Thread.sleep(3000);
		comdet.save();
		Thread.sleep(3000);
		
	}

}
