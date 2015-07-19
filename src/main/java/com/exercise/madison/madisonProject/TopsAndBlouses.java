package com.exercise.madison.madisonProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.XpathLinks;

public class TopsAndBlouses {

	@FindBy(xpath = XpathLinks.PRICE)
    WebElement price;
	
	//@FindBy(xpath = "//*[@id='narrow-by-list']/dd[6]/ol/li[3]" )
	//WebElement size;
	
	@FindBy(xpath = XpathLinks.DRESS)
	WebElement dress;
	
	WebDriver driver;
	public TopsAndBlouses(WebDriver dr){
		driver = dr;
	}
	
	
	public AddToCart gotoDress(){
		price.click();
		//size.click();
		dress.click();
		
		
		
		return PageFactory.initElements(driver, AddToCart.class);
	}
}
