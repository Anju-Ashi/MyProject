
package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "login1.feature"
		,glue={"stepdef"}
		
				
				)
public class Logindef {

}
