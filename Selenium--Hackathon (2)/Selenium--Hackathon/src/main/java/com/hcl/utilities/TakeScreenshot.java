package com.hcl.utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import com.hcl.basedata.BaseData;

public class TakeScreenshot extends BaseData {
	// public static String screenshotpath;

	public static void takeScreenshotOnFailure(String methodname) {
		File srcfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(srcfile,
					new File("C:\\Eclipse Inst--Workspace\\Selenium--Hackathon\\ScreenShots\\Failed-testcases"
							+ methodname + ".png"));
			System.out.println("screenshot taken");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void takeScreenshotOnSuccess(String methodname) {
		File srcfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(srcfile,
					new File("C:\\Eclipse Inst--Workspace\\Selenium--Hackathon\\ScreenShots\\Passesd-testcases"
							+ methodname + ".png"));
			System.out.println("screenshot taken");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
