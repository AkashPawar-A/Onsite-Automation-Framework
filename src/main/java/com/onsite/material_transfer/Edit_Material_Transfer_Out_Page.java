package com.onsite.material_transfer;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.onsite.base_page.Base_Page;

public class Edit_Material_Transfer_Out_Page extends Base_Page {

	public Edit_Material_Transfer_Out_Page (WebDriver driver){
		super(driver);
	}

	@FindBy(xpath="//div[contains(@class, 'project-tile')]")
	private List<WebElement> all_project_list;

	@FindBy(xpath="//div[@class=\"row my-1 payment-tab cursor\"]")
	private List<WebElement> material_transfer_entry_list;

	@FindBy(xpath="//div//ng-icon[@name=\"featherMoreVertical\"]")
	private WebElement materialtransfer_threedot;

	@FindBy(xpath="//span[@class=\"f-12\" and text()=\"Edit\"]")
	private WebElement materialtransfer_edit_button;

	@FindBy(xpath="//input[@name=\"quantity\"]")
	private WebElement materialtransfer_quantity;

	@FindBy(xpath="//input[@name=\"unit_price\"]")
	private WebElement materialtransfer_unitrate;

	@FindBy(xpath="//div[@class=\"d-flex justify-content-between align-items-center cursor\"]")
	private WebElement materialtransfer_discount_popuppage;

	@FindBy(xpath="//div[@class=\"w-50 custom-input\"]//input[@type=\"text\"]")
	private WebElement materialtransfer_itemlevel_discount1;

	@FindBy(xpath="//select//option[@class=\"select-type ng-star-inserted\"]")
	private List<WebElement> materialtransfer_itemlevel_gst1;

	@FindBy(xpath="//button[@class=\"save-btn f-12\" and text()=\" Save \"]")
	private WebElement materialtransfer_discountPopUp_save_cta;

	@FindBy(xpath="//span[@class=\"toggle-title\" and text()=\" + Note \"]")
	private WebElement materialtransfer_note_cta;

	@FindBy(xpath="//textarea[@class=\"note_component ng-pristine ng-valid ng-touched\"]")
	private WebElement materialtransfer_note_text;

	@FindBy(xpath="//div[@class=\"text-end\"]//span[text()=\" + Reference \"]")
	private WebElement materialtransfer_refresnce_cta;

	@FindBy(xpath="//div[@class=\"custom-input ms-auto\"]//input[contains (@type, \"text\")]")
	private WebElement materialtransfer_refrence_text;

	@FindBy(xpath="//div[@class=\"canvas-save-btn\" and text()=\"Save\"]")
	private WebElement materialtransfer_save_button;

	public void select_project()
	{
		wait.until(ExpectedConditions.visibilityOfAllElements(all_project_list));
		try
		{
			if(all_project_list.size() > 0) {
				all_project_list.get(3).click();
				System.out.println("successfully select project");
			} else {
				System.out.println("Project list does not have enough elements");
			}
		} catch(Exception e) {
			System.out.println("Unsuccessfully select project");
			e.printStackTrace();
		}
	}

	public void select_material_transfer_entry()
	{
		wait.until(ExpectedConditions.visibilityOfAllElements(material_transfer_entry_list));
		try {	         
			if (material_transfer_entry_list != null && material_transfer_entry_list.size() > 0) {
				material_transfer_entry_list.get(1).click();
				System.out.println("Successfully clicked on the material_transfer_entry_list");
			} else {
				System.out.println("Debit note entry list is null or does not have enough elements");
			}
		} catch(NullPointerException e) {
			System.out.println("NullPointerException: material_transfer_entry_list might not be initialized.");
			e.printStackTrace();
		} 
	}

	public void click_materialtransfer_threedot()
	{
		wait.until(ExpectedConditions.visibilityOfAllElements(materialtransfer_threedot));
		try {
			click_element(materialtransfer_threedot, "threedot");
		} catch(Exception e) {
			System.out.println("Unsuccecfully click_on_3dot_options");
			e.printStackTrace();
		}
	}

	public void click_materialtransfer_edit_button()
	{
		wait.until(ExpectedConditions.visibilityOfAllElements(materialtransfer_edit_button));
		try {
			click_element(materialtransfer_edit_button, "edit_button");
		} catch(Exception e) {
			System.out.println("Unsuccecfully click_on_edit_button_options");
			e.printStackTrace();
		}
	}

	public void enter_materialtransfer_quantity(String material_quantity)
	{
		wait.until(ExpectedConditions.visibilityOfAllElements(materialtransfer_quantity));
		try {
			set_input_field(materialtransfer_quantity, material_quantity, "quantity");
		} catch(Exception e) {
			System.out.println("Unsuccecfully enter material quanity");
			e.printStackTrace();
		}
	}

	public void enter_materialtransfer_unitrate(String material_rate)
	{
		wait.until(ExpectedConditions.visibilityOfAllElements(materialtransfer_unitrate));
		try {
			set_input_field(materialtransfer_unitrate, material_rate, "unitrate");
		} catch(Exception e) {
			System.out.println("Unsuccecfully enter material rate");
			e.printStackTrace();
		}
	}

	public void click_materialtransfer_discount_popuppage()
	{
		try {
			click_element(materialtransfer_discount_popuppage, "discount_popuppage");
		} catch(Exception e) {
			System.out.println("Unsuccecfully discount_popup_page_open");
			e.printStackTrace();
		}
	}

	public void enter_materialtransfer_itemlevel_Discount_1(String item_discount)
	{
		try {
			set_input_field(materialtransfer_itemlevel_discount1, item_discount, "itemlevel_discount1");
		} catch(Exception e) {
			System.out.println("Unsuccecfully enter item_level_Discount");
			e.printStackTrace();
		}
	}

	public void select_materialtransfer_itemlevel_gst_1()
	{
		wait.until(ExpectedConditions.visibilityOfAllElements(materialtransfer_itemlevel_gst1));
		try {
			for (int i=0; i<materialtransfer_itemlevel_gst1.size(); i++) 
				materialtransfer_itemlevel_gst1.get(2).click();
			System.out.println("succecfully select select_itemlevel_gst");
		} catch(Exception e) {
			System.out.println("Unsuccecfully select select_itemlevel_gst");
			e.printStackTrace();
		}	
	}

	public void click_materialtransfer_PopUpPage_save_cta()
	{
		wait.until(ExpectedConditions.visibilityOfAllElements(materialtransfer_discountPopUp_save_cta));
		try {
			click_element(materialtransfer_discountPopUp_save_cta, "discountPopUp_save_cta");
		} catch(Exception e) {
			System.out.println("Unsuccecfully click_on_discountPopUp_save_cta");
			e.printStackTrace();
		}
	}

	public void click_materialtransfer_note_cta()
	{
		try {
			click_element(materialtransfer_note_cta, "note_cta");
		} catch(Exception e) {
			System.out.println("Unsuccecfully click_on_note_cta");
			e.printStackTrace(); }
	}

	public void enter_materialtransfer_note_text(String itemlevel_note_text)
	{
		try { 
			set_input_field(materialtransfer_note_text, itemlevel_note_text, "note_text");
		} catch(Exception e) {
			System.out.println("Unsuccecfully enter_note");
			e.printStackTrace();
		}
	}

	public void click_materialtransfer_refresnce_cta()
	{
		try {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", materialtransfer_refresnce_cta);
			click_element(materialtransfer_refresnce_cta, "refresnce_cta");
		} catch(Exception e) {
			System.out.println("Unsuccecfully click_on_refresnce_cta");
			e.printStackTrace();
		}
	}

	public void enter_materialtransfer_refrence_text (String item_level_refresnce)
	{
		try {
			set_input_field(materialtransfer_refrence_text, item_level_refresnce, "refrence_text");
		} catch(Exception e) {
			System.out.println("Unsuccecfully enter_refrence"); 
			e.printStackTrace(); }
	}

	public void click_materialtransfer_save_cta()
	{
		try {
			click_element(materialtransfer_save_button, "save_button");
		} catch(Exception e) {
			System.out.println("Unsuccecfully click_on_save_cta");
			e.printStackTrace(); }
		wait.until(ExpectedConditions.invisibilityOf(materialtransfer_save_button));
	}
}
