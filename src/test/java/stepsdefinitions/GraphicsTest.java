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
		logg.log.info("");
		setup();

	}

	@And("^I tap on graphics$")
	public void i_tap_on_graphics() throws Throwable {
		graphics = new GraphicsArcScreen();
		graphics.tapGraphicsTextLink();

	}

	@And("^I scroll until appear layer option$")
	public void i_scroll_until_appear_layer_option() throws Throwable {
		layer = new GraphicsLayerScreen();
		layer.scroll();

	}

	@When("^I tap on arc$")
	public void i_tap_on_arc() throws Throwable {
		graphics = new GraphicsArcScreen();
		graphics.tapArcsTextLink();
	}

	@When("^I tap on layer text link$")
	public void i_tap_on_layer_text_link() throws Throwable {
		layer = new GraphicsLayerScreen();
		layer.taplayerTextLink();

	}


	@Then("^open arc screen$")
	public void open_arc_screen() throws Throwable {
		Assert.assertTrue(false);

	}


	@Then("^open layer screen$")
	public void open_layer_screen() throws Throwable {
	}


}
