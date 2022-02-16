package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.ComputerPage;
import pom.ElectronicsPage;
import pom.HomePage;


public class TestClass1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Velocity software Testing Data\\software testing (Automation)\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demo.nopcommerce.com/");
		
		HomePage homePage = new HomePage(driver);
		homePage.openComputersPage();
		homePage.openElectronicsPage();
		homePage.openApparelPage();
		homePage.openDigitalDownloadsPage();
		homePage.openBooksPage();
		homePage.openJewelryPage();
		homePage.openGiftCardsPage();
		
		ComputerPage computerPage = new ComputerPage(driver);
		computerPage.openComputers();
		computerPage.openDesktopsPage();
		computerPage.clickOnLenovoItem();
		computerPage.clickOnAddToCart();
		
		ElectronicsPage electronicsPage =new ElectronicsPage(driver);
		electronicsPage.openElectronics();
		electronicsPage.openCameraPhotoPage();
		electronicsPage.clickOnNikonItem();
		electronicsPage.clickOnAddToCart();
	}
}
