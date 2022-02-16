package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ComputerPage 
{
	@FindBy (xpath = "(//a[text()='Computers '])[1]")
	private WebElement computers;
	
	@FindBy (xpath = "//img[@alt='Picture for category Desktops']")
	private WebElement desktops;
	
	@FindBy (xpath = "(//img[@alt='Picture of Lenovo IdeaCentre 600 All-in-One PC'])[1]")
	private WebElement lenovo;
	
	@FindBy (xpath = "//button[@id='add-to-cart-button-3']")
	private WebElement addToCart;
	
	
	private WebDriver driver;
	private  WebDriverWait wait ;
	private Actions actions;
	public ComputerPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver = driver;
		//wait = new WebDriverWait(driver,10);
		 actions = new Actions(driver);
	}
	 public void openComputers()
	   {
		 wait = new WebDriverWait(driver,10);
		 wait.until(ExpectedConditions.visibilityOf(computers));
		 actions.moveToElement(computers).click().build().perform();
	   }
	 public void openDesktopsPage()
	   {
		 wait = new WebDriverWait(driver,10);
		 wait.until(ExpectedConditions.visibilityOf(desktops));
		 actions.moveToElement(desktops).click().build().perform();
	   }
	   public void clickOnLenovoItem()
	   {
		 wait = new WebDriverWait(driver,10);
     	 wait.until(ExpectedConditions.visibilityOf(lenovo));
     	actions.moveToElement(lenovo).click().perform();
	   }
	   public void clickOnAddToCart()
	   {
		 wait = new WebDriverWait(driver,20);
		 wait.until(ExpectedConditions.visibilityOf(addToCart));
		 addToCart.click();
	   }
	 
}
