package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/main/resources/features/main.feature"},
		plugin = {"pretty", "html:reports/cucumber-html-report"},
		tags = {"@tc01_demoblaze"},
		glue = {"LoginSteps"},
		monochrome = true
		)

public class LoginRunner {

}
