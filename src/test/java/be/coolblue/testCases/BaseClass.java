package be.coolblue.testCases;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	public String baseURL = "https://www.coolblue.be/nl/inloggen";
	public String username = "santangeloa@outlook.be";
	public String password = "011Tipsy";
	public static WebDriver driver;
	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers/chromedriver.exe");
		driver = new ChromeDriver();
	
	}
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
