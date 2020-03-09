package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TakingCarePage {
	
	@FindBy(how=How.XPATH,using=("//*[@class='hay-option__icon icon-about-you-do-not-have-time']"))
	public static WebElement iDontHaveTime;
	

	@FindBy(how=How.XPATH,using=("//*[@class='hay-option__icon icon-about-you-important-i-lookafter-others']"))
	public static WebElement iLookAfterOthers;

	@FindBy(how=How.XPATH,using=("//*[@class='hay-option__icon icon-about-you-i-do-not-know-what-to-do']"))
	public static WebElement iDontKnowWhatToDo;
		
	@FindBy(how=How.XPATH,using=("//*[@class='hay-option__icon icon-about-you-i-do-not-have-money']"))
	public static WebElement iDontHaveTheMoney;
	
	@FindBy(how=How.XPATH,using=("//*[@class='hay-option__icon icon-about-you-can-not-keep-it-up']"))
	public static WebElement iStartCantKeepUp;	
	
	@FindBy(how=How.XPATH,using=("//*[@class='hay-option__icon icon-about-you-ill-disabled']"))
	public static WebElement illDisabled;	
	
	@FindBy(how=How.XPATH,using=("//*[@class='hay-option__icon icon-about-you-i-take-good-care-of-myself']"))
	public static WebElement iTakeGoodCare;
	
	@FindBy(how=How.XPATH,using=("//form/div[2]/button"))
	public static WebElement next3;
	

}
