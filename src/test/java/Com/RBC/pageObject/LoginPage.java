package Com.RBC.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;

	public LoginPage(WebDriver rdriver) {

		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(name = "uid")
	WebElement txtUserName;

	@FindBy(name = "password")
	WebElement txtpassword;

	@FindBy(name = "btnLogin")
	WebElement Loginbtn;

	@FindBy(xpath = "/html/body/div[3]/div/ul/li[10]/a")
	WebElement Logout;

	public void setUserName(String uname) {
		txtUserName.sendKeys(uname);
	}

	public void setpasswordName(String pwd) {
		txtpassword.sendKeys(pwd);
	}

	public void Loginbtn() {
		Loginbtn.click();
	}

	public void Logout() {
		Logout.click();
	}

}
