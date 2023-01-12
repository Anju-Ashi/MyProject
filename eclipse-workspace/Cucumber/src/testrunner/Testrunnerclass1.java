package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "productsearch.feature"
		,glue={"stepdefinition"}
		
		)

public class Testrunnerclass1 {

}
