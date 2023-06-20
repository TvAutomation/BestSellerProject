package Pages;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Factory.DriverFactory;
import Utilities.ConfigReader;
import Utilities.InitializeBrowser;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage {
	
	private WebDriver driver;
	private WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(50));
	private ConfigReader con_Reader = new ConfigReader();
	private Properties prop = con_Reader.init_prop();
	
	By Cookies = By.xpath("//*[@id='CybotCookiebotDialogBodyButtonAccept']");
	By ProfileIcon = By.xpath("//*[@id='renderPage']/header/div/div/div[2]/div[2]/header/div/div[1]/div/div[3]/div/div[2]/a");
	By email = By.id("signInName");
	By Password = By.id("password");
	By LoginButton = By.id("next");
	By ShopNow = By.xpath("//*[@id='main']/div[1]/div/div/div/div/div/div/div/div[2]/div/div/div/a");  
	By Size = By.xpath("//*[@id='main']/div/div/div[2]/div/div[2]/div[3]/div[1]/div/div[1]/button");
	By AddtoCartButton = By.xpath("//*[@id='main']/div/div/div[2]/div/div[2]/div[5]/div[2]/button");
	By CartIcon = By.xpath("//*[@id='default-container-cart-icon']/a");
	By GCheckout = By.xpath("//*[@id='cart']/div[2]/div[2]/a[2]");
	By Name = By.xpath("//*[@id='shipping_addressname']");
	By Street = By.xpath("//*[@id='shipping_addressstreet']");
	By ZipCode = By.xpath("//*[@id='shipping_addresszipcode']");
	By City = By.xpath("//*[@id='shipping_addresscity']");
	By Phone = By.xpath("//*[@id='shipping_addressphone']");
	By Email = By.xpath("//*[@id='shipping_addressemail']");
	By SaveBillingAddress = By.xpath("//*[@id='main']/div/div/div[2]/div/div/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/button[1]");
	By DeliveryOptions = By.xpath("//*[@id='main']/div/div/div[2]/div/div/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/button");
	By BackToShoppingButton = By.xpath("//*[@id='main']/div/div/div[2]/div/div/div[1]/div[2]/a");
	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	

	 public void Accept_Cookie() throws InterruptedException
	    {
	    
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\'CybotCookiebotDialogBodyButtonAccept\']")));
		  driver.findElement(Cookies).click();
			 
		}
	
	 public void Click_Profile_Icon() throws InterruptedException
	    {
	    
		      Thread.sleep(4000);
		      driver.findElement(ProfileIcon).click();
			/*
			 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
			 * wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
			 * "//*[@id=\'renderPage\']/header/div/div/div[2]/div[2]/header/div/div[1]/div/div[3]/div/div[2]/a"
			 * )));
			 * 
			 * try {
			 * 
			 * 
			 * 
			 * WebElement mainMenu = driver.findElement(By.xpath(
			 * "//*[@id=\'renderPage\']/header/div/div/div[2]/div[2]/header/div/div[1]/div/div[3]/div/div[2]/a"
			 * )); mainMenu.click();
			 * 
			 * 
			 * driver.findElement(ProfileIcon).click(); }
			 * catch(org.openqa.selenium.StaleElementReferenceException ex) { WebElement
			 * mainMenu = driver.findElement(By.xpath(
			 * "//*[@id=\'renderPage\']/header/div/div/div[2]/div[2]/header/div/div[1]/div/div[3]/div/div[2]/a"
			 * )); mainMenu.click(); driver.findElement(ProfileIcon).click();
			 * 
			 * }
			 */
			
			 
		}
	 public void Enter_Credentials() throws InterruptedException
	 {
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		  wait.until(ExpectedConditions.elementToBeClickable(By.id("signInName")));
          driver.findElement(email).sendKeys("tvbr2testing@gmail.com");
          driver.findElement(Password).sendKeys("abcd@1212");
	 }
	 public void Click_On_LoginButton() throws InterruptedException
	 {
		 
		   Thread.sleep(2000);
           driver.findElement(LoginButton).click();
           
	 }
	 public void LandingPageShopNow() throws InterruptedException
	    {
			
		   Thread.sleep(5000);
		    //WebElement ShopNow = driver.findElement(By.xpath("//*[@id=\'main\']/div[1]/div/div/div/div/div/div/div/div[2]/div/div/div/a"));
		    
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,230)","");
			driver.findElement(ShopNow).click();
		 
		}
	 public void SelectProduct() throws InterruptedException
	    {
		  Thread.sleep(5000);
	      WebElement Product = driver.findElement(By.xpath("//*[@id=\'main\']/div[2]/div/div/div/div[2]/div/div[4]/div/div/ul/li[3]/div[1]/a/div/div/picture[2]/img"));
	      JavascriptExecutor js = (JavascriptExecutor) driver;
	      js.executeScript("arguments[0].scrollIntoView();", Product);
	      
		 Product.click();
	      
			 
		}
	 public void AddToCart() throws InterruptedException
	    {
		  Thread.sleep(5000);
	      //WebElement Size = driver.findElement(By.xpath("//*[@id=\'main\']/div/div/div[2]/div/div[2]/div[3]/div[1]/div/div[1]/button"));
	      JavascriptExecutor js = (JavascriptExecutor) driver;
	      js.executeScript("window.scrollBy(0,130)","");
	      
		  driver.findElement(Size).click();
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		  wait.until(ExpectedConditions.elementToBeClickable(AddtoCartButton)).click();
		  
			 
		}
	 public void ClickOnBagIcon() throws InterruptedException
	    {
		  Thread.sleep(5000);
	      //WebElement CartIcon = driver.findElement(By.xpath("//*[@id=\'default-container-cart-icon\']/a"));
	      JavascriptExecutor js = (JavascriptExecutor) driver;
	      js.executeScript("window.scrollBy(0,-110)","");
	      //CartIcon.click();
	      driver.findElement(CartIcon).click();
			 
		}
	 public void GuestCheckout() throws InterruptedException
	    {
		  Thread.sleep(4000);
	      WebElement GCheckoutBtn = driver.findElement(By.xpath("//*[@id=\'cart\']/div[2]/div[2]/a[2]"));
	      JavascriptExecutor js = (JavascriptExecutor) driver;
	      js.executeScript("window.scrollBy(0,200)","");
	      GCheckoutBtn.click();
			 
		}
	 public void BillingDetails() throws InterruptedException
	    {
		  Thread.sleep(4000);
	      driver.findElement(Name).sendKeys("Steve");
	      driver.findElement(Street).sendKeys("Surinam 27");
	      driver.findElement(ZipCode).sendKeys("2585");
	      driver.findElement(City).sendKeys("den haag");
	      Thread.sleep(1000);
	      driver.findElement(Phone).sendKeys("65877897");
	      driver.findElement(Email).sendKeys("Steve@gmail.com");
	      Thread.sleep(2000);
	      //WebElement SaveBtn = driver.findElement(By.xpath("//*[@id=\'main\']/div/div/div[2]/div/div/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/button[1]"));
	      JavascriptExecutor js = (JavascriptExecutor) driver;
	      js.executeScript("window.scrollBy(0,300)","");
	      //SaveBtn.click();
	      driver.findElement(SaveBillingAddress).click();
			 
		}
	 public void DeliveryOptions() throws InterruptedException
	    {
		  Thread.sleep(3000);
	      //WebElement DeliveryOption = driver.findElement(By.xpath("//*[@id=\'main\']/div/div/div[2]/div/div/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/button"));
			
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window.scrollBy(0,100)","");
			 driver.findElement(DeliveryOptions).click();
	      //DeliveryOption.click();
			 
		}
	 public void AcceptTerms() throws InterruptedException
	    {
		  Thread.sleep(6000);
	      
		  WebElement AcceptCondition = driver.findElement(By.name("checkoutTermsAndConditions"));
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("arguments[0].click()",AcceptCondition);
	 
		}
	 public void CCDetails() throws InterruptedException
	    {
		  Thread.sleep(2000);
		  JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,250)", "");
			
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//*[@id=\'main\']/div/div/div[2]/div/div/div[2]/div[1]/div[1]/div[3]/div[2]/div/div/div[3]/div/div/div/iframe")));
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//*[@id=\'adyen-dropin\']/div/ul/li/div[2]/div/div/div/div[2]/div[1]/div[1]/label/span[2]/span/iframe")));
			//driver.switchTo().frame(1);
			driver.findElement(By.xpath("//*[@id=\'encryptedCardNumber\']")).sendKeys("4111 1111 1111 1111");
			driver.switchTo().parentFrame();
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//*[@id=\'adyen-dropin\']/div/ul/li/div[2]/div/div/div/div[2]/div[1]/div[2]/div[1]/label/span[2]/span/iframe")));
			driver.findElement(By.xpath("//*[@id=\'encryptedExpiryDate\']")).sendKeys("03/30");
			driver.switchTo().parentFrame();
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//*[@id=\'adyen-dropin\']/div/ul/li/div[2]/div/div/div/div[2]/div[1]/div[2]/div[2]/label/span[2]/span/iframe")));
			driver.findElement(By.xpath("//*[@id=\'encryptedSecurityCode\']")).sendKeys("737");
			driver.switchTo().parentFrame();
			driver.findElement(By.xpath("//*[@id=\'adyen-dropin\']/div/ul/li/div[2]/div/div/div/div[2]/div[2]/label/span[2]/input")).sendKeys("Jason");
			driver.switchTo().defaultContent();
			 
		}
	 public void PlaceOrder() throws InterruptedException
	    {
		  Thread.sleep(3000);
	      WebElement PlaceOrderButton = driver.findElement(By.xpath("//*[@id=\'main\']/div/div/div[2]/div/div/div[2]/div[1]/div[3]/button"));
	      JavascriptExecutor js = (JavascriptExecutor) driver;
	      js.executeScript("arguments[0].scrollIntoView();", PlaceOrderButton);
	      PlaceOrderButton.click();
			 
		}
	 public void SuccessPage() throws InterruptedException
	    {
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		  wait.until(ExpectedConditions.elementToBeClickable(BackToShoppingButton));
		  System.out.println("Order Placed successfully!"); 
		  driver.findElement(BackToShoppingButton).click();
		  
			 
		}
	
	 
}
