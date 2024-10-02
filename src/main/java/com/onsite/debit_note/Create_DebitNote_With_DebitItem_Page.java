package com.onsite.debit_note;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import com.onsite.base_page.Base_Page;

public class Create_DebitNote_With_DebitItem_Page extends Base_Page{

	public Create_DebitNote_With_DebitItem_Page(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//div[contains(@class, 'project-tile')]")
	private List<WebElement> all_project_list;

	@FindBy(xpath="//span[@class=\"btn-text d-none d-sm-block\" and text()=\" Create Transaction \"]")
	private WebElement project_transaction_tab;

	@FindBy(xpath="//button[@class=\"custom-transaction-button blue-btn mt-2 ng-star-inserted\" and text()=\"+ Debit Note\"]")
	private WebElement transaction_debitnote_tab;

	@FindBy(xpath="//span[@class=\"ng-star-inserted\"]")
	private WebElement debitnote_party_filled;

	@FindBy(xpath="//div[@class=\"d-flex align-self-center p-3 search-box-row gap-4 ng-star-inserted\"]")
	private List<WebElement> debitnote_party;

	@FindBy(xpath="//span[@class=\"pointer text-end\" and text()=\"+ New Item\"]")
	private WebElement debitnote_newitem_button;

	@FindBy(xpath="//input[@id=\"itemName\" and @type=\"text\"]")
	private WebElement debitnote_itemname;

	@FindBy(xpath="//input[@id=\"estimate-quantity\" and @type=\"text\"]")
	private WebElement debitnote_item_estimatedquantity;

	@FindBy(xpath="//input[@id=\"ratePerUnit\" and @type=\"text\"]")
	private WebElement debitnote_item_unitrate;

	@FindBy(xpath="(//option[contains (@class, 'select-type ng-star-inserted')])[1]")
	private List<WebElement> debitnote_itemunit;

	@FindBy(xpath="(//option[contains (@class, 'select-type ng-star-inserted')])[30]")
	private List<WebElement> debitnote_item_GST;

	@FindBy(xpath="(//div[contains (text(), 'Save')])[2]")
	private WebElement debitnote_itempage_save_button;

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

	public void select_project() {
		wait.until(ExpectedConditions.visibilityOfAllElements(all_project_list));
		if(all_project_list.size() > 0) {
			all_project_list.get(1).click();
			System.out.println("successfully select project");
		}else {
			System.out.println("Project list does not have enough elements");
		}
	}

	public void click_transaction_tab() {
		wait.until(ExpectedConditions.visibilityOfAllElements(project_transaction_tab));
		click_element(project_transaction_tab, "transaction_tab");
	}

	public void click_debitnote_tab() {
		click_element(transaction_debitnote_tab, "debitnote_tab");
	}

	public void click_debitnote_partyname_filled() {
		click_element(debitnote_party_filled, "party_filled");
	}

	public void select_debitnote_party() {
		wait.until(ExpectedConditions.visibilityOfAllElements(debitnote_party));
		if(debitnote_party.size() > 0) {
			debitnote_party.get(2).click();
			System.out.println("succecfully select Debit Note party");
		}else {
			System.out.println("No parties available to select");
		}
	}

	public void click_debitnote_newitem_button() {
		click_element(debitnote_newitem_button, "newitem_button");
	}

	public void enter_debitnote_itemname(String ItemName) {
		set_input_field(debitnote_itemname, ItemName, "debitnote_itemname");
	}

	public void enter_debitnoteitem_estimatedquantity(String EstimatedQuantity) {
		set_input_field(debitnote_item_estimatedquantity, EstimatedQuantity, "item_estimatedquantity");
	}

	public void enter_debitnoteitem_unitrate(String itemUnitRate) {
		set_input_field(debitnote_item_unitrate, itemUnitRate, "item_unitrate");
	}

	public void select_debitnoteitemlevel_unit()
	{
		try {
			if(debitnote_itemunit !=null && debitnote_itemunit.size() > 0) {
				debitnote_itemunit.get(5).click();
				System.out.println("succecfully select item unit");
			}else {
				System.out.println("No unit available to select");
			}
		}catch(Exception e) {
			System.out.println("Unsuccecfully select item unit");
			e.printStackTrace();
		}
	}

	public void select_itemlevel_gst()
	{
		try {
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

	public void click_newitempage_savebutton()
	{
		try {
			click_element(debitnote_itempage_save_button, "itempage_save_button");
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

	@Test
	public void enter_debitnote_refresnce_text(String Refrence)
	{
		try {
			set_input_field(debitnote_refresnce_text, Refrence, "refresnce_text");
		}catch(Exception e) {
			System.out.println("Unsuccecfully enter Debit Note refresnce");
			e.printStackTrace();
		}
	}

	public void click_debitnote_note_cta()
	{
		try {
			click_element(debitnote_note_cta, "note_cta");
		}catch(Exception e) {
			System.out.println("Unsuccecfully click on Note cta");
			e.printStackTrace();
		}
	}

	public void enter_debitnote_note_text(String Note)
	{
		try	{
			set_input_field(debitnote_note_text, Note, "note_text");
		}catch(Exception e) {
			System.out.println("Unsuccecfully enter Note text");
			e.printStackTrace();
		}
	}

	public void click_debitnotepage_Save_cta()
	{
		wait.until(ExpectedConditions.visibilityOfAllElements(debitnote_save_cta));
		try{
			click_element(debitnote_save_cta, "save_cta");
		}catch(Exception e) {
			System.out.println("Unsuccecfully click on debit note page save cta");
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.invisibilityOf(debitnote_save_cta));
	}
}
