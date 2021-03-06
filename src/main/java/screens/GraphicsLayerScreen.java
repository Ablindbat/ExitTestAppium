package screens;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import utility.BaseMethod;

public class GraphicsLayerScreen extends BaseMethod {
	
	AndroidTouchAction action = new AndroidTouchAction(wd);
	WebDriverWait wait = new WebDriverWait(wd, 20);

//	 constructor
	public GraphicsLayerScreen() {
		PageFactory.initElements(new AppiumFieldDecorator(wd),this);
	}
	
//	Element locators 
	@AndroidFindBy(id = "Layers")
	private AndroidElement layerTextLink;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView")
	private AndroidElement titleLayer;
	
//	scroll method
	public void scroll() {
		wd.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Layer\").instance(0))"));
	}
//	tap action of layer text link
	public void tapLayerTextLink() throws Throwable {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("Layers")));
		action.tap(TapOptions.tapOptions().withElement(ElementOption.element(layerTextLink))).perform();
		Thread.sleep(5000);
	}
//	getting assertion data
	public String AssertionDataLayer() {
		String title = titleLayer.getText();
		return title;
	}

}
