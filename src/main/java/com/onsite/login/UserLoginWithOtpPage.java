package com.onsite.login;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.onsite.base_page.Base_Page;

public class UserLoginWithOtpPage extends Base_Page {

	public UserLoginWithOtpPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//div[@class=\"dropdown-toggle form-control input-height d-flex justify-content-center align-items-center gap-1 cursor ng-tns-c3714256946-1\"]")
	private WebElement country_Code_options_DropDown;

	@FindBy(xpath="//div[@class=\"dropdown-item p-2 pointer d-flex justify-content-between gap-3 ng-tns-c3714256946-1 ng-star-inserted\"]")
	private List<WebElement> select_country_code_options;

	@FindBy(xpath="//input[@id=\"exampleFormControlInput1\"]")
	private WebElement login_mobile_number_enter;

	@FindBy(xpath="//span[@class=\"px-1 fs-7 ng-tns-c3714256946-13 text-danger ng-star-inserted\"]")
	private WebElement valid_mobile_number_message;

	@FindBy(xpath="//button[@class=\"btn text-white ng-tns-c3714256946-1\"]")
	private WebElement mobile_number_login_button;

	@FindBy(xpath="//button[@type=\"button\"][text()='Login With OTP']")
	private WebElement login_with_otp_button;

	@FindBy(xpath="//input[@id=\"exampleFormControlInput1\"]")
	private WebElement enter_otp_app;

	@FindBy(xpath="//button[@type=\"button\" and @class=\"btn text-white ng-tns-c3714256946-15\"]")
	private WebElement otp_page_verify_buttton;

	@FindBy(xpath="//span[@class=\"px-1 fs-7 ng-tns-c3714256946-15 ng-star-inserted text-danger\"]")
	private WebElement invalid_otp_message;

	public void login_countryCode_list()
	{
		try
		{
			country_Code_options_DropDown.click();
			System.out.println("Country dropdown is clickable.");
		}
		catch(Exception e)
		{
			System.out.println("Country dropdown is not clickable.");
		}
	}

	public void login_CountryName(int index)
	{
		  try {
			  select_country_code_options.get(index).click();
	            System.out.println("Selected country code at index: " + index);
	        } catch (Exception e) {
	            System.out.println("Failed to select country code at index: " + index);
	        }
	}

	public void login_MobileNumber(String loginnumber)
	{
		try
		{
			login_mobile_number_enter.sendKeys(loginnumber);
			System.out.println("Successfully enter mobile number");
		}
		catch (Exception e)
		{
			System.out.println("failed to enter mobile number");
		}
	}

	public void MobileNumberpage_LoginButton()
	{
		try
		{
			valid_mobile_number_message.click();
			System.out.println("Successfully clicked Login button");
		}
		catch (Exception e)
		{
			System.out.println("does not click on Login button");
		}
	}

	public void LoginWithOtpButton()
	{
		try
		{
			login_with_otp_button.click();
			System.out.println("Successfully clicked Otp button");
		}
		catch (Exception e)
		{
			System.out.println("does not click on Otp button");
		}
	}

	public void enterSixDigitOtp(String otp)
	{
		try
		{
			enter_otp_app.sendKeys(otp);
			System.out.println("Enter a 6 digit Otp");
		}
		catch (Exception e)
		{
			System.out.println("does not enter Otp");
		}
	}

	public void LoginWith_OtpVerifyButton()
	{
		try
		{
			otp_page_verify_buttton.click();
			System.out.println("Successfully clicked Login button");
		}
		catch (Exception e)
		{
			System.out.println("does not click on Login button");
		}
	}

	public void mobileNumberValidation_ToastMessage(String mobileNumberValidationMessage)
	{
		try
		{
			String actualMessage = valid_mobile_number_message.getText();
			System.out.println("Title:" + actualMessage);
			if (actualMessage.equals(actualMessage))
			{
				System.out.println("Correct toast message verification passed 1");
			}
			else
			{
				System.out.println("Incorrect toast message verification passed 1");
			}
		}
		catch(Exception e)
		{
			System.out.println("does not show toast message");
		}
	}

	public void invalidOtp_Message(String InvalidOtpMessage)
	{
		try
		{
			String actualMessage = invalid_otp_message.getText();
			System.out.println("Title:" + actualMessage);
			if (actualMessage.equals(actualMessage))
			{
				System.out.println("Correct otp enter");
			}
			else
			{
				System.out.println("Incorrect otp enter");
			}
		}
		catch(Exception e)
		{
			System.out.println("does not shows toast message");
		}
	}


}
