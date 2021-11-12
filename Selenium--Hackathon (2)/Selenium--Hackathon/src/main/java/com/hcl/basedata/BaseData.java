package com.hcl.basedata;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseData {
	public static WebDriver driver;
	public static Properties prop;

	public BaseData() {
		try {
			prop = new Properties();
			FileInputStream fi = new FileInputStream(
					"C:\\Eclipse Inst--Workspace\\Selenium--Hackathon\\src\\main\\java\\com\\hcl\\basedata\\configure.properties");
					
			prop.load(fi);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", prop.getProperty("driverpath"));
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));

	}

	public void closeBrowser() {
		driver.quit();
	}

}