package com.mystore.pageobjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import com.mystore.base.Baseclass;
import com.mystore.utility.Log;

public class Indeexpage extends Baseclass {
	WebDriverWait wait=new WebDriverWait(getDriver(), Duration.ofSeconds(35));
	Log example=new Log();
	
	
	@FindBy(xpath="/html/body/header/div/div/a[2]/span")
	WebElement join;
	
	@FindBy(xpath="//a[@class='header-logo']//img[@alt='logo']")
	WebElement logo;
	
	@FindBy(xpath="/html/body/section[1]/div/div/div[2]/div/div/div/div/div/a/span")
	WebElement Shopnow;
	
	
	public Indeexpage() {
		//this.driver=driver;
		PageFactory.initElements(getDriver(), this);
	}
	
	
	public boolean logopresent() {
		
		return logo.isDisplayed();
		 
	}
	public String gettitle(WebDriver driver) {
	
		String actual=driver.getTitle();
		System.out.println(actual);
		return actual;
	}
	public Loginpage joinnow() {
		
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
	      jse.executeScript("arguments[0].click();",join);
		
		return new Loginpage() ;
	}
	public Shoppingpage shopnowclick() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf( Shopnow));
		
		
		Thread.sleep(2000);
		Actions action = new Actions(getDriver());
		    action.moveToElement(Shopnow).click().build().perform();
		    Thread.sleep(2000);
		    return new Shoppingpage();
			
		
	}


	
	}

	

