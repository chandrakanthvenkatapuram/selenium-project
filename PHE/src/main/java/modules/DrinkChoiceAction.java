package modules;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import pageobjects.BaseClass;
import pageobjects.CheeseChoicePage;
import pageobjects.DrinkChoice;

public class DrinkChoiceAction {
	
	public static void selectSugarDrinks()
	{
		//DrinkChoice.sugarDrinks.click();
		WebElement sugardrinks = DrinkChoice.sugarDrinks;
		JavascriptExecutor executor = (JavascriptExecutor) BaseClass.driver;
		executor.executeScript("arguments[0].click();", sugardrinks);
		
	}
	
	public static void selectDietDrinks()
	{
		//DrinkChoice.dietDrink.click();
		WebElement dietdrink = DrinkChoice.dietDrink;
		JavascriptExecutor executor = (JavascriptExecutor) BaseClass.driver;
		executor.executeScript("arguments[0].click();", dietdrink);
	}
	
	
	public static void selectWater()
	{
		//DrinkChoice.water.click();
		WebElement Water = DrinkChoice.water;
		JavascriptExecutor executor = (JavascriptExecutor) BaseClass.driver;
		executor.executeScript("arguments[0].click();", Water);
	}
	
	public static void selectTea()
	{
		//DrinkChoice.tea.click();
		WebElement Tea = DrinkChoice.tea;
		JavascriptExecutor executor = (JavascriptExecutor) BaseClass.driver;
		executor.executeScript("arguments[0].click();", Tea);
	}
	
}
