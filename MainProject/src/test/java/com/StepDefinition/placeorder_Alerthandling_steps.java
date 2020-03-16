package com.StepDefinition;

import com.Pages.Placeorder_Alerthandling_pages;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class placeorder_Alerthandling_steps {
	Placeorder_Alerthandling_pages pap= new Placeorder_Alerthandling_pages();
	@Given("^user launch chrome$")
	public void user_launch_chrome() {
	   pap.launching_chrome();
	   
	}

	@When("^user open demo application$")
	public void user_open_demo_application()  {
	    pap.product_store();
	   
	}
	@Then("^Then click cart and place order$")
	public void then_click_cart_and_place_order() throws InterruptedException {
	    pap.click_placeorder();
	 
	}

	@Then("^click purchase$")
	public void click_purchase() throws InterruptedException {
	    pap.purchase();
	    
	}

	@And("^close the application$")
	public void close_the_application() throws InterruptedException {
	    pap.close();
	  
	}


}
