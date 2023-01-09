package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="resources/features/User_Registration.feature",glue="stepdefination",dryRun=false)
public class User_RegRun_Feature 
{

}
