package runner;

import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
	
//@RunWith(Cucumber.class) //Junit execution

	@CucumberOptions(
			plugin = {"pretty", "html:target/meenu.html"}, //reporting purpose
			monochrome=false,  //console output colour
			tags = "", //tags from feature file
			features = {"src/test/resources/features"}, //location of feature files
			glue= "stepdefinition") //location of step definition files

public class Runner_Meenu extends AbstractTestNGCucumberTests{
	
	@Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
				
		return super.scenarios();
    }


}



