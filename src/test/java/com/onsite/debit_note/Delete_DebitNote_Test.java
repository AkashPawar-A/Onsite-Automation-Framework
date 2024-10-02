package com.onsite.debit_note;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.onsite.core_test.Base_Test;

public class Delete_DebitNote_Test extends Base_Test{

	private Delete_Debit_Note_Entry_Page Delete_DebitNoteEntry_Page_obj;

	@BeforeMethod
	public void setUp() {
		Delete_DebitNoteEntry_Page_obj = new Delete_Debit_Note_Entry_Page(getDriver());
	}

	@Test
	public void verify_Delete_Debit_Note_Entry_Page()
	{
		Delete_DebitNoteEntry_Page_obj.select_project();
		Delete_DebitNoteEntry_Page_obj.select_debitnote_entry();	
		Delete_DebitNoteEntry_Page_obj.click_debitnote_delete_button();	
		Delete_DebitNoteEntry_Page_obj.click_debitnote_deletepopup_ok_button();
	}

	@AfterMethod
	public void teardown() {
		quitDriver();
	}
}
