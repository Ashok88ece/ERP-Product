package com.erpproduct.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SalesOrder {
	
	WebDriver ldriver;
	
   public SalesOrder(WebDriver rdriver) {
	
	   ldriver = rdriver;
	   PageFactory.initElements(rdriver, this);
}
   
   //Object Repository
   
   @FindBy(xpath="")
	public static WebElement addOrder;
   
   @FindBy(xpath="")
  	public static WebElement shipMethod;
	
   @FindBy(xpath="")
 	public static WebElement poNumber;

   @FindBy(xpath="")
 	public static WebElement Notes;
   
   @FindBy(xpath="")
	public static WebElement saveBtn;
   
   @FindBy(xpath="")
	public static WebElement closeBtn;
   
   
   //Actions
   
   
   
}
