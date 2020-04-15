package test;

import java.awt.AWTException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.BasicDetails;
import POM.Create_First_client;
import POM.Create_Your_Organization;
import POM.Project;
import POM.SignUp;

public class teatcase {

	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

	}

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		WebDriver driver = new ChromeDriver();

		File f = new File("./src/resources/CommanData.properties");
		FileInputStream fi = new FileInputStream(f);
		Properties pr = new Properties();
		pr.load(fi);
		String url = pr.getProperty("URL");

		System.out.println(url);

		driver.get("https://qa.aceinvoice.com/");
		String passwd = pr.getProperty("password");
		System.out.println(passwd);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		final String randomEmail = randomEmail();

		// sign up
		SignUp sg = new SignUp(driver);
		sg.setSignUp(randomEmail, passwd);

		// Entering Basic details
		BasicDetails bs = new BasicDetails(driver);
		bs.setBasic_Details("vaishnavi", "ak");

		// setting Organization

		Create_Your_Organization crt = new Create_Your_Organization(driver);
		crt.setOrganization("Qspider");

		// Create First Client

		Create_First_client crf = new Create_First_client(driver);
		crf.setFirst_Client("vaishnavi", "kannur", "kerala", "kannur", "kerala", "india", "56789");

		Thread.sleep(5000);
	    driver.findElement(By.xpath("//button[.='Continue to the app']")).click();
		
		

		// creating project
		Project pr1 = new Project(driver);
		pr1.setProject("my project", "no special notes ");

		Thread.sleep(8000);

		driver.quit();
	}

	// this method is to create random id for each mail
	private static String randomEmail() {
		return "random" + UUID.randomUUID().toString() + "@example.com";

	}



	}


