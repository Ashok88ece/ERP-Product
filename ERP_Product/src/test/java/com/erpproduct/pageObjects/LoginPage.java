package com.erpproduct.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver) {
		
		ldriver=rdriver;
		
		PageFactory.initElements(rdriver, this);
				
	}
	
	//Object Repository
	
	@FindBy(xpath="")
	public static WebElement username;
	
	@FindBy(xpath="")
	public static WebElement password;
	
	@FindBy(xpath="")
	public static WebElement rememberMe;
		
	@FindBy(xpath="")
	public static WebElement loginbutton;
	
	@FindBy(xpath="")
	public static WebElement forgotPassword;
	
	//Actions
	
	public void setUserName(String uname) {
		username.sendKeys(uname);
	}
	
	public void setPassword(String pwd) {
		password.sendKeys(pwd);
	}
	
		
	public void remebermecheckbox() {
		
		WebElement checkBoxElement = ldriver.findElement(By.xpath(""));
		boolean isSelected = checkBoxElement.isSelected();
				
		//performing click operation if element is not checked
		if(isSelected == false) {
			checkBoxElement.click();
		}
		else if(isSelected == true) {
			System.out.println("RemeberMe Checkbox Already Selected");
		}
	}
	
	public void clickLoginbtn() {
		loginbutton.click();
	}
	
	public void forgotpwd() {
		
		forgotPassword.click();
	}

}
