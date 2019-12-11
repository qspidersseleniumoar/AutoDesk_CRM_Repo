package com.autodesk.crm.campaigntest;

import org.testng.annotations.Test;

public class CampaignTest {
	
 @Test
 public void createCampaignTest() {
	 String BROWSER = System.getProperty("browser");
	 String URL = System.getProperty("url");
	 String USER = System.getProperty("username");
	 String PASSWORD = System.getProperty("password");
	 
	 System.out.println("================>"+BROWSER);
	 System.out.println(URL);
	 System.out.println(USER);
	 System.out.println(PASSWORD);


 }
}
