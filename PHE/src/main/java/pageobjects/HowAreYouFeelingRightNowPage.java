package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HowAreYouFeelingRightNowPage extends BaseClass {

	String LreallyKnackered = "//form/div[1]/div/div[1]/div/div/div[4]";
	String canRunForMiles = "//form/div[1]/div/div[2]/div/div/div[4]";
	String feelingCalm = "//form/div[1]/div/div[3]/div/div/div[4]";
	String sleeplessNights = "//form/div[1]/div/div[4]/div/div/div[4]";
	String leanMean = "//form/div[1]/div/div[5]/div/div/div[4]";
	String downDumps = "//form/div[1]/div/div[6]/div/div/div[4]";

	 
	public void dragReallyKnackered(int d)
	{
		WebElement Rknac = BaseClass.driver.findElement(By.xpath(LreallyKnackered));
//		System.out.println("attribute "+Rknac.getAttribute("style"));
//		System.out.println("d dragReallyKnackered vlaue is -"+d);
		JavascriptExecutor js = (JavascriptExecutor) BaseClass.driver; 
		//String arg = "arguments[0].setAttribute('style', 'left: "+d+"%;')";
		String arg = "arguments[0].setAttribute('style', 'left: "+d+"%; right: auto; transform: translateX(-50%);')";
//		System.out.println("attribute - "+arg);
		js.executeScript(arg, Rknac);

				
	}
	public void dragCanRunForMiles(int d)
	{
		WebElement EleRunForMiles = BaseClass.driver.findElement(By.xpath(canRunForMiles));
		//System.out.println("d vlaue is -"+d);
		JavascriptExecutor js = (JavascriptExecutor) BaseClass.driver; 
		//String arg = "arguments[0].setAttribute('style', 'left: "+d+"%;')";
		String arg = "arguments[0].setAttribute('style', 'left: "+d+"%; right: auto; transform: translateX(-50%);')";
		js.executeScript(arg, EleRunForMiles);
				
	}
	public void dragFeelingCalm(int d)
	{
		WebElement ElefeelingCalm = BaseClass.driver.findElement(By.xpath(feelingCalm));
		//System.out.println("d feelingCalm vlaue is -"+d);
		JavascriptExecutor js = (JavascriptExecutor) BaseClass.driver; 
		//String arg = "arguments[0].setAttribute('style', 'left: "+d+"%;')";
		String arg = "arguments[0].setAttribute('style', 'left: "+d+"%; right: auto; transform: translateX(-50%);')";
		js.executeScript(arg, ElefeelingCalm);
				
	}
	
	public void dragSleeplessNights(int d)
	{
		WebElement ElesleeplessNights = BaseClass.driver.findElement(By.xpath(sleeplessNights));
		//System.out.println("d feelingCalm vlaue is -"+d);
		JavascriptExecutor js = (JavascriptExecutor) BaseClass.driver; 
		//String arg = "arguments[0].setAttribute('style', 'left: "+d+"%;')";
		String arg = "arguments[0].setAttribute('style', 'left: "+d+"%; right: auto; transform: translateX(-50%);')";
		js.executeScript(arg, ElesleeplessNights);

	}
	public void dragLeanMean(int d)
	{
		WebElement EleleanMean = BaseClass.driver.findElement(By.xpath(leanMean));
		//System.out.println("d leanMean vlaue is -"+d);
		JavascriptExecutor js = (JavascriptExecutor) BaseClass.driver; 
		//String arg = "arguments[0].setAttribute('style', 'left: "+d+"%;')";
		String arg = "arguments[0].setAttribute('style', 'left: "+d+"%; right: auto; transform: translateX(-50%);')";
		js.executeScript(arg, EleleanMean);

		
	}
	public void dragDownDumps(int d)
	{
		WebElement EledownDumps = BaseClass.driver.findElement(By.xpath(downDumps));
		//System.out.println("d downDumps vlaue is -"+d);
		JavascriptExecutor js = (JavascriptExecutor) BaseClass.driver; 
		//String arg = "arguments[0].setAttribute('style', 'left: "+d+"%;')";
		String arg = "arguments[0].setAttribute('style', 'left: "+d+"%; right: auto; transform: translateX(-50%);')";
		js.executeScript(arg, EledownDumps);

		
	}
}
