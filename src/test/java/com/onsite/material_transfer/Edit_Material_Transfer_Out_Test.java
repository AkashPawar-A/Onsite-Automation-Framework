package com.onsite.material_transfer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.onsite.core_test.Base_Test;

public class Edit_Material_Transfer_Out_Test extends Base_Test{

	public Edit_Material_Transfer_Out_Page Create_Material_Transfer_In_Test_obj;

	@BeforeMethod
	public void setUp() {
		Create_Material_Transfer_In_Test_obj = new Edit_Material_Transfer_Out_Page(getDriver());
	}

	@Test
	public void verirfyEditMaterialTransferInPage()
	{
		Create_Material_Transfer_In_Test_obj.select_project();
		Create_Material_Transfer_In_Test_obj.select_material_transfer_entry();
		Create_Material_Transfer_In_Test_obj.click_materialtransfer_threedot();
		Create_Material_Transfer_In_Test_obj.click_materialtransfer_edit_button();
		Create_Material_Transfer_In_Test_obj.enter_materialtransfer_quantity(materialtransfer.getProperty("MaterialQuantity"));
		Create_Material_Transfer_In_Test_obj.enter_materialtransfer_unitrate(materialtransfer.getProperty("MaterialUnitRate"));
		Create_Material_Transfer_In_Test_obj.click_materialtransfer_discount_popuppage();
		Create_Material_Transfer_In_Test_obj.enter_materialtransfer_itemlevel_Discount_1(materialtransfer.getProperty("MaterilDiscount1"));
		Create_Material_Transfer_In_Test_obj.select_materialtransfer_itemlevel_gst_1();
		Create_Material_Transfer_In_Test_obj.click_materialtransfer_PopUpPage_save_cta();
		Create_Material_Transfer_In_Test_obj.click_materialtransfer_note_cta();
		Create_Material_Transfer_In_Test_obj.enter_materialtransfer_note_text(materialtransfer.getProperty("MaterialNote"));
		Create_Material_Transfer_In_Test_obj.click_materialtransfer_refresnce_cta();
		Create_Material_Transfer_In_Test_obj.enter_materialtransfer_refrence_text(materialtransfer.getProperty("MaterialRefresnce"));
		Create_Material_Transfer_In_Test_obj.click_materialtransfer_save_cta();
	}

	@AfterMethod
	public void teardown() {
		quitDriver();
	}
}
