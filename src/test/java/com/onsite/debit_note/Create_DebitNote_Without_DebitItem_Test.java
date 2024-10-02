package com.onsite.debit_note;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.onsite.core_test.Base_Test;

public class Create_DebitNote_Without_DebitItem_Test extends Base_Test {

	private Create_DebitNote_Without_DebitItem_Page createDebitNote_without_item_obj;

	@BeforeMethod
	public void setUp() {
		createDebitNote_without_item_obj = new Create_DebitNote_Without_DebitItem_Page(getDriver());
	}

	@Test
	public void testEditDebitNote() {
		createDebitNote_without_item_obj.select_all_project();
		createDebitNote_without_item_obj.click_transaction_tab();
		createDebitNote_without_item_obj.click_debitnote_tab();
		createDebitNote_without_item_obj.click_debitnote_partyfilled();
		createDebitNote_without_item_obj.select_debitnote_party();
		createDebitNote_without_item_obj.enter_debitnote_totalamount(debitnote.getProperty("DebitTotalAmount"));
		createDebitNote_without_item_obj.click_debitnote_refresnce_cta();
		createDebitNote_without_item_obj.enter_debitnote_refresnce_text(debitnote.getProperty("DebitRefrence"));
		createDebitNote_without_item_obj.click_debitnote_note_cta();
		createDebitNote_without_item_obj.enter_debitnote_note_text(debitnote.getProperty("DebitNote"));
		createDebitNote_without_item_obj.click_debitnote_Save_cta();
	}

	@AfterMethod
	public void teardown() {
		quitDriver();
	}
}
