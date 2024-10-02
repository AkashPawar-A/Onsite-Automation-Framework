package com.onsite.material_purchase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.onsite.core_test.Base_Test;

public class Delete_MaterialPurchaseEntry_DelinkPopUpPage_Ok_Cta_Test extends Base_Test{
	
	private Delete_MaterialPurchase_DelinkPopUp_Ok_Cta_Page Delete_MaterialPurchase_DelinkPopUp_Ok_Cta_Page_obj;
	
	@BeforeMethod
	public void setup()
	{
		Delete_MaterialPurchase_DelinkPopUp_Ok_Cta_Page_obj = new Delete_MaterialPurchase_DelinkPopUp_Ok_Cta_Page(getDriver());	
	}
	
	@Test
	public void verifyDeleteMaterialPurchaseIsPaidOkCtaPage()
	{
		Delete_MaterialPurchase_DelinkPopUp_Ok_Cta_Page_obj.select_project();
		Delete_MaterialPurchase_DelinkPopUp_Ok_Cta_Page_obj.select_one_materialpurchase_entry();
		Delete_MaterialPurchase_DelinkPopUp_Ok_Cta_Page_obj.click_materialpurchase_viewdetailspage_delete_button();
	}
	
	@AfterMethod
	public void teardown() {
		quitDriver();
	}
}
