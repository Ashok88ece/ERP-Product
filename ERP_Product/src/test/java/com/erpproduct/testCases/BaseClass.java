package com.erpproduct.testCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.logging.Logs;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;



import com.erp.utilities.ReadConfig;

public class BaseClass {

	ReadConfig readconfig = new ReadConfig();
	public String  baseURL = readconfig.getApplicationURL();
	public String username = readconfig.getUsername();
	public String password = readconfig.getPassword();
	public static WebDriver driver;
	public static Logger logger;
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String br) {
				
	
		logger = Logger.getLogger("ERP Application");
		PropertyConfigurator.configure("Log4j.properties");
		if(br.equals("chrome")) 
		{
		System.setProperty("webdriver.chrome.driver", readconfig.getChromePath());
		driver = new ChromeDriver();
		}
		else if(br.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", readconfig.getFirefoxPath());
			driver = new FirefoxDriver();
		}
		else {
			System.out.println("Browser Launching Failed");
		}
		driver.get(baseURL);
		//Logs.info("URL is Opened");
		driver.manage().window().maximize();
	}
		
	 @AfterClass 
	 public void tearDown() throws InterruptedException {
	  
	driver.quit();
	 Thread.sleep(3000);
	 }
	 
	 

}
