package com.autodesk.crm.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.autodesk.crm.commonlib.BaseClass;

public class Home {
	@FindBy(xpath="//img[@src='themes/softed/images/Home.PNG']")
	WebElement home;
	@FindBy(linkText="Calendar")
	WebElement Calendar;
	@FindBy(linkText="Leads")
	WebElement Leads;               	 		 		 	 		 		 		
	@FindBy(linkText="Contacts")
	WebElement Contacts;
	@FindBy(linkText="Opportunities")
	WebElement Opportunities;
	@FindBy(linkText="Products")
	WebElement Products;
	@FindBy(linkText="Organizations")
	WebElement Organizations;
	@FindBy(linkText="Email")
	WebElement Email;
	@FindBy(linkText="Trouble Tickets")
	WebElement Trouble_Tickets;
	@FindBy(linkText="Dashboard")
	WebElement Dashboard;
	@FindBy(linkText="More")
	WebElement More;
	@FindBy(xpath="//img[@title='Chat...']")
	WebElement chat;
	@FindBy(linkText="Campaigns")
	WebElement Campaigns;
	@FindBy(linkText="Reports")
	WebElement Reports;
	@FindBy(linkText="SMSNotifier")
	WebElement SMSNotifier;
	@FindBy(linkText="Comments")
	WebElement Comments;
	@FindBy(linkText="Quotes")
	WebElement Quotes;
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	WebElement admin;
	@FindBy(linkText="Sign Out")
	WebElement Sign_Out;
	@FindBy(xpath="//img[@src='themes/softed/images/info.PNG']")
	WebElement info_img;
	@FindBy(linkText="My_Preferences")
	WebElement My_Preferences;
	@FindBy(linkText="Help")
	WebElement Help;
	@FindBy(linkText="CRM Settings")
	WebElement CRM_Settings;
	@FindBy(xpath="//img[@src='themes/softed/images/mainSettings.PNG']")
	WebElement setting_img;
	
	
	public void navigateTohome(){
		home.click();
	}
	public void navigateToCalendar(){  
		Calendar.click();
	}
	public void navigateToLeads(){
		Leads.click();
	}
	public void navigateToOrganizations(){ 
		Organizations.click();
	}
	public void navigateToContacts(){
		Contacts.click();
	}
	public void navigateToOpportunities(){
		Opportunities.click();
	}
	public void navigateToProducts(){
		Products.click();
	}
	 
	public void navigateToEmail(){
		Email.click();
	}
	public void navigateToDashboard(){
		Dashboard.click();
	}
	public void navigateToMore(){
		 Actions act = new Actions(BaseClass.driver);
		 act.moveToElement(More).perform();;
	 }

	
	
	
	
	
	
	
	
	
	
	public void navigateToReports(){
		Reports.click();
	}
	public void navigateToSMSNotifier(){
		SMSNotifier.click();
	}
	public void navigateToComments(){
		Comments.click();
	}
	public void navigateToQuotes(){
		Quotes.click();
		}
	 
	public void signOut(){
		Actions act = new Actions(BaseClass.driver);
		act.moveToElement(admin).perform(); 
		Sign_Out.click();
		}
	public void My_Preferences(){
		Actions act = new Actions(BaseClass.driver);
		act.moveToElement(admin).perform();
		My_Preferences.click();
		}
	 
	public void Help(){
		Actions act = new Actions(BaseClass.driver);
		act.moveToElement(info_img);
		Help.click();
		}
	public void CRM_Settings(){
		Actions act = new Actions(BaseClass.driver);
		act.moveToElement(setting_img);
		CRM_Settings.click();
		}
	 }
