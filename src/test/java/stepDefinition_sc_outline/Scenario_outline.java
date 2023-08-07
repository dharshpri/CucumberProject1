package stepDefinition_sc_outline;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Scenario_outline {
	public static WebDriver driver;
	@Given("User is on Home Page")
	public void user_is_on_home_page() {
		System.setProperty(
	            "webdriver.chrome.driver",
	            "/Users/gnanaduraipaulraj/Selenium/chromedriver_mac64/chromedriver");
	 driver = new ChromeDriver();
	driver.manage().window().maximize(); 
	driver.get("https://shop.demoqa.com/");
	   
	}
	@When("User Navigate to LogIn Page")
	public void user_navigate_to_log_in_page() {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
		driver.findElement(By.linkText("My Account")).click(); 
	}
	@When("User enters {string} and {string}")
	public void user_enters_and(String username, String password) {
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.name("login")).click(); 
	}
	@Then("Message displayed Login Successfully")
	public void message_displayed_login_successfully() {
		 if(driver.findElement(By.linkText("Logout")).isDisplayed()) {
		    	System.out.println("Login successful");
	}


	}

}
