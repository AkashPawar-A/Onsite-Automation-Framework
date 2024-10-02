package com.onsite.quotations;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.onsite.base_page.Base_Page;


public class AddQuotationItem_page extends Base_Page {

	public AddQuotationItem_page(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//ul[@class=\"m-0 p-0\"]")
	private WebElement click_quotation_options;

	@FindBy(xpath="//li[@ng-reflect-ng-class=\"[object Object]\"]")
	private List<WebElement> select_quotation_options;
	
	

	public void clickQuotation()
	{
		try
		{
			click_quotation_options.click();
			System.out.println("Quatations is clickable");
		}
		catch(Exception e)
		{
			System.out.println("Quatations is clickable");
			e.printStackTrace();
		}
	}

	public void selectQuotation()
	{
		try
		{
			select_quotation_options.get(2).click();
			System.out.println("Quatations options is selected");
		}
		catch(Exception e)
		{
			System.out.println("Quatations options is not selected");
			e.printStackTrace();
		}
	}
}
	