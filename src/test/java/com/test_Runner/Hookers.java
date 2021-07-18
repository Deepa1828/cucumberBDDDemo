package com.test_Runner;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hookers {
	@Before(order=1)
		public void beforeScenario() {
			System.out.println("Start the browser and clear the cookies");
		}
	
	@Before(order=0)
	public void beforeScenarioStart() {
		System.out.println("Start of the scenario");
	}
	
	@After(order=1)
	public void AfterScenarioFinish() {
		System.out.println("End the scenario");
	}
	@After(order=0)
	public void AfterScenarioStart() {
		System.out.println("Logout the scenario");
	}
	

	
}
