package stepsdefinitions;

import utility.LogReport;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

//import org.testng.Assert;


import screens.AnimationCloningScreen;
import screens.AnimationCustomEvaluatorScreen;
import screens.AnimationLoadingScreen;
import screens.AnimationScreen;
import utility.BaseMethod;

public class AnimationTest extends BaseMethod {
	
	//calling logger class
	LogReport logg = new LogReport("Animation screen");
	
	AnimationScreen animation;
	AnimationLoadingScreen animation1;
	AnimationCloningScreen animation2;
	AnimationCustomEvaluatorScreen animation3;
	
	@Given("^I open the app$")
	public void i_open_the_app() throws Throwable {
		setup();
		
	}

	@And("^Tap on animation$")
	public void tap_on_animation() throws Throwable {
		animation = new AnimationScreen();
		animation.tapAnimationTextLink();
		
	}

	@And("^Tap on Reversing$")
	public void tap_on_Reversing() throws Throwable {
		animation = new AnimationScreen();
		animation.tapReversingTextLink();
		
	}

	

	@And("^Tap on reverse button$")
	public void tap_on_reverse_button() throws Throwable {
		animation = new AnimationScreen();
		animation.tapReverseButton();
		
	}

		
	@And("^Tap on loading$")
	public void tap_on_loading() throws Throwable {
		animation1 = new AnimationLoadingScreen();
		animation1.tapLoadingTextLink();
		
	}

		
	@And("^Tap on cloning text link$")
	public void tap_on_cloning_text_link() throws Throwable {
		animation2 = new AnimationCloningScreen();
		animation2.tapCloningTextLink();	
	}
	
	@Given("^Tap on custom evaluation text link$")
	public void tap_on_custom_evaluation_text_link() throws Throwable {
		animation3 =new AnimationCustomEvaluatorScreen();
		animation3.tapCustomEvaluatorLinkText();
	}
	
	@When("^Tap on run button$")
	public void tap_on_run() throws Throwable {
		animation1 = new AnimationLoadingScreen();
		animation1.tapRunButton();
		
	
	}
	
	@When("^Tap on play button$")
	public void tap_on_play_button() throws Throwable {
		animation = new AnimationScreen();
		animation.tapPlayButton();
		
	}

	@When("^Tap on clonig run button$")
	public void tap_on_clonig_run_button() throws Throwable {
		animation2 = new AnimationCloningScreen();
		animation2.tapRunButton();
	    
	}
	
	@Then("^Loading the screen$")
	public void loading_the_screen() throws Throwable {
		
	
	}

	@Then("^Cloning the screen$")
	public void cloning_the_screen() throws Throwable {
	    
	}
	
	@Then("^Ball return same place$")
	public void ball_return_same_place() throws Throwable {
//		Assert.assertEquals(, null);
	}

	@Then("^custom evaluator work$")
	public void custom_evaluator_work() throws Throwable {

	
	}

}
