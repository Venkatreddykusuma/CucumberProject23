package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="resources/features/Login_InvalidTest.feature",glue="stepdefination",dryRun=false)

public class Login_InvalidTestRun 

{

}
