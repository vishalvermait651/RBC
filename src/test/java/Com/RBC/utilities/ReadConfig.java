package Com.RBC.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties pro;

	public ReadConfig() {
		File fr = new File("C:\\Users\\vishal\\eclipse-workspace\\RBC\\Config\\Config.properties");

		try {
			FileInputStream fis = new FileInputStream(fr);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Error message is" + e.getMessage());
		}
	}

	public String getApplicationUrl() {
		String url = pro.getProperty("url");
		return url;

	}

	public String getUserName() {
		String username = pro.getProperty("username");
		return username;
	}

	public String getPassword() {
		String password = pro.getProperty("password");
		return password;
	}

	public String getChromePath() {
		String chromebrowser = pro.getProperty("chromepath");
		return chromebrowser;
	}

	public String getFirefoxPath() {
		String firefoxbrowser = pro.getProperty("firefoxpath");
		return firefoxbrowser;
	}

	public String getiePath() {
		String IEbrowser = pro.getProperty("iepath");
		return IEbrowser;
	}

}
