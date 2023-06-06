package apphooks;

import org.openqa.selenium.WebDriver;

import com.nbrick.factory.DriverFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class ApplicationHooks {

	WebDriver driver;
	String sbrowserName;

	@Before("@login")
	public void launchBrowser() {
		driver = new DriverFactory().initDriver();
		driver.get("http://dev-api.n-bricks.com/home");
	}
	@After
	public void browserClose()
	{
		driver.quit();
	}

}
