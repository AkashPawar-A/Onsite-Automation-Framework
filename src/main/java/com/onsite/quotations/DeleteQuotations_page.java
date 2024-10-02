package com.onsite.quotations;

import java.util.List;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DeleteQuotations_page {

	public WebDriver ldriver;
	public WebDriverWait wait;

	public DeleteQuotations_page(WebDriver rdriver)
	{
		ldriver = rdriver;
		wait = new WebDriverWait(ldriver, Duration.ofSeconds(5));
		PageFactory.initElements(rdriver, this);
		
		int arr[] = {3};
		for(int i=0; i<arr.length; i++)
		{
			System.out.println("arr[" + i + "] = " + arr[i]);
		}
	}
	
	@FindBy(xpath="//ul[@class=\"m-0 p-0\"]")
	private WebElement click_quotation_options;

	@FindBy(xpath="//li[@ng-reflect-ng-class=\"[object Object]\"]")
	private List<WebElement> select_quotation_options;

	@FindBy(xpath="//button[@class=\"add-quotation-btn\" and @type=\"button\"]")
	private WebElement select_New_quotations_button;

	@FindBy(xpath="//input[@id=\"qtn-name\" and @type=\"text\"]")
	private WebElement enter_quotations_name;

	@FindBy(xpath="//app-party-input[@ng-reflect-parent-component=\"[object Object]\"]")
	private WebElement select_quotations_party;

	@FindBy(xpath="//div[@class=\"d-flex align-self-center p-3 search-box-row gap-4 ng-star-inserted\"]")
	private List<WebElement> party_is_selected;

	@FindBy(xpath="//button[@type=\"button\"][text()='Create Quotation']")
	private WebElement click_on_create_quotation_button;

	@FindBy(xpath="//button[@class=\"add-item-btn f-14 w-100\"]")
	private WebElement click_On_addNewItem_button;

	@FindBy(xpath="//input[@id=\"itemName\"][1]")
	private WebElement enter_NewItemName;

	@FindBy(xpath="//input[@id=\"ratePerUnit\"]")
	private WebElement enter_RatePerUnit;

	@FindBy(xpath="//option[@class=\"select-type ng-star-inserted\"]")
	private List<WebElement> select_item_unit;

	@FindBy(xpath="//div[@class='custom-input input-width d-flex align-items-center']/following::option")
	private List<WebElement> select_item_tax;

	@FindBy(xpath="//div[@class='custom-input mb-3']/following::input[@id='itemName']")
	private WebElement enter_estimate_quantity;

	@FindBy(xpath="//div[@class='canvas-save-btn'][text()='Save']")
	private WebElement item_page_save_button; 

	@FindBy(xpath="//span[@class=\"f-12 text-buttons ng-star-inserted\"][text()=\"+ HSN/SAC\"]")
	private WebElement click_on_hac_code;

	@FindBy(xpath="//input[@id=\"hsn\"]")
	private WebElement HAC_Code;

	@FindBy(xpath="//span[@class=\"f-12 text-buttons ng-star-inserted\"][text()=\"+ Description\"]")
	private WebElement click_on_decriptions;

	@FindBy(xpath="//span[@class=\"f-12 text-buttons ng-star-inserted\"][text()=\"+ Cost Code\"]")
	private WebElement cost_code;

	@FindBy(xpath="//div[@class=\"ps-3\"][text()=\" Add Cost Code \" ]")
	private WebElement clic_on_cost_code;

	@FindBy(xpath="//div[@class=\"pointer d-flex gap-3\"]")
	private List<WebElement> cost_code_list;

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

	public void selectNewQuotationsButton()
	{
		try
		{
			select_New_quotations_button.click();
			System.out.println("New Quatation button is selected");
		}
		catch(Exception e)
		{
			System.out.println("New Quatation button is not selected");
			e.printStackTrace();
		}
	}

	public void enterQuotationsName(String QuotaionsName)
	{
		try
		{
			enter_quotations_name.sendKeys(QuotaionsName);
			System.out.println("Quatation name is enter");
		}
		catch(Exception e)
		{
			System.out.println("Quatation name is not enter");
			e.printStackTrace();
		}
	}

	public void clickOnQuotationPartyName()
	{
		try
		{
			select_quotations_party.click();
			System.out.println("Company party list is open");
		}
		catch(Exception e)
		{
			System.out.println("Company party list is open");
			e.printStackTrace();
		}
	}

	public void selectParty()
	{
		try
		{
			party_is_selected.get(3).click();
			System.out.println("total party Size:" + click_on_create_quotation_button.getSize() + "/n party is selected");
		}
		catch(Exception e)
		{
			System.out.println("party does not selected");
		}
	}

	public void clickOnCreateQuotationButton()
	{
		try
		{
			click_on_create_quotation_button.click();
			System.out.println("click on create quotations button");
		}
		catch(Exception e)
		{
			System.out.println("does not click on create quotations button");
			e.printStackTrace();
		}
	}

	public void clickOnaddNewItemButton()
	{
		try
		{
			click_On_addNewItem_button.click();
			System.out.println("click on create addNewItem button");
		}
		catch(Exception e)
		{
			System.out.println("does not click on create quotations button");
			e.printStackTrace();
		}
	}

	public void enterNewItemName(String itemName)
	{
		try
		{
			enter_NewItemName.sendKeys(itemName);
			System.out.println("enter new quotation item name");
		}
		catch(Exception e)
		{
			System.out.println("does not enter new quotation item name");
			e.printStackTrace();
		}
	}

	public void enterRatePerunit(String rateperunit)
	{
		try
		{
			enter_RatePerUnit.sendKeys(rateperunit);
			System.out.println("enter quotation item rte");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("does not enter quotation item rate");
		}
	}

	public void selectItemUnit()
	{
		try
		{
			select_item_unit.get(5).click();
			System.out.println("select quotation item unit");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("does not quotation item unit");
		}
	}

	public void selectitemtax()
	{
		try
		{
			select_item_tax.get(5).click();
			System.out.println("select quotation item tax");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("does not select quotation item tax");
		}
	}

	public void estimatedQuantity(String quantity)
	{
		try
		{
			enter_estimate_quantity.sendKeys(quantity);
			System.out.println("enter item estimated quantity");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("select quotation item tax");
		}
	}

	public void itemPageSaveButton()
	{
		try
		{
			item_page_save_button.click();
			System.out.println("click on item page save button");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("does not click on item page save button");
		}
	}

	public void clickOnHaccode()
	{
		try
		{
			click_on_hac_code.click();
			System.out.println("click on HAC button");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("does not click on HAC button");
		}
	}

	public void enterhaccode(String hacCode)
	{
		try
		{
			HAC_Code.sendKeys(hacCode);
			System.out.println("enter hac code");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("does not enter hac code");
		}
	}

	public void decriptions()
	{
		try
		{
			click_on_decriptions.click();
			System.out.println("click on descriptions button");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("does not click on description button");
		}
	}

	public void enterDescription(String descriptionValue)
	{
		try
		{
			WebElement description = ldriver.findElement(By.className("note_component"));
			wait.until(ExpectedConditions.visibilityOf(description));
			description.click();
			description.sendKeys(descriptionValue);
			System.out.println("click on descriptions button");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("does not click on description button");
		}
	}

	public void clickOnCostCode()
	{
		try
		{
			cost_code.click();
			System.out.println("click on cost code button");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("does not click on cost code button");
		}
	}

	public void CostCodebuttonSelect()
	{
		try
		{
			clic_on_cost_code.click();
			System.out.println("click on descriptions button");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("does not click on cost code button");
		}
	}

	public void listCostCode()
	{
		try
		{
			cost_code_list.get(3).click();
			System.out.println("select the list of cost code");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("does not select the list of cost code");
		}
	}
}

