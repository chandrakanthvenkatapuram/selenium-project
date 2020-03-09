package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HealthPriorties {

	@FindBy(how=How.XPATH,using=("//*[@class='hay-option__icon icon-about-you-fit-into-jeans'}"))
	public static WebElement fittingJeans;
	
	@FindBy(how=How.XPATH,using=("//*[@class='hay-option__icon icon-about-you-having-more-energy']"))
	public static WebElement moreEnergy;

	
	@FindBy(how=How.XPATH,using=("//*[@class='hay-option__icon icon-about-you-avoiding-aches-and-pain']"))
	public static WebElement achesPain;
	
	@FindBy(how=How.XPATH,using=("//*[@class='hay-option__icon icon-about-you-feeling-young']"))
	public static WebElement feelingYoung;
	
	@FindBy(how=How.XPATH,using=("//*[@class='hay-option__icon icon-about-you-staying-independent']"))
	public static WebElement stayIndependent;
	
	@FindBy(how=How.XPATH,using=("//*[@class='hay-option__icon icon-about-you-keep-my-mind-sharp']"))
	public static WebElement mindSharp;
	
	@FindBy(how=How.XPATH,using=("//*[@class='hay-option__icon icon-about-you-more-active-social-life']"))
	public static WebElement socialLife;
	
	@FindBy(how=How.XPATH,using=("//*[@class='hay-option__icon icon-about-you-staying-young-looking']"))
	public static WebElement youngLook;

	@FindBy(how=How.XPATH,using=("//*[@class='hay-option__icon icon-about-you-there-for-my-kids-grandkids']"))
	public static WebElement forKids;
	
	@FindBy(how=How.XPATH,using=("//*[@class='hay-btn hay-btn--no-touch']"))
	public static WebElement Next5;
	
	@FindBy(how=How.XPATH,using=("//div[@id='hay-container-embedded']//div[2]/div/p[1]"))
	public static WebElement Part1Message;
	
	
	
	
}
