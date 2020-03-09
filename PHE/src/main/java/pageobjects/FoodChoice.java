package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FoodChoice {

	@FindBy(how = How.XPATH, using = ("//*[@class='hay-option__icon icon-eating-carb-chips']"))
	public static WebElement chips;
	
	@FindBy(how = How.XPATH, using = ("//*[@class='hay-option__icon icon-eating-carb-boiled-potatoes']"))
	public static WebElement bPotato;
	
	@FindBy(how = How.XPATH, using = ("//*[@class='hay-option__icon icon-eating-carb-roast-potatoes']"))
	public static WebElement rPotato;
	
	@FindBy(how = How.XPATH, using = ("//*[@class='hay-option__icon icon-eating-carb-jacket-potatoes']"))
	public static WebElement jPotato;
	
	@FindBy(how = How.XPATH, using = ("//*[@class='hay-btn hay-btn--no-touch']"))
	public static WebElement next_foodChoice;
	
	
	

}
