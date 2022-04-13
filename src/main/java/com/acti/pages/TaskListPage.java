package com.acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.base.DriverScript;

//Developed By:
//Reviewed By:
//Last Modified Date:
//Description: what this class is for

public class TaskListPage extends DriverScript {

	// **** Page Elements ******

	@FindBy(xpath = "//div[text()='Add New']")
	WebElement buttonAddNew;
	@FindBy(xpath = "//div[@class='item createNewCustomer']")
	WebElement optionNewCustomer;
	@FindBy(xpath = "(//input[@placeholder='Enter Customer Name'])[2]")
	WebElement textboxCustomerName;
	@FindBy(xpath = "//textArea[@placeholder='Enter Customer Description']")
	WebElement textareaCustomerDescription;
	@FindBy(xpath = "//div[text()='Create Customer']")
	WebElement buttonCreateCustomer;
	// **** Page Initialization ******

//create a constructor
	public TaskListPage() {
		PageFactory.initElements(driver, this);
//this refers to all elements
	}

//***************** Page Methods *********

	public void clickAddNew() {
		buttonAddNew.click();
	}

	public void clickOptionNewCustomer() {
		optionNewCustomer.click();
	}

	public void enterCustomerName(String customerName) {
		textboxCustomerName.sendKeys(customerName);
	}

	public void enterCustomerDescription(String customerDescription) {
		textareaCustomerDescription.sendKeys(customerDescription);
	}

	public void clickCreateCustomer() {
		buttonCreateCustomer.click();
	}
}
