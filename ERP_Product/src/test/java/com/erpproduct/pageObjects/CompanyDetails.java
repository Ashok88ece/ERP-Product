package com.erpproduct.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompanyDetails {
	
	WebDriver ldriver;
	
	public CompanyDetails(WebDriver rdriver) 
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	//Object Repository
	
	@FindBy(xpath="")
	public static WebElement connectquickbooks;
	
	@FindBy(xpath="")
	public static WebElement products;
	
	@FindBy(xpath="")
	public static WebElement customerdetails;
	
	@FindBy(xpath="")
	public static WebElement invoice;
	
	@FindBy(xpath="")
	public static WebElement clientId;
	
	@FindBy(xpath="")
	public static WebElement clientsecret;
	
	@FindBy(xpath="")
	public static WebElement realmID;
	
	@FindBy(xpath="")
	public static WebElement accesstoken;
	
	@FindBy(xpath="")
	public static WebElement refreshtoken;
	
	@FindBy(xpath="")
	public static WebElement token;
	
	@FindBy(xpath="")
	public static WebElement savebtn;
	
	@FindBy(xpath="")
	public static WebElement refreshbtn;
	
	//Actions
	
	public void connecttoquickbooks() {
		
		WebElement checkBoxElement = ldriver.findElement(By.xpath(""));
		boolean isSelected = checkBoxElement.isSelected();
				
		//performing click operation if element is not checked
		if(isSelected == false) {
			checkBoxElement.click();
		}
		else if(isSelected == true) {
			System.out.println("Connect to quick books selected");
		}
	}
	
	public void products() {
		WebElement checkBoxElement = ldriver.findElement(By.xpath(""));
		boolean isSelected = checkBoxElement.isSelected();
				
		//performing click operation if element is not checked
		if(isSelected == false) {
			checkBoxElement.click();
		}
		else if(isSelected == true) {
			System.out.println("Connect to products selected");
		}
	}
	
	public void customerdetails() {
		WebElement checkBoxElement = ldriver.findElement(By.xpath(""));
		boolean isSelected = checkBoxElement.isSelected();
				
		//performing click operation if element is not checked
		if(isSelected == false) {
			checkBoxElement.click();
		}
		else if(isSelected == true) {
			System.out.println("Customer details selected");
		}
	}
	
	
	public void invoice() {
		WebElement checkBoxElement = ldriver.findElement(By.xpath(""));
		boolean isSelected = checkBoxElement.isSelected();
				
		//performing click operation if element is not checked
		if(isSelected == false) {
			checkBoxElement.click();
		}
		else if(isSelected == true) {
			System.out.println("Invoice selected");
		}
	}
	
	public void ClientId() {
		clientId.sendKeys("");
	}
	
	public void ClientSecret() {
		clientsecret.sendKeys("");
	}
	
	public void RealmId() {
		realmID.sendKeys("");
	}
	
	public void AccessToken() {
		accesstoken.sendKeys("");
	}
	
	public void RefreshToken() {
		refreshtoken.sendKeys("");
	}
	
	public void token() {
		token.sendKeys("");
	}
	
	
	public void save() {
		savebtn.click();
	}
	
	public void refresh() {
		refreshbtn.click();
	}
	
	
}
