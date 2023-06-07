package reusableComponents;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import testBase.TestBase;

public class TakeScreenShot extends TestBase{

public void testBStackTakeScreenShot() throws Exception{
SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyy HH-mm-ss");
Date date = new Date();
String actualDate = format.format(date);
String Path=System.getProperty("user.dir")+"/src/test/screenshot/Screenshot"+ actualDate + ".jpg";
this.takeSnapShot(driver, Path) ; 
}
/**
* This function will take screenshot
* @param webdriver
* @param fileWithPath
* @throws Exception
*/
public void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{
//Convert web driver object to TakeScreenshot
TakesScreenshot scrShot =((TakesScreenshot)webdriver);
//Call getScreenshotAs method to create image file
File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
//Move image file to new destination
File DestFile=new File(fileWithPath);
//Copy file at destination
FileUtils.copyFile(SrcFile, DestFile);
}
}