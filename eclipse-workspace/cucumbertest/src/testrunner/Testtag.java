package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "tag.feature"
		,glue={"stepdef"}
		,tags= " not @SmokeTest and  not @EndtoEndTest and not @RegressionTest"
				
				)
public class Testtag {

}
