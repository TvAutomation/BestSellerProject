package Utilities;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import Factory.DriverFactory;

public class InitializeBrowser {
	
	public InitializeBrowser(WebDriver driver, String url)
	{
		DriverFactory.getDriver().get(url);
		DriverFactory.getDriver().manage().window().maximize();
	}

}
