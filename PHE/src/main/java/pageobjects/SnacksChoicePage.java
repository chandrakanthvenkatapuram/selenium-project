package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SnacksChoicePage {
	
	@FindBy(how=How.XPATH,using="//*[@class='hay-option__icon icon-eating-snacks-fruit']")
	public static WebElement fruit;
	@FindBy(how=How.XPATH,using="//*[@class='hay-option__icon icon-eating-snacks-chocolate']")
	public static WebElement chocolate;
	@FindBy(how=How.XPATH,using="//*[@class='hay-option__icon icon-eating-snacks-crisps']")
	public static WebElement crisp;
	@FindBy(how=How.XPATH,using="//*[@class='hay-option__icon icon-eating-snacks-cakes']")
	public static WebElement cakes;
	@FindBy(how=How.XPATH,using="//*[@class='hay-option__icon icon-eating-snacks-biscuits']")
	public static WebElement biscuits;
	@FindBy(how=How.XPATH,using="//*[@class='hay-option__icon icon-eating-snacks-teacakes']")
	public static WebElement teaCakes;
	@FindBy(how=How.XPATH,using="//*[@class='hay-option__icon icon-eating-snacks-unsaltednuts']")
	public static WebElement nuts;
	@FindBy(how=How.XPATH,using="//*[@class='hay-option__icon icon-eating-snacks-lowfatspread']")
	public static WebElement toast;
	@FindBy(how=How.XPATH,using="//*[@class='hay-option__icon icon-smoking-no']")
	public static WebElement none;
	@FindBy(how=How.XPATH,using="//*[@class='hay-btn hay-btn--no-touch']")
	public static WebElement next_SC;

}
