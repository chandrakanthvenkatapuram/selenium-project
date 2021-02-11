package modules;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import Helpers.Report;
import pageobjects.BaseClass;
import pageobjects.BeingHealthy;

public class BeingHealthyAction {
	


	public static void selectMyPartner()
	{
		//BeingHealthy.myPartner.click();
		WebElement mypartner = BeingHealthy.myPartner;
		JavascriptExecutor executor = (JavascriptExecutor) BaseClass.driver;
		executor.executeScript("arguments[0].click();", mypartner);
	}
	
	public static void selectMyKids()
	{
		//BeingHealthy.myKids.click();
		WebElement mykids = BeingHealthy.myKids;
		JavascriptExecutor executor = (JavascriptExecutor) BaseClass.driver;
		executor.executeScript("arguments[0].click();", mykids);
	}
	public static void selectMyParents()
	{
		//BeingHealthy.myParents.click();
		WebElement myparents = BeingHealthy.myParents;
		JavascriptExecutor executor = (JavascriptExecutor) BaseClass.driver;
		executor.executeScript("arguments[0].click();", myparents);
	}
	public static void selectMyGrandChildren()
	{
		//BeingHealthy.myGrandChildren.click();
		WebElement mygrandchildren = BeingHealthy.myGrandChildren;
		JavascriptExecutor executor = (JavascriptExecutor) BaseClass.driver;
		executor.executeScript("arguments[0].click();", mygrandchildren);
	}
	public static void selectMyBrotherSister()
	{
		//BeingHealthy.myBrothersSisters.click();
		WebElement mybrotherssisters = BeingHealthy.myBrothersSisters;
		JavascriptExecutor executor = (JavascriptExecutor) BaseClass.driver;
		executor.executeScript("arguments[0].click();", mybrotherssisters);
	}
	public static void selectMyCloseFriends()
	{
		//BeingHealthy.myCloseFriends.click();
		WebElement myclosefriends = BeingHealthy.myCloseFriends;
		JavascriptExecutor executor = (JavascriptExecutor) BaseClass.driver;
		executor.executeScript("arguments[0].click();", myclosefriends);
	}
	public static void selectMyPets()
	{
		//BeingHealthy.myPets.click();
		WebElement mypets = BeingHealthy.myPets;
		JavascriptExecutor executor = (JavascriptExecutor) BaseClass.driver;
		executor.executeScript("arguments[0].click();", mypets);
	}
	public static void selectNone()
	{
		//BeingHealthy.none.click();
		WebElement mynone = BeingHealthy.none;
		JavascriptExecutor executor = (JavascriptExecutor) BaseClass.driver;
		executor.executeScript("arguments[0].click();", mynone);
	}
	
	
	
	
	
}
