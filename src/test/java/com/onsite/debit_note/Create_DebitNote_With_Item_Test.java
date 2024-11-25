package com.onsite.debit_note;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.onsite.core_test.Base_Test;

public class Create_DebitNote_With_Item_Test extends Base_Test {

	private Create_DebitNote_With_DebitItem_Page create_DebitNote_WithItem_obj;

	@BeforeMethod
	public void setUp() {
		create_DebitNote_WithItem_obj = new Create_DebitNote_With_DebitItem_Page(getDriver());
	}

	@Test
	public void verifyCreateDebitNoteWithItemTestPage() {
		create_DebitNote_WithItem_obj.select_project();
		create_DebitNote_WithItem_obj.click_transaction_tab();
		create_DebitNote_WithItem_obj.click_debitnote_tab();
		create_DebitNote_WithItem_obj.click_debitnote_partyname_filled();
		create_DebitNote_WithItem_obj.select_debitnote_party();
		create_DebitNote_WithItem_obj.click_debitnote_newitem_button();
		create_DebitNote_WithItem_obj.enter_debitnote_itemname(debitnote.getProperty("DebitItemName"));
		create_DebitNote_WithItem_obj.enter_debitnoteitem_estimatedquantity(debitnote.getProperty("DebitEstimatedQuantity"));
		create_DebitNote_WithItem_obj.enter_debitnoteitem_unitrate(debitnote.getProperty("DebitItemRate"));
		create_DebitNote_WithItem_obj.select_debitnoteitemlevel_unit();
		create_DebitNote_WithItem_obj.select_itemlevel_gst();
		create_DebitNote_WithItem_obj.click_newitempage_savebutton();
		create_DebitNote_WithItem_obj.click_debitnote_refresnce_cta();
		create_DebitNote_WithItem_obj.enter_debitnote_refresnce_text(debitnote.getProperty("DebitRefrence"));
		create_DebitNote_WithItem_obj.click_debitnote_note_cta();
		create_DebitNote_WithItem_obj.enter_debitnote_note_text(debitnote.getProperty("DebitNote"));
		create_DebitNote_WithItem_obj.click_debitnotepage_Save_cta();
	}
	
	@AfterMethod
	public void teardown() {
		quitDriver();
	}
}
