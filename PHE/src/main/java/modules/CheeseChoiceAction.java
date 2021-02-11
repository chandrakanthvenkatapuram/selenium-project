package modules;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import pageobjects.BaseClass;
import pageobjects.BreakfastChoicePage;
import pageobjects.CheeseChoicePage;

public class CheeseChoiceAction {
	
	public static void clickHardCheese()
	{
		
		//CheeseChoicePage.hardCheese.click();
		WebElement hardcheese = CheeseChoicePage.hardCheese;
		JavascriptExecutor executor = (JavascriptExecutor) BaseClass.driver;
		executor.executeScript("arguments[0].click();", hardcheese);
	}
	public static void clickCottageCheese()
	{
		
		//CheeseChoicePage.cottageCheese.click();
		WebElement cottagecheese = CheeseChoicePage.cottageCheese;
		JavascriptExecutor executor = (JavascriptExecutor) BaseClass.driver;
		executor.executeScript("arguments[0].click();", cottagecheese);
	}
	public static void clickFatCheese()
	{
		
		//CheeseChoicePage.lowFatCheese.click();
		WebElement lowfatcheese = CheeseChoicePage.lowFatCheese;
		JavascriptExecutor executor = (JavascriptExecutor) BaseClass.driver;
		executor.executeScript("arguments[0].click();", lowfatcheese);
	}

	public static void clickVeganCheese()
	{
		
		//CheeseChoicePage.veganCheese.click();
		WebElement vegancheese = CheeseChoicePage.veganCheese;
		JavascriptExecutor executor = (JavascriptExecutor) BaseClass.driver;
		executor.executeScript("arguments[0].click();", vegancheese);
	}
	public static void clickNextCC()
	{
		
		//CheeseChoicePage.next_CC.click();
		WebElement next_cc = CheeseChoicePage.next_CC;
		JavascriptExecutor executor = (JavascriptExecutor) BaseClass.driver;
		executor.executeScript("arguments[0].click();", next_cc);
	}

}
