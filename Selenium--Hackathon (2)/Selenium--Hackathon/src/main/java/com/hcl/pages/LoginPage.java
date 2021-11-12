package com.hcl.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hcl.basedata.BaseData;

public class LoginPage extends BaseData {
	WebDriver driver;

	@FindBy(xpath = "//a[@id='nav-link-accountList']")
	public WebElement account;

	@FindBy(xpath = "//span[@class='nav-action-inner' and contains(text(),'Sign in')]")
	public WebElement signIn;

	@FindBy(xpath = "//input[@name='email']")
	public WebElement emaill;

	@FindBy(xpath = "//input[@id='continue']")
	public WebElement continuee;

	@FindBy(xpath = "//input[@id='ap_password']")
	public WebElement passwordd;

	@FindBy(xpath = "//input[@id='signInSubmit']")
	public WebElement signInButton;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
}
