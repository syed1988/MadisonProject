package com.exercise.madison.madisonProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.XpathLinks;

public class WomenPage {
	

	@FindBy(xpath = XpathLinks.TOP_BLOUSES_XPATH)
	WebElement topsBlouses;
	
	WebDriver driver;
	public WomenPage(WebDriver dr){
		driver = dr;
	}
	
	public TopsAndBlouses gotoNewArrivals(){
		topsBlouses.click();
		return PageFactory.initElements(driver, TopsAndBlouses.class);
	}
	
}
