package com.onsite.material_purchase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.onsite.core_test.Base_Test;

public class Edit_MaterialPurchaseEntry_IsPaid_Ok_Cta_Test extends Base_Test{

	private Edit_Material_Purchase_IsPaid_OK_Cta_Page materialpurchase_Paid_okbutton_obj;

	@BeforeMethod
	public void setup() {

		materialpurchase_Paid_okbutton_obj = new Edit_Material_Purchase_IsPaid_OK_Cta_Page(getDriver());
	}

	@Test
	public void verifyEditMaterialPurchaseIsPaidEntry2()
	{
		materialpurchase_Paid_okbutton_obj.select_project();
		materialpurchase_Paid_okbutton_obj.select_materialpurchase_entry();
		materialpurchase_Paid_okbutton_obj.click_materialpurchase_viewdetailspage_edit_button();
		materialpurchase_Paid_okbutton_obj.enter_material_quantity(materialPurchase.getProperty("MaterialQuantity"));
		materialpurchase_Paid_okbutton_obj.enter_material_unitrate(materialPurchase.getProperty("UnitRate"));
		materialpurchase_Paid_okbutton_obj.click_itemlevel_discount_or_gst_popuppage(materialPurchase.getProperty("itemlevelDiscount1"));
		materialpurchase_Paid_okbutton_obj.select_itemlevel_gst_1();
		materialpurchase_Paid_okbutton_obj.enter_entrylevel_discount_2(materialPurchase.getProperty("EntrylevelDiscount2"));
		materialpurchase_Paid_okbutton_obj.enter_entrylevel_charges(materialPurchase.getProperty("charges"));
		materialpurchase_Paid_okbutton_obj.enter_materialpurchase_paidamount(materialPurchase.getProperty("PaidAmount"));
		materialpurchase_Paid_okbutton_obj.click_materialpurchase_save_button();
	}

	@AfterMethod
	public void teardown() {
		quitDriver();
	}
}
