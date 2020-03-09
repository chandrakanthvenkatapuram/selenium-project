package modules;

import org.openqa.selenium.By;

import pageobjects.BaseClass;
import pageobjects.TakingCarePage;

public class TakeCareAction {
	public static void selectIDontHaveTime() {
		TakingCarePage.iDontHaveTime.click();

	}

	public static void selectILookAfterOthers() {
		TakingCarePage.iLookAfterOthers.click();
	}

	public static void selectIDontKnowWhatToDo() {
		TakingCarePage.iDontKnowWhatToDo.click();
	}

	public static void selectIDontHaveTheMoney() {
		TakingCarePage.iDontHaveTheMoney.click();

	}

	public static void selectIStartCantKeepUp() {
		TakingCarePage.iStartCantKeepUp.click();
	}

	public static void selectIllDisabled() {
		TakingCarePage.illDisabled.click();
	}
	
	public static void selectITakeGoodCare() {
		TakingCarePage.iTakeGoodCare.click();
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
