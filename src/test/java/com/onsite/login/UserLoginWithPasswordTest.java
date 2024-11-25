package com.onsite.login;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.onsite.core_test.Base_Test;

public class UserLoginWithPasswordTest extends Base_Test{
	
	private UserLoginWithPasswordPage Create_MaterialPurchase_IsPaid_Page_obj;
	private SoftAssert softAssert;
	
	@BeforeMethod
	public void setUp()	{
		Create_MaterialPurchase_IsPaid_Page_obj = new UserLoginWithPasswordPage(getDriver());
		softAssert = new SoftAssert();
	}

	@Test
	public void verifyUserLoginWithPasswordTestPage() {
		String expectedUrl = "https://testweb.onsiteteams.com/c/75916659-9cbe-4ca7-812e-181a29229772/d/home";
		
		userLoginWithPasswordPage_obj.open_login_country_list();
		userLoginWithPasswordPage_obj.select_login_country_name();
		userLoginWithPasswordPage_obj.enter_login_number(configs.getProperty("username"));
		userLoginWithPasswordPage_obj.login_page_logginbutton();
		userLoginWithPasswordPage_obj.onsite_login_password(configs.getProperty("password"));
		userLoginWithPasswordPage_obj.password_page_nextbutton();
	
		String actualUrl = getDriver().getCurrentUrl();
		softAssert.assertEquals(actualUrl, expectedUrl, "The URL after login does not match the expected URL.");
		softAssert.assertAll();
	}

	@AfterMethod
	public void tearDown() {
		quitDriver();
	}
}

