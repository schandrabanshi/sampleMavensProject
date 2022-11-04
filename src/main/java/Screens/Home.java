package Screens;


import Base.TestBase;
import Utilities.Logging;

public class Home extends TestBase{
	
	
	String enterText="io.selendroid.testapp:id/my_text_field";
	
	String displayTextButton ="io.selendroid.testapp:id/visibleButtonTest";
	
	String displayedText="io.selendroid.testapp:id/visibleTextView";
	
	/**
	 * Entering text selendroid test app's start page.
	 * @param text Your text
	 */
	public void enter_Text(String text) {
		try {
			driver.findElementById(enterText).clear();;
			driver.findElementByXPath(enterText).sendKeys(text);
		}catch(Exception ex) {
			Logging.log.error("Failed to enter text because of "+ex.getMessage());
		}
		
	}
	/**
	 * Click on display text button on Selendroid test app's start page.
	 */
	public void click_displayTextButton() {
		try {
			driver.findElementById(displayTextButton).click();
		}catch(Exception ex) {
			Logging.log.error("Failed to click on display text button because of "+ex.getMessage());
		}
		
	}
	/**
	 * Click on Dispay text button and verify the diplayed text.
	 * @return Retuning displayed text to verify verifying.
	 */
	public String validate_DisplayedText() {
		String dtxt="";
		try {
			dtxt=driver.findElementById(displayedText).getText();
		}catch(Exception ex) {
			Logging.log.error("Failed to get text value because of "+ex.getMessage());
		}
		return dtxt;
	}
}
