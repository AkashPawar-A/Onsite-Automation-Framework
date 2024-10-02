package com.onsite.material_purchase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.onsite.core_test.Base_Test;

public class Create_MaterialPurchaseEntry_IsUnpaid_Test extends Base_Test {
	
	private Create_MaterialPurchase_IsUnpaid_Page Create_MaterialPurchase_IsUnpaid_Page_obj;
	
	@BeforeMethod
	public void setUp()
	{
		Create_MaterialPurchase_IsUnpaid_Page_obj = new Create_MaterialPurchase_IsUnpaid_Page(getDriver());
	}
	
	@Test
	public void verifyCreateMaterialPurchasePage()
	{
		Create_MaterialPurchase_IsUnpaid_Page_obj.select_project();
		Create_MaterialPurchase_IsUnpaid_Page_obj.click_projectlevel_transaction_tab();
		Create_MaterialPurchase_IsUnpaid_Page_obj.click_material_purchase_tab();
		Create_MaterialPurchase_IsUnpaid_Page_obj.click_materialpurchase_party_filled();
		Create_MaterialPurchase_IsUnpaid_Page_obj.select_materialpurchase_party_list();
		Create_MaterialPurchase_IsUnpaid_Page_obj.select_materialpurchase_addmaterial_cta_1();
		Create_MaterialPurchase_IsUnpaid_Page_obj.click_materiallistpage_next_cta();		
		Create_MaterialPurchase_IsUnpaid_Page_obj.enter_materialpurchase_quantity(materialPurchase.getProperty("MaterialQuantity"));
		Create_MaterialPurchase_IsUnpaid_Page_obj.enter_materialpurchase_unit_rate(materialPurchase.getProperty("UnitRate"));
		Create_MaterialPurchase_IsUnpaid_Page_obj.click_itemlevel_discount_or_gst_popuppage();
		Create_MaterialPurchase_IsUnpaid_Page_obj.enter_itemlevel_discount_1(materialPurchase.getProperty("itemlevelDiscount1"));
		Create_MaterialPurchase_IsUnpaid_Page_obj.select_itemlevel_gst_1();
		Create_MaterialPurchase_IsUnpaid_Page_obj.click_itemlevel_discountorgst_save_cta();
		Create_MaterialPurchase_IsUnpaid_Page_obj.enter_materialpurchase_discount_2(materialPurchase.getProperty("EntrylevelDiscount2"));
		Create_MaterialPurchase_IsUnpaid_Page_obj.enter_materialpurchase_charges(materialPurchase.getProperty("charges"));
		Create_MaterialPurchase_IsUnpaid_Page_obj.click_materialpurchase_save_button();
	}
	
	@AfterMethod
	public void teardown() {
		quitDriver();
	}
}
