package com.StepDefinition;

import com.Pages.Placeorder;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class placeorder_steps {
	Placeorder po= new Placeorder();
	@Given("^launched the chrome page$")
	public void launching_chrome()  {
	  po.launching_chrome();
	   
	}

	@When("^open demoblaze homepage$")
	public void product_store()  {
	    po.product_store();
	    
	}

	@Then("^click cart and place order$")
	public void click_placeorder() throws InterruptedException {
	    po.click_placeorder();
	   
	}

	@Then("^Give all detail$")
	public void fill_details() throws InterruptedException  {
		po.fill_details();
	    
	}

	@And("^application is closed$")
	public void quit() {
	   po.quit();
	    
	}

}
