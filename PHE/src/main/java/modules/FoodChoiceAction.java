package modules;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import pageobjects.BaseClass;
import pageobjects.ExercisePage;
import pageobjects.FoodChoice;

public class FoodChoiceAction {
	
	

	public static void clickChips()
	{
		//FoodChoice.chips.click();
		WebElement Chips = FoodChoice.chips;
		JavascriptExecutor executor = (JavascriptExecutor) BaseClass.driver;
		executor.executeScript("arguments[0].click();", Chips);
		
	}
	
	public static void clickBPotato()
	{
		//FoodChoice.bPotato.click();
		WebElement bpotato = FoodChoice.bPotato;
		JavascriptExecutor executor = (JavascriptExecutor) BaseClass.driver;
		executor.executeScript("arguments[0].click();", bpotato);
		
	}
	
	public static void clickRPotato()
	{
		//FoodChoice.rPotato.click();
		WebElement rpotato = FoodChoice.rPotato;
		JavascriptExecutor executor = (JavascriptExecutor) BaseClass.driver;
		executor.executeScript("arguments[0].click();", rpotato);
	}

	public static void clickJPotato()
	{
		//FoodChoice.jPotato.click();
		WebElement jpotato = FoodChoice.jPotato;
		JavascriptExecutor executor = (JavascriptExecutor) BaseClass.driver;
		executor.executeScript("arguments[0].click();", jpotato);
		
	}

	public static void clickNextFC()
	{
		//FoodChoice.next_foodChoice.click();
		WebElement next_foodchoice = FoodChoice.next_foodChoice;
		JavascriptExecutor executor = (JavascriptExecutor) BaseClass.driver;
		executor.executeScript("arguments[0].click();", next_foodchoice);
		
	}
	
	

}
