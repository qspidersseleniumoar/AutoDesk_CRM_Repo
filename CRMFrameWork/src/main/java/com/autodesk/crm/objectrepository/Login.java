package com.autodesk.crm.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.autodesk.crm.commonlib.BaseClass;

public class Login {
	
	@FindBy(name="user_name")
	private WebElement usernameEdit;
	@FindBy(name="user_password")
	private WebElement passwordEdt;
	@FindBy(id="submitButton")
	private WebElement loginBtn;
	
	
	
	public WebElement getUsernameEdit() {
		return usernameEdit;
	}



	public WebElement getPasswordEdt() {
		return passwordEdt;
	}



	public WebElement getLoginBtn() {
		return loginBtn;
	}



	public Home login(String username,String password)
	{
		usernameEdit.sendKeys(username);
		passwordEdt.sendKeys(password);
		loginBtn.click();
		return PageFactory.initElements(BaseClass.driver, Home.class);
	
	}

}
