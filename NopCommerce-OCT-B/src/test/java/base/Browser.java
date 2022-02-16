package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser 
{
	 public static WebDriver launchChromeBrowser()
	 {

		  System.setProperty("webdriver.chrome.driver", "E:\\Velocity software Testing Data\\software testing (Automation)\\selenium\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();  
		  return driver;
	 }
	 public static WebDriver launchFirefoxBrowser()
	 {
		   System.setProperty("webdriver.gecko.driver","E:\\Velocity software Testing Data\\software testing (Automation)\\selenium\\geckodriver.exe");
		   WebDriver driver = new FirefoxDriver();  
		   return driver;
	 }
	// public static WebDriver launchOperaBrowser()
	// {

		//  System.setProperty("webdriver.Opera.driver", "E:\\Velocity software Testing Data\\software testing (Automation)\\selenium\\Operadriver.exe");
		//  WebDriver  driver = new OperaDriver();  
		//  return driver;
	 //}
}
