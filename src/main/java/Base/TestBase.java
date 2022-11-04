package Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class TestBase {

	//---Appium driver.
	public static AppiumDriver<MobileElement> driver;
	
	/**
	 * Taking screenshot.
	 * @return as byte array.
	 */
	public byte[] getByteScreenshot()
	{
	    return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	}
	
	public static void Wait(long timeInSecond) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
}
