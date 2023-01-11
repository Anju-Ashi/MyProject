package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.mystore.base.Baseclass;

public class Checkoutpage extends Baseclass {

	@FindBy(xpath="//a[normalize-space()='Click here to login']")
	WebElement login;
	
	@FindBy(xpath="//h6[normalize-space()='$125.00']")
	WebElement price;
	@FindBy(xpath="//*[@id=\"checkouttotal\"]")
	WebElement totalprice;
	
	@FindBy(xpath="//button[@data-bs-target='#primarycontact-edit']")
	WebElement primarycontactedit;
	@FindBy(xpath="//div[@id='primarycontact-edit']//input[@name='contact_number']")
	WebElement enterno;
	@FindBy(xpath="//div[@id='primarycontact-edit']//button[@type='submit'][normalize-space()='save contact info']")
	WebElement savecontactinfo;
	
	
	
	@FindBy(xpath="//button[@data-bs-target='#secondarycontact-edit']")
	WebElement secondarycontactno;
	@FindBy(xpath="//input[@value='**********']")
	WebElement enternumber2;
	@FindBy(xpath="//div[@id='secondarycontact-edit']//button[@type='submit'][normalize-space()='save contact info']")
	WebElement secondarycontactnosave;
	
	
	
	@FindBy(xpath="/html/body/section[2]/div/div/div[4]/div/div[2]/div/div[1]/div/ul/li/button")
	WebElement primaryadressedit;
	@FindBy(name="zipcode")
	WebElement zipcode;
	@FindBy(name="address")
	WebElement address;
	@FindBy(name="city")
	WebElement city;
	@FindBy(name="state")
	WebElement state;
	@FindBy(name="country")
	WebElement country;
	@FindBy(xpath="//*[@id=\"primaryaddress-edit\"]/div/div/form/button")
	WebElement saveinfo1;
	
	
	@FindBy(xpath="/html/body/section[2]/div/div/div[4]/div/div[2]/div/div[2]/div/ul/li/button")
	WebElement addressedit2;
	@FindBy(xpath="/html/body/section[2]/div/div/div[4]/div/div[2]/div/div[3]/div/ul/li/button")
	WebElement addressedit3;
	
	@FindBy(xpath="//span[@class='checkout-label']")
	WebElement checktoproceed;
	
	
	
	public Checkoutpage (){
		PageFactory.initElements(getDriver(), this);
	}
	public void login() {
		 login.click();
		 
		}
	
	public void checkouttext() {
		 getDriver().getTitle();
		 return ;
		}
	
	public double getprice() {
		 String price1=price.getText();
		 String price2=price1.replaceAll("[^a-zA-Z0-9]", "");
		 double price3=Double.parseDouble(price2);
		 return price3/100;
		}
	public double totalprice() {
		 String totalprice1=totalprice.getText();
		 String totalprice2=totalprice1.replaceAll("[^a-zA-Z0-9]", "");
		 double totalprice3=Double.parseDouble(totalprice2);
		 return totalprice3/100;
		}
	
	public void contactnoprimary() {////
		savecontactinfo.sendKeys("1234567893");
		savecontactinfo.click();
	}
	public void contactnosecondary() {
		enternumber2.sendKeys("2233445566");
		secondarycontactnosave.click();
}

public void addresssedit() {
	zipcode.sendKeys("324567");
	address.sendKeys("XZC");
	city.sendKeys("asa");
	state.sendKeys("kerala");
	country.sendKeys("india");
	
}
public void billingaddressedit() {
}
public void shippingaddressedit() {
}
/*public orderdetailspage checkToproceed() {
	checktoproceed.click();
	return new orderdetailspage();
}*/
}
