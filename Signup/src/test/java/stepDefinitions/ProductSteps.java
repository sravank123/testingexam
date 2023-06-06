package stepDefinitions;

import com.nbrick.pages.ProductsPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class ProductSteps {
	
	ProductsPage productsPage = new ProductsPage();
	
	
	@Given("user should enter user password")
	public void user_should_enter_user_password() {
		productsPage.user_should_enter_user_password();
	}
	
	@Given("user should enter user name")
	public void user_should_enter_user_name() {
		productsPage.enterUsername();
	}

	@Given("user should click the sign in button")
	public void user_should_click_the_sign_in_button() {
		productsPage.user_should_click_the_sign_in_button();
	}
	
	@Given("user should check the recaptcha checkbox")
	public void user_should_check_the_recaptcha_checkbox() {
		productsPage.clickOnReCaptcha();
	}
    @Then("Verify product is created")
    public void verify_product_is_created()
    {
    	productsPage.verify_product_is_created();
    	System.out.println("Test Case Completed");
    }
    
    @Then("Verify product is not created")
    public void verify_product_is_not_created()
    {
    	productsPage.verify_product_is_not_created();
    }
    
    
	
//	@When("user in the n-bricks home page")
//	public void user_in_the_n_bricks_home_page() {
//		
//		
//	}
	
	@Given("user should be in n-bricks home page")
	public void user_should_be_in_n_bricks_home_page() {
		System.out.println("Launch the Application");
		productsPage.navigateToNbricksLoginPage();
	}

	@Given("user should click on product\\/Services")
	public void user_should_click_on_product_Services() {
		productsPage.click_on_product_services();
	}

	@Given("user should click on product")
	public void user_should_click_on_product() {
		productsPage.click_on_product();
	}

	@Given("user should click on Type")
	public void user_should_click_on_Type() {
		productsPage.click_type();
		System.out.println("Type");
	    
	}

	@Given("user should select product")
	public void user_should_select_product() {
		productsPage.click_on_product();
		System.out.println("user_should_select_product");

	}
	    

	@Given("user should click on Brand")
	public void user_should_click_on_Brand() {
		productsPage.click_brand();
System.out.println("user_should_click_on_Brand");
	}
	@Given("user should enter Reference Id")
	public void user_should_enter_Reference_Id() {
		productsPage.referenceid();
	}
	

	@Given("user should click on Scope")
	public void user_should_click_on_Scope() {
		productsPage.select_scope();
		System.out.println("user_should_click_on_Scope");

	}

	@Given("user should select Available to All")
	public void user_should_select_Available_to_All() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Given("user should enter Name")
	public void user_should_enter_Name() {

		productsPage.name();
	}

	@Given("user should enter Description")
	public void user_should_enter_Description() {

		productsPage.description();
	}

	@Given("user should enter Code")
	public void user_should_enter_Code() {

		productsPage.code();
	}

	@Given("user should click on Create")
	public void user_should_click_on_Create() {
		productsPage.productCreate();

	}
	
}