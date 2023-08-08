package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Test_Steps {
public static WebDriver driver;

	@Given("User is on Home Page")
	public void user_is_on_home_page() {
		System.setProperty(
	            "webdriver.chrome.driver",
	            "/Users/gnanaduraipaulraj/Selenium/chromedriver_mac64/chromedriver");
	 driver = new ChromeDriver();
	driver.manage().window().maximize(); 

	   // throw new io.cucumber.java.PendingException();
	}
	@When("User Navigate to LogIn Page")
	public void user_navigate_to_log_in_page() {
		driver.get("https://shop.demoqa.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
		driver.findElement(By.linkText("My Account")).click();
		
	   // throw new io.cucumber.java.PendingException();
	}
	@When("User enters UserName and Password")
	public void user_enters_user_name_and_password() {
		driver.findElement(By.id("username")).sendKeys("dharshpri");
		driver.findElement(By.id("password")).sendKeys("Priya@demoqa3");
		driver.findElement(By.name("login")).click();
	   // throw new io.cucumber.java.PendingException();
	}
	@Then("Message displayed Login Successfully")
	public void message_displayed_login_successfully() {
		 if(driver.findElement(By.linkText("Logout")).isDisplayed()) {
		    	System.out.println("Login successful");
		    	System.out.println("Poll SCM triggered");
	    }
	   // throw new io.cucumber.java.PendingException();
	}
	

}
