package com.onsite.material_purchase;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.onsite.base_page.Base_Page;

public class Edit_Material_Purchase_UnPaid_Entry_Page extends Base_Page {

	public Edit_Material_Purchase_UnPaid_Entry_Page (WebDriver driver) {
		super (driver);
	}

	@FindBy(xpath="//div[contains(@class, 'project-tile')]")
	private List<WebElement> all_project_list;

	@FindBy(xpath="//div[@class=\"row my-1 payment-tab cursor\"]")
	private List<WebElement> select_materialpurchase_entry;

	@FindBy(xpath="//div[@class=\"edit-btn\" and text()=\" Edit \"]")
	private WebElement materialpurchase_viewdetailspage_edit_button;

	@FindBy(xpath="//button[@type=\"button\" and text()=\"Ok\"]")
	private WebElement materialpurchase_delinkpopuppage_ok_button;

	@FindBy(xpath="//button[@type=\"button\" and text()=\"Cancel\"]")
	private WebElement materialpurchase_delinkpopuppage_cancel_button;

	@FindBy(xpath="//input[@type=\"text\" and @name=\"quantity\"]")
	private WebElement materialpurchase_editpage_quantity;

	@FindBy(xpath="//input[@type=\"text\" and @name=\"unit_rate\"]")
	private WebElement materialpurchase_editpage_unitrate;

	@FindBy(xpath="//span[@class=\"f-12 disabled-font\" and text()=\"Tax 18%\"]")
	private WebElement materialpurchase_editpage_itemlevel_discount_or_gst;

	@FindBy(xpath="//div[@class=\"w-50 custom-input\"]//input[@type=\"text\"]")
	private WebElement materialpurchase_editpage_itemlevel_discount_1;

	@FindBy(xpath="//option[@class=\"select-type ng-star-inserted\"]")
	private List<WebElement> materialpurchase_editpage_itemlevel_gst_1;

	@FindBy(xpath="//input[contains (@type, 'text') and @name=\"discount\"]")
	private WebElement materialpurchase_editpage_itemlevel_discount_2;

	@FindBy(xpath="//input[contains (@type, 'text') and @name=\"charges\"]")
	private WebElement materialpurchase_editpage_itemlevel_charges;

	@FindBy(xpath="//div[@class=\"canvas-save-btn\" and text()=\"Save\"]")
	private WebElement materialpurchase_editpage_save_button;



	public void select_project()
	{
		wait.until(ExpectedConditions.visibilityOfAllElements(all_project_list));
		try
		{
			if(all_project_list.size() > 0) {
				all_project_list.get(3).click();
				System.out.println("successfully select project");
			}
			else {
				System.out.println("Project list does not have enough elements");
			}
		}
		catch(Exception e)
		{
			System.out.println("Unsuccessfully select project");
			e.printStackTrace();
		}
	}

	public void select_one_materialpurchase_entry()
	{
		try {	         
			if (select_materialpurchase_entry != null && select_materialpurchase_entry.size() > 0) {
				select_materialpurchase_entry.get(0).click();
				System.out.println("Successfully clicked on the debit note entry");
			} else {
				System.out.println("select_debit_note_entry is null or does not have enough elements");
			}
		} catch (NullPointerException e) {
			System.out.println("NullPointerException: Debit note entry list might not be initialized.");
			e.printStackTrace();
		} 
	}

	public void click_materialpurchase_viewdetailspage_edit_button()
	{
		wait.until(ExpectedConditions.elementToBeClickable(materialpurchase_viewdetailspage_edit_button));
		try {
			materialpurchase_viewdetailspage_edit_button.click();
			System.out.println("Successfully clicked on the materialpurchase_viewdetailspage_edit_button");
	    } catch (Exception e) {
	    	System.out.println("Unsuccessfully click on materialpurchase_viewdetailspage_edit_button");
	        e.printStackTrace(); 
	    }
	}
	
	public void enter_materialpurchase_editpage_quantity(String quantity)
	{
		wait.until(ExpectedConditions.elementToBeClickable(materialpurchase_editpage_quantity));
		try {
			materialpurchase_editpage_quantity.clear();
			materialpurchase_editpage_quantity.sendKeys(quantity);
			System.out.println("Successfully clicked on the materialpurchase_editpage_quantity");
	    } catch (Exception e) {
	    	System.out.println("Unsuccessfully click on materialpurchase_editpage_quantity");
	        e.printStackTrace(); 
	    }
	}
	
	public void enter_materialpurchase_editpage_unitrate(String unitrate)
	{
		wait.until(ExpectedConditions.elementToBeClickable(materialpurchase_editpage_unitrate));
		try {
			materialpurchase_editpage_unitrate.clear();
			materialpurchase_editpage_unitrate.sendKeys(unitrate);
			System.out.println("Successfully clicked on the materialpurchase_editpage_unitrate");
	    } catch (Exception e) {
	    	System.out.println("Unsuccessfully click on materialpurchase_editpage_unitrate");
	        e.printStackTrace(); 
	    }
	}
	
	public void click_materialpurchase_editpage_itemlevel_discount_or_gst()
	{
		wait.until(ExpectedConditions.elementToBeClickable(materialpurchase_editpage_itemlevel_discount_or_gst));
		try {
			materialpurchase_editpage_itemlevel_discount_or_gst.click();
			System.out.println("Successfully clicked on the materialpurchase_editpage_itemlevel_discount_or_gst");
	    } catch (Exception e) {
	    	System.out.println("Unsuccessfully click on materialpurchase_editpage_itemlevel_discount_or_gst");
	        e.printStackTrace(); 
	    }
	}
	
	public void enter_materialpurchase_editpage_itemlevel_discount_1(String discount1)
	{
		wait.until(ExpectedConditions.elementToBeClickable(materialpurchase_editpage_itemlevel_discount_1));
		try {
			materialpurchase_editpage_itemlevel_discount_1.clear();
			materialpurchase_editpage_itemlevel_discount_1.sendKeys(discount1);
			System.out.println("Successfully clicked on the materialpurchase_editpage_itemlevel_discount_1");
	    } catch (Exception e) {
	    	System.out.println("Unsuccessfully click on materialpurchase_editpage_itemlevel_discount_1");
	        e.printStackTrace(); 
	    }
	}
	
	public void select_materialpurchase_editpage_itemlevel_gst_1()
	{
		wait.until(ExpectedConditions.visibilityOfAllElements(materialpurchase_editpage_itemlevel_gst_1));
		try {
			materialpurchase_editpage_itemlevel_gst_1.clear();
			materialpurchase_editpage_itemlevel_gst_1.get(2).click();
			System.out.println("Successfully clicked on the materialpurchase_editpage_itemlevel_gst_1");
	    } catch (Exception e) {
	    	System.out.println("Unsuccessfully click on materialpurchase_editpage_itemlevel_gst_1");
	        e.printStackTrace(); 
	    }
	}
	
	public void enter_materialpurchase_editpage_itemlevel_discount_2(String discount_2)
	{
		wait.until(ExpectedConditions.elementToBeClickable(materialpurchase_editpage_itemlevel_discount_2));
		try {
			materialpurchase_editpage_itemlevel_discount_2.clear();
			materialpurchase_editpage_itemlevel_discount_2.sendKeys(discount_2);
			System.out.println("Successfully clicked on the materialpurchase_editpage_itemlevel_discount_2");
	    } catch (Exception e) {
	    	System.out.println("Unsuccessfully click on materialpurchase_editpage_itemlevel_discount_2");
	        e.printStackTrace(); 
	    }
	}
	
	
	public void click_materialpurchase_editpage_save_button()
	{
		wait.until(ExpectedConditions.elementToBeClickable(materialpurchase_editpage_save_button));
		try {
			materialpurchase_editpage_save_button.clear();
			materialpurchase_editpage_save_button.click();
			System.out.println("Successfully clicked on the materialpurchase_editpage_itemlevel_gst_1");
	    } catch (Exception e) {
	    	System.out.println("Unsuccessfully click on materialpurchase_editpage_itemlevel_gst_1");
	        e.printStackTrace(); 
	    }
		wait.until(ExpectedConditions.invisibilityOf(materialpurchase_editpage_save_button));
	}
}
