package com.onsite.debit_note;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.onsite.base_page.Base_Page;

public class Edit_DebitNote_without_DebitItem_Page extends Base_Page {

	public Edit_DebitNote_without_DebitItem_Page(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//div[contains(@class, 'project-tile')]")
	private List<WebElement> all_project_list;

	@FindBy(xpath="//div[@class=\"row my-1 payment-tab cursor\"]")
	private List<WebElement> transactionlist_debit_note_entry;

	@FindBy(xpath="//div[@class=\"edit-btn\" and text()=\" Edit \"]")
	private WebElement debitentrypage_edit_button;

	@FindBy(xpath="//input[@name=\"total_amount\"]")
	private WebElement debitnote_totalamount;

	@FindBy(xpath="//div[@class=\"canvas-save-btn\" and text()=\"Save\"]")
	private WebElement debitnote_editpage_save_button;


	public void select_project()
	{
		wait.until(ExpectedConditions.visibilityOfAllElements(all_project_list));
		try{
			if(all_project_list.size() > 0) {
				all_project_list.get(3).click();
				System.out.println("successfully select project");
			}else {
				System.out.println("Project list does not have enough elements");
			}
		}catch(Exception e) {
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
		wait.until(ExpectedConditions.elementToBeClickable(debitentrypage_edit_button));
		try{
			click_element(debitentrypage_edit_button, "edit_button");
		}catch(Exception e) {
			System.out.println("Unsuccecfully click on DebitNote entry edit button");
			e.printStackTrace();
		}
	}

	public void enter_debitnote_totalamount(String TotalAmount)
	{
		try{
			set_input_field(debitnote_totalamount, TotalAmount, "totalamount");
			System.out.println("succecfully enter Debit Note Total Amount");
		}catch(Exception e) {
			System.out.println("Unsuccecfully enter Debit Note total amount");
			e.printStackTrace();
		}
	}

	public void click_debitnote_save_button()
	{
		wait.until(ExpectedConditions.visibilityOfAllElements(debitnote_editpage_save_button));
		try {
			click_element(debitnote_editpage_save_button, "save_button");
		}catch(Exception e) {
			System.out.println("Unsuccecfully click_on_editpage_save_button");
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.invisibilityOf(debitnote_editpage_save_button));
	}
}
