package com.onsite.material_transfer;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.onsite.base_page.Base_Page;

public class Delete_Material_Transfer_Out_Page extends Base_Page {
	
	public Delete_Material_Transfer_Out_Page (WebDriver driver) {
		super (driver);
	}
	
	@FindBy(xpath="//div[contains(@class, 'project-tile')]")
	private List<WebElement> all_project_list;

	@FindBy(xpath="//div[@class=\"row my-1 payment-tab cursor\"]")
	private List<WebElement> materialtransfer_entrylist;
	
	@FindBy(xpath="//div//ng-icon[@name=\"featherMoreVertical\"]")
	private WebElement materailtransfer_Threedot;
	
	@FindBy(xpath="//span[@class=\"f-12\" and text()=\"Delete\"]")
	private WebElement materailtransfer_delete_button;
	
	@FindBy(xpath="//button[@type=\"button\" and text()=\"Ok\"]")
	private WebElement materailtransfer_ok_button;
	
	public void select_project()
	{
		wait.until(ExpectedConditions.visibilityOfAllElements(all_project_list));
		try {
			if(all_project_list.size() > 0) {
			all_project_list.get(3).click();
			System.out.println("successfully select project");
		} else {
			System.out.println("Project list does not have enough elements"); }
		}catch(Exception e) {
			System.out.println("Unsuccessfully select project");
			e.printStackTrace(); }
	}
	
	public void select_materialtransfer_entry()
	{
		wait.until(ExpectedConditions.visibilityOfAllElements(materialtransfer_entrylist));
		try {	         
			if (materialtransfer_entrylist != null && materialtransfer_entrylist.size()>0) {
				materialtransfer_entrylist.get(1).click();
				System.out.println("Successfully clicked on the material_transfer_entry_list");
			} else {
				System.out.println("Debit note entry list is null or does not have enough elements");
			}
		}catch(NullPointerException e) {
			System.out.println("NullPointerException: material_transfer_entry_list might not be initialized.");
			e.printStackTrace(); } 
	}
	
	public void click_materialtransfer_Threedot()
	{
		wait.until(ExpectedConditions.visibilityOfAllElements(materailtransfer_Threedot));
		try {
			click_element(materailtransfer_Threedot, "materailtransfer_Threedot");;
		}catch(Exception e) {
			System.out.println("Unsuccecfully click_on_3dot_options");
			e.printStackTrace(); }
	}
	
	public void click_materialtransfer_delete_button()
	{
		wait.until(ExpectedConditions.visibilityOfAllElements(materailtransfer_delete_button));
		try {
			click_element(materailtransfer_delete_button, "delete_button");
		}catch(Exception e) {
			System.out.println("Unsuccecfully click_on_edit_button_options");
			e.printStackTrace(); }
	}
	
	public void click_materialtransfer_ok_button()
	{
		wait.until(ExpectedConditions.visibilityOfAllElements(materailtransfer_ok_button));
		try {
			click_element(materailtransfer_ok_button, "ok_button");
		}catch(Exception e) {
			System.out.println("Unsuccecfully select_ok_button");
			e.printStackTrace(); }
		wait.until(ExpectedConditions.invisibilityOf(materailtransfer_ok_button));
	}
}
