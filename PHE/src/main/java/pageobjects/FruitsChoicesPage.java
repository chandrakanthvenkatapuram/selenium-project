package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FruitsChoicesPage {

	
	@FindBy(how=How.XPATH,using=("//*[@for='option-46']"))
	public static WebElement zero;
	@FindBy(how=How.XPATH,using=("//*[@for='option-47']"))
	public static WebElement one;
	@FindBy(how=How.XPATH,using=("//*[@for='option-48']"))
	public static WebElement three;
	@FindBy(how=How.XPATH,using=("//*[@for='option-49']"))
	public static WebElement five;
	
	@FindBy(how=How.XPATH,using=("//*[@class='hay-btn hay-btn--no-touch']"))
	public static WebElement next_FrC;
	
	
}
