package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "tegs.feature"
		,glue={"tag_test"}
		,tags=("~@SmokeTest")
		
		)
		

public class Tagstest {
	
}