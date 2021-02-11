package modules;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import pageobjects.BaseClass;
import pageobjects.OneYouLandingPage;

public class OneYouLand {

	/********** Getter Functions **************/

	public static void clickNext() {
		WebElement Next1 = BaseClass.driver.findElement(By.xpath("//button[text()='Next']"));
		JavascriptExecutor executor = (JavascriptExecutor)BaseClass.driver;
		executor.executeScript("arguments[0].click();", Next1);
		//OneYouLandingPage.next1.click();
	}
	
	public static void AcceptCookies() throws InterruptedException {
		WebElement CookiesElE = BaseClass.driver.findElement(By.xpath("//button[@id='nhsuk-cookie-banner__link_accept_analytics']"));
		WebElement CloseElE = BaseClass.driver.findElement(By.xpath("//p[@id=\"nhsuk-success-banner__message\"]/a[2]"));
		
		JavascriptExecutor executor = (JavascriptExecutor)BaseClass.driver;
		executor.executeScript("arguments[0].click();", CookiesElE);
		JavascriptExecutor executorclose = (JavascriptExecutor)BaseClass.driver;
		executorclose.executeScript("window.scrollBy(0,250)", "");
		executorclose.executeScript("arguments[0].click();", CloseElE);
	}
	
	public static void clickStartQuiz() throws InterruptedException {
		WebElement StartQuizElE = BaseClass.driver.findElement(By.xpath("//a[text()='Start Quiz']"));
		JavascriptExecutor executor = (JavascriptExecutor)BaseClass.driver;
		executor.executeScript("arguments[0].click();", StartQuizElE);
		//OneYouLandingPage.startQuiz.click();
	}

	public static void enterFirstName(String fname) throws InterruptedException {
		// System.out.println("Return Fname");
		//Thread.sleep(3000);
		OneYouLandingPage.firstName.sendKeys(fname);
	}

	public static void selectFemale() {
		OneYouLandingPage.genderF.click();
	}

	public static void selectMale() {
		OneYouLandingPage.genderM.click();
	}

	public static void enterAge(String age) {
		OneYouLandingPage.age.sendKeys(age);
	}
	
}
