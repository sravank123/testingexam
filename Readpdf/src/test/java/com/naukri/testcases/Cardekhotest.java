package com.naukri.testcases;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import io.github.bonigarcia.wdm.WebDriverManager;
import pdf.TestData;

public class Cardekhotest {

	public static class Test_cases implements TestData {

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
			driver.get("https://www.cardekho.com/");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[text()='Used Car']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[text()='By Model']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='ucBudget']")).click();
			driver.findElement(By.xpath("//input[@id='ucBudget']")).sendKeys((Keys.DOWN));
			driver.findElement(By.xpath("//input[@id='ucBudget']")).sendKeys((Keys.DOWN));
			driver.findElement(By.xpath("//input[@id='ucBudget']")).sendKeys((Keys.DOWN));
			driver.findElement(By.xpath("//input[@id='ucBudget']")).sendKeys(Keys.ENTER);

			
			

		
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
		
	}
}
	}
