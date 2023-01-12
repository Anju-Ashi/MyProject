package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "login.feature"
		,glue={"stepdefinition"}
		,dryRun = false
				,monochrome=true
		,plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json"}
		)

public class Test {

}
