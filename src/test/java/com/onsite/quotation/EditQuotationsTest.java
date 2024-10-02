package com.onsite.quotation;

import org.testng.annotations.Test;

import com.onsite.quotations.EditQuotationsItem_page;

public class EditQuotationsTest {

	EditQuotationsItem_page verifyEditQuotationsTestPage_obj;

	@Test
	public void verifyEditQuotationsTestPage() throws InterruptedException
	{
		verifyEditQuotationsTestPage_obj.onsiteHomePage();
		verifyEditQuotationsTestPage_obj.selectQuotationOptions();
		verifyEditQuotationsTestPage_obj.selectQuotationEntry();
		verifyEditQuotationsTestPage_obj.clickOnEditbutton();
		verifyEditQuotationsTestPage_obj.selectQuotationsItem();
	}
}
