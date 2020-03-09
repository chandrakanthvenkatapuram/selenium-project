package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DrinkChoice {

	@FindBy(how=How.XPATH,using=("//*[@class='hay-option__icon icon-eating-drinks-sugary-drink']"))
	public static WebElement sugarDrinks;
	
	@FindBy(how=How.XPATH,using=("//*[@class='hay-option__icon icon-eating-drinks-diet-drink']"))
	public static WebElement dietDrink;
	
	@FindBy(how=How.XPATH,using=("//*[@class='hay-option__icon icon-eating-drinks-water']"))
	public static WebElement water;
	
	@FindBy(how=How.XPATH,using=("//*[@class='hay-option__icon icon-eating-drinks-tea-coffee']"))
	public static WebElement tea;

	


	
	
		
	
}
