package Utilities;

import io.appium.java_client.service.local.AppiumDriverLocalService;

public class AppiumServer {
	//---Appium default local service
	public static AppiumDriverLocalService service;
	
	/**
	 * Start default PORT AppiumDriver service.
	 */
	public static void start() {
		//Starting Appium server
		try {
			 service= AppiumDriverLocalService.buildDefaultService();
			 service.start();
		}
		catch(Exception ex) 
		{
			Logging.log.error("Appium server failed to start due to "+ ex.getMessage());
		}
	}
	/**
	 * Stop Appium service
	 */
	public static void stop() {
		//Appium stop server
		service.stop();
	}
}
