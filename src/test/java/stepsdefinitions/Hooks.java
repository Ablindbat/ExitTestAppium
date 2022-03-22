package stepsdefinitions;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utility.BaseMethod;
import utility.LogReport;

public class Hooks extends BaseMethod {
	//calling logger class
	LogReport logg = new LogReport("Hooks");
	
	//Open appium and service before every execution
	@Before
	public void startAppuim() {
		logg.log.info("Strating appium server.");
		start();
		logg.log.info("Started appium server.");
	}
	
//	close driver and stop appium service after execution
	@After
	public void tearDown(Scenario scenario) {
		if(scenario.isFailed()) {
			//taking screenshot
			logg.log.info("Taking screenshot");
			final byte[] screenshot = ((TakesScreenshot)wd).getScreenshotAs(OutputType.BYTES);
			//embed in report
			logg.log.info("Screenshot taken");
			logg.log.info("Adding screenshot with extent report.");
			scenario.attach(screenshot, "image/png","failed");
			logg.log.info("Screenshot added");
			}
		stopAppium();
		logg.log.info("stop appium");
		closeService();
		logg.log.info("close service");
	}

}
