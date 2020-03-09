package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ResultPage {
	@FindBy(how=How.XPATH,using="//*[@class='hay-btn hay-btn--secondary hay-btn--secondary--no-touch']")
	public static WebElement noThanks;
	
	@FindBy(how=How.XPATH,using="//div[@id='hay-container-embedded']/div/div/div/div/div[1]/div")
	public static WebElement finalScore;
	
	@FindBy(how=How.XPATH,using="//div[@id='hay-container-embedded']/div/div/div/div/div[2]/div[1]/div[2]/p")
	public static WebElement scoreMoving;

	@FindBy(how=How.XPATH,using="//div[@id='hay-container-embedded']/div/div/div/div/div[2]/div[2]/div[2]/p")
	public static WebElement scoreEating;
	

	@FindBy(how=How.XPATH,using="//div[@id='hay-container-embedded']/div/div/div/div/div[2]/div[3]/div[2]/p")
	public static WebElement scoreDrinking;
	
	@FindBy(how=How.XPATH,using="//div[@id='hay-container-embedded']/div/div/div/div/div[2]/div[4]/div[2]/p")
	public static WebElement scoreSmoking;
	
//
}

