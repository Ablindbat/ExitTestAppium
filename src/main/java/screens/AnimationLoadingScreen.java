package screens;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import utility.BaseMethod;

public class AnimationLoadingScreen extends BaseMethod {
	
//	Touch action and explicit wait pre-define method
	
	AndroidTouchAction action = new AndroidTouchAction(wd);
	WebDriverWait wait = new WebDriverWait(wd, 20);
//	constructor declaration
	public AnimationLoadingScreen() {
		PageFactory.initElements(new AppiumFieldDecorator(wd), this);
	}
	
//	Element locators
	@AndroidFindBy(id = "Animation")
	AndroidElement animationTextLink;
	
	@AndroidFindBy(id = "Loading")
	AndroidElement loadingTextLink;
	
	@AndroidFindBy(id = "Run")
	AndroidElement runButton;
	
		
	public void tapLoadingTextLink() {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("Loading")));
		action.tap(TapOptions.tapOptions().withElement(ElementOption.element(loadingTextLink))).perform();
	}
	
	public void tapRunButton() {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("Run")));
		action.tap(TapOptions.tapOptions().withElement(ElementOption.element(runButton))).perform();
	}
	

}
