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

public class AnimationCloningScreen extends BaseMethod {
	
//	Touch action and explicit wait pre-define method
	
	AndroidTouchAction action = new AndroidTouchAction(wd);
	WebDriverWait wait = new WebDriverWait(wd, 20);
//	constructor declaration
	public AnimationCloningScreen() {
		PageFactory.initElements(new AppiumFieldDecorator(wd), this);
	}
	
//	Element locators
	@AndroidFindBy(id = "Animation")
	private AndroidElement animationTextLink;
	
	@AndroidFindBy(id = "Cloning")
	private AndroidElement cloningTextLink;
	
	@AndroidFindBy(id = "Run")
	private AndroidElement runButton;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView")
	private AndroidElement assertionValue;
		
//	Cloning text link method
	public void tapCloningTextLink() {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("Cloning")));
		action.tap(TapOptions.tapOptions().withElement(ElementOption.element(cloningTextLink))).perform();
	}
	
//	play button tap method
	public void tapRunButton() {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("Run")));
		action.tap(TapOptions.tapOptions().withElement(ElementOption.element(runButton))).perform();
	}
//	getting title of last page 
	public String titleAssertion() {
		String cloningTitle = assertionValue.getText();
		return cloningTitle;
	}

}
