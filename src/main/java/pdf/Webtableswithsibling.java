package pdf;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webtableswithsibling {
	public static void main(String[] args) {

	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/alerts");
	driver.manage().window().maximize();
	List<WebElement> ls =driver.findElements(By.xpath("//*[@class=\"ws-table-all\"]/tbody/tr"));
	
	for (int i = 0; i < ls.size(); i++) {
		// System.out.println("The value if i is "+ i +
		// "----"+ls.get(i).getText().replace("₹",""));
		if (i<=6) {
			System.out.println(ls.get(i).getText());
		}
	
	

	//public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
}