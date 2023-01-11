package com.mystore.pageobjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mystore.base.Baseclass;

public class Shoppingpage extends Baseclass{
	WebDriverWait wait=new WebDriverWait(getDriver(), Duration.ofSeconds(35));
	JavascriptExecutor js = (JavascriptExecutor) getDriver();
	Select select;
	
	@FindBy(xpath="/html[1]/body[1]/section[2]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]")
	WebElement min;
	
	@FindBy(xpath="/html[1]/body[1]/section[2]/div[1]/div[1]/div[1]/div[2]/div[1]/input[2]")
	WebElement max;
	
	@FindBy(className="shop-widget-btn")
	WebElement search;
	
	@FindBy(xpath="//ul[@class='shop-widget-list shop-widget-scroll']/li/div/input[@id='cate1']")
	WebElement german;
	
	@FindBy(xpath="//div[@class='shop-widget-content']/input[@id='cate2']")
	WebElement sbl;
	
	@FindBy(xpath="//ul[@class='shop-widget-list shop-widget-scroll']/li/div[contains(.,'Pankajakasthuri')]")
	WebElement ce;
	
	@FindBy(xpath="//*[@id=\"product1213\"]/div/div[1]/div[2]/a")
	WebElement productview;
	
	@FindBy(xpath="/html[1]/body[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/button[1]/span[1]")
	WebElement addcart;
	
	
	
	@FindBy(xpath="/html[1]/body[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/button[2]/i[1]")
	WebElement addquantity;
	
	@FindBy(xpath="/html[1]/body[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/button[2]/i[1]")
	WebElement addquantity1;
	
	@FindBy(xpath="/html[1]/body[1]/header[1]/div[1]/div[1]/div[2]/button[1]/i[1]")
	WebElement cartlist;
	
	@FindBy(xpath="//span[@class='checkout-label']")
	WebElement checkout;
	
	@FindBy(xpath="//h2[normalize-space()='checkout']")
	WebElement checkout1;

public Shoppingpage (){
	PageFactory.initElements(getDriver(), this);
	
}

public void filterbyprice() throws InterruptedException {
	Thread.sleep(3000);
	min.sendKeys("150");
	max.sendKeys("1000");
	
    search.click();
    Thread.sleep(2000);
}
public void filterbybrand() throws InterruptedException {
	js.executeScript("window.scrollBy(0,350)", "");
	Thread.sleep(2000);
	sbl.click();
	
	//System.out.println(sbl.isDisplayed());
	return  ;
		
}
public void filterbybrand1() throws InterruptedException {
	js.executeScript("window.scrollBy(0,350)", "");
	Thread.sleep(2000);
	ce.click();
	return  ;
}

public void addtocart1() throws InterruptedException {
	js.executeScript("window.scrollBy(0,350)", "");
	
    js.executeScript("arguments[0].click();",addcart);
    
    js.executeScript("arguments[0].click();",addquantity);
    Thread.sleep(2000);
   
}
public void cartlist() {
	
    js.executeScript("arguments[0].click();",cartlist);

	
}
public Checkoutpage checkout() {
	checkout.click();
	return new Checkoutpage();
}
	}
