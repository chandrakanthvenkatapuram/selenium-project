package modules;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;


import pageobjects.BaseClass;
import pageobjects.ResultPage;

public class ResultAction {

//	public static void validateMovingContent(String exMoving) {
//
//		String text1 = ResultPage.scoreMoving.getText();
//		System.out.println("Expected text-" + exMoving + "/n" + "ActualText-" + text1);
//		// assertEquals("Verify message", exMoving, text1);
//		if (text1.contains(exMoving)) {
//			Reporter.log("Content validation of Moving section is passed");
//			assertTrue("String Matched", true);
//		} else {
//			Reporter.log("Content validation of Moving section is failed");
//			assertTrue("String did not match", false);
//		}
//	}
//	public static void validateEatingContent(String exEating) {
//
//		String text1 = ResultPage.scoreEating.getAttribute("innerHTML").toString();
//		System.out.println("Expected text-" + exEating + "/n" + "ActualText-" + text1);
//		// assertEquals("Verify message", exMoving, text1);
//		if (text1.contains(exEating)) {
//			Reporter.log("Content validation of Moving section is passed");
//			assertTrue("String Matched", true);
//		} else {
//			Reporter.log("Content validation of Moving section is failed");
//			assertTrue("String did not match", false);
//		}
//	}
//	
//	public static void validateDrinkingContent(String exDrinking) {
//
//		String text1 = ResultPage.scoreDrinking.getText();
//		System.out.println("Expected text-" + exDrinking + "/n" + "ActualText-" + text1);
//		// assertEquals("Verify message", exMoving, text1);
//		if (text1.contains(exDrinking)) {
//			Reporter.log("Content validation of Moving section is passed");
//			assertTrue("String Matched", true);
//		} else {
//			Reporter.log("Content validation of Moving section is failed");
//			assertTrue("String did not match", false);
//		}
//	}
//	
//	
//	public static void validateSmokingContent(String exSmoking) {
//
//		String text1 = ResultPage.scoreSmoking.getText();
//		System.out.println("Expected text-" + exSmoking + "/n" + "ActualText-" + text1);
//		// assertEquals("Verify message", exMoving, text1);
//		if (text1.contains(exSmoking)) {
//			Reporter.log("Content validation of Moving section is passed");
//			assertTrue("String Matched", true);
//		} else {
//			Reporter.log("Content validation of Moving section is failed");
//			assertTrue("String did not match", false);
//		}
//	}
//
//	public static void clickNoThanks() {
//		JavascriptExecutor executor = (JavascriptExecutor)BaseClass.driver;
//		executor.executeScript("arguments[0].click();", ResultPage.noThanks);
//		//ResultPage.noThanks.click();
//	}
//
//	public static void findChild(String expScore) throws Exception {
//
//		String score = ResultPage.finalScore.getAttribute("class");
//		System.out.println(score + "=="+expScore);
//		if (score.substring(score.length() - 2).equalsIgnoreCase(expScore)) {
//			assertTrue("Score Matched", true);
//		}else {
//			assertTrue("Score Mismatch", false);
//		}
//		System.out.println("Score" + score);
//	}

}
