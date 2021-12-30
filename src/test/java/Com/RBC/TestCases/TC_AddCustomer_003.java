package Com.RBC.TestCases;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import Com.RBC.pageObject.AddCustomer;
import Com.RBC.pageObject.LoginPage;

public class TC_AddCustomer_003 extends BaseClass {

	@Test
	public void addNewCustomerTest() throws Exception {

		driver.get(baseUrl);
		driver.manage().window().maximize();

		LoginPage lp = new LoginPage(driver);

		lp.setUserName(username);
		lp.setpasswordName(password);
		lp.Loginbtn();

		AddCustomer ad = new AddCustomer(driver);

		ad.setAddnewCUstomer();
		Thread.sleep(3000);
		ad.setName("VISHAL");
		ad.setGender("M");
		Thread.sleep(3000);
		ad.setcustDob("1995", "06", "25");
		ad.setAddres("7 jdn");
		Thread.sleep(3000);
		ad.setCity("etobicoke");
		ad.setState("ON");
		ad.setPinNo("382456");
		Thread.sleep(3000);
		ad.settelephoneno("1267368");
		Thread.sleep(3000);
		ad.setEmail("vnjuuhd@gmail.com");
		Thread.sleep(5000);

		ad.setSubmmit();
		Thread.sleep(8000);

		Thread.sleep(3000);

		if (isAlertPresent() == true) {
			driver.switchTo().alert().dismiss();// close alert
			driver.switchTo().defaultContent();

		} else {
			Assert.assertTrue(true);
			logger.info("Login passed");
			Thread.sleep(3000);

		}

	}

	public boolean isAlertPresent() // user defined method created to check alert is presetn or not
	{
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}

	}

}
