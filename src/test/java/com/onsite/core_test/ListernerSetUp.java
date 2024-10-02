package com.onsite.core_test;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.onsite.base_page.Base_Page;

public class ListernerSetUp extends Base_Test implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) 
	{
		if (result.getInstance() != null && result.getInstance() instanceof Base_Page) {
			((Base_Page)(result.getInstance())).getDriver();
		} else {
		System.out.println("Test Case execution started :" + result.getName());
		}
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Case execution successful :" + result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Case execution failure :" + result.getName());
		//Base_Page.captureScreenshot(result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Case execution skipped :" + result.getName());
	}
}