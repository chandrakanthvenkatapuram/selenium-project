package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AlcoholIntakePage {

	
	@FindBy(how=How.XPATH,using="//*[@class='hay-option__icon icon-drinking-yes']")
	public static WebElement mostWeeks;
			
	@FindBy(how=How.XPATH,using="//*[@class='hay-option__icon icon-drinking-yes-2-4-months']")
	public static WebElement twoMonths;
	
	@FindBy(how=How.XPATH,using="//*[@class='hay-option__icon icon-drinking-yes-monthly-or-less']")
	public static WebElement oneMonth;
	
	@FindBy(how=How.XPATH,using="//*[@class='hay-option__icon icon-drinking-no']")
	public static WebElement never;
	
	@FindBy(how=How.XPATH,using="//*[@class='hay-btn hay-btn--no-touch']")
	public static WebElement next_DF;
	
	//*********days***************//
	
	
	@FindBy(how=How.XPATH,using="//*[@class='hay-option__icon icon-drinking-yes-monday']")
	public static WebElement monday;	
	@FindBy(how=How.XPATH,using="//*[@class='hay-option__icon icon-drinking-yes-tuesday']")
	public static WebElement tuesday;	
	@FindBy(how=How.XPATH,using="//*[@class='hay-option__icon icon-drinking-yes-wednesday']")
	public static WebElement wednesday;	
	@FindBy(how=How.XPATH,using="//*[@class='hay-option__icon icon-drinking-yes-thursday']")
	public static WebElement thursday;	
	@FindBy(how=How.XPATH,using="//*[@class='hay-option__icon icon-drinking-yes-friday']")
	public static WebElement friday;	
	@FindBy(how=How.XPATH,using="//*[@class='hay-option__icon icon-drinking-yes-saturday']")
	public static WebElement saturday;	
	@FindBy(how=How.XPATH,using="//*[@class='hay-option__icon icon-drinking-yes-sunday']")
	public static WebElement sunday;
	
	
	//************Drink and Volume for a typical Weekday*******************//
	
/*	@FindBy(how=How.XPATH,using="//*[@class='hay-input-set'][1] /div/label/span[@class='hay-option__icon icon-drinking-yes-beer-pint']")
	public static WebElement beer4WD;
	@FindBy(how=How.XPATH,using="//*[@class='hay-input-set'][1] /div/label/span[@class='hay-option__icon icon-drinking-yes-beer-bottle']")
	public static WebElement beer5WD;
	@FindBy(how=How.XPATH,using="//*[@class='hay-input-set'][1] /div/label/span[@class='hay-option__icon icon-drinking-yes-spirits']")
	public static WebElement spiritsWD;
	@FindBy(how=How.XPATH,using="//*[@class='hay-input-set'][1] /div/label/span[@class='hay-option__icon icon-drinking-yes-wine']")
	public static WebElement wineWD;*/
	
	//########################################//
	
	//@FindBy(how=How.XPATH,using="//*[@id='input-23']")
	@FindBy(how=How.XPATH,using="//label[@for='input-23']/following-sibling::button[2]")
	public static WebElement beer4VolWD;
	//@FindBy(how=How.XPATH,using="//*[@id='input-24']")
	@FindBy(how=How.XPATH,using="//label[@for='input-24']/following-sibling::button[2]")
	public static WebElement beer5VolWD;
	//@FindBy(how=How.XPATH,using="//*[@id='input-25']")
	@FindBy(how=How.XPATH,using="//label[@for='input-25']/following-sibling::button[2]")
	public static WebElement spiritsVolWD;
	//@FindBy(how=How.XPATH,using="//*[@id='input-26']")
	@FindBy(how=How.XPATH,using="//label[@for='input-26']/following-sibling::button[2]")
	public static WebElement wineVolWD;
	
	
	//************Drink and Volume for a typical Weekend*******************//
	
	/*@FindBy(how=How.XPATH,using="//*[@class='hay-input-set'][2] /div/label/span[@class='hay-option__icon icon-drinking-yes-beer-pint']")
	public static WebElement beer4WE;
	@FindBy(how=How.XPATH,using="//*[@class='hay-input-set'][2] /div/label/span[@class='hay-option__icon icon-drinking-yes-beer-bottle']")
	public static WebElement beer5WE;
	@FindBy(how=How.XPATH,using="//*[@class='hay-input-set'][2] /div/label/span[@class='hay-option__icon icon-drinking-yes-spirits']")
	public static WebElement spiritsWE;
	@FindBy(how=How.XPATH,using="//*[@class='hay-input-set'][2] /div/label/span[@class='hay-option__icon icon-drinking-yes-wine']")
	public static WebElement wineWE;

*///########################################//

	//@FindBy(how=How.XPATH,using="//*[@id='input-38']")
	@FindBy(how=How.XPATH,using="//label[@for='input-38']/following-sibling::button[2]")
	public static WebElement beer4VolWE;
	//@FindBy(how=How.XPATH,using="//*[@id='input-39']")
	@FindBy(how=How.XPATH,using="//label[@for='input-39']/following-sibling::button[2]")
	public static WebElement beer5VolWE;
	//@FindBy(how=How.XPATH,using="//*[@id='input-40']")
	@FindBy(how=How.XPATH,using="//label[@for='input-40']/following-sibling::button[2]")
	public static WebElement spiritsVolWE;
	//@FindBy(how=How.XPATH,using="//*[@id='input-41']")
	@FindBy(how=How.XPATH,using="//label[@for='input-41']/following-sibling::button[2]")
	public static WebElement wineVolWE;
	
	
	
//########### WeekDays occasional volumes#####//
	

		
		
	    @FindBy(how=How.XPATH,using="//label[@for='input-42']/following-sibling::button[2]")
	    //@FindBy(how=How.XPATH,using="//body//div[@id='hay-container-embedded']//div//div//div//div//div[1]//input[1]")
		public static WebElement beer4VolOcc;
		//@FindBy(how=How.XPATH,using="//*[@id='input-43']")
		@FindBy(how=How.XPATH,using="//label[@for='input-43']/following-sibling::button[2]")
		public static WebElement beer5VolOcc;
		//@FindBy(how=How.XPATH,using="//*[@id='input-44']")
		@FindBy(how=How.XPATH,using="//label[@for='input-44']/following-sibling::button[2]")
		public static WebElement spiritsVolOcc;
		//@FindBy(how=How.XPATH,using="//*[@id='input-45']")
		@FindBy(how=How.XPATH,using="//label[@for='input-45']/following-sibling::button[2]")
		public static WebElement wineVolOcc;

//***********Additional Page***************

		@FindBy(how=How.XPATH,using="//*[@class='hay-option__icon icon-drinking-no']")
		public static WebElement noToDrink;
		//
		@FindBy(how=How.XPATH,using="//*[@class='hay-option__icon icon-drinking-yes-binge-less-than-monthly']")
		public static WebElement lessMonth;
		
		@FindBy(how=How.XPATH,using="//*[@class='hay-option__icon icon-drinking-yes-binge-monthly']")
		public static WebElement monthly;
		
		
		
}