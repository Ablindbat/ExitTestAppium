package stepsdefinitions;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utility.BaseMethod;

public class Hooks extends BaseMethod {
	//Open appium and service before every execution
	@Before
	public void startAppuim() {
		start();
	}
	
//	close driver and stop appium service after execution
	@After
	public void tearDown(Scenario scenario) {
		if(scenario.isFailed()) {
			//taking screenshot
			final byte[] screenshot = ((TakesScreenshot)wd).getScreenshotAs(OutputType.BYTES);
			//embed in report
			scenario.attach(screenshot, "image/png","failed");
			}
		stopAppium();
		closeService();
	}

}
