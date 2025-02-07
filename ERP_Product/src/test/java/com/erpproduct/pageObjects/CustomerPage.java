package com.erpproduct.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CustomerPage {
	
	WebDriver ldriver;
	
	public CustomerPage(WebDriver rdriver) {
		
		ldriver = rdriver;
		
		PageFactory.initElements(rdriver,this);
	}
	
	//Object Repository
	
	@FindBy(xpath="")
	WebElement AddCustomerContactbtn;
	
	@FindBy(xpath="")
	WebElement AddContactbtn;
	
	@FindBy(xpath="")
	WebElement CustomerSearchbox;
	
	@FindBy(xpath="")
	WebElement Customerid;
	
	@FindBy(xpath="")
	WebElement CustomerName;
	
	@FindBy(xpath="")
	WebElement CustomerShortName;
	
	@FindBy(xpath="")
	WebElement Regiondropdown;
	
	@FindBy(xpath="")
	WebElement Title;
	
	@FindBy(xpath="")
	WebElement FName;
	
	@FindBy(xpath="")
	WebElement MName;
	
	@FindBy(xpath="")
	WebElement LName;
	
	@FindBy(xpath="")
	WebElement Mob;
	
	@FindBy(xpath="")
	WebElement Pho;
	
	@FindBy(xpath="")
	WebElement AlternatePhone;
	
	@FindBy(xpath="")
	WebElement Fax;
	
	@FindBy(xpath="")
	WebElement Email;
	
	@FindBy(xpath="")
	WebElement Website;
	
	@FindBy(xpath="")
	WebElement BillAddress1;
	
	@FindBy(xpath="")
	WebElement BillAddress2;
	
	@FindBy(xpath="")
	WebElement BillAddress3;
	
	@FindBy(xpath="")
	WebElement Zip;
	
	@FindBy(xpath="")
	WebElement Savebtn;
	
	@FindBy(xpath="")
	WebElement Closebtn;
	
	//Actions
	
	public void AddCustomerContact() {
		AddCustomerContactbtn.click();
		}
	
	public void Addcontact() {
		AddContactbtn.click();
	    }
	
	public void CustomerSearch() {
		CustomerSearchbox.sendKeys("");
	}
	
	public void CustId() {
		Customerid.sendKeys("");
	}
	
	public void CustName() {
		CustomerName.sendKeys("");
	}
	
	public void CustShortName() {
		CustomerShortName.sendKeys("");
	}
	
	public void Regdropdown() {
	
		Select select = new Select(ldriver.findElement(By.xpath("")));
		select.selectByVisibleText("US");
	}
	
	public void Title() {
		Title.sendKeys("");
	}
	
	public void FirstName() {
		FName.sendKeys("");
	}
	
	public void MiddleName() {
		MName.sendKeys("");
	}
	
	public void LastName() {
		LName.sendKeys("");
	}
	
	public void Mobile() {
		Mob.sendKeys("");
	}
	
	public void AlternatePhone() {
		AlternatePhone.sendKeys("");
	}
	
	public void Fax() {
		Fax.sendKeys("");
	}
	
	public void email() {
		Email.sendKeys("");
	}
	
	public void website() {
		
		Website.sendKeys("");
	}
	
	public void billAddress1() {
		BillAddress1.sendKeys("");
	}
	
	public void billAddress2() {
		BillAddress2.sendKeys("");
	}
	
	public void billAddress3() {
		BillAddress3.sendKeys("");
	}
	
	public void zip() {
		Zip.sendKeys("");
	}
	
	public void Submit() {
		Savebtn.click();
	}
	
	public void Close() {
		Closebtn.click();
	}

}
