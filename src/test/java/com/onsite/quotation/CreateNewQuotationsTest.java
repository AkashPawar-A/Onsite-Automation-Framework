package com.onsite.quotation;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.onsite.core_test.Base_Test;
import com.onsite.quotations.AddQuotationItem_page;

public class CreateNewQuotationsTest extends Base_Test{
	
	private AddQuotationItem_page createQuotationsPage_obj;

	@BeforeMethod
	public void setUp() {
		createQuotationsPage_obj = new AddQuotationItem_page(getDriver());
	}

	@Test
	public  void verifyCreateNewQuotation() throws InterruptedException {
		createQuotationsPage_obj.clickQuotation();
		createQuotationsPage_obj.selectQuotation();		
	}
	
	@AfterMethod
	public void teardown() {
		quitDriver();
	}
}
