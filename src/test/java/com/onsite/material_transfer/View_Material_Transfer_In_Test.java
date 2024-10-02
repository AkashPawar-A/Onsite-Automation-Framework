package com.onsite.material_transfer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.onsite.core_test.Base_Test;

public class View_Material_Transfer_In_Test extends Base_Test{

	private View_Material_Transfer_In_Page View_Material_Transfer_In_Page_obj;

	@BeforeMethod
	public void setup() {
		View_Material_Transfer_In_Page_obj = new View_Material_Transfer_In_Page(getDriver());
	}

	@Test
	public void verifyViewMaterialTransferInPage ()
	{
		View_Material_Transfer_In_Page_obj.select_project();
		View_Material_Transfer_In_Page_obj.select_material_transfer_entry();
	}

	@AfterMethod
	public void teardown() {
		quitDriver();
	}

}
