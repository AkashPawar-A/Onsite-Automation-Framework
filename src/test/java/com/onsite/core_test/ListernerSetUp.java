package com.onsite.core_test;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListernerSetUp implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) 
	{
		if (result.getInstance() != null && result.getInstance() instanceof Base_Test) {
			((Base_Test)(result.getInstance())).getDriver();
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
		if (result.getInstance() instanceof Base_Test)
			((Base_Test) result.getInstance()).captureScreenshot(result.getName());
		else {
			System.out.println("take screenshot failed");
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Case execution skipped :" + result.getName());
	}
}
