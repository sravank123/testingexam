package pdf;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demoqa_findelements {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/webtables");
		driver.manage().window().maximize();
		List<WebElement> ls =driver.findElements(By.xpath("//*[@class=\"rt-tbody\"]/div/div/div"));
		
		for (int i = 0; i < ls.size(); i++) {
			// System.out.println("The value if i is "+ i +
			// "----"+ls.get(i).getText().replace("₹",""));
			if (i<19) {
				System.out.println(ls.get(i).getText());
			
		//driver.findElements(By.xpath("//*[@class=\"rt-tr-group\"][1]"));
		//driver.findElements(By.xpath("//*[@class=\"rt-tr-group\"][2]"));
		//driver.findElements(By.xpath("//*[@class=\"rt-tr-group\"][3]"));


}
}
	}
}

