package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="resources/features/MultipleData.feature",glue="stepdefination",dryRun=false,monochrome=true)


public class Login_MultipleRun 
{

}
