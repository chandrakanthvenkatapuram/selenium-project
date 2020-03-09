package modules;

import pageobjects.DrinkChoice;

public class DrinkChoiceAction {
	
	public static void selectSugarDrinks()
	{
		DrinkChoice.sugarDrinks.click();
		
	}
	
	public static void selectDietDrinks()
	{
		DrinkChoice.dietDrink.click();
		}
	
	
	public static void selectWater()
	{
		DrinkChoice.water.click();
		}
	
	public static void selectTea()
	{
		DrinkChoice.tea.click();
		}
	
}
