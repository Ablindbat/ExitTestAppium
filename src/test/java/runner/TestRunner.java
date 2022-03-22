package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		//features location
		features = "./src/test/java/features",
		//steps for features
		glue = "stepsdefinitions",
		//plugin for reporting
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		monochrome = true,
		//tags use in testing
		tags = "@smoke"
		)
//abstract testng method
public class TestRunner extends AbstractTestNGCucumberTests {

}
