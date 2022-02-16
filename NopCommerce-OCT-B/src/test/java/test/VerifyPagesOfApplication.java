package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import pom.ComputerPage;
import pom.ElectronicsPage;
import pom.HomePage;


public class VerifyPagesOfApplication
{
	 private WebDriver driver;
	   private HomePage homePage;
	   private ComputerPage computerPage;
	  private ElectronicsPage electronicsPage;
	   
	   @BeforeClass
	   public void launchBrowser()
	   {
		  System.out.println("launch Browser");
		  System.setProperty("webdriver.chrome.driver", "E:\\Velocity software Testing Data\\software testing (Automation)\\selenium\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	   }
	   @BeforeMethod
	   public void loginToApplication()
	   {
		  System.out.println("login To Application");
		  driver.get("https://demo.nopcommerce.com/");
		 
		  homePage = new HomePage(driver);
		  computerPage = new ComputerPage(driver);
	      electronicsPage = new ElectronicsPage(driver);
	   }
	 
	   @Test
	   public void toVerifyElectronicsTab()
	      {
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
		    System.out.println("to Verify clickOnAddToCart Tab");
		    electronicsPage.clickOnAddToCart();
		    String url = driver.getCurrentUrl();
			  String title = driver.getTitle();
		    Assert.assertEquals(url, "https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		    Assert.assertEquals(title,"OrangeHRM");
	      }
	   @AfterMethod
	   public void logoutFromApplication()
	        {
		       System.out.println("logout From Application");
		      
	        }
	   @AfterClass
	   public void closedBrowser()
	       {
		      System.out.println("closedBrowser");
		      driver.quit();
	       }
	}
