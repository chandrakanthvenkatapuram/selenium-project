package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ExercisePage {
	
	//@FindBy(how=How.XPATH,using=("//form/div[1]/div/div[1]/div[2]/div/div[4]"))
	@FindBy(how=How.XPATH,using=("//form//div//div[1]//div[1]//div[1]//div[4]"))
	public static WebElement mondayExercise;
	
	
	//@FindBy(how=How.XPATH,using=("//form/div[1]/div/div[2]/div/div/div[4]"))
	@FindBy(how=How.XPATH,using=("//form//div//div//div[2]//div[1]//div[1]//div[4]"))
	public static WebElement tuesdayExercise;
	
	
	//@FindBy(how=How.XPATH,using=("//form/div[1]/div/div[3]/div/div/div[4]"))
	@FindBy(how=How.XPATH,using=("//form//div//div//div[3]//div[1]//div[1]//div[4]"))
	public static WebElement wednesdayExercise;
	
	
	//@FindBy(how=How.XPATH,using=("//form/div[1]/div/div[4]/div/div/div[4]"))
	@FindBy(how=How.XPATH,using=("//form//div//div//div[4]//div[1]//div[1]//div[4]"))
	public static WebElement thursdayExercise;
	
	
	//@FindBy(how=How.XPATH,using=("//form/div[1]/div/div[5]/div/div/div[4]"))
	@FindBy(how=How.XPATH,using=("//form//div//div//div[5]//div[1]//div[1]//div[4]"))
	public static WebElement fridayExercise;
	
	
	//@FindBy(how=How.XPATH,using=("//form/div[1]/div/div[6]/div/div/div[4]"))
	@FindBy(how=How.XPATH,using=("//form//div//div//div[6]//div[1]//div[1]//div[4]"))
	public static WebElement saturdayExercise;
	
	
	//@FindBy(how=How.XPATH,using=("//form/div[1]/div/div[7]/div/div/div[4]"))
	@FindBy(how=How.XPATH,using=("//form//div//div//div[7]//div[1]//div[1]//div[4]"))
	public static WebElement sundayExercise;
	
	@FindBy(how=How.XPATH,using=("//*[@class='hay-btn hay-btn--no-touch']"))
	public static WebElement next_Ex;
	

}
