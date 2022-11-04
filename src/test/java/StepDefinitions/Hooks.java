package StepDefinitions;

import java.io.File;

import org.apache.commons.io.FileUtils;

import Base.TestBase;
import Utilities.CommonUtils;
import Utilities.Logging;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
public class Hooks extends TestBase{
	
	@Before
	public void launchAndInstallApp() {
		Logging.log.info("Setting-Up Android Capabilities and launching app after installation.");
		CommonUtils utls=new CommonUtils();
		utls.setAndroidCapabilities();
		driver=utls.getAndriodDriver();
		
		//----Deleting exting screenshots to clear unused images for next execution.
		FileUtils.deleteQuietly(new File(System.getProperty("user.dir")+"\\ExtentReport\\screenshots"));
	}
	
	@After
	public void deleteApp(Scenario scenario) {
		
		if(scenario.isFailed())
	    {
			scenario.attach(getByteScreenshot(), "image/png", scenario.getName());
	    }
		
		Logging.log.info("Removing app from Android.");
		driver.removeApp("io.selendroid.testapp");
		driver.quit();
		Logging.log.info("App removed and driver closed.");
	}
	
}
