package runner;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class) // Junit execution

@CucumberOptions(plugin = { "pretty", "html:target/signinreport.html" }, // reporting purpose
		monochrome = false, // console output colour
		tags = "@signin2", // tags from feature file
		features = { "src/test/resources/features/signin_valid_invalid.feature" }, // location of feature files
		glue = "stepdefinition/Signin_valid_invalid_SD") // location of step definition files

public class runner_signin extends AbstractTestNGCucumberTests {

	@Override

	@DataProvider(parallel = false)
	public Object[][] scenarios() {

		return super.scenarios();
	}

}
