package com.naukri.testcases;

//public class Na {
//package pdf;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class Naukri_searchbox1 {
	// public class Test_cases implements TestData{

	String Enter_skills = "//input[@class='suggestor-input ']";
	String Enter_designations ="//input[@class='suggestor-input ']";
	String Enter_companies="//input[@class='suggestor-input ']";
	String Select_experience="//input[@name='expereinceDD']";
	String Enter_location="//*[contains(@placeholder,'Enter location')]";
	
	@SuppressWarnings("deprecation")
	@Test
	public void verify_testingprofilr() throws InterruptedException {
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
		driver.findElement(By.xpath(Enter_skills)).sendKeys("testing tools");
		Thread.sleep(1000);

		//driver.findElement(By.xpath("//div[@class=\"opt  \"]")).sendKeys(Keys.DOWN);
		//driver.findElement(By.xpath("//div[@class=\"opt  \"]")).sendKeys(Keys.DOWN);
		driver.findElement(By.xpath(Select_experience)).click();
		driver.findElement(By.xpath(Select_experience)).sendKeys(Keys.DOWN);
		driver.findElement(By.xpath(Select_experience)).sendKeys(Keys.DOWN);
		driver.findElement(By.xpath(Select_experience)).sendKeys(Keys.DOWN);
		driver.findElement(By.xpath(Select_experience)).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath(Enter_location)).sendKeys("Hyderabad/Secunderabad ");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[text()='Search']")).click();
		Thread.sleep(1000);
		Assert.assertEquals(driver.findElement(By.xpath("//span[@title='3-6 Yrs ']/../..//span[@title=\"Hyderabad/Secunderabad, Mumbai, Bangalore/Bengaluru \"]/../../..//a[@title=\"Quality Engineer  Manager  P&T Labs\"]")).isDisplayed(),true);
		// driver.findElement(null)

	}

	
	@SuppressWarnings("deprecation")
	@Test
	public void verify_Developer_jav() throws InterruptedException {
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
		driver.findElement(By.xpath(Enter_skills)).sendKeys("Developer java");
		Thread.sleep(1000);

		//driver.findElement(By.xpath("//div[@class=\"opt  \"]")).sendKeys(Keys.DOWN);
		//driver.findElement(By.xpath("//div[@class=\"opt  \"]")).sendKeys(Keys.DOWN);
		driver.findElement(By.xpath(Select_experience)).click();
		driver.findElement(By.xpath(Select_experience)).sendKeys(Keys.DOWN);
		driver.findElement(By.xpath(Select_experience)).sendKeys(Keys.DOWN);
		driver.findElement(By.xpath(Select_experience)).sendKeys(Keys.DOWN);
		driver.findElement(By.xpath(Select_experience)).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath(Enter_location)).sendKeys("Hyderabad/Secunderabad ");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[text()='Search']")).click();
		Thread.sleep(1000);
		Assert.assertEquals(driver.findElement(By.xpath("//span[@title='3-6 Yrs ']/../..//span[@title=\"Hyderabad/Secunderabad, Mumbai, Bangalore/Bengaluru \"]/../../..//a[@title=\"Quality Engineer  Manager  P&T Labs\"]")).isDisplayed(),true);
		// driver.findElement(null)

	}

}
