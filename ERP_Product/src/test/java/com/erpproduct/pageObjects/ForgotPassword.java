package com.erpproduct.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPassword {
	
	WebDriver ldriver;
	
	public ForgotPassword(WebDriver rdriver) {
		
		ldriver=rdriver;
		
		PageFactory.initElements(rdriver, this);
				
	}
	
	//Object Repository
	
		@FindBy(xpath="")
		public static WebElement EmailAddress;
		
		@FindBy(xpath="")
		public static WebElement Submitbtn;
		
		@FindBy(xpath="")
		public static WebElement BackToLogin;
		
		
	//Actions
		
		public void setEmailAddress() {
			EmailAddress.sendKeys("");
			}
		
		public void clickSubmitbtn() {
			Submitbtn.click();
		}
		
		public void clickBacktoLoginbtn() {
			BackToLogin.click();
		}

}
