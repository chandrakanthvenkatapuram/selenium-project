package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BreakfastChoicePage {
	@FindBy(how=How.XPATH,using=("//*[@class='hay-option__icon icon-eating-breakfast-sugary-cereal']"))
	public static WebElement sugaryCereal;
	
	@FindBy(how=How.XPATH,using=("//*[@class='hay-option__icon icon-eating-breakfast-plain-porridge']"))
	public static WebElement porridge;

	@FindBy(how=How.XPATH,using=("//*[@class='hay-option__icon icon-eating-breakfast-plain-cereal']"))
	public static WebElement cornFlakes;
	
	@FindBy(how=How.XPATH,using=("//*[@class='hay-option__icon icon-eating-breakfast-wholegrain-cereal']"))
	public static WebElement cereals;
	

	@FindBy(how=How.XPATH,using=("//*[@class='hay-btn hay-btn--no-touch']"))
	public static WebElement next_BC;
	
	
	
	

}
