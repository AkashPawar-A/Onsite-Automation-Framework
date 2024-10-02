package com.onsite.debit_note;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.onsite.base_page.Base_Page;

public class Edit_DebitNote_with_DebitItem_Page extends Base_Page {

	public Edit_DebitNote_with_DebitItem_Page(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//div[contains(@class, 'project-tile')]")
	private List<WebElement> all_project_list;

	@FindBy(xpath="//div[@class=\"row my-1 payment-tab cursor\"]")
	private List<WebElement> transactionlist_debit_note_entry;

	@FindBy(xpath="//div[@class=\"edit-btn\" and text()=\" Edit \"]")
	private WebElement debitnote_edit_button;

	@FindBy(xpath="//ng-icon[@name=\"featherEdit\"]")
	private WebElement debitnote_item_edit_button;

	@FindBy(xpath="//input[@id=\"itemName\" and @type=\"text\"]")
	private WebElement debitnote_item_name;

	@FindBy(xpath="//input[@id=\"estimate-quantity\" and @type=\"text\"]")
	private WebElement debitnoteitem_estimated_quantity;

	@FindBy(xpath="//input[@id=\"ratePerUnit\" and @type=\"text\"]")
	private WebElement debitnote_item_unitrate;

	@FindBy(xpath="(//option[contains (@class, 'select-type ng-star-inserted')])[1]")
	private List<WebElement> debitnote_item_unit;

	@FindBy(xpath="(//option[contains (@class, 'select-type ng-star-inserted')])[30]")
	private List<WebElement> debitnote_item_GST;

	@FindBy(xpath="(//div[contains (text(), 'Save')])[2]")
	private WebElement debitnoteitem_save_button;

	@FindBy(xpath="//span[@class=\"f-12 text-buttons ng-star-inserted\" and text()=\"+ Reference No\"]")
	private WebElement debitnote_refresnce_cta;

	@FindBy(xpath="//input[@type=\"text\" and @class=\"ng-pristine ng-valid ng-touched\"]")
	private WebElement debitnote_refresnce_text;

	@FindBy(xpath="//span[@class=\"f-12 text-buttons ng-star-inserted\" and text()=\"+ Notes\"]")
	private WebElement debitnote_note_cta;

	@FindBy(xpath="//textarea[@class=\"note_component ng-pristine ng-valid ng-touched\"]")
	private WebElement debitnote_note_text;

	@FindBy(xpath="(//div[contains (text(), 'Save')])[1]")
	private WebElement debitnote_save_cta;

	public void select_project()
	{
		wait.until(ExpectedConditions.visibilityOfAllElements(all_project_list));
		try {
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

	public void select_debitnote_entry()
	{
		try {	         
			if (transactionlist_debit_note_entry != null && transactionlist_debit_note_entry.size() > 0) {
				transactionlist_debit_note_entry.get(1).click();
				System.out.println("Successfully clicked on the debit note entry");
			} else {
				System.out.println("select_debit_note_entry is null or does not have enough elements");
			}
		} catch(NullPointerException e) {
			System.out.println("NullPointerException: Debit note entry list might not be initialized.");
			e.printStackTrace();
		} 
	}

	public void click_debitnote_editbutton()
	{
		wait.until(ExpectedConditions.elementToBeClickable(debitnote_edit_button));
		try{
			click_element(debitnote_edit_button, "edit_button");
		}catch(Exception e) {
			System.out.println("Unsuccecfully click on DebitNote entry edit button");
			e.printStackTrace();
		}
	}

	public void click_debitnoteitem_edit_button()
	{
		wait.until(ExpectedConditions.elementToBeClickable(debitnote_item_edit_button));
		try{
			click_element(debitnote_item_edit_button, "edit_button");
		}catch(Exception e) {
			System.out.println("Unsuccecfully click on item edit button");
			e.printStackTrace();
		}
	}

	public void enter_debitnote_itemname(String ItemName)
	{
		try	{
			set_input_field(debitnote_item_name, ItemName, "item_name");
		}catch(Exception e) {
			System.out.println("Unsuccecfully enter item name");
			e.printStackTrace();
		}
	}

	public void enter_debitnoteitem_estimatedquantity(String EstimatedQuantity)
	{
		try{
			set_input_field(debitnoteitem_estimated_quantity, EstimatedQuantity, "estimated_quantity");
		}catch(Exception e) {
			System.out.println("Unsuccecfully enter estimated quantity");
			e.printStackTrace();
		}
	}

	public void enter_debitnoteitem_unitrate(String itemUnitRate)
	{
		try {
			set_input_field(debitnote_item_unitrate, itemUnitRate, "item_unitrate");
		}catch(Exception e) {
			System.out.println("Unsuccecfully enter unit rate");
			e.printStackTrace();
		}
	}

	public void select_debitnoteitem_unit(int itemunit)
	{
		wait.until(ExpectedConditions.visibilityOfAllElements(debitnote_item_unit));
		try {
			if(debitnote_item_unit.size() > 0) {
				debitnote_item_unit.get(4).click();
				System.out.println("succecfully select item unit");
			}else {
				System.out.println("No unit available to select");
			}
		}catch(Exception e) {
			System.out.println("Unsuccecfully select item unit");
			e.printStackTrace();
		}
	}

	public void select_debitnoteitem_gst()
	{
		wait.until(ExpectedConditions.visibilityOfAllElements(debitnote_item_GST));
		try{
			if(debitnote_item_GST.size() > 0) {
				debitnote_item_GST.get(35).click();
				System.out.println("succecfully select item level gst");
			}else {
				System.out.println("No gst available to select");
			}
		}catch(Exception e) {
			System.out.println("Unsuccecfully select item gst");
			e.printStackTrace();
		}
	}

	public void click_itempage_save_button()
	{
		try	{
			click_element(debitnoteitem_save_button, "save_button");
		}catch(Exception e) {
			System.out.println("Unsuccecfully click on new item page Save Button");
			e.printStackTrace();
		}
	}

	public void click_debitnote_refresnce_cta()
	{
		try {
			click_element(debitnote_refresnce_cta, "refresnce_cta");
		}catch(Exception e) {
			System.out.println("Unsuccecfully click on refresnce cta");
			e.printStackTrace();
		}
	}

	public void enter_debitnote_refresnce_text(String Refrence)
	{
		wait.until(ExpectedConditions.visibilityOfAllElements(debitnote_refresnce_text));
		try {
			set_input_field(debitnote_refresnce_text, Refrence, "refresnce_text");
		}catch(Exception e) {
			System.out.println("Unsuccecfully enter Debit Note refresnce");
			e.printStackTrace();
		}
	}

	public void click_debitnotenote_cta()
	{
		try{
			click_element(debitnote_note_cta, "note_cta");
		}catch(Exception e) {
			System.out.println("Unsuccecfully click on Note cta");
			e.printStackTrace();
		}
	}

	public void enter_debitnote_note_text(String Note)
	{
		wait.until(ExpectedConditions.visibilityOfAllElements(debitnote_note_text));
		try {
			set_input_field(debitnote_note_text, Note, "note_text");
		}catch(Exception e) {
			System.out.println("Unsuccecfully enter Note text");
			e.printStackTrace();
		}
	}

	public void click_debitnote_Save_cta()
	{
		wait.until(ExpectedConditions.visibilityOfAllElements(debitnote_save_cta));
		try{
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", debitnote_save_cta);
			click_element(debitnote_save_cta, "save_cta");
		}catch(Exception e) {
			System.out.println("Unsuccecfully click on debit note page save cta");
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.invisibilityOf(debitnote_save_cta));
	}
}
