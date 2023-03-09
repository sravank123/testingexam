package pdf;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_cases implements TestData{
	
	
	@Test
	public void verify_accoutUpdate() throws InterruptedException {
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
		driver.get("https://www.ajio.com/");
		Thread.sleep(1000);
//driver.findElement(By.xpath("//span[contains(@class,\"login-form login-modal\")]")).click();
//driver.findElement(By.xpath("//span[text()='Google']")).click();
		driver.findElement(By.xpath("//a[text()='My Account']")).click();
		driver.findElement(By.xpath("//*[contains(text(),'Address Book')]")).click();
		driver.findElement(By.xpath("//*[contains(text(),'Add new address')]")).click();
		driver.findElement(By.name(name_loc)).clear();
		driver.findElement(By.name("addressPoc")).sendKeys("kumar");
		driver.findElement(By.name("phone")).clear();
		driver.findElement(By.name("phone")).sendKeys(pno);
		Assert.assertEquals(driver.findElement(By.name("phone")).isDisplayed(), true);
		/* cntol+shift+/ to comment
		 * driver.findElement(By.xpath("//input [@name=\"postalCode\"]")).sendKeys((
		 * "507002"));
		 * driver.findElement(By.xpath("//textarea [@name=\"line2\"]")).sendKeys(
		 * "khanapuram");
		 * driver.findElement(By.xpath("//input [@name=\"line1\"]")).sendKeys(
		 * "h.no-1-589-546");
		 * driver.findElement(By.xpath("//input [@name=\"landmark\"]")).
		 * sendKeys("ks water plant road");
		 * driver.findElement(By.xpath("//input [@name=\"district\"]")).sendKeys(
		 * "khammam");
		 * driver.findElement(By.xpath("//input [@name=\"state\"]")).sendKeys("dellhi");
		 * WebElement radio_WORK =
		 * driver.findElement(By.xpath("//input[@value='WORK']"));radio_WORK.click();
		 * driver.findElement(By.xpath("//input[@name=\"defaultAddress\"]")).click();
		 * driver.findElement(By.xpath("//*[text()='Save']")).click();
		 */

	}
	@Test
	public void verifySearchBox()
	{
		WebDriverManager.chromedriver().setup();
		org.openqa.selenium.WebDriver driver = new org.openqa.selenium.chrome.ChromeDriver();
		
	}
}
