package Cucumber.options;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/Features",
                          glue="Stepdefinitionfiles",
                          dryRun=false,tags="@P7")

public class Testrunner extends AbstractTestNGCucumberTests {
	
	//tags="@P7"

}
