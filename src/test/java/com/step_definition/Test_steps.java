package com.step_definition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_steps {
	
	@Given("I navigate to the login page")
	public void navigate_login_page()throws Throwable{
		System.out.println("I am at the login page");
	}
	
	@When("I submit username and password")
	public void username_password()throws Throwable{
		System.out.println("I submit the username and password");
	}
	
	@Then("I should be logged in")
	public void logged_in()throws Throwable{
		System.out.println("I should be logged in ");
	}
	
	@Given("User search for Lenovo Laptop")
	public void search_lenovo()throws Throwable{
		System.out.println("Searched first Lenovo");
	}
	
	@When("Add the first laptop that appears in the search result to the basket")
	public void first_lenovo()throws Throwable{
		System.out.println(" first laptop added to cart");
	}
	
	@Then("User basket should display with added item")
	public void user_basket()throws Throwable{
		System.out.println("Product should be dispalyed in cart ");
	}
	
	@Given("User navigate for Lenovo Laptop")
	public void navigate_laptop()throws Throwable{
		System.out.println("User navigated to Lenovo");
	}
	
	@When("Add the laptop to the basket")
	public void cart()throws Throwable{
		System.out.println(" laptop added to cart");
	}
	
//	@Then("User basket should display with added item")
//	public void user_basket1()throws Throwable{
//		System.out.println("Product should be dispalyed in cart ");
//	}
	
	
	

}
