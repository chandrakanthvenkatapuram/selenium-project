package modules;

import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import pageobjects.BaseClass;
import pageobjects.ExercisePage;

public class ExerciseAction {

	public static void dragMonday(int stregth_list) {
		//ExercisePage.mondayExercise.sendKeys(Keys.SHIFT
		Actions move = new Actions(BaseClass.driver);//
		Action action = (Action) move.dragAndDropBy(ExercisePage.mondayExercise, stregth_list, 0).build();
		 action.perform();
		 
		
		    
		
	}
	
	public static void dragTuesday(int d) {
		Actions move = new Actions(BaseClass.driver);//
		Action action = (Action) move.dragAndDropBy(ExercisePage.tuesdayExercise, d, 0).build();
		action.perform();
		
		int width = ExercisePage.tuesdayExercise.getSize().getWidth();
System.out.println(width);
	    /*Actions act = new Actions(BaseClass.driver);
	    act.moveToElement(ExercisePage.tuesdayExercise).moveByOffset((width/2)-2, 0).click().perform();
	*/}

	public static void dragWednesday(int d) {
		Actions move = new Actions(BaseClass.driver);//
		Action action = (Action) move.dragAndDropBy(ExercisePage.wednesdayExercise, d, 0).build();
		action.perform();
	}

	public static void dragThursday(int d) {
		Actions move = new Actions(BaseClass.driver);//
		Action action = (Action) move.dragAndDropBy(ExercisePage.thursdayExercise, d, 0).build();
		action.perform();
	}

	public static void dragFriday(int d) {
		Actions move = new Actions(BaseClass.driver);//
		Action action = (Action) move.dragAndDropBy(ExercisePage.fridayExercise, d, 0).build();
		action.perform();
	}

	public static void dragSaturday(int d) {
		Actions move = new Actions(BaseClass.driver);//
		Action action = (Action) move.dragAndDropBy(ExercisePage.saturdayExercise, d, 0).build();
		action.perform();
	}

	public static void dragSunday(int d) {
		Actions move = new Actions(BaseClass.driver);//
		Action action = (Action) move.dragAndDropBy(ExercisePage.sundayExercise, d, 0).build();
		action.perform();
	}

	public static void clickNext_Ex() {
		ExercisePage.next_Ex.click();
	}

}
