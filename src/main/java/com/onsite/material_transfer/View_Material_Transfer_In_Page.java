package com.onsite.material_transfer;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.onsite.base_page.Base_Page;

public class View_Material_Transfer_In_Page extends Base_Page {
	
	public View_Material_Transfer_In_Page (WebDriver driver) {
		super (driver);
	}
	
	@FindBy(xpath="//div[contains(@class, 'project-tile')]")
	private List<WebElement> all_project_list;

	@FindBy(xpath="//div[@class=\"row my-1 payment-tab cursor\"]")
	private List<WebElement> material_transfer_entry_list;
	
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
		} catch (NullPointerException e) {
			System.out.println("NullPointerException: material_transfer_entry_list might not be initialized.");
			e.printStackTrace();
		} 
		wait.until(ExpectedConditions.invisibilityOfAllElements(material_transfer_entry_list));
	}
}
