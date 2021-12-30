package Com.RBC.TestCases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.log4testng.Logger;

import Com.RBC.utilities.ReadConfig;

public class BaseClass {

	ReadConfig rd = new ReadConfig();
	public String baseUrl = rd.getApplicationUrl();
	public String username = rd.getUserName();
	public String password = rd.getPassword();
	// public String chromebrowser = rd.getChromePath();
	public String firefoxbrowser = "C:\\Selenium\\geckodriver.exe";
	public static WebDriver driver;
	public static Logger logger;

	@Parameters("browser")
	@BeforeClass
	public void setUp(String br) {

		logger = Logger.getLogger(BaseClass.class);
		// DOMConfigurator.configure("Log4j.properties");
		PropertyConfigurator.configure("Log4j.properties");

		if (br.equals("chrome")) {
			logger.info("Launchiung browser");
			System.setProperty("webdriver.chrome.driver", rd.getChromePath());
			driver = new ChromeDriver();
		} else if (br.equals("firefox")) {
			logger.info("Launchiung browser");
			System.setProperty("webdriver.gecko.driver", rd.getFirefoxPath());
			driver = new FirefoxDriver();
		} else {
			System.setProperty("webdriver.ie.driver", rd.getiePath());
			driver = new InternetExplorerDriver();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@AfterClass
	public void tearDown() {
		logger.info("Browser is Closed");
		driver.close();
	}

	public void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		org.apache.commons.io.FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}

	public String randomestring() {
		String generatedstring = RandomStringUtils.randomAlphabetic(8);
		return (generatedstring);
	}

	public static String randomeNum() {
		String generatedString2 = RandomStringUtils.randomNumeric(4);
		return (generatedString2);
	}

}
