package com.onsite.material_transfer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.onsite.core_test.Base_Test;

public class Delete_Material_Transfer_Out_Test extends Base_Test{

	public Delete_Material_Transfer_Out_Page Delete_Material_Transfer_In_Page_obj;

	@BeforeMethod
	public void setUp() {
		Delete_Material_Transfer_In_Page_obj = new Delete_Material_Transfer_Out_Page(getDriver());				
	}

	@Test
	public void verify_Delete_Material_Transfer_In()
	{	
		Delete_Material_Transfer_In_Page_obj.select_project();
		Delete_Material_Transfer_In_Page_obj.select_materialtransfer_entry();
		Delete_Material_Transfer_In_Page_obj.click_materialtransfer_Threedot();
		Delete_Material_Transfer_In_Page_obj.click_materialtransfer_delete_button(); 
		Delete_Material_Transfer_In_Page_obj.click_materialtransfer_ok_button();
	}

	@AfterMethod
	public void teardown() {
		quitDriver();
	}
}
