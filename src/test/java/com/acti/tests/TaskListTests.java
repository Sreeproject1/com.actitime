package com.acti.tests;

import org.testng.annotations.Test;

import com.acti.utils.Helper;

@Test
public class TaskListTests extends BaseTest {

	public void testCreateCustomer() {
		lp.enterUsername("admin");
		lp.enterPassword("manager");
		lp.clickLogin();
		etp.clickTaskMenu();
		tlp.clickAddNew();
		tlp.clickOptionNewCustomer();
		tlp.enterCustomerName("Test Automation");
		tlp.enterCustomerDescription("Customer created for Automation");
		Helper.fn_Sleep();
		tlp.clickCreateCustomer();
		Helper.fn_Sleep();
		etp.clickLogout();
		
	}
}
