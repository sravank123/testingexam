package stepDefinitions;

import com.nbrick.pages.Nbrick_pages;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class ProductOrderSubmission {

	Nbrick_pages nbrick_pages = null;

	public ProductOrderSubmission() {
		nbrick_pages = new Nbrick_pages();
	}

	@Given("N-Bricks Home Page")
	public void n_bricks_home_page() {
		System.out.println("Application started");
	}

	@When("sign_in button")
	public void sign_in_button() {
		nbrick_pages.sign_in_button();
	}

	@When("user should enter userID")
	public void user_should_enter_userID() {
		nbrick_pages.user_should_enter_userID();
	}

	@When("user should enter password")
	public void user_should_enter_password() {
		nbrick_pages.user_should_enter_password();
	}

	@When("user should click the remember me check box")
	public void user_should_click_the_remember_me_check_box() {
		nbrick_pages.user_should_click_the_remember_me_check_box();
	}

	@When("click recaptcha_sign_in")
	public void click_recaptcha_sign_in() {
		nbrick_pages.click_sigin();
	}

	@Given("user should click mycart from navigation bar")
	public void user_should_click_mycart_from_navigation_bar() {
		nbrick_pages.my_cart();
	}

	@When("user should click the search icon of the partner")
	public void user_should_click_the_search_icon_of_the_partner() {
		nbrick_pages.user_should_click_the_search_icon_in_th_partner();
	}

	@When("user shloud enter buyer details")
	public void user_shloud_enter_buyer_details() {
		nbrick_pages.user_enter_buyer_name();
	}

	@When("user should enter product details")
	public void user_should_enter_product_details() {
		nbrick_pages.user_should_add_products();
	}

	@When("user sholud click update")
	public void user_sholud_click_update() {
		nbrick_pages.click_update();
		System.out.println("click");
	}

	@Given("user should click convert to project")
	public void user_should_click_convert_to_project() {
		nbrick_pages.user_click_convert_to_project();
	}

	@Then("user Should verify Create Project successful.")
	public void user_Should_verify_Create_Project_successful() {
		nbrick_pages.Create_Project_successful();

	}

	@When("refresh the page.")
	public void refresh_the_page() {
		nbrick_pages.refresh();

	}

	@Given("user sholud click recent projects")
	public void user_sholud_click_recent_projects() {
		nbrick_pages.user_click_recent_project();
	}

	@Given("user should clcik new project From recent projects")
	public void user_should_clcik_new_project_From_recent_projects() {
		nbrick_pages.user_click_project_from_menu();

	}
//	@Given("user should clcik  new project From recent projects")
//	public void user_should_clcik_The_Phone_Company_link_From_recent_projects(Integer int1) {
//	    nbrick_pages.user_click_project_from_menu();
//	}

	@When("user should enter name")
	public void user_should_enter_name() {

		nbrick_pages.enter_name_in_project();

	}

	@When("user should click item nad summary")
	public void user_should_click_item_nad_summary() {
		nbrick_pages.user_click_items_summary();
	}

	@When("user should click update buttion")
	public void user_should_click_update_buttion() {
		nbrick_pages.clcik_project_update();
	}

	@When("user should click convert project to quote")
	public void user_should_click_convert_project_to_quote() {
		nbrick_pages.user_convert_project_to_quote();
	}

	@When("user should click recent quotes")
	public void user_should_click_recent_quotes() {
		nbrick_pages.refresh();
		nbrick_pages.click_on_recent_quotes();
	}

	@When("user should click on created quote")
	public void user_should_click_on_created_quote() {
		nbrick_pages.click_on_created_quotes();
	}

	@When("user should click on quote summary")
	public void user_should_click_on_quote_summary() {
		nbrick_pages.click_on_summary_quotes();
		nbrick_pages.click_on_update_quotes();
	}

	@When("user should convert quote to order")
	public void user_should_convert_quote_to_order() {
		nbrick_pages.click_on_quotes_to_order();
	}

	@Then("verify quote is converted into order")
	public void verify_quote_is_converted_into_order() {

	}

	@Then("user should click on resent orders")
	public void user_should_click_on_resent_orders() {
		nbrick_pages.refresh();
		nbrick_pages.click_on_recent_orders();

	}

	@Given("user should click on created order")
	public void user_should_click_on_created_order() {
		nbrick_pages.click_on_created_order();
	}

	@Then("user should click on submit")
	public void user_should_click_on_submit() {
		nbrick_pages.click_on_submit();

	}

	@Then("user should verify sumition approved")
	public void user_should_verify_sumition_approved() {
		nbrick_pages.Submitted_Approved();
	}

}
