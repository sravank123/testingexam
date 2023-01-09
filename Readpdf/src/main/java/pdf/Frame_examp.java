package pdf;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class Frame_examp {
	public static void main(String[] args) {
		
	}
	@SuppressWarnings("deprecation")
	public void frame() {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_default");
		driver.manage().window().maximize();
		String expectedResult = "This is a Heading";
		driver.switchTo().frame(driver.findElement(By.name("iframeResult")));
		String Actualresult = driver.findElement(By.xpath("//h1[contains(text(),'This is a Heading')]")).getText();
		Assert.assertEquals(expectedResult, Actualresult);
	}
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
