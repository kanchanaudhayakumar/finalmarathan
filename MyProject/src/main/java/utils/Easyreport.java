package utils;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class Easyreport {

	
		// TODO Auto-generated method stub
		public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub
			
			ExtentHtmlReporter reporter = new ExtentHtmlReporter("./report/result2.html");
			// to keep the report history
			//reporter.setAppendExisting(true);
			// Create object for ExtentReports
			ExtentReports extent = new ExtentReports();
			// attach data with physical path
			extent.attachReporter(reporter);
			// Create a test case and assign the test detail
			// testname //test description
			ExtentTest test = extent.createTest("just ticket"," Easy ticket with positive credentials");
			test.assignCategory("Smoke");
			test.assignAuthor("kanchana");
			
			//step 
			test.pass("Easy ticket",MediaEntityBuilder.createScreenCaptureFromPath(".././snap/home screen.png").build());
			test.pass("film choose",MediaEntityBuilder.createScreenCaptureFromPath(".././snap/home screen 2.png").build());
			test.fail("no input");
			
			
			extent.flush();
			
			
	}

}
