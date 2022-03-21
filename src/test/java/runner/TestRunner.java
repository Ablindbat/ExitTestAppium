package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features = "./src/test/java/features",
		glue = "stepsdefinitions",
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		monochrome = true,
		tags = "@graphics"
		)

public class TestRunner extends AbstractTestNGCucumberTests {

}
