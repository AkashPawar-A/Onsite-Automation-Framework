package com.onsite.base_page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_Page {

	protected WebDriver driver;
	protected WebDriverWait wait;

	public Base_Page(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		PageFactory.initElements(driver, this);
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

	public void notification() {
		WebElement notificationpopup = driver.findElement(By.xpath(null));
		try {
			if(notificationpopup.isDisplayed()) {
				System.out.println("notification is display");
				WebElement allowbutton = driver.findElement(By.xpath(""));
				allowbutton.click();
			}else {
				System.out.println("notification is not appears");
			}
		}catch(Exception e) {
			System.out.println("notification is not display");
			e.printStackTrace();
		}
	}
}
