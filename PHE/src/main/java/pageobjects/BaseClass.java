package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class BaseClass {
	public static WebDriver driver;
	public static boolean bResult;

	public BaseClass()
	{
		BaseClass.driver = driver;
		BaseClass.bResult = true;
	}
	
	public WebDriver getDriver()
	{
		return driver;
		
	}
	

}
