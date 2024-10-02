package com.onsite.debit_note;

import java.util.List;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.onsite.base_page.Base_Page;

public class Create_DebitNote_Without_DebitItem_Page extends Base_Page{

	public Create_DebitNote_Without_DebitItem_Page(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//div[contains(@class, 'project-tile')]")
	private List<WebElement> all_project_list;

	@FindBy(xpath="//span[@class=\"btn-text d-none d-sm-block\" and text()=\" Create Transaction \"]")
	private WebElement project_transaction_tab;

	@FindBy(xpath="//button[@class=\"custom-transaction-button blue-btn mt-2 ng-star-inserted\" and text()=\"+ Debit Note\"]")
	private WebElement transaction_Debitnote_tab;

	@FindBy(xpath="//span[@class=\"ng-star-inserted\"]")
	private WebElement debitnote_party_filled;

	@FindBy(xpath="//div[@class=\"d-flex align-self-center p-3 search-box-row gap-4 ng-star-inserted\"]")
	private List<WebElement> debitnote_party;

	@FindBy(xpath="//input[@name=\"total_amount\"]")
	private WebElement debitnote_totalamount;

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

	public void select_all_project()
	{
		wait.until(ExpectedConditions.visibilityOfAllElements(all_project_list));
		try {
			if(all_project_list.size() > 0) {
				all_project_list.get(1).click();
				System.out.println("successfully select project");
			}else {
				System.out.println("Project list does not have enough elements");
			}
		}catch(Exception e) {
			System.out.println("Unsuccessfully select project");
			e.printStackTrace();
		}
	}

	public void click_transaction_tab()
	{
		wait.until(ExpectedConditions.visibilityOfAllElements(project_transaction_tab));
		try {
			click_element(project_transaction_tab, "transaction_tab");
		}catch(Exception e) {
			System.out.println("Unsuccessfully click on transaction tab");
			e.printStackTrace();
		}
	}

	public void click_debitnote_tab()
	{
		try{
			click_element(transaction_Debitnote_tab, "Debitnote_tab");
		}catch(Exception e) {
			System.out.println("Unsuccecfully click on Debit Note tab");
			e.printStackTrace();
		}
	}

	public void click_debitnote_partyfilled()
	{
		try{
			click_element(debitnote_party_filled, "party_filled");
		}catch(Exception e) {
			System.out.println("Unsuccecfully click on Debit Note party filled");
			e.printStackTrace();
		}
	}

	public void select_debitnote_party()
	{
		wait.until(ExpectedConditions.visibilityOfAllElements(debitnote_party));
		try{
			if(debitnote_party.size() > 0) {
				debitnote_party.get(2).click();
				System.out.println("succecfully select Debit Note party");
			}else {
				System.out.println("No parties available to select");
			}
		}catch(Exception e) {
			System.out.println("Unsuccecfully select Debit Note party");
			e.printStackTrace();
		}
	}

	public void enter_debitnote_totalamount(String TotalAmount)
	{
		try{
			set_input_field(debitnote_totalamount, TotalAmount, "totalamount");
		}catch(Exception e) {
			System.out.println("Unsuccecfully enter Debit Note total amount");
			e.printStackTrace();
		}
	}

	public void click_debitnote_refresnce_cta()
	{
		try{
			click_element(debitnote_refresnce_text, "refresnce_text");
		}catch(Exception e) {
			System.out.println("Unsuccecfully click on refresnce cta");
			e.printStackTrace();
		}
	}

	public void enter_debitnote_refresnce_text(String Refrence)
	{
		wait.until(ExpectedConditions.visibilityOfAllElements(debitnote_refresnce_cta));
		try{
			set_input_field(debitnote_refresnce_cta, Refrence, "refresnce_cta");
		}catch(Exception e) {
			System.out.println("Unsuccecfully enter Debit Note refresnce");
			e.printStackTrace();
		}
	}

	public void click_debitnote_note_cta()
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
			set_input_field(debitnote_note_text, Note, "debitnote_note_text");
		}catch(Exception e) {
			System.out.println("Unsuccecfully enter Note text");
			e.printStackTrace();
		}
	}

	public void click_debitnote_Save_cta()
	{
		wait.until(ExpectedConditions.visibilityOfAllElements(debitnote_save_cta));
		try{
			click_element(debitnote_save_cta, "save_cta");
		}catch(Exception e) {
			System.out.println("Unsuccecfully click on save cta");
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.invisibilityOf(debitnote_save_cta));
	}
}
