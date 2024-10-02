package com.onsite.quotations;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.onsite.base_page.Base_Page;

public class EditQuotationsItem_page extends Base_Page {

	public EditQuotationsItem_page(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//ul[@class=\"m-0 p-0\"]")
	private WebElement click_quotation_options;

	@FindBy(xpath="//li[@ng-reflect-ng-class=\"[object Object]\"]")
	private List<WebElement> select_quotation_options;

	@FindBy(xpath="//div[@class=\"quotation-tile tile-hover cursor px-4 py-3 ng-star-inserted\"]")
	private List<WebElement> select_Edit_quotations;

	@FindBy(xpath="//div[@class=\"canvas-save-btn\"][text()='Edit']")
	private WebElement click_on_edit_button;
	
	@FindBy(xpath="//div[@class=\"qtn-table-body m-0 ng-star-inserted\"]")
	private List<WebElement> select_quotations_item;

	public void onsiteHomePage()
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

	public void selectQuotationOptions()
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

	public void selectQuotationEntry()
	{
		try
		{
			select_Edit_quotations.get(1).click();
			System.out.println("successfully click on quotations Button");
		}
		catch(Exception e)
		{
			System.out.println("Unsuccessfully click on quotations Button");
			e.printStackTrace();
		}
	}

	public void clickOnEditbutton()
	{
		try
		{
			click_on_edit_button.click();
			System.out.println("successfully click on Edit Button");
		}
		catch(Exception e)
		{
			System.out.println("Unsuccessfully click on Edit Button");
			e.printStackTrace();
		}
	}
	
	public void selectQuotationsItem()
	{
		try
		{
			select_quotations_item.get(2).click();
			System.out.println("successfully select quotations item");
		}
		catch(Exception e)
		{
			System.out.println("successfully select quotations item");
			e.printStackTrace();
		}
	}
}
