package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
	
		public static void main(String args[]) throws InterruptedException {
			System.setProperty(
		            "webdriver.chrome.driver",
		            "/Users/gnanaduraipaulraj/Selenium/chromedriver_mac64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("https://www.store.demoqa.com");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.id("username")).sendKeys("dharshpri");
		driver.findElement(By.id("password")).sendKeys("Priya@demoqa3");
		driver.findElement(By.name("login")).click();
		 String message = driver.findElement(By.xpath("//*[text()=’Hello’]")).getText();
		    if(message.contains("Hello")) {
		    	System.out.println("Login successful");
		    }
	}
	}



