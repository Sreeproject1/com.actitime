package com.acti.tests;

import org.testng.annotations.Test;

import com.acti.utils.Helper;

public class LoginTests extends BaseTest {
	

	@Test(priority = 1)
	public void testLogin() 
	{
		lp.enterUsername("admin");
		lp.enterPassword("manager");
		lp.clickLogin();
		String actual = etp.verifyUserLogged();
		System.out.println(actual);
		etp.clickLogout();
		Helper.fn_Sleep();
	}
	@Test(priority = 2)
	public void testValidateForgotPasswordLink() 
	{
		boolean flag = lp.verifyLinkForgotPassword();
		System.out.println(flag);
		Helper.fn_Sleep();
	}
}
