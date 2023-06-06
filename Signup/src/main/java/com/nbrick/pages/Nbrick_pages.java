package com.nbrick.pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nbrick.util.WebElements;

public class Nbrick_pages extends WebElements {

	By signin = By.xpath("//a[contains(@class,'btn btn-info')]");
	By userID = By.id("loginName");
	By password = By.xpath("//input[contains(@id,'pwd')]");
	By remember_me = By.xpath("//input[contains(@type,'checkbox')]");
	By signinbutton = By.xpath("//button[contains(@id,'recaptchasubmit')]");
	By mycart = By.xpath("//a[contains(@href,'/myCartHTML')]");
	By partner = By.xpath("//input[@id='organization']/..//a");
	By partner_detail_close = By.xpath("//button[contains(@class,'close')][1]");
	By buyer = By.xpath("//a[contains(@for,'#customer')]");
	By buyer_details_close = By.xpath("//div[@id='dataOrganizationPRTTBModal']//button[@class='close']");
	By reset = By.xpath("//button[contains(@id,'priceandavailabilityDelete')]");
	By buyer_name = By.xpath("//input[contains(@id,'customer')]");
	By add_products = By.xpath("//input[contains(@searchhref,'/products/search/')][1]");
	By add = By.xpath("//*[@title='Add a new line']");
	By another_product = By.xpath("//input[contains(@searchhref,'/products/search/')][2]");
	By another_product1 = By.xpath("//input[contains(@searchhref,'/products/search/')][3]");
	By remove_products = By.xpath("//button[contains(@id,'removeButton_afe09071-68d9-41df-9b1d-10239f7eb4f2')]");
	By update = By.xpath("//button[contains(@id,'priceandavailabilityUpdate')]");
	By quoteupdate = By.xpath("//*[@id='quoteUpdate']");
	By convert_menu = By.xpath("//button[contains(@type,'button')]//span[contains(@class,'glyphicon glyphicon-list')]");
	By conver_project = By.xpath("//a[contains(normalize-space(),'Convert To Project')]");
	By recentProject = By.xpath("//a[contains(normalize-space(),'Recent Projects')]");
	By project = By.xpath("(//div[@id='myProjectsPanel']//a)[1]");
	By name = By.xpath("//input[contains(@id,'name')]");
	By items = By.xpath("//h4[contains(normalize-space(),'Items')]");
	By pjt_summary = By.xpath("//a[contains(@href,'#summary')]");
	By quote = By.xpath("//a[contains(normalize-space(),'Convert To Quote(s)')]");
	By project_update = By
			.xpath("//button[contains(@id,'projectUpdate')]//span[contains(@class,'glyphicon glyphicon-copy')]");
	By summary = By.xpath("//h4[contains(normalize-space(),'Summary')]");
	By pjt_update = By.xpath("//button[contains(@id,'projectUpdate')]");
	By convert_menu1 = By.xpath("//button[contains(@class,'btn btn-default dropdown-toggle')]");
	By convert_quote = By.xpath("//a[contains(normalize-space(),'Convert To Quote(s)')]");
	By frst_product = By.xpath("(//div[@id='myProjectsPanel']//span)[1]");
	By scnd_product = By.xpath("//td[contains(text(),'In Process')][2]");
	By second_item = By.xpath("//input[contains(@type,'checkbox')][3]");
	By buyername = By.xpath("//input[contains(@id,'buyername')]");
	By q_name = By.xpath("//input[contains(@id,'name')]");
	By q_update = By.xpath("//button[contains(@id,'quoteUpdate')]//span[contains(@class,'glyphicon glyphicon-copy')]");
	By quote_dDn = By.xpath("//button[contains(@class,'btn btn-default dropdown-toggle')]");
	By q_summary = By.xpath("//h4[contains(normalize-space()");
	By quote_recent = By.xpath("//*[@id=\"pgh_quotes\"]");
	By quote_created = By.xpath("(//div[@id='myQuotesPanel']//span)[1]");
	By quote_summery = By.xpath("//*[contains(text(),'Summary')]");
	By quote_meenu = By.xpath("//*[@class='btn btn-default dropdown-toggle']");
	By convert_order = By.xpath("//*[@status='Create Order']");
	By oder_verification = By.xpath("//*[contains(text(),'Create Order [Created from project [name1]] successful.')]");
	By recent_order = By.xpath("//*[@aria-controls='myOrdersPanel']");
	By created_order = By.xpath("(//div[@id='myOrdersPanel']//span)[1]");
	By order_menu = By.xpath("//*[@class='btn btn-default dropdown-toggle']");
	By submit = By.xpath("//*[@status='Submit']");
	By status = By.xpath("//*[@id='statusdesc']");
	By Create_Project_successful = By.xpath("//*[@class='alert alert-success alert-dismissible text-center fade in']");
	By Created_from_project_quote = By
			.xpath("//*[contains(text(),'Create Order [Created from project [name1]] successful.')]");

	//WebDriverWait wait = null;
	long timeinsec = 120;

	public void verify_order_Submitted() {
		assertEquals("Submit Approval", getAttribute(q_summary, "value"));

	}

	public void sign_in_button() {
		click(signin);
	}

	public void user_should_enter_userID() {
		sendkeys(userID, "BestbuyA");

	}

	public void user_should_enter_password() {
		sendkeys(password, "Password1");

	}

	public void user_should_click_the_remember_me_check_box() {
		click(remember_me);
	}

	public void click_sigin() {
	//	waitClick(signinbutton);
		click(signinbutton);


	}

	public void my_cart() {
		System.out.println("the driver value is" + driver);
		waitClick(mycart);

	}

	public void user_should_click_the_search_icon_in_th_partner() {

		waitClick(partner);

		waitClick(partner_detail_close);

	}

	public void user_click_the_search_icon_in_the_buyer() {
		click(buyer);
		waitClick(buyer_details_close);
	}

	public void user_should_click_reset() {
		click(reset);

	}

	public void user_enter_buyer_name() {
		sendkeys(buyer_name, "First-1 Last-1");

		waitClick(buyer);

		waitClick(buyer_details_close);

	}

	public void user_should_add_products() {
		sendkeys(add_products, "i phone x");

//	WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(120));
//	wait1.until(ExpectedConditions.elementToBeClickable(add);	
		click(add);

	}

	public void user_should_remove_products() {
		click(remove_products);

	}

	public void click_update() {

		waitClick(update);

	}

	public void user_click_convert_to_project() {

		click(convert_menu);
		waitClick(conver_project);
	}

	public void user_click_recent_project() {
		waitClick(recentProject);

	}

	public void user_click_project_from_menu() {
		click(project);

	}

	public void user_should_enter_Name_address_update() {
		click(pjt_update);

	}

	public void user_click_items_summary() {
		click(items);
		click(summary);
	}

	public void user_convert_project_to_quote() {
		click(convert_menu1);
		waitClick(convert_quote);
	}

	public void check_summary_and_click_first_product() {
		click(items);
		click(summary);

	}

	public void enter_quote_name() {
		sendkeys(q_name, "123");
	}

	public void enter_name_in_project() {

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		sendkeys(name, "name");

	}

	public void clcik_project_update() {
		click(project_update);

	}

	

	public void click_on_recent_quotes() {
		waitClick(quote_recent);

	}

	public void click_on_created_quotes() {
		waitClick(quote_created);

	}

	public void click_on_summary_quotes() {
		waitClick(quote_summery);

	}

	public void click_on_update_quotes() {
		waitClick(q_update);

	}

	public void click_on_quotes_to_order() {
		waitClick(quote_meenu);
		waitClick(convert_order);

	}

	public void click_on_recent_orders() {
		waitClick(recent_order);

	}

	public void click_on_created_order() {
		waitClick(created_order);

	}

	public void click_on_submit() {
		waitClick(order_menu);
		waitClick(submit);
	}

	public void Create_Project_successful() {

		pause(5000);
		assertEquals(true, get_text(Create_Project_successful).contains("Create Project successful"));

	}

	public void Created_from_project_quote() {

		assertEquals("Create Order [Created from project [name1]] successful..", get_text(Created_from_project_quote));

	}

	public void Submitted_Approved() {
		pause(5000);
		assertEquals("Submitted Approved", getAttribute(status, "value"));
		driver.quit();

	}

}
