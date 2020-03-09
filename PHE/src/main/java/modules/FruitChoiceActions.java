package modules;

import org.openqa.selenium.JavascriptExecutor;

import pageobjects.BaseClass;
import pageobjects.FruitsChoicesPage;

public class FruitChoiceActions {

	public static void clickZero() {

		FruitsChoicesPage.zero.click();
	}

	public static void clickOne() {

		FruitsChoicesPage.one.click();
	}

	public static void clickThree() {

		FruitsChoicesPage.three.click();
	}

	public static void clickFive() {
		JavascriptExecutor jse = (JavascriptExecutor)BaseClass.driver;
		jse.executeScript("arguments[0].click();", FruitsChoicesPage.five);
		//FruitsChoicesPage.five.click();
	}
	public static void clickNextFrC() {
		FruitsChoicesPage.next_FrC.click();
	}
}
