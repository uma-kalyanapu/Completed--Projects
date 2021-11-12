package com.hcl.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyingCart {
	WebDriver driver;

	@FindBy(xpath = "//*[@id=\"nav-cart-count-container\"]")
	public WebElement viewcart;

	public VerifyingCart(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
