package com.onsite.material_purchase;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import com.onsite.base_page.Base_Page;

public class Create_MaterialPurchase_IsPaid_Page extends Base_Page {

	public Create_MaterialPurchase_IsPaid_Page(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//div[contains (@class, 'project-tile')]")
	private List<WebElement> all_project_list;

	@FindBy(xpath="//span[@class=\"btn-text d-none d-sm-block\" and text()=\" Create Transaction \"]")
	private WebElement projectlevel_transaction_tab;

	@FindBy(xpath="//button[@type=\"button\" and text()=\"+ Material Purchase\"]")
	private WebElement transactionlist_material_purchase_tab;

	@FindBy(xpath="//span[@class=\"ng-star-inserted\"]")
	private WebElement materialpurchase_party_filled;

	@FindBy(xpath="//span[@class=\"party-name\"]")
	private List<WebElement> materialpurchase_party_list;

	@FindBy(xpath="//span[@class=\"outlined-btn-font\" and text()=\"+ Add Materials\"]")
	private WebElement materialpurchase_addmaterial_cta_1;

	@FindBy(xpath="//div[@class=\"cursor f-12 ng-star-inserted\" and contains (text(), \" Select Received Items\")]")
	private WebElement materialpurchase_selectReceiveditem_cta_2;

	@FindBy(xpath="//input[@type=\"checkbox\"]")
	private List<WebElement> materialpurchase_materialitemlist;	

	@FindBy(xpath="//span[@class=\"cursor f-12\" and text()=\"+ Add material\"]")
	private WebElement materialpurchase_AddMaterial_cta_3;

	@FindBy(xpath="//div[@class=\"canvas-save-btn\" and text()=\"Next\"]")
	private WebElement materialpurchase_materiallistpage_next_cta;

	@FindBy(xpath="//input[@name=\"quantity\"]")
	private WebElement materialpurchase_quantity;

	@FindBy(xpath="//input[@type=\"text\" and @name=\"unit_rate\"]")
	private WebElement materialpurchase_unit_rate;

	@FindBy(xpath="//div[@class=\"d-flex justify-content-between align-items-center cursor\"]")
	private WebElement itemlevel_discount_or_gst_page;

	@FindBy(xpath="//div[@class=\"w-50 custom-input\"]//input[@type=\"text\"]")
	private WebElement itemlevel_discount_1;

	@FindBy(xpath="//option[@class=\"select-type ng-star-inserted\"]")
	private List<WebElement> itemlevel_gst_1;

	@FindBy(xpath="//button[@class=\"save-btn f-12\" and text()=\" Save \"]")
	private WebElement itemlevel_discount_or_gst_page_save_cta;

	@FindBy(xpath="//input[@type=\"text\" and @name=\"discount\"]")
	private WebElement entrylevel_discount_2;

	@FindBy(xpath="//input[@type=\"text\" and @name=\"charges\"]")
	private WebElement entrylevel_charges;

	@FindBy(xpath="//input[@type=\"text\" and @onmousewheel=\"return false\"]")
	private WebElement materialpurchase_paidamount;

	@FindBy(xpath="//div[@class=\"canvas-save-btn\" and text()=\"Save\"]")
	private WebElement materialpurchase_save_button;


	public void select_project() {
		wait.until(ExpectedConditions.visibilityOfAllElements(all_project_list));
		try{
			all_project_list.get(1).click();
			System.out.println("successfully select project");
		}catch(Exception e) {
			System.out.println("Unsuccessfully select project");
			e.printStackTrace();
		}
	}

	public void click_transaction_tab() {
		wait.until(ExpectedConditions.visibilityOfAllElements(projectlevel_transaction_tab));
		try{
			click_element(projectlevel_transaction_tab, "transaction_tab");
		}catch(Exception e) {
			System.out.println("Unsuccessfully click on projectlevel_transaction_tab");
			e.printStackTrace();
		}
	}

	@Test
	public void click_material_purchase_tab() {
		try{
			click_element(transactionlist_material_purchase_tab, "material_purchase_tab");
		}catch(Exception e) {
			System.out.println("Unsuccessfully select transactiontablist_material_purchase_tab");
			e.printStackTrace();
		}
	}

	@Test
	public void click_materialpurchase_party_filled() {
		try{
			click_element(materialpurchase_party_filled, "creationpage_party_filled");
		}catch(Exception e) {
			System.out.println("Unsuccessfully materialpurchase_creationpage_party_filled");
			e.printStackTrace();
		}
	}

	@Test
	public void select_materialpurchase_party_list() {
		try {
			for(int i=0; i<materialpurchase_party_list.size(); i++) {
				materialpurchase_party_list.get(2).click();
				System.out.println("succecfully select material_purchase_party_name");
			}
		}catch(Exception e) {
			System.out.println("Unsuccessfully select material_purchase_party_name");
			e.printStackTrace();
		}
	}

	@Test
	public void select_materialpurchase_item() {
		try{
			click_element(materialpurchase_addmaterial_cta_1, "Add Materials CTA");
			click_element(materialpurchase_materialitemlist.get(0), "Material Item");
		}catch(Exception e) {
			System.out.println("Neither Add Material CTA nor Select Received Item CTA is displayed");
			if ((materialpurchase_selectReceiveditem_cta_2.isDisplayed())) {
				click_element(materialpurchase_selectReceiveditem_cta_2, "Select Received Item CTA");
				click_element(materialpurchase_materialitemlist.get(0), "Material Item");
			}else {
				System.out.println("Neither Add Material CTA nor Select Received Item CTA is displayed"); }
		}
	}

	@Test
	public void click_materiallistpage_next_cta() {
		try{
			click_element(materialpurchase_materiallistpage_next_cta, "materiallistpage_next_cta");
		}catch(Exception e) {
			System.out.println("Unsuccessfully materiallist_next_cta");
			e.printStackTrace();
		}
	}

	@Test
	public void enter_material_quantity(String material_quantity) {
		try{
			if(material_quantity.isEmpty()) {
				set_input_field(materialpurchase_quantity, material_quantity, "Creationpage_Quantity");
			}else if(!material_quantity.isEmpty()) {
				set_input_field(materialpurchase_quantity, material_quantity, "Creationpage_Quantity");
			}
			else {
				System.out.println("material_quantity is empty");
			}
		}catch(Exception e) {
			System.out.println("Unsuccecfully enter material quanity");
			e.printStackTrace();
		}
	}

	@Test
	public void enter_material_unitrate(String material_rate) {
		try{
			if(material_rate.isEmpty()) {
				set_input_field(materialpurchase_unit_rate, material_rate, "creationpage_unit_rate");
			}else if(!material_rate.isEmpty()) {
				set_input_field(materialpurchase_unit_rate, material_rate, "creationpage_unit_rate");
			}
			else {
				System.out.println("material_rate is empty");
			}
		}catch(Exception e) {
			System.out.println("Unsuccecfully enter material rate");
			e.printStackTrace();
		}
	}

	@Test
	public void click_itemlevel_discount_or_gst_popuppage() {
		try{
			click_element(itemlevel_discount_or_gst_page, "discount_or_gst_popuppage");
		}catch(Exception e) {
			System.out.println("Unsuccecfully discount_popup_page_open");
			e.printStackTrace(); }
	}

	@Test
	public void enter_itemlevel_discount_1(String item_discount_1) {
		try {
			set_input_field(itemlevel_discount_1, item_discount_1, "itemlevel_discount");
		}catch(Exception e) {
			System.out.println("Unsuccecfully enter item_level_Discount_1");
			e.printStackTrace(); }
	}

	@Test
	public void select_itemlevel_gst_1() {
		try {
			if (itemlevel_gst_1.isEmpty()) {
				click_element(itemlevel_gst_1.get(2), "GST");
			} else if(!itemlevel_gst_1.isEmpty()) {}
			else {
				System.out.println("GST list is empty.");
			}
		}catch(Exception e) {
			System.out.println("Error selecting GST");
			e.printStackTrace();
		}
	}

	@Test
	public void click_discountorgst_popuppage_save_cta() {
		wait.until(ExpectedConditions.visibilityOfAllElements(itemlevel_discount_or_gst_page_save_cta));
		try {
			click_element(itemlevel_discount_or_gst_page_save_cta, "discount_or_gst_popuppage_save_cta");
		}catch(Exception e) {
			System.out.println("Unsuccecfully click_on_click_on_materialpurchase_itemlevel_discountorgst_popuppage_save_cta");
			e.printStackTrace(); }
	}

	@Test
	public void enter_entrylevel_discount_2(String discount_2) {
		try {
			set_input_field(entrylevel_discount_2, discount_2, "entrylevel_discount_2");
		}catch(Exception e) {
			System.out.println("Unsuccecfully materialpurchase_entrylevel_discount_2");
			e.printStackTrace(); }
	}

	@Test
	public void enter_entrylevel_charges(String charges) {
		try{
			set_input_field(entrylevel_charges, charges, "entrylevel_charges");
		}catch(Exception e) {
			System.out.println("Unsuccecfully materialpurchase_entrylevel_charges");
			e.printStackTrace(); }
	}

	@Test
	public void enter_materialpurchase_paidamount(String paidAmount) {
		try{
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", materialpurchase_paidamount);
			set_input_field(materialpurchase_paidamount, paidAmount, "creationpage_paidamount");
		}catch(Exception e) {
			System.out.println("Unsuccecfully enter_materialpurchase_creationpage_paidamount");
			e.printStackTrace(); }
	}

	@Test
	public void click_materialpurchase_save_button() {
		wait.until(ExpectedConditions.visibilityOfAllElements(materialpurchase_save_button));
		try{
			click_element(materialpurchase_save_button, "creationpage_save_button");			
		}catch(Exception e) {
			System.out.println("Unsuccecfully click_on_materialpurchase_creationpage_save_button");
			e.printStackTrace(); }		
		wait.until(ExpectedConditions.invisibilityOf(materialpurchase_save_button));
	}
}
