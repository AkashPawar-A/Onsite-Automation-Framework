package com.onsite.login;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.onsite.base_page.Base_Page;

public class LoginWithNewUserPage extends Base_Page {
	
	public LoginWithNewUserPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//div[@class=\"dropdown-toggle form-control input-height d-flex justify-content-center align-items-center gap-1 cursor ng-tns-c3714256946-1\"]")
	private WebElement country_code_options_dropdown;

	@FindBy(xpath="//div[@class=\"dropdown-item p-2 pointer d-flex justify-content-between gap-3 ng-tns-c3714256946-1 ng-star-inserted\"]")
	private List<WebElement> select_country_code_options;

	@FindBy(xpath="//input[@id=\"exampleFormControlInput1\"]")
	private WebElement enter_login_mobile_number;
	
	@FindBy(xpath="//span[text()=\" Password must be at least 8 characters long.\"]")
	private WebElement mobile_number_character_message;
	
	@FindBy(xpath="//button[@class=\"btn text-white ng-tns-c3714256946-1\"]")
	private WebElement mobile_number_loggin_button;
	
	@FindBy(xpath="//input[@id=\"exampleFormControlInput1\"]")
	private WebElement enter_login_otp;
	
	@FindBy(xpath="//button[@type=\"button\" and @class=\"btn text-white ng-tns-c3714256946-1\"]")
	private WebElement login_otp_verify_button;
	
	@FindBy(xpath="//span[@class=\"px-1 fs-7 ng-tns-c3714256946-1 text-danger ng-star-inserted\"]")
	private WebElement incorrect_otp_toast_message;
		
	@FindBy(xpath="//input[@placeholder=\"Enter Password\" and @type=\"password\"]")
	private WebElement enter_onsite_app_password;
	
	@FindBy(xpath="//button[@type=\"button\"][text()=\"Next\"]")
	private WebElement password_page_next_button;	
	
	@FindBy(xpath="//span[text()=\" Incorrect password!\"]")
	private WebElement incorrect_password_toast_message;
	
	public void login_CountryCode_list()
	{
		country_code_options_dropdown.click();
	}

	public void loginCountryName()
	{
		select_country_code_options.get(8).click();	
	
		System.out.println("Total Options:" + select_country_code_options.size());
			
		if(select_country_code_options.equals(select_country_code_options))
		{
			System.out.println("Country is correct Selected");
		}
		else
		{
			System.out.println("Country is not correct selected");
		}	
	}
	
	public void loginwithMobileNumber(String number)
	{
		enter_login_mobile_number.sendKeys(number);
	}
	
	public void logginpage_logginButton()
	{
		mobile_number_loggin_button.click();
	}
	
	public void enter_Otp_filled(String otp)
	{
		enter_login_otp.sendKeys("");
	}
	
	public void Login_Otp_button()
	{
		login_otp_verify_button.click();
	}
	
	public void onsite_app_Password(String password)
	{
		enter_onsite_app_password.sendKeys(password);
	}
	
	public void password_page_nextButton()
	{
		password_page_next_button.click();
	}
	
	public void incorerectpassword_message(String wrongPassExpectedMessage)
	{
		String actualMessage = incorrect_password_toast_message.getText();
		System.out.println("Title:" + actualMessage);
	}
	
	public void numberchracter_message(String message)
	{
		String actualMessage = mobile_number_character_message.getText();
		System.out.println("Title:" + actualMessage);	
	}
}
