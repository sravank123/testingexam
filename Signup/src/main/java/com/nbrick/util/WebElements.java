package com.nbrick.util;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nbrick.factory.DriverFactory;

public class WebElements {
	WebDriverWait wait;

	public WebDriver driver;

	
	public void waitClick(By by)
	{
		wait.until(ExpectedConditions.elementToBeClickable(by)).click();

	}
	
	public WebElements()
	{
		driver = DriverFactory.getDriver();
		wait = DriverFactory.getWait();
	}
	public void navigateToApplicationURL(String string) {
		driver.get(string);
	}

	public String get_text(By by) {
		return driver.findElement(by).getText();

	}

	public void refresh() {
		driver.navigate().refresh();
	}

	public void clear(By by, WebDriver driver) {
		driver.findElement(by).clear();
	}

	public void click(By by) {
		driver.findElement(by).click();
	}

	public void sendkeys(By by, String string) {
		driver.findElement(by).sendKeys(string);

	}

	public String getAttribute(By by, String string) {
		return driver.findElement(by).getAttribute(string);

	}

	public void enter(By by, Keys enter, WebDriver driver) {

		driver.findElement(by).sendKeys(enter);
	}

	public void submit(By by, WebDriver driver) {
		driver.findElement(by).submit();
	}

	public void pause(long milli) {
		try {
			Thread.sleep(milli);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void doubleClick(By by, WebDriver driver) throws InterruptedException {
		Actions act = new Actions(driver);
		pause(5000);
		WebElement btnElement = driver.findElement(by);
		act.doubleClick(btnElement).perform();
		Thread.sleep(5000);
	}

	public void rightClick(By by, WebDriver driver) throws InterruptedException {
		Actions act = new Actions(driver);
		Thread.sleep(5000);
		WebElement btnElement = driver.findElement(by);
		act.doubleClick(btnElement).perform();
		Thread.sleep(5000);
	}

	public void pause(By by) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));

	}

	public void page_down() {
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.PAGE_DOWN);

	}

	public void select(By by, String string) {
		Select select = new Select(driver.findElement(by));
		select.selectByVisibleText(string);

	}
}
