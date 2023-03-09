package pdf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames_Example {

	WebDriver driver;

	@BeforeMethod
	public void beforeTest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_default");
		driver.manage().window().maximize();
	}

	@Test
	public void frameTesting() {
		String expectedResult = "This is a Heading";
		driver.switchTo().frame(driver.findElement(By.name("iframeResult")));
		String Actualresult = driver.findElement(By.xpath("//h1[contains(text(),'This is a Heading')]")).getText();
		driver.switchTo().defaultContent();
		Assert.assertEquals(expectedResult, Actualresult);
	}

	@Test(description =  " this is strory no 1 and stroy point 2")
	public void frameTesting_fail_Story123_2() {
		String expectedResult = "This is a Heading-2";

		driver.switchTo().frame(driver.findElement(By.name("iframeResult")));
		String Actualresult = driver.findElement(By.xpath("//h1[contains(text(),'This is a Heading')]")).getText();
		driver.switchTo().defaultContent();
		System.out.println(driver.findElement(By.xpath("//span[contains(text(),'This is a Heading')]")).getText());

		
		Assert.assertEquals(expectedResult, Actualresult);
		
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}
}
