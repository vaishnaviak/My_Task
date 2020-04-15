package POM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Create_Your_Organization {

	@FindBy(xpath = "//input[@name='name']")
	private WebElement organizationName;

	@FindBy(xpath = "//input[@name='commit']")
	private WebElement continueBtn2;

	public Create_Your_Organization(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void setOrganization(String organization) throws IOException {

		organizationName.sendKeys(organization);
		continueBtn2.click();

	}

}


