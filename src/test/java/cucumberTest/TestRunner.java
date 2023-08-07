package cucumberTest;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = { "Feature/Login_Test.feature"},
		glue = {"stepDefinition"},
				plugin = { "pretty", "html:target/cucumber-reports/Cucumber.html" },
				monochrome = true)

public class TestRunner {

}