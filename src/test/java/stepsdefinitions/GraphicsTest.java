package stepsdefinitions;


import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import screens.GraphicsArcScreen;
import screens.GraphicsLayerScreen;
import utility.BaseMethod;
import utility.LogReport;

public class GraphicsTest extends BaseMethod {

	
	//calling logger class
	LogReport logg = new LogReport("Graphics screen");
//	reference variable of arcs of  graphics
	GraphicsArcScreen graphics;
//	reference variable of layer of  graphics
	GraphicsLayerScreen layer;

//	calling setup
	@Given("^I open api demo apk$")
	public void i_open_api_demo_apk() throws Throwable {
		logg.log.info("calling setup method");
		setup();
		logg.log.info("setup coomplete");
	}

//	calling graphics screen and perform action 
	@And("^I tap on graphics$")
	public void i_tap_on_graphics() throws Throwable {
		logg.log.info("Searching graphics locator");
		graphics = new GraphicsArcScreen();
		graphics.tapGraphicsTextLink();
		logg.log.info("Tap on graphics successfully");

	}
//	calling graphics layer scrolling functionality
	@And("^I scroll until appear layer option$")
	public void i_scroll_until_appear_layer_option() throws Throwable {
		logg.log.info("Start scrolling");
		layer = new GraphicsLayerScreen();
		layer.scroll();
		logg.log.info("Scrolling complete");
	}

//	performing tap action of arcs
	@When("^I tap on arc$")
	public void i_tap_on_arc() throws Throwable {
		logg.log.info("Searching arc locator ");
		graphics = new GraphicsArcScreen();
		graphics.tapArcsTextLink();
		logg.log.info("Tap on arc successfully");
	}
//	performing tap action  on layer
	@When("^I tap on layer text link$")
	public void i_tap_on_layer_text_link() throws Throwable {
		logg.log.info("Searching layer locator");
		layer = new GraphicsLayerScreen();
		layer.tapLayerTextLink();
		logg.log.info("Tap on layer successfully");
	}

//	assertion of arc screen
	@Then("^open arc screen$")
	public void open_arc_screen() throws Throwable {
		Assert.assertTrue(false);
		logg.log.info("Assertion complete");

	}

//	assertion of layer screen
	@Then("^open layer screen$")
	public void open_layer_screen() throws Throwable {
		layer = new GraphicsLayerScreen();
		Assert.assertEquals(layer.AssertionDataLayer(), "Graphics/Layers");
		logg.log.info("Assertion complete");
	}


}
