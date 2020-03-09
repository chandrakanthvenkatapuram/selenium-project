package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SmokePage {
	@FindBy(how=How.XPATH,using="//*[@class='hay-option__icon icon-smoking-yes']")
    public static WebElement everyday;
	
	@FindBy(how=How.XPATH,using="//*[@class='hay-option__icon icon-smoking-sometimes']")
    public static WebElement sometimes;
	
	@FindBy(how=How.XPATH,using="//*[@class='hay-option__icon icon-smoking-quit']")
    public static WebElement quit;
	
	@FindBy(how=How.XPATH,using="//*[@class='hay-option__icon icon-smoking-no']")
    public static WebElement neverHad;
	
	@FindBy(how=How.XPATH,using="//*[@class='hay-btn hay-btn--no-touch']")
    public static WebElement next_sm;
	
}
