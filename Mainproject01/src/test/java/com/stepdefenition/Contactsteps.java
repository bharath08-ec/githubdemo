package com.stepdefenition;
import com.main.Contact;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Contactsteps extends Contact{
	Contact a2 = new Contact();
	
	@Given("^The User Launch Chrome Page$")
	public void launchchrome() {
	    a2.Launchchrome2();
	}

	@When("^user opens demoweblaze homepage$")
	public void url() {
	    a2.Url2();
	}

	@Then("^the user Click contact$")
	public void add() throws InterruptedException  {
	  
		a2.contact();
}
}