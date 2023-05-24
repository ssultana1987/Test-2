package CucumBer_TestRunner1;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resources/FretureFolder"},
plugin = {"json:target/cucumber.json"},
glue = "CuCumber_StepDefination")//tags = {"@Sanity"})

public class LogIn_Runner_Class extends AbstractTestNGCucumberTests{

}
