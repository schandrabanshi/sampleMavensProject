package Runner;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import Utilities.AppiumServer;
import Utilities.Logging;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "", 
features = "src/test/java/Feature", 
glue = "StepDefinitions",
plugin = { "pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
monochrome = true)
public class TestRunner extends AbstractTestNGCucumberTests{

	@BeforeSuite
	public void setUp() {
		Logging.log.info("Stating Appium Server to default PORT.");
		AppiumServer.start();
	}
	
	@AfterSuite
	public void tearDown() {
		Logging.log.info("Stoping Appium server.");
		AppiumServer.stop();		
	}
}
