package com.exercise.madison.madisonProject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.XpathLinks;

public class AddToCart {

	@FindBy(id = XpathLinks.DRESS_COLOR)
	WebElement dressColor;
	@FindBy(id = XpathLinks.DRESS_SIZE)
	WebElement dressSize;
	@FindBy(id = XpathLinks.QUANTITY)
	WebElement quantity;
	@FindBy(xpath = XpathLinks.ADD_TO_CART)
	WebElement addToCart;
	
	WebDriver driver;
	public AddToCart(WebDriver dr){
		driver = dr;
	}
	
	public CheckoutPage addingToCart(String num){
		
		dressColor.click();
		dressColor.sendKeys("Pink");
		dressColor.sendKeys(Keys.ENTER);
		dressSize.click();
		dressSize.sendKeys("M");
		dressSize.sendKeys(Keys.ENTER);
		quantity.clear();
		quantity.sendKeys(num);
		addToCart.click();
		
		return PageFactory.initElements(driver, CheckoutPage.class);
		
	}
	
}
