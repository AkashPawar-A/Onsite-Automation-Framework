package com.onsite.material_purchase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.onsite.core_test.Base_Test;

public class Create_MaterialPurchaseEntry_IsPaid_Test extends Base_Test{

	private Create_MaterialPurchase_IsPaid_Page Create_MaterialPurchase_IsPaid_Page_obj;
	private SoftAssert softAssert;
	
	@BeforeMethod
	public void setUp()	{
		Create_MaterialPurchase_IsPaid_Page_obj = new Create_MaterialPurchase_IsPaid_Page(getDriver());
		softAssert = new SoftAssert();
	}

	@Test
	public void verifyCreateMaterialPurchasePage() {
		Create_MaterialPurchase_IsPaid_Page_obj.select_project();
		Create_MaterialPurchase_IsPaid_Page_obj.click_transaction_tab();
		Create_MaterialPurchase_IsPaid_Page_obj.click_material_purchase_tab();
		Create_MaterialPurchase_IsPaid_Page_obj.click_materialpurchase_party_filled();
		Create_MaterialPurchase_IsPaid_Page_obj.select_materialpurchase_party_list();
		Create_MaterialPurchase_IsPaid_Page_obj.select_materialpurchase_item();
		Create_MaterialPurchase_IsPaid_Page_obj.click_materiallistpage_next_cta();		
		Create_MaterialPurchase_IsPaid_Page_obj.enter_material_quantity(materialPurchase.getProperty("MaterialQuantity"));
		Create_MaterialPurchase_IsPaid_Page_obj.enter_material_unitrate(materialPurchase.getProperty("UnitRate"));
		Create_MaterialPurchase_IsPaid_Page_obj.click_itemlevel_discount_or_gst_popuppage();
		Create_MaterialPurchase_IsPaid_Page_obj.enter_itemlevel_discount_1(materialPurchase.getProperty("itemlevelDiscount1"));
		Create_MaterialPurchase_IsPaid_Page_obj.select_itemlevel_gst_1();
		Create_MaterialPurchase_IsPaid_Page_obj.click_discountorgst_popuppage_save_cta();
		Create_MaterialPurchase_IsPaid_Page_obj.enter_entrylevel_discount_2(materialPurchase.getProperty("EntrylevelDiscount2"));
		Create_MaterialPurchase_IsPaid_Page_obj.enter_entrylevel_charges(materialPurchase.getProperty("charges"));
		Create_MaterialPurchase_IsPaid_Page_obj.enter_materialpurchase_paidamount(materialPurchase.getProperty("PaidAmount"));
		Create_MaterialPurchase_IsPaid_Page_obj.click_materialpurchase_save_button();
		Create_MaterialPurchase_IsPaid_Page_obj.getSuccessMessage();
	
		String expectedMessage = "Material Purchase Entry Created Successfully";
		String actualMessage = Create_MaterialPurchase_IsPaid_Page_obj.getSuccessMessage(); 

		softAssert.assertEquals(actualMessage, expectedMessage, "Message mismatch after saving Material Purchase Entry");
		softAssert.assertAll();
	}

	@AfterMethod
	public void teardown() {
		quitDriver();
	}
}
