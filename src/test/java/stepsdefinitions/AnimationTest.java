package stepsdefinitions;

import utility.LogReport;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import screens.AnimationCloningScreen;
import screens.AnimationCustomEvaluatorScreen;
import screens.AnimationLoadingScreen;
import screens.AnimationScreen;
import utility.BaseMethod;

public class AnimationTest extends BaseMethod {
	
	//calling logger class
	LogReport logg = new LogReport("Animation screen");
//	reference variables of screen class
	AnimationScreen animation;
	AnimationLoadingScreen animation1;
	AnimationCloningScreen animation2;
	AnimationCustomEvaluatorScreen animation3;
//	calling setup method
	@Given("^I open the app$")
	public void i_open_the_app() throws Throwable {
		logg.log.info("starting setup");
		setup();
		logg.log.info("Setup completed");
	}

//	tap action on animation 
	@And("^Tap on animation$")
	public void tap_on_animation() throws Throwable {
		logg.log.info("Searching animation locator");
		animation = new AnimationScreen();
		animation.tapAnimationTextLink();
		logg.log.info("search completed and perform touch action.");
		
	}

//	tap action on Reversing 
	@And("^Tap on Reversing$")
	public void tap_on_Reversing() throws Throwable {
		logg.log.info("Searching reversing locator");
		animation = new AnimationScreen();
		animation.tapReversingTextLink();
		logg.log.info("search completed and perform touch action.");
		
	}

	
// 	tap action perform on reversing button
	@And("^Tap on reverse button$")
	public void tap_on_reverse_button() throws Throwable {
		logg.log.info("Searching reversing button locator");
		animation = new AnimationScreen();
		animation.tapReverseButton();
		logg.log.info("search completed and perform touch action.");
	}

//	tap action perform on loading text	
	@And("^Tap on loading$")
	public void tap_on_loading() throws Throwable {
		logg.log.info("Searching loading text locator");
		animation1 = new AnimationLoadingScreen();
		animation1.tapLoadingTextLink();
		logg.log.info("search completed and perform touch action.");
	}

//	tap action perform on cloning text	
	@And("^Tap on cloning text link$")
	public void tap_on_cloning_text_link() throws Throwable {
		logg.log.info("Searching cloning locator");
		animation2 = new AnimationCloningScreen();
		animation2.tapCloningTextLink();
		logg.log.info("search completed and perform touch action.");
	}
//	tap action perform on custom evaluation text link
	@Given("^Tap on custom evaluation text link$")
	public void tap_on_custom_evaluation_text_link() throws Throwable {
		logg.log.info("Searching custom evaluation text link locator");
		animation3 =new AnimationCustomEvaluatorScreen();
		animation3.tapCustomEvaluatorLinkText();
		logg.log.info("search completed and perform touch action.");
	}
//	tap perform on run button
	@When("^Tap on run button$")
	public void tap_on_run() throws Throwable {
		logg.log.info("Searching run button locator");
		animation1 = new AnimationLoadingScreen();
		animation1.tapRunButton();
		logg.log.info("search completed and perform touch action.");
	
	}
//	tap action on play button 
	@When("^Tap on play button$")
	public void tap_on_play_button() throws Throwable {
		logg.log.info("Searching play button locator");
		animation = new AnimationScreen();
		animation.tapPlayButton();
		logg.log.info("search completed and perform touch action.");
	}
//	tap action on run button of cloning 
	@When("^Tap on clonig run button$")
	public void tap_on_clonig_run_button() throws Throwable {
		logg.log.info("Searching cloning locator");
		animation2 = new AnimationCloningScreen();
		animation2.tapRunButton();
		logg.log.info("search completed and perform touch action.");
	}
//	Assertion of loading screen
	@Then("^Loading the screen$")
	public void loading_the_screen() throws Throwable {
		animation1 = new AnimationLoadingScreen();
		Assert.assertEquals(animation1.assertionData(), "Animation/Loading");
		logg.log.info("Assertion complete");
	
	}
//	Assertion of cloning screen
	@Then("^Cloning the screen$")
	public void cloning_the_screen() throws Throwable {
		animation2 = new AnimationCloningScreen();
	    Assert.assertEquals(animation2.titleAssertion(), "Animation/Cloning");
	    logg.log.info("Assertion complete");
	}
//	Assertion of reversing
	@Then("^Ball return same place$")
	public void ball_return_same_place() throws Throwable {
		animation = new AnimationScreen();
		Assert.assertEquals(animation.AssertionReverse(), "Animation/Reversing");
		logg.log.info("Assertion complete");
	}
//	Assertion of custom evaluator
	@Then("^custom evaluator work$")
	public void custom_evaluator_work() throws Throwable {

		animation3 = new AnimationCustomEvaluatorScreen();
		Assert.assertEquals(animation3.assertionCustomEvaluatorData(), "Animation/Custom Evaluator");
		logg.log.info("Assertion complete");
	}

}
