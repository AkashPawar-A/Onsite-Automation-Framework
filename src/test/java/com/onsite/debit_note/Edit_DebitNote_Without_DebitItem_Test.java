package com.onsite.debit_note;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.onsite.core_test.Base_Test;

public class Edit_DebitNote_Without_DebitItem_Test extends Base_Test{
	
	private Edit_DebitNote_without_DebitItem_Page Edit_debitNote_withoutItem_obj;

	@BeforeMethod
	public void setUp() {
		Edit_debitNote_withoutItem_obj = new Edit_DebitNote_without_DebitItem_Page(getDriver());
	}

	@Test
	public void verifyEditDebitNoteTrest()
	{
		Edit_debitNote_withoutItem_obj.select_project();
		Edit_debitNote_withoutItem_obj.select_debitnote_entry();	
		Edit_debitNote_withoutItem_obj.click_debitnote_editbutton();	
		Edit_debitNote_withoutItem_obj.enter_debitnote_totalamount(debitnote.getProperty("DebitTotalAmount"));
	    Edit_debitNote_withoutItem_obj.click_debitnote_save_button();	
	}

	@AfterMethod
	public void teardown() {
		quitDriver();
	}
}
