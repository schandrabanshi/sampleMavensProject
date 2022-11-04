package Screens;
import java.util.concurrent.TimeUnit;

import Base.TestBase;
import Utilities.Logging;

public class Mentee extends TestBase{
	
	private String progressBarbutton="io.selendroid.testapp:id/waitingButtonTest";
	private String scrollView="android:id/scrollView";
	private String username="io.selendroid.testapp:id/inputUsername";
	private String email="io.selendroid.testapp:id/inputEmail";
	private String password="io.selendroid.testapp:id/inputPassword";
	private String name="io.selendroid.testapp:id/inputName";
	private String acceptAdds="io.selendroid.testapp:id/input_adds";
	private String registerVerifyButton="io.selendroid.testapp:id/btnRegisterUser";
	private String registerSubmission="io.selendroid.testapp:id/buttonRegisterUser";
	
	/**
	 * Click on Add Mentee button on Walk With Me app home page
	 */
	public void click_ProgressBarButton() {
		try {
			driver.findElementById(progressBarbutton).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}catch(Exception ex) {
			Logging.log.error("Failed to click on Add Mentee button because of "+ex.getMessage());
		}		
	}
	/**
	 * Enter Username
	 * @param User Username
	 */
	public void enter_Username(String user) {
		try {
			driver.findElementById(username).clear();
			driver.findElementById(username).sendKeys(user);
		}catch(Exception ex) {
			Logging.log.error("Username not entered because of "+ex.getMessage());
		}
	}
	/**
	 * Enter Email
	 * @param Emailid Email id
	 */
	public void enter_Email(String emailid) {
		try {
			driver.findElementById(email).clear();
			driver.findElementById(email).sendKeys(emailid);
		}catch(Exception ex) {
			Logging.log.error("Email not entered because of "+ex.getMessage());
		}
	}
	
	/**
	 * Enter Password
	 * @param Pass Password
	 */
	public void enter_Password(String pass) {
		try {
			driver.findElementById(password).clear();
			driver.findElementById(password).sendKeys(pass);
		}catch(Exception ex) {
			Logging.log.error("Password not entered because of "+ex.getMessage());
		}
	}
	/**
	 * Enter Name
	 * @param name Name
	 */
	public void enter_Name(String _name) {
		try {
			driver.findElementById(name).clear();
			driver.findElementById(name).sendKeys(_name);
		}catch(Exception ex) {
			Logging.log.error("Name not entered because of "+ex.getMessage());
		}
	}
	
	
	/**
	 * Click on accept adds checkbox
	 */
	public void click_AcceptAdds() {
		try {
			driver.findElementById(acceptAdds).click();
		}catch(Exception ex) {
			Logging.log.error("Failed to click on accept adds options because of "+ex.getMessage());
		}
		
		
	}
	/**
	 * Click on register Verify Button
	 */
	public void click_RegisterVerify() {
		try {
			driver.findElementById(registerVerifyButton).click();
		}catch(Exception ex) {
			Logging.log.error("Failed to click on Register Verify Button because of "+ex.getMessage());
		}
		
		
	}
	/**
	 * Click on register Submission
	 */
	public void click_RegisterSubmit() {
		try {
			driver.findElementById(registerSubmission).click();
		}catch(Exception ex) {
			Logging.log.error("Failed to click on Register Submission button because of "+ex.getMessage());
		}
		
		
	}
}
