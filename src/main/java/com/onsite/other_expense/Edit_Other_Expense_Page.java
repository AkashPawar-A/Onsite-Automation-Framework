package com.onsite.other_expense;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.onsite.base_page.Base_Page;

public class Edit_Other_Expense_Page extends Base_Page{

	public Edit_Other_Expense_Page(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//div[contains (@class, 'project-tile')]")
	private List<WebElement> all_project_list;

	@FindBy(xpath="//app-list-transaction[@class=\"d-flex justify-content-center align-items-center ng-star-inserted\"]")
	private List<WebElement> trasaction_list;

	@FindBy(xpath="//div[text()=\" Edit \"]")
	private WebElement expenses_edit;

	@FindBy(xpath="//input[@class=\"ng-pristine ng-valid ng-touched\"]")
	private WebElement expenses_party;

	@FindBy(xpath="//div[@class=\"d-flex align-self-center p-3 search-box-row gap-4 ng-star-inserted\"]")
	private List<WebElement> party_list;

	@FindBy(xpath="//input[@name=\"quantity\"]")
	private WebElement expenses_quantity;

	@FindBy(xpath="//select[@name=\"unit\"]")
	private WebElement expenses_unit;

	@FindBy(xpath="//option[@name=\"unit\"]")
	private List<WebElement> unit_list;

	@FindBy(xpath="//input[@name=\"unit_rate\"]")
	private WebElement expenses_unitrate;

	@FindBy(xpath="//input[@name=\"discountAmount\"]")
	private WebElement expenses_discount;

	@FindBy(xpath="//input[@name=\"otherAmount\"]")
	private WebElement expenses_charges;

	@FindBy(xpath="//input[@name=\"taxAmount\"]")
	private WebElement expenses_tax;

	@FindBy(xpath="//div[text()=\"Save\"]")
	private WebElement expenses_save;

	public void select_project() {
		wait.until(ExpectedConditions.visibilityOfAllElements(all_project_list));
		try {
			if (all_project_list.isEmpty()) {
				System.out.println("No projects available to select.");
			} else {
				WebElement selected = all_project_list.get(0);
				String projectName = selected.findElement(By.xpath("./child::*[1]/child::*[2]")).getText();
				System.out.println("Selected project name: " + projectName);
				selected.click();
			}
		} catch (Exception e) {
			System.out.println("An unexpected error occurred while selecting a project.");
			e.printStackTrace();
		}
	}

	public void expenses_transaction() {
		wait.until(ExpectedConditions.visibilityOfAllElements(trasaction_list));
		try {
			if(trasaction_list.isEmpty()) {
				System.out.println("No transaction available to select.");
			}else {
				if (trasaction_list.size() > 0) {
					WebElement selected = trasaction_list.get(9);
					((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", selected);
					String transactionName = selected.findElement(By.xpath("./child::*[1]/child::*[4]/child::*[6]")).getText();
					System.out.println("Selected trasaction name : " + transactionName);
					selected.click();
				}else {
					System.out.println("Not enough transactions available to select the 9th entry.");
				}
			}
		}catch(Exception e) {
			System.out.println("Unsuccessfully select expenses transactions");
			e.printStackTrace();
		}
	}

	public void expenses_Edit() {
		wait.until(ExpectedConditions.visibilityOfAllElements(expenses_edit));
		try {
			if(expenses_edit.isDisplayed()) {
				click_element(expenses_edit, "expenses_Edit");
			}else {
				System.out.println("expenses_Edit is not appears");
			}
		}catch(Exception e) {
			System.out.println("Unsuccessfully select expenses_Edit cta");
			e.printStackTrace();
		}
	}

	public void expenses_party(String partyNameToSelect) {
		wait.until(ExpectedConditions.visibilityOf(expenses_party));
		try {
			if (expenses_party.isDisplayed()) {
				click_element(expenses_party, "expenses_party");
				if (party_list.isEmpty()) {
					System.out.println("Party list is empty.");
				} else {
					for (WebElement party : party_list) {
						String partyName = party.findElement(By.xpath("./child::*[1]/child::*[2]")).getText();
						if (partyName.equalsIgnoreCase(partyNameToSelect)) {
							System.out.println("Found and selecting party: " + partyName);
							party.click();
							return;
						}
					}
					WebElement defaultParty = party_list.get(0);
					String defaultPartyName = defaultParty.findElement(By.xpath("./child::*[1]/child::*[2]")).getText();
					System.out.println("Default party selected: " + defaultPartyName);
					defaultParty.click();
				}
			} else {
				System.out.println("Expenses party dropdown is not displayed.");
			}
		} catch (Exception e) {
			System.out.println("Unexpected error occurred while selecting expenses party.");
			e.printStackTrace();
		}
	}


}
