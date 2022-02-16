package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage 
{
	@FindBy (xpath = "(//a[text()='Computers '])[1]")
	private WebElement computers;
	
	@FindBy (xpath = "(//a[text()='Electronics '])[1]")
	private WebElement electronics;
	
	@FindBy (xpath = "(//a[text()='Apparel '])[1]")
	private WebElement apparel;
	
	@FindBy (xpath = "(//a[text()='Digital downloads '])[1]")
	private WebElement digitalDownloads;
	
	@FindBy (xpath = "(//a[text()='Books '])[1]")
	private WebElement books;
	
	@FindBy (xpath = "(//a[text()='Jewelry '])[1]")
	private WebElement Jewelry;
	
	@FindBy (xpath = "(//a[text()='Gift Cards '])[1]")
	private WebElement giftCards;
	
	private WebDriver driver;
	private  WebDriverWait wait ;
	private Actions actions;
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver = driver;
		//wait = new WebDriverWait(driver,10);
		 actions = new Actions(driver);
	}
	 public void openComputersPage()
	   {
		 wait = new WebDriverWait(driver,10);
		 wait.until(ExpectedConditions.visibilityOf(computers));
		 actions.moveToElement(computers).build().perform();
	   }
	   public void openElectronicsPage()
	   {
		 wait = new WebDriverWait(driver,10);
     	 wait.until(ExpectedConditions.visibilityOf(electronics));
     	actions.moveToElement(electronics)	.build().perform();
	   }
	   public void openApparelPage()
	   {
		 wait = new WebDriverWait(driver,20);
		 wait.until(ExpectedConditions.visibilityOf(apparel));
		 apparel.click();
	   }
	   public void openDigitalDownloadsPage()
	   {
		 wait = new WebDriverWait(driver,30);
		 wait.until(ExpectedConditions.visibilityOf(digitalDownloads));
		 digitalDownloads.click();
	   }
	   public void openBooksPage()
	   {
		  wait = new WebDriverWait(driver,30);
		  wait.until(ExpectedConditions.visibilityOf(books));
		  books.click();
	   }
	   public void openJewelryPage()
	   { 
		   wait = new WebDriverWait(driver,30);
		   wait.until(ExpectedConditions.visibilityOf(Jewelry));
		   Jewelry.click();
	   }
	   public void openGiftCardsPage()
	   { 
		   wait = new WebDriverWait(driver,30);
		   wait.until(ExpectedConditions.visibilityOf(giftCards));
		   giftCards.click();
	   }
}
