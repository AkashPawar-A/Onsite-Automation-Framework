package com.onsite.material_transfer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.onsite.core_test.Base_Test;

public class Create_Material_Transfer_Test extends Base_Test{
	
	private Create_Material_Transfer_Page Create_Material_Transfer_obj;
	
	@BeforeMethod
	public void setup() {
		Create_Material_Transfer_obj = new Create_Material_Transfer_Page(getDriver());
	}
	
	@Test
	public void verifyCreateMaterialTransferPage() {	
		Create_Material_Transfer_obj.select_project();
		Create_Material_Transfer_obj.click_transaction_tab();
		Create_Material_Transfer_obj.click_materialtransfer_cta();
		Create_Material_Transfer_obj.click_projecttransfer_field();
		Create_Material_Transfer_obj.select_materialtransfer_projectname();
		Create_Material_Transfer_obj.click_transfer_Materila_cta();
		Create_Material_Transfer_obj.click_transfer_materialname();
		Create_Material_Transfer_obj.click_transfermaterial_next_button();
		Create_Material_Transfer_obj.enter_transfermaterial_quantity(materialtransfer.getProperty("MaterialQuantity"));
		Create_Material_Transfer_obj.enter_materialtransfer_unitrate(materialtransfer.getProperty("MaterialUnitRate"));
		Create_Material_Transfer_obj.click_materialtransfer_discount_popuppage();
		Create_Material_Transfer_obj.enter_transfer_itemlevel_Discount(materialtransfer.getProperty("MaterilDiscount1"));
		Create_Material_Transfer_obj.select_transfer_itemlevel_gst();
		Create_Material_Transfer_obj.click_discountPopUp_save_cta();
		Create_Material_Transfer_obj.click_materialtransfer_note_cta();
		Create_Material_Transfer_obj.enter_materialtransfer_note_text(materialtransfer.getProperty("MaterialNote"));
		Create_Material_Transfer_obj.click_materialtransfer_refresnce_cta();
		Create_Material_Transfer_obj.enter_materialtransfer_refrence_text(materialtransfer.getProperty("MaterialRefresnce"));
		Create_Material_Transfer_obj.click_materialtransfer_save_cta();		
	}
	
	@AfterMethod
	public void teardown() {
		quitDriver();
	}
}
