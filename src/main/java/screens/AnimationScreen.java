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

public class AnimationScreen extends BaseMethod{
	
	AndroidTouchAction action = new AndroidTouchAction(wd);
	WebDriverWait wait = new WebDriverWait(wd, 20);

//	 constructor
	public AnimationScreen() {
		PageFactory.initElements(new AppiumFieldDecorator(wd),this);
	}
	
//	Element locators 
	@AndroidFindBy(id = "Animation")
	private AndroidElement animationTextLink;
	
	@AndroidFindBy(id = "Reversing")
	private AndroidElement reversingTextLink;
	
	@AndroidFindBy(id = "Play")
	private AndroidElement playButton;
	
	@AndroidFindBy(id = "Reverse")
	private AndroidElement reverseButton;
	
//	Animation text link method 
	public void  tapAnimationTextLink() {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("Animation")));
		action.tap(TapOptions.tapOptions().withElement(ElementOption.element(animationTextLink))).perform();
	}
	
//	Reversing text link method
	public void tapReversingTextLink() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Reversing")));
		action.tap(TapOptions.tapOptions().withElement(ElementOption.element(reversingTextLink))).perform();
	}
	
//	play button tap method
	public void tapPlayButton() {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("Play")));
		action.tap(TapOptions.tapOptions().withElement(ElementOption.element(playButton))).perform();
	}
	
//	Reverse button tap method
	public void tapReverseButton() {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("Reverse")));
		action.tap(TapOptions.tapOptions().withElement(ElementOption.element(reverseButton))).perform();
	}
}
