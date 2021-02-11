package modules;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import pageobjects.BaseClass;
import pageobjects.NonVegChoicesPages;
import pageobjects.SmokePage;

public class SmokeAction {
	
	public static void selectEveryDay()
	{
		//SmokePage.everyday.click();
		WebElement Everyday = SmokePage.everyday;
		JavascriptExecutor executor = (JavascriptExecutor) BaseClass.driver;
		executor.executeScript("arguments[0].click();", Everyday);
		
	}
	
	public static void selectSometimes()
	{
		//SmokePage.sometimes.click();
		WebElement Sometimes = SmokePage.sometimes;
		JavascriptExecutor executor = (JavascriptExecutor) BaseClass.driver;
		executor.executeScript("arguments[0].click();", Sometimes);
	}
	
	
	public static void selectQuit()
	{
		//SmokePage.quit.click();
		WebElement Quit = SmokePage.quit;
		JavascriptExecutor executor = (JavascriptExecutor) BaseClass.driver;
		executor.executeScript("arguments[0].click();", Quit);
	}
	
	public static void selectNeverHad()
	{
		//SmokePage.neverHad.click();
		WebElement neverhad = SmokePage.neverHad;
		JavascriptExecutor executor = (JavascriptExecutor) BaseClass.driver;
		executor.executeScript("arguments[0].click();", neverhad);
	}

	public static void clickNext_SM()
	{
		//SmokePage.next_sm.click();
		WebElement next_SM = SmokePage.next_sm;
		JavascriptExecutor executor = (JavascriptExecutor) BaseClass.driver;
		executor.executeScript("arguments[0].click();", next_SM);
	}


}
