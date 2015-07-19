package com.exercise.madison.madisonProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.XpathLinks;

public class MainPage {

	@FindBy(xpath= XpathLinks.WOMEN_PAGE_XPATH)
	WebElement womenPage;
	
	WebDriver driver;
	public MainPage(WebDriver dr){
		driver = dr;
	}
	
	public WomenPage gotoWomenPage(){
		driver.get("http://demo.magentocommerce.com/");
		womenPage.click();
		return PageFactory.initElements(driver, WomenPage.class);
	}
}
