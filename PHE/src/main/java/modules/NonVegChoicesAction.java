package modules;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import pageobjects.BaseClass;
import pageobjects.CheeseChoicePage;
import pageobjects.HealthPriorties;
import pageobjects.NonVegChoicesPages;

public class NonVegChoicesAction {
	
	public static void clickBurger() {

		//NonVegChoicesPages.burger.click();
		WebElement Burger = NonVegChoicesPages.burger;
		JavascriptExecutor executor = (JavascriptExecutor) BaseClass.driver;
		executor.executeScript("arguments[0].click();", Burger);
	}

	public static void clickFish() {

		//NonVegChoicesPages.fish.click();
		WebElement Fish = NonVegChoicesPages.fish;
		JavascriptExecutor executor = (JavascriptExecutor) BaseClass.driver;
		executor.executeScript("arguments[0].click();", Fish);
	}

	public static void clickHam() {

		//NonVegChoicesPages.ham.click();
		WebElement Ham = NonVegChoicesPages.ham;
		JavascriptExecutor executor = (JavascriptExecutor) BaseClass.driver;
		executor.executeScript("arguments[0].click();", Ham);
	}

	public static void clickMeat() {

		//NonVegChoicesPages.meat.click();
		WebElement Meat = NonVegChoicesPages.meat;
		JavascriptExecutor executor = (JavascriptExecutor) BaseClass.driver;
		executor.executeScript("arguments[0].click();", Meat);
	}

	public static void clickNextNC() {

		//NonVegChoicesPages.next_NC.click();
		WebElement next_nc = NonVegChoicesPages.next_NC;
		JavascriptExecutor executor = (JavascriptExecutor) BaseClass.driver;
		executor.executeScript("arguments[0].click();", next_nc);
	}

}
