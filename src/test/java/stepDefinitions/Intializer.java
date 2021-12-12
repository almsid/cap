package stepDefinitions;

import core.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Intializer extends Base {

	// In this class we will define Before Hooks and After hooks of Cucumber
	// Before hooks will run before each scenario
	// After hooks will run after each scenario
	@Before
	public void beforeHooks(Scenario scenario) {
		logger.info(scenario.getName() + " Started");
		scenario.log(scenario.getName() + " Started");
		selectBrowser();
		openBrowser();
	}

	@After
	public void afterHooks(Scenario scenario) {
		tearDown();
		logger.info(scenario.getName() + " " + scenario.getStatus());
		scenario.log(scenario.getName() + " " + scenario.getStatus());
	}

}
