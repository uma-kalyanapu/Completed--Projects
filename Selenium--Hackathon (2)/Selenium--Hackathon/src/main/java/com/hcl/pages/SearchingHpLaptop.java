package com.hcl.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchingHpLaptop {

	WebDriver driver;

	@FindBy(xpath = "//*[@id=\"nav-hamburger-menu\"]")
	public WebElement Menuall;

	@FindBy(xpath = "// a[div='Mobiles, Computers']")
	public WebElement computers;

	@FindBy(xpath = "// *[@id='hmenu-content']/ul[8]/li[17]/a") 
	// a[@class='hmenu-item' and contains(text(),'Laptops')]")
	public WebElement laptops;

	@FindBy(xpath = "//span[@class='a-size-base a-color-base' and contains(text(),'HP')]")			
	public WebElement checkHP;

	@FindBy(xpath = "//span[@class='a-size-base-plus a-color-base a-text-normal' and contains(text(),'HP 14 (2021) 11th Gen Intel Core i3 Laptop with Alexa Built-in, 8GB RAM, 256GB SSD, 14-Inch (35.6 cm) FHD Screen, Windows 10, MS Office, (14s- dy2501tu)')]")
	public WebElement selectinglaptop;

	@FindBy(xpath = "//*[@id=\"add-to-cart-button\"]")
	public WebElement addtocart;

	public SearchingHpLaptop(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
