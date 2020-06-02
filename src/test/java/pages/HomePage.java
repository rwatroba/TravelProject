package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@href='?pwaLOB=wizard-flight-pwa']")
	WebElement flightsButton;
	
	@FindBy(xpath = "//button[contains(@aria-label, 'Flying from')]")
	WebElement flyingFromButton; 
	
	@FindBy(xpath = "//button[contains(@aria-label, 'Flying to')]")
	WebElement flyingToButton; 
	
	@FindBy(xpath = "//input[@name='foo']")
	WebElement cityInput; 
	
	@FindBy(xpath = "(//button[@data-testid='travelers-field-trigger'])[2]")
	WebElement travelersButton;
	
	@FindBy(xpath = "(//button[@data-testid='preferred-class-input'])[1]")
	WebElement flightClassButton;
	
	@FindBy(xpath = "//button[contains(@aria-label, 'Departing')]")
	WebElement departingButton;
	
	@FindBy(xpath = "(//button[@data-testid='submit-button'])[3]")
	WebElement searchButton;
	
	public void clickFlightsButton() {
		flightsButton.click();
	}
	
	public void bookFlight() throws InterruptedException {
		flyingFromButton.click();
		cityInput.clear();
		cityInput.sendKeys("Miami", Keys.ENTER);
		Thread.sleep(1000);
		
		flyingToButton.click();
		cityInput.clear();
		cityInput.sendKeys("New York", Keys.ENTER);
		
		searchButton.click();
	}
}
