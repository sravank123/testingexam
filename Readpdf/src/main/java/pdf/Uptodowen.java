package pdf;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class Uptodowen {

	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vyasv\\Downloads\\chromedriver_win32\\chromedriver.exe");
		org.openqa.selenium.WebDriver driver = new org.openqa.selenium.chrome.ChromeDriver();
		// Maximize the browser
		driver.manage().window().maximize();
		// Launch Website
		driver.get("https://demoqa.com/text-box");
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.PAGE_DOWN);

		driver.findElements(By.xpath("//button[@id='submit']/../../..//div[4]/div[2]"));
	}
}
