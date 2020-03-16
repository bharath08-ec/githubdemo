package com.stepdefenition;



import java.io.IOException;

import com.main.LoginMain;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginSteps extends LoginMain {
	LoginMain  lo = new LoginMain ();
	
	@Given("^the user launch chrome page$")
	public void launchchrome() {
	    lo.launchchrome();
	}

	@When("^the user opens demoblaze homepage$")
	public void url() {
	    lo.url();
	}

	@Then("^the user click signup$")
	public void login() throws IOException, InterruptedException {
	  
		lo.login();
	}

}
	
