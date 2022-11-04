package Screens;

import java.util.concurrent.TimeUnit;

import Base.TestBase;
import Utilities.Logging;

public class Sessions extends TestBase{
	
	//Exception throw: io.selendroid.testapp:id/exceptionTestField
		//title: android:id/aerr_restart to validate 'Open app again'
	
	//------COME ALIVE! session
	
	private String exceptionTextBox ="io.selendroid.testapp:id/exceptionTestField";

	private String exception="android:id/aerr_restart to validate";
	
	/**
	 * Click on Come Alive! widget/tile.
	 */
	public void enter_exceptionText() {
		try {
			driver.findElementById(exceptionTextBox).clear();;
			driver.findElementById(exceptionTextBox).sendKeys("e");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}catch(Exception ex) {
			Logging.log.error("Come Alive! is not availabe: "+ex.getMessage());
		}		
	}
	/**
	 * Verify Come Alive! page.
	 * @return Boolean after confirming the correct page.
	 */
	public  boolean exceptionMessage() {
		return driver.findElementById(exception).isDisplayed();
	}
}
