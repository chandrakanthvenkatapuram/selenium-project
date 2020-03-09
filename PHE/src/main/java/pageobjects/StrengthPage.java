package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class StrengthPage {
	
	@FindBy(how=How.XPATH,using=("//form/div[1]/div/div[1]/div[2]/div/div[4]"))
	public static WebElement mondayStrength;
	
	@FindBy(how=How.XPATH,using=("//form/div[1]/div/div[2]/div/div/div[4]"))
	public static WebElement tuesdayStrength;
	
	
	@FindBy(how=How.XPATH,using=("//form/div[1]/div/div[3]/div/div/div[4]"))
	public static WebElement wednesdayStrength;
	
	
	@FindBy(how=How.XPATH,using=("//form/div[1]/div/div[4]/div/div/div[4]"))
	public static WebElement thursdayStrength;
	
	
	@FindBy(how=How.XPATH,using=("//form/div[1]/div/div[5]/div/div/div[4]"))
	public static WebElement fridayStrength;
	
	
	@FindBy(how=How.XPATH,using=("//form/div[1]/div/div[6]/div/div/div[4]"))
	public static WebElement saturdayStrength;
	
	
	@FindBy(how=How.XPATH,using=("//form/div[1]/div/div[7]/div/div/div[4]"))
	public static WebElement sundayStrength;
	
	@FindBy(how=How.XPATH,using=("//*[@class='hay-btn hay-btn--no-touch']"))
	public static WebElement next_St;
	

}
