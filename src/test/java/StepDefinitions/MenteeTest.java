package StepDefinitions;
import Screens.Mentee;
import Utilities.Logging;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MenteeTest{
	
	public Mentee mentee=new Mentee();
	
	@Given("^User should be on home page of selendroid test app$")
	public void User_should_be_on_home_page_of_selendroid_test_app() {
		
		Logging.log.info("Opened home page to app.");
	    
	}

	@When("^Click on show progress bar button and wait$")
	public void Click_on_show_progress_bar_button_and_wait() {
		Logging.log.info("Adding Mentee details.");
		mentee.click_ProgressBarButton();;
	}

	@Then("^Enter username (.*)$")
	public void Enter_username(String username) {
		Logging.log.info("Entering username.");
		mentee.enter_Username(username);
	}
	@Then("^Enter email (.*)$")
	public void Enter_email(String email) {
		Logging.log.info("Entering email.");
		mentee.enter_Email(email);
	}
	@Then("^Enter password (.*)$")
	public void Enter_password(String password) {
		Logging.log.info("Entering password.");
		mentee.enter_Password(password);
	}
	@Then("^Enter name (.*)$")
	public void Enter_name(String name) {
		Logging.log.info("Entering name.");
		mentee.enter_Name(name);
	}

	@Then("^Select i accept adds option$")
	public void Select_i_accept_adds_option() {
		mentee.click_AcceptAdds();
		Logging.log.info("Selected option for adds.");
	}
	@Then("^Click on register user verify$")
	public void Click_on_register_user_verify() {
		mentee.click_RegisterVerify();;
		Logging.log.info("Clicked on register to verify");
	}
	@Then("^Click_on_register_user_submission$")
	public void Click_on_register_user_submission() {
		mentee.click_RegisterSubmit();
		Logging.log.info("Clicked on final register submission");
	}
	
}
