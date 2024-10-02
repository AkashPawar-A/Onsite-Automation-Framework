package com.onsite.debit_note;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.onsite.base_page.Base_Page;

public class Delete_Debit_Note_Entry_Page extends Base_Page{

	public Delete_Debit_Note_Entry_Page(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//div[contains(@class, 'project-tile')]")
	private List<WebElement> all_project_list;

	@FindBy(xpath="//div[@class=\"row my-1 payment-tab cursor\"]")
	private List<WebElement> transactionlist_debitnote_entry;

	@FindBy(xpath="//div[@class=\"edit-btn\" and text()=\" Delete \"]")
	private WebElement debitnote_delete_button;

	@FindBy(xpath="//button[@class=\"btn btn-danger\" and @type=\"button\" and text()=\"Ok\"]")
	private WebElement debitnote_deletepopup_ok_button;


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

	public void select_debitnote_entry()
	{
		wait.until(ExpectedConditions.visibilityOfAllElements(transactionlist_debitnote_entry));
		try {	         
			if (transactionlist_debitnote_entry != null && transactionlist_debitnote_entry.size() > 0) {
				transactionlist_debitnote_entry.get(1).click();
				System.out.println("Successfully clicked on the debit note entry");
			} else {
				System.out.println("Debit note entry list is null or does not have enough elements");
			}
		} catch (NullPointerException e) {
			System.out.println("NullPointerException: Debit note entry list might not be initialized.");
			e.printStackTrace();
		} 
	}

	public void click_debitnote_delete_button()
	{
		wait.until(ExpectedConditions.elementToBeClickable(debitnote_delete_button));
		try{
			click_element(debitnote_delete_button, "delete_button");
			System.out.println("Successfully click_on_viewpage_delete_button");
		}catch(Exception e) {
			System.out.println("Unsuccecfully click_on_viewpage_delete_button");
			e.printStackTrace();
		}
	}

	public void click_debitnote_deletepopup_ok_button()
	{
		wait.until(ExpectedConditions.visibilityOfAllElements(debitnote_deletepopup_ok_button));
		try{
			click_element(debitnote_deletepopup_ok_button, "deletepopup_ok_button");
		}catch(Exception e) {
			System.out.println("Unsuccecfully click on delete_popup_ok_button");
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.invisibilityOf(debitnote_deletepopup_ok_button));
	}
}
