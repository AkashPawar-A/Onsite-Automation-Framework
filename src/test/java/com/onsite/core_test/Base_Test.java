package com.onsite.core_test;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.onsite.login.UserLoginWithPasswordPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Test {
	private WebDriver driver;
	public UserLoginWithPasswordPage userLoginWithPasswordPage_obj;
	public Properties configs;
	public Properties materialPurchase;
	public Properties materialtransfer;
	public Properties debitnote;

	public WebDriver getDriver() {
		return driver;
	}

	@BeforeMethod
	public void setUpDriver() {
		String browser = System.getProperty("browser", "chrome");

		switch (browser.toLowerCase()) {
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;

		case "chrome":
		default:
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		}
		
		configs = PropertyReader.read("configs.properties");
		driver.get(configs.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		userLoginWithPasswordPage_obj = new UserLoginWithPasswordPage(getDriver());
		materialPurchase = PropertyReader.read("AddMaterialPurchase.properties");
		materialtransfer = PropertyReader.read("AddMaterialTransfer.properties");
		debitnote = PropertyReader.read("AddDebitNote.properties");
				
		userLoginWithPasswordPage_obj.open_login_country_list();
		userLoginWithPasswordPage_obj.select_login_country_name();
		userLoginWithPasswordPage_obj.enter_login_number(configs.getProperty("username"));
		userLoginWithPasswordPage_obj.login_page_logginbutton();
		userLoginWithPasswordPage_obj.onsite_login_password(configs.getProperty("password"));
		userLoginWithPasswordPage_obj.password_page_nextbutton();
	}

	@AfterMethod
	public void quitDriver() {
		if (driver != null) {
			driver.quit();
		}
	}
}
