package modules;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import pageobjects.BaseClass;
import pageobjects.FruitsChoicesPage;
import pageobjects.HealthPriorties;

public class HealthPrioritiesAction {
	public static void selectFittingJeans()
	{
		//HealthPriorties.fittingJeans.click();
		WebElement fittingjeans = HealthPriorties.fittingJeans;
		JavascriptExecutor executor = (JavascriptExecutor) BaseClass.driver;
		executor.executeScript("arguments[0].click();", fittingjeans);
	}
	
	public static void selectMorweEnergy()
	{
		//HealthPriorties.moreEnergy.click();
		WebElement moreenergy = HealthPriorties.moreEnergy;
		JavascriptExecutor executor = (JavascriptExecutor) BaseClass.driver;
		executor.executeScript("arguments[0].click();", moreenergy);
	}
	
	public static void selectAchespain()
	{
		//HealthPriorties.achesPain.click();
		WebElement achespain = HealthPriorties.achesPain;
		JavascriptExecutor executor = (JavascriptExecutor) BaseClass.driver;
		executor.executeScript("arguments[0].click();", achespain);
	}
	public static void selectFeelingYoung()
	{
		//HealthPriorties.feelingYoung.click();
		WebElement feelingyoung = HealthPriorties.feelingYoung;
		JavascriptExecutor executor = (JavascriptExecutor) BaseClass.driver;
		executor.executeScript("arguments[0].click();", feelingyoung);
	}
	
	public static void selectStayIndependent()
	{
		//HealthPriorties.stayIndependent.click();
		WebElement stayindependent = HealthPriorties.stayIndependent;
		JavascriptExecutor executor = (JavascriptExecutor) BaseClass.driver;
		executor.executeScript("arguments[0].click();", stayindependent);
	}
	
	public static void selectMindSharp()
	{
		//HealthPriorties.mindSharp.click();
		WebElement mindsharp = HealthPriorties.mindSharp;
		JavascriptExecutor executor = (JavascriptExecutor) BaseClass.driver;
		executor.executeScript("arguments[0].click();", mindsharp);
	}
	
	public static void selectSocialLife()
	{
		//HealthPriorties.socialLife.click();
		WebElement sociallife = HealthPriorties.socialLife;
		JavascriptExecutor executor = (JavascriptExecutor) BaseClass.driver;
		executor.executeScript("arguments[0].click();", sociallife);
	}
	public static void selectYoungLooking()
	{
		//HealthPriorties.youngLook.click();
		WebElement younglook = HealthPriorties.youngLook;
		JavascriptExecutor executor = (JavascriptExecutor) BaseClass.driver;
		executor.executeScript("arguments[0].click();", younglook);
	}
	public static void selectForKids()
	{
		//HealthPriorties.forKids.click();
		WebElement forkids = HealthPriorties.forKids;
		JavascriptExecutor executor = (JavascriptExecutor) BaseClass.driver;
		executor.executeScript("arguments[0].click();", forkids);
	}
	
	public static void clickNextPage()
	{
		//HealthPriorties.Next5.click();
		WebElement next5 = HealthPriorties.Next5;
		JavascriptExecutor executor = (JavascriptExecutor) BaseClass.driver;
		executor.executeScript("arguments[0].click();", next5);
	}
	
	
	
	
	
	
	
	
	
	

}
