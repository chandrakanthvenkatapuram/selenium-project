package modules;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import pageobjects.BaseClass;
import pageobjects.TakingCarePage;

public class TakeCareAction {
	public static void selectIDontHaveTime() {
		//TakingCarePage.iDontHaveTime.click();
        WebElement idontHavetime = TakingCarePage.iDontHaveTime;
		JavascriptExecutor executor = (JavascriptExecutor) BaseClass.driver;
		executor.executeScript("arguments[0].click();", idontHavetime);

	}

	public static void selectILookAfterOthers() {
		//TakingCarePage.iLookAfterOthers.click();
		WebElement ilookAfterOthers = TakingCarePage.iLookAfterOthers;
		JavascriptExecutor executor = (JavascriptExecutor) BaseClass.driver;
		executor.executeScript("arguments[0].click();", ilookAfterOthers);
	}

	public static void selectIDontKnowWhatToDo() {
		//TakingCarePage.iDontKnowWhatToDo.click();
		WebElement idontKnowWhatToDo = TakingCarePage.iDontKnowWhatToDo;
		JavascriptExecutor executor = (JavascriptExecutor) BaseClass.driver;
		executor.executeScript("arguments[0].click();", idontKnowWhatToDo);
	}

	public static void selectIDontHaveTheMoney() {
		//TakingCarePage.iDontHaveTheMoney.click();
		WebElement idontHaveTheMoney = TakingCarePage.iDontHaveTheMoney;
		JavascriptExecutor executor = (JavascriptExecutor) BaseClass.driver;
		executor.executeScript("arguments[0].click();", idontHaveTheMoney);

	}

	public static void selectIStartCantKeepUp() {
		//TakingCarePage.iStartCantKeepUp.click();
		WebElement istartCantKeepUp = TakingCarePage.iStartCantKeepUp;
		JavascriptExecutor executor = (JavascriptExecutor) BaseClass.driver;
		executor.executeScript("arguments[0].click();", istartCantKeepUp);
	}

	public static void selectIllDisabled() {
		//TakingCarePage.illDisabled.click();
		WebElement illdisabled = TakingCarePage.illDisabled;
		JavascriptExecutor executor = (JavascriptExecutor) BaseClass.driver;
		executor.executeScript("arguments[0].click();", illdisabled);
	}
	
	public static void selectITakeGoodCare() {
		//TakingCarePage.iTakeGoodCare.click();
		WebElement itakeGoodCare = TakingCarePage.iTakeGoodCare;
		JavascriptExecutor executor = (JavascriptExecutor) BaseClass.driver;
		executor.executeScript("arguments[0].click();", itakeGoodCare);
	}
	public static void clickNext() {
		TakingCarePage.next3.click();
		
	}
	public static void ValidateDisableMessage() {
		String DisableMessage = BaseClass.driver.findElement(By.xpath("//div[@id='hay-container-embedded']//div[2]/div/p[1]")).getText();
		String ValidMessage = "You've told us you have an illness or disability that makes taking care of yourself more difficult.";
		if(DisableMessage.contains(ValidMessage)) {
			System.out.println("validating disable message pass");
		}else {
			System.out.println("validating disable message fail");
		}	
}
}
