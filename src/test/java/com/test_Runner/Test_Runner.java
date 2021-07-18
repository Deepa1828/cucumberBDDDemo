package com.test_Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "FeatureFile",
		junit = "--step-notifications",
		glue = {"com.step_definition"}
		)	

public class Test_Runner {

}
