package com.hcl.utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.hcl.basedata.BaseData;

public class ListenersClass extends BaseData implements ITestListener {

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub

	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test Failed");
		try {
			TakeScreenshot.takeScreenshotOnFailure(result.getMethod().getMethodName());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Passed");
		try {
			TakeScreenshot.takeScreenshotOnSuccess(result.getMethod().getMethodName());//
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

}
