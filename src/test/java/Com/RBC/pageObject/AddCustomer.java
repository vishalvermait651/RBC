package Com.RBC.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddCustomer {

	WebDriver driver;

	public AddCustomer(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(how = How.XPATH, using = "//a[text()='New Customer']") //// tbody/tr[5]/td[2]/input[1]
	@CacheLookup
	WebElement Inkaddnewcustomer;

	@FindBy(how = How.NAME, using = "name")
	@CacheLookup
	WebElement txtcustomername;

	@FindBy(how = How.NAME, using = "rad1")
	@CacheLookup
	WebElement rdgender;

	@FindBy(how = How.ID_OR_NAME, using = "dob")
	@CacheLookup
	WebElement txtdob1;

	@FindBy(how = How.NAME, using = "addr")
	@CacheLookup
	WebElement txtadd;

	@FindBy(how = How.NAME, using = "city")
	@CacheLookup
	WebElement txtcity;

	@FindBy(how = How.NAME, using = "state")
	@CacheLookup
	WebElement txtstate;

	@FindBy(how = How.NAME, using = "pinno")
	@CacheLookup
	WebElement txtpinno;

	@FindBy(how = How.NAME, using = "telephoneno")
	@CacheLookup
	WebElement txttelephoneno;

	@FindBy(how = How.NAME, using = "emailid")
	@CacheLookup
	WebElement txtemailid;

	@FindBy(how = How.NAME, using = "password")
	@CacheLookup
	WebElement txtpassword;

	@FindBy(how = How.NAME, using = "sub")
	@CacheLookup
	WebElement txtsubmmit;

	public void setAddnewCUstomer() {
		Inkaddnewcustomer.click();
	}

	public void setName(String uname) {
		txtcustomername.sendKeys(uname);
	}

	public void setGender(String cgender) {
		rdgender.sendKeys(cgender);
	}

	public void setcustDob(String yyyy, String mm, String dd) {
		txtdob1.sendKeys(yyyy);
		txtdob1.sendKeys(mm);
		txtdob1.sendKeys(dd);
		
	}

	public void setAddres(String address) {
		txtadd.sendKeys(address);
	}

	public void setCity(String ccity) {
		txtcity.sendKeys(ccity);
	}

	public void setState(String cstate) {
		txtstate.sendKeys(cstate);
	}

	public void setPinNo(String cpinno) {
		txtpinno.sendKeys(String.valueOf(cpinno));
	}

	public void settelephoneno(String ctelephoneno) {
		txttelephoneno.sendKeys(ctelephoneno);
	}

	public void setEmail(String cemail) {
		txtemailid.sendKeys(cemail);
	}

	public void setSubmmit() {
		txtsubmmit.click();
	}

}
