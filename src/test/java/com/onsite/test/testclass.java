package com.onsite.test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.onsite.login.UserLoginWithPasswordPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class testclass {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://testweb.onsiteteams.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		UserLoginWithPasswordPage userLoginWithPasswordPage_obj = new UserLoginWithPasswordPage(driver);
		
		userLoginWithPasswordPage_obj.enter_login_number("7499358226");
        userLoginWithPasswordPage_obj.login_page_logginbutton();
        userLoginWithPasswordPage_obj.onsite_login_password("7499358226");
        userLoginWithPasswordPage_obj.password_page_nextbutton();
                 
        Thread.sleep(5000);
        driver.quit();
	}
}
