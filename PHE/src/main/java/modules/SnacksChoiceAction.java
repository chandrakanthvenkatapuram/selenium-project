package modules;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import pageobjects.BaseClass;
import pageobjects.SmokePage;
import pageobjects.SnacksChoicePage;

public class SnacksChoiceAction {

	public static void clickFruit() {
		//SnacksChoicePage.fruit.click();
		WebElement Fruit = SnacksChoicePage.fruit;
		JavascriptExecutor executor = (JavascriptExecutor) BaseClass.driver;
		executor.executeScript("arguments[0].click();", Fruit);
	}

	public static void clickChocolate() {
		//SnacksChoicePage.chocolate.click();
		WebElement Chocolate = SnacksChoicePage.chocolate;
		JavascriptExecutor executor = (JavascriptExecutor) BaseClass.driver;
		executor.executeScript("arguments[0].click();", Chocolate);
	}

	public static void clickCrisp() {
		//SnacksChoicePage.crisp.click();
		WebElement Crisp = SnacksChoicePage.crisp;
		JavascriptExecutor executor = (JavascriptExecutor) BaseClass.driver;
		executor.executeScript("arguments[0].click();", Crisp);
	}

	public static void clickCakes() {
		//SnacksChoicePage.cakes.click();
		WebElement Cakes = SnacksChoicePage.cakes;
		JavascriptExecutor executor = (JavascriptExecutor) BaseClass.driver;
		executor.executeScript("arguments[0].click();", Cakes);
	}

	public static void clickBiscuits() {
		//SnacksChoicePage.biscuits.click();
		WebElement Biscuits = SnacksChoicePage.biscuits;
		JavascriptExecutor executor = (JavascriptExecutor) BaseClass.driver;
		executor.executeScript("arguments[0].click();", Biscuits);
	}

	public static void clickTeaCakes() {
		//SnacksChoicePage.teaCakes.click();
		WebElement teacakes = SnacksChoicePage.teaCakes;
		JavascriptExecutor executor = (JavascriptExecutor) BaseClass.driver;
		executor.executeScript("arguments[0].click();", teacakes);
	}

	public static void clickNuts() {
		//SnacksChoicePage.nuts.click();
		WebElement Nuts = SnacksChoicePage.nuts;
		JavascriptExecutor executor = (JavascriptExecutor) BaseClass.driver;
		executor.executeScript("arguments[0].click();", Nuts);
	}

	public static void clickToast() {
		//SnacksChoicePage.toast.click();
		WebElement Toast = SnacksChoicePage.toast;
		JavascriptExecutor executor = (JavascriptExecutor) BaseClass.driver;
		executor.executeScript("arguments[0].click();", Toast);
	}

	public static void clickNone() {
		//SnacksChoicePage.none.click();
		WebElement None = SnacksChoicePage.none;
		JavascriptExecutor executor = (JavascriptExecutor) BaseClass.driver;
		executor.executeScript("arguments[0].click();", None);
	}

	public static void clickNext_SC() {
		//SnacksChoicePage.next_SC.click();
		WebElement next_sc = SnacksChoicePage.next_SC;
		JavascriptExecutor executor = (JavascriptExecutor) BaseClass.driver;
		executor.executeScript("arguments[0].click();", next_sc);
	}

}
