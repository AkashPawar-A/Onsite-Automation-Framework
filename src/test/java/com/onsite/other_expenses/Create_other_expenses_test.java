package com.onsite.other_expenses;

import org.testng.annotations.*;

import com.onsite.core_test.Base_Test;
import com.onsite.other_expense.Create_Other_Expense_Page;

public class Create_other_expenses_test extends Base_Test{
	
	private Create_Other_Expense_Page Create_other_expenses_obj;
	
	@BeforeMethod
	public void setUp() {
		Create_other_expenses_obj = new Create_Other_Expense_Page(getDriver());
	}
	
	@Test
	public void verifyCreateOtherExpensePage() {
		Create_other_expenses_obj.select_project();
		Create_other_expenses_obj.click_transaction_tab();
		Create_other_expenses_obj.otherExpense_cta();
		Create_other_expenses_obj.expenses_party();
		Create_other_expenses_obj.select_checkbox();
		Create_other_expenses_obj.expense_quantity(otherexpense.getProperty("Expense_Quantity"));
		Create_other_expenses_obj.expense_unit();
		Create_other_expenses_obj.expense_unitrate(otherexpense.getProperty("Expense_Unit_Rate"));
		Create_other_expenses_obj.expense_discount(otherexpense.getProperty("Expense_Discount"));
		Create_other_expenses_obj.additionalcharges(otherexpense.getProperty("Additional_Charges"));
		Create_other_expenses_obj.expense_tax(otherexpense.getProperty("Expense_GST"));
		Create_other_expenses_obj.costcode();
		Create_other_expenses_obj.totalAmount();
		Create_other_expenses_obj.save_button();
	}
	
	@AfterMethod
	public void tearDown() {
		quitDriver();
	}
}
