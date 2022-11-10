package TestClasses;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/Features/ManipalSignUp.feature"},
glue = {"StepDefinition"},
tags= {"@ManipalL"})
//tags= {"@Sanity,@Regression2"} Or condition
//tags= {"@Sanity","@Regression2"} And condition

public class TestRunnerForManipal {

}
