package br.com.rsinet_appium_bdd.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class BasePage {

	protected AndroidDriver<MobileElement> driver;
	protected TouchAction<?> touchAction;
	
	public BasePage(AndroidDriver<MobileElement> driver) {
		this.driver = driver;
	}
	
	public BasePage(AndroidDriver<MobileElement> driver, TouchAction<?> touchAction) {
		this.driver = driver;
		this.touchAction = touchAction;
	}
	
	public void scrollClick(String visibleText) {
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
						+ visibleText + "\").instance(0))").click();
	}
	
	public void scrollUp() {
		touchAction.press(PointOption.point(1063, 265)).moveTo(PointOption.point(1055, 1931)).perform();
	}
	
	public void scrollDown() {
		touchAction.press(PointOption.point(1063, 1680)).moveTo(PointOption.point(1055, 349)).perform();
	}
	
	public void hideKeyboard() {
		driver.hideKeyboard();
	}
	
	public void bntNextLine(TouchAction touchAction) {
		touchAction.tap(PointOption.point(992, 2099)).perform();
	}
	
}
