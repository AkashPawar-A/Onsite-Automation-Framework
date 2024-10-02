package com.onsite.material_purchase;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.onsite.base_page.Base_Page;

public class Edit_Material_Purchase_IsPaid_Cancel_Cta_Page extends Base_Page {

	public Edit_Material_Purchase_IsPaid_Cancel_Cta_Page (WebDriver driver) {
		super (driver);
	}

	@FindBy(xpath="//div[contains(@class, 'project-tile')]")
	private List<WebElement> all_project_list;

	@FindBy(xpath="//app-list-transaction[@class=\"d-flex justify-content-center align-items-center ng-star-inserted\"]")
	private List<WebElement> select_materialpurchase_entry;

	@FindBy(xpath="//div[@class=\"edit-btn\" and text()=\" Edit \"]")
	private WebElement materialpurchase_viewdetailspage_edit_button;

	@FindBy(xpath="//button[@type=\"button\" and text()=\"Ok\"]")
	private WebElement materialpurchase_ok_button;

	@FindBy(xpath="//button[@type=\"button\" and text()=\"Cancel\"]")
	private WebElement materialpurchase_cancel_button;

	@FindBy(xpath="//div//ng-icon[@name=\"featherChevronLeft\"]")
	private WebElement materialpurchase_editpage_backword_arrow;


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

	public void select_materialpurchase_entry()
	{
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

	public void click_materialpurchase_edit_button()
	{
		wait.until(ExpectedConditions.elementToBeClickable(materialpurchase_viewdetailspage_edit_button));
		try {
			click_element(materialpurchase_viewdetailspage_edit_button, "edit_button");
			if(materialpurchase_ok_button.isDisplayed()) {
				materialpurchase_ok_button.click();
				System.out.println("Clicked OK button");
			}else if(materialpurchase_cancel_button.isDisplayed()) {
				materialpurchase_cancel_button.click();
				System.out.println("Clicked Cancel button");
			}else {
				System.out.println("Neither OK nor Cancel button is available.");
			}
		} catch(Exception e) {
			System.out.println("Unsuccessfully click on materialpurchase_viewdetailspage_edit_button");
			e.printStackTrace();
		}
	}	

	public void click_back_arrow()
	{
		wait.until(ExpectedConditions.elementToBeClickable(materialpurchase_editpage_backword_arrow));
		try {
			click_element(materialpurchase_editpage_backword_arrow, "edit_button");
		} catch(Exception e) {
			System.out.println("Unsuccessfully click on materialpurchase_editpage_backword_arrow");
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.invisibilityOf(materialpurchase_editpage_backword_arrow));
	}
}
