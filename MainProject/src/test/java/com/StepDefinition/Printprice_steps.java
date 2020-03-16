package com.StepDefinition;

import com.Pages.Printprice_pages;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Printprice_steps {
Printprice_pages pp= new Printprice_pages();

@Given("^open the chrome page$")
public void launching_chrome() {
pp.launching_chrome();
}

@When("^user Opens demo app$")
public void product_store()  {
    pp.product_store();
  
}

@Then("^The user clicks monitors$")
public void Click_monitor() throws InterruptedException  {
   pp.Click_monitor();

}

@Then("^click apple monitor and print price$")
public void printprice() throws InterruptedException {
   pp.printprice();
  
}

@And("^close app$")
public void close()  {
  pp.close();
   
}

}
