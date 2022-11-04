Feature: Type to throw unhandled exception Selendroid test app.
  Validate exception after typing text to text box.
    
	@session
  Scenario: Verify the exception message after typing text.
    Given Open Selendroid test app home page
    Then Enter any text to throw exception
    Then Validate exception