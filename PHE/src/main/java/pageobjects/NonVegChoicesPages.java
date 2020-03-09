package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NonVegChoicesPages {
	@FindBy(how=How.XPATH,using=("//*[@class='hay-option__icon icon-eating-protein-burger']"))
	public static WebElement burger;
	
	@FindBy(how=How.XPATH,using=("//*[@class='hay-option__icon icon-eating-protein-fish']"))
	public static WebElement fish;
	
	@FindBy(how=How.XPATH,using=("//*[@class='hay-option__icon icon-eating-protein-ham']"))
	public static WebElement ham;
	
	@FindBy(how=How.XPATH,using=("//*[@class='hay-option__icon icon-eating-protein-lean-meat']"))
	public static WebElement meat;
	
	@FindBy(how=How.XPATH,using=("//*[@class='hay-btn hay-btn--no-touch']"))
	public static WebElement next_NC;

	
	
}
