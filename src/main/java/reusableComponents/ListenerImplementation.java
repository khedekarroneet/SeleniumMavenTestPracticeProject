package reusableComponents;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;



public class ListenerImplementation extends ObjectRepository implements ITestListener {

	public void onTestStart(ITestResult result) {
		test = extent.createTest(result.getMethod().getMethodName());
	}

	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "Test Case:"+result.getMethod().getMethodName()+" is Passed.");
//		test.log(Status.PASS,result.getMethod().)
	}

	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, "Test Case:"+result.getMethod().getMethodName()+" is Failed.");	
		test.log(Status.FAIL, result.getThrowable());
		//add screenshot for failed test.
				File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyy HH-mm-ss");
				Date date = new Date();
				String actualDate = format.format(date);
				
				String screenshotPath = System.getProperty("user.dir")+
						"/Reports/Screenshots/"+actualDate+".jpeg";
				File dest = new File(screenshotPath);
				
				try {
					FileUtils.copyFile(src, dest);
				} catch (IOException e) {
					e.printStackTrace();
				}
				try {
					test.addScreenCaptureFromPath(screenshotPath, "Test case failure screenshot");
				} catch (Exception e) {
					e.printStackTrace();
				}
				
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		extent = ExtentSetup.setupExtentReport();
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		extent.flush();
	}
	   	
}
