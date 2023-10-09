package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features ="Featurefile/Addemployee.feature",glue = "stepDefinitions",dryRun = false ,plugin= {"pretty","html:target/cucumber-reports"})

public class Runner {
	
	

}
