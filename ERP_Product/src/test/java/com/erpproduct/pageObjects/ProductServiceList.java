package com.erpproduct.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductServiceList {
	
	WebDriver ldriver;
	
	public ProductServiceList(WebDriver rdriver) {
		
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	//Object Repository
	
	@FindBy(xpath="")
	public static WebElement categorybtn;
	
	@FindBy(xpath="")
	public static WebElement category;
	
	@FindBy(xpath="")
	public static WebElement Name;
	
	@FindBy(xpath="")
	public static WebElement IsASubCategory;
	
	@FindBy(xpath="")
	public static WebElement categorydropdown;

	@FindBy(xpath="")
	public static WebElement savebtn;
	
	@FindBy(xpath="")
	public static WebElement closebtn;
	
	@FindBy(xpath="")
	public static WebElement ProdServName;
	
	@FindBy(xpath="")
	public static WebElement ServiceCheckBox;
	
	@FindBy(xpath="")
	public static WebElement InventoryCheckBox;
	
	@FindBy(xpath="")
	public static WebElement IsTaxableCheckBox;
	
	@FindBy(xpath="")
	public static WebElement CategoryDropdown;
	
	@FindBy(xpath="")
	public static WebElement QtyOnHand;
	
	@FindBy(xpath="")
	public static WebElement QtyOnHandasonDate;
	
	@FindBy(xpath="")
	public static WebElement ReorderQty;
	
	@FindBy(xpath="")
	public static WebElement SalesPrice;
	
	@FindBy(xpath="")
	public static WebElement Description;
	
	@FindBy(xpath="")
	public static WebElement ProdServSavebtn;
	
	@FindBy(xpath="")
	public static WebElement ProdServClosebtn;
	
	
	//Actions
	
	
	
}
