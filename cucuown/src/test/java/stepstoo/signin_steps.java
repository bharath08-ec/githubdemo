package stepstoo;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import main.signin;

public class signin_steps {
	signin sig= new signin();
	@Given("^launch an chrome browser$")
	public void launch_an_chrome_browser() throws Throwable {
	   sig.url();
	    throw new PendingException();
	}

	@When("^the user clcik signin button$")
	public void the_user_clcik_signin_button() throws Throwable {
	   sig.google_homepage();
	    throw new PendingException();
	}

	@Then("^the user enters username and password$")
	public void the_user_enters_username_and_password() throws Throwable {
	    sig.verify();
	    throw new PendingException();
	}

	@Then("^click the signin button$")
	public void click_the_signin_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}


}
