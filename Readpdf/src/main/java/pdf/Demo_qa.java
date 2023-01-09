package pdf;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class Demo_qa {

	//private static By driver;
    org.openqa.selenium.WebDriver driver=new org.openqa.selenium.chrome.ChromeDriver();

    void enterText(By by,String textboxData)
	{
        driver.findElement((by)).sendKeys(textboxData);

	}

	public static void main(String args[]) throws InterruptedException
    {
        System.setProperty(
            "webdriver.chrome.driver",
            "C:\\Users\\vyasv\\Downloads\\chromedriver_win32\\chromedriver.exe");
        org.openqa.selenium.WebDriver driver=new org.openqa.selenium.chrome.ChromeDriver();
        // Instantiate a ChromeDriver class.
        //WebDriver driver = new ChromeDriver();
  
        // Maximize the browser
        driver.manage().window().maximize();
  
        // Launch Website
        driver.get("https://demoqa.com/elements");
       //Thread.sleep(1000);
       // driver.findElement(By.xpath("//h5[contains(text(),'Elements')]")).click();
       // driver.findElement(By.xpath("//h5[contains(text(),'Elements')]")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Text Box')]")).click();
        driver.findElement(By.id("userName")).sendKeys("sravan kumar");
        driver.findElement(By.id("userEmail")).sendKeys("sravanchinnu444@gmail.com");
        
        
        Demo_qa demo_qa = new Demo_qa();
        demo_qa.enterText(By.id("userName"), "Sravan");
        
       driver.findElement(By.id("currentAddress")).sendKeys("H.no-15-2-56,tharuni water plant road,khammam,pin-507002");
       driver.findElement(By.id("permanentAddress")).sendKeys("H.no-15-2-56,tharuni water plant road,khammam,pin-507002");
       Thread.sleep(5000);
       driver.findElement(By.cssSelector("body")).sendKeys(Keys.PAGE_DOWN);
       driver.findElement(By.id("submit")).click();
      Thread.sleep(5000);
       driver.findElement(By.xpath("//span[contains(text(),'Check Box')]")).click();
       driver.findElement(By.className("rct-checkbox")).click();
      // Thread.sleep(5000);
       //driver.findElement(By.xpath("//span[contains(text(),'Radio Button')]")).click();
       //driver.findElement(By.id("impressiveRadio")).click();
       driver.findElement(By.xpath("//span[contains(text(),'Buttons')]")).click();





       

}

	private static void cheakbox() {
        //driver.findElement((SearchContext) By.xpath("//span[contains(text(),'Check Box')]")).click();

		
		// TODO Auto-generated method stub
		
		
		
	}
	
}

