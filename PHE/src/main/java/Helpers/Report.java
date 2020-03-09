package Helpers;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Report {
	
	public static ExtentHtmlReporter reporthtml;
	public static ExtentReports extent;
	public static ExtentTest logger;
	
	public void reportInitiate() {
		reporthtml = new ExtentHtmlReporter("C:\\ETesting\\PHE\\PHE_HowAreYou\\Reports\\Extent.html");
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
	
	public void LogStepOnfo(String StepDes) {		
		logger.log(Status.INFO, StepDes);
	}
	
	public void ReportEnd() {		
		extent.flush();	;
	}


}
