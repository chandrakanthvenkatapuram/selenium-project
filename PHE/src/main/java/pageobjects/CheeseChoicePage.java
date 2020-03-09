package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CheeseChoicePage {

	@FindBy(how=How.XPATH,using=("//*[@class='hay-option__icon icon-eating-cheese-hard-cheese']"))
	public static WebElement hardCheese;
	
	@FindBy(how=How.XPATH,using=("//*[@class='hay-option__icon icon-eating-cheese-cottage-cheese']"))
	public static WebElement cottageCheese;
	
	@FindBy(how=How.XPATH,using=("//*[@class='hay-option__icon icon-eating-cheese-lower-fat-hard-cheese']"))
	public static WebElement lowFatCheese;
	
	@FindBy(how=How.XPATH,using=("//*[@class='hay-option__icon icon-eating-cheese-vegan-cheese']"))
	public static WebElement veganCheese;
	
	@FindBy(how=How.XPATH,using=("//*[@class='hay-btn hay-btn--no-touch']"))
	public static WebElement next_CC;
	
	
	
}
