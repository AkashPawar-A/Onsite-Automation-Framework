package com.onsite.material_transfer;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.onsite.base_page.Base_Page;

public class Create_Material_Transfer_Page extends Base_Page {

	public Create_Material_Transfer_Page (WebDriver driver) {
		super (driver);
	}

	@FindBy(xpath="//div[contains (@class, 'project-tile')]")
	private List<WebElement> all_project_list;

	@FindBy(xpath="//span[@class=\"btn-text d-none d-sm-block\" and text()=\" Create Transaction \"]")
	private WebElement project_transaction_tab;

	@FindBy(xpath="//button[@class=\"custom-transaction-button blue-btn mt-2 ng-star-inserted\" and text()=\"+ Material Transfer\"]")
	private WebElement transaction_materialtransfer_tab;

	@FindBy(xpath="//span[@class=\"primary-value\" and text()=\"Select Project\"]")
	private WebElement materialtransfer_project_field;

	@FindBy(xpath="//div[contains (@class, 'project-tile')]")
	private List<WebElement> materialtransfer_project_name;

	@FindBy(xpath="//span[@class=\"outlined-btn-font\" and text()=\"+ Select Materials\"]")
	private WebElement materialtransfer_Materila_cta;

	@FindBy(xpath="//input[@type=\"checkbox\"]")
	private List<WebElement> materialtransfer_materiallist_checkBox;

	@FindBy(xpath="//div[@class=\"canvas-save-btn\" and text()=\"Next\"]")
	private WebElement materialtransfer_materiallist_nextcta;

	@FindBy(xpath="//input[@name=\"quantity\"]")
	private WebElement materialtransfer_quantity;

	@FindBy(xpath="//input[@name=\"unit_price\"]")
	private WebElement materialtransfer_unitrate;

	@FindBy(xpath="//div[@class=\"d-flex justify-content-between align-items-center cursor\"]")
	private WebElement materialtransfer_discountpopuppage;

	@FindBy(xpath="//div[@class=\"w-50 custom-input\"]//input[@type=\"text\"]")
	private WebElement materialtransfer_itemlevel_discount;

	@FindBy(xpath="//select//option[@class=\"select-type ng-star-inserted\"]")
	private List<WebElement> materialtransfer_itemlevel_gst;

	@FindBy(xpath="//button[@class=\"save-btn f-12\" and text()=\" Save \"]")
	private WebElement materialtransfer_discountPopUp_savecta;

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
		try {
			for(int i=0; i<all_project_list.size(); i++)
			{
				all_project_list.get(3).click();
				System.out.println("successfully select project");
			}
		} catch (Exception e) {
			System.out.println("Unsuccessfully select project");
			e.printStackTrace();
		}
	}

	public void click_transaction_tab()
	{
		wait.until(ExpectedConditions.visibilityOfAllElements(project_transaction_tab));
		try{
			click_element(project_transaction_tab, "transaction_tab");
		} catch (Exception e) {
			System.out.println("Unsuccessfully click on transaction tab");
			e.printStackTrace();
		}
	}

	public void click_materialtransfer_cta()
	{
		try {
			click_element(transaction_materialtransfer_tab, "materialtransfer_tab");
		} catch (Exception e) {
			System.out.println("Unsuccessfully click on material transfer tab");
			e.printStackTrace();
		}
	}

	public void click_projecttransfer_field()
	{
		try {
			click_element(materialtransfer_project_field, "project_field");
		} catch(Exception e) {
			System.out.println("Unsuccessfully select_project_Box");
			e.printStackTrace();
		}
	}

	public void select_materialtransfer_projectname()
	{	
		wait.until(ExpectedConditions.visibilityOfAllElements(materialtransfer_project_name));
		try {
			for(int i=0; i<materialtransfer_project_name.size(); i++)
				materialtransfer_project_name.get(2).click();
			System.out.println("succecfully select_transfer_project");
		} catch (Exception e) {
			System.out.println("Unsuccecfully select_transfer_project");
			e.printStackTrace();
		} 
	}

	public void click_transfer_Materila_cta()
	{
		try {
			click_element(materialtransfer_Materila_cta, "Materila_cta");
		} catch (Exception e){
			System.out.println("Unsuccecfully click_on_selectMaterila_tab");
			e.printStackTrace();
		}
	}

	public void click_transfer_materialname()
	{
		try {
			for (int i=0; i<materialtransfer_materiallist_checkBox.size(); i++)
				materialtransfer_materiallist_checkBox.get(1).click();
			System.out.println("succecfully click_on_checkBox_options");
		} catch (Exception e) {
			System.out.println("Unsuccecfully click_on_checkBox_options");
			e.printStackTrace();
		}
	}

	public void click_transfermaterial_next_button()
	{
		try {
			click_element(materialtransfer_materiallist_nextcta, "materiallist_nextcta");
		} catch (Exception e) {
			System.out.println("Unsuccecfully click_on_next_button");
			e.printStackTrace();
		}	
	}

	public void enter_transfermaterial_quantity(String material_quantity)
	{
		wait.until(ExpectedConditions.visibilityOfAllElements(materialtransfer_quantity));
		try {
			set_input_field(materialtransfer_quantity, material_quantity, "quantity");
		} catch (Exception e) {
			System.out.println("Unsuccecfully enter material quanity");
			e.printStackTrace();
		}
	}

	public void enter_materialtransfer_unitrate(String material_rate)
	{
		wait.until(ExpectedConditions.visibilityOfAllElements(materialtransfer_unitrate));
		try {
			set_input_field(materialtransfer_unitrate, material_rate, "unitrate");
		} catch (Exception e) {
			System.out.println("Unsuccecfully enter material rate");
			e.printStackTrace();
		}
	}

	public void click_materialtransfer_discount_popuppage()
	{
		try {
			click_element(materialtransfer_discountpopuppage, "discountpopuppage");
		} catch (Exception e) {
			System.out.println("Unsuccecfully discount_popup_page_open");
			e.printStackTrace();
		}
	}

	public void enter_transfer_itemlevel_Discount(String item_discount)
	{
		try {
			set_input_field(materialtransfer_itemlevel_discount, item_discount, "itemlevel_discount");
		} catch (Exception e) {
			System.out.println("Unsuccecfully enter item_level_Discount");
			e.printStackTrace();
		}
	}

	public void select_transfer_itemlevel_gst()
	{
		wait.until(ExpectedConditions.visibilityOfAllElements(materialtransfer_itemlevel_gst));
		try {
			for (int i=0; i<materialtransfer_itemlevel_gst.size(); i++) 
				materialtransfer_itemlevel_gst.get(2).click();
			System.out.println("succecfully select select_itemlevel_gst");
		} catch (Exception e) {
			System.out.println("Unsuccecfully select select_itemlevel_gst");
			e.printStackTrace();
		}
	}

	public void click_discountPopUp_save_cta()
	{
		wait.until(ExpectedConditions.visibilityOfAllElements(materialtransfer_discountPopUp_savecta));
		try {
			click_element(materialtransfer_discountPopUp_savecta, "discountPopUp_savecta");
		} catch (Exception e) {
			System.out.println("Unsuccecfully click_on_discountPopUp_save_cta");
			e.printStackTrace();
		}
	}

	public void click_materialtransfer_note_cta()
	{
		try {
			click_element(materialtransfer_note_cta, "note_cta");
		} catch (Exception e) {
			System.out.println("Unsuccecfully click_on_note_cta");
			e.printStackTrace();
		}
	}

	public void enter_materialtransfer_note_text(String itemlevel_note)
	{
		try { 
			set_input_field(materialtransfer_note_text, itemlevel_note, "note_text");
		} catch (Exception e) {
			System.out.println("Unsuccecfully enter_note");
			e.printStackTrace();
		}
	}

	public void click_materialtransfer_refresnce_cta()
	{
		try {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", materialtransfer_refresnce_cta);
			click_element(materialtransfer_refresnce_cta, "refresnce_cta");
		} catch (Exception e) {
			System.out.println("Unsuccecfully click_on_refresnce_cta");
			e.printStackTrace();
		}
	}

	public void enter_materialtransfer_refrence_text(String item_level_refresnce)
	{
		try {
			set_input_field(materialtransfer_refrence_text, item_level_refresnce, "refrence_text");
		} catch (Exception e) {
			System.out.println("Unsuccecfully enter_refrence"); 
			e.printStackTrace();
		}
	}

	public void click_materialtransfer_save_cta()
	{
		try {
			click_element(materialtransfer_save_button, "save_button");
		} catch (Exception e) {
			System.out.println("Unsuccecfully click_on_save_cta");
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.invisibilityOf(materialtransfer_save_button));
	}
}
