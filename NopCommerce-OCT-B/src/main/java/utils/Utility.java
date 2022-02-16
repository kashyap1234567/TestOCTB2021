package utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	 public static void getScreenshot(WebDriver driver,int testID) throws IOException
	  {
		    //Screenshot code
		  
		
		    File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH mm ss");  
		    Date date = new Date();  
		    String stamp = formatter.format(date);  
		    File dest = new File("E:\\Velocity software Testing Data\\software testing (Automation)\\selenium\\New folder\\test-"+testID  +stamp+".jpg");
		    FileHandler.copy(src, dest);
		  
	  }
}
