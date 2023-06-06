package stepDefinitions;

import com.nbrick.pages.Nbrick_pages;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class SampleDef {

	Nbrick_pages nbrick_pages = new Nbrick_pages();
	@Given("user should navigate to home page of Nbrick")
	public void user_should_navigate_to_home_page_of_Nbrick() {
		System.out.println("I am in login page");
	}

	

}
