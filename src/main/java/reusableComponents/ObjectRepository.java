package reusableComponents;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pages.HomePage;

public class ObjectRepository {
	
	public static WebDriver driver;
	public static HomePage homepage1;
	public static TakeScreenShot TST;
    public static Highlighter HighLight;
    public static ExtentReports extent;
    public static ExtentTest test;
}
