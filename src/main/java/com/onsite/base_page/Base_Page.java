package com.onsite.base_page;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Base_Page {

	protected WebDriver driver;
	protected WebDriverWait wait;

	public Base_Page(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		PageFactory.initElements(driver, this);
	}
	
	// this is local branch

	public WebDriver getDriver() {
		return driver;
	}

	public void set_input_field(WebElement element, String text, String elementName) {
		element.clear();
		element.sendKeys(text);
		System.out.println("Successfully entered text in " + elementName);

	}

	public void click_element(WebElement element, String elementName) {
		element.click();
		System.out.println("Successfully clicked on " + elementName);
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
