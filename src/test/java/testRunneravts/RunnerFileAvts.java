package testRunneravts;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Featurefile/Features.feature",glue = "stepdefinition",stepNotifications = true,
monochrome = true,plugin = {"pretty:target/cucumber-pretty.txt","usage:target/cucumber-usage.json",
		"json:target/cucumber-reports/Cucumber.json","junit:target/cucumber-reports/Cucumber.xml",
		"html:Report/sampleTest.html","json:target/cucumber-reports/Cucumber.json"} )
public class RunnerFileAvts {

}
