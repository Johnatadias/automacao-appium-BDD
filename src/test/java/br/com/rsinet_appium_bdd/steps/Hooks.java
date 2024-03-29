package br.com.rsinet_appium_bdd.steps;

import java.io.IOException;

import com.cucumber.listener.Reporter;

import br.com.rsinet_appium_bdd.supports.DriverFactory;
import br.com.rsinet_appium_bdd.utils.Screenshot;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	@Before
	public void inicializa(){
		DriverFactory.createDriver();
	}

	@After(order = 1)
	public void afterTest(Scenario cenario) throws IOException {
		String screenPath = Screenshot.gerarScreenshot(DriverFactory.getDriver(), cenario.getName());
		Reporter.addScreenCaptureFromPath(screenPath);
	}
	
	@After(order = 0)
	public void tearDown() {
		DriverFactory.quitChrome();
	}
}
