package testBase;


import java.util.concurrent.TimeUnit;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HomePage;
import reusableComponents.Highlighter;
import reusableComponents.ObjectRepository;
import reusableComponents.PropertiesOperations;
import reusableComponents.TakeScreenShot;

public class TestBase extends ObjectRepository {


	public void LaunchBrowserAndNavigate() throws Exception {
		//Read prop file and get browser and url
		String Browser=PropertiesOperations.getPropertyValueByKey("Browser");
		String URL = PropertiesOperations.getPropertyValueByKey("URL");
		
		if(Browser.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(); 
			}
		else if(Browser.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if (Browser.equalsIgnoreCase("EDGE")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		driver.get(URL);
	}
	
	@BeforeMethod
	public void setup1() throws Exception {
		LaunchBrowserAndNavigate();
		homepage1 = new HomePage();
		TST = new TakeScreenShot();
		HighLight = new Highlighter();
	}
	
	
	@AfterMethod
	public void cleanUp() {
		driver.quit();
	}
}
