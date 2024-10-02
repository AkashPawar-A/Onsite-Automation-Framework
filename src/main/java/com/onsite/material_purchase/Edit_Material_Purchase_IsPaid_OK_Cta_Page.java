package com.onsite.material_purchase;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.onsite.base_page.Base_Page;

public class Edit_Material_Purchase_IsPaid_OK_Cta_Page extends Base_Page {

	public Edit_Material_Purchase_IsPaid_OK_Cta_Page (WebDriver driver) {
		super (driver);
	}

	@FindBy(xpath="//div[contains(@class, 'project-tile')]")
	private List<WebElement> all_project_list;

	@FindBy(xpath="//app-list-transaction[@class=\"d-flex justify-content-center align-items-center ng-star-inserted\"]")
	private List<WebElement> select_materialpurchase_entry;

	@FindBy(xpath="//div[@class=\"edit-btn\" and text()=\" Edit \"]")
	private WebElement materialpurchase_edit_button;

	@FindBy(xpath="//button[@type=\"button\" and text()=\"Ok\"]")
	private WebElement materialpurchase_popuppage_ok_button;

	@FindBy(xpath="//button[@type=\"button\" and text()=\"Cancel\"]")
	private WebElement materialpurchase_popuppage_cancel_button;

	@FindBy(xpath="//input[@type=\"text\" and @name=\"quantity\"]")
	private WebElement materialpurchase_quantity;

	@FindBy(xpath="//input[@type=\"text\" and @name=\"unit_rate\"]")
	private WebElement materialpurchase_unitrate;

	@FindBy(xpath="//div[@class=\"d-flex justify-content-between align-items-center cursor\"]")
	private WebElement materialpurchase__discountorgst_popuppage;

	@FindBy(xpath="//div[@class=\"w-50 custom-input\"]//input[@type=\"text\"]")
	private WebElement materialpurchase_discount_1;

	@FindBy(xpath="//option[@class=\"select-type ng-star-inserted\"]")
	private List<WebElement> materialpurchase_gst_1;

	@FindBy(xpath="//input[contains (@type, 'text') and @name=\"discount\"]")
	private WebElement materialpurchase_itemlevel_discount_2;

	@FindBy(xpath="//input[contains (@type, 'text') and @name=\"charges\"]")
	private WebElement entrylevel_charges;

	@FindBy(xpath="//input[@type=\"text\" and @onmousewheel=\"return false\"]")
	private WebElement materialpurchase_paidamount;

	@FindBy(xpath="//div[@class=\"canvas-save-btn\" and text()=\"Save\"]")
	private WebElement materialpurchase_editpage_save_button;


	public void select_project() {
		wait.until(ExpectedConditions.visibilityOfAllElements(all_project_list));
			if(all_project_list.size() > 0) {
				all_project_list.get(1).click();
				System.out.println("successfully select project");
			} else {
				System.out.println("Project list does not have enough elements");
			}
	}

	public void select_materialpurchase_entry()
	{
		wait.until(ExpectedConditions.visibilityOfAllElements(select_materialpurchase_entry));
		try {	         
			if (select_materialpurchase_entry != null && select_materialpurchase_entry.size() > 0) {
				select_materialpurchase_entry.get(1).click();
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
		wait.until(ExpectedConditions.elementToBeClickable(materialpurchase_edit_button));
		try {
			boolean inUnsettle = true;
			boolean isOk = true;
			boolean isCancel = true;
			if(inUnsettle) {
				click_element(materialpurchase_edit_button, "edit_button");
				if(isOk) {
					click_element(materialpurchase_popuppage_ok_button, "delinkpopuppage_ok_button");
				}
				else if(isCancel) {
					click_element(materialpurchase_popuppage_cancel_button, "delinkpopuppage_cancel_button");
				}
			}else {
				System.out.println("Exception: materialpurchase_delinkpopuppage might not be initialized.");
			}	
		} catch(Exception e) {
			System.out.println("Unsuccessfully click on materialpurchase_viewdetailspage_edit_button");
			e.printStackTrace();
		}
	}	

	public void enter_material_quantity(String quantity) {
		try {
			materialpurchase_quantity.clear();
			set_input_field(materialpurchase_quantity, quantity, "Quantity");
		} catch (Exception e) {
			System.out.println("Exception occurred while setting GST item.");
			e.printStackTrace();
		}
	}

	public void enter_material_unitrate(String unitrate) {
		try {
			materialpurchase_unitrate.clear();
			set_input_field(materialpurchase_unitrate, unitrate, "Unitrate");
		} catch (Exception e) {
			System.out.println("Exception occurred while setting GST item.");
			e.printStackTrace();
		}
	}

	public void click_itemlevel_discount_or_gst_popuppage(String itemlevel_discount_1) {
		try {
			click_element(materialpurchase__discountorgst_popuppage, "discount_or_gst_page");
			materialpurchase_discount_1.clear();
			set_input_field(materialpurchase_discount_1, itemlevel_discount_1, "Itemlevel_Discount_1");
		} catch (Exception e) {
			System.out.println("Exception occurred while setting GST item.");
			e.printStackTrace();
		}
	}

	public void select_itemlevel_gst_1() {
		try {
			wait.until(ExpectedConditions.visibilityOfAllElements(materialpurchase_gst_1));
			if (materialpurchase_gst_1 != null && !materialpurchase_gst_1.isEmpty()) {
				System.out.println("GST list is not empty.");
			}
			else if(materialpurchase_gst_1.size() > 3) {
				materialpurchase_gst_1.get(3).click();
				System.out.println("Successfully clicked on the materialpurchase_editpage_itemlevel_gst_1");
			} else {
				System.out.println("GST list does not contain enough elements.");
			}
		} catch (Exception e) {
			System.out.println("Exception occurred while setting GST item.");
			e.printStackTrace();
		}
	}

	public void enter_entrylevel_charges(String charges) {
		try{
			set_input_field(entrylevel_charges, charges, "entrylevel_charges");
		}catch(Exception e) {
			System.out.println("Unsuccecfully materialpurchase_entrylevel_charges");
			e.printStackTrace(); }
	}

	public void enter_entrylevel_discount_2(String itemlevel_discount_2) {
		try {
			materialpurchase_itemlevel_discount_2.clear();
			set_input_field(materialpurchase_itemlevel_discount_2, itemlevel_discount_2, "Itemlevel_Discount_2");
		} catch (Exception e) {
			System.out.println("Exception occurred while setting GST item.");
			e.printStackTrace();
		}
	}

	public void enter_materialpurchase_paidamount(String paidAmount) {
		try{
			set_input_field(materialpurchase_paidamount, paidAmount, "creationpage_paidamount");
		}catch(Exception e) {
			System.out.println("Unsuccecfully enter_materialpurchase_creationpage_paidamount");
			e.printStackTrace(); }
	}

	public void click_materialpurchase_save_button() {
		try {
			click_element(materialpurchase_editpage_save_button, "save_button");
		} catch (Exception e) {
			System.out.println("Exception occurred while setting GST item.");
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.invisibilityOf(materialpurchase_editpage_save_button));
	}
}
