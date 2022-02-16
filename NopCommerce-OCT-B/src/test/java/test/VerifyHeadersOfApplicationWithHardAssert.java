package test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import base.Browser;
import pom.ComputerPage;
import pom.ElectronicsPage;
import pom.HomePage;
import utils.Utility;

public class VerifyHeadersOfApplicationWithHardAssert extends Browser
{
	 private WebDriver driver;
	   private HomePage homePage;
	   private ComputerPage computerPage;
	  private ElectronicsPage electronicsPage;
	  private int testID;
	  static ExtentTest test;
	  static ExtentHtmlReporter reporter;
	  @BeforeTest
	   @Parameters("browser")
	   public void launchBrowser(String browser)
	   {
		   System.out.println("browser");
			 
		   if(browser.equalsIgnoreCase("Chrome"))
		   {
			   driver = launchChromeBrowser();
		   }

		   if(browser.equalsIgnoreCase("Firefox"))
		   {
			   driver = launchFirefoxBrowser();
		   }

		// if(browser.equalsIgnoreCase("Opera"))
		// {
		//	 driver = launchOperaBrowser();
	    // }
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	   }
	   @BeforeClass
	   public void createPOMObject()
	   {

			  homePage = new HomePage(driver);
			  computerPage = new ComputerPage(driver);
		      electronicsPage = new ElectronicsPage(driver);
	   }
	   @BeforeMethod
	   public void loginToApplication()
	   {
		  System.out.println("login To Application");
		  driver.get("https://demo.nopcommerce.com/");
	   }
	   @Test
	   public void toVerifyComputersPageTab()
	   {
		  testID=101;
		  System.out.println("to Verify Computers Page Tab");
		  homePage.openComputersPage();
		  String url = driver.getCurrentUrl();
		  String title = driver.getTitle();
		  //expected is equals to actual the test PASS
		  //expected is not equals to actual the test FAIL
		  Assert.assertEquals(url, "https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		  Assert.assertEquals(title,"OrangeHRM");
		 
	    }
	   @Test
	   public void toVerifyElectronicsTab()
	      {
		   testID=102;
		    System.out.println("to Verify Report Tab");
		    homePage.openElectronicsPage();
		    String url = driver.getCurrentUrl();
			  String title = driver.getTitle();
			    Assert.assertEquals(url, "https://opensource-demo.orangehrmlive.com/index.php/dashboard");
			    Assert.assertEquals(title,"OrangeHRM");
	      }
	   @Test
	   public void toVerifyApparelTab()
	      {
		   testID=103;
		    System.out.println("verifyUserTab");
		    homePage.openApparelPage();
		    String url = driver.getCurrentUrl();
			  String title = driver.getTitle();
			  Assert.assertEquals(url, "https://opensource-demo.orangehrmlive.com/index.php/dashboard");
			    Assert.assertEquals(title,"OrangeHRM");
	      }
	   @Test
	   public void toVerifyDigitalDownloadsTab()
	      {
		   testID=104;
		    System.out.println("to Verify WorkShedule Tab");
		    homePage.openDigitalDownloadsPage();
		    String url = driver.getCurrentUrl();
			  String title = driver.getTitle();
			  Assert.assertEquals(url, "https://opensource-demo.orangehrmlive.com/index.php/dashboard");
			    Assert.assertEquals(title,"OrangeHRM");
	     }
	   @Test
	   public void toVerifyBooksTab()
	      {
		   testID=105;
		    System.out.println("to Verify Books Tab");
		    homePage.openBooksPage();
		    String url = driver.getCurrentUrl();
			  String title = driver.getTitle();
			  Assert.assertEquals(url, "https://opensource-demo.orangehrmlive.com/index.php/dashboard");
			    Assert.assertEquals(title,"OrangeHRM");
	     }
	   @Test
	   public void toVerifyJewelryTab()
	      {
		   testID=106;
		    System.out.println("to Verify Jewelry Tab");
		    homePage.openJewelryPage();
		    String url = driver.getCurrentUrl();
			  String title = driver.getTitle();
			  Assert.assertEquals(url, "https://opensource-demo.orangehrmlive.com/index.php/dashboard");
			    Assert.assertEquals(title,"OrangeHRM");
	     }
	   @Test
	   public void toVerifyGiftCardsTab()
	      {
		   testID=107;
		    System.out.println("to Verify GiftCards Tab");
		    homePage.openGiftCardsPage();
		    String url = driver.getCurrentUrl();
			  String title = driver.getTitle();
			  Assert.assertEquals(url, "https://opensource-demo.orangehrmlive.com/index.php/dashboard");
			    Assert.assertEquals(title,"OrangeHRM");
	     }
	   @Test
	   public void toVerifyComputersTab()
	      {
		   testID=108;
		    System.out.println("toVerifyComputersTab");
		    computerPage.openComputers();
		    String url = driver.getCurrentUrl();
			  String title = driver.getTitle();
		    Assert.assertEquals(url, "https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		    Assert.assertEquals(title,"OrangeHRM");
	      }
	   @Test
	   public void  toVerifyOpenDesktopsTab()
	      {
		   testID=109;
		    System.out.println("toVerifyOpenDesktopsTab");
		    computerPage.openDesktopsPage();
		    String url = driver.getCurrentUrl();
			  String title = driver.getTitle();
		    Assert.assertEquals(url, "https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		    Assert.assertEquals(title,"OrangeHRM");
	      }
	   @Test
	   public void toVerifyclickOnLenovoItemTab()
	      {
		   testID=110;
		    System.out.println("to Verify click On Lenovo Item Tab");
		    computerPage.clickOnLenovoItem();
		    String url = driver.getCurrentUrl();
			  String title = driver.getTitle();
		    Assert.assertEquals(url, "https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		    Assert.assertEquals(title,"OrangeHRM");
	      }
	   @Test
	   public void toVerifyclickOnAddToCartPage()
	      {
		   testID=111;
		    System.out.println("to Verify clickOnAddToCart Tab");
		    computerPage.clickOnAddToCart();
		    String url = driver.getCurrentUrl();
			  String title = driver.getTitle();
		    Assert.assertEquals(url, "https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		    Assert.assertEquals(title,"OrangeHRM");
	      }
	   @Test
	   public void toVerifyElectronicsPage()
	      {
		   testID=112;
		    System.out.println("to Verify open Electronics Tab");
		    electronicsPage.openElectronics();
		    String url = driver.getCurrentUrl();
			  String title = driver.getTitle();
		    Assert.assertEquals(url, "https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		    Assert.assertEquals(title,"OrangeHRM");
	      }
	   @Test
	   public void toVerifyCameraPhotoPage()
	      {
		   testID=113;
		    System.out.println("to Verify CameraPhoto Tab");
		    electronicsPage.openCameraPhotoPage();
		    String url = driver.getCurrentUrl();
			  String title = driver.getTitle();
		    Assert.assertEquals(url, "https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		    Assert.assertEquals(title,"OrangeHRM");
	      }
	   @Test
	   public void toVerifyclickOnNikonItemTab()
	      {
		   testID=114;
		    System.out.println("to Verify clickOnNikonItem Tab");
		    electronicsPage.clickOnNikonItem();
		    String url = driver.getCurrentUrl();
			  String title = driver.getTitle();
		    Assert.assertEquals(url, "https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		    Assert.assertEquals(title,"OrangeHRM");
	      }
	   @Test
	   public void toVerifyclickOnAddToCartTab()
	      {
		   testID=115;
		    System.out.println("to Verify clickOnAddToCart Tab");
		    electronicsPage.clickOnAddToCart();
		    String url = driver.getCurrentUrl();
			  String title = driver.getTitle();
		    Assert.assertEquals(url, "https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		    Assert.assertEquals(title,"OrangeHRM");
	      }
	   @AfterMethod
	   public void logoutFromApplication(ITestResult result) throws IOException
	   {
		   if(ITestResult.FAILURE == result.getStatus())
		   {
			   Utility.getScreenshot(driver, testID);
		   }
		    System.out.println("logout From Application");
		   
	   }
	   @AfterClass
	   public void clearPOMObject()
	   {
		    
		      homePage = null;
			  computerPage = null;
		      electronicsPage = null;
		    
	   }
	   @AfterTest
	   public void closedBrowser()
	   {
		    System.out.println("closedBrowser");
		    driver.quit();
		    driver = null;
		    System.gc();//to delete the object
       }
}
