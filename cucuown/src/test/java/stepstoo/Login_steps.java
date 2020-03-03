package stepstoo;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import main.login;

public class Login_steps {
	login log = new  login();
	@Given("^the user launched the chrome browser$")
	public void the_user_launched_the_chrome_browser() throws Throwable {
		  log.url();
	    throw new PendingException();
	  
	}

	@When("^the user click login button$")
	public void the_user_click_login_button() throws Throwable {
	  log.google_homepage();
	    throw new PendingException();
	}

	@When("^the user enters username and password$")
	public void the_user_enters_username_and_password() throws Throwable {
	 log.verify();
	    throw new PendingException();
	}

	@Then("^click the join button$")
	public void click_the_join_button() throws Throwable {
	  log.done();
	    throw new PendingException();
	}

}
