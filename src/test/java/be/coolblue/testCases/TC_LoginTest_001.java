package be.coolblue.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import be.coolblue.pageObjects.loginPage;

public class TC_LoginTest_001 extends BaseClass{
	@Test
	public void loginTest() {
		driver.get(baseURL);
		loginPage lp = new loginPage(driver);
		
		lp.setUsername(username);
		lp.setPassword(password);
		lp.ClickSubmit();
		
		if (driver.getTitle().equals("Coolblue - alles voor een glimlach")) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
				
	}
		
}
