package com.exercise.madison.madisonProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestWomenPage {
	
	@Test
	public void womenTest(){
//		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		MainPage mPage = PageFactory.initElements(driver, MainPage.class);
//		WomenPage wPage = mPage.gotoWomenPage();
//		NewArrivals nArrivals = wPage.gotoNewArrivals();
//		AddToCart aCart = nArrivals.gotoDress();
//		aCart.addingToCart("3");
//		driver.navigate().back();	
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		MainPage mPage = PageFactory.initElements(driver, MainPage.class);
		mPage.gotoWomenPage().gotoNewArrivals().gotoDress().addingToCart("1").checkingOut();
//		driver.navigate().back();		
	}
}
