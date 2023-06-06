//package com.nbrick.util;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.Select;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class Methods {
//	
//	public WebDriver driver;
//	
//
//	public void navigateToApplicationURL(String string) {
//	//	WebDriverManager.chromiumdriver().setup();
//		System.setProperty("webdriver.chrome.driver","C:\\Signup\\Signup\\Driver\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.get(string);
//	}
//
//	public void click(By by) {
//		
//	driver.findElement(by).click();
//
//	}
//
//	public void sendkeys(By by, String string) {
//
//	driver.findElement(by).sendKeys(string);
//
//	}
//
//	public void enter(By by, Keys enter,WebDriver driver) {
//
//	driver.findElement(by).sendKeys(enter);
//
//	}
//
//	public void submit(By by) {
//
//	driver.findElement(by).submit();
//
//	}
//
//	public void doubleClick(By by,WebDriver driver) throws InterruptedException {
//
//	Actions act = new Actions(driver);
//
//	Thread.sleep(5000);
//
//	WebElement btnElement = driver.findElement(by);
//
//	act.doubleClick(btnElement).perform();
//
//	Thread.sleep(5000);
//
//	}
//
//	public void rightClick(By by,WebDriver driver) throws InterruptedException {
//
//	Actions act = new Actions(driver);
//
//	Thread.sleep(5000);
//
//	WebElement btnElement = driver.findElement(by);
//
//	act.doubleClick(btnElement).perform();
//
//	Thread.sleep(5000);
//
//	}
//	
//	public void pause (int i) {
//		  
//		driver.manage().timeouts().implicitlyWait(i, TimeUnit.SECONDS);
//
//	}
//	
//	public void select(By by, String string ) {
//		Select select = new Select(driver.findElement(by));
//		select.selectByVisibleText(string);
//
//	}
//}
