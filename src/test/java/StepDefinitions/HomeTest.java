package StepDefinitions;
import org.testng.Assert;

import Screens.Home;
import Utilities.Logging;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
public class HomeTest {

	public Home home=new Home();
	
	@Given("^Home page is opened for selendroid test app$")
	public void Home_page_is_opened_for_selendroid_test_app() {
		Logging.log.info("Selendroid test app home page is opened.");
	}
	@Then("^I want to enter text(.*)$")
	public void I_want_to_enter_text(String firstname) {
		Logging.log.info("Entering text.");
		home.enter_Text(firstname);
	}
	@Then("^click on Displayed text view button$")
	public void click_on_Displayed_text_view_button() {
		home.click_displayTextButton();
		Logging.log.info("Clicked on displayed text view button.");
	}
	
	@Then("^Validate the displayed text$")
	public void Validate_the_displayed_text() {
		Assert.assertEquals(home.validate_DisplayedText(),"Text is sometimes displayed");
		Logging.log.info("Validated displayed text.");
	}
}
