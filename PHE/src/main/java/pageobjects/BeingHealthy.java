package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BeingHealthy {
	
	@FindBy(how=How.XPATH,using="//*[@class='hay-option__icon icon-about-you-my-partner']")
	public static WebElement myPartner;
	
	@FindBy(how=How.XPATH,using="//*[@class='hay-option__icon icon-about-you-my-kids']")
	public static WebElement myKids;
	
	
	@FindBy(how=How.XPATH,using="//*[@class='hay-option__icon icon-about-you-my-parents']")
	public static WebElement myParents;

	@FindBy(how=How.XPATH,using="//*[@class='hay-option__icon icon-about-you-my-grand-children']")
	public static WebElement myGrandChildren;
	
	@FindBy(how=How.XPATH,using="//*[@class='hay-option__icon icon-about-you-my-close-friends']")
	public static WebElement myCloseFriends;

	@FindBy(how=How.XPATH,using="//*[@class='hay-option__icon icon-about-you-my-brother-sister']")
	public static WebElement myBrothersSisters;
	
	@FindBy(how=How.XPATH,using="//*[@class='hay-option__icon icon-about-you-my-pets']")
	public static WebElement myPets;	
	
	@FindBy(how=How.XPATH,using="//*[@class='hay-option__icon icon-about-you-depends-none']")
	public static WebElement none;	

	@FindBy(how=How.XPATH,using="//form/div[2]/button")
	public static WebElement next4;	
	
	
}
