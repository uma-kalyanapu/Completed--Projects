package com.hcl.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchingaAppleLaptop {
	WebDriver driver;

	@FindBy(xpath = "//*[@id=\"nav-hamburger-menu\"]")
	public WebElement Menuall;

	@FindBy(xpath = "//a[div='Mobiles, Computers']")
	public WebElement computers;

	@FindBy(xpath = "// *[@id='hmenu-content']/ul[8]/li[17]/a")
	//@FindBy(xpath ="//a[@class='hmenu-item' and contains(text(),'Laptops')]")
	public WebElement laptops;

	@FindBy(xpath = "//span[@class='a-size-base a-color-base' and contains(text(),'Apple')]")
	public WebElement checkApple;  

	@FindBy(xpath = "//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[1]/div/span/div/div/div[2]/div[1]/h2/a/span")
	public WebElement selectinglaptop;
	
	@FindBy(xpath = "//*[@id=\"add-to-cart-button\"]")
	public WebElement addtocart;

	public SearchingaAppleLaptop(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
//span[contains(text(),'2020 Apple MacBook Pro (13.3-inch/33.78 cm, Apple M1 chip with 8-core CPU and 8-core GPU, 8GB RAM, 256GB SSD) - Space Grey')]