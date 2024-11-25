package com.onsite.material_purchase;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.onsite.base_page.Base_Page;

public class Delete_MaterialPurchase_DelinkPopUp_Ok_Cta_Page extends Base_Page {

	public Delete_MaterialPurchase_DelinkPopUp_Ok_Cta_Page (WebDriver driver) {
		super (driver);
	}

	@FindBy(xpath="//div[contains(@class, 'project-tile')]")
	private List<WebElement> all_project_list;

	@FindBy(xpath="//div[@class=\"row my-1 payment-tab cursor\"]")
	private List<WebElement> select_materialpurchase_entry;

	@FindBy(xpath="//div[@class=\"edit-btn\" and text()=\" Delete \"]")
	private WebElement materialpurchase_viewdetailspage_delete_button;

	@FindBy(xpath="//button[@type=\"button\" and text()=\"Ok\"]")
	private WebElement materialpurchase_delinkpopuppage_ok_button;

	@FindBy(xpath="//button[@type=\"button\" and text()=\"Cancel\"]")
	private WebElement materialpurchase_delinkpopuppage_cancel_button;

	@FindBy(xpath="//div//ng-icon[@name=\"featherChevronLeft\"]")
	private WebElement materialpurchase_editpage_backword_arrow;
    //comment

	public void select_project()
	{
		wait.until(ExpectedConditions.visibilityOfAllElements(all_project_list));
		try
		{
			if(all_project_list.size() > 0) {
				all_project_list.get(1).click();
				System.out.println("successfully select project");
			} else {
				System.out.println("Project list does not have enough elements");
			}
		} catch(Exception e) {
			System.out.println("Unsuccessfully select project");
			e.printStackTrace();
		}
	}

	public void select_one_materialpurchase_entry()
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

	public void click_materialpurchase_viewdetailspage_delete_button()
	{
		wait.until(ExpectedConditions.elementToBeClickable(materialpurchase_viewdetailspage_delete_button));
		try {
			click_element(materialpurchase_viewdetailspage_delete_button, "delete_button");
			if(materialpurchase_delinkpopuppage_ok_button.isDisplayed()) {
				click_element(materialpurchase_delinkpopuppage_ok_button, "delinkpopuppage_ok_button");
			} else if(materialpurchase_delinkpopuppage_cancel_button.isDisplayed()) {
				System.out.println("unsuccessfully clicked on the materialpurchase_delinkpopuppage_cancel_button");
			}else {
				System.out.println("materialpurchase_delinkpopuppage__buttons invisisble");
			}
		} catch(Exception e) {
			System.out.println("Unsuccessfully click on materialpurchase_viewdetailspage_delete_button");
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.invisibilityOf(materialpurchase_viewdetailspage_delete_button));
	}	
}
