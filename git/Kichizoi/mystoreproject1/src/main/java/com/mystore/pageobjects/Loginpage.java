package com.mystore.pageobjects;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mystore.base.Baseclass;

public class Loginpage extends Baseclass {
	WebDriverWait wait=new WebDriverWait(getDriver(), Duration.ofSeconds(20));
	Indeexpage indexpage;
	Loginpage login1 ;
@FindBy(xpath="//input[@id='emailverify']")
WebElement email;

@FindBy(id="getopt")
WebElement otp;

@FindBy(id="otpverify")
WebElement typeotp;

@FindBy(id="loginverfy")
WebElement go;

public Loginpage() {
	PageFactory.initElements(getDriver(), this);
}
public  Homepage loginpg() throws InterruptedException {
	
	
    

	Thread.sleep(2000);
	 email.sendKeys(prop.getProperty("emailid"));
	 otp.click();
	 typeotp.sendKeys("");
	 Thread.sleep(10000);
	 go.click();
    
    return new Homepage();
}
 
public String getCurrURL() throws Throwable {
	String homePageURL=getDriver().getCurrentUrl();
	return homePageURL;
}
}
