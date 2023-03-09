package pdf;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class AlertsExample {
	public void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.findElement(By.id("promtButton")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println("---------------"+alert.getText());
		alert.sendKeys("dfdfg");
		alert.accept();
	//	alert.sendKeys("Arjun");
}
}
