package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElectronicsPage 
{
	@FindBy (xpath = "(//a[text()='Electronics '])[1]")
	private WebElement electronics;
	
	@FindBy (xpath = "//img[@alt='Picture for category Camera & photo']")
	private WebElement cameraPhoto;
	
	@FindBy (xpath = "//img[@alt='Picture of Nikon D5500 DSLR']")
	private WebElement nikon;
	
	@FindBy (xpath = "//button[@id='add-to-cart-button-14']")
	private WebElement addToCart;
	
	
	private WebDriver driver;
	private  WebDriverWait wait ;
	private Actions actions;
	public ElectronicsPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver = driver;
		//wait = new WebDriverWait(driver,10);
		 actions = new Actions(driver);
	}
	   public void openElectronics()
	   {
		 wait = new WebDriverWait(driver,10);
     	 wait.until(ExpectedConditions.visibilityOf(electronics));
     	actions.moveToElement(electronics).click().build().perform();
	   }
	 public void openCameraPhotoPage()
	   {
		 wait = new WebDriverWait(driver,10);
		 wait.until(ExpectedConditions.visibilityOf(cameraPhoto));
		 actions.moveToElement(cameraPhoto).click().build().perform();
	   }
	   public void clickOnNikonItem()
	   {
		 wait = new WebDriverWait(driver,10);
     	 wait.until(ExpectedConditions.visibilityOf(nikon));
     	actions.moveToElement(nikon).click().build().perform();
	   }
	   public void clickOnAddToCart()
	   {
		 wait = new WebDriverWait(driver,20);
		 wait.until(ExpectedConditions.visibilityOf(addToCart));
		 addToCart.click();
	   }
	 
}

