package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OneYouLandingPage extends BaseClass {

	public OneYouLandingPage() {
		super();
	}
	
	@FindBy(how=How.XPATH, using="//*[@id='input1']")
	public static WebElement firstName;
	
	@FindBy(how=How.XPATH, using="//*[@class='hay-option__icon icon-about-you-female']")
	public static WebElement genderF;
	
	@FindBy(how=How.XPATH, using="//*[@class='hay-option__icon icon-about-you-male']")
	public static WebElement genderM;
	
	@FindBy(how=How.XPATH, using="//*[@id='input3' and @class='hay-input hay-input__number']")
	public static WebElement age;

	@FindBy(how=How.XPATH, using="//button[text()='Next']")
	public static WebElement next1;
	
	
	
	
	
}
