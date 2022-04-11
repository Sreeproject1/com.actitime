package com.acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.acti.base.DriverScript;

//Developed By:
//Reviewed By:
//Last Modified Date:
//Description: what this class is for

public class EnterTimePage extends DriverScript {
	// **** Page Elements ******
	@FindBy(xpath = "//a[@class='userProfileLink username ']")
	WebElement textUserLogged;
	@FindBy(id = "logoutLink")
	WebElement linkLogout;

// **** Page Initialization ******

	                  // create a constructor
	public EnterTimePage() 
	{
		PageFactory.initElements(driver, this);
                      //this refers to all elements
	}

                     //***************** Page Methods *********
	public void clickLogout()
	{
		linkLogout.click();
		
	}
	public String verifyUserLogged()
	{
		return textUserLogged.getText();
	}
}