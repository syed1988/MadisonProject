package com.exercise.madison.madisonProject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import util.XpathLinks;

public class CheckoutPage {

	@FindBy(id = XpathLinks.DISCOUNT)
	WebElement discountCode;
	@FindBy(id = XpathLinks.STATE)
	WebElement stateField;
	@FindBy(id = XpathLinks.CITY)
	WebElement cityField;
	@FindBy(id = XpathLinks.ZIP)
	WebElement zipCode;
	@FindBy(className = XpathLinks.CHECKOUT)
	WebElement checkoutButton;
	
	public void checkingOut(){
		discountCode.sendKeys("Discout123");
		Select select = new Select(stateField);
		select.selectByValue("43");
		cityField.sendKeys("Bronx");
		zipCode.sendKeys("10460");
		checkoutButton.click();
		
	}
	
	
}
