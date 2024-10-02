package com.onsite.debit_note;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.onsite.core_test.Base_Test;

public class Edit_Debit_Note_with_debititem_Test extends Base_Test {

	private Edit_DebitNote_with_DebitItem_Page EditDebitNotePage_withItem_obj;

	@BeforeMethod
	public void setUp() {
		EditDebitNotePage_withItem_obj = new Edit_DebitNote_with_DebitItem_Page(getDriver());
	}

	@Test
	public void verifyEditDebitNoteTrest()
	{
		EditDebitNotePage_withItem_obj.select_project();
		EditDebitNotePage_withItem_obj.select_debitnote_entry();	
		EditDebitNotePage_withItem_obj.click_debitnote_editbutton();			
		EditDebitNotePage_withItem_obj.click_debitnoteitem_edit_button();		
		EditDebitNotePage_withItem_obj.enter_debitnote_itemname(debitnote.getProperty("DebitItemName"));
		EditDebitNotePage_withItem_obj.enter_debitnoteitem_estimatedquantity(debitnote.getProperty("DebitEstimatedQuantity"));
		EditDebitNotePage_withItem_obj.enter_debitnoteitem_unitrate(debitnote.getProperty("DebitItemRate"));
		EditDebitNotePage_withItem_obj.select_debitnoteitem_unit(3);
		EditDebitNotePage_withItem_obj.select_debitnoteitem_gst();
		EditDebitNotePage_withItem_obj.click_itempage_save_button();
		EditDebitNotePage_withItem_obj.click_debitnote_refresnce_cta();
		EditDebitNotePage_withItem_obj.enter_debitnote_refresnce_text(debitnote.getProperty("DebitRefrence"));
		EditDebitNotePage_withItem_obj.click_debitnotenote_cta();
		EditDebitNotePage_withItem_obj.enter_debitnote_note_text(debitnote.getProperty("DebitNote"));
		EditDebitNotePage_withItem_obj.click_debitnote_Save_cta();
	}

	@AfterMethod
	public void teardown() {
		quitDriver();
	}
}
