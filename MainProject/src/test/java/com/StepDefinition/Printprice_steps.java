package com.StepDefinition;

import com.Pages.Printprice_pages;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Printprice_steps {
Printprice_pages pp= new Printprice_pages();

@Given("^open the chrome page$")
public void open_the_chrome_page() {
pp.launching_chrome();
}

@When("^user Opens demo app$")
public void user_Opens_demo_app()  {
    pp.product_store();
  
}

@Then("^The user clicks monitors$")
public void the_user_clicks_monitors() throws InterruptedException  {
   pp.Click_monitor();

}

@Then("^click apple monitor and print price$")
public void click_apple_monitor_and_print_price() throws InterruptedException {
   pp.printprice();
  
}

@And("^close app$")
public void close_app() throws Throwable {
  pp.close();
    throw new PendingException();
}

}
