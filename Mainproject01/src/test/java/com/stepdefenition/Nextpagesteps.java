package com.stepdefenition;

import com.main.Nextpage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Nextpagesteps extends Nextpage {
	Nextpage a3 = new Nextpage();
	
	@Given("^chrome page is launched$")
	public void launchchrome() {
	    a3.Launchchrome3();
	}

	@When("^ Demoweblaze Homepage is opened$")
	public void url() {
	    a3.Url3();
	}

	@Then("^the user Click nextpage$")
	public void add() throws InterruptedException  {
	  
		a3.Next();
	}
}
