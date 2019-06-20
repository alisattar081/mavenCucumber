package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

public class testRunner {
	
	@RunWith(Cucumber.class)
	@CucumberOptions(features="feature", glue="stepdefinition")
	public class TestRunner {

	}

}
