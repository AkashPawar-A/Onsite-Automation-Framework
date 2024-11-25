package com.onsite.login;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.onsite.base_page.Base_Page;

public class UserLoginWithPasswordPage extends Base_Page{

	public UserLoginWithPasswordPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//div[contains (@class, 'dropdown-toggle') and @style=\"position: relative; width: fit-content;\"]")
	private WebElement country_Code_options_DropDown;

	@FindBy(xpath="//div[contains (@class, 'dropdown-item')]")
	private List<WebElement> select_country_code_options;

	@FindBy(xpath="//input[@id=\"exampleFormControlInput1\"]")
	private WebElement login_with_mobile_number;

	@FindBy(xpath="//button[@type=\"button\"]")
	private WebElement mobile_number_loggin_button;

	@FindBy(xpath="//input[@placeholder=\"Enter Password\" and @type=\"password\"]")
	private WebElement onsite_password_enter;

	@FindBy(xpath="//button[contains (@class, 'btn') and text()=\" Login \"]")
	private WebElement password_page_next_button;	


	public void open_login_country_list()
	{
		wait.until(ExpectedConditions.elementToBeClickable(country_Code_options_DropDown));	
		try {
			click_element(country_Code_options_DropDown, "country_Code_options_DropDown");
		} catch(Exception e) {
			System.out.println("Country dropdown is not clickable");
			e.printStackTrace();
		}
	}

	public void select_login_country_name()
	{
		wait.until(ExpectedConditions.visibilityOfAllElements(select_country_code_options));
		try { 
			if(select_country_code_options.size() > 0) {
				select_country_code_options.get(0).click();
				System.out.println("succecfully select login country");
			} else {
				System.out.println("No country available to select");
			}
		} catch(Exception e) {
			System.out.println("Unsuccecfully select login country");
			e.printStackTrace();
		}
	}

	public void enter_login_number(String LoginNumber)
	{
		try {
			set_input_field(login_with_mobile_number, LoginNumber, "LoginNumber");
		} catch (Exception e) {
			System.out.println("failed to enter mobile number");
			e.printStackTrace();
		}
	}

	public void login_page_logginbutton()
	{
		try {
			click_element(mobile_number_loggin_button, "Login button");
		} catch (Exception e) {
			System.out.println("Unsuccessfully click on Login button");
			e.printStackTrace();
		}
	}

	public void onsite_login_password(String OnsitePassword)
	{
		try {
			set_input_field(onsite_password_enter, OnsitePassword, "OnsitePassword");
		} catch (Exception e) {
			System.out.println("unsuccessfully enter a password");
			e.printStackTrace();
		}
	}

	public void password_page_nextbutton()
	{
		wait.until(ExpectedConditions.visibilityOfAllElements(password_page_next_button));
		try {
			click_element(password_page_next_button, "password_page_next_button");
		} catch (Exception e) {
			System.out.println("does not click password_page_nextbutton");
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.invisibilityOf(password_page_next_button));
	}
}
