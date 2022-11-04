package Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class CommonUtils {

	/**
	 * Accessing configuration.properties file using Keys
	 * @param Key Pass key name.
	 * @return Getting value for passed key.
	 */
	public static String getAndriodProperties(String Key){		
		
		String absPath=System.getProperty("user.dir")+"\\src\\test\\resources\\configuration.properties";
		Properties prop=new Properties();
		try {
			prop.load(new FileInputStream(absPath));
		} catch (IOException e) {
			Logging.log.error("Configuration file is not found.");
			e.printStackTrace();
		}
		return (String) prop.get(Key);
	}	
	
	//---Set Android capabilities
	private AppiumDriver<MobileElement> driver;
	private static DesiredCapabilities capabilities=new DesiredCapabilities();
	
	/**
	 * Setting up android capabilities using properties file.
	 */
	public void setAndroidCapabilities() {
		
		capabilities.setCapability("platformName", getAndriodProperties("platformName"));
		capabilities.setCapability("platformVersion", getAndriodProperties("platformVersion"));
		capabilities.setCapability("appPackage", getAndriodProperties("appPackage"));
		capabilities.setCapability("appActivity", getAndriodProperties("appActivity"));
		capabilities.setCapability("deviceName", getAndriodProperties("deviceName"));
		capabilities.setCapability("app", System.getProperty("user.dir")+getAndriodProperties("app"));
	}
	
	/*
	 // mCurrentFocus=Window{64379c6 u0 io.selendroid.testapp/io.selendroid.testapp.HomeScreenActivity}
	 {
  "platformVersion": "8.1",
  "platformName": "Android",
  "appPackage": "io.selendroid.testapp",
  "appActivity": ".HomeScreenActivity",
  "app": "C:\\Users\\sarojchandrabanshi\\Downloads\\selendroid-test-app.apk",
  "deviceName": "Android"
	}
	 
	 */
	/**
	 * Intializing Appium android mobile driver and opening app.
	 * @return Appium android mobile driver
	 */
	public AppiumDriver<MobileElement> getAndriodDriver(){
		try {
			if (driver==null) {
				driver=new AppiumDriver<MobileElement>(new URL(getAndriodProperties("url")), capabilities);
			}
			
			driver.manage().timeouts().implicitlyWait(Long.parseLong(getAndriodProperties("maxTimeWait")), TimeUnit.SECONDS);
		}
		catch(Exception ex) {
			Logging.log.error("Failed to initialize Appium Driver.");
			ex.printStackTrace();
		}
		
		return driver;
	}
}
