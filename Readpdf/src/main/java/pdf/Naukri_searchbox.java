package pdf;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Naukri_searchbox {
	public class Test_cases implements TestData{
		
		
		@Test
		public void verify_searchbox() throws InterruptedException {
			// System.setProperty(
			
			// "webdriver.chrome.driver",
			// "C:\\Users\\vyasv\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			org.openqa.selenium.WebDriver driver = new org.openqa.selenium.chrome.ChromeDriver();
			// Instantiate a ChromeDriver class.
			
			
			// WebDriver driver = new ChromeDriver();

			// Maximize the browser
			driver.manage().window().maximize();

			// Launch Website
			driver.get("https://www.naukri.com/");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@class='suggestor-input ']")).sendKeys("testing");
			driver.findElement(By.xpath("//input[@name='expereinceDD']']")).sendKeys(Keys.DOWN);
			driver.findElement(By.xpath("//input[@name='expereinceDD']']")).sendKeys(Keys.DOWN);


}

}
}