package cucumber.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/cucumber/Feature/AdactinTwo",
		glue= {"stepdefinition"},
		dryRun = false , 
		monochrome = true
//		plugin = {"pretty" , "html:target/cucumber-reports"}
		
		)
public class runner {

}
