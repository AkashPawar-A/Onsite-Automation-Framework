package com.onsite.material_purchase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.onsite.core_test.Base_Test;

public class Edit_MaterialPurchaseEntry_IsPaid_Cancel_Cta_Test extends Base_Test{

	private Edit_Material_Purchase_IsPaid_Cancel_Cta_Page materialpurchase_cancelbutton_obj;

	@BeforeMethod
	public void setup() {

		materialpurchase_cancelbutton_obj = new Edit_Material_Purchase_IsPaid_Cancel_Cta_Page(getDriver());
	}

	@Test
	public void verifyEditMaterialPurchaseIsPaidEntry2()
	{
		materialpurchase_cancelbutton_obj.select_project();
		materialpurchase_cancelbutton_obj.select_materialpurchase_entry();
		materialpurchase_cancelbutton_obj.click_materialpurchase_edit_button();
		materialpurchase_cancelbutton_obj.click_back_arrow();
	}

	@AfterMethod
	public void teardown() {
		quitDriver();
	}
}
