package modules;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import pageobjects.BaseClass;
import pageobjects.StrengthPage;

public class StrengthAction {

	public static void dragMonday(int stregth_list) {
		//StrengthPage.mondayStrength.sendKeys(Keys.SHIFT
		Actions move = new Actions(BaseClass.driver);//
		Action action = (Action) move.dragAndDropBy(StrengthPage.mondayStrength, stregth_list, 0).build();
		 action.perform();
		 
		
		    
		
	}
	
	public static void dragTuesday(int d) {
		Actions move = new Actions(BaseClass.driver);//
		Action action = (Action) move.dragAndDropBy(StrengthPage.tuesdayStrength, d, 0).build();
		action.perform();
	}

	public static void dragWednesday(int d) {
		Actions move = new Actions(BaseClass.driver);//
		Action action = (Action) move.dragAndDropBy(StrengthPage.wednesdayStrength, d, 0).build();
		action.perform();
	}

	public static void dragThursday(int d) {
		Actions move = new Actions(BaseClass.driver);//
		Action action = (Action) move.dragAndDropBy(StrengthPage.thursdayStrength, d, 0).build();
		action.perform();
	}

	public static void dragFriday(int d) {
		Actions move = new Actions(BaseClass.driver);//
		Action action = (Action) move.dragAndDropBy(StrengthPage.fridayStrength, d, 0).build();
		action.perform();
	}

	public static void dragSaturday(int d) {
		Actions move = new Actions(BaseClass.driver);//
		Action action = (Action) move.dragAndDropBy(StrengthPage.saturdayStrength, d, 0).build();
		action.perform();
	}

	public static void dragSunday(int d) {
		Actions move = new Actions(BaseClass.driver);//
		Action action = (Action) move.dragAndDropBy(StrengthPage.sundayStrength, d, 0).build();
		action.perform();
	}

	public static void clickNext_St() {
		StrengthPage.next_St.click();
	}

}
