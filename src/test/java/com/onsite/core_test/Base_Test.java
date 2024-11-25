package com.onsite.core_test;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.time.Duration;
import java.util.HashMap;
import java.util.Properties;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
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
	public Properties otherexpense;

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
			ChromeOptions options = new ChromeOptions();
			
			options.addArguments("--disable-notifications");  
			options.addArguments("--disable-geolocation");    
			options.setExperimentalOption("prefs", new HashMap<String, Object>() {{
				put("profile.default_content_setting_values.notifications", 1);  // 1 to allow, 2 to block
				put("profile.default_content_setting_values.geolocation", 1);    // 1 to allow, 2 to block
			}});

			driver = new ChromeDriver(options);
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
		otherexpense = PropertyReader.read("AddOtherExpenses.properties");
		
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
			driver = null;
		}
	}

	public void captureScreenshot(String testName) {
		String path = "C:\\Users\\hr\\OnsiteGit\\OnsiteTestQA\\ScreenShots\\";
		try {
			TakesScreenshot screenshot = (TakesScreenshot)driver;
			File screenshotFile = screenshot.getScreenshotAs(OutputType.FILE);
			Path destinationFile = Paths.get(path, testName + ".png");
			Files.copy(screenshotFile.toPath(), destinationFile, StandardCopyOption.REPLACE_EXISTING);
			System.out.println("Screenshot taken for test: " + testName);
		} catch (Exception e) {
			System.out.println("Failed to capture screenshot for test: " + testName);
			e.printStackTrace();
		}
	}
}
