package be.coolblue.pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;


public class loginPage {
	
	WebDriver ldriver;
	
	public loginPage(WebDriver rdriver){
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(name="emailaddress")
	@CacheLookup
	WebElement txtUserName;
	
	@FindBy(name="password")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(xpath="//button[./span[text()=\"Submit\"]]") @CacheLookup WebElement btnLogin;
	

	public void setUsername(String uname) {
		txtUserName.sendKeys(uname);
	}
	public void setPassword(String pwd) {
		txtPassword.sendKeys(pwd);
	}
	public void ClickSubmit() {
		btnLogin.click();
	}
}
