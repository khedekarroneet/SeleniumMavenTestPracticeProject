package reusableComponents;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentSetup extends ObjectRepository{

	public static ExtentReports setupExtentReport() {
		
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyy HH-mm-ss");
		Date date = new Date();
		String actualDate = format.format(date);
		
		String reportPath=System.getProperty("user.dir")+"/target/ExecutionReport/ExecutionReport"+actualDate+".html";
		extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter(reportPath);
		
		extent.attachReporter(spark);
		
		spark.config().setDocumentTitle("Practice SeleniumTestNG With Extent Report");
		spark.config().setTheme(Theme.DARK);
		
		return extent;
	}
}
