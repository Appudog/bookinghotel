package stepdefenition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefenition {
	static WebDriver driver;
	@Given("goto the hotel url")
	public void goto_the_hotel_url() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
	}

	@When("entering user credentials")
	public void entering_user_credentials() {
		WebElement txtuser = driver.findElement(By.id("username"));
		txtuser.sendKeys("bhuvaneshmech");
		WebElement txtpass = driver.findElement(By.id("password"));
		txtpass.sendKeys("bhuvanesh185");
	}

	@When("entering the dates")
	public void entering_the_dates() {
		WebElement btnLogin = driver.findElement(By.id("login"));
		btnLogin.click();
	}


	@Then("rooms to be booked")
	public void rooms_to_be_booked() {
		System.out.println("Booked");
	}


	
}
