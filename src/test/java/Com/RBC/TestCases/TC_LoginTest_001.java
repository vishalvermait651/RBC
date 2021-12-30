package Com.RBC.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import Com.RBC.pageObject.LoginPage;

public class TC_LoginTest_001 extends BaseClass {

	@Test
	public void loginTest() throws Exception {

		LoginPage lp = new LoginPage(driver);

		driver.get(baseUrl);
		logger.info("launching website");

		lp.setUserName(username);
		logger.info("Entred Username");

		lp.setpasswordName(password);
		logger.info("Entred password");
		Thread.sleep(3000);

		lp.Loginbtn();
		logger.info("clicked submmit button");

		System.out.println("Current page title:" + driver.getTitle());
		if (driver.getTitle().equals("GTPL Bank Manager HomePage")) {
			Assert.assertTrue(true);
			logger.info("Test case is paases");
		} else {
			captureScreen(driver,"TC_LoginTest_001");
			Assert.assertTrue(false);
			logger.info("Test case is failed");
		}

	}
}
