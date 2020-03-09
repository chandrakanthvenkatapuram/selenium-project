package modules;

import pageobjects.SmokePage;

public class SmokeAction {
	
	public static void selectEveryDay()
	{
		SmokePage.everyday.click();
		
	}
	
	public static void selectSometimes()
	{
		SmokePage.sometimes.click();
		}
	
	
	public static void selectQuit()
	{
		SmokePage.quit.click();
		}
	
	public static void selectNeverHad()
	{
		SmokePage.neverHad.click();
		}

	public static void clickNext_SM()
	{
		SmokePage.next_sm.click();
		}


}
