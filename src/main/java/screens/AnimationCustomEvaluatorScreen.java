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

public class AnimationCustomEvaluatorScreen extends BaseMethod {

//	Touch action and explicit wait pre-define method
	
	AndroidTouchAction action = new AndroidTouchAction(wd);
	WebDriverWait wait = new WebDriverWait(wd, 20);
//	constructor declaration
	public AnimationCustomEvaluatorScreen() {
		PageFactory.initElements(new AppiumFieldDecorator(wd), this);
	}
	
//	Element locators
	@AndroidFindBy(id = "Custom Evaluator")
	private AndroidElement customEvaluator;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView")
	private AndroidElement titleCustomEvaluator;
	
//	tap action of Custom Evaluator text link method
	public void tapCustomEvaluatorLinkText() {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("Custom Evaluator")));
		action.tap(TapOptions.tapOptions().withElement(ElementOption.element(customEvaluator))).perform();
	}
//	getting title for assertion
	public String assertionCustomEvaluatorData() {
		String title = titleCustomEvaluator.getText();
		return title;
	}
		
	
}
