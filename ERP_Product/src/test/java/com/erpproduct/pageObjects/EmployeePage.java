package com.erpproduct.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class EmployeePage {
	
	WebDriver ldriver;
	
	public EmployeePage(WebDriver rdriver) {
		
		ldriver=rdriver;
		
		PageFactory.initElements(rdriver, this);
		
	}
	
	//Object Repository
	
	@FindBy(xpath="")
	WebElement title;
	
	@FindBy(xpath="")
	WebElement firstName;
	
	@FindBy(xpath="")
	WebElement middleName;
	
	@FindBy(xpath="")
	WebElement lastName;
	
	@FindBy(xpath="")
	WebElement emailID;
	
	@FindBy(xpath="")
	WebElement role;
	
	@FindBy(xpath="")
	WebElement date;
	
	@FindBy(xpath="")
	WebElement passCode;
	
	@FindBy(xpath="")
	WebElement saveandCloseBtn;
	
	@FindBy(xpath="")
	WebElement saveBtn;
	
	@FindBy(xpath="")
	WebElement closeBtn;
	
	@FindBy(xpath="")
	WebElement uploadImage;
	
	@FindBy(xpath="")
	WebElement draganddropimage;
	
	//Actions
	
	public void Title() {
		
		title.sendKeys("");
	}
	
	public void Firstname() {
		
		firstName.sendKeys("");
	}
	
	public void Middlename() {
		
		middleName.sendKeys("");
	}
	
	public void Lastname() {
		
		lastName.sendKeys("");
	}
	
	public void EmailAddress() {
		
		emailID.sendKeys("");
	}
	
	public void RoleDropDown() {
		Select select = new Select(ldriver.findElement(By.xpath("")));
		select.selectByIndex(1);
	}
	
	public void Date() {
		date.sendKeys("");
	}
	
	public void Passcode() {
		
		passCode.sendKeys("");
	}
	
	public void saveandclose() {
		saveandCloseBtn.click();
	}
	
	public void save() {
		saveBtn.click();
	}
	
	public void close() {
		closeBtn.click();
	}
	
}
