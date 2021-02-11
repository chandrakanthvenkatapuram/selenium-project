package modules;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


import pageobjects.AlcoholIntakePage;
import pageobjects.BaseClass;

public class AlcoholIntakeAction {

	public static void clickMostly() {
		//AlcoholIntakePage.mostWeeks.click();
		WebElement mostweeks = AlcoholIntakePage.mostWeeks;
		JavascriptExecutor executor = (JavascriptExecutor) BaseClass.driver;
		executor.executeScript("arguments[0].click();", mostweeks);
	}

	public static void clickTwoMonths() {
		//AlcoholIntakePage.twoMonths.click();
		WebElement twomonths = AlcoholIntakePage.twoMonths;
		JavascriptExecutor executor = (JavascriptExecutor) BaseClass.driver;
		executor.executeScript("arguments[0].click();", twomonths);
	}

	public static void clickOneMonth() {
		//AlcoholIntakePage.oneMonth.click();
		WebElement onemonth = AlcoholIntakePage.oneMonth;
		JavascriptExecutor executor = (JavascriptExecutor) BaseClass.driver;
		executor.executeScript("arguments[0].click();", onemonth);
	}

	public static void clickNever() {
		//AlcoholIntakePage.never.click();
		WebElement inever = AlcoholIntakePage.never;
		JavascriptExecutor executor = (JavascriptExecutor) BaseClass.driver;
		executor.executeScript("arguments[0].click();", inever);
	}

	public static void clicMonday() {
		//AlcoholIntakePage.monday.click();
		WebElement imonday = AlcoholIntakePage.monday;
		JavascriptExecutor executor = (JavascriptExecutor) BaseClass.driver;
		executor.executeScript("arguments[0].click();", imonday);
	}

	public static void clickTuesday() {
		//AlcoholIntakePage.tuesday.click();
		WebElement ituesday = AlcoholIntakePage.tuesday;
		JavascriptExecutor executor = (JavascriptExecutor) BaseClass.driver;
		executor.executeScript("arguments[0].click();", ituesday);
	}

	public static void clicWednesday() {
		//AlcoholIntakePage.wednesday.click();
		WebElement iwednesday = AlcoholIntakePage.wednesday;
		JavascriptExecutor executor = (JavascriptExecutor) BaseClass.driver;
		executor.executeScript("arguments[0].click();", iwednesday);
	}

	public static void clickThursday() {
		//AlcoholIntakePage.thursday.click();
		WebElement ithursday = AlcoholIntakePage.thursday;
		JavascriptExecutor executor = (JavascriptExecutor) BaseClass.driver;
		executor.executeScript("arguments[0].click();", ithursday);
	}

	public static void clickFriday() {
		//AlcoholIntakePage.friday.click();
		WebElement ifriday = AlcoholIntakePage.friday;
		JavascriptExecutor executor = (JavascriptExecutor) BaseClass.driver;
		executor.executeScript("arguments[0].click();", ifriday);
	}

	public static void clicSaturday() {
		//AlcoholIntakePage.saturday.click();
		WebElement isaturday = AlcoholIntakePage.saturday;
		JavascriptExecutor executor = (JavascriptExecutor) BaseClass.driver;
		executor.executeScript("arguments[0].click();", isaturday);
	}

	public static void clicSunday() {
		//AlcoholIntakePage.sunday.click();
		WebElement isunday = AlcoholIntakePage.sunday;
		JavascriptExecutor executor = (JavascriptExecutor) BaseClass.driver;
		executor.executeScript("arguments[0].click();", isunday);
	}

	public static void clickNext_AI() {
		//AlcoholIntakePage.next_DF.click();
		WebElement next_df = AlcoholIntakePage.next_DF;
		JavascriptExecutor executor = (JavascriptExecutor) BaseClass.driver;
		executor.executeScript("arguments[0].click();", next_df);
	}
	
	
	

	// *****************Drinks and Volumes*********************//
	// ############ WeekDays ################//
	/*public static void clickBeer4WD() {
		AlcoholIntakePage.beer4WD.click();
	}

	public static void clickBeer5WD() {
		AlcoholIntakePage.beer5WD.click();
	}

	public static void clickSpiritWD() {
		AlcoholIntakePage.spiritsWD.click();
	}

	public static void clickWineWD() {
		AlcoholIntakePage.wineWD.click();
	}
*/
	// **Volumes
	
	public static int SelectVolume(String vol)
	{
		int i;
		String vol1 = "10+";
		if(vol.equals(vol1))
	    i= 10;
		else 
		i = Integer.valueOf(vol);
		return i;
	}
	public static void clickBeer4VolWD(String vol) {
		
		
		//Select sel = new Select(AlcoholIntakePage.beer4VolWD);
		//sel.selectByValue(vol);
		
		int i = AlcoholIntakeAction.SelectVolume(vol);
		WebElement beer4WD = AlcoholIntakePage.beer4VolWD;
		for(int b = 1; b<=i; b++) 
			beer4WD.click();
	}

	public static void clickBeer5VolWD(String vol) {
		//Select sel = new Select(AlcoholIntakePage.beer5VolWD);
		//sel.selectByValue(vol);
		
		int i = AlcoholIntakeAction.SelectVolume(vol);
		WebElement beer5WD = AlcoholIntakePage.beer5VolWD;
		for(int b = 1; b<=i; b++) 
			beer5WD.click();
	}

	public static void clickSpiritVolWD(String vol) {
		//Select sel = new Select(AlcoholIntakePage.spiritsVolWD);
		//sel.selectByValue(vol);
		
		int i = AlcoholIntakeAction.SelectVolume(vol);
		WebElement spiritsWD = AlcoholIntakePage.spiritsVolWD;
		for(int b = 1; b<=i; b++) 
			spiritsWD.click();
	}

	public static void clickWineVolWD(String vol) {
		//Select sel = new Select(AlcoholIntakePage.wineVolWD);
		//sel.selectByValue(vol);
		
		int i = AlcoholIntakeAction.SelectVolume(vol);
		WebElement wineWD = AlcoholIntakePage.wineVolWD;
		for(int b = 1; b<=i; b++) 
			wineWD.click();
	}
	
	
	
	public static void clickBeer4VolOcc(String vol) {
		//Select sel = new Select(AlcoholIntakePage.beer4VolOcc);
       //sel.selectByValue(vol); 
		
		int i = AlcoholIntakeAction.SelectVolume(vol);
		WebElement beer4cc = AlcoholIntakePage.beer4VolOcc;
		for(int b = 1; b<=i; b++) 
			beer4cc.click();
	}

	public static void clickBeer5VolOcc(String vol) {
		//Select sel = new Select(AlcoholIntakePage.beer5VolOcc);
		//sel.selectByValue(vol);
		
		int i = AlcoholIntakeAction.SelectVolume(vol);
		WebElement beer5cc = AlcoholIntakePage.beer5VolOcc;
		for(int b = 1; b<=i; b++) 
			beer5cc.click();
	}

	public static void clickSpiritVolOcc(String vol) {
		//Select sel = new Select(AlcoholIntakePage.spiritsVolOcc);
		//sel.selectByValue(vol);
		
		int i = AlcoholIntakeAction.SelectVolume(vol);
		WebElement spiritscc = AlcoholIntakePage.spiritsVolOcc;
		for(int b = 1; b<=i; b++) 
			spiritscc.click();
	}

	public static void clickWineVolOcc(String vol) {
		//Select sel = new Select(AlcoholIntakePage.wineVolOcc);
		//sel.selectByValue(vol);
		
		int i = AlcoholIntakeAction.SelectVolume(vol);
		WebElement winecc = AlcoholIntakePage.wineVolOcc;
		for(int b = 1; b<=i; b++) 
			winecc.click();
	}


	// ########### Weekends ##################3
	/*public static void clickBeer4WE() {
		AlcoholIntakePage.beer4WE.click();
	}

	public static void clickBeer5WE() {
		AlcoholIntakePage.beer5WE.click();
	}

	public static void clickSpiritWE() {
		AlcoholIntakePage.spiritsWE.click();
	}

	public static void clickWineWE() {
		AlcoholIntakePage.wineWE.click();
	}
*/
	// **Volumes

	public static void clickBeer4VolWE(String vol) {
		//Select sel = new Select(AlcoholIntakePage.beer4VolWE);
		//sel.selectByValue(vol);
		
		int i = AlcoholIntakeAction.SelectVolume(vol);
		WebElement beer4WE = AlcoholIntakePage.beer4VolWE;
		for(int b = 1; b<=i; b++) 
			beer4WE.click();
	}

	public static void clickBeer5VolWE(String vol) {
		//Select sel = new Select(AlcoholIntakePage.beer5VolWE);
		//sel.selectByValue(vol);
		
		int i = AlcoholIntakeAction.SelectVolume(vol);
		WebElement beer5WE = AlcoholIntakePage.beer5VolWE;
		for(int b = 1; b<=i; b++) 
			beer5WE.click();
	}

	public static void clickSpiritVolWE(String vol) {
		//Select sel = new Select(AlcoholIntakePage.spiritsVolWE);
		//sel.selectByValue(vol);
		
		int i = AlcoholIntakeAction.SelectVolume(vol);
		WebElement spiritsWE = AlcoholIntakePage.spiritsVolWE;
		for(int b = 1; b<=i; b++) 
			spiritsWE.click();
	}

	public static void clickWineVolWE(String vol) {
		//Select sel = new Select(AlcoholIntakePage.wineVolWE);
		//sel.selectByValue(vol);
		
		int i = AlcoholIntakeAction.SelectVolume(vol);
		WebElement wineWE = AlcoholIntakePage.wineVolWE;
		for(int b = 1; b<=i; b++) 
			wineWE.click();
	}
	public static void clickNoToDrink()
	{
		//AlcoholIntakePage.noToDrink.click();
		WebElement notodrink = AlcoholIntakePage.noToDrink;
		JavascriptExecutor executor = (JavascriptExecutor) BaseClass.driver;
		executor.executeScript("arguments[0].click();", notodrink);
	}
	public static void clickLessMonthly()
	{
		//AlcoholIntakePage.lessMonth.click();
		WebElement lessmonth = AlcoholIntakePage.lessMonth;
		JavascriptExecutor executor = (JavascriptExecutor) BaseClass.driver;
		executor.executeScript("arguments[0].click();", lessmonth);
	}
	public static void clickMonthly()
	{
		//AlcoholIntakePage.monthly.click();
		WebElement imonthly = AlcoholIntakePage.monthly;
		JavascriptExecutor executor = (JavascriptExecutor) BaseClass.driver;
		executor.executeScript("arguments[0].click();", imonthly);
	}
	
	public void DaysDrink(String days) throws Throwable {
		JavascriptExecutor jse = (JavascriptExecutor) BaseClass.driver;
		String delim = ",";
		String[] options_days_list = days.split(delim);
		int len = options_days_list.length;
		for (int i = 0; i < len; i++) {
			if (options_days_list[i].equalsIgnoreCase("1"))
				AlcoholIntakeAction.clicMonday();
			else if (options_days_list[i].equalsIgnoreCase("2"))
				AlcoholIntakeAction.clickTuesday();
			else if (options_days_list[i].equalsIgnoreCase("3"))
				AlcoholIntakeAction.clicWednesday();
			else if (options_days_list[i].equalsIgnoreCase("4"))
				AlcoholIntakeAction.clickThursday();
			else if (options_days_list[i].equalsIgnoreCase("5"))
				AlcoholIntakeAction.clickFriday();
			else if (options_days_list[i].equalsIgnoreCase("6"))
				AlcoholIntakeAction.clicSaturday();
			else if (options_days_list[i].equalsIgnoreCase("7"))
				AlcoholIntakeAction.clicSunday();
			else

			jse.executeScript("window.scrollBy(0,250)", "");
			Thread.sleep(1000);
			
			

		}
		AlcoholIntakeAction.clickNext_AI();Thread.sleep(1000);

	}
}
