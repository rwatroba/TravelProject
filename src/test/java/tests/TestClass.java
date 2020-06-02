package tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import pages.HomePage;

public class TestClass {

	WebDriver driver;
	String baseUrl;
	HomePage homePage;
	
	@BeforeClass
	public void beforeClass() {
		baseUrl = "https://www.expedia.com/";
		driver = new ChromeDriver();
		homePage = new HomePage(driver);
		
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void afterClass() {
		driver.quit();
	}

	@Test()
	public void clickFligthsButton() {
		driver.get(baseUrl);
		homePage.clickFlightsButton();
		
	}
}
