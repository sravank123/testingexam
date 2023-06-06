package com.nbrick.pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.nbrick.util.WebElements;

public class ProductsPage extends WebElements 
{

	By signin = By.xpath("//a[contains(text(),'SIGN IN')]");
	By username=By.xpath("//input[@id='loginName']");
	By password=By.xpath("//input[@id='pwd']");
	By remember_me= By.xpath("//input[@type='checkbox']");	
	By recaptcha_cheak_box= By.xpath("//span[contains(@aria-labelledby,'recaptcha-anchor-label')]");
	By sign_in_button=By.xpath("//button[@id='recaptchasubmit']");
	By products_Services  = By.xpath("//*[@id='menu_Product / Services']");
	By product = By.xpath("//*[text()='Product']");
	By referenceid = By.xpath("//*[@name='referenceid']");
	By name = By.xpath("//*[@name='name']");
	By description = By.xpath("//*[@name='description']");
	By code = By.xpath("//*[@name='upccode']");
	By productCreate = By.xpath("//*[@id='productCreate']");
	By type = By.xpath("//*[@id='type']");
	By brand =By.xpath("//*[@id='brand']");
	By scope =By.xpath("//*[@id='scope']");
	
	public void navigateToNbricksLoginPage() {
		navigateToApplicationURL("https://www.n-bricks.com/signin");
		System.out.println("Application Launched ");

		pause(10000);
	}
	
	public void click_signin() {
		System.out.println("Sign Page");
		click(signin);

	}
	public void username () {
		sendkeys(username,"BestbuyA" );
	}
	public void password () {
		sendkeys(password,"Password1" );
	}
	public void remember_me () {
		
	}
	
	
	
	public void click_on_product_services() {
		System.out.println("Product Services");

		click(products_Services);

	}
	
	
	public void click_on_product() {
		click(product);
		System.out.println("Product ");

	}
	
	public void click_type() {
		select(type,"Product");
		
	}
	
	public void click_brand() {
		click(brand);
		System.out.println("Click Brand ");

	}
	public void select_scope() {
		select(scope, "Available to All");
	}
	
	
	public void referenceid () {
		sendkeys(referenceid,"12345678" );
	}
	
	
	public void name () {
		sendkeys(name,"name");
		
	}
	public void description () {
		sendkeys(description,"description");
		
	}
	public void code () {
		sendkeys(code,"code1234");
		
	}
	
	public void productCreate() {
		click(productCreate);
	}

	public void enterUsername() {
		sendkeys(username, "devisri47@gmail.com");
	}

	public void user_should_click_the_sign_in_button() {
		pause(10000);
		click(sign_in_button);
	}

	public void user_should_enter_user_password() {
		sendkeys(password, "Sri@1984");
	}

	public void clickOnReCaptcha() {
		// TODO Auto-generated method stub
		click(recaptcha_cheak_box);
	}

	public void verify_product_is_created() {
		
		Assert.assertEquals(driver.findElement(By.xpath("//*[contains(text(),'Create [PROD, name] successful.')]")).isDisplayed(),true);
		driver.quit();
		
	}

	public void verify_product_is_not_created() {
		Assert.assertEquals(false,true);
		driver.quit();

	}
	
	
	
	
}
