package pdf;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Findelements {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[@class=\"desktop-searchBar\"]")).sendKeys("Fossil Watches");
		driver.findElement(By.xpath("//*[@class=\"desktop-searchBar\"]")).sendKeys(Keys.ENTER);
		List<WebElement> ls = driver.findElements(By.xpath("//span[contains(text(),'Rs')]/../span[1]"));
		int price;
		for (int i = 0; i < ls.size(); i++) {
			price =Integer.parseInt(ls.get(i).getText().replace("Rs. ", ""));
			// System.out.println("The value if i is "+ i +
			// "----"+ls.get(i).getText().replace("₹",""));
			if (price >= 4000) {
				System.out.println(price);
		}
	}

}
}
