package Helpers;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Augmenter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import pageobjects.BaseClass;

public class Report extends BaseClass{
	
	public static ExtentHtmlReporter reporthtml;
	public static ExtentReports extent;
	public static ExtentTest logger;
	
	public void reportInitiate() {
		String DirPath  = System.getProperty("user.dir");
		String ReportPath = DirPath + "\\Reports\\HowAreYou_TestReport.html";
		reporthtml = new ExtentHtmlReporter(ReportPath);
		extent = new ExtentReports();
		extent.attachReporter(reporthtml);

	}
	
	public void reportCreator(String RepName) {		
		logger = extent.createTest(RepName);
	}
	
	public void LogStepPass(String StepDes) {		
		logger.log(Status.PASS, StepDes);
	}
	
	public void LogStepFail(String StepDes) {		
		logger.log(Status.FAIL, StepDes);
		
	}
	
	public void LogStepInfo(String StepDes) {		
		logger.log(Status.INFO, StepDes);
	}
	
	public void ReportEnd() {		
		extent.flush();	;
	}

	public String captureScreen() {
	    String path="";
//	    try {
//	        WebDriver augmentedDriver = new Augmenter().augment(driver);
//	        byte[] screenshot = ((TakesScreenshot)augmentedDriver).getScreenshotAs(OutputType.BYTES);
//	        path = "./target/screenshots/" + screenshot.length;
//	        FileUtils.copyURLToFile(screenshot, new File(path)); 
//	    }
//	    catch(IOException e) {
//	        path = "Failed to capture screenshot: " + e.getMessage();
//	    }
	    return path;
	}
}
