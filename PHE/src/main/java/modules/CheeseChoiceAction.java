package modules;

import pageobjects.CheeseChoicePage;

public class CheeseChoiceAction {
	
	public static void clickHardCheese()
	{
		
		CheeseChoicePage.hardCheese.click();
	}
	public static void clickCottageCheese()
	{
		
		CheeseChoicePage.cottageCheese.click();
	}
	public static void clickFatCheese()
	{
		
		CheeseChoicePage.lowFatCheese.click();
	}

	public static void clickVeganCheese()
	{
		
		CheeseChoicePage.veganCheese.click();
	}
	public static void clickNextCC()
	{
		
		CheeseChoicePage.next_CC.click();
	}

}
