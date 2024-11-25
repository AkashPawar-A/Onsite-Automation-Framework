package com.onsite.core_test;
import java.util.Properties;

import org.openqa.selenium.*;

import com.onsite.login.UserLoginWithPasswordPage;

public class Object_Repository extends Base_Test {
	
	public UserLoginWithPasswordPage userLoginWithPasswordPage_obj;
	public Properties configs;
	public Properties materialPurchase;
	public Properties materialtransfer;
	public Properties debitnote;
	
	public Object_Repository(WebDriver driver) {
		super();
		
		userLoginWithPasswordPage_obj = new UserLoginWithPasswordPage(getDriver());
		userLoginWithPasswordPage_obj.open_login_country_list();
		userLoginWithPasswordPage_obj.select_login_country_name();
		userLoginWithPasswordPage_obj.enter_login_number(configs.getProperty("username"));
		userLoginWithPasswordPage_obj.login_page_logginbutton();
		userLoginWithPasswordPage_obj.onsite_login_password(configs.getProperty("password"));
		userLoginWithPasswordPage_obj.password_page_nextbutton();
		
		materialPurchase = PropertyReader.read("AddMaterialPurchase.properties");
		materialtransfer = PropertyReader.read("AddMaterialTransfer.properties");
		debitnote = PropertyReader.read("AddDebitNote.properties");
			
	}
}
