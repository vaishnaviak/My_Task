package POM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasicDetails {
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div/div[2]/form/div[1]/div[1]/div/input")
	private WebElement firstnameBox;

	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div/div[2]/form/div[1]/div[2]/div/input")
	private WebElement lastnameBox;

	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div/div[2]/form/div[5]/div/div/label/div[1]")
	private WebElement checkbox;

	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div/div[2]/form/div[6]/input")
	private WebElement continueBtn;

	public BasicDetails(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void setBasic_Details(String firstname, String lastname) throws IOException {

		firstnameBox.sendKeys(firstname);

		lastnameBox.sendKeys(lastname);
		checkbox.click();
		continueBtn.click();

	}

}


