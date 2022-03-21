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

public class GraphicsArcScreen extends BaseMethod {
	
	AndroidTouchAction action = new AndroidTouchAction(wd);
	WebDriverWait wait = new WebDriverWait(wd, 20);

//	 constructor
	public GraphicsArcScreen() {
		PageFactory.initElements(new AppiumFieldDecorator(wd),this);
	}
	
//	Element locators 
	@AndroidFindBy(id = "Graphics")
	private AndroidElement graphicsTextLink;
	
	@AndroidFindBy(id = "Arcs")
	private AndroidElement arcsTextLink;
	
//	tap and wait of graphics text link method
	public void tapGraphicsTextLink() {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("Graphics")));
		action.tap(TapOptions.tapOptions().withElement(ElementOption.element(graphicsTextLink))).perform();
		
	}
//	tap and wait of arcs text link method
	public void tapArcsTextLink() throws Throwable {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("Arcs")));
		action.tap(TapOptions.tapOptions().withElement(ElementOption.element(arcsTextLink))).perform();
		Thread.sleep(5000);
	}

}
