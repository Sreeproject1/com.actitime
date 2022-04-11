package com.acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.base.DriverScript;

//Developed By:
//Reviewed By:
//Last Modified Date:
//Description: what this class is for

public class LoginPage extends DriverScript {

                       //**** Page Elements ******
	@FindBy(id = "username") WebElement textboxUsername;
	@FindBy(name = "pwd") WebElement textboxPassword;
	@FindBy(xpath = "//div[text()='Login ']") WebElement buttonLogin;
	@FindBy(id = "loginRecoveryLinkContainer") WebElement linkForgotPassword;
	
	                  //**** Page Initialization ******
	
	//create a constructor
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
		//this refers to all elements
	}
	
	//***************** Page Methods *********
	//3 elements, 3 methods to it
	
	public void enterUsername(String username)
	{
		textboxUsername.sendKeys(username);
	}
	
	public void enterPassword(String password)
	{
		textboxPassword.sendKeys(password);
	}
	
	public void clickLogin()
	{
		buttonLogin.click();
	}
	
	public boolean verifyLinkForgotPassword()
	{
		return linkForgotPassword.isDisplayed();
	}
}
