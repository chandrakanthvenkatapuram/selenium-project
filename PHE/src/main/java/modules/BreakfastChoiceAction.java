package modules;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import pageobjects.AlcoholIntakePage;
import pageobjects.BaseClass;
import pageobjects.BreakfastChoicePage;

public class BreakfastChoiceAction {
	
	public static void clickSugaryCereal()
	{
		//BreakfastChoicePage.sugaryCereal.click();
		WebElement sugarycereal = BreakfastChoicePage.sugaryCereal;
		JavascriptExecutor executor = (JavascriptExecutor) BaseClass.driver;
		executor.executeScript("arguments[0].click();", sugarycereal);
	}
	
	public static void clickPorridge()
	{
		//BreakfastChoicePage.porridge.click();
		WebElement Porridge = BreakfastChoicePage.porridge;
		JavascriptExecutor executor = (JavascriptExecutor) BaseClass.driver;
		executor.executeScript("arguments[0].click();", Porridge);
	}
	public static void clickCornFlakes()
	{
		//BreakfastChoicePage.cornFlakes.click();
		WebElement cornflakes = BreakfastChoicePage.cornFlakes;
		JavascriptExecutor executor = (JavascriptExecutor) BaseClass.driver;
		executor.executeScript("arguments[0].click();", cornflakes);
	}
	public static void clickCereals()
	{
		//BreakfastChoicePage.cereals.click();
		WebElement Cereals = BreakfastChoicePage.cereals;
		JavascriptExecutor executor = (JavascriptExecutor) BaseClass.driver;
		executor.executeScript("arguments[0].click();", Cereals);
	}

	public static void clickNextBC()
	{
		//BreakfastChoicePage.next_BC.click();
		WebElement next_bc = BreakfastChoicePage.next_BC;
		JavascriptExecutor executor = (JavascriptExecutor) BaseClass.driver;
		executor.executeScript("arguments[0].click();", next_bc);
	}
}
