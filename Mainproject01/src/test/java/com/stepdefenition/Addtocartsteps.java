package com.stepdefenition;
import com.main.Addtocart;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Addtocartsteps extends Addtocart{
	
Addtocart a1 = new Addtocart();
	
	@Given("^user launch chrome page$")
	public void launchchrome() {
	    a1.launchchrome1();
	}

	@When("^user opens demoweblaze homepage$")
	public void url() {
	    a1.url1();
	}

	@Then("^the user click add to cart$")
	public void add() throws InterruptedException  {
	  
		a1.add();
	}
}
