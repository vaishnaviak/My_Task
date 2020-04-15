package POM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUp {
	public WebDriver driver;

	@FindBy(xpath = "//strong[.='Sign Up']")
	private WebElement signup;

	@FindBy(xpath = "//input[@placeholder='Email Address']")
	private WebElement EmailAddress;

	@FindBy(xpath = "	//input[@name='get_started']")
	private WebElement getStartedBtn;

	@FindBy(xpath = "//input[@name='password']")
	private WebElement passwd;

	@FindBy(xpath = "//*[@id=\"new_user\"]/div[1]/div[1]/div[2]/div/input")
	private WebElement passwdConfirmationBtn;

	// input[@name='password_confirmation']
	@FindBy(xpath = "//input[@name='continue']")
	private WebElement continueBtn;

	public SignUp(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void setSignUp(String email, String password) throws IOException, InterruptedException {
		signup.click();
		Thread.sleep(2000);
		
		EmailAddress.sendKeys(email);
		Thread.sleep(1000);
		
		getStartedBtn.click();
		Thread.sleep(1000);

		passwd.sendKeys(password);
		Thread.sleep(1000);

		passwdConfirmationBtn.sendKeys(password);
		Thread.sleep(1000);

		continueBtn.click();

	}

}



