package modules;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import pageobjects.BaseClass;
import pageobjects.FoodChoice;
import pageobjects.FruitsChoicesPage;

public class FruitChoiceActions {

	public static void clickZero() {

		//FruitsChoicesPage.zero.click();
		WebElement Zero = FruitsChoicesPage.zero;
		JavascriptExecutor executor = (JavascriptExecutor) BaseClass.driver;
		executor.executeScript("arguments[0].click();", Zero);
	}

	public static void clickOne() {

		//FruitsChoicesPage.one.click();
		WebElement One = FruitsChoicesPage.one;
		JavascriptExecutor executor = (JavascriptExecutor) BaseClass.driver;
		executor.executeScript("arguments[0].click();", One);
	}

	public static void clickThree() {

		//FruitsChoicesPage.three.click();
		WebElement Three = FruitsChoicesPage.three;
		JavascriptExecutor executor = (JavascriptExecutor) BaseClass.driver;
		executor.executeScript("arguments[0].click();", Three);
	}

	public static void clickFive() {
		JavascriptExecutor jse = (JavascriptExecutor)BaseClass.driver;
		jse.executeScript("arguments[0].click();", FruitsChoicesPage.five);
		//FruitsChoicesPage.five.click();
	}
	public static void clickNextFrC() {
		//FruitsChoicesPage.next_FrC.click();
		WebElement next_frc = FruitsChoicesPage.next_FrC;
		JavascriptExecutor executor = (JavascriptExecutor) BaseClass.driver;
		executor.executeScript("arguments[0].click();", next_frc);
	}
}
