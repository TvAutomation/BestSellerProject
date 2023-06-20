package StepDefinition;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import Factory.DriverFactory;
import Pages.LoginPage;
import Utilities.ConfigReader;
import Utilities.InitializeBrowser;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {


private WebDriver driver = DriverFactory.getDriver();
private ConfigReader con_Reader = new ConfigReader();
private Properties prop = con_Reader.init_prop();

    LoginPage Page = new LoginPage(driver);
    
	@Given("User open browser and redirects to Best Seller Website") 
	public void Cart_URL() throws InterruptedException
	
	  {

		String URL = prop.getProperty("WebURL");
		System.out.println(URL);
		
		new InitializeBrowser(driver, URL);
	    
	  }
	  
	  @When("User accept cookies") public void Cookie() throws InterruptedException {
	  
	         Page.Accept_Cookie();
	  }
	  @And("User hover profile icon and click on login button") 
	  public void Click_On_Login() throws InterruptedException {
		  
		  Page.Click_Profile_Icon();
	   
	   }
	  @And("User enter username and password") 
	  public void Enter_Credentials() throws InterruptedException {
		  
           Page.Enter_Credentials();
	   
	   }
	  
	  @And("User clicks on Login button") 
	  public void reload_cart_page() throws InterruptedException {

	      Page.Click_On_LoginButton();
	   }
	  
	  @Then("User logged in successfully") 
	  public void cart_page() throws InterruptedException
	  { 
		  System.out.println("User is on Cart Page");
	  }
	 
	  @And("User clicks on Shop Now button on landing page") 
	  public void Clicks_ShopNow_Button() throws InterruptedException {
		  
           Page.LandingPageShopNow();
	   
	   }
	  
	  @And("User selects product from listing page") 
	  public void Select_Products() throws InterruptedException {

	      Page.SelectProduct();
	   }
	  @And("User selects size and clicks on add to bag button") 
	  public void Add_To_Cart() throws InterruptedException {
          
		  Page.AddToCart();
	    
	   }
	  @And("User clicks on Bag Icon") 
	  public void CartIcon() throws InterruptedException {
          
		  Page.ClickOnBagIcon();
	    
	   }
	  @And("User clicks on Guest Checkout button") 
	  public void GuestCheckout() throws InterruptedException {
          
		  Page.GuestCheckout();
	    
	   }
	  @And("User fill billing details") 
	  public void AddBillingDetails() throws InterruptedException {
          
		  Page.BillingDetails();
	    
	   }
	  @And("User Save delivery options") 
	  public void DeliverOptions() throws InterruptedException {
          
		  Page.DeliveryOptions();
	    
	   }
	  @And("User accepts terms and condition checkbox") 
	  public void AcceptConditions() throws InterruptedException {
          
		  Page.AcceptTerms();
	    
	   }
	  @And("User enters CC card details") 
	  public void AddCardDetails() throws InterruptedException {
          
		  Page.CCDetails();
	    
	   }
	  @And("User clicks on place order buton") 
	  public void ClickPlaceOrder() throws InterruptedException {
          
		  Page.PlaceOrder();
	    
	   }
	  @Then("User redirects to Success page") 
	  public void SuccessPage() throws InterruptedException
	  { 
		  Page.SuccessPage();
	  }
	  
}
