package com.onsite.material_purchase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.onsite.core_test.Base_Test;

public class Delete_MaterialPurchaseEntry_DelinkPopUpPage_Cancel_Cta_Test extends Base_Test {
	
	private Delete_MaterialPurchase_DelinkPopUpPage_Cancel_Cta_Page Delete_MaterialPurchase_DelinkPopUpPage_Cancel_Cta_Page_obj;
	
	@BeforeMethod
	public void setup()
	{
		Delete_MaterialPurchase_DelinkPopUpPage_Cancel_Cta_Page_obj = new Delete_MaterialPurchase_DelinkPopUpPage_Cancel_Cta_Page(getDriver());	
	}
	
	@Test
	public void verifyDeleteMaterialPurchaseIsPaidOkCtaPage()
	{	
		Delete_MaterialPurchase_DelinkPopUpPage_Cancel_Cta_Page_obj.select_project();
		Delete_MaterialPurchase_DelinkPopUpPage_Cancel_Cta_Page_obj.select_one_materialpurchase_entry();
		Delete_MaterialPurchase_DelinkPopUpPage_Cancel_Cta_Page_obj.click_materialpurchase_viewdetailspage_delete_button();
		Delete_MaterialPurchase_DelinkPopUpPage_Cancel_Cta_Page_obj.click_materialpurchase_delinkpopuppage();
		Delete_MaterialPurchase_DelinkPopUpPage_Cancel_Cta_Page_obj.click_materialpurchase_editpage_backword_arrow();
	}
	
	@AfterMethod
	public void teardown() {
		quitDriver();
	}
}
