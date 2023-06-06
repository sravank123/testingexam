package com.nbrick.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	WebDriver driver;
	WebDriverWait driverWait;

	public static ThreadLocal<WebDriver> tldriver = new ThreadLocal<WebDriver>();
	public static ThreadLocal<WebDriverWait> tldriverwait = new ThreadLocal<WebDriverWait>();


	public WebDriver initDriver() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*");
		chromeOptions.addArguments("--no-sandbox");
		chromeOptions.addArguments("--disable-dev-shm-usage");
		driver = new ChromeDriver();
		tldriver.set(driver);
		driver.manage().window().maximize();
		driverWait = new WebDriverWait(driver, 60);
		tldriverwait.set(driverWait);
		return driver;
	}

	public static synchronized WebDriver getDriver() {
		return tldriver.get();
	}
	
	public static synchronized WebDriverWait getWait()
	{
		return tldriverwait.get();
	}

}
