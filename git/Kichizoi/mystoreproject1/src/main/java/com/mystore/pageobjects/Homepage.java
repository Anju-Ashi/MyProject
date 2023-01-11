package com.mystore.pageobjects;

import java.time.Duration;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.mystore.base.Baseclass;

public class Homepage extends Baseclass{
	WebDriverWait wait=new WebDriverWait(getDriver(), Duration.ofSeconds(35));
	//FluentWait wait = new FluentWait(driver);
	@FindBy(xpath="(//input[@id='myInputw'])[1]")
	WebElement searchtextbox;
	
	@FindBy(xpath="/html[1]/body[1]/header[1]/div[1]/div[1]/form[1]/div[1]/button[1]/i[1]")
	WebElement searchicon;
	
	@FindBy(xpath="//a[@class='product-image']")
	WebElement searchedproduct;
	
	@FindBy(xpath="/html[1]/body[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]/span[1]")
	WebElement addtocart;
	
	@FindBy(xpath="///div[@class='product-action']//i[@xpath='3']")
	WebElement addquantity;
	
	public Homepage() {
		PageFactory.initElements(getDriver(), this);
}

public void searchproduct() throws InterruptedException  {
	
	Actions action = new Actions(getDriver());
	action.sendKeys(searchtextbox, "orthoherb").build().perform();
	Thread.sleep(4000);
	
	JavascriptExecutor js = (JavascriptExecutor) getDriver();
	js.executeScript("arguments[0].click();", searchicon);
	Thread.sleep(4000);
    return;
    
	
	
}
public boolean verifysearchedproduct() {
	return searchedproduct.isDisplayed();
	
}

public void addtocart() throws InterruptedException {
	
	 
	wait.until(ExpectedConditions.elementToBeClickable(addtocart)).click();;
	wait.until(ExpectedConditions.elementToBeClickable(addquantity)).click();;
		       
	
}

}
