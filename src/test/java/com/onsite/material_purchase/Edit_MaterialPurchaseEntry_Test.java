package com.onsite.material_purchase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.onsite.core_test.Base_Test;

public class Edit_MaterialPurchaseEntry_Test extends Base_Test{

	private Edit_Material_Purchase_UnPaid_Entry_Page edit_materialpurchase_obj;

	@BeforeMethod
	public void setup() {
		
		edit_materialpurchase_obj = new Edit_Material_Purchase_UnPaid_Entry_Page(getDriver());
	}

	@Test
	public void verifyEditMaterialPurchaseIsPaidEntry() {
		edit_materialpurchase_obj.select_project();
		edit_materialpurchase_obj.select_one_materialpurchase_entry();
		edit_materialpurchase_obj.click_materialpurchase_viewdetailspage_edit_button();	
		edit_materialpurchase_obj.enter_materialpurchase_editpage_quantity(materialPurchase.getProperty("MaterialQuantity"));
		edit_materialpurchase_obj.enter_materialpurchase_editpage_unitrate(materialPurchase.getProperty("UnitRate"));
		edit_materialpurchase_obj.click_materialpurchase_editpage_itemlevel_discount_or_gst();
		edit_materialpurchase_obj.enter_materialpurchase_editpage_itemlevel_discount_1(materialPurchase.getProperty("itemlevelDiscount1"));
		edit_materialpurchase_obj.select_materialpurchase_editpage_itemlevel_gst_1();
		edit_materialpurchase_obj.enter_materialpurchase_editpage_itemlevel_discount_2(materialPurchase.getProperty("EntrylevelDiscount2"));
		edit_materialpurchase_obj.click_materialpurchase_editpage_save_button();
	}

	@AfterMethod
	public void teardown() {
		quitDriver();
	}
}
