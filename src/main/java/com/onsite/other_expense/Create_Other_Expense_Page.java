package com.onsite.other_expense;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.onsite.base_page.Base_Page;

public class Create_Other_Expense_Page extends Base_Page{

	public Create_Other_Expense_Page(WebDriver driver) {
		super (driver);
	}

	@FindBy(xpath="//div[contains (@class, 'project-tile')]")
	private List<WebElement> all_project_list;

	@FindBy(xpath="//span[@class=\"btn-text d-none d-sm-block\" and text()=\" Create Transaction \"]")
	private WebElement projectlevel_transaction_tab;

	@FindBy(xpath="//button[@class=\"custom-transaction-button blue-btn mt-2 ng-star-inserted\" and text()=\"+ Other Expense\"]")
	private WebElement OtherExpense_tab;

	@FindBy(xpath="//div[@class=\"custom-input\"]")
	private WebElement expense_party;

	@FindBy(xpath="//span[@class=\"party-name\"]")
	private List<WebElement> expenses_party_list;

	@FindBy(xpath="//input[@type=\"checkbox\"]")
	private WebElement checkbox;

	@FindBy(xpath="//input[@name=\"quantity\"]")
	private WebElement expenses_quantity;

	@FindBy(xpath="//select[@name=\"unit\"]")
	private WebElement expenses_unit;

	@FindBy(xpath="//option[@name=\"unit\"]")
	private List<WebElement> unit_list;

	@FindBy(xpath="//input[@name=\"unit_rate\"]")
	private WebElement expenses_unitrate;

	@FindBy(xpath="//input[@name=\"earningAmount\"]")
	private WebElement earningamount;

	@FindBy(xpath="//span[@class=\"toggle-title\" or text()=\" + Add Discount \"]")
	private WebElement expenses_discount;

	@FindBy(xpath="//input[@name=\"discountAmount\"]")
	private WebElement add_discount;

	@FindBy(xpath="//span[text()=\" + Add Additional Charges \"]")
	private WebElement additional_charges;

	@FindBy(xpath="//input[@name=\"otherAmount\"]")
	private WebElement add_otherAmount;

	@FindBy(xpath="//span[text()=\" + Add GST \"]")
	private WebElement expenses_tax;

	@FindBy(xpath="//input[@name=\"taxAmount\"]")
	private WebElement add_taxAmount; 

	@FindBy(xpath="//span[text()=\" + Add Cost Code \"]")
	private WebElement addCostCode;

	@FindBy(xpath="//span[text()=\"Select Cost Code\"]")
	private WebElement select_costcode;

	@FindBy(xpath="//ul[@class=\"tree\"]")
	private List<WebElement> costcode_list;

	@FindBy(xpath="//div[text()=\"Save\"]")
	private WebElement costcode_save;

	@FindBy(xpath="//input[@type=\"number\"]")
	private WebElement totalNumber;

	@FindBy(xpath="//div[text()=\"Save\"]")
	private WebElement expenses_save;

	public void select_project() {
		wait.until(ExpectedConditions.visibilityOfAllElements(all_project_list));
		try {
			if (all_project_list.isEmpty()) {
				System.out.println("No projects available in the list to select");
			} else {
				WebElement selected = all_project_list.get(0);
				String projectName = selected.findElement(By.xpath("./child::*[1]/child::*[2]")).getText();
				System.out.println("Successfully selected project: " + projectName);
				selected.click();
			}
		} catch (Exception e) {
			System.out.println("Failed to select a project");
			e.printStackTrace();
		}
	}

	public void click_transaction_tab() {
		wait.until(ExpectedConditions.visibilityOf(projectlevel_transaction_tab));
		try{
			if(projectlevel_transaction_tab.isDisplayed()) {
				click_element(projectlevel_transaction_tab, "project_transaction_tab");
			}else {
				System.out.println("No transaction tab available to select");
			}
		}catch(Exception e) {
			System.out.println("Unsuccessfully click on projectlevel_transaction_tab");
			e.printStackTrace();
		}
	}

	public void otherExpense_cta() {
		wait.until(ExpectedConditions.visibilityOf(OtherExpense_tab));
		try {
			if(OtherExpense_tab.isDisplayed()) {
				click_element(OtherExpense_tab, "OtherExpense_tab");
			}else {
				System.out.println("No other expenses tab available to select");
			}
		}catch(Exception e) {
			System.out.println("Unsuccessfully selected other_Expenses tab");
			e.printStackTrace();
		}
	}

	public void expenses_party() {
		wait.until(ExpectedConditions.visibilityOf(expense_party));
		try {
			if (expense_party.isDisplayed()) {
				click_element(expense_party, "expenses_party");
				
				if (expenses_party_list.isEmpty()) {
					System.out.println("Party list is empty");
				} else if (expenses_party_list.size() > 0) {
					expenses_party_list.get(0).click();
					System.out.println("Successfully selected a party from the list");
				}
			} else {
				System.out.println("Expenses party dropdown is not displayed");
			}
		} catch (Exception e) {
			System.out.println("Unsuccessfully selected expenses party");
			e.printStackTrace();
		}
	}

	public void select_checkbox() {
		wait.until(ExpectedConditions.visibilityOf(checkbox));
		try {
			if(checkbox.isDisplayed()) {
				click_element(checkbox, "checkbox");
			}else {
				System.out.println("No party available to select");
			}
		}catch(Exception e) {
			System.out.println("Unsuccessfully select check box");
			e.printStackTrace();
		}
	}

	public void expense_quantity(String quantity) {
		wait.until(ExpectedConditions.visibilityOfAllElements(expenses_quantity));
		try {
			if(expenses_quantity.isDisplayed()) {
				set_input_field(expenses_quantity, quantity, "quantity : " + quantity);
			}else {
				System.out.println("No expense_quantity available to select");
			}
		}catch(Exception e){
			System.out.println("Unsuccessfully quantity enter");
			e.printStackTrace();
		}
	}

	public void expense_unit() {
		wait.until(ExpectedConditions.visibilityOf(expenses_unit));
		try {
			if(expenses_unit.isDisplayed()) {
				click_element(expenses_unit, "expenses_unit_cta");
				
				if(unit_list.size() > 0) {
					unit_list.get(2).click();
					System.out.println("Successfully select unit : " + unit_list);
				}else {
					System.out.println("No unit available to select");
				}
			}
		}catch(Exception e) {
			System.out.println("Unsuccessfully select the unit");
			e.printStackTrace();
		}
	}

	public void expense_unitrate(String unitrate) {
		wait.until(ExpectedConditions.visibilityOf(expenses_unitrate));
		try {
			if(expenses_unitrate.isDisplayed()) {
				set_input_field(expenses_unitrate, unitrate, "expenses_unitrate : " + unitrate);
			}else {
				System.out.println("No expense_unitrate available to select");
			}
		}catch(Exception e) {
			System.out.println("Unsuccessfully enter unit rate");
			e.printStackTrace();
		}
	}

	public void expense_discount(String discount) {
		wait.until(ExpectedConditions.visibilityOf(expenses_discount));
		try {
			if(expenses_discount.isDisplayed()) {
				click_element(expenses_discount, "expenses_discount");
				
				if(add_discount.isDisplayed())
					set_input_field(add_discount, discount, "expenses_discount : " + discount);
			}else {
				System.out.println("No expense_discount available to select");
			}
		}catch(Exception e) {
			System.out.println("Unsuccessfully enter the unit");
			e.printStackTrace();
		}
	}

	public void additionalcharges(String charges) {
		wait.until(ExpectedConditions.visibilityOf(additional_charges));
		try {
			if(additional_charges.isDisplayed()) {
				click_element(additional_charges, "additional_charges");
				
				if(add_otherAmount.isDisplayed()) {
					set_input_field(add_otherAmount, charges, "additional_charges : " + charges);
				}else {
					System.out.println("No additionalcharges available to select");
				}
			}else {
				System.out.println("No additionalcharges available to select");
			}
		}catch(Exception e) {
			System.out.println("Unsuccesfully addes charges");
			e.printStackTrace();
		}
	}

	public void expense_tax(String tax) {
		try {
			wait.until(ExpectedConditions.visibilityOf(expenses_tax));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", expenses_tax);
			
			if (expenses_tax.isDisplayed()) {
				click_element(expenses_tax, "expenses_tax");
				wait.until(ExpectedConditions.visibilityOf(add_taxAmount));	
				
				if (add_taxAmount.isDisplayed()) {
					set_input_field(add_taxAmount, tax, "expenses_tax: " + tax);
					System.out.println("Successfully entered tax: " + tax);
				} else {
					System.out.println("Tax input field is not visible.");
				}
			} else {
				System.out.println("Tax selection element is not displayed.");
			}
		} catch (Exception e) {
			System.out.println("Failed to enter tax.");
			e.printStackTrace();
		}
	}


	public void costcode() {
		wait.until(ExpectedConditions.visibilityOfAllElements(addCostCode));
		try {
			if (addCostCode.isDisplayed()) {
				click_element(addCostCode, "addCostCode");	

				if (select_costcode.isDisplayed()) {
					click_element(select_costcode, "selectCostCode");	

					if (costcode_list.isEmpty()) {
						System.out.println("Cost code list is empty");	
					} else if (costcode_list.size() > 0) {
						WebElement selected = costcode_list.get(0);
						
						wait.until(ExpectedConditions.visibilityOf(selected));
						((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", selected);
	                    
	                    System.out.println("Successfully selected cost code");
	                    selected.click();
	                    
	                    wait.until(ExpectedConditions.elementToBeClickable(costcode_save));
	                    click_element(costcode_save, "costcode_save_cta");
					} else {
						System.out.println("Cost code list size is invalid or exceeds limit");
					}
				} else {
					System.out.println("Select cost code dropdown is not displayed");
				}
			} else {
				System.out.println("Add cost code button is not displayed");
			}
		} catch (Exception e) {
			System.out.println("Failed to select cost code");
			e.printStackTrace();
		}
	}

	public void totalAmount() {
		wait.until(ExpectedConditions.visibilityOf(totalNumber));
		try {
			String totalamount = totalNumber.getText();
			if(totalamount.isEmpty()) {
				System.out.println("Total amount field is visible but empty.");
			} else {
				System.out.println("Total amount :" + totalamount);
			}	
		}catch(Exception e) {
			System.out.println("Unsuccessfully fetch total number");
			e.printStackTrace();
		}
	}

	public void save_button() {
		wait.until(ExpectedConditions.visibilityOf(expenses_save));
		try {
			if(expenses_save.isDisplayed()) {
				click_element(expenses_save, "expenses_save");
			}else {
				System.out.println("save button does not appears");
			}
		}catch(Exception e){
			System.out.println("Unsuccessfully click on save cta");
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.invisibilityOf(expenses_save));
	}
}


