package Hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class hook {
	
	private DriverFactory driverFactory;
	private WebDriver driver;
	
	
	@Before(order=0)
    public void lauchBrowser(){
		
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		driverFactory = new DriverFactory();
		driver = driverFactory.init_driver();

    }	
	
	@After(order = 1)
	public void tearDown(Scenario scenario) {
		if (scenario.isFailed()) {
			String screenShotName = scenario.getName().replaceAll(" ", "_");
			byte[] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(sourcePath, "image/png", screenShotName);
		}
	}

	@After(order = 0)
	public void quitBrower() {
		//driver.quit();
	}

}
