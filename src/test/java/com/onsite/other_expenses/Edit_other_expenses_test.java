package com.onsite.other_expenses;

import org.testng.annotations.*;

import com.onsite.core_test.Base_Test;
import com.onsite.other_expense.Edit_Other_Expense_Page;

public class Edit_other_expenses_test extends Base_Test{
	
	private Edit_Other_Expense_Page Edit_Other_Expense_Page_obj;
	
	@BeforeMethod
	public void setUp() {
		Edit_Other_Expense_Page_obj = new Edit_Other_Expense_Page(getDriver());
	}
	
	@Test
	public void verify_Edit_Other_Expense_Page() {
		Edit_Other_Expense_Page_obj.select_project();
		Edit_Other_Expense_Page_obj.expenses_transaction();
		Edit_Other_Expense_Page_obj.expenses_Edit();
	}
	
	@AfterMethod
	public void teardown() {
		quitDriver();
	}
	

}
