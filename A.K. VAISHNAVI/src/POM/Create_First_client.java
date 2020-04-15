package POM;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Create_First_client {
	public WebDriver driver;

	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div/div[2]/form/div[1]/div[1]/div/input")
	private WebElement name;

	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div/div[2]/form/div[2]/div[1]/div[1]/input")
	private WebElement addressLine1;

	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div/div[2]/form/div[2]/div[2]/div/input")
	private WebElement addressline2;

	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div/div[2]/form/div[3]/div[1]/div/input")
	private WebElement city;

	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div/div[2]/form/div[3]/div[2]/div/input")
	private WebElement state;

	// input[@name='password_confirmation']
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div/div[2]/form/div[4]/div[1]/div/input")
	private WebElement country;

	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div/div[2]/form/div[4]/div[2]/div/input")
	private WebElement zipcode;

	@FindBy(xpath = "//div//input[@name='commit']")
	private WebElement continueBtn;
	

	public Create_First_client(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void setFirst_Client(String nameofperson, String address1, String addrees2, String cityname,
			String statename, String countryname, String zipcod) throws AWTException, InterruptedException {
		name.sendKeys(nameofperson);
		addressLine1.sendKeys(address1);
		addressline2.sendKeys(addrees2);
		city.sendKeys(cityname);
		state.sendKeys(statename);
		country.sendKeys(countryname);
		zipcode.sendKeys(zipcod);
		Thread.sleep(3000);

		continueBtn.click();

	}

}



