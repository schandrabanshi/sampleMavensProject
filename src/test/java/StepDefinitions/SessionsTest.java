package StepDefinitions;

import org.testng.Assert;
import Screens.Home;
import Screens.Sessions;
import Utilities.Logging;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SessionsTest {
	
	public Sessions session=new Sessions();
	
	@Given("^Open Selendroid test app home page$")
	public void Open_Selendroid_test_app_home_page() {
		Logging.log.info("Navigated to start page.");
	}

	@Then("^Enter any text to throw exception$")
	public void Enter_any_text_to_throw_exception() {
		session.enter_exceptionText();
		Logging.log.info("Logged-in into app successfully.");
	    
	}
	@Then("^Validate exception$")
	public void Validate_exception() {
		Assert.assertTrue(session.exceptionMessage());
		Logging.log.info("Verified Come Alive! session page.");
	}
}
