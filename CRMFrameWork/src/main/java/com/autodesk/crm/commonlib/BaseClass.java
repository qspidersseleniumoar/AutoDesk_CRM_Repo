package com.autodesk.crm.commonlib;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.autodesk.crm.objectrepository.Home;
import com.autodesk.crm.objectrepository.Login;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.sun.media.sound.InvalidFormatException;
/**
 * 
 * @author Deepak
 *
 */
public class BaseClass {
	ExcelLib eLib = new ExcelLib();

	public static ExtentReports extent;
	public static ExtentTest logger;
	public static WebDriver driver;
@BeforeSuite
public void configbeforeSuite(){
	 extent = new ExtentReports("./test-output/ExtentReport.html", true);
	 extent.addSystemInfo("Au8tomationLab", "SoftwareTestingMaterial")
	        .addSystemInfo("Environment", "Window")
            .addSystemInfo("User Name", "Deepak");
            extent.loadConfig(new File("./extent-config.xml"));
}

@BeforeClass
public void configBc() throws Throwable, InvalidFormatException, org.apache.poi.openxml4j.exceptions.InvalidFormatException, IOException{
	

	String url = System.getProperty("url");
	String browser = System.getProperty("browser");


	if(browser.equals("firefox")){
	   driver = new FirefoxDriver();
	}else if(browser.equals("chrome")){
		driver = new ChromeDriver();
		
	}
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get(url);
}

@BeforeMethod
public void configBM() throws Throwable{
	Login lp = PageFactory.initElements(driver, Login.class);
	String username = System.getProperty("username");
	String password = System.getProperty("password");
	lp.login(username, password);
}

    @AfterMethod
    public void configAm(){
	  Home lp = PageFactory.initElements(driver, Home.class);
	lp.signOut();
    }
   @AfterClass
   public void afterClass(){
	driver.close();
   }
  @AfterSuite
  public void configafterSuite(){
	  extent.flush();
	  extent.close();
	
   }

}
