package com.erpproduct.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompanyPage {
	
	WebDriver ldriver;
	
	public CompanyPage(WebDriver rdriver) 
	{
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	//Object Repository
	
	@FindBy(xpath="")
	public static WebElement companyName;
	
	@FindBy(xpath="")
	public static WebElement companyEmail;

	@FindBy(xpath="")
	public static WebElement companyContactNumber;

	@FindBy(xpath="")
	public static WebElement contactEmailId;
	
	@FindBy(xpath="")
	WebElement BillAddress1;
	
	@FindBy(xpath="")
	WebElement BillAddress2;
	
	@FindBy(xpath="")
	WebElement BillAddress3;
	
	@FindBy(xpath="")
	WebElement Zip;
	
	@FindBy(xpath="")
	WebElement copyBilladdtoTaxadd;
	
	@FindBy(xpath="")
	WebElement copyBilladdtoShipadd;
	
	@FindBy(xpath="")
	WebElement saveBtn;
	
	@FindBy(xpath="")
	WebElement closeBtn;
	
	//Actions
	
	//Yet to Add

	}
